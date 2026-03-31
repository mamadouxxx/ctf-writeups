package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ControlOrBuilder extends MessageOrBuilder {
    String getEnvironment();

    ByteString getEnvironmentBytes();

    MethodPolicy getMethodPolicies(int i);

    int getMethodPoliciesCount();

    List<MethodPolicy> getMethodPoliciesList();

    MethodPolicyOrBuilder getMethodPoliciesOrBuilder(int i);

    List<? extends MethodPolicyOrBuilder> getMethodPoliciesOrBuilderList();
}
