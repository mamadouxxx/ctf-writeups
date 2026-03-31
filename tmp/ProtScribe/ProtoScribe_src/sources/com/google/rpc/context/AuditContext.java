package com.google.rpc.context;

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
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class AuditContext extends GeneratedMessageV3 implements AuditContextOrBuilder {
    public static final int AUDIT_LOG_FIELD_NUMBER = 1;
    private static final AuditContext DEFAULT_INSTANCE = new AuditContext();
    private static final Parser<AuditContext> PARSER = new AbstractParser<AuditContext>() { // from class: com.google.rpc.context.AuditContext.1
        @Override // com.google.protobuf.Parser
        public AuditContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = AuditContext.newBuilder();
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
    public static final int SCRUBBED_REQUEST_FIELD_NUMBER = 2;
    public static final int SCRUBBED_RESPONSE_FIELD_NUMBER = 3;
    public static final int SCRUBBED_RESPONSE_ITEM_COUNT_FIELD_NUMBER = 4;
    public static final int TARGET_RESOURCE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private ByteString auditLog_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private Struct scrubbedRequest_;
    private int scrubbedResponseItemCount_;
    private Struct scrubbedResponse_;
    private volatile Object targetResource_;

    static /* synthetic */ int access$976(AuditContext auditContext, int i) {
        int i2 = i | auditContext.bitField0_;
        auditContext.bitField0_ = i2;
        return i2;
    }

    private AuditContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.auditLog_ = ByteString.EMPTY;
        this.scrubbedResponseItemCount_ = 0;
        this.targetResource_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuditContext() {
        this.auditLog_ = ByteString.EMPTY;
        this.scrubbedResponseItemCount_ = 0;
        this.targetResource_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.auditLog_ = ByteString.EMPTY;
        this.targetResource_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuditContext();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditContextProto.internal_static_google_rpc_context_AuditContext_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditContextProto.internal_static_google_rpc_context_AuditContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuditContext.class, Builder.class);
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public ByteString getAuditLog() {
        return this.auditLog_;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public boolean hasScrubbedRequest() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public Struct getScrubbedRequest() {
        Struct struct = this.scrubbedRequest_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public StructOrBuilder getScrubbedRequestOrBuilder() {
        Struct struct = this.scrubbedRequest_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public boolean hasScrubbedResponse() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public Struct getScrubbedResponse() {
        Struct struct = this.scrubbedResponse_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public StructOrBuilder getScrubbedResponseOrBuilder() {
        Struct struct = this.scrubbedResponse_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public int getScrubbedResponseItemCount() {
        return this.scrubbedResponseItemCount_;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public String getTargetResource() {
        Object obj = this.targetResource_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.targetResource_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.rpc.context.AuditContextOrBuilder
    public ByteString getTargetResourceBytes() {
        Object obj = this.targetResource_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.targetResource_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
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
        if (!this.auditLog_.isEmpty()) {
            codedOutputStream.writeBytes(1, this.auditLog_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(2, getScrubbedRequest());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(3, getScrubbedResponse());
        }
        int i = this.scrubbedResponseItemCount_;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.targetResource_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.targetResource_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeBytesSize = !this.auditLog_.isEmpty() ? CodedOutputStream.computeBytesSize(1, this.auditLog_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeBytesSize += CodedOutputStream.computeMessageSize(2, getScrubbedRequest());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeBytesSize += CodedOutputStream.computeMessageSize(3, getScrubbedResponse());
        }
        int i2 = this.scrubbedResponseItemCount_;
        if (i2 != 0) {
            iComputeBytesSize += CodedOutputStream.computeInt32Size(4, i2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.targetResource_)) {
            iComputeBytesSize += GeneratedMessageV3.computeStringSize(5, this.targetResource_);
        }
        int serializedSize = iComputeBytesSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuditContext)) {
            return super.equals(obj);
        }
        AuditContext auditContext = (AuditContext) obj;
        if (!getAuditLog().equals(auditContext.getAuditLog()) || hasScrubbedRequest() != auditContext.hasScrubbedRequest()) {
            return false;
        }
        if ((!hasScrubbedRequest() || getScrubbedRequest().equals(auditContext.getScrubbedRequest())) && hasScrubbedResponse() == auditContext.hasScrubbedResponse()) {
            return (!hasScrubbedResponse() || getScrubbedResponse().equals(auditContext.getScrubbedResponse())) && getScrubbedResponseItemCount() == auditContext.getScrubbedResponseItemCount() && getTargetResource().equals(auditContext.getTargetResource()) && getUnknownFields().equals(auditContext.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuditLog().hashCode();
        if (hasScrubbedRequest()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getScrubbedRequest().hashCode();
        }
        if (hasScrubbedResponse()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getScrubbedResponse().hashCode();
        }
        int scrubbedResponseItemCount = (((((((((iHashCode * 37) + 4) * 53) + getScrubbedResponseItemCount()) * 37) + 5) * 53) + getTargetResource().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = scrubbedResponseItemCount;
        return scrubbedResponseItemCount;
    }

    public static AuditContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuditContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuditContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuditContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuditContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuditContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuditContext parseFrom(InputStream inputStream) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AuditContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuditContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuditContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuditContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuditContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuditContext auditContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(auditContext);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuditContextOrBuilder {
        private ByteString auditLog_;
        private int bitField0_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> scrubbedRequestBuilder_;
        private Struct scrubbedRequest_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> scrubbedResponseBuilder_;
        private int scrubbedResponseItemCount_;
        private Struct scrubbedResponse_;
        private Object targetResource_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditContextProto.internal_static_google_rpc_context_AuditContext_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditContextProto.internal_static_google_rpc_context_AuditContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuditContext.class, Builder.class);
        }

        private Builder() {
            this.auditLog_ = ByteString.EMPTY;
            this.targetResource_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.auditLog_ = ByteString.EMPTY;
            this.targetResource_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AuditContext.alwaysUseFieldBuilders) {
                getScrubbedRequestFieldBuilder();
                getScrubbedResponseFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.auditLog_ = ByteString.EMPTY;
            this.scrubbedRequest_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.scrubbedRequestBuilder_ = null;
            }
            this.scrubbedResponse_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.scrubbedResponseBuilder_ = null;
            }
            this.scrubbedResponseItemCount_ = 0;
            this.targetResource_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditContextProto.internal_static_google_rpc_context_AuditContext_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuditContext getDefaultInstanceForType() {
            return AuditContext.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuditContext build() {
            AuditContext auditContextBuildPartial = buildPartial();
            if (auditContextBuildPartial.isInitialized()) {
                return auditContextBuildPartial;
            }
            throw newUninitializedMessageException((Message) auditContextBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuditContext buildPartial() {
            AuditContext auditContext = new AuditContext(this);
            if (this.bitField0_ != 0) {
                buildPartial0(auditContext);
            }
            onBuilt();
            return auditContext;
        }

        private void buildPartial0(AuditContext auditContext) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                auditContext.auditLog_ = this.auditLog_;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
                auditContext.scrubbedRequest_ = singleFieldBuilderV3 == null ? this.scrubbedRequest_ : (Struct) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.scrubbedResponseBuilder_;
                auditContext.scrubbedResponse_ = singleFieldBuilderV32 == null ? this.scrubbedResponse_ : (Struct) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                auditContext.scrubbedResponseItemCount_ = this.scrubbedResponseItemCount_;
            }
            if ((i2 & 16) != 0) {
                auditContext.targetResource_ = this.targetResource_;
            }
            AuditContext.access$976(auditContext, i);
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
            if (message instanceof AuditContext) {
                return mergeFrom((AuditContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuditContext auditContext) {
            if (auditContext == AuditContext.getDefaultInstance()) {
                return this;
            }
            if (auditContext.getAuditLog() != ByteString.EMPTY) {
                setAuditLog(auditContext.getAuditLog());
            }
            if (auditContext.hasScrubbedRequest()) {
                mergeScrubbedRequest(auditContext.getScrubbedRequest());
            }
            if (auditContext.hasScrubbedResponse()) {
                mergeScrubbedResponse(auditContext.getScrubbedResponse());
            }
            if (auditContext.getScrubbedResponseItemCount() != 0) {
                setScrubbedResponseItemCount(auditContext.getScrubbedResponseItemCount());
            }
            if (!auditContext.getTargetResource().isEmpty()) {
                this.targetResource_ = auditContext.targetResource_;
                this.bitField0_ |= 16;
                onChanged();
            }
            mergeUnknownFields(auditContext.getUnknownFields());
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
                                this.auditLog_ = codedInputStream.readBytes();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getScrubbedRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getScrubbedResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.scrubbedResponseItemCount_ = codedInputStream.readInt32();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                this.targetResource_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
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

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public ByteString getAuditLog() {
            return this.auditLog_;
        }

        public Builder setAuditLog(ByteString byteString) {
            byteString.getClass();
            this.auditLog_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearAuditLog() {
            this.bitField0_ &= -2;
            this.auditLog_ = AuditContext.getDefaultInstance().getAuditLog();
            onChanged();
            return this;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public boolean hasScrubbedRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public Struct getScrubbedRequest() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.scrubbedRequest_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setScrubbedRequest(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.scrubbedRequest_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setScrubbedRequest(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.scrubbedRequest_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeScrubbedRequest(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (struct2 = this.scrubbedRequest_) != null && struct2 != Struct.getDefaultInstance()) {
                    getScrubbedRequestBuilder().mergeFrom(struct);
                } else {
                    this.scrubbedRequest_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.scrubbedRequest_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearScrubbedRequest() {
            this.bitField0_ &= -3;
            this.scrubbedRequest_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.scrubbedRequestBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getScrubbedRequestBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Struct.Builder) getScrubbedRequestFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public StructOrBuilder getScrubbedRequestOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedRequestBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.scrubbedRequest_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getScrubbedRequestFieldBuilder() {
            if (this.scrubbedRequestBuilder_ == null) {
                this.scrubbedRequestBuilder_ = new SingleFieldBuilderV3<>(getScrubbedRequest(), getParentForChildren(), isClean());
                this.scrubbedRequest_ = null;
            }
            return this.scrubbedRequestBuilder_;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public boolean hasScrubbedResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public Struct getScrubbedResponse() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.scrubbedResponse_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setScrubbedResponse(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.scrubbedResponse_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setScrubbedResponse(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.scrubbedResponse_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeScrubbedResponse(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (struct2 = this.scrubbedResponse_) != null && struct2 != Struct.getDefaultInstance()) {
                    getScrubbedResponseBuilder().mergeFrom(struct);
                } else {
                    this.scrubbedResponse_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.scrubbedResponse_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearScrubbedResponse() {
            this.bitField0_ &= -5;
            this.scrubbedResponse_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.scrubbedResponseBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getScrubbedResponseBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (Struct.Builder) getScrubbedResponseFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public StructOrBuilder getScrubbedResponseOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.scrubbedResponseBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.scrubbedResponse_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getScrubbedResponseFieldBuilder() {
            if (this.scrubbedResponseBuilder_ == null) {
                this.scrubbedResponseBuilder_ = new SingleFieldBuilderV3<>(getScrubbedResponse(), getParentForChildren(), isClean());
                this.scrubbedResponse_ = null;
            }
            return this.scrubbedResponseBuilder_;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public int getScrubbedResponseItemCount() {
            return this.scrubbedResponseItemCount_;
        }

        public Builder setScrubbedResponseItemCount(int i) {
            this.scrubbedResponseItemCount_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearScrubbedResponseItemCount() {
            this.bitField0_ &= -9;
            this.scrubbedResponseItemCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public String getTargetResource() {
            Object obj = this.targetResource_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.targetResource_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.rpc.context.AuditContextOrBuilder
        public ByteString getTargetResourceBytes() {
            Object obj = this.targetResource_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.targetResource_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setTargetResource(String str) {
            str.getClass();
            this.targetResource_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearTargetResource() {
            this.targetResource_ = AuditContext.getDefaultInstance().getTargetResource();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder setTargetResourceBytes(ByteString byteString) {
            byteString.getClass();
            AuditContext.checkByteStringIsUtf8(byteString);
            this.targetResource_ = byteString;
            this.bitField0_ |= 16;
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

    public static AuditContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuditContext> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuditContext> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuditContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
