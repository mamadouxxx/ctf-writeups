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
public final class GenericResponse extends GeneratedMessage implements GenericResponseOrBuilder {
    private static final GenericResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static final Parser<GenericResponse> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object error_;
    private byte memoizedIsInitialized;
    private boolean success_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", GenericResponse.class.getName());
        DEFAULT_INSTANCE = new GenericResponse();
        PARSER = new AbstractParser<GenericResponse>() { // from class: com.flag4jobs.protoscribe.grpc.GenericResponse.1
            @Override // com.google.protobuf.Parser
            public GenericResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericResponse.newBuilder();
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

    private GenericResponse(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private GenericResponse() {
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_GenericResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_GenericResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericResponse.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
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
        int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenericResponse)) {
            return super.equals(obj);
        }
        GenericResponse genericResponse = (GenericResponse) obj;
        return getSuccess() == genericResponse.getSuccess() && getError().equals(genericResponse.getError()) && getUnknownFields().equals(genericResponse.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getSuccess())) * 37) + 2) * 53) + getError().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static GenericResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static GenericResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GenericResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static GenericResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static GenericResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static GenericResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GenericResponse parseFrom(InputStream inputStream) throws IOException {
        return (GenericResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static GenericResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GenericResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GenericResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GenericResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GenericResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GenericResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GenericResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GenericResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static GenericResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GenericResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GenericResponse genericResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericResponse);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements GenericResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private boolean success_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_GenericResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_GenericResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericResponse.class, Builder.class);
        }

        private Builder() {
            this.error_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.success_ = false;
            this.error_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_GenericResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericResponse getDefaultInstanceForType() {
            return GenericResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GenericResponse build() {
            GenericResponse genericResponseBuildPartial = buildPartial();
            if (genericResponseBuildPartial.isInitialized()) {
                return genericResponseBuildPartial;
            }
            throw newUninitializedMessageException((Message) genericResponseBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GenericResponse buildPartial() {
            GenericResponse genericResponse = new GenericResponse(this);
            if (this.bitField0_ != 0) {
                buildPartial0(genericResponse);
            }
            onBuilt();
            return genericResponse;
        }

        private void buildPartial0(GenericResponse genericResponse) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                genericResponse.success_ = this.success_;
            }
            if ((i & 2) != 0) {
                genericResponse.error_ = this.error_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GenericResponse) {
                return mergeFrom((GenericResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GenericResponse genericResponse) {
            if (genericResponse == GenericResponse.getDefaultInstance()) {
                return this;
            }
            if (genericResponse.getSuccess()) {
                setSuccess(genericResponse.getSuccess());
            }
            if (!genericResponse.getError().isEmpty()) {
                this.error_ = genericResponse.error_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(genericResponse.getUnknownFields());
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

        @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
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

        @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
        public String getError() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.error_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GenericResponseOrBuilder
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
            this.error_ = GenericResponse.getDefaultInstance().getError();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            byteString.getClass();
            GenericResponse.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static GenericResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GenericResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GenericResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GenericResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
