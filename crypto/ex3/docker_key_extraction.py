import socket
import binascii
import time

HOST = "10.201.220.8"
PORT = 30041

# 🔴 Token valide récupéré depuis le serveur
TOKEN_HEX = "e0f4419e4908371d2f0d24838701d1b99bd633f1256d15270d6041eee564a39bdbdad86c5964898bfd8b6c56b58fe8f1"
token = bytearray(binascii.unhexlify(TOKEN_HEX))

IV  = token[:16]
C1  = token[16:32]
C2  = token[32:48]

def oracle(test_token_hex: str) -> bool:
    """Retourne True si padding accepté"""
    s = socket.socket()
    s.connect((HOST, PORT))
    s.recv(1024)  # banner
    s.sendall(test_token_hex.encode() + b"\n")
    out = s.recv(1024)
    s.close()
    return b"Access granted" in out


print("[*] Brute-force du dernier octet du padding...")

original = C1[-1]

for guess in range(256):
    C1[-1] = original ^ guess ^ 0x01  # force padding = 1
    forged = IV + C1 + C2
    forged_hex = binascii.hexlify(forged).decode()

    if oracle(forged_hex):
        print("[+] TOKEN VALIDE TROUVÉ !!!")
        print(f"[+] Guess = {guess:#x}")
        print(f"[+] Token = {forged_hex}")
        break

    time.sleep(0.05)
else:
    print("[-] Échec (très improbable)")
