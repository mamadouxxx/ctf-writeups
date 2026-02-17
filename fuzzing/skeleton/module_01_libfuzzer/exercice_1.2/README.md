# Exercice 1.2 : Fuzzing avec conditions complexes

**Objectif** : Comprendre comment libFuzzer explore les branches conditionnelles.

## Code

Le fichier `vuln_conditions.c` contient un programme qui vérifie des "magic bytes".
- Le premier octet doit être 'F'
- Le deuxième octet doit être 'U'
- Le troisième octet doit être 'Z'
- Le quatrième octet doit être 'Z'
- Si tous les octets correspondent, un débordement de tampon se produit.

## Compilation

Pour compiler le programme avec libFuzzer et AddressSanitizer, utilisez la commande suivante :

```bash
clang -fsanitize=fuzzer,address -g -fno-omit-frame-pointer -Wall -Wextra harness_conditions.c vuln_conditions_logic.c -o fuzzer
```

## Lancement du Fuzzer

Pour lancer le fuzzer, exécutez la commande suivante :

```bash
./fuzzer
```

Le fuzzer devrait trouver le crash même avec ces conditions strictes. libFuzzer utilise la couverture de code pour guider ses mutations. Quand une entrée découvre une nouvelle branche (par exemple, 'F' est trouvé), cette entrée est gardée et mutée davantage.

### Utiliser un dictionnaire (optionnel)

Pour accélérer la découverte, vous pouvez créer un dictionnaire :

```bash
cat > fuzzer.dict << 'EOF'
# Magic bytes
magic_f="F"
magic_u="U"
magic_z="Z"
magic_fuzz="FUZZ"
EOF
```

Et lancer le fuzzer avec le dictionnaire :

```bash
./fuzzer -dict=fuzzer.dict
```
