package com.google.apps.card.v1;

import com.google.apps.card.v1.Action;
import com.google.apps.card.v1.Suggestions;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class TextInput extends GeneratedMessageV3 implements TextInputOrBuilder {
    public static final int AUTO_COMPLETE_ACTION_FIELD_NUMBER = 8;
    public static final int HINT_TEXT_FIELD_NUMBER = 3;
    public static final int INITIAL_SUGGESTIONS_FIELD_NUMBER = 7;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ON_CHANGE_ACTION_FIELD_NUMBER = 6;
    public static final int PLACEHOLDER_TEXT_FIELD_NUMBER = 12;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int VALUE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private Action autoCompleteAction_;
    private int bitField0_;
    private volatile Object hintText_;
    private Suggestions initialSuggestions_;
    private volatile Object label_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Action onChangeAction_;
    private volatile Object placeholderText_;
    private int type_;
    private volatile Object value_;
    private static final TextInput DEFAULT_INSTANCE = new TextInput();
    private static final Parser<TextInput> PARSER = new AbstractParser<TextInput>() { // from class: com.google.apps.card.v1.TextInput.1
        @Override // com.google.protobuf.Parser
        public TextInput parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = TextInput.newBuilder();
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

    static /* synthetic */ int access$1376(TextInput textInput, int i) {
        int i2 = i | textInput.bitField0_;
        textInput.bitField0_ = i2;
        return i2;
    }

    private TextInput(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.label_ = "";
        this.hintText_ = "";
        this.value_ = "";
        this.type_ = 0;
        this.placeholderText_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private TextInput() {
        this.name_ = "";
        this.label_ = "";
        this.hintText_ = "";
        this.value_ = "";
        this.type_ = 0;
        this.placeholderText_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.label_ = "";
        this.hintText_ = "";
        this.value_ = "";
        this.type_ = 0;
        this.placeholderText_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new TextInput();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_TextInput_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_TextInput_fieldAccessorTable.ensureFieldAccessorsInitialized(TextInput.class, Builder.class);
    }

    public enum Type implements ProtocolMessageEnum {
        SINGLE_LINE(0),
        MULTIPLE_LINE(1),
        UNRECOGNIZED(-1);

        public static final int MULTIPLE_LINE_VALUE = 1;
        public static final int SINGLE_LINE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.apps.card.v1.TextInput.Type.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        private static final Type[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return SINGLE_LINE;
            }
            if (i != 1) {
                return null;
            }
            return MULTIPLE_LINE;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            return TextInput.getDescriptor().getEnumTypes().get(0);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        Type(int i) {
            this.value = i;
        }
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public String getLabel() {
        Object obj = this.label_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.label_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ByteString getLabelBytes() {
        Object obj = this.label_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.label_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public String getHintText() {
        Object obj = this.hintText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hintText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ByteString getHintTextBytes() {
        Object obj = this.hintText_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hintText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public boolean hasOnChangeAction() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public Action getOnChangeAction() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ActionOrBuilder getOnChangeActionOrBuilder() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public boolean hasInitialSuggestions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public Suggestions getInitialSuggestions() {
        Suggestions suggestions = this.initialSuggestions_;
        return suggestions == null ? Suggestions.getDefaultInstance() : suggestions;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public SuggestionsOrBuilder getInitialSuggestionsOrBuilder() {
        Suggestions suggestions = this.initialSuggestions_;
        return suggestions == null ? Suggestions.getDefaultInstance() : suggestions;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public boolean hasAutoCompleteAction() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public Action getAutoCompleteAction() {
        Action action = this.autoCompleteAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ActionOrBuilder getAutoCompleteActionOrBuilder() {
        Action action = this.autoCompleteAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public String getPlaceholderText() {
        Object obj = this.placeholderText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.placeholderText_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.TextInputOrBuilder
    public ByteString getPlaceholderTextBytes() {
        Object obj = this.placeholderText_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.placeholderText_ = byteStringCopyFromUtf8;
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
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.label_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.label_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.hintText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.hintText_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.value_);
        }
        if (this.type_ != Type.SINGLE_LINE.getNumber()) {
            codedOutputStream.writeEnum(5, this.type_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(6, getOnChangeAction());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(7, getInitialSuggestions());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(8, getAutoCompleteAction());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.placeholderText_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.placeholderText_);
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
        if (!GeneratedMessageV3.isStringEmpty(this.label_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.label_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.hintText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.hintText_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.value_);
        }
        if (this.type_ != Type.SINGLE_LINE.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(5, this.type_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, getOnChangeAction());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(7, getInitialSuggestions());
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, getAutoCompleteAction());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.placeholderText_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.placeholderText_);
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
        if (!(obj instanceof TextInput)) {
            return super.equals(obj);
        }
        TextInput textInput = (TextInput) obj;
        if (!getName().equals(textInput.getName()) || !getLabel().equals(textInput.getLabel()) || !getHintText().equals(textInput.getHintText()) || !getValue().equals(textInput.getValue()) || this.type_ != textInput.type_ || hasOnChangeAction() != textInput.hasOnChangeAction()) {
            return false;
        }
        if ((hasOnChangeAction() && !getOnChangeAction().equals(textInput.getOnChangeAction())) || hasInitialSuggestions() != textInput.hasInitialSuggestions()) {
            return false;
        }
        if ((!hasInitialSuggestions() || getInitialSuggestions().equals(textInput.getInitialSuggestions())) && hasAutoCompleteAction() == textInput.hasAutoCompleteAction()) {
            return (!hasAutoCompleteAction() || getAutoCompleteAction().equals(textInput.getAutoCompleteAction())) && getPlaceholderText().equals(textInput.getPlaceholderText()) && getUnknownFields().equals(textInput.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getLabel().hashCode()) * 37) + 3) * 53) + getHintText().hashCode()) * 37) + 4) * 53) + getValue().hashCode()) * 37) + 5) * 53) + this.type_;
        if (hasOnChangeAction()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getOnChangeAction().hashCode();
        }
        if (hasInitialSuggestions()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getInitialSuggestions().hashCode();
        }
        if (hasAutoCompleteAction()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getAutoCompleteAction().hashCode();
        }
        int iHashCode2 = (((((iHashCode * 37) + 12) * 53) + getPlaceholderText().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static TextInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static TextInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static TextInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static TextInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TextInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static TextInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TextInput parseFrom(InputStream inputStream) throws IOException {
        return (TextInput) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static TextInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static TextInput parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextInput) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static TextInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static TextInput parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextInput) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static TextInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextInput) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(TextInput textInput) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(textInput);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TextInputOrBuilder {
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> autoCompleteActionBuilder_;
        private Action autoCompleteAction_;
        private int bitField0_;
        private Object hintText_;
        private SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> initialSuggestionsBuilder_;
        private Suggestions initialSuggestions_;
        private Object label_;
        private Object name_;
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> onChangeActionBuilder_;
        private Action onChangeAction_;
        private Object placeholderText_;
        private int type_;
        private Object value_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_TextInput_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_TextInput_fieldAccessorTable.ensureFieldAccessorsInitialized(TextInput.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.label_ = "";
            this.hintText_ = "";
            this.value_ = "";
            this.type_ = 0;
            this.placeholderText_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.label_ = "";
            this.hintText_ = "";
            this.value_ = "";
            this.type_ = 0;
            this.placeholderText_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (TextInput.alwaysUseFieldBuilders) {
                getOnChangeActionFieldBuilder();
                getInitialSuggestionsFieldBuilder();
                getAutoCompleteActionFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.label_ = "";
            this.hintText_ = "";
            this.value_ = "";
            this.type_ = 0;
            this.onChangeAction_ = null;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.onChangeActionBuilder_ = null;
            }
            this.initialSuggestions_ = null;
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV32 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.initialSuggestionsBuilder_ = null;
            }
            this.autoCompleteAction_ = null;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV33 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.autoCompleteActionBuilder_ = null;
            }
            this.placeholderText_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_TextInput_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TextInput getDefaultInstanceForType() {
            return TextInput.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public TextInput build() {
            TextInput textInputBuildPartial = buildPartial();
            if (textInputBuildPartial.isInitialized()) {
                return textInputBuildPartial;
            }
            throw newUninitializedMessageException((Message) textInputBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public TextInput buildPartial() {
            TextInput textInput = new TextInput(this);
            if (this.bitField0_ != 0) {
                buildPartial0(textInput);
            }
            onBuilt();
            return textInput;
        }

        private void buildPartial0(TextInput textInput) {
            int i;
            Action action;
            Suggestions suggestions;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                textInput.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                textInput.label_ = this.label_;
            }
            if ((i2 & 4) != 0) {
                textInput.hintText_ = this.hintText_;
            }
            if ((i2 & 8) != 0) {
                textInput.value_ = this.value_;
            }
            if ((i2 & 16) != 0) {
                textInput.type_ = this.type_;
            }
            if ((i2 & 32) != 0) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                textInput.onChangeAction_ = singleFieldBuilderV3 == null ? this.onChangeAction_ : (Action) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 64) != 0) {
                SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV32 = this.initialSuggestionsBuilder_;
                if (singleFieldBuilderV32 == null) {
                    suggestions = this.initialSuggestions_;
                } else {
                    suggestions = (Suggestions) singleFieldBuilderV32.build();
                }
                textInput.initialSuggestions_ = suggestions;
                i |= 2;
            }
            if ((i2 & 128) != 0) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV33 = this.autoCompleteActionBuilder_;
                if (singleFieldBuilderV33 == null) {
                    action = this.autoCompleteAction_;
                } else {
                    action = (Action) singleFieldBuilderV33.build();
                }
                textInput.autoCompleteAction_ = action;
                i |= 4;
            }
            if ((i2 & 256) != 0) {
                textInput.placeholderText_ = this.placeholderText_;
            }
            TextInput.access$1376(textInput, i);
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
            if (message instanceof TextInput) {
                return mergeFrom((TextInput) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(TextInput textInput) {
            if (textInput == TextInput.getDefaultInstance()) {
                return this;
            }
            if (!textInput.getName().isEmpty()) {
                this.name_ = textInput.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!textInput.getLabel().isEmpty()) {
                this.label_ = textInput.label_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!textInput.getHintText().isEmpty()) {
                this.hintText_ = textInput.hintText_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!textInput.getValue().isEmpty()) {
                this.value_ = textInput.value_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (textInput.type_ != 0) {
                setTypeValue(textInput.getTypeValue());
            }
            if (textInput.hasOnChangeAction()) {
                mergeOnChangeAction(textInput.getOnChangeAction());
            }
            if (textInput.hasInitialSuggestions()) {
                mergeInitialSuggestions(textInput.getInitialSuggestions());
            }
            if (textInput.hasAutoCompleteAction()) {
                mergeAutoCompleteAction(textInput.getAutoCompleteAction());
            }
            if (!textInput.getPlaceholderText().isEmpty()) {
                this.placeholderText_ = textInput.placeholderText_;
                this.bitField0_ |= 256;
                onChanged();
            }
            mergeUnknownFields(textInput.getUnknownFields());
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
                                this.label_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.hintText_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.value_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.type_ = codedInputStream.readEnum();
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                codedInputStream.readMessage(getOnChangeActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 32;
                            } else if (tag == 58) {
                                codedInputStream.readMessage(getInitialSuggestionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 64;
                            } else if (tag == 66) {
                                codedInputStream.readMessage(getAutoCompleteActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 128;
                            } else if (tag == 98) {
                                this.placeholderText_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 256;
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

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
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
            this.name_ = TextInput.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            TextInput.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public String getLabel() {
            Object obj = this.label_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.label_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public ByteString getLabelBytes() {
            Object obj = this.label_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.label_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setLabel(String str) {
            str.getClass();
            this.label_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearLabel() {
            this.label_ = TextInput.getDefaultInstance().getLabel();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            byteString.getClass();
            TextInput.checkByteStringIsUtf8(byteString);
            this.label_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public String getHintText() {
            Object obj = this.hintText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hintText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public ByteString getHintTextBytes() {
            Object obj = this.hintText_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hintText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setHintText(String str) {
            str.getClass();
            this.hintText_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearHintText() {
            this.hintText_ = TextInput.getDefaultInstance().getHintText();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setHintTextBytes(ByteString byteString) {
            byteString.getClass();
            TextInput.checkByteStringIsUtf8(byteString);
            this.hintText_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
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
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearValue() {
            this.value_ = TextInput.getDefaultInstance().getValue();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setValueBytes(ByteString byteString) {
            byteString.getClass();
            TextInput.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        public Builder setType(Type type) {
            type.getClass();
            this.bitField0_ |= 16;
            this.type_ = type.getNumber();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -17;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public boolean hasOnChangeAction() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
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
            this.bitField0_ |= 32;
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
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder mergeOnChangeAction(Action action) {
            Action action2;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32) != 0 && (action2 = this.onChangeAction_) != null && action2 != Action.getDefaultInstance()) {
                    getOnChangeActionBuilder().mergeFrom(action);
                } else {
                    this.onChangeAction_ = action;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(action);
            }
            if (this.onChangeAction_ != null) {
                this.bitField0_ |= 32;
                onChanged();
            }
            return this;
        }

        public Builder clearOnChangeAction() {
            this.bitField0_ &= -33;
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
            this.bitField0_ |= 32;
            onChanged();
            return (Action.Builder) getOnChangeActionFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
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

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public boolean hasInitialSuggestions() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public Suggestions getInitialSuggestions() {
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                Suggestions suggestions = this.initialSuggestions_;
                return suggestions == null ? Suggestions.getDefaultInstance() : suggestions;
            }
            return (Suggestions) singleFieldBuilderV3.getMessage();
        }

        public Builder setInitialSuggestions(Suggestions suggestions) {
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                suggestions.getClass();
                this.initialSuggestions_ = suggestions;
            } else {
                singleFieldBuilderV3.setMessage(suggestions);
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setInitialSuggestions(Suggestions.Builder builder) {
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.initialSuggestions_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder mergeInitialSuggestions(Suggestions suggestions) {
            Suggestions suggestions2;
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 64) != 0 && (suggestions2 = this.initialSuggestions_) != null && suggestions2 != Suggestions.getDefaultInstance()) {
                    getInitialSuggestionsBuilder().mergeFrom(suggestions);
                } else {
                    this.initialSuggestions_ = suggestions;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(suggestions);
            }
            if (this.initialSuggestions_ != null) {
                this.bitField0_ |= 64;
                onChanged();
            }
            return this;
        }

        public Builder clearInitialSuggestions() {
            this.bitField0_ &= -65;
            this.initialSuggestions_ = null;
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.initialSuggestionsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Suggestions.Builder getInitialSuggestionsBuilder() {
            this.bitField0_ |= 64;
            onChanged();
            return (Suggestions.Builder) getInitialSuggestionsFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public SuggestionsOrBuilder getInitialSuggestionsOrBuilder() {
            SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> singleFieldBuilderV3 = this.initialSuggestionsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SuggestionsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Suggestions suggestions = this.initialSuggestions_;
            return suggestions == null ? Suggestions.getDefaultInstance() : suggestions;
        }

        private SingleFieldBuilderV3<Suggestions, Suggestions.Builder, SuggestionsOrBuilder> getInitialSuggestionsFieldBuilder() {
            if (this.initialSuggestionsBuilder_ == null) {
                this.initialSuggestionsBuilder_ = new SingleFieldBuilderV3<>(getInitialSuggestions(), getParentForChildren(), isClean());
                this.initialSuggestions_ = null;
            }
            return this.initialSuggestionsBuilder_;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public boolean hasAutoCompleteAction() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public Action getAutoCompleteAction() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                Action action = this.autoCompleteAction_;
                return action == null ? Action.getDefaultInstance() : action;
            }
            return (Action) singleFieldBuilderV3.getMessage();
        }

        public Builder setAutoCompleteAction(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                action.getClass();
                this.autoCompleteAction_ = action;
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setAutoCompleteAction(Action.Builder builder) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.autoCompleteAction_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder mergeAutoCompleteAction(Action action) {
            Action action2;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 128) != 0 && (action2 = this.autoCompleteAction_) != null && action2 != Action.getDefaultInstance()) {
                    getAutoCompleteActionBuilder().mergeFrom(action);
                } else {
                    this.autoCompleteAction_ = action;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(action);
            }
            if (this.autoCompleteAction_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public Builder clearAutoCompleteAction() {
            this.bitField0_ &= -129;
            this.autoCompleteAction_ = null;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.autoCompleteActionBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Action.Builder getAutoCompleteActionBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (Action.Builder) getAutoCompleteActionFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public ActionOrBuilder getAutoCompleteActionOrBuilder() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.autoCompleteActionBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ActionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Action action = this.autoCompleteAction_;
            return action == null ? Action.getDefaultInstance() : action;
        }

        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> getAutoCompleteActionFieldBuilder() {
            if (this.autoCompleteActionBuilder_ == null) {
                this.autoCompleteActionBuilder_ = new SingleFieldBuilderV3<>(getAutoCompleteAction(), getParentForChildren(), isClean());
                this.autoCompleteAction_ = null;
            }
            return this.autoCompleteActionBuilder_;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public String getPlaceholderText() {
            Object obj = this.placeholderText_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.placeholderText_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.TextInputOrBuilder
        public ByteString getPlaceholderTextBytes() {
            Object obj = this.placeholderText_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.placeholderText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPlaceholderText(String str) {
            str.getClass();
            this.placeholderText_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder clearPlaceholderText() {
            this.placeholderText_ = TextInput.getDefaultInstance().getPlaceholderText();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public Builder setPlaceholderTextBytes(ByteString byteString) {
            byteString.getClass();
            TextInput.checkByteStringIsUtf8(byteString);
            this.placeholderText_ = byteString;
            this.bitField0_ |= 256;
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

    public static TextInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<TextInput> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<TextInput> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public TextInput getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
