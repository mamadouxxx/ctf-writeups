# Module 4 : Fuzzing Blackbox

## Objectifs d'apprentissage

Ce module vous introduit au **fuzzing blackbox** - l'art de fuzzer des binaires sans avoir accès au code source. Cette compétence est essentielle pour :

- Analyser des logiciels propriétaires
- Auditer des bibliothèques tierces
- Combiner reverse engineering et fuzzing
- Tester des binaires legacy sans documentation

**Compétences acquises** :
- Fuzzer des binaires compilés sans instrumentation source
- Utiliser honggfuzz en mode QEMU pour l'instrumentation binaire
- Techniques de base de reverse engineering
- Analyser des crashes sans accès au code source

---

## Théorie : Fuzzing Blackbox vs Whitebox

### Whitebox Fuzzing (Modules précédents)

Dans les modules précédents, nous avions accès au code source :
- Compilation avec instrumentation (SanitiZers, coverage)
- Feedback précis sur la couverture de code
- Debugging facile avec les informations de ligne
- Modification du code possible pour améliorer le fuzzing

### Blackbox Fuzzing (Ce module)

En fuzzing blackbox, nous n'avons que le binaire :
- Pas de code source disponible
- Instrumentation par émulation (QEMU)
- Reverse engineering nécessaire pour comprendre le comportement
- Analyse de crashes plus complexe

### Cas d'usage réels

Le fuzzing blackbox est utilisé pour :
- **Audits de sécurité** : Logiciels propriétaires, firmware
- **Bug bounty** : Applications fermées
- **Legacy code** : Binaires sans sources disponibles
- **Malware analysis** : Étude de comportements malveillants

---

## honggfuzz et le mode QEMU

### Qu'est-ce que QEMU ?

**QEMU** (Quick Emulator) est un émulateur open-source qui peut :
- Émuler différentes architectures CPU
- Intercepter l'exécution d'instructions
- Instrumenter du code binaire à la volée

### honggfuzz QEMU mode

honggfuzz utilise QEMU pour instrumenter les binaires sans recompilation :

```
Binaire non instrumenté → QEMU → Instrumentation runtime → Feedback coverage
```

**Avantages** :
- Fonctionne sur n'importe quel binaire
- Pas besoin du code source
- Coverage feedback similaire au whitebox

**Inconvénients** :
- Plus lent (5-10x) que l'instrumentation compilée
- Moins précis dans certains cas
- Overhead de l'émulation

---

## Installation de honggfuzz

## Installation de honggfuzz

### 1. Installation de honggfuzz

Si vous n'avez pas encore installé honggfuzz, voici les instructions complètes :

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

### 2. Vérification de l'installation

```bash
honggfuzz --version
# Devrait afficher : honggfuzz version 2.x
```

---

## Exercice 4.2 : Fuzzing d'un binaire sans source

### Objectif

Vous allez recevoir un binaire compilé sans accès au code source. Votre mission :
1. Analyser le binaire avec des outils de reverse engineering
2. Comprendre son comportement attendu
3. Fuzzer le binaire avec honggfuzz en mode QEMU
4. Trouver et analyser les crashes

### Scénario

Vous êtes auditeur de sécurité et avez reçu un binaire d'un client. Le programme lit des données depuis stdin et les traite. Le client suspecte des bugs de sécurité mais n'a plus le code source.

### Étape 1 : Analyse préliminaire

Avant de fuzzer, analysez le binaire :

```bash
cd exercice_4.2/

# Vérifier le type de fichier
file blackbox_target

# Vérifier les protections de sécurité
checksec blackbox_target  # Si disponible
# Ou
readelf -l blackbox_target | grep -i stack

# Lister les symboles (si non strippé)
nm blackbox_target

# Strings intéressantes
strings blackbox_target

# Désassemblage basique
objdump -d blackbox_target | less
```

**Questions à se poser** :
- Quelle architecture ? (x86-64, ARM, etc.)
- Quelles protections sont activées ? (NX, PIE, Stack Canary)
- Y a-t-il des strings qui donnent des indices ?
- Quelles fonctions de la libc sont utilisées ?

### Étape 2 : Test manuel

Testez le binaire manuellement pour comprendre son comportement :

```bash
# Test avec entrée simple
echo "Hello" | ./blackbox_target

# Test avec entrée vide
echo "" | ./blackbox_target

# Test avec entrée longue
python3 -c "print('A' * 100)" | ./blackbox_target

# Test avec caractères spéciaux
echo -e "\\x00\\x01\\x02" | ./blackbox_target
```

Notez :
- Les messages d'erreur
- Les codes de retour
- Les comportements inattendus

### Étape 3 : Préparation du fuzzing

Créez un répertoire pour les seeds initiaux :

```bash
mkdir -p input
mkdir -p output

# Créer quelques seeds basés sur vos tests
echo "Hello" > input/seed1.txt
echo "Test123" > input/seed2.txt
echo "AAAA" > input/seed3.txt
```

### Étape 4 : Lancer honggfuzz en mode QEMU

```bash
# Lancer honggfuzz avec QEMU mode
honggfuzz -z -i input -o output -- ./blackbox_target

# Options expliquées :
# -z           : Active le mode QEMU
# -i input     : Répertoire des seeds
# -o output    : Répertoire des résultats
# --           : Séparateur
# ./blackbox_target : Le binaire à fuzzer
```

**Note** : Le mode QEMU est plus lent. Soyez patient ! La couverture augmente progressivement.

### Étape 5 : Analyse des crashes

Une fois des crashes trouvés :

```bash
# Lister les crashes
ls -la output/*.fuzz

# Reproduire un crash
./blackbox_target < output/HONGGFUZZ.REPORT.xxxx.fuzz

# Analyser avec GDB
gdb ./blackbox_target
(gdb) run < output/HONGGFUZZ.REPORT.xxxx.fuzz
(gdb) bt          # Backtrace
(gdb) info registers
(gdb) x/20x $rsp  # Examiner la stack
```

### Étape 6 : Analyse avancée (optionnel)

Pour une analyse plus approfondie :

```bash
# Utiliser valgrind
valgrind --leak-check=full ./blackbox_target < crash_file

# Utiliser strace pour voir les syscalls
strace ./blackbox_target < crash_file

# Désassembler avec Ghidra ou IDA (si disponible)
```

---

## Techniques de Reverse Engineering pour le Fuzzing

### 1. Identifier les points d'entrée

Cherchez les fonctions qui lisent les entrées :
- `read()`, `fread()`, `fgets()`
- `scanf()`, `getchar()`
- `recv()`, `recvfrom()` (réseau)

### 2. Identifier les fonctions dangereuses

Fonctions souvent sources de bugs :
- `strcpy()`, `strcat()`, `sprintf()` (buffer overflow)
- `malloc()`, `free()` (use-after-free, double-free)
- `memcpy()`, `memmove()` (out-of-bounds)

### 3. Analyser le flux de contrôle

Utilisez des outils comme :
- **objdump** : Désassemblage simple
- **Ghidra** : Décompilateur puissant et gratuit
- **radare2** : Framework de reverse engineering
- **IDA Free** : Version gratuite d'IDA Pro

### 4. Identifier les checksums/validations

Cherchez :
- Comparaisons de magic bytes
- Calculs de checksums (CRC, MD5, etc.)
- Validations de format

Ces éléments peuvent ralentir le fuzzing. En mode blackbox, il est difficile de les contourner sans patcher le binaire.

---

## Challenge Binaries

Le répertoire `challenge_binaries/` contient des binaires supplémentaires pour vous entraîner. Voir le README dans ce dossier pour plus de détails.

---

## Conseils et Best Practices

### Optimiser honggfuzz en mode QEMU

```bash
# Utiliser plusieurs instances en parallèle
# Terminal 1 (master)
honggfuzz -z -i input -o output -n 1 -- ./target

# Terminal 2 (slave)
honggfuzz -z -i input -o output -n 1 -- ./target

# Terminal 3 (slave)
honggfuzz -z -i input -o output -n 1 -- ./target
```

### Améliorer les seeds

Plus vos seeds sont proches du format attendu, meilleur sera le fuzzing :
- Analysez les strings dans le binaire
- Regardez les messages d'erreur
- Utilisez `ltrace` pour voir les comparaisons de strings

```bash
ltrace ./blackbox_target < input/seed1.txt 2>&1 | grep strcmp
```

### Surveiller la progression

```bash
# Voir les stats d'un fuzzer
watch -n 1 'cat output/last_report.log'
```

### Si honggfuzz ne trouve rien

1. **Vérifiez que QEMU fonctionne** :
   ```bash
   honggfuzz -z -i input -o output -- ./target
   ```

2. **Ajoutez plus de seeds diversifiés**

3. **Vérifiez les protections** : Certains binaires peuvent détecter QEMU

4. **Augmentez le temps** : Le mode QEMU est lent, laissez-le tourner plus longtemps

---

## Comparaison : Whitebox vs Blackbox

| Aspect | Whitebox (Modules 1-3) | Blackbox (Module 4) |
|--------|------------------------|---------------------|
| Code source | Disponible | Indisponible |
| Instrumentation | Compile-time | Runtime (QEMU) |
| Performance | Rapide | Lent (5-10x) |
| Coverage precision | Très précise | Bonne |
| Debugging | Facile | Complexe |
| SanitiZers | Disponibles | Limités |
| Cas d'usage | Dev, tests | Audit, security research |

---

## Outils complémentaires

### Pour l'analyse binaire

- **Ghidra** : https://ghidra-sre.org/
- **radare2** : https://github.com/radareorg/radare2
- **Binary Ninja** : https://binary.ninja/ (payant, mais version Cloud gratuite)
- **Cutter** : https://cutter.re/ (GUI pour radare2)

### Pour le fuzzing avancé

- **Techniques avancées avec honggfuzz** : Fuzzing de kernels, émulation
- **LibFuzzer** : Framework de fuzzing modulaire

---

## Points de contrôle

Avant de passer au module suivant, assurez-vous de pouvoir :

- [ ] Installer honggfuzz avec support QEMU
- [ ] Analyser un binaire avec `file`, `strings`, `objdump`
- [ ] Lancer honggfuzz en mode QEMU
- [ ] Trouver au moins un crash dans `blackbox_target`
- [ ] Reproduire et analyser un crash avec GDB
- [ ] Comprendre les différences entre whitebox et blackbox fuzzing

---

## Pour aller plus loin

### Techniques avancées

1. **Binary patching** : Modifier le binaire pour améliorer le fuzzing
   - Retirer les checksums
   - Bypass les protections anti-fuzzing
   - Utiliser `dd`, `xxd`, ou des outils comme Ghidra

2. **Symbolic execution** : Combiner fuzzing et execution symbolique
   - **angr** : Framework d'analyse binaire Python
   - **Manticore** : Symbolic execution tool

3. **Fuzzing de protocoles réseau** :
   - honggfuzz avec persistent mode pour le réseau
   - **Preeny** : Hook les fonctions réseau vers stdin/stdout

### Ressources

- **Nightmare** : Cours de binary exploitation
  https://guyinatuxedo.github.io/

- **honggfuzz Documentation** :
  https://github.com/google/honggfuzz/blob/master/docs/USAGE.md

- **Fuzzing Book** (chapitre sur greybox fuzzing) :
  https://www.fuzzingbook.org/

---

## Récapitulatif

Dans ce module, vous avez appris :

1. **Différence whitebox/blackbox** : Avantages et limitations de chaque approche
2. **honggfuzz QEMU mode** : Fuzzer des binaires sans recompilation
3. **Reverse engineering basique** : Analyser un binaire pour préparer le fuzzing
4. **Workflow complet** : De l'analyse à la découverte de crashes

**Prochaine étape** : Module 5 - Challenge final où vous appliquerez toutes les techniques apprises !

---

Bon fuzzing blackbox ! N'oubliez pas : l'analyse préliminaire est la clé du succès en fuzzing blackbox.
