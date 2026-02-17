# Building libfrmg

This document provides comprehensive build instructions for libfrmg.

## Quick Reference

### Using CMake Presets (Easiest)

```bash
# List all available presets
cmake --list-presets

# Build for host (Debug with ASAN)
cmake --preset host-debug
cmake --build --preset host-debug

# Build for Android (requires ANDROID_NDK environment variable)
export ANDROID_NDK=/path/to/android-ndk
cmake --preset android-arm64
cmake --build --preset android-arm64
```

### Using Makefile

```bash
# Host build
make

# Android build
export ANDROID_NDK=/path/to/android-ndk
make android
```

---

## Android Build Guide

### Prerequisites

1. **Download Android NDK**
   - Download from: https://developer.android.com/ndk/downloads
   - Or via Android Studio SDK Manager
   - Recommended: NDK r25 or later

2. **Set Environment Variable**
   ```bash
   export ANDROID_NDK=/path/to/android-ndk-r25c
   ```

### Method 1: Using CMake Presets (Recommended)

```bash
# Set NDK path
export ANDROID_NDK=/path/to/android-ndk

# Build for ARM64 (most common - phones/tablets)
cmake --preset android-arm64
cmake --build --preset android-arm64
# Output: build/android/arm64-v8a/libfrmg.so

# Build for ARM 32-bit (older devices)
cmake --preset android-arm
cmake --build --preset android-arm
# Output: build/android/armeabi-v7a/libfrmg.so

# Build for x86_64 (emulator)
cmake --preset android-x86_64
cmake --build --preset android-x86_64
# Output: build/android/x86_64/libfrmg.so

# Build for x86 (older emulator)
cmake --preset android-x86
cmake --build --preset android-x86
# Output: build/android/x86/libfrmg.so
```

### Method 2: Direct CMake Commands

```bash
export ANDROID_NDK=/path/to/android-ndk

cmake -B build/android/arm64-v8a \
  -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake \
  -DANDROID_ABI=arm64-v8a \
  -DANDROID_PLATFORM=android-24 \
  -DCMAKE_BUILD_TYPE=Debug \
  -DENABLE_ASAN=ON

cmake --build build/android/arm64-v8a -j8
```

### Android Build Options

| Option | Description | Default |
|--------|-------------|---------|
| `ANDROID_ABI` | Target ABI (arm64-v8a, armeabi-v7a, x86_64, x86) | Required |
| `ANDROID_PLATFORM` | Minimum Android API level | android-24 |
| `CMAKE_BUILD_TYPE` | Debug or Release | Debug |
| `ENABLE_ASAN` | Enable AddressSanitizer | ON |

### Android ABIs Explained

- **arm64-v8a**: 64-bit ARM - Modern phones/tablets (most common)
- **armeabi-v7a**: 32-bit ARM - Older devices
- **x86_64**: 64-bit x86 - Android emulator
- **x86**: 32-bit x86 - Older Android emulator

### Common Android NDK Locations

```bash
# macOS (Android Studio)
export ANDROID_NDK=~/Library/Android/sdk/ndk/25.2.9519653

# Linux (Android Studio)
export ANDROID_NDK=~/Android/Sdk/ndk/25.2.9519653

# Custom installation
export ANDROID_NDK=/opt/android-ndk-r25c
```

---

## Host Platform Builds

### Debug Build (Default)

```bash
cmake --preset host-debug
cmake --build --preset host-debug
# Output: build/host/frmg_fuzzer
```

### Release Build

```bash
cmake --preset host-release
cmake --build --preset host-release
# Output: build/host-release/frmg_fuzzer
```

### With AddressSanitizer (ASAN)

```bash
# Using preset (ASAN enabled by default)
cmake --preset host-debug

# Using direct CMake
cmake -B build/host -DENABLE_ASAN=ON -DCMAKE_BUILD_TYPE=Debug
cmake --build build/host
```

### With UndefinedBehaviorSanitizer (UBSAN)

```bash
# Direct CMake with UBSAN
cmake -B build/host -DENABLE_UBSAN=ON -DCMAKE_BUILD_TYPE=Debug
cmake --build build/host
```

---

## Fuzzing Builds

### libFuzzer (Recommended)

```bash
# Using preset
cmake --preset libfuzzer
cmake --build --preset libfuzzer
# Output: build/libfuzzer/frmg_fuzzer

# Run fuzzing
build/libfuzzer/frmg_fuzzer fuzzing/corpus -max_total_time=3600
```

**Requirements:**
- macOS: `brew install llvm`
- Linux: Install LLVM with libFuzzer support

### AFL++

```bash
# Build with AFL++ instrumentation
cmake -B build/afl \
  -DCMAKE_C_COMPILER=afl-clang-fast \
  -DCMAKE_CXX_COMPILER=afl-clang-fast++ \
  -DENABLE_ASAN=ON \
  -DCMAKE_BUILD_TYPE=Debug
cmake --build build/afl

# Run AFL++
afl-fuzz -i fuzzing/corpus -o fuzzing/findings -- build/afl/frmg_fuzzer @@
```

**Installation:**
- macOS: `brew install afl++`
- Linux: `apt install afl++`

---

## Build Options Reference

### CMake Options

| Option | Values | Default | Description |
|--------|--------|---------|-------------|
| `CMAKE_BUILD_TYPE` | Debug, Release | Debug | Build type |
| `ENABLE_ASAN` | ON, OFF | OFF | AddressSanitizer |
| `ENABLE_UBSAN` | ON, OFF | OFF | UBSanitizer |
| `USE_LIBFUZZER` | ON, OFF | OFF | libFuzzer support |
| `BUILD_FUZZER` | ON, OFF | ON (host only) | Build fuzzing harness |

---

## IDE Integration

### Visual Studio Code

The CMakePresets.json is automatically detected. Use the CMake Tools extension:

1. Install CMake Tools extension
2. Open Command Palette (Cmd/Ctrl+Shift+P)
3. Select "CMake: Select Configure Preset"
4. Choose desired preset (host-debug, android-arm64, etc.)
5. Build with "CMake: Build"

### CLion

CLion automatically detects CMakePresets.json:

1. Open project in CLion
2. Select Build Profile from dropdown
3. Build normally

### Android Studio

For Android development:

1. Add libfrmg as a native library dependency
2. Reference the built .so files from `build/android/<ABI>/`

---

## Troubleshooting

### Android NDK Not Found

```
Error: ANDROID_NDK environment variable not set
```

**Solution:** Set the ANDROID_NDK environment variable:
```bash
export ANDROID_NDK=/path/to/android-ndk
```

### libFuzzer Not Available

```
Error: clang not found
```

**Solution (macOS):**
```bash
brew install llvm
```

**Solution (Linux):**
```bash
# Use system clang (may need to install separately)
sudo apt install clang
```

### Build Fails with ASAN on Android

Some Android devices don't support ASAN well. Try building without it:
```bash
cmake --preset android-arm64
cmake --build --preset android-arm64
# Then edit CMakeCache.txt to set ENABLE_ASAN=OFF, or use direct cmake:
cmake -B build/android/arm64-v8a \
  -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake \
  -DANDROID_ABI=arm64-v8a \
  -DANDROID_PLATFORM=android-24 \
  -DENABLE_ASAN=OFF
```

### Ninja Not Found (Android builds)

CMake presets try to use Ninja for Android builds. Install it:
```bash
# macOS
brew install ninja

# Linux
apt install ninja-build
```

Or remove the `"generator": "Ninja"` line from CMakePresets.json.

---

## Output Locations

| Build Type | Output Directory | Files |
|------------|------------------|-------|
| Host Debug | `build/host/` | `frmg_fuzzer`, `libfrmg.so`/`.dylib` |
| Host Release | `build/host-release/` | `frmg_fuzzer`, `libfrmg.so`/`.dylib` |
| libFuzzer | `build/libfuzzer/` | `frmg_fuzzer` |
| AFL++ | `build/afl/` | `frmg_fuzzer` |
| Android | `build/android/<ABI>/` | `libfrmg.so`, `libfrmg_jni.so` |

---

## Additional Resources

- Main README: `README.md`
- CMake configuration: `CMakeLists.txt`
- Build presets: `CMakePresets.json`
- Vulnerability reference: `docs/VULNERABILITIES.md`
