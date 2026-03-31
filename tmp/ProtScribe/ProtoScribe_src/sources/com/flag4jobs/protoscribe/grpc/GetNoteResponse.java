package com.flag4jobs.protoscribe.grpc;

import com.flag4jobs.protoscribe.grpc.Note;
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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class GetNoteResponse extends GeneratedMessage implements GetNoteResponseOrBuilder {
    private static final GetNoteResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NOTE_FIELD_NUMBER = 3;
    private static final Parser<GetNoteResponse> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object error_;
    private byte memoizedIsInitialized;
    private Note note_;
    private boolean success_;

    static /* synthetic */ int access$776(GetNoteResponse getNoteResponse, int i) {
        int i2 = i | getNoteResponse.bitField0_;
        getNoteResponse.bitField0_ = i2;
        return i2;
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", GetNoteResponse.class.getName());
        DEFAULT_INSTANCE = new GetNoteResponse();
        PARSER = new AbstractParser<GetNoteResponse>() { // from class: com.flag4jobs.protoscribe.grpc.GetNoteResponse.1
            @Override // com.google.protobuf.Parser
            public GetNoteResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNoteResponse.newBuilder();
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

    private GetNoteResponse(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private GetNoteResponse() {
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_GetNoteResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_GetNoteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNoteResponse.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public boolean hasNote() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public Note getNote() {
        Note note = this.note_;
        return note == null ? Note.getDefaultInstance() : note;
    }

    @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
    public NoteOrBuilder getNoteOrBuilder() {
        Note note = this.note_;
        return note == null ? Note.getDefaultInstance() : note;
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
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(3, getNote());
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
        if ((1 & this.bitField0_) != 0) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(3, getNote());
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
        if (!(obj instanceof GetNoteResponse)) {
            return super.equals(obj);
        }
        GetNoteResponse getNoteResponse = (GetNoteResponse) obj;
        if (getSuccess() == getNoteResponse.getSuccess() && getError().equals(getNoteResponse.getError()) && hasNote() == getNoteResponse.hasNote()) {
            return (!hasNote() || getNote().equals(getNoteResponse.getNote())) && getUnknownFields().equals(getNoteResponse.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getSuccess())) * 37) + 2) * 53) + getError().hashCode();
        if (hasNote()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNote().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static GetNoteResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static GetNoteResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GetNoteResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static GetNoteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static GetNoteResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static GetNoteResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetNoteResponse parseFrom(InputStream inputStream) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static GetNoteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNoteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetNoteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetNoteResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetNoteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetNoteResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GetNoteResponse getNoteResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNoteResponse);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements GetNoteResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> noteBuilder_;
        private Note note_;
        private boolean success_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_GetNoteResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_GetNoteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNoteResponse.class, Builder.class);
        }

        private Builder() {
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GetNoteResponse.alwaysUseFieldBuilders) {
                getNoteFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.success_ = false;
            this.error_ = "";
            this.note_ = null;
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.dispose();
                this.noteBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_GetNoteResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNoteResponse getDefaultInstanceForType() {
            return GetNoteResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNoteResponse build() {
            GetNoteResponse getNoteResponseBuildPartial = buildPartial();
            if (getNoteResponseBuildPartial.isInitialized()) {
                return getNoteResponseBuildPartial;
            }
            throw newUninitializedMessageException((Message) getNoteResponseBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GetNoteResponse buildPartial() {
            GetNoteResponse getNoteResponse = new GetNoteResponse(this);
            if (this.bitField0_ != 0) {
                buildPartial0(getNoteResponse);
            }
            onBuilt();
            return getNoteResponse;
        }

        private void buildPartial0(GetNoteResponse getNoteResponse) {
            int i;
            Note note;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                getNoteResponse.success_ = this.success_;
            }
            if ((i2 & 2) != 0) {
                getNoteResponse.error_ = this.error_;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
                if (singleFieldBuilder == null) {
                    note = this.note_;
                } else {
                    note = (Note) singleFieldBuilder.build();
                }
                getNoteResponse.note_ = note;
                i = 1;
            } else {
                i = 0;
            }
            GetNoteResponse.access$776(getNoteResponse, i);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GetNoteResponse) {
                return mergeFrom((GetNoteResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetNoteResponse getNoteResponse) {
            if (getNoteResponse == GetNoteResponse.getDefaultInstance()) {
                return this;
            }
            if (getNoteResponse.getSuccess()) {
                setSuccess(getNoteResponse.getSuccess());
            }
            if (!getNoteResponse.getError().isEmpty()) {
                this.error_ = getNoteResponse.error_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (getNoteResponse.hasNote()) {
                mergeNote(getNoteResponse.getNote());
            }
            mergeUnknownFields(getNoteResponse.getUnknownFields());
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
                                codedInputStream.readMessage(getNoteFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
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

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
        public String getError() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.error_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
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
            this.error_ = GetNoteResponse.getDefaultInstance().getError();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            byteString.getClass();
            GetNoteResponse.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
        public boolean hasNote() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
        public Note getNote() {
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder == null) {
                Note note = this.note_;
                return note == null ? Note.getDefaultInstance() : note;
            }
            return (Note) singleFieldBuilder.getMessage();
        }

        public Builder setNote(Note note) {
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder == null) {
                note.getClass();
                this.note_ = note;
            } else {
                singleFieldBuilder.setMessage(note);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setNote(Note.Builder builder) {
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder == null) {
                this.note_ = builder.build();
            } else {
                singleFieldBuilder.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeNote(Note note) {
            Note note2;
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder == null) {
                if ((this.bitField0_ & 4) != 0 && (note2 = this.note_) != null && note2 != Note.getDefaultInstance()) {
                    getNoteBuilder().mergeFrom(note);
                } else {
                    this.note_ = note;
                }
            } else {
                singleFieldBuilder.mergeFrom(note);
            }
            if (this.note_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearNote() {
            this.bitField0_ &= -5;
            this.note_ = null;
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.dispose();
                this.noteBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Note.Builder getNoteBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (Note.Builder) getNoteFieldBuilder().getBuilder();
        }

        @Override // com.flag4jobs.protoscribe.grpc.GetNoteResponseOrBuilder
        public NoteOrBuilder getNoteOrBuilder() {
            SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> singleFieldBuilder = this.noteBuilder_;
            if (singleFieldBuilder != null) {
                return (NoteOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }
            Note note = this.note_;
            return note == null ? Note.getDefaultInstance() : note;
        }

        private SingleFieldBuilder<Note, Note.Builder, NoteOrBuilder> getNoteFieldBuilder() {
            if (this.noteBuilder_ == null) {
                this.noteBuilder_ = new SingleFieldBuilder<>(getNote(), getParentForChildren(), isClean());
                this.note_ = null;
            }
            return this.noteBuilder_;
        }
    }

    public static GetNoteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GetNoteResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GetNoteResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GetNoteResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
