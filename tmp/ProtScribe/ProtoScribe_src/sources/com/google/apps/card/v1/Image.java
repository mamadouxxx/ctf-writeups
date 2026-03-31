package com.google.apps.card.v1;

import com.google.apps.card.v1.OnClick;
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
public final class Image extends GeneratedMessageV3 implements ImageOrBuilder {
    public static final int ALT_TEXT_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int ON_CLICK_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object altText_;
    private int bitField0_;
    private volatile Object imageUrl_;
    private byte memoizedIsInitialized;
    private OnClick onClick_;
    private static final Image DEFAULT_INSTANCE = new Image();
    private static final Parser<Image> PARSER = new AbstractParser<Image>() { // from class: com.google.apps.card.v1.Image.1
        @Override // com.google.protobuf.Parser
        public Image parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Image.newBuilder();
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

    static /* synthetic */ int access$776(Image image, int i) {
        int i2 = i | image.bitField0_;
        image.bitField0_ = i2;
        return i2;
    }

    private Image(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.imageUrl_ = "";
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Image() {
        this.imageUrl_ = "";
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.imageUrl_ = "";
        this.altText_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Image();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Image_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Image_fieldAccessorTable.ensureFieldAccessorsInitialized(Image.class, Builder.class);
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public String getImageUrl() {
        Object obj = this.imageUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.imageUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public ByteString getImageUrlBytes() {
        Object obj = this.imageUrl_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imageUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public boolean hasOnClick() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public OnClick getOnClick() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public OnClickOrBuilder getOnClickOrBuilder() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public String getAltText() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.altText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ImageOrBuilder
    public ByteString getAltTextBytes() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.altText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
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
        if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.imageUrl_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(2, getOnClick());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.altText_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.imageUrl_) ? GeneratedMessageV3.computeStringSize(1, this.imageUrl_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, getOnClick());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.altText_);
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
        if (!(obj instanceof Image)) {
            return super.equals(obj);
        }
        Image image = (Image) obj;
        if (getImageUrl().equals(image.getImageUrl()) && hasOnClick() == image.hasOnClick()) {
            return (!hasOnClick() || getOnClick().equals(image.getOnClick())) && getAltText().equals(image.getAltText()) && getUnknownFields().equals(image.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImageUrl().hashCode();
        if (hasOnClick()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getOnClick().hashCode();
        }
        int iHashCode2 = (((((iHashCode * 37) + 3) * 53) + getAltText().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Image parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Image parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Image parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Image parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Image parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Image parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Image parseFrom(InputStream inputStream) throws IOException {
        return (Image) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Image parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Image) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Image parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Image) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Image parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Image) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Image parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Image) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Image parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Image) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Image image) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(image);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageOrBuilder {
        private Object altText_;
        private int bitField0_;
        private Object imageUrl_;
        private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> onClickBuilder_;
        private OnClick onClick_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Image_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Image_fieldAccessorTable.ensureFieldAccessorsInitialized(Image.class, Builder.class);
        }

        private Builder() {
            this.imageUrl_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.imageUrl_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Image.alwaysUseFieldBuilders) {
                getOnClickFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.imageUrl_ = "";
            this.onClick_ = null;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.onClickBuilder_ = null;
            }
            this.altText_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Image_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Image getDefaultInstanceForType() {
            return Image.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Image build() {
            Image imageBuildPartial = buildPartial();
            if (imageBuildPartial.isInitialized()) {
                return imageBuildPartial;
            }
            throw newUninitializedMessageException((Message) imageBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Image buildPartial() {
            Image image = new Image(this);
            if (this.bitField0_ != 0) {
                buildPartial0(image);
            }
            onBuilt();
            return image;
        }

        private void buildPartial0(Image image) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                image.imageUrl_ = this.imageUrl_;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                image.onClick_ = singleFieldBuilderV3 == null ? this.onClick_ : (OnClick) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                image.altText_ = this.altText_;
            }
            Image.access$776(image, i);
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
            if (message instanceof Image) {
                return mergeFrom((Image) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Image image) {
            if (image == Image.getDefaultInstance()) {
                return this;
            }
            if (!image.getImageUrl().isEmpty()) {
                this.imageUrl_ = image.imageUrl_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (image.hasOnClick()) {
                mergeOnClick(image.getOnClick());
            }
            if (!image.getAltText().isEmpty()) {
                this.altText_ = image.altText_;
                this.bitField0_ |= 4;
                onChanged();
            }
            mergeUnknownFields(image.getUnknownFields());
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
                                this.imageUrl_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getOnClickFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.altText_ = codedInputStream.readStringRequireUtf8();
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

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public String getImageUrl() {
            Object obj = this.imageUrl_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.imageUrl_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public ByteString getImageUrlBytes() {
            Object obj = this.imageUrl_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imageUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setImageUrl(String str) {
            str.getClass();
            this.imageUrl_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearImageUrl() {
            this.imageUrl_ = Image.getDefaultInstance().getImageUrl();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setImageUrlBytes(ByteString byteString) {
            byteString.getClass();
            Image.checkByteStringIsUtf8(byteString);
            this.imageUrl_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public boolean hasOnClick() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public OnClick getOnClick() {
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                OnClick onClick = this.onClick_;
                return onClick == null ? OnClick.getDefaultInstance() : onClick;
            }
            return (OnClick) singleFieldBuilderV3.getMessage();
        }

        public Builder setOnClick(OnClick onClick) {
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                onClick.getClass();
                this.onClick_ = onClick;
            } else {
                singleFieldBuilderV3.setMessage(onClick);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setOnClick(OnClick.Builder builder) {
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.onClick_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeOnClick(OnClick onClick) {
            OnClick onClick2;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (onClick2 = this.onClick_) != null && onClick2 != OnClick.getDefaultInstance()) {
                    getOnClickBuilder().mergeFrom(onClick);
                } else {
                    this.onClick_ = onClick;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(onClick);
            }
            if (this.onClick_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearOnClick() {
            this.bitField0_ &= -3;
            this.onClick_ = null;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.onClickBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public OnClick.Builder getOnClickBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (OnClick.Builder) getOnClickFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public OnClickOrBuilder getOnClickOrBuilder() {
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (OnClickOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            OnClick onClick = this.onClick_;
            return onClick == null ? OnClick.getDefaultInstance() : onClick;
        }

        private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> getOnClickFieldBuilder() {
            if (this.onClickBuilder_ == null) {
                this.onClickBuilder_ = new SingleFieldBuilderV3<>(getOnClick(), getParentForChildren(), isClean());
                this.onClick_ = null;
            }
            return this.onClickBuilder_;
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
        public String getAltText() {
            Object obj = this.altText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.altText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ImageOrBuilder
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
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearAltText() {
            this.altText_ = Image.getDefaultInstance().getAltText();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setAltTextBytes(ByteString byteString) {
            byteString.getClass();
            Image.checkByteStringIsUtf8(byteString);
            this.altText_ = byteString;
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

    public static Image getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Image> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Image> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Image getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
