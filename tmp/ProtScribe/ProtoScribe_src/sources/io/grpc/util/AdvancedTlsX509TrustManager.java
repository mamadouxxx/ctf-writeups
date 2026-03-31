package io.grpc.util;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AdvancedTlsX509TrustManager extends X509ExtendedTrustManager {
    private static final int MINIMUM_REFRESH_PERIOD_IN_MINUTES = 1;
    private static final String NOT_ENOUGH_INFO_MESSAGE = "Not enough information to validate peer. SSLEngine or Socket required.";
    private static final Logger log = Logger.getLogger(AdvancedTlsX509TrustManager.class.getName());
    private volatile X509ExtendedTrustManager delegateManager;
    private final SslSocketAndEnginePeerVerifier socketAndEnginePeerVerifier;
    private final Verification verification;

    public interface Closeable extends java.io.Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    public interface SslSocketAndEnginePeerVerifier {
        void verifyPeerCertificate(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException;

        void verifyPeerCertificate(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException;
    }

    public enum Verification {
        CERTIFICATE_AND_HOST_NAME_VERIFICATION,
        CERTIFICATE_ONLY_VERIFICATION,
        INSECURELY_SKIP_ALL_VERIFICATION
    }

    private AdvancedTlsX509TrustManager(Verification verification, SslSocketAndEnginePeerVerifier sslSocketAndEnginePeerVerifier) {
        this.delegateManager = null;
        this.verification = verification;
        this.socketAndEnginePeerVerifier = sslSocketAndEnginePeerVerifier;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException(NOT_ENOUGH_INFO_MESSAGE);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, socket, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        checkTrusted(x509CertificateArr, str, sSLEngine, null, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        checkTrusted(x509CertificateArr, str, sSLEngine, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException(NOT_ENOUGH_INFO_MESSAGE);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, socket, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        if (this.delegateManager == null) {
            return new X509Certificate[0];
        }
        return this.delegateManager.getAcceptedIssuers();
    }

    public void useSystemDefaultTrustCerts() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        this.delegateManager = createDelegateTrustManager(null);
    }

    private static X509ExtendedTrustManager createDelegateTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        X509ExtendedTrustManager x509ExtendedTrustManager;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                x509ExtendedTrustManager = null;
                break;
            }
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509ExtendedTrustManager) {
                x509ExtendedTrustManager = (X509ExtendedTrustManager) trustManager;
                break;
            }
            i++;
        }
        if (x509ExtendedTrustManager != null) {
            return x509ExtendedTrustManager;
        }
        throw new CertificateException("Failed to find X509ExtendedTrustManager with default TrustManager algorithm " + TrustManagerFactory.getDefaultAlgorithm());
    }

    private void checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, Socket socket, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("Want certificate verification but got null or empty certificates");
        }
        if (sSLEngine == null && socket == null) {
            throw new CertificateException(NOT_ENOUGH_INFO_MESSAGE);
        }
        if (this.verification != Verification.INSECURELY_SKIP_ALL_VERIFICATION) {
            X509ExtendedTrustManager x509ExtendedTrustManager = this.delegateManager;
            if (x509ExtendedTrustManager == null) {
                throw new CertificateException("No trust roots configured");
            }
            if (z) {
                String str2 = this.verification == Verification.CERTIFICATE_AND_HOST_NAME_VERIFICATION ? "HTTPS" : "";
                if (sSLEngine != null) {
                    SSLParameters sSLParameters = sSLEngine.getSSLParameters();
                    sSLParameters.setEndpointIdentificationAlgorithm(str2);
                    sSLEngine.setSSLParameters(sSLParameters);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLEngine);
                } else {
                    if (!(socket instanceof SSLSocket)) {
                        throw new CertificateException("socket is not a type of SSLSocket");
                    }
                    SSLSocket sSLSocket = (SSLSocket) socket;
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    sSLParameters2.setEndpointIdentificationAlgorithm(str2);
                    sSLSocket.setSSLParameters(sSLParameters2);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLSocket);
                }
            } else if (sSLEngine != null) {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, sSLEngine);
            } else {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, socket);
            }
        }
        SslSocketAndEnginePeerVerifier sslSocketAndEnginePeerVerifier = this.socketAndEnginePeerVerifier;
        if (sslSocketAndEnginePeerVerifier != null) {
            if (sSLEngine != null) {
                sslSocketAndEnginePeerVerifier.verifyPeerCertificate(x509CertificateArr, str, sSLEngine);
            } else {
                sslSocketAndEnginePeerVerifier.verifyPeerCertificate(x509CertificateArr, str, socket);
            }
        }
    }

    public void updateTrustCredentials(X509Certificate[] x509CertificateArr) throws GeneralSecurityException, IOException {
        Preconditions.checkNotNull(x509CertificateArr, "trustCerts");
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i = 1;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            keyStore.setCertificateEntry(Integer.toString(i), x509Certificate);
            i++;
        }
        this.delegateManager = createDelegateTrustManager(keyStore);
    }

    public void updateTrustCredentials(File file) throws GeneralSecurityException, IOException {
        if (readAndUpdate(file, 0L) == 0) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }

    public Closeable updateTrustCredentials(File file, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        TimeUnit timeUnit2;
        long j2;
        if (readAndUpdate(file, 0L) == 0) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
        if (((TimeUnit) Preconditions.checkNotNull(timeUnit, "unit")).toMinutes(j) < 1) {
            log.log(Level.FINE, "Provided refresh period of {0} {1} is too small. Default value of {2} minute(s) will be used.", new Object[]{Long.valueOf(j), timeUnit.name(), 1});
            timeUnit2 = TimeUnit.MINUTES;
            j2 = 1;
        } else {
            timeUnit2 = timeUnit;
            j2 = j;
        }
        final ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = ((ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "executor")).scheduleWithFixedDelay(new LoadFilePathExecution(file), j2, j2, timeUnit2);
        return new Closeable() { // from class: io.grpc.util.AdvancedTlsX509TrustManager$$ExternalSyntheticLambda0
            @Override // io.grpc.util.AdvancedTlsX509TrustManager.Closeable, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                scheduledFutureScheduleWithFixedDelay.cancel(false);
            }
        };
    }

    @Deprecated
    public Closeable updateTrustCredentialsFromFile(File file, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        return updateTrustCredentials(file, j, timeUnit, scheduledExecutorService);
    }

    @Deprecated
    public void updateTrustCredentialsFromFile(File file) throws GeneralSecurityException, IOException {
        updateTrustCredentials(file);
    }

    private class LoadFilePathExecution implements Runnable {
        long currentTime = 0;
        File file;

        public LoadFilePathExecution(File file) {
            this.file = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.currentTime = AdvancedTlsX509TrustManager.this.readAndUpdate(this.file, this.currentTime);
            } catch (IOException | GeneralSecurityException e) {
                AdvancedTlsX509TrustManager.log.log(Level.SEVERE, String.format("Failed refreshing trust CAs from file. Using previous CAs (file lastModified = %s)", Long.valueOf(this.file.lastModified())), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long readAndUpdate(File file, long j) throws GeneralSecurityException, IOException {
        long jLastModified = ((File) Preconditions.checkNotNull(file, "trustCertFile")).lastModified();
        if (jLastModified == j) {
            return j;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            updateTrustCredentials(CertificateUtils.getX509Certificates(fileInputStream));
            return jLastModified;
        } finally {
            fileInputStream.close();
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private SslSocketAndEnginePeerVerifier socketAndEnginePeerVerifier;
        private Verification verification;

        private Builder() {
            this.verification = Verification.CERTIFICATE_AND_HOST_NAME_VERIFICATION;
        }

        public Builder setVerification(Verification verification) {
            this.verification = verification;
            return this;
        }

        public Builder setSslSocketAndEnginePeerVerifier(SslSocketAndEnginePeerVerifier sslSocketAndEnginePeerVerifier) {
            this.socketAndEnginePeerVerifier = sslSocketAndEnginePeerVerifier;
            return this;
        }

        public AdvancedTlsX509TrustManager build() throws CertificateException {
            return new AdvancedTlsX509TrustManager(this.verification, this.socketAndEnginePeerVerifier);
        }
    }
}
