# Exercice 3.2 : Fuzzing de libxml2

**Objectif** : Fuzzer une vraie bibliothèque open source, libxml2, avec honggfuzz.

## Code

Le fichier `fuzz_libxml2.c` contient un harness de fuzzing pour la bibliothèque libxml2. Il utilise le mode "persistent" de honggfuzz pour des performances optimales.

## Prérequis

Avant de compiler et de lancer le fuzzer, vous devez installer `libxml2`.

### Linux (Ubuntu/Debian)

```bash
sudo apt-get update
sudo apt-get install -y libxml2-dev pkg-config
```

### macOS

```bash
brew install libxml2
export PKG_CONFIG_PATH="/usr/local/opt/libxml2/lib/pkgconfig"
```

## Compilation

Pour compiler le harness avec honggfuzz et libxml2, utilisez la commande suivante :

```bash
hfuzz-clang -fsanitize=address,undefined -g -Wall -Wextra $(pkg-config --cflags libxml-2.0) fuzz_libxml2.c -o fuzz_libxml2 $(pkg-config --libs libxml-2.0)
```

## Lancement du Fuzzer

Utilisez les graines (`seeds`) fournies pour commencer le fuzzing.

### Mode simple
```bash
honggfuzz -i seeds/ -n 4 -- ./fuzz_libxml2
```

### Mode persistent (plus performant)
```bash
honggfuzz -i seeds/ -P -n 8 -- ./fuzz_libxml2
```

- `-P` : Active le mode persistent.

libxml2 est une bibliothèque mature, trouver des bugs peut prendre du temps.
