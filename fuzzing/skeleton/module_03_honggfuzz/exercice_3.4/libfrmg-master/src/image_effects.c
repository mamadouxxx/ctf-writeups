/*
 * libfrmg - Image Effects and Filters
 *
 * Provides image processing effects like blur, sharpen, brightness, etc.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <math.h>
#include "../include/libfrmg.h"
#include "utils.h"

#define CLAMP(x, min, max) ((x) < (min) ? (min) : ((x) > (max) ? (max) : (x)))

/*
 * Apply box blur filter
 */
frmg_error_t frmg_blur_box(const frmg_image_t *src, frmg_image_t *dst, int radius) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (radius < 1) {
        radius = 1;
    }

    /* Allocate destination image */
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

    int kernel_size = radius * 2 + 1;
    float kernel_area = (float)(kernel_size * kernel_size);

    /* Apply box blur */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            for (uint32_t c = 0; c < src->channels; c++) {
                float sum = 0.0f;
                int count = 0;

                /* Sum pixels in kernel */
                for (int ky = -radius; ky <= radius; ky++) {
                    for (int kx = -radius; kx <= radius; kx++) {
                        int nx = (int)x + kx;
                        int ny = (int)y + ky;

                        if (nx >= 0 && nx < (int)src->width &&
                            ny >= 0 && ny < (int)src->height) {
                            size_t idx = (ny * src->width + nx) * src->channels + c;
                            sum += src->data[idx];
                            count++;
                        }
                    }
                }

                size_t dst_idx = (y * src->width + x) * src->channels + c;
                dst->data[dst_idx] = (uint8_t)(sum / count);
            }
        }
    }

    return FRMG_OK;
}

/*
 * Apply Gaussian blur filter
 */
frmg_error_t frmg_blur_gaussian(const frmg_image_t *src, frmg_image_t *dst, float sigma) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (sigma <= 0.0f) {
        sigma = 1.0f;
    }

    /* Calculate kernel radius */
    int radius = (int)(sigma * 3.0f);
    if (radius < 1) {
        radius = 1;
    }

    int kernel_size = radius * 2 + 1;

    /* Generate Gaussian kernel */
    float *kernel = (float*)malloc(kernel_size * kernel_size * sizeof(float));
    if (!kernel) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    float sum = 0.0f;
    for (int y = -radius; y <= radius; y++) {
        for (int x = -radius; x <= radius; x++) {
            int idx = (y + radius) * kernel_size + (x + radius);
            float value = expf(-(x * x + y * y) / (2.0f * sigma * sigma));
            kernel[idx] = value;
            sum += value;
        }
    }

    /* Normalize kernel */
    for (int i = 0; i < kernel_size * kernel_size; i++) {
        kernel[i] /= sum;
    }

    /* Allocate destination image */
    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, src->channels);
    if (!dst->data) {
        free(kernel);
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = src->channels;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->data_size;

    /* Apply Gaussian blur */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            for (uint32_t c = 0; c < src->channels; c++) {
                float sum_value = 0.0f;

                for (int ky = -radius; ky <= radius; ky++) {
                    for (int kx = -radius; kx <= radius; kx++) {
                        int nx = (int)x + kx;
                        int ny = (int)y + ky;

                        if (nx >= 0 && nx < (int)src->width &&
                            ny >= 0 && ny < (int)src->height) {
                            size_t idx = (ny * src->width + nx) * src->channels + c;
                            int kernel_idx = (ky + radius) * kernel_size + (kx + radius);
                            sum_value += src->data[idx] * kernel[kernel_idx];
                        }
                    }
                }

                size_t dst_idx = (y * src->width + x) * src->channels + c;
                dst->data[dst_idx] = (uint8_t)CLAMP(sum_value, 0, 255);
            }
        }
    }

    free(kernel);
    return FRMG_OK;
}

/*
 * Sharpen image using unsharp mask
 */
frmg_error_t frmg_sharpen(const frmg_image_t *src, frmg_image_t *dst, float amount) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Simple sharpening kernel */
    const int kernel[9] = {
        0, -1,  0,
       -1,  5, -1,
        0, -1,  0
    };

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

    /* Apply sharpening */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            for (uint32_t c = 0; c < src->channels; c++) {
                int sum = 0;

                for (int ky = -1; ky <= 1; ky++) {
                    for (int kx = -1; kx <= 1; kx++) {
                        int nx = (int)x + kx;
                        int ny = (int)y + ky;

                        if (nx >= 0 && nx < (int)src->width &&
                            ny >= 0 && ny < (int)src->height) {
                            size_t idx = (ny * src->width + nx) * src->channels + c;
                            int kernel_idx = (ky + 1) * 3 + (kx + 1);
                            sum += src->data[idx] * kernel[kernel_idx];
                        }
                    }
                }

                /* Apply amount factor */
                size_t src_idx = (y * src->width + x) * src->channels + c;
                int result = (int)(src->data[src_idx] + (sum - src->data[src_idx]) * amount);

                size_t dst_idx = (y * src->width + x) * src->channels + c;
                dst->data[dst_idx] = (uint8_t)CLAMP(result, 0, 255);
            }
        }
    }

    return FRMG_OK;
}

/*
 * Adjust brightness
 */
frmg_error_t frmg_adjust_brightness(const frmg_image_t *src, frmg_image_t *dst, int adjustment) {
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

    /* Apply brightness adjustment */
    for (size_t i = 0; i < src->data_size; i++) {
        int value = (int)src->data[i] + adjustment;
        dst->data[i] = (uint8_t)CLAMP(value, 0, 255);
    }

    return FRMG_OK;
}

/*
 * Adjust contrast
 */
frmg_error_t frmg_adjust_contrast(const frmg_image_t *src, frmg_image_t *dst, float factor) {
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

    /* Apply contrast adjustment */
    for (size_t i = 0; i < src->data_size; i++) {
        float value = (src->data[i] - 128.0f) * factor + 128.0f;
        dst->data[i] = (uint8_t)CLAMP(value, 0, 255);
    }

    return FRMG_OK;
}

/*
 * Convert to grayscale
 */
frmg_error_t frmg_to_grayscale(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (src->channels < 3) {
        /* Already grayscale or single channel */
        return FRMG_ERROR_UNSUPPORTED_FORMAT;
    }

    /* Allocate grayscale image (1 channel) */
    dst->data = (uint8_t*)frmg_alloc_image_data(src->width, src->height, 1);
    if (!dst->data) {
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    dst->width = src->width;
    dst->height = src->height;
    dst->channels = 1;
    dst->bit_depth = src->bit_depth;
    dst->format = src->format;
    dst->data_size = src->width * src->height;

    /* Convert using luminosity method */
    for (uint32_t i = 0; i < src->width * src->height; i++) {
        size_t src_idx = i * src->channels;
        uint8_t r = src->data[src_idx];
        uint8_t g = src->data[src_idx + 1];
        uint8_t b = src->data[src_idx + 2];

        /* Standard luminosity formula */
        float gray = 0.299f * r + 0.587f * g + 0.114f * b;
        dst->data[i] = (uint8_t)gray;
    }

    return FRMG_OK;
}

/*
 * Detect edges using Sobel operator
 */
frmg_error_t frmg_edge_detect(const frmg_image_t *src, frmg_image_t *dst) {
    if (!src || !dst || !src->data) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Sobel kernels */
    const int sobel_x[9] = {
        -1, 0, 1,
        -2, 0, 2,
        -1, 0, 1
    };

    const int sobel_y[9] = {
        -1, -2, -1,
         0,  0,  0,
         1,  2,  1
    };

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

    /* Apply Sobel operator */
    for (uint32_t y = 0; y < src->height; y++) {
        for (uint32_t x = 0; x < src->width; x++) {
            for (uint32_t c = 0; c < src->channels; c++) {
                int gx = 0;
                int gy = 0;

                /* Apply Sobel kernels */
                for (int ky = -1; ky <= 1; ky++) {
                    for (int kx = -1; kx <= 1; kx++) {
                        int nx = (int)x + kx;
                        int ny = (int)y + ky;

                        if (nx >= 0 && nx < (int)src->width &&
                            ny >= 0 && ny < (int)src->height) {
                            size_t idx = (ny * src->width + nx) * src->channels + c;
                            int kernel_idx = (ky + 1) * 3 + (kx + 1);

                            gx += src->data[idx] * sobel_x[kernel_idx];
                            gy += src->data[idx] * sobel_y[kernel_idx];
                        }
                    }
                }

                /* Calculate gradient magnitude */
                float magnitude = sqrtf((float)(gx * gx + gy * gy));

                size_t dst_idx = (y * src->width + x) * src->channels + c;
                dst->data[dst_idx] = (uint8_t)CLAMP(magnitude, 0, 255);
            }
        }
    }

    return FRMG_OK;
}

/*
 * Invert image colors
 */
frmg_error_t frmg_invert(const frmg_image_t *src, frmg_image_t *dst) {
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

    /* Invert pixel values */
    for (size_t i = 0; i < src->data_size; i++) {
        dst->data[i] = 255 - src->data[i];
    }

    return FRMG_OK;
}

/*
 * Apply threshold (binarization)
 */
frmg_error_t frmg_threshold(const frmg_image_t *src, frmg_image_t *dst, uint8_t threshold) {
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

    /* Apply threshold */
    for (size_t i = 0; i < src->data_size; i++) {
        dst->data[i] = (src->data[i] >= threshold) ? 255 : 0;
    }

    return FRMG_OK;
}
