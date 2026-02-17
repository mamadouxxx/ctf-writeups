/*
 * libFuzzer harness for frmg_validate_dimensions
 *
 * This harness targets the frmg_validate_dimensions function specifically,
 * testing various combinations of width, height, and channels parameters.
 *
 * Build for Android x86_64:
 *   See scripts/build_android_libfuzzer.sh
 *
 * The function has vulnerabilities related to integer overflow checks.
 */

#include <stdint.h>
#include <stddef.h>
#include <dlfcn.h>
#include <stdio.h>
#include <stdlib.h>

#ifdef __ANDROID__
#include <android/log.h>
#define LOG_TAG "validate_dimensions_fuzzer"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)
#else
#define LOGD(...) fprintf(stderr, "[DEBUG] " __VA_ARGS__); fprintf(stderr, "\n")
#define LOGE(...) fprintf(stderr, "[ERROR] " __VA_ARGS__); fprintf(stderr, "\n")
#endif

// Function pointer for frmg_validate_dimensions
typedef int (*frmg_validate_dimensions_fn)(uint32_t width, uint32_t height, uint32_t channels);

static frmg_validate_dimensions_fn validate_dimensions_ptr = NULL;
static void *lib_handle = NULL;

// Initialize the library and function pointer
__attribute__((constructor))
static void init_fuzzer(void) {
    // Try multiple library paths for Android
    const char *lib_paths[] = {
        "/data/local/tmp/libfrmg.so",
        "libfrmg.so",
        "./libfrmg.so",
        NULL
    };

    for (int i = 0; lib_paths[i] != NULL; i++) {
        lib_handle = dlopen(lib_paths[i], RTLD_LAZY);
        if (lib_handle) {
            LOGD("Loaded library from: %s", lib_paths[i]);
            break;
        }
    }

    if (!lib_handle) {
        LOGE("Failed to load libfrmg.so: %s", dlerror());
        exit(1);
    }

    // Get function pointer
    validate_dimensions_ptr = (frmg_validate_dimensions_fn)dlsym(lib_handle, "frmg_validate_dimensions");
    if (!validate_dimensions_ptr) {
        LOGE("Failed to find frmg_validate_dimensions: %s", dlerror());
        dlclose(lib_handle);
        exit(1);
    }

    LOGD("Successfully initialized fuzzer");
}

// Cleanup
__attribute__((destructor))
static void cleanup_fuzzer(void) {
    if (lib_handle) {
        dlclose(lib_handle);
    }
}

/*
 * libFuzzer entry point
 *
 * Input format:
 *   - Bytes 0-3: width (uint32_t, little-endian)
 *   - Bytes 4-7: height (uint32_t, little-endian)
 *   - Bytes 8-11: channels (uint32_t, little-endian)
 *
 * We need at least 12 bytes for a valid test case.
 */
#ifdef __cplusplus
extern "C"
#endif
int LLVMFuzzerTestOneInput(const uint8_t *data, size_t size) {
    // Need at least 12 bytes for width, height, channels
    if (size < 12) {
        return 0;
    }

    if (!validate_dimensions_ptr) {
        return 0;
    }

    // Extract parameters from input data (little-endian)
    uint32_t width = (uint32_t)data[0] |
                     ((uint32_t)data[1] << 8) |
                     ((uint32_t)data[2] << 16) |
                     ((uint32_t)data[3] << 24);

    uint32_t height = (uint32_t)data[4] |
                      ((uint32_t)data[5] << 8) |
                      ((uint32_t)data[6] << 16) |
                      ((uint32_t)data[7] << 24);

    uint32_t channels = (uint32_t)data[8] |
                        ((uint32_t)data[9] << 8) |
                        ((uint32_t)data[10] << 16) |
                        ((uint32_t)data[11] << 24);

    // Call the target function
    // This function is supposed to validate dimensions but has vulnerabilities
    // related to missing upper bound checks (see VULNERABILITIES.md)
    int result = validate_dimensions_ptr(width, height, channels);

    // Return value: 1 = valid, 0 = invalid
    // We don't care about the return value for fuzzing purposes,
    // we're looking for crashes/sanitizer violations
    (void)result;

    return 0;
}
