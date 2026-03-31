package com.google.cloud.audit;

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
import com.google.rpc.context.AttributeContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestMetadata extends GeneratedMessageV3 implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_NETWORK_FIELD_NUMBER = 3;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    public static final int DESTINATION_ATTRIBUTES_FIELD_NUMBER = 8;
    public static final int REQUEST_ATTRIBUTES_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object callerIp_;
    private volatile Object callerNetwork_;
    private volatile Object callerSuppliedUserAgent_;
    private AttributeContext.Peer destinationAttributes_;
    private byte memoizedIsInitialized;
    private AttributeContext.Request requestAttributes_;
    private static final RequestMetadata DEFAULT_INSTANCE = new RequestMetadata();
    private static final Parser<RequestMetadata> PARSER = new AbstractParser<RequestMetadata>() { // from class: com.google.cloud.audit.RequestMetadata.1
        @Override // com.google.protobuf.Parser
        public RequestMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = RequestMetadata.newBuilder();
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

    static /* synthetic */ int access$976(RequestMetadata requestMetadata, int i) {
        int i2 = i | requestMetadata.bitField0_;
        requestMetadata.bitField0_ = i2;
        return i2;
    }

    private RequestMetadata(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.callerIp_ = "";
        this.callerSuppliedUserAgent_ = "";
        this.callerNetwork_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private RequestMetadata() {
        this.callerIp_ = "";
        this.callerSuppliedUserAgent_ = "";
        this.callerNetwork_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.callerIp_ = "";
        this.callerSuppliedUserAgent_ = "";
        this.callerNetwork_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RequestMetadata();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestMetadata.class, Builder.class);
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public String getCallerIp() {
        Object obj = this.callerIp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.callerIp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public ByteString getCallerIpBytes() {
        Object obj = this.callerIp_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callerIp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public String getCallerSuppliedUserAgent() {
        Object obj = this.callerSuppliedUserAgent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.callerSuppliedUserAgent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public ByteString getCallerSuppliedUserAgentBytes() {
        Object obj = this.callerSuppliedUserAgent_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callerSuppliedUserAgent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public String getCallerNetwork() {
        Object obj = this.callerNetwork_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.callerNetwork_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public ByteString getCallerNetworkBytes() {
        Object obj = this.callerNetwork_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callerNetwork_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public boolean hasRequestAttributes() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public AttributeContext.Request getRequestAttributes() {
        AttributeContext.Request request = this.requestAttributes_;
        return request == null ? AttributeContext.Request.getDefaultInstance() : request;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public AttributeContext.RequestOrBuilder getRequestAttributesOrBuilder() {
        AttributeContext.Request request = this.requestAttributes_;
        return request == null ? AttributeContext.Request.getDefaultInstance() : request;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public boolean hasDestinationAttributes() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public AttributeContext.Peer getDestinationAttributes() {
        AttributeContext.Peer peer = this.destinationAttributes_;
        return peer == null ? AttributeContext.Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.cloud.audit.RequestMetadataOrBuilder
    public AttributeContext.PeerOrBuilder getDestinationAttributesOrBuilder() {
        AttributeContext.Peer peer = this.destinationAttributes_;
        return peer == null ? AttributeContext.Peer.getDefaultInstance() : peer;
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
        if (!GeneratedMessageV3.isStringEmpty(this.callerIp_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.callerIp_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.callerSuppliedUserAgent_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.callerSuppliedUserAgent_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.callerNetwork_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.callerNetwork_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(7, getRequestAttributes());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(8, getDestinationAttributes());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.callerIp_) ? GeneratedMessageV3.computeStringSize(1, this.callerIp_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.callerSuppliedUserAgent_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.callerSuppliedUserAgent_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.callerNetwork_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.callerNetwork_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(7, getRequestAttributes());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, getDestinationAttributes());
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
        if (!(obj instanceof RequestMetadata)) {
            return super.equals(obj);
        }
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        if (!getCallerIp().equals(requestMetadata.getCallerIp()) || !getCallerSuppliedUserAgent().equals(requestMetadata.getCallerSuppliedUserAgent()) || !getCallerNetwork().equals(requestMetadata.getCallerNetwork()) || hasRequestAttributes() != requestMetadata.hasRequestAttributes()) {
            return false;
        }
        if ((!hasRequestAttributes() || getRequestAttributes().equals(requestMetadata.getRequestAttributes())) && hasDestinationAttributes() == requestMetadata.hasDestinationAttributes()) {
            return (!hasDestinationAttributes() || getDestinationAttributes().equals(requestMetadata.getDestinationAttributes())) && getUnknownFields().equals(requestMetadata.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCallerIp().hashCode()) * 37) + 2) * 53) + getCallerSuppliedUserAgent().hashCode()) * 37) + 3) * 53) + getCallerNetwork().hashCode();
        if (hasRequestAttributes()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getRequestAttributes().hashCode();
        }
        if (hasDestinationAttributes()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getDestinationAttributes().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RequestMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RequestMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RequestMetadata requestMetadata) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestMetadata);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestMetadataOrBuilder {
        private int bitField0_;
        private Object callerIp_;
        private Object callerNetwork_;
        private Object callerSuppliedUserAgent_;
        private SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> destinationAttributesBuilder_;
        private AttributeContext.Peer destinationAttributes_;
        private SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> requestAttributesBuilder_;
        private AttributeContext.Request requestAttributes_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestMetadata.class, Builder.class);
        }

        private Builder() {
            this.callerIp_ = "";
            this.callerSuppliedUserAgent_ = "";
            this.callerNetwork_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.callerIp_ = "";
            this.callerSuppliedUserAgent_ = "";
            this.callerNetwork_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (RequestMetadata.alwaysUseFieldBuilders) {
                getRequestAttributesFieldBuilder();
                getDestinationAttributesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.callerIp_ = "";
            this.callerSuppliedUserAgent_ = "";
            this.callerNetwork_ = "";
            this.requestAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.requestAttributesBuilder_ = null;
            }
            this.destinationAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV32 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.destinationAttributesBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RequestMetadata getDefaultInstanceForType() {
            return RequestMetadata.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RequestMetadata build() {
            RequestMetadata requestMetadataBuildPartial = buildPartial();
            if (requestMetadataBuildPartial.isInitialized()) {
                return requestMetadataBuildPartial;
            }
            throw newUninitializedMessageException((Message) requestMetadataBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RequestMetadata buildPartial() {
            RequestMetadata requestMetadata = new RequestMetadata(this);
            if (this.bitField0_ != 0) {
                buildPartial0(requestMetadata);
            }
            onBuilt();
            return requestMetadata;
        }

        private void buildPartial0(RequestMetadata requestMetadata) {
            int i;
            AttributeContext.Peer peer;
            AttributeContext.Request request;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                requestMetadata.callerIp_ = this.callerIp_;
            }
            if ((i2 & 2) != 0) {
                requestMetadata.callerSuppliedUserAgent_ = this.callerSuppliedUserAgent_;
            }
            if ((i2 & 4) != 0) {
                requestMetadata.callerNetwork_ = this.callerNetwork_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    request = this.requestAttributes_;
                } else {
                    request = (AttributeContext.Request) singleFieldBuilderV3.build();
                }
                requestMetadata.requestAttributes_ = request;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV32 = this.destinationAttributesBuilder_;
                if (singleFieldBuilderV32 == null) {
                    peer = this.destinationAttributes_;
                } else {
                    peer = (AttributeContext.Peer) singleFieldBuilderV32.build();
                }
                requestMetadata.destinationAttributes_ = peer;
                i |= 2;
            }
            RequestMetadata.access$976(requestMetadata, i);
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
            if (message instanceof RequestMetadata) {
                return mergeFrom((RequestMetadata) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestMetadata requestMetadata) {
            if (requestMetadata == RequestMetadata.getDefaultInstance()) {
                return this;
            }
            if (!requestMetadata.getCallerIp().isEmpty()) {
                this.callerIp_ = requestMetadata.callerIp_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!requestMetadata.getCallerSuppliedUserAgent().isEmpty()) {
                this.callerSuppliedUserAgent_ = requestMetadata.callerSuppliedUserAgent_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!requestMetadata.getCallerNetwork().isEmpty()) {
                this.callerNetwork_ = requestMetadata.callerNetwork_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (requestMetadata.hasRequestAttributes()) {
                mergeRequestAttributes(requestMetadata.getRequestAttributes());
            }
            if (requestMetadata.hasDestinationAttributes()) {
                mergeDestinationAttributes(requestMetadata.getDestinationAttributes());
            }
            mergeUnknownFields(requestMetadata.getUnknownFields());
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
                                this.callerIp_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.callerSuppliedUserAgent_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.callerNetwork_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 58) {
                                codedInputStream.readMessage(getRequestAttributesFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 66) {
                                codedInputStream.readMessage(getDestinationAttributesFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public String getCallerIp() {
            Object obj = this.callerIp_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.callerIp_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public ByteString getCallerIpBytes() {
            Object obj = this.callerIp_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callerIp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCallerIp(String str) {
            str.getClass();
            this.callerIp_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearCallerIp() {
            this.callerIp_ = RequestMetadata.getDefaultInstance().getCallerIp();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setCallerIpBytes(ByteString byteString) {
            byteString.getClass();
            RequestMetadata.checkByteStringIsUtf8(byteString);
            this.callerIp_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public String getCallerSuppliedUserAgent() {
            Object obj = this.callerSuppliedUserAgent_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.callerSuppliedUserAgent_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public ByteString getCallerSuppliedUserAgentBytes() {
            Object obj = this.callerSuppliedUserAgent_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callerSuppliedUserAgent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCallerSuppliedUserAgent(String str) {
            str.getClass();
            this.callerSuppliedUserAgent_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearCallerSuppliedUserAgent() {
            this.callerSuppliedUserAgent_ = RequestMetadata.getDefaultInstance().getCallerSuppliedUserAgent();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setCallerSuppliedUserAgentBytes(ByteString byteString) {
            byteString.getClass();
            RequestMetadata.checkByteStringIsUtf8(byteString);
            this.callerSuppliedUserAgent_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public String getCallerNetwork() {
            Object obj = this.callerNetwork_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.callerNetwork_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public ByteString getCallerNetworkBytes() {
            Object obj = this.callerNetwork_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callerNetwork_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCallerNetwork(String str) {
            str.getClass();
            this.callerNetwork_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearCallerNetwork() {
            this.callerNetwork_ = RequestMetadata.getDefaultInstance().getCallerNetwork();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setCallerNetworkBytes(ByteString byteString) {
            byteString.getClass();
            RequestMetadata.checkByteStringIsUtf8(byteString);
            this.callerNetwork_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public boolean hasRequestAttributes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public AttributeContext.Request getRequestAttributes() {
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                AttributeContext.Request request = this.requestAttributes_;
                return request == null ? AttributeContext.Request.getDefaultInstance() : request;
            }
            return (AttributeContext.Request) singleFieldBuilderV3.getMessage();
        }

        public Builder setRequestAttributes(AttributeContext.Request request) {
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                request.getClass();
                this.requestAttributes_ = request;
            } else {
                singleFieldBuilderV3.setMessage(request);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setRequestAttributes(AttributeContext.Request.Builder builder) {
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.requestAttributes_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeRequestAttributes(AttributeContext.Request request) {
            AttributeContext.Request request2;
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (request2 = this.requestAttributes_) != null && request2 != AttributeContext.Request.getDefaultInstance()) {
                    getRequestAttributesBuilder().mergeFrom(request);
                } else {
                    this.requestAttributes_ = request;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(request);
            }
            if (this.requestAttributes_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearRequestAttributes() {
            this.bitField0_ &= -9;
            this.requestAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.requestAttributesBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public AttributeContext.Request.Builder getRequestAttributesBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (AttributeContext.Request.Builder) getRequestAttributesFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public AttributeContext.RequestOrBuilder getRequestAttributesOrBuilder() {
            SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> singleFieldBuilderV3 = this.requestAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AttributeContext.RequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            AttributeContext.Request request = this.requestAttributes_;
            return request == null ? AttributeContext.Request.getDefaultInstance() : request;
        }

        private SingleFieldBuilderV3<AttributeContext.Request, AttributeContext.Request.Builder, AttributeContext.RequestOrBuilder> getRequestAttributesFieldBuilder() {
            if (this.requestAttributesBuilder_ == null) {
                this.requestAttributesBuilder_ = new SingleFieldBuilderV3<>(getRequestAttributes(), getParentForChildren(), isClean());
                this.requestAttributes_ = null;
            }
            return this.requestAttributesBuilder_;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public boolean hasDestinationAttributes() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public AttributeContext.Peer getDestinationAttributes() {
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                AttributeContext.Peer peer = this.destinationAttributes_;
                return peer == null ? AttributeContext.Peer.getDefaultInstance() : peer;
            }
            return (AttributeContext.Peer) singleFieldBuilderV3.getMessage();
        }

        public Builder setDestinationAttributes(AttributeContext.Peer peer) {
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                peer.getClass();
                this.destinationAttributes_ = peer;
            } else {
                singleFieldBuilderV3.setMessage(peer);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setDestinationAttributes(AttributeContext.Peer.Builder builder) {
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.destinationAttributes_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeDestinationAttributes(AttributeContext.Peer peer) {
            AttributeContext.Peer peer2;
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (peer2 = this.destinationAttributes_) != null && peer2 != AttributeContext.Peer.getDefaultInstance()) {
                    getDestinationAttributesBuilder().mergeFrom(peer);
                } else {
                    this.destinationAttributes_ = peer;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(peer);
            }
            if (this.destinationAttributes_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearDestinationAttributes() {
            this.bitField0_ &= -17;
            this.destinationAttributes_ = null;
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.destinationAttributesBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public AttributeContext.Peer.Builder getDestinationAttributesBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (AttributeContext.Peer.Builder) getDestinationAttributesFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.RequestMetadataOrBuilder
        public AttributeContext.PeerOrBuilder getDestinationAttributesOrBuilder() {
            SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> singleFieldBuilderV3 = this.destinationAttributesBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AttributeContext.PeerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            AttributeContext.Peer peer = this.destinationAttributes_;
            return peer == null ? AttributeContext.Peer.getDefaultInstance() : peer;
        }

        private SingleFieldBuilderV3<AttributeContext.Peer, AttributeContext.Peer.Builder, AttributeContext.PeerOrBuilder> getDestinationAttributesFieldBuilder() {
            if (this.destinationAttributesBuilder_ == null) {
                this.destinationAttributesBuilder_ = new SingleFieldBuilderV3<>(getDestinationAttributes(), getParentForChildren(), isClean());
                this.destinationAttributes_ = null;
            }
            return this.destinationAttributesBuilder_;
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

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RequestMetadata> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RequestMetadata> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RequestMetadata getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
