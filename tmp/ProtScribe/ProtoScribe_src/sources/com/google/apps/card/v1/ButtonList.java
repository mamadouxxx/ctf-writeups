package com.google.apps.card.v1;

import com.google.apps.card.v1.Button;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonList extends GeneratedMessageV3 implements ButtonListOrBuilder {
    public static final int BUTTONS_FIELD_NUMBER = 1;
    private static final ButtonList DEFAULT_INSTANCE = new ButtonList();
    private static final Parser<ButtonList> PARSER = new AbstractParser<ButtonList>() { // from class: com.google.apps.card.v1.ButtonList.1
        @Override // com.google.protobuf.Parser
        public ButtonList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ButtonList.newBuilder();
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
    private List<Button> buttons_;
    private byte memoizedIsInitialized;

    private ButtonList(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ButtonList() {
        this.memoizedIsInitialized = (byte) -1;
        this.buttons_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ButtonList();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_ButtonList_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_ButtonList_fieldAccessorTable.ensureFieldAccessorsInitialized(ButtonList.class, Builder.class);
    }

    @Override // com.google.apps.card.v1.ButtonListOrBuilder
    public List<Button> getButtonsList() {
        return this.buttons_;
    }

    @Override // com.google.apps.card.v1.ButtonListOrBuilder
    public List<? extends ButtonOrBuilder> getButtonsOrBuilderList() {
        return this.buttons_;
    }

    @Override // com.google.apps.card.v1.ButtonListOrBuilder
    public int getButtonsCount() {
        return this.buttons_.size();
    }

    @Override // com.google.apps.card.v1.ButtonListOrBuilder
    public Button getButtons(int i) {
        return this.buttons_.get(i);
    }

    @Override // com.google.apps.card.v1.ButtonListOrBuilder
    public ButtonOrBuilder getButtonsOrBuilder(int i) {
        return this.buttons_.get(i);
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
        for (int i = 0; i < this.buttons_.size(); i++) {
            codedOutputStream.writeMessage(1, this.buttons_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.buttons_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.buttons_.get(i2));
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
        if (!(obj instanceof ButtonList)) {
            return super.equals(obj);
        }
        ButtonList buttonList = (ButtonList) obj;
        return getButtonsList().equals(buttonList.getButtonsList()) && getUnknownFields().equals(buttonList.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getButtonsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getButtonsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ButtonList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ButtonList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ButtonList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ButtonList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ButtonList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ButtonList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ButtonList parseFrom(InputStream inputStream) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ButtonList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ButtonList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ButtonList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ButtonList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ButtonList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ButtonList) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ButtonList buttonList) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(buttonList);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ButtonListOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> buttonsBuilder_;
        private List<Button> buttons_;

        private void buildPartial0(ButtonList buttonList) {
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_ButtonList_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_ButtonList_fieldAccessorTable.ensureFieldAccessorsInitialized(ButtonList.class, Builder.class);
        }

        private Builder() {
            this.buttons_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.buttons_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.buttons_ = Collections.emptyList();
            } else {
                this.buttons_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_ButtonList_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ButtonList getDefaultInstanceForType() {
            return ButtonList.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ButtonList build() {
            ButtonList buttonListBuildPartial = buildPartial();
            if (buttonListBuildPartial.isInitialized()) {
                return buttonListBuildPartial;
            }
            throw newUninitializedMessageException((Message) buttonListBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ButtonList buildPartial() {
            ButtonList buttonList = new ButtonList(this);
            buildPartialRepeatedFields(buttonList);
            if (this.bitField0_ != 0) {
                buildPartial0(buttonList);
            }
            onBuilt();
            return buttonList;
        }

        private void buildPartialRepeatedFields(ButtonList buttonList) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                buttonList.buttons_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.buttons_ = Collections.unmodifiableList(this.buttons_);
                this.bitField0_ &= -2;
            }
            buttonList.buttons_ = this.buttons_;
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
            if (message instanceof ButtonList) {
                return mergeFrom((ButtonList) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ButtonList buttonList) {
            if (buttonList == ButtonList.getDefaultInstance()) {
                return this;
            }
            if (this.buttonsBuilder_ == null) {
                if (!buttonList.buttons_.isEmpty()) {
                    if (this.buttons_.isEmpty()) {
                        this.buttons_ = buttonList.buttons_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureButtonsIsMutable();
                        this.buttons_.addAll(buttonList.buttons_);
                    }
                    onChanged();
                }
            } else if (!buttonList.buttons_.isEmpty()) {
                if (!this.buttonsBuilder_.isEmpty()) {
                    this.buttonsBuilder_.addAllMessages(buttonList.buttons_);
                } else {
                    this.buttonsBuilder_.dispose();
                    this.buttonsBuilder_ = null;
                    this.buttons_ = buttonList.buttons_;
                    this.bitField0_ &= -2;
                    this.buttonsBuilder_ = ButtonList.alwaysUseFieldBuilders ? getButtonsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(buttonList.getUnknownFields());
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
                                Button button = (Button) codedInputStream.readMessage(Button.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureButtonsIsMutable();
                                    this.buttons_.add(button);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(button);
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

        private void ensureButtonsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.buttons_ = new ArrayList(this.buttons_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.apps.card.v1.ButtonListOrBuilder
        public List<Button> getButtonsList() {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.buttons_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.ButtonListOrBuilder
        public int getButtonsCount() {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.buttons_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.ButtonListOrBuilder
        public Button getButtons(int i) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.buttons_.get(i);
            }
            return (Button) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setButtons(int i, Button button) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.set(i, button);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, button);
            }
            return this;
        }

        public Builder setButtons(int i, Button.Builder builder) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureButtonsIsMutable();
                this.buttons_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addButtons(Button button) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.add(button);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(button);
            }
            return this;
        }

        public Builder addButtons(int i, Button button) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                button.getClass();
                ensureButtonsIsMutable();
                this.buttons_.add(i, button);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, button);
            }
            return this;
        }

        public Builder addButtons(Button.Builder builder) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureButtonsIsMutable();
                this.buttons_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addButtons(int i, Button.Builder builder) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureButtonsIsMutable();
                this.buttons_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllButtons(Iterable<? extends Button> iterable) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureButtonsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.buttons_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearButtons() {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.buttons_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeButtons(int i) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureButtonsIsMutable();
                this.buttons_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Button.Builder getButtonsBuilder(int i) {
            return (Button.Builder) getButtonsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.ButtonListOrBuilder
        public ButtonOrBuilder getButtonsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.buttons_.get(i);
            }
            return (ButtonOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.ButtonListOrBuilder
        public List<? extends ButtonOrBuilder> getButtonsOrBuilderList() {
            RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.buttons_);
        }

        public Button.Builder addButtonsBuilder() {
            return (Button.Builder) getButtonsFieldBuilder().addBuilder(Button.getDefaultInstance());
        }

        public Button.Builder addButtonsBuilder(int i) {
            return (Button.Builder) getButtonsFieldBuilder().addBuilder(i, Button.getDefaultInstance());
        }

        public List<Button.Builder> getButtonsBuilderList() {
            return getButtonsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getButtonsFieldBuilder() {
            if (this.buttonsBuilder_ == null) {
                this.buttonsBuilder_ = new RepeatedFieldBuilderV3<>(this.buttons_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.buttons_ = null;
            }
            return this.buttonsBuilder_;
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

    public static ButtonList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ButtonList> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ButtonList> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ButtonList getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
