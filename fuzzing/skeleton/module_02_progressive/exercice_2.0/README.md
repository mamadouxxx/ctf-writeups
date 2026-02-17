# Exercice 2.0 : Parser de Commandes

**Objectif** : Fuzzer un parser de commandes simplifié qui contient plusieurs types de bugs.

## Code

Le fichier `command_parser.c` contient un parser de commandes qui accepte des commandes simples. Il contient intentionnellement plusieurs bugs :
- Buffer overflow
- Use-after-free
- Integer overflow
- Format string

## Compilation

### Fuzzer

Pour compiler le programme avec libFuzzer et les sanitizers, utilisez la commande suivante :
```bash
clang -g -fsanitize=fuzzer,address,undefined -fno-omit-frame-pointer harness_command_parser.c command_parser_logic.c -o command_parser_fuzzer
```

### Binaire standalone (pour le test manuel)

Pour compiler une version standalone du programme, utilisez la commande suivante :
```bash
clang -g -DSTANDALONE -fsanitize=address harness_command_parser.c command_parser_logic.c -o command_parser_standalone
```

## Lancement du Fuzzer

Utilisez les graines (`seeds`) fournies pour commencer le fuzzing :
```bash
./command_parser_fuzzer seeds/ -max_total_time=300
```
Le fuzzer devrait trouver plusieurs crashes.

## Analyse des crashes

Pour chaque crash trouvé, vous pouvez le rejouer avec la commande suivante :
```bash
./command_parser_fuzzer crash-xxxxx
```
Analysez le rapport d'ASan pour comprendre la nature de chaque bug.
