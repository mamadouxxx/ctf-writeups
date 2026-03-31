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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.rpc.context.AttributeContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationInfo extends GeneratedMessageV3 implements AuthorizationInfoOrBuilder {
    public static final int GRANTED_FIELD_NUMBER = 3;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_ATTRIBUTES_FIELD_NUMBER = 5;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private boolean granted_;
    private byte memoizedIsInitialized;
    private volatile Object permission_;
    private AttributeContext.Resource resourceAttributes_;
    private volatile Object resource_;
    private static final AuthorizationInfo DEFAULT_INSTANCE = new AuthorizationInfo();
    private static final Parser<AuthorizationInfo> PARSER = new AbstractParser<AuthorizationInfo>() { // from class: com.google.cloud.audit.AuthorizationInfo.1
        @Override // com.google.protobuf.Parser
        public AuthorizationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = AuthorizationInfo.newBuilder();
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

    static /* synthetic */ int access$876(AuthorizationInfo authorizationInfo, int i) {
        int i2 = i | authorizationInfo.bitField0_;
        authorizationInfo.bitField0_ = i2;
        return i2;
    }

    private AuthorizationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.resource_ = "";
        this.permission_ = "";
        this.granted_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuthorizationInfo() {
        this.resource_ = "";
        this.permission_ = "";
        this.granted_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.resource_ = "";
        this.permission_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuthorizationInfo();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthorizationInfo.class, Builder.class);
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getResource() {
        Object obj = this.resource_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.resource_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getResourceBytes() {
        Object obj = this.resource_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.resource_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getPermission() {
        Object obj = this.permission_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.permission_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getPermissionBytes() {
        Object obj = this.permission_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.permission_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public boolean getGranted() {
        return this.granted_;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public boolean hasResourceAttributes() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public AttributeContext.Resource getResourceAttributes() {
        AttributeContext.Resource resource = this.resourceAttributes_;
        return resource == null ? AttributeContext.Resource.getDefaultInstance() : resource;
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public AttributeContext.ResourceOrBuilder getResourceAttributesOrBuilder() {
        AttributeContext.Resource resource = this.resourceAttributes_;
        return resource == null ? AttributeContext.Resource.getDefaultInstance() : resource;
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
        if (!GeneratedMessageV3.isStringEmpty(this.resource_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.resource_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.permission_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.permission_);
        }
        boolean z = this.granted_;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(5, getResourceAttributes());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.resource_) ? GeneratedMessageV3.computeStringSize(1, this.resource_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.permission_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.permission_);
        }
        boolean z = this.granted_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(3, z);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getResourceAttributes());
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
        if (!(obj instanceof AuthorizationInfo)) {
            return super.equals(obj);
        }
        AuthorizationInfo authorizationInfo = (AuthorizationInfo) obj;
        if (getResource().equals(authorizationInfo.getResource()) && getPermission().equals(authorizationInfo.getPermission()) && getGranted() == authorizationInfo.getGranted() && hasResourceAttributes() == authorizationInfo.hasResourceAttributes()) {
            return (!hasResourceAttributes() || getResourceAttributes().equals(authorizationInfo.getResourceAttributes())) && getUnknownFields().equals(authorizationInfo.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getResource().hashCode()) * 37) + 2) * 53) + getPermission().hashCode()) * 37) + 3) * 53) + Internal.hashBoolean(getGranted());
        if (hasResourceAttributes()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getResourceAttributes().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuthorizationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthorizationInfo authorizationInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(authorizationInfo);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuthorizationInfoOrBuilder {
        private int bitField0_;
        private boolean granted_;
        private Object permission_;
        private SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> resourceAttributesBuilder_;
        private AttributeContext.Resource resourceAttributes_;
        private Object resource_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthorizationInfo.class, Builder.class);
        }

        private Builder() {
            this.resource_ = "";
            this.permission_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.resource_ = "";
            this.permission_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AuthorizationInfo.alwaysUseFieldBuilders) {
                getResourceAttributesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.resource_ = "";
            this.permission_ = "";
            this.granted_ = false;
            this.resourceAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceAttributesBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthorizationInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuthorizationInfo getDefaultInstanceForType() {
            return AuthorizationInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthorizationInfo build() {
            AuthorizationInfo authorizationInfoBuildPartial = buildPartial();
            if (authorizationInfoBuildPartial.isInitialized()) {
                return authorizationInfoBuildPartial;
            }
            throw newUninitializedMessageException((Message) authorizationInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthorizationInfo buildPartial() {
            AuthorizationInfo authorizationInfo = new AuthorizationInfo(this);
            if (this.bitField0_ != 0) {
                buildPartial0(authorizationInfo);
            }
            onBuilt();
            return authorizationInfo;
        }

        private void buildPartial0(AuthorizationInfo authorizationInfo) {
            int i;
            AttributeContext.Resource resource;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                authorizationInfo.resource_ = this.resource_;
            }
            if ((i2 & 2) != 0) {
                authorizationInfo.permission_ = this.permission_;
            }
            if ((i2 & 4) != 0) {
                authorizationInfo.granted_ = this.granted_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resource = this.resourceAttributes_;
                } else {
                    resource = (AttributeContext.Resource) singleFieldBuilderV3.build();
                }
                authorizationInfo.resourceAttributes_ = resource;
                i = 1;
            } else {
                i = 0;
            }
            AuthorizationInfo.access$876(authorizationInfo, i);
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
            if (message instanceof AuthorizationInfo) {
                return mergeFrom((AuthorizationInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuthorizationInfo authorizationInfo) {
            if (authorizationInfo == AuthorizationInfo.getDefaultInstance()) {
                return this;
            }
            if (!authorizationInfo.getResource().isEmpty()) {
                this.resource_ = authorizationInfo.resource_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!authorizationInfo.getPermission().isEmpty()) {
                this.permission_ = authorizationInfo.permission_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (authorizationInfo.getGranted()) {
                setGranted(authorizationInfo.getGranted());
            }
            if (authorizationInfo.hasResourceAttributes()) {
                mergeResourceAttributes(authorizationInfo.getResourceAttributes());
            }
            mergeUnknownFields(authorizationInfo.getUnknownFields());
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
                                this.resource_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.permission_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.granted_ = codedInputStream.readBool();
                                this.bitField0_ |= 4;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getResourceAttributesFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getResource() {
            Object obj = this.resource_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.resource_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getResourceBytes() {
            Object obj = this.resource_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.resource_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setResource(String str) {
            str.getClass();
            this.resource_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearResource() {
            this.resource_ = AuthorizationInfo.getDefaultInstance().getResource();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            byteString.getClass();
            AuthorizationInfo.checkByteStringIsUtf8(byteString);
            this.resource_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getPermission() {
            Object obj = this.permission_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.permission_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getPermissionBytes() {
            Object obj = this.permission_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.permission_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPermission(String str) {
            str.getClass();
            this.permission_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearPermission() {
            this.permission_ = AuthorizationInfo.getDefaultInstance().getPermission();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setPermissionBytes(ByteString byteString) {
            byteString.getClass();
            AuthorizationInfo.checkByteStringIsUtf8(byteString);
            this.permission_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public boolean getGranted() {
            return this.granted_;
        }

        public Builder setGranted(boolean z) {
            this.granted_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearGranted() {
            this.bitField0_ &= -5;
            this.granted_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public boolean hasResourceAttributes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public AttributeContext.Resource getResourceAttributes() {
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                AttributeContext.Resource resource = this.resourceAttributes_;
                return resource == null ? AttributeContext.Resource.getDefaultInstance() : resource;
            }
            return (AttributeContext.Resource) singleFieldBuilderV3.getMessage();
        }

        public Builder setResourceAttributes(AttributeContext.Resource resource) {
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                resource.getClass();
                this.resourceAttributes_ = resource;
            } else {
                singleFieldBuilderV3.setMessage(resource);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setResourceAttributes(AttributeContext.Resource.Builder builder) {
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.resourceAttributes_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeResourceAttributes(AttributeContext.Resource resource) {
            AttributeContext.Resource resource2;
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (resource2 = this.resourceAttributes_) != null && resource2 != AttributeContext.Resource.getDefaultInstance()) {
                    getResourceAttributesBuilder().mergeFrom(resource);
                } else {
                    this.resourceAttributes_ = resource;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(resource);
            }
            if (this.resourceAttributes_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearResourceAttributes() {
            this.bitField0_ &= -9;
            this.resourceAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceAttributesBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public AttributeContext.Resource.Builder getResourceAttributesBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (AttributeContext.Resource.Builder) getResourceAttributesFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public AttributeContext.ResourceOrBuilder getResourceAttributesOrBuilder() {
            SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> singleFieldBuilderV3 = this.resourceAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AttributeContext.ResourceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            AttributeContext.Resource resource = this.resourceAttributes_;
            return resource == null ? AttributeContext.Resource.getDefaultInstance() : resource;
        }

        private SingleFieldBuilderV3<AttributeContext.Resource, AttributeContext.Resource.Builder, AttributeContext.ResourceOrBuilder> getResourceAttributesFieldBuilder() {
            if (this.resourceAttributesBuilder_ == null) {
                this.resourceAttributesBuilder_ = new SingleFieldBuilderV3<>(getResourceAttributes(), getParentForChildren(), isClean());
                this.resourceAttributes_ = null;
            }
            return this.resourceAttributesBuilder_;
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

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthorizationInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuthorizationInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuthorizationInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
