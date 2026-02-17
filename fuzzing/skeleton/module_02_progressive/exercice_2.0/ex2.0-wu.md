# Write-up : Exercice 2.0

# Bug #1 - Heap Buffer Overflow dans command_parser

## Input déclencheur
Le fichier crash sauvegardé automatiquement par libFuzzer :
```
    ./crash-110a4e5262f337cfafd5b210d7ba68caf8fa110c
```

Contenu de l'input :
```bash
    EXEC / ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZEXITLA
```

La commande **EXEC** suivie d'un chemin très long composé de Z répétés,
suffisant pour dépasser le buffer de 128 octets alloué sur le heap.

## Type de bug
Heap Buffer Overflow (WRITE de 72 octets au-delà d'un buffer de 128 bytes)

## Localisation
- Fonction : **handle_exec_command()**
- Fichier : **command_parser_logic.c**
- Ligne du overflow : **138 (strcpy sans vérification de taille)**
- Ligne de l'allocation : 135 **(malloc(verified_count * 64))**
- Appelé depuis : **process_command(), ligne 189**

## Reproductibilité
Reproductible de manière fiable en rejouant le fichier crash :
```bash
    ./command_parser_fuzzer ./crash-110a4e5262f337cfafd5b210d7ba68caf8fa110c
```
Ou manuellement avec une commande **EXEC** suivie d'un argument
dépassant la taille du buffer alloué par malloc.

## Cause racine
handle_exec_command() alloue un buffer sur le heap avec
malloc(verified_count * 64), mais la boucle de copie utilise
arg_count pour itérer :
```c
    char *arr = malloc(verified_count * 64);      // taille selon verified_count
    for (int i = 0; i < arg_count - 1; i++) {     // boucle selon arg_count
        strcpy(&arr[i * 64], args[i + 1]);
    }
```

verified_count ne compte que les arguments non vides, mais arg_count
compte tous les arguments. Quand **arg_count > verified_count**, la
boucle écrit au-delà du buffer alloué. En plus, strcpy ne vérifie
jamais la taille avant de copier.

## Correction proposée
Allouer selon arg_count et non verified_count, et utiliser **strncpy** :
```c
    char *arr = malloc((arg_count - 1) * 64);
    if (arr == NULL) return;
    for (int i = 0; i < arg_count - 1; i++) {
        strncpy(&arr[i * 64], args[i + 1], 63);
        arr[i * 64 + 63] = '\0';
    }
    free(arr);
```  
---

# Bug #2 - Stack Buffer Overflow dans parse_arguments

## Input déclencheur
Le fichier crash sauvegardé automatiquement par libFuzzer :

```
    ./crash-55e9c875de2040dfcfd24379a83b01f32b20cc93
```

L'input est un mot sans espace de plus de 256 caractères,
suffisant pour dépasser le buffer local de **parse_arguments()**.

## Type de bug
Stack Buffer Overflow (WRITE of size 1, byte par byte)

## Localisation
- Fonction : **parse_arguments()**
- Fichier : **command_parser_logic.c**
- Ligne du overflow : **42 (buffer[j++] = input[i])**
- Ligne de déclaration du buffer : **26 (char buffer[256])**
- Appelé depuis : **process_command(), ligne 176**

## Reproductibilité
Reproductible de manière fiable en rejouant le fichier crash :
```
    ./command_parser_fuzzer ./crash-55e9c875de2040dfcfd24379a83b01f32b20cc93
```
Ou manuellement avec n'importe quel input composé d'un seul mot
(sans espace) de plus de 256 caractères.

## Cause racine
**parse_arguments()** copie les caractères de l'input dans un buffer
local de 256 bytes, caractère par caractère avec **buffer[j++]**.
Le problème : j n'est jamais vérifié contre la taille du buffer.
La seule condition de sortie de la boucle est un espace, une
tabulation, ou la fin de la chaîne. Si l'input ne contient aucun
séparateur, j continue de grandir indéfiniment au-delà de 256.

La ligne clé **(command_parser_logic.c:42)** :
```c
    buffer[j++] = input[i];  // j peut dépasser 256
```

## Correction proposée
Vérifier j avant chaque écriture dans le buffer :
```c
    if (j >= sizeof(buffer) - 1) {
        break;  // mot trop long, on arrête
    }
    buffer[j++] = input[i];
```

---

## Différence avec le bug #1
Le bug #1 était un heap-buffer-overflow avec strcpy qui écrivait
un bloc d'un coup **(WRITE of size 72)**. Ce bug est un
stack-buffer-overflow qui écrit byte par byte (WRITE of size 1)
à chaque itération de la boucle, jusqu'à ce que j dépasse 256.
Dans les deux cas ASan détecte le dépassement, mais les shadow
bytes sont différents : **[fa]** pour le heap, **[f3]** pour la stack.

# Bug #3 - Stack Buffer Overflow dans parse_arguments (strcpy)

## Input déclencheur
Le fichier crash sauvegardé automatiquement par libFuzzer :
```
    ./crash-225a3f58092af4d80fe2a6a50e5ada8f13e24bfb
```

L'input contient un mot sans espace suffisamment long pour que
strcpy déborde au-delà du slot de 64 bytes dans args.

## Type de bug
Stack Buffer Overflow (WRITE of size 132 via strcpy)

## Localisation
- Fonction : **parse_arguments()**
- Fichier : **command_parser_logic.c**
- Ligne du overflow : **35 (strcpy(args[arg_count], buffer))**
- Ligne de déclaration de args : **182 dans process_command()**
  **(char args[MAX_ARGS][64])**
- Appelé depuis : **process_command(), ligne 193**

## Reproductibilité
Reproductible de manière fiable en rejouant le fichier crash :
```bash
    ./command_parser_fuzzer ./crash-225a3f58092af4d80fe2a6a50e5ada8f13e24bfb
```
Ou manuellement avec un mot sans espace de plus de 64 caractères.

## Cause racine
parse_arguments() accumule les caractères dans buffer sans limite
(bug #2), puis quand elle trouve un séparateur elle fait un strcpy
dans args[arg_count] qui ne fait que 64 bytes. Si buffer contient
plus de 64 caractères, strcpy déborde au-delà et écrit dans
la mémoire adjacente.

La ligne clé (command_parser_logic.c:35) :
```c
    strcpy(args[arg_count], buffer);  // buffer peut dépasser 64 bytes
```

Le bug #2 et le bug #3 sont liés : le bug #2 permet à buffer de
dépasser 256 bytes, et le bug #3 exploite ce même buffer trop long
pour déborder dans args.

## Correction proposée
Utiliser strncpy pour limiter la copie à 63 bytes + terminateur :
```c
    strncpy(args[arg_count], buffer, 63);
    args[arg_count][63] = '\0';
```
Et aussi limiter j dans la boucle (correction du bug #2) :
```c
    if (j >= sizeof(buffer) - 1) break;
```
---

## Shadow memory - : f2
Cette fois on voit [f2] dans la shadow memory :
```bash
    =>0x7c2397f2b200: 00 00 00 00[f2]f2 f2 ...   // fin de args
      0x7c2397f2b300: f2 f2 f2 f2 f8 f8 f8 ...   // puis use after scope
      0x7c2397f2b400: f8 f8 f8 f8 f3 f3 f3 ...   // puis error_buf
```

**f2** = stack mid redzone. C'est la zone que ASan place entre deux
variables sur la stack pour les séparer. Ici entre args et error_buf.
Le crash s'est produit exactement à la limite de args, dans cette
zone de séparation. On avait vu **f1** (left redzone) et **f3** (right
redzone) avant, **f2** est le troisième type de garde-fou sur la stack.

# Bug #4 - Stack Buffer Overflow dans parse_arguments (strcpy ligne 65)

## Input déclencheur
Le fichier crash sauvegardé automatiquement par libFuzzer :
```
    ./crash-93a2d9b5cd529afb6264ee2eab995b48961020c8
```

L'input contient un mot sans espace en fin de chaîne (pas de
séparateur après), suffisamment long pour déborder dans args
lors de la copie du dernier mot.

## Type de bug
Stack Buffer Overflow (WRITE of size 93 via strcpy)

## Localisation
- Fonction : parse_arguments()
- Fichier : command_parser_logic.c
- Ligne du overflow : 65 (strcpy(args[arg_count], buffer) après la boucle)
- Ligne de déclaration de args : 183 dans process_command()
  (char args[MAX_ARGS][64])
- Appelé depuis : process_command(), ligne 194

## Reproductibilité
Reproductible de manière fiable en rejouant le fichier crash :
```bash
    ./command_parser_fuzzer ./crash-93a2d9b5cd529afb6264ee2eab995b48961020c8
```
Ou manuellement avec un mot sans espace en fin de chaîne de
plus de 64 caractères.

## Cause racine
Même cause racine que le bug #3, mais deuxième instance.
**parse_arguments()** a deux points où elle copie buffer dans args :
- Ligne 35 : dans la boucle, quand elle trouve un séparateur (bug #3)
- Ligne 65 : après la boucle, pour le dernier mot de l'input qui
  n'est pas suivi d'un espace

Dans les deux cas, **strcpy** copie sans limite dans un espace de **64 bytes**. Le bug #3 se déclenche sur un mot suivi d'un espace, le bug #4 se déclenche sur un mot en fin de chaîne.

La ligne clé (command_parser_logic.c:65) :
```c
    strcpy(args[arg_count], buffer);  // buffer peut dépasser 64 bytes
```

## Correction proposée
Même correction que le bug #3, mais appliquée aussi à la ligne 65 :
```c
    strncpy(args[arg_count], buffer, 63);
    args[arg_count][63] = '\0';
```

---

## Lien avec les bugs précédents
Les bugs #2, #3 et #4 sont tous liés à parse_arguments() :
- Bug #2 : buffer déborde (j dépasse 256) dans la boucle
- Bug #3 : args déborde via strcpy ligne 35 (mot suivi d'espace)
- Bug #4 : args déborde via strcpy ligne 65 (mot en fin de chaîne)

Le fuzzer a trouvé les trois séparément parce que chaque point
de dépassement nécessite un input légèrement différent pour se
déclencher. C'est exactement pourquoi le fuzzing est puissant :
même vuln dupliquée à plusieurs endroits, le fuzzer les trouve
toutes.