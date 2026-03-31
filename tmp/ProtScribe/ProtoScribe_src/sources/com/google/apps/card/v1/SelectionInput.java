package com.google.apps.card.v1;

import com.google.apps.card.v1.Action;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectionInput extends GeneratedMessageV3 implements SelectionInputOrBuilder {
    public static final int EXTERNAL_DATA_SOURCE_FIELD_NUMBER = 8;
    public static final int ITEMS_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int MULTI_SELECT_MAX_SELECTED_ITEMS_FIELD_NUMBER = 6;
    public static final int MULTI_SELECT_MIN_QUERY_LENGTH_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ON_CHANGE_ACTION_FIELD_NUMBER = 5;
    public static final int PLATFORM_DATA_SOURCE_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<SelectionItem> items_;
    private volatile Object label_;
    private byte memoizedIsInitialized;
    private int multiSelectDataSourceCase_;
    private Object multiSelectDataSource_;
    private int multiSelectMaxSelectedItems_;
    private int multiSelectMinQueryLength_;
    private volatile Object name_;
    private Action onChangeAction_;
    private int type_;
    private static final SelectionInput DEFAULT_INSTANCE = new SelectionInput();
    private static final Parser<SelectionInput> PARSER = new AbstractParser<SelectionInput>() { // from class: com.google.apps.card.v1.SelectionInput.1
        @Override // com.google.protobuf.Parser
        public SelectionInput parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = SelectionInput.newBuilder();
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

    public interface PlatformDataSourceOrBuilder extends MessageOrBuilder {
        PlatformDataSource.CommonDataSource getCommonDataSource();

        int getCommonDataSourceValue();

        PlatformDataSource.DataSourceCase getDataSourceCase();

        boolean hasCommonDataSource();
    }

    public interface SelectionItemOrBuilder extends MessageOrBuilder {
        String getBottomText();

        ByteString getBottomTextBytes();

        boolean getSelected();

        String getStartIconUri();

        ByteString getStartIconUriBytes();

        String getText();

        ByteString getTextBytes();

        String getValue();

        ByteString getValueBytes();
    }

    static /* synthetic */ int access$2876(SelectionInput selectionInput, int i) {
        int i2 = i | selectionInput.bitField0_;
        selectionInput.bitField0_ = i2;
        return i2;
    }

    private SelectionInput(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.multiSelectDataSourceCase_ = 0;
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
        this.multiSelectMaxSelectedItems_ = 0;
        this.multiSelectMinQueryLength_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private SelectionInput() {
        this.multiSelectDataSourceCase_ = 0;
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
        this.multiSelectMaxSelectedItems_ = 0;
        this.multiSelectMinQueryLength_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.label_ = "";
        this.type_ = 0;
        this.items_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SelectionInput();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_SelectionInput_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_SelectionInput_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectionInput.class, Builder.class);
    }

    public enum SelectionType implements ProtocolMessageEnum {
        CHECK_BOX(0),
        RADIO_BUTTON(1),
        SWITCH(2),
        DROPDOWN(3),
        MULTI_SELECT(4),
        UNRECOGNIZED(-1);

        public static final int CHECK_BOX_VALUE = 0;
        public static final int DROPDOWN_VALUE = 3;
        public static final int MULTI_SELECT_VALUE = 4;
        public static final int RADIO_BUTTON_VALUE = 1;
        public static final int SWITCH_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<SelectionType> internalValueMap = new Internal.EnumLiteMap<SelectionType>() { // from class: com.google.apps.card.v1.SelectionInput.SelectionType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SelectionType findValueByNumber(int i) {
                return SelectionType.forNumber(i);
            }
        };
        private static final SelectionType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static SelectionType valueOf(int i) {
            return forNumber(i);
        }

        public static SelectionType forNumber(int i) {
            if (i == 0) {
                return CHECK_BOX;
            }
            if (i == 1) {
                return RADIO_BUTTON;
            }
            if (i == 2) {
                return SWITCH;
            }
            if (i == 3) {
                return DROPDOWN;
            }
            if (i != 4) {
                return null;
            }
            return MULTI_SELECT;
        }

        public static Internal.EnumLiteMap<SelectionType> internalGetValueMap() {
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
            return SelectionInput.getDescriptor().getEnumTypes().get(0);
        }

        public static SelectionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        SelectionType(int i) {
            this.value = i;
        }
    }

    public static final class SelectionItem extends GeneratedMessageV3 implements SelectionItemOrBuilder {
        public static final int BOTTOM_TEXT_FIELD_NUMBER = 5;
        private static final SelectionItem DEFAULT_INSTANCE = new SelectionItem();
        private static final Parser<SelectionItem> PARSER = new AbstractParser<SelectionItem>() { // from class: com.google.apps.card.v1.SelectionInput.SelectionItem.1
            @Override // com.google.protobuf.Parser
            public SelectionItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SelectionItem.newBuilder();
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
        public static final int SELECTED_FIELD_NUMBER = 3;
        public static final int START_ICON_URI_FIELD_NUMBER = 4;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object bottomText_;
        private byte memoizedIsInitialized;
        private boolean selected_;
        private volatile Object startIconUri_;
        private volatile Object text_;
        private volatile Object value_;

        private SelectionItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.text_ = "";
            this.value_ = "";
            this.selected_ = false;
            this.startIconUri_ = "";
            this.bottomText_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private SelectionItem() {
            this.text_ = "";
            this.value_ = "";
            this.selected_ = false;
            this.startIconUri_ = "";
            this.bottomText_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
            this.value_ = "";
            this.startIconUri_ = "";
            this.bottomText_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SelectionItem();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_SelectionItem_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_SelectionItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectionItem.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.text_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public boolean getSelected() {
            return this.selected_;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public String getStartIconUri() {
            Object obj = this.startIconUri_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.startIconUri_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public ByteString getStartIconUriBytes() {
            Object obj = this.startIconUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.startIconUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public String getBottomText() {
            Object obj = this.bottomText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bottomText_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
        public ByteString getBottomTextBytes() {
            Object obj = this.bottomText_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bottomText_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
            }
            boolean z = this.selected_;
            if (z) {
                codedOutputStream.writeBool(3, z);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.startIconUri_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.startIconUri_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.bottomText_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.bottomText_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.value_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
            }
            boolean z = this.selected_;
            if (z) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, z);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.startIconUri_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.startIconUri_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.bottomText_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.bottomText_);
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
            if (!(obj instanceof SelectionItem)) {
                return super.equals(obj);
            }
            SelectionItem selectionItem = (SelectionItem) obj;
            return getText().equals(selectionItem.getText()) && getValue().equals(selectionItem.getValue()) && getSelected() == selectionItem.getSelected() && getStartIconUri().equals(selectionItem.getStartIconUri()) && getBottomText().equals(selectionItem.getBottomText()) && getUnknownFields().equals(selectionItem.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 37) + 3) * 53) + Internal.hashBoolean(getSelected())) * 37) + 4) * 53) + getStartIconUri().hashCode()) * 37) + 5) * 53) + getBottomText().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        public static SelectionItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SelectionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SelectionItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static SelectionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SelectionItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static SelectionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SelectionItem parseFrom(InputStream inputStream) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SelectionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectionItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SelectionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SelectionItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SelectionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SelectionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SelectionItem selectionItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectionItem);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectionItemOrBuilder {
            private int bitField0_;
            private Object bottomText_;
            private boolean selected_;
            private Object startIconUri_;
            private Object text_;
            private Object value_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_SelectionItem_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_SelectionItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectionItem.class, Builder.class);
            }

            private Builder() {
                this.text_ = "";
                this.value_ = "";
                this.startIconUri_ = "";
                this.bottomText_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.text_ = "";
                this.value_ = "";
                this.startIconUri_ = "";
                this.bottomText_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.text_ = "";
                this.value_ = "";
                this.selected_ = false;
                this.startIconUri_ = "";
                this.bottomText_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_SelectionItem_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SelectionItem getDefaultInstanceForType() {
                return SelectionItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectionItem build() {
                SelectionItem selectionItemBuildPartial = buildPartial();
                if (selectionItemBuildPartial.isInitialized()) {
                    return selectionItemBuildPartial;
                }
                throw newUninitializedMessageException((Message) selectionItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SelectionItem buildPartial() {
                SelectionItem selectionItem = new SelectionItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(selectionItem);
                }
                onBuilt();
                return selectionItem;
            }

            private void buildPartial0(SelectionItem selectionItem) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    selectionItem.text_ = this.text_;
                }
                if ((i & 2) != 0) {
                    selectionItem.value_ = this.value_;
                }
                if ((i & 4) != 0) {
                    selectionItem.selected_ = this.selected_;
                }
                if ((i & 8) != 0) {
                    selectionItem.startIconUri_ = this.startIconUri_;
                }
                if ((i & 16) != 0) {
                    selectionItem.bottomText_ = this.bottomText_;
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
                if (message instanceof SelectionItem) {
                    return mergeFrom((SelectionItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SelectionItem selectionItem) {
                if (selectionItem == SelectionItem.getDefaultInstance()) {
                    return this;
                }
                if (!selectionItem.getText().isEmpty()) {
                    this.text_ = selectionItem.text_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!selectionItem.getValue().isEmpty()) {
                    this.value_ = selectionItem.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (selectionItem.getSelected()) {
                    setSelected(selectionItem.getSelected());
                }
                if (!selectionItem.getStartIconUri().isEmpty()) {
                    this.startIconUri_ = selectionItem.startIconUri_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!selectionItem.getBottomText().isEmpty()) {
                    this.bottomText_ = selectionItem.bottomText_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(selectionItem.getUnknownFields());
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
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.selected_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.startIconUri_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.bottomText_ = codedInputStream.readStringRequireUtf8();
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

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.text_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
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
                this.text_ = SelectionItem.getDefaultInstance().getText();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                SelectionItem.checkByteStringIsUtf8(byteString);
                this.text_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
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
                this.value_ = SelectionItem.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                SelectionItem.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
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

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public String getStartIconUri() {
                Object obj = this.startIconUri_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.startIconUri_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public ByteString getStartIconUriBytes() {
                Object obj = this.startIconUri_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.startIconUri_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setStartIconUri(String str) {
                str.getClass();
                this.startIconUri_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearStartIconUri() {
                this.startIconUri_ = SelectionItem.getDefaultInstance().getStartIconUri();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setStartIconUriBytes(ByteString byteString) {
                byteString.getClass();
                SelectionItem.checkByteStringIsUtf8(byteString);
                this.startIconUri_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public String getBottomText() {
                Object obj = this.bottomText_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.bottomText_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.SelectionInput.SelectionItemOrBuilder
            public ByteString getBottomTextBytes() {
                Object obj = this.bottomText_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.bottomText_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setBottomText(String str) {
                str.getClass();
                this.bottomText_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearBottomText() {
                this.bottomText_ = SelectionItem.getDefaultInstance().getBottomText();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder setBottomTextBytes(ByteString byteString) {
                byteString.getClass();
                SelectionItem.checkByteStringIsUtf8(byteString);
                this.bottomText_ = byteString;
                this.bitField0_ |= 16;
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

        public static SelectionItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SelectionItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SelectionItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SelectionItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class PlatformDataSource extends GeneratedMessageV3 implements PlatformDataSourceOrBuilder {
        public static final int COMMON_DATA_SOURCE_FIELD_NUMBER = 1;
        private static final PlatformDataSource DEFAULT_INSTANCE = new PlatformDataSource();
        private static final Parser<PlatformDataSource> PARSER = new AbstractParser<PlatformDataSource>() { // from class: com.google.apps.card.v1.SelectionInput.PlatformDataSource.1
            @Override // com.google.protobuf.Parser
            public PlatformDataSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PlatformDataSource.newBuilder();
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
        private int dataSourceCase_;
        private Object dataSource_;
        private byte memoizedIsInitialized;

        private PlatformDataSource(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.dataSourceCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private PlatformDataSource() {
            this.dataSourceCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PlatformDataSource();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformDataSource.class, Builder.class);
        }

        public enum CommonDataSource implements ProtocolMessageEnum {
            UNKNOWN(0),
            USER(1),
            UNRECOGNIZED(-1);

            public static final int UNKNOWN_VALUE = 0;
            public static final int USER_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<CommonDataSource> internalValueMap = new Internal.EnumLiteMap<CommonDataSource>() { // from class: com.google.apps.card.v1.SelectionInput.PlatformDataSource.CommonDataSource.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CommonDataSource findValueByNumber(int i) {
                    return CommonDataSource.forNumber(i);
                }
            };
            private static final CommonDataSource[] VALUES = values();

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static CommonDataSource valueOf(int i) {
                return forNumber(i);
            }

            public static CommonDataSource forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return USER;
            }

            public static Internal.EnumLiteMap<CommonDataSource> internalGetValueMap() {
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
                return PlatformDataSource.getDescriptor().getEnumTypes().get(0);
            }

            public static CommonDataSource valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }

            CommonDataSource(int i) {
                this.value = i;
            }
        }

        public enum DataSourceCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            COMMON_DATA_SOURCE(1),
            DATASOURCE_NOT_SET(0);

            private final int value;

            DataSourceCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static DataSourceCase valueOf(int i) {
                return forNumber(i);
            }

            public static DataSourceCase forNumber(int i) {
                if (i == 0) {
                    return DATASOURCE_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return COMMON_DATA_SOURCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
        public DataSourceCase getDataSourceCase() {
            return DataSourceCase.forNumber(this.dataSourceCase_);
        }

        @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
        public boolean hasCommonDataSource() {
            return this.dataSourceCase_ == 1;
        }

        @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
        public int getCommonDataSourceValue() {
            if (this.dataSourceCase_ == 1) {
                return ((Integer) this.dataSource_).intValue();
            }
            return 0;
        }

        @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
        public CommonDataSource getCommonDataSource() {
            if (this.dataSourceCase_ == 1) {
                CommonDataSource commonDataSourceForNumber = CommonDataSource.forNumber(((Integer) this.dataSource_).intValue());
                return commonDataSourceForNumber == null ? CommonDataSource.UNRECOGNIZED : commonDataSourceForNumber;
            }
            return CommonDataSource.UNKNOWN;
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
            if (this.dataSourceCase_ == 1) {
                codedOutputStream.writeEnum(1, ((Integer) this.dataSource_).intValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.dataSourceCase_ == 1 ? CodedOutputStream.computeEnumSize(1, ((Integer) this.dataSource_).intValue()) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeEnumSize;
            return iComputeEnumSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlatformDataSource)) {
                return super.equals(obj);
            }
            PlatformDataSource platformDataSource = (PlatformDataSource) obj;
            if (getDataSourceCase().equals(platformDataSource.getDataSourceCase())) {
                return (this.dataSourceCase_ != 1 || getCommonDataSourceValue() == platformDataSource.getCommonDataSourceValue()) && getUnknownFields().equals(platformDataSource.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (this.dataSourceCase_ == 1) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCommonDataSourceValue();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static PlatformDataSource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static PlatformDataSource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PlatformDataSource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static PlatformDataSource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PlatformDataSource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static PlatformDataSource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PlatformDataSource parseFrom(InputStream inputStream) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PlatformDataSource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlatformDataSource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PlatformDataSource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlatformDataSource parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PlatformDataSource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlatformDataSource) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PlatformDataSource platformDataSource) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(platformDataSource);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlatformDataSourceOrBuilder {
            private int bitField0_;
            private int dataSourceCase_;
            private Object dataSource_;

            private void buildPartial0(PlatformDataSource platformDataSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_fieldAccessorTable.ensureFieldAccessorsInitialized(PlatformDataSource.class, Builder.class);
            }

            private Builder() {
                this.dataSourceCase_ = 0;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.dataSourceCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dataSourceCase_ = 0;
                this.dataSource_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_SelectionInput_PlatformDataSource_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PlatformDataSource getDefaultInstanceForType() {
                return PlatformDataSource.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlatformDataSource build() {
                PlatformDataSource platformDataSourceBuildPartial = buildPartial();
                if (platformDataSourceBuildPartial.isInitialized()) {
                    return platformDataSourceBuildPartial;
                }
                throw newUninitializedMessageException((Message) platformDataSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PlatformDataSource buildPartial() {
                PlatformDataSource platformDataSource = new PlatformDataSource(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(platformDataSource);
                }
                buildPartialOneofs(platformDataSource);
                onBuilt();
                return platformDataSource;
            }

            private void buildPartialOneofs(PlatformDataSource platformDataSource) {
                platformDataSource.dataSourceCase_ = this.dataSourceCase_;
                platformDataSource.dataSource_ = this.dataSource_;
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
                if (message instanceof PlatformDataSource) {
                    return mergeFrom((PlatformDataSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PlatformDataSource platformDataSource) {
                if (platformDataSource == PlatformDataSource.getDefaultInstance()) {
                    return this;
                }
                if (AnonymousClass2.$SwitchMap$com$google$apps$card$v1$SelectionInput$PlatformDataSource$DataSourceCase[platformDataSource.getDataSourceCase().ordinal()] == 1) {
                    setCommonDataSourceValue(platformDataSource.getCommonDataSourceValue());
                }
                mergeUnknownFields(platformDataSource.getUnknownFields());
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
                                if (tag == 8) {
                                    int i = codedInputStream.readEnum();
                                    this.dataSourceCase_ = 1;
                                    this.dataSource_ = Integer.valueOf(i);
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

            @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
            public DataSourceCase getDataSourceCase() {
                return DataSourceCase.forNumber(this.dataSourceCase_);
            }

            public Builder clearDataSource() {
                this.dataSourceCase_ = 0;
                this.dataSource_ = null;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
            public boolean hasCommonDataSource() {
                return this.dataSourceCase_ == 1;
            }

            @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
            public int getCommonDataSourceValue() {
                if (this.dataSourceCase_ == 1) {
                    return ((Integer) this.dataSource_).intValue();
                }
                return 0;
            }

            public Builder setCommonDataSourceValue(int i) {
                this.dataSourceCase_ = 1;
                this.dataSource_ = Integer.valueOf(i);
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.SelectionInput.PlatformDataSourceOrBuilder
            public CommonDataSource getCommonDataSource() {
                if (this.dataSourceCase_ == 1) {
                    CommonDataSource commonDataSourceForNumber = CommonDataSource.forNumber(((Integer) this.dataSource_).intValue());
                    return commonDataSourceForNumber == null ? CommonDataSource.UNRECOGNIZED : commonDataSourceForNumber;
                }
                return CommonDataSource.UNKNOWN;
            }

            public Builder setCommonDataSource(CommonDataSource commonDataSource) {
                commonDataSource.getClass();
                this.dataSourceCase_ = 1;
                this.dataSource_ = Integer.valueOf(commonDataSource.getNumber());
                onChanged();
                return this;
            }

            public Builder clearCommonDataSource() {
                if (this.dataSourceCase_ == 1) {
                    this.dataSourceCase_ = 0;
                    this.dataSource_ = null;
                    onChanged();
                }
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

        public static PlatformDataSource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PlatformDataSource> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PlatformDataSource> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PlatformDataSource getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public enum MultiSelectDataSourceCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        EXTERNAL_DATA_SOURCE(8),
        PLATFORM_DATA_SOURCE(9),
        MULTISELECTDATASOURCE_NOT_SET(0);

        private final int value;

        MultiSelectDataSourceCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static MultiSelectDataSourceCase valueOf(int i) {
            return forNumber(i);
        }

        public static MultiSelectDataSourceCase forNumber(int i) {
            if (i == 0) {
                return MULTISELECTDATASOURCE_NOT_SET;
            }
            if (i == 8) {
                return EXTERNAL_DATA_SOURCE;
            }
            if (i != 9) {
                return null;
            }
            return PLATFORM_DATA_SOURCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public MultiSelectDataSourceCase getMultiSelectDataSourceCase() {
        return MultiSelectDataSourceCase.forNumber(this.multiSelectDataSourceCase_);
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public String getLabel() {
        Object obj = this.label_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.label_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public ByteString getLabelBytes() {
        Object obj = this.label_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.label_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public SelectionType getType() {
        SelectionType selectionTypeForNumber = SelectionType.forNumber(this.type_);
        return selectionTypeForNumber == null ? SelectionType.UNRECOGNIZED : selectionTypeForNumber;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public List<SelectionItem> getItemsList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public List<? extends SelectionItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public SelectionItem getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public SelectionItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public boolean hasOnChangeAction() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public Action getOnChangeAction() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public ActionOrBuilder getOnChangeActionOrBuilder() {
        Action action = this.onChangeAction_;
        return action == null ? Action.getDefaultInstance() : action;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public int getMultiSelectMaxSelectedItems() {
        return this.multiSelectMaxSelectedItems_;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public int getMultiSelectMinQueryLength() {
        return this.multiSelectMinQueryLength_;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public boolean hasExternalDataSource() {
        return this.multiSelectDataSourceCase_ == 8;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public Action getExternalDataSource() {
        if (this.multiSelectDataSourceCase_ == 8) {
            return (Action) this.multiSelectDataSource_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public ActionOrBuilder getExternalDataSourceOrBuilder() {
        if (this.multiSelectDataSourceCase_ == 8) {
            return (Action) this.multiSelectDataSource_;
        }
        return Action.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public boolean hasPlatformDataSource() {
        return this.multiSelectDataSourceCase_ == 9;
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public PlatformDataSource getPlatformDataSource() {
        if (this.multiSelectDataSourceCase_ == 9) {
            return (PlatformDataSource) this.multiSelectDataSource_;
        }
        return PlatformDataSource.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.SelectionInputOrBuilder
    public PlatformDataSourceOrBuilder getPlatformDataSourceOrBuilder() {
        if (this.multiSelectDataSourceCase_ == 9) {
            return (PlatformDataSource) this.multiSelectDataSource_;
        }
        return PlatformDataSource.getDefaultInstance();
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
        if (this.type_ != SelectionType.CHECK_BOX.getNumber()) {
            codedOutputStream.writeEnum(3, this.type_);
        }
        for (int i = 0; i < this.items_.size(); i++) {
            codedOutputStream.writeMessage(4, this.items_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(5, getOnChangeAction());
        }
        int i2 = this.multiSelectMaxSelectedItems_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(6, i2);
        }
        int i3 = this.multiSelectMinQueryLength_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(7, i3);
        }
        if (this.multiSelectDataSourceCase_ == 8) {
            codedOutputStream.writeMessage(8, (Action) this.multiSelectDataSource_);
        }
        if (this.multiSelectDataSourceCase_ == 9) {
            codedOutputStream.writeMessage(9, (PlatformDataSource) this.multiSelectDataSource_);
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
        if (this.type_ != SelectionType.CHECK_BOX.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.type_);
        }
        for (int i2 = 0; i2 < this.items_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.items_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getOnChangeAction());
        }
        int i3 = this.multiSelectMaxSelectedItems_;
        if (i3 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(6, i3);
        }
        int i4 = this.multiSelectMinQueryLength_;
        if (i4 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(7, i4);
        }
        if (this.multiSelectDataSourceCase_ == 8) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, (Action) this.multiSelectDataSource_);
        }
        if (this.multiSelectDataSourceCase_ == 9) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(9, (PlatformDataSource) this.multiSelectDataSource_);
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
        if (!(obj instanceof SelectionInput)) {
            return super.equals(obj);
        }
        SelectionInput selectionInput = (SelectionInput) obj;
        if (!getName().equals(selectionInput.getName()) || !getLabel().equals(selectionInput.getLabel()) || this.type_ != selectionInput.type_ || !getItemsList().equals(selectionInput.getItemsList()) || hasOnChangeAction() != selectionInput.hasOnChangeAction()) {
            return false;
        }
        if ((hasOnChangeAction() && !getOnChangeAction().equals(selectionInput.getOnChangeAction())) || getMultiSelectMaxSelectedItems() != selectionInput.getMultiSelectMaxSelectedItems() || getMultiSelectMinQueryLength() != selectionInput.getMultiSelectMinQueryLength() || !getMultiSelectDataSourceCase().equals(selectionInput.getMultiSelectDataSourceCase())) {
            return false;
        }
        int i = this.multiSelectDataSourceCase_;
        if (i == 8) {
            if (!getExternalDataSource().equals(selectionInput.getExternalDataSource())) {
                return false;
            }
        } else if (i == 9 && !getPlatformDataSource().equals(selectionInput.getPlatformDataSource())) {
            return false;
        }
        return getUnknownFields().equals(selectionInput.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getLabel().hashCode()) * 37) + 3) * 53) + this.type_;
        if (getItemsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getItemsList().hashCode();
        }
        if (hasOnChangeAction()) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getOnChangeAction().hashCode();
        }
        int multiSelectMaxSelectedItems = (((((((iHashCode2 * 37) + 6) * 53) + getMultiSelectMaxSelectedItems()) * 37) + 7) * 53) + getMultiSelectMinQueryLength();
        int i2 = this.multiSelectDataSourceCase_;
        if (i2 == 8) {
            i = ((multiSelectMaxSelectedItems * 37) + 8) * 53;
            iHashCode = getExternalDataSource().hashCode();
        } else {
            if (i2 == 9) {
                i = ((multiSelectMaxSelectedItems * 37) + 9) * 53;
                iHashCode = getPlatformDataSource().hashCode();
            }
            int iHashCode3 = (multiSelectMaxSelectedItems * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        multiSelectMaxSelectedItems = i + iHashCode;
        int iHashCode32 = (multiSelectMaxSelectedItems * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    public static SelectionInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SelectionInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SelectionInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SelectionInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SelectionInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SelectionInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SelectionInput parseFrom(InputStream inputStream) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SelectionInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SelectionInput parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SelectionInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SelectionInput parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SelectionInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SelectionInput) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SelectionInput selectionInput) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(selectionInput);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectionInputOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> externalDataSourceBuilder_;
        private RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> itemsBuilder_;
        private List<SelectionItem> items_;
        private Object label_;
        private int multiSelectDataSourceCase_;
        private Object multiSelectDataSource_;
        private int multiSelectMaxSelectedItems_;
        private int multiSelectMinQueryLength_;
        private Object name_;
        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> onChangeActionBuilder_;
        private Action onChangeAction_;
        private SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> platformDataSourceBuilder_;
        private int type_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectionInput.class, Builder.class);
        }

        private Builder() {
            this.multiSelectDataSourceCase_ = 0;
            this.name_ = "";
            this.label_ = "";
            this.type_ = 0;
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.multiSelectDataSourceCase_ = 0;
            this.name_ = "";
            this.label_ = "";
            this.type_ = 0;
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SelectionInput.alwaysUseFieldBuilders) {
                getItemsFieldBuilder();
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
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
            } else {
                this.items_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -9;
            this.onChangeAction_ = null;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.onChangeActionBuilder_ = null;
            }
            this.multiSelectMaxSelectedItems_ = 0;
            this.multiSelectMinQueryLength_ = 0;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV32 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.clear();
            }
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV33 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.clear();
            }
            this.multiSelectDataSourceCase_ = 0;
            this.multiSelectDataSource_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_SelectionInput_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SelectionInput getDefaultInstanceForType() {
            return SelectionInput.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SelectionInput build() {
            SelectionInput selectionInputBuildPartial = buildPartial();
            if (selectionInputBuildPartial.isInitialized()) {
                return selectionInputBuildPartial;
            }
            throw newUninitializedMessageException((Message) selectionInputBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SelectionInput buildPartial() {
            SelectionInput selectionInput = new SelectionInput(this);
            buildPartialRepeatedFields(selectionInput);
            if (this.bitField0_ != 0) {
                buildPartial0(selectionInput);
            }
            buildPartialOneofs(selectionInput);
            onBuilt();
            return selectionInput;
        }

        private void buildPartialRepeatedFields(SelectionInput selectionInput) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                selectionInput.items_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.items_ = Collections.unmodifiableList(this.items_);
                this.bitField0_ &= -9;
            }
            selectionInput.items_ = this.items_;
        }

        private void buildPartial0(SelectionInput selectionInput) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                selectionInput.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                selectionInput.label_ = this.label_;
            }
            if ((i2 & 4) != 0) {
                selectionInput.type_ = this.type_;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
                selectionInput.onChangeAction_ = singleFieldBuilderV3 == null ? this.onChangeAction_ : (Action) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 32) != 0) {
                selectionInput.multiSelectMaxSelectedItems_ = this.multiSelectMaxSelectedItems_;
            }
            if ((i2 & 64) != 0) {
                selectionInput.multiSelectMinQueryLength_ = this.multiSelectMinQueryLength_;
            }
            SelectionInput.access$2876(selectionInput, i);
        }

        private void buildPartialOneofs(SelectionInput selectionInput) {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV32;
            selectionInput.multiSelectDataSourceCase_ = this.multiSelectDataSourceCase_;
            selectionInput.multiSelectDataSource_ = this.multiSelectDataSource_;
            if (this.multiSelectDataSourceCase_ == 8 && (singleFieldBuilderV32 = this.externalDataSourceBuilder_) != null) {
                selectionInput.multiSelectDataSource_ = singleFieldBuilderV32.build();
            }
            if (this.multiSelectDataSourceCase_ != 9 || (singleFieldBuilderV3 = this.platformDataSourceBuilder_) == null) {
                return;
            }
            selectionInput.multiSelectDataSource_ = singleFieldBuilderV3.build();
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
            if (message instanceof SelectionInput) {
                return mergeFrom((SelectionInput) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SelectionInput selectionInput) {
            if (selectionInput == SelectionInput.getDefaultInstance()) {
                return this;
            }
            if (!selectionInput.getName().isEmpty()) {
                this.name_ = selectionInput.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!selectionInput.getLabel().isEmpty()) {
                this.label_ = selectionInput.label_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (selectionInput.type_ != 0) {
                setTypeValue(selectionInput.getTypeValue());
            }
            if (this.itemsBuilder_ == null) {
                if (!selectionInput.items_.isEmpty()) {
                    if (this.items_.isEmpty()) {
                        this.items_ = selectionInput.items_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureItemsIsMutable();
                        this.items_.addAll(selectionInput.items_);
                    }
                    onChanged();
                }
            } else if (!selectionInput.items_.isEmpty()) {
                if (!this.itemsBuilder_.isEmpty()) {
                    this.itemsBuilder_.addAllMessages(selectionInput.items_);
                } else {
                    this.itemsBuilder_.dispose();
                    this.itemsBuilder_ = null;
                    this.items_ = selectionInput.items_;
                    this.bitField0_ &= -9;
                    this.itemsBuilder_ = SelectionInput.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                }
            }
            if (selectionInput.hasOnChangeAction()) {
                mergeOnChangeAction(selectionInput.getOnChangeAction());
            }
            if (selectionInput.getMultiSelectMaxSelectedItems() != 0) {
                setMultiSelectMaxSelectedItems(selectionInput.getMultiSelectMaxSelectedItems());
            }
            if (selectionInput.getMultiSelectMinQueryLength() != 0) {
                setMultiSelectMinQueryLength(selectionInput.getMultiSelectMinQueryLength());
            }
            int i = AnonymousClass2.$SwitchMap$com$google$apps$card$v1$SelectionInput$MultiSelectDataSourceCase[selectionInput.getMultiSelectDataSourceCase().ordinal()];
            if (i == 1) {
                mergeExternalDataSource(selectionInput.getExternalDataSource());
            } else if (i == 2) {
                mergePlatformDataSource(selectionInput.getPlatformDataSource());
            }
            mergeUnknownFields(selectionInput.getUnknownFields());
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
                            } else if (tag == 34) {
                                SelectionItem selectionItem = (SelectionItem) codedInputStream.readMessage(SelectionItem.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureItemsIsMutable();
                                    this.items_.add(selectionItem);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(selectionItem);
                                }
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getOnChangeActionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 48) {
                                this.multiSelectMaxSelectedItems_ = codedInputStream.readInt32();
                                this.bitField0_ |= 32;
                            } else if (tag == 56) {
                                this.multiSelectMinQueryLength_ = codedInputStream.readInt32();
                                this.bitField0_ |= 64;
                            } else if (tag == 66) {
                                codedInputStream.readMessage(getExternalDataSourceFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.multiSelectDataSourceCase_ = 8;
                            } else if (tag == 74) {
                                codedInputStream.readMessage(getPlatformDataSourceFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.multiSelectDataSourceCase_ = 9;
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

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public MultiSelectDataSourceCase getMultiSelectDataSourceCase() {
            return MultiSelectDataSourceCase.forNumber(this.multiSelectDataSourceCase_);
        }

        public Builder clearMultiSelectDataSource() {
            this.multiSelectDataSourceCase_ = 0;
            this.multiSelectDataSource_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
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
            this.name_ = SelectionInput.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            SelectionInput.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public String getLabel() {
            Object obj = this.label_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.label_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
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
            this.label_ = SelectionInput.getDefaultInstance().getLabel();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            byteString.getClass();
            SelectionInput.checkByteStringIsUtf8(byteString);
            this.label_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public SelectionType getType() {
            SelectionType selectionTypeForNumber = SelectionType.forNumber(this.type_);
            return selectionTypeForNumber == null ? SelectionType.UNRECOGNIZED : selectionTypeForNumber;
        }

        public Builder setType(SelectionType selectionType) {
            selectionType.getClass();
            this.bitField0_ |= 4;
            this.type_ = selectionType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -5;
            this.type_ = 0;
            onChanged();
            return this;
        }

        private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.items_ = new ArrayList(this.items_);
                this.bitField0_ |= 8;
            }
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public List<SelectionItem> getItemsList() {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.items_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public int getItemsCount() {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public SelectionItem getItems(int i) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (SelectionItem) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setItems(int i, SelectionItem selectionItem) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                selectionItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, selectionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, selectionItem);
            }
            return this;
        }

        public Builder setItems(int i, SelectionItem.Builder builder) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addItems(SelectionItem selectionItem) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                selectionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(selectionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(selectionItem);
            }
            return this;
        }

        public Builder addItems(int i, SelectionItem selectionItem) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                selectionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, selectionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, selectionItem);
            }
            return this;
        }

        public Builder addItems(SelectionItem.Builder builder) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addItems(int i, SelectionItem.Builder builder) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllItems(Iterable<? extends SelectionItem> iterable) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearItems() {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeItems(int i) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public SelectionItem.Builder getItemsBuilder(int i) {
            return (SelectionItem.Builder) getItemsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public SelectionItemOrBuilder getItemsOrBuilder(int i) {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (SelectionItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public List<? extends SelectionItemOrBuilder> getItemsOrBuilderList() {
            RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.items_);
        }

        public SelectionItem.Builder addItemsBuilder() {
            return (SelectionItem.Builder) getItemsFieldBuilder().addBuilder(SelectionItem.getDefaultInstance());
        }

        public SelectionItem.Builder addItemsBuilder(int i) {
            return (SelectionItem.Builder) getItemsFieldBuilder().addBuilder(i, SelectionItem.getDefaultInstance());
        }

        public List<SelectionItem.Builder> getItemsBuilderList() {
            return getItemsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<SelectionItem, SelectionItem.Builder, SelectionItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
                this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.items_ = null;
            }
            return this.itemsBuilder_;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public boolean hasOnChangeAction() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
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
            this.bitField0_ |= 16;
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
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeOnChangeAction(Action action) {
            Action action2;
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.onChangeActionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (action2 = this.onChangeAction_) != null && action2 != Action.getDefaultInstance()) {
                    getOnChangeActionBuilder().mergeFrom(action);
                } else {
                    this.onChangeAction_ = action;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(action);
            }
            if (this.onChangeAction_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearOnChangeAction() {
            this.bitField0_ &= -17;
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
            this.bitField0_ |= 16;
            onChanged();
            return (Action.Builder) getOnChangeActionFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
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

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public int getMultiSelectMaxSelectedItems() {
            return this.multiSelectMaxSelectedItems_;
        }

        public Builder setMultiSelectMaxSelectedItems(int i) {
            this.multiSelectMaxSelectedItems_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearMultiSelectMaxSelectedItems() {
            this.bitField0_ &= -33;
            this.multiSelectMaxSelectedItems_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public int getMultiSelectMinQueryLength() {
            return this.multiSelectMinQueryLength_;
        }

        public Builder setMultiSelectMinQueryLength(int i) {
            this.multiSelectMinQueryLength_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder clearMultiSelectMinQueryLength() {
            this.bitField0_ &= -65;
            this.multiSelectMinQueryLength_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public boolean hasExternalDataSource() {
            return this.multiSelectDataSourceCase_ == 8;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public Action getExternalDataSource() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 8) {
                    return (Action) this.multiSelectDataSource_;
                }
                return Action.getDefaultInstance();
            }
            if (this.multiSelectDataSourceCase_ == 8) {
                return (Action) singleFieldBuilderV3.getMessage();
            }
            return Action.getDefaultInstance();
        }

        public Builder setExternalDataSource(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                action.getClass();
                this.multiSelectDataSource_ = action;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.multiSelectDataSourceCase_ = 8;
            return this;
        }

        public Builder setExternalDataSource(Action.Builder builder) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.multiSelectDataSource_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.multiSelectDataSourceCase_ = 8;
            return this;
        }

        public Builder mergeExternalDataSource(Action action) {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 8 && this.multiSelectDataSource_ != Action.getDefaultInstance()) {
                    this.multiSelectDataSource_ = Action.newBuilder((Action) this.multiSelectDataSource_).mergeFrom(action).buildPartial();
                } else {
                    this.multiSelectDataSource_ = action;
                }
                onChanged();
            } else if (this.multiSelectDataSourceCase_ == 8) {
                singleFieldBuilderV3.mergeFrom(action);
            } else {
                singleFieldBuilderV3.setMessage(action);
            }
            this.multiSelectDataSourceCase_ = 8;
            return this;
        }

        public Builder clearExternalDataSource() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3 = this.externalDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 8) {
                    this.multiSelectDataSourceCase_ = 0;
                    this.multiSelectDataSource_ = null;
                    onChanged();
                }
            } else {
                if (this.multiSelectDataSourceCase_ == 8) {
                    this.multiSelectDataSourceCase_ = 0;
                    this.multiSelectDataSource_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Action.Builder getExternalDataSourceBuilder() {
            return (Action.Builder) getExternalDataSourceFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public ActionOrBuilder getExternalDataSourceOrBuilder() {
            SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> singleFieldBuilderV3;
            int i = this.multiSelectDataSourceCase_;
            if (i == 8 && (singleFieldBuilderV3 = this.externalDataSourceBuilder_) != null) {
                return (ActionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 8) {
                return (Action) this.multiSelectDataSource_;
            }
            return Action.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Action, Action.Builder, ActionOrBuilder> getExternalDataSourceFieldBuilder() {
            if (this.externalDataSourceBuilder_ == null) {
                if (this.multiSelectDataSourceCase_ != 8) {
                    this.multiSelectDataSource_ = Action.getDefaultInstance();
                }
                this.externalDataSourceBuilder_ = new SingleFieldBuilderV3<>((Action) this.multiSelectDataSource_, getParentForChildren(), isClean());
                this.multiSelectDataSource_ = null;
            }
            this.multiSelectDataSourceCase_ = 8;
            onChanged();
            return this.externalDataSourceBuilder_;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public boolean hasPlatformDataSource() {
            return this.multiSelectDataSourceCase_ == 9;
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public PlatformDataSource getPlatformDataSource() {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 9) {
                    return (PlatformDataSource) this.multiSelectDataSource_;
                }
                return PlatformDataSource.getDefaultInstance();
            }
            if (this.multiSelectDataSourceCase_ == 9) {
                return (PlatformDataSource) singleFieldBuilderV3.getMessage();
            }
            return PlatformDataSource.getDefaultInstance();
        }

        public Builder setPlatformDataSource(PlatformDataSource platformDataSource) {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                platformDataSource.getClass();
                this.multiSelectDataSource_ = platformDataSource;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(platformDataSource);
            }
            this.multiSelectDataSourceCase_ = 9;
            return this;
        }

        public Builder setPlatformDataSource(PlatformDataSource.Builder builder) {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.multiSelectDataSource_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.multiSelectDataSourceCase_ = 9;
            return this;
        }

        public Builder mergePlatformDataSource(PlatformDataSource platformDataSource) {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 9 && this.multiSelectDataSource_ != PlatformDataSource.getDefaultInstance()) {
                    this.multiSelectDataSource_ = PlatformDataSource.newBuilder((PlatformDataSource) this.multiSelectDataSource_).mergeFrom(platformDataSource).buildPartial();
                } else {
                    this.multiSelectDataSource_ = platformDataSource;
                }
                onChanged();
            } else if (this.multiSelectDataSourceCase_ == 9) {
                singleFieldBuilderV3.mergeFrom(platformDataSource);
            } else {
                singleFieldBuilderV3.setMessage(platformDataSource);
            }
            this.multiSelectDataSourceCase_ = 9;
            return this;
        }

        public Builder clearPlatformDataSource() {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3 = this.platformDataSourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.multiSelectDataSourceCase_ == 9) {
                    this.multiSelectDataSourceCase_ = 0;
                    this.multiSelectDataSource_ = null;
                    onChanged();
                }
            } else {
                if (this.multiSelectDataSourceCase_ == 9) {
                    this.multiSelectDataSourceCase_ = 0;
                    this.multiSelectDataSource_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public PlatformDataSource.Builder getPlatformDataSourceBuilder() {
            return (PlatformDataSource.Builder) getPlatformDataSourceFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.SelectionInputOrBuilder
        public PlatformDataSourceOrBuilder getPlatformDataSourceOrBuilder() {
            SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> singleFieldBuilderV3;
            int i = this.multiSelectDataSourceCase_;
            if (i == 9 && (singleFieldBuilderV3 = this.platformDataSourceBuilder_) != null) {
                return (PlatformDataSourceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 9) {
                return (PlatformDataSource) this.multiSelectDataSource_;
            }
            return PlatformDataSource.getDefaultInstance();
        }

        private SingleFieldBuilderV3<PlatformDataSource, PlatformDataSource.Builder, PlatformDataSourceOrBuilder> getPlatformDataSourceFieldBuilder() {
            if (this.platformDataSourceBuilder_ == null) {
                if (this.multiSelectDataSourceCase_ != 9) {
                    this.multiSelectDataSource_ = PlatformDataSource.getDefaultInstance();
                }
                this.platformDataSourceBuilder_ = new SingleFieldBuilderV3<>((PlatformDataSource) this.multiSelectDataSource_, getParentForChildren(), isClean());
                this.multiSelectDataSource_ = null;
            }
            this.multiSelectDataSourceCase_ = 9;
            onChanged();
            return this.platformDataSourceBuilder_;
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

    /* JADX INFO: renamed from: com.google.apps.card.v1.SelectionInput$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$SelectionInput$MultiSelectDataSourceCase;
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$SelectionInput$PlatformDataSource$DataSourceCase;

        static {
            int[] iArr = new int[MultiSelectDataSourceCase.values().length];
            $SwitchMap$com$google$apps$card$v1$SelectionInput$MultiSelectDataSourceCase = iArr;
            try {
                iArr[MultiSelectDataSourceCase.EXTERNAL_DATA_SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$SelectionInput$MultiSelectDataSourceCase[MultiSelectDataSourceCase.PLATFORM_DATA_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$SelectionInput$MultiSelectDataSourceCase[MultiSelectDataSourceCase.MULTISELECTDATASOURCE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PlatformDataSource.DataSourceCase.values().length];
            $SwitchMap$com$google$apps$card$v1$SelectionInput$PlatformDataSource$DataSourceCase = iArr2;
            try {
                iArr2[PlatformDataSource.DataSourceCase.COMMON_DATA_SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$SelectionInput$PlatformDataSource$DataSourceCase[PlatformDataSource.DataSourceCase.DATASOURCE_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static SelectionInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SelectionInput> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SelectionInput> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SelectionInput getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
