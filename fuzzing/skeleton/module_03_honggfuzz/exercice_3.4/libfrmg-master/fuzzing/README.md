# Fuzzing Harnesses

## 🎯 Available Harnesses

### `validate_dimensions_fuzzer.c`
Targets: `frmg_validate_dimensions()`

**Vulnerability:** No upper bound checking on dimensions (can cause integer overflow)

**Input format:** 12 bytes
- Bytes 0-3: width (uint32_t, little-endian)
- Bytes 4-7: height (uint32_t, little-endian)
- Bytes 8-11: channels (uint32_t, little-endian)

**Platform:** Android x86_64 emulator

---

## 🚀 Quick Start

See [`QUICKSTART_ANDROID_X86_64.md`](QUICKSTART_ANDROID_X86_64.md) for fast-track instructions.

### TL;DR
```bash
export ANDROID_NDK=/path/to/android-ndk
./scripts/build_android_libfuzzer.sh
./scripts/deploy_android_fuzzer.sh
```

---

## 📚 Documentation

1. **[QUICKSTART_ANDROID_X86_64.md](QUICKSTART_ANDROID_X86_64.md)** ⭐ Start here
   - 3-step setup
   - Common commands
   - Quick troubleshooting

2. **[ANDROID_X86_64_FUZZING.md](ANDROID_X86_64_FUZZING.md)** - Detailed guide
   - Complete instructions
   - Advanced options
   - Performance tuning

3. **[README_ANDROID_FUZZING.md](README_ANDROID_FUZZING.md)** - Overview
   - Files reference
   - Architecture details
   - Tips & tricks

---

## 🛠️ Creating New Harnesses

To add a new fuzzer:

1. **Create harness file:** `fuzzing/my_function_fuzzer.c`
```c
#ifdef __cplusplus
extern "C"
#endif
int LLVMFuzzerTestOneInput(const uint8_t *data, size_t size) {
    // Your fuzzing logic here
    return 0;
}
```

2. **Update build script:** Add to `scripts/build_android_libfuzzer.sh`

3. **Update deploy script:** Add to `scripts/deploy_android_fuzzer.sh`

4. **Test:**
```bash
./scripts/build_android_libfuzzer.sh
adb push build/android_libfuzzer/x86_64/my_function_fuzzer /data/local/tmp/
adb shell 'cd /data/local/tmp && ./my_function_fuzzer corpus/'
```

---

## 🎯 Suggested Future Harnesses

### High Priority
- **`frmg_alloc_image_data`** - Tests allocation with integer overflow
- **`frmg_copy_data`** - Tests buffer copy operations
- **`frmg_parse_bmp`** - Tests BMP parser end-to-end

### Medium Priority
- **`frmg_parse_png`** - Tests PNG decompression
- **`frmg_parse_jpeg`** - Tests JPEG parsing
- **`frmg_parse_gif`** - Tests GIF parsing
- **`frmg_parse_tiff`** - Tests TIFF parsing

### Low Priority
- **`frmg_load_image`** - Tests format detection
- **`frmg_transform_*`** - Tests image transformations
- **`frmg_effect_*`** - Tests image effects

---

## 📊 Current Coverage

| Function | Harness | Status |
|----------|---------|--------|
| `frmg_validate_dimensions` | ✅ | Complete |
| `frmg_alloc_image_data` | ❌ | TODO |
| `frmg_copy_data` | ❌ | TODO |
| BMP parser | ❌ | TODO |
| PNG parser | ❌ | TODO |
| JPEG parser | ❌ | TODO |

---

## 🐛 Known Vulnerabilities

See [`../docs/VULNERABILITIES.md`](../docs/VULNERABILITIES.md) for the complete list.

**Key findings:**
- Missing upper bound checks in dimension validation
- Integer overflow in allocation size calculation
- No size validation in copy operations

---

## 💡 Tips

1. **Run for hours, not minutes** - Fuzzing needs time
2. **Use dictionaries** - Significantly improves coverage
3. **Minimize corpus regularly** - Faster fuzzing
4. **Monitor with logcat** - Watch for crashes in real-time
5. **Save your findings** - Document crashes and inputs

---

## 🔗 Resources

- [libFuzzer Documentation](https://llvm.org/docs/LibFuzzer.html)
- [AddressSanitizer](https://github.com/google/sanitizers/wiki/AddressSanitizer)
- [Android NDK](https://developer.android.com/ndk)
- [Fuzzing Tutorial](https://github.com/google/fuzzing/blob/master/tutorial/libFuzzerTutorial.md)
