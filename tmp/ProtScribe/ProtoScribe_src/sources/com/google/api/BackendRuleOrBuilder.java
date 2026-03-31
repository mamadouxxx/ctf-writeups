package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface BackendRuleOrBuilder extends MessageOrBuilder {
    boolean containsOverridesByRequestProtocol(String str);

    String getAddress();

    ByteString getAddressBytes();

    BackendRule.AuthenticationCase getAuthenticationCase();

    double getDeadline();

    boolean getDisableAuth();

    String getJwtAudience();

    ByteString getJwtAudienceBytes();

    @Deprecated
    double getMinDeadline();

    double getOperationDeadline();

    @Deprecated
    Map<String, BackendRule> getOverridesByRequestProtocol();

    int getOverridesByRequestProtocolCount();

    Map<String, BackendRule> getOverridesByRequestProtocolMap();

    BackendRule getOverridesByRequestProtocolOrDefault(String str, BackendRule backendRule);

    BackendRule getOverridesByRequestProtocolOrThrow(String str);

    BackendRule.PathTranslation getPathTranslation();

    int getPathTranslationValue();

    String getProtocol();

    ByteString getProtocolBytes();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasDisableAuth();

    boolean hasJwtAudience();
}
