package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class AuthResponse extends GeneratedMessage implements AuthResponseOrBuilder {
    private static final AuthResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static final Parser<AuthResponse> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int TOKEN_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object error_;
    private byte memoizedIsInitialized;
    private boolean success_;
    private volatile Object token_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", AuthResponse.class.getName());
        DEFAULT_INSTANCE = new AuthResponse();
        PARSER = new AbstractParser<AuthResponse>() { // from class: com.flag4jobs.protoscribe.grpc.AuthResponse.1
            @Override // com.google.protobuf.Parser
            public AuthResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AuthResponse.newBuilder();
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

    private AuthResponse(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.success_ = false;
        this.error_ = "";
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuthResponse() {
        this.success_ = false;
        this.error_ = "";
        this.token_ = "";
        this.uuid_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
        this.token_ = "";
        this.uuid_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_AuthResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_AuthResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthResponse.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
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
        boolean z = this.success_;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (!GeneratedMessage.isStringEmpty(this.error_)) {
            GeneratedMessage.writeString(codedOutputStream, 2, this.error_);
        }
        if (!GeneratedMessage.isStringEmpty(this.token_)) {
            GeneratedMessage.writeString(codedOutputStream, 3, this.token_);
        }
        if (!GeneratedMessage.isStringEmpty(this.uuid_)) {
            GeneratedMessage.writeString(codedOutputStream, 4, this.uuid_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.success_;
        int iComputeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
        if (!GeneratedMessage.isStringEmpty(this.error_)) {
            iComputeBoolSize += GeneratedMessage.computeStringSize(2, this.error_);
        }
        if (!GeneratedMessage.isStringEmpty(this.token_)) {
            iComputeBoolSize += GeneratedMessage.computeStringSize(3, this.token_);
        }
        if (!GeneratedMessage.isStringEmpty(this.uuid_)) {
            iComputeBoolSize += GeneratedMessage.computeStringSize(4, this.uuid_);
        }
        int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthResponse)) {
            return super.equals(obj);
        }
        AuthResponse authResponse = (AuthResponse) obj;
        return getSuccess() == authResponse.getSuccess() && getError().equals(authResponse.getError()) && getToken().equals(authResponse.getToken()) && getUuid().equals(authResponse.getUuid()) && getUnknownFields().equals(authResponse.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getSuccess())) * 37) + 2) * 53) + getError().hashCode()) * 37) + 3) * 53) + getToken().hashCode()) * 37) + 4) * 53) + getUuid().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static AuthResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuthResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuthResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuthResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuthResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuthResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuthResponse parseFrom(InputStream inputStream) throws IOException {
        return (AuthResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static AuthResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuthResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuthResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthResponse authResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(authResponse);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements AuthResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private boolean success_;
        private Object token_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_AuthResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_AuthResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthResponse.class, Builder.class);
        }

        private Builder() {
            this.error_ = "";
            this.token_ = "";
            this.uuid_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
            this.token_ = "";
            this.uuid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.success_ = false;
            this.error_ = "";
            this.token_ = "";
            this.uuid_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_AuthResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuthResponse getDefaultInstanceForType() {
            return AuthResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthResponse build() {
            AuthResponse authResponseBuildPartial = buildPartial();
            if (authResponseBuildPartial.isInitialized()) {
                return authResponseBuildPartial;
            }
            throw newUninitializedMessageException((Message) authResponseBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthResponse buildPartial() {
            AuthResponse authResponse = new AuthResponse(this);
            if (this.bitField0_ != 0) {
                buildPartial0(authResponse);
            }
            onBuilt();
            return authResponse;
        }

        private void buildPartial0(AuthResponse authResponse) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                authResponse.success_ = this.success_;
            }
            if ((i & 2) != 0) {
                authResponse.error_ = this.error_;
            }
            if ((i & 4) != 0) {
                authResponse.token_ = this.token_;
            }
            if ((i & 8) != 0) {
                authResponse.uuid_ = this.uuid_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AuthResponse) {
                return mergeFrom((AuthResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuthResponse authResponse) {
            if (authResponse == AuthResponse.getDefaultInstance()) {
                return this;
            }
            if (authResponse.getSuccess()) {
                setSuccess(authResponse.getSuccess());
            }
            if (!authResponse.getError().isEmpty()) {
                this.error_ = authResponse.error_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!authResponse.getToken().isEmpty()) {
                this.token_ = authResponse.token_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!authResponse.getUuid().isEmpty()) {
                this.uuid_ = authResponse.uuid_;
                this.bitField0_ |= 8;
                onChanged();
            }
            mergeUnknownFields(authResponse.getUnknownFields());
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
                            if (tag == 8) {
                                this.success_ = codedInputStream.readBool();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.error_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.token_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.uuid_ = codedInputStream.readStringRequireUtf8();
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

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        public Builder setSuccess(boolean z) {
            this.success_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearSuccess() {
            this.bitField0_ &= -2;
            this.success_ = false;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
        public String getError() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.error_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.error_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setError(String str) {
            str.getClass();
            this.error_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearError() {
            this.error_ = AuthResponse.getDefaultInstance().getError();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            byteString.getClass();
            AuthResponse.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
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
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearToken() {
            this.token_ = AuthResponse.getDefaultInstance().getToken();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            AuthResponse.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthResponseOrBuilder
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
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearUuid() {
            this.uuid_ = AuthResponse.getDefaultInstance().getUuid();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            AuthResponse.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }
    }

    public static AuthResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuthResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuthResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
