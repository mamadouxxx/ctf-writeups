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
public final class AuthRequest extends GeneratedMessage implements AuthRequestOrBuilder {
    private static final AuthRequest DEFAULT_INSTANCE;
    private static final Parser<AuthRequest> PARSER;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object password_;
    private volatile Object phoneNumber_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", AuthRequest.class.getName());
        DEFAULT_INSTANCE = new AuthRequest();
        PARSER = new AbstractParser<AuthRequest>() { // from class: com.flag4jobs.protoscribe.grpc.AuthRequest.1
            @Override // com.google.protobuf.Parser
            public AuthRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AuthRequest.newBuilder();
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

    private AuthRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.phoneNumber_ = "";
        this.password_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuthRequest() {
        this.phoneNumber_ = "";
        this.password_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.phoneNumber_ = "";
        this.password_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_AuthRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_AuthRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
    public String getPhoneNumber() {
        Object obj = this.phoneNumber_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.phoneNumber_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
    public ByteString getPhoneNumberBytes() {
        Object obj = this.phoneNumber_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
    public String getPassword() {
        Object obj = this.password_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.password_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
    public ByteString getPasswordBytes() {
        Object obj = this.password_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.password_ = byteStringCopyFromUtf8;
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
        if (!GeneratedMessage.isStringEmpty(this.phoneNumber_)) {
            GeneratedMessage.writeString(codedOutputStream, 1, this.phoneNumber_);
        }
        if (!GeneratedMessage.isStringEmpty(this.password_)) {
            GeneratedMessage.writeString(codedOutputStream, 2, this.password_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.phoneNumber_) ? GeneratedMessage.computeStringSize(1, this.phoneNumber_) : 0;
        if (!GeneratedMessage.isStringEmpty(this.password_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.password_);
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
        if (!(obj instanceof AuthRequest)) {
            return super.equals(obj);
        }
        AuthRequest authRequest = (AuthRequest) obj;
        return getPhoneNumber().equals(authRequest.getPhoneNumber()) && getPassword().equals(authRequest.getPassword()) && getUnknownFields().equals(authRequest.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPhoneNumber().hashCode()) * 37) + 2) * 53) + getPassword().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static AuthRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuthRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuthRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuthRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuthRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuthRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuthRequest parseFrom(InputStream inputStream) throws IOException {
        return (AuthRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static AuthRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuthRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuthRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthRequest authRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(authRequest);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements AuthRequestOrBuilder {
        private int bitField0_;
        private Object password_;
        private Object phoneNumber_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_AuthRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_AuthRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthRequest.class, Builder.class);
        }

        private Builder() {
            this.phoneNumber_ = "";
            this.password_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.phoneNumber_ = "";
            this.password_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.phoneNumber_ = "";
            this.password_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_AuthRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuthRequest getDefaultInstanceForType() {
            return AuthRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthRequest build() {
            AuthRequest authRequestBuildPartial = buildPartial();
            if (authRequestBuildPartial.isInitialized()) {
                return authRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) authRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthRequest buildPartial() {
            AuthRequest authRequest = new AuthRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(authRequest);
            }
            onBuilt();
            return authRequest;
        }

        private void buildPartial0(AuthRequest authRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                authRequest.phoneNumber_ = this.phoneNumber_;
            }
            if ((i & 2) != 0) {
                authRequest.password_ = this.password_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AuthRequest) {
                return mergeFrom((AuthRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuthRequest authRequest) {
            if (authRequest == AuthRequest.getDefaultInstance()) {
                return this;
            }
            if (!authRequest.getPhoneNumber().isEmpty()) {
                this.phoneNumber_ = authRequest.phoneNumber_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!authRequest.getPassword().isEmpty()) {
                this.password_ = authRequest.password_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(authRequest.getUnknownFields());
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
                                this.phoneNumber_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.password_ = codedInputStream.readStringRequireUtf8();
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

        @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.phoneNumber_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPhoneNumber(String str) {
            str.getClass();
            this.phoneNumber_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearPhoneNumber() {
            this.phoneNumber_ = AuthRequest.getDefaultInstance().getPhoneNumber();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setPhoneNumberBytes(ByteString byteString) {
            byteString.getClass();
            AuthRequest.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
        public String getPassword() {
            Object obj = this.password_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.password_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AuthRequestOrBuilder
        public ByteString getPasswordBytes() {
            Object obj = this.password_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.password_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPassword(String str) {
            str.getClass();
            this.password_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearPassword() {
            this.password_ = AuthRequest.getDefaultInstance().getPassword();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setPasswordBytes(ByteString byteString) {
            byteString.getClass();
            AuthRequest.checkByteStringIsUtf8(byteString);
            this.password_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static AuthRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuthRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuthRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
