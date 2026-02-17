# Quick Start: Fuzzing frmg_validate_dimensions on Android x86_64

## TL;DR - Fast Track

```bash
# 1. Set up NDK
export ANDROID_NDK=/path/to/android-ndk

# 2. Build everything
./scripts/build_android_libfuzzer.sh

# 3. Deploy to device
./scripts/deploy_android_fuzzer.sh

# 4. Run (will be prompted by deploy script, or run manually)
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=60 -dict=dims.dict corpus/'
```

## Detailed Steps

### Step 1: Prerequisites

#### Install Android NDK
```bash
# macOS
brew install android-ndk
export ANDROID_NDK=/opt/homebrew/share/android-ndk

# Linux
# Download from https://developer.android.com/ndk/downloads
# Extract and set path
export ANDROID_NDK=/path/to/android-ndk-r26b
```

Add to your shell profile (`.bashrc`, `.zshrc`, etc.):
```bash
export ANDROID_NDK=/opt/homebrew/share/android-ndk  # adjust path
```

#### Start Android x86_64 Emulator
```bash
# List available emulators
emulator -list-avds

# Start an emulator (example)
emulator -avd Pixel_4_API_30 &

# Verify it's running and x86_64
adb devices
adb shell getprop ro.product.cpu.abi
# Should output: x86_64
```

### Step 2: Build the Fuzzer

```bash
cd /Users/raefko/libfrmg

# Build libfrmg.so and validate_dimensions_fuzzer for Android x86_64
./scripts/build_android_libfuzzer.sh
```

**Output files:**
- `build/android_libfuzzer/x86_64/libfrmg.so` - Shared library
- `build/android_libfuzzer/x86_64/validate_dimensions_fuzzer` - Fuzzer binary

**What this does:**
- Compiles libfrmg as a shared library for Android x86_64
- Builds the libFuzzer harness targeting `frmg_validate_dimensions`
- Enables AddressSanitizer (ASan) to catch memory bugs

### Step 3: Deploy to Emulator

**Option A: Automated (Recommended)**
```bash
./scripts/deploy_android_fuzzer.sh
```
This script will:
- Push files to `/data/local/tmp/`
- Create initial corpus (8 seed inputs)
- Create fuzzing dictionary
- Ask if you want to start fuzzing

**Option B: Manual**
```bash
# Push files
adb push build/android_libfuzzer/x86_64/libfrmg.so /data/local/tmp/
adb push build/android_libfuzzer/x86_64/validate_dimensions_fuzzer /data/local/tmp/
adb shell chmod +x /data/local/tmp/validate_dimensions_fuzzer

# Create directories
adb shell mkdir -p /data/local/tmp/corpus
```

### Step 4: Run the Fuzzer

#### Basic Run
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer corpus/'
```

#### Recommended Options

**Run for a specific time (60 seconds):**
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=60 corpus/'
```

**Run with dictionary (better coverage):**
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -dict=dims.dict corpus/'
```

**Run for specific number of iterations:**
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -runs=10000 corpus/'
```

**Use multiple workers (if CPU allows):**
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -workers=4 corpus/'
```

**Combined (recommended):**
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=300 -dict=dims.dict -workers=2 corpus/'
```

### Step 5: Monitor Results

#### In Another Terminal
```bash
# Watch logs
adb logcat | grep -E 'AddressSanitizer|validate_dimensions|libfrmg'

# Check process
adb shell ps | grep validate_dimensions
```

#### Understanding Output

**Normal fuzzing output:**
```
#1      INITED cov: 12 ft: 13 corp: 1/12b exec/s: 0 rss: 32Mb
#2      NEW    cov: 15 ft: 16 corp: 2/24b lim: 12 exec/s: 0 rss: 32Mb
...
```
- `cov`: Code coverage (edges covered)
- `ft`: Features (unique behaviors)
- `corp`: Corpus size (items/bytes)
- `exec/s`: Executions per second

**Crash found:**
```
==1234==ERROR: AddressSanitizer: heap-buffer-overflow on address 0x...
...
SUMMARY: AddressSanitizer: heap-buffer-overflow
artifact_prefix='./'; Test unit written to ./crash-a1b2c3d4e5f6
```

### Step 6: Collect Crashes

```bash
# List crashes on device
adb shell ls /data/local/tmp/crash-*

# Pull all crashes to host
mkdir -p crashes
adb pull /data/local/tmp/crash-* crashes/

# Or pull individual crash
adb pull /data/local/tmp/crash-a1b2c3d4e5f6 crashes/
```

### Step 7: Analyze Crashes

#### View crash input
```bash
hexdump -C crashes/crash-a1b2c3d4e5f6
```

#### Decode the values
The input is 12 bytes representing:
- Bytes 0-3: width (uint32_t, little-endian)
- Bytes 4-7: height (uint32_t, little-endian)
- Bytes 8-11: channels (uint32_t, little-endian)

Example:
```
00000000  ff ff ff ff ff ff 00 00  03 00 00 00              |............|
```
This is: width=0xffffffff (4294967295), height=0x0000ffff (65535), channels=3

#### Reproduce crash
```bash
# On device
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer crash-a1b2c3d4e5f6'

# This will show the full ASan report
```

## What This Fuzzer Tests

### Target Function
```c
int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels);
```
Located in: `src/utils.c:89-101`

### Known Vulnerability
From the code (line 130 in VULNERABILITIES.md):
```c
// BUG: No upper bound checking
```

The function checks:
- ✓ width and height are not zero
- ✓ channels is between 1-4
- ✗ NO upper bounds on width/height (vulnerable!)

### Expected Findings

The fuzzer should find inputs that cause:
1. **Integer overflow** when width × height × channels is calculated later
2. **Heap buffer overflow** when the overflowed size is used for allocation
3. **Denial of service** through excessive memory allocation

Example vulnerable scenario:
```c
// In frmg_alloc_image_data (called after validation)
size_t size = width * height * channels;  // Can overflow!
void *ptr = malloc(size);                  // Small allocation due to overflow
// Later: write more data than allocated -> heap overflow
```

## Troubleshooting

### "Failed to load libfrmg.so"
```bash
# Make sure LD_LIBRARY_PATH is set
adb shell 'cd /data/local/tmp && LD_LIBRARY_PATH=. ./validate_dimensions_fuzzer corpus/'
```

### "CANNOT LINK EXECUTABLE"
```bash
# Verify architecture
adb shell file /data/local/tmp/validate_dimensions_fuzzer
# Should show: ELF 64-bit LSB executable, x86-64

adb shell getprop ro.product.cpu.abi
# Should show: x86_64
```

### Fuzzer is too slow
```bash
# Rebuild without ASan (faster but won't catch bugs as well)
# Or reduce corpus size
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_len=12 corpus/'
```

### Permission denied
```bash
# Try as root
adb root
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer corpus/'
```

## Tips for Best Results

### 1. Let it run longer
```bash
# Fuzz for 1 hour
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=3600 -dict=dims.dict corpus/' &
```

### 2. Minimize corpus periodically
```bash
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -merge=1 corpus_min/ corpus/ && rm -rf corpus && mv corpus_min corpus'
```

### 3. Use custom dictionary
Add interesting values that trigger edge cases:
```bash
cat > custom.dict << 'EOF'
# Powers of 2
val_256="\x00\x01\x00\x00"
val_512="\x00\x02\x00\x00"
val_1024="\x00\x04\x00\x00"
val_2048="\x00\x08\x00\x00"
# Likely to overflow when multiplied
val_big1="\x00\x00\x01\x00"
val_big2="\xff\xff\xff\x7f"
EOF

adb push custom.dict /data/local/tmp/
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -dict=custom.dict corpus/'
```

## File Locations

| File | Location |
|------|----------|
| Fuzzer harness source | `fuzzing/validate_dimensions_fuzzer.c` |
| Build script | `scripts/build_android_libfuzzer.sh` |
| Deploy script | `scripts/deploy_android_fuzzer.sh` |
| Detailed guide | `fuzzing/ANDROID_X86_64_FUZZING.md` |
| Built library | `build/android_libfuzzer/x86_64/libfrmg.so` |
| Built fuzzer | `build/android_libfuzzer/x86_64/validate_dimensions_fuzzer` |

## Next Steps

1. **Find crashes** - Let the fuzzer run for at least 30 minutes
2. **Analyze findings** - Understand what inputs trigger bugs
3. **Write exploits** - Use crashes to develop proof-of-concept exploits
4. **Patch vulnerabilities** - Fix the bugs you found
5. **Expand fuzzing** - Create harnesses for other functions:
   - `frmg_alloc_image_data` (allocation function)
   - `frmg_copy_data` (memory copy)
   - Full image parsers (BMP, PNG, etc.)

## Useful Commands Reference

```bash
# Build
./scripts/build_android_libfuzzer.sh

# Deploy
./scripts/deploy_android_fuzzer.sh

# Run (basic)
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer corpus/'

# Run (recommended)
adb shell 'cd /data/local/tmp && ./validate_dimensions_fuzzer -max_total_time=300 -dict=dims.dict corpus/'

# Monitor
adb logcat | grep AddressSanitizer

# Pull crashes
adb pull /data/local/tmp/crash-* crashes/

# Analyze crash input
hexdump -C crashes/crash-*

# Clean up
adb shell rm -rf /data/local/tmp/validate_dimensions_fuzzer /data/local/tmp/libfrmg.so /data/local/tmp/corpus /data/local/tmp/crash-*
```

## Additional Resources

- Full guide: `fuzzing/ANDROID_X86_64_FUZZING.md`
- libFuzzer docs: https://llvm.org/docs/LibFuzzer.html
- ASan docs: https://github.com/google/sanitizers/wiki/AddressSanitizer
- Android NDK: https://developer.android.com/ndk
