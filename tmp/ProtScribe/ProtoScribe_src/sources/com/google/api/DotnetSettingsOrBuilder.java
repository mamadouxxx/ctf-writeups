package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface DotnetSettingsOrBuilder extends MessageOrBuilder {
    boolean containsRenamedResources(String str);

    boolean containsRenamedServices(String str);

    CommonLanguageSettings getCommon();

    CommonLanguageSettingsOrBuilder getCommonOrBuilder();

    String getForcedNamespaceAliases(int i);

    ByteString getForcedNamespaceAliasesBytes(int i);

    int getForcedNamespaceAliasesCount();

    List<String> getForcedNamespaceAliasesList();

    String getHandwrittenSignatures(int i);

    ByteString getHandwrittenSignaturesBytes(int i);

    int getHandwrittenSignaturesCount();

    List<String> getHandwrittenSignaturesList();

    String getIgnoredResources(int i);

    ByteString getIgnoredResourcesBytes(int i);

    int getIgnoredResourcesCount();

    List<String> getIgnoredResourcesList();

    @Deprecated
    Map<String, String> getRenamedResources();

    int getRenamedResourcesCount();

    Map<String, String> getRenamedResourcesMap();

    String getRenamedResourcesOrDefault(String str, String str2);

    String getRenamedResourcesOrThrow(String str);

    @Deprecated
    Map<String, String> getRenamedServices();

    int getRenamedServicesCount();

    Map<String, String> getRenamedServicesMap();

    String getRenamedServicesOrDefault(String str, String str2);

    String getRenamedServicesOrThrow(String str);

    boolean hasCommon();
}
