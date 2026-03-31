package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ShareNoteResponseOrBuilder extends MessageOrBuilder {
    Contact getContacts(int i);

    int getContactsCount();

    List<Contact> getContactsList();

    ContactOrBuilder getContactsOrBuilder(int i);

    List<? extends ContactOrBuilder> getContactsOrBuilderList();

    String getError();

    ByteString getErrorBytes();

    boolean getSuccess();
}
