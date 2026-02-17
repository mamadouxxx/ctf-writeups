#include "vuln_func.h"
#include <string.h>

#define BUFFER_SIZE 32

/*
 * FONCTION VULNÉRABLE (copie de l'exercice 1.0)
 *
 * Cette fonction contient le même bug que dans l'exercice précédent.
 * Le fuzzer va automatiquement découvrir le buffer overflow.
 */
void process_data(const uint8_t *data, size_t data_size) {
    char buffer[BUFFER_SIZE];

    // VULNERABLE : Copie sans vérification de taille
    memcpy(buffer, data, data_size);

    // Cette ligne ne sera jamais atteinte si le crash se produit
    buffer[BUFFER_SIZE - 1] = '\0';
}
