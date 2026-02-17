/*
 * Exercice 1.2 : Fuzzing avec conditions complexes (Magic Bytes)
 *
 * Ce fichier contient un harness libFuzzer pour fuzzer la fonction
 * process_data_with_magic() qui contient des conditions complexes.
 *
 * Objectif : Observer comment libFuzzer explore les branches et finit
 *            par trouver la bonne séquence pour déclencher le bug.
 */

#include <stdint.h>
#include <stddef.h>
#include "vuln_conditions_logic.h"

/*
 * HARNESS LIBFUZZER
 *
 * Ce harness est similaire à celui de l'exercice 1.1,
 * mais il teste une fonction avec des conditions complexes.
 */
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    // Ignorer les entrées trop petites (besoin d'au moins 4 bytes)
    if (Size < 4) {
        return 0;
    }

    // Appeler la fonction cible
    // Le fuzzer va explorer les branches pour trouver le bon chemin
    process_data_with_magic(Data, Size);

    return 0;
}
