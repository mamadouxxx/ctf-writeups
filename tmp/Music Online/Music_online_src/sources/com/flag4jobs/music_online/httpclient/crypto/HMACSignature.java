package com.flag4jobs.music_online.httpclient.crypto;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class HMACSignature {
    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final String HMAC_KEY = "e98be7e6af2a689df910405d344370ff088accad0cd129f120cb37c104b72d9e";

    public static String generateSignature(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(HMAC_KEY.getBytes(StandardCharsets.UTF_8), HMAC_ALGORITHM);
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        mac.init(secretKeySpec);
        return bytesToHex(mac.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
