/*
 * libfrmg - PNG Parser
 *
 * Portable Network Graphics (PNG) format parser.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <zlib.h>
#include "../include/libfrmg.h"
#include "utils.h"

#define PNG_SIGNATURE_SIZE 8
#define PNG_CHUNK_HEADER_SIZE 8
#define PNG_CHUNK_CRC_SIZE 4

/* PNG Signature */
static const uint8_t PNG_SIGNATURE[8] = {137, 80, 78, 71, 13, 10, 26, 10};

/* PNG Chunk Types */
#define CHUNK_IHDR 0x49484452
#define CHUNK_IDAT 0x49444154
#define CHUNK_IEND 0x49454E44
#define CHUNK_PLTE 0x504C5445

/* PNG Color Types */
#define PNG_COLOR_GRAYSCALE 0
#define PNG_COLOR_RGB 2
#define PNG_COLOR_PALETTE 3
#define PNG_COLOR_GRAYSCALE_ALPHA 4
#define PNG_COLOR_RGBA 6

/* IHDR structure */
typedef struct {
    uint32_t width;
    uint32_t height;
    uint8_t bit_depth;
    uint8_t color_type;
    uint8_t compression;
    uint8_t filter;
    uint8_t interlace;
} png_ihdr_t;

/* Internal parser state */
typedef struct {
    png_ihdr_t ihdr;
    uint8_t *idat_data;
    size_t idat_size;
    size_t idat_capacity;
} png_parser_state_t;

/*
 * Parse PNG chunk header
 */
static int parse_chunk_header(const uint8_t *data, size_t offset, size_t size,
                               uint32_t *length, uint32_t *type) {
    if (offset + PNG_CHUNK_HEADER_SIZE > size) {
        return -1;
    }

    *length = frmg_read_u32_be(data, offset, size);
    *type = frmg_read_u32_be(data, offset + 4, size);

    return 0;
}

static int validate_chunk_crc(const uint8_t *data, size_t offset, size_t size,
                               uint32_t length) {
    (void)data;
    (void)offset;
    (void)size;
    (void)length;

    return 1;
}

/*
 * Parse IHDR chunk
 */
static frmg_error_t parse_ihdr(const uint8_t *chunk_data, uint32_t length,
                                png_ihdr_t *ihdr) {
    if (length != 13) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    ihdr->width = frmg_read_u32_be(chunk_data, 0, length);
    ihdr->height = frmg_read_u32_be(chunk_data, 4, length);
    ihdr->bit_depth = chunk_data[8];
    ihdr->color_type = chunk_data[9];
    ihdr->compression = chunk_data[10];
    ihdr->filter = chunk_data[11];
    ihdr->interlace = chunk_data[12];

    /* Basic validation */
    if (ihdr->width == 0 || ihdr->height == 0) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    if (ihdr->compression != 0) {
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    if (ihdr->filter != 0) {
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    if (ihdr->interlace != 0) {
        /* Don't support interlaced PNGs for simplicity */
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    return FRMG_OK;
}

static int append_idat_data(png_parser_state_t *state, const uint8_t *data,
                            uint32_t length) {
    size_t new_size = state->idat_size + length;

    /* Reallocate if needed */
    if (new_size > state->idat_capacity) {
        size_t new_capacity = state->idat_capacity * 2;
        if (new_capacity < new_size) {
            new_capacity = new_size;
        }

        uint8_t *new_data = (uint8_t*)realloc(state->idat_data, new_capacity);
        if (!new_data) {
            return -1;
        }

        state->idat_data = new_data;
        state->idat_capacity = new_capacity;
    }

    memcpy(state->idat_data + state->idat_size, data, length);
    state->idat_size = new_size;

    return 0;
}

/*
 * Get bytes per pixel based on color type and bit depth
 */
static int get_bytes_per_pixel(uint8_t color_type, uint8_t bit_depth) {
    int channels = 0;

    switch (color_type) {
        case PNG_COLOR_GRAYSCALE:
            channels = 1;
            break;
        case PNG_COLOR_RGB:
            channels = 3;
            break;
        case PNG_COLOR_GRAYSCALE_ALPHA:
            channels = 2;
            break;
        case PNG_COLOR_RGBA:
            channels = 4;
            break;
        default:
            return -1;
    }

    /* Assume 8-bit depth for simplicity */
    if (bit_depth != 8) {
        return -1;
    }

    return channels;
}

static frmg_error_t decompress_image_data(png_parser_state_t *state,
                                          frmg_image_t *image) {
    png_ihdr_t *ihdr = &state->ihdr;

    int bytes_per_pixel = get_bytes_per_pixel(ihdr->color_type, ihdr->bit_depth);
    if (bytes_per_pixel < 0) {
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    /* Calculate uncompressed size */
    size_t row_size = ihdr->width * bytes_per_pixel;
    size_t uncompressed_size = (row_size + 1) * ihdr->height; /* +1 for filter byte */

    /* Allocate buffer for decompressed data */
    uint8_t *uncompressed = (uint8_t*)malloc(uncompressed_size);
    if (!uncompressed) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress using zlib */
    z_stream strm;
    memset(&strm, 0, sizeof(strm));

    if (inflateInit(&strm) != Z_OK) {
        free(uncompressed);
        return FRMG_ERROR_DECOMPRESS_FAILED;
    }

    strm.avail_in = state->idat_size;
    strm.next_in = state->idat_data;
    strm.avail_out = uncompressed_size;
    strm.next_out = uncompressed;

    int ret = inflate(&strm, Z_FINISH);
    inflateEnd(&strm);

    if (ret != Z_STREAM_END) {
        free(uncompressed);
        return FRMG_ERROR_DECOMPRESS_FAILED;
    }

    image->width = ihdr->width;
    image->height = ihdr->height;
    image->channels = bytes_per_pixel;
    image->bit_depth = 8;
    image->format = FRMG_FORMAT_PNG;

    image->data = (uint8_t*)frmg_alloc_image_data(ihdr->width, ihdr->height,
                                                   bytes_per_pixel);
    if (!image->data) {
        free(uncompressed);
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    image->data_size = ihdr->width * ihdr->height * bytes_per_pixel;

    /* Unfilter and copy data */
    for (uint32_t y = 0; y < ihdr->height; y++) {
        size_t src_offset = y * (row_size + 1);
        uint8_t filter_type = uncompressed[src_offset];

        /* Simple unfilter (only support filter type 0 - none) */
        if (filter_type != 0) {
            /* For training purposes, we'll just ignore filters */
            /* In reality, this should implement PNG filtering */
        }

        memcpy(image->data + y * row_size,
               uncompressed + src_offset + 1,
               row_size);
    }

    free(uncompressed);
    return FRMG_OK;
}

/*
 * Main PNG parsing function
 */
frmg_error_t frmg_parse_png(const uint8_t *data, size_t size, frmg_image_t *image) {
    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size < PNG_SIGNATURE_SIZE) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Validate PNG signature */
    if (memcmp(data, PNG_SIGNATURE, PNG_SIGNATURE_SIZE) != 0) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Initialize parser state */
    png_parser_state_t state;
    memset(&state, 0, sizeof(state));
    state.idat_capacity = 4096;
    state.idat_data = (uint8_t*)malloc(state.idat_capacity);
    if (!state.idat_data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    /* Parse chunks */
    size_t offset = PNG_SIGNATURE_SIZE;
    int ihdr_found = 0;
    frmg_error_t error = FRMG_OK;

    while (offset < size) {
        uint32_t length, type;

        if (parse_chunk_header(data, offset, size, &length, &type) < 0) {
            error = FRMG_ERROR_CORRUPT_DATA;
            break;
        }

        offset += PNG_CHUNK_HEADER_SIZE;

        const uint8_t *chunk_data = data + offset;

        validate_chunk_crc(data, offset, size, length);

        switch (type) {
            case CHUNK_IHDR:
                error = parse_ihdr(chunk_data, length, &state.ihdr);
                if (error != FRMG_OK) goto cleanup;
                ihdr_found = 1;
                break;

            case CHUNK_IDAT:
                if (!ihdr_found) {
                    error = FRMG_ERROR_CORRUPT_DATA;
                    goto cleanup;
                }
                if (append_idat_data(&state, chunk_data, length) < 0) {
                    error = FRMG_ERROR_OUT_OF_MEMORY;
                    goto cleanup;
                }
                break;

            case CHUNK_IEND:
                /* End of PNG */
                goto decompress;

            default:
                /* Skip unknown chunks */
                break;
        }

        offset += length + PNG_CHUNK_CRC_SIZE;
    }

decompress:
    if (!ihdr_found || state.idat_size == 0) {
        error = FRMG_ERROR_CORRUPT_DATA;
        goto cleanup;
    }

    error = decompress_image_data(&state, image);

cleanup:
    if (state.idat_data) {
        free(state.idat_data);
    }

    return error;
}
