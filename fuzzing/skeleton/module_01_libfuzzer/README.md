# Module 1 : Premiers pas avec libFuzzer

## Objectifs d'apprentissage

A la fin de ce module, vous serez capable de :

-   Comprendre ce qu'est ASan (AddressSanitizer) et pourquoi il est essentiel
-   Compiler un programme avec les sanitizers
-   Identifier et analyser un crash de buffer overflow
-   Ecrire votre premier harness libFuzzer
-   Comprendre le concept de fuzzing guidé par couverture de code
-   Fuzzer un programme avec des conditions complexes

## Durée estimée

45 minutes

---

## Introduction à libFuzzer

**libFuzzer** est un fuzzer de couverture de code (coverage-guided fuzzer) intégré dans LLVM/Clang. Il fonctionne en liant votre code avec une bibliothèque de fuzzing et en appelant de manière répétée une fonction spéciale appelée "harness" avec différentes entrées.

### Caractéristiques principales

-   **Guidé par couverture** : libFuzzer garde en mémoire les entrées qui découvrent de nouveaux chemins d'exécution
-   **Mutation intelligente** : Il mute les entrées intéressantes pour explorer plus de code
-   **In-process** : Très rapide car il n'y a pas de fork/exec
-   **Sanitizers** : Détecte automatiquement les bugs mémoire avec ASan, UBSan, etc.

### AddressSanitizer (ASan)

ASan est un détecteur de bugs mémoire qui peut trouver :

-   Buffer overflows (heap et stack)
-   Use-after-free
-   Use-after-return
-   Use-after-scope
-   Double-free
-   Memory leaks

**Important** : Sans ASan, beaucoup de bugs passent inaperçus même quand le fuzzer les déclenche !

---

## Exercice 1.0 : Comprendre un crash simple

**Objectif** : Compiler et exécuter un programme vulnérable pour voir ASan en action.

### Etape 1 : Examiner le code

Ouvrez le fichier `exercice_1.0/vuln_simple.c` :

```bash
cd exercice_1.0
cat vuln_simple.c
```

Ce programme contient une fonction `process_data()` qui copie des données dans un buffer fixe sans vérifier la taille.

### Etape 2 : Compiler avec ASan

Le script compile le programme avec :

-   `-fsanitize=address` : Active AddressSanitizer
-   `-g` : Ajoute les symboles de debug pour des traces plus détaillées
-   `-O1` : Optimisation légère pour garder la lisibilité

### Etape 3 : Tester le programme

```bash
# Test avec une entrée petite (safe)
echo "HELLO" | ./vuln_simple

# Test avec une entrée grande (overflow)
echo "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" | ./vuln_simple
```

**Question** : Que se passe-t-il ? Analysez le rapport d'ASan.

### Points d'apprentissage

-   ASan détecte le buffer overflow immédiatement
-   Le rapport montre exactement où l'overflow se produit
-   Sans ASan, ce bug pourrait corrompre silencieusement la mémoire

---

## Exercice 1.1 : Premier harness libFuzzer

**Objectif** : Ecrire un harness libFuzzer pour fuzzer automatiquement la fonction vulnérable.

### Etape 1 : Comprendre le harness

Un harness libFuzzer est une fonction avec cette signature :

```c
int LLVMFuzzerTestOneInput(const uint8_t *Data, size_t Size) {
    // Votre code à tester ici
    return 0;
}
```

-   `Data` : Les données générées par le fuzzer
-   `Size` : La taille des données
-   Retour `0` : Continue le fuzzing
-   Retour `-1` : Rejette cette entrée (rare)

### Etape 2 : Examiner le harness

```bash
cd ../exercice_1.1
cat harness_simple.c
```

Le harness :

1. Vérifie que Size > 0 (évite les cas triviaux)
2. Alloue un buffer et copie les données
3. Appelle la fonction vulnérable
4. Libère la mémoire

### Etape 3 : Compiler le harness

Le script compile avec :

-   `-fsanitize=fuzzer` : Lie avec libFuzzer
-   `-fsanitize=address` : Active ASan pour détecter les bugs
-   `-g` : Symboles de debug

### Etape 4 : Lancer le fuzzer

```bash
./fuzzer
```

**Observations** :

```
INFO: Seed: 1234567890
INFO: Running with entropic power schedule
#2      INITED cov: 4 ft: 5 corp: 1/1b exec/s: 0 rss: 31Mb
#8      NEW    cov: 5 ft: 6 corp: 2/3b lim: 4 exec/s: 0 rss: 31Mb
...
==12345==ERROR: AddressSanitizer: heap-buffer-overflow
```

Le fuzzer va rapidement trouver le crash !

### Comprendre la sortie

-   `cov` : Nombre de blocs de couverture découverts
-   `ft` : Features (chemin d'exécution unique)
-   `corp` : Taille du corpus (entrées intéressantes gardées)
-   `exec/s` : Exécutions par seconde
-   `rss` : Mémoire utilisée

### Etape 5 : Analyser le crash

Quand le fuzzer trouve un crash, il crée des fichiers :

-   `crash-*` : L'entrée qui cause le crash
-   `slow-unit-*` : Entrées lentes (timeouts)

Examinez le crash :

```bash
# Voir le contenu hexadécimal
xxd crash-*

# Rejouer le crash
./fuzzer crash-*
```

### Points d'apprentissage

-   libFuzzer trouve automatiquement les bugs en quelques secondes
-   Il garde un corpus minimal d'entrées intéressantes
-   Le fuzzing guidé par couverture est très efficace

---

## Exercice 1.2 : Fuzzing avec conditions complexes

**Objectif** : Comprendre comment libFuzzer explore les branches conditionnelles.

### Etape 1 : Examiner le code

```bash
cd ../exercice_1.2
cat vuln_conditions.c
```

Ce programme vérifie des "magic bytes" :

-   Le premier byte doit être 'F'
-   Le deuxième byte doit être 'U'
-   Le troisième byte doit être 'Z'
-   Le quatrième byte doit être 'Z'
-   Si tous correspondent, un buffer overflow se produit

### Etape 2 : Compiler et fuzzer

```bash
./fuzzer
```

### Observations

Le fuzzer devrait trouver le crash même avec ces conditions strictes. Pourquoi ?

**Réponse** : libFuzzer utilise la couverture de code pour guider ses mutations. Quand une entrée découvre une nouvelle branche (par exemple, 'F' est trouvé), cette entrée est gardée et mutée davantage.

### Etape 3 : Utiliser un dictionnaire (optionnel)

Pour accélérer la découverte, créez un dictionnaire :

```bash
cat > fuzzer.dict << 'EOF'
# Magic bytes
magic_f="F"
magic_u="U"
magic_z="Z"
magic_fuzz="FUZZ"
EOF

# Relancer avec le dictionnaire
./fuzzer -dict=fuzzer.dict
```

### Points d'apprentissage

-   libFuzzer peut franchir des conditions strictes grâce à la couverture
-   Les dictionnaires accélèrent la découverte de branches difficiles
-   Le fuzzing guidé est beaucoup plus efficace qu'un fuzzing aléatoire

---

## Récapitulatif

Dans ce module, vous avez appris :

1. **ASan** est essentiel pour détecter les bugs mémoire pendant le fuzzing
2. Un **harness libFuzzer** a une signature simple : `LLVMFuzzerTestOneInput()`
3. libFuzzer est **guidé par couverture** : il garde les entrées qui découvrent de nouveaux chemins
4. Le fuzzing peut franchir des **conditions complexes** automatiquement
5. Les **dictionnaires** peuvent accélérer la découverte de branches difficiles

## Prochaines étapes

Dans le Module 2, vous allez :

-   Fuzzer des parsers plus complexes (commandes, JSON)
-   Utiliser des corpus initiaux (seeds)
-   Trouver plusieurs bugs dans un même programme
-   Comprendre les stratégies de mutations

---

## Commandes utiles

### Compiler avec ASan uniquement

```bash
clang -fsanitize=address -g -O1 program.c -o program
```

### Compiler un harness libFuzzer

```bash
clang -fsanitize=fuzzer,address -g program.c -o fuzzer
```

### Options libFuzzer utiles

```bash
./fuzzer -help=1                    # Aide complète
./fuzzer -max_len=256               # Limite la taille des entrées
./fuzzer -timeout=10                # Timeout par exécution (secondes)
./fuzzer -dict=my.dict              # Utiliser un dictionnaire
./fuzzer -runs=1000000              # Nombre max d'exécutions
./fuzzer -max_total_time=3600       # Temps total max (secondes)
./fuzzer corpus/                    # Utiliser/sauver un corpus
./fuzzer crash-file                 # Rejouer un crash
```

### Nettoyer

```bash
rm -f fuzzer crash-* leak-* slow-unit-* *.o
```

---

## Resources

-   [libFuzzer Tutorial](https://github.com/google/fuzzing/blob/master/tutorial/libFuzzerTutorial.md)
-   [AddressSanitizer Documentation](https://clang.llvm.org/docs/AddressSanitizer.html)

---

Bon fuzzing !
