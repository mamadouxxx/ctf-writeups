package com.google.shopping.type;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Weight extends GeneratedMessageV3 implements WeightOrBuilder {
    public static final int AMOUNT_MICROS_FIELD_NUMBER = 1;
    private static final Weight DEFAULT_INSTANCE = new Weight();
    private static final Parser<Weight> PARSER = new AbstractParser<Weight>() { // from class: com.google.shopping.type.Weight.1
        @Override // com.google.protobuf.Parser
        public Weight parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Weight.newBuilder();
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
    public static final int UNIT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private long amountMicros_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int unit_;

    static /* synthetic */ int access$576(Weight weight, int i) {
        int i2 = i | weight.bitField0_;
        weight.bitField0_ = i2;
        return i2;
    }

    private Weight(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.amountMicros_ = 0L;
        this.unit_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Weight() {
        this.amountMicros_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.unit_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Weight();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypesProto.internal_static_google_shopping_type_Weight_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypesProto.internal_static_google_shopping_type_Weight_fieldAccessorTable.ensureFieldAccessorsInitialized(Weight.class, Builder.class);
    }

    public enum WeightUnit implements ProtocolMessageEnum {
        WEIGHT_UNIT_UNSPECIFIED(0),
        POUND(1),
        KILOGRAM(2),
        UNRECOGNIZED(-1);

        public static final int KILOGRAM_VALUE = 2;
        public static final int POUND_VALUE = 1;
        public static final int WEIGHT_UNIT_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WeightUnit> internalValueMap = new Internal.EnumLiteMap<WeightUnit>() { // from class: com.google.shopping.type.Weight.WeightUnit.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WeightUnit findValueByNumber(int i) {
                return WeightUnit.forNumber(i);
            }
        };
        private static final WeightUnit[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static WeightUnit valueOf(int i) {
            return forNumber(i);
        }

        public static WeightUnit forNumber(int i) {
            if (i == 0) {
                return WEIGHT_UNIT_UNSPECIFIED;
            }
            if (i == 1) {
                return POUND;
            }
            if (i != 2) {
                return null;
            }
            return KILOGRAM;
        }

        public static Internal.EnumLiteMap<WeightUnit> internalGetValueMap() {
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
            return Weight.getDescriptor().getEnumTypes().get(0);
        }

        public static WeightUnit valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        WeightUnit(int i) {
            this.value = i;
        }
    }

    @Override // com.google.shopping.type.WeightOrBuilder
    public boolean hasAmountMicros() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.shopping.type.WeightOrBuilder
    public long getAmountMicros() {
        return this.amountMicros_;
    }

    @Override // com.google.shopping.type.WeightOrBuilder
    public int getUnitValue() {
        return this.unit_;
    }

    @Override // com.google.shopping.type.WeightOrBuilder
    public WeightUnit getUnit() {
        WeightUnit weightUnitForNumber = WeightUnit.forNumber(this.unit_);
        return weightUnitForNumber == null ? WeightUnit.UNRECOGNIZED : weightUnitForNumber;
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
            codedOutputStream.writeInt64(1, this.amountMicros_);
        }
        if (this.unit_ != WeightUnit.WEIGHT_UNIT_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(2, this.unit_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt64Size(1, this.amountMicros_) : 0;
        if (this.unit_ != WeightUnit.WEIGHT_UNIT_UNSPECIFIED.getNumber()) {
            iComputeInt64Size += CodedOutputStream.computeEnumSize(2, this.unit_);
        }
        int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Weight)) {
            return super.equals(obj);
        }
        Weight weight = (Weight) obj;
        if (hasAmountMicros() != weight.hasAmountMicros()) {
            return false;
        }
        return (!hasAmountMicros() || getAmountMicros() == weight.getAmountMicros()) && this.unit_ == weight.unit_ && getUnknownFields().equals(weight.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasAmountMicros()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashLong(getAmountMicros());
        }
        int iHashCode2 = (((((iHashCode * 37) + 2) * 53) + this.unit_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Weight parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Weight parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Weight parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Weight parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Weight parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Weight parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Weight parseFrom(InputStream inputStream) throws IOException {
        return (Weight) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Weight parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Weight) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Weight parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Weight) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Weight parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Weight) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Weight parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Weight) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Weight parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Weight) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Weight weight) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(weight);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeightOrBuilder {
        private long amountMicros_;
        private int bitField0_;
        private int unit_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypesProto.internal_static_google_shopping_type_Weight_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypesProto.internal_static_google_shopping_type_Weight_fieldAccessorTable.ensureFieldAccessorsInitialized(Weight.class, Builder.class);
        }

        private Builder() {
            this.unit_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.unit_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.amountMicros_ = 0L;
            this.unit_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TypesProto.internal_static_google_shopping_type_Weight_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Weight getDefaultInstanceForType() {
            return Weight.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Weight build() {
            Weight weightBuildPartial = buildPartial();
            if (weightBuildPartial.isInitialized()) {
                return weightBuildPartial;
            }
            throw newUninitializedMessageException((Message) weightBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Weight buildPartial() {
            Weight weight = new Weight(this);
            if (this.bitField0_ != 0) {
                buildPartial0(weight);
            }
            onBuilt();
            return weight;
        }

        private void buildPartial0(Weight weight) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                weight.amountMicros_ = this.amountMicros_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                weight.unit_ = this.unit_;
            }
            Weight.access$576(weight, i);
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
            if (message instanceof Weight) {
                return mergeFrom((Weight) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Weight weight) {
            if (weight == Weight.getDefaultInstance()) {
                return this;
            }
            if (weight.hasAmountMicros()) {
                setAmountMicros(weight.getAmountMicros());
            }
            if (weight.unit_ != 0) {
                setUnitValue(weight.getUnitValue());
            }
            mergeUnknownFields(weight.getUnknownFields());
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
                                this.amountMicros_ = codedInputStream.readInt64();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.unit_ = codedInputStream.readEnum();
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

        @Override // com.google.shopping.type.WeightOrBuilder
        public boolean hasAmountMicros() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.shopping.type.WeightOrBuilder
        public long getAmountMicros() {
            return this.amountMicros_;
        }

        public Builder setAmountMicros(long j) {
            this.amountMicros_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearAmountMicros() {
            this.bitField0_ &= -2;
            this.amountMicros_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.shopping.type.WeightOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        public Builder setUnitValue(int i) {
            this.unit_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.shopping.type.WeightOrBuilder
        public WeightUnit getUnit() {
            WeightUnit weightUnitForNumber = WeightUnit.forNumber(this.unit_);
            return weightUnitForNumber == null ? WeightUnit.UNRECOGNIZED : weightUnitForNumber;
        }

        public Builder setUnit(WeightUnit weightUnit) {
            weightUnit.getClass();
            this.bitField0_ |= 2;
            this.unit_ = weightUnit.getNumber();
            onChanged();
            return this;
        }

        public Builder clearUnit() {
            this.bitField0_ &= -3;
            this.unit_ = 0;
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

    public static Weight getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Weight> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Weight> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Weight getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
