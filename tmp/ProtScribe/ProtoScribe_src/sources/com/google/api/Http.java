package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
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
public final class Http extends GeneratedMessageV3 implements HttpOrBuilder {
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    public static final int RULES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private boolean fullyDecodeReservedExpansion_;
    private byte memoizedIsInitialized;
    private List<HttpRule> rules_;
    private static final Http DEFAULT_INSTANCE = new Http();
    private static final Parser<Http> PARSER = new AbstractParser<Http>() { // from class: com.google.api.Http.1
        @Override // com.google.protobuf.Parser
        public Http parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Http.newBuilder();
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

    private Http(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.fullyDecodeReservedExpansion_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Http() {
        this.fullyDecodeReservedExpansion_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.rules_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Http();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HttpProto.internal_static_google_api_Http_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return HttpProto.internal_static_google_api_Http_fieldAccessorTable.ensureFieldAccessorsInitialized(Http.class, Builder.class);
    }

    @Override // com.google.api.HttpOrBuilder
    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    @Override // com.google.api.HttpOrBuilder
    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.google.api.HttpOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.HttpOrBuilder
    public HttpRule getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // com.google.api.HttpOrBuilder
    public HttpRuleOrBuilder getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    @Override // com.google.api.HttpOrBuilder
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
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
        for (int i = 0; i < this.rules_.size(); i++) {
            codedOutputStream.writeMessage(1, this.rules_.get(i));
        }
        boolean z = this.fullyDecodeReservedExpansion_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeBoolSize = 0;
        for (int i2 = 0; i2 < this.rules_.size(); i2++) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(1, this.rules_.get(i2));
        }
        boolean z = this.fullyDecodeReservedExpansion_;
        if (z) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z);
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
        if (!(obj instanceof Http)) {
            return super.equals(obj);
        }
        Http http = (Http) obj;
        return getRulesList().equals(http.getRulesList()) && getFullyDecodeReservedExpansion() == http.getFullyDecodeReservedExpansion() && getUnknownFields().equals(http.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getRulesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getRulesList().hashCode();
        }
        int iHashBoolean = (((((iHashCode * 37) + 2) * 53) + Internal.hashBoolean(getFullyDecodeReservedExpansion())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashBoolean;
        return iHashBoolean;
    }

    public static Http parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Http parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Http parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Http parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
        return (Http) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Http) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Http parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Http) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Http http) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(http);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HttpOrBuilder {
        private int bitField0_;
        private boolean fullyDecodeReservedExpansion_;
        private RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> rulesBuilder_;
        private List<HttpRule> rules_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HttpProto.internal_static_google_api_Http_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HttpProto.internal_static_google_api_Http_fieldAccessorTable.ensureFieldAccessorsInitialized(Http.class, Builder.class);
        }

        private Builder() {
            this.rules_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.rules_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
            } else {
                this.rules_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            this.fullyDecodeReservedExpansion_ = false;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HttpProto.internal_static_google_api_Http_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Http getDefaultInstanceForType() {
            return Http.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Http build() {
            Http httpBuildPartial = buildPartial();
            if (httpBuildPartial.isInitialized()) {
                return httpBuildPartial;
            }
            throw newUninitializedMessageException((Message) httpBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Http buildPartial() {
            Http http = new Http(this);
            buildPartialRepeatedFields(http);
            if (this.bitField0_ != 0) {
                buildPartial0(http);
            }
            onBuilt();
            return http;
        }

        private void buildPartialRepeatedFields(Http http) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                http.rules_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.rules_ = Collections.unmodifiableList(this.rules_);
                this.bitField0_ &= -2;
            }
            http.rules_ = this.rules_;
        }

        private void buildPartial0(Http http) {
            if ((this.bitField0_ & 2) != 0) {
                http.fullyDecodeReservedExpansion_ = this.fullyDecodeReservedExpansion_;
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
            if (message instanceof Http) {
                return mergeFrom((Http) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Http http) {
            if (http == Http.getDefaultInstance()) {
                return this;
            }
            if (this.rulesBuilder_ == null) {
                if (!http.rules_.isEmpty()) {
                    if (this.rules_.isEmpty()) {
                        this.rules_ = http.rules_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRulesIsMutable();
                        this.rules_.addAll(http.rules_);
                    }
                    onChanged();
                }
            } else if (!http.rules_.isEmpty()) {
                if (!this.rulesBuilder_.isEmpty()) {
                    this.rulesBuilder_.addAllMessages(http.rules_);
                } else {
                    this.rulesBuilder_.dispose();
                    this.rulesBuilder_ = null;
                    this.rules_ = http.rules_;
                    this.bitField0_ &= -2;
                    this.rulesBuilder_ = Http.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                }
            }
            if (http.getFullyDecodeReservedExpansion()) {
                setFullyDecodeReservedExpansion(http.getFullyDecodeReservedExpansion());
            }
            mergeUnknownFields(http.getUnknownFields());
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
                                HttpRule httpRule = (HttpRule) codedInputStream.readMessage(HttpRule.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureRulesIsMutable();
                                    this.rules_.add(httpRule);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(httpRule);
                                }
                            } else if (tag == 16) {
                                this.fullyDecodeReservedExpansion_ = codedInputStream.readBool();
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

        private void ensureRulesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.rules_ = new ArrayList(this.rules_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.HttpOrBuilder
        public List<HttpRule> getRulesList() {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.rules_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.HttpOrBuilder
        public int getRulesCount() {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.HttpOrBuilder
        public HttpRule getRules(int i) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return (HttpRule) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setRules(int i, HttpRule httpRule) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                httpRule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i, httpRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, httpRule);
            }
            return this;
        }

        public Builder setRules(int i, HttpRule.Builder builder) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addRules(HttpRule httpRule) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                httpRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(httpRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(httpRule);
            }
            return this;
        }

        public Builder addRules(int i, HttpRule httpRule) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                httpRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(i, httpRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, httpRule);
            }
            return this;
        }

        public Builder addRules(HttpRule.Builder builder) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addRules(int i, HttpRule.Builder builder) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearRules() {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeRules(int i) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public HttpRule.Builder getRulesBuilder(int i) {
            return (HttpRule.Builder) getRulesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.HttpOrBuilder
        public HttpRuleOrBuilder getRulesOrBuilder(int i) {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return (HttpRuleOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.HttpOrBuilder
        public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
            RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.rules_);
        }

        public HttpRule.Builder addRulesBuilder() {
            return (HttpRule.Builder) getRulesFieldBuilder().addBuilder(HttpRule.getDefaultInstance());
        }

        public HttpRule.Builder addRulesBuilder(int i) {
            return (HttpRule.Builder) getRulesFieldBuilder().addBuilder(i, HttpRule.getDefaultInstance());
        }

        public List<HttpRule.Builder> getRulesBuilderList() {
            return getRulesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<HttpRule, HttpRule.Builder, HttpRuleOrBuilder> getRulesFieldBuilder() {
            if (this.rulesBuilder_ == null) {
                this.rulesBuilder_ = new RepeatedFieldBuilderV3<>(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.rules_ = null;
            }
            return this.rulesBuilder_;
        }

        @Override // com.google.api.HttpOrBuilder
        public boolean getFullyDecodeReservedExpansion() {
            return this.fullyDecodeReservedExpansion_;
        }

        public Builder setFullyDecodeReservedExpansion(boolean z) {
            this.fullyDecodeReservedExpansion_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearFullyDecodeReservedExpansion() {
            this.bitField0_ &= -3;
            this.fullyDecodeReservedExpansion_ = false;
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

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Http> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Http> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Http getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
