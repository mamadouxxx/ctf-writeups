#include "vuln_conditions_logic.h"
#include <string.h>
#include <stdio.h>

#define MAGIC_BYTE_1 'F'
#define MAGIC_BYTE_2 'U'
#define MAGIC_BYTE_3 'Z'
#define MAGIC_BYTE_4 'Z'
#define BUFFER_SIZE 16

/*
 * Fonction de validation des magic bytes
 *
 * Retourne 1 si tous les magic bytes sont corrects, 0 sinon.
 * Chaque vérification représente une branche différente dans le code.
 */
int validate_magic_bytes(const uint8_t *data, size_t size) {
    if (size < 4) {
        return 0;  // Pas assez de données
    }

    // Branche 1 : Vérification du premier byte
    if (data[0] != MAGIC_BYTE_1) {
        return 0;
    }

    // Branche 2 : Vérification du deuxième byte
    if (data[1] != MAGIC_BYTE_2) {
        return 0;
    }

    // Branche 3 : Vérification du troisième byte
    if (data[2] != MAGIC_BYTE_3) {
        return 0;
    }

    // Branche 4 : Vérification du quatrième byte
    if (data[3] != MAGIC_BYTE_4) {
        return 0;
    }

    // Tous les magic bytes sont corrects !
    return 1;
}

/*
 * Fonction de traitement des données
 *
 * Cette fonction contient un buffer overflow qui ne se déclenche
 * QUE si les magic bytes sont corrects.
 *
 * C'est un pattern réaliste : beaucoup de bugs se cachent derrière
 * des validations de format ou de protocole.
 */
void process_data_with_magic(const uint8_t *data, size_t size) {
    char buffer[BUFFER_SIZE];

    // Validation des magic bytes
    if (!validate_magic_bytes(data, size)) {
        return;
    }

    /*
     * VULNERABLE : Buffer overflow
     *
     * Si on arrive ici (magic bytes corrects) ET que size > BUFFER_SIZE + 4,
     * alors il y a un buffer overflow.
     *
     * Probabilité de trouver ce bug par fuzzing aléatoire :
     *   - 4 bytes corrects : 1 / (256^4) = 1 / 4,294,967,296
     *   - Puis taille > 20 : ~50%
     *   - Total : ~1 / 8,589,934,592 essais !
     *
     * Avec le fuzzing guidé par couverture, libFuzzer va :
     *   1. Trouver que 'F' donne une nouvelle branche -> garder
     *   2. Muter et trouver 'U' -> nouvelle branche -> garder
     *   3. Muter et trouver 'Z' -> nouvelle branche -> garder
     *   4. Muter et trouver 'Z' -> nouvelle branche -> garder
     *   5. Augmenter la taille -> trouver l'overflow
     *
     * Résultat : Quelques secondes au lieu de milliards d'essais !
     */
    if (size > 4) {
        // Copie SANS vérification de taille
        // If (size - 4) > BUFFER_SIZE, it's an overflow
        memcpy(buffer, data + 4, size - 4);
        buffer[BUFFER_SIZE - 1] = '\0';
    }
}
