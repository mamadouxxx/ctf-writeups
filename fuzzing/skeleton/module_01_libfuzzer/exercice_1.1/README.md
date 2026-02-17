# Exercice 1.1 : Premier harness libFuzzer

**Objectif** : Ecrire un harness libFuzzer pour fuzzer automatiquement la fonction vulnérable.

## Code

Le fichier `harness_simple.c` contient le harness libFuzzer. Un harness libFuzzer est une fonction avec la signature suivante :
```c
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    // Votre code à tester ici
    return 0;
}
```

Le harness de cet exercice:
1. Vérifie que la taille des données est supérieure à 0.
2. Alloue un tampon, y copie les données.
3. Appelle la fonction vulnérable `vuln_func`.
4. Libère la mémoire.

## Compilation

Pour compiler le harness avec libFuzzer et AddressSanitizer, utilisez la commande suivante :

```bash
clang -fsanitize=fuzzer,address -g -fno-omit-frame-pointer -Wall -Wextra harness_simple.c vuln_func.c -o fuzzer
```

Options de compilation :
- `-fsanitize=fuzzer` : Lie le programme avec la bibliothèque libFuzzer.
- `-fsanitize=address` : Active AddressSanitizer.
- `-g` : Ajoute les symboles de debug.
- `-fno-omit-frame-pointer`: Conserve les pointeurs de frame.
- `-Wall -Wextra`: Active les avertissements du compilateur.

## Lancement du Fuzzer

Pour lancer le fuzzer, exécutez la commande suivante :

```bash
./fuzzer
```

Le fuzzer va rapidement découvrir le crash et créer un fichier `crash-<hash>` contenant l'entrée qui a provoqué le crash.
