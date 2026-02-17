/*
 * libfrmg - EXIF Metadata Parser
 *
 * Exchangeable Image File Format (EXIF) metadata parser for JPEG files.
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "../include/libfrmg.h"
#include "utils.h"

/* EXIF Constants */
#define EXIF_MARKER 0xE1
#define EXIF_HEADER "Exif\0\0"
#define EXIF_HEADER_SIZE 6

/* TIFF/EXIF Byte Orders */
#define TIFF_LITTLE_ENDIAN 0x4949
#define TIFF_BIG_ENDIAN    0x4D4D
#define TIFF_MAGIC         42

/* EXIF IFD Types */
#define IFD_TYPE_BYTE      1
#define IFD_TYPE_ASCII     2
#define IFD_TYPE_SHORT     3
#define IFD_TYPE_LONG      4
#define IFD_TYPE_RATIONAL  5
#define IFD_TYPE_SBYTE     6
#define IFD_TYPE_UNDEFINED 7
#define IFD_TYPE_SSHORT    8
#define IFD_TYPE_SLONG     9
#define IFD_TYPE_SRATIONAL 10

/* Common EXIF Tags */
#define TAG_MAKE                    0x010F
#define TAG_MODEL                   0x0110
#define TAG_ORIENTATION             0x0112
#define TAG_X_RESOLUTION            0x011A
#define TAG_Y_RESOLUTION            0x011B
#define TAG_RESOLUTION_UNIT         0x0128
#define TAG_SOFTWARE                0x0131
#define TAG_DATETIME                0x0132
#define TAG_EXIF_IFD_POINTER        0x8769
#define TAG_GPS_IFD_POINTER         0x8825

/* EXIF-specific Tags */
#define TAG_EXPOSURE_TIME           0x829A
#define TAG_FNUMBER                 0x829D
#define TAG_ISO_SPEED               0x8827
#define TAG_DATETIME_ORIGINAL       0x9003
#define TAG_FOCAL_LENGTH            0x920A
#define TAG_FLASH                   0x9209
#define TAG_IMAGE_WIDTH             0xA002
#define TAG_IMAGE_HEIGHT            0xA003

/* GPS Tags */
#define TAG_GPS_LATITUDE_REF        0x0001
#define TAG_GPS_LATITUDE            0x0002
#define TAG_GPS_LONGITUDE_REF       0x0003
#define TAG_GPS_LONGITUDE           0x0004
#define TAG_GPS_ALTITUDE_REF        0x0005
#define TAG_GPS_ALTITUDE            0x0006

/* Maximum string length */
#define MAX_STRING_LENGTH 256

/*
 * EXIF IFD Entry
 */
typedef struct {
    uint16_t tag;
    uint16_t type;
    uint32_t count;
    uint32_t value_offset;
} exif_ifd_entry_t;

/*
 * Read with byte order
 */
static uint16_t read_u16_exif(const uint8_t *data, size_t offset, size_t size, int big_endian) {
    if (offset + 2 > size) {
        return 0;
    }
    if (big_endian) {
        return frmg_read_u16_be(data, offset, size);
    } else {
        return frmg_read_u16_le(data, offset, size);
    }
}

static uint32_t read_u32_exif(const uint8_t *data, size_t offset, size_t size, int big_endian) {
    if (offset + 4 > size) {
        return 0;
    }
    if (big_endian) {
        return frmg_read_u32_be(data, offset, size);
    } else {
        return frmg_read_u32_le(data, offset, size);
    }
}

/*
 * Get size of IFD data type
 */
static int get_exif_type_size(uint16_t type) {
    switch (type) {
        case IFD_TYPE_BYTE:
        case IFD_TYPE_ASCII:
        case IFD_TYPE_SBYTE:
        case IFD_TYPE_UNDEFINED:
            return 1;
        case IFD_TYPE_SHORT:
        case IFD_TYPE_SSHORT:
            return 2;
        case IFD_TYPE_LONG:
        case IFD_TYPE_SLONG:
            return 4;
        case IFD_TYPE_RATIONAL:
        case IFD_TYPE_SRATIONAL:
            return 8;
        default:
            return 0;
    }
}

/*
 * Read IFD entry value
 */
static uint32_t read_exif_value(const uint8_t *data, size_t size,
                                 const uint8_t *tiff_base,
                                 exif_ifd_entry_t *entry, int big_endian,
                                 int index) {
    int type_size = get_exif_type_size(entry->type);
    uint32_t total_size = type_size * entry->count;

    if (total_size <= 4) {
        /* Value stored inline */
        if (entry->type == IFD_TYPE_SHORT) {
            if (index == 0) {
                return big_endian ? (entry->value_offset >> 16) : (entry->value_offset & 0xFFFF);
            } else {
                return big_endian ? (entry->value_offset & 0xFFFF) : (entry->value_offset >> 16);
            }
        } else if (entry->type == IFD_TYPE_BYTE) {
            int shift = big_endian ? (24 - index * 8) : (index * 8);
            return (entry->value_offset >> shift) & 0xFF;
        } else {
            return entry->value_offset;
        }
    } else {
        /* Value stored at offset */
        size_t offset = (tiff_base - data) + entry->value_offset + (index * type_size);

        if (offset + type_size > size) {
            return 0;
        }

        if (entry->type == IFD_TYPE_SHORT || entry->type == IFD_TYPE_SSHORT) {
            return read_u16_exif(data, offset, size, big_endian);
        } else if (entry->type == IFD_TYPE_LONG || entry->type == IFD_TYPE_SLONG) {
            return read_u32_exif(data, offset, size, big_endian);
        } else if (entry->type == IFD_TYPE_BYTE || entry->type == IFD_TYPE_SBYTE) {
            return data[offset];
        }
    }

    return 0;
}

/*
 * Read rational value (two 32-bit integers: numerator/denominator)
 */
static void read_rational(const uint8_t *data, size_t size,
                          const uint8_t *tiff_base,
                          exif_ifd_entry_t *entry, int big_endian,
                          uint32_t *numerator, uint32_t *denominator) {
    size_t offset = (tiff_base - data) + entry->value_offset;

    if (offset + 8 > size) {
        *numerator = 0;
        *denominator = 1;
        return;
    }

    *numerator = read_u32_exif(data, offset, size, big_endian);
    *denominator = read_u32_exif(data, offset + 4, size, big_endian);
}

/*
 * Read ASCII string from EXIF data
 */
static int read_ascii_string(const uint8_t *data, size_t size,
                              const uint8_t *tiff_base,
                              exif_ifd_entry_t *entry,
                              char *output, size_t max_length) {
    uint32_t count = entry->count;
    if (count > max_length) {
        count = max_length;
    }

    if (count <= 4) {
        /* String stored inline */
        memcpy(output, &entry->value_offset, count);
        output[count - 1] = '\0';
    } else {
        /* String stored at offset */
        size_t offset = (tiff_base - data) + entry->value_offset;

        if (offset + count > size) {
            return -1;
        }

        memcpy(output, data + offset, count);
        output[count - 1] = '\0';
    }

    return 0;
}

/*
 * Process EXIF IFD entry
 */
static void process_exif_entry(const uint8_t *data, size_t size,
                               const uint8_t *tiff_base,
                               exif_ifd_entry_t *entry, int big_endian,
                               frmg_exif_data_t *exif) {
    char temp_str[MAX_STRING_LENGTH];
    uint32_t numerator, denominator;

    switch (entry->tag) {
        case TAG_MAKE:
            if (entry->type == IFD_TYPE_ASCII) {
                read_ascii_string(data, size, tiff_base, entry, temp_str, MAX_STRING_LENGTH);
                strncpy(exif->make, temp_str, sizeof(exif->make) - 1);
            }
            break;

        case TAG_MODEL:
            if (entry->type == IFD_TYPE_ASCII) {
                read_ascii_string(data, size, tiff_base, entry, temp_str, MAX_STRING_LENGTH);
                strncpy(exif->model, temp_str, sizeof(exif->model) - 1);
            }
            break;

        case TAG_ORIENTATION:
            exif->orientation = read_exif_value(data, size, tiff_base, entry, big_endian, 0);
            break;

        case TAG_SOFTWARE:
            if (entry->type == IFD_TYPE_ASCII) {
                read_ascii_string(data, size, tiff_base, entry, temp_str, MAX_STRING_LENGTH);
                strncpy(exif->software, temp_str, sizeof(exif->software) - 1);
            }
            break;

        case TAG_DATETIME:
            if (entry->type == IFD_TYPE_ASCII) {
                read_ascii_string(data, size, tiff_base, entry, temp_str, MAX_STRING_LENGTH);
                strncpy(exif->datetime, temp_str, sizeof(exif->datetime) - 1);
            }
            break;

        case TAG_DATETIME_ORIGINAL:
            if (entry->type == IFD_TYPE_ASCII) {
                read_ascii_string(data, size, tiff_base, entry, temp_str, MAX_STRING_LENGTH);
                strncpy(exif->datetime_original, temp_str, sizeof(exif->datetime_original) - 1);
            }
            break;

        case TAG_EXPOSURE_TIME:
            if (entry->type == IFD_TYPE_RATIONAL) {
                read_rational(data, size, tiff_base, entry, big_endian,
                            &numerator, &denominator);
                if (denominator != 0) {
                    exif->exposure_time = (float)numerator / (float)denominator;
                }
            }
            break;

        case TAG_FNUMBER:
            if (entry->type == IFD_TYPE_RATIONAL) {
                read_rational(data, size, tiff_base, entry, big_endian,
                            &numerator, &denominator);
                if (denominator != 0) {
                    exif->f_number = (float)numerator / (float)denominator;
                }
            }
            break;

        case TAG_ISO_SPEED:
            exif->iso_speed = read_exif_value(data, size, tiff_base, entry, big_endian, 0);
            break;

        case TAG_FOCAL_LENGTH:
            if (entry->type == IFD_TYPE_RATIONAL) {
                read_rational(data, size, tiff_base, entry, big_endian,
                            &numerator, &denominator);
                if (denominator != 0) {
                    exif->focal_length = (float)numerator / (float)denominator;
                }
            }
            break;

        case TAG_FLASH:
            exif->flash = read_exif_value(data, size, tiff_base, entry, big_endian, 0);
            break;

        default:
            /* Ignore unknown tags */
            break;
    }
}

/*
 * Parse EXIF IFD
 */
static frmg_error_t parse_exif_ifd(const uint8_t *data, size_t size,
                                   const uint8_t *tiff_base, uint32_t ifd_offset,
                                   int big_endian, frmg_exif_data_t *exif,
                                   int depth);

/*
 * Parse GPS IFD
 */
static void parse_gps_ifd(const uint8_t *data, size_t size,
                         const uint8_t *tiff_base, uint32_t ifd_offset,
                         int big_endian, frmg_exif_data_t *exif) {
    size_t offset = (tiff_base - data) + ifd_offset;

    if (offset + 2 > size) {
        return;
    }

    uint16_t num_entries = read_u16_exif(data, offset, size, big_endian);
    offset += 2;

    /* Parse GPS entries */
    for (uint16_t i = 0; i < num_entries && offset + 12 <= size; i++) {
        exif_ifd_entry_t entry;
        entry.tag = read_u16_exif(data, offset, size, big_endian);
        entry.type = read_u16_exif(data, offset + 2, size, big_endian);
        entry.count = read_u32_exif(data, offset + 4, size, big_endian);
        entry.value_offset = read_u32_exif(data, offset + 8, size, big_endian);

        /* Process GPS tags */
        switch (entry.tag) {
            case TAG_GPS_LATITUDE_REF:
                if (entry.type == IFD_TYPE_ASCII && entry.count >= 2) {
                    exif->gps_latitude_ref = (char)entry.value_offset;
                }
                break;

            case TAG_GPS_LONGITUDE_REF:
                if (entry.type == IFD_TYPE_ASCII && entry.count >= 2) {
                    exif->gps_longitude_ref = (char)entry.value_offset;
                }
                break;

            case TAG_GPS_ALTITUDE_REF:
                exif->gps_altitude_ref = read_exif_value(data, size, tiff_base, &entry, big_endian, 0);
                break;

            default:
                break;
        }

        offset += 12;
    }

    exif->has_gps = 1;
}

/*
 * Parse EXIF IFD with sub-IFD support
 */
static frmg_error_t parse_exif_ifd(const uint8_t *data, size_t size,
                                   const uint8_t *tiff_base, uint32_t ifd_offset,
                                   int big_endian, frmg_exif_data_t *exif,
                                   int depth) {
    /* Prevent infinite recursion */
    if (depth > 10) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    size_t offset = (tiff_base - data) + ifd_offset;

    if (offset + 2 > size) {
        return FRMG_ERROR_CORRUPT_DATA;
    }

    /* Read number of entries */
    uint16_t num_entries = read_u16_exif(data, offset, size, big_endian);
    offset += 2;

    /* Parse each entry */
    for (uint16_t i = 0; i < num_entries; i++) {
        if (offset + 12 > size) {
            return FRMG_ERROR_CORRUPT_DATA;
        }

        exif_ifd_entry_t entry;
        entry.tag = read_u16_exif(data, offset, size, big_endian);
        entry.type = read_u16_exif(data, offset + 2, size, big_endian);
        entry.count = read_u32_exif(data, offset + 4, size, big_endian);
        entry.value_offset = read_u32_exif(data, offset + 8, size, big_endian);

        /* Check for sub-IFD pointers */
        if (entry.tag == TAG_EXIF_IFD_POINTER) {
            uint32_t exif_offset = read_exif_value(data, size, tiff_base, &entry, big_endian, 0);
            parse_exif_ifd(data, size, tiff_base, exif_offset, big_endian, exif, depth + 1);
        } else if (entry.tag == TAG_GPS_IFD_POINTER) {
            uint32_t gps_offset = read_exif_value(data, size, tiff_base, &entry, big_endian, 0);
            parse_gps_ifd(data, size, tiff_base, gps_offset, big_endian, exif);
        } else {
            process_exif_entry(data, size, tiff_base, &entry, big_endian, exif);
        }

        offset += 12;
    }

    return FRMG_OK;
}

/*
 * Parse EXIF data from JPEG APP1 marker
 */
frmg_error_t frmg_parse_exif(const uint8_t *data, size_t size, frmg_exif_data_t *exif) {
    if (!data || !exif || size < EXIF_HEADER_SIZE + 8) {
        return FRMG_ERROR_NULL_POINTER;
    }

    /* Initialize EXIF structure */
    memset(exif, 0, sizeof(frmg_exif_data_t));

    /* Check EXIF header */
    if (memcmp(data, EXIF_HEADER, EXIF_HEADER_SIZE) != 0) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    const uint8_t *tiff_base = data + EXIF_HEADER_SIZE;
    size_t tiff_size = size - EXIF_HEADER_SIZE;

    /* Check TIFF byte order */
    uint16_t byte_order = frmg_read_u16_le(tiff_base, 0, tiff_size);
    int big_endian;

    if (byte_order == TIFF_LITTLE_ENDIAN) {
        big_endian = 0;
    } else if (byte_order == TIFF_BIG_ENDIAN) {
        big_endian = 1;
    } else {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Check TIFF magic */
    uint16_t magic = read_u16_exif(tiff_base, 2, tiff_size, big_endian);
    if (magic != TIFF_MAGIC) {
        return FRMG_ERROR_INVALID_FORMAT;
    }

    /* Read IFD offset */
    uint32_t ifd_offset = read_u32_exif(tiff_base, 4, tiff_size, big_endian);

    /* Parse IFD */
    return parse_exif_ifd(data, size, tiff_base, ifd_offset, big_endian, exif, 0);
}
