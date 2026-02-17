/*
 * Exercice 1.0 : Programme simple avec buffer overflow
 *
 * Ce programme contient une vulnérabilité de buffer overflow classique.
 * Il lit des données depuis stdin et les copie dans un buffer fixe
 * sans vérifier la taille.
 *
 * Objectif : Compiler avec ASan et observer comment il détecte le bug
 */

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFER_SIZE 32

/*
 * Fonction vulnérable qui copie des données dans un buffer fixe
 *
 * BUG : Aucune vérification de la taille des données !
 * Si data_size > BUFFER_SIZE, il y aura un buffer overflow
 */
void process_data(const uint8_t *data, size_t data_size) {
  char buffer[BUFFER_SIZE]; // Buffer alloué sur la stack

  printf("[*] Processing %zu bytes of data...\n", data_size);

  // VULNERABLE : Copie sans vérification de taille
  // Si data_size > BUFFER_SIZE, on écrit au-delà du buffer
  memcpy(buffer, data, data_size);

  printf("[+] Data processed successfully: %.*s\n",
         (int)(data_size < BUFFER_SIZE ? data_size : BUFFER_SIZE), buffer);
}

int main(int argc, char **argv) {
  uint8_t input_buffer[1024];
  size_t bytes_read;

  printf("=== Simple Buffer Overflow Demonstration ===\n");
  printf("Buffer size: %d bytes\n", BUFFER_SIZE);
  printf("Reading from stdin...\n\n");

  // Lire les données depuis stdin
  bytes_read = fread(input_buffer, 1, sizeof(input_buffer), stdin);

  if (bytes_read == 0) {
    fprintf(stderr, "[-] No data read from stdin\n");
    return 1;
  }

  printf("[*] Read %zu bytes from stdin\n", bytes_read);

  // Appeler la fonction vulnérable
  process_data(input_buffer, bytes_read);

  printf("[+] Program completed normally\n");
  return 0;
}

/*
 * QUESTIONS À SE POSER :
 *
 * 1. Que se passe-t-il si on envoie plus de 32 bytes ?
 * 2. Pourquoi ne voit-on pas toujours un crash sans ASan ?
 * 3. Que montre le rapport d'ASan exactement ?
 * 4. Où se trouve le buffer overflow sur la stack ?
 *
 * POUR TESTER :
 *
 * # Compilation avec ASan
 *
 * # Test safe (< 32 bytes)
 * echo "HELLO WORLD" | ./vuln_simple
 *
 * # Test avec overflow (> 32 bytes)
 * python3 -c "print('A' * 100)" | ./vuln_simple
 *
 * RESULTAT ATTENDU :
 * ASan devrait détecter et reporter le stack-buffer-overflow
 */
