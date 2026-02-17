#include "rsa.h"
#include "utils.h"

int main() {

  if (init()) {
    printf("Initialisation failed. Contact an administrator.\n");
    return EXIT_FAILURE;
  }

  while (login()) {
    // wait for user login
  }

  print_flag_3();

  while (1) {
    switch (menu()) {
    case 'q':
      logout();
      return EXIT_SUCCESS;

    case '3':
      PEM_write_PUBKEY(stdout, rsa_key);
      break;

    case '1':
      if (only_member()) {
        break;
      }
      get_encrypted_member_infos();
      break;

    case '2':
      if (only_member()) {
        break;
      }
      decrypt_member_infos();
      break;
    }
  }

  return EXIT_SUCCESS;
}
