package com.google.cloud.audit;

import com.google.cloud.audit.ViolationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface ViolationInfoOrBuilder extends MessageOrBuilder {
    String getCheckedValue();

    ByteString getCheckedValueBytes();

    String getConstraint();

    ByteString getConstraintBytes();

    String getErrorMessage();

    ByteString getErrorMessageBytes();

    ViolationInfo.PolicyType getPolicyType();

    int getPolicyTypeValue();
}
