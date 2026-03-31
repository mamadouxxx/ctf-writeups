package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface OrgPolicyViolationInfoOrBuilder extends MessageOrBuilder {
    boolean containsResourceTags(String str);

    Struct getPayload();

    StructOrBuilder getPayloadOrBuilder();

    @Deprecated
    Map<String, String> getResourceTags();

    int getResourceTagsCount();

    Map<String, String> getResourceTagsMap();

    String getResourceTagsOrDefault(String str, String str2);

    String getResourceTagsOrThrow(String str);

    String getResourceType();

    ByteString getResourceTypeBytes();

    ViolationInfo getViolationInfo(int i);

    int getViolationInfoCount();

    List<ViolationInfo> getViolationInfoList();

    ViolationInfoOrBuilder getViolationInfoOrBuilder(int i);

    List<? extends ViolationInfoOrBuilder> getViolationInfoOrBuilderList();

    boolean hasPayload();
}
