package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MethodPolicyOrBuilder extends MessageOrBuilder {
    FieldPolicy getRequestPolicies(int i);

    int getRequestPoliciesCount();

    List<FieldPolicy> getRequestPoliciesList();

    FieldPolicyOrBuilder getRequestPoliciesOrBuilder(int i);

    List<? extends FieldPolicyOrBuilder> getRequestPoliciesOrBuilderList();

    String getSelector();

    ByteString getSelectorBytes();
}
