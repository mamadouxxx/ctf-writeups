# Module 3 : Introduction à honggfuzz

## Objectifs

-   Installer et configurer honggfuzz
-   Comprendre les différences entre honggfuzz et libFuzzer
-   Fuzzer un programme avec honggfuzz
-   Fuzzer une bibliothèque open source (libxml2)

## Durée estimée

1h30

---

## Introduction à honggfuzz

**honggfuzz** est un fuzzer moderne développé par Google, conçu pour être performant et facile à utiliser. Il offre plusieurs avantages :

### Caractéristiques principales

-   **Feedback-driven fuzzing** : Utilise la couverture de code pour guider la génération de tests
-   **Instrumentation hardware** : Peut utiliser Intel PT (Processor Trace) pour une instrumentation très performante
-   **Parallélisation native** : Gère automatiquement plusieurs threads
-   **Support multi-plateforme** : Linux, macOS, FreeBSD, Windows
-   **Persistent mode** : Comme libFuzzer, pour des performances optimales

### Différences avec libFuzzer

| Caractéristique | libFuzzer                         | honggfuzz                    |
| --------------- | --------------------------------- | ---------------------------- |
| Intégration     | Compilé avec le code              | Binaire séparé               |
| Instrumentation | LLVM (compile-time)               | Multiple (compile + runtime) |
| Interface       | API C (`LLVMFuzzerTestOneInput`)  | stdin ou persistent mode     |
| Parallélisation | Mono-thread (1 instance = 1 core) | Multi-thread natif           |
| Corpus          | Géré automatiquement              | Dossier surveillé            |
| Intel PT        | Non                               | Oui (Linux uniquement)       |

---

## Installation de honggfuzz

### Linux (Ubuntu/Debian)

```bash
# Installation des dépendances
sudo apt-get update
sudo apt-get install -y \
    binutils-dev \
    libunwind-dev \
    libblocksruntime-dev \
    clang \
    build-essential

# Cloner et compiler honggfuzz
cd ~
git clone https://github.com/google/honggfuzz.git
cd honggfuzz
make

# Installation système (optionnel)
sudo make install

# Ou ajouter au PATH
export PATH=$PATH:$HOME/honggfuzz
```

### macOS

```bash
# Installation via Homebrew
brew install honggfuzz

# Ou compilation depuis les sources
git clone https://github.com/google/honggfuzz.git
cd honggfuzz
make
sudo make install
```

### Vérification de l'installation

```bash
honggfuzz --version
# Devrait afficher : honggfuzz version 2.x
```

---

## Modes d'instrumentation

honggfuzz supporte plusieurs modes d'instrumentation :

### 1. Instrumentation compile-time (recommandé)

Utilise les sanitizers Clang pour détecter les bugs :

```bash
# Compilation avec honggfuzz-clang
hfuzz-clang -o target target.c

# Ou manuellement avec clang
clang -fsanitize=address,undefined -O1 -g \
      -DHFUZZ_CC_ASAN \
      -o target target.c
```

### 2. Intel PT (Linux uniquement)

Instrumentation hardware très performante :

```bash
honggfuzz --linux_perf_ipt_block -i corpus/ -- ./target
```

### 3. Mode blackbox (QEMU)

Pour fuzzer des binaires sans code source :

```bash
honggfuzz -P -i corpus/ -- ./binary_without_source
```

---

## Workflow de base avec honggfuzz

### 1. Écrire le target

honggfuzz peut fonctionner de deux façons :

#### Mode stdin (simple)

Le programme lit sur stdin :

```c
#include <stdio.h>
#include <stdlib.h>

void fuzz_target(char *data, size_t size) {
    // Votre code à fuzzer
}

int main(void) {
    char buf[4096];
    size_t len = fread(buf, 1, sizeof(buf), stdin);
    fuzz_target(buf, len);
    return 0;
}
```

#### Mode persistent (performant)

Utilise l'API honggfuzz pour éviter de redémarrer le processus :

```c
#include <stdint.h>
#include <stddef.h>
#include <libhfuzz/libhfuzz.h>

int main(void) {
    // HF_ITER initialise honggfuzz et boucle sur les inputs
    HF_ITER(&buf, &len) {
        // Votre code à fuzzer avec buf et len
        fuzz_target(buf, len);
    }
    return 0;
}
```

### 2. Compiler le target

```bash
# Avec honggfuzz-clang (recommandé)
hfuzz-clang -o target target.c

# Ou avec clang standard
clang -fsanitize=address,undefined -O1 -g \
      -I$HOME/honggfuzz \
      -o target target.c
```

### 3. Créer des seeds initiaux

```bash
mkdir corpus
echo "seed1" > corpus/seed1.txt
echo "seed2" > corpus/seed2.txt
```

### 4. Lancer le fuzzing

```bash
# Mode stdin
honggfuzz -i corpus/ -o output/ -- ./target

# Mode persistent
honggfuzz -i corpus/ -o output/ -n 4 -- ./target
```

### 5. Analyser les résultats

```bash
# Les crashes sont sauvegardés dans :
ls -la HONGGFUZZ.REPORT.*

# Rejouer un crash
./target < HONGGFUZZ.REPORT.xxxx.txt
```

---

## Options importantes de honggfuzz

```bash
honggfuzz [options] -- /path/to/target [target_args]
```

### Options principales

| Option              | Description                                          |
| ------------------- | ---------------------------------------------------- |
| `-i dir`            | Dossier contenant les seeds initiaux                 |
| `-o dir`            | Dossier de sortie pour les crashes                   |
| `-n N`              | Nombre de threads parallèles (défaut : nbr de cores) |
| `-t N`              | Timeout par test en secondes (défaut : 10)           |
| `-r N`              | Nombre d'itérations (défaut : infini)                |
| `-q`                | Mode silencieux                                      |
| `-v`                | Mode verbeux                                         |
| `-P`                | Mode persistent (si compilé avec HF_ITER)            |
| `--exit_upon_crash` | Arrêter dès le premier crash                         |

### Options d'instrumentation

| Option                   | Description                             |
| ------------------------ | --------------------------------------- |
| `--linux_perf_ipt_block` | Utiliser Intel PT (Linux)               |
| `--linux_perf_instr`     | Compteur d'instructions hardware        |
| `-z`                     | Utiliser QEMU pour binaires sans source |

### Exemples

```bash
# Fuzzing basique avec 4 threads
honggfuzz -i seeds/ -n 4 -- ./target

# Arrêt au premier crash
honggfuzz -i seeds/ --exit_upon_crash -- ./target

# Avec timeout de 5 secondes
honggfuzz -i seeds/ -t 5 -- ./target

# Mode persistent pour performance maximale
honggfuzz -i seeds/ -P -n 8 -- ./target

# Avec Intel PT (Linux seulement)
honggfuzz -i seeds/ --linux_perf_ipt_block -- ./target
```

---

## Comprendre l'interface de honggfuzz

Lors du fuzzing, honggfuzz affiche une interface en temps réel :

```
────── HONGGFUZZ (2.6) ──────
  Iterations : 125,432 [l: 1,234, h: 0, t: 0]
  Mode........: [f] feedback
  Target......: ./target
  Threads.....: 4, CPUs: 8, Time: 0:02:15 [0:00:15/0:00:45]
  Speed.......: 925 [avg: 897], Crashes: 3 [unique: 2]
  Cov.........: Edge: 234/567 [41.27%] PC: 123/456 [26.97%] Cmp: 12345
────── LOGS ──────────────────────────────────────────────────────────
```

### Interprétation

-   **Iterations** : Nombre total de tests effectués

    -   `l` : Tests avec nouveau coverage (interesting)
    -   `h` : Tests crashés
    -   `t` : Tests avec timeout

-   **Speed** : Tests par seconde (par thread)

-   **Crashes** : Nombre total / nombre de crashes uniques

-   **Coverage** :
    -   `Edge` : Branches de code couvertes
    -   `PC` : Instructions couvertes
    -   `Cmp` : Comparaisons instrumentées

---

## Exercices

### Exercice 3.1 : Premier fuzzing avec honggfuzz

**Objectif** : Fuzzer un parser de paquets réseau avec honggfuzz

**Fichiers** :

-   `target_hfuzz.c` : Parser de paquets avec plusieurs bugs
-   `create_seed.py` : Script pour créer un seed valide

**Instructions** :

1. Compiler le target :

    ```bash
    cd exercice_3.1
    ```

2. Créer un seed initial :

    ```bash
    python3 create_seed.py
    # Crée seeds/valid_packet.bin
    ```

3. Lancer honggfuzz :

    ```bash
    honggfuzz -i seeds/ -o output/ --exit_upon_crash -- ./target_hfuzz
    ```

4. Analyser les crashes trouvés :

    ```bash
    # Lister les crashes
    ls -la HONGGFUZZ.REPORT.*

    # Rejouer un crash
    ./target_hfuzz < HONGGFUZZ.REPORT.xxxx.txt

    # Ou avec gdb pour déboguer
    gdb ./target_hfuzz
    (gdb) run < HONGGFUZZ.REPORT.xxxx.txt
    ```

**Bugs à trouver** :

-   Buffer overflow dans le parsing du payload
-   Integer overflow dans le calcul de taille
-   Use-after-free dans le traitement des versions
-   Division par zéro dans les statistiques

### Exercice 3.2 : Fuzzing de libxml2

**Objectif** : Fuzzer une vraie bibliothèque open source

**Contexte** : libxml2 est une bibliothèque C très utilisée pour parser du XML. Elle a eu de nombreuses vulnérabilités découvertes par fuzzing.

**Fichiers** :

-   `fuzz_libxml2.c` : Harness de fuzzing
-   `seeds/` : Exemples de XML valides

**Instructions** :

1. Installer libxml2 :

    ```bash
    # Ubuntu/Debian
    sudo apt-get install -y libxml2-dev

    # macOS
    brew install libxml2
    ```

2. Compiler le harness :

    ```bash
    cd exercice_3.2
    ```

3. Lancer le fuzzing :

    ```bash
    # Mode basique
    honggfuzz -i seeds/ -n 4 -- ./fuzz_libxml2

    # Mode persistent pour meilleures performances
    honggfuzz -i seeds/ -P -n 8 -- ./fuzz_libxml2
    ```

4. Observer la couverture de code augmenter

**Questions** :

-   Quelle couverture de code atteignez-vous ?
-   Combien de temps pour trouver un premier crash ?
-   Comparez les performances avec libFuzzer (si vous l'avez essayé)

---

## Debugging des crashes

### Méthode 1 : Relancer avec ASAN

```bash
# Si compilé avec -fsanitize=address
./target < HONGGFUZZ.REPORT.xxxx.txt
```

### Méthode 2 : GDB

```bash
gdb ./target
(gdb) run < HONGGFUZZ.REPORT.xxxx.txt
(gdb) backtrace
(gdb) info registers
(gdb) x/20x $rsp
```

### Méthode 3 : Valgrind

```bash
valgrind --leak-check=full ./target < HONGGFUZZ.REPORT.xxxx.txt
```

### Méthode 4 : Analyse du report

honggfuzz génère un fichier `HONGGFUZZ.REPORT.TXT` avec des informations détaillées :

```
FUZZ COVERAGE DATA:
  corpus / sancov ........: 234 / 234
  branches / branches cov : 567 / 234 (41.27%)
  pc / pc cov ............: 456 / 123 (26.97%)

CRASH:
  Crash Addr ..............: 0x7ffff7a12345
  Crash Type ..............: SIGSEGV
  Crash Backtrace .........:
    #0 0x555555554abc in parse_packet target.c:42
    #1 0x555555554def in main target.c:78
```

---

## Comparaison : libFuzzer vs honggfuzz

### Quand utiliser libFuzzer ?

✅ Fuzzing de fonctions spécifiques
✅ Intégration dans des tests unitaires
✅ Vous avez le code source et contrôlez la compilation
✅ Fuzzing de fonctions pures (sans état)
✅ Projets C++ modernes

### Quand utiliser honggfuzz ?

✅ Fuzzing de programmes complets
✅ Besoin de parallélisation native
✅ Fuzzing de binaires (mode QEMU)
✅ Programmes qui lisent depuis stdin
✅ Besoin d'instrumentation hardware (Intel PT)
✅ Fuzzing de longue durée

### Tableau comparatif

| Critère                    | libFuzzer      | honggfuzz     |
| -------------------------- | -------------- | ------------- |
| **Facilité d'intégration** | 🟢 Très facile | 🟡 Moyenne    |
| **Performance**            | 🟢 Excellente  | 🟢 Excellente |
| **Parallélisation**        | 🔴 Manuelle    | 🟢 Native     |
| **Fuzzing blackbox**       | ❌ Non         | 🟢 Oui (QEMU) |
| **Setup initial**          | 🟢 Minimal     | 🟡 Moyen      |
| **Courbe d'apprentissage** | 🟢 Douce       | 🟡 Moyenne    |
| **Debugging**              | 🟢 Simple      | 🟢 Simple     |

---

## Bonnes pratiques

### 1. Créer de bons seeds

```bash
# Plusieurs seeds de tailles différentes
echo "short" > corpus/1.txt
echo "medium_sized_input" > corpus/2.txt
python3 -c "print('A' * 1000)" > corpus/3.txt

# Seeds structurés pour formats complexes
python3 create_seed.py  # Génère des seeds valides
```

### 2. Optimiser les performances

```bash
# Utiliser tous les cores
honggfuzz -i seeds/ -n $(nproc) -- ./target

# Mode persistent pour éviter les redémarrages
# (nécessite HF_ITER dans le code)
honggfuzz -i seeds/ -P -n $(nproc) -- ./target

# Augmenter la limite de mémoire (si besoin)
ulimit -s unlimited
```

### 3. Fuzzing de longue durée

```bash
# Lancer en arrière-plan
nohup honggfuzz -i seeds/ -o output/ -- ./target &

# Sauvegarder régulièrement le corpus
cp -r output/corpus backup/corpus_$(date +%Y%m%d_%H%M%S)

# Monitorer les résultats
watch -n 60 'ls -lh HONGGFUZZ.REPORT.*'
```

### 4. Combiner plusieurs sanitizers

```bash
# ASAN + UBSAN
hfuzz-clang -fsanitize=address,undefined -o target target.c

# Ajouter la détection de fuites
export ASAN_OPTIONS=detect_leaks=1
honggfuzz -i seeds/ -- ./target
```

---

## Ressources

### Documentation officielle

-   [Honggfuzz GitHub](https://github.com/google/honggfuzz)
-   [Documentation](https://github.com/google/honggfuzz/blob/master/docs/USAGE.md)
-   [Examples](https://github.com/google/honggfuzz/tree/master/examples)

### Articles et tutoriels

-   [Fuzzing with honggfuzz (Google Security Blog)](https://security.googleblog.com/2016/06/announcing-oss-fuzz-continuous-fuzzing.html)
-   [Honggfuzz vs AFL vs libFuzzer](https://www.sec-consult.com/blog/detail/fuzzer-battle-royale/)

### Projets utilisant honggfuzz

-   OSS-Fuzz (Google)
-   Nombreux projets open source (OpenSSL, nginx, etc.)

---

## Prochaines étapes

Après ce module, vous devriez être capable de :

✅ Installer et configurer honggfuzz
✅ Écrire un target pour honggfuzz (stdin ou persistent)
✅ Lancer une campagne de fuzzing
✅ Analyser et déboguer les crashes trouvés
✅ Choisir entre libFuzzer et honggfuzz selon le contexte

**Module suivant** : [Module 4 - Fuzzing blackbox](../module_04_blackbox/)

---

## Aide et dépannage

### Erreur : "honggfuzz: command not found"

```bash
# Vérifier l'installation
which honggfuzz

# Si installé dans ~/honggfuzz
export PATH=$PATH:$HOME/honggfuzz
```

### Erreur : "Cannot open corpus directory"

```bash
# Créer le dossier seeds
mkdir -p seeds
echo "test" > seeds/1.txt
```

### Performance très lente

```bash
# Vérifier que vous utilisez l'instrumentation compile-time
hfuzz-clang -o target target.c  # Bon

# Éviter :
gcc -o target target.c  # Pas d'instrumentation !

# Utiliser le mode persistent si possible
# (HF_ITER dans le code)
```

### Pas de crashes trouvés

```bash
# Augmenter la durée de fuzzing
honggfuzz -i seeds/ -r 10000000 -- ./target

# Vérifier le timeout
honggfuzz -i seeds/ -t 10 -- ./target  # 10 secondes

# Vérifier que ASAN est activé
./target < seeds/1.txt  # Doit crasher si bug
```

---

Bon fuzzing avec honggfuzz ! 🚀
