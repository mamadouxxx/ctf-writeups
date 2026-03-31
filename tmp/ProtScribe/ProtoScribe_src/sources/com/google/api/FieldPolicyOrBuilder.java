package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface FieldPolicyOrBuilder extends MessageOrBuilder {
    String getResourcePermission();

    ByteString getResourcePermissionBytes();

    String getResourceType();

    ByteString getResourceTypeBytes();

    String getSelector();

    ByteString getSelectorBytes();
}
