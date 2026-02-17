#/bin/bash

FLAG=$(cat flag4)||FLAG="ENO{redacted}"
rm -f flag4

# warm up the RNG
openssl rand 200000000 > /tmp/random

# generate keys
mkdir -p secrets
openssl rand -hex 32 > secrets/aes256.key
openssl genrsa -out secrets/rsa_private.key 1024
openssl rsa -in secrets/rsa_private.key -pubout -out secrets/rsa_public.key

# generate labels
mkdir -p labels
echo -n "This user is an admin" > labels/admin
echo -n "This user is a member" > labels/member

# populate users
mkdir -p users

echo "$FLAG" > users/adminsys.txt
openssl pkeyutl -encrypt -in users/adminsys.txt -pubin \
-inkey secrets/rsa_public.key \
-pkeyopt rsa_padding_mode:oaep \
-pkeyopt rsa_oaep_md:sha256 \
-pkeyopt rsa_mgf1_md:sha256 \
-pkeyopt rsa_oaep_label:$(xxd -p labels/admin | tr -d '\n') \
-out users/adminsys.bin
rm users/adminsys.txt

echo "Hacker and windows specialist!" > users/WindowsMaster.txt
openssl pkeyutl -encrypt -in users/WindowsMaster.txt -pubin \
-inkey secrets/rsa_public.key \
-pkeyopt rsa_padding_mode:oaep \
-pkeyopt rsa_oaep_md:sha256 \
-pkeyopt rsa_mgf1_md:sha256 \
-pkeyopt rsa_oaep_label:$(xxd -p labels/member | tr -d '\n') \
-out users/WindowsMaster.bin
rm users/WindowsMaster.txt

echo "Hacker and Linux specialist!" > users/LinuxMaster.txt
openssl pkeyutl -encrypt -in users/LinuxMaster.txt -pubin \
-inkey secrets/rsa_public.key \
-pkeyopt rsa_padding_mode:oaep \
-pkeyopt rsa_oaep_md:sha256 \
-pkeyopt rsa_mgf1_md:sha256 \
-pkeyopt rsa_oaep_label:$(xxd -p labels/member | tr -d '\n') \
-out users/LinuxMaster.bin
rm users/LinuxMaster.txt

echo "Hacker and crypto specialist!" > users/CryptoMaster.txt
openssl pkeyutl -encrypt -in users/CryptoMaster.txt -pubin \
-inkey secrets/rsa_public.key \
-pkeyopt rsa_padding_mode:oaep \
-pkeyopt rsa_oaep_md:sha256 \
-pkeyopt rsa_mgf1_md:sha256 \
-pkeyopt rsa_oaep_label:$(xxd -p labels/member | tr -d '\n') \
-out users/CryptoMaster.bin
rm users/CryptoMaster.txt

echo "Noob! 200 points Root-Me" > users/Noob.txt
openssl pkeyutl -encrypt -in users/Noob.txt -pubin \
-inkey secrets/rsa_public.key \
-pkeyopt rsa_padding_mode:oaep \
-pkeyopt rsa_oaep_md:sha256 \
-pkeyopt rsa_mgf1_md:sha256 \
-pkeyopt rsa_oaep_label:$(xxd -p labels/member | tr -d '\n') \
-out users/Noob.bin
rm users/Noob.txt