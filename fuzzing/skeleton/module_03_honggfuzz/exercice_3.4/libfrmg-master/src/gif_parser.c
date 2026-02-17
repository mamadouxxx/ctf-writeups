/*
 * libfrmg - GIF Parser
 *
 * Graphics Interchange Format (GIF) parser with LZW decompression.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"
#include "utils.h"

/* GIF Signatures */
#define GIF_SIGNATURE_SIZE 6
static const uint8_t GIF87a_SIGNATURE[6] = {'G', 'I', 'F', '8', '7', 'a'};
static const uint8_t GIF89a_SIGNATURE[6] = {'G', 'I', 'F', '8', '9', 'a'};

/* GIF Block Types */
#define GIF_BLOCK_IMAGE 0x2C
#define GIF_BLOCK_EXTENSION 0x21
#define GIF_BLOCK_TERMINATOR 0x3B

/* GIF Extension Types */
#define GIF_EXT_GRAPHIC_CONTROL 0xF9
#define GIF_EXT_COMMENT 0xFE
#define GIF_EXT_PLAIN_TEXT 0x01
#define GIF_EXT_APPLICATION 0xFF

/* LZW Constants */
#define MAX_LZW_CODE 4096
#define CLEAR_CODE 256
#define END_CODE 257

/* GIF Logical Screen Descriptor */
typedef struct {
    uint16_t width;
    uint16_t height;
    uint8_t packed;
    uint8_t bg_color_index;
    uint8_t aspect_ratio;
} gif_screen_descriptor_t;

/* GIF Image Descriptor */
typedef struct {
    uint16_t left;
    uint16_t top;
    uint16_t width;
    uint16_t height;
    uint8_t packed;
} gif_image_descriptor_t;

/* Color table entry */
typedef struct {
    uint8_t r, g, b;
} gif_color_t;

/* LZW Decoder State */
typedef struct {
    uint8_t *output;
    size_t output_size;
    size_t output_pos;

    uint16_t table_size;
    uint16_t code_size;
    uint16_t clear_code;
    uint16_t end_code;

    /* LZW dictionary */
    uint8_t *prefix_table[MAX_LZW_CODE];
    uint16_t prefix_code[MAX_LZW_CODE];
    uint8_t append_char[MAX_LZW_CODE];
    uint16_t prefix_len[MAX_LZW_CODE];
} lzw_decoder_t;

/*
 * Parse GIF Logical Screen Descriptor
 */
static int parse_screen_descriptor(const uint8_t *data, size_t offset, size_t size,
                                    gif_screen_descriptor_t *desc) {
    if (offset + 7 > size) {
        return -1;
    }

    desc->width = frmg_read_u16_le(data, offset, size);
    desc->height = frmg_read_u16_le(data, offset + 2, size);
    desc->packed = data[offset + 4];
    desc->bg_color_index = data[offset + 5];
    desc->aspect_ratio = data[offset + 6];

    return 0;
}

/*
 * Parse GIF color table
 */
static int parse_color_table(const uint8_t *data, size_t offset, size_t size,
                              gif_color_t *colors, int num_colors) {
    size_t table_size = num_colors * 3;

    if (offset + table_size > size) {
        return -1;
    }

    for (int i = 0; i < num_colors; i++) {
        colors[i].r = data[offset + i * 3];
        colors[i].g = data[offset + i * 3 + 1];
        colors[i].b = data[offset + i * 3 + 2];
    }

    return 0;
}

/*
 * Initialize LZW decoder
 */
static void init_lzw_decoder(lzw_decoder_t *decoder, uint8_t min_code_size,
                              uint8_t *output, size_t output_size) {
    memset(decoder, 0, sizeof(lzw_decoder_t));

    decoder->output = output;
    decoder->output_size = output_size;
    decoder->output_pos = 0;

    decoder->code_size = min_code_size + 1;
    decoder->clear_code = 1 << min_code_size;
    decoder->end_code = decoder->clear_code + 1;
    decoder->table_size = decoder->end_code + 1;

    /* Initialize dictionary with single-byte entries */
    for (int i = 0; i < decoder->clear_code; i++) {
        decoder->prefix_code[i] = 0xFFFF; /* No prefix */
        decoder->append_char[i] = (uint8_t)i;
        decoder->prefix_len[i] = 1;
    }
}

/*
 * Output a string from LZW dictionary
 */
static int output_string(lzw_decoder_t *decoder, uint16_t code) {
    uint8_t stack[MAX_LZW_CODE];
    int stack_pos = 0;

    /* Build string in reverse order */
    uint16_t current = code;
    while (current < MAX_LZW_CODE) {
        stack[stack_pos++] = decoder->append_char[current];

        if (decoder->prefix_code[current] == 0xFFFF) {
            break;
        }
        current = decoder->prefix_code[current];
    }

    /* Output string */
    for (int i = stack_pos - 1; i >= 0; i--) {
        if (decoder->output_pos < decoder->output_size) {
            decoder->output[decoder->output_pos++] = stack[i];
        }
    }

    return stack_pos;
}

/*
 * Add new code to LZW dictionary
 */
static void add_lzw_code(lzw_decoder_t *decoder, uint16_t prefix, uint8_t chr) {
    if (decoder->table_size >= MAX_LZW_CODE) {
        return;
    }

    decoder->prefix_code[decoder->table_size] = prefix;
    decoder->append_char[decoder->table_size] = chr;

    /* Calculate string length */
    uint16_t prefix_len = decoder->prefix_len[prefix];
    decoder->prefix_len[decoder->table_size] = prefix_len + 1;

    decoder->table_size++;

    /* Increase code size when needed */
    if (decoder->table_size >= (1u << decoder->code_size) && decoder->code_size < 12) {
        decoder->code_size++;
    }
}

/*
 * Decompress GIF data using LZW algorithm
 */
static frmg_error_t decompress_lzw(const uint8_t *compressed, size_t compressed_size,
                                    uint8_t *output, size_t output_size,
                                    uint8_t min_code_size) {
    lzw_decoder_t decoder;
    init_lzw_decoder(&decoder, min_code_size, output, output_size);

    uint32_t bit_buffer = 0;
    int bits_available = 0;
    size_t input_pos = 0;
    uint16_t prev_code = 0xFFFF;

    while (input_pos < compressed_size) {
        /* Fill bit buffer */
        while (bits_available < decoder.code_size && input_pos < compressed_size) {
            bit_buffer |= ((uint32_t)compressed[input_pos++] << bits_available);
            bits_available += 8;
        }

        if (bits_available < decoder.code_size) {
            break;
        }

        /* Extract next code */
        uint16_t code = bit_buffer & ((1 << decoder.code_size) - 1);
        bit_buffer >>= decoder.code_size;
        bits_available -= decoder.code_size;

        /* Handle special codes */
        if (code == decoder.clear_code) {
            init_lzw_decoder(&decoder, min_code_size, output + decoder.output_pos,
                           output_size - decoder.output_pos);
            decoder.output_pos = 0;
            prev_code = 0xFFFF;
            continue;
        }

        if (code == decoder.end_code) {
            break;
        }

        /* Process code */
        if (code < decoder.table_size) {
            /* Code is in table */
            output_string(&decoder, code);

            if (prev_code != 0xFFFF) {
                /* Get first character of current code's string */
                uint16_t k_code = code;
                while (decoder.prefix_code[k_code] != 0xFFFF) {
                    k_code = decoder.prefix_code[k_code];
                }
                uint8_t k = decoder.append_char[k_code];

                add_lzw_code(&decoder, prev_code, k);
            }
        } else if (code == decoder.table_size && prev_code != 0xFFFF) {
            /* Special case: code not yet in table */
            uint16_t k_code = prev_code;
            while (decoder.prefix_code[k_code] != 0xFFFF) {
                k_code = decoder.prefix_code[k_code];
            }
            uint8_t k = decoder.append_char[k_code];

            output_string(&decoder, prev_code);
            if (decoder.output_pos < decoder.output_size) {
                decoder.output[decoder.output_pos++] = k;
            }

            add_lzw_code(&decoder, prev_code, k);
        } else {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        prev_code = code;
    }

    return FRMG_OK;
}

/*
 * Read GIF data sub-blocks
 */
static size_t read_data_subblocks(const uint8_t *data, size_t offset, size_t size,
                                   uint8_t **output) {
    size_t total_size = 0;
    size_t current_offset = offset;

    /* First pass: calculate total size */
    while (current_offset < size) {
        uint8_t block_size = data[current_offset++];
        if (block_size == 0) {
            break;
        }

        total_size += block_size;
        current_offset += block_size;

        if (current_offset > size) {
            return 0;
        }
    }

    /* Allocate buffer */
    *output = (uint8_t*)malloc(total_size);
    if (!*output) {
        return 0;
    }

    /* Second pass: copy data */
    size_t output_pos = 0;
    current_offset = offset;

    while (current_offset < size) {
        uint8_t block_size = data[current_offset++];
        if (block_size == 0) {
            break;
        }

        memcpy(*output + output_pos, data + current_offset, block_size);
        output_pos += block_size;
        current_offset += block_size;
    }

    return total_size;
}

/*
 * Parse GIF image descriptor and decompress image data
 */
static frmg_error_t parse_image_data(const uint8_t *data, size_t *offset, size_t size,
                                      gif_color_t *global_colors, int global_color_count,
                                      frmg_image_t *image) {
    gif_image_descriptor_t desc;

    if (*offset + 9 > size) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    desc.left = frmg_read_u16_le(data, *offset, size);
    desc.top = frmg_read_u16_le(data, *offset + 2, size);
    desc.width = frmg_read_u16_le(data, *offset + 4, size);
    desc.height = frmg_read_u16_le(data, *offset + 6, size);
    desc.packed = data[*offset + 8];
    *offset += 9;

    /* Check for local color table */
    gif_color_t *color_table = global_colors;
    int color_count = global_color_count;
    gif_color_t local_colors[256];

    if (desc.packed & 0x80) {
        /* Local color table present */
        color_count = 1 << ((desc.packed & 0x07) + 1);
        if (parse_color_table(data, *offset, size, local_colors, color_count) < 0) {
            return FRMG_ERROR_CORRUPT_DATA;
        }
        *offset += color_count * 3;
        color_table = local_colors;
    }

    /* Read LZW minimum code size */
    if (*offset >= size) {
        return FRMG_ERROR_CORRUPT_DATA;
    }
    uint8_t lzw_min_code_size = data[(*offset)++];

    /* Read compressed data */
    uint8_t *compressed_data = NULL;
    size_t compressed_size = read_data_subblocks(data, *offset, size, &compressed_data);

    if (compressed_size == 0) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    /* Skip to end of data blocks */
    while (*offset < size && data[*offset] != 0) {
        uint8_t block_size = data[*offset];
        *offset += 1 + block_size;
    }
    if (*offset < size) {
        (*offset)++; /* Skip terminator */
    }

    /* Allocate output buffer for indexed data */
    size_t indexed_size = (size_t)desc.width * (size_t)desc.height;
    uint8_t *indexed_data = (uint8_t*)malloc(indexed_size);
    if (!indexed_data) {
        free(compressed_data);
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress LZW data */
    frmg_error_t error = decompress_lzw(compressed_data, compressed_size,
                                        indexed_data, indexed_size,
                                        lzw_min_code_size);
    free(compressed_data);

    if (error != FRMG_OK) {
        free(indexed_data);
        return error;
    }

    /* Convert indexed to RGB */
    image->width = desc.width;
    image->height = desc.height;
    image->channels = 3;
    image->bit_depth = 8;
    image->format = FRMG_FORMAT_GIF;

    image->data = (uint8_t*)frmg_alloc_image_data(desc.width, desc.height, 3);
    if (!image->data) {
        free(indexed_data);
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    image->data_size = desc.width * desc.height * 3;

    /* Map indexed colors to RGB */
    for (size_t i = 0; i < indexed_size; i++) {
        uint8_t color_index = indexed_data[i];
        if (color_index < color_count) {
            image->data[i * 3] = color_table[color_index].r;
            image->data[i * 3 + 1] = color_table[color_index].g;
            image->data[i * 3 + 2] = color_table[color_index].b;
        }
    }

    free(indexed_data);
    return FRMG_OK;
}

/*
 * Skip GIF extension block
 */
static void skip_extension(const uint8_t *data, size_t *offset, size_t size) {
    if (*offset >= size) {
        return;
    }

    uint8_t ext_type = data[(*offset)++];
    (void)ext_type; /* Unused */

    /* Skip data sub-blocks */
    while (*offset < size) {
        uint8_t block_size = data[(*offset)++];
        if (block_size == 0) {
            break;
        }
        *offset += block_size;
    }
}

/*
 * Main GIF parsing function
 */
frmg_error_t frmg_parse_gif(const uint8_t *data, size_t size, frmg_image_t *image) {
    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size < GIF_SIGNATURE_SIZE) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Check GIF signature */
    if (memcmp(data, GIF87a_SIGNATURE, GIF_SIGNATURE_SIZE) != 0 &&
        memcmp(data, GIF89a_SIGNATURE, GIF_SIGNATURE_SIZE) != 0) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Parse Logical Screen Descriptor */
    gif_screen_descriptor_t screen_desc;
    if (parse_screen_descriptor(data, GIF_SIGNATURE_SIZE, size, &screen_desc) < 0) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    size_t offset = GIF_SIGNATURE_SIZE + 7;

    /* Parse global color table if present */
    gif_color_t global_colors[256];
    int global_color_count = 0;

    if (screen_desc.packed & 0x80) {
        global_color_count = 1 << ((screen_desc.packed & 0x07) + 1);
        if (parse_color_table(data, offset, size, global_colors, global_color_count) < 0) {
            return FRMG_ERROR_CORRUPT_DATA;
        }
        offset += global_color_count * 3;
    }

    /* Parse GIF blocks */
    while (offset < size) {
        uint8_t block_type = data[offset++];

        switch (block_type) {
            case GIF_BLOCK_IMAGE:
                /* Parse first image and return */
                return parse_image_data(data, &offset, size, global_colors,
                                       global_color_count, image);

            case GIF_BLOCK_EXTENSION:
                skip_extension(data, &offset, size);
                break;

            case GIF_BLOCK_TERMINATOR:
                return FRMG_ERROR_CORRUPT_DATA; /* No image found */

            default:
                return FRMG_ERROR_CORRUPT_DATA;
        }
    }

    return FRMG_ERROR_CORRUPT_DATA;
}
