package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface AuthResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    boolean getSuccess();

    String getToken();

    ByteString getTokenBytes();

    String getUuid();

    ByteString getUuidBytes();
}
