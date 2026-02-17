# libfrmg Fuzzing

This repository includes libFuzzer harnesses for testing `libfrmg` on Android x86_64 emulators.

## 🚀 Quick Start

```bash
# 1. Set NDK path
export ANDROID_NDK=/path/to/android-ndk

# 2. Build fuzzer
./scripts/build_android_libfuzzer.sh

# 3. Deploy to emulator
./scripts/deploy_android_fuzzer.sh
```

## 📁 Structure

```
libfrmg/
├── fuzzing/
│   ├── validate_dimensions_fuzzer.c    # Fuzzer harness
│   ├── README.md                        # Fuzzing overview
│   ├── QUICKSTART_ANDROID_X86_64.md    # Quick reference ⭐
│   ├── ANDROID_X86_64_FUZZING.md       # Detailed guide
│   └── README_ANDROID_FUZZING.md       # Complete reference
│
├── scripts/
│   ├── build_android_libfuzzer.sh      # Build script
│   ├── deploy_android_fuzzer.sh        # Deploy script
│   └── README.md                        # Scripts documentation
│
└── docs/
    └── VULNERABILITIES.md               # Known vulnerabilities
```

## 🎯 Current Harnesses

| Harness | Target Function | Status |
|---------|----------------|--------|
| `validate_dimensions_fuzzer` | `frmg_validate_dimensions()` | ✅ Complete |

## 📖 Documentation

- **Start here:** [`fuzzing/QUICKSTART_ANDROID_X86_64.md`](fuzzing/QUICKSTART_ANDROID_X86_64.md)
- **Detailed guide:** [`fuzzing/ANDROID_X86_64_FUZZING.md`](fuzzing/ANDROID_X86_64_FUZZING.md)
- **Overview:** [`fuzzing/README_ANDROID_FUZZING.md`](fuzzing/README_ANDROID_FUZZING.md)

## 🔧 Requirements

- **Android NDK** r21 or later
- **Android x86_64 emulator** running
- **adb** command-line tool

## 🐛 What We're Finding

The fuzzer targets known vulnerabilities in dimension validation:
- Missing upper bound checks
- Integer overflow in size calculations
- Heap buffer overflows

See [`docs/VULNERABILITIES.md`](docs/VULNERABILITIES.md) for details.

## 💡 Tips

1. Run fuzzer for at least 30 minutes for meaningful results
2. Use the provided dictionary for better coverage
3. Monitor crashes with `adb logcat`
4. Pull crashes with `adb pull /data/local/tmp/crash-* crashes/`

## 🔗 Resources

- [libFuzzer Documentation](https://llvm.org/docs/LibFuzzer.html)
- [AddressSanitizer](https://github.com/google/sanitizers/wiki/AddressSanitizer)
- [Android NDK](https://developer.android.com/ndk)
