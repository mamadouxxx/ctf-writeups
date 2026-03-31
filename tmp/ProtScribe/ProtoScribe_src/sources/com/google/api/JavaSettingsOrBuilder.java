package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface JavaSettingsOrBuilder extends MessageOrBuilder {
    boolean containsServiceClassNames(String str);

    CommonLanguageSettings getCommon();

    CommonLanguageSettingsOrBuilder getCommonOrBuilder();

    String getLibraryPackage();

    ByteString getLibraryPackageBytes();

    @Deprecated
    Map<String, String> getServiceClassNames();

    int getServiceClassNamesCount();

    Map<String, String> getServiceClassNamesMap();

    String getServiceClassNamesOrDefault(String str, String str2);

    String getServiceClassNamesOrThrow(String str);

    boolean hasCommon();
}
