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
public final class RemoveNoteRequest extends GeneratedMessage implements RemoveNoteRequestOrBuilder {
    private static final RemoveNoteRequest DEFAULT_INSTANCE;
    private static final Parser<RemoveNoteRequest> PARSER;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object token_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", RemoveNoteRequest.class.getName());
        DEFAULT_INSTANCE = new RemoveNoteRequest();
        PARSER = new AbstractParser<RemoveNoteRequest>() { // from class: com.flag4jobs.protoscribe.grpc.RemoveNoteRequest.1
            @Override // com.google.protobuf.Parser
            public RemoveNoteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoveNoteRequest.newBuilder();
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

    private RemoveNoteRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private RemoveNoteRequest() {
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.token_ = "";
        this.uuid_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_RemoveNoteRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_RemoveNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveNoteRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
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
        if (!(obj instanceof RemoveNoteRequest)) {
            return super.equals(obj);
        }
        RemoveNoteRequest removeNoteRequest = (RemoveNoteRequest) obj;
        return getToken().equals(removeNoteRequest.getToken()) && getUuid().equals(removeNoteRequest.getUuid()) && getUnknownFields().equals(removeNoteRequest.getUnknownFields());
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

    public static RemoveNoteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RemoveNoteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RemoveNoteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RemoveNoteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RemoveNoteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RemoveNoteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RemoveNoteRequest parseFrom(InputStream inputStream) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static RemoveNoteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RemoveNoteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RemoveNoteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RemoveNoteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static RemoveNoteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RemoveNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RemoveNoteRequest removeNoteRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(removeNoteRequest);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements RemoveNoteRequestOrBuilder {
        private int bitField0_;
        private Object token_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_RemoveNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_RemoveNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveNoteRequest.class, Builder.class);
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
            return ScribeProto.internal_static_protoscribe_RemoveNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoveNoteRequest getDefaultInstanceForType() {
            return RemoveNoteRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RemoveNoteRequest build() {
            RemoveNoteRequest removeNoteRequestBuildPartial = buildPartial();
            if (removeNoteRequestBuildPartial.isInitialized()) {
                return removeNoteRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) removeNoteRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RemoveNoteRequest buildPartial() {
            RemoveNoteRequest removeNoteRequest = new RemoveNoteRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(removeNoteRequest);
            }
            onBuilt();
            return removeNoteRequest;
        }

        private void buildPartial0(RemoveNoteRequest removeNoteRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                removeNoteRequest.token_ = this.token_;
            }
            if ((i & 2) != 0) {
                removeNoteRequest.uuid_ = this.uuid_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RemoveNoteRequest) {
                return mergeFrom((RemoveNoteRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RemoveNoteRequest removeNoteRequest) {
            if (removeNoteRequest == RemoveNoteRequest.getDefaultInstance()) {
                return this;
            }
            if (!removeNoteRequest.getToken().isEmpty()) {
                this.token_ = removeNoteRequest.token_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!removeNoteRequest.getUuid().isEmpty()) {
                this.uuid_ = removeNoteRequest.uuid_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(removeNoteRequest.getUnknownFields());
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

        @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
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
            this.token_ = RemoveNoteRequest.getDefaultInstance().getToken();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            RemoveNoteRequest.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.RemoveNoteRequestOrBuilder
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
            this.uuid_ = RemoveNoteRequest.getDefaultInstance().getUuid();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            RemoveNoteRequest.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static RemoveNoteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RemoveNoteRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RemoveNoteRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RemoveNoteRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
