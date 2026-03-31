package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShareNoteRequest extends GeneratedMessage implements ShareNoteRequestOrBuilder {
    private static final ShareNoteRequest DEFAULT_INSTANCE;
    private static final Parser<ShareNoteRequest> PARSER;
    public static final int PHONE_NUMBERS_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private LazyStringArrayList phoneNumbers_;
    private volatile Object token_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", ShareNoteRequest.class.getName());
        DEFAULT_INSTANCE = new ShareNoteRequest();
        PARSER = new AbstractParser<ShareNoteRequest>() { // from class: com.flag4jobs.protoscribe.grpc.ShareNoteRequest.1
            @Override // com.google.protobuf.Parser
            public ShareNoteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareNoteRequest.newBuilder();
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

    private ShareNoteRequest(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.token_ = "";
        this.uuid_ = "";
        this.phoneNumbers_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private ShareNoteRequest() {
        this.token_ = "";
        this.uuid_ = "";
        this.phoneNumbers_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.token_ = "";
        this.uuid_ = "";
        this.phoneNumbers_ = LazyStringArrayList.emptyList();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_ShareNoteRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_ShareNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareNoteRequest.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public String getToken() {
        Object obj = this.token_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.token_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public ByteString getTokenBytes() {
        Object obj = this.token_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public ByteString getUuidBytes() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.uuid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public ProtocolStringList getPhoneNumbersList() {
        return this.phoneNumbers_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public int getPhoneNumbersCount() {
        return this.phoneNumbers_.size();
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public String getPhoneNumbers(int i) {
        return this.phoneNumbers_.get(i);
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
    public ByteString getPhoneNumbersBytes(int i) {
        return this.phoneNumbers_.getByteString(i);
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
        for (int i = 0; i < this.phoneNumbers_.size(); i++) {
            GeneratedMessage.writeString(codedOutputStream, 3, this.phoneNumbers_.getRaw(i));
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
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.phoneNumbers_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.phoneNumbers_.getRaw(i2));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getPhoneNumbersList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShareNoteRequest)) {
            return super.equals(obj);
        }
        ShareNoteRequest shareNoteRequest = (ShareNoteRequest) obj;
        return getToken().equals(shareNoteRequest.getToken()) && getUuid().equals(shareNoteRequest.getUuid()) && getPhoneNumbersList().equals(shareNoteRequest.getPhoneNumbersList()) && getUnknownFields().equals(shareNoteRequest.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getToken().hashCode()) * 37) + 2) * 53) + getUuid().hashCode();
        if (getPhoneNumbersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getPhoneNumbersList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ShareNoteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ShareNoteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ShareNoteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ShareNoteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ShareNoteRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ShareNoteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ShareNoteRequest parseFrom(InputStream inputStream) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ShareNoteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ShareNoteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ShareNoteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ShareNoteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static ShareNoteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ShareNoteRequest shareNoteRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareNoteRequest);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements ShareNoteRequestOrBuilder {
        private int bitField0_;
        private LazyStringArrayList phoneNumbers_;
        private Object token_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_ShareNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_ShareNoteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareNoteRequest.class, Builder.class);
        }

        private Builder() {
            this.token_ = "";
            this.uuid_ = "";
            this.phoneNumbers_ = LazyStringArrayList.emptyList();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.token_ = "";
            this.uuid_ = "";
            this.phoneNumbers_ = LazyStringArrayList.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.token_ = "";
            this.uuid_ = "";
            this.phoneNumbers_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_ShareNoteRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareNoteRequest getDefaultInstanceForType() {
            return ShareNoteRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ShareNoteRequest build() {
            ShareNoteRequest shareNoteRequestBuildPartial = buildPartial();
            if (shareNoteRequestBuildPartial.isInitialized()) {
                return shareNoteRequestBuildPartial;
            }
            throw newUninitializedMessageException((Message) shareNoteRequestBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ShareNoteRequest buildPartial() {
            ShareNoteRequest shareNoteRequest = new ShareNoteRequest(this);
            if (this.bitField0_ != 0) {
                buildPartial0(shareNoteRequest);
            }
            onBuilt();
            return shareNoteRequest;
        }

        private void buildPartial0(ShareNoteRequest shareNoteRequest) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                shareNoteRequest.token_ = this.token_;
            }
            if ((i & 2) != 0) {
                shareNoteRequest.uuid_ = this.uuid_;
            }
            if ((i & 4) != 0) {
                this.phoneNumbers_.makeImmutable();
                shareNoteRequest.phoneNumbers_ = this.phoneNumbers_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ShareNoteRequest) {
                return mergeFrom((ShareNoteRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ShareNoteRequest shareNoteRequest) {
            if (shareNoteRequest == ShareNoteRequest.getDefaultInstance()) {
                return this;
            }
            if (!shareNoteRequest.getToken().isEmpty()) {
                this.token_ = shareNoteRequest.token_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!shareNoteRequest.getUuid().isEmpty()) {
                this.uuid_ = shareNoteRequest.uuid_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!shareNoteRequest.phoneNumbers_.isEmpty()) {
                if (this.phoneNumbers_.isEmpty()) {
                    this.phoneNumbers_ = shareNoteRequest.phoneNumbers_;
                    this.bitField0_ |= 4;
                } else {
                    ensurePhoneNumbersIsMutable();
                    this.phoneNumbers_.addAll(shareNoteRequest.phoneNumbers_);
                }
                onChanged();
            }
            mergeUnknownFields(shareNoteRequest.getUnknownFields());
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
                            } else if (tag == 26) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensurePhoneNumbersIsMutable();
                                this.phoneNumbers_.add(stringRequireUtf8);
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

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.token_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
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
            this.token_ = ShareNoteRequest.getDefaultInstance().getToken();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            byteString.getClass();
            ShareNoteRequest.checkByteStringIsUtf8(byteString);
            this.token_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
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
            this.uuid_ = ShareNoteRequest.getDefaultInstance().getUuid();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            ShareNoteRequest.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensurePhoneNumbersIsMutable() {
            if (!this.phoneNumbers_.isModifiable()) {
                this.phoneNumbers_ = new LazyStringArrayList((LazyStringList) this.phoneNumbers_);
            }
            this.bitField0_ |= 4;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public ProtocolStringList getPhoneNumbersList() {
            this.phoneNumbers_.makeImmutable();
            return this.phoneNumbers_;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public int getPhoneNumbersCount() {
            return this.phoneNumbers_.size();
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public String getPhoneNumbers(int i) {
            return this.phoneNumbers_.get(i);
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteRequestOrBuilder
        public ByteString getPhoneNumbersBytes(int i) {
            return this.phoneNumbers_.getByteString(i);
        }

        public Builder setPhoneNumbers(int i, String str) {
            str.getClass();
            ensurePhoneNumbersIsMutable();
            this.phoneNumbers_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addPhoneNumbers(String str) {
            str.getClass();
            ensurePhoneNumbersIsMutable();
            this.phoneNumbers_.add(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addAllPhoneNumbers(Iterable<String> iterable) {
            ensurePhoneNumbersIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phoneNumbers_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearPhoneNumbers() {
            this.phoneNumbers_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addPhoneNumbersBytes(ByteString byteString) {
            byteString.getClass();
            ShareNoteRequest.checkByteStringIsUtf8(byteString);
            ensurePhoneNumbersIsMutable();
            this.phoneNumbers_.add(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }
    }

    public static ShareNoteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ShareNoteRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ShareNoteRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ShareNoteRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
