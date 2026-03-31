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
import com.google.protobuf.Internal;
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
public final class GetNotesResponse extends GeneratedMessage implements GetNotesResponseOrBuilder {
    private static final GetNotesResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NOTES_UUID_FIELD_NUMBER = 3;
    private static final Parser<GetNotesResponse> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object error_;
    private byte memoizedIsInitialized;
    private LazyStringArrayList notesUuid_;
    private boolean success_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", GetNotesResponse.class.getName());
        DEFAULT_INSTANCE = new GetNotesResponse();
        PARSER = new AbstractParser<GetNotesResponse>() { // from class: com.flag4jobs.protoscribe.grpc.GetNotesResponse.1
            @Override // com.google.protobuf.Parser
            public GetNotesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNotesResponse.newBuilder();
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

    private GetNotesResponse(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.success_ = false;
        this.error_ = "";
        this.notesUuid_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private GetNotesResponse() {
        this.success_ = false;
        this.error_ = "";
        this.notesUuid_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
        this.notesUuid_ = LazyStringArrayList.emptyList();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_GetNotesResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_GetNotesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNotesResponse.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public ProtocolStringList getNotesUuidList() {
        return this.notesUuid_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public int getNotesUuidCount() {
        return this.notesUuid_.size();
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public String getNotesUuid(int i) {
        return this.notesUuid_.get(i);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
    public ByteString getNotesUuidBytes(int i) {
        return this.notesUuid_.getByteString(i);
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
        for (int i = 0; i < this.notesUuid_.size(); i++) {
            GeneratedMessage.writeString(codedOutputStream, 3, this.notesUuid_.getRaw(i));
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
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.notesUuid_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.notesUuid_.getRaw(i2));
        }
        int size = iComputeBoolSize + iComputeStringSizeNoTag + getNotesUuidList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNotesResponse)) {
            return super.equals(obj);
        }
        GetNotesResponse getNotesResponse = (GetNotesResponse) obj;
        return getSuccess() == getNotesResponse.getSuccess() && getError().equals(getNotesResponse.getError()) && getNotesUuidList().equals(getNotesResponse.getNotesUuidList()) && getUnknownFields().equals(getNotesResponse.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getSuccess())) * 37) + 2) * 53) + getError().hashCode();
        if (getNotesUuidCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNotesUuidList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static GetNotesResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static GetNotesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GetNotesResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static GetNotesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static GetNotesResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static GetNotesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetNotesResponse parseFrom(InputStream inputStream) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static GetNotesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNotesResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetNotesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNotesResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetNotesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNotesResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GetNotesResponse getNotesResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNotesResponse);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements GetNotesResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private LazyStringArrayList notesUuid_;
        private boolean success_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_GetNotesResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_GetNotesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNotesResponse.class, Builder.class);
        }

        private Builder() {
            this.error_ = "";
            this.notesUuid_ = LazyStringArrayList.emptyList();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
            this.notesUuid_ = LazyStringArrayList.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.success_ = false;
            this.error_ = "";
            this.notesUuid_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_GetNotesResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNotesResponse getDefaultInstanceForType() {
            return GetNotesResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNotesResponse build() {
            GetNotesResponse getNotesResponseBuildPartial = buildPartial();
            if (getNotesResponseBuildPartial.isInitialized()) {
                return getNotesResponseBuildPartial;
            }
            throw newUninitializedMessageException((Message) getNotesResponseBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNotesResponse buildPartial() {
            GetNotesResponse getNotesResponse = new GetNotesResponse(this);
            if (this.bitField0_ != 0) {
                buildPartial0(getNotesResponse);
            }
            onBuilt();
            return getNotesResponse;
        }

        private void buildPartial0(GetNotesResponse getNotesResponse) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                getNotesResponse.success_ = this.success_;
            }
            if ((i & 2) != 0) {
                getNotesResponse.error_ = this.error_;
            }
            if ((i & 4) != 0) {
                this.notesUuid_.makeImmutable();
                getNotesResponse.notesUuid_ = this.notesUuid_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GetNotesResponse) {
                return mergeFrom((GetNotesResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetNotesResponse getNotesResponse) {
            if (getNotesResponse == GetNotesResponse.getDefaultInstance()) {
                return this;
            }
            if (getNotesResponse.getSuccess()) {
                setSuccess(getNotesResponse.getSuccess());
            }
            if (!getNotesResponse.getError().isEmpty()) {
                this.error_ = getNotesResponse.error_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!getNotesResponse.notesUuid_.isEmpty()) {
                if (this.notesUuid_.isEmpty()) {
                    this.notesUuid_ = getNotesResponse.notesUuid_;
                    this.bitField0_ |= 4;
                } else {
                    ensureNotesUuidIsMutable();
                    this.notesUuid_.addAll(getNotesResponse.notesUuid_);
                }
                onChanged();
            }
            mergeUnknownFields(getNotesResponse.getUnknownFields());
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
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureNotesUuidIsMutable();
                                this.notesUuid_.add(stringRequireUtf8);
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
        public String getError() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.error_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
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
            this.error_ = GetNotesResponse.getDefaultInstance().getError();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            byteString.getClass();
            GetNotesResponse.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensureNotesUuidIsMutable() {
            if (!this.notesUuid_.isModifiable()) {
                this.notesUuid_ = new LazyStringArrayList((LazyStringList) this.notesUuid_);
            }
            this.bitField0_ |= 4;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
        public ProtocolStringList getNotesUuidList() {
            this.notesUuid_.makeImmutable();
            return this.notesUuid_;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
        public int getNotesUuidCount() {
            return this.notesUuid_.size();
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
        public String getNotesUuid(int i) {
            return this.notesUuid_.get(i);
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNotesResponseOrBuilder
        public ByteString getNotesUuidBytes(int i) {
            return this.notesUuid_.getByteString(i);
        }

        public Builder setNotesUuid(int i, String str) {
            str.getClass();
            ensureNotesUuidIsMutable();
            this.notesUuid_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addNotesUuid(String str) {
            str.getClass();
            ensureNotesUuidIsMutable();
            this.notesUuid_.add(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addAllNotesUuid(Iterable<String> iterable) {
            ensureNotesUuidIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.notesUuid_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearNotesUuid() {
            this.notesUuid_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addNotesUuidBytes(ByteString byteString) {
            byteString.getClass();
            GetNotesResponse.checkByteStringIsUtf8(byteString);
            ensureNotesUuidIsMutable();
            this.notesUuid_.add(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }
    }

    public static GetNotesResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GetNotesResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetNotesResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetNotesResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
