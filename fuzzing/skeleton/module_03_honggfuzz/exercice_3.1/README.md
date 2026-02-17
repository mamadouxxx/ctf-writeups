# Exercice 3.1 : Premier fuzzing avec honggfuzz

**Objectif** : Fuzzer un parser de paquets réseau avec honggfuzz.

## Code

Le fichier `target_hfuzz.c` contient un parser de paquets qui lit depuis l'entrée standard. Il contient intentionnellement plusieurs bugs.

## Installation de honggfuzz

Si vous ne l'avez pas encore fait, installez honggfuzz.

### Linux (Ubuntu/Debian)

```bash
# Installation des dépendances
sudo apt-get update
sudo apt-get install -y binutils-dev libunwind-dev libblocksruntime-dev clang build-essential

# Cloner et compiler honggfuzz
git clone https://github.com/google/honggfuzz.git
cd honggfuzz
make
sudo make install
cd ..
```

### macOS

```bash
brew install honggfuzz
```

## Compilation

Pour compiler le programme avec honggfuzz, utilisez la commande suivante :

```bash
hfuzz-clang -fsanitize=address,undefined -g -Wall -Wextra harness_hfuzz.c packet_parser_logic.c -o target_hfuzz
```

## Lancement du Fuzzer

1.  **Créez une graine initiale (`seed`) :**
    ```bash
    python3 create_seed.py
    ```
    Cela va créer un fichier `seeds/valid_packet.bin`.

2.  **Lancez honggfuzz :**
    ```bash
    honggfuzz -i seeds/ -o output/ --exit_upon_crash -- ./target_hfuzz
    ```

    - `-i seeds/` : Spécifie le dossier contenant les graines initiales.
    - `-o output/` : Spécifie le dossier de sortie pour les crashes et autres artefacts.
    - `--exit_upon_crash` : Arrête le fuzzing dès le premier crash.
    - `./target_hfuzz` : Le programme à fuzzer.

## Analyse des crashes

Les crashes seront sauvegardés dans des fichiers `HONGGFUZZ.REPORT.*.fuzz`. Pour analyser un crash, vous pouvez rejouer l'entrée qui l'a provoqué :

```bash
./target_hfuzz < HONGGFUZZ.REPORT.xxxx.fuzz
```
Analysez le rapport d'ASan pour comprendre la nature de chaque bug.
