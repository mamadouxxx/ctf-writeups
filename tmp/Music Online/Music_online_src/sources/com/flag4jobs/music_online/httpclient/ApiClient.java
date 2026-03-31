package com.flag4jobs.music_online.httpclient;

import android.content.Context;
import com.flag4jobs.music_online.R;
import com.flag4jobs.music_online.httpclient.crypto.HMACSignature;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import okio.Buffer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes.dex */
public class ApiClient {
    private static final String BASE_URL = "https://worker01.flag4jobs.live:10460/";
    private static final String TAG = "ApiClient";
    private static ApiService apiService;
    private static String jwt;

    public static void setJWT(String str) {
        apiService = null;
        jwt = str;
    }

    private static OkHttpClient getPinnedClient(Context context, OkHttpClient.Builder builder) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.server_cert);
            try {
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpenRawResource);
                inputStreamOpenRawResource.close();
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry("ca", certificateGenerateCertificate);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{x509TrustManager}, new SecureRandom());
                builder.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager).hostnameVerifier(new HostnameVerifier() { // from class: com.flag4jobs.music_online.httpclient.ApiClient$$ExternalSyntheticLambda0
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str, SSLSession sSLSession) {
                        return str.endsWith(".flag4jobs.live");
                    }
                });
                return builder.build();
            } catch (Throwable th) {
                inputStreamOpenRawResource.close();
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to setup SSL pinning", e);
        }
    }

    public static ApiService getApiService(Context context) {
        if (apiService == null) {
            CertificatePinner certificatePinnerBuild = new CertificatePinner.Builder().add(BASE_URL.replaceFirst("https://", "").split(":")[0], "sha256/gDJq4PqZVw38WxHtTk/P8R3HVSe7M10tu4QSj2ewczk=").build();
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builderCertificatePinner = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).certificatePinner(certificatePinnerBuild);
            builderCertificatePinner.addInterceptor(new Interceptor() { // from class: com.flag4jobs.music_online.httpclient.ApiClient$$ExternalSyntheticLambda1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return ApiClient.lambda$getApiService$1(chain);
                }
            });
            apiService = (ApiService) new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(getPinnedClient(context, builderCertificatePinner)).build().create(ApiService.class);
        }
        return apiService;
    }

    static /* synthetic */ Response lambda$getApiService$1(Interceptor.Chain chain) throws IOException {
        String utf8;
        String strGenerateSignature;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody == null) {
            utf8 = "";
        } else {
            Buffer buffer = new Buffer();
            requestBodyBody.writeTo(buffer);
            utf8 = buffer.readUtf8();
        }
        try {
            strGenerateSignature = HMACSignature.generateSignature(utf8);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            strGenerateSignature = null;
        }
        Request.Builder builderNewBuilder = request.newBuilder();
        String str = jwt;
        if (str != null && !str.isEmpty()) {
            builderNewBuilder.header("Authorization", "Bearer " + jwt);
        }
        if (strGenerateSignature != null) {
            builderNewBuilder.header("X-Signature", strGenerateSignature);
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
