package com.google.cloud.audit;

import com.google.cloud.audit.OrgPolicyViolationInfo;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class PolicyViolationInfo extends GeneratedMessageV3 implements PolicyViolationInfoOrBuilder {
    public static final int ORG_POLICY_VIOLATION_INFO_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private OrgPolicyViolationInfo orgPolicyViolationInfo_;
    private static final PolicyViolationInfo DEFAULT_INSTANCE = new PolicyViolationInfo();
    private static final Parser<PolicyViolationInfo> PARSER = new AbstractParser<PolicyViolationInfo>() { // from class: com.google.cloud.audit.PolicyViolationInfo.1
        @Override // com.google.protobuf.Parser
        public PolicyViolationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = PolicyViolationInfo.newBuilder();
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

    static /* synthetic */ int access$576(PolicyViolationInfo policyViolationInfo, int i) {
        int i2 = i | policyViolationInfo.bitField0_;
        policyViolationInfo.bitField0_ = i2;
        return i2;
    }

    private PolicyViolationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private PolicyViolationInfo() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PolicyViolationInfo();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_PolicyViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyViolationInfo.class, Builder.class);
    }

    @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
    public boolean hasOrgPolicyViolationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
    public OrgPolicyViolationInfo getOrgPolicyViolationInfo() {
        OrgPolicyViolationInfo orgPolicyViolationInfo = this.orgPolicyViolationInfo_;
        return orgPolicyViolationInfo == null ? OrgPolicyViolationInfo.getDefaultInstance() : orgPolicyViolationInfo;
    }

    @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
    public OrgPolicyViolationInfoOrBuilder getOrgPolicyViolationInfoOrBuilder() {
        OrgPolicyViolationInfo orgPolicyViolationInfo = this.orgPolicyViolationInfo_;
        return orgPolicyViolationInfo == null ? OrgPolicyViolationInfo.getDefaultInstance() : orgPolicyViolationInfo;
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
            codedOutputStream.writeMessage(1, getOrgPolicyViolationInfo());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getOrgPolicyViolationInfo()) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeMessageSize;
        return iComputeMessageSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolicyViolationInfo)) {
            return super.equals(obj);
        }
        PolicyViolationInfo policyViolationInfo = (PolicyViolationInfo) obj;
        if (hasOrgPolicyViolationInfo() != policyViolationInfo.hasOrgPolicyViolationInfo()) {
            return false;
        }
        return (!hasOrgPolicyViolationInfo() || getOrgPolicyViolationInfo().equals(policyViolationInfo.getOrgPolicyViolationInfo())) && getUnknownFields().equals(policyViolationInfo.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasOrgPolicyViolationInfo()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getOrgPolicyViolationInfo().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static PolicyViolationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static PolicyViolationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static PolicyViolationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static PolicyViolationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static PolicyViolationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static PolicyViolationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static PolicyViolationInfo parseFrom(InputStream inputStream) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static PolicyViolationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PolicyViolationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PolicyViolationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PolicyViolationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PolicyViolationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PolicyViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(PolicyViolationInfo policyViolationInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyViolationInfo);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PolicyViolationInfoOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> orgPolicyViolationInfoBuilder_;
        private OrgPolicyViolationInfo orgPolicyViolationInfo_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_PolicyViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(PolicyViolationInfo.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (PolicyViolationInfo.alwaysUseFieldBuilders) {
                getOrgPolicyViolationInfoFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.orgPolicyViolationInfo_ = null;
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.orgPolicyViolationInfoBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PolicyViolationInfo getDefaultInstanceForType() {
            return PolicyViolationInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PolicyViolationInfo build() {
            PolicyViolationInfo policyViolationInfoBuildPartial = buildPartial();
            if (policyViolationInfoBuildPartial.isInitialized()) {
                return policyViolationInfoBuildPartial;
            }
            throw newUninitializedMessageException((Message) policyViolationInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PolicyViolationInfo buildPartial() {
            PolicyViolationInfo policyViolationInfo = new PolicyViolationInfo(this);
            if (this.bitField0_ != 0) {
                buildPartial0(policyViolationInfo);
            }
            onBuilt();
            return policyViolationInfo;
        }

        private void buildPartial0(PolicyViolationInfo policyViolationInfo) {
            OrgPolicyViolationInfo orgPolicyViolationInfo;
            int i = 1;
            if ((this.bitField0_ & 1) != 0) {
                SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    orgPolicyViolationInfo = this.orgPolicyViolationInfo_;
                } else {
                    orgPolicyViolationInfo = (OrgPolicyViolationInfo) singleFieldBuilderV3.build();
                }
                policyViolationInfo.orgPolicyViolationInfo_ = orgPolicyViolationInfo;
            } else {
                i = 0;
            }
            PolicyViolationInfo.access$576(policyViolationInfo, i);
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
            if (message instanceof PolicyViolationInfo) {
                return mergeFrom((PolicyViolationInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(PolicyViolationInfo policyViolationInfo) {
            if (policyViolationInfo == PolicyViolationInfo.getDefaultInstance()) {
                return this;
            }
            if (policyViolationInfo.hasOrgPolicyViolationInfo()) {
                mergeOrgPolicyViolationInfo(policyViolationInfo.getOrgPolicyViolationInfo());
            }
            mergeUnknownFields(policyViolationInfo.getUnknownFields());
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
                                codedInputStream.readMessage(getOrgPolicyViolationInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
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

        @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
        public boolean hasOrgPolicyViolationInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
        public OrgPolicyViolationInfo getOrgPolicyViolationInfo() {
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                OrgPolicyViolationInfo orgPolicyViolationInfo = this.orgPolicyViolationInfo_;
                return orgPolicyViolationInfo == null ? OrgPolicyViolationInfo.getDefaultInstance() : orgPolicyViolationInfo;
            }
            return (OrgPolicyViolationInfo) singleFieldBuilderV3.getMessage();
        }

        public Builder setOrgPolicyViolationInfo(OrgPolicyViolationInfo orgPolicyViolationInfo) {
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                orgPolicyViolationInfo.getClass();
                this.orgPolicyViolationInfo_ = orgPolicyViolationInfo;
            } else {
                singleFieldBuilderV3.setMessage(orgPolicyViolationInfo);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setOrgPolicyViolationInfo(OrgPolicyViolationInfo.Builder builder) {
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.orgPolicyViolationInfo_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder mergeOrgPolicyViolationInfo(OrgPolicyViolationInfo orgPolicyViolationInfo) {
            OrgPolicyViolationInfo orgPolicyViolationInfo2;
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (orgPolicyViolationInfo2 = this.orgPolicyViolationInfo_) != null && orgPolicyViolationInfo2 != OrgPolicyViolationInfo.getDefaultInstance()) {
                    getOrgPolicyViolationInfoBuilder().mergeFrom(orgPolicyViolationInfo);
                } else {
                    this.orgPolicyViolationInfo_ = orgPolicyViolationInfo;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(orgPolicyViolationInfo);
            }
            if (this.orgPolicyViolationInfo_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder clearOrgPolicyViolationInfo() {
            this.bitField0_ &= -2;
            this.orgPolicyViolationInfo_ = null;
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.orgPolicyViolationInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public OrgPolicyViolationInfo.Builder getOrgPolicyViolationInfoBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (OrgPolicyViolationInfo.Builder) getOrgPolicyViolationInfoFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.PolicyViolationInfoOrBuilder
        public OrgPolicyViolationInfoOrBuilder getOrgPolicyViolationInfoOrBuilder() {
            SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.orgPolicyViolationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (OrgPolicyViolationInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            OrgPolicyViolationInfo orgPolicyViolationInfo = this.orgPolicyViolationInfo_;
            return orgPolicyViolationInfo == null ? OrgPolicyViolationInfo.getDefaultInstance() : orgPolicyViolationInfo;
        }

        private SingleFieldBuilderV3<OrgPolicyViolationInfo, OrgPolicyViolationInfo.Builder, OrgPolicyViolationInfoOrBuilder> getOrgPolicyViolationInfoFieldBuilder() {
            if (this.orgPolicyViolationInfoBuilder_ == null) {
                this.orgPolicyViolationInfoBuilder_ = new SingleFieldBuilderV3<>(getOrgPolicyViolationInfo(), getParentForChildren(), isClean());
                this.orgPolicyViolationInfo_ = null;
            }
            return this.orgPolicyViolationInfoBuilder_;
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

    public static PolicyViolationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PolicyViolationInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<PolicyViolationInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public PolicyViolationInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
