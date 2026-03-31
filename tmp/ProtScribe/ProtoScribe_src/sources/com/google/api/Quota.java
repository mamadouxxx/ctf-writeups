package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
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
public final class Quota extends GeneratedMessageV3 implements QuotaOrBuilder {
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private List<QuotaLimit> limits_;
    private byte memoizedIsInitialized;
    private List<MetricRule> metricRules_;
    private static final Quota DEFAULT_INSTANCE = new Quota();
    private static final Parser<Quota> PARSER = new AbstractParser<Quota>() { // from class: com.google.api.Quota.1
        @Override // com.google.protobuf.Parser
        public Quota parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Quota.newBuilder();
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

    private Quota(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Quota() {
        this.memoizedIsInitialized = (byte) -1;
        this.limits_ = Collections.emptyList();
        this.metricRules_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Quota();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return QuotaProto.internal_static_google_api_Quota_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return QuotaProto.internal_static_google_api_Quota_fieldAccessorTable.ensureFieldAccessorsInitialized(Quota.class, Builder.class);
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimit getLimits(int i) {
        return this.limits_.get(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public QuotaLimitOrBuilder getLimitsOrBuilder(int i) {
        return this.limits_.get(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    @Override // com.google.api.QuotaOrBuilder
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRule getMetricRules(int i) {
        return this.metricRules_.get(i);
    }

    @Override // com.google.api.QuotaOrBuilder
    public MetricRuleOrBuilder getMetricRulesOrBuilder(int i) {
        return this.metricRules_.get(i);
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
        for (int i = 0; i < this.limits_.size(); i++) {
            codedOutputStream.writeMessage(3, this.limits_.get(i));
        }
        for (int i2 = 0; i2 < this.metricRules_.size(); i2++) {
            codedOutputStream.writeMessage(4, this.metricRules_.get(i2));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.limits_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.limits_.get(i2));
        }
        for (int i3 = 0; i3 < this.metricRules_.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.metricRules_.get(i3));
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quota)) {
            return super.equals(obj);
        }
        Quota quota = (Quota) obj;
        return getLimitsList().equals(quota.getLimitsList()) && getMetricRulesList().equals(quota.getMetricRulesList()) && getUnknownFields().equals(quota.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getLimitsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getLimitsList().hashCode();
        }
        if (getMetricRulesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getMetricRulesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Quota parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quota) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Quota quota) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(quota);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuotaOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> limitsBuilder_;
        private List<QuotaLimit> limits_;
        private RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> metricRulesBuilder_;
        private List<MetricRule> metricRules_;

        private void buildPartial0(Quota quota) {
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return QuotaProto.internal_static_google_api_Quota_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return QuotaProto.internal_static_google_api_Quota_fieldAccessorTable.ensureFieldAccessorsInitialized(Quota.class, Builder.class);
        }

        private Builder() {
            this.limits_ = Collections.emptyList();
            this.metricRules_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.limits_ = Collections.emptyList();
            this.metricRules_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.limits_ = Collections.emptyList();
            } else {
                this.limits_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV32 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.metricRules_ = Collections.emptyList();
            } else {
                this.metricRules_ = null;
                repeatedFieldBuilderV32.clear();
            }
            this.bitField0_ &= -3;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return QuotaProto.internal_static_google_api_Quota_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Quota getDefaultInstanceForType() {
            return Quota.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Quota build() {
            Quota quotaBuildPartial = buildPartial();
            if (quotaBuildPartial.isInitialized()) {
                return quotaBuildPartial;
            }
            throw newUninitializedMessageException((Message) quotaBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Quota buildPartial() {
            Quota quota = new Quota(this);
            buildPartialRepeatedFields(quota);
            if (this.bitField0_ != 0) {
                buildPartial0(quota);
            }
            onBuilt();
            return quota;
        }

        private void buildPartialRepeatedFields(Quota quota) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                quota.limits_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.limits_ = Collections.unmodifiableList(this.limits_);
                    this.bitField0_ &= -2;
                }
                quota.limits_ = this.limits_;
            }
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV32 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                quota.metricRules_ = repeatedFieldBuilderV32.build();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.metricRules_ = Collections.unmodifiableList(this.metricRules_);
                this.bitField0_ &= -3;
            }
            quota.metricRules_ = this.metricRules_;
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
            if (message instanceof Quota) {
                return mergeFrom((Quota) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Quota quota) {
            if (quota == Quota.getDefaultInstance()) {
                return this;
            }
            if (this.limitsBuilder_ == null) {
                if (!quota.limits_.isEmpty()) {
                    if (this.limits_.isEmpty()) {
                        this.limits_ = quota.limits_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureLimitsIsMutable();
                        this.limits_.addAll(quota.limits_);
                    }
                    onChanged();
                }
            } else if (!quota.limits_.isEmpty()) {
                if (!this.limitsBuilder_.isEmpty()) {
                    this.limitsBuilder_.addAllMessages(quota.limits_);
                } else {
                    this.limitsBuilder_.dispose();
                    this.limitsBuilder_ = null;
                    this.limits_ = quota.limits_;
                    this.bitField0_ &= -2;
                    this.limitsBuilder_ = Quota.alwaysUseFieldBuilders ? getLimitsFieldBuilder() : null;
                }
            }
            if (this.metricRulesBuilder_ == null) {
                if (!quota.metricRules_.isEmpty()) {
                    if (this.metricRules_.isEmpty()) {
                        this.metricRules_ = quota.metricRules_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMetricRulesIsMutable();
                        this.metricRules_.addAll(quota.metricRules_);
                    }
                    onChanged();
                }
            } else if (!quota.metricRules_.isEmpty()) {
                if (!this.metricRulesBuilder_.isEmpty()) {
                    this.metricRulesBuilder_.addAllMessages(quota.metricRules_);
                } else {
                    this.metricRulesBuilder_.dispose();
                    this.metricRulesBuilder_ = null;
                    this.metricRules_ = quota.metricRules_;
                    this.bitField0_ &= -3;
                    this.metricRulesBuilder_ = Quota.alwaysUseFieldBuilders ? getMetricRulesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(quota.getUnknownFields());
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
                            if (tag == 26) {
                                QuotaLimit quotaLimit = (QuotaLimit) codedInputStream.readMessage(QuotaLimit.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureLimitsIsMutable();
                                    this.limits_.add(quotaLimit);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(quotaLimit);
                                }
                            } else if (tag == 34) {
                                MetricRule metricRule = (MetricRule) codedInputStream.readMessage(MetricRule.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV32 = this.metricRulesBuilder_;
                                if (repeatedFieldBuilderV32 == null) {
                                    ensureMetricRulesIsMutable();
                                    this.metricRules_.add(metricRule);
                                } else {
                                    repeatedFieldBuilderV32.addMessage(metricRule);
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

        private void ensureLimitsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.limits_ = new ArrayList(this.limits_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<QuotaLimit> getLimitsList() {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.limits_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getLimitsCount() {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.limits_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimit getLimits(int i) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.limits_.get(i);
            }
            return (QuotaLimit) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setLimits(int i, QuotaLimit quotaLimit) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                quotaLimit.getClass();
                ensureLimitsIsMutable();
                this.limits_.set(i, quotaLimit);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, quotaLimit);
            }
            return this;
        }

        public Builder setLimits(int i, QuotaLimit.Builder builder) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLimitsIsMutable();
                this.limits_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                quotaLimit.getClass();
                ensureLimitsIsMutable();
                this.limits_.add(quotaLimit);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(quotaLimit);
            }
            return this;
        }

        public Builder addLimits(int i, QuotaLimit quotaLimit) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                quotaLimit.getClass();
                ensureLimitsIsMutable();
                this.limits_.add(i, quotaLimit);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, quotaLimit);
            }
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLimitsIsMutable();
                this.limits_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addLimits(int i, QuotaLimit.Builder builder) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLimitsIsMutable();
                this.limits_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLimitsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.limits_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearLimits() {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.limits_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeLimits(int i) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLimitsIsMutable();
                this.limits_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public QuotaLimit.Builder getLimitsBuilder(int i) {
            return (QuotaLimit.Builder) getLimitsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public QuotaLimitOrBuilder getLimitsOrBuilder(int i) {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.limits_.get(i);
            }
            return (QuotaLimitOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
            RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> repeatedFieldBuilderV3 = this.limitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.limits_);
        }

        public QuotaLimit.Builder addLimitsBuilder() {
            return (QuotaLimit.Builder) getLimitsFieldBuilder().addBuilder(QuotaLimit.getDefaultInstance());
        }

        public QuotaLimit.Builder addLimitsBuilder(int i) {
            return (QuotaLimit.Builder) getLimitsFieldBuilder().addBuilder(i, QuotaLimit.getDefaultInstance());
        }

        public List<QuotaLimit.Builder> getLimitsBuilderList() {
            return getLimitsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<QuotaLimit, QuotaLimit.Builder, QuotaLimitOrBuilder> getLimitsFieldBuilder() {
            if (this.limitsBuilder_ == null) {
                this.limitsBuilder_ = new RepeatedFieldBuilderV3<>(this.limits_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.limits_ = null;
            }
            return this.limitsBuilder_;
        }

        private void ensureMetricRulesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.metricRules_ = new ArrayList(this.metricRules_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<MetricRule> getMetricRulesList() {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metricRules_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.QuotaOrBuilder
        public int getMetricRulesCount() {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricRules_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRule getMetricRules(int i) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricRules_.get(i);
            }
            return (MetricRule) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMetricRules(int i, MetricRule metricRule) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRule.getClass();
                ensureMetricRulesIsMutable();
                this.metricRules_.set(i, metricRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, metricRule);
            }
            return this;
        }

        public Builder setMetricRules(int i, MetricRule.Builder builder) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricRulesIsMutable();
                this.metricRules_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRule.getClass();
                ensureMetricRulesIsMutable();
                this.metricRules_.add(metricRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(metricRule);
            }
            return this;
        }

        public Builder addMetricRules(int i, MetricRule metricRule) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricRule.getClass();
                ensureMetricRulesIsMutable();
                this.metricRules_.add(i, metricRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, metricRule);
            }
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricRulesIsMutable();
                this.metricRules_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetricRules(int i, MetricRule.Builder builder) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricRulesIsMutable();
                this.metricRules_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricRulesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metricRules_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMetricRules() {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metricRules_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMetricRules(int i) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricRulesIsMutable();
                this.metricRules_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MetricRule.Builder getMetricRulesBuilder(int i) {
            return (MetricRule.Builder) getMetricRulesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public MetricRuleOrBuilder getMetricRulesOrBuilder(int i) {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricRules_.get(i);
            }
            return (MetricRuleOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.QuotaOrBuilder
        public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
            RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> repeatedFieldBuilderV3 = this.metricRulesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metricRules_);
        }

        public MetricRule.Builder addMetricRulesBuilder() {
            return (MetricRule.Builder) getMetricRulesFieldBuilder().addBuilder(MetricRule.getDefaultInstance());
        }

        public MetricRule.Builder addMetricRulesBuilder(int i) {
            return (MetricRule.Builder) getMetricRulesFieldBuilder().addBuilder(i, MetricRule.getDefaultInstance());
        }

        public List<MetricRule.Builder> getMetricRulesBuilderList() {
            return getMetricRulesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MetricRule, MetricRule.Builder, MetricRuleOrBuilder> getMetricRulesFieldBuilder() {
            if (this.metricRulesBuilder_ == null) {
                this.metricRulesBuilder_ = new RepeatedFieldBuilderV3<>(this.metricRules_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.metricRules_ = null;
            }
            return this.metricRulesBuilder_;
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

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Quota> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Quota> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Quota getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
