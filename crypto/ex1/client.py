from Crypto.Cipher import ChaCha20_Poly1305

class Client:
    def __init__(self, shared_key):
        self.key = shared_key
        self.send_ctr = 0
        self.recv_ctr = 0

    def send_message(self, plaintext):
        nonce = self.send_ctr.to_bytes(12, 'big')
        self.send_ctr += 1
        cipher = ChaCha20_Poly1305.new(key=self.key, nonce=nonce)
        ciphertext, tag = cipher.encrypt_and_digest(plaintext)
        return ciphertext + tag

    def recv_message(self, ciphertext):
        nonce = self.recv_ctr.to_bytes(12, 'big')
        self.recv_ctr += 1
        cipher = ChaCha20_Poly1305.new(key=self.key, nonce=nonce)
        plaintext = cipher.decrypt_and_verify(ciphertext[:-16], ciphertext[-16:])
        return plaintext
