package com.google.apps.card.v1;

import com.google.apps.card.v1.Action;
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
public final class DateTimePicker extends GeneratedMessageV3 implements DateTimePickerOrBuilder {
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ON_CHANGE_ACTION_FIELD_NUMBER = 6;
    public static final int TIMEZONE_OFFSET_DATE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int VALUE_MS_EPOCH_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object label_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Action onChangeAction_;
    private int timezoneOffsetDate_;
    private int type_;
    private long valueMsEpoch_;
    private static final DateTimePicker DEFAULT_INSTANCE = new DateTimePicker();
    private static final Parser<DateTimePicker> PARSER = new AbstractParser<DateTimePicker>() { // from class: com.google.apps.card.v1.DateTimePicker.1
        @Override // com.google.protobuf.Parser
        public DateTimePicker parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = DateTimePicker.newBuilder();
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

    static /* synthetic */ int access$1076(DateTimePicker dateTimePicker, int i) {
        int i2 = i | dateTimePicker.bitField0_;
        dateTimePicker.bitField0_ = i2;
        return i2;
    }

    private DateTimePicker(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
        this.valueMsEpoch_ = 0L;
        this.timezoneOffsetDate_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private DateTimePicker() {
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
        this.valueMsEpoch_ = 0L;
        this.timezoneOffsetDate_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DateTimePicker();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_DateTimePicker_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_DateTimePicker_fieldAccessorTable.ensureFieldAccessorsInitialized(DateTimePicker.class, Builder.class);
    }

    public enum DateTimePickerType implements ProtocolMessageEnum {
        DATE_AND_TIME(0),
        DATE_ONLY(1),
        TIME_ONLY(2),
        UNRECOGNIZED(-1);

        public static final int DATE_AND_TIME_VALUE = 0;
        public static final int DATE_ONLY_VALUE = 1;
        public static final int TIME_ONLY_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<DateTimePickerType> internalValueMap = new Internal.EnumLiteMap<DateTimePickerType>() { // from class: com.google.apps.card.v1.DateTimePicker.DateTimePickerType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DateTimePickerType findValueByNumber(int i) {
                return DateTimePickerType.forNumber(i);
            }
        };
        private static final DateTimePickerType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DateTimePickerType valueOf(int i) {
            return forNumber(i);
        }

        public static DateTimePickerType forNumber(int i) {
            if (i == 0) {
                return DATE_AND_TIME;
            }
            if (i == 1) {
                return DATE_ONLY;
            }
            if (i != 2) {
                return null;
            }
            return TIME_ONLY;
        }

        public static Internal.EnumLiteMap<DateTimePickerType> internalGetValueMap() {
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
            return DateTimePicker.getDescriptor().getEnumTypes().get(0);
        }

        public static DateTimePickerType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        DateTimePickerType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public String getLabel() {
        Object obj = this.label_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.label_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public ByteString getLabelBytes() {
        Object obj = this.label_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.label_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public DateTimePickerType getType() {
        DateTimePickerType dateTimePickerTypeForNumber = DateTimePickerType.forNumber(this.type_);
        return dateTimePickerTypeForNumber == null ? DateTimePickerType.UNRECOGNIZED : dateTimePickerTypeForNumber;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public long getValueMsEpoch() {
        return this.valueMsEpoch_;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public int getTimezoneOffsetDate() {
        return this.timezoneOffsetDate_;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public boolean hasOnChangeAction() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public Action getOnChangeAction() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
    public ActionOrBuilder getOnChangeActionOrBuilder() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
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
        if (this.type_ != DateTimePickerType.DATE_AND_TIME.getNumber()) {
            codedOutputStream.writeEnum(3, this.type_);
        }
        long j = this.valueMsEpoch_;
        if (j != 0) {
            codedOutputStream.writeInt64(4, j);
        }
        int i = this.timezoneOffsetDate_;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(6, getOnChangeAction());
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
        if (this.type_ != DateTimePickerType.DATE_AND_TIME.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.type_);
        }
        long j = this.valueMsEpoch_;
        if (j != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(4, j);
        }
        int i2 = this.timezoneOffsetDate_;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(5, i2);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, getOnChangeAction());
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
        if (!(obj instanceof DateTimePicker)) {
            return super.equals(obj);
        }
        DateTimePicker dateTimePicker = (DateTimePicker) obj;
        if (getName().equals(dateTimePicker.getName()) && getLabel().equals(dateTimePicker.getLabel()) && this.type_ == dateTimePicker.type_ && getValueMsEpoch() == dateTimePicker.getValueMsEpoch() && getTimezoneOffsetDate() == dateTimePicker.getTimezoneOffsetDate() && hasOnChangeAction() == dateTimePicker.hasOnChangeAction()) {
            return (!hasOnChangeAction() || getOnChangeAction().equals(dateTimePicker.getOnChangeAction())) && getUnknownFields().equals(dateTimePicker.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getLabel().hashCode()) * 37) + 3) * 53) + this.type_) * 37) + 4) * 53) + Internal.hashLong(getValueMsEpoch())) * 37) + 5) * 53) + getTimezoneOffsetDate();
        if (hasOnChangeAction()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getOnChangeAction().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static DateTimePicker parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static DateTimePicker parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DateTimePicker parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static DateTimePicker parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static DateTimePicker parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static DateTimePicker parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DateTimePicker parseFrom(InputStream inputStream) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DateTimePicker parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DateTimePicker parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DateTimePicker parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DateTimePicker parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DateTimePicker parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTimePicker) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DateTimePicker dateTimePicker) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dateTimePicker);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DateTimePickerOrBuilder {
        private int bitField0_;
        private Object label_;
        private Object name_;
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> onChangeActionBuilder_;
        private Action onChangeAction_;
        private int timezoneOffsetDate_;
        private int type_;
        private long valueMsEpoch_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_DateTimePicker_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_DateTimePicker_fieldAccessorTable.ensureFieldAccessorsInitialized(DateTimePicker.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.label_ = "";
            this.type_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.label_ = "";
            this.type_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (DateTimePicker.alwaysUseFieldBuilders) {
                getOnChangeActionFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.label_ = "";
            this.type_ = 0;
            this.valueMsEpoch_ = 0L;
            this.timezoneOffsetDate_ = 0;
            this.onChangeAction_ = null;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.onChangeActionBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_DateTimePicker_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DateTimePicker getDefaultInstanceForType() {
            return DateTimePicker.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DateTimePicker build() {
            DateTimePicker dateTimePickerBuildPartial = buildPartial();
            if (dateTimePickerBuildPartial.isInitialized()) {
                return dateTimePickerBuildPartial;
            }
            throw newUninitializedMessageException((Message) dateTimePickerBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DateTimePicker buildPartial() {
            DateTimePicker dateTimePicker = new DateTimePicker(this);
            if (this.bitField0_ != 0) {
                buildPartial0(dateTimePicker);
            }
            onBuilt();
            return dateTimePicker;
        }

        private void buildPartial0(DateTimePicker dateTimePicker) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                dateTimePicker.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                dateTimePicker.label_ = this.label_;
            }
            if ((i2 & 4) != 0) {
                dateTimePicker.type_ = this.type_;
            }
            if ((i2 & 8) != 0) {
                dateTimePicker.valueMsEpoch_ = this.valueMsEpoch_;
            }
            if ((i2 & 16) != 0) {
                dateTimePicker.timezoneOffsetDate_ = this.timezoneOffsetDate_;
            }
            if ((i2 & 32) != 0) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                dateTimePicker.onChangeAction_ = singleFieldBuilderV3 == null ? this.onChangeAction_ : (Action) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            DateTimePicker.access$1076(dateTimePicker, i);
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
            if (message instanceof DateTimePicker) {
                return mergeFrom((DateTimePicker) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DateTimePicker dateTimePicker) {
            if (dateTimePicker == DateTimePicker.getDefaultInstance()) {
                return this;
            }
            if (!dateTimePicker.getName().isEmpty()) {
                this.name_ = dateTimePicker.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!dateTimePicker.getLabel().isEmpty()) {
                this.label_ = dateTimePicker.label_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (dateTimePicker.type_ != 0) {
                setTypeValue(dateTimePicker.getTypeValue());
            }
            if (dateTimePicker.getValueMsEpoch() != 0) {
                setValueMsEpoch(dateTimePicker.getValueMsEpoch());
            }
            if (dateTimePicker.getTimezoneOffsetDate() != 0) {
                setTimezoneOffsetDate(dateTimePicker.getTimezoneOffsetDate());
            }
            if (dateTimePicker.hasOnChangeAction()) {
                mergeOnChangeAction(dateTimePicker.getOnChangeAction());
            }
            mergeUnknownFields(dateTimePicker.getUnknownFields());
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
                            } else if (tag == 24) {
                                this.type_ = codedInputStream.readEnum();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.valueMsEpoch_ = codedInputStream.readInt64();
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.timezoneOffsetDate_ = codedInputStream.readInt32();
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                codedInputStream.readMessage(getOnChangeActionFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
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
            this.name_ = DateTimePicker.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            DateTimePicker.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public String getLabel() {
            Object obj = this.label_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.label_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
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
            this.label_ = DateTimePicker.getDefaultInstance().getLabel();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            byteString.getClass();
            DateTimePicker.checkByteStringIsUtf8(byteString);
            this.label_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public DateTimePickerType getType() {
            DateTimePickerType dateTimePickerTypeForNumber = DateTimePickerType.forNumber(this.type_);
            return dateTimePickerTypeForNumber == null ? DateTimePickerType.UNRECOGNIZED : dateTimePickerTypeForNumber;
        }

        public Builder setType(DateTimePickerType dateTimePickerType) {
            dateTimePickerType.getClass();
            this.bitField0_ |= 4;
            this.type_ = dateTimePickerType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -5;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public long getValueMsEpoch() {
            return this.valueMsEpoch_;
        }

        public Builder setValueMsEpoch(long j) {
            this.valueMsEpoch_ = j;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearValueMsEpoch() {
            this.bitField0_ &= -9;
            this.valueMsEpoch_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public int getTimezoneOffsetDate() {
            return this.timezoneOffsetDate_;
        }

        public Builder setTimezoneOffsetDate(int i) {
            this.timezoneOffsetDate_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearTimezoneOffsetDate() {
            this.bitField0_ &= -17;
            this.timezoneOffsetDate_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
        public boolean hasOnChangeAction() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
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

        @Override // com.google.apps.card.v1.DateTimePickerOrBuilder
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

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static DateTimePicker getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DateTimePicker> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<DateTimePicker> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public DateTimePicker getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
