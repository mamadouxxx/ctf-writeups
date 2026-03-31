package com.flag4jobs.carzz.net;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class NetCrypto {
    private static final String AES = "AES";
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String TAG = "CryptoUtils";

    public static native byte[] getAesKey();

    static {
        System.loadLibrary("carzz-lib");
    }

    public static byte[] getRandomIV() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static class EncryptionResult {
        public final byte[] ciphertext;
        public final byte[] iv;

        public EncryptionResult(byte[] bArr, byte[] bArr2) {
            this.iv = bArr;
            this.ciphertext = bArr2;
        }

        public String toString() {
            return "IV: " + Arrays.toString(this.iv) + ", Ciphertext: " + Arrays.toString(this.ciphertext);
        }
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static EncryptionResult aesEncrypt(byte[] bArr) throws Exception {
        byte[] aesKey = getAesKey();
        byte[] randomIV = getRandomIV();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(1, new SecretKeySpec(aesKey, AES), new IvParameterSpec(randomIV));
        return new EncryptionResult(randomIV, cipher.doFinal(bArr));
    }

    public static byte[] aesDecrypt(EncryptionResult encryptionResult) throws Exception {
        byte[] aesKey = getAesKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(2, new SecretKeySpec(aesKey, AES), new IvParameterSpec(encryptionResult.iv));
        return cipher.doFinal(encryptionResult.ciphertext);
    }
}
