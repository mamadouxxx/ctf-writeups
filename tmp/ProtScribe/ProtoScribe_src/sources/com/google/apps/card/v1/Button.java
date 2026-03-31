package com.google.apps.card.v1;

import com.google.apps.card.v1.Icon;
import com.google.apps.card.v1.OnClick;
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
import com.google.type.Color;
import com.google.type.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Button extends GeneratedMessageV3 implements ButtonOrBuilder {
    public static final int ALT_TEXT_FIELD_NUMBER = 6;
    public static final int COLOR_FIELD_NUMBER = 3;
    public static final int DISABLED_FIELD_NUMBER = 5;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int ON_CLICK_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object altText_;
    private int bitField0_;
    private Color color_;
    private boolean disabled_;
    private Icon icon_;
    private byte memoizedIsInitialized;
    private OnClick onClick_;
    private volatile Object text_;
    private static final Button DEFAULT_INSTANCE = new Button();
    private static final Parser<Button> PARSER = new AbstractParser<Button>() { // from class: com.google.apps.card.v1.Button.1
        @Override // com.google.protobuf.Parser
        public Button parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Button.newBuilder();
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

    static /* synthetic */ int access$1076(Button button, int i) {
        int i2 = i | button.bitField0_;
        button.bitField0_ = i2;
        return i2;
    }

    private Button(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.text_ = "";
        this.disabled_ = false;
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Button() {
        this.text_ = "";
        this.disabled_ = false;
        this.altText_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.text_ = "";
        this.altText_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Button();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Button_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Button_fieldAccessorTable.ensureFieldAccessorsInitialized(Button.class, Builder.class);
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public String getText() {
        Object obj = this.text_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.text_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public ByteString getTextBytes() {
        Object obj = this.text_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public Icon getIcon() {
        Icon icon = this.icon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public IconOrBuilder getIconOrBuilder() {
        Icon icon = this.icon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public Color getColor() {
        Color color = this.color_;
        return color == null ? Color.getDefaultInstance() : color;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public ColorOrBuilder getColorOrBuilder() {
        Color color = this.color_;
        return color == null ? Color.getDefaultInstance() : color;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public boolean hasOnClick() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public OnClick getOnClick() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public OnClickOrBuilder getOnClickOrBuilder() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public boolean getDisabled() {
        return this.disabled_;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
    public String getAltText() {
        Object obj = this.altText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.altText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ButtonOrBuilder
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
        if (!GeneratedMessageV3.isStringEmpty(this.text_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.text_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(2, getIcon());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(3, getColor());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(4, getOnClick());
        }
        boolean z = this.disabled_;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.altText_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.text_) ? GeneratedMessageV3.computeStringSize(1, this.text_) : 0;
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, getIcon());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, getColor());
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, getOnClick());
        }
        boolean z = this.disabled_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(5, z);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.altText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.altText_);
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
        if (!(obj instanceof Button)) {
            return super.equals(obj);
        }
        Button button = (Button) obj;
        if (!getText().equals(button.getText()) || hasIcon() != button.hasIcon()) {
            return false;
        }
        if ((hasIcon() && !getIcon().equals(button.getIcon())) || hasColor() != button.hasColor()) {
            return false;
        }
        if ((!hasColor() || getColor().equals(button.getColor())) && hasOnClick() == button.hasOnClick()) {
            return (!hasOnClick() || getOnClick().equals(button.getOnClick())) && getDisabled() == button.getDisabled() && getAltText().equals(button.getAltText()) && getUnknownFields().equals(button.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode();
        if (hasIcon()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getIcon().hashCode();
        }
        if (hasColor()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getColor().hashCode();
        }
        if (hasOnClick()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getOnClick().hashCode();
        }
        int iHashBoolean = (((((((((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getDisabled())) * 37) + 6) * 53) + getAltText().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashBoolean;
        return iHashBoolean;
    }

    public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Button parseFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Button) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Button button) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(button);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ButtonOrBuilder {
        private Object altText_;
        private int bitField0_;
        private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
        private Color color_;
        private boolean disabled_;
        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;
        private Icon icon_;
        private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> onClickBuilder_;
        private OnClick onClick_;
        private Object text_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Button_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Button_fieldAccessorTable.ensureFieldAccessorsInitialized(Button.class, Builder.class);
        }

        private Builder() {
            this.text_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.text_ = "";
            this.altText_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Button.alwaysUseFieldBuilders) {
                getIconFieldBuilder();
                getColorFieldBuilder();
                getOnClickFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.text_ = "";
            this.icon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.iconBuilder_ = null;
            }
            this.color_ = null;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV32 = this.colorBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.colorBuilder_ = null;
            }
            this.onClick_ = null;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV33 = this.onClickBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.onClickBuilder_ = null;
            }
            this.disabled_ = false;
            this.altText_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Button_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Button getDefaultInstanceForType() {
            return Button.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Button build() {
            Button buttonBuildPartial = buildPartial();
            if (buttonBuildPartial.isInitialized()) {
                return buttonBuildPartial;
            }
            throw newUninitializedMessageException((Message) buttonBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Button buildPartial() {
            Button button = new Button(this);
            if (this.bitField0_ != 0) {
                buildPartial0(button);
            }
            onBuilt();
            return button;
        }

        private void buildPartial0(Button button) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                button.text_ = this.text_;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
                button.icon_ = singleFieldBuilderV3 == null ? this.icon_ : (Icon) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV32 = this.colorBuilder_;
                button.color_ = singleFieldBuilderV32 == null ? this.color_ : (Color) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV33 = this.onClickBuilder_;
                button.onClick_ = singleFieldBuilderV33 == null ? this.onClick_ : (OnClick) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                button.disabled_ = this.disabled_;
            }
            if ((i2 & 32) != 0) {
                button.altText_ = this.altText_;
            }
            Button.access$1076(button, i);
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
            if (message instanceof Button) {
                return mergeFrom((Button) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Button button) {
            if (button == Button.getDefaultInstance()) {
                return this;
            }
            if (!button.getText().isEmpty()) {
                this.text_ = button.text_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (button.hasIcon()) {
                mergeIcon(button.getIcon());
            }
            if (button.hasColor()) {
                mergeColor(button.getColor());
            }
            if (button.hasOnClick()) {
                mergeOnClick(button.getOnClick());
            }
            if (button.getDisabled()) {
                setDisabled(button.getDisabled());
            }
            if (!button.getAltText().isEmpty()) {
                this.altText_ = button.altText_;
                this.bitField0_ |= 32;
                onChanged();
            }
            mergeUnknownFields(button.getUnknownFields());
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
                                this.text_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getColorFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getOnClickFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.disabled_ = codedInputStream.readBool();
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                this.altText_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
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

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.text_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setText(String str) {
            str.getClass();
            this.text_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearText() {
            this.text_ = Button.getDefaultInstance().getText();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            byteString.getClass();
            Button.checkByteStringIsUtf8(byteString);
            this.text_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public boolean hasIcon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public Icon getIcon() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                Icon icon = this.icon_;
                return icon == null ? Icon.getDefaultInstance() : icon;
            }
            return (Icon) singleFieldBuilderV3.getMessage();
        }

        public Builder setIcon(Icon icon) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                icon.getClass();
                this.icon_ = icon;
            } else {
                singleFieldBuilderV3.setMessage(icon);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setIcon(Icon.Builder builder) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.icon_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeIcon(Icon icon) {
            Icon icon2;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (icon2 = this.icon_) != null && icon2 != Icon.getDefaultInstance()) {
                    getIconBuilder().mergeFrom(icon);
                } else {
                    this.icon_ = icon;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(icon);
            }
            if (this.icon_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearIcon() {
            this.bitField0_ &= -3;
            this.icon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.iconBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Icon.Builder getIconBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Icon.Builder) getIconFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public IconOrBuilder getIconOrBuilder() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (IconOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Icon icon = this.icon_;
            return icon == null ? Icon.getDefaultInstance() : icon;
        }

        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getIconFieldBuilder() {
            if (this.iconBuilder_ == null) {
                this.iconBuilder_ = new SingleFieldBuilderV3<>(getIcon(), getParentForChildren(), isClean());
                this.icon_ = null;
            }
            return this.iconBuilder_;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public boolean hasColor() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public Color getColor() {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Color color = this.color_;
                return color == null ? Color.getDefaultInstance() : color;
            }
            return (Color) singleFieldBuilderV3.getMessage();
        }

        public Builder setColor(Color color) {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 == null) {
                color.getClass();
                this.color_ = color;
            } else {
                singleFieldBuilderV3.setMessage(color);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setColor(Color.Builder builder) {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.color_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeColor(Color color) {
            Color color2;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (color2 = this.color_) != null && color2 != Color.getDefaultInstance()) {
                    getColorBuilder().mergeFrom(color);
                } else {
                    this.color_ = color;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(color);
            }
            if (this.color_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearColor() {
            this.bitField0_ &= -5;
            this.color_ = null;
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.colorBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Color.Builder getColorBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (Color.Builder) getColorFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public ColorOrBuilder getColorOrBuilder() {
            SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> singleFieldBuilderV3 = this.colorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ColorOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Color color = this.color_;
            return color == null ? Color.getDefaultInstance() : color;
        }

        private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
            if (this.colorBuilder_ == null) {
                this.colorBuilder_ = new SingleFieldBuilderV3<>(getColor(), getParentForChildren(), isClean());
                this.color_ = null;
            }
            return this.colorBuilder_;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public boolean hasOnClick() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
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
            this.bitField0_ |= 8;
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
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeOnClick(OnClick onClick) {
            OnClick onClick2;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (onClick2 = this.onClick_) != null && onClick2 != OnClick.getDefaultInstance()) {
                    getOnClickBuilder().mergeFrom(onClick);
                } else {
                    this.onClick_ = onClick;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(onClick);
            }
            if (this.onClick_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearOnClick() {
            this.bitField0_ &= -9;
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
            this.bitField0_ |= 8;
            onChanged();
            return (OnClick.Builder) getOnClickFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
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

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public boolean getDisabled() {
            return this.disabled_;
        }

        public Builder setDisabled(boolean z) {
            this.disabled_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearDisabled() {
            this.bitField0_ &= -17;
            this.disabled_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
        public String getAltText() {
            Object obj = this.altText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.altText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ButtonOrBuilder
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
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearAltText() {
            this.altText_ = Button.getDefaultInstance().getAltText();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder setAltTextBytes(ByteString byteString) {
            byteString.getClass();
            Button.checkByteStringIsUtf8(byteString);
            this.altText_ = byteString;
            this.bitField0_ |= 32;
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

    public static Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Button> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Button> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Button getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
