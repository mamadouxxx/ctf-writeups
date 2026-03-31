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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.type.Color;
import com.google.type.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class BorderStyle extends GeneratedMessageV3 implements BorderStyleOrBuilder {
    public static final int CORNER_RADIUS_FIELD_NUMBER = 3;
    private static final BorderStyle DEFAULT_INSTANCE = new BorderStyle();
    private static final Parser<BorderStyle> PARSER = new AbstractParser<BorderStyle>() { // from class: com.google.apps.card.v1.BorderStyle.1
        @Override // com.google.protobuf.Parser
        public BorderStyle parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = BorderStyle.newBuilder();
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
    public static final int STROKE_COLOR_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int cornerRadius_;
    private byte memoizedIsInitialized;
    private Color strokeColor_;
    private int type_;

    static /* synthetic */ int access$776(BorderStyle borderStyle, int i) {
        int i2 = i | borderStyle.bitField0_;
        borderStyle.bitField0_ = i2;
        return i2;
    }

    private BorderStyle(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = 0;
        this.cornerRadius_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private BorderStyle() {
        this.cornerRadius_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new BorderStyle();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_BorderStyle_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_BorderStyle_fieldAccessorTable.ensureFieldAccessorsInitialized(BorderStyle.class, Builder.class);
    }

    public enum BorderType implements ProtocolMessageEnum {
        BORDER_TYPE_UNSPECIFIED(0),
        NO_BORDER(1),
        STROKE(2),
        UNRECOGNIZED(-1);

        public static final int BORDER_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int NO_BORDER_VALUE = 1;
        public static final int STROKE_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<BorderType> internalValueMap = new Internal.EnumLiteMap<BorderType>() { // from class: com.google.apps.card.v1.BorderStyle.BorderType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public BorderType findValueByNumber(int i) {
                return BorderType.forNumber(i);
            }
        };
        private static final BorderType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static BorderType valueOf(int i) {
            return forNumber(i);
        }

        public static BorderType forNumber(int i) {
            if (i == 0) {
                return BORDER_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return NO_BORDER;
            }
            if (i != 2) {
                return null;
            }
            return STROKE;
        }

        public static Internal.EnumLiteMap<BorderType> internalGetValueMap() {
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
            return BorderStyle.getDescriptor().getEnumTypes().get(0);
        }

        public static BorderType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        BorderType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public BorderType getType() {
        BorderType borderTypeForNumber = BorderType.forNumber(this.type_);
        return borderTypeForNumber == null ? BorderType.UNRECOGNIZED : borderTypeForNumber;
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public boolean hasStrokeColor() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public Color getStrokeColor() {
        Color color = this.strokeColor_;
        return color == null ? Color.getDefaultInstance() : color;
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public ColorOrBuilder getStrokeColorOrBuilder() {
        Color color = this.strokeColor_;
        return color == null ? Color.getDefaultInstance() : color;
    }

    @Override // com.google.apps.card.v1.BorderStyleOrBuilder
    public int getCornerRadius() {
        return this.cornerRadius_;
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
        if (this.type_ != BorderType.BORDER_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.type_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(2, getStrokeColor());
        }
        int i = this.cornerRadius_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = this.type_ != BorderType.BORDER_TYPE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
        if ((this.bitField0_ & 1) != 0) {
            iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getStrokeColor());
        }
        int i2 = this.cornerRadius_;
        if (i2 != 0) {
            iComputeEnumSize += CodedOutputStream.computeInt32Size(3, i2);
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
        if (!(obj instanceof BorderStyle)) {
            return super.equals(obj);
        }
        BorderStyle borderStyle = (BorderStyle) obj;
        if (this.type_ == borderStyle.type_ && hasStrokeColor() == borderStyle.hasStrokeColor()) {
            return (!hasStrokeColor() || getStrokeColor().equals(borderStyle.getStrokeColor())) && getCornerRadius() == borderStyle.getCornerRadius() && getUnknownFields().equals(borderStyle.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
        if (hasStrokeColor()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getStrokeColor().hashCode();
        }
        int cornerRadius = (((((iHashCode * 37) + 3) * 53) + getCornerRadius()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = cornerRadius;
        return cornerRadius;
    }

    public static BorderStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static BorderStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static BorderStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static BorderStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static BorderStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static BorderStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static BorderStyle parseFrom(InputStream inputStream) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static BorderStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BorderStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BorderStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static BorderStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static BorderStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderStyle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BorderStyle borderStyle) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(borderStyle);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BorderStyleOrBuilder {
        private int bitField0_;
        private int cornerRadius_;
        private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> strokeColorBuilder_;
        private Color strokeColor_;
        private int type_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_BorderStyle_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_BorderStyle_fieldAccessorTable.ensureFieldAccessorsInitialized(BorderStyle.class, Builder.class);
        }

        private Builder() {
            this.type_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (BorderStyle.alwaysUseFieldBuilders) {
                getStrokeColorFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.type_ = 0;
            this.strokeColor_ = null;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.strokeColorBuilder_ = null;
            }
            this.cornerRadius_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_BorderStyle_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BorderStyle getDefaultInstanceForType() {
            return BorderStyle.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BorderStyle build() {
            BorderStyle borderStyleBuildPartial = buildPartial();
            if (borderStyleBuildPartial.isInitialized()) {
                return borderStyleBuildPartial;
            }
            throw newUninitializedMessageException((Message) borderStyleBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public BorderStyle buildPartial() {
            BorderStyle borderStyle = new BorderStyle(this);
            if (this.bitField0_ != 0) {
                buildPartial0(borderStyle);
            }
            onBuilt();
            return borderStyle;
        }

        private void buildPartial0(BorderStyle borderStyle) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                borderStyle.type_ = this.type_;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
                borderStyle.strokeColor_ = singleFieldBuilderV3 == null ? this.strokeColor_ : (Color) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                borderStyle.cornerRadius_ = this.cornerRadius_;
            }
            BorderStyle.access$776(borderStyle, i);
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
            if (message instanceof BorderStyle) {
                return mergeFrom((BorderStyle) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(BorderStyle borderStyle) {
            if (borderStyle == BorderStyle.getDefaultInstance()) {
                return this;
            }
            if (borderStyle.type_ != 0) {
                setTypeValue(borderStyle.getTypeValue());
            }
            if (borderStyle.hasStrokeColor()) {
                mergeStrokeColor(borderStyle.getStrokeColor());
            }
            if (borderStyle.getCornerRadius() != 0) {
                setCornerRadius(borderStyle.getCornerRadius());
            }
            mergeUnknownFields(borderStyle.getUnknownFields());
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
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getStrokeColorFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.cornerRadius_ = codedInputStream.readInt32();
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

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public BorderType getType() {
            BorderType borderTypeForNumber = BorderType.forNumber(this.type_);
            return borderTypeForNumber == null ? BorderType.UNRECOGNIZED : borderTypeForNumber;
        }

        public Builder setType(BorderType borderType) {
            borderType.getClass();
            this.bitField0_ |= 1;
            this.type_ = borderType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public boolean hasStrokeColor() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public Color getStrokeColor() {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Color color = this.strokeColor_;
                return color == null ? Color.getDefaultInstance() : color;
            }
            return (Color) singleFieldBuilderV3.getMessage();
        }

        public Builder setStrokeColor(Color color) {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 == null) {
                color.getClass();
                this.strokeColor_ = color;
            } else {
                singleFieldBuilderV3.setMessage(color);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setStrokeColor(Color.Builder builder) {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.strokeColor_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeStrokeColor(Color color) {
            Color color2;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (color2 = this.strokeColor_) != null && color2 != Color.getDefaultInstance()) {
                    getStrokeColorBuilder().mergeFrom(color);
                } else {
                    this.strokeColor_ = color;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(color);
            }
            if (this.strokeColor_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearStrokeColor() {
            this.bitField0_ &= -3;
            this.strokeColor_ = null;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.strokeColorBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Color.Builder getStrokeColorBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Color.Builder) getStrokeColorFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public ColorOrBuilder getStrokeColorOrBuilder() {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.strokeColorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ColorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Color color = this.strokeColor_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getStrokeColorFieldBuilder() {
            if (this.strokeColorBuilder_ == null) {
                this.strokeColorBuilder_ = new SingleFieldBuilderV3<>(getStrokeColor(), getParentForChildren(), isClean());
                this.strokeColor_ = null;
            }
            return this.strokeColorBuilder_;
        }

        @Override // com.google.apps.card.v1.BorderStyleOrBuilder
        public int getCornerRadius() {
            return this.cornerRadius_;
        }

        public Builder setCornerRadius(int i) {
            this.cornerRadius_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearCornerRadius() {
            this.bitField0_ &= -5;
            this.cornerRadius_ = 0;
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

    public static BorderStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BorderStyle> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<BorderStyle> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public BorderStyle getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
