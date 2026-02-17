#include "packet_parser_logic.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <string.h>

#define MAGIC 0x504B5456  // "PKTV"
#define MAX_PAYLOAD_SIZE 1024
#define PACKET_TYPE_DATA 0x01
#define PACKET_TYPE_CONTROL 0x02
#define PACKET_TYPE_STATS 0x03

// Variables globales pour statistiques
uint32_t g_packet_count = 0;
uint32_t g_error_count = 0;

void reset_parser_stats() {
    g_packet_count = 0;
    g_error_count = 0;
}

// Fonction de calcul CRC32 simplifié
uint32_t calculate_crc32(const uint8_t *data, size_t length) {
    uint32_t crc = 0xFFFFFFFF;
    for (size_t i = 0; i < length; i++) {
        crc ^= data[i];
        for (int j = 0; j < 8; j++) {
            if (crc & 1) {
                crc = (crc >> 1) ^ 0xEDB88320;
            } else {
                crc >>= 1;
            }
        }
    }
    return ~crc;
}

// BUG 1 : Buffer overflow dans le parsing du payload
void parse_payload_v1(parsed_packet_t *packet, const uint8_t *data, size_t data_size) {
    char buffer[64];  // Buffer fixe de 64 bytes
    uint16_t payload_len = packet->header.length;

    // BUG : Pas de vérification de la taille !
    // Si payload_len > 64, buffer overflow
    if (payload_len < 64) { // Added for robustness, but the bug is still there
        memcpy(buffer, data, payload_len);  // VULNERABLE
        buffer[payload_len] = '\0';
    } else {
        memcpy(buffer, data, 63);
        buffer[63] = '\0';
    }

    // Allouer et copier le payload
    packet->payload = malloc(payload_len + 1);
    if (packet->payload) {
        memcpy(packet->payload, buffer, payload_len);
        packet->payload[payload_len] = '\0';
    }
}

// BUG 2 : Integer overflow dans le calcul de taille
void parse_payload_v2(parsed_packet_t *packet, const uint8_t *data, size_t data_size) {
    uint16_t payload_len = packet->header.length;
    uint16_t extra_size = 100;  // Taille extra pour metadata

    // BUG : Integer overflow possible
    // Si payload_len = 65436, alors total_size = 65436 + 100 = 65536 = 0 (overflow 16-bit)
    // Ou si on cast en 32-bit mais que le calcul se fait en 16-bit d'abord
    uint32_t total_size = payload_len + extra_size;  // VULNERABLE si overflow

    // Si total_size est petit à cause de l'overflow, malloc peut réussir avec une petite taille
    packet->payload = malloc(total_size);
    if (packet->payload) {
        // Mais ici on copie payload_len bytes (grande valeur)
        // Ensure not to read beyond data_size
        memcpy(packet->payload, data, payload_len > data_size ? data_size : payload_len);  // HEAP OVERFLOW
        packet->payload[payload_len > data_size ? data_size : payload_len] = '\0';
    }
}

// BUG 3 : Use-after-free dans la version 3
void parse_payload_v3(parsed_packet_t *packet, const uint8_t *data, size_t data_size) {
    uint16_t payload_len = packet->header.length;

    // Allouer le payload
    packet->payload = malloc(payload_len + 1);
    if (!packet->payload) {
        return;
    }

    memcpy(packet->payload, data, payload_len > data_size ? data_size : payload_len);
    packet->payload[payload_len > data_size ? data_size : payload_len] = '\0';

    // Vérification de "magic" dans le payload
    if (payload_len >= 4) {
        uint32_t payload_magic;
        memcpy(&payload_magic, packet->payload, sizeof(uint32_t)); // Copy to avoid potential unaligned access

        // Si le payload contient un magic spécial, on le "nettoie"
        if (payload_magic == 0xDEADBEEF) {
            free(packet->payload);  // Libération
            packet->payload = NULL;

            // Réallocation
            packet->payload = malloc(payload_len + 1);
            if (packet->payload) {
                memset(packet->payload, 0, payload_len + 1);
            }
        }

        // BUG : Use-after-free si magic == 0xDEADBEEF puis qu'on réutilise payload
        if (payload_magic == 0xDEADBEEF && payload_len > 4) {
            // On essaie d'accéder au payload qui a peut-être été free
            // (selon le timing et si malloc a réussi)
            char *ptr = packet->payload;
            // Utilisation potentielle de mémoire libérée
            for (int i = 0; i < 16 && i < payload_len; i++) {
                if (ptr) { // Add null check for robustness during fuzzing
                    ptr[i] = ptr[i] ^ 0xFF;  // VULNERABLE : use-after-free possible
                }
            }
        }
    }
}

// BUG 4 : Division par zéro dans les statistiques
void process_stats_packet(const uint8_t *data, size_t size) {
    if (size < sizeof(stats_t)) {
        return;
    }

    stats_t stats;
    memcpy(&stats, data, sizeof(stats_t));

    // BUG : Division par zéro si total_packets == 0
    uint32_t actual_success_rate = 0;
    if (stats.total_packets != 0) {
        actual_success_rate = ((stats.total_packets - stats.errors) * 100) / stats.total_packets;  // VULNERABLE
    }

    // Autre calcul avec division
    uint32_t ratio = 0;
    if (stats.success_rate > 0) {
        ratio = stats.total_packets / stats.success_rate;  // VULNERABLE si success_rate == 0
    }
}

// Parser principal
int parse_packet(const uint8_t *data, size_t size) {
    if (size < sizeof(packet_header_t)) {
        g_error_count++;
        return -1;
    }

    parsed_packet_t packet = {0};
    memcpy(&packet.header, data, sizeof(packet_header_t));

    // Vérifier le magic number
    if (packet.header.magic != MAGIC) {
        g_error_count++;
        return -1;
    }

    g_packet_count++;

    // Vérifier qu'il y a assez de données pour le payload
    size_t header_size = sizeof(packet_header_t);
    size_t remaining = size - header_size;

    // Basic check to prevent negative result if size < header_size
    if (size < header_size) {
        remaining = 0;
    }


    if (packet.header.length > remaining) {
        g_error_count++;
        return -1;
    }

    const uint8_t *payload_data = data + header_size;

    // Traitement selon le type de paquet
    switch (packet.header.type) {
        case PACKET_TYPE_DATA:
            // Parser selon la version (différentes implémentations avec bugs)
            switch (packet.header.version) {
                case 1:
                    parse_payload_v1(&packet, payload_data, remaining);
                    break;
                case 2:
                    parse_payload_v2(&packet, payload_data, remaining);
                    break;
                case 3:
                    parse_payload_v3(&packet, payload_data, remaining);
                    break;
                default:
                    g_error_count++;
                    return -1;
            }
            break;

        case PACKET_TYPE_CONTROL:
            // Simple pour cet exercice
            break;

        case PACKET_TYPE_STATS:
            process_stats_packet(payload_data, packet.header.length);
            break;

        default:
            g_error_count++;
            return -1;
    }

    // Nettoyage
    if (packet.payload) {
        free(packet.payload);
    }

    return 0;
}
