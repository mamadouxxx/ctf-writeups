/*
 * libfrmg - Image Parsing Library
 *
 * Educational library for vulnerability research training.
 * Supports BMP, PNG, and JPEG formats.
 *
 * WARNING: This library contains intentional vulnerabilities for
 * educational purposes. DO NOT use in production environments.
 */

#ifndef LIBFRMG_H
#define LIBFRMG_H

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Image format types */
typedef enum {
    FRMG_FORMAT_UNKNOWN = 0,
    FRMG_FORMAT_BMP = 1,
    FRMG_FORMAT_PNG = 2,
    FRMG_FORMAT_JPEG = 3,
    FRMG_FORMAT_GIF = 4,
    FRMG_FORMAT_TIFF = 5
} frmg_format_t;

/* Error codes */
typedef enum {
    FRMG_OK = 0,
    FRMG_ERROR_NULL_POINTER = -1,
    FRMG_ERROR_INVALID_FORMAT = -2,
    FRMG_ERROR_INVALID_HEADER = -3,
    FRMG_ERROR_UNSUPPORTED_FORMAT = -4,
    FRMG_ERROR_OUT_OF_MEMORY = -5,
    FRMG_ERROR_CORRUPT_DATA = -6,
    FRMG_ERROR_INVALID_DIMENSIONS = -7,
    FRMG_ERROR_DECOMPRESS_FAILED = -8
} frmg_error_t;

/* Image structure */
typedef struct {
    uint32_t width;
    uint32_t height;
    uint32_t channels;      /* 1=grayscale, 3=RGB, 4=RGBA */
    uint32_t bit_depth;     /* bits per channel */
    frmg_format_t format;
    uint8_t *data;          /* Raw pixel data */
    size_t data_size;       /* Size of pixel data */
    void *internal;         /* Internal parser state */
} frmg_image_t;

/*
 * Detect image format from file data
 *
 * @param data: Pointer to file data
 * @param size: Size of file data
 * @return: Detected format or FRMG_FORMAT_UNKNOWN
 */
frmg_format_t frmg_detect_format(const uint8_t *data, size_t size);

/*
 * Load and parse an image from memory
 *
 * @param data: Pointer to file data
 * @param size: Size of file data
 * @param image: Pointer to image structure (output)
 * @return: FRMG_OK on success, error code otherwise
 */
frmg_error_t frmg_load_image(const uint8_t *data, size_t size, frmg_image_t *image);

/*
 * Load and parse an image from file path
 *
 * @param path: File path
 * @param image: Pointer to image structure (output)
 * @return: FRMG_OK on success, error code otherwise
 */
frmg_error_t frmg_load_image_file(const char *path, frmg_image_t *image);

/*
 * Free image resources
 *
 * @param image: Pointer to image structure
 */
void frmg_free_image(frmg_image_t *image);

/*
 * Get error string
 *
 * @param error: Error code
 * @return: Human-readable error string
 */
const char* frmg_error_string(frmg_error_t error);

/* Parser-specific functions (internal, exposed for testing) */

/* BMP Parser */
frmg_error_t frmg_parse_bmp(const uint8_t *data, size_t size, frmg_image_t *image);

/* PNG Parser */
frmg_error_t frmg_parse_png(const uint8_t *data, size_t size, frmg_image_t *image);

/* JPEG Parser */
frmg_error_t frmg_parse_jpeg(const uint8_t *data, size_t size, frmg_image_t *image);

/* GIF Parser */
frmg_error_t frmg_parse_gif(const uint8_t *data, size_t size, frmg_image_t *image);

/* TIFF Parser */
frmg_error_t frmg_parse_tiff(const uint8_t *data, size_t size, frmg_image_t *image);

/*
 * EXIF Metadata Structure
 */
typedef struct {
    char make[64];
    char model[64];
    char software[64];
    char datetime[32];
    char datetime_original[32];
    uint16_t orientation;
    float exposure_time;
    float f_number;
    uint16_t iso_speed;
    float focal_length;
    uint16_t flash;
    int has_gps;
    char gps_latitude_ref;
    char gps_longitude_ref;
    uint8_t gps_altitude_ref;
} frmg_exif_data_t;

/* EXIF Parser */
frmg_error_t frmg_parse_exif(const uint8_t *data, size_t size, frmg_exif_data_t *exif);

/*
 * Image Transformation Functions
 */

/* Resize image using bilinear interpolation */
frmg_error_t frmg_resize_image(const frmg_image_t *src, frmg_image_t *dst,
                               uint32_t new_width, uint32_t new_height);

/* Rotate image 90 degrees clockwise */
frmg_error_t frmg_rotate_90_cw(const frmg_image_t *src, frmg_image_t *dst);

/* Rotate image 180 degrees */
frmg_error_t frmg_rotate_180(const frmg_image_t *src, frmg_image_t *dst);

/* Rotate image 270 degrees clockwise */
frmg_error_t frmg_rotate_270_cw(const frmg_image_t *src, frmg_image_t *dst);

/* Flip image horizontally */
frmg_error_t frmg_flip_horizontal(const frmg_image_t *src, frmg_image_t *dst);

/* Flip image vertically */
frmg_error_t frmg_flip_vertical(const frmg_image_t *src, frmg_image_t *dst);

/* Crop image to specified rectangle */
frmg_error_t frmg_crop_image(const frmg_image_t *src, frmg_image_t *dst,
                             uint32_t x, uint32_t y, uint32_t width, uint32_t height);

/* Create a copy of an image */
frmg_error_t frmg_copy_image(const frmg_image_t *src, frmg_image_t *dst);

/*
 * Image Effects and Filters
 */

/* Apply box blur filter */
frmg_error_t frmg_blur_box(const frmg_image_t *src, frmg_image_t *dst, int radius);

/* Apply Gaussian blur filter */
frmg_error_t frmg_blur_gaussian(const frmg_image_t *src, frmg_image_t *dst, float sigma);

/* Sharpen image */
frmg_error_t frmg_sharpen(const frmg_image_t *src, frmg_image_t *dst, float amount);

/* Adjust brightness */
frmg_error_t frmg_adjust_brightness(const frmg_image_t *src, frmg_image_t *dst, int adjustment);

/* Adjust contrast */
frmg_error_t frmg_adjust_contrast(const frmg_image_t *src, frmg_image_t *dst, float factor);

/* Convert to grayscale */
frmg_error_t frmg_to_grayscale(const frmg_image_t *src, frmg_image_t *dst);

/* Detect edges using Sobel operator */
frmg_error_t frmg_edge_detect(const frmg_image_t *src, frmg_image_t *dst);

/* Invert image colors */
frmg_error_t frmg_invert(const frmg_image_t *src, frmg_image_t *dst);

/* Apply threshold (binarization) */
frmg_error_t frmg_threshold(const frmg_image_t *src, frmg_image_t *dst, uint8_t threshold);

#ifdef __cplusplus
}
#endif

#endif /* LIBFRMG_H */
