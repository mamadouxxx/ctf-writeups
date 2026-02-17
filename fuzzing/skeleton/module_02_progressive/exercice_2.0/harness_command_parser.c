/*
 * Harness for Command Parser with Intentional Bugs
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdint.h>
#include "command_parser_logic.h" // Include the separated logic

// LibFuzzer entry point
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    // Ignore empty inputs or overly large inputs
    if (Size == 0 || Size > MAX_COMMAND_LEN - 1) { // -1 for null terminator
        return 0;
    }

    // Create null-terminated string
    char *input = (char *)malloc(Size + 1);
    if (input == NULL) {
        return 0; // Allocation failure, skip this input
    }

    memcpy(input, Data, Size);
    input[Size] = '\0';

    // Reset variables for each fuzzing iteration
    initialize_parser_state();

    // Process the command
    process_command(input);

    free(input);
    return 0;
}

// Optional: main function for standalone testing
#ifdef STANDALONE
int main(int argc, char **argv) {
    char buffer[MAX_COMMAND_LEN]; // Use defined MAX_COMMAND_LEN

    // Reset variables state for standalone mode
    initialize_parser_state();

    printf("Command Parser Test Program\n");
    printf("Type 'HELP' for available commands\n\n");

    while (1) {
        printf("> ");
        if (fgets(buffer, sizeof(buffer), stdin) == NULL) {
            break;
        }

        // Remove newline
        buffer[strcspn(buffer, "\n")] = '\0';

        if (!process_command(buffer)) {
            break;
        }
    }

    // Cleanup global variables
    initialize_parser_state(); // Call initialize_parser_state for cleanup as well

    return 0;
}
#endif
