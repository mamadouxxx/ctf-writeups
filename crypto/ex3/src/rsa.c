#include "rsa.h"

EVP_PKEY *rsa_key;

int load_RSA_key() {
  FILE *key_file = fopen("secrets/rsa_private.key", "r");
  if (!key_file) {
    perror("Failed to open RSA key file");
    return EXIT_FAILURE;
  }

  // Load the RSA private key
  if (PEM_read_PrivateKey_ex(key_file, &rsa_key, NULL, NULL, NULL, NULL) ==
      NULL) {
    perror("Failed to load private key");
    fclose(key_file);
    return EXIT_FAILURE;
  }

  fclose(key_file);

  return EXIT_SUCCESS;
}

int rsa_textbook_decrypt(EVP_PKEY *K, const unsigned char *C, size_t C_size,
                         unsigned char *M, size_t *M_size) {
  EVP_PKEY_CTX *ctx = EVP_PKEY_CTX_new(K, NULL);
  if (ctx == NULL) {
    fprintf(stderr, "Error: Failed to create EVP context.\n");
    return EXIT_FAILURE;
  }

  if (1 != EVP_PKEY_decrypt_init(ctx)) {
    fprintf(stderr, "Error: Failed to initialize decryption.\n");
    EVP_PKEY_CTX_free(ctx);
    return EXIT_FAILURE;
  }

  if (1 != EVP_PKEY_CTX_set_rsa_padding(ctx, RSA_NO_PADDING)) {
    fprintf(stderr, "Error: Failed to remove padding.\n");
    EVP_PKEY_CTX_free(ctx);
    return EXIT_FAILURE;
  }

  if (1 != EVP_PKEY_decrypt(ctx, M, M_size, C, C_size)) {
    fprintf(stderr, "Error: Failed to decrypt.\n");
    EVP_PKEY_CTX_free(ctx);
    return EXIT_FAILURE;
  }

  EVP_PKEY_CTX_free(ctx);
  return EXIT_SUCCESS;
}

void compute_lhash(const unsigned char *role, unsigned char *lHash) {

  char filepath[512];
  snprintf(filepath, sizeof(filepath), "labels/%s", role);
  FILE *file = fopen(filepath, "rb");
  if (!file) {
    perror("Unable to open file");
    return;
  }

  fseek(file, 0, SEEK_END);
  size_t label_size = ftell(file);
  rewind(file);

  if (label_size <= 0 || label_size > 0x2000000000000000) {
    fprintf(stderr, "File is empty or has an invalid size.\n");
    fclose(file);
    return;
  }

  unsigned char *label = (unsigned char *)malloc(label_size);
  if (!label) {
    fprintf(stderr, "Memory allocation failed.\n");
    fclose(file);
    return;
  }

  size_t bytes_read = fread(label, 1, label_size, file);
  if (bytes_read != label_size) {
    fprintf(stderr, "Error reading file.\n");
    free(label);
    fclose(file);
    return;
  }
  fclose(file);

  compute_sha256(label, label_size, lHash);

  free(label);
}

// https://datatracker.ietf.org/doc/html/rfc3447#section-7.1.2
int rsa_oaep_decrypt(EVP_PKEY *K, const unsigned char *C, size_t C_size,
                     const unsigned char *label, unsigned char *M,
                     size_t *M_size) {
  // Step 1
  size_t k = EVP_PKEY_get_bits(K) / 8;
  const size_t hLen = 32; // SHA-256 output length

  if (C_size != k || k < (2 * hLen + 2)) {
    fprintf(stderr, "decryption error\n");
    return EXIT_FAILURE;
  }

  // Step 2
  if (rsa_textbook_decrypt(K, C, C_size, M, M_size)) {
    fprintf(stderr, "decryption error\n");
    return EXIT_FAILURE;
  }

  // 3.g
  if (M[0] != 0) {
    fprintf(stderr, "decryption error\n");
    return EXIT_FAILURE;
  }

  // 3.a
  unsigned char lHash[hLen];
  compute_lhash(label, lHash);

  // 3.b
  unsigned char maskedSeed[hLen];
  memcpy(maskedSeed, M + 1, hLen);

  unsigned char seedMask[hLen];

  size_t maskedDB_len = k - hLen - 1;
  unsigned char *maskedDB = malloc(maskedDB_len);
  memcpy(maskedDB, M + 1 + hLen, maskedDB_len);

  // 3.c
  MGF1(maskedDB, maskedDB_len, hLen, seedMask);

  // 3.d
  unsigned char seed[hLen];
  for (size_t i = 0; i < hLen; i++) {
    seed[i] = maskedSeed[i] ^ seedMask[i];
  }

  // 3.e
  unsigned char *dbMask = malloc(maskedDB_len);
  MGF1(seed, hLen, maskedDB_len, dbMask);

  // 3.f
  for (size_t i = 0; i < maskedDB_len; i++) {
    maskedDB[i] = maskedDB[i] ^ dbMask[i];
  }

  // 3.g
  size_t pad_end_idx;
  for (pad_end_idx=hLen; pad_end_idx < maskedDB_len && maskedDB[pad_end_idx] == 0; pad_end_idx++) {
    }

  if (memcmp(maskedDB, lHash, hLen) != 0 || maskedDB[pad_end_idx] != 1) {
    fprintf(stderr, "decryption error\n");
    free(maskedDB);
    free(dbMask);
    return EXIT_FAILURE;
  }

  *M_size = maskedDB_len - pad_end_idx - 1;
  memcpy(M, maskedDB + pad_end_idx + 1, *M_size);
  M[*M_size] = '\0';

  free(maskedDB);
  free(dbMask);
  return EXIT_SUCCESS;
}