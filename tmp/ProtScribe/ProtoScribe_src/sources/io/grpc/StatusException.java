package io.grpc;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    private final Status status;
    private final Metadata trailers;

    public StatusException(Status status) {
        this(status, null);
    }

    public StatusException(Status status, @Nullable Metadata metadata) {
        this(status, metadata, true);
    }

    StatusException(Status status, @Nullable Metadata metadata, boolean z) {
        super(Status.formatThrowableMessage(status), status.getCause(), true, z);
        this.status = status;
        this.trailers = metadata;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Metadata getTrailers() {
        return this.trailers;
    }
}
