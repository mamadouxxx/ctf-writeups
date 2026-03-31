package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ContextRule extends GeneratedMessageV3 implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE = new ContextRule();
    private static final Parser<ContextRule> PARSER = new AbstractParser<ContextRule>() { // from class: com.google.api.ContextRule.1
        @Override // com.google.protobuf.Parser
        public ContextRule parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ContextRule.newBuilder();
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
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private LazyStringArrayList allowedRequestExtensions_;
    private LazyStringArrayList allowedResponseExtensions_;
    private byte memoizedIsInitialized;
    private LazyStringArrayList provided_;
    private LazyStringArrayList requested_;
    private volatile Object selector_;

    private ContextRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.selector_ = "";
        this.requested_ = LazyStringArrayList.emptyList();
        this.provided_ = LazyStringArrayList.emptyList();
        this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
        this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private ContextRule() {
        this.selector_ = "";
        this.requested_ = LazyStringArrayList.emptyList();
        this.provided_ = LazyStringArrayList.emptyList();
        this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
        this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.selector_ = "";
        this.requested_ = LazyStringArrayList.emptyList();
        this.provided_ = LazyStringArrayList.emptyList();
        this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
        this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ContextRule();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextRule.class, Builder.class);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getSelector() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.selector_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getSelectorBytes() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.selector_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getRequestedList() {
        return this.requested_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getRequested(int i) {
        return this.requested_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getRequestedBytes(int i) {
        return this.requested_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getProvidedList() {
        return this.provided_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getProvided(int i) {
        return this.provided_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getProvidedBytes(int i) {
        return this.provided_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedRequestExtensions(int i) {
        return this.allowedRequestExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedRequestExtensionsBytes(int i) {
        return this.allowedRequestExtensions_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedResponseExtensions(int i) {
        return this.allowedResponseExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedResponseExtensionsBytes(int i) {
        return this.allowedResponseExtensions_.getByteString(i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
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
        if (!GeneratedMessageV3.isStringEmpty(this.selector_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.selector_);
        }
        for (int i = 0; i < this.requested_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.requested_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.provided_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.provided_.getRaw(i2));
        }
        for (int i3 = 0; i3 < this.allowedRequestExtensions_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.allowedRequestExtensions_.getRaw(i3));
        }
        for (int i4 = 0; i4 < this.allowedResponseExtensions_.size(); i4++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.allowedResponseExtensions_.getRaw(i4));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.selector_) ? GeneratedMessageV3.computeStringSize(1, this.selector_) : 0;
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.requested_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.requested_.getRaw(i2));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getRequestedList().size();
        int iComputeStringSizeNoTag2 = 0;
        for (int i3 = 0; i3 < this.provided_.size(); i3++) {
            iComputeStringSizeNoTag2 += computeStringSizeNoTag(this.provided_.getRaw(i3));
        }
        int size2 = size + iComputeStringSizeNoTag2 + getProvidedList().size();
        int iComputeStringSizeNoTag3 = 0;
        for (int i4 = 0; i4 < this.allowedRequestExtensions_.size(); i4++) {
            iComputeStringSizeNoTag3 += computeStringSizeNoTag(this.allowedRequestExtensions_.getRaw(i4));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + getAllowedRequestExtensionsList().size();
        int iComputeStringSizeNoTag4 = 0;
        for (int i5 = 0; i5 < this.allowedResponseExtensions_.size(); i5++) {
            iComputeStringSizeNoTag4 += computeStringSizeNoTag(this.allowedResponseExtensions_.getRaw(i5));
        }
        int size4 = size3 + iComputeStringSizeNoTag4 + getAllowedResponseExtensionsList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size4;
        return size4;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextRule)) {
            return super.equals(obj);
        }
        ContextRule contextRule = (ContextRule) obj;
        return getSelector().equals(contextRule.getSelector()) && getRequestedList().equals(contextRule.getRequestedList()) && getProvidedList().equals(contextRule.getProvidedList()) && getAllowedRequestExtensionsList().equals(contextRule.getAllowedRequestExtensionsList()) && getAllowedResponseExtensionsList().equals(contextRule.getAllowedResponseExtensionsList()) && getUnknownFields().equals(contextRule.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSelector().hashCode();
        if (getRequestedCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getRequestedList().hashCode();
        }
        if (getProvidedCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getProvidedList().hashCode();
        }
        if (getAllowedRequestExtensionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getAllowedRequestExtensionsList().hashCode();
        }
        if (getAllowedResponseExtensionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getAllowedResponseExtensionsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(contextRule);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContextRuleOrBuilder {
        private LazyStringArrayList allowedRequestExtensions_;
        private LazyStringArrayList allowedResponseExtensions_;
        private int bitField0_;
        private LazyStringArrayList provided_;
        private LazyStringArrayList requested_;
        private Object selector_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ContextProto.internal_static_google_api_ContextRule_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextRule.class, Builder.class);
        }

        private Builder() {
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.emptyList();
            this.provided_ = LazyStringArrayList.emptyList();
            this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
            this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.emptyList();
            this.provided_ = LazyStringArrayList.emptyList();
            this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
            this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.emptyList();
            this.provided_ = LazyStringArrayList.emptyList();
            this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
            this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ContextProto.internal_static_google_api_ContextRule_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ContextRule getDefaultInstanceForType() {
            return ContextRule.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ContextRule build() {
            ContextRule contextRuleBuildPartial = buildPartial();
            if (contextRuleBuildPartial.isInitialized()) {
                return contextRuleBuildPartial;
            }
            throw newUninitializedMessageException((Message) contextRuleBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ContextRule buildPartial() {
            ContextRule contextRule = new ContextRule(this);
            if (this.bitField0_ != 0) {
                buildPartial0(contextRule);
            }
            onBuilt();
            return contextRule;
        }

        private void buildPartial0(ContextRule contextRule) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                contextRule.selector_ = this.selector_;
            }
            if ((i & 2) != 0) {
                this.requested_.makeImmutable();
                contextRule.requested_ = this.requested_;
            }
            if ((i & 4) != 0) {
                this.provided_.makeImmutable();
                contextRule.provided_ = this.provided_;
            }
            if ((i & 8) != 0) {
                this.allowedRequestExtensions_.makeImmutable();
                contextRule.allowedRequestExtensions_ = this.allowedRequestExtensions_;
            }
            if ((i & 16) != 0) {
                this.allowedResponseExtensions_.makeImmutable();
                contextRule.allowedResponseExtensions_ = this.allowedResponseExtensions_;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo170clone() {
            return (Builder) super.mo170clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ContextRule) {
                return mergeFrom((ContextRule) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ContextRule contextRule) {
            if (contextRule == ContextRule.getDefaultInstance()) {
                return this;
            }
            if (!contextRule.getSelector().isEmpty()) {
                this.selector_ = contextRule.selector_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!contextRule.requested_.isEmpty()) {
                if (this.requested_.isEmpty()) {
                    this.requested_ = contextRule.requested_;
                    this.bitField0_ |= 2;
                } else {
                    ensureRequestedIsMutable();
                    this.requested_.addAll(contextRule.requested_);
                }
                onChanged();
            }
            if (!contextRule.provided_.isEmpty()) {
                if (this.provided_.isEmpty()) {
                    this.provided_ = contextRule.provided_;
                    this.bitField0_ |= 4;
                } else {
                    ensureProvidedIsMutable();
                    this.provided_.addAll(contextRule.provided_);
                }
                onChanged();
            }
            if (!contextRule.allowedRequestExtensions_.isEmpty()) {
                if (this.allowedRequestExtensions_.isEmpty()) {
                    this.allowedRequestExtensions_ = contextRule.allowedRequestExtensions_;
                    this.bitField0_ |= 8;
                } else {
                    ensureAllowedRequestExtensionsIsMutable();
                    this.allowedRequestExtensions_.addAll(contextRule.allowedRequestExtensions_);
                }
                onChanged();
            }
            if (!contextRule.allowedResponseExtensions_.isEmpty()) {
                if (this.allowedResponseExtensions_.isEmpty()) {
                    this.allowedResponseExtensions_ = contextRule.allowedResponseExtensions_;
                    this.bitField0_ |= 16;
                } else {
                    ensureAllowedResponseExtensionsIsMutable();
                    this.allowedResponseExtensions_.addAll(contextRule.allowedResponseExtensions_);
                }
                onChanged();
            }
            mergeUnknownFields(contextRule.getUnknownFields());
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
                                this.selector_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureRequestedIsMutable();
                                this.requested_.add((Object) stringRequireUtf8);
                            } else if (tag == 26) {
                                String stringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                ensureProvidedIsMutable();
                                this.provided_.add((Object) stringRequireUtf82);
                            } else if (tag == 34) {
                                String stringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                                ensureAllowedRequestExtensionsIsMutable();
                                this.allowedRequestExtensions_.add((Object) stringRequireUtf83);
                            } else if (tag == 42) {
                                String stringRequireUtf84 = codedInputStream.readStringRequireUtf8();
                                ensureAllowedResponseExtensionsIsMutable();
                                this.allowedResponseExtensions_.add((Object) stringRequireUtf84);
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

        @Override // com.google.api.ContextRuleOrBuilder
        public String getSelector() {
            Object obj = this.selector_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.selector_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getSelectorBytes() {
            Object obj = this.selector_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.selector_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSelector(String str) {
            str.getClass();
            this.selector_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearSelector() {
            this.selector_ = ContextRule.getDefaultInstance().getSelector();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            this.selector_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureRequestedIsMutable() {
            if (!this.requested_.isModifiable()) {
                this.requested_ = new LazyStringArrayList((LazyStringList) this.requested_);
            }
            this.bitField0_ |= 2;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getRequestedList() {
            this.requested_.makeImmutable();
            return this.requested_;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getRequestedCount() {
            return this.requested_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getRequested(int i) {
            return this.requested_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getRequestedBytes(int i) {
            return this.requested_.getByteString(i);
        }

        public Builder setRequested(int i, String str) {
            str.getClass();
            ensureRequestedIsMutable();
            this.requested_.set(i, str);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder addRequested(String str) {
            str.getClass();
            ensureRequestedIsMutable();
            this.requested_.add((Object) str);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder addAllRequested(Iterable<String> iterable) {
            ensureRequestedIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requested_);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearRequested() {
            this.requested_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addRequestedBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureRequestedIsMutable();
            this.requested_.add(byteString);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensureProvidedIsMutable() {
            if (!this.provided_.isModifiable()) {
                this.provided_ = new LazyStringArrayList((LazyStringList) this.provided_);
            }
            this.bitField0_ |= 4;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getProvidedList() {
            this.provided_.makeImmutable();
            return this.provided_;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getProvidedCount() {
            return this.provided_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getProvided(int i) {
            return this.provided_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getProvidedBytes(int i) {
            return this.provided_.getByteString(i);
        }

        public Builder setProvided(int i, String str) {
            str.getClass();
            ensureProvidedIsMutable();
            this.provided_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addProvided(String str) {
            str.getClass();
            ensureProvidedIsMutable();
            this.provided_.add((Object) str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addAllProvided(Iterable<String> iterable) {
            ensureProvidedIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.provided_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearProvided() {
            this.provided_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addProvidedBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureProvidedIsMutable();
            this.provided_.add(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        private void ensureAllowedRequestExtensionsIsMutable() {
            if (!this.allowedRequestExtensions_.isModifiable()) {
                this.allowedRequestExtensions_ = new LazyStringArrayList((LazyStringList) this.allowedRequestExtensions_);
            }
            this.bitField0_ |= 8;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getAllowedRequestExtensionsList() {
            this.allowedRequestExtensions_.makeImmutable();
            return this.allowedRequestExtensions_;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedRequestExtensionsCount() {
            return this.allowedRequestExtensions_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedRequestExtensions(int i) {
            return this.allowedRequestExtensions_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedRequestExtensionsBytes(int i) {
            return this.allowedRequestExtensions_.getByteString(i);
        }

        public Builder setAllowedRequestExtensions(int i, String str) {
            str.getClass();
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.set(i, str);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder addAllowedRequestExtensions(String str) {
            str.getClass();
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.add((Object) str);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
            ensureAllowedRequestExtensionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearAllowedRequestExtensions() {
            this.allowedRequestExtensions_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.add(byteString);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        private void ensureAllowedResponseExtensionsIsMutable() {
            if (!this.allowedResponseExtensions_.isModifiable()) {
                this.allowedResponseExtensions_ = new LazyStringArrayList((LazyStringList) this.allowedResponseExtensions_);
            }
            this.bitField0_ |= 16;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getAllowedResponseExtensionsList() {
            this.allowedResponseExtensions_.makeImmutable();
            return this.allowedResponseExtensions_;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedResponseExtensionsCount() {
            return this.allowedResponseExtensions_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedResponseExtensions(int i) {
            return this.allowedResponseExtensions_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedResponseExtensionsBytes(int i) {
            return this.allowedResponseExtensions_.getByteString(i);
        }

        public Builder setAllowedResponseExtensions(int i, String str) {
            str.getClass();
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addAllowedResponseExtensions(String str) {
            str.getClass();
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.add((Object) str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
            ensureAllowedResponseExtensionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearAllowedResponseExtensions() {
            this.allowedResponseExtensions_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.add(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ContextRule> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ContextRule> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ContextRule getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
