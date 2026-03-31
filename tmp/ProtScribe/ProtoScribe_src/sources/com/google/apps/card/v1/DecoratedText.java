package com.google.apps.card.v1;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.apps.card.v1.Action;
import com.google.apps.card.v1.Button;
import com.google.apps.card.v1.Icon;
import com.google.apps.card.v1.OnClick;
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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class DecoratedText extends GeneratedMessageV3 implements DecoratedTextOrBuilder {
    public static final int BOTTOM_LABEL_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 8;
    public static final int END_ICON_FIELD_NUMBER = 11;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ON_CLICK_FIELD_NUMBER = 7;
    public static final int START_ICON_FIELD_NUMBER = 12;
    public static final int SWITCH_CONTROL_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TOP_LABEL_FIELD_NUMBER = 3;
    public static final int WRAP_TEXT_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object bottomLabel_;
    private int controlCase_;
    private Object control_;
    private Icon icon_;
    private byte memoizedIsInitialized;
    private OnClick onClick_;
    private Icon startIcon_;
    private volatile Object text_;
    private volatile Object topLabel_;
    private boolean wrapText_;
    private static final DecoratedText DEFAULT_INSTANCE = new DecoratedText();
    private static final Parser<DecoratedText> PARSER = new AbstractParser<DecoratedText>() { // from class: com.google.apps.card.v1.DecoratedText.1
        @Override // com.google.protobuf.Parser
        public DecoratedText parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = DecoratedText.newBuilder();
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

    public interface SwitchControlOrBuilder extends MessageOrBuilder {
        SwitchControl.ControlType getControlType();

        int getControlTypeValue();

        String getName();

        ByteString getNameBytes();

        Action getOnChangeAction();

        ActionOrBuilder getOnChangeActionOrBuilder();

        boolean getSelected();

        String getValue();

        ByteString getValueBytes();

        boolean hasOnChangeAction();
    }

    static /* synthetic */ int access$2376(DecoratedText decoratedText, int i) {
        int i2 = i | decoratedText.bitField0_;
        decoratedText.bitField0_ = i2;
        return i2;
    }

    private DecoratedText(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.controlCase_ = 0;
        this.topLabel_ = "";
        this.text_ = "";
        this.wrapText_ = false;
        this.bottomLabel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private DecoratedText() {
        this.controlCase_ = 0;
        this.topLabel_ = "";
        this.text_ = "";
        this.wrapText_ = false;
        this.bottomLabel_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.topLabel_ = "";
        this.text_ = "";
        this.bottomLabel_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DecoratedText();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_DecoratedText_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_DecoratedText_fieldAccessorTable.ensureFieldAccessorsInitialized(DecoratedText.class, Builder.class);
    }

    public static final class SwitchControl extends GeneratedMessageV3 implements SwitchControlOrBuilder {
        public static final int CONTROL_TYPE_FIELD_NUMBER = 5;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int ON_CHANGE_ACTION_FIELD_NUMBER = 4;
        public static final int SELECTED_FIELD_NUMBER = 3;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int controlType_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private Action onChangeAction_;
        private boolean selected_;
        private volatile Object value_;
        private static final SwitchControl DEFAULT_INSTANCE = new SwitchControl();
        private static final Parser<SwitchControl> PARSER = new AbstractParser<SwitchControl>() { // from class: com.google.apps.card.v1.DecoratedText.SwitchControl.1
            @Override // com.google.protobuf.Parser
            public SwitchControl parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchControl.newBuilder();
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

        static /* synthetic */ int access$976(SwitchControl switchControl, int i) {
            int i2 = i | switchControl.bitField0_;
            switchControl.bitField0_ = i2;
            return i2;
        }

        private SwitchControl(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.value_ = "";
            this.selected_ = false;
            this.controlType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private SwitchControl() {
            this.name_ = "";
            this.value_ = "";
            this.selected_ = false;
            this.controlType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = "";
            this.controlType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SwitchControl();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_DecoratedText_SwitchControl_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_DecoratedText_SwitchControl_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchControl.class, Builder.class);
        }

        public enum ControlType implements ProtocolMessageEnum {
            SWITCH(0),
            CHECKBOX(1),
            CHECK_BOX(2),
            UNRECOGNIZED(-1);

            public static final int CHECKBOX_VALUE = 1;
            public static final int CHECK_BOX_VALUE = 2;
            public static final int SWITCH_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ControlType> internalValueMap = new Internal.EnumLiteMap<ControlType>() { // from class: com.google.apps.card.v1.DecoratedText.SwitchControl.ControlType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ControlType findValueByNumber(int i) {
                    return ControlType.forNumber(i);
                }
            };
            private static final ControlType[] VALUES = values();

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static ControlType valueOf(int i) {
                return forNumber(i);
            }

            public static ControlType forNumber(int i) {
                if (i == 0) {
                    return SWITCH;
                }
                if (i == 1) {
                    return CHECKBOX;
                }
                if (i != 2) {
                    return null;
                }
                return CHECK_BOX;
            }

            public static Internal.EnumLiteMap<ControlType> internalGetValueMap() {
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
                return SwitchControl.getDescriptor().getEnumTypes().get(0);
            }

            public static ControlType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }

            ControlType(int i) {
                this.value = i;
            }
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public boolean getSelected() {
            return this.selected_;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public boolean hasOnChangeAction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public Action getOnChangeAction() {
            Action action = this.onChangeAction_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public ActionOrBuilder getOnChangeActionOrBuilder() {
            Action action = this.onChangeAction_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public int getControlTypeValue() {
            return this.controlType_;
        }

        @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
        public ControlType getControlType() {
            ControlType controlTypeForNumber = ControlType.forNumber(this.controlType_);
            return controlTypeForNumber == null ? ControlType.UNRECOGNIZED : controlTypeForNumber;
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
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
            }
            boolean z = this.selected_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(4, getOnChangeAction());
            }
            if (this.controlType_ != ControlType.SWITCH.getNumber()) {
                codedOutputStream.writeEnum(5, this.controlType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
            }
            boolean z = this.selected_;
            if (z) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, z);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, getOnChangeAction());
            }
            if (this.controlType_ != ControlType.SWITCH.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(5, this.controlType_);
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
            if (!(obj instanceof SwitchControl)) {
                return super.equals(obj);
            }
            SwitchControl switchControl = (SwitchControl) obj;
            if (getName().equals(switchControl.getName()) && getValue().equals(switchControl.getValue()) && getSelected() == switchControl.getSelected() && hasOnChangeAction() == switchControl.hasOnChangeAction()) {
                return (!hasOnChangeAction() || getOnChangeAction().equals(switchControl.getOnChangeAction())) && this.controlType_ == switchControl.controlType_ && getUnknownFields().equals(switchControl.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 37) + 3) * 53) + Internal.hashBoolean(getSelected());
            if (hasOnChangeAction()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getOnChangeAction().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 5) * 53) + this.controlType_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static SwitchControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SwitchControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SwitchControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static SwitchControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchControl parseFrom(InputStream inputStream) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchControl parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchControl parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SwitchControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SwitchControl switchControl) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchControl);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchControlOrBuilder {
            private int bitField0_;
            private int controlType_;
            private Object name_;
            private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> onChangeActionBuilder_;
            private Action onChangeAction_;
            private boolean selected_;
            private Object value_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_DecoratedText_SwitchControl_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_DecoratedText_SwitchControl_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchControl.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.value_ = "";
                this.controlType_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.value_ = "";
                this.controlType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (SwitchControl.alwaysUseFieldBuilders) {
                    getOnChangeActionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.value_ = "";
                this.selected_ = false;
                this.onChangeAction_ = null;
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.onChangeActionBuilder_ = null;
                }
                this.controlType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_DecoratedText_SwitchControl_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitchControl getDefaultInstanceForType() {
                return SwitchControl.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchControl build() {
                SwitchControl switchControlBuildPartial = buildPartial();
                if (switchControlBuildPartial.isInitialized()) {
                    return switchControlBuildPartial;
                }
                throw newUninitializedMessageException((Message) switchControlBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchControl buildPartial() {
                SwitchControl switchControl = new SwitchControl(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchControl);
                }
                onBuilt();
                return switchControl;
            }

            private void buildPartial0(SwitchControl switchControl) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    switchControl.name_ = this.name_;
                }
                if ((i2 & 2) != 0) {
                    switchControl.value_ = this.value_;
                }
                if ((i2 & 4) != 0) {
                    switchControl.selected_ = this.selected_;
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                    switchControl.onChangeAction_ = singleFieldBuilderV3 == null ? this.onChangeAction_ : (Action) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 16) != 0) {
                    switchControl.controlType_ = this.controlType_;
                }
                SwitchControl.access$976(switchControl, i);
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
                if (message instanceof SwitchControl) {
                    return mergeFrom((SwitchControl) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchControl switchControl) {
                if (switchControl == SwitchControl.getDefaultInstance()) {
                    return this;
                }
                if (!switchControl.getName().isEmpty()) {
                    this.name_ = switchControl.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!switchControl.getValue().isEmpty()) {
                    this.value_ = switchControl.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (switchControl.getSelected()) {
                    setSelected(switchControl.getSelected());
                }
                if (switchControl.hasOnChangeAction()) {
                    mergeOnChangeAction(switchControl.getOnChangeAction());
                }
                if (switchControl.controlType_ != 0) {
                    setControlTypeValue(switchControl.getControlTypeValue());
                }
                mergeUnknownFields(switchControl.getUnknownFields());
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
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.selected_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getOnChangeActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.controlType_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 16;
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

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = SwitchControl.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                SwitchControl.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = SwitchControl.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                SwitchControl.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public boolean getSelected() {
                return this.selected_;
            }

            public Builder setSelected(boolean z) {
                this.selected_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearSelected() {
                this.bitField0_ &= -5;
                this.selected_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public boolean hasOnChangeAction() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public Action getOnChangeAction() {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Action action = this.onChangeAction_;
                    return action == null ? Action.getDefaultInstance() : action;
                }
                return (Action) singleFieldBuilderV3.getMessage();
            }

            public Builder setOnChangeAction(Action action) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    action.getClass();
                    this.onChangeAction_ = action;
                } else {
                    singleFieldBuilderV3.setMessage(action);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOnChangeAction(Action.Builder builder) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.onChangeAction_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeOnChangeAction(Action action) {
                Action action2;
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0 && (action2 = this.onChangeAction_) != null && action2 != Action.getDefaultInstance()) {
                        getOnChangeActionBuilder().mergeFrom(action);
                    } else {
                        this.onChangeAction_ = action;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(action);
                }
                if (this.onChangeAction_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder clearOnChangeAction() {
                this.bitField0_ &= -9;
                this.onChangeAction_ = null;
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.onChangeActionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Action.Builder getOnChangeActionBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Action.Builder) getOnChangeActionFieldBuilder().getBuilder();
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public ActionOrBuilder getOnChangeActionOrBuilder() {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Action action = this.onChangeAction_;
                return action == null ? Action.getDefaultInstance() : action;
            }

            private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> getOnChangeActionFieldBuilder() {
                if (this.onChangeActionBuilder_ == null) {
                    this.onChangeActionBuilder_ = new SingleFieldBuilderV3<>(getOnChangeAction(), getParentForChildren(), isClean());
                    this.onChangeAction_ = null;
                }
                return this.onChangeActionBuilder_;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public int getControlTypeValue() {
                return this.controlType_;
            }

            public Builder setControlTypeValue(int i) {
                this.controlType_ = i;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder
            public ControlType getControlType() {
                ControlType controlTypeForNumber = ControlType.forNumber(this.controlType_);
                return controlTypeForNumber == null ? ControlType.UNRECOGNIZED : controlTypeForNumber;
            }

            public Builder setControlType(ControlType controlType) {
                controlType.getClass();
                this.bitField0_ |= 16;
                this.controlType_ = controlType.getNumber();
                onChanged();
                return this;
            }

            public Builder clearControlType() {
                this.bitField0_ &= -17;
                this.controlType_ = 0;
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

        public static SwitchControl getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SwitchControl> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchControl> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchControl getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public enum ControlCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        BUTTON(8),
        SWITCH_CONTROL(9),
        END_ICON(11),
        CONTROL_NOT_SET(0);

        private final int value;

        ControlCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static ControlCase valueOf(int i) {
            return forNumber(i);
        }

        public static ControlCase forNumber(int i) {
            if (i == 0) {
                return CONTROL_NOT_SET;
            }
            if (i == 11) {
                return END_ICON;
            }
            if (i == 8) {
                return BUTTON;
            }
            if (i != 9) {
                return null;
            }
            return SWITCH_CONTROL;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public ControlCase getControlCase() {
        return ControlCase.forNumber(this.controlCase_);
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    @Deprecated
    public boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    @Deprecated
    public Icon getIcon() {
        Icon icon = this.icon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    @Deprecated
    public IconOrBuilder getIconOrBuilder() {
        Icon icon = this.icon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean hasStartIcon() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public Icon getStartIcon() {
        Icon icon = this.startIcon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public IconOrBuilder getStartIconOrBuilder() {
        Icon icon = this.startIcon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public String getTopLabel() {
        Object obj = this.topLabel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.topLabel_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public ByteString getTopLabelBytes() {
        Object obj = this.topLabel_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.topLabel_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public String getText() {
        Object obj = this.text_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.text_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public ByteString getTextBytes() {
        Object obj = this.text_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean getWrapText() {
        return this.wrapText_;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public String getBottomLabel() {
        Object obj = this.bottomLabel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bottomLabel_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public ByteString getBottomLabelBytes() {
        Object obj = this.bottomLabel_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bottomLabel_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean hasOnClick() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public OnClick getOnClick() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public OnClickOrBuilder getOnClickOrBuilder() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean hasButton() {
        return this.controlCase_ == 8;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public Button getButton() {
        if (this.controlCase_ == 8) {
            return (Button) this.control_;
        }
        return Button.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public ButtonOrBuilder getButtonOrBuilder() {
        if (this.controlCase_ == 8) {
            return (Button) this.control_;
        }
        return Button.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean hasSwitchControl() {
        return this.controlCase_ == 9;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public SwitchControl getSwitchControl() {
        if (this.controlCase_ == 9) {
            return (SwitchControl) this.control_;
        }
        return SwitchControl.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public SwitchControlOrBuilder getSwitchControlOrBuilder() {
        if (this.controlCase_ == 9) {
            return (SwitchControl) this.control_;
        }
        return SwitchControl.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public boolean hasEndIcon() {
        return this.controlCase_ == 11;
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public Icon getEndIcon() {
        if (this.controlCase_ == 11) {
            return (Icon) this.control_;
        }
        return Icon.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
    public IconOrBuilder getEndIconOrBuilder() {
        if (this.controlCase_ == 11) {
            return (Icon) this.control_;
        }
        return Icon.getDefaultInstance();
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
            codedOutputStream.writeMessage(1, getIcon());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.topLabel_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.topLabel_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.text_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.text_);
        }
        boolean z = this.wrapText_;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.bottomLabel_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.bottomLabel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(7, getOnClick());
        }
        if (this.controlCase_ == 8) {
            codedOutputStream.writeMessage(8, (Button) this.control_);
        }
        if (this.controlCase_ == 9) {
            codedOutputStream.writeMessage(9, (SwitchControl) this.control_);
        }
        if (this.controlCase_ == 11) {
            codedOutputStream.writeMessage(11, (Icon) this.control_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(12, getStartIcon());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getIcon()) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.topLabel_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.topLabel_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.text_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(4, this.text_);
        }
        boolean z = this.wrapText_;
        if (z) {
            iComputeMessageSize += CodedOutputStream.computeBoolSize(5, z);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.bottomLabel_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(6, this.bottomLabel_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getOnClick());
        }
        if (this.controlCase_ == 8) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(8, (Button) this.control_);
        }
        if (this.controlCase_ == 9) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (SwitchControl) this.control_);
        }
        if (this.controlCase_ == 11) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (Icon) this.control_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getStartIcon());
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
        if (!(obj instanceof DecoratedText)) {
            return super.equals(obj);
        }
        DecoratedText decoratedText = (DecoratedText) obj;
        if (hasIcon() != decoratedText.hasIcon()) {
            return false;
        }
        if ((hasIcon() && !getIcon().equals(decoratedText.getIcon())) || hasStartIcon() != decoratedText.hasStartIcon()) {
            return false;
        }
        if ((hasStartIcon() && !getStartIcon().equals(decoratedText.getStartIcon())) || !getTopLabel().equals(decoratedText.getTopLabel()) || !getText().equals(decoratedText.getText()) || getWrapText() != decoratedText.getWrapText() || !getBottomLabel().equals(decoratedText.getBottomLabel()) || hasOnClick() != decoratedText.hasOnClick()) {
            return false;
        }
        if ((hasOnClick() && !getOnClick().equals(decoratedText.getOnClick())) || !getControlCase().equals(decoratedText.getControlCase())) {
            return false;
        }
        int i = this.controlCase_;
        if (i != 8) {
            if (i == 9) {
                if (!getSwitchControl().equals(decoratedText.getSwitchControl())) {
                    return false;
                }
            } else if (i == 11 && !getEndIcon().equals(decoratedText.getEndIcon())) {
                return false;
            }
        } else if (!getButton().equals(decoratedText.getButton())) {
            return false;
        }
        return getUnknownFields().equals(decoratedText.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        if (hasIcon()) {
            iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + getIcon().hashCode();
        }
        if (hasStartIcon()) {
            iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + getStartIcon().hashCode();
        }
        int iHashCode3 = (((((((((((((((iHashCode2 * 37) + 3) * 53) + getTopLabel().hashCode()) * 37) + 4) * 53) + getText().hashCode()) * 37) + 5) * 53) + Internal.hashBoolean(getWrapText())) * 37) + 6) * 53) + getBottomLabel().hashCode();
        if (hasOnClick()) {
            iHashCode3 = (((iHashCode3 * 37) + 7) * 53) + getOnClick().hashCode();
        }
        int i2 = this.controlCase_;
        if (i2 == 8) {
            i = ((iHashCode3 * 37) + 8) * 53;
            iHashCode = getButton().hashCode();
        } else if (i2 == 9) {
            i = ((iHashCode3 * 37) + 9) * 53;
            iHashCode = getSwitchControl().hashCode();
        } else {
            if (i2 == 11) {
                i = ((iHashCode3 * 37) + 11) * 53;
                iHashCode = getEndIcon().hashCode();
            }
            int iHashCode4 = (iHashCode3 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }
        iHashCode3 = i + iHashCode;
        int iHashCode42 = (iHashCode3 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode42;
        return iHashCode42;
    }

    public static DecoratedText parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static DecoratedText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DecoratedText parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static DecoratedText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static DecoratedText parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static DecoratedText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DecoratedText parseFrom(InputStream inputStream) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DecoratedText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DecoratedText parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DecoratedText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DecoratedText parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DecoratedText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DecoratedText) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DecoratedText decoratedText) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(decoratedText);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DecoratedTextOrBuilder {
        private int bitField0_;
        private Object bottomLabel_;
        private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> buttonBuilder_;
        private int controlCase_;
        private Object control_;
        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> endIconBuilder_;
        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> iconBuilder_;
        private Icon icon_;
        private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> onClickBuilder_;
        private OnClick onClick_;
        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> startIconBuilder_;
        private Icon startIcon_;
        private SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> switchControlBuilder_;
        private Object text_;
        private Object topLabel_;
        private boolean wrapText_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_DecoratedText_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_DecoratedText_fieldAccessorTable.ensureFieldAccessorsInitialized(DecoratedText.class, Builder.class);
        }

        private Builder() {
            this.controlCase_ = 0;
            this.topLabel_ = "";
            this.text_ = "";
            this.bottomLabel_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.controlCase_ = 0;
            this.topLabel_ = "";
            this.text_ = "";
            this.bottomLabel_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (DecoratedText.alwaysUseFieldBuilders) {
                getIconFieldBuilder();
                getStartIconFieldBuilder();
                getOnClickFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.icon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.iconBuilder_ = null;
            }
            this.startIcon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV32 = this.startIconBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.startIconBuilder_ = null;
            }
            this.topLabel_ = "";
            this.text_ = "";
            this.wrapText_ = false;
            this.bottomLabel_ = "";
            this.onClick_ = null;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV33 = this.onClickBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.onClickBuilder_ = null;
            }
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV34 = this.buttonBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.clear();
            }
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV35 = this.switchControlBuilder_;
            if (singleFieldBuilderV35 != null) {
                singleFieldBuilderV35.clear();
            }
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV36 = this.endIconBuilder_;
            if (singleFieldBuilderV36 != null) {
                singleFieldBuilderV36.clear();
            }
            this.controlCase_ = 0;
            this.control_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_DecoratedText_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DecoratedText getDefaultInstanceForType() {
            return DecoratedText.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DecoratedText build() {
            DecoratedText decoratedTextBuildPartial = buildPartial();
            if (decoratedTextBuildPartial.isInitialized()) {
                return decoratedTextBuildPartial;
            }
            throw newUninitializedMessageException((Message) decoratedTextBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DecoratedText buildPartial() {
            DecoratedText decoratedText = new DecoratedText(this);
            if (this.bitField0_ != 0) {
                buildPartial0(decoratedText);
            }
            buildPartialOneofs(decoratedText);
            onBuilt();
            return decoratedText;
        }

        private void buildPartial0(DecoratedText decoratedText) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
                decoratedText.icon_ = singleFieldBuilderV3 == null ? this.icon_ : (Icon) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV32 = this.startIconBuilder_;
                decoratedText.startIcon_ = singleFieldBuilderV32 == null ? this.startIcon_ : (Icon) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                decoratedText.topLabel_ = this.topLabel_;
            }
            if ((i2 & 8) != 0) {
                decoratedText.text_ = this.text_;
            }
            if ((i2 & 16) != 0) {
                decoratedText.wrapText_ = this.wrapText_;
            }
            if ((i2 & 32) != 0) {
                decoratedText.bottomLabel_ = this.bottomLabel_;
            }
            if ((i2 & 64) != 0) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV33 = this.onClickBuilder_;
                decoratedText.onClick_ = singleFieldBuilderV33 == null ? this.onClick_ : (OnClick) singleFieldBuilderV33.build();
                i |= 4;
            }
            DecoratedText.access$2376(decoratedText, i);
        }

        private void buildPartialOneofs(DecoratedText decoratedText) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3;
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV32;
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV33;
            decoratedText.controlCase_ = this.controlCase_;
            decoratedText.control_ = this.control_;
            if (this.controlCase_ == 8 && (singleFieldBuilderV33 = this.buttonBuilder_) != null) {
                decoratedText.control_ = singleFieldBuilderV33.build();
            }
            if (this.controlCase_ == 9 && (singleFieldBuilderV32 = this.switchControlBuilder_) != null) {
                decoratedText.control_ = singleFieldBuilderV32.build();
            }
            if (this.controlCase_ != 11 || (singleFieldBuilderV3 = this.endIconBuilder_) == null) {
                return;
            }
            decoratedText.control_ = singleFieldBuilderV3.build();
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
            if (message instanceof DecoratedText) {
                return mergeFrom((DecoratedText) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DecoratedText decoratedText) {
            if (decoratedText == DecoratedText.getDefaultInstance()) {
                return this;
            }
            if (decoratedText.hasIcon()) {
                mergeIcon(decoratedText.getIcon());
            }
            if (decoratedText.hasStartIcon()) {
                mergeStartIcon(decoratedText.getStartIcon());
            }
            if (!decoratedText.getTopLabel().isEmpty()) {
                this.topLabel_ = decoratedText.topLabel_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!decoratedText.getText().isEmpty()) {
                this.text_ = decoratedText.text_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (decoratedText.getWrapText()) {
                setWrapText(decoratedText.getWrapText());
            }
            if (!decoratedText.getBottomLabel().isEmpty()) {
                this.bottomLabel_ = decoratedText.bottomLabel_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (decoratedText.hasOnClick()) {
                mergeOnClick(decoratedText.getOnClick());
            }
            int i = AnonymousClass2.$SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase[decoratedText.getControlCase().ordinal()];
            if (i == 1) {
                mergeButton(decoratedText.getButton());
            } else if (i == 2) {
                mergeSwitchControl(decoratedText.getSwitchControl());
            } else if (i == 3) {
                mergeEndIcon(decoratedText.getEndIcon());
            }
            mergeUnknownFields(decoratedText.getUnknownFields());
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
                        switch (tag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                codedInputStream.readMessage(getIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
                                break;
                            case 26:
                                this.topLabel_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                break;
                            case 34:
                                this.text_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                break;
                            case 40:
                                this.wrapText_ = codedInputStream.readBool();
                                this.bitField0_ |= 16;
                                break;
                            case 50:
                                this.bottomLabel_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                                break;
                            case 58:
                                codedInputStream.readMessage(getOnClickFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 64;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                codedInputStream.readMessage(getButtonFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.controlCase_ = 8;
                                break;
                            case 74:
                                codedInputStream.readMessage(getSwitchControlFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.controlCase_ = 9;
                                break;
                            case 90:
                                codedInputStream.readMessage(getEndIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.controlCase_ = 11;
                                break;
                            case 98:
                                codedInputStream.readMessage(getStartIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                                break;
                            default:
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public ControlCase getControlCase() {
            return ControlCase.forNumber(this.controlCase_);
        }

        public Builder clearControl() {
            this.controlCase_ = 0;
            this.control_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        @Deprecated
        public boolean hasIcon() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        @Deprecated
        public Icon getIcon() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                Icon icon = this.icon_;
                return icon == null ? Icon.getDefaultInstance() : icon;
            }
            return (Icon) singleFieldBuilderV3.getMessage();
        }

        @Deprecated
        public Builder setIcon(Icon icon) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                icon.getClass();
                this.icon_ = icon;
            } else {
                singleFieldBuilderV3.setMessage(icon);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setIcon(Icon.Builder builder) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.icon_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeIcon(Icon icon) {
            Icon icon2;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (icon2 = this.icon_) != null && icon2 != Icon.getDefaultInstance()) {
                    getIconBuilder().mergeFrom(icon);
                } else {
                    this.icon_ = icon;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(icon);
            }
            if (this.icon_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        @Deprecated
        public Builder clearIcon() {
            this.bitField0_ &= -2;
            this.icon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.iconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.iconBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Icon.Builder getIconBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (Icon.Builder) getIconFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        @Deprecated
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

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean hasStartIcon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public Icon getStartIcon() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                Icon icon = this.startIcon_;
                return icon == null ? Icon.getDefaultInstance() : icon;
            }
            return (Icon) singleFieldBuilderV3.getMessage();
        }

        public Builder setStartIcon(Icon icon) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                icon.getClass();
                this.startIcon_ = icon;
            } else {
                singleFieldBuilderV3.setMessage(icon);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setStartIcon(Icon.Builder builder) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.startIcon_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeStartIcon(Icon icon) {
            Icon icon2;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (icon2 = this.startIcon_) != null && icon2 != Icon.getDefaultInstance()) {
                    getStartIconBuilder().mergeFrom(icon);
                } else {
                    this.startIcon_ = icon;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(icon);
            }
            if (this.startIcon_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearStartIcon() {
            this.bitField0_ &= -3;
            this.startIcon_ = null;
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.startIconBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Icon.Builder getStartIconBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Icon.Builder) getStartIconFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public IconOrBuilder getStartIconOrBuilder() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.startIconBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (IconOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Icon icon = this.startIcon_;
            return icon == null ? Icon.getDefaultInstance() : icon;
        }

        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getStartIconFieldBuilder() {
            if (this.startIconBuilder_ == null) {
                this.startIconBuilder_ = new SingleFieldBuilderV3<>(getStartIcon(), getParentForChildren(), isClean());
                this.startIcon_ = null;
            }
            return this.startIconBuilder_;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public String getTopLabel() {
            Object obj = this.topLabel_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.topLabel_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public ByteString getTopLabelBytes() {
            Object obj = this.topLabel_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.topLabel_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setTopLabel(String str) {
            str.getClass();
            this.topLabel_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearTopLabel() {
            this.topLabel_ = DecoratedText.getDefaultInstance().getTopLabel();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setTopLabelBytes(ByteString byteString) {
            byteString.getClass();
            DecoratedText.checkByteStringIsUtf8(byteString);
            this.topLabel_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.text_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
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
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearText() {
            this.text_ = DecoratedText.getDefaultInstance().getText();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            byteString.getClass();
            DecoratedText.checkByteStringIsUtf8(byteString);
            this.text_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean getWrapText() {
            return this.wrapText_;
        }

        public Builder setWrapText(boolean z) {
            this.wrapText_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearWrapText() {
            this.bitField0_ &= -17;
            this.wrapText_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public String getBottomLabel() {
            Object obj = this.bottomLabel_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bottomLabel_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public ByteString getBottomLabelBytes() {
            Object obj = this.bottomLabel_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bottomLabel_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setBottomLabel(String str) {
            str.getClass();
            this.bottomLabel_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearBottomLabel() {
            this.bottomLabel_ = DecoratedText.getDefaultInstance().getBottomLabel();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder setBottomLabelBytes(ByteString byteString) {
            byteString.getClass();
            DecoratedText.checkByteStringIsUtf8(byteString);
            this.bottomLabel_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean hasOnClick() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
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
            this.bitField0_ |= 64;
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
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder mergeOnClick(OnClick onClick) {
            OnClick onClick2;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 64) != 0 && (onClick2 = this.onClick_) != null && onClick2 != OnClick.getDefaultInstance()) {
                    getOnClickBuilder().mergeFrom(onClick);
                } else {
                    this.onClick_ = onClick;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(onClick);
            }
            if (this.onClick_ != null) {
                this.bitField0_ |= 64;
                onChanged();
            }
            return this;
        }

        public Builder clearOnClick() {
            this.bitField0_ &= -65;
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
            this.bitField0_ |= 64;
            onChanged();
            return (OnClick.Builder) getOnClickFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
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

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean hasButton() {
            return this.controlCase_ == 8;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public Button getButton() {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.buttonBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 8) {
                    return (Button) this.control_;
                }
                return Button.getDefaultInstance();
            }
            if (this.controlCase_ == 8) {
                return (Button) singleFieldBuilderV3.getMessage();
            }
            return Button.getDefaultInstance();
        }

        public Builder setButton(Button button) {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.buttonBuilder_;
            if (singleFieldBuilderV3 == null) {
                button.getClass();
                this.control_ = button;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(button);
            }
            this.controlCase_ = 8;
            return this;
        }

        public Builder setButton(Button.Builder builder) {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.buttonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.control_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.controlCase_ = 8;
            return this;
        }

        public Builder mergeButton(Button button) {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.buttonBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 8 && this.control_ != Button.getDefaultInstance()) {
                    this.control_ = Button.newBuilder((Button) this.control_).mergeFrom(button).buildPartial();
                } else {
                    this.control_ = button;
                }
                onChanged();
            } else if (this.controlCase_ == 8) {
                singleFieldBuilderV3.mergeFrom(button);
            } else {
                singleFieldBuilderV3.setMessage(button);
            }
            this.controlCase_ = 8;
            return this;
        }

        public Builder clearButton() {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.buttonBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 8) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                    onChanged();
                }
            } else {
                if (this.controlCase_ == 8) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Button.Builder getButtonBuilder() {
            return (Button.Builder) getButtonFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public ButtonOrBuilder getButtonOrBuilder() {
            SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3;
            int i = this.controlCase_;
            if (i == 8 && (singleFieldBuilderV3 = this.buttonBuilder_) != null) {
                return (ButtonOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 8) {
                return (Button) this.control_;
            }
            return Button.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getButtonFieldBuilder() {
            if (this.buttonBuilder_ == null) {
                if (this.controlCase_ != 8) {
                    this.control_ = Button.getDefaultInstance();
                }
                this.buttonBuilder_ = new SingleFieldBuilderV3<>((Button) this.control_, getParentForChildren(), isClean());
                this.control_ = null;
            }
            this.controlCase_ = 8;
            onChanged();
            return this.buttonBuilder_;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean hasSwitchControl() {
            return this.controlCase_ == 9;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public SwitchControl getSwitchControl() {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3 = this.switchControlBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 9) {
                    return (SwitchControl) this.control_;
                }
                return SwitchControl.getDefaultInstance();
            }
            if (this.controlCase_ == 9) {
                return (SwitchControl) singleFieldBuilderV3.getMessage();
            }
            return SwitchControl.getDefaultInstance();
        }

        public Builder setSwitchControl(SwitchControl switchControl) {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3 = this.switchControlBuilder_;
            if (singleFieldBuilderV3 == null) {
                switchControl.getClass();
                this.control_ = switchControl;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(switchControl);
            }
            this.controlCase_ = 9;
            return this;
        }

        public Builder setSwitchControl(SwitchControl.Builder builder) {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3 = this.switchControlBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.control_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.controlCase_ = 9;
            return this;
        }

        public Builder mergeSwitchControl(SwitchControl switchControl) {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3 = this.switchControlBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 9 && this.control_ != SwitchControl.getDefaultInstance()) {
                    this.control_ = SwitchControl.newBuilder((SwitchControl) this.control_).mergeFrom(switchControl).buildPartial();
                } else {
                    this.control_ = switchControl;
                }
                onChanged();
            } else if (this.controlCase_ == 9) {
                singleFieldBuilderV3.mergeFrom(switchControl);
            } else {
                singleFieldBuilderV3.setMessage(switchControl);
            }
            this.controlCase_ = 9;
            return this;
        }

        public Builder clearSwitchControl() {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3 = this.switchControlBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 9) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                    onChanged();
                }
            } else {
                if (this.controlCase_ == 9) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public SwitchControl.Builder getSwitchControlBuilder() {
            return (SwitchControl.Builder) getSwitchControlFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public SwitchControlOrBuilder getSwitchControlOrBuilder() {
            SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> singleFieldBuilderV3;
            int i = this.controlCase_;
            if (i == 9 && (singleFieldBuilderV3 = this.switchControlBuilder_) != null) {
                return (SwitchControlOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 9) {
                return (SwitchControl) this.control_;
            }
            return SwitchControl.getDefaultInstance();
        }

        private SingleFieldBuilderV3<SwitchControl, SwitchControl.Builder, SwitchControlOrBuilder> getSwitchControlFieldBuilder() {
            if (this.switchControlBuilder_ == null) {
                if (this.controlCase_ != 9) {
                    this.control_ = SwitchControl.getDefaultInstance();
                }
                this.switchControlBuilder_ = new SingleFieldBuilderV3<>((SwitchControl) this.control_, getParentForChildren(), isClean());
                this.control_ = null;
            }
            this.controlCase_ = 9;
            onChanged();
            return this.switchControlBuilder_;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public boolean hasEndIcon() {
            return this.controlCase_ == 11;
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public Icon getEndIcon() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.endIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 11) {
                    return (Icon) this.control_;
                }
                return Icon.getDefaultInstance();
            }
            if (this.controlCase_ == 11) {
                return (Icon) singleFieldBuilderV3.getMessage();
            }
            return Icon.getDefaultInstance();
        }

        public Builder setEndIcon(Icon icon) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.endIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                icon.getClass();
                this.control_ = icon;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(icon);
            }
            this.controlCase_ = 11;
            return this;
        }

        public Builder setEndIcon(Icon.Builder builder) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.endIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.control_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.controlCase_ = 11;
            return this;
        }

        public Builder mergeEndIcon(Icon icon) {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.endIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 11 && this.control_ != Icon.getDefaultInstance()) {
                    this.control_ = Icon.newBuilder((Icon) this.control_).mergeFrom(icon).buildPartial();
                } else {
                    this.control_ = icon;
                }
                onChanged();
            } else if (this.controlCase_ == 11) {
                singleFieldBuilderV3.mergeFrom(icon);
            } else {
                singleFieldBuilderV3.setMessage(icon);
            }
            this.controlCase_ = 11;
            return this;
        }

        public Builder clearEndIcon() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3 = this.endIconBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.controlCase_ == 11) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                    onChanged();
                }
            } else {
                if (this.controlCase_ == 11) {
                    this.controlCase_ = 0;
                    this.control_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Icon.Builder getEndIconBuilder() {
            return (Icon.Builder) getEndIconFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.DecoratedTextOrBuilder
        public IconOrBuilder getEndIconOrBuilder() {
            SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> singleFieldBuilderV3;
            int i = this.controlCase_;
            if (i == 11 && (singleFieldBuilderV3 = this.endIconBuilder_) != null) {
                return (IconOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 11) {
                return (Icon) this.control_;
            }
            return Icon.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Icon, Icon.Builder, IconOrBuilder> getEndIconFieldBuilder() {
            if (this.endIconBuilder_ == null) {
                if (this.controlCase_ != 11) {
                    this.control_ = Icon.getDefaultInstance();
                }
                this.endIconBuilder_ = new SingleFieldBuilderV3<>((Icon) this.control_, getParentForChildren(), isClean());
                this.control_ = null;
            }
            this.controlCase_ = 11;
            onChanged();
            return this.endIconBuilder_;
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

    /* JADX INFO: renamed from: com.google.apps.card.v1.DecoratedText$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase;

        static {
            int[] iArr = new int[ControlCase.values().length];
            $SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase = iArr;
            try {
                iArr[ControlCase.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase[ControlCase.SWITCH_CONTROL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase[ControlCase.END_ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$DecoratedText$ControlCase[ControlCase.CONTROL_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static DecoratedText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DecoratedText> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<DecoratedText> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public DecoratedText getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
