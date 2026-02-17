#ifndef COMMAND_PARSER_LOGIC_H
#define COMMAND_PARSER_LOGIC_H

#include <stdint.h>
#include <stddef.h>

#define MAX_COMMAND_LEN 1024
#define MAX_ARGS 200
#define MAX_VARIABLES 200

// Structure for variables, declared here to be accessible by harness for reset
typedef struct {
    char *key;
    char *value;
    int active;
} Variable;

extern Variable variables[MAX_VARIABLES];
extern int var_count;

void initialize_parser_state(); // Function to reset variables state
int process_command(const char *input); // Main function to fuzz

#endif // COMMAND_PARSER_LOGIC_H
