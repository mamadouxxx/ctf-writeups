#ifndef AES_H
#define AES_H

#include <openssl/crypto.h>
#include <openssl/err.h>
#include <openssl/evp.h>

#define AES_KEY_SIZE 32

extern unsigned char AES_KEY[AES_KEY_SIZE];

int load_AES_key();
int check_x923_padding(const unsigned char *buffer, size_t buffer_len);
int decrypt_token(const unsigned char *ciphertext, size_t ciphertext_len,
                  unsigned char **decrypted_data);
#endif