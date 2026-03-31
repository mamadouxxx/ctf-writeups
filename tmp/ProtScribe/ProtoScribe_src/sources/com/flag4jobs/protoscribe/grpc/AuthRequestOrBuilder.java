package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface AuthRequestOrBuilder extends MessageOrBuilder {
    String getPassword();

    ByteString getPasswordBytes();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();
}
