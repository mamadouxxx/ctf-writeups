# Exo 2
le code fait un chiffrement avec **LCG (Xₙ₊₁ = (a · Xₙ + c) mod m) + XOR**

on a à disposition un fichier jpg encrypté, sauf que les fichiers jpg ont tous des headers commençant par **FF D8 FF E0 00 10 4A 46 49 46 00 01**
Avec ça et la possibilité d'inverser un **xor**, on peut décrypter le fichier **datacenter.jpg.enc**.

on peut extraire le header du jpg chiffré comme ceci :
```python
xxd -g1 -l 16 datacenter.jpg.enc
00000000: ae 16 1f 4b 80 b4 80 61 3e b9 56 a8 f7 f7 25 2e  ...K...a>.V...%.
```

Avec le fait que **A XOR B = C et que C XOR B = A**, on peut faire un **xor** pour obtenir le keystream utilisé pour chiffrer, il faut utiliser que les 12 premiers octets des headers.
```python
Cipher:
ae 16 1f 4b 80 b4 80 61 3e b9 56 a8
        
        XOR

Plain (JPG):
ff d8 ff e0 00 10 4a 46 49 46 00 01
```

on obtient donc le **keystream**
```python
51 ce e0 ab | 80 a4 ca 27 | 77 ff 56 a9
```

Ensuite on peut réconstruire les **state**, retrouvez **multiplier (m)** et **increment (c)** en inversant le processus fait par l'algo.

```python
# --- 4. Reconstituer les états LCG (u32 little-endian)
s1 = u32(keystream[0:4])
s2 = u32(keystream[4:8])
s3 = u32(keystream[8:12])

m = ((s3 - s2) * inv_u32((s2 - s1) % MOD)) % MOD
c = (s2 - s1 * m) % MOD

# --- 6. Générer le keystream complet
state = s1
```

Ensuite le déchiffrement se fait en réfaisant un **XOR** entre le cipher et la keystream qu'on a réconstitué.
```python
# --- 7. Déchiffrement
plain = bytes(c ^ k for c, k in zip(cipher, full_keystream))
```

[image](./datacenter.jpg)




