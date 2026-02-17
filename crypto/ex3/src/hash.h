#ifndef HASH_H
#define HASH_H

#include <openssl/evp.h>
#include <string.h>

void compute_sha256(const unsigned char *data, size_t data_len, unsigned char *out_hash);

int MGF1(const unsigned char *mgfSeed, size_t seedLen, size_t maskLen,
         unsigned char *outputMask);

#endif