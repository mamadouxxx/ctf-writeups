package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface ContactOrBuilder extends MessageOrBuilder {
    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    String getUuid();

    ByteString getUuidBytes();
}
