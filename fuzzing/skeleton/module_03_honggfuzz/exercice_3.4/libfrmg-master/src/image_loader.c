/*
 * libfrmg - Main Image Loader
 *
 * Main API implementation with format detection.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"
#include "utils.h"

/* Format signatures */
static const uint8_t BMP_SIGNATURE[] = {0x42, 0x4D}; /* "BM" */
static const uint8_t PNG_SIGNATURE[] = {0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A};
static const uint8_t JPEG_SIGNATURE[] = {0xFF, 0xD8}; /* JPEG SOI */
static const uint8_t GIF87a_SIGNATURE[] = {'G', 'I', 'F', '8', '7', 'a'};
static const uint8_t GIF89a_SIGNATURE[] = {'G', 'I', 'F', '8', '9', 'a'};
static const uint8_t TIFF_LE_SIGNATURE[] = {0x49, 0x49, 0x2A, 0x00}; /* "II*\0" little-endian */
static const uint8_t TIFF_BE_SIGNATURE[] = {0x4D, 0x4D, 0x00, 0x2A}; /* "MM\0*" big-endian */

/*
 * Detect image format from file data
 */
frmg_format_t frmg_detect_format(const uint8_t *data, size_t size) {
    if (!data || size < 2) {
        return FRMG_FORMAT_UNKNOWN;
    }

    /* Check BMP */
    if (size >= sizeof(BMP_SIGNATURE)) {
        if (memcmp(data, BMP_SIGNATURE, sizeof(BMP_SIGNATURE)) == 0) {
            return FRMG_FORMAT_BMP;
        }
    }

    /* Check PNG */
    if (size >= sizeof(PNG_SIGNATURE)) {
        if (memcmp(data, PNG_SIGNATURE, sizeof(PNG_SIGNATURE)) == 0) {
            return FRMG_FORMAT_PNG;
        }
    }

    /* Check JPEG */
    if (size >= sizeof(JPEG_SIGNATURE)) {
        if (memcmp(data, JPEG_SIGNATURE, sizeof(JPEG_SIGNATURE)) == 0) {
            return FRMG_FORMAT_JPEG;
        }
    }

    /* Check GIF */
    if (size >= sizeof(GIF87a_SIGNATURE)) {
        if (memcmp(data, GIF87a_SIGNATURE, sizeof(GIF87a_SIGNATURE)) == 0 ||
            memcmp(data, GIF89a_SIGNATURE, sizeof(GIF89a_SIGNATURE)) == 0) {
            return FRMG_FORMAT_GIF;
        }
    }

    /* Check TIFF */
    if (size >= sizeof(TIFF_LE_SIGNATURE)) {
        if (memcmp(data, TIFF_LE_SIGNATURE, sizeof(TIFF_LE_SIGNATURE)) == 0 ||
            memcmp(data, TIFF_BE_SIGNATURE, sizeof(TIFF_BE_SIGNATURE)) == 0) {
            return FRMG_FORMAT_TIFF;
        }
    }

    return FRMG_FORMAT_UNKNOWN;
}

/*
 * Load and parse an image from memory
 */
frmg_error_t frmg_load_image(const uint8_t *data, size_t size, frmg_image_t *image) {
    if (!data || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    if (size == 0) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Initialize image structure */
    memset(image, 0, sizeof(frmg_image_t));

    /* Detect format */
    frmg_format_t format = frmg_detect_format(data, size);

    if (format == FRMG_FORMAT_UNKNOWN) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Call appropriate parser */
    frmg_error_t error = FRMG_OK;

    switch (format) {
        case FRMG_FORMAT_BMP:
            error = frmg_parse_bmp(data, size, image);
            break;

        case FRMG_FORMAT_PNG:
            error = frmg_parse_png(data, size, image);
            break;

        case FRMG_FORMAT_JPEG:
            error = frmg_parse_jpeg(data, size, image);
            break;

        case FRMG_FORMAT_GIF:
            error = frmg_parse_gif(data, size, image);
            break;

        case FRMG_FORMAT_TIFF:
            error = frmg_parse_tiff(data, size, image);
            break;

        default:
            error = FRMG_ERROR_UNSUPPORTED_FORMAT;
            break;
    }

    return error;
}

/*
 * Load and parse an image from file path
 */
frmg_error_t frmg_load_image_file(const char *path, frmg_image_t *image) {
    if (!path || !image) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Open file */
    FILE *fp = fopen(path, "rb");
    if (!fp) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Get file size */
    fseek(fp, 0, SEEK_END);
    long file_size = ftell(fp);
    fseek(fp, 0, SEEK_SET);

    if (file_size <= 0 || file_size > 100 * 1024 * 1024) {
        /* Limit to 100MB */
        fclose(fp);
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Allocate buffer */
    uint8_t *data = (uint8_t*)malloc(file_size);
    if (!data) {
        fclose(fp);
        return FRMG_ERROR_OUT_OF_MEMORY;
    }

    /* Read file */
    size_t bytes_read = fread(data, 1, file_size, fp);
    fclose(fp);

    if (bytes_read != (size_t)file_size) {
        free(data);
        return FRMG_ERROR_CORRUPT_DATA;
    }

    /* Parse image */
    frmg_error_t error = frmg_load_image(data, bytes_read, image);

    free(data);
    return error;
}

/*
 * Free image resources
 */
void frmg_free_image(frmg_image_t *image) {
    if (!image) {
        return;
    }

    if (image->data) {
        free(image->data);
        image->data = NULL;
    }

    if (image->internal) {
        free(image->internal);
        image->internal = NULL;
    }

    memset(image, 0, sizeof(frmg_image_t));
}
