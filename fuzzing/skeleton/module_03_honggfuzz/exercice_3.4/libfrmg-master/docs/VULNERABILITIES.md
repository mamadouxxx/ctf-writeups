# Vulnerability Reference Guide

**⚠️ TRAINER USE ONLY - Contains solutions to training exercises**

This document provides detailed information about all intentional vulnerabilities in libfrmg for training purposes.

## Vulnerability Summary

| ID | File | Function | Type | Severity | Line |
|----|------|----------|------|----------|------|
| V1 | utils.c | frmg_alloc_image_data | Integer Overflow | High | ~17 |
| V2 | utils.c | frmg_copy_data | Weak Validation | Medium | ~31 |
| V3 | utils.c | frmg_validate_dimensions | Missing Upper Bound | Medium | ~94 |
| V4 | bmp_parser.c | parse_bmp_header | Stack Buffer Overflow | Critical | ~66 |
| V5 | bmp_parser.c | calculate_row_size | Integer Overflow | High | ~102 |
| V6 | bmp_parser.c | frmg_parse_bmp | Off-by-one | Medium | ~149 |
| V7 | png_parser.c | validate_chunk_crc | No CRC Validation | Medium | ~57 |
| V8 | png_parser.c | parse_ihdr | Missing Upper Bound | Medium | ~82 |
| V9 | png_parser.c | append_idat_data | Integer Overflow | High | ~102 |
| V10 | png_parser.c | decompress_image_data | Heap Buffer Overflow | Critical | ~155 |
| V11 | png_parser.c | frmg_parse_png | Missing Length Check | High | ~299 |
| V12 | jpeg_parser.c | find_next_marker | Logic Bug | Medium | ~41 |
| V13 | jpeg_parser.c | parse_dqt | Array Out-of-Bounds | Critical | ~93 |
| V14 | jpeg_parser.c | cleanup_parser_state | Use-After-Free | High | ~143 |
| V15 | jpeg_parser.c | decode_jpeg_image | Integer Overflow | High | ~164 |
| V16 | gif_parser.c | output_string | Stack Buffer Overflow | Critical | ~141 |
| V17 | gif_parser.c | output_string | Heap Buffer Overflow | High | ~156 |
| V18 | gif_parser.c | add_lzw_code | Integer Overflow | Medium | ~177 |
| V19 | gif_parser.c | read_data_subblocks | Unbounded Allocation | High | ~294 |
| V20 | tiff_parser.c | read_ifd_array | Array Bounds | Medium | ~213 |
| V21 | tiff_parser.c | parse_ifd_entry | Heap Overflow | High | ~287 |
| V22 | tiff_parser.c | assemble_image | Calculation Error | Critical | ~503 |
| V23 | exif_parser.c | read_exif_value | Bounds Check Bypass | Medium | ~153 |
| V24 | exif_parser.c | read_ascii_string | No Null Termination | Medium | ~204 |
| V25 | exif_parser.c | parse_exif_ifd | Recursion Limit Bypass | Medium | ~382 |
| V26 | exif_parser.c | parse_exif_ifd | Large Entry Count | High | ~397 |
| V27 | image_transform.c | frmg_resize_image | Integer Overflow | High | ~28 |
| V28 | image_transform.c | frmg_crop_image | Integer Overflow | High | ~287 |
| V29 | image_effects.c | frmg_blur_box | Kernel Size Validation | Medium | ~52 |
| V30 | image_effects.c | frmg_blur_gaussian | Unbounded Allocation | High | ~96 |

## Detailed Vulnerability Analysis

---

### V1: Integer Overflow in Image Data Allocation

**File:** `src/utils.c`
**Function:** `frmg_alloc_image_data`
**Line:** ~17
**Type:** Integer Overflow → Heap Buffer Overflow
**Severity:** High

#### Description
The function multiplies `width * height * channels` without overflow checking. For large dimensions, this wraps around to a small value.

#### Vulnerable Code
```c
void* frmg_alloc_image_data(uint32_t width, uint32_t height, uint32_t channels) {
    size_t size = width * height * channels;  // BUG: No overflow check
    void *ptr = malloc(size);
    return ptr;
}
```

#### Exploitation
- Set width = 0x10001, height = 0x10001, channels = 4
- Calculation: 0x10001 * 0x10001 * 4 = 0x40004...
- On 32-bit or with wrapping: results in small allocation
- Later writes will overflow the undersized buffer

#### Detection
- **Static Analysis:** Look for arithmetic operations without overflow checks
- **Fuzzing:** ASAN will detect heap overflow when writing to buffer
- **Ghidra:** Identify multiplication without validation in decompiled code

#### Fix
```c
// Check for overflow before multiplication
if (width > SIZE_MAX / height / channels) {
    return NULL;
}
size_t size = (size_t)width * height * channels;
```

---

### V2: Weak Bounds Checking in Memory Copy

**File:** `src/utils.c`
**Function:** `frmg_copy_data`
**Line:** ~31
**Type:** Logic Bug
**Severity:** Medium

#### Description
The function allows `src_size == dest_size` without accounting for potential overflow in `dest_size` calculation.

#### Vulnerable Code
```c
int frmg_copy_data(void *dest, const void *src, size_t dest_size, size_t src_size) {
    if (src_size > dest_size) {  // BUG: Should be >=
        return -1;
    }
    memcpy(dest, src, src_size);
    return 0;
}
```

#### Exploitation
If `dest_size` itself overflowed to a small value, this check passes but copy overflows.

---

### V3: Missing Upper Bound Validation

**File:** `src/utils.c`
**Function:** `frmg_validate_dimensions`
**Line:** ~94
**Type:** Missing Validation
**Severity:** Medium

#### Description
No maximum dimension check - allows values like 0xFFFFFFFF which cause overflows.

#### Vulnerable Code
```c
int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels) {
    if (width == 0 || height == 0) return 0;
    if (channels == 0 || channels > 4) return 0;
    // BUG: No upper bound checking
    return 1;
}
```

#### Fix
```c
#define MAX_DIMENSION 65535
if (width > MAX_DIMENSION || height > MAX_DIMENSION) return 0;
```

---

### V4: Stack Buffer Overflow in BMP Header Parsing

**File:** `src/bmp_parser.c`
**Function:** `parse_bmp_header`
**Line:** ~66
**Type:** Stack Buffer Overflow
**Severity:** Critical

#### Description
Fixed-size stack buffer (64 bytes) but copies `info_header_size` from file without validation.

#### Vulnerable Code
```c
static int parse_bmp_header(...) {
    uint8_t header_buf[64];  // Fixed size
    uint32_t info_header_size = frmg_read_u32_le(data, 14, size);
    // BUG: No check that info_header_size <= 64
    memcpy(header_buf, data + 14, info_header_size);  // Overflow!
    ...
}
```

#### Exploitation
1. Craft BMP with info_header_size = 1024
2. memcpy writes 1024 bytes to 64-byte buffer
3. Overwrites stack (return address, etc.)
4. Potential RCE on return

#### Detection
- **Static Analysis:** Fixed-size buffer with variable-length copy
- **Fuzzing:** ASAN detects stack overflow immediately
- **Ghidra:** Look for stack variables and memcpy patterns

---

### V5: Integer Overflow in BMP Row Size

**File:** `src/bmp_parser.c`
**Function:** `calculate_row_size`
**Line:** ~102
**Type:** Integer Overflow
**Severity:** High

#### Vulnerable Code
```c
static size_t calculate_row_size(uint32_t width, uint16_t bit_count) {
    size_t bits_per_row = (size_t)width * (size_t)bit_count;
    size_t bytes_per_row = (bits_per_row + 7) / 8;
    return (bytes_per_row + 3) & ~3;  // Can overflow
}
```

---

### V6: Off-by-One in Data Offset Check

**File:** `src/bmp_parser.c`
**Function:** `frmg_parse_bmp`
**Line:** ~149
**Type:** Off-by-one Error
**Severity:** Medium

#### Vulnerable Code
```c
if (file_header.data_offset > size) {  // BUG: Should be >=
    return FRMG_ERROR_CORRUPT_DATA;
}
```

Allows `data_offset == size`, leading to out-of-bounds read.

---

### V7: Missing CRC Validation in PNG

**File:** `src/png_parser.c`
**Function:** `validate_chunk_crc`
**Line:** ~57
**Type:** Missing Validation
**Severity:** Medium

#### Description
PNG chunks have CRC32 checksums, but this function doesn't validate them.

#### Vulnerable Code
```c
static int validate_chunk_crc(...) {
    // BUG: Should compute and validate CRC32
    return 1;  // Always return success
}
```

Allows corrupt/malicious chunks to be processed.

---

### V8: No Upper Bound on PNG Dimensions

**File:** `src/png_parser.c`
**Function:** `parse_ihdr`
**Line:** ~82
**Type:** Missing Validation
**Severity:** Medium

Similar to V3 - allows huge dimensions causing overflow.

---

### V9: Integer Overflow in IDAT Accumulation

**File:** `src/png_parser.c`
**Function:** `append_idat_data`
**Line:** ~102
**Type:** Integer Overflow
**Severity:** High

#### Vulnerable Code
```c
static int append_idat_data(...) {
    size_t new_size = state->idat_size + length;  // Can overflow
    ...
}
```

Multiple IDAT chunks can be added, causing `new_size` to wrap.

---

### V10: Heap Buffer Overflow in PNG Decompression

**File:** `src/png_parser.c`
**Function:** `decompress_image_data`
**Line:** ~155
**Type:** Heap Buffer Overflow
**Severity:** Critical

#### Description
Uses vulnerable allocation (V1) then writes without bounds checking.

#### Vulnerable Code
```c
size_t row_size = ihdr->width * bytes_per_pixel;  // Can overflow
size_t uncompressed_size = (row_size + 1) * ihdr->height;  // Can overflow

uint8_t *uncompressed = malloc(uncompressed_size);

image->data = frmg_alloc_image_data(...);  // Undersized if overflow

for (...) {
    memcpy(image->data + y * row_size, ...);  // Overflow!
}
```

#### Exploitation
1. Craft PNG with huge width/height
2. Integer overflow makes `image->data` small
3. memcpy writes full uncompressed data
4. Heap corruption → potential RCE

---

### V11: Missing Chunk Length Validation

**File:** `src/png_parser.c`
**Function:** `frmg_parse_png`
**Line:** ~299
**Type:** Missing Validation
**Severity:** High

#### Vulnerable Code
```c
if (parse_chunk_header(data, offset, size, &length, &type) < 0) {
    break;
}
offset += PNG_CHUNK_HEADER_SIZE;
// BUG: No check that offset + length <= size
const uint8_t *chunk_data = data + offset;  // Can point past end
```

Malicious PNG can specify huge `length`, causing out-of-bounds read.

---

### V12: Logic Bug in JPEG Marker Finding

**File:** `src/jpeg_parser.c`
**Function:** `find_next_marker`
**Line:** ~41
**Type:** Logic Bug / Out-of-bounds Read
**Severity:** Medium

#### Vulnerable Code
```c
static int find_next_marker(...) {
    while (*offset < size) {  // BUG: Should be < size - 1
        if (data[*offset] == JPEG_MARKER_PREFIX) {
            (*offset)++;
            // BUG: Doesn't check if we're at end before reading
            uint8_t m = data[*offset];  // Can read past end
            ...
        }
    }
}
```

---

### V13: Array Out-of-Bounds in Quantization Table

**File:** `src/jpeg_parser.c`
**Function:** `parse_dqt`
**Line:** ~93
**Type:** Array Out-of-bounds Write
**Severity:** Critical

#### Vulnerable Code
```c
uint8_t table_id = table_info & 0x0F;
// BUG: No check that table_id < MAX_QUANT_TABLES (4)

for (int i = 0; i < 64; i++) {
    state->quant_tables[table_id][i] = ...;  // Overflow if table_id >= 4
}
```

#### Exploitation
Set `table_id = 7` in JPEG → writes to `quant_tables[7]` (out of bounds)

---

### V14: Use-After-Free in JPEG Cleanup

**File:** `src/jpeg_parser.c`
**Function:** `cleanup_parser_state`
**Line:** ~143
**Type:** Use-After-Free
**Severity:** High

#### Vulnerable Code
```c
static void cleanup_parser_state(jpeg_parser_state_t *state) {
    if (state->scan_data) {
        free(state->scan_data);
        // BUG: Doesn't set to NULL
    }
}

// Later in error path:
error = decode_jpeg_image(&state, image);  // Can fail
cleanup_parser_state(&state);
// BUG: scan_data now dangling pointer, could be accessed
```

#### Exploitation
1. Trigger error after scan_data allocation
2. cleanup_parser_state frees it
3. If any code path accesses state->scan_data again → use-after-free

---

### V15: Integer Overflow in JPEG Decoding

**File:** `src/jpeg_parser.c`
**Function:** `decode_jpeg_image`
**Line:** ~164
**Type:** Integer Overflow
**Severity:** High

Similar to V1 - uses vulnerable allocation with JPEG dimensions.

---

### V16: Stack Buffer Overflow in LZW Dictionary

**File:** `src/gif_parser.c`
**Function:** `output_string`
**Line:** ~141
**Type:** Stack Buffer Overflow
**Severity:** Critical

#### Description
Fixed-size stack buffer for LZW string reconstruction without bounds checking.

#### Vulnerable Code
```c
static int output_string(lzw_decoder_t *decoder, uint16_t code) {
    uint8_t stack[MAX_LZW_CODE];  // Fixed size: 4096 bytes
    int stack_pos = 0;

    uint16_t current = code;
    while (current < MAX_LZW_CODE) {
        stack[stack_pos++] = decoder->append_char[current];  // No bounds check on stack_pos
        if (decoder->prefix_code[current] == 0xFFFF) break;
        current = decoder->prefix_code[current];
    }
    ...
}
```

#### Exploitation
1. Craft malicious GIF with circular LZW dictionary references
2. Loop continues beyond MAX_LZW_CODE iterations
3. stack_pos exceeds 4096, writing past stack buffer
4. Stack corruption leads to control flow hijack

#### Detection
- **Fuzzing:** ASAN detects stack overflow immediately
- **Static Analysis:** Fixed buffer with unbounded increment

---

### V17: Heap Buffer Overflow in LZW Output

**File:** `src/gif_parser.c`
**Function:** `output_string`
**Line:** ~156
**Type:** Heap Buffer Overflow
**Severity:** High

#### Description
Output to heap buffer checked only within loop - insufficient validation.

#### Vulnerable Code
```c
for (int i = stack_pos - 1; i >= 0; i--) {
    if (decoder->output_pos < decoder->output_size) {  // Check per byte
        decoder->output[decoder->output_pos++] = stack[i];
    }
}
```

#### Exploitation
If output_size itself resulted from integer overflow, writes continue past actual buffer size.

---

### V18: Integer Overflow in LZW String Length

**File:** `src/gif_parser.c`
**Function:** `add_lzw_code`
**Line:** ~177
**Type:** Integer Overflow
**Severity:** Medium

#### Vulnerable Code
```c
uint16_t prefix_len = decoder->prefix_len[prefix];
decoder->prefix_len[decoder->table_size] = prefix_len + 1;  // Can overflow uint16_t
```

#### Exploitation
After 65535 additions, length wraps to 0, causing logic errors in decompression.

---

### V19: Unbounded Memory Allocation

**File:** `src/gif_parser.c`
**Function:** `read_data_subblocks`
**Line:** ~294
**Type:** Unbounded Allocation / Resource Exhaustion
**Severity:** High

#### Vulnerable Code
```c
*output = (uint8_t*)malloc(total_size);  // No size limit check
```

#### Exploitation
Malicious GIF with many large data sub-blocks causes massive allocation, potentially exhausting memory.

---

### V20: Insufficient Array Bounds Checking

**File:** `src/tiff_parser.c`
**Function:** `read_ifd_array`
**Line:** ~213
**Type:** Array Out-of-bounds
**Severity:** Medium

#### Vulnerable Code
```c
uint32_t count = entry->count;
if (count > max_count) {
    count = max_count;  // Truncates but doesn't fail
}
for (uint32_t i = 0; i < count; i++) {
    output[i] = read_ifd_value(...);  // Can exceed actual output buffer size
}
```

#### Exploitation
If max_count is larger than actual output array, writes out of bounds.

---

### V21: Heap Overflow in TIFF Colormap

**File:** `src/tiff_parser.c`
**Function:** `parse_ifd_entry` (TAG_COLOR_MAP case)
**Line:** ~287
**Type:** Heap Buffer Overflow
**Severity:** High

#### Vulnerable Code
```c
state->colormap = (uint16_t*)malloc(entry->count * sizeof(uint16_t));
// No validation of entry->count
for (uint32_t i = 0; i < entry->count && offset + 2 <= size; i++) {
    state->colormap[i] = read_u16(...);  // Potential overflow
}
```

#### Exploitation
Malicious TIFF with huge colormap count but validation on file offset allows writing beyond allocated buffer.

---

### V22: Memory Corruption in TIFF Strip Assembly

**File:** `src/tiff_parser.c`
**Function:** `assemble_image`
**Line:** ~503
**Type:** Heap Buffer Overflow
**Severity:** Critical

#### Description
Insufficient validation of strip calculations can lead to out-of-bounds writes.

#### Vulnerable Code
```c
size_t bytes_per_row = state->width * channels * (state->bits_per_sample / 8);
// Potential integer overflow in calculation

size_t dest_offset = current_row * bytes_per_row;  // Can overflow
memcpy(image->data + dest_offset, strip_data, strip_decompressed_size);
```

#### Exploitation
1. Craft TIFF with large width/channels causing overflow in bytes_per_row
2. dest_offset wraps to small value
3. memcpy writes to wrong location, corrupting heap

---

### V23: Bounds Check Bypass in EXIF Value Reading

**File:** `src/exif_parser.c`
**Function:** `read_exif_value`
**Line:** ~153
**Type:** Out-of-bounds Read
**Severity:** Medium

#### Vulnerable Code
```c
size_t offset = (tiff_base - data) + entry->value_offset + (index * type_size);
if (offset + type_size > size) {  // Check can be bypassed
    return 0;
}
```

#### Exploitation
Pointer arithmetic can overflow, bypassing the size check and reading out of bounds.

---

### V24: Missing Null Termination in EXIF Strings

**File:** `src/exif_parser.c`
**Function:** `read_ascii_string`
**Line:** ~204
**Type:** Missing Null Termination
**Severity:** Medium

#### Vulnerable Code
```c
memcpy(output, &entry->value_offset, count);
output[count - 1] = '\0';  // Assumes count > 0
```

#### Exploitation
If count is 0, writes at output[-1], or if string doesn't contain null, truncation is incorrect.

---

### V25: Recursion Depth Limit Bypass

**File:** `src/exif_parser.c`
**Function:** `parse_exif_ifd`
**Line:** ~382
**Type:** Stack Exhaustion
**Severity:** Medium

#### Vulnerable Code
```c
if (depth > 10) {  // Arbitrary limit
    return FRMG_ERROR_CORRUPT_DATA;
}
```

#### Exploitation
While limit exists, carefully crafted EXIF can still exhaust stack with deep recursion before hitting limit.

---

### V26: Large IFD Entry Count

**File:** `src/exif_parser.c`
**Function:** `parse_exif_ifd`
**Line:** ~397
**Type:** Resource Exhaustion
**Severity:** High

#### Vulnerable Code
```c
uint16_t num_entries = read_u16_exif(data, offset, size, big_endian);
for (uint16_t i = 0; i < num_entries; i++) {  // No limit on num_entries
    // Process entry - can take arbitrary time
}
```

#### Exploitation
Malicious EXIF with 65535 entries causes excessive processing time and memory usage.

---

### V27: Integer Overflow in Image Resize

**File:** `src/image_transform.c`
**Function:** `frmg_resize_image`
**Line:** ~28
**Type:** Integer Overflow → Heap Overflow
**Severity:** High

#### Description
Uses vulnerable allocation function without additional validation.

#### Vulnerable Code
```c
dst->data = (uint8_t*)frmg_alloc_image_data(new_width, new_height, src->channels);
// new_width * new_height * channels can overflow
dst->data_size = new_width * new_height * src->channels;  // Also overflows
```

#### Exploitation
Same pattern as V1 - large dimensions cause small allocation, subsequent writes overflow.

---

### V28: Integer Overflow in Crop Bounds

**File:** `src/image_transform.c`
**Function:** `frmg_crop_image`
**Line:** ~287
**Type:** Integer Overflow
**Severity:** High

#### Vulnerable Code
```c
if (x + width > src->width) {  // Addition can overflow
    width = src->width - x;
}
```

#### Exploitation
If x + width overflows uint32_t, comparison fails and invalid crop rectangle is used.

---

### V29: Insufficient Kernel Size Validation

**File:** `src/image_effects.c`
**Function:** `frmg_blur_box`
**Line:** ~52
**Type:** Out-of-bounds Access
**Severity:** Medium

#### Vulnerable Code
```c
for (int ky = -radius; ky <= radius; ky++) {
    for (int kx = -radius; kx <= radius; kx++) {
        int nx = (int)x + kx;
        int ny = (int)y + ky;
        // Bounds checked but large radius causes many edge checks
    }
}
```

#### Exploitation
Extremely large radius values cause performance degradation and potential integer issues in calculations.

---

### V30: Unbounded Kernel Allocation

**File:** `src/image_effects.c`
**Function:** `frmg_blur_gaussian`
**Line:** ~96
**Type:** Unbounded Allocation
**Severity:** High

#### Vulnerable Code
```c
int radius = (int)(sigma * 3.0f);  // No upper limit on sigma
int kernel_size = radius * 2 + 1;
float *kernel = (float*)malloc(kernel_size * kernel_size * sizeof(float));
// kernel_size² can be huge
```

#### Exploitation
Passing large sigma value causes massive allocation (e.g., sigma=10000 → kernel_size=60001 → ~14GB allocation).

---

## Fuzzing Tips

### Seed Corpus Creation

Create minimal valid files for each format:

**Minimal BMP (54 bytes)**
```python
# 1x1 pixel BMP
bmp = bytes([
    0x42, 0x4D,              # "BM"
    0x36, 0x00, 0x00, 0x00,  # File size
    0x00, 0x00, 0x00, 0x00,  # Reserved
    0x36, 0x00, 0x00, 0x00,  # Data offset
    0x28, 0x00, 0x00, 0x00,  # Info header size
    0x01, 0x00, 0x00, 0x00,  # Width
    0x01, 0x00, 0x00, 0x00,  # Height
    0x01, 0x00,              # Planes
    0x18, 0x00,              # Bit count (24)
    # ... rest of header and pixel data
])
```

**Minimal PNG** - Use standard PNG tools to create 1x1 PNG

**Minimal JPEG** - Use standard JPEG tools to create 1x1 JPEG

**Minimal GIF** - Use standard GIF tools to create 1x1 GIF

**Minimal TIFF** - Use standard TIFF tools to create 1x1 TIFF

### Mutation Strategies

Focus fuzzing on:
1. Dimension fields (width, height)
2. Size/length fields
3. Array indices (table_id, color map indices, etc.)
4. Chunk/segment lengths
5. Header size fields
6. IFD entry counts and offsets
7. LZW code values and dictionary entries
8. Recursion-inducing structures (EXIF sub-IFDs)
9. Image transformation parameters (crop bounds, resize dimensions)
10. Effect parameters (kernel sizes, sigma values)

### Expected Crashes

With ASAN enabled, you should find:
- Multiple heap buffer overflows
- At least one stack buffer overflow
- Integer overflow crashes
- Use-after-free detection

## Mapping Crashes to Vulnerabilities

| ASAN Error Type | Likely Vulnerability |
|-----------------|---------------------|
| heap-buffer-overflow (write) | V1, V10, V15, V17, V21, V22, V27 |
| stack-buffer-overflow | V4, V16 |
| heap-use-after-free | V14 |
| allocation-size-too-big | V1, V5, V9, V19, V30 |
| stack-overflow (recursion) | V25 |
| integer-overflow | V5, V9, V18, V27, V28 |

## Training Exercise Solutions

### Exercise 1: Static Analysis

Trainees should identify at least:
- V4 (obvious stack overflow)
- V1 (integer overflow in allocation)
- V13 (array index validation missing)

Advanced trainees should find:
- V14 (use-after-free)
- V9, V10 (integer overflow chain)

### Exercise 2: Fuzzing

Within 1 hour of fuzzing, should discover:
- Heap overflows (V1, V10, V15)
- Stack overflow (V4)

### Exercise 3: Hybrid

Combining both approaches should reveal all vulnerabilities.

## Format-Specific Vulnerability Summary

### BMP Parser
- Stack overflow in header parsing (V4)
- Integer overflows in size calculations (V5, V1)
- Off-by-one errors (V6)

### PNG Parser
- Missing CRC validation (V7)
- Integer overflows in IDAT handling (V9)
- Heap overflow in decompression (V10)
- Missing length validation (V11)

### JPEG Parser
- Logic bugs in marker parsing (V12)
- Array out-of-bounds in quantization tables (V13)
- Use-after-free in cleanup (V14)
- Integer overflow in allocation (V15)

### GIF Parser
- Stack overflow in LZW decoding (V16)
- Heap overflow in LZW output (V17)
- Integer overflow in string length (V18)
- Unbounded memory allocation (V19)

### TIFF Parser
- Array bounds issues in IFD reading (V20)
- Heap overflow in colormap (V21)
- Memory corruption in strip assembly (V22)

### EXIF Parser
- Bounds check bypass (V23)
- Missing null termination (V24)
- Recursion limit bypass (V25)
- Large entry count DoS (V26)

### Image Transformations
- Integer overflows in resize (V27)
- Integer overflows in crop (V28)

### Image Effects
- Insufficient kernel validation (V29)
- Unbounded kernel allocation (V30)

## Vulnerability Chains

Some vulnerabilities can be chained for more complex exploitation:

1. **V1 → V10**: Integer overflow in allocation followed by heap overflow in write
2. **V9 → V10**: IDAT overflow leading to decompression overflow
3. **V27 → Effects**: Resize overflow creating malformed image for effects processing
4. **V22 + V21**: TIFF IFD manipulation combined with colormap overflow

## Conclusion

This library provides a realistic training environment with 30 intentional vulnerabilities covering common patterns found in image parsers and file format handlers. The bugs range from obvious (V4, V16) to subtle (V14, V25), providing challenges for different skill levels.

The expanded codebase (~3000 additional lines) significantly increases the attack surface and provides more opportunities for students to practice:
- Static analysis with complex parsers (GIF LZW, TIFF IFD structures)
- Dynamic fuzzing with new file formats
- Vulnerability chaining across multiple components
- Real-world exploitation scenarios
