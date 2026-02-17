/*
 * Exercice 1.1 : Premier harness libFuzzer
 *
 * Ce fichier contient un harness libFuzzer pour fuzzer la fonction
 * process_data() de l'exercice précédent.
 *
 * Objectif : Comprendre la structure d'un harness libFuzzer et voir
 *            comment le fuzzer trouve automatiquement le bug
 */

#include <stdint.h>
#include <stddef.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include "vuln_func.h" // Inclusion du fichier d'en-tête de la fonction vulnérable

/*
 * HARNESS LIBFUZZER
 *
 * Point d'entrée pour libFuzzer. Cette fonction est appelée des milliers
 * de fois par seconde avec des données différentes générées par le fuzzer.
 *
 * Paramètres :
 *   Data : Pointeur vers les données générées par le fuzzer
 *   Size : Taille des données (peut être 0)
 *
 * Retour :
 *   0  : Continue le fuzzing (normal)
 *   -1 : Rejette cette entrée (rare, utilisé pour filtrer des cas)
 *
 * IMPORTANT : Cette fonction doit être :
 *   - Rapide (elle sera appelée des millions de fois)
 *   - Déterministe (même entrée = même résultat)
 *   - Sans effets de bord (pas de fichiers, réseau, etc.)
 */
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    /*
     * VALIDATION DE BASE
     *
     * On peut filtrer les cas triviaux pour gagner du temps.
     * Ici on ignore les entrées vides car elles ne sont pas intéressantes.
     */
    if (Size == 0) {
        return 0;  // Ignore les entrées vides
    }

    /*
     * PRÉPARATION DES DONNÉES
     *
     * Souvent, il faut copier ou formater les données avant de les
     * passer à la fonction cible. Ici, on alloue un buffer pour
     * s'assurer que les données sont en mémoire valide.
     */
    uint8_t *input_buffer = (uint8_t *)malloc(Size);
    if (input_buffer == NULL) {
        return 0;  // Échec d'allocation, ignore cette entrée
    }

    // Copie des données du fuzzer dans notre buffer
    memcpy(input_buffer, Data, Size);

    /*
     * APPEL DE LA FONCTION CIBLE
     *
     * C'est ici que le fuzzing se produit réellement.
     * Si la fonction a un bug, ASan le détectera et le fuzzer
     * sauvegardera l'entrée qui a causé le crash.
     */
    process_data(input_buffer, Size);

    /*
     * NETTOYAGE
     *
     * Important : Libérer toute mémoire allouée pour éviter les
     * memory leaks. Le fuzzer exécute cette fonction des millions
     * de fois, donc même de petits leaks s'accumulent rapidement.
     */
    free(input_buffer);

    return 0;  // Fuzzing réussi, continuer avec la prochaine entrée
}

/*
 * NOTES IMPORTANTES SUR LES HARNESS :
 *
 * 1. PERFORMANCE
 *    - Le harness sera appelé des millions de fois
 *    - Éviter les allocations lourdes si possible
 *    - Pas d'I/O (fichiers, réseau, printf, etc.)
 *
 * 2. DÉTERMINISME
 *    - Même entrée doit toujours produire le même résultat
 *    - Pas de random(), time(), etc.
 *    - Permet au fuzzer de reproduire les bugs
 *
 * 3. ÉTAT GLOBAL
 *    - Réinitialiser tout état global entre les exécutions
 *    - Sinon, le fuzzing devient non-déterministe
 *
 * 4. FILTRAGE
 *    - On peut rejeter des entrées invalides tôt
 *    - Exemple : taille minimale, format requis, etc.
 *    - Mais attention : ne pas filtrer les cas intéressants !
 *
 * 5. AVEC ASan
 *    - Toujours compiler avec -fsanitize=address
 *    - ASan détecte les bugs que le programme masquerait sinon
 *    - Bugs détectés : buffer overflow, use-after-free, etc.
 *
 * POUR COMPILER ET EXÉCUTER :
 *
 *
 * # Lancer le fuzzer (Ctrl+C pour arrêter)
 * ./fuzzer
 *
 * # Avec options utiles
 * ./fuzzer -max_len=256                 # Limite la taille des entrées
 * ./fuzzer -runs=1000000                # Limite le nombre d'exécutions
 * ./fuzzer -dict=fuzzer.dict            # Utilise un dictionnaire
 * ./fuzzer corpus/                      # Utilise/sauve un corpus
 *
 * # Rejouer un crash trouvé
 * ./fuzzer crash-<hash>
 *
 * RÉSULTAT ATTENDU :
 *
 * Le fuzzer devrait trouver le crash en quelques secondes :
 *   - Il essaie différentes tailles d'entrée
 *   - Quand Size > 32, le buffer overflow se produit
 *   - ASan détecte l'overflow et le fuzzer sauvegarde l'entrée
 *   - Un fichier crash-* est créé avec l'entrée problématique
 */
