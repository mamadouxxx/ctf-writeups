package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface GetNotesResponseOrBuilder extends MessageOrBuilder {
    String getError();

    ByteString getErrorBytes();

    String getNotesUuid(int i);

    ByteString getNotesUuidBytes(int i);

    int getNotesUuidCount();

    List<String> getNotesUuidList();

    boolean getSuccess();
}
