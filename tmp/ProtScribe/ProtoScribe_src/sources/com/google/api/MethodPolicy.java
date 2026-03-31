package com.google.api;

import com.google.api.FieldPolicy;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MethodPolicy extends GeneratedMessageV3 implements MethodPolicyOrBuilder {
    private static final MethodPolicy DEFAULT_INSTANCE = new MethodPolicy();
    private static final Parser<MethodPolicy> PARSER = new AbstractParser<MethodPolicy>() { // from class: com.google.api.MethodPolicy.1
        @Override // com.google.protobuf.Parser
        public MethodPolicy parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = MethodPolicy.newBuilder();
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
    public static final int REQUEST_POLICIES_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 9;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<FieldPolicy> requestPolicies_;
    private volatile Object selector_;

    private MethodPolicy(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.selector_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private MethodPolicy() {
        this.selector_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.selector_ = "";
        this.requestPolicies_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MethodPolicy();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return PolicyProto.internal_static_google_api_MethodPolicy_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return PolicyProto.internal_static_google_api_MethodPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodPolicy.class, Builder.class);
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public String getSelector() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.selector_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public ByteString getSelectorBytes() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.selector_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public List<FieldPolicy> getRequestPoliciesList() {
        return this.requestPolicies_;
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public List<? extends FieldPolicyOrBuilder> getRequestPoliciesOrBuilderList() {
        return this.requestPolicies_;
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public int getRequestPoliciesCount() {
        return this.requestPolicies_.size();
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public FieldPolicy getRequestPolicies(int i) {
        return this.requestPolicies_.get(i);
    }

    @Override // com.google.api.MethodPolicyOrBuilder
    public FieldPolicyOrBuilder getRequestPoliciesOrBuilder(int i) {
        return this.requestPolicies_.get(i);
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
        for (int i = 0; i < this.requestPolicies_.size(); i++) {
            codedOutputStream.writeMessage(2, this.requestPolicies_.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.selector_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.selector_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = 0;
        for (int i2 = 0; i2 < this.requestPolicies_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.requestPolicies_.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.selector_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.selector_);
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
        if (!(obj instanceof MethodPolicy)) {
            return super.equals(obj);
        }
        MethodPolicy methodPolicy = (MethodPolicy) obj;
        return getSelector().equals(methodPolicy.getSelector()) && getRequestPoliciesList().equals(methodPolicy.getRequestPoliciesList()) && getUnknownFields().equals(methodPolicy.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 9) * 53) + getSelector().hashCode();
        if (getRequestPoliciesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getRequestPoliciesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static MethodPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static MethodPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MethodPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static MethodPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MethodPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static MethodPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MethodPolicy parseFrom(InputStream inputStream) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MethodPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MethodPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MethodPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MethodPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MethodPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodPolicy) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MethodPolicy methodPolicy) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(methodPolicy);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MethodPolicyOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> requestPoliciesBuilder_;
        private List<FieldPolicy> requestPolicies_;
        private Object selector_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PolicyProto.internal_static_google_api_MethodPolicy_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PolicyProto.internal_static_google_api_MethodPolicy_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodPolicy.class, Builder.class);
        }

        private Builder() {
            this.selector_ = "";
            this.requestPolicies_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.selector_ = "";
            this.requestPolicies_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.selector_ = "";
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.requestPolicies_ = Collections.emptyList();
            } else {
                this.requestPolicies_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return PolicyProto.internal_static_google_api_MethodPolicy_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MethodPolicy getDefaultInstanceForType() {
            return MethodPolicy.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MethodPolicy build() {
            MethodPolicy methodPolicyBuildPartial = buildPartial();
            if (methodPolicyBuildPartial.isInitialized()) {
                return methodPolicyBuildPartial;
            }
            throw newUninitializedMessageException((Message) methodPolicyBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MethodPolicy buildPartial() {
            MethodPolicy methodPolicy = new MethodPolicy(this);
            buildPartialRepeatedFields(methodPolicy);
            if (this.bitField0_ != 0) {
                buildPartial0(methodPolicy);
            }
            onBuilt();
            return methodPolicy;
        }

        private void buildPartialRepeatedFields(MethodPolicy methodPolicy) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                methodPolicy.requestPolicies_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.requestPolicies_ = Collections.unmodifiableList(this.requestPolicies_);
                this.bitField0_ &= -3;
            }
            methodPolicy.requestPolicies_ = this.requestPolicies_;
        }

        private void buildPartial0(MethodPolicy methodPolicy) {
            if ((this.bitField0_ & 1) != 0) {
                methodPolicy.selector_ = this.selector_;
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
            if (message instanceof MethodPolicy) {
                return mergeFrom((MethodPolicy) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MethodPolicy methodPolicy) {
            if (methodPolicy == MethodPolicy.getDefaultInstance()) {
                return this;
            }
            if (!methodPolicy.getSelector().isEmpty()) {
                this.selector_ = methodPolicy.selector_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.requestPoliciesBuilder_ == null) {
                if (!methodPolicy.requestPolicies_.isEmpty()) {
                    if (this.requestPolicies_.isEmpty()) {
                        this.requestPolicies_ = methodPolicy.requestPolicies_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureRequestPoliciesIsMutable();
                        this.requestPolicies_.addAll(methodPolicy.requestPolicies_);
                    }
                    onChanged();
                }
            } else if (!methodPolicy.requestPolicies_.isEmpty()) {
                if (!this.requestPoliciesBuilder_.isEmpty()) {
                    this.requestPoliciesBuilder_.addAllMessages(methodPolicy.requestPolicies_);
                } else {
                    this.requestPoliciesBuilder_.dispose();
                    this.requestPoliciesBuilder_ = null;
                    this.requestPolicies_ = methodPolicy.requestPolicies_;
                    this.bitField0_ &= -3;
                    this.requestPoliciesBuilder_ = MethodPolicy.alwaysUseFieldBuilders ? getRequestPoliciesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(methodPolicy.getUnknownFields());
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
                            if (tag == 18) {
                                FieldPolicy fieldPolicy = (FieldPolicy) codedInputStream.readMessage(FieldPolicy.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureRequestPoliciesIsMutable();
                                    this.requestPolicies_.add(fieldPolicy);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(fieldPolicy);
                                }
                            } else if (tag == 74) {
                                this.selector_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
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

        @Override // com.google.api.MethodPolicyOrBuilder
        public String getSelector() {
            Object obj = this.selector_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.selector_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MethodPolicyOrBuilder
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
            this.selector_ = MethodPolicy.getDefaultInstance().getSelector();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            byteString.getClass();
            MethodPolicy.checkByteStringIsUtf8(byteString);
            this.selector_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureRequestPoliciesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.requestPolicies_ = new ArrayList(this.requestPolicies_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.MethodPolicyOrBuilder
        public List<FieldPolicy> getRequestPoliciesList() {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.requestPolicies_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.MethodPolicyOrBuilder
        public int getRequestPoliciesCount() {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requestPolicies_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.MethodPolicyOrBuilder
        public FieldPolicy getRequestPolicies(int i) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requestPolicies_.get(i);
            }
            return (FieldPolicy) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setRequestPolicies(int i, FieldPolicy fieldPolicy) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                fieldPolicy.getClass();
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.set(i, fieldPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, fieldPolicy);
            }
            return this;
        }

        public Builder setRequestPolicies(int i, FieldPolicy.Builder builder) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addRequestPolicies(FieldPolicy fieldPolicy) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                fieldPolicy.getClass();
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.add(fieldPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(fieldPolicy);
            }
            return this;
        }

        public Builder addRequestPolicies(int i, FieldPolicy fieldPolicy) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                fieldPolicy.getClass();
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.add(i, fieldPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, fieldPolicy);
            }
            return this;
        }

        public Builder addRequestPolicies(FieldPolicy.Builder builder) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addRequestPolicies(int i, FieldPolicy.Builder builder) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllRequestPolicies(Iterable<? extends FieldPolicy> iterable) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequestPoliciesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requestPolicies_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearRequestPolicies() {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.requestPolicies_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeRequestPolicies(int i) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRequestPoliciesIsMutable();
                this.requestPolicies_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public FieldPolicy.Builder getRequestPoliciesBuilder(int i) {
            return (FieldPolicy.Builder) getRequestPoliciesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.MethodPolicyOrBuilder
        public FieldPolicyOrBuilder getRequestPoliciesOrBuilder(int i) {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.requestPolicies_.get(i);
            }
            return (FieldPolicyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.MethodPolicyOrBuilder
        public List<? extends FieldPolicyOrBuilder> getRequestPoliciesOrBuilderList() {
            RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> repeatedFieldBuilderV3 = this.requestPoliciesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.requestPolicies_);
        }

        public FieldPolicy.Builder addRequestPoliciesBuilder() {
            return (FieldPolicy.Builder) getRequestPoliciesFieldBuilder().addBuilder(FieldPolicy.getDefaultInstance());
        }

        public FieldPolicy.Builder addRequestPoliciesBuilder(int i) {
            return (FieldPolicy.Builder) getRequestPoliciesFieldBuilder().addBuilder(i, FieldPolicy.getDefaultInstance());
        }

        public List<FieldPolicy.Builder> getRequestPoliciesBuilderList() {
            return getRequestPoliciesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<FieldPolicy, FieldPolicy.Builder, FieldPolicyOrBuilder> getRequestPoliciesFieldBuilder() {
            if (this.requestPoliciesBuilder_ == null) {
                this.requestPoliciesBuilder_ = new RepeatedFieldBuilderV3<>(this.requestPolicies_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.requestPolicies_ = null;
            }
            return this.requestPoliciesBuilder_;
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

    public static MethodPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MethodPolicy> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MethodPolicy> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MethodPolicy getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
