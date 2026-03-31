package com.google.cloud.audit;

import com.google.cloud.audit.ViolationInfo;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OrgPolicyViolationInfo extends GeneratedMessageV3 implements OrgPolicyViolationInfoOrBuilder {
    private static final OrgPolicyViolationInfo DEFAULT_INSTANCE = new OrgPolicyViolationInfo();
    private static final Parser<OrgPolicyViolationInfo> PARSER = new AbstractParser<OrgPolicyViolationInfo>() { // from class: com.google.cloud.audit.OrgPolicyViolationInfo.1
        @Override // com.google.protobuf.Parser
        public OrgPolicyViolationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = OrgPolicyViolationInfo.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e2) {
                throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    };
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    public static final int RESOURCE_TAGS_FIELD_NUMBER = 3;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 2;
    public static final int VIOLATION_INFO_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private Struct payload_;
    private MapField<String, String> resourceTags_;
    private volatile Object resourceType_;
    private List<ViolationInfo> violationInfo_;

    static /* synthetic */ int access$876(OrgPolicyViolationInfo orgPolicyViolationInfo, int i) {
        int i2 = i | orgPolicyViolationInfo.bitField0_;
        orgPolicyViolationInfo.bitField0_ = i2;
        return i2;
    }

    private OrgPolicyViolationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.resourceType_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private OrgPolicyViolationInfo() {
        this.resourceType_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.resourceType_ = "";
        this.violationInfo_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new OrgPolicyViolationInfo();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
        if (i == 3) {
            return internalGetResourceTags();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OrgPolicyViolationInfo.class, Builder.class);
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public boolean hasPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public Struct getPayload() {
        Struct struct = this.payload_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public StructOrBuilder getPayloadOrBuilder() {
        Struct struct = this.payload_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public String getResourceType() {
        Object obj = this.resourceType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.resourceType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public ByteString getResourceTypeBytes() {
        Object obj = this.resourceType_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.resourceType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    private static final class ResourceTagsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_ResourceTagsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private ResourceTagsDefaultEntryHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetResourceTags() {
        MapField<String, String> mapField = this.resourceTags_;
        return mapField == null ? MapField.emptyMapField(ResourceTagsDefaultEntryHolder.defaultEntry) : mapField;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public int getResourceTagsCount() {
        return internalGetResourceTags().getMap().size();
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public boolean containsResourceTags(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        return internalGetResourceTags().getMap().containsKey(str);
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    @Deprecated
    public Map<String, String> getResourceTags() {
        return getResourceTagsMap();
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public Map<String, String> getResourceTagsMap() {
        return internalGetResourceTags().getMap();
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public String getResourceTagsOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetResourceTags().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public String getResourceTagsOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetResourceTags().getMap();
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return map.get(str);
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public List<ViolationInfo> getViolationInfoList() {
        return this.violationInfo_;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public List<? extends ViolationInfoOrBuilder> getViolationInfoOrBuilderList() {
        return this.violationInfo_;
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public int getViolationInfoCount() {
        return this.violationInfo_.size();
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public ViolationInfo getViolationInfo(int i) {
        return this.violationInfo_.get(i);
    }

    @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
    public ViolationInfoOrBuilder getViolationInfoOrBuilder(int i) {
        return this.violationInfo_.get(i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(1, getPayload());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.resourceType_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.resourceType_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetResourceTags(), ResourceTagsDefaultEntryHolder.defaultEntry, 3);
        for (int i = 0; i < this.violationInfo_.size(); i++) {
            codedOutputStream.writeMessage(4, this.violationInfo_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPayload()) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.resourceType_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.resourceType_);
        }
        for (Map.Entry<String, String> entry : internalGetResourceTags().getMap().entrySet()) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, ResourceTagsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        for (int i2 = 0; i2 < this.violationInfo_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.violationInfo_.get(i2));
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrgPolicyViolationInfo)) {
            return super.equals(obj);
        }
        OrgPolicyViolationInfo orgPolicyViolationInfo = (OrgPolicyViolationInfo) obj;
        if (hasPayload() != orgPolicyViolationInfo.hasPayload()) {
            return false;
        }
        return (!hasPayload() || getPayload().equals(orgPolicyViolationInfo.getPayload())) && getResourceType().equals(orgPolicyViolationInfo.getResourceType()) && internalGetResourceTags().equals(orgPolicyViolationInfo.internalGetResourceTags()) && getViolationInfoList().equals(orgPolicyViolationInfo.getViolationInfoList()) && getUnknownFields().equals(orgPolicyViolationInfo.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasPayload()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPayload().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 2) * 53) + getResourceType().hashCode();
        if (!internalGetResourceTags().getMap().isEmpty()) {
            iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + internalGetResourceTags().hashCode();
        }
        if (getViolationInfoCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getViolationInfoList().hashCode();
        }
        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    public static OrgPolicyViolationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static OrgPolicyViolationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static OrgPolicyViolationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static OrgPolicyViolationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static OrgPolicyViolationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static OrgPolicyViolationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static OrgPolicyViolationInfo parseFrom(InputStream inputStream) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static OrgPolicyViolationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OrgPolicyViolationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OrgPolicyViolationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OrgPolicyViolationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static OrgPolicyViolationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OrgPolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(OrgPolicyViolationInfo orgPolicyViolationInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(orgPolicyViolationInfo);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OrgPolicyViolationInfoOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> payloadBuilder_;
        private Struct payload_;
        private MapField<String, String> resourceTags_;
        private Object resourceType_;
        private RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> violationInfoBuilder_;
        private List<ViolationInfo> violationInfo_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 3) {
                return internalGetResourceTags();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
            if (i == 3) {
                return internalGetMutableResourceTags();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OrgPolicyViolationInfo.class, Builder.class);
        }

        private Builder() {
            this.resourceType_ = "";
            this.violationInfo_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.resourceType_ = "";
            this.violationInfo_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (OrgPolicyViolationInfo.alwaysUseFieldBuilders) {
                getPayloadFieldBuilder();
                getViolationInfoFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.payload_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.payloadBuilder_ = null;
            }
            this.resourceType_ = "";
            internalGetMutableResourceTags().clear();
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.violationInfo_ = Collections.emptyList();
            } else {
                this.violationInfo_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -9;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_OrgPolicyViolationInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OrgPolicyViolationInfo getDefaultInstanceForType() {
            return OrgPolicyViolationInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OrgPolicyViolationInfo build() {
            OrgPolicyViolationInfo orgPolicyViolationInfoBuildPartial = buildPartial();
            if (orgPolicyViolationInfoBuildPartial.isInitialized()) {
                return orgPolicyViolationInfoBuildPartial;
            }
            throw newUninitializedMessageException((Message) orgPolicyViolationInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OrgPolicyViolationInfo buildPartial() {
            OrgPolicyViolationInfo orgPolicyViolationInfo = new OrgPolicyViolationInfo(this);
            buildPartialRepeatedFields(orgPolicyViolationInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(orgPolicyViolationInfo);
            }
            onBuilt();
            return orgPolicyViolationInfo;
        }

        private void buildPartialRepeatedFields(OrgPolicyViolationInfo orgPolicyViolationInfo) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                orgPolicyViolationInfo.violationInfo_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.violationInfo_ = Collections.unmodifiableList(this.violationInfo_);
                this.bitField0_ &= -9;
            }
            orgPolicyViolationInfo.violationInfo_ = this.violationInfo_;
        }

        private void buildPartial0(OrgPolicyViolationInfo orgPolicyViolationInfo) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                orgPolicyViolationInfo.payload_ = singleFieldBuilderV3 == null ? this.payload_ : (Struct) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                orgPolicyViolationInfo.resourceType_ = this.resourceType_;
            }
            if ((i2 & 4) != 0) {
                orgPolicyViolationInfo.resourceTags_ = internalGetResourceTags();
                orgPolicyViolationInfo.resourceTags_.makeImmutable();
            }
            OrgPolicyViolationInfo.access$876(orgPolicyViolationInfo, i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo170clone() {
            return (Builder) super.mo170clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof OrgPolicyViolationInfo) {
                return mergeFrom((OrgPolicyViolationInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(OrgPolicyViolationInfo orgPolicyViolationInfo) {
            if (orgPolicyViolationInfo == OrgPolicyViolationInfo.getDefaultInstance()) {
                return this;
            }
            if (orgPolicyViolationInfo.hasPayload()) {
                mergePayload(orgPolicyViolationInfo.getPayload());
            }
            if (!orgPolicyViolationInfo.getResourceType().isEmpty()) {
                this.resourceType_ = orgPolicyViolationInfo.resourceType_;
                this.bitField0_ |= 2;
                onChanged();
            }
            internalGetMutableResourceTags().mergeFrom(orgPolicyViolationInfo.internalGetResourceTags());
            this.bitField0_ |= 4;
            if (this.violationInfoBuilder_ == null) {
                if (!orgPolicyViolationInfo.violationInfo_.isEmpty()) {
                    if (this.violationInfo_.isEmpty()) {
                        this.violationInfo_ = orgPolicyViolationInfo.violationInfo_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureViolationInfoIsMutable();
                        this.violationInfo_.addAll(orgPolicyViolationInfo.violationInfo_);
                    }
                    onChanged();
                }
            } else if (!orgPolicyViolationInfo.violationInfo_.isEmpty()) {
                if (!this.violationInfoBuilder_.isEmpty()) {
                    this.violationInfoBuilder_.addAllMessages(orgPolicyViolationInfo.violationInfo_);
                } else {
                    this.violationInfoBuilder_.dispose();
                    this.violationInfoBuilder_ = null;
                    this.violationInfo_ = orgPolicyViolationInfo.violationInfo_;
                    this.bitField0_ &= -9;
                    this.violationInfoBuilder_ = OrgPolicyViolationInfo.alwaysUseFieldBuilders ? getViolationInfoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(orgPolicyViolationInfo.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                codedInputStream.readMessage(getPayloadFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.resourceType_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ResourceTagsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                internalGetMutableResourceTags().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                ViolationInfo violationInfo = (ViolationInfo) codedInputStream.readMessage(ViolationInfo.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureViolationInfoIsMutable();
                                    this.violationInfo_.add(violationInfo);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(violationInfo);
                                }
                            } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public Struct getPayload() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.payload_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setPayload(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.payload_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setPayload(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.payload_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder mergePayload(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (struct2 = this.payload_) != null && struct2 != Struct.getDefaultInstance()) {
                    getPayloadBuilder().mergeFrom(struct);
                } else {
                    this.payload_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.payload_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder clearPayload() {
            this.bitField0_ &= -2;
            this.payload_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.payloadBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getPayloadBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (Struct.Builder) getPayloadFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public StructOrBuilder getPayloadOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.payload_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getPayloadFieldBuilder() {
            if (this.payloadBuilder_ == null) {
                this.payloadBuilder_ = new SingleFieldBuilderV3<>(getPayload(), getParentForChildren(), isClean());
                this.payload_ = null;
            }
            return this.payloadBuilder_;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public String getResourceType() {
            Object obj = this.resourceType_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.resourceType_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public ByteString getResourceTypeBytes() {
            Object obj = this.resourceType_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.resourceType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setResourceType(String str) {
            str.getClass();
            this.resourceType_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearResourceType() {
            this.resourceType_ = OrgPolicyViolationInfo.getDefaultInstance().getResourceType();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setResourceTypeBytes(ByteString byteString) {
            byteString.getClass();
            OrgPolicyViolationInfo.checkByteStringIsUtf8(byteString);
            this.resourceType_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private MapField<String, String> internalGetResourceTags() {
            MapField<String, String> mapField = this.resourceTags_;
            return mapField == null ? MapField.emptyMapField(ResourceTagsDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableResourceTags() {
            if (this.resourceTags_ == null) {
                this.resourceTags_ = MapField.newMapField(ResourceTagsDefaultEntryHolder.defaultEntry);
            }
            if (!this.resourceTags_.isMutable()) {
                this.resourceTags_ = this.resourceTags_.copy();
            }
            this.bitField0_ |= 4;
            onChanged();
            return this.resourceTags_;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public int getResourceTagsCount() {
            return internalGetResourceTags().getMap().size();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public boolean containsResourceTags(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetResourceTags().getMap().containsKey(str);
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        @Deprecated
        public Map<String, String> getResourceTags() {
            return getResourceTagsMap();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public Map<String, String> getResourceTagsMap() {
            return internalGetResourceTags().getMap();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public String getResourceTagsOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetResourceTags().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public String getResourceTagsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetResourceTags().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        public Builder clearResourceTags() {
            this.bitField0_ &= -5;
            internalGetMutableResourceTags().getMutableMap().clear();
            return this;
        }

        public Builder removeResourceTags(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableResourceTags().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Map<String, String> getMutableResourceTags() {
            this.bitField0_ |= 4;
            return internalGetMutableResourceTags().getMutableMap();
        }

        public Builder putResourceTags(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableResourceTags().getMutableMap().put(str, str2);
            this.bitField0_ |= 4;
            return this;
        }

        public Builder putAllResourceTags(Map<String, String> map) {
            internalGetMutableResourceTags().getMutableMap().putAll(map);
            this.bitField0_ |= 4;
            return this;
        }

        private void ensureViolationInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.violationInfo_ = new ArrayList(this.violationInfo_);
                this.bitField0_ |= 8;
            }
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public List<ViolationInfo> getViolationInfoList() {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.violationInfo_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public int getViolationInfoCount() {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.violationInfo_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public ViolationInfo getViolationInfo(int i) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.violationInfo_.get(i);
            }
            return (ViolationInfo) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setViolationInfo(int i, ViolationInfo violationInfo) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                violationInfo.getClass();
                ensureViolationInfoIsMutable();
                this.violationInfo_.set(i, violationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, violationInfo);
            }
            return this;
        }

        public Builder setViolationInfo(int i, ViolationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureViolationInfoIsMutable();
                this.violationInfo_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addViolationInfo(ViolationInfo violationInfo) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                violationInfo.getClass();
                ensureViolationInfoIsMutable();
                this.violationInfo_.add(violationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(violationInfo);
            }
            return this;
        }

        public Builder addViolationInfo(int i, ViolationInfo violationInfo) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                violationInfo.getClass();
                ensureViolationInfoIsMutable();
                this.violationInfo_.add(i, violationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, violationInfo);
            }
            return this;
        }

        public Builder addViolationInfo(ViolationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureViolationInfoIsMutable();
                this.violationInfo_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addViolationInfo(int i, ViolationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureViolationInfoIsMutable();
                this.violationInfo_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllViolationInfo(Iterable<? extends ViolationInfo> iterable) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureViolationInfoIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.violationInfo_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearViolationInfo() {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.violationInfo_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeViolationInfo(int i) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureViolationInfoIsMutable();
                this.violationInfo_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ViolationInfo.Builder getViolationInfoBuilder(int i) {
            return (ViolationInfo.Builder) getViolationInfoFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public ViolationInfoOrBuilder getViolationInfoOrBuilder(int i) {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.violationInfo_.get(i);
            }
            return (ViolationInfoOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        public List<? extends ViolationInfoOrBuilder> getViolationInfoOrBuilderList() {
            RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> repeatedFieldBuilderV3 = this.violationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.violationInfo_);
        }

        public ViolationInfo.Builder addViolationInfoBuilder() {
            return (ViolationInfo.Builder) getViolationInfoFieldBuilder().addBuilder(ViolationInfo.getDefaultInstance());
        }

        public ViolationInfo.Builder addViolationInfoBuilder(int i) {
            return (ViolationInfo.Builder) getViolationInfoFieldBuilder().addBuilder(i, ViolationInfo.getDefaultInstance());
        }

        public List<ViolationInfo.Builder> getViolationInfoBuilderList() {
            return getViolationInfoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ViolationInfo, ViolationInfo.Builder, ViolationInfoOrBuilder> getViolationInfoFieldBuilder() {
            if (this.violationInfoBuilder_ == null) {
                this.violationInfoBuilder_ = new RepeatedFieldBuilderV3<>(this.violationInfo_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.violationInfo_ = null;
            }
            return this.violationInfoBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static OrgPolicyViolationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<OrgPolicyViolationInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<OrgPolicyViolationInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public OrgPolicyViolationInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
