/*
 * Harness for Exercice 3.1 : Fuzzing d'un parser de paquets réseau avec honggfuzz
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>
#include <unistd.h>
#include "packet_parser_logic.h" // Include the separated logic

int main(void) {
    // printf("=== Packet Parser Fuzzing Target ===\n"); // Remove printf for fuzzing
    // printf("Reading packet from stdin...\n\n"); // Remove printf for fuzzing

    // Lire les données depuis stdin (mode honggfuzz standard)
    uint8_t buffer[4096];
    ssize_t size = read(STDIN_FILENO, buffer, sizeof(buffer));

    if (size <= 0) {
        // fprintf(stderr, "Failed to read data from stdin\n"); // Remove fprintf for fuzzing
        return 1;
    }

    // printf("Read %zd bytes from stdin\n", size); // Remove printf for fuzzing

    // Reset global stats for each fuzzing run
    reset_parser_stats();

    // Parser le paquet
    int result = parse_packet(buffer, size);

    // No need to print success/error messages in fuzzing harness
    // if (result == 0) {
    //     printf("\n[SUCCESS] Packet parsed successfully\n");
    // } else {
    //     printf("\n[ERROR] Failed to parse packet\n");
    // }

    // No need to print statistics in fuzzing harness
    // printf("\nStatistics:\n");
    // printf("  Total packets processed: %u\n", g_packet_count);
    // printf("  Errors: %u\n", g_error_count);

    return result;
}
