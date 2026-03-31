package com.google.cloud.audit;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ViolationInfo extends GeneratedMessageV3 implements ViolationInfoOrBuilder {
    public static final int CHECKED_VALUE_FIELD_NUMBER = 3;
    public static final int CONSTRAINT_FIELD_NUMBER = 1;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int POLICY_TYPE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object checkedValue_;
    private volatile Object constraint_;
    private volatile Object errorMessage_;
    private byte memoizedIsInitialized;
    private int policyType_;
    private static final ViolationInfo DEFAULT_INSTANCE = new ViolationInfo();
    private static final Parser<ViolationInfo> PARSER = new AbstractParser<ViolationInfo>() { // from class: com.google.cloud.audit.ViolationInfo.1
        @Override // com.google.protobuf.Parser
        public ViolationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ViolationInfo.newBuilder();
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

    private ViolationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.constraint_ = "";
        this.errorMessage_ = "";
        this.checkedValue_ = "";
        this.policyType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private ViolationInfo() {
        this.constraint_ = "";
        this.errorMessage_ = "";
        this.checkedValue_ = "";
        this.policyType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.constraint_ = "";
        this.errorMessage_ = "";
        this.checkedValue_ = "";
        this.policyType_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ViolationInfo();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ViolationInfo.class, Builder.class);
    }

    public enum PolicyType implements ProtocolMessageEnum {
        POLICY_TYPE_UNSPECIFIED(0),
        BOOLEAN_CONSTRAINT(1),
        LIST_CONSTRAINT(2),
        CUSTOM_CONSTRAINT(3),
        UNRECOGNIZED(-1);

        public static final int BOOLEAN_CONSTRAINT_VALUE = 1;
        public static final int CUSTOM_CONSTRAINT_VALUE = 3;
        public static final int LIST_CONSTRAINT_VALUE = 2;
        public static final int POLICY_TYPE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<PolicyType> internalValueMap = new Internal.EnumLiteMap<PolicyType>() { // from class: com.google.cloud.audit.ViolationInfo.PolicyType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PolicyType findValueByNumber(int i) {
                return PolicyType.forNumber(i);
            }
        };
        private static final PolicyType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static PolicyType valueOf(int i) {
            return forNumber(i);
        }

        public static PolicyType forNumber(int i) {
            if (i == 0) {
                return POLICY_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return BOOLEAN_CONSTRAINT;
            }
            if (i == 2) {
                return LIST_CONSTRAINT;
            }
            if (i != 3) {
                return null;
            }
            return CUSTOM_CONSTRAINT;
        }

        public static Internal.EnumLiteMap<PolicyType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ViolationInfo.getDescriptor().getEnumTypes().get(0);
        }

        public static PolicyType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        PolicyType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public String getConstraint() {
        Object obj = this.constraint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.constraint_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public ByteString getConstraintBytes() {
        Object obj = this.constraint_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.constraint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public String getErrorMessage() {
        Object obj = this.errorMessage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.errorMessage_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public ByteString getErrorMessageBytes() {
        Object obj = this.errorMessage_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.errorMessage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public String getCheckedValue() {
        Object obj = this.checkedValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.checkedValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public ByteString getCheckedValueBytes() {
        Object obj = this.checkedValue_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.checkedValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public int getPolicyTypeValue() {
        return this.policyType_;
    }

    @Override // com.google.cloud.audit.ViolationInfoOrBuilder
    public PolicyType getPolicyType() {
        PolicyType policyTypeForNumber = PolicyType.forNumber(this.policyType_);
        return policyTypeForNumber == null ? PolicyType.UNRECOGNIZED : policyTypeForNumber;
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
        if (!GeneratedMessageV3.isStringEmpty(this.constraint_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.constraint_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.errorMessage_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.errorMessage_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.checkedValue_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.checkedValue_);
        }
        if (this.policyType_ != PolicyType.POLICY_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.policyType_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.constraint_) ? GeneratedMessageV3.computeStringSize(1, this.constraint_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.errorMessage_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.errorMessage_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.checkedValue_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.checkedValue_);
        }
        if (this.policyType_ != PolicyType.POLICY_TYPE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.policyType_);
        }
        int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViolationInfo)) {
            return super.equals(obj);
        }
        ViolationInfo violationInfo = (ViolationInfo) obj;
        return getConstraint().equals(violationInfo.getConstraint()) && getErrorMessage().equals(violationInfo.getErrorMessage()) && getCheckedValue().equals(violationInfo.getCheckedValue()) && this.policyType_ == violationInfo.policyType_ && getUnknownFields().equals(violationInfo.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getConstraint().hashCode()) * 37) + 2) * 53) + getErrorMessage().hashCode()) * 37) + 3) * 53) + getCheckedValue().hashCode()) * 37) + 4) * 53) + this.policyType_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static ViolationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ViolationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ViolationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ViolationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ViolationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ViolationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ViolationInfo parseFrom(InputStream inputStream) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ViolationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViolationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViolationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ViolationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ViolationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViolationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ViolationInfo violationInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(violationInfo);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ViolationInfoOrBuilder {
        private int bitField0_;
        private Object checkedValue_;
        private Object constraint_;
        private Object errorMessage_;
        private int policyType_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ViolationInfo.class, Builder.class);
        }

        private Builder() {
            this.constraint_ = "";
            this.errorMessage_ = "";
            this.checkedValue_ = "";
            this.policyType_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.constraint_ = "";
            this.errorMessage_ = "";
            this.checkedValue_ = "";
            this.policyType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.constraint_ = "";
            this.errorMessage_ = "";
            this.checkedValue_ = "";
            this.policyType_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_ViolationInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ViolationInfo getDefaultInstanceForType() {
            return ViolationInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ViolationInfo build() {
            ViolationInfo violationInfoBuildPartial = buildPartial();
            if (violationInfoBuildPartial.isInitialized()) {
                return violationInfoBuildPartial;
            }
            throw newUninitializedMessageException((Message) violationInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ViolationInfo buildPartial() {
            ViolationInfo violationInfo = new ViolationInfo(this);
            if (this.bitField0_ != 0) {
                buildPartial0(violationInfo);
            }
            onBuilt();
            return violationInfo;
        }

        private void buildPartial0(ViolationInfo violationInfo) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                violationInfo.constraint_ = this.constraint_;
            }
            if ((i & 2) != 0) {
                violationInfo.errorMessage_ = this.errorMessage_;
            }
            if ((i & 4) != 0) {
                violationInfo.checkedValue_ = this.checkedValue_;
            }
            if ((i & 8) != 0) {
                violationInfo.policyType_ = this.policyType_;
            }
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
            if (message instanceof ViolationInfo) {
                return mergeFrom((ViolationInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ViolationInfo violationInfo) {
            if (violationInfo == ViolationInfo.getDefaultInstance()) {
                return this;
            }
            if (!violationInfo.getConstraint().isEmpty()) {
                this.constraint_ = violationInfo.constraint_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!violationInfo.getErrorMessage().isEmpty()) {
                this.errorMessage_ = violationInfo.errorMessage_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!violationInfo.getCheckedValue().isEmpty()) {
                this.checkedValue_ = violationInfo.checkedValue_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (violationInfo.policyType_ != 0) {
                setPolicyTypeValue(violationInfo.getPolicyTypeValue());
            }
            mergeUnknownFields(violationInfo.getUnknownFields());
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
                                this.constraint_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.errorMessage_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.checkedValue_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.policyType_ = codedInputStream.readEnum();
                                this.bitField0_ |= 8;
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

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public String getConstraint() {
            Object obj = this.constraint_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.constraint_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public ByteString getConstraintBytes() {
            Object obj = this.constraint_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.constraint_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setConstraint(String str) {
            str.getClass();
            this.constraint_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearConstraint() {
            this.constraint_ = ViolationInfo.getDefaultInstance().getConstraint();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setConstraintBytes(ByteString byteString) {
            byteString.getClass();
            ViolationInfo.checkByteStringIsUtf8(byteString);
            this.constraint_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public String getErrorMessage() {
            Object obj = this.errorMessage_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.errorMessage_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public ByteString getErrorMessageBytes() {
            Object obj = this.errorMessage_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.errorMessage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearErrorMessage() {
            this.errorMessage_ = ViolationInfo.getDefaultInstance().getErrorMessage();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorMessageBytes(ByteString byteString) {
            byteString.getClass();
            ViolationInfo.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public String getCheckedValue() {
            Object obj = this.checkedValue_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.checkedValue_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public ByteString getCheckedValueBytes() {
            Object obj = this.checkedValue_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.checkedValue_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCheckedValue(String str) {
            str.getClass();
            this.checkedValue_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearCheckedValue() {
            this.checkedValue_ = ViolationInfo.getDefaultInstance().getCheckedValue();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setCheckedValueBytes(ByteString byteString) {
            byteString.getClass();
            ViolationInfo.checkByteStringIsUtf8(byteString);
            this.checkedValue_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public int getPolicyTypeValue() {
            return this.policyType_;
        }

        public Builder setPolicyTypeValue(int i) {
            this.policyType_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.ViolationInfoOrBuilder
        public PolicyType getPolicyType() {
            PolicyType policyTypeForNumber = PolicyType.forNumber(this.policyType_);
            return policyTypeForNumber == null ? PolicyType.UNRECOGNIZED : policyTypeForNumber;
        }

        public Builder setPolicyType(PolicyType policyType) {
            policyType.getClass();
            this.bitField0_ |= 8;
            this.policyType_ = policyType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearPolicyType() {
            this.bitField0_ &= -9;
            this.policyType_ = 0;
            onChanged();
            return this;
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

    public static ViolationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ViolationInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ViolationInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ViolationInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
