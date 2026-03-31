package com.flag4jobs.carzz.net;

import android.util.Base64;
import android.util.Log;
import com.flag4jobs.carzz.net.NetCrypto;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NetHTTPClient {
    private static final String CRLF = "\r\n";
    private static final String TAG = "NetHTTPClient";

    private NetHTTPResponse parseResponse(InputStream inputStream) throws IOException {
        String line;
        HashMap map = new HashMap();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        int i = -1;
        boolean z = false;
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                line = "";
                break;
            }
            if (line.startsWith("HTTP/1.1")) {
                i = Integer.parseInt(line.split(" ")[1]);
            } else if (line.isEmpty()) {
                z = true;
            } else {
                if (z) {
                    break;
                }
                String[] strArrSplit = line.split(": ");
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        try {
            return new NetHTTPResponse(i, map, new JSONObject(new String(NetCrypto.aesDecrypt(new NetCrypto.EncryptionResult(Base64.decode((String) map.get("X-Nonce"), 2), Base64.decode(line, 2))), StandardCharsets.UTF_8)));
        } catch (Exception e) {
            Log.e(TAG, "Error in parseResponse(...): " + e.getMessage());
            return null;
        }
    }

    private NetHTTPResponse sendHTTP(final URL url, final String str, byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write("--Carzz\r\n".getBytes(StandardCharsets.UTF_8));
            byteArrayOutputStream.write("Content-Disposition: form-data; name=\"data\"\r\n".getBytes(StandardCharsets.UTF_8));
            byteArrayOutputStream.write("Content-Type: application/octet-stream\r\n\r\n".getBytes(StandardCharsets.UTF_8));
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write("\r\n--Carzz--".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            Log.e(TAG, "Error in sendHTTP(" + str + ", " + Arrays.toString(bArr) + ", ...): " + e.getMessage());
        }
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        String path = !url.getPath().isEmpty() ? url.getPath() : "/";
        String authority = url.getAuthority();
        final StringBuilder sb = new StringBuilder();
        sb.append("POST " + path + " HTTP/1.1\r\n");
        sb.append("Host: " + authority + CRLF);
        sb.append("Content-Length: " + byteArray.length + CRLF);
        sb.append("Content-Type: multipart/form-data; boundary=Carzz\r\n");
        if (str != null) {
            sb.append("Cookie: session=" + str + CRLF);
        }
        final String strEncodeToString = Base64.encodeToString(bArr, 2);
        if (bArr != null) {
            sb.append("X-Nonce: " + strEncodeToString + CRLF);
        }
        sb.append("Connection: close\r\n\r\n");
        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        final AtomicReference atomicReference = new AtomicReference();
        Thread thread = new Thread(new Runnable() { // from class: com.flag4jobs.carzz.net.NetHTTPClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.lambda$sendHTTP$0(byteArrayOutputStream2, sb, byteArray, url, atomicReference, str, strEncodeToString);
            }
        });
        thread.start();
        try {
            thread.join(5000L);
        } catch (InterruptedException e2) {
            Log.e(TAG, "Error in sendHTTP(" + str + ", " + bArr + ", ...): " + e2.getMessage());
        }
        return (NetHTTPResponse) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendHTTP$0(ByteArrayOutputStream byteArrayOutputStream, StringBuilder sb, byte[] bArr, URL url, AtomicReference atomicReference, String str, String str2) throws Throwable {
        byte[] byteArray;
        Socket socket;
        Socket socket2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                    byteArrayOutputStream.write(bArr);
                    byteArray = byteArrayOutputStream.toByteArray();
                    socket = new Socket(url.getHost(), url.getPort());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                OutputStream outputStream = socket.getOutputStream();
                InputStream inputStream = socket.getInputStream();
                outputStream.write(byteArray);
                atomicReference.set(parseResponse(inputStream));
                socket.close();
            } catch (Exception e2) {
                e = e2;
                socket2 = socket;
                Log.e(TAG, "Error in sendHTTP(" + str + ", " + str2 + ", ...):");
                e.printStackTrace();
                if (socket2 == null) {
                } else {
                    socket2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                socket2 = socket;
                if (socket2 != null) {
                    try {
                        socket2.close();
                    } catch (IOException unused) {
                        Log.e(TAG, "Error closing the socket");
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            Log.e(TAG, "Error closing the socket");
        }
    }

    public NetHTTPResponse send(URL url, String str, NetAction netAction, ArrayList<byte[]> arrayList) {
        String str2 = String.format(Locale.ENGLISH, "%04d", Integer.valueOf(netAction.getID()));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
                for (int i = 0; i < arrayList.size(); i++) {
                    byteArrayOutputStream.write(String.format(Locale.ENGLISH, "%08d", Integer.valueOf(arrayList.get(i).length)).getBytes(StandardCharsets.UTF_8));
                    byteArrayOutputStream.write(arrayList.get(i));
                }
                NetCrypto.EncryptionResult encryptionResultAesEncrypt = NetCrypto.aesEncrypt(byteArrayOutputStream.toByteArray());
                NetHTTPResponse netHTTPResponseSendHTTP = sendHTTP(url, str, encryptionResultAesEncrypt.iv, Base64.encodeToString(encryptionResultAesEncrypt.ciphertext, 2).getBytes(StandardCharsets.UTF_8));
                byteArrayOutputStream.close();
                return netHTTPResponseSendHTTP;
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "Error in send(" + netAction + ", ...): " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
