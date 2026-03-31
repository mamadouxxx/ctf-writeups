package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Distribution extends GeneratedMessageV3 implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int bucketCountsMemoizedSerializedSize;
    private Internal.LongList bucketCounts_;
    private BucketOptions bucketOptions_;
    private long count_;
    private List<Exemplar> exemplars_;
    private double mean_;
    private byte memoizedIsInitialized;
    private Range range_;
    private double sumOfSquaredDeviation_;
    private static final Distribution DEFAULT_INSTANCE = new Distribution();
    private static final Parser<Distribution> PARSER = new AbstractParser<Distribution>() { // from class: com.google.api.Distribution.1
        @Override // com.google.protobuf.Parser
        public Distribution parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Distribution.newBuilder();
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

    public interface BucketOptionsOrBuilder extends MessageOrBuilder {
        BucketOptions.Explicit getExplicitBuckets();

        BucketOptions.ExplicitOrBuilder getExplicitBucketsOrBuilder();

        BucketOptions.Exponential getExponentialBuckets();

        BucketOptions.ExponentialOrBuilder getExponentialBucketsOrBuilder();

        BucketOptions.Linear getLinearBuckets();

        BucketOptions.LinearOrBuilder getLinearBucketsOrBuilder();

        BucketOptions.OptionsCase getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();
    }

    public interface ExemplarOrBuilder extends MessageOrBuilder {
        Any getAttachments(int i);

        int getAttachmentsCount();

        List<Any> getAttachmentsList();

        AnyOrBuilder getAttachmentsOrBuilder(int i);

        List<? extends AnyOrBuilder> getAttachmentsOrBuilderList();

        Timestamp getTimestamp();

        TimestampOrBuilder getTimestampOrBuilder();

        double getValue();

        boolean hasTimestamp();
    }

    public interface RangeOrBuilder extends MessageOrBuilder {
        double getMax();

        double getMin();
    }

    static /* synthetic */ int access$5276(Distribution distribution, int i) {
        int i2 = i | distribution.bitField0_;
        distribution.bitField0_ = i2;
        return i2;
    }

    private Distribution(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.count_ = 0L;
        this.mean_ = 0.0d;
        this.sumOfSquaredDeviation_ = 0.0d;
        this.bucketCounts_ = emptyLongList();
        this.bucketCountsMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Distribution() {
        this.count_ = 0L;
        this.mean_ = 0.0d;
        this.sumOfSquaredDeviation_ = 0.0d;
        this.bucketCounts_ = emptyLongList();
        this.bucketCountsMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.bucketCounts_ = emptyLongList();
        this.exemplars_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Distribution();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DistributionProto.internal_static_google_api_Distribution_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DistributionProto.internal_static_google_api_Distribution_fieldAccessorTable.ensureFieldAccessorsInitialized(Distribution.class, Builder.class);
    }

    public static final class Range extends GeneratedMessageV3 implements RangeOrBuilder {
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double max_;
        private byte memoizedIsInitialized;
        private double min_;
        private static final Range DEFAULT_INSTANCE = new Range();
        private static final Parser<Range> PARSER = new AbstractParser<Range>() { // from class: com.google.api.Distribution.Range.1
            @Override // com.google.protobuf.Parser
            public Range parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Range.newBuilder();
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

        private Range(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.min_ = 0.0d;
            this.max_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Range() {
            this.min_ = 0.0d;
            this.max_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Range();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DistributionProto.internal_static_google_api_Distribution_Range_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DistributionProto.internal_static_google_api_Distribution_Range_fieldAccessorTable.ensureFieldAccessorsInitialized(Range.class, Builder.class);
        }

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMin() {
            return this.min_;
        }

        @Override // com.google.api.Distribution.RangeOrBuilder
        public double getMax() {
            return this.max_;
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
            if (Double.doubleToRawLongBits(this.min_) != 0) {
                codedOutputStream.writeDouble(1, this.min_);
            }
            if (Double.doubleToRawLongBits(this.max_) != 0) {
                codedOutputStream.writeDouble(2, this.max_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.min_) != 0 ? CodedOutputStream.computeDoubleSize(1, this.min_) : 0;
            if (Double.doubleToRawLongBits(this.max_) != 0) {
                iComputeDoubleSize += CodedOutputStream.computeDoubleSize(2, this.max_);
            }
            int serializedSize = iComputeDoubleSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return super.equals(obj);
            }
            Range range = (Range) obj;
            return Double.doubleToLongBits(getMin()) == Double.doubleToLongBits(range.getMin()) && Double.doubleToLongBits(getMax()) == Double.doubleToLongBits(range.getMax()) && getUnknownFields().equals(range.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getMin()))) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getMax()))) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Range parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Range parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Range parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Range) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Range range) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(range);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RangeOrBuilder {
            private int bitField0_;
            private double max_;
            private double min_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_Range_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_Range_fieldAccessorTable.ensureFieldAccessorsInitialized(Range.class, Builder.class);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.min_ = 0.0d;
                this.max_ = 0.0d;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DistributionProto.internal_static_google_api_Distribution_Range_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Range getDefaultInstanceForType() {
                return Range.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Range build() {
                Range rangeBuildPartial = buildPartial();
                if (rangeBuildPartial.isInitialized()) {
                    return rangeBuildPartial;
                }
                throw newUninitializedMessageException((Message) rangeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Range buildPartial() {
                Range range = new Range(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(range);
                }
                onBuilt();
                return range;
            }

            private void buildPartial0(Range range) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    range.min_ = this.min_;
                }
                if ((i & 2) != 0) {
                    range.max_ = this.max_;
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
                if (message instanceof Range) {
                    return mergeFrom((Range) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Range range) {
                if (range == Range.getDefaultInstance()) {
                    return this;
                }
                if (range.getMin() != 0.0d) {
                    setMin(range.getMin());
                }
                if (range.getMax() != 0.0d) {
                    setMax(range.getMax());
                }
                mergeUnknownFields(range.getUnknownFields());
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
                                if (tag == 9) {
                                    this.min_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 1;
                                } else if (tag == 17) {
                                    this.max_ = codedInputStream.readDouble();
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

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMin() {
                return this.min_;
            }

            public Builder setMin(double d) {
                this.min_ = d;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearMin() {
                this.bitField0_ &= -2;
                this.min_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.google.api.Distribution.RangeOrBuilder
            public double getMax() {
                return this.max_;
            }

            public Builder setMax(double d) {
                this.max_ = d;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearMax() {
                this.bitField0_ &= -3;
                this.max_ = 0.0d;
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

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Range> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Range> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Range getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class BucketOptions extends GeneratedMessageV3 implements BucketOptionsOrBuilder {
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int optionsCase_;
        private Object options_;
        private static final BucketOptions DEFAULT_INSTANCE = new BucketOptions();
        private static final Parser<BucketOptions> PARSER = new AbstractParser<BucketOptions>() { // from class: com.google.api.Distribution.BucketOptions.1
            @Override // com.google.protobuf.Parser
            public BucketOptions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BucketOptions.newBuilder();
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

        public interface ExplicitOrBuilder extends MessageOrBuilder {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();
        }

        public interface ExponentialOrBuilder extends MessageOrBuilder {
            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();
        }

        public interface LinearOrBuilder extends MessageOrBuilder {
            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();
        }

        private BucketOptions(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.optionsCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private BucketOptions() {
            this.optionsCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new BucketOptions();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DistributionProto.internal_static_google_api_Distribution_BucketOptions_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DistributionProto.internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(BucketOptions.class, Builder.class);
        }

        public static final class Linear extends GeneratedMessageV3 implements LinearOrBuilder {
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;
            private static final Linear DEFAULT_INSTANCE = new Linear();
            private static final Parser<Linear> PARSER = new AbstractParser<Linear>() { // from class: com.google.api.Distribution.BucketOptions.Linear.1
                @Override // com.google.protobuf.Parser
                public Linear parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Linear.newBuilder();
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

            private Linear(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.numFiniteBuckets_ = 0;
                this.width_ = 0.0d;
                this.offset_ = 0.0d;
                this.memoizedIsInitialized = (byte) -1;
            }

            private Linear() {
                this.numFiniteBuckets_ = 0;
                this.width_ = 0.0d;
                this.offset_ = 0.0d;
                this.memoizedIsInitialized = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Linear();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Linear_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable.ensureFieldAccessorsInitialized(Linear.class, Builder.class);
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getWidth() {
                return this.width_;
            }

            @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
            public double getOffset() {
                return this.offset_;
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
                int i = this.numFiniteBuckets_;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.width_) != 0) {
                    codedOutputStream.writeDouble(2, this.width_);
                }
                if (Double.doubleToRawLongBits(this.offset_) != 0) {
                    codedOutputStream.writeDouble(3, this.offset_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.numFiniteBuckets_;
                int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.width_) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.width_);
                }
                if (Double.doubleToRawLongBits(this.offset_) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.offset_);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Linear)) {
                    return super.equals(obj);
                }
                Linear linear = (Linear) obj;
                return getNumFiniteBuckets() == linear.getNumFiniteBuckets() && Double.doubleToLongBits(getWidth()) == Double.doubleToLongBits(linear.getWidth()) && Double.doubleToLongBits(getOffset()) == Double.doubleToLongBits(linear.getOffset()) && getUnknownFields().equals(linear.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getNumFiniteBuckets()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getWidth()))) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getOffset()))) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Linear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Linear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Linear) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Linear linear) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(linear);
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

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LinearOrBuilder {
                private int bitField0_;
                private int numFiniteBuckets_;
                private double offset_;
                private double width_;

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Linear_descriptor;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable.ensureFieldAccessorsInitialized(Linear.class, Builder.class);
                }

                private Builder() {
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.numFiniteBuckets_ = 0;
                    this.width_ = 0.0d;
                    this.offset_ = 0.0d;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Linear_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Linear getDefaultInstanceForType() {
                    return Linear.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Linear build() {
                    Linear linearBuildPartial = buildPartial();
                    if (linearBuildPartial.isInitialized()) {
                        return linearBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) linearBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Linear buildPartial() {
                    Linear linear = new Linear(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(linear);
                    }
                    onBuilt();
                    return linear;
                }

                private void buildPartial0(Linear linear) {
                    int i = this.bitField0_;
                    if ((i & 1) != 0) {
                        linear.numFiniteBuckets_ = this.numFiniteBuckets_;
                    }
                    if ((i & 2) != 0) {
                        linear.width_ = this.width_;
                    }
                    if ((i & 4) != 0) {
                        linear.offset_ = this.offset_;
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
                    if (message instanceof Linear) {
                        return mergeFrom((Linear) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Linear linear) {
                    if (linear == Linear.getDefaultInstance()) {
                        return this;
                    }
                    if (linear.getNumFiniteBuckets() != 0) {
                        setNumFiniteBuckets(linear.getNumFiniteBuckets());
                    }
                    if (linear.getWidth() != 0.0d) {
                        setWidth(linear.getWidth());
                    }
                    if (linear.getOffset() != 0.0d) {
                        setOffset(linear.getOffset());
                    }
                    mergeUnknownFields(linear.getUnknownFields());
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
                                        this.numFiniteBuckets_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 17) {
                                        this.width_ = codedInputStream.readDouble();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 25) {
                                        this.offset_ = codedInputStream.readDouble();
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

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public int getNumFiniteBuckets() {
                    return this.numFiniteBuckets_;
                }

                public Builder setNumFiniteBuckets(int i) {
                    this.numFiniteBuckets_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearNumFiniteBuckets() {
                    this.bitField0_ &= -2;
                    this.numFiniteBuckets_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getWidth() {
                    return this.width_;
                }

                public Builder setWidth(double d) {
                    this.width_ = d;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder clearWidth() {
                    this.bitField0_ &= -3;
                    this.width_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.LinearOrBuilder
                public double getOffset() {
                    return this.offset_;
                }

                public Builder setOffset(double d) {
                    this.offset_ = d;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder clearOffset() {
                    this.bitField0_ &= -5;
                    this.offset_ = 0.0d;
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

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Linear> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Linear> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Linear getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class Exponential extends GeneratedMessageV3 implements ExponentialOrBuilder {
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int SCALE_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private double growthFactor_;
            private byte memoizedIsInitialized;
            private int numFiniteBuckets_;
            private double scale_;
            private static final Exponential DEFAULT_INSTANCE = new Exponential();
            private static final Parser<Exponential> PARSER = new AbstractParser<Exponential>() { // from class: com.google.api.Distribution.BucketOptions.Exponential.1
                @Override // com.google.protobuf.Parser
                public Exponential parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Exponential.newBuilder();
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

            private Exponential(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.numFiniteBuckets_ = 0;
                this.growthFactor_ = 0.0d;
                this.scale_ = 0.0d;
                this.memoizedIsInitialized = (byte) -1;
            }

            private Exponential() {
                this.numFiniteBuckets_ = 0;
                this.growthFactor_ = 0.0d;
                this.scale_ = 0.0d;
                this.memoizedIsInitialized = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Exponential();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable.ensureFieldAccessorsInitialized(Exponential.class, Builder.class);
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
            public double getScale() {
                return this.scale_;
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
                int i = this.numFiniteBuckets_;
                if (i != 0) {
                    codedOutputStream.writeInt32(1, i);
                }
                if (Double.doubleToRawLongBits(this.growthFactor_) != 0) {
                    codedOutputStream.writeDouble(2, this.growthFactor_);
                }
                if (Double.doubleToRawLongBits(this.scale_) != 0) {
                    codedOutputStream.writeDouble(3, this.scale_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = this.numFiniteBuckets_;
                int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
                if (Double.doubleToRawLongBits(this.growthFactor_) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(2, this.growthFactor_);
                }
                if (Double.doubleToRawLongBits(this.scale_) != 0) {
                    iComputeInt32Size += CodedOutputStream.computeDoubleSize(3, this.scale_);
                }
                int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Exponential)) {
                    return super.equals(obj);
                }
                Exponential exponential = (Exponential) obj;
                return getNumFiniteBuckets() == exponential.getNumFiniteBuckets() && Double.doubleToLongBits(getGrowthFactor()) == Double.doubleToLongBits(exponential.getGrowthFactor()) && Double.doubleToLongBits(getScale()) == Double.doubleToLongBits(exponential.getScale()) && getUnknownFields().equals(exponential.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getNumFiniteBuckets()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getGrowthFactor()))) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getScale()))) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Exponential parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Exponential parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Exponential) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Exponential exponential) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(exponential);
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

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExponentialOrBuilder {
                private int bitField0_;
                private double growthFactor_;
                private int numFiniteBuckets_;
                private double scale_;

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable.ensureFieldAccessorsInitialized(Exponential.class, Builder.class);
                }

                private Builder() {
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.numFiniteBuckets_ = 0;
                    this.growthFactor_ = 0.0d;
                    this.scale_ = 0.0d;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Exponential getDefaultInstanceForType() {
                    return Exponential.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Exponential build() {
                    Exponential exponentialBuildPartial = buildPartial();
                    if (exponentialBuildPartial.isInitialized()) {
                        return exponentialBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) exponentialBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Exponential buildPartial() {
                    Exponential exponential = new Exponential(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(exponential);
                    }
                    onBuilt();
                    return exponential;
                }

                private void buildPartial0(Exponential exponential) {
                    int i = this.bitField0_;
                    if ((i & 1) != 0) {
                        exponential.numFiniteBuckets_ = this.numFiniteBuckets_;
                    }
                    if ((i & 2) != 0) {
                        exponential.growthFactor_ = this.growthFactor_;
                    }
                    if ((i & 4) != 0) {
                        exponential.scale_ = this.scale_;
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
                    if (message instanceof Exponential) {
                        return mergeFrom((Exponential) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Exponential exponential) {
                    if (exponential == Exponential.getDefaultInstance()) {
                        return this;
                    }
                    if (exponential.getNumFiniteBuckets() != 0) {
                        setNumFiniteBuckets(exponential.getNumFiniteBuckets());
                    }
                    if (exponential.getGrowthFactor() != 0.0d) {
                        setGrowthFactor(exponential.getGrowthFactor());
                    }
                    if (exponential.getScale() != 0.0d) {
                        setScale(exponential.getScale());
                    }
                    mergeUnknownFields(exponential.getUnknownFields());
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
                                        this.numFiniteBuckets_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 17) {
                                        this.growthFactor_ = codedInputStream.readDouble();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 25) {
                                        this.scale_ = codedInputStream.readDouble();
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

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public int getNumFiniteBuckets() {
                    return this.numFiniteBuckets_;
                }

                public Builder setNumFiniteBuckets(int i) {
                    this.numFiniteBuckets_ = i;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearNumFiniteBuckets() {
                    this.bitField0_ &= -2;
                    this.numFiniteBuckets_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getGrowthFactor() {
                    return this.growthFactor_;
                }

                public Builder setGrowthFactor(double d) {
                    this.growthFactor_ = d;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder clearGrowthFactor() {
                    this.bitField0_ &= -3;
                    this.growthFactor_ = 0.0d;
                    onChanged();
                    return this;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExponentialOrBuilder
                public double getScale() {
                    return this.scale_;
                }

                public Builder setScale(double d) {
                    this.scale_ = d;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder clearScale() {
                    this.bitField0_ &= -5;
                    this.scale_ = 0.0d;
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

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Exponential> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Exponential> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Exponential getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class Explicit extends GeneratedMessageV3 implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE = new Explicit();
            private static final Parser<Explicit> PARSER = new AbstractParser<Explicit>() { // from class: com.google.api.Distribution.BucketOptions.Explicit.1
                @Override // com.google.protobuf.Parser
                public Explicit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Explicit.newBuilder();
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
            private static final long serialVersionUID = 0;
            private int boundsMemoizedSerializedSize;
            private Internal.DoubleList bounds_;
            private byte memoizedIsInitialized;

            private Explicit(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.bounds_ = emptyDoubleList();
                this.boundsMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            private Explicit() {
                this.bounds_ = emptyDoubleList();
                this.boundsMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.bounds_ = emptyDoubleList();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Explicit();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable.ensureFieldAccessorsInitialized(Explicit.class, Builder.class);
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public int getBoundsCount() {
                return this.bounds_.size();
            }

            @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
            public double getBounds(int i) {
                return this.bounds_.getDouble(i);
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
                getSerializedSize();
                if (getBoundsList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(10);
                    codedOutputStream.writeUInt32NoTag(this.boundsMemoizedSerializedSize);
                }
                for (int i = 0; i < this.bounds_.size(); i++) {
                    codedOutputStream.writeDoubleNoTag(this.bounds_.getDouble(i));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int size = getBoundsList().size() * 8;
                int iComputeInt32SizeNoTag = !getBoundsList().isEmpty() ? size + 1 + CodedOutputStream.computeInt32SizeNoTag(size) : size;
                this.boundsMemoizedSerializedSize = size;
                int serializedSize = iComputeInt32SizeNoTag + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Explicit)) {
                    return super.equals(obj);
                }
                Explicit explicit = (Explicit) obj;
                return getBoundsList().equals(explicit.getBoundsList()) && getUnknownFields().equals(explicit.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getBoundsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getBoundsList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Explicit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Explicit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Explicit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Explicit explicit) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(explicit);
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

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExplicitOrBuilder {
                private int bitField0_;
                private Internal.DoubleList bounds_;

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable.ensureFieldAccessorsInitialized(Explicit.class, Builder.class);
                }

                private Builder() {
                    this.bounds_ = Explicit.emptyDoubleList();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.bounds_ = Explicit.emptyDoubleList();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.bounds_ = Explicit.emptyDoubleList();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return DistributionProto.internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Explicit getDefaultInstanceForType() {
                    return Explicit.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Explicit build() {
                    Explicit explicitBuildPartial = buildPartial();
                    if (explicitBuildPartial.isInitialized()) {
                        return explicitBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) explicitBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Explicit buildPartial() {
                    Explicit explicit = new Explicit(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(explicit);
                    }
                    onBuilt();
                    return explicit;
                }

                private void buildPartial0(Explicit explicit) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.bounds_.makeImmutable();
                        explicit.bounds_ = this.bounds_;
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
                    if (message instanceof Explicit) {
                        return mergeFrom((Explicit) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Explicit explicit) {
                    if (explicit == Explicit.getDefaultInstance()) {
                        return this;
                    }
                    if (!explicit.bounds_.isEmpty()) {
                        if (this.bounds_.isEmpty()) {
                            Internal.DoubleList doubleList = explicit.bounds_;
                            this.bounds_ = doubleList;
                            doubleList.makeImmutable();
                            this.bitField0_ |= 1;
                        } else {
                            ensureBoundsIsMutable();
                            this.bounds_.addAll(explicit.bounds_);
                        }
                        onChanged();
                    }
                    mergeUnknownFields(explicit.getUnknownFields());
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
                                    if (tag == 9) {
                                        double d = codedInputStream.readDouble();
                                        ensureBoundsIsMutable();
                                        this.bounds_.addDouble(d);
                                    } else if (tag == 10) {
                                        int rawVarint32 = codedInputStream.readRawVarint32();
                                        int iPushLimit = codedInputStream.pushLimit(rawVarint32);
                                        if (rawVarint32 > 4096) {
                                            rawVarint32 = 4096;
                                        }
                                        ensureBoundsIsMutable(rawVarint32 / 8);
                                        while (codedInputStream.getBytesUntilLimit() > 0) {
                                            this.bounds_.addDouble(codedInputStream.readDouble());
                                        }
                                        codedInputStream.popLimit(iPushLimit);
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

                private void ensureBoundsIsMutable() {
                    if (!this.bounds_.isModifiable()) {
                        this.bounds_ = (Internal.DoubleList) Explicit.makeMutableCopy(this.bounds_);
                    }
                    this.bitField0_ |= 1;
                }

                private void ensureBoundsIsMutable(int i) {
                    if (!this.bounds_.isModifiable()) {
                        this.bounds_ = (Internal.DoubleList) Explicit.makeMutableCopy(this.bounds_, i);
                    }
                    this.bitField0_ |= 1;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public List<Double> getBoundsList() {
                    this.bounds_.makeImmutable();
                    return this.bounds_;
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public int getBoundsCount() {
                    return this.bounds_.size();
                }

                @Override // com.google.api.Distribution.BucketOptions.ExplicitOrBuilder
                public double getBounds(int i) {
                    return this.bounds_.getDouble(i);
                }

                public Builder setBounds(int i, double d) {
                    ensureBoundsIsMutable();
                    this.bounds_.setDouble(i, d);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addBounds(double d) {
                    ensureBoundsIsMutable();
                    this.bounds_.addDouble(d);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder addAllBounds(Iterable<? extends Double> iterable) {
                    ensureBoundsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.bounds_);
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder clearBounds() {
                    this.bounds_ = Explicit.emptyDoubleList();
                    this.bitField0_ &= -2;
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

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Explicit> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Explicit> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Explicit getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public enum OptionsCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);

            private final int value;

            OptionsCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static OptionsCase valueOf(int i) {
                return forNumber(i);
            }

            public static OptionsCase forNumber(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public OptionsCase getOptionsCase() {
            return OptionsCase.forNumber(this.optionsCase_);
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public LinearOrBuilder getLinearBucketsOrBuilder() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public ExponentialOrBuilder getExponentialBucketsOrBuilder() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        @Override // com.google.api.Distribution.BucketOptionsOrBuilder
        public ExplicitOrBuilder getExplicitBucketsOrBuilder() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
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
            if (this.optionsCase_ == 1) {
                codedOutputStream.writeMessage(1, (Linear) this.options_);
            }
            if (this.optionsCase_ == 2) {
                codedOutputStream.writeMessage(2, (Exponential) this.options_);
            }
            if (this.optionsCase_ == 3) {
                codedOutputStream.writeMessage(3, (Explicit) this.options_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = this.optionsCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (Linear) this.options_) : 0;
            if (this.optionsCase_ == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (Exponential) this.options_);
            }
            if (this.optionsCase_ == 3) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (Explicit) this.options_);
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
            if (!(obj instanceof BucketOptions)) {
                return super.equals(obj);
            }
            BucketOptions bucketOptions = (BucketOptions) obj;
            if (!getOptionsCase().equals(bucketOptions.getOptionsCase())) {
                return false;
            }
            int i = this.optionsCase_;
            if (i != 1) {
                if (i == 2) {
                    if (!getExponentialBuckets().equals(bucketOptions.getExponentialBuckets())) {
                        return false;
                    }
                } else if (i == 3 && !getExplicitBuckets().equals(bucketOptions.getExplicitBuckets())) {
                    return false;
                }
            } else if (!getLinearBuckets().equals(bucketOptions.getLinearBuckets())) {
                return false;
            }
            return getUnknownFields().equals(bucketOptions.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i;
            int iHashCode;
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode2 = 779 + getDescriptor().hashCode();
            int i2 = this.optionsCase_;
            if (i2 == 1) {
                i = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getLinearBuckets().hashCode();
            } else if (i2 == 2) {
                i = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getExponentialBuckets().hashCode();
            } else {
                if (i2 == 3) {
                    i = ((iHashCode2 * 37) + 3) * 53;
                    iHashCode = getExplicitBuckets().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iHashCode2 = i + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bucketOptions);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BucketOptionsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> explicitBucketsBuilder_;
            private SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> exponentialBucketsBuilder_;
            private SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> linearBucketsBuilder_;
            private int optionsCase_;
            private Object options_;

            private void buildPartial0(BucketOptions bucketOptions) {
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable.ensureFieldAccessorsInitialized(BucketOptions.class, Builder.class);
            }

            private Builder() {
                this.optionsCase_ = 0;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.optionsCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.clear();
                }
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV32 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.clear();
                }
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV33 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.clear();
                }
                this.optionsCase_ = 0;
                this.options_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DistributionProto.internal_static_google_api_Distribution_BucketOptions_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BucketOptions getDefaultInstanceForType() {
                return BucketOptions.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BucketOptions build() {
                BucketOptions bucketOptionsBuildPartial = buildPartial();
                if (bucketOptionsBuildPartial.isInitialized()) {
                    return bucketOptionsBuildPartial;
                }
                throw newUninitializedMessageException((Message) bucketOptionsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BucketOptions buildPartial() {
                BucketOptions bucketOptions = new BucketOptions(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(bucketOptions);
                }
                buildPartialOneofs(bucketOptions);
                onBuilt();
                return bucketOptions;
            }

            private void buildPartialOneofs(BucketOptions bucketOptions) {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3;
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV32;
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV33;
                bucketOptions.optionsCase_ = this.optionsCase_;
                bucketOptions.options_ = this.options_;
                if (this.optionsCase_ == 1 && (singleFieldBuilderV33 = this.linearBucketsBuilder_) != null) {
                    bucketOptions.options_ = singleFieldBuilderV33.build();
                }
                if (this.optionsCase_ == 2 && (singleFieldBuilderV32 = this.exponentialBucketsBuilder_) != null) {
                    bucketOptions.options_ = singleFieldBuilderV32.build();
                }
                if (this.optionsCase_ != 3 || (singleFieldBuilderV3 = this.explicitBucketsBuilder_) == null) {
                    return;
                }
                bucketOptions.options_ = singleFieldBuilderV3.build();
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
                if (message instanceof BucketOptions) {
                    return mergeFrom((BucketOptions) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BucketOptions bucketOptions) {
                if (bucketOptions == BucketOptions.getDefaultInstance()) {
                    return this;
                }
                int i = AnonymousClass2.$SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase[bucketOptions.getOptionsCase().ordinal()];
                if (i == 1) {
                    mergeLinearBuckets(bucketOptions.getLinearBuckets());
                } else if (i == 2) {
                    mergeExponentialBuckets(bucketOptions.getExponentialBuckets());
                } else if (i == 3) {
                    mergeExplicitBuckets(bucketOptions.getExplicitBuckets());
                }
                mergeUnknownFields(bucketOptions.getUnknownFields());
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
                                    codedInputStream.readMessage(getLinearBucketsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.optionsCase_ = 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getExponentialBucketsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.optionsCase_ = 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getExplicitBucketsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.optionsCase_ = 3;
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

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public OptionsCase getOptionsCase() {
                return OptionsCase.forNumber(this.optionsCase_);
            }

            public Builder clearOptions() {
                this.optionsCase_ = 0;
                this.options_ = null;
                onChanged();
                return this;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasLinearBuckets() {
                return this.optionsCase_ == 1;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Linear getLinearBuckets() {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 1) {
                        return (Linear) this.options_;
                    }
                    return Linear.getDefaultInstance();
                }
                if (this.optionsCase_ == 1) {
                    return (Linear) singleFieldBuilderV3.getMessage();
                }
                return Linear.getDefaultInstance();
            }

            public Builder setLinearBuckets(Linear linear) {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    linear.getClass();
                    this.options_ = linear;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(linear);
                }
                this.optionsCase_ = 1;
                return this;
            }

            public Builder setLinearBuckets(Linear.Builder builder) {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.optionsCase_ = 1;
                return this;
            }

            public Builder mergeLinearBuckets(Linear linear) {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 1 && this.options_ != Linear.getDefaultInstance()) {
                        this.options_ = Linear.newBuilder((Linear) this.options_).mergeFrom(linear).buildPartial();
                    } else {
                        this.options_ = linear;
                    }
                    onChanged();
                } else if (this.optionsCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(linear);
                } else {
                    singleFieldBuilderV3.setMessage(linear);
                }
                this.optionsCase_ = 1;
                return this;
            }

            public Builder clearLinearBuckets() {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3 = this.linearBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 1) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                        onChanged();
                    }
                } else {
                    if (this.optionsCase_ == 1) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                    }
                    singleFieldBuilderV3.clear();
                }
                return this;
            }

            public Linear.Builder getLinearBucketsBuilder() {
                return (Linear.Builder) getLinearBucketsFieldBuilder().getBuilder();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public LinearOrBuilder getLinearBucketsOrBuilder() {
                SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> singleFieldBuilderV3;
                int i = this.optionsCase_;
                if (i == 1 && (singleFieldBuilderV3 = this.linearBucketsBuilder_) != null) {
                    return (LinearOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                if (i == 1) {
                    return (Linear) this.options_;
                }
                return Linear.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Linear, Linear.Builder, LinearOrBuilder> getLinearBucketsFieldBuilder() {
                if (this.linearBucketsBuilder_ == null) {
                    if (this.optionsCase_ != 1) {
                        this.options_ = Linear.getDefaultInstance();
                    }
                    this.linearBucketsBuilder_ = new SingleFieldBuilderV3<>((Linear) this.options_, getParentForChildren(), isClean());
                    this.options_ = null;
                }
                this.optionsCase_ = 1;
                onChanged();
                return this.linearBucketsBuilder_;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExponentialBuckets() {
                return this.optionsCase_ == 2;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Exponential getExponentialBuckets() {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 2) {
                        return (Exponential) this.options_;
                    }
                    return Exponential.getDefaultInstance();
                }
                if (this.optionsCase_ == 2) {
                    return (Exponential) singleFieldBuilderV3.getMessage();
                }
                return Exponential.getDefaultInstance();
            }

            public Builder setExponentialBuckets(Exponential exponential) {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    exponential.getClass();
                    this.options_ = exponential;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(exponential);
                }
                this.optionsCase_ = 2;
                return this;
            }

            public Builder setExponentialBuckets(Exponential.Builder builder) {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.optionsCase_ = 2;
                return this;
            }

            public Builder mergeExponentialBuckets(Exponential exponential) {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 2 && this.options_ != Exponential.getDefaultInstance()) {
                        this.options_ = Exponential.newBuilder((Exponential) this.options_).mergeFrom(exponential).buildPartial();
                    } else {
                        this.options_ = exponential;
                    }
                    onChanged();
                } else if (this.optionsCase_ == 2) {
                    singleFieldBuilderV3.mergeFrom(exponential);
                } else {
                    singleFieldBuilderV3.setMessage(exponential);
                }
                this.optionsCase_ = 2;
                return this;
            }

            public Builder clearExponentialBuckets() {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3 = this.exponentialBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 2) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                        onChanged();
                    }
                } else {
                    if (this.optionsCase_ == 2) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                    }
                    singleFieldBuilderV3.clear();
                }
                return this;
            }

            public Exponential.Builder getExponentialBucketsBuilder() {
                return (Exponential.Builder) getExponentialBucketsFieldBuilder().getBuilder();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public ExponentialOrBuilder getExponentialBucketsOrBuilder() {
                SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> singleFieldBuilderV3;
                int i = this.optionsCase_;
                if (i == 2 && (singleFieldBuilderV3 = this.exponentialBucketsBuilder_) != null) {
                    return (ExponentialOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                if (i == 2) {
                    return (Exponential) this.options_;
                }
                return Exponential.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Exponential, Exponential.Builder, ExponentialOrBuilder> getExponentialBucketsFieldBuilder() {
                if (this.exponentialBucketsBuilder_ == null) {
                    if (this.optionsCase_ != 2) {
                        this.options_ = Exponential.getDefaultInstance();
                    }
                    this.exponentialBucketsBuilder_ = new SingleFieldBuilderV3<>((Exponential) this.options_, getParentForChildren(), isClean());
                    this.options_ = null;
                }
                this.optionsCase_ = 2;
                onChanged();
                return this.exponentialBucketsBuilder_;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public boolean hasExplicitBuckets() {
                return this.optionsCase_ == 3;
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public Explicit getExplicitBuckets() {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 3) {
                        return (Explicit) this.options_;
                    }
                    return Explicit.getDefaultInstance();
                }
                if (this.optionsCase_ == 3) {
                    return (Explicit) singleFieldBuilderV3.getMessage();
                }
                return Explicit.getDefaultInstance();
            }

            public Builder setExplicitBuckets(Explicit explicit) {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    explicit.getClass();
                    this.options_ = explicit;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(explicit);
                }
                this.optionsCase_ = 3;
                return this;
            }

            public Builder setExplicitBuckets(Explicit.Builder builder) {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.options_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.optionsCase_ = 3;
                return this;
            }

            public Builder mergeExplicitBuckets(Explicit explicit) {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 3 && this.options_ != Explicit.getDefaultInstance()) {
                        this.options_ = Explicit.newBuilder((Explicit) this.options_).mergeFrom(explicit).buildPartial();
                    } else {
                        this.options_ = explicit;
                    }
                    onChanged();
                } else if (this.optionsCase_ == 3) {
                    singleFieldBuilderV3.mergeFrom(explicit);
                } else {
                    singleFieldBuilderV3.setMessage(explicit);
                }
                this.optionsCase_ = 3;
                return this;
            }

            public Builder clearExplicitBuckets() {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3 = this.explicitBucketsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if (this.optionsCase_ == 3) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                        onChanged();
                    }
                } else {
                    if (this.optionsCase_ == 3) {
                        this.optionsCase_ = 0;
                        this.options_ = null;
                    }
                    singleFieldBuilderV3.clear();
                }
                return this;
            }

            public Explicit.Builder getExplicitBucketsBuilder() {
                return (Explicit.Builder) getExplicitBucketsFieldBuilder().getBuilder();
            }

            @Override // com.google.api.Distribution.BucketOptionsOrBuilder
            public ExplicitOrBuilder getExplicitBucketsOrBuilder() {
                SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> singleFieldBuilderV3;
                int i = this.optionsCase_;
                if (i == 3 && (singleFieldBuilderV3 = this.explicitBucketsBuilder_) != null) {
                    return (ExplicitOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                if (i == 3) {
                    return (Explicit) this.options_;
                }
                return Explicit.getDefaultInstance();
            }

            private SingleFieldBuilderV3<Explicit, Explicit.Builder, ExplicitOrBuilder> getExplicitBucketsFieldBuilder() {
                if (this.explicitBucketsBuilder_ == null) {
                    if (this.optionsCase_ != 3) {
                        this.options_ = Explicit.getDefaultInstance();
                    }
                    this.explicitBucketsBuilder_ = new SingleFieldBuilderV3<>((Explicit) this.options_, getParentForChildren(), isClean());
                    this.options_ = null;
                }
                this.optionsCase_ = 3;
                onChanged();
                return this.explicitBucketsBuilder_;
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

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BucketOptions> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BucketOptions> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BucketOptions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.api.Distribution$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase;

        static {
            int[] iArr = new int[BucketOptions.OptionsCase.values().length];
            $SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase = iArr;
            try {
                iArr[BucketOptions.OptionsCase.LINEAR_BUCKETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase[BucketOptions.OptionsCase.EXPONENTIAL_BUCKETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase[BucketOptions.OptionsCase.EXPLICIT_BUCKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase[BucketOptions.OptionsCase.OPTIONS_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Exemplar extends GeneratedMessageV3 implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE = new Exemplar();
        private static final Parser<Exemplar> PARSER = new AbstractParser<Exemplar>() { // from class: com.google.api.Distribution.Exemplar.1
            @Override // com.google.protobuf.Parser
            public Exemplar parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Exemplar.newBuilder();
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
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Any> attachments_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Timestamp timestamp_;
        private double value_;

        static /* synthetic */ int access$3876(Exemplar exemplar, int i) {
            int i2 = i | exemplar.bitField0_;
            exemplar.bitField0_ = i2;
            return i2;
        }

        private Exemplar(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.value_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Exemplar() {
            this.value_ = 0.0d;
            this.memoizedIsInitialized = (byte) -1;
            this.attachments_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Exemplar();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DistributionProto.internal_static_google_api_Distribution_Exemplar_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DistributionProto.internal_static_google_api_Distribution_Exemplar_fieldAccessorTable.ensureFieldAccessorsInitialized(Exemplar.class, Builder.class);
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public double getValue() {
            return this.value_;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public TimestampOrBuilder getTimestampOrBuilder() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public List<? extends AnyOrBuilder> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public Any getAttachments(int i) {
            return this.attachments_.get(i);
        }

        @Override // com.google.api.Distribution.ExemplarOrBuilder
        public AnyOrBuilder getAttachmentsOrBuilder(int i) {
            return this.attachments_.get(i);
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
            if (Double.doubleToRawLongBits(this.value_) != 0) {
                codedOutputStream.writeDouble(1, this.value_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getTimestamp());
            }
            for (int i = 0; i < this.attachments_.size(); i++) {
                codedOutputStream.writeMessage(3, this.attachments_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeDoubleSize = Double.doubleToRawLongBits(this.value_) != 0 ? CodedOutputStream.computeDoubleSize(1, this.value_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(2, getTimestamp());
            }
            for (int i2 = 0; i2 < this.attachments_.size(); i2++) {
                iComputeDoubleSize += CodedOutputStream.computeMessageSize(3, this.attachments_.get(i2));
            }
            int serializedSize = iComputeDoubleSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Exemplar)) {
                return super.equals(obj);
            }
            Exemplar exemplar = (Exemplar) obj;
            if (Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(exemplar.getValue()) && hasTimestamp() == exemplar.hasTimestamp()) {
                return (!hasTimestamp() || getTimestamp().equals(exemplar.getTimestamp())) && getAttachmentsList().equals(exemplar.getAttachmentsList()) && getUnknownFields().equals(exemplar.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(Double.doubleToLongBits(getValue()));
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getTimestamp().hashCode();
            }
            if (getAttachmentsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAttachmentsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Exemplar exemplar) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(exemplar);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExemplarOrBuilder {
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> attachmentsBuilder_;
            private List<Any> attachments_;
            private int bitField0_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> timestampBuilder_;
            private Timestamp timestamp_;
            private double value_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DistributionProto.internal_static_google_api_Distribution_Exemplar_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DistributionProto.internal_static_google_api_Distribution_Exemplar_fieldAccessorTable.ensureFieldAccessorsInitialized(Exemplar.class, Builder.class);
            }

            private Builder() {
                this.attachments_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.attachments_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Exemplar.alwaysUseFieldBuilders) {
                    getTimestampFieldBuilder();
                    getAttachmentsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.value_ = 0.0d;
                this.timestamp_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timestampBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.attachments_ = Collections.emptyList();
                } else {
                    this.attachments_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DistributionProto.internal_static_google_api_Distribution_Exemplar_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Exemplar getDefaultInstanceForType() {
                return Exemplar.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Exemplar build() {
                Exemplar exemplarBuildPartial = buildPartial();
                if (exemplarBuildPartial.isInitialized()) {
                    return exemplarBuildPartial;
                }
                throw newUninitializedMessageException((Message) exemplarBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Exemplar buildPartial() {
                Exemplar exemplar = new Exemplar(this);
                buildPartialRepeatedFields(exemplar);
                if (this.bitField0_ != 0) {
                    buildPartial0(exemplar);
                }
                onBuilt();
                return exemplar;
            }

            private void buildPartialRepeatedFields(Exemplar exemplar) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    exemplar.attachments_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.attachments_ = Collections.unmodifiableList(this.attachments_);
                    this.bitField0_ &= -5;
                }
                exemplar.attachments_ = this.attachments_;
            }

            private void buildPartial0(Exemplar exemplar) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    exemplar.value_ = this.value_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                    exemplar.timestamp_ = singleFieldBuilderV3 == null ? this.timestamp_ : (Timestamp) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                Exemplar.access$3876(exemplar, i);
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
                if (message instanceof Exemplar) {
                    return mergeFrom((Exemplar) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Exemplar exemplar) {
                if (exemplar == Exemplar.getDefaultInstance()) {
                    return this;
                }
                if (exemplar.getValue() != 0.0d) {
                    setValue(exemplar.getValue());
                }
                if (exemplar.hasTimestamp()) {
                    mergeTimestamp(exemplar.getTimestamp());
                }
                if (this.attachmentsBuilder_ == null) {
                    if (!exemplar.attachments_.isEmpty()) {
                        if (this.attachments_.isEmpty()) {
                            this.attachments_ = exemplar.attachments_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureAttachmentsIsMutable();
                            this.attachments_.addAll(exemplar.attachments_);
                        }
                        onChanged();
                    }
                } else if (!exemplar.attachments_.isEmpty()) {
                    if (!this.attachmentsBuilder_.isEmpty()) {
                        this.attachmentsBuilder_.addAllMessages(exemplar.attachments_);
                    } else {
                        this.attachmentsBuilder_.dispose();
                        this.attachmentsBuilder_ = null;
                        this.attachments_ = exemplar.attachments_;
                        this.bitField0_ &= -5;
                        this.attachmentsBuilder_ = Exemplar.alwaysUseFieldBuilders ? getAttachmentsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(exemplar.getUnknownFields());
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
                                if (tag == 9) {
                                    this.value_ = codedInputStream.readDouble();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTimestampFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    Any any = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAttachmentsIsMutable();
                                        this.attachments_.add(any);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(any);
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

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public double getValue() {
                return this.value_;
            }

            public Builder setValue(double d) {
                this.value_ = d;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -2;
                this.value_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public Timestamp getTimestamp() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.timestamp_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setTimestamp(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.timestamp_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.timestamp_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0 && (timestamp2 = this.timestamp_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getTimestampBuilder().mergeFrom(timestamp);
                    } else {
                        this.timestamp_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.timestamp_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -3;
                this.timestamp_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timestampBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getTimestampBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().getBuilder();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public TimestampOrBuilder getTimestampOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timestampBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new SingleFieldBuilderV3<>(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            private void ensureAttachmentsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.attachments_ = new ArrayList(this.attachments_);
                    this.bitField0_ |= 4;
                }
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public List<Any> getAttachmentsList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.attachments_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public int getAttachmentsCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.attachments_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public Any getAttachments(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.attachments_.get(i);
                }
                return (Any) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setAttachments(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureAttachmentsIsMutable();
                    this.attachments_.set(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, any);
                }
                return this;
            }

            public Builder setAttachments(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttachmentsIsMutable();
                    this.attachments_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAttachments(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureAttachmentsIsMutable();
                    this.attachments_.add(any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(any);
                }
                return this;
            }

            public Builder addAttachments(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    any.getClass();
                    ensureAttachmentsIsMutable();
                    this.attachments_.add(i, any);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, any);
                }
                return this;
            }

            public Builder addAttachments(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttachmentsIsMutable();
                    this.attachments_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAttachments(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttachmentsIsMutable();
                    this.attachments_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllAttachments(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttachmentsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.attachments_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearAttachments() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.attachments_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeAttachments(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttachmentsIsMutable();
                    this.attachments_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getAttachmentsBuilder(int i) {
                return (Any.Builder) getAttachmentsFieldBuilder().getBuilder(i);
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public AnyOrBuilder getAttachmentsOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.attachments_.get(i);
                }
                return (AnyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.google.api.Distribution.ExemplarOrBuilder
            public List<? extends AnyOrBuilder> getAttachmentsOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.attachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.attachments_);
            }

            public Any.Builder addAttachmentsBuilder() {
                return (Any.Builder) getAttachmentsFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addAttachmentsBuilder(int i) {
                return (Any.Builder) getAttachmentsFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getAttachmentsBuilderList() {
                return getAttachmentsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getAttachmentsFieldBuilder() {
                if (this.attachmentsBuilder_ == null) {
                    this.attachmentsBuilder_ = new RepeatedFieldBuilderV3<>(this.attachments_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.attachments_ = null;
                }
                return this.attachmentsBuilder_;
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

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Exemplar> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Exemplar> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Exemplar getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.api.DistributionOrBuilder
    public long getCount() {
        return this.count_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getMean() {
        return this.mean_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasRange() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.DistributionOrBuilder
    public Range getRange() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    @Override // com.google.api.DistributionOrBuilder
    public RangeOrBuilder getRangeOrBuilder() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    @Override // com.google.api.DistributionOrBuilder
    public boolean hasBucketOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.api.DistributionOrBuilder
    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    @Override // com.google.api.DistributionOrBuilder
    public BucketOptionsOrBuilder getBucketOptionsOrBuilder() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    @Override // com.google.api.DistributionOrBuilder
    public long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    @Override // com.google.api.DistributionOrBuilder
    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    @Override // com.google.api.DistributionOrBuilder
    public Exemplar getExemplars(int i) {
        return this.exemplars_.get(i);
    }

    @Override // com.google.api.DistributionOrBuilder
    public ExemplarOrBuilder getExemplarsOrBuilder(int i) {
        return this.exemplars_.get(i);
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
        getSerializedSize();
        long j = this.count_;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (Double.doubleToRawLongBits(this.mean_) != 0) {
            codedOutputStream.writeDouble(2, this.mean_);
        }
        if (Double.doubleToRawLongBits(this.sumOfSquaredDeviation_) != 0) {
            codedOutputStream.writeDouble(3, this.sumOfSquaredDeviation_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(4, getRange());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(6, getBucketOptions());
        }
        if (getBucketCountsList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(58);
            codedOutputStream.writeUInt32NoTag(this.bucketCountsMemoizedSerializedSize);
        }
        for (int i = 0; i < this.bucketCounts_.size(); i++) {
            codedOutputStream.writeInt64NoTag(this.bucketCounts_.getLong(i));
        }
        for (int i2 = 0; i2 < this.exemplars_.size(); i2++) {
            codedOutputStream.writeMessage(10, this.exemplars_.get(i2));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.count_;
        int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
        if (Double.doubleToRawLongBits(this.mean_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(2, this.mean_);
        }
        if (Double.doubleToRawLongBits(this.sumOfSquaredDeviation_) != 0) {
            iComputeInt64Size += CodedOutputStream.computeDoubleSize(3, this.sumOfSquaredDeviation_);
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(4, getRange());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeInt64Size += CodedOutputStream.computeMessageSize(6, getBucketOptions());
        }
        int iComputeInt64SizeNoTag = 0;
        for (int i2 = 0; i2 < this.bucketCounts_.size(); i2++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(this.bucketCounts_.getLong(i2));
        }
        int iComputeMessageSize = iComputeInt64Size + iComputeInt64SizeNoTag;
        if (!getBucketCountsList().isEmpty()) {
            iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt64SizeNoTag);
        }
        this.bucketCountsMemoizedSerializedSize = iComputeInt64SizeNoTag;
        for (int i3 = 0; i3 < this.exemplars_.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(10, this.exemplars_.get(i3));
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
        if (!(obj instanceof Distribution)) {
            return super.equals(obj);
        }
        Distribution distribution = (Distribution) obj;
        if (getCount() != distribution.getCount() || Double.doubleToLongBits(getMean()) != Double.doubleToLongBits(distribution.getMean()) || Double.doubleToLongBits(getSumOfSquaredDeviation()) != Double.doubleToLongBits(distribution.getSumOfSquaredDeviation()) || hasRange() != distribution.hasRange()) {
            return false;
        }
        if ((!hasRange() || getRange().equals(distribution.getRange())) && hasBucketOptions() == distribution.hasBucketOptions()) {
            return (!hasBucketOptions() || getBucketOptions().equals(distribution.getBucketOptions())) && getBucketCountsList().equals(distribution.getBucketCountsList()) && getExemplarsList().equals(distribution.getExemplarsList()) && getUnknownFields().equals(distribution.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getCount())) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getMean()))) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getSumOfSquaredDeviation()));
        if (hasRange()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getRange().hashCode();
        }
        if (hasBucketOptions()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getBucketOptions().hashCode();
        }
        if (getBucketCountsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getBucketCountsList().hashCode();
        }
        if (getExemplarsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + getExemplarsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Distribution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Distribution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Distribution) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Distribution distribution) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(distribution);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DistributionOrBuilder {
        private int bitField0_;
        private Internal.LongList bucketCounts_;
        private SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> bucketOptionsBuilder_;
        private BucketOptions bucketOptions_;
        private long count_;
        private RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> exemplarsBuilder_;
        private List<Exemplar> exemplars_;
        private double mean_;
        private SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> rangeBuilder_;
        private Range range_;
        private double sumOfSquaredDeviation_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DistributionProto.internal_static_google_api_Distribution_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DistributionProto.internal_static_google_api_Distribution_fieldAccessorTable.ensureFieldAccessorsInitialized(Distribution.class, Builder.class);
        }

        private Builder() {
            this.bucketCounts_ = Distribution.emptyLongList();
            this.exemplars_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.bucketCounts_ = Distribution.emptyLongList();
            this.exemplars_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Distribution.alwaysUseFieldBuilders) {
                getRangeFieldBuilder();
                getBucketOptionsFieldBuilder();
                getExemplarsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.count_ = 0L;
            this.mean_ = 0.0d;
            this.sumOfSquaredDeviation_ = 0.0d;
            this.range_ = null;
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.rangeBuilder_ = null;
            }
            this.bucketOptions_ = null;
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV32 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.bucketOptionsBuilder_ = null;
            }
            this.bucketCounts_ = Distribution.emptyLongList();
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.exemplars_ = Collections.emptyList();
            } else {
                this.exemplars_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -65;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return DistributionProto.internal_static_google_api_Distribution_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Distribution getDefaultInstanceForType() {
            return Distribution.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Distribution build() {
            Distribution distributionBuildPartial = buildPartial();
            if (distributionBuildPartial.isInitialized()) {
                return distributionBuildPartial;
            }
            throw newUninitializedMessageException((Message) distributionBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Distribution buildPartial() {
            Distribution distribution = new Distribution(this);
            buildPartialRepeatedFields(distribution);
            if (this.bitField0_ != 0) {
                buildPartial0(distribution);
            }
            onBuilt();
            return distribution;
        }

        private void buildPartialRepeatedFields(Distribution distribution) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                distribution.exemplars_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 64) != 0) {
                this.exemplars_ = Collections.unmodifiableList(this.exemplars_);
                this.bitField0_ &= -65;
            }
            distribution.exemplars_ = this.exemplars_;
        }

        private void buildPartial0(Distribution distribution) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                distribution.count_ = this.count_;
            }
            if ((i2 & 2) != 0) {
                distribution.mean_ = this.mean_;
            }
            if ((i2 & 4) != 0) {
                distribution.sumOfSquaredDeviation_ = this.sumOfSquaredDeviation_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
                distribution.range_ = singleFieldBuilderV3 == null ? this.range_ : (Range) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV32 = this.bucketOptionsBuilder_;
                distribution.bucketOptions_ = singleFieldBuilderV32 == null ? this.bucketOptions_ : (BucketOptions) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 32) != 0) {
                this.bucketCounts_.makeImmutable();
                distribution.bucketCounts_ = this.bucketCounts_;
            }
            Distribution.access$5276(distribution, i);
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
            if (message instanceof Distribution) {
                return mergeFrom((Distribution) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Distribution distribution) {
            if (distribution == Distribution.getDefaultInstance()) {
                return this;
            }
            if (distribution.getCount() != 0) {
                setCount(distribution.getCount());
            }
            if (distribution.getMean() != 0.0d) {
                setMean(distribution.getMean());
            }
            if (distribution.getSumOfSquaredDeviation() != 0.0d) {
                setSumOfSquaredDeviation(distribution.getSumOfSquaredDeviation());
            }
            if (distribution.hasRange()) {
                mergeRange(distribution.getRange());
            }
            if (distribution.hasBucketOptions()) {
                mergeBucketOptions(distribution.getBucketOptions());
            }
            if (!distribution.bucketCounts_.isEmpty()) {
                if (this.bucketCounts_.isEmpty()) {
                    Internal.LongList longList = distribution.bucketCounts_;
                    this.bucketCounts_ = longList;
                    longList.makeImmutable();
                    this.bitField0_ |= 32;
                } else {
                    ensureBucketCountsIsMutable();
                    this.bucketCounts_.addAll(distribution.bucketCounts_);
                }
                onChanged();
            }
            if (this.exemplarsBuilder_ == null) {
                if (!distribution.exemplars_.isEmpty()) {
                    if (this.exemplars_.isEmpty()) {
                        this.exemplars_ = distribution.exemplars_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureExemplarsIsMutable();
                        this.exemplars_.addAll(distribution.exemplars_);
                    }
                    onChanged();
                }
            } else if (!distribution.exemplars_.isEmpty()) {
                if (!this.exemplarsBuilder_.isEmpty()) {
                    this.exemplarsBuilder_.addAllMessages(distribution.exemplars_);
                } else {
                    this.exemplarsBuilder_.dispose();
                    this.exemplarsBuilder_ = null;
                    this.exemplars_ = distribution.exemplars_;
                    this.bitField0_ &= -65;
                    this.exemplarsBuilder_ = Distribution.alwaysUseFieldBuilders ? getExemplarsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(distribution.getUnknownFields());
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
                                this.count_ = codedInputStream.readInt64();
                                this.bitField0_ |= 1;
                            } else if (tag == 17) {
                                this.mean_ = codedInputStream.readDouble();
                                this.bitField0_ |= 2;
                            } else if (tag == 25) {
                                this.sumOfSquaredDeviation_ = codedInputStream.readDouble();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getRangeFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 50) {
                                codedInputStream.readMessage(getBucketOptionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 56) {
                                long int64 = codedInputStream.readInt64();
                                ensureBucketCountsIsMutable();
                                this.bucketCounts_.addLong(int64);
                            } else if (tag == 58) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                ensureBucketCountsIsMutable();
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.bucketCounts_.addLong(codedInputStream.readInt64());
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag == 82) {
                                Exemplar exemplar = (Exemplar) codedInputStream.readMessage(Exemplar.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureExemplarsIsMutable();
                                    this.exemplars_.add(exemplar);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(exemplar);
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

        @Override // com.google.api.DistributionOrBuilder
        public long getCount() {
            return this.count_;
        }

        public Builder setCount(long j) {
            this.count_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getMean() {
            return this.mean_;
        }

        public Builder setMean(double d) {
            this.mean_ = d;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearMean() {
            this.bitField0_ &= -3;
            this.mean_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.api.DistributionOrBuilder
        public double getSumOfSquaredDeviation() {
            return this.sumOfSquaredDeviation_;
        }

        public Builder setSumOfSquaredDeviation(double d) {
            this.sumOfSquaredDeviation_ = d;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearSumOfSquaredDeviation() {
            this.bitField0_ &= -5;
            this.sumOfSquaredDeviation_ = 0.0d;
            onChanged();
            return this;
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasRange() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.api.DistributionOrBuilder
        public Range getRange() {
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Range range = this.range_;
                return range == null ? Range.getDefaultInstance() : range;
            }
            return (Range) singleFieldBuilderV3.getMessage();
        }

        public Builder setRange(Range range) {
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 == null) {
                range.getClass();
                this.range_ = range;
            } else {
                singleFieldBuilderV3.setMessage(range);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setRange(Range.Builder builder) {
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.range_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeRange(Range range) {
            Range range2;
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (range2 = this.range_) != null && range2 != Range.getDefaultInstance()) {
                    getRangeBuilder().mergeFrom(range);
                } else {
                    this.range_ = range;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(range);
            }
            if (this.range_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearRange() {
            this.bitField0_ &= -9;
            this.range_ = null;
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.rangeBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Range.Builder getRangeBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (Range.Builder) getRangeFieldBuilder().getBuilder();
        }

        @Override // com.google.api.DistributionOrBuilder
        public RangeOrBuilder getRangeOrBuilder() {
            SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> singleFieldBuilderV3 = this.rangeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RangeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Range range = this.range_;
            return range == null ? Range.getDefaultInstance() : range;
        }

        private SingleFieldBuilderV3<Range, Range.Builder, RangeOrBuilder> getRangeFieldBuilder() {
            if (this.rangeBuilder_ == null) {
                this.rangeBuilder_ = new SingleFieldBuilderV3<>(getRange(), getParentForChildren(), isClean());
                this.range_ = null;
            }
            return this.rangeBuilder_;
        }

        @Override // com.google.api.DistributionOrBuilder
        public boolean hasBucketOptions() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.api.DistributionOrBuilder
        public BucketOptions getBucketOptions() {
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                BucketOptions bucketOptions = this.bucketOptions_;
                return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
            }
            return (BucketOptions) singleFieldBuilderV3.getMessage();
        }

        public Builder setBucketOptions(BucketOptions bucketOptions) {
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                bucketOptions.getClass();
                this.bucketOptions_ = bucketOptions;
            } else {
                singleFieldBuilderV3.setMessage(bucketOptions);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setBucketOptions(BucketOptions.Builder builder) {
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.bucketOptions_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeBucketOptions(BucketOptions bucketOptions) {
            BucketOptions bucketOptions2;
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (bucketOptions2 = this.bucketOptions_) != null && bucketOptions2 != BucketOptions.getDefaultInstance()) {
                    getBucketOptionsBuilder().mergeFrom(bucketOptions);
                } else {
                    this.bucketOptions_ = bucketOptions;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(bucketOptions);
            }
            if (this.bucketOptions_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearBucketOptions() {
            this.bitField0_ &= -17;
            this.bucketOptions_ = null;
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.bucketOptionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public BucketOptions.Builder getBucketOptionsBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (BucketOptions.Builder) getBucketOptionsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.DistributionOrBuilder
        public BucketOptionsOrBuilder getBucketOptionsOrBuilder() {
            SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> singleFieldBuilderV3 = this.bucketOptionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (BucketOptionsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            BucketOptions bucketOptions = this.bucketOptions_;
            return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
        }

        private SingleFieldBuilderV3<BucketOptions, BucketOptions.Builder, BucketOptionsOrBuilder> getBucketOptionsFieldBuilder() {
            if (this.bucketOptionsBuilder_ == null) {
                this.bucketOptionsBuilder_ = new SingleFieldBuilderV3<>(getBucketOptions(), getParentForChildren(), isClean());
                this.bucketOptions_ = null;
            }
            return this.bucketOptionsBuilder_;
        }

        private void ensureBucketCountsIsMutable() {
            if (!this.bucketCounts_.isModifiable()) {
                this.bucketCounts_ = (Internal.LongList) Distribution.makeMutableCopy(this.bucketCounts_);
            }
            this.bitField0_ |= 32;
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Long> getBucketCountsList() {
            this.bucketCounts_.makeImmutable();
            return this.bucketCounts_;
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getBucketCountsCount() {
            return this.bucketCounts_.size();
        }

        @Override // com.google.api.DistributionOrBuilder
        public long getBucketCounts(int i) {
            return this.bucketCounts_.getLong(i);
        }

        public Builder setBucketCounts(int i, long j) {
            ensureBucketCountsIsMutable();
            this.bucketCounts_.setLong(i, j);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addBucketCounts(long j) {
            ensureBucketCountsIsMutable();
            this.bucketCounts_.addLong(j);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
            ensureBucketCountsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.bucketCounts_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearBucketCounts() {
            this.bucketCounts_ = Distribution.emptyLongList();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        private void ensureExemplarsIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.exemplars_ = new ArrayList(this.exemplars_);
                this.bitField0_ |= 64;
            }
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<Exemplar> getExemplarsList() {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.exemplars_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.DistributionOrBuilder
        public int getExemplarsCount() {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.exemplars_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.DistributionOrBuilder
        public Exemplar getExemplars(int i) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.exemplars_.get(i);
            }
            return (Exemplar) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setExemplars(int i, Exemplar exemplar) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                exemplar.getClass();
                ensureExemplarsIsMutable();
                this.exemplars_.set(i, exemplar);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, exemplar);
            }
            return this;
        }

        public Builder setExemplars(int i, Exemplar.Builder builder) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExemplarsIsMutable();
                this.exemplars_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addExemplars(Exemplar exemplar) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                exemplar.getClass();
                ensureExemplarsIsMutable();
                this.exemplars_.add(exemplar);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(exemplar);
            }
            return this;
        }

        public Builder addExemplars(int i, Exemplar exemplar) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                exemplar.getClass();
                ensureExemplarsIsMutable();
                this.exemplars_.add(i, exemplar);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, exemplar);
            }
            return this;
        }

        public Builder addExemplars(Exemplar.Builder builder) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExemplarsIsMutable();
                this.exemplars_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addExemplars(int i, Exemplar.Builder builder) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExemplarsIsMutable();
                this.exemplars_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllExemplars(Iterable<? extends Exemplar> iterable) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExemplarsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.exemplars_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearExemplars() {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.exemplars_ = Collections.emptyList();
                this.bitField0_ &= -65;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeExemplars(int i) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExemplarsIsMutable();
                this.exemplars_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Exemplar.Builder getExemplarsBuilder(int i) {
            return (Exemplar.Builder) getExemplarsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.DistributionOrBuilder
        public ExemplarOrBuilder getExemplarsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.exemplars_.get(i);
            }
            return (ExemplarOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.DistributionOrBuilder
        public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
            RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> repeatedFieldBuilderV3 = this.exemplarsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.exemplars_);
        }

        public Exemplar.Builder addExemplarsBuilder() {
            return (Exemplar.Builder) getExemplarsFieldBuilder().addBuilder(Exemplar.getDefaultInstance());
        }

        public Exemplar.Builder addExemplarsBuilder(int i) {
            return (Exemplar.Builder) getExemplarsFieldBuilder().addBuilder(i, Exemplar.getDefaultInstance());
        }

        public List<Exemplar.Builder> getExemplarsBuilderList() {
            return getExemplarsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Exemplar, Exemplar.Builder, ExemplarOrBuilder> getExemplarsFieldBuilder() {
            if (this.exemplarsBuilder_ == null) {
                this.exemplarsBuilder_ = new RepeatedFieldBuilderV3<>(this.exemplars_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                this.exemplars_ = null;
            }
            return this.exemplarsBuilder_;
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

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Distribution> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Distribution> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Distribution getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
