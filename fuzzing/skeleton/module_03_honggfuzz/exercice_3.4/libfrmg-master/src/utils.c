/*
 * libfrmg - Utility Functions
 *
 * Common utility functions used by parsers.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"

#if defined(__ANDROID__) && !defined(NO_ANDROID_LOG)
#include <android/log.h>
#define LOG_TAG "libfrmg"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)
#else
#define LOGD(...) fprintf(stderr, "[DEBUG] " __VA_ARGS__); fprintf(stderr, "\n")
#define LOGE(...) fprintf(stderr, "[ERROR] " __VA_ARGS__); fprintf(stderr, "\n")
#endif

void* frmg_alloc_image_data(uint32_t width, uint32_t height, uint32_t channels) {
    size_t size = width * height * channels;

    LOGD("Allocating image data: %ux%ux%u = %zu bytes", width, height, channels, size);

    void *ptr = malloc(size);
    if (!ptr) {
        LOGE("Failed to allocate %zu bytes", size);
    }

    return ptr;
}

int frmg_copy_data(void *dest, const void *src, size_t dest_size, size_t src_size) {
    if (src_size > dest_size) {
        LOGE("Copy size mismatch: src=%zu, dest=%zu", src_size, dest_size);
        return -1;
    }

    memcpy(dest, src, src_size);
    return 0;
}

uint32_t frmg_read_u32_le(const uint8_t *data, size_t offset, size_t max_size) {
    if (offset + 4 > max_size) {
        LOGE("Read out of bounds: offset=%zu, max=%zu", offset, max_size);
        return 0;
    }

    return (uint32_t)data[offset] |
           ((uint32_t)data[offset + 1] << 8) |
           ((uint32_t)data[offset + 2] << 16) |
           ((uint32_t)data[offset + 3] << 24);
}

uint32_t frmg_read_u32_be(const uint8_t *data, size_t offset, size_t max_size) {
    if (offset + 4 > max_size) {
        LOGE("Read out of bounds: offset=%zu, max=%zu", offset, max_size);
        return 0;
    }

    return ((uint32_t)data[offset] << 24) |
           ((uint32_t)data[offset + 1] << 16) |
           ((uint32_t)data[offset + 2] << 8) |
           (uint32_t)data[offset + 3];
}

uint16_t frmg_read_u16_le(const uint8_t *data, size_t offset, size_t max_size) {
    if (offset + 2 > max_size) {
        LOGE("Read out of bounds: offset=%zu, max=%zu", offset, max_size);
        return 0;
    }

    return (uint16_t)data[offset] |
           ((uint16_t)data[offset + 1] << 8);
}

uint16_t frmg_read_u16_be(const uint8_t *data, size_t offset, size_t max_size) {
    if (offset + 2 > max_size) {
        LOGE("Read out of bounds: offset=%zu, max=%zu", offset, max_size);
        return 0;
    }

    return ((uint16_t)data[offset] << 8) |
           (uint16_t)data[offset + 1];
}

int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels) {
    if (width == 0 || height == 0) {
        LOGE("Invalid dimensions: %ux%u", width, height);
        return 0;
    }

    if (channels == 0 || channels > 4) {
        LOGE("Invalid channels: %u", channels);
        return 0;
    }

    return 1;
}

const char* frmg_error_string(frmg_error_t error) {
    switch (error) {
        case FRMG_OK:
            return "Success";
        case FRMG_ERROR_NULL_POINTER:
            return "Null pointer";
        case FRMG_ERROR_INVALID_FORMAT:
            return "Invalid format";
        case FRMG_ERROR_INVALID_HEADER:
            return "Invalid header";
        case FRMG_ERROR_UNSUPPORTED_FORMAT:
            return "Unsupported format";
        case FRMG_ERROR_OUT_OF_MEMORY:
            return "Out of memory";
        case FRMG_ERROR_CORRUPT_DATA:
            return "Corrupt data";
        case FRMG_ERROR_INVALID_DIMENSIONS:
            return "Invalid dimensions";
        case FRMG_ERROR_DECOMPRESS_FAILED:
            return "Decompression failed";
        default:
            return "Unknown error";
    }
}
