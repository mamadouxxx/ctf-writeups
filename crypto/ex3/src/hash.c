#include "hash.h"

void compute_sha256(const unsigned char *data, size_t data_len,
                  unsigned char *out_hash) {
  EVP_MD_CTX *ctx = EVP_MD_CTX_new();
  if (!ctx) {
    perror("EVP_MD_CTX_new failed");
    exit(1);
  }

  // Initialize the context with the hash algorithm
  if (EVP_DigestInit_ex(ctx, EVP_sha256(), NULL) != 1) {
    perror("EVP_DigestInit_ex failed");
    EVP_MD_CTX_free(ctx);
    exit(1);
  }

  // Add the data to the digest
  if (EVP_DigestUpdate(ctx, data, data_len) != 1) {
    perror("EVP_DigestUpdate failed");
    EVP_MD_CTX_free(ctx);
    exit(1);
  }

  // Finalize and get the hash
  if (EVP_DigestFinal_ex(ctx, out_hash, NULL) != 1) {
    perror("EVP_DigestFinal_ex failed");
    EVP_MD_CTX_free(ctx);
    exit(1);
  }

  // Clean up
  EVP_MD_CTX_free(ctx);
}

int MGF1(const unsigned char *mgfSeed, size_t seedLen, size_t maskLen,
         unsigned char *outputMask) {
  const EVP_MD *hash_func = EVP_sha256();
  unsigned int hLen = EVP_MD_size(hash_func); // Hash output length
  unsigned char hashOutput[EVP_MAX_MD_SIZE];  // Buffer for hash output
  unsigned char counterBytes[4];              // 4-byte counter
  EVP_MD_CTX *mdctx = NULL;                   // Hash context
  size_t generatedLen = 0;
  unsigned int counter = 0;

  if (hLen <= 0 || !outputMask || !mgfSeed) {
    fprintf(stderr, "Invalid input parameters\n");
    return EXIT_FAILURE;
  }

  while (generatedLen < maskLen) {
    // Convert counter to a 4-byte array (big-endian)
    counterBytes[0] = (counter >> 24) & 0xFF;
    counterBytes[1] = (counter >> 16) & 0xFF;
    counterBytes[2] = (counter >> 8) & 0xFF;
    counterBytes[3] = counter & 0xFF;

    // Initialize hash context
    mdctx = EVP_MD_CTX_new();
    if (!mdctx) {
      fprintf(stderr, "Failed to create hash context\n");
      return EXIT_FAILURE;
    }

    // Perform hash: H(mgfSeed || counterBytes)
    if (EVP_DigestInit_ex(mdctx, hash_func, NULL) != 1 ||
        EVP_DigestUpdate(mdctx, mgfSeed, seedLen) != 1 ||
        EVP_DigestUpdate(mdctx, counterBytes, 4) != 1 ||
        EVP_DigestFinal_ex(mdctx, hashOutput, NULL) != 1) {
      fprintf(stderr, "Hash computation failed\n");
      EVP_MD_CTX_free(mdctx);
      return EXIT_FAILURE;
    }

    EVP_MD_CTX_free(mdctx);

    // Copy the hash output to the mask buffer
    size_t chunkSize =
        (maskLen - generatedLen < hLen) ? (maskLen - generatedLen) : hLen;
    memcpy(outputMask + generatedLen, hashOutput, chunkSize);
    generatedLen += chunkSize;
    counter++;
  }

  return EXIT_SUCCESS;
}