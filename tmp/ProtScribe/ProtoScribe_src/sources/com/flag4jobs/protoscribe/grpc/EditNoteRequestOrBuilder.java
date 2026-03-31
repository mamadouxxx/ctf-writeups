package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface EditNoteRequestOrBuilder extends MessageOrBuilder {
    String getContent();

    ByteString getContentBytes();

    String getTitle();

    ByteString getTitleBytes();

    String getToken();

    ByteString getTokenBytes();

    String getUuid();

    ByteString getUuidBytes();
}
