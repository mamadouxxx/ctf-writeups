/*
 * Harness for JSON Parser with Intentional Bugs
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>
#include "json_parser_logic.h" // Include the separated logic

// LibFuzzer entry point
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    // Ignore empty or too large inputs
    if (Size == 0 || Size > 65536) {
        return 0;
    }

    // Create null-terminated string
    char *json_string = malloc(Size + 1);
    if (json_string == NULL) {
        return 0;
    }

    memcpy(json_string, Data, Size);
    json_string[Size] = '\0';

    // Parse JSON
    const char *json_ptr = json_string;
    JsonValue *root = parse_value(&json_ptr, 0);

    // Clean up
    if (root != NULL) {
        free_json_value(root);
    }

    free(json_string);
    return 0;
}

// Optional: main function for standalone testing
#ifdef STANDALONE
int main(int argc, char **argv) {
    if (argc > 1) {
        // Read from file
        FILE *f = fopen(argv[1], "r");
        if (f == NULL) {
            fprintf(stderr, "Cannot open file: %s\n", argv[1]);
            return 1;
        }

        fseek(f, 0, SEEK_END);
        long size = ftell(f);
        fseek(f, 0, SEEK_SET);

        char *json_string = malloc(size + 1);
        fread(json_string, 1, size, f);
        json_string[size] = '\0';
        fclose(f);

        const char *json_ptr = json_string;
        JsonValue *root = parse_value(&json_ptr, 0);

        if (root != NULL) {
            printf("Parsed JSON:\n");
            print_json_value(root, 0);
            printf("\n");
            free_json_value(root);
        } else {
            printf("Failed to parse JSON\n");
        }

        free(json_string);
    } else {
        // Read from stdin
        char buffer[65536];
        size_t total = 0;

        while (!feof(stdin) && total < sizeof(buffer) - 1) {
            size_t read = fread(buffer + total, 1, sizeof(buffer) - total - 1, stdin);
            total += read;
        }
        buffer[total] = '\0';

        const char *json_ptr = buffer;
        JsonValue *root = parse_value(&json_ptr, 0);

        if (root != NULL) {
            printf("Parsed JSON:\n");
            print_json_value(root, 0);
            printf("\n");
            free_json_value(root);
        } else {
            printf("Failed to parse JSON\n");
        }
    }

    return 0;
}
#endif
