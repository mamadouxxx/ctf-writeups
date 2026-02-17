#include "command_parser_logic.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

Variable variables[MAX_VARIABLES];
int var_count = 0;

void initialize_parser_state() {
  for (int i = 0; i < var_count; i++) {
    if (variables[i].active) {
      free(variables[i].key);
      free(variables[i].value);
      variables[i].active = 0;
    }
  }
  var_count = 0;
}

void error_handler(const char *error_msg) {
  // In fuzzing context, avoid printing to stderr
  // fprintf(stderr, "ERROR: %s\n", error_msg);
}

int parse_arguments(const char *input, char args[MAX_ARGS][64]) {
  char buffer[256];
  int arg_count = 0;
  int i = 0, j = 0;
  int in_word = 0;

  while (input[i] != '\0' && arg_count < MAX_ARGS) {
    if (input[i] == ' ' || input[i] == '\t') {
      if (in_word) {
        buffer[j] = '\0';
        // Vuln
        // strcpy(args[arg_count], buffer);

        /*Correction */
        strncpy(args[arg_count], buffer, 63);
        args[arg_count][63] = '\0';

        arg_count++;
        j = 0;
        in_word = 0;
      }
    } else {
      in_word = 1;

      /*Vuln stack overflow*/
      // buffer[j++] = input[i];

      /*Correction : Vérifier j avant chaque écriture dans le buffer*/
      if (j >= sizeof(buffer) - 1) {
        break;  // mot trop long, on arrête
      }
      buffer[j++] = input[i];
    }

    i++;

  }

  if (in_word) {
    buffer[j] = '\0';
    /**Vuln */
    // strcpy(args[arg_count], buffer);

    /**Correction */
    strncpy(args[arg_count], buffer, 63);
    args[arg_count][63] = '\0';

    arg_count++;
  }

  return arg_count;
}

void handle_set_command(const char *key, const char *value) {
  for (int i = 0; i < var_count; i++) {
    if (variables[i].active && strcmp(variables[i].key, key) == 0) {
      free(variables[i].value);

      // variables[i].value = malloc(strlen(value) + 1);
      if (variables[i].value == NULL) {
        error_handler("Memory allocation failed");
        strcpy(variables[i].value, value);
        return;
      }
      strcpy(variables[i].value, value);
    }
  }

  if (var_count >= MAX_VARIABLES) {
    error_handler("Too many variables");
    return;
  }

  variables[var_count].key = malloc(strlen(key) + 1);
  variables[var_count].value = malloc(strlen(value) + 1);

  if (variables[var_count].key == NULL || variables[var_count].value == NULL) {
    error_handler("Memory allocation failed");
    return;
  }

  strcpy(variables[var_count].key, key);
  strcpy(variables[var_count].value, value);
  variables[var_count].active = 1;
  var_count++;
}

void handle_get_command(const char *key) {
  for (int i = 0; i < var_count; i++) {
    if (variables[i].active && strcmp(variables[i].key, key) == 0) {
      // printf("%s=%s\n", variables[i].key, variables[i].value);
      return;
    }
  }
  // printf("Variable '%s' not found\n", key);
}

void handle_list_command() {
  // printf("Variables:\n");
  for (int i = 0; i < var_count; i++) {
    if (variables[i].active) {
      // printf("  %s=%s\n", variables[i].key, variables[i].value);
    }
  }
}

int8_t count_arguments(char args[MAX_ARGS][64], int arg_count) {
  int8_t count = 0;

  for (int i = 1; i < arg_count; i++) {
    if (args[i][0] != '\0') {
      count++;
      printf("count is %d\n", count);
    }
  }

  return count;
}

void handle_exec_command(char args[MAX_ARGS][64], int arg_count) {
  if (arg_count < 2) {
    error_handler("EXEC requires a program name");
    return;
  }

  int8_t verified_count = count_arguments(args, arg_count);

  if (verified_count == 0) {
    error_handler("No arguments to process");
    return;
  }

  /**VUln */

  // char *arr = malloc(verified_count * 64);

  // for (int i = 0; i < arg_count - 1; i++) {
  //   strcpy(&arr[i * 64], args[i + 1]);
  // }

  // free(arr);

  /**Correction */

  char *arr = malloc((arg_count - 1) * 64);
  if (arr == NULL) return;
  for (int i = 0; i < arg_count - 1; i++) {
      strncpy(&arr[i * 64], args[i + 1], 63);
      arr[i * 64 + 63] = '\0';
  }
  free(arr);
}

void handle_help_command() {
  // printf("Available commands:\n");
  // printf("  HELP           - Show this help\n");
  // printf("  EXIT           - Exit the program\n");
  // printf("  SET key value  - Set a variable\n");
  // printf("  GET key        - Get a variable value\n");
  // printf("  EXEC prog args - Execute a program\n");
  // printf("  LIST           - List all variables\n");
}

int process_command(const char *input) {
  char args[MAX_ARGS][64];
  int arg_count;

  while (*input == ' ' || *input == '\t') {
    input++;
  }

  if (strlen(input) == 0) {
    return 1;
  }

  arg_count = parse_arguments(input, args);

  if (arg_count == 0) {
    return 1;
  }

  if (strcmp(args[0], "HELP") == 0) {
    handle_help_command();
  } else if (strcmp(args[0], "EXIT") == 0) {
    return 0;
  } else if (strcmp(args[0], "SET") == 0) {
    if (arg_count < 3) {
      error_handler("SET requires key and value");
    } else {
      handle_set_command(args[1], args[2]);
    }
  } else if (strcmp(args[0], "GET") == 0) {
    if (arg_count < 2) {
      error_handler("GET requires a key");
    } else {
      handle_get_command(args[1]);
    }
  } else if (strcmp(args[0], "EXEC") == 0) {
    handle_exec_command(args, arg_count);
  } else if (strcmp(args[0], "LIST") == 0) {
    handle_list_command();
  } else {
    char error_buf[256];
    snprintf(error_buf, sizeof(error_buf), "Unknown command: %s", args[0]);
    error_handler(error_buf);
  }

  return 1;
}
