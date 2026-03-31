package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface AuditContextOrBuilder extends MessageOrBuilder {
    ByteString getAuditLog();

    Struct getScrubbedRequest();

    StructOrBuilder getScrubbedRequestOrBuilder();

    Struct getScrubbedResponse();

    int getScrubbedResponseItemCount();

    StructOrBuilder getScrubbedResponseOrBuilder();

    String getTargetResource();

    ByteString getTargetResourceBytes();

    boolean hasScrubbedRequest();

    boolean hasScrubbedResponse();
}
