# Module 2 : Fuzzing Progressif

## Objectifs pédagogiques

Dans ce module, vous allez :

-   Fuzzer des parsers plus complexes avec plusieurs chemins d'exécution
-   Utiliser des corpus initiaux (seeds) pour guider le fuzzing
-   Trouver plusieurs bugs différents dans un même programme
-   Comprendre l'importance de la qualité des seeds
-   Analyser et comprendre différents types de vulnérabilités

## Durée estimée

1h15 (10h45 - 12h00)

---

## Exercice 2.0 : Parser de Commandes

### Contexte

Vous allez fuzzer un parser de commandes simplifié qui accepte des commandes de type shell. Ce parser contient plusieurs bugs de différentes natures.

### Structure du parser

Le parser accepte des commandes au format :

```
COMMAND arg1 arg2 arg3
```

Commandes supportées :

-   `HELP` - Affiche l'aide
-   `EXIT` - Quitte le programme
-   `SET key value` - Définit une variable
-   `GET key` - Récupère une variable
-   `EXEC program args...` - Exécute un programme
-   `LIST` - Liste toutes les variables

### Bugs intentionnels

Ce programme contient **4 bugs différents** :

1. **Buffer overflow** dans le parsing des arguments
2. **Use-after-free** dans la gestion des variables
3. **Integer overflow** dans le comptage des arguments
4. **Format string** dans l'affichage d'erreurs

### Instructions

1. **Examinez le code source** (`command_parser.c`)

    - Lisez attentivement le code
    - Repérez les zones dangereuses
    - Identifiez les bugs potentiels

2. **Compilez le programme**

    ```bash
    cd exercice_2.0
    ```

3. **Testez manuellement** (optionnel)

    ```bash
    echo "HELP" | ./command_parser_fuzzer
    ```

4. **Créez un corpus de seeds**

    - Des seeds de base sont fournis dans `seeds/`
    - Créez-en d'autres si nécessaire

5. **Lancez le fuzzing**

    ```bash
    ./command_parser_fuzzer seeds/ -max_total_time=300
    ```

6. **Analysez les crashes**
    ```bash
    # Pour chaque crash trouvé dans crash-*
    ./command_parser_fuzzer crash-xxxxx
    ```

### Questions à se poser

-   Quels types de bugs avez-vous trouvés ?
-   Dans quelle fonction se produisent-ils ?
-   Quel est l'input qui déclenche chaque bug ?
-   Comment pourriez-vous corriger ces bugs ?

### Seeds fournis

-   `seed1` : Commande HELP simple
-   `seed2` : Commande SET avec deux arguments
-   `seed3` : Commande EXEC avec plusieurs arguments

---

## Exercice 2.1 : Parser JSON

### Contexte

Vous allez fuzzer un parser JSON simplifié. JSON est un format de données très utilisé, et les parsers JSON sont souvent la cible d'attaques.

### Format JSON supporté

Le parser supporte :

-   Objets : `{ "key": "value" }`
-   Tableaux : `[ 1, 2, 3 ]`
-   Chaînes : `"texte"`
-   Nombres : `42`, `3.14`
-   Booléens : `true`, `false`
-   Null : `null`
-   Imbrication limitée

### Bugs intentionnels

Ce programme contient **5 bugs différents** :

1. **Stack overflow** lors de l'imbrication profonde
2. **Heap overflow** dans le parsing des chaînes
3. **Integer overflow** dans la taille des tableaux
4. **NULL pointer dereference** sur JSON malformé
5. **Memory leak** dans la gestion des erreurs

### Instructions

1. **Examinez le code source** (`json_parser.c`)

    - Identifiez les fonctions récursives
    - Repérez les allocations mémoire
    - Cherchez les vérifications manquantes

2. **Compilez le programme**

    ```bash
    cd exercice_2.1
    ```

3. **Testez avec les seeds fournis**

    ```bash
    cat seeds/seed1.json | ./json_parser_fuzzer
    ```

4. **Lancez le fuzzing**

    ```bash
    ./json_parser_fuzzer seeds/ -max_total_time=600 -dict=json.dict
    ```

5. **Analysez les crashes**

    ```bash
    # Testez chaque crash
    ./json_parser_fuzzer crash-xxxxx

    # Affichez le contenu
    xxd crash-xxxxx
    ```

### Seeds fournis

-   `seed1.json` : Objet JSON simple
-   `seed2.json` : Tableau avec différents types
-   `seed3.json` : Objet imbriqué à 2 niveaux
-   `seed4.json` : Tableau de tableaux

### Dictionnaire JSON (optionnel)

Créez un fichier `json.dict` avec des tokens JSON communs :

```
token_quote="\""
token_lbrace="{"
token_rbrace="}"
token_lbracket="["
token_rbracket="]"
token_colon=":"
token_comma=","
token_true="true"
token_false="false"
token_null="null"
```

---

## Conseils généraux

### Optimiser le fuzzing

1. **Qualité des seeds**

    - Utilisez des inputs valides et variés
    - Couvrez différents chemins d'exécution
    - Incluez des cas limites

2. **Options utiles de libFuzzer**

    ```bash
    # Limiter le temps
    -max_total_time=300

    # Limiter la taille des inputs
    -max_len=1024

    # Nombre de jobs en parallèle
    -jobs=4

    # Imprimer les stats
    -print_final_stats=1

    # Dictionnaire pour guider les mutations
    -dict=tokens.dict
    ```

3. **Corpus management**

    ```bash
    # Minimiser le corpus
    ./fuzzer -merge=1 new_corpus/ old_corpus/

    # Minimiser un crash
    ./fuzzer -minimize_crash=1 crash-file
    ```

### Analyser les crashes

1. **Reproduire le crash**

    ```bash
    ./fuzzer crash-file
    ```

2. **Avec GDB**

    ```bash
    gdb ./fuzzer
    (gdb) run crash-file
    (gdb) bt  # backtrace
    (gdb) info registers
    ```

3. **Avec AddressSanitizer**
    - ASan fournit déjà des informations détaillées
    - Identifiez le type de bug (heap-buffer-overflow, use-after-free, etc.)
    - Notez la stack trace complète

### Types de bugs courants

| Type de bug      | Description                      | Dangerosité |
| ---------------- | -------------------------------- | ----------- |
| Buffer overflow  | Écriture hors limites            | Critique    |
| Use-after-free   | Utilisation de mémoire libérée   | Critique    |
| Integer overflow | Dépassement d'entier             | Élevée      |
| NULL deref       | Déréférencement de pointeur NULL | Moyenne     |
| Memory leak      | Fuite mémoire                    | Faible      |
| Format string    | Chaîne de format non contrôlée   | Critique    |

---

## Points de contrôle

### Minimum requis

-   [ ] Compiler les deux exercices avec succès
-   [ ] Lancer le fuzzing sur les deux programmes
-   [ ] Trouver au moins 2 bugs dans l'exercice 2.0
-   [ ] Trouver au moins 2 bugs dans l'exercice 2.1
-   [ ] Comprendre la nature de chaque bug trouvé

### Pour aller plus loin

-   [ ] Trouver tous les bugs (4 dans ex 2.0, 5 dans ex 2.1)
-   [ ] Créer des seeds supplémentaires pour améliorer la couverture
-   [ ] Minimiser les crashes avec `-minimize_crash=1`
-   [ ] Proposer des patches pour corriger les bugs
-   [ ] Créer un dictionnaire personnalisé pour le JSON

---

## Ressources

### Documentation libFuzzer

-   Options : https://llvm.org/docs/LibFuzzer.html#options
-   Corpus : https://llvm.org/docs/LibFuzzer.html#corpus
-   Dictionnaires : https://llvm.org/docs/LibFuzzer.html#dictionaries

### Articles sur le fuzzing

-   Google OSS-Fuzz : https://github.com/google/oss-fuzz
-   Fuzzing JSON parsers : https://blog.forallsecure.com/fuzzing-json-parsers

### Outils d'analyse

```bash
# Vérifier la couverture
llvm-cov show ./fuzzer -instr-profile=default.profdata

# Analyser les allocations
valgrind --leak-check=full ./fuzzer input

# Désassembler
objdump -d ./fuzzer | less
```

---

## Passage au Module 3

Une fois ce module terminé, vous devriez :

-   Être capable de fuzzer des parsers complexes
-   Comprendre l'importance des seeds
-   Savoir analyser différents types de bugs
-   Être prêt à découvrir honggfuzz

**Prochaine étape** : [Module 3 - Introduction à honggfuzz](../module_03_honggfuzz/)

---

**Bon fuzzing !** 🐛🔨
