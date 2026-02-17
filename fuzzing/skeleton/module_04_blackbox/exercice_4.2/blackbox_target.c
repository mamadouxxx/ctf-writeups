#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_COMMAND_LEN 256
#define MAX_DATA_LEN 1024

// Command structure
typedef struct {
  char cmd_name[32];
  char *data;
  uint32_t data_len;
} Command;

// Function prototypes
void parse_command(const char *input, Command *cmd);
void process_data(Command *cmd);
void handle_special_command(Command *cmd);
void execute_command(Command *cmd);
void cleanup_command(Command *cmd);

/*
 * BUG 1: Buffer overflow vulnerability
 * If input length exceeds MAX_COMMAND_LEN, strcpy will overflow the buffer
 */
void parse_command(const char *input, Command *cmd) {
  char buffer[MAX_COMMAND_LEN];

  // VULNERABLE: No bounds checking on strcpy
  strcpy(buffer, input);

  // Parse command name (first word)
  char *token = strtok(buffer, " ");
  if (token != NULL) {
    strncpy(cmd->cmd_name, token, sizeof(cmd->cmd_name) - 1);
    cmd->cmd_name[sizeof(cmd->cmd_name) - 1] = '\0';

    // Get remaining data
    token = strtok(NULL, "");
    if (token != NULL) {
      cmd->data_len = strlen(token);
      cmd->data = malloc(cmd->data_len + 1);
      if (cmd->data) {
        strcpy(cmd->data, token);
      }
    } else {
      cmd->data = NULL;
      cmd->data_len = 0;
    }
  }
}

/*
 * BUG 2: Integer overflow leading to heap overflow
 * If data_len is manipulated, malloc size can overflow
 */
void process_data(Command *cmd) {
  if (cmd->data == NULL) {
    return;
  }

  // Check for special prefix that triggers processing
  if (strncmp(cmd->data, "PROC:", 5) == 0) {
    char *data_ptr = cmd->data + 5;
    uint32_t proc_len = atoi(data_ptr);

    // Find the actual data after length specification
    char *actual_data = strchr(data_ptr, ':');
    if (actual_data != NULL) {
      actual_data++; // Skip the ':'

      // BUG: Integer overflow vulnerability
      // If proc_len is very large, proc_len + 1 can wrap around
      uint32_t alloc_size = proc_len + 1;
      char *processed = malloc(alloc_size);

      if (processed) {
        // VULNERABLE: copies proc_len bytes into undersized buffer
        memcpy(processed, actual_data, proc_len);
        processed[proc_len] = '\0';

        // Process the data (dummy operation)
        for (uint32_t i = 0; i < proc_len && i < alloc_size; i++) {
          processed[i] ^= 0x42;
        }

        free(processed);
      }
    }
  }
}

/*
 * BUG 3: Use-after-free vulnerability
 * Double free can occur with specially crafted input
 */
void handle_special_command(Command *cmd) {
  if (strcmp(cmd->cmd_name, "SPECIAL") == 0) {
    if (cmd->data != NULL) {
      // Check for magic string
      if (strstr(cmd->data, "MAGIC123") != NULL) {
        // Free the data
        free(cmd->data);
        cmd->data = NULL;

        // Check for another pattern
        if (strstr(cmd->data, "TRIGGER") != NULL) {
          // BUG: Use-after-free - cmd->data was already freed
          printf("Special command executed: %s\n", cmd->data);
        }
      }
    }
  }
}

/*
 * BUG 4: Format string vulnerability (harder to find)
 * If command name matches specific pattern, format string bug is triggered
 */
void execute_command(Command *cmd) {
  if (strcmp(cmd->cmd_name, "ECHO") == 0) {
    if (cmd->data != NULL) {
      printf("Echo: %s\n", cmd->data);
    }
  } else if (strcmp(cmd->cmd_name, "DEBUG") == 0) {
    if (cmd->data != NULL) {
      // BUG: Format string vulnerability
      printf(cmd->data);
      printf("\n");
    }
  } else if (strcmp(cmd->cmd_name, "PROCESS") == 0) {
    process_data(cmd);
    printf("Data processed successfully\n");
  } else if (strcmp(cmd->cmd_name, "SPECIAL") == 0) {
    handle_special_command(cmd);
  } else {
    printf("Unknown command: %s\n", cmd->cmd_name);
  }
}

void cleanup_command(Command *cmd) {
  if (cmd->data != NULL) {
    free(cmd->data);
    cmd->data = NULL;
  }
}

int main(int argc, char *argv[]) {
  char input[2048];
  Command cmd;

  printf("Blackbox Command Processor v1.0\n");
  printf("Enter command: ");
  fflush(stdout);

  // Read input from stdin
  if (fgets(input, sizeof(input), stdin) == NULL) {
    fprintf(stderr, "Error reading input\n");
    return 1;
  }

  // Remove trailing newline
  size_t len = strlen(input);
  if (len > 0 && input[len - 1] == '\n') {
    input[len - 1] = '\0';
  }

  // Initialize command structure
  memset(&cmd, 0, sizeof(Command));

  // Parse and execute command
  parse_command(input, &cmd);
  execute_command(&cmd);
  cleanup_command(&cmd);

  printf("Command completed\n");
  return 0;
}
