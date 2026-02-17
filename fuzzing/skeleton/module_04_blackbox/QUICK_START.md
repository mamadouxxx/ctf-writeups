# Module 4 - Quick Start Guide

## For Students

### 1. Compile the Target (Instructor will provide binary)

If you have access to the source (for testing only):

```bash
cd exercice_4.2/
```

### 2. Analyze the Binary

```bash
# Basic info
file blackbox_target
strings blackbox_target | less

# Test manually
echo "ECHO test" | ./blackbox_target
```

### 3. Setup Fuzzing

```bash
# Create directories
mkdir input output

# Create seeds based on your analysis
echo "ECHO test" > input/seed1.txt
echo "DEBUG info" > input/seed2.txt
echo "PROCESS data" > input/seed3.txt
```

### 4. Run honggfuzz QEMU mode

```bash
honggfuzz -z -i input -o output -- ./blackbox_target
```

### 5. Analyze Crashes

```bash
# List crashes
ls output/default/crashes/

# Test crash
./blackbox_target < output/default/crashes/id:000000*

# Debug
gdb ./blackbox_target
(gdb) run < output/default/crashes/id:000000*
(gdb) bt
```

---

## For Instructors

### Prepare Binary for Distribution

```bash
cd exercice_4.2/

# Test vulnerabilities
./compile_instructor.sh

# Copy to distribution
cp blackbox_target ../challenge_binaries/
```

### Test All Bugs

```bash
# After running compile_instructor.sh
./test_bugs.sh
```

### Vulnerabilities Summary

1. **Buffer Overflow**: `python3 -c "print('A' * 300)" | ./blackbox_target`
2. **Format String**: `echo "DEBUG %x.%x.%x.%x" | ./blackbox_target`
3. **Integer Overflow**: `echo "PROCESS PROC:4294967295:DATA" | ./blackbox_target`
4. **Use-After-Free**: `echo "SPECIAL MAGIC123TRIGGER" | ./blackbox_target`

---

## Troubleshooting

### Troubleshooting

### honggfuzz QEMU not working?

-   **Verify honggfuzz installation**: `honggfuzz --version`
-   **Ensure target is runnable**: `./blackbox_target`
-   **Check input/output paths**: Make sure `input` and `output` directories exist.
-   **Run longer**: QEMU mode can be slow.
-   **Consult honggfuzz documentation**: Refer to official `USAGE.md` for advanced options.

### No crashes found?

-   Run longer (30+ minutes)
-   Improve seeds based on strings
-   Try parallel fuzzing
-   Verify honggfuzz is running (check output log)

---

## Key Commands Reference

```bash
# Analysis
file binary              # File type
strings binary           # Extract strings
nm binary                # List symbols
objdump -d binary        # Disassemble

# Fuzzing
honggfuzz -z -i in -o out -- ./binary

# Debugging
gdb ./binary
(gdb) run < crash_file
(gdb) bt
(gdb) info registers
```

---

## Expected Timeline

-   Reconnaissance: 15-20 min
-   Setup & initial fuzzing: 10-15 min
-   Fuzzing execution: 30-45 min
-   Crash analysis: 15-20 min
-   Total: ~90-120 min

---

## Learning Goals

-   [ ] Understand blackbox vs whitebox fuzzing
-   [ ] Use honggfuzz QEMU mode
-   [ ] Perform basic binary analysis
-   [ ] Find vulnerabilities without source
-   [ ] Analyze crashes with GDB

---

See full README.md for detailed instructions!
