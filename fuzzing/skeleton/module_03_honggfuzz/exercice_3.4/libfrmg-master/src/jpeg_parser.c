/*
 * libfrmg - JPEG Parser
 *
 * JPEG/JFIF format parser (simplified).
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"
#include "utils.h"

/* JPEG Markers */
#define JPEG_MARKER_PREFIX 0xFF
#define JPEG_SOI  0xD8  /* Start of Image */
#define JPEG_EOI  0xD9  /* End of Image */
#define JPEG_SOF0 0xC0  /* Start of Frame (Baseline DCT) */
#define JPEG_DHT  0xC4  /* Define Huffman Table */
#define JPEG_DQT  0xDB  /* Define Quantization Table */
#define JPEG_SOS  0xDA  /* Start of Scan */
#define JPEG_APP0 0xE0  /* Application segment 0 (JFIF) */
#define JPEG_COM  0xFE  /* Comment */

#define MAX_COMPONENTS 4
#define MAX_QUANT_TABLES 4

/* JPEG Frame Header (SOF) */
typedef struct {
    uint8_t precision;
    uint16_t height;
    uint16_t width;
    uint8_t num_components;
    struct {
        uint8_t id;
        uint8_t sampling_factor;
        uint8_t quant_table_id;
    } components[MAX_COMPONENTS];
} jpeg_frame_header_t;

/* Internal parser state */
typedef struct {
    jpeg_frame_header_t frame_header;
    uint16_t quant_tables[MAX_QUANT_TABLES][64];
    int quant_table_loaded[MAX_QUANT_TABLES];
    uint8_t *scan_data;
    size_t scan_data_size;
    int frame_header_loaded;
} jpeg_parser_state_t;

/*
 * Find next marker in JPEG stream
 */
static int find_next_marker(const uint8_t *data, size_t size, size_t *offset,
                            uint8_t *marker) {
    while (*offset < size) {
        if (data[*offset] == JPEG_MARKER_PREFIX) {
            /* Found marker prefix */
            (*offset)++;

            if (*offset >= size) {
                return -1;
            }

            uint8_t m = data[*offset];
            (*offset)++;

            /* Skip padding bytes (0xFF 0xFF) */
            if (m == JPEG_MARKER_PREFIX) {
                continue;
            }

            /* Skip restart markers */
            if (m >= 0xD0 && m <= 0xD7) {
                continue;
            }

            *marker = m;
            return 0;
        }
        (*offset)++;
    }

    return -1; /* No marker found */
}

/*
 * Read marker segment length
 */
static uint16_t read_segment_length(const uint8_t *data, size_t offset,
                                    size_t size) {
    if (offset + 2 > size) {
        return 0;
    }

    return frmg_read_u16_be(data, offset, size);
}

static frmg_error_t parse_dqt(const uint8_t *data, size_t offset, size_t size,
                               jpeg_parser_state_t *state) {
    uint16_t length = read_segment_length(data, offset, size);
    if (length < 2) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    offset += 2;
    length -= 2;

    while (length > 0) {
        if (offset >= size) {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        uint8_t table_info = data[offset++];
        uint8_t precision = (table_info >> 4) & 0x0F;
        uint8_t table_id = table_info & 0x0F;

        int bytes_per_value = (precision == 0) ? 1 : 2;
        int table_size = 64 * bytes_per_value;

        if (length < table_size + 1) {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        for (int i = 0; i < 64; i++) {
            if (bytes_per_value == 1) {
                state->quant_tables[table_id][i] = data[offset++];
            } else {
                state->quant_tables[table_id][i] = frmg_read_u16_be(data, offset, size);
                offset += 2;
            }
        }

        state->quant_table_loaded[table_id] = 1;
        length -= (table_size + 1);
    }

    return FRMG_OK;
}

/*
 * Parse Start of Frame (SOF0) marker
 */
static frmg_error_t parse_sof0(const uint8_t *data, size_t offset, size_t size,
                                jpeg_parser_state_t *state) {
    uint16_t length = read_segment_length(data, offset, size);
    if (length < 8) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    offset += 2;

    state->frame_header.precision = data[offset++];
    state->frame_header.height = frmg_read_u16_be(data, offset, size);
    offset += 2;
    state->frame_header.width = frmg_read_u16_be(data, offset, size);
    offset += 2;
    state->frame_header.num_components = data[offset++];

    if (state->frame_header.num_components > MAX_COMPONENTS) {
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    for (int i = 0; i < state->frame_header.num_components; i++) {
        if (offset + 3 > size) {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        state->frame_header.components[i].id = data[offset++];
        state->frame_header.components[i].sampling_factor = data[offset++];
        state->frame_header.components[i].quant_table_id = data[offset++];
    }

    state->frame_header_loaded = 1;
    return FRMG_OK;
}

static void cleanup_parser_state(jpeg_parser_state_t *state) {
    if (state->scan_data) {
        free(state->scan_data);
    }
}

/*
 * Simplified JPEG decompression (just extracts basic info)
 */
static frmg_error_t decode_jpeg_image(jpeg_parser_state_t *state,
                                      frmg_image_t *image) {
    if (!state->frame_header_loaded) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    jpeg_frame_header_t *header = &state->frame_header;

    /* Determine number of channels from components */
    uint8_t channels = header->num_components;
    if (channels != 1 && channels != 3) {
        /* Only support grayscale and RGB */
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    uint32_t width = header->width;
    uint32_t height = header->height;

    image->data = (uint8_t*)frmg_alloc_image_data(width, height, channels);
    if (!image->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    image->width = width;
    image->height = height;
    image->channels = channels;
    image->bit_depth = 8;
    image->format = FRMG_FORMAT_JPEG;
    image->data_size = width * height * channels;

    /* For this training library, we'll just fill with dummy data */
    /* A real JPEG decoder would decompress the scan data here */
    /* This is complex and beyond the scope of vulnerability training */

    /* Fill with gradient pattern for demonstration */
    for (uint32_t y = 0; y < height; y++) {
        for (uint32_t x = 0; x < width; x++) {
            size_t offset = (y * width + x) * channels;

            for (uint8_t c = 0; c < channels; c++) {
                image->data[offset + c] = (x + y + c * 85) & 0xFF;
            }
        }
    }

    return FRMG_OK;
}

/*
 * Main JPEG parsing function
 */
frmg_error_t frmg_parse_jpeg(const uint8_t *data, size_t size, frmg_image_t *image) {
    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size < 4) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Check JPEG SOI marker */
    if (data[0] != 0xFF || data[1] != JPEG_SOI) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Initialize parser state */
    jpeg_parser_state_t state;
    memset(&state, 0, sizeof(state));

    size_t offset = 2;
    frmg_error_t error = FRMG_OK;

    /* Parse markers */
    while (offset < size) {
        uint8_t marker;

        if (find_next_marker(data, size, &offset, &marker) < 0) {
            break;
        }

        switch (marker) {
            case JPEG_SOF0:
                error = parse_sof0(data, offset, size, &state);
                if (error != FRMG_OK) goto cleanup;
                /* Skip segment */
                offset += read_segment_length(data, offset, size);
                break;

            case JPEG_DQT:
                error = parse_dqt(data, offset, size, &state);
                if (error != FRMG_OK) goto cleanup;
                /* Skip segment */
                offset += read_segment_length(data, offset, size);
                break;

            case JPEG_SOS:
                /* Start of scan - remaining data is compressed image */
                /* For simplicity, we'll skip actual decompression */
                goto decode;

            case JPEG_EOI:
                /* End of image */
                goto decode;

            case JPEG_APP0:
            case JPEG_COM:
            case JPEG_DHT:
            default:
                /* Skip unknown/unsupported segments */
                {
                    uint16_t seg_len = read_segment_length(data, offset, size);
                    offset += seg_len;
                }
                break;
        }
    }

decode:
    error = decode_jpeg_image(&state, image);

cleanup:
    cleanup_parser_state(&state);

    return error;
}
