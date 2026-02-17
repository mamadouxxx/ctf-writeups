# Module 4 - Exercise 4.2: Instructor Notes

## Vue d'ensemble

Cet exercice enseigne aux étudiants les techniques de fuzzing blackbox en leur fournissant un binaire compilé contenant plusieurs vulnérabilités intentionnelles. Les étudiants doivent utiliser le rétro-ingénierie et le fuzzing pour découvrir ces bugs sans accès au code source.

---

## Résumé des vulnérabilités

Le binaire `blackbox_target` contient 4 vulnérabilités intentionnelles de difficulté variable :

### 1. Débordement de tampon (Facile)

-   **Emplacement**: `parse_command()` function
-   **Type**: Débordement de tampon basé sur la pile
-   **Déclencheur**: Input longer than 256 bytes
-   **Cause première**: `strcpy()` without bounds checking
-   **Entrée de test**: `python3 -c "print('A' * 300)" | ./blackbox_target`

### 2. Vulnérabilité de chaîne de format (Moyenne)

-   **Emplacement**: `execute_command()` function
-   **Type**: Vulnérabilité de chaîne de format
-   **Déclencheur**: Command "DEBUG" with format specifiers in data
-   **Cause première**: `printf(cmd->data)` without format string
-   **Entrée de test**: `echo "DEBUG %x.%x.%x.%x.%s" | ./blackbox_target`

### 3. Débordement d'entier -> Débordement de tas (Difficile)

-   **Emplacement**: `process_data()` function
-   **Type**: Débordement d'entier entraînant une allocation sous-dimensionnée
-   **Déclencheur**: Command "PROCESS PROC:4294967295:DATA"
-   **Cause première**: `alloc_size = proc_len + 1` wraps around with large proc_len
-   **Entrée de test**: `echo "PROCESS PROC:4294967295:DATADATA" | ./blackbox_target`

### 4. Utilisation après libération (Difficile)

-   **Emplacement**: `handle_special_command()` function
-   **Type**: Utilisation après libération
-   **Déclencheur**: Command "SPECIAL MAGIC123TRIGGER"
-   **Cause première**: Accès à `cmd->data` après l'appel à `free()`
-   **Entrée de test**: `echo "SPECIAL MAGIC123TRIGGER" | ./blackbox_target`

---

## Instructions de compilation

### Pour la distribution aux étudiants (Blackbox)

```bash
cd exercice_4.2/
```

Ceci crée :

-   `blackbox_target` - Binaire "strippé" sans symboles de débogage
-   Sans sanitizers
-   Sans accès au code source

**Distribution** : Uniquement le binaire `blackbox_target` et le README du module aux étudiants.

### Pour les tests de l'instructeur (Whitebox)

```bash
cd exercice_4.2/
./compile_instructor.sh
```

Ceci crée :

-   `blackbox_target_asan` - Binaire avec AddressSanitizer + UBSan
-   `blackbox_target_asan_only` - Binaire avec uniquement AddressSanitizer
-   `test_bugs.sh` - Script de test automatisé

---

## Workflow étudiant attendu

### Phase 1 : Reconnaissance (15-20 minutes)

Les étudiants doivent analyser le binaire en utilisant :

```bash
# Informations sur le fichier
file blackbox_target

# Chaînes de caractères lisibles
strings blackbox_target

# Analyse des symboles
nm blackbox_target  # Devrait afficher "aucun symbole"

# Désassemblage
objdump -d blackbox_target | less

# Fonctions de bibliothèque utilisées
objdump -d blackbox_target | grep -E "call.*<.*@plt>"

# Protections de sécurité
checksec blackbox_target  # Si disponible
```

**Découvertes attendues** :

-   Chaînes de caractères : "ECHO", "DEBUG", "PROCESS", "SPECIAL", "MAGIC123", "PROC:", "TRIGGER"
-   Fonctions : strcpy, printf, malloc, free, strcmp, strstr
-   Indices sur la structure des commandes à partir des chaînes de caractères

### Phase 2 : Tests manuels (10-15 minutes)

```bash
# Test de fonctionnement normal
echo "ECHO test" | ./blackbox_target

# Test de différentes commandes
echo "DEBUG test" | ./blackbox_target
echo "PROCESS test" | ./blackbox_target
echo "SPECIAL test" | ./blackbox_target

# Test avec des motifs spéciaux trouvés dans les chaînes de caractères
echo "DEBUG MAGIC123" | ./blackbox_target
echo "PROCESS PROC:10:DATADATA" | ./blackbox_target
```

### Phase 3 : Configuration du fuzzing (10 minutes)

```bash
mkdir input output

# Créer des graines basées sur les découvertes
echo "ECHO test" > input/seed1.txt
echo "DEBUG info" > input/seed2.txt
echo "PROCESS PROC:10:DATA" > input/seed3.txt
echo "SPECIAL MAGIC123" > input/seed4.txt
```

### Phase 4 : Fuzzing (30-45 minutes)

```bash
# Lancer honggfuzz en mode QEMU
honggfuzz -z -i input -o output -- ./blackbox_target

# Facultatif : Exécuter des instances parallèles
# Terminal 2
honggfuzz -z -i input -o output -n 1 -- ./blackbox_target
```

**Résultats attendus** :

-   Le débordement de tampon devrait être trouvé rapidement (5-10 minutes)
-   La vulnérabilité de chaîne de format peut prendre plus de temps (15-30 minutes)
-   Le débordement d'entier et l'utilisation après libération peuvent nécessiter un temps d'exécution plus long ou de bonnes graines

### Phase 5 : Analyse des crashes (15-20 minutes)

```bash
# Tester les crashes
./blackbox_target < output/default/crashes/id:000000*

# Déboguer avec GDB
gdb ./blackbox_target
(gdb) run < output/default/crashes/id:000000*
(gdb) bt
(gdb) info registers
(gdb) x/20x $rsp
```

---

## Conseils pédagogiques

### Avant l'exercice

1. **Mettre l'accent sur la reconnaissance** : Une bonne analyse avant le fuzzing fait gagner du temps
2. **Expliquer le surcoût de QEMU** : Les étudiants doivent être patients, c'est plus lent que le fuzzing instrumenté
3. **Revoir les bases de GDB** : Un rapide rappel sur le débogage sans code source

### Pendant l'exercice

2. **Si aucun crash n'est trouvé après 20 minutes** :

    - Vérifier que honggfuzz fonctionne réellement (non bloqué)
    - Vérifier que les graines sont mutées (paths_total en augmentation)
    - Suggérer de meilleures graines basées sur l'analyse des chaînes de caractères
    - Envisager des tests manuels d'abord pour vérifier le comportement du binaire

3. **Si les étudiants trouvent des crashes mais ne peuvent pas les analyser** :
    - Guider à travers le workflow GDB
    - Montrer comment utiliser `info functions` même sans symboles
    - Démontrer la commande `disassemble` dans GDB
    - Utiliser `bt` (backtrace) pour comprendre la pile d'appels

### Problèmes courants

**Problème** : "honggfuzz dit 'No instrumentation detected'"
**Solution** : S'assurer d'utiliser le flag `-z` pour le mode QEMU

**Problème** : "Le binaire ne prend pas d'entrée de honggfuzz"
**Solution** : Vérifier que le binaire lit depuis l'entrée standard (stdin), pas depuis un fichier/des arguments

**Problème** : "Des crashes trouvés mais le binaire fonctionne correctement lors du test"
**Solution** : Peut nécessiter un environnement spécifique (ASAN aide), ou un problème de timing

---

## Guide de solution

### Découverte du bug #1 : Débordement de tampon

**Analysis approach**:

```bash
strings blackbox_target | grep -i command
# Shows "Blackbox Command Processor"

objdump -d blackbox_target | grep -A10 strcpy
# Shows strcpy is called without bounds checking
```

**Approche de fuzzing** :

-   Graines avec des entrées progressivement plus longues
-   honggfuzz devrait trouver cela rapidement grâce à un crash observable

**Signature du crash** :

```
Erreur de segmentation (core dumped)
```

**Analyse GDB** :

```
(gdb) bt
#0  0x... dans parse_command()
#1  0x... dans main()

(gdb) info registers
rip: 0x4141414141414141  # Adresse de retour écrasée
```

### Découverte du bug #2 : Chaîne de format

**Analysis approach**:

```bash
strings blackbox_target | grep DEBUG
# Shows "DEBUG" is a valid command

# Test manually
echo "DEBUG %x" | ./blackbox_target
# Outputs hex values - format string bug!
```

**Approche de fuzzing** :

-   Graine avec "DEBUG %x%x%x%x%s"
-   honggfuzz peut trouver cela par mutation

**Signature du crash** :

```
Erreur de segmentation
# Causée par %s lisant une mémoire invalide
```

### Découverte du bug #3 : Débordement d'entier

**Analysis approach**:

```bash
strings blackbox_target | grep PROC
# Shows "PROC:" pattern

# Test manually with large number
echo "PROCESS PROC:999999999:DATA" | ./blackbox_target
```

**Approche de fuzzing** :

-   Nécessite un format de graine spécifique
-   "PROCESS PROC:NNNN:DATA" où NNNN est muté à une grande valeur

**Signature du crash** (avec ASAN) :

```
dépassement de tampon du tas
ÉCRITURE de taille N à l'adresse 0x...
```

### Découverte du bug #4 : Utilisation après libération

**Analysis approach**:

```bash
strings blackbox_target | grep MAGIC
# Shows "MAGIC123" and "TRIGGER"

# Test combination
echo "SPECIAL MAGIC123TRIGGER" | ./blackbox_target
```

**Approche de fuzzing** :

-   Nécessite une graine très spécifique
-   Difficile à trouver sans une bonne graine initiale

**Signature du crash** (avec ASAN) :

```
utilisation après libération du tas
LECTURE de taille N à l'adresse 0x...
libéré par le thread T0 ici :
  #0 free
```

---

## Grille d'évaluation

### Excellent (90-100%)

-   A trouvé les 4 vulnérabilités
-   A correctement analysé chaque crash avec GDB
-   A compris les causes premières sans code source
-   A utilisé efficacement le mode QEMU de honggfuzz
-   Bonne documentation de la méthodologie

### Bien (75-89%)

-   A trouvé 3 vulnérabilités
-   A analysé les crashes avec GDB
-   A utilisé avec succès le mode QEMU de honggfuzz
-   A compris la plupart des causes premières

### Satisfaisant (60-74%)

-   A trouvé 2 vulnérabilités (y compris le débordement de tampon)
-   Analyse de base des crashes
-   Le mode QEMU de honggfuzz fonctionne
-   Quelques notions des causes premières

### Doit être amélioré (<60%)

-   A trouvé 0-1 vulnérabilités
-   A eu des difficultés avec la configuration de honggfuzz
-   Analyse limitée des crashes
-   Nécessite plus de pratique avec les outils

---

## Time Estimates

| Phase                        | Temps estimé    |
| ---------------------------- | --------------- |
| Configuration & introduction | 10 min          |
| Reconnaissance binaire       | 15-20 min       |
| Tests manuels                | 10-15 min       |
| Configuration du fuzzing     | 10 min          |
| Exécution du fuzzing         | 30-45 min       |
| Analyse des crashes          | 15-20 min       |
| Documentation                | 10-15 min       |
| **Total**                    | **100-135 min** |

---

## Additional Challenges

Pour les étudiants avancés qui terminent tôt :

### Challenge A : Patch le binaire

Utiliser un éditeur hexadécimal ou un outil de patching binaire pour corriger le débordement de tampon sans code source.

### Challenge B : Créer des exploits

Écrire des exploits de preuve de concept pour chaque vulnérabilité :

-   Débordement de tampon : Contrôler RIP
-   Chaîne de format : Fuite de mémoire/écriture de valeurs arbitraires
-   Débordement d'entier : Exploitation du tas

### Challenge C : Rétro-ingénierie

Utiliser Ghidra ou IDA pour créer du pseudo-code pour les fonctions principales.

---

## Resources for Students

Recommandé si les étudiants ont besoin d'aide :

-   **Tutoriel GDB** : https://sourceware.org/gdb/current/onlinedocs/gdb/
-   **honggfuzz QEMU Mode** : https://github.com/google/honggfuzz/blob/master/USAGE.md
-   **Analyse binaire avec Ghidra** : https://ghidra-sre.org/
-   **Analyse binaire Linux** : "Practical Binary Analysis" par Dennis Andriesse

---

## Post-Exercise Discussion

Thèmes clés à aborder :

1.  **Compromis Whitebox vs Blackbox**

    -   Quand utiliser chaque approche
    -   Implications sur les performances
    -   Comparaison de l'efficacité

2.  **Applications réelles**

    -   Programmes de primes aux bugs
    -   Audit de sécurité
    -   Analyse de firmware

3.  **Limites du fuzzing blackbox**

    -   Sommes de contrôle et techniques anti-fuzzing
    -   Limites de couverture
    -   Nécessité de la rétro-ingénierie

4.  **Prochaines étapes**
    -   Combinaison de l'exécution symbolique (angr)
    -   Approches de fuzzing hybrides
    -   Outils de fuzzing spécialisés

---

## Script de vérification

Vérification rapide du bon fonctionnement du matériel d'exercice :

```bash
#!/bin/bash
cd exercice_4.2/

echo "Compilation de la version étudiante..."
./compile.sh
if [ ! -f blackbox_target ]; then
    echo "ERREUR : Binaire étudiant non créé"
    exit 1
fi

echo "Compilation de la version instructeur..."
./compile_instructor.sh
if [ ! -f blackbox_target_asan ]; then
    echo "ERREUR : Binaire instructeur non créé"
    exit 1
fi

echo "Test des vulnérabilités..."
./test_bugs.sh > test_output.txt 2>&1

echo "Tous les contrôles ont réussi !"
```

---

Bonne chance pour l'enseignement du Module 4 ! C'est souvent le module préféré des étudiants car il simule une recherche de sécurité réelle.
