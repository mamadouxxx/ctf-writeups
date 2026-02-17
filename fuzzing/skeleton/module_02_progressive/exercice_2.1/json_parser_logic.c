#include "json_parser_logic.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// Forward declarations
JsonValue *parse_value_internal(const char **json, int depth);

/*
 * Skip whitespace in JSON
 */
void skip_whitespace(const char **json) {
    while (**json == ' ' || **json == '\t' || **json == '\n' || **json == '\r') {
        (*json)++;
    }
}

/*
 * BUG 2: Heap Buffer Overflow in parse_string
 * The function doesn't properly handle escaped characters and long strings
 */
char *parse_string(const char **json) {
    if (**json != '"') {
        return NULL;
    }
    (*json)++; // Skip opening quote

    char buffer[MAX_STRING_LEN];
    int i = 0;

    while (**json != '"' && **json != '\0') {
        if (**json == '\\') {
            (*json)++;
            // Handle escape sequences
            switch (**json) {
                case 'n': buffer[i++] = '\n'; break;
                case 't': buffer[i++] = '\t'; break;
                case 'r': buffer[i++] = '\r'; break;
                case '"': buffer[i++] = '"'; break;
                case '\\': buffer[i++] = '\\'; break;
                default:
                    // BUG 2: No bounds checking, can overflow buffer
                    buffer[i++] = **json;
                    break;
            }
            (*json)++;
        } else {
            // VULNERABLE: No check if i >= MAX_STRING_LEN
            // A very long string will overflow the buffer
            buffer[i++] = **json;
            (*json)++;
        }
    }

    if (**json != '"') {
        return NULL; // Unterminated string
    }
    (*json)++; // Skip closing quote

    buffer[i] = '\0';

    // Allocate and copy
    char *result = malloc(i + 1);
    if (result == NULL) {
        return NULL;
    }
    strcpy(result, buffer);
    return result;
}

/*
 * Parse a JSON number
 */
double parse_number(const char **json) {
    char *end;
    double value = strtod(*json, &end);
    *json = end;
    return value;
}

/*
 * BUG 3: Integer Overflow in parse_array
 * Array size calculation can overflow
 */
JsonValue *parse_array(const char **json, int depth) {
    // BUG 1: Stack overflow risk - no real depth check
    // Each recursive call adds to stack, deep nesting causes overflow
    if (depth > MAX_NESTING) {
        return NULL; // This check is useless if MAX_NESTING is too high
    }

    if (**json != '[') {
        return NULL;
    }
    (*json)++;

    JsonValue *array = malloc(sizeof(JsonValue));
    if (array == NULL) {
        return NULL;
    }

    array->type = JSON_ARRAY;
    array->data.array.items = NULL;
    array->data.array.count = 0;

    skip_whitespace(json);

    // Empty array
    if (**json == ']') {
        (*json)++;
        array->data.array.items = NULL;
        array->data.array.count = 0;
        return array;
    }

    // Count items first (vulnerable approach)
    const char *temp = *json;
    uint16_t count = 0;  // BUG 3: uint16_t can only hold up to 65535

    // Count commas to estimate size
    while (*temp != ']' && *temp != '\0') {
        if (*temp == ',') {
            count++;  // VULNERABLE: Can overflow after 65535
        }
        temp++;
    }
    count++;  // One more item than commas

    // BUG 3: If count overflowed, this allocation will be too small
    size_t alloc_size = count * sizeof(JsonValue*);
    array->data.array.items = malloc(alloc_size);

    if (array->data.array.items == NULL) {
        // BUG 5: Memory leak - array is not freed
        free(array); // Fix: Free array if items allocation fails
        return NULL;
    }

    // Parse array elements
    size_t index = 0;
    while (1) {
        skip_whitespace(json);

        JsonValue *item = parse_value_internal(json, depth + 1);
        if (item == NULL) {
            // BUG 5: Memory leak - previously parsed items not freed
            // Fix: Free allocated items and array itself
            for (size_t i = 0; i < index; i++) {
                free_json_value(array->data.array.items[i]);
            }
            free(array->data.array.items);
            free(array);
            return NULL;
        }

        // BUG 3: If count overflowed, this can write out of bounds
        if (index < count) { // Added bounds check for robustness during fuzzing
            array->data.array.items[index++] = item;
        } else {
            free_json_value(item); // Free item if out of bounds
            for (size_t i = 0; i < index; i++) {
                free_json_value(array->data.array.items[i]);
            }
            free(array->data.array.items);
            free(array);
            return NULL;
        }

        skip_whitespace(json);

        if (**json == ']') {
            (*json)++;
            break;
        }

        if (**json == ',') {
            (*json)++;
        } else {
            // Malformed array
            // BUG 5: Memory leak
            for (size_t i = 0; i < index; i++) {
                free_json_value(array->data.array.items[i]);
            }
            free(array->data.array.items);
            free(array);
            return NULL;
        }
    }

    array->data.array.count = index;
    return array;
}

/*
 * BUG 4: NULL Pointer Dereference in parse_object
 */
JsonValue *parse_object(const char **json, int depth) {
    // BUG 1: Same stack overflow issue as parse_array
    if (depth > MAX_NESTING) {
        return NULL;
    }

    if (**json != '{') {
        return NULL;
    }
    (*json)++;

    JsonValue *object = malloc(sizeof(JsonValue));
    if (object == NULL) {
        return NULL;
    }

    object->type = JSON_OBJECT;
    object->data.object.keys = NULL;
    object->data.object.values = NULL;
    object->data.object.count = 0;

    skip_whitespace(json);

    // Empty object
    if (**json == '}') {
        (*json)++;
        return object;
    }

    // Allocate initial space
    size_t capacity = 10;
    object->data.object.keys = malloc(capacity * sizeof(char*));
    object->data.object.values = malloc(capacity * sizeof(JsonValue*));

    if (object->data.object.keys == NULL || object->data.object.values == NULL) {
        // BUG 5: Memory leak
        free(object->data.object.keys); // Free if one fails
        free(object->data.object.values); // Free if one fails
        free(object);
        return NULL;
    }

    size_t count = 0;

    while (1) {
        skip_whitespace(json);

        // Parse key
        char *key = parse_string(json);
        // BUG 4: If parse_string returns NULL, we continue using it
        // This causes NULL pointer dereference below
        if (key == NULL) {
            // Fix: Clean up and return
            for (size_t i = 0; i < count; i++) {
                free(object->data.object.keys[i]);
                free_json_value(object->data.object.values[i]);
            }
            free(object->data.object.keys);
            free(object->data.object.values);
            free(object);
            return NULL;
        }


        skip_whitespace(json);

        if (**json != ':') {
            // Malformed object - expected colon
            // BUG 5: Memory leak
            free(key); // Free the key
            for (size_t i = 0; i < count; i++) {
                free(object->data.object.keys[i]);
                free_json_value(object->data.object.values[i]);
            }
            free(object->data.object.keys);
            free(object->data.object.values);
            free(object);
            return NULL;
        }
        (*json)++;

        skip_whitespace(json);

        // Parse value
        JsonValue *value = parse_value_internal(json, depth + 1);
        // BUG 4: If value is NULL, we still try to use it
        if (value == NULL) {
            // Fix: Clean up and return
            free(key);
            for (size_t i = 0; i < count; i++) {
                free(object->data.object.keys[i]);
                free_json_value(object->data.object.values[i]);
            }
            free(object->data.object.keys);
            free(object->data.object.values);
            free(object);
            return NULL;
        }


        // Expand if needed
        if (count >= capacity) {
            capacity *= 2;
            char **new_keys = realloc(object->data.object.keys, capacity * sizeof(char*));
            JsonValue **new_values = realloc(object->data.object.values, capacity * sizeof(JsonValue*));
            if (new_keys == NULL || new_values == NULL) {
                free(key);
                free_json_value(value);
                for (size_t i = 0; i < count; i++) {
                    free(object->data.object.keys[i]);
                    free_json_value(object->data.object.values[i]);
                }
                free(object->data.object.keys);
                free(object->data.object.values);
                free(object);
                return NULL;
            }
            object->data.object.keys = new_keys;
            object->data.object.values = new_values;
        }

        // BUG 4: VULNERABLE - key might be NULL, causing issues
        object->data.object.keys[count] = key;
        object->data.object.values[count] = value;
        count++;

        skip_whitespace(json);

        if (**json == '}') {
            (*json)++;
            break;
        }

        if (**json == ',') {
            (*json)++;
        } else {
            // Malformed object
            for (size_t i = 0; i < count; i++) {
                free(object->data.object.keys[i]);
                free_json_value(object->data.object.values[i]);
            }
            free(object->data.object.keys);
            free(object->data.object.values);
            free(object);
            return NULL;
        }
    }

    object->data.object.count = count;
    return object;
}

/*
 * Parse a JSON value (main recursive function)
 * BUG 1: Deep recursion causes stack overflow
 */
JsonValue *parse_value_internal(const char **json, int depth) {
    skip_whitespace(json);

    if (**json == '\0') {
        return NULL;
    }

    // Object
    if (**json == '{') {
        return parse_object(json, depth);
    }

    // Array
    if (**json == '[') {
        return parse_array(json, depth);
    }

    // String
    if (**json == '"') {
        JsonValue *value = malloc(sizeof(JsonValue));
        if (value == NULL) {
            return NULL;
        }
        value->type = JSON_STRING;
        value->data.string = parse_string(json);
        if (value->data.string == NULL) {
            free(value);
            return NULL;
        }
        return value;
    }

    // Boolean true
    if (strncmp(*json, "true", 4) == 0) {
        JsonValue *value = malloc(sizeof(JsonValue));
        if (value == NULL) {
            return NULL;
        }
        value->type = JSON_BOOL;
        value->data.boolean = 1;
        *json += 4;
        return value;
    }

    // Boolean false
    if (strncmp(*json, "false", 5) == 0) {
        JsonValue *value = malloc(sizeof(JsonValue));
        if (value == NULL) {
            return NULL;
        }
        value->type = JSON_BOOL;
        value->data.boolean = 0;
        *json += 5;
        return value;
    }

    // Null
    if (strncmp(*json, "null", 4) == 0) {
        JsonValue *value = malloc(sizeof(JsonValue));
        if (value == NULL) {
            return NULL;
        }
        value->type = JSON_NULL;
        *json += 4;
        return value;
    }

    // Number
    if (isdigit(**json) || **json == '-') {
        JsonValue *value = malloc(sizeof(JsonValue));
        if (value == NULL) {
            return NULL;
        }
        value->type = JSON_NUMBER;
        value->data.number = parse_number(json);
        return value;
    }

    return NULL;
}

JsonValue *parse_value(const char **json, int depth) {
    return parse_value_internal(json, depth);
}

/*
 * Free JSON value (recursive)
 */
void free_json_value(JsonValue *value) {
    if (value == NULL) {
        return;
    }

    switch (value->type) {
        case JSON_STRING:
            free(value->data.string);
            break;

        case JSON_ARRAY:
            for (size_t i = 0; i < value->data.array.count; i++) {
                free_json_value(value->data.array.items[i]);
            }
            free(value->data.array.items);
            break;

        case JSON_OBJECT:
            for (size_t i = 0; i < value->data.object.count; i++) {
                free(value->data.object.keys[i]);
                free_json_value(value->data.object.values[i]);
            }
            free(value->data.object.keys);
            free(value->data.object.values);
            break;

        default:
            break;
    }

    free(value);
}

#ifdef STANDALONE
/*
 * Print JSON value (for debugging)
 */
void print_json_value(JsonValue *value, int indent) {
    if (value == NULL) {
        printf("null");
        return;
    }

    switch (value->type) {
        case JSON_NULL:
            printf("null");
            break;

        case JSON_BOOL:
            printf("%s", value->data.boolean ? "true" : "false");
            break;

        case JSON_NUMBER:
            printf("%g", value->data.number);
            break;

        case JSON_STRING:
            printf("\"%s\"", value->data.string);
            break;

        case JSON_ARRAY:
            printf("[
");
            for (size_t i = 0; i < value->data.array.count; i++) {
                for (int j = 0; j < indent + 2; j++) printf(" ");
                print_json_value(value->data.array.items[i], indent + 2);
                if (i < value->data.array.count - 1) printf(",");
                printf("\n");
            }
            for (int j = 0; j < indent; j++) printf(" ");
            printf("]");
            break;

        case JSON_OBJECT:
            printf("{\n");
            for (size_t i = 0; i < value->data.object.count; i++) {
                for (int j = 0; j < indent + 2; j++) printf(" ");
                printf("\"%s\": ", value->data.object.keys[i]);
                print_json_value(value->data.object.values[i], indent + 2);
                if (i < value->data.object.count - 1) printf(",");
                printf("\n");
            }
            for (int j = 0; j < indent; j++) printf(" ");
            printf("}");
            break;
    }
}
#endif
