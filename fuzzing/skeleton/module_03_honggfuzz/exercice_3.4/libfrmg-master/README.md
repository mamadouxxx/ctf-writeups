# libfrmg

**A deliberately vulnerable image parsing library for security research training**

[![License](https://img.shields.io/badge/license-Educational-blue.svg)](LICENSE)
[![Language](https://img.shields.io/badge/language-C-orange.svg)](https://en.wikipedia.org/wiki/C_(programming_language))
[![Platform](https://img.shields.io/badge/platform-Linux%20%7C%20macOS%20%7C%20Android-lightgrey.svg)](BUILDING.md)

---

## ⚠️ Warning

**This library contains intentional security vulnerabilities for educational purposes.**

**DO NOT use in production environments.**

This is a training tool designed for:
- Security researchers learning vulnerability analysis
- Students practicing static analysis and reverse engineering
- Fuzzing workshops and vulnerability research training
- Android native code security education

---

## Overview

libfrmg is a C library that parses multiple image formats with intentionally introduced security vulnerabilities. It provides a realistic environment for learning:

- **Static Analysis** - Reverse engineering and code auditing with tools like Ghidra
- **Dynamic Analysis** - Fuzzing with AFL++, libFuzzer, or custom fuzzers
- **Vulnerability Research** - Understanding common bug patterns in parsers
- **Exploitation** - Developing proof-of-concept exploits (educational only)

### Supported Image Formats

| Format | Features | Complexity |
|--------|----------|------------|
| **BMP** | Windows Bitmap, uncompressed | Low |
| **PNG** | Portable Network Graphics, zlib compression, chunks | Medium |
| **JPEG** | JPEG/JFIF, markers, quantization tables | Medium |
| **GIF** | GIF87a/GIF89a, LZW compression | High |
| **TIFF** | Tagged Image File Format, IFD structures, multiple compressions | High |
| **EXIF** | EXIF metadata parsing from JPEG, nested IFD structures | High |

### Additional Features

- **Image Transformations**: Resize, rotate, flip, crop
- **Image Effects**: Blur (box, Gaussian), sharpen, brightness/contrast, edge detection
- **Android NDK Support**: Builds for ARM64, ARM32, x86_64
- **Fuzzing Ready**: Includes harness compatible with AFL++ and libFuzzer
- **ASAN/UBSAN Support**: Sanitizers for bug detection

---

## Quick Start

### Prerequisites

- CMake 3.18.1 or later
- C compiler (GCC or Clang)
- zlib development libraries

Optional:
- Android NDK r21+ (for Android builds)
- AFL++ (for AFL fuzzing)
- Homebrew LLVM (for libFuzzer on macOS)

### Build in 30 Seconds

```bash
# Clone or extract the library
cd libfrmg

# Build for host platform (with AddressSanitizer)
cmake --preset host-debug
cmake --build --preset host-debug

# Test it works
./build/host/frmg_fuzzer --help
```

**Output**: `build/host/frmg_fuzzer` (standalone fuzzing harness)

### Start Fuzzing

```bash
# Create a corpus directory with sample images
mkdir -p fuzzing/corpus
# Add your BMP, PNG, JPEG, GIF, TIFF files here

# Run the fuzzer
./build/host/frmg_fuzzer fuzzing/corpus/test.png
```

When ASAN detects a bug, you'll see detailed crash information:

```
==12345==ERROR: AddressSanitizer: heap-buffer-overflow
READ of size 4 at 0x... thread T0
    #0 in frmg_parse_gif src/gif_parser.c:156
```

---

## Library Features

### API Overview

```c
#include <libfrmg.h>

// Detect image format
frmg_format_t format = frmg_detect_format(data, size);

// Load image from memory
frmg_image_t image;
frmg_error_t err = frmg_load_image(data, size, &image);

// Load image from file
err = frmg_load_image_file("photo.jpg", &image);

// Access image data
printf("Image: %ux%u, %u channels\n",
       image.width, image.height, image.channels);

// Transform image
frmg_image_t resized;
frmg_resize_image(&image, &resized, 640, 480);

// Apply effects
frmg_image_t blurred;
frmg_blur_gaussian(&image, &blurred, 2.0f);

// Parse EXIF metadata
frmg_exif_data_t exif;
frmg_parse_exif(exif_data, exif_size, &exif);
printf("Camera: %s %s\n", exif.make, exif.model);

// Free resources
frmg_free_image(&image);
```

### Format-Specific Parsers

Each parser is in a separate source file for clarity:

- `src/bmp_parser.c` - BMP format (Windows Bitmap)
- `src/png_parser.c` - PNG format with zlib decompression
- `src/jpeg_parser.c` - JPEG/JFIF format
- `src/gif_parser.c` - GIF format with LZW decompression
- `src/tiff_parser.c` - TIFF format with IFD structures
- `src/exif_parser.c` - EXIF metadata extraction

### Image Processing

- `src/image_transform.c` - Resize, rotate, flip, crop operations
- `src/image_effects.c` - Blur, sharpen, brightness, contrast, edge detection

---

## Vulnerability Research

### Intentional Vulnerabilities

This library contains **30 documented vulnerabilities** across different categories:

| Category | Count | Examples |
|----------|-------|----------|
| Integer Overflows | 8 | Size calculations, dimension multiplications |
| Heap Buffer Overflows | 7 | Undersized allocations, unbounded writes |
| Stack Buffer Overflows | 2 | Fixed-size buffers with variable input |
| Use-After-Free | 1 | Improper cleanup sequences |
| Logic Bugs | 6 | Off-by-one errors, missing validations |
| Resource Exhaustion | 6 | Unbounded allocations, recursion |

**For trainers**: Detailed vulnerability reference available in `docs/VULNERABILITIES.md`

### Training Workflow

#### Phase 1: Static Analysis

1. Build the Android library with debug symbols:
   ```bash
   export ANDROID_NDK=/path/to/ndk
   cmake --preset android-arm64
   cmake --build --preset android-arm64
   ```

2. Load `build/android/arm64-v8a/libfrmg.so` in Ghidra or IDA Pro

3. Analyze the decompiled code looking for:
   - Unchecked arithmetic operations
   - Fixed-size buffers with variable-length copies
   - Missing bounds checks
   - Suspicious pointer arithmetic

#### Phase 2: Dynamic Fuzzing

1. Create a seed corpus:
   ```bash
   mkdir -p fuzzing/corpus
   # Add valid image files (BMP, PNG, JPEG, GIF, TIFF)
   ```

2. Build with libFuzzer (recommended):
   ```bash
   cmake --preset libfuzzer
   cmake --build --preset libfuzzer
   ```

3. Run fuzzing campaign:
   ```bash
   ./build/libfuzzer/frmg_fuzzer fuzzing/corpus -max_total_time=3600
   ```

4. Analyze crashes:
   - Crashes saved as `crash-*` files
   - ASAN output shows vulnerability type and location
   - Map findings back to source code

#### Phase 3: Exploitation (Advanced)

1. Reproduce crashes deterministically
2. Analyze memory corruption patterns
3. Develop proof-of-concept exploits
4. Document full exploitation chain

### Expected Discoveries

With 1-2 hours of fuzzing, students should find:

- ✅ Multiple heap buffer overflows
- ✅ At least one stack overflow
- ✅ Integer overflow issues
- ✅ Logic bugs and edge cases

---

## Building

See **[BUILDING.md](BUILDING.md)** for comprehensive build instructions.

### Quick Build Reference

```bash
# List all available build configurations
cmake --list-presets

# Host builds
cmake --preset host-debug      # Debug with ASAN
cmake --preset host-release    # Release build
cmake --build --preset host-debug

# Fuzzing builds
cmake --preset libfuzzer        # libFuzzer (requires LLVM)
cmake --build --preset libfuzzer

# Android builds (requires ANDROID_NDK environment variable)
export ANDROID_NDK=/path/to/ndk
cmake --preset android-arm64    # ARM64 (most common)
cmake --preset android-arm      # ARM32
cmake --preset android-x86_64   # x86_64 emulator
cmake --build --preset android-arm64
```

---

## Project Structure

```
libfrmg/
├── CMakeLists.txt              # Build configuration
├── CMakePresets.json           # CMake presets for easy building
├── README.md                   # This file
├── BUILDING.md                 # Comprehensive build instructions
├── include/
│   └── libfrmg.h              # Public API header
├── src/
│   ├── utils.c                # Utility functions
│   ├── bmp_parser.c           # BMP format parser
│   ├── png_parser.c           # PNG format parser
│   ├── jpeg_parser.c          # JPEG format parser
│   ├── gif_parser.c           # GIF format parser (LZW)
│   ├── tiff_parser.c          # TIFF format parser (IFD)
│   ├── exif_parser.c          # EXIF metadata parser
│   ├── image_transform.c      # Image transformations
│   ├── image_effects.c        # Image effects/filters
│   └── image_loader.c         # Format detection and loading
├── fuzzing/
│   ├── fuzzing_harness.c      # Fuzzer entry point
│   └── corpus/                # Seed corpus directory
├── jni/
│   └── frmg_jni.c             # JNI wrapper for Android
└── docs/
    └── VULNERABILITIES.md      # Vulnerability reference (trainers)
```

---

## Statistics

- **~3,500 lines** of C code
- **30 intentional vulnerabilities**
- **5 image format parsers**
- **1 metadata parser** (EXIF)
- **2 image processing modules**
- **34 public API functions**
- **6 supported platforms** (Linux, macOS, Windows, Android ARM64/ARM32/x86_64)

---

## API Reference

### Core Functions

```c
// Format detection
frmg_format_t frmg_detect_format(const uint8_t *data, size_t size);

// Image loading
frmg_error_t frmg_load_image(const uint8_t *data, size_t size, frmg_image_t *image);
frmg_error_t frmg_load_image_file(const char *path, frmg_image_t *image);

// Format-specific parsers
frmg_error_t frmg_parse_bmp(const uint8_t *data, size_t size, frmg_image_t *image);
frmg_error_t frmg_parse_png(const uint8_t *data, size_t size, frmg_image_t *image);
frmg_error_t frmg_parse_jpeg(const uint8_t *data, size_t size, frmg_image_t *image);
frmg_error_t frmg_parse_gif(const uint8_t *data, size_t size, frmg_image_t *image);
frmg_error_t frmg_parse_tiff(const uint8_t *data, size_t size, frmg_image_t *image);

// EXIF metadata
frmg_error_t frmg_parse_exif(const uint8_t *data, size_t size, frmg_exif_data_t *exif);

// Resource management
void frmg_free_image(frmg_image_t *image);

// Error handling
const char* frmg_error_string(frmg_error_t error);
```

### Image Transformations

```c
// Resize with bilinear interpolation
frmg_error_t frmg_resize_image(const frmg_image_t *src, frmg_image_t *dst,
                               uint32_t new_width, uint32_t new_height);

// Rotation
frmg_error_t frmg_rotate_90_cw(const frmg_image_t *src, frmg_image_t *dst);
frmg_error_t frmg_rotate_180(const frmg_image_t *src, frmg_image_t *dst);
frmg_error_t frmg_rotate_270_cw(const frmg_image_t *src, frmg_image_t *dst);

// Flipping
frmg_error_t frmg_flip_horizontal(const frmg_image_t *src, frmg_image_t *dst);
frmg_error_t frmg_flip_vertical(const frmg_image_t *src, frmg_image_t *dst);

// Cropping
frmg_error_t frmg_crop_image(const frmg_image_t *src, frmg_image_t *dst,
                             uint32_t x, uint32_t y, uint32_t width, uint32_t height);

// Copy
frmg_error_t frmg_copy_image(const frmg_image_t *src, frmg_image_t *dst);
```

### Image Effects

```c
// Blur filters
frmg_error_t frmg_blur_box(const frmg_image_t *src, frmg_image_t *dst, int radius);
frmg_error_t frmg_blur_gaussian(const frmg_image_t *src, frmg_image_t *dst, float sigma);

// Enhancement
frmg_error_t frmg_sharpen(const frmg_image_t *src, frmg_image_t *dst, float amount);
frmg_error_t frmg_adjust_brightness(const frmg_image_t *src, frmg_image_t *dst, int adjustment);
frmg_error_t frmg_adjust_contrast(const frmg_image_t *src, frmg_image_t *dst, float factor);

// Conversion
frmg_error_t frmg_to_grayscale(const frmg_image_t *src, frmg_image_t *dst);

// Analysis
frmg_error_t frmg_edge_detect(const frmg_image_t *src, frmg_image_t *dst);

// Utilities
frmg_error_t frmg_invert(const frmg_image_t *src, frmg_image_t *dst);
frmg_error_t frmg_threshold(const frmg_image_t *src, frmg_image_t *dst, uint8_t threshold);
```

Full API documentation available in [`include/libfrmg.h`](include/libfrmg.h).

---

## Use Cases

### Security Training

- **University Courses**: Binary exploitation, reverse engineering labs
- **Corporate Training**: Secure coding practices, vulnerability analysis
- **CTF Competitions**: Realistic vulnerable binary challenges
- **Self-Study**: Learn fuzzing and vulnerability research

### Research

- **Fuzzer Evaluation**: Test fuzzer effectiveness on real-world bugs
- **Tool Development**: Benchmark static analysis tools
- **Sanitizer Testing**: Evaluate ASAN/UBSAN detection capabilities
- **Exploit Mitigation**: Test exploit mitigation techniques

### Android Security

- **NDK Vulnerability Research**: Learn Android native code security
- **Ghidra Training**: Practice reverse engineering ARM binaries
- **Mobile Exploitation**: Understand app-level native vulnerabilities

---

## Educational Value

### Learning Objectives

Students using this library will learn:

1. **Static Analysis Skills**
   - Reading and understanding C code
   - Identifying vulnerabilities through code review
   - Using reverse engineering tools (Ghidra, IDA Pro)
   - Understanding binary formats and parsers

2. **Dynamic Analysis Skills**
   - Setting up fuzzing environments
   - Creating effective seed corpuses
   - Interpreting sanitizer output
   - Reproducing and analyzing crashes

3. **Vulnerability Patterns**
   - Integer overflow vulnerabilities
   - Memory corruption bugs
   - Parser-specific vulnerabilities
   - Real-world bug classes

4. **Secure Development**
   - Proper input validation
   - Safe memory management
   - Bounds checking importance
   - Defense-in-depth strategies

### Difficulty Levels

- **Beginner**: Find obvious vulnerabilities (V4, V16)
- **Intermediate**: Discover integer overflow chains (V1→V10, V9→V10)
- **Advanced**: Identify subtle bugs (V14, V23-V25)
- **Expert**: Chain vulnerabilities for complex exploitation

---

## FAQ

**Q: Is this safe to analyze?**
A: Yes, the vulnerabilities are intentional and documented. The library itself won't harm your system - it only parses data. However, found vulnerabilities could theoretically be exploited if this were real software.

**Q: Can I use this in CTF competitions?**
A: Yes! This makes excellent CTF challenge material. Just ensure you're not giving away the vulnerability documentation.

**Q: How long does it take to find bugs?**
A: With proper fuzzing setup, expect to find multiple bugs within 1-2 hours. Static analysis may find obvious bugs in minutes, subtle ones in hours.

**Q: What if I don't have Android NDK?**
A: You don't need it for learning! The host build works perfectly for fuzzing and includes all the same vulnerabilities.

**Q: Are there more bugs than documented?**
A: The 30 documented vulnerabilities are intentional. There may be unintentional bugs too!

**Q: Can I add more features?**
A: Absolutely! This is an educational tool. Adding new parsers or transformations is a great learning exercise.

---

## Contributing

This is an educational tool. Contributions that enhance its teaching value are welcome:

- Additional image format parsers
- More realistic vulnerability patterns
- Better documentation
- Improved fuzzing harness
- Example exploit PoCs (educational only)

Please ensure new vulnerabilities are discoverable through both static and dynamic analysis.

---

## License

This software is provided "as is" for educational purposes. Free to use for learning, training, and research.

**No warranty provided. Use at your own risk.**

---

## Disclaimer

This library contains intentional security vulnerabilities for educational purposes only. Never use this code or similar patterns in production software. The vulnerabilities are designed to be discoverable and exploitable in controlled environments for learning purposes.

The authors are not responsible for any misuse of this educational material.

---

## Resources

- **Build Instructions**: [BUILDING.md](BUILDING.md)
- **Vulnerability Reference**: [docs/VULNERABILITIES.md](docs/VULNERABILITIES.md) (trainers only)
- **API Documentation**: [include/libfrmg.h](include/libfrmg.h)
- **Fuzzing Harness**: [fuzzing/fuzzing_harness.c](fuzzing/fuzzing_harness.c)

---

## Contact & Support

For questions about using this training library:

- Review the documentation in this repository
- Check build instructions in BUILDING.md
- Examine example code in the fuzzing harness

**Remember**: The goal is to learn by doing. Finding bugs is part of the learning process!

---

Happy bug hunting! 🐛🔍
