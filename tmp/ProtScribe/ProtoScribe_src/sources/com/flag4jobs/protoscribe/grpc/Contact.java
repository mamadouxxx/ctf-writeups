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
public final class Contact extends GeneratedMessage implements ContactOrBuilder {
    private static final Contact DEFAULT_INSTANCE;
    private static final Parser<Contact> PARSER;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object phoneNumber_;
    private volatile Object uuid_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", Contact.class.getName());
        DEFAULT_INSTANCE = new Contact();
        PARSER = new AbstractParser<Contact>() { // from class: com.flag4jobs.protoscribe.grpc.Contact.1
            @Override // com.google.protobuf.Parser
            public Contact parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Contact.newBuilder();
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

    private Contact(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.uuid_ = "";
        this.phoneNumber_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Contact() {
        this.uuid_ = "";
        this.phoneNumber_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.uuid_ = "";
        this.phoneNumber_ = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ScribeProto.internal_static_protoscribe_Contact_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ScribeProto.internal_static_protoscribe_Contact_fieldAccessorTable.ensureFieldAccessorsInitialized(Contact.class, Builder.class);
    }

    @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
    public String getUuid() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uuid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
    public ByteString getUuidBytes() {
        Object obj = this.uuid_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.uuid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
    public String getPhoneNumber() {
        Object obj = this.phoneNumber_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.phoneNumber_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
    public ByteString getPhoneNumberBytes() {
        Object obj = this.phoneNumber_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
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
        if (!GeneratedMessage.isStringEmpty(this.uuid_)) {
            GeneratedMessage.writeString(codedOutputStream, 1, this.uuid_);
        }
        if (!GeneratedMessage.isStringEmpty(this.phoneNumber_)) {
            GeneratedMessage.writeString(codedOutputStream, 2, this.phoneNumber_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.uuid_) ? GeneratedMessage.computeStringSize(1, this.uuid_) : 0;
        if (!GeneratedMessage.isStringEmpty(this.phoneNumber_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.phoneNumber_);
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
        if (!(obj instanceof Contact)) {
            return super.equals(obj);
        }
        Contact contact = (Contact) obj;
        return getUuid().equals(contact.getUuid()) && getPhoneNumber().equals(contact.getPhoneNumber()) && getUnknownFields().equals(contact.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUuid().hashCode()) * 37) + 2) * 53) + getPhoneNumber().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static Contact parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Contact parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Contact parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Contact parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Contact parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Contact parseFrom(InputStream inputStream) throws IOException {
        return (Contact) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Contact parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Contact) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Contact parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Contact) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Contact parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Contact) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Contact parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Contact) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static Contact parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Contact) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Contact contact) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(contact);
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

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements ContactOrBuilder {
        private int bitField0_;
        private Object phoneNumber_;
        private Object uuid_;

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ScribeProto.internal_static_protoscribe_Contact_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ScribeProto.internal_static_protoscribe_Contact_fieldAccessorTable.ensureFieldAccessorsInitialized(Contact.class, Builder.class);
        }

        private Builder() {
            this.uuid_ = "";
            this.phoneNumber_ = "";
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.uuid_ = "";
            this.phoneNumber_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.uuid_ = "";
            this.phoneNumber_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ScribeProto.internal_static_protoscribe_Contact_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Contact getDefaultInstanceForType() {
            return Contact.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Contact build() {
            Contact contactBuildPartial = buildPartial();
            if (contactBuildPartial.isInitialized()) {
                return contactBuildPartial;
            }
            throw newUninitializedMessageException((Message) contactBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Contact buildPartial() {
            Contact contact = new Contact(this);
            if (this.bitField0_ != 0) {
                buildPartial0(contact);
            }
            onBuilt();
            return contact;
        }

        private void buildPartial0(Contact contact) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                contact.uuid_ = this.uuid_;
            }
            if ((i & 2) != 0) {
                contact.phoneNumber_ = this.phoneNumber_;
            }
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Contact) {
                return mergeFrom((Contact) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Contact contact) {
            if (contact == Contact.getDefaultInstance()) {
                return this;
            }
            if (!contact.getUuid().isEmpty()) {
                this.uuid_ = contact.uuid_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!contact.getPhoneNumber().isEmpty()) {
                this.phoneNumber_ = contact.phoneNumber_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(contact.getUnknownFields());
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
                                this.uuid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.phoneNumber_ = codedInputStream.readStringRequireUtf8();
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

        @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
        public String getUuid() {
            Object obj = this.uuid_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uuid_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
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
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearUuid() {
            this.uuid_ = Contact.getDefaultInstance().getUuid();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setUuidBytes(ByteString byteString) {
            byteString.getClass();
            Contact.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.phoneNumber_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.flag4jobs.protoscribe.grpc.ContactOrBuilder
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
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearPhoneNumber() {
            this.phoneNumber_ = Contact.getDefaultInstance().getPhoneNumber();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setPhoneNumberBytes(ByteString byteString) {
            byteString.getClass();
            Contact.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }
    }

    public static Contact getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Contact> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Contact> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Contact getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
