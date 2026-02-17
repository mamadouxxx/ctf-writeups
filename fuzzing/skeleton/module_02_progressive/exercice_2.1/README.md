# Exercice 2.1 : Parser JSON

**Objectif** : Fuzzer un parser JSON simplifié qui contient plusieurs types de bugs.

## Code

Le fichier `json_parser.c` contient un parser JSON. Il contient intentionnellement plusieurs bugs :
- Stack overflow
- Heap overflow
- Integer overflow
- NULL pointer dereference
- Memory leak

## Compilation

### Fuzzer

Pour compiler le programme avec libFuzzer et les sanitizers, utilisez la commande suivante :
```bash
clang -g -fsanitize=fuzzer,address,undefined -fno-omit-frame-pointer harness_json_parser.c json_parser_logic.c -o json_parser_fuzzer
```

### Binaire standalone (pour le test manuel)

Pour compiler une version standalone du programme, utilisez la commande suivante :
```bash
clang -g -DSTANDALONE -fsanitize=address harness_json_parser.c json_parser_logic.c -o json_parser_standalone
```

## Lancement du Fuzzer

Utilisez les graines (`seeds`) fournies pour commencer le fuzzing. Un dictionnaire est également fourni pour aider le fuzzer.
```bash
./json_parser_fuzzer seeds/ -max_total_time=600 -dict=json.dict
```
Le fuzzer devrait trouver plusieurs crashes.

## Analyse des crashes

Pour chaque crash trouvé, vous pouvez le rejouer avec la commande suivante :
```bash
./json_parser_fuzzer crash-xxxxx
```
Analysez le rapport d'ASan pour comprendre la nature de chaque bug.
