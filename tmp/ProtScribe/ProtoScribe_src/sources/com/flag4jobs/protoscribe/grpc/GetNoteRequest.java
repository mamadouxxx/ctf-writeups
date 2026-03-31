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
public final class GetNoteRequest extends GeneratedMessage implements GetNoteRequestOrBuilder {
    private static final GetNoteRequest DEFAULT_INSTANCE;
    private static final Parser<GetNoteRequest> PARSER;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object token_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", GetNoteRequest.class.getName());
        DEFAULT_INSTANCE = new GetNoteRequest();
        PARSER = new AbstractParser<GetNoteRequest>() { // from class: com.flag4jobs.protoscribe.grpc.GetNoteRequest.1
            @Override // com.google.protobuf.Parser
            public GetNoteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNoteRequest.newBuilder();
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

    private GetNoteRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private GetNoteRequest() {
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.token_ = "";
        this.uuid_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_GetNoteRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_GetNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNoteRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
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
        if (!(obj instanceof GetNoteRequest)) {
            return super.equals(obj);
        }
        GetNoteRequest getNoteRequest = (GetNoteRequest) obj;
        return getToken().equals(getNoteRequest.getToken()) && getUuid().equals(getNoteRequest.getUuid()) && getUnknownFields().equals(getNoteRequest.getUnknownFields());
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

    public static GetNoteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static GetNoteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GetNoteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static GetNoteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static GetNoteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static GetNoteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetNoteRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static GetNoteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNoteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetNoteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNoteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetNoteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GetNoteRequest getNoteRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNoteRequest);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements GetNoteRequestOrBuilder {
        private int bitField0_;
        private Object token_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_GetNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_GetNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNoteRequest.class, Builder.class);
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
            return ScribeProto.internal_static_protoscribe_GetNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNoteRequest getDefaultInstanceForType() {
            return GetNoteRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNoteRequest build() {
            GetNoteRequest getNoteRequestBuildPartial = buildPartial();
            if (getNoteRequestBuildPartial.isInitialized()) {
                return getNoteRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) getNoteRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNoteRequest buildPartial() {
            GetNoteRequest getNoteRequest = new GetNoteRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(getNoteRequest);
            }
            onBuilt();
            return getNoteRequest;
        }

        private void buildPartial0(GetNoteRequest getNoteRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                getNoteRequest.token_ = this.token_;
            }
            if ((i & 2) != 0) {
                getNoteRequest.uuid_ = this.uuid_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GetNoteRequest) {
                return mergeFrom((GetNoteRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetNoteRequest getNoteRequest) {
            if (getNoteRequest == GetNoteRequest.getDefaultInstance()) {
                return this;
            }
            if (!getNoteRequest.getToken().isEmpty()) {
                this.token_ = getNoteRequest.token_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!getNoteRequest.getUuid().isEmpty()) {
                this.uuid_ = getNoteRequest.uuid_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(getNoteRequest.getUnknownFields());
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
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
            this.token_ = GetNoteRequest.getDefaultInstance().getToken();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            GetNoteRequest.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteRequestOrBuilder
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
            this.uuid_ = GetNoteRequest.getDefaultInstance().getUuid();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            GetNoteRequest.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static GetNoteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GetNoteRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetNoteRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetNoteRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
