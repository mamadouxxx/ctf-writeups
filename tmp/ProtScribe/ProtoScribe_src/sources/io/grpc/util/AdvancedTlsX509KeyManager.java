package io.grpc.util;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AdvancedTlsX509KeyManager extends X509ExtendedKeyManager {
    private static final int MINIMUM_REFRESH_PERIOD_IN_MINUTES = 1;
    private static final Logger log = Logger.getLogger(AdvancedTlsX509KeyManager.class.getName());
    private volatile KeyInfo keyInfo;

    public interface Closeable extends java.io.Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        if (str.equals("default")) {
            return this.keyInfo.key;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        if (str.equals("default")) {
            return (X509Certificate[]) Arrays.copyOf(this.keyInfo.certs, this.keyInfo.certs.length);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Deprecated
    public void updateIdentityCredentials(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        updateIdentityCredentials(x509CertificateArr, privateKey);
    }

    public void updateIdentityCredentials(X509Certificate[] x509CertificateArr, PrivateKey privateKey) {
        this.keyInfo = new KeyInfo((X509Certificate[]) Preconditions.checkNotNull(x509CertificateArr, "certs"), (PrivateKey) Preconditions.checkNotNull(privateKey, "key"));
    }

    public Closeable updateIdentityCredentials(File file, File file2, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        TimeUnit timeUnit2;
        long j2;
        if (!readAndUpdate(file, file2, 0L, 0L).success) {
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
        final ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay = ((ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "executor")).scheduleWithFixedDelay(new LoadFilePathExecution(file, file2), j2, j2, timeUnit2);
        return new Closeable() { // from class: io.grpc.util.AdvancedTlsX509KeyManager$$ExternalSyntheticLambda0
            @Override // io.grpc.util.AdvancedTlsX509KeyManager.Closeable, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                scheduledFutureScheduleWithFixedDelay.cancel(false);
            }
        };
    }

    public void updateIdentityCredentials(File file, File file2) throws GeneralSecurityException, IOException {
        if (!readAndUpdate(file, file2, 0L, 0L).success) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }

    @Deprecated
    public void updateIdentityCredentialsFromFile(File file, File file2) throws GeneralSecurityException, IOException {
        updateIdentityCredentials(file2, file);
    }

    @Deprecated
    public Closeable updateIdentityCredentialsFromFile(File file, File file2, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        return updateIdentityCredentials(file2, file, j, timeUnit, scheduledExecutorService);
    }

    private static class KeyInfo {
        final X509Certificate[] certs;
        final PrivateKey key;

        public KeyInfo(X509Certificate[] x509CertificateArr, PrivateKey privateKey) {
            this.certs = x509CertificateArr;
            this.key = privateKey;
        }
    }

    private class LoadFilePathExecution implements Runnable {
        File certFile;
        long currentCertTime = 0;
        long currentKeyTime = 0;
        File keyFile;

        public LoadFilePathExecution(File file, File file2) {
            this.certFile = file;
            this.keyFile = file2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UpdateResult andUpdate = AdvancedTlsX509KeyManager.this.readAndUpdate(this.certFile, this.keyFile, this.currentKeyTime, this.currentCertTime);
                if (andUpdate.success) {
                    this.currentCertTime = andUpdate.certTime;
                    this.currentKeyTime = andUpdate.keyTime;
                }
            } catch (IOException | GeneralSecurityException e) {
                AdvancedTlsX509KeyManager.log.log(Level.SEVERE, String.format("Failed refreshing certificate and private key chain from files. Using previous ones (certFile lastModified = %s, keyFile lastModified = %s)", Long.valueOf(this.certFile.lastModified()), Long.valueOf(this.keyFile.lastModified())), e);
            }
        }
    }

    private static class UpdateResult {
        long certTime;
        long keyTime;
        boolean success;

        public UpdateResult(boolean z, long j, long j2) {
            this.success = z;
            this.certTime = j;
            this.keyTime = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UpdateResult readAndUpdate(File file, File file2, long j, long j2) throws Throwable {
        long jLastModified = ((File) Preconditions.checkNotNull(file2, "keyFile")).lastModified();
        long jLastModified2 = ((File) Preconditions.checkNotNull(file, "certFile")).lastModified();
        if (jLastModified != j && jLastModified2 != j2) {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                try {
                    PrivateKey privateKey = CertificateUtils.getPrivateKey(fileInputStream);
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        try {
                            updateIdentityCredentials(CertificateUtils.getX509Certificates(fileInputStream2), privateKey);
                            UpdateResult updateResult = new UpdateResult(true, jLastModified, jLastModified2);
                            fileInputStream2.close();
                            fileInputStream.close();
                            return updateResult;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream.close();
                throw th;
            }
        } else {
            return new UpdateResult(false, j, j2);
        }
    }
}
