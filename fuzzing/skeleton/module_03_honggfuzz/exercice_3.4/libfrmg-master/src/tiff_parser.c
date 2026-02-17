/*
 * libfrmg - TIFF Parser
 *
 * Tagged Image File Format (TIFF) parser with IFD support.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <zlib.h>
#include "../include/libfrmg.h"
#include "utils.h"

/* TIFF Byte Orders */
#define TIFF_LITTLE_ENDIAN 0x4949  /* "II" */
#define TIFF_BIG_ENDIAN    0x4D4D  /* "MM" */
#define TIFF_MAGIC         42

/* TIFF Data Types */
#define TIFF_BYTE      1   /* 8-bit unsigned */
#define TIFF_ASCII     2   /* 8-bit byte with null terminator */
#define TIFF_SHORT     3   /* 16-bit unsigned */
#define TIFF_LONG      4   /* 32-bit unsigned */
#define TIFF_RATIONAL  5   /* Two LONGs (numerator, denominator) */
#define TIFF_SBYTE     6   /* 8-bit signed */
#define TIFF_UNDEFINED 7   /* 8-bit byte */
#define TIFF_SSHORT    8   /* 16-bit signed */
#define TIFF_SLONG     9   /* 32-bit signed */
#define TIFF_SRATIONAL 10  /* Two SLONGs */
#define TIFF_FLOAT     11  /* 32-bit float */
#define TIFF_DOUBLE    12  /* 64-bit double */

/* TIFF Tags */
#define TAG_IMAGE_WIDTH              256
#define TAG_IMAGE_HEIGHT             257
#define TAG_BITS_PER_SAMPLE          258
#define TAG_COMPRESSION              259
#define TAG_PHOTOMETRIC_INTERP       262
#define TAG_STRIP_OFFSETS            273
#define TAG_SAMPLES_PER_PIXEL        277
#define TAG_ROWS_PER_STRIP           278
#define TAG_STRIP_BYTE_COUNTS        279
#define TAG_X_RESOLUTION             282
#define TAG_Y_RESOLUTION             283
#define TAG_PLANAR_CONFIGURATION     284
#define TAG_RESOLUTION_UNIT          296
#define TAG_SOFTWARE                 305
#define TAG_COLOR_MAP                320
#define TAG_TILE_WIDTH               322
#define TAG_TILE_HEIGHT              323
#define TAG_TILE_OFFSETS             324
#define TAG_TILE_BYTE_COUNTS         325
#define TAG_SAMPLE_FORMAT            339

/* Compression Types */
#define COMPRESSION_NONE             1
#define COMPRESSION_CCITT_RLE        2
#define COMPRESSION_PACKBITS         32773
#define COMPRESSION_DEFLATE          8
#define COMPRESSION_DEFLATE_OLD      32946

/* Photometric Interpretations */
#define PHOTOMETRIC_MINISWHITE       0
#define PHOTOMETRIC_MINISBLACK       1
#define PHOTOMETRIC_RGB              2
#define PHOTOMETRIC_PALETTE          3
#define PHOTOMETRIC_MASK             4

/* IFD Entry */
typedef struct {
    uint16_t tag;
    uint16_t type;
    uint32_t count;
    uint32_t value_offset;
} tiff_ifd_entry_t;

/* TIFF Parser State */
typedef struct {
    int byte_order;  /* 0 = little endian, 1 = big endian */
    uint32_t ifd_offset;

    /* Image properties */
    uint32_t width;
    uint32_t height;
    uint16_t bits_per_sample;
    uint16_t samples_per_pixel;
    uint16_t compression;
    uint16_t photometric;
    uint32_t rows_per_strip;
    uint16_t planar_config;

    /* Strip/Tile data */
    uint32_t *strip_offsets;
    uint32_t *strip_byte_counts;
    uint32_t num_strips;

    /* Color map for palette images */
    uint16_t *colormap;
    int has_colormap;
} tiff_state_t;

/*
 * Read functions with byte order handling
 */
static uint16_t read_u16(const uint8_t *data, size_t offset, size_t size, int big_endian) {
    if (offset + 2 > size) {
        return 0;
    }

    if (big_endian) {
        return frmg_read_u16_be(data, offset, size);
    } else {
        return frmg_read_u16_le(data, offset, size);
    }
}

static uint32_t read_u32(const uint8_t *data, size_t offset, size_t size, int big_endian) {
    if (offset + 4 > size) {
        return 0;
    }

    if (big_endian) {
        return frmg_read_u32_be(data, offset, size);
    } else {
        return frmg_read_u32_le(data, offset, size);
    }
}

/*
 * Get size of TIFF data type
 */
static int get_type_size(uint16_t type) {
    switch (type) {
        case TIFF_BYTE:
        case TIFF_ASCII:
        case TIFF_SBYTE:
        case TIFF_UNDEFINED:
            return 1;
        case TIFF_SHORT:
        case TIFF_SSHORT:
            return 2;
        case TIFF_LONG:
        case TIFF_SLONG:
        case TIFF_FLOAT:
            return 4;
        case TIFF_RATIONAL:
        case TIFF_SRATIONAL:
        case TIFF_DOUBLE:
            return 8;
        default:
            return 0;
    }
}

/*
 * Read IFD entry value (handles both inline and offset values)
 */
static uint32_t read_ifd_value(const uint8_t *data, size_t size,
                                tiff_ifd_entry_t *entry, int big_endian,
                                int index) {
    int type_size = get_type_size(entry->type);
    uint32_t total_size = type_size * entry->count;

    uint32_t offset;

    if (total_size <= 4) {
        /* Value is stored inline in value_offset field */
        offset = 0; /* Will read from value_offset directly */

        /* For inline values, we need to handle them differently */
        if (entry->type == TIFF_SHORT) {
            if (index == 0) {
                return big_endian ? (entry->value_offset >> 16) : (entry->value_offset & 0xFFFF);
            } else {
                return big_endian ? (entry->value_offset & 0xFFFF) : (entry->value_offset >> 16);
            }
        } else if (entry->type == TIFF_BYTE) {
            int shift = big_endian ? (24 - index * 8) : (index * 8);
            return (entry->value_offset >> shift) & 0xFF;
        } else {
            return entry->value_offset;
        }
    } else {
        /* Value is stored at offset */
        offset = entry->value_offset + (index * type_size);

        if (offset + type_size > size) {
            return 0;
        }

        if (entry->type == TIFF_SHORT) {
            return read_u16(data, offset, size, big_endian);
        } else if (entry->type == TIFF_LONG) {
            return read_u32(data, offset, size, big_endian);
        } else if (entry->type == TIFF_BYTE) {
            return data[offset];
        }
    }

    return 0;
}

/*
 * Read array of values from IFD entry
 */
static int read_ifd_array(const uint8_t *data, size_t size,
                          tiff_ifd_entry_t *entry, int big_endian,
                          uint32_t *output, uint32_t max_count) {
    int type_size = get_type_size(entry->type);
    uint32_t total_size = type_size * entry->count;

    uint32_t count = entry->count;
    if (count > max_count) {
        count = max_count;  /* Truncate, but still vulnerable */
    }

    for (uint32_t i = 0; i < count; i++) {
        output[i] = read_ifd_value(data, size, entry, big_endian, i);
    }

    return count;
}

/*
 * Parse TIFF IFD entry
 */
static void parse_ifd_entry(const uint8_t *data, size_t size,
                            tiff_ifd_entry_t *entry, int big_endian,
                            tiff_state_t *state) {
    switch (entry->tag) {
        case TAG_IMAGE_WIDTH:
            state->width = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_IMAGE_HEIGHT:
            state->height = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_BITS_PER_SAMPLE:
            state->bits_per_sample = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_COMPRESSION:
            state->compression = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_PHOTOMETRIC_INTERP:
            state->photometric = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_SAMPLES_PER_PIXEL:
            state->samples_per_pixel = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_ROWS_PER_STRIP:
            state->rows_per_strip = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_STRIP_OFFSETS:
            state->num_strips = entry->count;
            state->strip_offsets = (uint32_t*)malloc(entry->count * sizeof(uint32_t));
            if (state->strip_offsets) {
                read_ifd_array(data, size, entry, big_endian,
                             state->strip_offsets, entry->count);
            }
            break;

        case TAG_STRIP_BYTE_COUNTS:
            state->strip_byte_counts = (uint32_t*)malloc(entry->count * sizeof(uint32_t));
            if (state->strip_byte_counts) {
                read_ifd_array(data, size, entry, big_endian,
                             state->strip_byte_counts, entry->count);
            }
            break;

        case TAG_PLANAR_CONFIGURATION:
            state->planar_config = read_ifd_value(data, size, entry, big_endian, 0);
            break;

        case TAG_COLOR_MAP:
            /* Colormap: 3 * (2^BitsPerSample) values */
            if (entry->count > 0) {
                state->colormap = (uint16_t*)malloc(entry->count * sizeof(uint16_t));
                if (state->colormap) {
                    state->has_colormap = 1;
                    /* Read colormap values */
                    uint32_t offset = entry->value_offset;
                    for (uint32_t i = 0; i < entry->count && offset + 2 <= size; i++) {
                        state->colormap[i] = read_u16(data, offset, size, big_endian);
                        offset += 2;
                    }
                }
            }
            break;

        default:
            /* Ignore unknown tags */
            break;
    }
}

/*
 * Parse TIFF IFD (Image File Directory)
 */
static frmg_error_t parse_ifd(const uint8_t *data, size_t size, tiff_state_t *state) {
    uint32_t offset = state->ifd_offset;
    int big_endian = state->byte_order;

    if (offset + 2 > size) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    /* Read number of directory entries */
    uint16_t num_entries = read_u16(data, offset, size, big_endian);
    offset += 2;

    /* Parse each IFD entry */
    for (uint16_t i = 0; i < num_entries; i++) {
        if (offset + 12 > size) {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        tiff_ifd_entry_t entry;
        entry.tag = read_u16(data, offset, size, big_endian);
        entry.type = read_u16(data, offset + 2, size, big_endian);
        entry.count = read_u32(data, offset + 4, size, big_endian);
        entry.value_offset = read_u32(data, offset + 8, size, big_endian);

        parse_ifd_entry(data, size, &entry, big_endian, state);

        offset += 12;
    }

    return FRMG_OK;
}

/*
 * Decompress PackBits compressed data
 */
static int decompress_packbits(const uint8_t *input, size_t input_size,
                                uint8_t *output, size_t output_size) {
    size_t in_pos = 0;
    size_t out_pos = 0;

    while (in_pos < input_size && out_pos < output_size) {
        int8_t n = (int8_t)input[in_pos++];

        if (n >= 0) {
            /* Copy next n+1 bytes literally */
            int count = n + 1;
            if (in_pos + count > input_size || out_pos + count > output_size) {
                return -1;
            }
            memcpy(output + out_pos, input + in_pos, count);
            in_pos += count;
            out_pos += count;
        } else if (n != -128) {
            /* Repeat next byte -n+1 times */
            int count = -n + 1;
            if (in_pos >= input_size || out_pos + count > output_size) {
                return -1;
            }
            uint8_t byte = input[in_pos++];
            memset(output + out_pos, byte, count);
            out_pos += count;
        }
        /* n == -128 is a no-op */
    }

    return out_pos;
}

/*
 * Decompress strip data
 */
static frmg_error_t decompress_strip(const uint8_t *input, size_t input_size,
                                      uint8_t *output, size_t output_size,
                                      uint16_t compression) {
    switch (compression) {
        case COMPRESSION_NONE:
            /* No compression */
            if (input_size > output_size) {
                return FRMG_ERROR_DECOMPRESS_FAILED;
            }
            memcpy(output, input, input_size);
            return FRMG_OK;

        case COMPRESSION_PACKBITS:
            /* PackBits RLE compression */
            if (decompress_packbits(input, input_size, output, output_size) < 0) {
                return FRMG_ERROR_DECOMPRESS_FAILED;
            }
            return FRMG_OK;

        case COMPRESSION_DEFLATE:
        case COMPRESSION_DEFLATE_OLD:
            /* Deflate/zlib compression */
            {
                z_stream strm;
                memset(&strm, 0, sizeof(strm));

                if (inflateInit(&strm) != Z_OK) {
                    return FRMG_ERROR_DECOMPRESS_FAILED;
                }

                strm.avail_in = input_size;
                strm.next_in = (uint8_t*)input;
                strm.avail_out = output_size;
                strm.next_out = output;

                int ret = inflate(&strm, Z_FINISH);
                inflateEnd(&strm);

                if (ret != Z_STREAM_END) {
                    return FRMG_ERROR_DECOMPRESS_FAILED;
                }
            }
            return FRMG_OK;

        default:
            return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }
}

/*
 * Assemble image from strips
 */
static frmg_error_t assemble_image(const uint8_t *data, size_t size,
                                   tiff_state_t *state, frmg_image_t *image) {
    /* Validate image parameters */
    if (state->width == 0 || state->height == 0) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    if (state->samples_per_pixel == 0) {
        state->samples_per_pixel = 1;
    }

    uint32_t channels = state->samples_per_pixel;

    if (!frmg_validate_dimensions(state->width, state->height, channels)) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    /* Allocate image data */
    image->data = (uint8_t*)frmg_alloc_image_data(state->width, state->height, channels);
    if (!image->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    image->width = state->width;
    image->height = state->height;
    image->channels = channels;
    image->bit_depth = state->bits_per_sample;
    image->format = FRMG_FORMAT_TIFF;
    image->data_size = state->width * state->height * channels;

    /* Calculate bytes per row */
    size_t bytes_per_row = state->width * channels * (state->bits_per_sample / 8);
    if (state->bits_per_sample < 8) {
        bytes_per_row = (state->width * channels * state->bits_per_sample + 7) / 8;
    }

    /* Process strips */
    uint32_t current_row = 0;

    for (uint32_t i = 0; i < state->num_strips; i++) {
        uint32_t strip_offset = state->strip_offsets[i];
        uint32_t strip_size = state->strip_byte_counts[i];

        if (strip_offset + strip_size > size) {
            free(image->data);
            image->data = NULL;
            return FRMG_ERROR_CORRUPT_DATA;
        }

        /* Calculate rows in this strip */
        uint32_t rows_in_strip = state->rows_per_strip;
        if (current_row + rows_in_strip > state->height) {
            rows_in_strip = state->height - current_row;
        }

        size_t strip_decompressed_size = bytes_per_row * rows_in_strip;
        uint8_t *strip_data = (uint8_t*)malloc(strip_decompressed_size);
        if (!strip_data) {
            free(image->data);
            image->data = NULL;
            return FRMG_ERROR_OUT_OF_MEMORY;
        }

        /* Decompress strip */
        frmg_error_t error = decompress_strip(data + strip_offset, strip_size,
                                              strip_data, strip_decompressed_size,
                                              state->compression);
        if (error != FRMG_OK) {
            free(strip_data);
            free(image->data);
            image->data = NULL;
            return error;
        }

        /* Copy strip to image */
        size_t dest_offset = current_row * bytes_per_row;
        memcpy(image->data + dest_offset, strip_data, strip_decompressed_size);

        free(strip_data);
        current_row += rows_in_strip;
    }

    return FRMG_OK;
}

/*
 * Free TIFF parser state
 */
static void cleanup_tiff_state(tiff_state_t *state) {
    if (state->strip_offsets) {
        free(state->strip_offsets);
    }
    if (state->strip_byte_counts) {
        free(state->strip_byte_counts);
    }
    if (state->colormap) {
        free(state->colormap);
    }
}

/*
 * Main TIFF parsing function
 */
frmg_error_t frmg_parse_tiff(const uint8_t *data, size_t size, frmg_image_t *image) {
    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size < 8) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Initialize state */
    tiff_state_t state;
    memset(&state, 0, sizeof(state));

    /* Set default values */
    state.bits_per_sample = 8;
    state.samples_per_pixel = 1;
    state.compression = COMPRESSION_NONE;
    state.rows_per_strip = 0xFFFFFFFF;
    state.planar_config = 1;

    /* Check byte order */
    uint16_t byte_order = frmg_read_u16_le(data, 0, size);

    if (byte_order == TIFF_LITTLE_ENDIAN) {
        state.byte_order = 0;
    } else if (byte_order == TIFF_BIG_ENDIAN) {
        state.byte_order = 1;
    } else {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Check magic number */
    uint16_t magic = read_u16(data, 2, size, state.byte_order);
    if (magic != TIFF_MAGIC) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Read IFD offset */
    state.ifd_offset = read_u32(data, 4, size, state.byte_order);

    /* Parse IFD */
    frmg_error_t error = parse_ifd(data, size, &state);
    if (error != FRMG_OK) {
        cleanup_tiff_state(&state);
        return error;
    }

    /* Validate required fields */
    if (!state.strip_offsets || !state.strip_byte_counts) {
        cleanup_tiff_state(&state);
        return FRMG_ERROR_CORRUPT_DATA;
    }

    /* Assemble image from strips */
    error = assemble_image(data, size, &state, image);

    cleanup_tiff_state(&state);
    return error;
}
