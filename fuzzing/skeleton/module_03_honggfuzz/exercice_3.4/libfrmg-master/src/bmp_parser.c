/*
 * libfrmg - BMP Parser
 *
 * Windows Bitmap (BMP) format parser.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"
#include "utils.h"

#define BMP_HEADER_SIZE 14
#define BMP_INFO_HEADER_SIZE 40

/* BMP File Header */
#pragma pack(push, 1)
typedef struct {
    uint16_t signature;     /* "BM" = 0x4D42 */
    uint32_t file_size;
    uint16_t reserved1;
    uint16_t reserved2;
    uint32_t data_offset;
} bmp_file_header_t;

/* BMP Info Header (BITMAPINFOHEADER) */
typedef struct {
    uint32_t header_size;
    int32_t width;
    int32_t height;
    uint16_t planes;
    uint16_t bit_count;
    uint32_t compression;
    uint32_t image_size;
    int32_t x_pixels_per_meter;
    int32_t y_pixels_per_meter;
    uint32_t colors_used;
    uint32_t colors_important;
} bmp_info_header_t;
#pragma pack(pop)

static int parse_bmp_header(const uint8_t *data, size_t size,
                            bmp_file_header_t *file_header,
                            bmp_info_header_t *info_header) {
    uint8_t header_buf[64];

    if (size < BMP_HEADER_SIZE + BMP_INFO_HEADER_SIZE) {
        return -1;
    }

    uint32_t info_header_size = frmg_read_u32_le(data, 14, size);

    memcpy(header_buf, data + 14, info_header_size);

    // Parse file header
    file_header->signature = frmg_read_u16_le(data, 0, size);
    file_header->file_size = frmg_read_u32_le(data, 2, size);
    file_header->reserved1 = frmg_read_u16_le(data, 6, size);
    file_header->reserved2 = frmg_read_u16_le(data, 8, size);
    file_header->data_offset = frmg_read_u32_le(data, 10, size);

    // Parse info header from buffer
    info_header->header_size = *(uint32_t*)&header_buf[0];
    info_header->width = *(int32_t*)&header_buf[4];
    info_header->height = *(int32_t*)&header_buf[8];
    info_header->planes = *(uint16_t*)&header_buf[12];
    info_header->bit_count = *(uint16_t*)&header_buf[14];
    info_header->compression = *(uint32_t*)&header_buf[16];
    info_header->image_size = *(uint32_t*)&header_buf[20];

    return 0;
}

static size_t calculate_row_size(uint32_t width, uint16_t bit_count) {
    size_t bits_per_row = (size_t)width * (size_t)bit_count;
    size_t bytes_per_row = (bits_per_row + 7) / 8;

    /* BMP rows are aligned to 4-byte boundaries */
    return (bytes_per_row + 3) & ~3;
}

/*
 * Main BMP parsing function
 */
frmg_error_t frmg_parse_bmp(const uint8_t *data, size_t size, frmg_image_t *image) {
    bmp_file_header_t file_header;
    bmp_info_header_t info_header;

    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size < BMP_HEADER_SIZE + BMP_INFO_HEADER_SIZE) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    /* Check BMP signature */
    if (data[0] != 'B' || data[1] != 'M') {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Parse headers */
    if (parse_bmp_header(data, size, &file_header, &info_header) < 0) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    /* Validate header values */
    if (info_header.header_size < BMP_INFO_HEADER_SIZE) {
        return FRMG_ERROR_INVALID_HEADER;
    }

    if (info_header.width <= 0 || info_header.height == 0) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    if (info_header.bit_count != 8 && info_header.bit_count != 24 &&
        info_header.bit_count != 32) {
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    if (info_header.compression != 0) {
        /* We only support uncompressed BMPs */
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    /* Handle negative height (top-down BMP) */
    int32_t height = info_header.height;
    int top_down = 0;
    if (height < 0) {
        top_down = 1;
        height = -height;
    }

    /* Calculate dimensions */
    uint32_t width = (uint32_t)info_header.width;
    uint32_t channels = info_header.bit_count / 8;

    if (!frmg_validate_dimensions(width, height, channels)) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    /* Calculate row size */
    size_t row_size = calculate_row_size(width, info_header.bit_count);
    size_t expected_data_size = row_size * height;

    /* Check if file is large enough */
    if (file_header.data_offset > size) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    image->data = (uint8_t*)frmg_alloc_image_data(width, height, channels);
    if (!image->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    /* Set image properties */
    image->width = width;
    image->height = height;
    image->channels = channels;
    image->bit_depth = 8;
    image->format = FRMG_FORMAT_BMP;
    image->data_size = width * height * channels;

    /* Copy pixel data */
    const uint8_t *pixel_data = data + file_header.data_offset;
    size_t remaining = size - file_header.data_offset;

    /* Read pixel data row by row */
    for (uint32_t y = 0; y < height; y++) {
        uint32_t dest_y = top_down ? y : (height - 1 - y);
        size_t dest_offset = dest_y * width * channels;

        if (row_size > remaining) {
            free(image->data);
            image->data = NULL;
            return FRMG_ERROR_CORRUPT_DATA;
        }

        size_t copy_size = width * channels;
        frmg_copy_data(image->data + dest_offset, pixel_data,
                      image->data_size - dest_offset, copy_size);

        pixel_data += row_size;
        remaining -= row_size;
    }

    return FRMG_OK;
}
