# Name of the output executable
TARGET = server

# Compiler to use
CC = gcc

# Compiler flags (optional)
CFLAGS = -Wall -Wextra -Werror -pedantic
LDFLAGS = -lcrypto -lcjson

# Collect all .c files and convert them to .o files
SRC = $(wildcard *.c)
OBJ = $(SRC:.c=.o)

# Default rule to build the program
all: $(TARGET)

# Link all object files into the executable
$(TARGET): $(OBJ)
	$(CC) $(CFLAGS) -o $@ $(OBJ) $(LDFLAGS)

# Compile .c files into .o files
%.o: %.c
	$(CC) $(CFLAGS) -c $< -o $@

# Clean up generated files
clean:
	rm -f $(OBJ) $(EXEC) $(TARGET)
