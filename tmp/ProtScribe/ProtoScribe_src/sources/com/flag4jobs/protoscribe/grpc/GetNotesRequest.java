package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class GetNotesRequest extends GeneratedMessage implements GetNotesRequestOrBuilder {
    private static final GetNotesRequest DEFAULT_INSTANCE;
    private static final Parser<GetNotesRequest> PARSER;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object token_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", GetNotesRequest.class.getName());
        DEFAULT_INSTANCE = new GetNotesRequest();
        PARSER = new AbstractParser<GetNotesRequest>() { // from class: com.flag4jobs.protoscribe.grpc.GetNotesRequest.1
            @Override // com.google.protobuf.Parser
            public GetNotesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNotesRequest.newBuilder();
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
    }

    private GetNotesRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private GetNotesRequest() {
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.token_ = "";
        this.uuid_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_GetNotesRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_GetNotesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNotesRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
    public ByteString getUuidBytes() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.uuid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
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
        if (!GeneratedMessage.isStringEmpty(this.token_)) {
            GeneratedMessage.writeString(codedOutputStream, 1, this.token_);
        }
        if (!GeneratedMessage.isStringEmpty(this.uuid_)) {
            GeneratedMessage.writeString(codedOutputStream, 2, this.uuid_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.token_) ? GeneratedMessage.computeStringSize(1, this.token_) : 0;
        if (!GeneratedMessage.isStringEmpty(this.uuid_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.uuid_);
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
        if (!(obj instanceof GetNotesRequest)) {
            return super.equals(obj);
        }
        GetNotesRequest getNotesRequest = (GetNotesRequest) obj;
        return getToken().equals(getNotesRequest.getToken()) && getUuid().equals(getNotesRequest.getUuid()) && getUnknownFields().equals(getNotesRequest.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getToken().hashCode()) * 37) + 2) * 53) + getUuid().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static GetNotesRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static GetNotesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GetNotesRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static GetNotesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static GetNotesRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static GetNotesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetNotesRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static GetNotesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNotesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetNotesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNotesRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetNotesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GetNotesRequest getNotesRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNotesRequest);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements GetNotesRequestOrBuilder {
        private int bitField0_;
        private Object token_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_GetNotesRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_GetNotesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNotesRequest.class, Builder.class);
        }

        private Builder() {
            this.token_ = "";
            this.uuid_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.token_ = "";
            this.uuid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.token_ = "";
            this.uuid_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_GetNotesRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNotesRequest getDefaultInstanceForType() {
            return GetNotesRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNotesRequest build() {
            GetNotesRequest getNotesRequestBuildPartial = buildPartial();
            if (getNotesRequestBuildPartial.isInitialized()) {
                return getNotesRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) getNotesRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNotesRequest buildPartial() {
            GetNotesRequest getNotesRequest = new GetNotesRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(getNotesRequest);
            }
            onBuilt();
            return getNotesRequest;
        }

        private void buildPartial0(GetNotesRequest getNotesRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                getNotesRequest.token_ = this.token_;
            }
            if ((i & 2) != 0) {
                getNotesRequest.uuid_ = this.uuid_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GetNotesRequest) {
                return mergeFrom((GetNotesRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetNotesRequest getNotesRequest) {
            if (getNotesRequest == GetNotesRequest.getDefaultInstance()) {
                return this;
            }
            if (!getNotesRequest.getToken().isEmpty()) {
                this.token_ = getNotesRequest.token_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!getNotesRequest.getUuid().isEmpty()) {
                this.uuid_ = getNotesRequest.uuid_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(getNotesRequest.getUnknownFields());
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
                                this.token_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.uuid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setToken(String str) {
            str.getClass();
            this.token_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearToken() {
            this.token_ = GetNotesRequest.getDefaultInstance().getToken();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            GetNotesRequest.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesRequestOrBuilder
        public ByteString getUuidBytes() {
            Object obj = this.uuid_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.uuid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearUuid() {
            this.uuid_ = GetNotesRequest.getDefaultInstance().getUuid();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            GetNotesRequest.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static GetNotesRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GetNotesRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetNotesRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetNotesRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
