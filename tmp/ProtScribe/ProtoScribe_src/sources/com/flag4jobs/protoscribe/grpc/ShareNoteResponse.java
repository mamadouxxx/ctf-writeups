package com.flag4jobs.protoscribe.grpc;

import com.flag4jobs.protoscribe.grpc.Contact;
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
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShareNoteResponse extends GeneratedMessage implements ShareNoteResponseOrBuilder {
    public static final int CONTACTS_FIELD_NUMBER = 3;
    private static final ShareNoteResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static final Parser<ShareNoteResponse> PARSER;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<Contact> contacts_;
    private volatile Object error_;
    private byte memoizedIsInitialized;
    private boolean success_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", ShareNoteResponse.class.getName());
        DEFAULT_INSTANCE = new ShareNoteResponse();
        PARSER = new AbstractParser<ShareNoteResponse>() { // from class: com.flag4jobs.protoscribe.grpc.ShareNoteResponse.1
            @Override // com.google.protobuf.Parser
            public ShareNoteResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareNoteResponse.newBuilder();
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

    private ShareNoteResponse(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private ShareNoteResponse() {
        this.success_ = false;
        this.error_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.error_ = "";
        this.contacts_ = Collections.emptyList();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_ShareNoteResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_ShareNoteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareNoteResponse.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public List<Contact> getContactsList() {
        return this.contacts_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public List<? extends ContactOrBuilder> getContactsOrBuilderList() {
        return this.contacts_;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public int getContactsCount() {
        return this.contacts_.size();
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public Contact getContacts(int i) {
        return this.contacts_.get(i);
    }

    @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
    public ContactOrBuilder getContactsOrBuilder(int i) {
        return this.contacts_.get(i);
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
        for (int i = 0; i < this.contacts_.size(); i++) {
            codedOutputStream.writeMessage(3, this.contacts_.get(i));
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
        for (int i2 = 0; i2 < this.contacts_.size(); i2++) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(3, this.contacts_.get(i2));
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
        if (!(obj instanceof ShareNoteResponse)) {
            return super.equals(obj);
        }
        ShareNoteResponse shareNoteResponse = (ShareNoteResponse) obj;
        return getSuccess() == shareNoteResponse.getSuccess() && getError().equals(shareNoteResponse.getError()) && getContactsList().equals(shareNoteResponse.getContactsList()) && getUnknownFields().equals(shareNoteResponse.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getSuccess())) * 37) + 2) * 53) + getError().hashCode();
        if (getContactsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getContactsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ShareNoteResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ShareNoteResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ShareNoteResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ShareNoteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ShareNoteResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ShareNoteResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ShareNoteResponse parseFrom(InputStream inputStream) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ShareNoteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ShareNoteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ShareNoteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ShareNoteResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static ShareNoteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShareNoteResponse) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ShareNoteResponse shareNoteResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareNoteResponse);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements ShareNoteResponseOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> contactsBuilder_;
        private List<Contact> contacts_;
        private Object error_;
        private boolean success_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_ShareNoteResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_ShareNoteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareNoteResponse.class, Builder.class);
        }

        private Builder() {
            this.error_ = "";
            this.contacts_ = Collections.emptyList();
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
            this.contacts_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.success_ = false;
            this.error_ = "";
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                this.contacts_ = Collections.emptyList();
            } else {
                this.contacts_ = null;
                repeatedFieldBuilder.clear();
            }
            this.bitField0_ &= -5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_ShareNoteResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareNoteResponse getDefaultInstanceForType() {
            return ShareNoteResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ShareNoteResponse build() {
            ShareNoteResponse shareNoteResponseBuildPartial = buildPartial();
            if (shareNoteResponseBuildPartial.isInitialized()) {
                return shareNoteResponseBuildPartial;
            }
            throw newUninitializedMessageException((Message) shareNoteResponseBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ShareNoteResponse buildPartial() {
            ShareNoteResponse shareNoteResponse = new ShareNoteResponse(this);
            buildPartialRepeatedFields(shareNoteResponse);
            if (this.bitField0_ != 0) {
                buildPartial0(shareNoteResponse);
            }
            onBuilt();
            return shareNoteResponse;
        }

        private void buildPartialRepeatedFields(ShareNoteResponse shareNoteResponse) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder != null) {
                shareNoteResponse.contacts_ = repeatedFieldBuilder.build();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.contacts_ = Collections.unmodifiableList(this.contacts_);
                this.bitField0_ &= -5;
            }
            shareNoteResponse.contacts_ = this.contacts_;
        }

        private void buildPartial0(ShareNoteResponse shareNoteResponse) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                shareNoteResponse.success_ = this.success_;
            }
            if ((i & 2) != 0) {
                shareNoteResponse.error_ = this.error_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ShareNoteResponse) {
                return mergeFrom((ShareNoteResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ShareNoteResponse shareNoteResponse) {
            if (shareNoteResponse == ShareNoteResponse.getDefaultInstance()) {
                return this;
            }
            if (shareNoteResponse.getSuccess()) {
                setSuccess(shareNoteResponse.getSuccess());
            }
            if (!shareNoteResponse.getError().isEmpty()) {
                this.error_ = shareNoteResponse.error_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (this.contactsBuilder_ == null) {
                if (!shareNoteResponse.contacts_.isEmpty()) {
                    if (this.contacts_.isEmpty()) {
                        this.contacts_ = shareNoteResponse.contacts_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureContactsIsMutable();
                        this.contacts_.addAll(shareNoteResponse.contacts_);
                    }
                    onChanged();
                }
            } else if (!shareNoteResponse.contacts_.isEmpty()) {
                if (!this.contactsBuilder_.isEmpty()) {
                    this.contactsBuilder_.addAllMessages(shareNoteResponse.contacts_);
                } else {
                    this.contactsBuilder_.dispose();
                    this.contactsBuilder_ = null;
                    this.contacts_ = shareNoteResponse.contacts_;
                    this.bitField0_ &= -5;
                    this.contactsBuilder_ = ShareNoteResponse.alwaysUseFieldBuilders ? getContactsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(shareNoteResponse.getUnknownFields());
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
                                Contact contact = (Contact) codedInputStream.readMessage(Contact.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
                                if (repeatedFieldBuilder == null) {
                                    ensureContactsIsMutable();
                                    this.contacts_.add(contact);
                                } else {
                                    repeatedFieldBuilder.addMessage(contact);
                                }
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

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
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

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public String getError() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.error_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
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
            this.error_ = ShareNoteResponse.getDefaultInstance().getError();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            byteString.getClass();
            ShareNoteResponse.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensureContactsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.contacts_ = new ArrayList(this.contacts_);
                this.bitField0_ |= 4;
            }
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public List<Contact> getContactsList() {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                return Collections.unmodifiableList(this.contacts_);
            }
            return repeatedFieldBuilder.getMessageList();
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public int getContactsCount() {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                return this.contacts_.size();
            }
            return repeatedFieldBuilder.getCount();
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public Contact getContacts(int i) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                return this.contacts_.get(i);
            }
            return (Contact) repeatedFieldBuilder.getMessage(i);
        }

        public Builder setContacts(int i, Contact contact) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                contact.getClass();
                ensureContactsIsMutable();
                this.contacts_.set(i, contact);
                onChanged();
            } else {
                repeatedFieldBuilder.setMessage(i, contact);
            }
            return this;
        }

        public Builder setContacts(int i, Contact.Builder builder) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureContactsIsMutable();
                this.contacts_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilder.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addContacts(Contact contact) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                contact.getClass();
                ensureContactsIsMutable();
                this.contacts_.add(contact);
                onChanged();
            } else {
                repeatedFieldBuilder.addMessage(contact);
            }
            return this;
        }

        public Builder addContacts(int i, Contact contact) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                contact.getClass();
                ensureContactsIsMutable();
                this.contacts_.add(i, contact);
                onChanged();
            } else {
                repeatedFieldBuilder.addMessage(i, contact);
            }
            return this;
        }

        public Builder addContacts(Contact.Builder builder) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureContactsIsMutable();
                this.contacts_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilder.addMessage(builder.build());
            }
            return this;
        }

        public Builder addContacts(int i, Contact.Builder builder) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureContactsIsMutable();
                this.contacts_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilder.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllContacts(Iterable<? extends Contact> iterable) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureContactsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.contacts_);
                onChanged();
            } else {
                repeatedFieldBuilder.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearContacts() {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                this.contacts_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                repeatedFieldBuilder.clear();
            }
            return this;
        }

        public Builder removeContacts(int i) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureContactsIsMutable();
                this.contacts_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilder.remove(i);
            }
            return this;
        }

        public Contact.Builder getContactsBuilder(int i) {
            return (Contact.Builder) getContactsFieldBuilder().getBuilder(i);
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public ContactOrBuilder getContactsOrBuilder(int i) {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder == null) {
                return this.contacts_.get(i);
            }
            return (ContactOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
        }

        @Override // com.flag4jobs.protoscribe.grpc.ShareNoteResponseOrBuilder
        public List<? extends ContactOrBuilder> getContactsOrBuilderList() {
            RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> repeatedFieldBuilder = this.contactsBuilder_;
            if (repeatedFieldBuilder != null) {
                return repeatedFieldBuilder.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.contacts_);
        }

        public Contact.Builder addContactsBuilder() {
            return (Contact.Builder) getContactsFieldBuilder().addBuilder(Contact.getDefaultInstance());
        }

        public Contact.Builder addContactsBuilder(int i) {
            return (Contact.Builder) getContactsFieldBuilder().addBuilder(i, Contact.getDefaultInstance());
        }

        public List<Contact.Builder> getContactsBuilderList() {
            return getContactsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilder<Contact, Contact.Builder, ContactOrBuilder> getContactsFieldBuilder() {
            if (this.contactsBuilder_ == null) {
                this.contactsBuilder_ = new RepeatedFieldBuilder<>(this.contacts_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.contacts_ = null;
            }
            return this.contactsBuilder_;
        }
    }

    public static ShareNoteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ShareNoteResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ShareNoteResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ShareNoteResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
