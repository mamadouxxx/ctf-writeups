package com.google.apps.card.v1;

import com.google.apps.card.v1.Action;
import com.google.apps.card.v1.Card;
import com.google.apps.card.v1.OpenLink;
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
public final class OnClick extends GeneratedMessageV3 implements OnClickOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    public static final int OPEN_DYNAMIC_LINK_ACTION_FIELD_NUMBER = 3;
    public static final int OPEN_LINK_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int dataCase_;
    private Object data_;
    private byte memoizedIsInitialized;
    private static final OnClick DEFAULT_INSTANCE = new OnClick();
    private static final Parser<OnClick> PARSER = new AbstractParser<OnClick>() { // from class: com.google.apps.card.v1.OnClick.1
        @Override // com.google.protobuf.Parser
        public OnClick parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = OnClick.newBuilder();
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

    private OnClick(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.dataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private OnClick() {
        this.dataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new OnClick();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_OnClick_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_OnClick_fieldAccessorTable.ensureFieldAccessorsInitialized(OnClick.class, Builder.class);
    }

    public enum DataCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        ACTION(1),
        OPEN_LINK(2),
        OPEN_DYNAMIC_LINK_ACTION(3),
        CARD(4),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }

        public static DataCase forNumber(int i) {
            if (i == 0) {
                return DATA_NOT_SET;
            }
            if (i == 1) {
                return ACTION;
            }
            if (i == 2) {
                return OPEN_LINK;
            }
            if (i == 3) {
                return OPEN_DYNAMIC_LINK_ACTION;
            }
            if (i != 4) {
                return null;
            }
            return CARD;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public boolean hasAction() {
        return this.dataCase_ == 1;
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public Action getAction() {
        if (this.dataCase_ == 1) {
            return (Action) this.data_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public ActionOrBuilder getActionOrBuilder() {
        if (this.dataCase_ == 1) {
            return (Action) this.data_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public boolean hasOpenLink() {
        return this.dataCase_ == 2;
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public OpenLink getOpenLink() {
        if (this.dataCase_ == 2) {
            return (OpenLink) this.data_;
        }
        return OpenLink.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public OpenLinkOrBuilder getOpenLinkOrBuilder() {
        if (this.dataCase_ == 2) {
            return (OpenLink) this.data_;
        }
        return OpenLink.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public boolean hasOpenDynamicLinkAction() {
        return this.dataCase_ == 3;
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public Action getOpenDynamicLinkAction() {
        if (this.dataCase_ == 3) {
            return (Action) this.data_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public ActionOrBuilder getOpenDynamicLinkActionOrBuilder() {
        if (this.dataCase_ == 3) {
            return (Action) this.data_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public boolean hasCard() {
        return this.dataCase_ == 4;
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public Card getCard() {
        if (this.dataCase_ == 4) {
            return (Card) this.data_;
        }
        return Card.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.OnClickOrBuilder
    public CardOrBuilder getCardOrBuilder() {
        if (this.dataCase_ == 4) {
            return (Card) this.data_;
        }
        return Card.getDefaultInstance();
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
        if (this.dataCase_ == 1) {
            codedOutputStream.writeMessage(1, (Action) this.data_);
        }
        if (this.dataCase_ == 2) {
            codedOutputStream.writeMessage(2, (OpenLink) this.data_);
        }
        if (this.dataCase_ == 3) {
            codedOutputStream.writeMessage(3, (Action) this.data_);
        }
        if (this.dataCase_ == 4) {
            codedOutputStream.writeMessage(4, (Card) this.data_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = this.dataCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (Action) this.data_) : 0;
        if (this.dataCase_ == 2) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (OpenLink) this.data_);
        }
        if (this.dataCase_ == 3) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (Action) this.data_);
        }
        if (this.dataCase_ == 4) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (Card) this.data_);
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
        if (!(obj instanceof OnClick)) {
            return super.equals(obj);
        }
        OnClick onClick = (OnClick) obj;
        if (!getDataCase().equals(onClick.getDataCase())) {
            return false;
        }
        int i = this.dataCase_;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (!getOpenDynamicLinkAction().equals(onClick.getOpenDynamicLinkAction())) {
                        return false;
                    }
                } else if (i == 4 && !getCard().equals(onClick.getCard())) {
                    return false;
                }
            } else if (!getOpenLink().equals(onClick.getOpenLink())) {
                return false;
            }
        } else if (!getAction().equals(onClick.getAction())) {
            return false;
        }
        return getUnknownFields().equals(onClick.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        int i2 = this.dataCase_;
        if (i2 == 1) {
            i = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getAction().hashCode();
        } else if (i2 == 2) {
            i = ((iHashCode2 * 37) + 2) * 53;
            iHashCode = getOpenLink().hashCode();
        } else if (i2 == 3) {
            i = ((iHashCode2 * 37) + 3) * 53;
            iHashCode = getOpenDynamicLinkAction().hashCode();
        } else {
            if (i2 == 4) {
                i = ((iHashCode2 * 37) + 4) * 53;
                iHashCode = getCard().hashCode();
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

    public static OnClick parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static OnClick parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static OnClick parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static OnClick parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static OnClick parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static OnClick parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static OnClick parseFrom(InputStream inputStream) throws IOException {
        return (OnClick) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static OnClick parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnClick) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OnClick parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OnClick) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OnClick parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnClick) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OnClick parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OnClick) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static OnClick parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OnClick) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(OnClick onClick) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(onClick);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OnClickOrBuilder {
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> actionBuilder_;
        private int bitField0_;
        private SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> cardBuilder_;
        private int dataCase_;
        private Object data_;
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> openDynamicLinkActionBuilder_;
        private SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> openLinkBuilder_;

        private void buildPartial0(OnClick onClick) {
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_OnClick_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_OnClick_fieldAccessorTable.ensureFieldAccessorsInitialized(OnClick.class, Builder.class);
        }

        private Builder() {
            this.dataCase_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.dataCase_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.clear();
            }
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV32 = this.openLinkBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.clear();
            }
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV33 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.clear();
            }
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV34 = this.cardBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.clear();
            }
            this.dataCase_ = 0;
            this.data_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_OnClick_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OnClick getDefaultInstanceForType() {
            return OnClick.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OnClick build() {
            OnClick onClickBuildPartial = buildPartial();
            if (onClickBuildPartial.isInitialized()) {
                return onClickBuildPartial;
            }
            throw newUninitializedMessageException((Message) onClickBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OnClick buildPartial() {
            OnClick onClick = new OnClick(this);
            if (this.bitField0_ != 0) {
                buildPartial0(onClick);
            }
            buildPartialOneofs(onClick);
            onBuilt();
            return onClick;
        }

        private void buildPartialOneofs(OnClick onClick) {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV32;
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV33;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV34;
            onClick.dataCase_ = this.dataCase_;
            onClick.data_ = this.data_;
            if (this.dataCase_ == 1 && (singleFieldBuilderV34 = this.actionBuilder_) != null) {
                onClick.data_ = singleFieldBuilderV34.build();
            }
            if (this.dataCase_ == 2 && (singleFieldBuilderV33 = this.openLinkBuilder_) != null) {
                onClick.data_ = singleFieldBuilderV33.build();
            }
            if (this.dataCase_ == 3 && (singleFieldBuilderV32 = this.openDynamicLinkActionBuilder_) != null) {
                onClick.data_ = singleFieldBuilderV32.build();
            }
            if (this.dataCase_ != 4 || (singleFieldBuilderV3 = this.cardBuilder_) == null) {
                return;
            }
            onClick.data_ = singleFieldBuilderV3.build();
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
            if (message instanceof OnClick) {
                return mergeFrom((OnClick) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(OnClick onClick) {
            if (onClick == OnClick.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$com$google$apps$card$v1$OnClick$DataCase[onClick.getDataCase().ordinal()];
            if (i == 1) {
                mergeAction(onClick.getAction());
            } else if (i == 2) {
                mergeOpenLink(onClick.getOpenLink());
            } else if (i == 3) {
                mergeOpenDynamicLinkAction(onClick.getOpenDynamicLinkAction());
            } else if (i == 4) {
                mergeCard(onClick.getCard());
            }
            mergeUnknownFields(onClick.getUnknownFields());
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
                                codedInputStream.readMessage(getActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 1;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getOpenLinkFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getOpenDynamicLinkActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 3;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getCardFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 4;
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

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public DataCase getDataCase() {
            return DataCase.forNumber(this.dataCase_);
        }

        public Builder clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public boolean hasAction() {
            return this.dataCase_ == 1;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public Action getAction() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 1) {
                    return (Action) this.data_;
                }
                return Action.getDefaultInstance();
            }
            if (this.dataCase_ == 1) {
                return (Action) singleFieldBuilderV3.getMessage();
            }
            return Action.getDefaultInstance();
        }

        public Builder setAction(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 == null) {
                action.getClass();
                this.data_ = action;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.dataCase_ = 1;
            return this;
        }

        public Builder setAction(Action.Builder builder) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 1;
            return this;
        }

        public Builder mergeAction(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 1 && this.data_ != Action.getDefaultInstance()) {
                    this.data_ = Action.newBuilder((Action) this.data_).mergeFrom(action).buildPartial();
                } else {
                    this.data_ = action;
                }
                onChanged();
            } else if (this.dataCase_ == 1) {
                singleFieldBuilderV3.mergeFrom(action);
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.dataCase_ = 1;
            return this;
        }

        public Builder clearAction() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.actionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 1) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 1) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Action.Builder getActionBuilder() {
            return (Action.Builder) getActionFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public ActionOrBuilder getActionOrBuilder() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 1 && (singleFieldBuilderV3 = this.actionBuilder_) != null) {
                return (ActionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 1) {
                return (Action) this.data_;
            }
            return Action.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> getActionFieldBuilder() {
            if (this.actionBuilder_ == null) {
                if (this.dataCase_ != 1) {
                    this.data_ = Action.getDefaultInstance();
                }
                this.actionBuilder_ = new SingleFieldBuilderV3<>((Action) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 1;
            onChanged();
            return this.actionBuilder_;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public boolean hasOpenLink() {
            return this.dataCase_ == 2;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public OpenLink getOpenLink() {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3 = this.openLinkBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 2) {
                    return (OpenLink) this.data_;
                }
                return OpenLink.getDefaultInstance();
            }
            if (this.dataCase_ == 2) {
                return (OpenLink) singleFieldBuilderV3.getMessage();
            }
            return OpenLink.getDefaultInstance();
        }

        public Builder setOpenLink(OpenLink openLink) {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3 = this.openLinkBuilder_;
            if (singleFieldBuilderV3 == null) {
                openLink.getClass();
                this.data_ = openLink;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(openLink);
            }
            this.dataCase_ = 2;
            return this;
        }

        public Builder setOpenLink(OpenLink.Builder builder) {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3 = this.openLinkBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 2;
            return this;
        }

        public Builder mergeOpenLink(OpenLink openLink) {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3 = this.openLinkBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 2 && this.data_ != OpenLink.getDefaultInstance()) {
                    this.data_ = OpenLink.newBuilder((OpenLink) this.data_).mergeFrom(openLink).buildPartial();
                } else {
                    this.data_ = openLink;
                }
                onChanged();
            } else if (this.dataCase_ == 2) {
                singleFieldBuilderV3.mergeFrom(openLink);
            } else {
                singleFieldBuilderV3.setMessage(openLink);
            }
            this.dataCase_ = 2;
            return this;
        }

        public Builder clearOpenLink() {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3 = this.openLinkBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 2) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 2) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public OpenLink.Builder getOpenLinkBuilder() {
            return (OpenLink.Builder) getOpenLinkFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public OpenLinkOrBuilder getOpenLinkOrBuilder() {
            SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 2 && (singleFieldBuilderV3 = this.openLinkBuilder_) != null) {
                return (OpenLinkOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 2) {
                return (OpenLink) this.data_;
            }
            return OpenLink.getDefaultInstance();
        }

        private SingleFieldBuilderV3<OpenLink, OpenLink.Builder, OpenLinkOrBuilder> getOpenLinkFieldBuilder() {
            if (this.openLinkBuilder_ == null) {
                if (this.dataCase_ != 2) {
                    this.data_ = OpenLink.getDefaultInstance();
                }
                this.openLinkBuilder_ = new SingleFieldBuilderV3<>((OpenLink) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 2;
            onChanged();
            return this.openLinkBuilder_;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public boolean hasOpenDynamicLinkAction() {
            return this.dataCase_ == 3;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public Action getOpenDynamicLinkAction() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 3) {
                    return (Action) this.data_;
                }
                return Action.getDefaultInstance();
            }
            if (this.dataCase_ == 3) {
                return (Action) singleFieldBuilderV3.getMessage();
            }
            return Action.getDefaultInstance();
        }

        public Builder setOpenDynamicLinkAction(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                action.getClass();
                this.data_ = action;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.dataCase_ = 3;
            return this;
        }

        public Builder setOpenDynamicLinkAction(Action.Builder builder) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 3;
            return this;
        }

        public Builder mergeOpenDynamicLinkAction(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 3 && this.data_ != Action.getDefaultInstance()) {
                    this.data_ = Action.newBuilder((Action) this.data_).mergeFrom(action).buildPartial();
                } else {
                    this.data_ = action;
                }
                onChanged();
            } else if (this.dataCase_ == 3) {
                singleFieldBuilderV3.mergeFrom(action);
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.dataCase_ = 3;
            return this;
        }

        public Builder clearOpenDynamicLinkAction() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 3) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 3) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Action.Builder getOpenDynamicLinkActionBuilder() {
            return (Action.Builder) getOpenDynamicLinkActionFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public ActionOrBuilder getOpenDynamicLinkActionOrBuilder() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 3 && (singleFieldBuilderV3 = this.openDynamicLinkActionBuilder_) != null) {
                return (ActionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 3) {
                return (Action) this.data_;
            }
            return Action.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> getOpenDynamicLinkActionFieldBuilder() {
            if (this.openDynamicLinkActionBuilder_ == null) {
                if (this.dataCase_ != 3) {
                    this.data_ = Action.getDefaultInstance();
                }
                this.openDynamicLinkActionBuilder_ = new SingleFieldBuilderV3<>((Action) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 3;
            onChanged();
            return this.openDynamicLinkActionBuilder_;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public boolean hasCard() {
            return this.dataCase_ == 4;
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public Card getCard() {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3 = this.cardBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 4) {
                    return (Card) this.data_;
                }
                return Card.getDefaultInstance();
            }
            if (this.dataCase_ == 4) {
                return (Card) singleFieldBuilderV3.getMessage();
            }
            return Card.getDefaultInstance();
        }

        public Builder setCard(Card card) {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3 = this.cardBuilder_;
            if (singleFieldBuilderV3 == null) {
                card.getClass();
                this.data_ = card;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(card);
            }
            this.dataCase_ = 4;
            return this;
        }

        public Builder setCard(Card.Builder builder) {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3 = this.cardBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 4;
            return this;
        }

        public Builder mergeCard(Card card) {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3 = this.cardBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 4 && this.data_ != Card.getDefaultInstance()) {
                    this.data_ = Card.newBuilder((Card) this.data_).mergeFrom(card).buildPartial();
                } else {
                    this.data_ = card;
                }
                onChanged();
            } else if (this.dataCase_ == 4) {
                singleFieldBuilderV3.mergeFrom(card);
            } else {
                singleFieldBuilderV3.setMessage(card);
            }
            this.dataCase_ = 4;
            return this;
        }

        public Builder clearCard() {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3 = this.cardBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 4) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 4) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Card.Builder getCardBuilder() {
            return (Card.Builder) getCardFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.OnClickOrBuilder
        public CardOrBuilder getCardOrBuilder() {
            SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 4 && (singleFieldBuilderV3 = this.cardBuilder_) != null) {
                return (CardOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 4) {
                return (Card) this.data_;
            }
            return Card.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Card, Card.Builder, CardOrBuilder> getCardFieldBuilder() {
            if (this.cardBuilder_ == null) {
                if (this.dataCase_ != 4) {
                    this.data_ = Card.getDefaultInstance();
                }
                this.cardBuilder_ = new SingleFieldBuilderV3<>((Card) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 4;
            onChanged();
            return this.cardBuilder_;
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

    /* JADX INFO: renamed from: com.google.apps.card.v1.OnClick$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$OnClick$DataCase;

        static {
            int[] iArr = new int[DataCase.values().length];
            $SwitchMap$com$google$apps$card$v1$OnClick$DataCase = iArr;
            try {
                iArr[DataCase.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$OnClick$DataCase[DataCase.OPEN_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$OnClick$DataCase[DataCase.OPEN_DYNAMIC_LINK_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$OnClick$DataCase[DataCase.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$OnClick$DataCase[DataCase.DATA_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static OnClick getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<OnClick> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<OnClick> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public OnClick getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
