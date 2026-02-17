# Exercice 4.2 : Fuzzing d'un binaire sans source

**Objectif** : Fuzzer un binaire compilé sans accès au code source en utilisant le mode QEMU de honggfuzz.

## Scénario

Vous êtes un auditeur de sécurité et avez reçu le binaire `blackbox_target`. Le programme lit des données depuis l'entrée standard et les traite. Le client suspecte des bugs de sécurité mais n'a plus le code source.

## Analyse préliminaire

Avant de fuzzer, analysez le binaire :
```bash
# Type de fichier
file blackbox_target

# Symboles (si non strippé)
nm blackbox_target

# Strings intéressantes
strings blackbox_target
```

## Compilation (pour information)

Le binaire a été compilé de la manière suivante, pour simuler une boîte noire :
```bash
gcc -g blackbox_target.c -o blackbox_target
strip blackbox_target
```

## Lancement du Fuzzer avec honggfuzz (mode QEMU)

Pour fuzzer le binaire, nous allons utiliser le mode QEMU de honggfuzz.

1.  **Créez des répertoires pour les graines et les résultats :**
    ```bash
    mkdir -p input output
    echo "test" > input/seed.txt
    ```

2.  **Lancez honggfuzz en mode QEMU :**
    ```bash
    honggfuzz -i input -o output -z -- ./blackbox_target
    ```
    - `-i input` : Dossier des graines.
    - `-o output` : Dossier des résultats.
    - `-z` : Active le mode QEMU pour fuzzer des binaires sans instrumentation.
    - `--` : Sépare les options de honggfuzz de la commande à exécuter.

Le mode QEMU est plus lent que le fuzzing de code instrumenté, soyez patient.

## Analyse des crashes

Les crashes seront sauvegardés dans des fichiers `HONGGFUZZ.REPORT.*.fuzz`. Pour analyser un crash :
```bash
# Rejouez le crash
./blackbox_target < HONGGFUZZ.REPORT.xxxx.fuzz

# Analysez avec GDB
gdb ./blackbox_target
(gdb) run < HONGGFUZZ.REPORT.xxxx.fuzz
(gdb) bt
```
L'analyse de crashes sans symboles de debug est plus complexe et nécessite des compétences en reverse engineering.
