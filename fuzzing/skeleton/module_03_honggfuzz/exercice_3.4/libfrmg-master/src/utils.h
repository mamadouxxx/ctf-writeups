/*
 * libfrmg - Internal Utility Functions
 */

#ifndef UTILS_H
#define UTILS_H

#include <stdint.h>
#include <stddef.h>
#include "../include/libfrmg.h"

/* Memory allocation with integer overflow vulnerability */
void* frmg_alloc_image_data(uint32_t width, uint32_t height, uint32_t channels);

/* Unsafe memory copy */
int frmg_copy_data(void *dest, const void *src, size_t dest_size, size_t src_size);

/* Byte reading functions */
uint32_t frmg_read_u32_le(const uint8_t *data, size_t offset, size_t max_size);
uint32_t frmg_read_u32_be(const uint8_t *data, size_t offset, size_t max_size);
uint16_t frmg_read_u16_le(const uint8_t *data, size_t offset, size_t max_size);
uint16_t frmg_read_u16_be(const uint8_t *data, size_t offset, size_t max_size);

/* Dimension validation (with vulnerabilities) */
int frmg_validate_dimensions(uint32_t width, uint32_t height, uint32_t channels);

#endif /* UTILS_H */
