# Exercice 1.0 : Comprendre un crash simple

**Objectif** : Compiler et exécuter un programme vulnérable pour voir ASan en action.

## Code

Le fichier `vuln_simple.c` contient une fonction `process_data()` qui copie des données dans un buffer fixe sans vérifier la taille, introduisant une vulnérabilité de type buffer overflow.

## Compilation

Pour compiler le programme avec AddressSanitizer (ASan), utilisez la commande suivante :

```bash
clang -fsanitize=address -g -fno-omit-frame-pointer -Wall -Wextra vuln_simple.c -o vuln_simple
```

Options de compilation :
- `-fsanitize=address` : Active AddressSanitizer.
- `-g` : Ajoute les symboles de debug pour des traces d'erreurs plus détaillées.
- `-fno-omit-frame-pointer`: Conserve les pointeurs de frame pour des traces de pile plus claires.
- `-Wall -Wextra`: Active la plupart des avertissements du compilateur.

## Test

Pour tester le programme, vous pouvez utiliser les commandes suivantes :

```bash
# Test avec une entrée courte (ne crashe pas)
echo 'HELLO' | ./vuln_simple

# Test avec une entrée longue (provoque un crash)
python3 -c "print('A' * 100)" | ./vuln_simple
```

L'AddressSanitizer devrait détecter le dépassement de tampon et afficher un rapport d'erreur détaillé.
