# Android x86_64 libFuzzer Guide

This guide covers building and running libFuzzer harnesses for `libfrmg` on an Android x86_64 emulator.

Currently includes harness for: `frmg_validate_dimensions`

## Prerequisites

### 1. Android NDK
Download and install the Android NDK:
```bash
# macOS with Homebrew
brew install android-ndk

# Or download directly from:
# https://developer.android.com/ndk/downloads

# Set environment variable
export ANDROID_NDK=/path/to/android-ndk
# Example: export ANDROID_NDK=/opt/homebrew/share/android-ndk
```

### 2. Android Emulator
Make sure you have an Android x86_64 emulator running:
```bash
# List available emulators
emulator -list-avds

# Start an x86_64 emulator (example)
emulator -avd Pixel_4_API_24 &

# Verify connection
adb devices
```

### 3. Verify Architecture
```bash
# Check emulator architecture
adb shell getprop ro.product.cpu.abi
# Should output: x86_64
```

## Build Instructions

### Step 1: Build libfrmg.so and Fuzzer

Run the build script:
```bash
./scripts/build_android_libfuzzer.sh
```

This will:
- Build `libfrmg.so` (shared library for Android x86_64)
- Build `validate_dimensions_fuzzer` (libFuzzer harness)
- Enable AddressSanitizer (ASan) for detecting memory bugs

Output files:
- `build/android_libfuzzer/x86_64/libfrmg.so`
- `build/android_libfuzzer/x86_64/validate_dimensions_fuzzer`

### Step 2: Push Files to Android Emulator

```bash
# Push library
adb push build/android_libfuzzer/x86_64/libfrmg.so /data/local/tmp/

# Push fuzzer binary
adb push build/android_libfuzzer/x86_64/validate_dimensions_fuzzer /data/local/tmp/

# Make fuzzer executable
adb shell chmod +x /data/local/tmp/validate_dimensions_fuzzer
```

### Step 3: Create Corpus Directory

```bash
# Create corpus directory on device
adb shell mkdir -p /data/local/tmp/corpus

# Optional: Push existing corpus files
# adb push fuzzing/corpus/* /data/local/tmp/corpus/
```

### Step 4: Create Initial Corpus

Since `frmg_validate_dimensions` expects 12 bytes (width, height, channels as uint32_t), we need minimal inputs:

```bash
# Create some initial test cases on your host
mkdir -p /tmp/initial_corpus

# Create a few seed inputs (12 bytes each)
# Example 1: width=100, height=100, channels=3
printf '\x64\x00\x00\x00\x64\x00\x00\x00\x03\x00\x00\x00' > /tmp/initial_corpus/seed1.bin

# Example 2: width=1920, height=1080, channels=4
printf '\x80\x07\x00\x00\x38\x04\x00\x00\x04\x00\x00\x00' > /tmp/initial_corpus/seed2.bin

# Example 3: width=0, height=0, channels=0 (edge case)
printf '\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00' > /tmp/initial_corpus/seed3.bin

# Example 4: Large values
printf '\xff\xff\x00\x00\xff\xff\x00\x00\x05\x00\x00\x00' > /tmp/initial_corpus/seed4.bin

# Push to device
adb push /tmp/initial_corpus/* /data/local/tmp/corpus/
```

## Running the Fuzzer

### Basic Fuzzing

Connect to the emulator and run:
```bash
adb shell
cd /data/local/tmp
./validate_dimensions_fuzzer corpus/
```

### Recommended Options

```bash
# Run with time limit (e.g., 60 seconds)
./validate_dimensions_fuzzer -max_total_time=60 corpus/

# Run with limited runs (e.g., 10000 iterations)
./validate_dimensions_fuzzer -runs=10000 corpus/

# Increase timeout per input (useful for complex functions)
./validate_dimensions_fuzzer -timeout=10 corpus/

# Use multiple workers (if multiple cores available)
./validate_dimensions_fuzzer -workers=4 corpus/

# Minimize corpus (reduce redundant test cases)
./validate_dimensions_fuzzer -merge=1 corpus/ corpus_new/
```

### Advanced Options

```bash
# Print coverage information
./validate_dimensions_fuzzer -print_coverage=1 corpus/

# Save only unique crashes
./validate_dimensions_fuzzer -exact_artifact_path=/data/local/tmp/crash corpus/

# Limit memory usage (in MB)
./validate_dimensions_fuzzer -rss_limit_mb=2048 corpus/

# Show what libFuzzer is doing
./validate_dimensions_fuzzer -verbosity=2 corpus/
```

## Understanding Results

### Crashes
If the fuzzer finds a crash, it will:
1. Print the crashing input as hex
2. Save it to a file like `crash-<hash>` in the current directory

Example crash output:
```
==1234==ERROR: AddressSanitizer: heap-buffer-overflow
...
artifact_prefix='./'; Test unit written to ./crash-a1b2c3d4e5f6
```

### Pull Crashes from Device
```bash
# List crashes
adb shell ls /data/local/tmp/crash-*

# Pull all crashes
adb pull /data/local/tmp/crash-* ./crashes/
```

### Analyze a Crash
```bash
# Reproduce a specific crash locally (on device)
./validate_dimensions_fuzzer /data/local/tmp/crash-a1b2c3d4e5f6

# Or pull it and analyze the bytes
adb pull /data/local/tmp/crash-a1b2c3d4e5f6 .
hexdump -C crash-a1b2c3d4e5f6
```

## Troubleshooting

### Issue: "Failed to load libfrmg.so"

Solution:
```bash
# Make sure library is in the same directory
adb shell
cd /data/local/tmp
export LD_LIBRARY_PATH=.
./validate_dimensions_fuzzer corpus/
```

Or push to a system library path:
```bash
adb push build/android_libfuzzer/x86_64/libfrmg.so /system/lib64/
```

### Issue: "CANNOT LINK EXECUTABLE"

This usually means:
1. Binary architecture mismatch (verify x86_64)
2. Missing library dependencies

Check:
```bash
adb shell file /data/local/tmp/validate_dimensions_fuzzer
adb shell file /data/local/tmp/libfrmg.so
# Both should show x86-64
```

### Issue: Fuzzer is too slow

Try:
```bash
# Disable ASan for speed (rebuild without ASan)
# Or reduce corpus size
./validate_dimensions_fuzzer -max_len=12 corpus/
```

### Issue: Permission denied

```bash
# Make sure SELinux is not blocking
adb shell setenforce 0

# Or run as root
adb root
```

## Target Function Details

### Function Signature
```c
int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels);
```

### Input Format (12 bytes)
- Bytes 0-3: `width` (uint32_t, little-endian)
- Bytes 4-7: `height` (uint32_t, little-endian)
- Bytes 8-11: `channels` (uint32_t, little-endian)

### Known Vulnerabilities
From `docs/VULNERABILITIES.md`:
- **Missing upper bound checks** on dimensions
- Can lead to integer overflow when calculating buffer sizes
- See `src/utils.c:89-101` for implementation

### Expected Findings
The fuzzer should be able to find inputs that:
1. Cause integer overflows in subsequent allocation calls
2. Trigger invalid memory operations
3. Bypass validation checks with edge case values

## Performance Tips

### 1. Corpus Management
```bash
# Periodically minimize the corpus
./validate_dimensions_fuzzer -merge=1 corpus_minimized/ corpus/
rm -rf corpus/
mv corpus_minimized/ corpus/
```

### 2. Dictionary (Optional)
Create a dictionary with interesting values:
```bash
cat > /tmp/dims.dict << 'EOF'
# Boundary values for dimensions
val_zero="\x00\x00\x00\x00"
val_one="\x01\x00\x00\x00"
val_max_u16="\xff\xff\x00\x00"
val_max_u32="\xff\xff\xff\xff"
val_1920="\x80\x07\x00\x00"
val_1080="\x38\x04\x00\x00"
val_4096="\x00\x10\x00\x00"
val_8192="\x00\x20\x00\x00"
val_channels_3="\x03\x00\x00\x00"
val_channels_4="\x04\x00\x00\x00"
EOF

adb push /tmp/dims.dict /data/local/tmp/
./validate_dimensions_fuzzer -dict=/data/local/tmp/dims.dict corpus/
```

### 3. Parallel Fuzzing
```bash
# Start multiple instances
for i in {0..3}; do
    adb shell "cd /data/local/tmp && ./validate_dimensions_fuzzer -jobs=$i -workers=1 corpus/ &"
done
```

## Monitoring

### Check Fuzzer Progress
```bash
# In another terminal
adb shell ps | grep validate_dimensions
adb logcat | grep validate_dimensions
```

### View ASan Output
```bash
adb logcat | grep AddressSanitizer
```

## Cleaning Up

```bash
# On device
adb shell rm -rf /data/local/tmp/validate_dimensions_fuzzer
adb shell rm -rf /data/local/tmp/libfrmg.so
adb shell rm -rf /data/local/tmp/corpus
adb shell rm -rf /data/local/tmp/crash-*

# On host
rm -rf build/android_libfuzzer
```

## Additional Resources

- [libFuzzer Documentation](https://llvm.org/docs/LibFuzzer.html)
- [Android NDK Documentation](https://developer.android.com/ndk/guides)
- [AddressSanitizer Documentation](https://github.com/google/sanitizers/wiki/AddressSanitizer)

## Next Steps

After finding crashes with `frmg_validate_dimensions`, you can:
1. Create more targeted harnesses for other functions
2. Use the findings to write exploits or patches
3. Integrate fuzzing into CI/CD pipeline
4. Try other sanitizers (UBSan, MSan) for different bug classes
