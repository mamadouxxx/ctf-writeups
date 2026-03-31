package com.google.apps.card.v1;

import com.google.apps.card.v1.MaterialIcon;
import com.google.apps.card.v1.Widget;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Icon extends GeneratedMessageV3 implements IconOrBuilder {
    public static final int ALT_TEXT_FIELD_NUMBER = 3;
    public static final int ICON_URL_FIELD_NUMBER = 2;
    public static final int IMAGE_TYPE_FIELD_NUMBER = 4;
    public static final int KNOWN_ICON_FIELD_NUMBER = 1;
    public static final int MATERIAL_ICON_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object altText_;
    private int iconsCase_;
    private Object icons_;
    private int imageType_;
    private byte memoizedIsInitialized;
    private static final Icon DEFAULT_INSTANCE = new Icon();
    private static final Parser<Icon> PARSER = new AbstractParser<Icon>() { // from class: com.google.apps.card.v1.Icon.1
        @Override // com.google.protobuf.Parser
        public Icon parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Icon.newBuilder();
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

    private Icon(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.iconsCase_ = 0;
        this.altText_ = "";
        this.imageType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Icon() {
        this.iconsCase_ = 0;
        this.altText_ = "";
        this.imageType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.altText_ = "";
        this.imageType_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Icon();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Icon_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Icon_fieldAccessorTable.ensureFieldAccessorsInitialized(Icon.class, Builder.class);
    }

    public enum IconsCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        KNOWN_ICON(1),
        ICON_URL(2),
        MATERIAL_ICON(5),
        ICONS_NOT_SET(0);

        private final int value;

        IconsCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static IconsCase valueOf(int i) {
            return forNumber(i);
        }

        public static IconsCase forNumber(int i) {
            if (i == 0) {
                return ICONS_NOT_SET;
            }
            if (i == 1) {
                return KNOWN_ICON;
            }
            if (i == 2) {
                return ICON_URL;
            }
            if (i != 5) {
                return null;
            }
            return MATERIAL_ICON;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public IconsCase getIconsCase() {
        return IconsCase.forNumber(this.iconsCase_);
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public boolean hasKnownIcon() {
        return this.iconsCase_ == 1;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public String getKnownIcon() {
        Object obj;
        if (this.iconsCase_ != 1) {
            obj = "";
        } else {
            obj = this.icons_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.iconsCase_ == 1) {
            this.icons_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public ByteString getKnownIconBytes() {
        Object obj;
        if (this.iconsCase_ != 1) {
            obj = "";
        } else {
            obj = this.icons_;
        }
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.iconsCase_ == 1) {
                this.icons_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public boolean hasIconUrl() {
        return this.iconsCase_ == 2;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public String getIconUrl() {
        Object obj;
        if (this.iconsCase_ != 2) {
            obj = "";
        } else {
            obj = this.icons_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.iconsCase_ == 2) {
            this.icons_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public ByteString getIconUrlBytes() {
        Object obj;
        if (this.iconsCase_ != 2) {
            obj = "";
        } else {
            obj = this.icons_;
        }
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.iconsCase_ == 2) {
                this.icons_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public boolean hasMaterialIcon() {
        return this.iconsCase_ == 5;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public MaterialIcon getMaterialIcon() {
        if (this.iconsCase_ == 5) {
            return (MaterialIcon) this.icons_;
        }
        return MaterialIcon.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public MaterialIconOrBuilder getMaterialIconOrBuilder() {
        if (this.iconsCase_ == 5) {
            return (MaterialIcon) this.icons_;
        }
        return MaterialIcon.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public String getAltText() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.altText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public ByteString getAltTextBytes() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.altText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public int getImageTypeValue() {
        return this.imageType_;
    }

    @Override // com.google.apps.card.v1.IconOrBuilder
    public Widget.ImageType getImageType() {
        Widget.ImageType imageTypeForNumber = Widget.ImageType.forNumber(this.imageType_);
        return imageTypeForNumber == null ? Widget.ImageType.UNRECOGNIZED : imageTypeForNumber;
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
        if (this.iconsCase_ == 1) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.icons_);
        }
        if (this.iconsCase_ == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.icons_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.altText_);
        }
        if (this.imageType_ != Widget.ImageType.SQUARE.getNumber()) {
            codedOutputStream.writeEnum(4, this.imageType_);
        }
        if (this.iconsCase_ == 5) {
            codedOutputStream.writeMessage(5, (MaterialIcon) this.icons_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = this.iconsCase_ == 1 ? GeneratedMessageV3.computeStringSize(1, this.icons_) : 0;
        if (this.iconsCase_ == 2) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.icons_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.altText_);
        }
        if (this.imageType_ != Widget.ImageType.SQUARE.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(4, this.imageType_);
        }
        if (this.iconsCase_ == 5) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, (MaterialIcon) this.icons_);
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
        if (!(obj instanceof Icon)) {
            return super.equals(obj);
        }
        Icon icon = (Icon) obj;
        if (!getAltText().equals(icon.getAltText()) || this.imageType_ != icon.imageType_ || !getIconsCase().equals(icon.getIconsCase())) {
            return false;
        }
        int i = this.iconsCase_;
        if (i != 1) {
            if (i == 2) {
                if (!getIconUrl().equals(icon.getIconUrl())) {
                    return false;
                }
            } else if (i == 5 && !getMaterialIcon().equals(icon.getMaterialIcon())) {
                return false;
            }
        } else if (!getKnownIcon().equals(icon.getKnownIcon())) {
            return false;
        }
        return getUnknownFields().equals(icon.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = ((((((((779 + getDescriptor().hashCode()) * 37) + 3) * 53) + getAltText().hashCode()) * 37) + 4) * 53) + this.imageType_;
        int i2 = this.iconsCase_;
        if (i2 == 1) {
            i = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getKnownIcon().hashCode();
        } else if (i2 == 2) {
            i = ((iHashCode2 * 37) + 2) * 53;
            iHashCode = getIconUrl().hashCode();
        } else {
            if (i2 == 5) {
                i = ((iHashCode2 * 37) + 5) * 53;
                iHashCode = getMaterialIcon().hashCode();
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

    public static Icon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Icon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Icon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Icon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Icon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Icon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Icon parseFrom(InputStream inputStream) throws IOException {
        return (Icon) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Icon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Icon) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Icon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Icon) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Icon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Icon) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Icon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Icon) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Icon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Icon) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Icon icon) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(icon);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IconOrBuilder {
        private Object altText_;
        private int bitField0_;
        private int iconsCase_;
        private Object icons_;
        private int imageType_;
        private SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> materialIconBuilder_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Icon_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Icon_fieldAccessorTable.ensureFieldAccessorsInitialized(Icon.class, Builder.class);
        }

        private Builder() {
            this.iconsCase_ = 0;
            this.altText_ = "";
            this.imageType_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.iconsCase_ = 0;
            this.altText_ = "";
            this.imageType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.clear();
            }
            this.altText_ = "";
            this.imageType_ = 0;
            this.iconsCase_ = 0;
            this.icons_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Icon_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Icon getDefaultInstanceForType() {
            return Icon.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Icon build() {
            Icon iconBuildPartial = buildPartial();
            if (iconBuildPartial.isInitialized()) {
                return iconBuildPartial;
            }
            throw newUninitializedMessageException((Message) iconBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Icon buildPartial() {
            Icon icon = new Icon(this);
            if (this.bitField0_ != 0) {
                buildPartial0(icon);
            }
            buildPartialOneofs(icon);
            onBuilt();
            return icon;
        }

        private void buildPartial0(Icon icon) {
            int i = this.bitField0_;
            if ((i & 8) != 0) {
                icon.altText_ = this.altText_;
            }
            if ((i & 16) != 0) {
                icon.imageType_ = this.imageType_;
            }
        }

        private void buildPartialOneofs(Icon icon) {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3;
            icon.iconsCase_ = this.iconsCase_;
            icon.icons_ = this.icons_;
            if (this.iconsCase_ != 5 || (singleFieldBuilderV3 = this.materialIconBuilder_) == null) {
                return;
            }
            icon.icons_ = singleFieldBuilderV3.build();
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
            if (message instanceof Icon) {
                return mergeFrom((Icon) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Icon icon) {
            if (icon == Icon.getDefaultInstance()) {
                return this;
            }
            if (!icon.getAltText().isEmpty()) {
                this.altText_ = icon.altText_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (icon.imageType_ != 0) {
                setImageTypeValue(icon.getImageTypeValue());
            }
            int i = AnonymousClass2.$SwitchMap$com$google$apps$card$v1$Icon$IconsCase[icon.getIconsCase().ordinal()];
            if (i == 1) {
                this.iconsCase_ = 1;
                this.icons_ = icon.icons_;
                onChanged();
            } else if (i == 2) {
                this.iconsCase_ = 2;
                this.icons_ = icon.icons_;
                onChanged();
            } else if (i == 3) {
                mergeMaterialIcon(icon.getMaterialIcon());
            }
            mergeUnknownFields(icon.getUnknownFields());
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
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                this.iconsCase_ = 1;
                                this.icons_ = stringRequireUtf8;
                            } else if (tag == 18) {
                                String stringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                this.iconsCase_ = 2;
                                this.icons_ = stringRequireUtf82;
                            } else if (tag == 26) {
                                this.altText_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 32) {
                                this.imageType_ = codedInputStream.readEnum();
                                this.bitField0_ |= 16;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getMaterialIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.iconsCase_ = 5;
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

        @Override // com.google.apps.card.v1.IconOrBuilder
        public IconsCase getIconsCase() {
            return IconsCase.forNumber(this.iconsCase_);
        }

        public Builder clearIcons() {
            this.iconsCase_ = 0;
            this.icons_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public boolean hasKnownIcon() {
            return this.iconsCase_ == 1;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public String getKnownIcon() {
            Object obj;
            if (this.iconsCase_ != 1) {
                obj = "";
            } else {
                obj = this.icons_;
            }
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.iconsCase_ == 1) {
                    this.icons_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public ByteString getKnownIconBytes() {
            Object obj;
            if (this.iconsCase_ != 1) {
                obj = "";
            } else {
                obj = this.icons_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.iconsCase_ == 1) {
                    this.icons_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setKnownIcon(String str) {
            str.getClass();
            this.iconsCase_ = 1;
            this.icons_ = str;
            onChanged();
            return this;
        }

        public Builder clearKnownIcon() {
            if (this.iconsCase_ == 1) {
                this.iconsCase_ = 0;
                this.icons_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setKnownIconBytes(ByteString byteString) {
            byteString.getClass();
            Icon.checkByteStringIsUtf8(byteString);
            this.iconsCase_ = 1;
            this.icons_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public boolean hasIconUrl() {
            return this.iconsCase_ == 2;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public String getIconUrl() {
            Object obj;
            if (this.iconsCase_ != 2) {
                obj = "";
            } else {
                obj = this.icons_;
            }
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.iconsCase_ == 2) {
                    this.icons_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public ByteString getIconUrlBytes() {
            Object obj;
            if (this.iconsCase_ != 2) {
                obj = "";
            } else {
                obj = this.icons_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.iconsCase_ == 2) {
                    this.icons_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setIconUrl(String str) {
            str.getClass();
            this.iconsCase_ = 2;
            this.icons_ = str;
            onChanged();
            return this;
        }

        public Builder clearIconUrl() {
            if (this.iconsCase_ == 2) {
                this.iconsCase_ = 0;
                this.icons_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setIconUrlBytes(ByteString byteString) {
            byteString.getClass();
            Icon.checkByteStringIsUtf8(byteString);
            this.iconsCase_ = 2;
            this.icons_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public boolean hasMaterialIcon() {
            return this.iconsCase_ == 5;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public MaterialIcon getMaterialIcon() {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.iconsCase_ == 5) {
                    return (MaterialIcon) this.icons_;
                }
                return MaterialIcon.getDefaultInstance();
            }
            if (this.iconsCase_ == 5) {
                return (MaterialIcon) singleFieldBuilderV3.getMessage();
            }
            return MaterialIcon.getDefaultInstance();
        }

        public Builder setMaterialIcon(MaterialIcon materialIcon) {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                materialIcon.getClass();
                this.icons_ = materialIcon;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(materialIcon);
            }
            this.iconsCase_ = 5;
            return this;
        }

        public Builder setMaterialIcon(MaterialIcon.Builder builder) {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.icons_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.iconsCase_ = 5;
            return this;
        }

        public Builder mergeMaterialIcon(MaterialIcon materialIcon) {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.iconsCase_ == 5 && this.icons_ != MaterialIcon.getDefaultInstance()) {
                    this.icons_ = MaterialIcon.newBuilder((MaterialIcon) this.icons_).mergeFrom(materialIcon).buildPartial();
                } else {
                    this.icons_ = materialIcon;
                }
                onChanged();
            } else if (this.iconsCase_ == 5) {
                singleFieldBuilderV3.mergeFrom(materialIcon);
            } else {
                singleFieldBuilderV3.setMessage(materialIcon);
            }
            this.iconsCase_ = 5;
            return this;
        }

        public Builder clearMaterialIcon() {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3 = this.materialIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.iconsCase_ == 5) {
                    this.iconsCase_ = 0;
                    this.icons_ = null;
                    onChanged();
                }
            } else {
                if (this.iconsCase_ == 5) {
                    this.iconsCase_ = 0;
                    this.icons_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public MaterialIcon.Builder getMaterialIconBuilder() {
            return (MaterialIcon.Builder) getMaterialIconFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public MaterialIconOrBuilder getMaterialIconOrBuilder() {
            SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> singleFieldBuilderV3;
            int i = this.iconsCase_;
            if (i == 5 && (singleFieldBuilderV3 = this.materialIconBuilder_) != null) {
                return (MaterialIconOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 5) {
                return (MaterialIcon) this.icons_;
            }
            return MaterialIcon.getDefaultInstance();
        }

        private SingleFieldBuilderV3<MaterialIcon, MaterialIcon.Builder, MaterialIconOrBuilder> getMaterialIconFieldBuilder() {
            if (this.materialIconBuilder_ == null) {
                if (this.iconsCase_ != 5) {
                    this.icons_ = MaterialIcon.getDefaultInstance();
                }
                this.materialIconBuilder_ = new SingleFieldBuilderV3<>((MaterialIcon) this.icons_, getParentForChildren(), isClean());
                this.icons_ = null;
            }
            this.iconsCase_ = 5;
            onChanged();
            return this.materialIconBuilder_;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public String getAltText() {
            Object obj = this.altText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.altText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
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
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearAltText() {
            this.altText_ = Icon.getDefaultInstance().getAltText();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setAltTextBytes(ByteString byteString) {
            byteString.getClass();
            Icon.checkByteStringIsUtf8(byteString);
            this.altText_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public int getImageTypeValue() {
            return this.imageType_;
        }

        public Builder setImageTypeValue(int i) {
            this.imageType_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.IconOrBuilder
        public Widget.ImageType getImageType() {
            Widget.ImageType imageTypeForNumber = Widget.ImageType.forNumber(this.imageType_);
            return imageTypeForNumber == null ? Widget.ImageType.UNRECOGNIZED : imageTypeForNumber;
        }

        public Builder setImageType(Widget.ImageType imageType) {
            imageType.getClass();
            this.bitField0_ |= 16;
            this.imageType_ = imageType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearImageType() {
            this.bitField0_ &= -17;
            this.imageType_ = 0;
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

    /* JADX INFO: renamed from: com.google.apps.card.v1.Icon$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$Icon$IconsCase;

        static {
            int[] iArr = new int[IconsCase.values().length];
            $SwitchMap$com$google$apps$card$v1$Icon$IconsCase = iArr;
            try {
                iArr[IconsCase.KNOWN_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Icon$IconsCase[IconsCase.ICON_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Icon$IconsCase[IconsCase.MATERIAL_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Icon$IconsCase[IconsCase.ICONS_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Icon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Icon> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Icon> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Icon getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
