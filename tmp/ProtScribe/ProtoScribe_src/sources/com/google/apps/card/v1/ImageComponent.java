package com.google.apps.card.v1;

import com.google.apps.card.v1.BorderStyle;
import com.google.apps.card.v1.ImageCropStyle;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponent extends GeneratedMessageV3 implements ImageComponentOrBuilder {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int BORDER_STYLE_FIELD_NUMBER = 4;
    public static final int CROP_STYLE_FIELD_NUMBER = 3;
    public static final int IMAGE_URI_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object altText_;
    private int bitField0_;
    private BorderStyle borderStyle_;
    private ImageCropStyle cropStyle_;
    private volatile Object imageUri_;
    private byte memoizedIsInitialized;
    private static final ImageComponent DEFAULT_INSTANCE = new ImageComponent();
    private static final Parser<ImageComponent> PARSER = new AbstractParser<ImageComponent>() { // from class: com.google.apps.card.v1.ImageComponent.1
        @Override // com.google.protobuf.Parser
        public ImageComponent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ImageComponent.newBuilder();
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

    static /* synthetic */ int access$876(ImageComponent imageComponent, int i) {
        int i2 = i | imageComponent.bitField0_;
        imageComponent.bitField0_ = i2;
        return i2;
    }

    private ImageComponent(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.imageUri_ = "";
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private ImageComponent() {
        this.imageUri_ = "";
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.imageUri_ = "";
        this.altText_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ImageComponent();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_ImageComponent_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_ImageComponent_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageComponent.class, Builder.class);
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public String getImageUri() {
        Object obj = this.imageUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.imageUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public ByteString getImageUriBytes() {
        Object obj = this.imageUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imageUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public String getAltText() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.altText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public ByteString getAltTextBytes() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.altText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public boolean hasCropStyle() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public ImageCropStyle getCropStyle() {
        ImageCropStyle imageCropStyle = this.cropStyle_;
        return imageCropStyle == null ? ImageCropStyle.getDefaultInstance() : imageCropStyle;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public ImageCropStyleOrBuilder getCropStyleOrBuilder() {
        ImageCropStyle imageCropStyle = this.cropStyle_;
        return imageCropStyle == null ? ImageCropStyle.getDefaultInstance() : imageCropStyle;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public boolean hasBorderStyle() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public BorderStyle getBorderStyle() {
        BorderStyle borderStyle = this.borderStyle_;
        return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
    }

    @Override // com.google.apps.card.v1.ImageComponentOrBuilder
    public BorderStyleOrBuilder getBorderStyleOrBuilder() {
        BorderStyle borderStyle = this.borderStyle_;
        return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
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
        if (!GeneratedMessageV3.isStringEmpty(this.imageUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.imageUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.altText_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(3, getCropStyle());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(4, getBorderStyle());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.imageUri_) ? GeneratedMessageV3.computeStringSize(1, this.imageUri_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.altText_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, getCropStyle());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, getBorderStyle());
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
        if (!(obj instanceof ImageComponent)) {
            return super.equals(obj);
        }
        ImageComponent imageComponent = (ImageComponent) obj;
        if (!getImageUri().equals(imageComponent.getImageUri()) || !getAltText().equals(imageComponent.getAltText()) || hasCropStyle() != imageComponent.hasCropStyle()) {
            return false;
        }
        if ((!hasCropStyle() || getCropStyle().equals(imageComponent.getCropStyle())) && hasBorderStyle() == imageComponent.hasBorderStyle()) {
            return (!hasBorderStyle() || getBorderStyle().equals(imageComponent.getBorderStyle())) && getUnknownFields().equals(imageComponent.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImageUri().hashCode()) * 37) + 2) * 53) + getAltText().hashCode();
        if (hasCropStyle()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getCropStyle().hashCode();
        }
        if (hasBorderStyle()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getBorderStyle().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ImageComponent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ImageComponent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ImageComponent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ImageComponent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ImageComponent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ImageComponent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ImageComponent parseFrom(InputStream inputStream) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ImageComponent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ImageComponent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ImageComponent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ImageComponent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ImageComponent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImageComponent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ImageComponent imageComponent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageComponent);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageComponentOrBuilder {
        private Object altText_;
        private int bitField0_;
        private SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> borderStyleBuilder_;
        private BorderStyle borderStyle_;
        private SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> cropStyleBuilder_;
        private ImageCropStyle cropStyle_;
        private Object imageUri_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_ImageComponent_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_ImageComponent_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageComponent.class, Builder.class);
        }

        private Builder() {
            this.imageUri_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.imageUri_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (ImageComponent.alwaysUseFieldBuilders) {
                getCropStyleFieldBuilder();
                getBorderStyleFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.imageUri_ = "";
            this.altText_ = "";
            this.cropStyle_ = null;
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.cropStyleBuilder_ = null;
            }
            this.borderStyle_ = null;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV32 = this.borderStyleBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.borderStyleBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_ImageComponent_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ImageComponent getDefaultInstanceForType() {
            return ImageComponent.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ImageComponent build() {
            ImageComponent imageComponentBuildPartial = buildPartial();
            if (imageComponentBuildPartial.isInitialized()) {
                return imageComponentBuildPartial;
            }
            throw newUninitializedMessageException((Message) imageComponentBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ImageComponent buildPartial() {
            ImageComponent imageComponent = new ImageComponent(this);
            if (this.bitField0_ != 0) {
                buildPartial0(imageComponent);
            }
            onBuilt();
            return imageComponent;
        }

        private void buildPartial0(ImageComponent imageComponent) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                imageComponent.imageUri_ = this.imageUri_;
            }
            if ((i2 & 2) != 0) {
                imageComponent.altText_ = this.altText_;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
                imageComponent.cropStyle_ = singleFieldBuilderV3 == null ? this.cropStyle_ : (ImageCropStyle) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV32 = this.borderStyleBuilder_;
                imageComponent.borderStyle_ = singleFieldBuilderV32 == null ? this.borderStyle_ : (BorderStyle) singleFieldBuilderV32.build();
                i |= 2;
            }
            ImageComponent.access$876(imageComponent, i);
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
            if (message instanceof ImageComponent) {
                return mergeFrom((ImageComponent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ImageComponent imageComponent) {
            if (imageComponent == ImageComponent.getDefaultInstance()) {
                return this;
            }
            if (!imageComponent.getImageUri().isEmpty()) {
                this.imageUri_ = imageComponent.imageUri_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!imageComponent.getAltText().isEmpty()) {
                this.altText_ = imageComponent.altText_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (imageComponent.hasCropStyle()) {
                mergeCropStyle(imageComponent.getCropStyle());
            }
            if (imageComponent.hasBorderStyle()) {
                mergeBorderStyle(imageComponent.getBorderStyle());
            }
            mergeUnknownFields(imageComponent.getUnknownFields());
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
                                this.imageUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.altText_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getCropStyleFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getBorderStyleFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public String getImageUri() {
            Object obj = this.imageUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imageUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public ByteString getImageUriBytes() {
            Object obj = this.imageUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imageUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setImageUri(String str) {
            str.getClass();
            this.imageUri_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearImageUri() {
            this.imageUri_ = ImageComponent.getDefaultInstance().getImageUri();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setImageUriBytes(ByteString byteString) {
            byteString.getClass();
            ImageComponent.checkByteStringIsUtf8(byteString);
            this.imageUri_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public String getAltText() {
            Object obj = this.altText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.altText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public ByteString getAltTextBytes() {
            Object obj = this.altText_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.altText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAltText(String str) {
            str.getClass();
            this.altText_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearAltText() {
            this.altText_ = ImageComponent.getDefaultInstance().getAltText();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setAltTextBytes(ByteString byteString) {
            byteString.getClass();
            ImageComponent.checkByteStringIsUtf8(byteString);
            this.altText_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public boolean hasCropStyle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public ImageCropStyle getCropStyle() {
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                ImageCropStyle imageCropStyle = this.cropStyle_;
                return imageCropStyle == null ? ImageCropStyle.getDefaultInstance() : imageCropStyle;
            }
            return (ImageCropStyle) singleFieldBuilderV3.getMessage();
        }

        public Builder setCropStyle(ImageCropStyle imageCropStyle) {
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                imageCropStyle.getClass();
                this.cropStyle_ = imageCropStyle;
            } else {
                singleFieldBuilderV3.setMessage(imageCropStyle);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setCropStyle(ImageCropStyle.Builder builder) {
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cropStyle_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeCropStyle(ImageCropStyle imageCropStyle) {
            ImageCropStyle imageCropStyle2;
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (imageCropStyle2 = this.cropStyle_) != null && imageCropStyle2 != ImageCropStyle.getDefaultInstance()) {
                    getCropStyleBuilder().mergeFrom(imageCropStyle);
                } else {
                    this.cropStyle_ = imageCropStyle;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(imageCropStyle);
            }
            if (this.cropStyle_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearCropStyle() {
            this.bitField0_ &= -5;
            this.cropStyle_ = null;
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.cropStyleBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public ImageCropStyle.Builder getCropStyleBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (ImageCropStyle.Builder) getCropStyleFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public ImageCropStyleOrBuilder getCropStyleOrBuilder() {
            SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> singleFieldBuilderV3 = this.cropStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ImageCropStyleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ImageCropStyle imageCropStyle = this.cropStyle_;
            return imageCropStyle == null ? ImageCropStyle.getDefaultInstance() : imageCropStyle;
        }

        private SingleFieldBuilderV3<ImageCropStyle, ImageCropStyle.Builder, ImageCropStyleOrBuilder> getCropStyleFieldBuilder() {
            if (this.cropStyleBuilder_ == null) {
                this.cropStyleBuilder_ = new SingleFieldBuilderV3<>(getCropStyle(), getParentForChildren(), isClean());
                this.cropStyle_ = null;
            }
            return this.cropStyleBuilder_;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public boolean hasBorderStyle() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public BorderStyle getBorderStyle() {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                BorderStyle borderStyle = this.borderStyle_;
                return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
            }
            return (BorderStyle) singleFieldBuilderV3.getMessage();
        }

        public Builder setBorderStyle(BorderStyle borderStyle) {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                borderStyle.getClass();
                this.borderStyle_ = borderStyle;
            } else {
                singleFieldBuilderV3.setMessage(borderStyle);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setBorderStyle(BorderStyle.Builder builder) {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.borderStyle_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeBorderStyle(BorderStyle borderStyle) {
            BorderStyle borderStyle2;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (borderStyle2 = this.borderStyle_) != null && borderStyle2 != BorderStyle.getDefaultInstance()) {
                    getBorderStyleBuilder().mergeFrom(borderStyle);
                } else {
                    this.borderStyle_ = borderStyle;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(borderStyle);
            }
            if (this.borderStyle_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearBorderStyle() {
            this.bitField0_ &= -9;
            this.borderStyle_ = null;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.borderStyleBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public BorderStyle.Builder getBorderStyleBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (BorderStyle.Builder) getBorderStyleFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ImageComponentOrBuilder
        public BorderStyleOrBuilder getBorderStyleOrBuilder() {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (BorderStyleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            BorderStyle borderStyle = this.borderStyle_;
            return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
        }

        private SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> getBorderStyleFieldBuilder() {
            if (this.borderStyleBuilder_ == null) {
                this.borderStyleBuilder_ = new SingleFieldBuilderV3<>(getBorderStyle(), getParentForChildren(), isClean());
                this.borderStyle_ = null;
            }
            return this.borderStyleBuilder_;
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

    public static ImageComponent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ImageComponent> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ImageComponent> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ImageComponent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
