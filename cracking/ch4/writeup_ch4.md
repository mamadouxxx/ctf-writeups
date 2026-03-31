# Write-up — Crackme ch4

**Binaire :** ELF 32-bit x86 | **Objectif :** trouver le mot de passe | **Flag :** `liberté!`

---

## Approche 1 — ltrace (la plus rapide)

`ltrace` trace les appels libc en temps réel. Sur ce binaire, il affiche directement les deux arguments de `strcmp` :

```bash
ltrace ./crackme montest
# strcmp("montest", "_0cGjc5m_.5\r\n...") = -1
```

Le mot de passe de référence apparaît en clair. **30 secondes de travail.**

---

## Approche 2 — LD_PRELOAD + dlsym

On remplace `strcmp` par son propre hook via `LD_PRELOAD` :

```c
// hook.c
#define _GNU_SOURCE
#include <stdio.h>
#include <dlfcn.h>

int strcmp(const char *s1, const char *s2) {
    printf("[HOOK] s1 = %s\n", s1);
    printf("[HOOK] s2 = %s\n", s2);  // mot de passe affiché
    int (*real)(const char*, const char*) = dlsym(RTLD_NEXT, "strcmp");
    return real(s1, s2);
}
```

```bash
gcc -shared -fPIC hook.c -o hook.so -ldl
LD_PRELOAD=./hook.so ./crackme test
```

`dlsym(RTLD_NEXT, "strcmp")` récupère la vraie `strcmp` de la libc pour éviter la récursion infinie.

**Limite :** ne fonctionne que si `strcmp` est liée dynamiquement (ce qui est le cas ici).

---

## Approche 3 — Analyse statique (IDA/Ghidra)

On reconstruit `dest` (le mot de passe de référence) byte par byte en suivant toutes les modifications successives :

```
memcpy(dest, rodata, 0x1F)  →  "_0cGj35m9V5T3\xc3\x87..."
dest[5]  = 99               →  '3' devient 'c'
dest[8]  = 95               →  '9' devient '_'
dest[9]  = 46               →  'V' devient '.'
dest[22] = 0                →  terminateur NUL (strcmp s'arrête ici)
s2[11]   = 13               →  '\r'  (dans WPA)
s2[12]   = 10               →  '\n'  (dans WPA)
```

Mot de passe final (22 bytes) :

```
_0cGjc5m_.5\r\n\xc3\x878CJ0\xc3\x809
```

Les bytes `\r`, `\n`, `\xc3\x87` (Ç), `\xc3\x80` (À) sont non-saisissables au clavier — c'est intentionnel. On les passe via la syntaxe bash `$'...'` :

```bash
./crackme $'\x5f\x30\x63\x47\x6a\x63\x35\x6d\x5f\x2e\x35\x0d\x0a\xc3\x878CJ0\xc3\x809'
# '+) Authentification réussie...
#  sh 3.0 # password: liberté!
```

---

## Résumé

| Méthode | Effort | Prérequis |
|---|---|---|
| `ltrace` | ⚡ immédiat | liaison dynamique |
| `LD_PRELOAD` + `dlsym` | 🔧 5 min | liaison dynamique |
| IDA / analyse statique | 🔍 30 min | aucun |
