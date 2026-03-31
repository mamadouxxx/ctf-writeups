package com.google.type;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Color extends GeneratedMessageV3 implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    public static final int GREEN_FIELD_NUMBER = 2;
    public static final int RED_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private FloatValue alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private byte memoizedIsInitialized;
    private float red_;
    private static final Color DEFAULT_INSTANCE = new Color();
    private static final Parser<Color> PARSER = new AbstractParser<Color>() { // from class: com.google.type.Color.1
        @Override // com.google.protobuf.Parser
        public Color parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Color.newBuilder();
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

    static /* synthetic */ int access$876(Color color, int i) {
        int i2 = i | color.bitField0_;
        color.bitField0_ = i2;
        return i2;
    }

    private Color(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.red_ = 0.0f;
        this.green_ = 0.0f;
        this.blue_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Color() {
        this.red_ = 0.0f;
        this.green_ = 0.0f;
        this.blue_ = 0.0f;
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Color();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ColorProto.internal_static_google_type_Color_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ColorProto.internal_static_google_type_Color_fieldAccessorTable.ensureFieldAccessorsInitialized(Color.class, Builder.class);
    }

    @Override // com.google.type.ColorOrBuilder
    public float getRed() {
        return this.red_;
    }

    @Override // com.google.type.ColorOrBuilder
    public float getGreen() {
        return this.green_;
    }

    @Override // com.google.type.ColorOrBuilder
    public float getBlue() {
        return this.blue_;
    }

    @Override // com.google.type.ColorOrBuilder
    public boolean hasAlpha() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.type.ColorOrBuilder
    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
    }

    @Override // com.google.type.ColorOrBuilder
    public FloatValueOrBuilder getAlphaOrBuilder() {
        FloatValue floatValue = this.alpha_;
        return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
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
        if (Float.floatToRawIntBits(this.red_) != 0) {
            codedOutputStream.writeFloat(1, this.red_);
        }
        if (Float.floatToRawIntBits(this.green_) != 0) {
            codedOutputStream.writeFloat(2, this.green_);
        }
        if (Float.floatToRawIntBits(this.blue_) != 0) {
            codedOutputStream.writeFloat(3, this.blue_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(4, getAlpha());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeFloatSize = Float.floatToRawIntBits(this.red_) != 0 ? CodedOutputStream.computeFloatSize(1, this.red_) : 0;
        if (Float.floatToRawIntBits(this.green_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.green_);
        }
        if (Float.floatToRawIntBits(this.blue_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.blue_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeFloatSize += CodedOutputStream.computeMessageSize(4, getAlpha());
        }
        int serializedSize = iComputeFloatSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Color)) {
            return super.equals(obj);
        }
        Color color = (Color) obj;
        if (Float.floatToIntBits(getRed()) == Float.floatToIntBits(color.getRed()) && Float.floatToIntBits(getGreen()) == Float.floatToIntBits(color.getGreen()) && Float.floatToIntBits(getBlue()) == Float.floatToIntBits(color.getBlue()) && hasAlpha() == color.hasAlpha()) {
            return (!hasAlpha() || getAlpha().equals(color.getAlpha())) && getUnknownFields().equals(color.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getRed())) * 37) + 2) * 53) + Float.floatToIntBits(getGreen())) * 37) + 3) * 53) + Float.floatToIntBits(getBlue());
        if (hasAlpha()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getAlpha().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Color parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Color parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Color parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Color parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Color parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
        return (Color) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Color parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Color) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Color parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Color) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Color parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Color color) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(color);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ColorOrBuilder {
        private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> alphaBuilder_;
        private FloatValue alpha_;
        private int bitField0_;
        private float blue_;
        private float green_;
        private float red_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ColorProto.internal_static_google_type_Color_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ColorProto.internal_static_google_type_Color_fieldAccessorTable.ensureFieldAccessorsInitialized(Color.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Color.alwaysUseFieldBuilders) {
                getAlphaFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.red_ = 0.0f;
            this.green_ = 0.0f;
            this.blue_ = 0.0f;
            this.alpha_ = null;
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.alphaBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ColorProto.internal_static_google_type_Color_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Color getDefaultInstanceForType() {
            return Color.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Color build() {
            Color colorBuildPartial = buildPartial();
            if (colorBuildPartial.isInitialized()) {
                return colorBuildPartial;
            }
            throw newUninitializedMessageException((Message) colorBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Color buildPartial() {
            Color color = new Color(this);
            if (this.bitField0_ != 0) {
                buildPartial0(color);
            }
            onBuilt();
            return color;
        }

        private void buildPartial0(Color color) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                color.red_ = this.red_;
            }
            if ((i2 & 2) != 0) {
                color.green_ = this.green_;
            }
            if ((i2 & 4) != 0) {
                color.blue_ = this.blue_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
                color.alpha_ = singleFieldBuilderV3 == null ? this.alpha_ : (FloatValue) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            Color.access$876(color, i);
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
            if (message instanceof Color) {
                return mergeFrom((Color) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Color color) {
            if (color == Color.getDefaultInstance()) {
                return this;
            }
            if (color.getRed() != 0.0f) {
                setRed(color.getRed());
            }
            if (color.getGreen() != 0.0f) {
                setGreen(color.getGreen());
            }
            if (color.getBlue() != 0.0f) {
                setBlue(color.getBlue());
            }
            if (color.hasAlpha()) {
                mergeAlpha(color.getAlpha());
            }
            mergeUnknownFields(color.getUnknownFields());
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
                            if (tag == 13) {
                                this.red_ = codedInputStream.readFloat();
                                this.bitField0_ |= 1;
                            } else if (tag == 21) {
                                this.green_ = codedInputStream.readFloat();
                                this.bitField0_ |= 2;
                            } else if (tag == 29) {
                                this.blue_ = codedInputStream.readFloat();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getAlphaFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.type.ColorOrBuilder
        public float getRed() {
            return this.red_;
        }

        public Builder setRed(float f) {
            this.red_ = f;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearRed() {
            this.bitField0_ &= -2;
            this.red_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.type.ColorOrBuilder
        public float getGreen() {
            return this.green_;
        }

        public Builder setGreen(float f) {
            this.green_ = f;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearGreen() {
            this.bitField0_ &= -3;
            this.green_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.type.ColorOrBuilder
        public float getBlue() {
            return this.blue_;
        }

        public Builder setBlue(float f) {
            this.blue_ = f;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearBlue() {
            this.bitField0_ &= -5;
            this.blue_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.type.ColorOrBuilder
        public boolean hasAlpha() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.type.ColorOrBuilder
        public FloatValue getAlpha() {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 == null) {
                FloatValue floatValue = this.alpha_;
                return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
            }
            return (FloatValue) singleFieldBuilderV3.getMessage();
        }

        public Builder setAlpha(FloatValue floatValue) {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 == null) {
                floatValue.getClass();
                this.alpha_ = floatValue;
            } else {
                singleFieldBuilderV3.setMessage(floatValue);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setAlpha(FloatValue.Builder builder) {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.alpha_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeAlpha(FloatValue floatValue) {
            FloatValue floatValue2;
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (floatValue2 = this.alpha_) != null && floatValue2 != FloatValue.getDefaultInstance()) {
                    getAlphaBuilder().mergeFrom(floatValue);
                } else {
                    this.alpha_ = floatValue;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(floatValue);
            }
            if (this.alpha_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearAlpha() {
            this.bitField0_ &= -9;
            this.alpha_ = null;
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.alphaBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public FloatValue.Builder getAlphaBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (FloatValue.Builder) getAlphaFieldBuilder().getBuilder();
        }

        @Override // com.google.type.ColorOrBuilder
        public FloatValueOrBuilder getAlphaOrBuilder() {
            SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> singleFieldBuilderV3 = this.alphaBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (FloatValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            FloatValue floatValue = this.alpha_;
            return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
        }

        private SingleFieldBuilderV3<FloatValue, FloatValue.Builder, FloatValueOrBuilder> getAlphaFieldBuilder() {
            if (this.alphaBuilder_ == null) {
                this.alphaBuilder_ = new SingleFieldBuilderV3<>(getAlpha(), getParentForChildren(), isClean());
                this.alpha_ = null;
            }
            return this.alphaBuilder_;
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

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Color> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Color> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Color getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
