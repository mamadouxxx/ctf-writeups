/*
 * libfrmg - Image Transformation Functions
 *
 * Provides image transformation operations like resize, rotate, flip, and crop.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <math.h>
#include "../include/libfrmg.h"
#include "utils.h"

/*
 * Resize image using bilinear interpolation
 */
frmg_error_t frmg_resize_image(const frmg_image_t *src, frmg_image_t *dst,
                               uint32_t new_width, uint32_t new_height) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (new_width == 0 || new_height == 0) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    /* Allocate new image data */
    dst->data = (uint8_t*)frmg_alloc_image_data(new_width, new_height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = new_width;
    dst->height = new_height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = new_width * new_height * src->channels;

    /* Calculate scaling factors */
    float x_ratio = (float)src->width / (float)new_width;
    float y_ratio = (float)src->height / (float)new_height;

    /* Bilinear interpolation */
    for (uint32_t y = 0; y < new_height; y++) {
        for (uint32_t x = 0; x < new_width; x++) {
            /* Find corresponding position in source image */
            float src_x = x * x_ratio;
            float src_y = y * y_ratio;

            uint32_t x1 = (uint32_t)src_x;
            uint32_t y1 = (uint32_t)src_y;
            uint32_t x2 = x1 + 1;
            uint32_t y2 = y1 + 1;

            /* Clamp to image bounds */
            if (x2 >= src->width) x2 = src->width - 1;
            if (y2 >= src->height) y2 = src->height - 1;

            float x_weight = src_x - x1;
            float y_weight = src_y - y1;

            /* Interpolate each channel */
            for (uint32_t c = 0; c < src->channels; c++) {
                /* Get four neighboring pixels */
                size_t idx11 = (y1 * src->width + x1) * src->channels + c;
                size_t idx21 = (y1 * src->width + x2) * src->channels + c;
                size_t idx12 = (y2 * src->width + x1) * src->channels + c;
                size_t idx22 = (y2 * src->width + x2) * src->channels + c;

                uint8_t p11 = src->data[idx11];
                uint8_t p21 = src->data[idx21];
                uint8_t p12 = src->data[idx12];
                uint8_t p22 = src->data[idx22];

                /* Bilinear interpolation */
                float top = p11 * (1.0f - x_weight) + p21 * x_weight;
                float bottom = p12 * (1.0f - x_weight) + p22 * x_weight;
                float value = top * (1.0f - y_weight) + bottom * y_weight;

                size_t dst_idx = (y * new_width + x) * src->channels + c;
                dst->data[dst_idx] = (uint8_t)value;
            }
        }
    }

    return FRMG_OK;
}

/*
 * Rotate image 90 degrees clockwise
 */
frmg_error_t frmg_rotate_90_cw(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Allocate new image data with swapped dimensions */
    dst->data = (uint8_t*)frmg_alloc_image_data(src->height, src->width, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->height;
    dst->height = src->width;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = dst->width * dst->height * src->channels;

    /* Rotate pixels */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            uint32_t new_x = src->height - 1 - y;
            uint32_t new_y = x;

            for (uint32_t c = 0; c < src->channels; c++) {
                size_t src_idx = (y * src->width + x) * src->channels + c;
                size_t dst_idx = (new_y * dst->width + new_x) * src->channels + c;
                dst->data[dst_idx] = src->data[src_idx];
            }
        }
    }

    return FRMG_OK;
}

/*
 * Rotate image 180 degrees
 */
frmg_error_t frmg_rotate_180(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->data_size;

    /* Rotate pixels */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            uint32_t new_x = src->width - 1 - x;
            uint32_t new_y = src->height - 1 - y;

            for (uint32_t c = 0; c < src->channels; c++) {
                size_t src_idx = (y * src->width + x) * src->channels + c;
                size_t dst_idx = (new_y * dst->width + new_x) * src->channels + c;
                dst->data[dst_idx] = src->data[src_idx];
            }
        }
    }

    return FRMG_OK;
}

/*
 * Rotate image 270 degrees clockwise (90 degrees counter-clockwise)
 */
frmg_error_t frmg_rotate_270_cw(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(src->height, src->width, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->height;
    dst->height = src->width;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = dst->width * dst->height * src->channels;

    /* Rotate pixels */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            uint32_t new_x = y;
            uint32_t new_y = src->width - 1 - x;

            for (uint32_t c = 0; c < src->channels; c++) {
                size_t src_idx = (y * src->width + x) * src->channels + c;
                size_t dst_idx = (new_y * dst->width + new_x) * src->channels + c;
                dst->data[dst_idx] = src->data[src_idx];
            }
        }
    }

    return FRMG_OK;
}

/*
 * Flip image horizontally
 */
frmg_error_t frmg_flip_horizontal(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->data_size;

    /* Flip pixels horizontally */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            uint32_t new_x = src->width - 1 - x;

            for (uint32_t c = 0; c < src->channels; c++) {
                size_t src_idx = (y * src->width + x) * src->channels + c;
                size_t dst_idx = (y * dst->width + new_x) * src->channels + c;
                dst->data[dst_idx] = src->data[src_idx];
            }
        }
    }

    return FRMG_OK;
}

/*
 * Flip image vertically
 */
frmg_error_t frmg_flip_vertical(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->data_size;

    /* Flip pixels vertically */
    for (uint32_t y = 0; y < src->height; y++) {
        uint32_t new_y = src->height - 1 - y;
        size_t src_row_offset = y * src->width * src->channels;
        size_t dst_row_offset = new_y * dst->width * dst->channels;

        memcpy(dst->data + dst_row_offset,
               src->data + src_row_offset,
               src->width * src->channels);
    }

    return FRMG_OK;
}

/*
 * Crop image to specified rectangle
 */
frmg_error_t frmg_crop_image(const frmg_image_t *src, frmg_image_t *dst,
                             uint32_t x, uint32_t y, uint32_t width, uint32_t height) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Basic bounds checking */
    if (x >= src->width || y >= src->height) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    /* Adjust crop size if it exceeds image bounds */
    if (x + width > src->width) {
        width = src->width - x;
    }
    if (y + height > src->height) {
        height = src->height - y;
    }

    if (width == 0 || height == 0) {
        return FRMG_ERROR_INVALID_DIMENSIONS;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(width, height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = width;
    dst->height = height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = width * height * src->channels;

    /* Copy cropped region */
    for (uint32_t row = 0; row < height; row++) {
        size_t src_offset = ((y + row) * src->width + x) * src->channels;
        size_t dst_offset = row * width * src->channels;
        size_t row_bytes = width * src->channels;

        memcpy(dst->data + dst_offset, src->data + src_offset, row_bytes);
    }

    return FRMG_OK;
}

/*
 * Create a copy of an image
 */
frmg_error_t frmg_copy_image(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, src->channels);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->data_size;

    memcpy(dst->data, src->data, src->data_size);

    return FRMG_OK;
}
