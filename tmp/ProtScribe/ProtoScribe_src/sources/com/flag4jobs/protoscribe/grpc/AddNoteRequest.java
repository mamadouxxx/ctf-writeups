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
public final class AddNoteRequest extends GeneratedMessage implements AddNoteRequestOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final AddNoteRequest DEFAULT_INSTANCE;
    private static final Parser<AddNoteRequest> PARSER;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object content_;
    private byte memoizedIsInitialized;
    private volatile Object title_;
    private volatile Object token_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", AddNoteRequest.class.getName());
        DEFAULT_INSTANCE = new AddNoteRequest();
        PARSER = new AbstractParser<AddNoteRequest>() { // from class: com.flag4jobs.protoscribe.grpc.AddNoteRequest.1
            @Override // com.google.protobuf.Parser
            public AddNoteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AddNoteRequest.newBuilder();
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

    private AddNoteRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.token_ = "";
        this.title_ = "";
        this.content_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private AddNoteRequest() {
        this.token_ = "";
        this.title_ = "";
        this.content_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.token_ = "";
        this.title_ = "";
        this.content_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_AddNoteRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_AddNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AddNoteRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public String getTitle() {
        Object obj = this.title_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.title_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public ByteString getTitleBytes() {
        Object obj = this.title_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public String getContent() {
        Object obj = this.content_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.content_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
    public ByteString getContentBytes() {
        Object obj = this.content_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
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
        if (!GeneratedMessage.isStringEmpty(this.title_)) {
            GeneratedMessage.writeString(codedOutputStream, 2, this.title_);
        }
        if (!GeneratedMessage.isStringEmpty(this.content_)) {
            GeneratedMessage.writeString(codedOutputStream, 3, this.content_);
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
        if (!GeneratedMessage.isStringEmpty(this.title_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.title_);
        }
        if (!GeneratedMessage.isStringEmpty(this.content_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(3, this.content_);
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
        if (!(obj instanceof AddNoteRequest)) {
            return super.equals(obj);
        }
        AddNoteRequest addNoteRequest = (AddNoteRequest) obj;
        return getToken().equals(addNoteRequest.getToken()) && getTitle().equals(addNoteRequest.getTitle()) && getContent().equals(addNoteRequest.getContent()) && getUnknownFields().equals(addNoteRequest.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getToken().hashCode()) * 37) + 2) * 53) + getTitle().hashCode()) * 37) + 3) * 53) + getContent().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static AddNoteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AddNoteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AddNoteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AddNoteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AddNoteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AddNoteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AddNoteRequest parseFrom(InputStream inputStream) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static AddNoteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AddNoteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AddNoteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AddNoteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static AddNoteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AddNoteRequest addNoteRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(addNoteRequest);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements AddNoteRequestOrBuilder {
        private int bitField0_;
        private Object content_;
        private Object title_;
        private Object token_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_AddNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_AddNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AddNoteRequest.class, Builder.class);
        }

        private Builder() {
            this.token_ = "";
            this.title_ = "";
            this.content_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.token_ = "";
            this.title_ = "";
            this.content_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.token_ = "";
            this.title_ = "";
            this.content_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_AddNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AddNoteRequest getDefaultInstanceForType() {
            return AddNoteRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AddNoteRequest build() {
            AddNoteRequest addNoteRequestBuildPartial = buildPartial();
            if (addNoteRequestBuildPartial.isInitialized()) {
                return addNoteRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) addNoteRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AddNoteRequest buildPartial() {
            AddNoteRequest addNoteRequest = new AddNoteRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(addNoteRequest);
            }
            onBuilt();
            return addNoteRequest;
        }

        private void buildPartial0(AddNoteRequest addNoteRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                addNoteRequest.token_ = this.token_;
            }
            if ((i & 2) != 0) {
                addNoteRequest.title_ = this.title_;
            }
            if ((i & 4) != 0) {
                addNoteRequest.content_ = this.content_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AddNoteRequest) {
                return mergeFrom((AddNoteRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AddNoteRequest addNoteRequest) {
            if (addNoteRequest == AddNoteRequest.getDefaultInstance()) {
                return this;
            }
            if (!addNoteRequest.getToken().isEmpty()) {
                this.token_ = addNoteRequest.token_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!addNoteRequest.getTitle().isEmpty()) {
                this.title_ = addNoteRequest.title_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!addNoteRequest.getContent().isEmpty()) {
                this.content_ = addNoteRequest.content_;
                this.bitField0_ |= 4;
                onChanged();
            }
            mergeUnknownFields(addNoteRequest.getUnknownFields());
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
                                this.title_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.content_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
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

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
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
            this.token_ = AddNoteRequest.getDefaultInstance().getToken();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            AddNoteRequest.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setTitle(String str) {
            str.getClass();
            this.title_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearTitle() {
            this.title_ = AddNoteRequest.getDefaultInstance().getTitle();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            byteString.getClass();
            AddNoteRequest.checkByteStringIsUtf8(byteString);
            this.title_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.AddNoteRequestOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setContent(String str) {
            str.getClass();
            this.content_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearContent() {
            this.content_ = AddNoteRequest.getDefaultInstance().getContent();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            byteString.getClass();
            AddNoteRequest.checkByteStringIsUtf8(byteString);
            this.content_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }
    }

    public static AddNoteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AddNoteRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AddNoteRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AddNoteRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
