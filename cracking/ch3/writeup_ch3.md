# Write-up — Crackme ch3

**Binaire :** ELF 32-bit x86 statiquement lié | **Flag :** `easy`

---

## Obstacles

- **Statiquement lié** → `ltrace` et `LD_PRELOAD` inutilisables
- **Anti-debug ptrace** → GDB détecté et programme stoppé
- **Comparaison custom** → pas de `strcmp`, caractère par caractère
- **Faux code** → `jmp eax` vers du code qu'IDA ne désassemble pas

---

## Étape 1 — strings

```bash
strings ./ch3.bin
# → "ksuiealohgy"  ← string suspecte
```

---

## Étape 2 — bypass ptrace

Le binaire s'auto-trace au démarrage :

```c
if (ptrace(PTRACE_TRACEME, 0, 0, 0) >= 0)  // < 0 = GDB détecté
```

On pose un breakpoint juste après le `call ptrace` et on force le retour à 0 :

```bash
gdb ./ch3.bin
(gdb) break *0x08048415    # juste après call ptrace
(gdb) run toto
(gdb) set $eax = 0         # force ptrace à retourner 0
(gdb) continue             # jns voit >= 0 → programme normal
```

---

## Étape 3 — suivre le jmp eax

IDA signale un `JUMPOUT` — en GDB on voit que c'est un `jmp eax` qui saute vers `0x8048498`. On pose un breakpoint dessus :

```bash
(gdb) break *0x8048498
(gdb) continue
(gdb) x/30i 0x8048498      # désassemble la vraie logique
```

---

## Étape 4 — reconstruction du mot de passe

La comparaison est faite caractère par caractère contre des index de `"ksuiealohgy"` :

```
index:  0  1  2  3  4  5  6  7  8  9  10
char:   k  s  u  i  e  a  l  o  h  g  y
```

```asm
input[0]  vs  v6[4]   →  'e'    (add eax, 0x4)
input[1]  vs  v6[5]   →  'a'    (add eax, 0x5)
input[2]  vs  v6[1]   →  's'    (inc eax     )
input[3]  vs  v6[10]  →  'y'    (add eax, 0xa)
```

On peut aussi lire directement en mémoire depuis GDB :

```bash
(gdb) x/s $ebp-0x16    # input saisi
(gdb) x/s $ebp-0xc     # "ksuiealohgy"
```

---

## Flag

```
easy
```
