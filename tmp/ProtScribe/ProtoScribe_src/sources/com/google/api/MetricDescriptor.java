package com.google.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.api.LabelDescriptor;
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MetricDescriptor extends GeneratedMessageV3 implements MetricDescriptorOrBuilder {
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int MONITORED_RESOURCE_TYPES_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object description_;
    private volatile Object displayName_;
    private List<LabelDescriptor> labels_;
    private int launchStage_;
    private byte memoizedIsInitialized;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private LazyStringArrayList monitoredResourceTypes_;
    private volatile Object name_;
    private volatile Object type_;
    private volatile Object unit_;
    private int valueType_;
    private static final MetricDescriptor DEFAULT_INSTANCE = new MetricDescriptor();
    private static final Parser<MetricDescriptor> PARSER = new AbstractParser<MetricDescriptor>() { // from class: com.google.api.MetricDescriptor.1
        @Override // com.google.protobuf.Parser
        public MetricDescriptor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = MetricDescriptor.newBuilder();
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

    public interface MetricDescriptorMetadataOrBuilder extends MessageOrBuilder {
        Duration getIngestDelay();

        DurationOrBuilder getIngestDelayOrBuilder();

        @Deprecated
        LaunchStage getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        Duration getSamplePeriod();

        DurationOrBuilder getSamplePeriodOrBuilder();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();
    }

    static /* synthetic */ int access$2376(MetricDescriptor metricDescriptor, int i) {
        int i2 = i | metricDescriptor.bitField0_;
        metricDescriptor.bitField0_ = i2;
        return i2;
    }

    private MetricDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.type_ = "";
        this.metricKind_ = 0;
        this.valueType_ = 0;
        this.unit_ = "";
        this.description_ = "";
        this.displayName_ = "";
        this.launchStage_ = 0;
        this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private MetricDescriptor() {
        this.name_ = "";
        this.type_ = "";
        this.metricKind_ = 0;
        this.valueType_ = 0;
        this.unit_ = "";
        this.description_ = "";
        this.displayName_ = "";
        this.launchStage_ = 0;
        this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.type_ = "";
        this.labels_ = Collections.emptyList();
        this.metricKind_ = 0;
        this.valueType_ = 0;
        this.unit_ = "";
        this.description_ = "";
        this.displayName_ = "";
        this.launchStage_ = 0;
        this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MetricDescriptor();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return MetricProto.internal_static_google_api_MetricDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptor.class, Builder.class);
    }

    public enum MetricKind implements ProtocolMessageEnum {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        public static final int CUMULATIVE_VALUE = 3;
        public static final int DELTA_VALUE = 2;
        public static final int GAUGE_VALUE = 1;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<MetricKind> internalValueMap = new Internal.EnumLiteMap<MetricKind>() { // from class: com.google.api.MetricDescriptor.MetricKind.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MetricKind findValueByNumber(int i) {
                return MetricKind.forNumber(i);
            }
        };
        private static final MetricKind[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static MetricKind valueOf(int i) {
            return forNumber(i);
        }

        public static MetricKind forNumber(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        public static Internal.EnumLiteMap<MetricKind> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MetricDescriptor.getDescriptor().getEnumTypes().get(0);
        }

        public static MetricKind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        MetricKind(int i) {
            this.value = i;
        }
    }

    public enum ValueType implements ProtocolMessageEnum {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final int DOUBLE_VALUE = 3;
        public static final int INT64_VALUE = 2;
        public static final int MONEY_VALUE = 6;
        public static final int STRING_VALUE = 4;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = new Internal.EnumLiteMap<ValueType>() { // from class: com.google.api.MetricDescriptor.ValueType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ValueType findValueByNumber(int i) {
                return ValueType.forNumber(i);
            }
        };
        private static final ValueType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ValueType valueOf(int i) {
            return forNumber(i);
        }

        public static ValueType forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MetricDescriptor.getDescriptor().getEnumTypes().get(1);
        }

        public static ValueType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        ValueType(int i) {
            this.value = i;
        }
    }

    public static final class MetricDescriptorMetadata extends GeneratedMessageV3 implements MetricDescriptorMetadataOrBuilder {
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Duration ingestDelay_;
        private int launchStage_;
        private byte memoizedIsInitialized;
        private Duration samplePeriod_;
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE = new MetricDescriptorMetadata();
        private static final Parser<MetricDescriptorMetadata> PARSER = new AbstractParser<MetricDescriptorMetadata>() { // from class: com.google.api.MetricDescriptor.MetricDescriptorMetadata.1
            @Override // com.google.protobuf.Parser
            public MetricDescriptorMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MetricDescriptorMetadata.newBuilder();
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

        static /* synthetic */ int access$776(MetricDescriptorMetadata metricDescriptorMetadata, int i) {
            int i2 = i | metricDescriptorMetadata.bitField0_;
            metricDescriptorMetadata.bitField0_ = i2;
            return i2;
        }

        private MetricDescriptorMetadata(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.launchStage_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private MetricDescriptorMetadata() {
            this.memoizedIsInitialized = (byte) -1;
            this.launchStage_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MetricDescriptorMetadata();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, Builder.class);
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public LaunchStage getLaunchStage() {
            LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
            return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasSamplePeriod() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public DurationOrBuilder getSamplePeriodOrBuilder() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasIngestDelay() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public DurationOrBuilder getIngestDelayOrBuilder() {
            Duration duration = this.ingestDelay_;
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
            if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.launchStage_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getSamplePeriod());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(3, getIngestDelay());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.launchStage_) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getSamplePeriod());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getIngestDelay());
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricDescriptorMetadata)) {
                return super.equals(obj);
            }
            MetricDescriptorMetadata metricDescriptorMetadata = (MetricDescriptorMetadata) obj;
            if (this.launchStage_ != metricDescriptorMetadata.launchStage_ || hasSamplePeriod() != metricDescriptorMetadata.hasSamplePeriod()) {
                return false;
            }
            if ((!hasSamplePeriod() || getSamplePeriod().equals(metricDescriptorMetadata.getSamplePeriod())) && hasIngestDelay() == metricDescriptorMetadata.hasIngestDelay()) {
                return (!hasIngestDelay() || getIngestDelay().equals(metricDescriptorMetadata.getIngestDelay())) && getUnknownFields().equals(metricDescriptorMetadata.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.launchStage_;
            if (hasSamplePeriod()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSamplePeriod().hashCode();
            }
            if (hasIngestDelay()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getIngestDelay().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricDescriptorMetadata);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDescriptorMetadataOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> ingestDelayBuilder_;
            private Duration ingestDelay_;
            private int launchStage_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> samplePeriodBuilder_;
            private Duration samplePeriod_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, Builder.class);
            }

            private Builder() {
                this.launchStage_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.launchStage_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (MetricDescriptorMetadata.alwaysUseFieldBuilders) {
                    getSamplePeriodFieldBuilder();
                    getIngestDelayFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.launchStage_ = 0;
                this.samplePeriod_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.samplePeriodBuilder_ = null;
                }
                this.ingestDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.ingestDelayBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MetricDescriptorMetadata getDefaultInstanceForType() {
                return MetricDescriptorMetadata.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricDescriptorMetadata build() {
                MetricDescriptorMetadata metricDescriptorMetadataBuildPartial = buildPartial();
                if (metricDescriptorMetadataBuildPartial.isInitialized()) {
                    return metricDescriptorMetadataBuildPartial;
                }
                throw newUninitializedMessageException((Message) metricDescriptorMetadataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricDescriptorMetadata buildPartial() {
                MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(metricDescriptorMetadata);
                }
                onBuilt();
                return metricDescriptorMetadata;
            }

            private void buildPartial0(MetricDescriptorMetadata metricDescriptorMetadata) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    metricDescriptorMetadata.launchStage_ = this.launchStage_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                    metricDescriptorMetadata.samplePeriod_ = singleFieldBuilderV3 == null ? this.samplePeriod_ : (Duration) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.ingestDelayBuilder_;
                    metricDescriptorMetadata.ingestDelay_ = singleFieldBuilderV32 == null ? this.ingestDelay_ : (Duration) singleFieldBuilderV32.build();
                    i |= 2;
                }
                MetricDescriptorMetadata.access$776(metricDescriptorMetadata, i);
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
                if (message instanceof MetricDescriptorMetadata) {
                    return mergeFrom((MetricDescriptorMetadata) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MetricDescriptorMetadata metricDescriptorMetadata) {
                if (metricDescriptorMetadata == MetricDescriptorMetadata.getDefaultInstance()) {
                    return this;
                }
                if (metricDescriptorMetadata.launchStage_ != 0) {
                    setLaunchStageValue(metricDescriptorMetadata.getLaunchStageValue());
                }
                if (metricDescriptorMetadata.hasSamplePeriod()) {
                    mergeSamplePeriod(metricDescriptorMetadata.getSamplePeriod());
                }
                if (metricDescriptorMetadata.hasIngestDelay()) {
                    mergeIngestDelay(metricDescriptorMetadata.getIngestDelay());
                }
                mergeUnknownFields(metricDescriptorMetadata.getUnknownFields());
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
                                    this.launchStage_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSamplePeriodFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getIngestDelayFieldBuilder().getBuilder(), extensionRegistryLite);
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

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public int getLaunchStageValue() {
                return this.launchStage_;
            }

            @Deprecated
            public Builder setLaunchStageValue(int i) {
                this.launchStage_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public LaunchStage getLaunchStage() {
                LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
                return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
            }

            @Deprecated
            public Builder setLaunchStage(LaunchStage launchStage) {
                launchStage.getClass();
                this.bitField0_ |= 1;
                this.launchStage_ = launchStage.getNumber();
                onChanged();
                return this;
            }

            @Deprecated
            public Builder clearLaunchStage() {
                this.bitField0_ &= -2;
                this.launchStage_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasSamplePeriod() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getSamplePeriod() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.samplePeriod_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setSamplePeriod(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.samplePeriod_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSamplePeriod(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.samplePeriod_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeSamplePeriod(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0 && (duration2 = this.samplePeriod_) != null && duration2 != Duration.getDefaultInstance()) {
                        getSamplePeriodBuilder().mergeFrom(duration);
                    } else {
                        this.samplePeriod_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.samplePeriod_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder clearSamplePeriod() {
                this.bitField0_ &= -3;
                this.samplePeriod_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.samplePeriodBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getSamplePeriodBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Duration.Builder) getSamplePeriodFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public DurationOrBuilder getSamplePeriodOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.samplePeriod_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getSamplePeriodFieldBuilder() {
                if (this.samplePeriodBuilder_ == null) {
                    this.samplePeriodBuilder_ = new SingleFieldBuilderV3<>(getSamplePeriod(), getParentForChildren(), isClean());
                    this.samplePeriod_ = null;
                }
                return this.samplePeriodBuilder_;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasIngestDelay() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getIngestDelay() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.ingestDelay_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setIngestDelay(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.ingestDelay_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setIngestDelay(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ingestDelay_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeIngestDelay(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0 && (duration2 = this.ingestDelay_) != null && duration2 != Duration.getDefaultInstance()) {
                        getIngestDelayBuilder().mergeFrom(duration);
                    } else {
                        this.ingestDelay_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.ingestDelay_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder clearIngestDelay() {
                this.bitField0_ &= -5;
                this.ingestDelay_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.ingestDelayBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getIngestDelayBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (Duration.Builder) getIngestDelayFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public DurationOrBuilder getIngestDelayOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.ingestDelay_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getIngestDelayFieldBuilder() {
                if (this.ingestDelayBuilder_ == null) {
                    this.ingestDelayBuilder_ = new SingleFieldBuilderV3<>(getIngestDelay(), getParentForChildren(), isClean());
                    this.ingestDelay_ = null;
                }
                return this.ingestDelayBuilder_;
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

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricDescriptorMetadata> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MetricDescriptorMetadata> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetricDescriptorMetadata getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return this.labels_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMetricKindValue() {
        return this.metricKind_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricKind getMetricKind() {
        MetricKind metricKindForNumber = MetricKind.forNumber(this.metricKind_);
        return metricKindForNumber == null ? MetricKind.UNRECOGNIZED : metricKindForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ValueType getValueType() {
        ValueType valueTypeForNumber = ValueType.forNumber(this.valueType_);
        return valueTypeForNumber == null ? ValueType.UNRECOGNIZED : valueTypeForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getUnit() {
        Object obj = this.unit_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.unit_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getUnitBytes() {
        Object obj = this.unit_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.unit_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDescription() {
        Object obj = this.description_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.description_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
        Object obj = this.description_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDisplayName() {
        Object obj = this.displayName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.displayName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
        Object obj = this.displayName_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.displayName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadataOrBuilder getMetadataOrBuilder() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
        LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
        return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ProtocolStringList getMonitoredResourceTypesList() {
        return this.monitoredResourceTypes_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMonitoredResourceTypesCount() {
        return this.monitoredResourceTypes_.size();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getMonitoredResourceTypes(int i) {
        return this.monitoredResourceTypes_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getMonitoredResourceTypesBytes(int i) {
        return this.monitoredResourceTypes_.getByteString(i);
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
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.labels_.size(); i++) {
            codedOutputStream.writeMessage(2, this.labels_.get(i));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(3, this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.valueType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.unit_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.unit_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.description_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.displayName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.displayName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.type_);
        }
        if ((1 & this.bitField0_) != 0) {
            codedOutputStream.writeMessage(10, getMetadata());
        }
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(12, this.launchStage_);
        }
        for (int i2 = 0; i2 < this.monitoredResourceTypes_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.monitoredResourceTypes_.getRaw(i2));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.labels_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.labels_.get(i2));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.valueType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.unit_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.unit_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.description_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.displayName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.displayName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.type_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, getMetadata());
        }
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(12, this.launchStage_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i3 = 0; i3 < this.monitoredResourceTypes_.size(); i3++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.monitoredResourceTypes_.getRaw(i3));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getMonitoredResourceTypesList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricDescriptor)) {
            return super.equals(obj);
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
        if (getName().equals(metricDescriptor.getName()) && getType().equals(metricDescriptor.getType()) && getLabelsList().equals(metricDescriptor.getLabelsList()) && this.metricKind_ == metricDescriptor.metricKind_ && this.valueType_ == metricDescriptor.valueType_ && getUnit().equals(metricDescriptor.getUnit()) && getDescription().equals(metricDescriptor.getDescription()) && getDisplayName().equals(metricDescriptor.getDisplayName()) && hasMetadata() == metricDescriptor.hasMetadata()) {
            return (!hasMetadata() || getMetadata().equals(metricDescriptor.getMetadata())) && this.launchStage_ == metricDescriptor.launchStage_ && getMonitoredResourceTypesList().equals(metricDescriptor.getMonitoredResourceTypesList()) && getUnknownFields().equals(metricDescriptor.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 8) * 53) + getType().hashCode();
        if (getLabelsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getLabelsList().hashCode();
        }
        int iHashCode2 = (((((((((((((((((((iHashCode * 37) + 3) * 53) + this.metricKind_) * 37) + 4) * 53) + this.valueType_) * 37) + 5) * 53) + getUnit().hashCode()) * 37) + 6) * 53) + getDescription().hashCode()) * 37) + 7) * 53) + getDisplayName().hashCode();
        if (hasMetadata()) {
            iHashCode2 = (((iHashCode2 * 37) + 10) * 53) + getMetadata().hashCode();
        }
        int iHashCode3 = (((iHashCode2 * 37) + 12) * 53) + this.launchStage_;
        if (getMonitoredResourceTypesCount() > 0) {
            iHashCode3 = (((iHashCode3 * 37) + 13) * 53) + getMonitoredResourceTypesList().hashCode();
        }
        int iHashCode4 = (iHashCode3 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricDescriptor);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDescriptorOrBuilder {
        private int bitField0_;
        private Object description_;
        private Object displayName_;
        private RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> labelsBuilder_;
        private List<LabelDescriptor> labels_;
        private int launchStage_;
        private SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> metadataBuilder_;
        private MetricDescriptorMetadata metadata_;
        private int metricKind_;
        private LazyStringArrayList monitoredResourceTypes_;
        private Object name_;
        private Object type_;
        private Object unit_;
        private int valueType_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MetricProto.internal_static_google_api_MetricDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptor.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.type_ = "";
            this.labels_ = Collections.emptyList();
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.type_ = "";
            this.labels_ = Collections.emptyList();
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (MetricDescriptor.alwaysUseFieldBuilders) {
                getLabelsFieldBuilder();
                getMetadataFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.type_ = "";
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.labels_ = Collections.emptyList();
            } else {
                this.labels_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -5;
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            this.metadata_ = null;
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.metadataBuilder_ = null;
            }
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetricDescriptor getDefaultInstanceForType() {
            return MetricDescriptor.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetricDescriptor build() {
            MetricDescriptor metricDescriptorBuildPartial = buildPartial();
            if (metricDescriptorBuildPartial.isInitialized()) {
                return metricDescriptorBuildPartial;
            }
            throw newUninitializedMessageException((Message) metricDescriptorBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetricDescriptor buildPartial() {
            MetricDescriptor metricDescriptor = new MetricDescriptor(this);
            buildPartialRepeatedFields(metricDescriptor);
            if (this.bitField0_ != 0) {
                buildPartial0(metricDescriptor);
            }
            onBuilt();
            return metricDescriptor;
        }

        private void buildPartialRepeatedFields(MetricDescriptor metricDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                metricDescriptor.labels_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.labels_ = Collections.unmodifiableList(this.labels_);
                this.bitField0_ &= -5;
            }
            metricDescriptor.labels_ = this.labels_;
        }

        private void buildPartial0(MetricDescriptor metricDescriptor) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                metricDescriptor.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                metricDescriptor.type_ = this.type_;
            }
            if ((i2 & 8) != 0) {
                metricDescriptor.metricKind_ = this.metricKind_;
            }
            if ((i2 & 16) != 0) {
                metricDescriptor.valueType_ = this.valueType_;
            }
            if ((i2 & 32) != 0) {
                metricDescriptor.unit_ = this.unit_;
            }
            if ((i2 & 64) != 0) {
                metricDescriptor.description_ = this.description_;
            }
            if ((i2 & 128) != 0) {
                metricDescriptor.displayName_ = this.displayName_;
            }
            if ((i2 & 256) != 0) {
                SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
                metricDescriptor.metadata_ = singleFieldBuilderV3 == null ? this.metadata_ : (MetricDescriptorMetadata) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 512) != 0) {
                metricDescriptor.launchStage_ = this.launchStage_;
            }
            if ((i2 & 1024) != 0) {
                this.monitoredResourceTypes_.makeImmutable();
                metricDescriptor.monitoredResourceTypes_ = this.monitoredResourceTypes_;
            }
            MetricDescriptor.access$2376(metricDescriptor, i);
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
            if (message instanceof MetricDescriptor) {
                return mergeFrom((MetricDescriptor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MetricDescriptor metricDescriptor) {
            if (metricDescriptor == MetricDescriptor.getDefaultInstance()) {
                return this;
            }
            if (!metricDescriptor.getName().isEmpty()) {
                this.name_ = metricDescriptor.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!metricDescriptor.getType().isEmpty()) {
                this.type_ = metricDescriptor.type_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (this.labelsBuilder_ == null) {
                if (!metricDescriptor.labels_.isEmpty()) {
                    if (this.labels_.isEmpty()) {
                        this.labels_ = metricDescriptor.labels_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureLabelsIsMutable();
                        this.labels_.addAll(metricDescriptor.labels_);
                    }
                    onChanged();
                }
            } else if (!metricDescriptor.labels_.isEmpty()) {
                if (!this.labelsBuilder_.isEmpty()) {
                    this.labelsBuilder_.addAllMessages(metricDescriptor.labels_);
                } else {
                    this.labelsBuilder_.dispose();
                    this.labelsBuilder_ = null;
                    this.labels_ = metricDescriptor.labels_;
                    this.bitField0_ &= -5;
                    this.labelsBuilder_ = MetricDescriptor.alwaysUseFieldBuilders ? getLabelsFieldBuilder() : null;
                }
            }
            if (metricDescriptor.metricKind_ != 0) {
                setMetricKindValue(metricDescriptor.getMetricKindValue());
            }
            if (metricDescriptor.valueType_ != 0) {
                setValueTypeValue(metricDescriptor.getValueTypeValue());
            }
            if (!metricDescriptor.getUnit().isEmpty()) {
                this.unit_ = metricDescriptor.unit_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!metricDescriptor.getDescription().isEmpty()) {
                this.description_ = metricDescriptor.description_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (!metricDescriptor.getDisplayName().isEmpty()) {
                this.displayName_ = metricDescriptor.displayName_;
                this.bitField0_ |= 128;
                onChanged();
            }
            if (metricDescriptor.hasMetadata()) {
                mergeMetadata(metricDescriptor.getMetadata());
            }
            if (metricDescriptor.launchStage_ != 0) {
                setLaunchStageValue(metricDescriptor.getLaunchStageValue());
            }
            if (!metricDescriptor.monitoredResourceTypes_.isEmpty()) {
                if (this.monitoredResourceTypes_.isEmpty()) {
                    this.monitoredResourceTypes_ = metricDescriptor.monitoredResourceTypes_;
                    this.bitField0_ |= 1024;
                } else {
                    ensureMonitoredResourceTypesIsMutable();
                    this.monitoredResourceTypes_.addAll(metricDescriptor.monitoredResourceTypes_);
                }
                onChanged();
            }
            mergeUnknownFields(metricDescriptor.getUnknownFields());
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
                        switch (tag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                break;
                            case 18:
                                LabelDescriptor labelDescriptor = (LabelDescriptor) codedInputStream.readMessage(LabelDescriptor.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureLabelsIsMutable();
                                    this.labels_.add(labelDescriptor);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(labelDescriptor);
                                }
                                break;
                            case 24:
                                this.metricKind_ = codedInputStream.readEnum();
                                this.bitField0_ |= 8;
                                break;
                            case 32:
                                this.valueType_ = codedInputStream.readEnum();
                                this.bitField0_ |= 16;
                                break;
                            case 42:
                                this.unit_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                                break;
                            case 50:
                                this.description_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 64;
                                break;
                            case 58:
                                this.displayName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 128;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                this.type_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                break;
                            case 82:
                                codedInputStream.readMessage(getMetadataFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 256;
                                break;
                            case 96:
                                this.launchStage_ = codedInputStream.readEnum();
                                this.bitField0_ |= 512;
                                break;
                            case Publishing.DOC_TAG_PREFIX_FIELD_NUMBER /* 106 */:
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureMonitoredResourceTypesIsMutable();
                                this.monitoredResourceTypes_.add((Object) stringRequireUtf8);
                                break;
                            default:
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = MetricDescriptor.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setType(String str) {
            str.getClass();
            this.type_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = MetricDescriptor.getDefaultInstance().getType();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensureLabelsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.labels_ = new ArrayList(this.labels_);
                this.bitField0_ |= 4;
            }
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.labels_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLabelsCount() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.get(i);
            }
            return (LabelDescriptor) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.set(i, labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, labelDescriptor);
            }
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.add(labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(labelDescriptor);
            }
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.add(i, labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, labelDescriptor);
            }
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.labels_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearLabels() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.labels_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeLabels(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public LabelDescriptor.Builder getLabelsBuilder(int i) {
            return (LabelDescriptor.Builder) getLabelsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.get(i);
            }
            return (LabelDescriptorOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.labels_);
        }

        public LabelDescriptor.Builder addLabelsBuilder() {
            return (LabelDescriptor.Builder) getLabelsFieldBuilder().addBuilder(LabelDescriptor.getDefaultInstance());
        }

        public LabelDescriptor.Builder addLabelsBuilder(int i) {
            return (LabelDescriptor.Builder) getLabelsFieldBuilder().addBuilder(i, LabelDescriptor.getDefaultInstance());
        }

        public List<LabelDescriptor.Builder> getLabelsBuilderList() {
            return getLabelsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> getLabelsFieldBuilder() {
            if (this.labelsBuilder_ == null) {
                this.labelsBuilder_ = new RepeatedFieldBuilderV3<>(this.labels_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.labels_ = null;
            }
            return this.labelsBuilder_;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMetricKindValue() {
            return this.metricKind_;
        }

        public Builder setMetricKindValue(int i) {
            this.metricKind_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricKind getMetricKind() {
            MetricKind metricKindForNumber = MetricKind.forNumber(this.metricKind_);
            return metricKindForNumber == null ? MetricKind.UNRECOGNIZED : metricKindForNumber;
        }

        public Builder setMetricKind(MetricKind metricKind) {
            metricKind.getClass();
            this.bitField0_ |= 8;
            this.metricKind_ = metricKind.getNumber();
            onChanged();
            return this;
        }

        public Builder clearMetricKind() {
            this.bitField0_ &= -9;
            this.metricKind_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getValueTypeValue() {
            return this.valueType_;
        }

        public Builder setValueTypeValue(int i) {
            this.valueType_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ValueType getValueType() {
            ValueType valueTypeForNumber = ValueType.forNumber(this.valueType_);
            return valueTypeForNumber == null ? ValueType.UNRECOGNIZED : valueTypeForNumber;
        }

        public Builder setValueType(ValueType valueType) {
            valueType.getClass();
            this.bitField0_ |= 16;
            this.valueType_ = valueType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearValueType() {
            this.bitField0_ &= -17;
            this.valueType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getUnit() {
            Object obj = this.unit_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.unit_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getUnitBytes() {
            Object obj = this.unit_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unit_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setUnit(String str) {
            str.getClass();
            this.unit_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearUnit() {
            this.unit_ = MetricDescriptor.getDefaultInstance().getUnit();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.unit_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDescription(String str) {
            str.getClass();
            this.description_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder clearDescription() {
            this.description_ = MetricDescriptor.getDefaultInstance().getDescription();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.description_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDisplayName() {
            Object obj = this.displayName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.displayName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
            Object obj = this.displayName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.displayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDisplayName(String str) {
            str.getClass();
            this.displayName_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder clearDisplayName() {
            this.displayName_ = MetricDescriptor.getDefaultInstance().getDisplayName();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.displayName_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public boolean hasMetadata() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadata getMetadata() {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
                return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
            }
            return (MetricDescriptorMetadata) singleFieldBuilderV3.getMessage();
        }

        public Builder setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                metricDescriptorMetadata.getClass();
                this.metadata_ = metricDescriptorMetadata;
            } else {
                singleFieldBuilderV3.setMessage(metricDescriptorMetadata);
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata.Builder builder) {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metadata_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            MetricDescriptorMetadata metricDescriptorMetadata2;
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 256) != 0 && (metricDescriptorMetadata2 = this.metadata_) != null && metricDescriptorMetadata2 != MetricDescriptorMetadata.getDefaultInstance()) {
                    getMetadataBuilder().mergeFrom(metricDescriptorMetadata);
                } else {
                    this.metadata_ = metricDescriptorMetadata;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(metricDescriptorMetadata);
            }
            if (this.metadata_ != null) {
                this.bitField0_ |= 256;
                onChanged();
            }
            return this;
        }

        public Builder clearMetadata() {
            this.bitField0_ &= -257;
            this.metadata_ = null;
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.metadataBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public MetricDescriptorMetadata.Builder getMetadataBuilder() {
            this.bitField0_ |= 256;
            onChanged();
            return (MetricDescriptorMetadata.Builder) getMetadataFieldBuilder().getBuilder();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadataOrBuilder getMetadataOrBuilder() {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (MetricDescriptorMetadataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
            return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
        }

        private SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> getMetadataFieldBuilder() {
            if (this.metadataBuilder_ == null) {
                this.metadataBuilder_ = new SingleFieldBuilderV3<>(getMetadata(), getParentForChildren(), isClean());
                this.metadata_ = null;
            }
            return this.metadataBuilder_;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Builder setLaunchStageValue(int i) {
            this.launchStage_ = i;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
            LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
            return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            launchStage.getClass();
            this.bitField0_ |= 512;
            this.launchStage_ = launchStage.getNumber();
            onChanged();
            return this;
        }

        public Builder clearLaunchStage() {
            this.bitField0_ &= -513;
            this.launchStage_ = 0;
            onChanged();
            return this;
        }

        private void ensureMonitoredResourceTypesIsMutable() {
            if (!this.monitoredResourceTypes_.isModifiable()) {
                this.monitoredResourceTypes_ = new LazyStringArrayList((LazyStringList) this.monitoredResourceTypes_);
            }
            this.bitField0_ |= 1024;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ProtocolStringList getMonitoredResourceTypesList() {
            this.monitoredResourceTypes_.makeImmutable();
            return this.monitoredResourceTypes_;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMonitoredResourceTypesCount() {
            return this.monitoredResourceTypes_.size();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getMonitoredResourceTypes(int i) {
            return this.monitoredResourceTypes_.get(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getMonitoredResourceTypesBytes(int i) {
            return this.monitoredResourceTypes_.getByteString(i);
        }

        public Builder setMonitoredResourceTypes(int i, String str) {
            str.getClass();
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.set(i, str);
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder addMonitoredResourceTypes(String str) {
            str.getClass();
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.add((Object) str);
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder addAllMonitoredResourceTypes(Iterable<String> iterable) {
            ensureMonitoredResourceTypesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.monitoredResourceTypes_);
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder clearMonitoredResourceTypes() {
            this.monitoredResourceTypes_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public Builder addMonitoredResourceTypesBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.add(byteString);
            this.bitField0_ |= 1024;
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

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MetricDescriptor> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MetricDescriptor> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MetricDescriptor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
