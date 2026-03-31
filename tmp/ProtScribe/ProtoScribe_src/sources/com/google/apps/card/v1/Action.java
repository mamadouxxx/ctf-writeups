package com.google.apps.card.v1;

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
public final class Action extends GeneratedMessageV3 implements ActionOrBuilder {
    public static final int FUNCTION_FIELD_NUMBER = 1;
    public static final int INTERACTION_FIELD_NUMBER = 5;
    public static final int LOAD_INDICATOR_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    public static final int PERSIST_VALUES_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object function_;
    private int interaction_;
    private int loadIndicator_;
    private byte memoizedIsInitialized;
    private List<ActionParameter> parameters_;
    private boolean persistValues_;
    private static final Action DEFAULT_INSTANCE = new Action();
    private static final Parser<Action> PARSER = new AbstractParser<Action>() { // from class: com.google.apps.card.v1.Action.1
        @Override // com.google.protobuf.Parser
        public Action parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Action.newBuilder();
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

    public interface ActionParameterOrBuilder extends MessageOrBuilder {
        String getKey();

        ByteString getKeyBytes();

        String getValue();

        ByteString getValueBytes();
    }

    private Action(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.function_ = "";
        this.loadIndicator_ = 0;
        this.persistValues_ = false;
        this.interaction_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Action() {
        this.function_ = "";
        this.loadIndicator_ = 0;
        this.persistValues_ = false;
        this.interaction_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.function_ = "";
        this.parameters_ = Collections.emptyList();
        this.loadIndicator_ = 0;
        this.interaction_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Action();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Action_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(Action.class, Builder.class);
    }

    public enum LoadIndicator implements ProtocolMessageEnum {
        SPINNER(0),
        NONE(1),
        UNRECOGNIZED(-1);

        public static final int NONE_VALUE = 1;
        public static final int SPINNER_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<LoadIndicator> internalValueMap = new Internal.EnumLiteMap<LoadIndicator>() { // from class: com.google.apps.card.v1.Action.LoadIndicator.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LoadIndicator findValueByNumber(int i) {
                return LoadIndicator.forNumber(i);
            }
        };
        private static final LoadIndicator[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static LoadIndicator valueOf(int i) {
            return forNumber(i);
        }

        public static LoadIndicator forNumber(int i) {
            if (i == 0) {
                return SPINNER;
            }
            if (i != 1) {
                return null;
            }
            return NONE;
        }

        public static Internal.EnumLiteMap<LoadIndicator> internalGetValueMap() {
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
            return Action.getDescriptor().getEnumTypes().get(0);
        }

        public static LoadIndicator valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        LoadIndicator(int i) {
            this.value = i;
        }
    }

    public enum Interaction implements ProtocolMessageEnum {
        INTERACTION_UNSPECIFIED(0),
        OPEN_DIALOG(1),
        UNRECOGNIZED(-1);

        public static final int INTERACTION_UNSPECIFIED_VALUE = 0;
        public static final int OPEN_DIALOG_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<Interaction> internalValueMap = new Internal.EnumLiteMap<Interaction>() { // from class: com.google.apps.card.v1.Action.Interaction.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Interaction findValueByNumber(int i) {
                return Interaction.forNumber(i);
            }
        };
        private static final Interaction[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Interaction valueOf(int i) {
            return forNumber(i);
        }

        public static Interaction forNumber(int i) {
            if (i == 0) {
                return INTERACTION_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return OPEN_DIALOG;
        }

        public static Internal.EnumLiteMap<Interaction> internalGetValueMap() {
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
            return Action.getDescriptor().getEnumTypes().get(1);
        }

        public static Interaction valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        Interaction(int i) {
            this.value = i;
        }
    }

    public static final class ActionParameter extends GeneratedMessageV3 implements ActionParameterOrBuilder {
        public static final int KEY_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object key_;
        private byte memoizedIsInitialized;
        private volatile Object value_;
        private static final ActionParameter DEFAULT_INSTANCE = new ActionParameter();
        private static final Parser<ActionParameter> PARSER = new AbstractParser<ActionParameter>() { // from class: com.google.apps.card.v1.Action.ActionParameter.1
            @Override // com.google.protobuf.Parser
            public ActionParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActionParameter.newBuilder();
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

        private ActionParameter(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.key_ = "";
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private ActionParameter() {
            this.key_ = "";
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.key_ = "";
            this.value_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ActionParameter();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Action_ActionParameter_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Action_ActionParameter_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionParameter.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
        public String getKey() {
            Object obj = this.key_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.key_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
        public ByteString getKeyBytes() {
            Object obj = this.key_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.key_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.key_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.key_) ? GeneratedMessageV3.computeStringSize(1, this.key_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
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
            if (!(obj instanceof ActionParameter)) {
                return super.equals(obj);
            }
            ActionParameter actionParameter = (ActionParameter) obj;
            return getKey().equals(actionParameter.getKey()) && getValue().equals(actionParameter.getValue()) && getUnknownFields().equals(actionParameter.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getKey().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        public static ActionParameter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ActionParameter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ActionParameter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static ActionParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActionParameter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static ActionParameter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActionParameter parseFrom(InputStream inputStream) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActionParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionParameter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ActionParameter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ActionParameter actionParameter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionParameter);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionParameterOrBuilder {
            private int bitField0_;
            private Object key_;
            private Object value_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Action_ActionParameter_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Action_ActionParameter_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionParameter.class, Builder.class);
            }

            private Builder() {
                this.key_ = "";
                this.value_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.key_ = "";
                this.value_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.key_ = "";
                this.value_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Action_ActionParameter_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionParameter getDefaultInstanceForType() {
                return ActionParameter.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionParameter build() {
                ActionParameter actionParameterBuildPartial = buildPartial();
                if (actionParameterBuildPartial.isInitialized()) {
                    return actionParameterBuildPartial;
                }
                throw newUninitializedMessageException((Message) actionParameterBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionParameter buildPartial() {
                ActionParameter actionParameter = new ActionParameter(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(actionParameter);
                }
                onBuilt();
                return actionParameter;
            }

            private void buildPartial0(ActionParameter actionParameter) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    actionParameter.key_ = this.key_;
                }
                if ((i & 2) != 0) {
                    actionParameter.value_ = this.value_;
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
                if (message instanceof ActionParameter) {
                    return mergeFrom((ActionParameter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionParameter actionParameter) {
                if (actionParameter == ActionParameter.getDefaultInstance()) {
                    return this;
                }
                if (!actionParameter.getKey().isEmpty()) {
                    this.key_ = actionParameter.key_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!actionParameter.getValue().isEmpty()) {
                    this.value_ = actionParameter.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(actionParameter.getUnknownFields());
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
                                    this.key_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
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

            @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setKey(String str) {
                str.getClass();
                this.key_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearKey() {
                this.key_ = ActionParameter.getDefaultInstance().getKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setKeyBytes(ByteString byteString) {
                byteString.getClass();
                ActionParameter.checkByteStringIsUtf8(byteString);
                this.key_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Action.ActionParameterOrBuilder
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
                this.value_ = ActionParameter.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                ActionParameter.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                this.bitField0_ |= 2;
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

        public static ActionParameter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ActionParameter> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionParameter> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionParameter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public String getFunction() {
        Object obj = this.function_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.function_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public ByteString getFunctionBytes() {
        Object obj = this.function_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.function_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public List<ActionParameter> getParametersList() {
        return this.parameters_;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public List<? extends ActionParameterOrBuilder> getParametersOrBuilderList() {
        return this.parameters_;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public ActionParameter getParameters(int i) {
        return this.parameters_.get(i);
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public ActionParameterOrBuilder getParametersOrBuilder(int i) {
        return this.parameters_.get(i);
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public int getLoadIndicatorValue() {
        return this.loadIndicator_;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public LoadIndicator getLoadIndicator() {
        LoadIndicator loadIndicatorForNumber = LoadIndicator.forNumber(this.loadIndicator_);
        return loadIndicatorForNumber == null ? LoadIndicator.UNRECOGNIZED : loadIndicatorForNumber;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public boolean getPersistValues() {
        return this.persistValues_;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public int getInteractionValue() {
        return this.interaction_;
    }

    @Override // com.google.apps.card.v1.ActionOrBuilder
    public Interaction getInteraction() {
        Interaction interactionForNumber = Interaction.forNumber(this.interaction_);
        return interactionForNumber == null ? Interaction.UNRECOGNIZED : interactionForNumber;
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
        if (!GeneratedMessageV3.isStringEmpty(this.function_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.function_);
        }
        for (int i = 0; i < this.parameters_.size(); i++) {
            codedOutputStream.writeMessage(2, this.parameters_.get(i));
        }
        if (this.loadIndicator_ != LoadIndicator.SPINNER.getNumber()) {
            codedOutputStream.writeEnum(3, this.loadIndicator_);
        }
        boolean z = this.persistValues_;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        if (this.interaction_ != Interaction.INTERACTION_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(5, this.interaction_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.function_) ? GeneratedMessageV3.computeStringSize(1, this.function_) : 0;
        for (int i2 = 0; i2 < this.parameters_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.parameters_.get(i2));
        }
        if (this.loadIndicator_ != LoadIndicator.SPINNER.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.loadIndicator_);
        }
        boolean z = this.persistValues_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(4, z);
        }
        if (this.interaction_ != Interaction.INTERACTION_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(5, this.interaction_);
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
        if (!(obj instanceof Action)) {
            return super.equals(obj);
        }
        Action action = (Action) obj;
        return getFunction().equals(action.getFunction()) && getParametersList().equals(action.getParametersList()) && this.loadIndicator_ == action.loadIndicator_ && getPersistValues() == action.getPersistValues() && this.interaction_ == action.interaction_ && getUnknownFields().equals(action.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFunction().hashCode();
        if (getParametersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getParametersList().hashCode();
        }
        int iHashBoolean = (((((((((((((iHashCode * 37) + 3) * 53) + this.loadIndicator_) * 37) + 4) * 53) + Internal.hashBoolean(getPersistValues())) * 37) + 5) * 53) + this.interaction_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashBoolean;
        return iHashBoolean;
    }

    public static Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Action parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Action parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Action parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Action parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Action parseFrom(InputStream inputStream) throws IOException {
        return (Action) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Action parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Action) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Action parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Action) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Action parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Action) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Action parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Action) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Action parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Action) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Action action) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(action);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionOrBuilder {
        private int bitField0_;
        private Object function_;
        private int interaction_;
        private int loadIndicator_;
        private RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> parametersBuilder_;
        private List<ActionParameter> parameters_;
        private boolean persistValues_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Action_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(Action.class, Builder.class);
        }

        private Builder() {
            this.function_ = "";
            this.parameters_ = Collections.emptyList();
            this.loadIndicator_ = 0;
            this.interaction_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.function_ = "";
            this.parameters_ = Collections.emptyList();
            this.loadIndicator_ = 0;
            this.interaction_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.function_ = "";
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.parameters_ = Collections.emptyList();
            } else {
                this.parameters_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            this.loadIndicator_ = 0;
            this.persistValues_ = false;
            this.interaction_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Action_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Action getDefaultInstanceForType() {
            return Action.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Action build() {
            Action actionBuildPartial = buildPartial();
            if (actionBuildPartial.isInitialized()) {
                return actionBuildPartial;
            }
            throw newUninitializedMessageException((Message) actionBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Action buildPartial() {
            Action action = new Action(this);
            buildPartialRepeatedFields(action);
            if (this.bitField0_ != 0) {
                buildPartial0(action);
            }
            onBuilt();
            return action;
        }

        private void buildPartialRepeatedFields(Action action) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                action.parameters_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.parameters_ = Collections.unmodifiableList(this.parameters_);
                this.bitField0_ &= -3;
            }
            action.parameters_ = this.parameters_;
        }

        private void buildPartial0(Action action) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                action.function_ = this.function_;
            }
            if ((i & 4) != 0) {
                action.loadIndicator_ = this.loadIndicator_;
            }
            if ((i & 8) != 0) {
                action.persistValues_ = this.persistValues_;
            }
            if ((i & 16) != 0) {
                action.interaction_ = this.interaction_;
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
            if (message instanceof Action) {
                return mergeFrom((Action) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Action action) {
            if (action == Action.getDefaultInstance()) {
                return this;
            }
            if (!action.getFunction().isEmpty()) {
                this.function_ = action.function_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.parametersBuilder_ == null) {
                if (!action.parameters_.isEmpty()) {
                    if (this.parameters_.isEmpty()) {
                        this.parameters_ = action.parameters_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureParametersIsMutable();
                        this.parameters_.addAll(action.parameters_);
                    }
                    onChanged();
                }
            } else if (!action.parameters_.isEmpty()) {
                if (!this.parametersBuilder_.isEmpty()) {
                    this.parametersBuilder_.addAllMessages(action.parameters_);
                } else {
                    this.parametersBuilder_.dispose();
                    this.parametersBuilder_ = null;
                    this.parameters_ = action.parameters_;
                    this.bitField0_ &= -3;
                    this.parametersBuilder_ = Action.alwaysUseFieldBuilders ? getParametersFieldBuilder() : null;
                }
            }
            if (action.loadIndicator_ != 0) {
                setLoadIndicatorValue(action.getLoadIndicatorValue());
            }
            if (action.getPersistValues()) {
                setPersistValues(action.getPersistValues());
            }
            if (action.interaction_ != 0) {
                setInteractionValue(action.getInteractionValue());
            }
            mergeUnknownFields(action.getUnknownFields());
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
                                this.function_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                ActionParameter actionParameter = (ActionParameter) codedInputStream.readMessage(ActionParameter.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureParametersIsMutable();
                                    this.parameters_.add(actionParameter);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(actionParameter);
                                }
                            } else if (tag == 24) {
                                this.loadIndicator_ = codedInputStream.readEnum();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.persistValues_ = codedInputStream.readBool();
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.interaction_ = codedInputStream.readEnum();
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

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public String getFunction() {
            Object obj = this.function_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.function_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public ByteString getFunctionBytes() {
            Object obj = this.function_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.function_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setFunction(String str) {
            str.getClass();
            this.function_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearFunction() {
            this.function_ = Action.getDefaultInstance().getFunction();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setFunctionBytes(ByteString byteString) {
            byteString.getClass();
            Action.checkByteStringIsUtf8(byteString);
            this.function_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureParametersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.parameters_ = new ArrayList(this.parameters_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public List<ActionParameter> getParametersList() {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.parameters_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public int getParametersCount() {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.parameters_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public ActionParameter getParameters(int i) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.parameters_.get(i);
            }
            return (ActionParameter) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setParameters(int i, ActionParameter actionParameter) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                actionParameter.getClass();
                ensureParametersIsMutable();
                this.parameters_.set(i, actionParameter);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, actionParameter);
            }
            return this;
        }

        public Builder setParameters(int i, ActionParameter.Builder builder) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureParametersIsMutable();
                this.parameters_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addParameters(ActionParameter actionParameter) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                actionParameter.getClass();
                ensureParametersIsMutable();
                this.parameters_.add(actionParameter);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(actionParameter);
            }
            return this;
        }

        public Builder addParameters(int i, ActionParameter actionParameter) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                actionParameter.getClass();
                ensureParametersIsMutable();
                this.parameters_.add(i, actionParameter);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, actionParameter);
            }
            return this;
        }

        public Builder addParameters(ActionParameter.Builder builder) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureParametersIsMutable();
                this.parameters_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addParameters(int i, ActionParameter.Builder builder) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureParametersIsMutable();
                this.parameters_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllParameters(Iterable<? extends ActionParameter> iterable) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureParametersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.parameters_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearParameters() {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.parameters_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeParameters(int i) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureParametersIsMutable();
                this.parameters_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ActionParameter.Builder getParametersBuilder(int i) {
            return (ActionParameter.Builder) getParametersFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public ActionParameterOrBuilder getParametersOrBuilder(int i) {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.parameters_.get(i);
            }
            return (ActionParameterOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public List<? extends ActionParameterOrBuilder> getParametersOrBuilderList() {
            RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> repeatedFieldBuilderV3 = this.parametersBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.parameters_);
        }

        public ActionParameter.Builder addParametersBuilder() {
            return (ActionParameter.Builder) getParametersFieldBuilder().addBuilder(ActionParameter.getDefaultInstance());
        }

        public ActionParameter.Builder addParametersBuilder(int i) {
            return (ActionParameter.Builder) getParametersFieldBuilder().addBuilder(i, ActionParameter.getDefaultInstance());
        }

        public List<ActionParameter.Builder> getParametersBuilderList() {
            return getParametersFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ActionParameter, ActionParameter.Builder, ActionParameterOrBuilder> getParametersFieldBuilder() {
            if (this.parametersBuilder_ == null) {
                this.parametersBuilder_ = new RepeatedFieldBuilderV3<>(this.parameters_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.parameters_ = null;
            }
            return this.parametersBuilder_;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public int getLoadIndicatorValue() {
            return this.loadIndicator_;
        }

        public Builder setLoadIndicatorValue(int i) {
            this.loadIndicator_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public LoadIndicator getLoadIndicator() {
            LoadIndicator loadIndicatorForNumber = LoadIndicator.forNumber(this.loadIndicator_);
            return loadIndicatorForNumber == null ? LoadIndicator.UNRECOGNIZED : loadIndicatorForNumber;
        }

        public Builder setLoadIndicator(LoadIndicator loadIndicator) {
            loadIndicator.getClass();
            this.bitField0_ |= 4;
            this.loadIndicator_ = loadIndicator.getNumber();
            onChanged();
            return this;
        }

        public Builder clearLoadIndicator() {
            this.bitField0_ &= -5;
            this.loadIndicator_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public boolean getPersistValues() {
            return this.persistValues_;
        }

        public Builder setPersistValues(boolean z) {
            this.persistValues_ = z;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearPersistValues() {
            this.bitField0_ &= -9;
            this.persistValues_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public int getInteractionValue() {
            return this.interaction_;
        }

        public Builder setInteractionValue(int i) {
            this.interaction_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.ActionOrBuilder
        public Interaction getInteraction() {
            Interaction interactionForNumber = Interaction.forNumber(this.interaction_);
            return interactionForNumber == null ? Interaction.UNRECOGNIZED : interactionForNumber;
        }

        public Builder setInteraction(Interaction interaction) {
            interaction.getClass();
            this.bitField0_ |= 16;
            this.interaction_ = interaction.getNumber();
            onChanged();
            return this;
        }

        public Builder clearInteraction() {
            this.bitField0_ &= -17;
            this.interaction_ = 0;
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

    public static Action getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Action> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Action> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Action getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
