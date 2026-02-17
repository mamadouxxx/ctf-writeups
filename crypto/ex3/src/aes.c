#include "aes.h"

unsigned char AES_KEY[AES_KEY_SIZE];

int load_AES_key() {
  FILE *key_file = fopen("secrets/aes256.key", "r");
  if (!key_file) {
    perror("Failed to open AES key file");
    return EXIT_FAILURE;
  }

  char key_hex[AES_KEY_SIZE * 2 + 1];
  if (!fgets(key_hex, sizeof(key_hex), key_file)) {
    perror("Failed to read AES key");
    fclose(key_file);
    return EXIT_FAILURE;
  }

  fclose(key_file);

  if (OPENSSL_hexstr2buf_ex(AES_KEY, AES_KEY_SIZE, NULL, key_hex, '\0') == 0) {
    perror("Failed to decode AES key");
    return EXIT_FAILURE;
  }

  return EXIT_SUCCESS;
}

int check_x923_padding(const unsigned char *buffer, size_t buffer_len) {
  // The last byte contains the padding length
  size_t padding_len = buffer[buffer_len - 1];

  // Validate the padding length
  if (padding_len == 0 || padding_len > buffer_len) {
    fprintf(stderr, "Error: Invalid padding length (%zu).\n", padding_len);
    return EXIT_FAILURE;
  }

  // Ensure that the padding bytes (except the last one) are all zero
  for (size_t i = buffer_len - padding_len; i < buffer_len - 1; i++) {
    if (buffer[i] != 0) {
      fprintf(stderr, "Error: Invalid padding byte at position %zu.\n", i);
      return EXIT_FAILURE;
    }
  }

  return EXIT_SUCCESS;
}

int decrypt_token(const unsigned char *ciphertext, size_t ciphertext_len,
                    unsigned char **decrypted_data) {

    EVP_CIPHER_CTX *ctx = EVP_CIPHER_CTX_new();
    if (ctx == NULL) {
        fprintf(stderr, "Error: Failed to create EVP context.\n");
        return EXIT_FAILURE;
    }

    // disable default PKCS#7 padding
    EVP_CIPHER_CTX_set_padding(ctx, 0);

    // token is: IV || DATA
    if (1 != EVP_DecryptInit_ex(ctx, EVP_aes_256_cbc(), NULL, AES_KEY, ciphertext)) {
        fprintf(stderr, "Error: Failed to initialize decryption.\n");
        EVP_CIPHER_CTX_free(ctx);
        return EXIT_FAILURE;
    }

    // Allocate memory for decrypted data
    *decrypted_data = (unsigned char *)malloc(ciphertext_len-16); // skip IV
    if (*decrypted_data == NULL) {
        fprintf(stderr, "Error: Memory allocation failed for decrypted data.\n");
        EVP_CIPHER_CTX_free(ctx);
        return EXIT_FAILURE;
    }

    int len;
    int decrypted_len = 0;

    // Decrypt the ciphertext
    if (1 != EVP_DecryptUpdate(ctx, *decrypted_data, &len, ciphertext+16, ciphertext_len-16)) { // skip IV
        fprintf(stderr, "Error: Decryption failed.\n");
        free(*decrypted_data);
        EVP_CIPHER_CTX_free(ctx);
        return EXIT_FAILURE;
    }
    decrypted_len = len;

    // Finalize the decryption
    if (1 != EVP_DecryptFinal_ex(ctx, *decrypted_data + decrypted_len, &len)) {
        fprintf(stderr, "Error: Finalizing decryption failed.\n");
        free(*decrypted_data);
        EVP_CIPHER_CTX_free(ctx);
        return EXIT_FAILURE;
    }
    decrypted_len += len;

    EVP_CIPHER_CTX_free(ctx);

    if (check_x923_padding(*decrypted_data, decrypted_len)) {
      fprintf(stderr, "Error: Padding is invalid\n");
      free(*decrypted_data);
      return EXIT_FAILURE;
    }

    return EXIT_SUCCESS;
}