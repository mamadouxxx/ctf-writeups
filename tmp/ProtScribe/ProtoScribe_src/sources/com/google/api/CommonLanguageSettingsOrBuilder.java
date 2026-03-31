package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CommonLanguageSettingsOrBuilder extends MessageOrBuilder {
    ClientLibraryDestination getDestinations(int i);

    int getDestinationsCount();

    List<ClientLibraryDestination> getDestinationsList();

    int getDestinationsValue(int i);

    List<Integer> getDestinationsValueList();

    @Deprecated
    String getReferenceDocsUri();

    @Deprecated
    ByteString getReferenceDocsUriBytes();
}
