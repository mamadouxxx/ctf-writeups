/*
 * libfrmg - Image Loader Fuzzer
 *
 * This fuzzer tests the full image loading pipeline (frmg_load_image).
 * It accepts any file format and tests format detection and parsing.
 *
 * For Android x86_64 emulator with libFuzzer.
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include "../include/libfrmg.h"

#ifdef __ANDROID__
#include <android/log.h>
#define LOG_TAG "image_loader_fuzzer"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)
#else
#define LOGD(...) fprintf(stderr, "[DEBUG] " __VA_ARGS__); fprintf(stderr, "\n")
#define LOGE(...) fprintf(stderr, "[ERROR] " __VA_ARGS__); fprintf(stderr, "\n")
#endif

/*
 * libFuzzer entry point
 *
 * Input: Raw file data (any format)
 * Tests: Format detection, header parsing, image loading
 */
#ifdef __cplusplus
extern "C"
#endif
int LLVMFuzzerTestOneInput(const uint8_t *data, size_t size) {
    frmg_image_t image;

    // Skip inputs that are too small or too large
    if (size < 2 || size > 10 * 1024 * 1024) {
        return 0;
    }

    // Try to load the image
    frmg_error_t error = frmg_load_image(data, size, &image);

    // If successful, free the image
    if (error == FRMG_OK) {
        // Verify basic sanity of loaded image
        if (image.data != NULL && image.width > 0 && image.height > 0) {
            LOGD("Loaded image: %ux%u, %u channels, format %d",
                 image.width, image.height, image.channels, image.format);
        }

        frmg_free_image(&image);
    }

    return 0;
}

/*
 * Standalone mode - read from file
 * Useful for reproducing crashes found by the fuzzer
 */
#ifndef LIBFUZZER
int main(int argc, char **argv) {
    if (argc < 2) {
        fprintf(stderr, "Usage: %s <image_file>\n", argv[0]);
        fprintf(stderr, "\nThis is a standalone test harness.\n");
        fprintf(stderr, "Use this to reproduce crashes found by libFuzzer.\n");
        return 1;
    }

    FILE *fp = fopen(argv[1], "rb");
    if (!fp) {
        fprintf(stderr, "Error: Cannot open file %s\n", argv[1]);
        return 1;
    }

    // Read entire file
    fseek(fp, 0, SEEK_END);
    long file_size = ftell(fp);
    fseek(fp, 0, SEEK_SET);

    if (file_size <= 0 || file_size > 100 * 1024 * 1024) {
        fprintf(stderr, "Error: Invalid file size %ld\n", file_size);
        fclose(fp);
        return 1;
    }

    uint8_t *data = (uint8_t*)malloc(file_size);
    if (!data) {
        fprintf(stderr, "Error: Out of memory\n");
        fclose(fp);
        return 1;
    }

    size_t bytes_read = fread(data, 1, file_size, fp);
    fclose(fp);

    if (bytes_read != (size_t)file_size) {
        fprintf(stderr, "Error: Failed to read file\n");
        free(data);
        return 1;
    }

    // Run fuzzer
    printf("Testing file: %s (%zu bytes)\n", argv[1], bytes_read);
    int result = LLVMFuzzerTestOneInput(data, bytes_read);

    free(data);
    return result;
}
#endif
