# Write-up — Crackme ch23

**Binaire :** ELF 32-bit ARM, dynamiquement lié, stripped | **Flag :** `storms`

---

## Contexte ARM

Binaire ARM — les différences clés vs x86 :
- Arguments passés dans `r0, r1, r2, r3` (pas la pile)
- Retour fonction dans `r0` (pas `eax`)
- Branchements : `BEQ`, `BNE` (pas `je`, `jne`)

---

## Étape 1 — Analyse statique (Ghidra)

Le binaire est **stripped** donc pas de noms de fonctions. On identifie `main` via Ghidra et on obtient le pseudo-code C décompilé.

La logique est claire :

```c
__s = argv[1];              // mot de passe saisi
if (strlen(__s) != 6)       // doit faire exactement 6 chars
    exit();
```

---

## Étape 2 — Comprendre le scoring

Le programme calcule un score `local_14` qui part de 0 et **s'incrémente à chaque condition ratée**. Pour gagner : `__status == 0`.

```c
__status = local_14 + (s[3] ^ 0x72) + s[6];
if (__status == 0)
    puts("Success!");
```

Trois choses doivent valoir 0 simultanément :
- `local_14 == 0` → toutes les conditions satisfaites
- `s[3] ^ 0x72 == 0` → `s[3] == 'r'`
- `s[6] == 0` → toujours vrai (terminateur NUL)

---

## Étape 3 — Résolution des conditions

```
s[0] == s[5]          →  1er char == dernier char
s[0] + 1 == s[1]      →  s[1] = s[0] + 1
s[3] + 1 == s[0]      →  s[0] = s[3] + 1
s[2] + 4 == s[5]      →  s[5] = s[2] + 4
s[4] + 2 == s[2]      →  s[2] = s[4] + 2
```

On part du seul point d'ancrage connu : **`s[3] = 'r' = 0x72`**

```
s[3] = 'r'  →  114
s[0] = s[3] + 1  =  115  =  's'
s[1] = s[0] + 1  =  116  =  't'
s[5] = s[0]      =  115  =  's'
s[2] = s[5] - 4  =  111  =  'o'
s[4] = s[2] - 2  =  109  =  'm'
```

---

## Flag

```
storms
```
