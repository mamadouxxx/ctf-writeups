package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ShareNoteRequestOrBuilder extends MessageOrBuilder {
    String getPhoneNumbers(int i);

    ByteString getPhoneNumbersBytes(int i);

    int getPhoneNumbersCount();

    List<String> getPhoneNumbersList();

    String getToken();

    ByteString getTokenBytes();

    String getUuid();

    ByteString getUuidBytes();
}
