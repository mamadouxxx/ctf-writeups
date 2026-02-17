# Challenge Binaries - Distribution Instructions

## Objectif

Ce répertoire contient des binaires supplémentaires pour la pratique du fuzzing blackbox. Ces binaires sont destinés à être distribués aux étudiants **sans le code source** afin de simuler des scénarios réels de fuzzing blackbox.

---

## Pour les instructeurs : Préparation des binaires pour la distribution

### 1. Compiler le binaire cible

From the `exercice_4.2/` directory:

```bash
cd ../exercice_4.2/
```

Ceci crée un binaire "strippé" sans symboles de débogage ni sanitizers.

### 2. Copier le binaire dans le répertoire de distribution

```bash
cp blackbox_target ../challenge_binaries/
```

### 3. Vérifier que le binaire est correctement "strippé"

```bash
cd ../challenge_binaries/
file blackbox_target
# Should show: "ELF 64-bit LSB executable, x86-64, ... stripped"

nm blackbox_target
# Should show: "no symbols"
```

### 4. Créer le package de distribution

```bash
# Create a clean package for students
cd ../..
mkdir -p module_04_blackbox_student_dist
cp module_04_blackbox/challenge_binaries/blackbox_target module_04_blackbox_student_dist/
cp module_04_blackbox/README.md module_04_blackbox_student_dist/

# Create archive
tar -czf module_04_blackbox_student.tar.gz module_04_blackbox_student_dist/

# Or as zip
zip -r module_04_blackbox_student.zip module_04_blackbox_student_dist/
```

---

## Pour les étudiants : Utilisation des binaires du challenge

### Configuration

1. Create working directory:

```bash
mkdir blackbox_fuzzing
cd blackbox_fuzzing
cp /path/to/blackbox_target .
chmod +x blackbox_target
```

2. Test the binary:

```bash
echo "TEST" | ./blackbox_target
```

### Analyse de base

Before fuzzing, analyze the binary:

```bash
# Check file type and architecture
file blackbox_target

# Extract readable strings
strings blackbox_target | less

# Look for interesting function calls
objdump -d blackbox_target | grep -E "call.*<.*@plt>" | sort -u

# Check for security protections
if command -v checksec &> /dev/null; then
    checksec blackbox_target
fi
```

### Tests manuels

Test the binary with different inputs:

```bash
# Normal input
echo "ECHO Hello World" | ./blackbox_target

# Long input
python3 -c "print('A' * 500)" | ./blackbox_target

# Special characters
echo -e "TEST\\x00\\x01\\x02" | ./blackbox_target

# Empty input
echo "" | ./blackbox_target
```

### Fuzzing with honggfuzz QEMU mode

1. Create input directory with seeds:

```bash
mkdir input output
echo "ECHO test" > input/seed1.txt
echo "PROCESS data" > input/seed2.txt
echo "DEBUG info" > input/seed3.txt
```

2. Lancer honggfuzz en mode QEMU:
   honggfuzz -z -i input -o output -- ./blackbox_target

3. Monitor progress:

```bash
# In another terminal
watch -n 1 'cat output/default/fuzzer_stats | grep -E "(execs_done|paths_total|crashes_unique)"'
```

### Analyse des crashes

Once crashes are found:

```bash
# List crashes
ls -la output/default/crashes/

# Test a crash
./blackbox_target < output/default/crashes/id:000000*

# Debug with GDB
gdb ./blackbox_target
(gdb) run < output/default/crashes/id:000000*
(gdb) bt
(gdb) info registers
```

---

## Binaires de challenge supplémentaires

### Création de challenges supplémentaires

Instructors can add more binaries to this directory:

1. **Easy Challenge**: Simple buffer overflow
2. **Medium Challenge**: Format string + logic bugs
3. **Hard Challenge**: Complex state machine with multiple bugs

### Exemple : Ajout d'un nouveau binaire

```bash
# Compile your challenge
gcc -O0 -g challenge_hard.c -o challenge_hard
strip challenge_hard

# Move to distribution
cp challenge_hard challenge_binaries/

# Document it
cat >> challenge_binaries/CHALLENGES.md << EOF

## Challenge: challenge_hard

**Difficulty**: Hard
**Description**: Multi-stage authentication system with hidden vulnerabilities
**Hints**:
  - Look for state transitions
  - Check integer handling
  - Analyze error paths

EOF
```

---

## Liste de contrôle de distribution

Before distributing binaries to students:

-   [ ] Binary is compiled without sanitizers
-   [ ] Binary is stripped (no debug symbols)
-   [ ] Source code is NOT included in student package
-   [ ] README instructions are included
-   [ ] Binary is tested and works correctly
-   [ ] Vulnerabilities are verified (instructor testing)
-   [ ] File permissions are correct (executable)

---

## Note de sécurité

These binaries contain **intentional vulnerabilities** for educational purposes. They should:

-   Only be used in controlled learning environments
-   Never be deployed in production
-   Be clearly marked as vulnerable teaching materials
-   Not be distributed outside the workshop context

---

## Dépannage

### Le binaire ne s'exécute pas

```bash
# Check architecture
file blackbox_target
# Must match your system (x86-64, ARM, etc.)

# Check dependencies
ldd blackbox_target
# All libraries should be found

# Make executable
chmod +x blackbox_target
```

### Problèmes avec le mode QEMU de honggfuzz

-   **Vérifiez l'installation de honggfuzz** : `honggfuzz --version`
-   **Assurez-vous que la cible est exécutable** : `./blackbox_target`
-   **Vérifiez les chemins d'entrée/sortie** : Assurez-vous que les répertoires `input` et `output` existent.
-   **Laissez-le tourner plus longtemps** : Le mode QEMU peut être lent.
-   **Consultez la documentation de honggfuzz** : Référez-vous au `USAGE.md` officiel pour les options avancées.

### Aucun crash trouvé

-   **Increase timeout**: Let honggfuzz run longer (hours, not minutes)
-   **Improve seeds**: Add more diverse initial inputs
-   **Check binary behavior**: Manually test edge cases
-   **Use parallel fuzzing**: Run multiple honggfuzz instances

---

## Objectifs d'apprentissage

By fuzzing these challenge binaries, students should:

1. Understand the **difference between whitebox and blackbox** fuzzing
2. Learn **basic reverse engineering** techniques
3. Use **honggfuzz QEMU mode** effectively
4. Develop **crash analysis skills** without source code
5. Practice **systematic testing** of unknown binaries

---

## Ressources

### Outils de rétro-ingénierie

-   **Ghidra**: Free, powerful decompiler
    https://ghidra-sre.org/

-   **Cutter**: User-friendly GUI for radare2
    https://cutter.re/

-   **Binary Ninja Cloud**: Free tier available
    https://cloud.binary.ninja/

### Ressources d'apprentissage

-   **Nightmare**: Binary exploitation course
    https://guyinatuxedo.github.io/

-   **pwn.college**: Free security education
    https://pwn.college/

-   **LiveOverflow**: YouTube channel with reverse engineering content
    https://www.youtube.com/c/LiveOverflow

---

## Journal de test de l'instructeur

Document your testing here:

| Binary          | Date       | Tested By       | Bugs Confirmed | Notes                |
| --------------- | ---------- | --------------- | -------------- | -------------------- |
| blackbox_target | YYYY-MM-DD | Instructor Name | 4              | All bugs triggerable |

---

## Avancé : Binaires multi-architectures

For advanced workshops, you can compile binaries for different architectures:

```bash
# For ARM (requires cross-compiler)
arm-linux-gnueabi-gcc -static blackbox_target.c -o blackbox_target_arm
strip blackbox_target_arm

# Test with QEMU user mode
qemu-arm ./blackbox_target_arm

# Fuzz avec honggfuzz QEMU (ARM)
honggfuzz -z -i input -o output -- qemu-arm ./blackbox_target_arm
```

This teaches students about:

-   Cross-architecture fuzzing
-   Architecture-specific vulnerabilities
-   Emulation overhead differences

---

## Questions pour les étudiants

After completing the fuzzing exercises, students should be able to answer:

1. **What makes blackbox fuzzing harder than whitebox?**
2. **How does honggfuzz achieve code coverage without instrumentation?**
3. **What are the tradeoffs of using QEMU mode?**
4. **How do you verify a crash is a real vulnerability?**
5. **What reverse engineering techniques helped you understand the binary?**

---

Good luck with your blackbox fuzzing exercises!

Remember: In real-world security research, you often don't have source code. These skills are essential for vulnerability research, security auditing, and bug bounty hunting.
