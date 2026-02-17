#ifndef RSA_H
#define RSA_H

#include <openssl/evp.h>
#include <openssl/pem.h>
#include "hash.h"
#include <string.h>
#include <stddef.h>
#include <stdio.h>


extern EVP_PKEY *rsa_key;

int load_RSA_key();
int rsa_oaep_decrypt(EVP_PKEY *K, const unsigned char *C, size_t C_size,
                     const unsigned char *label, unsigned char *M,
                     size_t *M_size);

#endif