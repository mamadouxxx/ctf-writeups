# Android x86_64 libFuzzer Setup - Complete Reference

This directory contains everything needed to fuzz `libfrmg` on Android x86_64 emulators using libFuzzer.

## 📁 Files Overview

### Fuzzer Harnesses
- **`validate_dimensions_fuzzer.c`** - libFuzzer harness for `frmg_validate_dimensions` function
  - Targets the dimension validation function with known vulnerability (no upper bound checks)
  - Uses dynamic loading via `dlopen` to load `libfrmg.so`
  - Input: 12 bytes (width, height, channels as uint32_t little-endian)

### Build & Deploy Scripts
- **`../scripts/build_android_libfuzzer.sh`** - Builds the fuzzer for Android x86_64
  - Compiles `libfrmg.so` and `validate_dimensions_fuzzer`
  - Uses Android NDK toolchain
  - Enables AddressSanitizer

- **`../scripts/deploy_android_fuzzer.sh`** - Deploys fuzzer to connected emulator
  - Pushes binaries to `/data/local/tmp/`
  - Creates initial corpus (8 seed inputs)
  - Creates fuzzing dictionary
  - Optionally starts fuzzing


### Documentation
- **`QUICKSTART_ANDROID_X86_64.md`** ⭐ **START HERE** - Quick reference guide
- **`ANDROID_X86_64_FUZZING.md`** - Comprehensive detailed guide
- **`VULNERABILITIES.md`** - Known vulnerabilities in the library

## 🚀 Quick Start (3 Steps)

### 1. Set up Android NDK
```bash
export ANDROID_NDK=/path/to/android-ndk
```

### 2. Build the fuzzer
```bash
./scripts/build_android_libfuzzer.sh
```

### 3. Deploy and run
```bash
./scripts/deploy_android_fuzzer.sh
```

That's it! The deploy script will ask if you want to start fuzzing.

## 📚 Documentation Hierarchy

1. **Start Here:** `QUICKSTART_ANDROID_X86_64.md`
   - Fast track instructions
   - Minimal explanation
   - Common commands
   - Troubleshooting

2. **Detailed Guide:** `ANDROID_X86_64_FUZZING.md`
   - Complete documentation
   - Advanced options
   - Performance tuning
   - Comprehensive troubleshooting

3. **Source Code:** `validate_dimensions_fuzzer.c`
   - Well-commented harness
   - Shows input format
   - Explains target vulnerability

## 🎯 What You're Fuzzing

### Target Function
```c
int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels);
```
**Location:** `src/utils.c:89-101`

### Vulnerability
The function validates image dimensions but **has no upper bounds checking**:
- ✅ Checks width/height are not zero
- ✅ Checks channels are 1-4
- ❌ **DOES NOT check upper bounds on width/height**

### What This Can Cause
When the validated dimensions are later used:
```c
size_t size = width * height * channels;  // Integer overflow!
void *ptr = malloc(size);                  // Small allocation
// Later writes cause heap overflow
```

### Expected Crash Types
- Heap buffer overflow
- Integer overflow
- Excessive memory allocation (OOM)

## 🛠️ Build Artifacts

After building, you'll have:

```
build/android_libfuzzer/x86_64/
├── libfrmg.so                        # Shared library
└── validate_dimensions_fuzzer         # Fuzzer binary
```

These get deployed to `/data/local/tmp/` on the Android device.

## 📱 Device Setup

### Emulator Architecture
Must be **x86_64**. Check with:
```bash
adb shell getprop ro.product.cpu.abi
# Should output: x86_64
```

### Directory Structure on Device
```
/data/local/tmp/
├── libfrmg.so                    # Library
├── validate_dimensions_fuzzer     # Fuzzer
├── dims.dict                      # Fuzzing dictionary
├── corpus/                        # Input corpus
│   ├── seed1.bin
│   ├── seed2.bin
│   └── ...
└── crash-*                        # Crash artifacts (when found)
```

## 🎮 Common Commands

### Build
```bash
./scripts/build_android_libfuzzer.sh
```

### Deploy
```bash
./scripts/deploy_android_fuzzer.sh
```

### Run (Basic)
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer corpus/'
```

### Run (Recommended)
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=300 -dict=dims.dict corpus/'
```

### Monitor
```bash
adb logcat | grep -E 'AddressSanitizer|validate_dimensions'
```

### Pull Crashes
```bash
adb pull /data/local/tmp/crash-* crashes/
```

## 🐛 Understanding Crashes

### Input Format (12 bytes)
```
Offset  Size  Field
0-3     4     width (uint32_t LE)
4-7     4     height (uint32_t LE)
8-11    4     channels (uint32_t LE)
```

### Example Crash Analysis
```bash
# Pull crash
adb pull /data/local/tmp/crash-abc123 .

# View hex
hexdump -C crash-abc123
# 00000000  ff ff ff ff ff ff 00 00  03 00 00 00  |............|

# Decode:
# width = 0xffffffff = 4294967295
# height = 0x0000ffff = 65535
# channels = 0x00000003 = 3

# This causes: 4294967295 × 65535 × 3 = integer overflow!
```

### Reproduce Crash
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer crash-abc123'
# Shows full ASan report
```

## 📊 Performance Tips

### Let it Run
```bash
# Fuzz for 1 hour
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=3600 -dict=dims.dict corpus/' &
```

### Use Multiple Workers
```bash
# If emulator has multiple cores
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -workers=4 corpus/'
```

### Minimize Corpus
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -merge=1 corpus_min/ corpus/'
```

## 🔧 Troubleshooting

### "Failed to load libfrmg.so"
```bash
adb shell 'cd /data/local/tmp && LD_LIBRARY_PATH=. ./validate_dimensions_fuzzer corpus/'
```

### "CANNOT LINK EXECUTABLE"
Check architecture mismatch:
```bash
adb shell file /data/local/tmp/validate_dimensions_fuzzer
# Must show: x86-64
```

### Fuzzer Too Slow
Disable ASan (rebuild) or reduce corpus:
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_len=12 corpus/'
```

### Permission Denied
```bash
adb root
# Or:
adb shell setenforce 0
```

## 📖 Additional Resources

- [libFuzzer Tutorial](https://github.com/google/fuzzing/blob/master/tutorial/libFuzzerTutorial.md)
- [AddressSanitizer](https://github.com/google/sanitizers/wiki/AddressSanitizer)
- [Android NDK Guide](https://developer.android.com/ndk/guides)

## 🎯 Next Steps

1. **Run the fuzzer** for at least 30 minutes
2. **Collect crashes** and analyze them
3. **Create exploits** or patches based on findings
4. **Expand coverage** - create harnesses for:
   - `frmg_alloc_image_data` (heap allocation)
   - `frmg_copy_data` (memory operations)
   - Full image parsers (BMP, PNG, JPEG, etc.)
5. **Automate** - integrate into CI/CD

## 💡 Tips for Success

1. **Start simple** - Use the quick start guide
2. **Let it run** - Fuzzing needs time (hours/days for best results)
3. **Monitor regularly** - Check for crashes periodically
4. **Use dictionaries** - They significantly improve coverage
5. **Minimize corpus** - Smaller corpus = faster fuzzing
6. **Multiple instances** - Run several fuzzer instances in parallel
7. **Document findings** - Keep notes on crashes found

## 🤝 Contributing

Found a bug? Create an issue with:
- Crash input (hex dump)
- ASan report
- Steps to reproduce

## ⚠️ Security Note

This is a **deliberately vulnerable library** for security research and education. The vulnerabilities found are intentional and documented. Use this for:
- Learning about fuzzing
- Security research
- Vulnerability analysis training

**Do not** use this library in production!

---

**Questions?** Check the detailed guides or create an issue.

**Ready to fuzz?** Run: `./scripts/deploy_android_fuzzer.sh`
