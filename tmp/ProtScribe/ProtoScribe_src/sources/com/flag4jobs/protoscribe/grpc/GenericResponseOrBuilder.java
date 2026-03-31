package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface GenericResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    boolean getSuccess();
}
