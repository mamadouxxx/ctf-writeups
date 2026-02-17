# EX1

dans output.txt, on à accès à des échanges chiffrés et en clair entre une deux ip **15 et 63**. les messages sont obtenus par la mise en place d'un keylogger sur **15**.

A priori, pas de vuln dans le code python forunit, les compteurs sont bien séparés.

Mais en observant **output.txt** et en essayant de faire un **XOR** entre un message clair connu et un son chiffré, on obtient une keystream avec la quelle on peut tester un **xor** avec un autre chiffré connu pour voir si on peut obtenir un déchiffrement lisible, ce qui impliquerai donc une réutilisation d'un même nonce à un certain momment dans l'implémentation réelle.

Et j'ai donc obtenu une keystream via le troisième msg envoyéen faisant :
```python
pt3 = b'Thx. Can you send me the password to open the file via SMS ?'
ct3_hex = '7482d4a91b4ed3fb5c654752ebccd7628e40fc9e83253bdeb5c1ba9755230060fe9f1472a6869858ea72bfcdab94a916515d002e27ccf32ca74fd48c8b0719ff0b41a053cb32c01483cf091a'
ct3 = unhexlify(ct3_hex)
keystream3 = bytes(a ^ b for a,b in zip(pt3, ct3[:-16]))
```

Keystream que j'ai utilisé ensuite dans un **xor** avec le 3eme message réçu.
```python
# Message reçu n°3 (recv_ctr=2)
recv2_hex = '65a4e3fc623dc7ca1b2c5c78facb9353ac51ffbffc053b88cac1ea8772211d21c58f0e42f281db62ca61b3f191f7a74b51545db8fb69fbd717f7410b5261242e904e2b'
recv2 = unhexlify(recv2_hex)
recv2_ct = recv2[:-16]   # 48 octets

# Déchiffre
decrypted = bytes(a ^ b for a,b in zip(keystream3[:len(recv2_ct)], recv2_ct))
```


```python
Message reçu n°3 déchiffré (bytes) : b'ENO{Y0u_g0t_1t!_F1nD_Th3_p1cTur3_0n_th3_N3xT_Ch4ll}'
En texte : ENO{Y0u_g0t_1t!_F1nD_Th3_p1cTur3_0n_th3_N3xT_Ch4ll}
```