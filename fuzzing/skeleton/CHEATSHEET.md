# 📝 Cheatsheet - Fuzzing Workshop

Un guide de référence rapide pour tous les outils et commandes du workshop.

---

## 🔧 Compilation

### libFuzzer

```bash
# Compilation basique avec libFuzzer et ASan
clang -fsanitize=fuzzer,address -g program.c -o fuzzer

# Avec UBSan en plus
clang -fsanitize=fuzzer,address,undefined -g program.c -o fuzzer

# Optimisé mais débogable
clang -fsanitize=fuzzer,address -g -O1 program.c -o fuzzer
```

### honggfuzz

```bash
# Avec hfuzz-clang
hfuzz-clang -fsanitize=address -g target.c -o target

# Avec clang standard
clang -fsanitize=address -g -DHONGGFUZZ target.c -o target
```

### Sans fuzzer (test manuel)

```bash
# Avec ASan uniquement
clang -fsanitize=address -g program.c -o program

# Avec ASan + UBSan
clang -fsanitize=address,undefined -g program.c -o program
```

---

## 🎯 Execution

### libFuzzer

```bash
# Basique
./fuzzer corpus/

# Avec options utiles
./fuzzer corpus/ -max_total_time=300 -max_len=1000 -timeout=5

# En parallèle (plusieurs terminaux)
./fuzzer corpus1/ -jobs=4 -workers=4

# Rejouer un crash
./fuzzer crash-xxxxx

# Minimiser un crash
./fuzzer -minimize_crash=1 crash-xxxxx
```

### honggfuzz

```bash
# Basique
honggfuzz -i seeds/ -o crashes/ -- ./target

# Mode persistent (plus rapide)
honggfuzz -i seeds/ -P -n 4 -- ./target

# Avec timeout personnalisé
honggfuzz -i seeds/ -t 10 -- ./target

# Arrêt au premier crash
honggfuzz --exit_upon_crash -i seeds/ -- ./target
```

### honggfuzz (mode QEMU)

```bash
# Mode QEMU (blackbox)
honggfuzz -z -i input/ -o output/ -- ./binary

# Mode persistent (si le binaire supporte HF_ITER)
honggfuzz -P -i input/ -o output/ -- ./binary

# Instances multiples (parallèle)
honggfuzz -z -i input/ -o output/ -n 4 -- ./binary
```

---

## 🐛 Sanitizers

### Variables d'environnement ASan

```bash
# Options ASan courantes
export ASAN_OPTIONS=detect_leaks=1:symbolize=1:abort_on_error=1

# Désactiver la détection de fuites (si trop verbeux)
export ASAN_OPTIONS=detect_leaks=0

# Rapport détaillé
export ASAN_OPTIONS=symbolize=1:print_stats=1:atexit=1
```

### Variables d'environnement UBSan

```bash
# Options UBSan
export UBSAN_OPTIONS=print_stacktrace=1:halt_on_error=1
```

---

## 📊 Analyse de crashes

### Avec GDB

```bash
# Lancer GDB sur un crash
gdb ./fuzzer
(gdb) run crash-xxxxx

# Ou directement
gdb --args ./fuzzer crash-xxxxx
(gdb) run

# Commandes GDB utiles
(gdb) bt              # Backtrace
(gdb) bt full         # Backtrace avec variables
(gdb) info registers  # Registres
(gdb) x/20x $rsp      # Examiner la stack
(gdb) disassemble     # Désassembler la fonction courante
```

### Avec Valgrind

```bash
# Détection de fuites mémoire
valgrind --leak-check=full ./program < crash-file

# Avec plus de détails
valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes ./program < crash-file
```

### Analyse binaire

```bash
# Type de fichier
file binary

# Strings intéressantes
strings binary | less
strings binary | grep -i password

# Symboles
nm binary | less

# Désassemblage
objdump -d binary | less
objdump -M intel -d binary | less  # Syntaxe Intel

# Headers
readelf -h binary
readelf -l binary  # Program headers

# Fonctions de la libc utilisées
objdump -T binary
```

---

## 📁 Gestion du corpus

### Minimisation du corpus

```bash
# Avec libFuzzer
mkdir minimized_corpus
./fuzzer -merge=1 minimized_corpus/ old_corpus/

# Le corpus minimized_corpus/ contient maintenant
# les inputs minimaux pour la même couverture
```

### Combiner des corpus

```bash
# Fusionner plusieurs corpus
mkdir merged_corpus
./fuzzer -merge=1 merged_corpus/ corpus1/ corpus2/ corpus3/
```

---

## 🔍 Couverture de code

### Générer un rapport de couverture

```bash
# 1. Compiler avec instrumentation de couverture
clang -fprofile-instr-generate -fcoverage-mapping program.c -o program_cov

# 2. Exécuter avec le corpus
for f in corpus/*; do
  LLVM_PROFILE_FILE="coverage_%m.profraw" ./program_cov < "$f"
done

# 3. Fusionner les données
llvm-profdata merge -sparse coverage_*.profraw -o coverage.profdata

# 4. Générer le rapport
llvm-cov show program_cov -instr-profile=coverage.profdata

# 5. Rapport textuel
llvm-cov report program_cov -instr-profile=coverage.profdata

# 6. Rapport HTML
llvm-cov show program_cov -instr-profile=coverage.profdata \
  -format=html -output-dir=coverage_html
```

---

## 📝 Dictionnaires

### Format de dictionnaire libFuzzer

```bash
# dictionnaire.dict
keyword_magic="MAGIC"
keyword_header="CFG1"
token_bracket_open="["
token_bracket_close="]"
token_equals="="
number_max="4294967295"
```

### Utilisation

```bash
./fuzzer corpus/ -dict=dictionnaire.dict
```

---

## 🛠️ Utilitaires

### Examiner les fichiers du corpus

```bash
# Affichage hexadécimal
xxd corpus/file1
xxd -l 100 corpus/file1  # Premiers 100 bytes

# Strings lisibles
strings corpus/file1

# Taille des fichiers
ls -lh corpus/

# Statistiques
wc -c corpus/*  # Taille en bytes
```

### Création de seeds

```bash
# Texte simple
echo "test input" > corpus/seed1

# Binaire avec Python
python3 -c "import sys; sys.stdout.buffer.write(b'\\x7fELF')" > corpus/seed2

# Depuis un fichier existant
cp /path/to/valid/file corpus/seed3
```

---

## 🔧 Dépannage

### Problème : "No instrumentation detected"

```bash
# Vérifier si le binaire est instrumenté
nm fuzzer | grep -i sanitizer
nm fuzzer | grep LLVMFuzzer

# Recompiler avec les bons flags
clang -fsanitize=fuzzer,address program.c -o fuzzer
```

### Problème : Fuzzer trop lent

```bash
# Compiler avec optimisations
clang -O2 -fsanitize=fuzzer,address program.c -o fuzzer

# Réduire le timeout
./fuzzer corpus/ -timeout=1

# Limiter la taille des inputs
./fuzzer corpus/ -max_len=1000
```

### Problème : Pas de crashes trouvés

```bash
# Vérifier que ASan fonctionne
./fuzzer crash-test-file  # Devrait crasher si ASan actif

# Augmenter le temps de fuzzing
./fuzzer corpus/ -max_total_time=3600

# Ajouter de meilleurs seeds
# Créer des seeds qui passent les validations initiales

# Utiliser un dictionnaire
./fuzzer corpus/ -dict=tokens.dict
```

### Problème : Out of memory

```bash
# Limiter la mémoire par test
./fuzzer corpus/ -rss_limit_mb=2048

# Ou désactiver la limite de mémoire (honggfuzz)
honggfuzz -i input/ -o output/ --rlimit_as=0 -- ./binary
```

---

## 📚 Options utiles

### libFuzzer

| Option | Description |
|--------|-------------|
| `-max_total_time=N` | Temps total max (secondes) |
| `-max_len=N` | Taille max des inputs |
| `-timeout=N` | Timeout par test (secondes) |
| `-jobs=N` | Nombre de jobs parallèles |
| `-workers=N` | Nombre de workers |
| `-dict=file` | Dictionnaire de tokens |
| `-minimize_crash=1` | Minimiser un crash |
| `-merge=1` | Fusionner des corpus |
| `-runs=N` | Nombre max d'exécutions |
| `-detect_leaks=0` | Désactiver la détection de fuites |

### honggfuzz

| Option | Description |
|--------|-------------|
| `-i dir` | Dossier des seeds |
| `-o dir` | Dossier de sortie |
| `-n N` | Nombre de threads |
| `-t N` | Timeout (secondes) |
| `-P` | Mode persistent |
| `--exit_upon_crash` | Arrêt au premier crash |
| `-v` | Mode verbeux |
| `-q` | Mode silencieux |


---

## 🎓 Bonnes pratiques

### Avant de fuzzer

1. ✅ Comprendre le code cible
2. ✅ Identifier les points d'entrée
3. ✅ Compiler avec ASan + UBSan
4. ✅ Créer de bons seeds
5. ✅ Tester manuellement d'abord

### Pendant le fuzzing

1. 📊 Surveiller la couverture
2. 🔄 Lancer plusieurs instances
3. 📝 Noter les crashes intéressants
4. 🎯 Ajuster les seeds si stagnation

### Après le fuzzing

1. 🐛 Analyser tous les crashes
2. 📉 Dédupl iquer les bugs similaires
3. ✂️ Minimiser les testcases
4. 📄 Documenter les vulnérabilités
5. 🔧 Proposer des corrections

---

## 🚀 Workflows complets

### Workflow libFuzzer

```bash
# 1. Compiler
clang -fsanitize=fuzzer,address -g target.c -o fuzzer

# 2. Créer corpus
mkdir corpus
echo "valid input" > corpus/seed1

# 3. Fuzzer
./fuzzer corpus/ -max_total_time=300

# 4. Analyser crashes
for crash in crash-*; do
  echo "=== $crash ==="
  ./fuzzer $crash 2>&1 | head -20
done

# 5. Minimiser
./fuzzer -minimize_crash=1 crash-best
```

### Workflow honggfuzz

```bash
# 1. Compiler
hfuzz-clang -fsanitize=address target.c -o target

# 2. Créer seeds
mkdir seeds
echo "test" > seeds/seed1

# 3. Fuzzer
honggfuzz -i seeds/ -n 4 --exit_upon_crash -- ./target

# 4. Analyser
./target < HONGGFUZZ.REPORT.TXT
```


---

## 🔗 Liens utiles

- [libFuzzer Documentation](https://llvm.org/docs/LibFuzzer.html)
- [honggfuzz GitHub](https://github.com/google/honggfuzz)

- [Fuzzing Book](https://www.fuzzingbook.org/)
- [Google Fuzzing Tutorial](https://github.com/google/fuzzing)

---

Bon fuzzing ! 🐛🔨
