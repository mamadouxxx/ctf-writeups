# Module 05 - Fuzzing de Sudoedit avec HonggFuzz QEMU

## Objectif

Dans cet exercice, vous allez utiliser le fuzzing en mode QEMU (black-box) pour redécouvrir une vulnérabilité critique : **CVE-2021-3156**.

---

## Contexte : CVE-2021-3156

### Description de la vulnérabilité

CVE-2021-3156 est une vulnérabilité de type **heap-based buffer overflow** découverte par l'équipe de recherche de Qualys en janvier 2021. Elle affecte l'utilitaire `sudo` dans ses versions antérieures à 1.9.5p2.

Cette vulnérabilité permet à **n'importe quel utilisateur local** d'obtenir les privilèges **root** sans nécessiter de mot de passe ni d'être dans le fichier sudoers.

### Origine technique

Le bug se situe dans la fonction `set_cmnd()` du fichier `sudoers.c`. Lorsque `sudoedit` est invoqué, le programme traite les **arguments de la ligne de commande**. Une erreur dans le parsing de ces arguments peut provoquer un **débordement de tampon sur le heap**.

### Votre défi

C'est à vous de découvrir, grâce au fuzzing, quels arguments déclenchent cette vulnérabilité. Le but de cet exercice est justement de **fuzzer les arguments** passés à `sudoedit` pour identifier le pattern qui provoque le crash.

### Impact

-   **Score CVSS** : 7.8 (High)
-   **Type** : Élévation de privilèges locale (LPE)
-   **Versions affectées** : sudo 1.8.2 à 1.8.31p2, sudo 1.9.0 à 1.9.5p1

---

## Mise en place de l'environnement

### Récupération du binaire vulnérable

Nous utilisons le projet de LiveOverflow qui fournit une version vulnérable de sudo dans un conteneur Docker :

```bash
# Télécharger le projet
wget https://codeload.github.com/LiveOverflow/pwnedit/zip/refs/heads/main
unzip main
cd pwnedit-main/episode01

# Construire l'image Docker
make build

# Lancer le conteneur
make run

# (Optionnel) Obtenir un shell root dans le conteneur
make root
```

### Structure du conteneur

Une fois dans le conteneur, vous trouverez :

-   `/usr/bin/sudoedit` : Le binaire vulnérable (symlink vers sudo)
-   `/usr/bin/sudo` : Version 1.8.31 (vulnérable)

---

## Exercice : Fuzzing de Sudoedit

### Objectif

Votre mission est d'utiliser **HonggFuzz en mode QEMU** pour fuzzer le binaire `sudoedit` et détecter le crash correspondant à CVE-2021-3156.

### Étapes suggérées

1. **Analyse préliminaire**

    - Étudiez le comportement normal de `sudoedit`
    - Identifiez les arguments acceptés par le programme
    - Comprenez comment `sudoedit` diffère de `sudo`

2. **Préparation du fuzzing**

    - Configurez HonggFuzz pour le mode QEMU (binaire non instrumenté)
    - Créez un corpus de seeds initial pertinent
    - Définissez les options de fuzzing appropriées

3. **Exécution du fuzzer**

    - Lancez la campagne de fuzzing
    - Surveillez les métriques (couverture, crashes, etc.)
    - Analysez les inputs qui provoquent des crashes

4. **Analyse des résultats**
    - Examinez les fichiers de crash générés
    - Identifiez le pattern d'input qui déclenche le bug
    - Vérifiez que le crash correspond bien à CVE-2021-3156

### Indices

<details>
<summary>Indice 1 : Comprendre la cible</summary>

Avant de fuzzer, étudiez le comportement normal de `sudoedit`. Quels types d'arguments accepte-t-il ? Comment se comporte-t-il avec des entrées inhabituelles ?

</details>

<details>
<summary>Indice 2 : Fuzzing des arguments</summary>

Le fuzzing classique envoie des données via stdin ou un fichier. Ici, vous devez fuzzer les **arguments de ligne de commande**. Consultez la documentation de HonggFuzz pour savoir comment passer le contenu fuzzé en tant qu'argument.

</details>

<details>
<summary>Indice 3 : Configuration HonggFuzz QEMU</summary>

Pour fuzzer un binaire non instrumenté avec HonggFuzz, utilisez l'option `-Q` qui active le mode QEMU. Cherchez comment utiliser `___FILE___` dans la ligne de commande.

</details>

<details>
<summary>Indice 4 : Corpus de seeds</summary>

Créez un corpus initial varié avec différents types de caractères et patterns. Pensez aux caractères spéciaux qui pourraient avoir une signification particulière dans un shell ou dans le parsing d'arguments.

</details>

---

## Livrables attendus

1. **Script de fuzzing** : Votre configuration complète de HonggFuzz
2. **Corpus de seeds** : Les fichiers d'entrée utilisés pour initialiser le fuzzing
3. **Rapport d'analyse** :
    - Input(s) qui déclenchent le crash
    - Explication technique du crash observé
    - Corrélation avec CVE-2021-3156

---

## Ressources

-   [Documentation HonggFuzz](https://github.com/google/honggfuzz/blob/master/docs/USAGE.md)
-   [Code source sudo (version vulnérable)](https://github.com/sudo-project/sudo/tree/SUDO_1_8_31)

### Pour aller plus loin (à consulter APRÈS avoir trouvé le crash)

-   [Advisory Qualys - CVE-2021-3156](https://www.qualys.com/2021/01/26/cve-2021-3156/baron-samedit-heap-based-overflow-sudo.txt)
-   [Vidéo LiveOverflow - Baron Samedit](https://www.youtube.com/watch?v=TLa2VqcGGEQ)

---

## Critères d'évaluation

| Critère                                   | Points |
| ----------------------------------------- | ------ |
| Mise en place correcte de l'environnement | 2      |
| Configuration pertinente de HonggFuzz     | 3      |
| Création d'un corpus de seeds efficace    | 2      |
| Découverte du crash                       | 2      |
| Qualité de l'analyse et du rapport        | 3      |
| **Total**                                 | **12** |

---

Bonne chance ! N'hésitez pas à explorer et expérimenter. Le fuzzing est autant un art qu'une science.
