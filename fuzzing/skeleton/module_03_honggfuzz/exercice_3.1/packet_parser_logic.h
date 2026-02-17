#ifndef PACKET_PARSER_LOGIC_H
#define PACKET_PARSER_LOGIC_H

#include <stdint.h>
#include <stddef.h>

// Structures
typedef struct {
    uint32_t magic;
    uint8_t version;
    uint8_t type;
    uint16_t length;
} __attribute__((packed)) packet_header_t;

typedef struct {
    uint32_t total_packets;
    uint32_t errors;
    uint32_t success_rate;
} __attribute__((packed)) stats_t;

typedef struct {
    packet_header_t header;
    char *payload;
    uint32_t checksum;
    int is_valid;
} parsed_packet_t;

// Global statistics (accessed by main, so extern)
extern uint32_t g_packet_count;
extern uint32_t g_error_count;

// Main function to parse a packet
int parse_packet(const uint8_t *data, size_t size);

// Function to reset global stats if needed for fuzzing (can be called by harness)
void reset_parser_stats();

#endif // PACKET_PARSER_LOGIC_H
