#ifndef utils_H
#define utils_H

#include "aes.h"
#include "rsa.h"
#include "hash.h"
#include <cjson/cJSON.h>
#include <openssl/crypto.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <dirent.h>
#include <stddef.h>

int login();
void logout();
int init();
int menu();
int only_member();
void get_encrypted_member_infos();
void decrypt_member_infos();
void print_flag_3();

#endif