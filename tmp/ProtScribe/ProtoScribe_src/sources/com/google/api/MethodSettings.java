package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MethodSettings extends GeneratedMessageV3 implements MethodSettingsOrBuilder {
    public static final int AUTO_POPULATED_FIELDS_FIELD_NUMBER = 3;
    public static final int LONG_RUNNING_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private LazyStringArrayList autoPopulatedFields_;
    private int bitField0_;
    private LongRunning longRunning_;
    private byte memoizedIsInitialized;
    private volatile Object selector_;
    private static final MethodSettings DEFAULT_INSTANCE = new MethodSettings();
    private static final Parser<MethodSettings> PARSER = new AbstractParser<MethodSettings>() { // from class: com.google.api.MethodSettings.1
        @Override // com.google.protobuf.Parser
        public MethodSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = MethodSettings.newBuilder();
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

    public interface LongRunningOrBuilder extends MessageOrBuilder {
        Duration getInitialPollDelay();

        DurationOrBuilder getInitialPollDelayOrBuilder();

        Duration getMaxPollDelay();

        DurationOrBuilder getMaxPollDelayOrBuilder();

        float getPollDelayMultiplier();

        Duration getTotalPollTimeout();

        DurationOrBuilder getTotalPollTimeoutOrBuilder();

        boolean hasInitialPollDelay();

        boolean hasMaxPollDelay();

        boolean hasTotalPollTimeout();
    }

    static /* synthetic */ int access$1676(MethodSettings methodSettings, int i) {
        int i2 = i | methodSettings.bitField0_;
        methodSettings.bitField0_ = i2;
        return i2;
    }

    private MethodSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.selector_ = "";
        this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private MethodSettings() {
        this.selector_ = "";
        this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.selector_ = "";
        this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MethodSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_MethodSettings_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_MethodSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodSettings.class, Builder.class);
    }

    public static final class LongRunning extends GeneratedMessageV3 implements LongRunningOrBuilder {
        public static final int INITIAL_POLL_DELAY_FIELD_NUMBER = 1;
        public static final int MAX_POLL_DELAY_FIELD_NUMBER = 3;
        public static final int POLL_DELAY_MULTIPLIER_FIELD_NUMBER = 2;
        public static final int TOTAL_POLL_TIMEOUT_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Duration initialPollDelay_;
        private Duration maxPollDelay_;
        private byte memoizedIsInitialized;
        private float pollDelayMultiplier_;
        private Duration totalPollTimeout_;
        private static final LongRunning DEFAULT_INSTANCE = new LongRunning();
        private static final Parser<LongRunning> PARSER = new AbstractParser<LongRunning>() { // from class: com.google.api.MethodSettings.LongRunning.1
            @Override // com.google.protobuf.Parser
            public LongRunning parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LongRunning.newBuilder();
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

        static /* synthetic */ int access$876(LongRunning longRunning, int i) {
            int i2 = i | longRunning.bitField0_;
            longRunning.bitField0_ = i2;
            return i2;
        }

        private LongRunning(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.pollDelayMultiplier_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        private LongRunning() {
            this.pollDelayMultiplier_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new LongRunning();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_MethodSettings_LongRunning_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable.ensureFieldAccessorsInitialized(LongRunning.class, Builder.class);
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public boolean hasInitialPollDelay() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public Duration getInitialPollDelay() {
            Duration duration = this.initialPollDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public DurationOrBuilder getInitialPollDelayOrBuilder() {
            Duration duration = this.initialPollDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public float getPollDelayMultiplier() {
            return this.pollDelayMultiplier_;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public boolean hasMaxPollDelay() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public Duration getMaxPollDelay() {
            Duration duration = this.maxPollDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public DurationOrBuilder getMaxPollDelayOrBuilder() {
            Duration duration = this.maxPollDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public boolean hasTotalPollTimeout() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public Duration getTotalPollTimeout() {
            Duration duration = this.totalPollTimeout_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MethodSettings.LongRunningOrBuilder
        public DurationOrBuilder getTotalPollTimeoutOrBuilder() {
            Duration duration = this.totalPollTimeout_;
            return duration == null ? Duration.getDefaultInstance() : duration;
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getInitialPollDelay());
            }
            if (Float.floatToRawIntBits(this.pollDelayMultiplier_) != 0) {
                codedOutputStream.writeFloat(2, this.pollDelayMultiplier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getMaxPollDelay());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(4, getTotalPollTimeout());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getInitialPollDelay()) : 0;
            if (Float.floatToRawIntBits(this.pollDelayMultiplier_) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFloatSize(2, this.pollDelayMultiplier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getMaxPollDelay());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getTotalPollTimeout());
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
            if (!(obj instanceof LongRunning)) {
                return super.equals(obj);
            }
            LongRunning longRunning = (LongRunning) obj;
            if (hasInitialPollDelay() != longRunning.hasInitialPollDelay()) {
                return false;
            }
            if ((hasInitialPollDelay() && !getInitialPollDelay().equals(longRunning.getInitialPollDelay())) || Float.floatToIntBits(getPollDelayMultiplier()) != Float.floatToIntBits(longRunning.getPollDelayMultiplier()) || hasMaxPollDelay() != longRunning.hasMaxPollDelay()) {
                return false;
            }
            if ((!hasMaxPollDelay() || getMaxPollDelay().equals(longRunning.getMaxPollDelay())) && hasTotalPollTimeout() == longRunning.hasTotalPollTimeout()) {
                return (!hasTotalPollTimeout() || getTotalPollTimeout().equals(longRunning.getTotalPollTimeout())) && getUnknownFields().equals(longRunning.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasInitialPollDelay()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInitialPollDelay().hashCode();
            }
            int iFloatToIntBits = (((iHashCode * 37) + 2) * 53) + Float.floatToIntBits(getPollDelayMultiplier());
            if (hasMaxPollDelay()) {
                iFloatToIntBits = (((iFloatToIntBits * 37) + 3) * 53) + getMaxPollDelay().hashCode();
            }
            if (hasTotalPollTimeout()) {
                iFloatToIntBits = (((iFloatToIntBits * 37) + 4) * 53) + getTotalPollTimeout().hashCode();
            }
            int iHashCode2 = (iFloatToIntBits * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static LongRunning parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static LongRunning parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static LongRunning parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static LongRunning parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LongRunning parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static LongRunning parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LongRunning parseFrom(InputStream inputStream) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LongRunning parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LongRunning parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LongRunning parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LongRunning parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LongRunning parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LongRunning) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(LongRunning longRunning) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(longRunning);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LongRunningOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> initialPollDelayBuilder_;
            private Duration initialPollDelay_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> maxPollDelayBuilder_;
            private Duration maxPollDelay_;
            private float pollDelayMultiplier_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> totalPollTimeoutBuilder_;
            private Duration totalPollTimeout_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ClientProto.internal_static_google_api_MethodSettings_LongRunning_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ClientProto.internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable.ensureFieldAccessorsInitialized(LongRunning.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (LongRunning.alwaysUseFieldBuilders) {
                    getInitialPollDelayFieldBuilder();
                    getMaxPollDelayFieldBuilder();
                    getTotalPollTimeoutFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.initialPollDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialPollDelayBuilder_ = null;
                }
                this.pollDelayMultiplier_ = 0.0f;
                this.maxPollDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.maxPollDelayBuilder_ = null;
                }
                this.totalPollTimeout_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV33 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.totalPollTimeoutBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ClientProto.internal_static_google_api_MethodSettings_LongRunning_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LongRunning getDefaultInstanceForType() {
                return LongRunning.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LongRunning build() {
                LongRunning longRunningBuildPartial = buildPartial();
                if (longRunningBuildPartial.isInitialized()) {
                    return longRunningBuildPartial;
                }
                throw newUninitializedMessageException((Message) longRunningBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LongRunning buildPartial() {
                LongRunning longRunning = new LongRunning(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(longRunning);
                }
                onBuilt();
                return longRunning;
            }

            private void buildPartial0(LongRunning longRunning) {
                int i;
                Duration duration;
                Duration duration2;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        duration2 = this.initialPollDelay_;
                    } else {
                        duration2 = (Duration) singleFieldBuilderV3.build();
                    }
                    longRunning.initialPollDelay_ = duration2;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    longRunning.pollDelayMultiplier_ = this.pollDelayMultiplier_;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.maxPollDelayBuilder_;
                    longRunning.maxPollDelay_ = singleFieldBuilderV32 == null ? this.maxPollDelay_ : (Duration) singleFieldBuilderV32.build();
                    i |= 2;
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV33 = this.totalPollTimeoutBuilder_;
                    if (singleFieldBuilderV33 == null) {
                        duration = this.totalPollTimeout_;
                    } else {
                        duration = (Duration) singleFieldBuilderV33.build();
                    }
                    longRunning.totalPollTimeout_ = duration;
                    i |= 4;
                }
                LongRunning.access$876(longRunning, i);
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
                if (message instanceof LongRunning) {
                    return mergeFrom((LongRunning) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LongRunning longRunning) {
                if (longRunning == LongRunning.getDefaultInstance()) {
                    return this;
                }
                if (longRunning.hasInitialPollDelay()) {
                    mergeInitialPollDelay(longRunning.getInitialPollDelay());
                }
                if (longRunning.getPollDelayMultiplier() != 0.0f) {
                    setPollDelayMultiplier(longRunning.getPollDelayMultiplier());
                }
                if (longRunning.hasMaxPollDelay()) {
                    mergeMaxPollDelay(longRunning.getMaxPollDelay());
                }
                if (longRunning.hasTotalPollTimeout()) {
                    mergeTotalPollTimeout(longRunning.getTotalPollTimeout());
                }
                mergeUnknownFields(longRunning.getUnknownFields());
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
                                    codedInputStream.readMessage(getInitialPollDelayFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.pollDelayMultiplier_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getMaxPollDelayFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getTotalPollTimeoutFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
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

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public boolean hasInitialPollDelay() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public Duration getInitialPollDelay() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.initialPollDelay_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setInitialPollDelay(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.initialPollDelay_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInitialPollDelay(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialPollDelay_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeInitialPollDelay(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0 && (duration2 = this.initialPollDelay_) != null && duration2 != Duration.getDefaultInstance()) {
                        getInitialPollDelayBuilder().mergeFrom(duration);
                    } else {
                        this.initialPollDelay_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.initialPollDelay_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder clearInitialPollDelay() {
                this.bitField0_ &= -2;
                this.initialPollDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialPollDelayBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getInitialPollDelayBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Duration.Builder) getInitialPollDelayFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public DurationOrBuilder getInitialPollDelayOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.initialPollDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.initialPollDelay_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getInitialPollDelayFieldBuilder() {
                if (this.initialPollDelayBuilder_ == null) {
                    this.initialPollDelayBuilder_ = new SingleFieldBuilderV3<>(getInitialPollDelay(), getParentForChildren(), isClean());
                    this.initialPollDelay_ = null;
                }
                return this.initialPollDelayBuilder_;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public float getPollDelayMultiplier() {
                return this.pollDelayMultiplier_;
            }

            public Builder setPollDelayMultiplier(float f) {
                this.pollDelayMultiplier_ = f;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearPollDelayMultiplier() {
                this.bitField0_ &= -3;
                this.pollDelayMultiplier_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public boolean hasMaxPollDelay() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public Duration getMaxPollDelay() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.maxPollDelay_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setMaxPollDelay(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.maxPollDelay_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxPollDelay(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.maxPollDelay_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeMaxPollDelay(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0 && (duration2 = this.maxPollDelay_) != null && duration2 != Duration.getDefaultInstance()) {
                        getMaxPollDelayBuilder().mergeFrom(duration);
                    } else {
                        this.maxPollDelay_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.maxPollDelay_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder clearMaxPollDelay() {
                this.bitField0_ &= -5;
                this.maxPollDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.maxPollDelayBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getMaxPollDelayBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Duration.Builder) getMaxPollDelayFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public DurationOrBuilder getMaxPollDelayOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.maxPollDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.maxPollDelay_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getMaxPollDelayFieldBuilder() {
                if (this.maxPollDelayBuilder_ == null) {
                    this.maxPollDelayBuilder_ = new SingleFieldBuilderV3<>(getMaxPollDelay(), getParentForChildren(), isClean());
                    this.maxPollDelay_ = null;
                }
                return this.maxPollDelayBuilder_;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public boolean hasTotalPollTimeout() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public Duration getTotalPollTimeout() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.totalPollTimeout_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setTotalPollTimeout(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.totalPollTimeout_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTotalPollTimeout(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.totalPollTimeout_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeTotalPollTimeout(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0 && (duration2 = this.totalPollTimeout_) != null && duration2 != Duration.getDefaultInstance()) {
                        getTotalPollTimeoutBuilder().mergeFrom(duration);
                    } else {
                        this.totalPollTimeout_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.totalPollTimeout_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder clearTotalPollTimeout() {
                this.bitField0_ &= -9;
                this.totalPollTimeout_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.totalPollTimeoutBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getTotalPollTimeoutBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Duration.Builder) getTotalPollTimeoutFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MethodSettings.LongRunningOrBuilder
            public DurationOrBuilder getTotalPollTimeoutOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.totalPollTimeoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.totalPollTimeout_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getTotalPollTimeoutFieldBuilder() {
                if (this.totalPollTimeoutBuilder_ == null) {
                    this.totalPollTimeoutBuilder_ = new SingleFieldBuilderV3<>(getTotalPollTimeout(), getParentForChildren(), isClean());
                    this.totalPollTimeout_ = null;
                }
                return this.totalPollTimeoutBuilder_;
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

        public static LongRunning getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LongRunning> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LongRunning> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LongRunning getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public String getSelector() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.selector_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public ByteString getSelectorBytes() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.selector_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public boolean hasLongRunning() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public LongRunning getLongRunning() {
        LongRunning longRunning = this.longRunning_;
        return longRunning == null ? LongRunning.getDefaultInstance() : longRunning;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public LongRunningOrBuilder getLongRunningOrBuilder() {
        LongRunning longRunning = this.longRunning_;
        return longRunning == null ? LongRunning.getDefaultInstance() : longRunning;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public ProtocolStringList getAutoPopulatedFieldsList() {
        return this.autoPopulatedFields_;
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public int getAutoPopulatedFieldsCount() {
        return this.autoPopulatedFields_.size();
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public String getAutoPopulatedFields(int i) {
        return this.autoPopulatedFields_.get(i);
    }

    @Override // com.google.api.MethodSettingsOrBuilder
    public ByteString getAutoPopulatedFieldsBytes(int i) {
        return this.autoPopulatedFields_.getByteString(i);
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
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(2, getLongRunning());
        }
        for (int i = 0; i < this.autoPopulatedFields_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.autoPopulatedFields_.getRaw(i));
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
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, getLongRunning());
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.autoPopulatedFields_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.autoPopulatedFields_.getRaw(i2));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getAutoPopulatedFieldsList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MethodSettings)) {
            return super.equals(obj);
        }
        MethodSettings methodSettings = (MethodSettings) obj;
        if (getSelector().equals(methodSettings.getSelector()) && hasLongRunning() == methodSettings.hasLongRunning()) {
            return (!hasLongRunning() || getLongRunning().equals(methodSettings.getLongRunning())) && getAutoPopulatedFieldsList().equals(methodSettings.getAutoPopulatedFieldsList()) && getUnknownFields().equals(methodSettings.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSelector().hashCode();
        if (hasLongRunning()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getLongRunning().hashCode();
        }
        if (getAutoPopulatedFieldsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getAutoPopulatedFieldsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static MethodSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static MethodSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MethodSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static MethodSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MethodSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static MethodSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MethodSettings parseFrom(InputStream inputStream) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MethodSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MethodSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MethodSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MethodSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MethodSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MethodSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MethodSettings methodSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(methodSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MethodSettingsOrBuilder {
        private LazyStringArrayList autoPopulatedFields_;
        private int bitField0_;
        private SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> longRunningBuilder_;
        private LongRunning longRunning_;
        private Object selector_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_MethodSettings_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_MethodSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(MethodSettings.class, Builder.class);
        }

        private Builder() {
            this.selector_ = "";
            this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.selector_ = "";
            this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (MethodSettings.alwaysUseFieldBuilders) {
                getLongRunningFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.selector_ = "";
            this.longRunning_ = null;
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.longRunningBuilder_ = null;
            }
            this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_MethodSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MethodSettings getDefaultInstanceForType() {
            return MethodSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MethodSettings build() {
            MethodSettings methodSettingsBuildPartial = buildPartial();
            if (methodSettingsBuildPartial.isInitialized()) {
                return methodSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) methodSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MethodSettings buildPartial() {
            MethodSettings methodSettings = new MethodSettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(methodSettings);
            }
            onBuilt();
            return methodSettings;
        }

        private void buildPartial0(MethodSettings methodSettings) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                methodSettings.selector_ = this.selector_;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
                methodSettings.longRunning_ = singleFieldBuilderV3 == null ? this.longRunning_ : (LongRunning) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                this.autoPopulatedFields_.makeImmutable();
                methodSettings.autoPopulatedFields_ = this.autoPopulatedFields_;
            }
            MethodSettings.access$1676(methodSettings, i);
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
            if (message instanceof MethodSettings) {
                return mergeFrom((MethodSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MethodSettings methodSettings) {
            if (methodSettings == MethodSettings.getDefaultInstance()) {
                return this;
            }
            if (!methodSettings.getSelector().isEmpty()) {
                this.selector_ = methodSettings.selector_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (methodSettings.hasLongRunning()) {
                mergeLongRunning(methodSettings.getLongRunning());
            }
            if (!methodSettings.autoPopulatedFields_.isEmpty()) {
                if (this.autoPopulatedFields_.isEmpty()) {
                    this.autoPopulatedFields_ = methodSettings.autoPopulatedFields_;
                    this.bitField0_ |= 4;
                } else {
                    ensureAutoPopulatedFieldsIsMutable();
                    this.autoPopulatedFields_.addAll(methodSettings.autoPopulatedFields_);
                }
                onChanged();
            }
            mergeUnknownFields(methodSettings.getUnknownFields());
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
                                codedInputStream.readMessage(getLongRunningFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureAutoPopulatedFieldsIsMutable();
                                this.autoPopulatedFields_.add((Object) stringRequireUtf8);
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

        @Override // com.google.api.MethodSettingsOrBuilder
        public String getSelector() {
            Object obj = this.selector_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.selector_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MethodSettingsOrBuilder
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
            this.selector_ = MethodSettings.getDefaultInstance().getSelector();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            byteString.getClass();
            MethodSettings.checkByteStringIsUtf8(byteString);
            this.selector_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public boolean hasLongRunning() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public LongRunning getLongRunning() {
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 == null) {
                LongRunning longRunning = this.longRunning_;
                return longRunning == null ? LongRunning.getDefaultInstance() : longRunning;
            }
            return (LongRunning) singleFieldBuilderV3.getMessage();
        }

        public Builder setLongRunning(LongRunning longRunning) {
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 == null) {
                longRunning.getClass();
                this.longRunning_ = longRunning;
            } else {
                singleFieldBuilderV3.setMessage(longRunning);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setLongRunning(LongRunning.Builder builder) {
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.longRunning_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeLongRunning(LongRunning longRunning) {
            LongRunning longRunning2;
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (longRunning2 = this.longRunning_) != null && longRunning2 != LongRunning.getDefaultInstance()) {
                    getLongRunningBuilder().mergeFrom(longRunning);
                } else {
                    this.longRunning_ = longRunning;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(longRunning);
            }
            if (this.longRunning_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearLongRunning() {
            this.bitField0_ &= -3;
            this.longRunning_ = null;
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.longRunningBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public LongRunning.Builder getLongRunningBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (LongRunning.Builder) getLongRunningFieldBuilder().getBuilder();
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public LongRunningOrBuilder getLongRunningOrBuilder() {
            SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> singleFieldBuilderV3 = this.longRunningBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (LongRunningOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            LongRunning longRunning = this.longRunning_;
            return longRunning == null ? LongRunning.getDefaultInstance() : longRunning;
        }

        private SingleFieldBuilderV3<LongRunning, LongRunning.Builder, LongRunningOrBuilder> getLongRunningFieldBuilder() {
            if (this.longRunningBuilder_ == null) {
                this.longRunningBuilder_ = new SingleFieldBuilderV3<>(getLongRunning(), getParentForChildren(), isClean());
                this.longRunning_ = null;
            }
            return this.longRunningBuilder_;
        }

        private void ensureAutoPopulatedFieldsIsMutable() {
            if (!this.autoPopulatedFields_.isModifiable()) {
                this.autoPopulatedFields_ = new LazyStringArrayList((LazyStringList) this.autoPopulatedFields_);
            }
            this.bitField0_ |= 4;
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public ProtocolStringList getAutoPopulatedFieldsList() {
            this.autoPopulatedFields_.makeImmutable();
            return this.autoPopulatedFields_;
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public int getAutoPopulatedFieldsCount() {
            return this.autoPopulatedFields_.size();
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public String getAutoPopulatedFields(int i) {
            return this.autoPopulatedFields_.get(i);
        }

        @Override // com.google.api.MethodSettingsOrBuilder
        public ByteString getAutoPopulatedFieldsBytes(int i) {
            return this.autoPopulatedFields_.getByteString(i);
        }

        public Builder setAutoPopulatedFields(int i, String str) {
            str.getClass();
            ensureAutoPopulatedFieldsIsMutable();
            this.autoPopulatedFields_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addAutoPopulatedFields(String str) {
            str.getClass();
            ensureAutoPopulatedFieldsIsMutable();
            this.autoPopulatedFields_.add((Object) str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder addAllAutoPopulatedFields(Iterable<String> iterable) {
            ensureAutoPopulatedFieldsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.autoPopulatedFields_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearAutoPopulatedFields() {
            this.autoPopulatedFields_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addAutoPopulatedFieldsBytes(ByteString byteString) {
            byteString.getClass();
            MethodSettings.checkByteStringIsUtf8(byteString);
            ensureAutoPopulatedFieldsIsMutable();
            this.autoPopulatedFields_.add(byteString);
            this.bitField0_ |= 4;
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

    public static MethodSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MethodSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MethodSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MethodSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
