#ifndef JSON_PARSER_LOGIC_H
#define JSON_PARSER_LOGIC_H

#include <stdint.h>
#include <stddef.h>

#define MAX_STRING_LEN 256
#define MAX_NESTING 1000

typedef enum {
    JSON_NULL,
    JSON_BOOL,
    JSON_NUMBER,
    JSON_STRING,
    JSON_ARRAY,
    JSON_OBJECT
} JsonType;

typedef struct JsonValue {
    JsonType type;
    union {
        int boolean;
        double number;
        char *string;
        struct {
            struct JsonValue **items;
            size_t count;
        } array;
        struct {
            char **keys;
            struct JsonValue **values;
            size_t count;
        } object;
    } data;
} JsonValue;

JsonValue *parse_value(const char **json, int depth);
void free_json_value(JsonValue *value);

#ifdef STANDALONE
void print_json_value(JsonValue *value, int indent);
#endif

#endif // JSON_PARSER_LOGIC_H
