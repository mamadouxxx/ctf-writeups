#include "utils.h"
#include "rsa.h"

cJSON *user;

int init() {
  setvbuf(stdout, NULL, _IONBF, 0);
  setvbuf(stdin, NULL, _IONBF, 0);
  if (load_AES_key()) {
    printf("Failed to initialize AES key.\n");
    return EXIT_FAILURE;
  }
  if (load_RSA_key()) {
    printf("Failed to initialize RSA key.\n");
    return EXIT_FAILURE;
  }

  printf("---------\n");
  printf("Ransom LDAP v0.1\n");
  printf("---------\n");

  return EXIT_SUCCESS;
}

int login() {
  printf("Access token required: ");
  char tokenhex[513];
  unsigned char token[256];

  if (fgets(tokenhex, sizeof(tokenhex), stdin) == NULL) {
    perror("Failed to read token from stdin");
    return EXIT_FAILURE;
  }
  tokenhex[strlen(tokenhex) - 1] = '\0';

  size_t len = strlen(tokenhex) / 2;

  if (len <= 16 || len % 16 != 0) {
    printf("Invalid token length.\n");
    return EXIT_FAILURE;
  }

  if (OPENSSL_hexstr2buf_ex(token, len, NULL, tokenhex, '\0') == 0) {
    printf("Token must be a valid hexadecimal string.\n");
    return EXIT_FAILURE;
  }

  char *decrypted;
  if (decrypt_token(token, len, (unsigned char **)&decrypted)) {
    printf("Something went wrong during decryption.\n");
    return EXIT_FAILURE;
  }

  user = cJSON_Parse(decrypted);
  free(decrypted);

  if (user == NULL) {
    printf("Error parsing JSON.\n");
    return EXIT_FAILURE;
  }

  cJSON *role = cJSON_GetObjectItemCaseSensitive(user, "role");
  if (!cJSON_IsString(role) || role->valuestring == NULL) {
    printf("Invalid JSON.\n");
    return EXIT_FAILURE;
  }

  printf("Access granted.\n");
  return EXIT_SUCCESS;
}

void logout() {
  cJSON_Delete(user);
  EVP_PKEY_free(rsa_key);
  printf("Logged out\n");
}

int menu() {
  printf("[1] Get encrypted member infos\n");
  printf("[2] Decrypt member infos\n");
  printf("[3] Show public key\n");
  printf("[q] quit\n");
  printf("> ");
  char choice = getchar();
  getchar(); // eat the newline
  return choice;
}

int only_member() {
  cJSON *role = cJSON_GetObjectItemCaseSensitive(user, "role");
  if (cJSON_IsString(role) && (role->valuestring != NULL)) {
    if (strcmp(role->valuestring, "member") == 0) {
      return EXIT_SUCCESS;
    }
  }
  printf("Only members can access this feature\n");
  return EXIT_FAILURE;
}

int only_admin() {
  cJSON *role = cJSON_GetObjectItemCaseSensitive(user, "admin_secret");
  if (cJSON_IsString(role) && (role->valuestring != NULL)) {

    size_t message_len = strlen(role->valuestring);
    unsigned char hash[32] = {0};

    compute_sha256((const unsigned char *)role->valuestring, message_len, hash);

    if (CRYPTO_memcmp(hash, "youcannotfindapreimageofthishash", 32) == 0) {
      return EXIT_SUCCESS;
    }
  }
  printf("Only admin members can see the decrypted infos\n");
  return EXIT_FAILURE;
}

void get_encrypted_member_infos() {
  const char *directory = "users";
  struct dirent *entry;
  DIR *dp = opendir(directory);

  if (dp == NULL) {
    perror("Unable to open directory");
    return;
  }

  // There are less then 10 users
  char filenames[10][256];
  int count = 0;

  // List files and store filenames
  while ((entry = readdir(dp)) != NULL) {
    if (entry->d_name[0] == '.')
      continue; // Skip hidden files and "."/ ".."
    strncpy(filenames[count], entry->d_name, sizeof(filenames[count]));
    filenames[count][sizeof(filenames[count]) - 1] = '\0';
    // Print filename without last 4 chars
    printf("[%d] %.*s\n", count, (int)strlen(entry->d_name) - 4, entry->d_name);
    count++;
  }
  closedir(dp);

  // Get user choice
  printf("> ");
  int choice;
  if (scanf("%d", &choice) != 1 || choice < 0 || choice >= count) {
    getchar(); // eat the newline
    printf("Invalid choice.\n");
    return;
  }

  getchar(); // eat the newline

  // Open selected file and print its content in hex
  char filepath[512];
  snprintf(filepath, sizeof(filepath), "%s/%s", directory, filenames[choice]);
  FILE *file = fopen(filepath, "rb");
  if (!file) {
    perror("Unable to open file");
    return;
  }

  unsigned char buffer[16];
  size_t bytes_read;
  while ((bytes_read = fread(buffer, 1, sizeof(buffer), file)) > 0) {
    for (size_t i = 0; i < bytes_read; i++) {
      printf("%02x", buffer[i]);
    }
  }
  printf("\n");

  fclose(file);
}

void decrypt_member_infos() {

  char role[256];
  printf("Whats the role of this user ? ");

  if (!fgets(role, sizeof(role), stdin)) {
    perror("Failed to read role");
    return;
  }
  role[strlen(role) - 1] = '\0';

  char encrypted[1024];
  char decrypted[1024];
  printf("Encrypted member info: ");

  if (!fgets(decrypted, sizeof(decrypted), stdin)) {
    perror("Failed to read encrypted member info");
    return;
  }
  decrypted[strlen(decrypted) - 1] = '\0';

  size_t encrypted_len = strlen(decrypted) / 2;
  size_t decrypted_len = 1024;

  if (OPENSSL_hexstr2buf_ex((unsigned char *)encrypted, encrypted_len, NULL,
                            decrypted, '\0') == 0) {
    printf("Encrypted member info must be a valid hexadecimal string.\n");
    return;
  }

  if (rsa_oaep_decrypt(rsa_key, (const unsigned char *)encrypted, encrypted_len,
                       (const unsigned char *)role, (unsigned char *)decrypted,
                       &decrypted_len)) {
    printf("Incorrect decryption.\n");
    return;
  }

  if (only_admin()) {
    return;
  }
  printf("Member Info: %s", decrypted);
}

void print_flag_3() {
  FILE *file = fopen("./flag3", "r");
  char buffer[1024];

  if (file == NULL) {
    printf("ENO{REDACTED}\n");
    return;
  }

  while (fgets(buffer, sizeof(buffer), file) != NULL) {
    printf("%s", buffer);
  }
  printf("\n");

  fclose(file);
}