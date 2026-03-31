package com.google.apps.card.v1;

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
public final class ImageCropStyle extends GeneratedMessageV3 implements ImageCropStyleOrBuilder {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 2;
    private static final ImageCropStyle DEFAULT_INSTANCE = new ImageCropStyle();
    private static final Parser<ImageCropStyle> PARSER = new AbstractParser<ImageCropStyle>() { // from class: com.google.apps.card.v1.ImageCropStyle.1
        @Override // com.google.protobuf.Parser
        public ImageCropStyle parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ImageCropStyle.newBuilder();
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
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private double aspectRatio_;
    private byte memoizedIsInitialized;
    private int type_;

    private ImageCropStyle(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = 0;
        this.aspectRatio_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
    }

    private ImageCropStyle() {
        this.aspectRatio_ = 0.0d;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ImageCropStyle();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_ImageCropStyle_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_ImageCropStyle_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageCropStyle.class, Builder.class);
    }

    public enum ImageCropType implements ProtocolMessageEnum {
        IMAGE_CROP_TYPE_UNSPECIFIED(0),
        SQUARE(1),
        CIRCLE(2),
        RECTANGLE_CUSTOM(3),
        RECTANGLE_4_3(4),
        UNRECOGNIZED(-1);

        public static final int CIRCLE_VALUE = 2;
        public static final int IMAGE_CROP_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int RECTANGLE_4_3_VALUE = 4;
        public static final int RECTANGLE_CUSTOM_VALUE = 3;
        public static final int SQUARE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<ImageCropType> internalValueMap = new Internal.EnumLiteMap<ImageCropType>() { // from class: com.google.apps.card.v1.ImageCropStyle.ImageCropType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ImageCropType findValueByNumber(int i) {
                return ImageCropType.forNumber(i);
            }
        };
        private static final ImageCropType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ImageCropType valueOf(int i) {
            return forNumber(i);
        }

        public static ImageCropType forNumber(int i) {
            if (i == 0) {
                return IMAGE_CROP_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return SQUARE;
            }
            if (i == 2) {
                return CIRCLE;
            }
            if (i == 3) {
                return RECTANGLE_CUSTOM;
            }
            if (i != 4) {
                return null;
            }
            return RECTANGLE_4_3;
        }

        public static Internal.EnumLiteMap<ImageCropType> internalGetValueMap() {
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
            return ImageCropStyle.getDescriptor().getEnumTypes().get(0);
        }

        public static ImageCropType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        ImageCropType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
    public ImageCropType getType() {
        ImageCropType imageCropTypeForNumber = ImageCropType.forNumber(this.type_);
        return imageCropTypeForNumber == null ? ImageCropType.UNRECOGNIZED : imageCropTypeForNumber;
    }

    @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
    public double getAspectRatio() {
        return this.aspectRatio_;
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
        if (this.type_ != ImageCropType.IMAGE_CROP_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.type_);
        }
        if (Double.doubleToRawLongBits(this.aspectRatio_) != 0) {
            codedOutputStream.writeDouble(2, this.aspectRatio_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = this.type_ != ImageCropType.IMAGE_CROP_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
        if (Double.doubleToRawLongBits(this.aspectRatio_) != 0) {
            iComputeEnumSize += CodedOutputStream.computeDoubleSize(2, this.aspectRatio_);
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
        if (!(obj instanceof ImageCropStyle)) {
            return super.equals(obj);
        }
        ImageCropStyle imageCropStyle = (ImageCropStyle) obj;
        return this.type_ == imageCropStyle.type_ && Double.doubleToLongBits(getAspectRatio()) == Double.doubleToLongBits(imageCropStyle.getAspectRatio()) && getUnknownFields().equals(imageCropStyle.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getAspectRatio()))) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static ImageCropStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ImageCropStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ImageCropStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ImageCropStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ImageCropStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ImageCropStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ImageCropStyle parseFrom(InputStream inputStream) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ImageCropStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ImageCropStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ImageCropStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ImageCropStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ImageCropStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageCropStyle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ImageCropStyle imageCropStyle) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageCropStyle);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageCropStyleOrBuilder {
        private double aspectRatio_;
        private int bitField0_;
        private int type_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_ImageCropStyle_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_ImageCropStyle_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageCropStyle.class, Builder.class);
        }

        private Builder() {
            this.type_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.type_ = 0;
            this.aspectRatio_ = 0.0d;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_ImageCropStyle_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ImageCropStyle getDefaultInstanceForType() {
            return ImageCropStyle.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ImageCropStyle build() {
            ImageCropStyle imageCropStyleBuildPartial = buildPartial();
            if (imageCropStyleBuildPartial.isInitialized()) {
                return imageCropStyleBuildPartial;
            }
            throw newUninitializedMessageException((Message) imageCropStyleBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ImageCropStyle buildPartial() {
            ImageCropStyle imageCropStyle = new ImageCropStyle(this);
            if (this.bitField0_ != 0) {
                buildPartial0(imageCropStyle);
            }
            onBuilt();
            return imageCropStyle;
        }

        private void buildPartial0(ImageCropStyle imageCropStyle) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                imageCropStyle.type_ = this.type_;
            }
            if ((i & 2) != 0) {
                imageCropStyle.aspectRatio_ = this.aspectRatio_;
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
            if (message instanceof ImageCropStyle) {
                return mergeFrom((ImageCropStyle) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ImageCropStyle imageCropStyle) {
            if (imageCropStyle == ImageCropStyle.getDefaultInstance()) {
                return this;
            }
            if (imageCropStyle.type_ != 0) {
                setTypeValue(imageCropStyle.getTypeValue());
            }
            if (imageCropStyle.getAspectRatio() != 0.0d) {
                setAspectRatio(imageCropStyle.getAspectRatio());
            }
            mergeUnknownFields(imageCropStyle.getUnknownFields());
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
                                this.type_ = codedInputStream.readEnum();
                                this.bitField0_ |= 1;
                            } else if (tag == 17) {
                                this.aspectRatio_ = codedInputStream.readDouble();
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

        @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
        public ImageCropType getType() {
            ImageCropType imageCropTypeForNumber = ImageCropType.forNumber(this.type_);
            return imageCropTypeForNumber == null ? ImageCropType.UNRECOGNIZED : imageCropTypeForNumber;
        }

        public Builder setType(ImageCropType imageCropType) {
            imageCropType.getClass();
            this.bitField0_ |= 1;
            this.type_ = imageCropType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ImageCropStyleOrBuilder
        public double getAspectRatio() {
            return this.aspectRatio_;
        }

        public Builder setAspectRatio(double d) {
            this.aspectRatio_ = d;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearAspectRatio() {
            this.bitField0_ &= -3;
            this.aspectRatio_ = 0.0d;
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

    public static ImageCropStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ImageCropStyle> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ImageCropStyle> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ImageCropStyle getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
