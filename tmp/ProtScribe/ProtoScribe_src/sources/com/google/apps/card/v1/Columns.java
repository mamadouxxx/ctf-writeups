package com.google.apps.card.v1;

import com.google.apps.card.v1.ButtonList;
import com.google.apps.card.v1.DateTimePicker;
import com.google.apps.card.v1.DecoratedText;
import com.google.apps.card.v1.Image;
import com.google.apps.card.v1.SelectionInput;
import com.google.apps.card.v1.TextInput;
import com.google.apps.card.v1.TextParagraph;
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
public final class Columns extends GeneratedMessageV3 implements ColumnsOrBuilder {
    public static final int COLUMN_ITEMS_FIELD_NUMBER = 2;
    private static final Columns DEFAULT_INSTANCE = new Columns();
    private static final Parser<Columns> PARSER = new AbstractParser<Columns>() { // from class: com.google.apps.card.v1.Columns.1
        @Override // com.google.protobuf.Parser
        public Columns parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Columns.newBuilder();
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
    private List<Column> columnItems_;
    private byte memoizedIsInitialized;

    public interface ColumnOrBuilder extends MessageOrBuilder {
        Widget.HorizontalAlignment getHorizontalAlignment();

        int getHorizontalAlignmentValue();

        Column.HorizontalSizeStyle getHorizontalSizeStyle();

        int getHorizontalSizeStyleValue();

        Column.VerticalAlignment getVerticalAlignment();

        int getVerticalAlignmentValue();

        Column.Widgets getWidgets(int i);

        int getWidgetsCount();

        List<Column.Widgets> getWidgetsList();

        Column.WidgetsOrBuilder getWidgetsOrBuilder(int i);

        List<? extends Column.WidgetsOrBuilder> getWidgetsOrBuilderList();
    }

    private Columns(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Columns() {
        this.memoizedIsInitialized = (byte) -1;
        this.columnItems_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Columns();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Columns_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Columns_fieldAccessorTable.ensureFieldAccessorsInitialized(Columns.class, Builder.class);
    }

    public static final class Column extends GeneratedMessageV3 implements ColumnOrBuilder {
        public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 2;
        public static final int HORIZONTAL_SIZE_STYLE_FIELD_NUMBER = 1;
        public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 3;
        public static final int WIDGETS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int horizontalAlignment_;
        private int horizontalSizeStyle_;
        private byte memoizedIsInitialized;
        private int verticalAlignment_;
        private List<Widgets> widgets_;
        private static final Column DEFAULT_INSTANCE = new Column();
        private static final Parser<Column> PARSER = new AbstractParser<Column>() { // from class: com.google.apps.card.v1.Columns.Column.1
            @Override // com.google.protobuf.Parser
            public Column parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Column.newBuilder();
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

        public interface WidgetsOrBuilder extends MessageOrBuilder {
            ButtonList getButtonList();

            ButtonListOrBuilder getButtonListOrBuilder();

            Widgets.DataCase getDataCase();

            DateTimePicker getDateTimePicker();

            DateTimePickerOrBuilder getDateTimePickerOrBuilder();

            DecoratedText getDecoratedText();

            DecoratedTextOrBuilder getDecoratedTextOrBuilder();

            Image getImage();

            ImageOrBuilder getImageOrBuilder();

            SelectionInput getSelectionInput();

            SelectionInputOrBuilder getSelectionInputOrBuilder();

            TextInput getTextInput();

            TextInputOrBuilder getTextInputOrBuilder();

            TextParagraph getTextParagraph();

            TextParagraphOrBuilder getTextParagraphOrBuilder();

            boolean hasButtonList();

            boolean hasDateTimePicker();

            boolean hasDecoratedText();

            boolean hasImage();

            boolean hasSelectionInput();

            boolean hasTextInput();

            boolean hasTextParagraph();
        }

        private Column(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.horizontalSizeStyle_ = 0;
            this.horizontalAlignment_ = 0;
            this.verticalAlignment_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Column() {
            this.memoizedIsInitialized = (byte) -1;
            this.horizontalSizeStyle_ = 0;
            this.horizontalAlignment_ = 0;
            this.verticalAlignment_ = 0;
            this.widgets_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Column();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Columns_Column_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Columns_Column_fieldAccessorTable.ensureFieldAccessorsInitialized(Column.class, Builder.class);
        }

        public enum HorizontalSizeStyle implements ProtocolMessageEnum {
            HORIZONTAL_SIZE_STYLE_UNSPECIFIED(0),
            FILL_AVAILABLE_SPACE(1),
            FILL_MINIMUM_SPACE(2),
            UNRECOGNIZED(-1);

            public static final int FILL_AVAILABLE_SPACE_VALUE = 1;
            public static final int FILL_MINIMUM_SPACE_VALUE = 2;
            public static final int HORIZONTAL_SIZE_STYLE_UNSPECIFIED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<HorizontalSizeStyle> internalValueMap = new Internal.EnumLiteMap<HorizontalSizeStyle>() { // from class: com.google.apps.card.v1.Columns.Column.HorizontalSizeStyle.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public HorizontalSizeStyle findValueByNumber(int i) {
                    return HorizontalSizeStyle.forNumber(i);
                }
            };
            private static final HorizontalSizeStyle[] VALUES = values();

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static HorizontalSizeStyle valueOf(int i) {
                return forNumber(i);
            }

            public static HorizontalSizeStyle forNumber(int i) {
                if (i == 0) {
                    return HORIZONTAL_SIZE_STYLE_UNSPECIFIED;
                }
                if (i == 1) {
                    return FILL_AVAILABLE_SPACE;
                }
                if (i != 2) {
                    return null;
                }
                return FILL_MINIMUM_SPACE;
            }

            public static Internal.EnumLiteMap<HorizontalSizeStyle> internalGetValueMap() {
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
                return Column.getDescriptor().getEnumTypes().get(0);
            }

            public static HorizontalSizeStyle valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }

            HorizontalSizeStyle(int i) {
                this.value = i;
            }
        }

        public enum VerticalAlignment implements ProtocolMessageEnum {
            VERTICAL_ALIGNMENT_UNSPECIFIED(0),
            CENTER(1),
            TOP(2),
            BOTTOM(3),
            UNRECOGNIZED(-1);

            public static final int BOTTOM_VALUE = 3;
            public static final int CENTER_VALUE = 1;
            public static final int TOP_VALUE = 2;
            public static final int VERTICAL_ALIGNMENT_UNSPECIFIED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<VerticalAlignment> internalValueMap = new Internal.EnumLiteMap<VerticalAlignment>() { // from class: com.google.apps.card.v1.Columns.Column.VerticalAlignment.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public VerticalAlignment findValueByNumber(int i) {
                    return VerticalAlignment.forNumber(i);
                }
            };
            private static final VerticalAlignment[] VALUES = values();

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static VerticalAlignment valueOf(int i) {
                return forNumber(i);
            }

            public static VerticalAlignment forNumber(int i) {
                if (i == 0) {
                    return VERTICAL_ALIGNMENT_UNSPECIFIED;
                }
                if (i == 1) {
                    return CENTER;
                }
                if (i == 2) {
                    return TOP;
                }
                if (i != 3) {
                    return null;
                }
                return BOTTOM;
            }

            public static Internal.EnumLiteMap<VerticalAlignment> internalGetValueMap() {
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
                return Column.getDescriptor().getEnumTypes().get(1);
            }

            public static VerticalAlignment valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }

            VerticalAlignment(int i) {
                this.value = i;
            }
        }

        public static final class Widgets extends GeneratedMessageV3 implements WidgetsOrBuilder {
            public static final int BUTTON_LIST_FIELD_NUMBER = 4;
            public static final int DATE_TIME_PICKER_FIELD_NUMBER = 7;
            public static final int DECORATED_TEXT_FIELD_NUMBER = 3;
            public static final int IMAGE_FIELD_NUMBER = 2;
            public static final int SELECTION_INPUT_FIELD_NUMBER = 6;
            public static final int TEXT_INPUT_FIELD_NUMBER = 5;
            public static final int TEXT_PARAGRAPH_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int dataCase_;
            private Object data_;
            private byte memoizedIsInitialized;
            private static final Widgets DEFAULT_INSTANCE = new Widgets();
            private static final Parser<Widgets> PARSER = new AbstractParser<Widgets>() { // from class: com.google.apps.card.v1.Columns.Column.Widgets.1
                @Override // com.google.protobuf.Parser
                public Widgets parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Widgets.newBuilder();
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

            private Widgets(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.dataCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            private Widgets() {
                this.dataCase_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Widgets();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Columns_Column_Widgets_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Columns_Column_Widgets_fieldAccessorTable.ensureFieldAccessorsInitialized(Widgets.class, Builder.class);
            }

            public enum DataCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
                TEXT_PARAGRAPH(1),
                IMAGE(2),
                DECORATED_TEXT(3),
                BUTTON_LIST(4),
                TEXT_INPUT(5),
                SELECTION_INPUT(6),
                DATE_TIME_PICKER(7),
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
                    switch (i) {
                        case 0:
                            return DATA_NOT_SET;
                        case 1:
                            return TEXT_PARAGRAPH;
                        case 2:
                            return IMAGE;
                        case 3:
                            return DECORATED_TEXT;
                        case 4:
                            return BUTTON_LIST;
                        case 5:
                            return TEXT_INPUT;
                        case 6:
                            return SELECTION_INPUT;
                        case 7:
                            return DATE_TIME_PICKER;
                        default:
                            return null;
                    }
                }

                @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
                public int getNumber() {
                    return this.value;
                }
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public DataCase getDataCase() {
                return DataCase.forNumber(this.dataCase_);
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasTextParagraph() {
                return this.dataCase_ == 1;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public TextParagraph getTextParagraph() {
                if (this.dataCase_ == 1) {
                    return (TextParagraph) this.data_;
                }
                return TextParagraph.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public TextParagraphOrBuilder getTextParagraphOrBuilder() {
                if (this.dataCase_ == 1) {
                    return (TextParagraph) this.data_;
                }
                return TextParagraph.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasImage() {
                return this.dataCase_ == 2;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public Image getImage() {
                if (this.dataCase_ == 2) {
                    return (Image) this.data_;
                }
                return Image.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public ImageOrBuilder getImageOrBuilder() {
                if (this.dataCase_ == 2) {
                    return (Image) this.data_;
                }
                return Image.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasDecoratedText() {
                return this.dataCase_ == 3;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public DecoratedText getDecoratedText() {
                if (this.dataCase_ == 3) {
                    return (DecoratedText) this.data_;
                }
                return DecoratedText.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public DecoratedTextOrBuilder getDecoratedTextOrBuilder() {
                if (this.dataCase_ == 3) {
                    return (DecoratedText) this.data_;
                }
                return DecoratedText.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasButtonList() {
                return this.dataCase_ == 4;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public ButtonList getButtonList() {
                if (this.dataCase_ == 4) {
                    return (ButtonList) this.data_;
                }
                return ButtonList.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public ButtonListOrBuilder getButtonListOrBuilder() {
                if (this.dataCase_ == 4) {
                    return (ButtonList) this.data_;
                }
                return ButtonList.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasTextInput() {
                return this.dataCase_ == 5;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public TextInput getTextInput() {
                if (this.dataCase_ == 5) {
                    return (TextInput) this.data_;
                }
                return TextInput.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public TextInputOrBuilder getTextInputOrBuilder() {
                if (this.dataCase_ == 5) {
                    return (TextInput) this.data_;
                }
                return TextInput.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasSelectionInput() {
                return this.dataCase_ == 6;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public SelectionInput getSelectionInput() {
                if (this.dataCase_ == 6) {
                    return (SelectionInput) this.data_;
                }
                return SelectionInput.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public SelectionInputOrBuilder getSelectionInputOrBuilder() {
                if (this.dataCase_ == 6) {
                    return (SelectionInput) this.data_;
                }
                return SelectionInput.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public boolean hasDateTimePicker() {
                return this.dataCase_ == 7;
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public DateTimePicker getDateTimePicker() {
                if (this.dataCase_ == 7) {
                    return (DateTimePicker) this.data_;
                }
                return DateTimePicker.getDefaultInstance();
            }

            @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
            public DateTimePickerOrBuilder getDateTimePickerOrBuilder() {
                if (this.dataCase_ == 7) {
                    return (DateTimePicker) this.data_;
                }
                return DateTimePicker.getDefaultInstance();
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
                    codedOutputStream.writeMessage(1, (TextParagraph) this.data_);
                }
                if (this.dataCase_ == 2) {
                    codedOutputStream.writeMessage(2, (Image) this.data_);
                }
                if (this.dataCase_ == 3) {
                    codedOutputStream.writeMessage(3, (DecoratedText) this.data_);
                }
                if (this.dataCase_ == 4) {
                    codedOutputStream.writeMessage(4, (ButtonList) this.data_);
                }
                if (this.dataCase_ == 5) {
                    codedOutputStream.writeMessage(5, (TextInput) this.data_);
                }
                if (this.dataCase_ == 6) {
                    codedOutputStream.writeMessage(6, (SelectionInput) this.data_);
                }
                if (this.dataCase_ == 7) {
                    codedOutputStream.writeMessage(7, (DateTimePicker) this.data_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeMessageSize = this.dataCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (TextParagraph) this.data_) : 0;
                if (this.dataCase_ == 2) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (Image) this.data_);
                }
                if (this.dataCase_ == 3) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (DecoratedText) this.data_);
                }
                if (this.dataCase_ == 4) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (ButtonList) this.data_);
                }
                if (this.dataCase_ == 5) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (TextInput) this.data_);
                }
                if (this.dataCase_ == 6) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (SelectionInput) this.data_);
                }
                if (this.dataCase_ == 7) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(7, (DateTimePicker) this.data_);
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
                if (!(obj instanceof Widgets)) {
                    return super.equals(obj);
                }
                Widgets widgets = (Widgets) obj;
                if (!getDataCase().equals(widgets.getDataCase())) {
                    return false;
                }
                switch (this.dataCase_) {
                    case 1:
                        if (!getTextParagraph().equals(widgets.getTextParagraph())) {
                            return false;
                        }
                        break;
                    case 2:
                        if (!getImage().equals(widgets.getImage())) {
                            return false;
                        }
                        break;
                    case 3:
                        if (!getDecoratedText().equals(widgets.getDecoratedText())) {
                            return false;
                        }
                        break;
                    case 4:
                        if (!getButtonList().equals(widgets.getButtonList())) {
                            return false;
                        }
                        break;
                    case 5:
                        if (!getTextInput().equals(widgets.getTextInput())) {
                            return false;
                        }
                        break;
                    case 6:
                        if (!getSelectionInput().equals(widgets.getSelectionInput())) {
                            return false;
                        }
                        break;
                    case 7:
                        if (!getDateTimePicker().equals(widgets.getDateTimePicker())) {
                            return false;
                        }
                        break;
                }
                return getUnknownFields().equals(widgets.getUnknownFields());
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i;
                int iHashCode;
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int iHashCode2 = 779 + getDescriptor().hashCode();
                switch (this.dataCase_) {
                    case 1:
                        i = ((iHashCode2 * 37) + 1) * 53;
                        iHashCode = getTextParagraph().hashCode();
                        break;
                    case 2:
                        i = ((iHashCode2 * 37) + 2) * 53;
                        iHashCode = getImage().hashCode();
                        break;
                    case 3:
                        i = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getDecoratedText().hashCode();
                        break;
                    case 4:
                        i = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = getButtonList().hashCode();
                        break;
                    case 5:
                        i = ((iHashCode2 * 37) + 5) * 53;
                        iHashCode = getTextInput().hashCode();
                        break;
                    case 6:
                        i = ((iHashCode2 * 37) + 6) * 53;
                        iHashCode = getSelectionInput().hashCode();
                        break;
                    case 7:
                        i = ((iHashCode2 * 37) + 7) * 53;
                        iHashCode = getDateTimePicker().hashCode();
                        break;
                    default:
                        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                        this.memoizedHashCode = iHashCode3;
                        return iHashCode3;
                }
                iHashCode2 = i + iHashCode;
                int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode32;
                return iHashCode32;
            }

            public static Widgets parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Widgets parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Widgets parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Widgets parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Widgets parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Widgets parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Widgets parseFrom(InputStream inputStream) throws IOException {
                return (Widgets) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Widgets parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Widgets) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Widgets parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Widgets) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Widgets parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Widgets) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Widgets parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Widgets) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Widgets parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Widgets) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Widgets widgets) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(widgets);
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

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetsOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> buttonListBuilder_;
                private int dataCase_;
                private Object data_;
                private SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> dateTimePickerBuilder_;
                private SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> decoratedTextBuilder_;
                private SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> imageBuilder_;
                private SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> selectionInputBuilder_;
                private SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> textInputBuilder_;
                private SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> textParagraphBuilder_;

                private void buildPartial0(Widgets widgets) {
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return CardProto.internal_static_google_apps_card_v1_Columns_Column_Widgets_descriptor;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return CardProto.internal_static_google_apps_card_v1_Columns_Column_Widgets_fieldAccessorTable.ensureFieldAccessorsInitialized(Widgets.class, Builder.class);
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
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.clear();
                    }
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV32 = this.imageBuilder_;
                    if (singleFieldBuilderV32 != null) {
                        singleFieldBuilderV32.clear();
                    }
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV33 = this.decoratedTextBuilder_;
                    if (singleFieldBuilderV33 != null) {
                        singleFieldBuilderV33.clear();
                    }
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV34 = this.buttonListBuilder_;
                    if (singleFieldBuilderV34 != null) {
                        singleFieldBuilderV34.clear();
                    }
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV35 = this.textInputBuilder_;
                    if (singleFieldBuilderV35 != null) {
                        singleFieldBuilderV35.clear();
                    }
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV36 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV36 != null) {
                        singleFieldBuilderV36.clear();
                    }
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV37 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV37 != null) {
                        singleFieldBuilderV37.clear();
                    }
                    this.dataCase_ = 0;
                    this.data_ = null;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return CardProto.internal_static_google_apps_card_v1_Columns_Column_Widgets_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Widgets getDefaultInstanceForType() {
                    return Widgets.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Widgets build() {
                    Widgets widgetsBuildPartial = buildPartial();
                    if (widgetsBuildPartial.isInitialized()) {
                        return widgetsBuildPartial;
                    }
                    throw newUninitializedMessageException((Message) widgetsBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Widgets buildPartial() {
                    Widgets widgets = new Widgets(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(widgets);
                    }
                    buildPartialOneofs(widgets);
                    onBuilt();
                    return widgets;
                }

                private void buildPartialOneofs(Widgets widgets) {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3;
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV32;
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV33;
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV34;
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV35;
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV36;
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV37;
                    widgets.dataCase_ = this.dataCase_;
                    widgets.data_ = this.data_;
                    if (this.dataCase_ == 1 && (singleFieldBuilderV37 = this.textParagraphBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV37.build();
                    }
                    if (this.dataCase_ == 2 && (singleFieldBuilderV36 = this.imageBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV36.build();
                    }
                    if (this.dataCase_ == 3 && (singleFieldBuilderV35 = this.decoratedTextBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV35.build();
                    }
                    if (this.dataCase_ == 4 && (singleFieldBuilderV34 = this.buttonListBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV34.build();
                    }
                    if (this.dataCase_ == 5 && (singleFieldBuilderV33 = this.textInputBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV33.build();
                    }
                    if (this.dataCase_ == 6 && (singleFieldBuilderV32 = this.selectionInputBuilder_) != null) {
                        widgets.data_ = singleFieldBuilderV32.build();
                    }
                    if (this.dataCase_ != 7 || (singleFieldBuilderV3 = this.dateTimePickerBuilder_) == null) {
                        return;
                    }
                    widgets.data_ = singleFieldBuilderV3.build();
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
                    if (message instanceof Widgets) {
                        return mergeFrom((Widgets) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Widgets widgets) {
                    if (widgets == Widgets.getDefaultInstance()) {
                        return this;
                    }
                    switch (AnonymousClass2.$SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[widgets.getDataCase().ordinal()]) {
                        case 1:
                            mergeTextParagraph(widgets.getTextParagraph());
                            break;
                        case 2:
                            mergeImage(widgets.getImage());
                            break;
                        case 3:
                            mergeDecoratedText(widgets.getDecoratedText());
                            break;
                        case 4:
                            mergeButtonList(widgets.getButtonList());
                            break;
                        case 5:
                            mergeTextInput(widgets.getTextInput());
                            break;
                        case 6:
                            mergeSelectionInput(widgets.getSelectionInput());
                            break;
                        case 7:
                            mergeDateTimePicker(widgets.getDateTimePicker());
                            break;
                    }
                    mergeUnknownFields(widgets.getUnknownFields());
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
                                        codedInputStream.readMessage(getTextParagraphFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(getImageFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 2;
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(getDecoratedTextFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 3;
                                    } else if (tag == 34) {
                                        codedInputStream.readMessage(getButtonListFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 4;
                                    } else if (tag == 42) {
                                        codedInputStream.readMessage(getTextInputFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 5;
                                    } else if (tag == 50) {
                                        codedInputStream.readMessage(getSelectionInputFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 6;
                                    } else if (tag == 58) {
                                        codedInputStream.readMessage(getDateTimePickerFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.dataCase_ = 7;
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

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public DataCase getDataCase() {
                    return DataCase.forNumber(this.dataCase_);
                }

                public Builder clearData() {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                    return this;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasTextParagraph() {
                    return this.dataCase_ == 1;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public TextParagraph getTextParagraph() {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 1) {
                            return (TextParagraph) this.data_;
                        }
                        return TextParagraph.getDefaultInstance();
                    }
                    if (this.dataCase_ == 1) {
                        return (TextParagraph) singleFieldBuilderV3.getMessage();
                    }
                    return TextParagraph.getDefaultInstance();
                }

                public Builder setTextParagraph(TextParagraph textParagraph) {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        textParagraph.getClass();
                        this.data_ = textParagraph;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(textParagraph);
                    }
                    this.dataCase_ = 1;
                    return this;
                }

                public Builder setTextParagraph(TextParagraph.Builder builder) {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 1;
                    return this;
                }

                public Builder mergeTextParagraph(TextParagraph textParagraph) {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 1 && this.data_ != TextParagraph.getDefaultInstance()) {
                            this.data_ = TextParagraph.newBuilder((TextParagraph) this.data_).mergeFrom(textParagraph).buildPartial();
                        } else {
                            this.data_ = textParagraph;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 1) {
                        singleFieldBuilderV3.mergeFrom(textParagraph);
                    } else {
                        singleFieldBuilderV3.setMessage(textParagraph);
                    }
                    this.dataCase_ = 1;
                    return this;
                }

                public Builder clearTextParagraph() {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3 = this.textParagraphBuilder_;
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

                public TextParagraph.Builder getTextParagraphBuilder() {
                    return (TextParagraph.Builder) getTextParagraphFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public TextParagraphOrBuilder getTextParagraphOrBuilder() {
                    SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 1 && (singleFieldBuilderV3 = this.textParagraphBuilder_) != null) {
                        return (TextParagraphOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 1) {
                        return (TextParagraph) this.data_;
                    }
                    return TextParagraph.getDefaultInstance();
                }

                private SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> getTextParagraphFieldBuilder() {
                    if (this.textParagraphBuilder_ == null) {
                        if (this.dataCase_ != 1) {
                            this.data_ = TextParagraph.getDefaultInstance();
                        }
                        this.textParagraphBuilder_ = new SingleFieldBuilderV3<>((TextParagraph) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 1;
                    onChanged();
                    return this.textParagraphBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasImage() {
                    return this.dataCase_ == 2;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public Image getImage() {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 2) {
                            return (Image) this.data_;
                        }
                        return Image.getDefaultInstance();
                    }
                    if (this.dataCase_ == 2) {
                        return (Image) singleFieldBuilderV3.getMessage();
                    }
                    return Image.getDefaultInstance();
                }

                public Builder setImage(Image image) {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        image.getClass();
                        this.data_ = image;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(image);
                    }
                    this.dataCase_ = 2;
                    return this;
                }

                public Builder setImage(Image.Builder builder) {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 2;
                    return this;
                }

                public Builder mergeImage(Image image) {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 2 && this.data_ != Image.getDefaultInstance()) {
                            this.data_ = Image.newBuilder((Image) this.data_).mergeFrom(image).buildPartial();
                        } else {
                            this.data_ = image;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 2) {
                        singleFieldBuilderV3.mergeFrom(image);
                    } else {
                        singleFieldBuilderV3.setMessage(image);
                    }
                    this.dataCase_ = 2;
                    return this;
                }

                public Builder clearImage() {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
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

                public Image.Builder getImageBuilder() {
                    return (Image.Builder) getImageFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public ImageOrBuilder getImageOrBuilder() {
                    SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 2 && (singleFieldBuilderV3 = this.imageBuilder_) != null) {
                        return (ImageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 2) {
                        return (Image) this.data_;
                    }
                    return Image.getDefaultInstance();
                }

                private SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> getImageFieldBuilder() {
                    if (this.imageBuilder_ == null) {
                        if (this.dataCase_ != 2) {
                            this.data_ = Image.getDefaultInstance();
                        }
                        this.imageBuilder_ = new SingleFieldBuilderV3<>((Image) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 2;
                    onChanged();
                    return this.imageBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasDecoratedText() {
                    return this.dataCase_ == 3;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public DecoratedText getDecoratedText() {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3 = this.decoratedTextBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 3) {
                            return (DecoratedText) this.data_;
                        }
                        return DecoratedText.getDefaultInstance();
                    }
                    if (this.dataCase_ == 3) {
                        return (DecoratedText) singleFieldBuilderV3.getMessage();
                    }
                    return DecoratedText.getDefaultInstance();
                }

                public Builder setDecoratedText(DecoratedText decoratedText) {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3 = this.decoratedTextBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        decoratedText.getClass();
                        this.data_ = decoratedText;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(decoratedText);
                    }
                    this.dataCase_ = 3;
                    return this;
                }

                public Builder setDecoratedText(DecoratedText.Builder builder) {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3 = this.decoratedTextBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 3;
                    return this;
                }

                public Builder mergeDecoratedText(DecoratedText decoratedText) {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3 = this.decoratedTextBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 3 && this.data_ != DecoratedText.getDefaultInstance()) {
                            this.data_ = DecoratedText.newBuilder((DecoratedText) this.data_).mergeFrom(decoratedText).buildPartial();
                        } else {
                            this.data_ = decoratedText;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 3) {
                        singleFieldBuilderV3.mergeFrom(decoratedText);
                    } else {
                        singleFieldBuilderV3.setMessage(decoratedText);
                    }
                    this.dataCase_ = 3;
                    return this;
                }

                public Builder clearDecoratedText() {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3 = this.decoratedTextBuilder_;
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

                public DecoratedText.Builder getDecoratedTextBuilder() {
                    return (DecoratedText.Builder) getDecoratedTextFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public DecoratedTextOrBuilder getDecoratedTextOrBuilder() {
                    SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 3 && (singleFieldBuilderV3 = this.decoratedTextBuilder_) != null) {
                        return (DecoratedTextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 3) {
                        return (DecoratedText) this.data_;
                    }
                    return DecoratedText.getDefaultInstance();
                }

                private SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> getDecoratedTextFieldBuilder() {
                    if (this.decoratedTextBuilder_ == null) {
                        if (this.dataCase_ != 3) {
                            this.data_ = DecoratedText.getDefaultInstance();
                        }
                        this.decoratedTextBuilder_ = new SingleFieldBuilderV3<>((DecoratedText) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 3;
                    onChanged();
                    return this.decoratedTextBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasButtonList() {
                    return this.dataCase_ == 4;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public ButtonList getButtonList() {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3 = this.buttonListBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 4) {
                            return (ButtonList) this.data_;
                        }
                        return ButtonList.getDefaultInstance();
                    }
                    if (this.dataCase_ == 4) {
                        return (ButtonList) singleFieldBuilderV3.getMessage();
                    }
                    return ButtonList.getDefaultInstance();
                }

                public Builder setButtonList(ButtonList buttonList) {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3 = this.buttonListBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        buttonList.getClass();
                        this.data_ = buttonList;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(buttonList);
                    }
                    this.dataCase_ = 4;
                    return this;
                }

                public Builder setButtonList(ButtonList.Builder builder) {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3 = this.buttonListBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 4;
                    return this;
                }

                public Builder mergeButtonList(ButtonList buttonList) {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3 = this.buttonListBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 4 && this.data_ != ButtonList.getDefaultInstance()) {
                            this.data_ = ButtonList.newBuilder((ButtonList) this.data_).mergeFrom(buttonList).buildPartial();
                        } else {
                            this.data_ = buttonList;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 4) {
                        singleFieldBuilderV3.mergeFrom(buttonList);
                    } else {
                        singleFieldBuilderV3.setMessage(buttonList);
                    }
                    this.dataCase_ = 4;
                    return this;
                }

                public Builder clearButtonList() {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3 = this.buttonListBuilder_;
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

                public ButtonList.Builder getButtonListBuilder() {
                    return (ButtonList.Builder) getButtonListFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public ButtonListOrBuilder getButtonListOrBuilder() {
                    SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 4 && (singleFieldBuilderV3 = this.buttonListBuilder_) != null) {
                        return (ButtonListOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 4) {
                        return (ButtonList) this.data_;
                    }
                    return ButtonList.getDefaultInstance();
                }

                private SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> getButtonListFieldBuilder() {
                    if (this.buttonListBuilder_ == null) {
                        if (this.dataCase_ != 4) {
                            this.data_ = ButtonList.getDefaultInstance();
                        }
                        this.buttonListBuilder_ = new SingleFieldBuilderV3<>((ButtonList) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 4;
                    onChanged();
                    return this.buttonListBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasTextInput() {
                    return this.dataCase_ == 5;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public TextInput getTextInput() {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3 = this.textInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 5) {
                            return (TextInput) this.data_;
                        }
                        return TextInput.getDefaultInstance();
                    }
                    if (this.dataCase_ == 5) {
                        return (TextInput) singleFieldBuilderV3.getMessage();
                    }
                    return TextInput.getDefaultInstance();
                }

                public Builder setTextInput(TextInput textInput) {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3 = this.textInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        textInput.getClass();
                        this.data_ = textInput;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(textInput);
                    }
                    this.dataCase_ = 5;
                    return this;
                }

                public Builder setTextInput(TextInput.Builder builder) {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3 = this.textInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 5;
                    return this;
                }

                public Builder mergeTextInput(TextInput textInput) {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3 = this.textInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 5 && this.data_ != TextInput.getDefaultInstance()) {
                            this.data_ = TextInput.newBuilder((TextInput) this.data_).mergeFrom(textInput).buildPartial();
                        } else {
                            this.data_ = textInput;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 5) {
                        singleFieldBuilderV3.mergeFrom(textInput);
                    } else {
                        singleFieldBuilderV3.setMessage(textInput);
                    }
                    this.dataCase_ = 5;
                    return this;
                }

                public Builder clearTextInput() {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3 = this.textInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 5) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                            onChanged();
                        }
                    } else {
                        if (this.dataCase_ == 5) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                        }
                        singleFieldBuilderV3.clear();
                    }
                    return this;
                }

                public TextInput.Builder getTextInputBuilder() {
                    return (TextInput.Builder) getTextInputFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public TextInputOrBuilder getTextInputOrBuilder() {
                    SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 5 && (singleFieldBuilderV3 = this.textInputBuilder_) != null) {
                        return (TextInputOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 5) {
                        return (TextInput) this.data_;
                    }
                    return TextInput.getDefaultInstance();
                }

                private SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> getTextInputFieldBuilder() {
                    if (this.textInputBuilder_ == null) {
                        if (this.dataCase_ != 5) {
                            this.data_ = TextInput.getDefaultInstance();
                        }
                        this.textInputBuilder_ = new SingleFieldBuilderV3<>((TextInput) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 5;
                    onChanged();
                    return this.textInputBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasSelectionInput() {
                    return this.dataCase_ == 6;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public SelectionInput getSelectionInput() {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 6) {
                            return (SelectionInput) this.data_;
                        }
                        return SelectionInput.getDefaultInstance();
                    }
                    if (this.dataCase_ == 6) {
                        return (SelectionInput) singleFieldBuilderV3.getMessage();
                    }
                    return SelectionInput.getDefaultInstance();
                }

                public Builder setSelectionInput(SelectionInput selectionInput) {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        selectionInput.getClass();
                        this.data_ = selectionInput;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(selectionInput);
                    }
                    this.dataCase_ = 6;
                    return this;
                }

                public Builder setSelectionInput(SelectionInput.Builder builder) {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 6;
                    return this;
                }

                public Builder mergeSelectionInput(SelectionInput selectionInput) {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 6 && this.data_ != SelectionInput.getDefaultInstance()) {
                            this.data_ = SelectionInput.newBuilder((SelectionInput) this.data_).mergeFrom(selectionInput).buildPartial();
                        } else {
                            this.data_ = selectionInput;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 6) {
                        singleFieldBuilderV3.mergeFrom(selectionInput);
                    } else {
                        singleFieldBuilderV3.setMessage(selectionInput);
                    }
                    this.dataCase_ = 6;
                    return this;
                }

                public Builder clearSelectionInput() {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3 = this.selectionInputBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 6) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                            onChanged();
                        }
                    } else {
                        if (this.dataCase_ == 6) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                        }
                        singleFieldBuilderV3.clear();
                    }
                    return this;
                }

                public SelectionInput.Builder getSelectionInputBuilder() {
                    return (SelectionInput.Builder) getSelectionInputFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public SelectionInputOrBuilder getSelectionInputOrBuilder() {
                    SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 6 && (singleFieldBuilderV3 = this.selectionInputBuilder_) != null) {
                        return (SelectionInputOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 6) {
                        return (SelectionInput) this.data_;
                    }
                    return SelectionInput.getDefaultInstance();
                }

                private SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> getSelectionInputFieldBuilder() {
                    if (this.selectionInputBuilder_ == null) {
                        if (this.dataCase_ != 6) {
                            this.data_ = SelectionInput.getDefaultInstance();
                        }
                        this.selectionInputBuilder_ = new SingleFieldBuilderV3<>((SelectionInput) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 6;
                    onChanged();
                    return this.selectionInputBuilder_;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public boolean hasDateTimePicker() {
                    return this.dataCase_ == 7;
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public DateTimePicker getDateTimePicker() {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 7) {
                            return (DateTimePicker) this.data_;
                        }
                        return DateTimePicker.getDefaultInstance();
                    }
                    if (this.dataCase_ == 7) {
                        return (DateTimePicker) singleFieldBuilderV3.getMessage();
                    }
                    return DateTimePicker.getDefaultInstance();
                }

                public Builder setDateTimePicker(DateTimePicker dateTimePicker) {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        dateTimePicker.getClass();
                        this.data_ = dateTimePicker;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(dateTimePicker);
                    }
                    this.dataCase_ = 7;
                    return this;
                }

                public Builder setDateTimePicker(DateTimePicker.Builder builder) {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.data_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.dataCase_ = 7;
                    return this;
                }

                public Builder mergeDateTimePicker(DateTimePicker dateTimePicker) {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 7 && this.data_ != DateTimePicker.getDefaultInstance()) {
                            this.data_ = DateTimePicker.newBuilder((DateTimePicker) this.data_).mergeFrom(dateTimePicker).buildPartial();
                        } else {
                            this.data_ = dateTimePicker;
                        }
                        onChanged();
                    } else if (this.dataCase_ == 7) {
                        singleFieldBuilderV3.mergeFrom(dateTimePicker);
                    } else {
                        singleFieldBuilderV3.setMessage(dateTimePicker);
                    }
                    this.dataCase_ = 7;
                    return this;
                }

                public Builder clearDateTimePicker() {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3 = this.dateTimePickerBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        if (this.dataCase_ == 7) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                            onChanged();
                        }
                    } else {
                        if (this.dataCase_ == 7) {
                            this.dataCase_ = 0;
                            this.data_ = null;
                        }
                        singleFieldBuilderV3.clear();
                    }
                    return this;
                }

                public DateTimePicker.Builder getDateTimePickerBuilder() {
                    return (DateTimePicker.Builder) getDateTimePickerFieldBuilder().getBuilder();
                }

                @Override // com.google.apps.card.v1.Columns.Column.WidgetsOrBuilder
                public DateTimePickerOrBuilder getDateTimePickerOrBuilder() {
                    SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV3;
                    int i = this.dataCase_;
                    if (i == 7 && (singleFieldBuilderV3 = this.dateTimePickerBuilder_) != null) {
                        return (DateTimePickerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    if (i == 7) {
                        return (DateTimePicker) this.data_;
                    }
                    return DateTimePicker.getDefaultInstance();
                }

                private SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> getDateTimePickerFieldBuilder() {
                    if (this.dateTimePickerBuilder_ == null) {
                        if (this.dataCase_ != 7) {
                            this.data_ = DateTimePicker.getDefaultInstance();
                        }
                        this.dateTimePickerBuilder_ = new SingleFieldBuilderV3<>((DateTimePicker) this.data_, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    this.dataCase_ = 7;
                    onChanged();
                    return this.dateTimePickerBuilder_;
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

            public static Widgets getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Widgets> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Widgets> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Widgets getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public int getHorizontalSizeStyleValue() {
            return this.horizontalSizeStyle_;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public HorizontalSizeStyle getHorizontalSizeStyle() {
            HorizontalSizeStyle horizontalSizeStyleForNumber = HorizontalSizeStyle.forNumber(this.horizontalSizeStyle_);
            return horizontalSizeStyleForNumber == null ? HorizontalSizeStyle.UNRECOGNIZED : horizontalSizeStyleForNumber;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public int getHorizontalAlignmentValue() {
            return this.horizontalAlignment_;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public Widget.HorizontalAlignment getHorizontalAlignment() {
            Widget.HorizontalAlignment horizontalAlignmentForNumber = Widget.HorizontalAlignment.forNumber(this.horizontalAlignment_);
            return horizontalAlignmentForNumber == null ? Widget.HorizontalAlignment.UNRECOGNIZED : horizontalAlignmentForNumber;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public int getVerticalAlignmentValue() {
            return this.verticalAlignment_;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public VerticalAlignment getVerticalAlignment() {
            VerticalAlignment verticalAlignmentForNumber = VerticalAlignment.forNumber(this.verticalAlignment_);
            return verticalAlignmentForNumber == null ? VerticalAlignment.UNRECOGNIZED : verticalAlignmentForNumber;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public List<Widgets> getWidgetsList() {
            return this.widgets_;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public List<? extends WidgetsOrBuilder> getWidgetsOrBuilderList() {
            return this.widgets_;
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public int getWidgetsCount() {
            return this.widgets_.size();
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public Widgets getWidgets(int i) {
            return this.widgets_.get(i);
        }

        @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
        public WidgetsOrBuilder getWidgetsOrBuilder(int i) {
            return this.widgets_.get(i);
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
            if (this.horizontalSizeStyle_ != HorizontalSizeStyle.HORIZONTAL_SIZE_STYLE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.horizontalSizeStyle_);
            }
            if (this.horizontalAlignment_ != Widget.HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.horizontalAlignment_);
            }
            if (this.verticalAlignment_ != VerticalAlignment.VERTICAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(3, this.verticalAlignment_);
            }
            for (int i = 0; i < this.widgets_.size(); i++) {
                codedOutputStream.writeMessage(4, this.widgets_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = this.horizontalSizeStyle_ != HorizontalSizeStyle.HORIZONTAL_SIZE_STYLE_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.horizontalSizeStyle_) : 0;
            if (this.horizontalAlignment_ != Widget.HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.horizontalAlignment_);
            }
            if (this.verticalAlignment_ != VerticalAlignment.VERTICAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.verticalAlignment_);
            }
            for (int i2 = 0; i2 < this.widgets_.size(); i2++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, this.widgets_.get(i2));
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Column)) {
                return super.equals(obj);
            }
            Column column = (Column) obj;
            return this.horizontalSizeStyle_ == column.horizontalSizeStyle_ && this.horizontalAlignment_ == column.horizontalAlignment_ && this.verticalAlignment_ == column.verticalAlignment_ && getWidgetsList().equals(column.getWidgetsList()) && getUnknownFields().equals(column.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.horizontalSizeStyle_) * 37) + 2) * 53) + this.horizontalAlignment_) * 37) + 3) * 53) + this.verticalAlignment_;
            if (getWidgetsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getWidgetsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static Column parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Column parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Column parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Column parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Column parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Column parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Column parseFrom(InputStream inputStream) throws IOException {
            return (Column) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Column parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Column) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Column parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Column) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Column parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Column) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Column parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Column) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Column parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Column) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Column column) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(column);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ColumnOrBuilder {
            private int bitField0_;
            private int horizontalAlignment_;
            private int horizontalSizeStyle_;
            private int verticalAlignment_;
            private RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> widgetsBuilder_;
            private List<Widgets> widgets_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Columns_Column_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Columns_Column_fieldAccessorTable.ensureFieldAccessorsInitialized(Column.class, Builder.class);
            }

            private Builder() {
                this.horizontalSizeStyle_ = 0;
                this.horizontalAlignment_ = 0;
                this.verticalAlignment_ = 0;
                this.widgets_ = Collections.emptyList();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.horizontalSizeStyle_ = 0;
                this.horizontalAlignment_ = 0;
                this.verticalAlignment_ = 0;
                this.widgets_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.horizontalSizeStyle_ = 0;
                this.horizontalAlignment_ = 0;
                this.verticalAlignment_ = 0;
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.widgets_ = Collections.emptyList();
                } else {
                    this.widgets_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Columns_Column_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Column getDefaultInstanceForType() {
                return Column.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Column build() {
                Column columnBuildPartial = buildPartial();
                if (columnBuildPartial.isInitialized()) {
                    return columnBuildPartial;
                }
                throw newUninitializedMessageException((Message) columnBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Column buildPartial() {
                Column column = new Column(this);
                buildPartialRepeatedFields(column);
                if (this.bitField0_ != 0) {
                    buildPartial0(column);
                }
                onBuilt();
                return column;
            }

            private void buildPartialRepeatedFields(Column column) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    column.widgets_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.widgets_ = Collections.unmodifiableList(this.widgets_);
                    this.bitField0_ &= -9;
                }
                column.widgets_ = this.widgets_;
            }

            private void buildPartial0(Column column) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    column.horizontalSizeStyle_ = this.horizontalSizeStyle_;
                }
                if ((i & 2) != 0) {
                    column.horizontalAlignment_ = this.horizontalAlignment_;
                }
                if ((i & 4) != 0) {
                    column.verticalAlignment_ = this.verticalAlignment_;
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
                if (message instanceof Column) {
                    return mergeFrom((Column) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Column column) {
                if (column == Column.getDefaultInstance()) {
                    return this;
                }
                if (column.horizontalSizeStyle_ != 0) {
                    setHorizontalSizeStyleValue(column.getHorizontalSizeStyleValue());
                }
                if (column.horizontalAlignment_ != 0) {
                    setHorizontalAlignmentValue(column.getHorizontalAlignmentValue());
                }
                if (column.verticalAlignment_ != 0) {
                    setVerticalAlignmentValue(column.getVerticalAlignmentValue());
                }
                if (this.widgetsBuilder_ == null) {
                    if (!column.widgets_.isEmpty()) {
                        if (this.widgets_.isEmpty()) {
                            this.widgets_ = column.widgets_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureWidgetsIsMutable();
                            this.widgets_.addAll(column.widgets_);
                        }
                        onChanged();
                    }
                } else if (!column.widgets_.isEmpty()) {
                    if (!this.widgetsBuilder_.isEmpty()) {
                        this.widgetsBuilder_.addAllMessages(column.widgets_);
                    } else {
                        this.widgetsBuilder_.dispose();
                        this.widgetsBuilder_ = null;
                        this.widgets_ = column.widgets_;
                        this.bitField0_ &= -9;
                        this.widgetsBuilder_ = Column.alwaysUseFieldBuilders ? getWidgetsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(column.getUnknownFields());
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
                                    this.horizontalSizeStyle_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.horizontalAlignment_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.verticalAlignment_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    Widgets widgets = (Widgets) codedInputStream.readMessage(Widgets.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureWidgetsIsMutable();
                                        this.widgets_.add(widgets);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(widgets);
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

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public int getHorizontalSizeStyleValue() {
                return this.horizontalSizeStyle_;
            }

            public Builder setHorizontalSizeStyleValue(int i) {
                this.horizontalSizeStyle_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public HorizontalSizeStyle getHorizontalSizeStyle() {
                HorizontalSizeStyle horizontalSizeStyleForNumber = HorizontalSizeStyle.forNumber(this.horizontalSizeStyle_);
                return horizontalSizeStyleForNumber == null ? HorizontalSizeStyle.UNRECOGNIZED : horizontalSizeStyleForNumber;
            }

            public Builder setHorizontalSizeStyle(HorizontalSizeStyle horizontalSizeStyle) {
                horizontalSizeStyle.getClass();
                this.bitField0_ |= 1;
                this.horizontalSizeStyle_ = horizontalSizeStyle.getNumber();
                onChanged();
                return this;
            }

            public Builder clearHorizontalSizeStyle() {
                this.bitField0_ &= -2;
                this.horizontalSizeStyle_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public int getHorizontalAlignmentValue() {
                return this.horizontalAlignment_;
            }

            public Builder setHorizontalAlignmentValue(int i) {
                this.horizontalAlignment_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public Widget.HorizontalAlignment getHorizontalAlignment() {
                Widget.HorizontalAlignment horizontalAlignmentForNumber = Widget.HorizontalAlignment.forNumber(this.horizontalAlignment_);
                return horizontalAlignmentForNumber == null ? Widget.HorizontalAlignment.UNRECOGNIZED : horizontalAlignmentForNumber;
            }

            public Builder setHorizontalAlignment(Widget.HorizontalAlignment horizontalAlignment) {
                horizontalAlignment.getClass();
                this.bitField0_ |= 2;
                this.horizontalAlignment_ = horizontalAlignment.getNumber();
                onChanged();
                return this;
            }

            public Builder clearHorizontalAlignment() {
                this.bitField0_ &= -3;
                this.horizontalAlignment_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public int getVerticalAlignmentValue() {
                return this.verticalAlignment_;
            }

            public Builder setVerticalAlignmentValue(int i) {
                this.verticalAlignment_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public VerticalAlignment getVerticalAlignment() {
                VerticalAlignment verticalAlignmentForNumber = VerticalAlignment.forNumber(this.verticalAlignment_);
                return verticalAlignmentForNumber == null ? VerticalAlignment.UNRECOGNIZED : verticalAlignmentForNumber;
            }

            public Builder setVerticalAlignment(VerticalAlignment verticalAlignment) {
                verticalAlignment.getClass();
                this.bitField0_ |= 4;
                this.verticalAlignment_ = verticalAlignment.getNumber();
                onChanged();
                return this;
            }

            public Builder clearVerticalAlignment() {
                this.bitField0_ &= -5;
                this.verticalAlignment_ = 0;
                onChanged();
                return this;
            }

            private void ensureWidgetsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.widgets_ = new ArrayList(this.widgets_);
                    this.bitField0_ |= 8;
                }
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public List<Widgets> getWidgetsList() {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.widgets_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public int getWidgetsCount() {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public Widgets getWidgets(int i) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.get(i);
                }
                return (Widgets) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setWidgets(int i, Widgets widgets) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widgets.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.set(i, widgets);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, widgets);
                }
                return this;
            }

            public Builder setWidgets(int i, Widgets.Builder builder) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addWidgets(Widgets widgets) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widgets.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.add(widgets);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(widgets);
                }
                return this;
            }

            public Builder addWidgets(int i, Widgets widgets) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widgets.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.add(i, widgets);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, widgets);
                }
                return this;
            }

            public Builder addWidgets(Widgets.Builder builder) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addWidgets(int i, Widgets.Builder builder) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllWidgets(Iterable<? extends Widgets> iterable) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.widgets_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearWidgets() {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.widgets_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeWidgets(int i) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Widgets.Builder getWidgetsBuilder(int i) {
                return (Widgets.Builder) getWidgetsFieldBuilder().getBuilder(i);
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public WidgetsOrBuilder getWidgetsOrBuilder(int i) {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.get(i);
                }
                return (WidgetsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.google.apps.card.v1.Columns.ColumnOrBuilder
            public List<? extends WidgetsOrBuilder> getWidgetsOrBuilderList() {
                RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.widgets_);
            }

            public Widgets.Builder addWidgetsBuilder() {
                return (Widgets.Builder) getWidgetsFieldBuilder().addBuilder(Widgets.getDefaultInstance());
            }

            public Widgets.Builder addWidgetsBuilder(int i) {
                return (Widgets.Builder) getWidgetsFieldBuilder().addBuilder(i, Widgets.getDefaultInstance());
            }

            public List<Widgets.Builder> getWidgetsBuilderList() {
                return getWidgetsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Widgets, Widgets.Builder, WidgetsOrBuilder> getWidgetsFieldBuilder() {
                if (this.widgetsBuilder_ == null) {
                    this.widgetsBuilder_ = new RepeatedFieldBuilderV3<>(this.widgets_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.widgets_ = null;
                }
                return this.widgetsBuilder_;
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

        public static Column getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Column> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Column> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Column getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.apps.card.v1.Columns$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase;

        static {
            int[] iArr = new int[Column.Widgets.DataCase.values().length];
            $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase = iArr;
            try {
                iArr[Column.Widgets.DataCase.TEXT_PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.DECORATED_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.BUTTON_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.TEXT_INPUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.SELECTION_INPUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.DATE_TIME_PICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Columns$Column$Widgets$DataCase[Column.Widgets.DataCase.DATA_NOT_SET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.google.apps.card.v1.ColumnsOrBuilder
    public List<Column> getColumnItemsList() {
        return this.columnItems_;
    }

    @Override // com.google.apps.card.v1.ColumnsOrBuilder
    public List<? extends ColumnOrBuilder> getColumnItemsOrBuilderList() {
        return this.columnItems_;
    }

    @Override // com.google.apps.card.v1.ColumnsOrBuilder
    public int getColumnItemsCount() {
        return this.columnItems_.size();
    }

    @Override // com.google.apps.card.v1.ColumnsOrBuilder
    public Column getColumnItems(int i) {
        return this.columnItems_.get(i);
    }

    @Override // com.google.apps.card.v1.ColumnsOrBuilder
    public ColumnOrBuilder getColumnItemsOrBuilder(int i) {
        return this.columnItems_.get(i);
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
        for (int i = 0; i < this.columnItems_.size(); i++) {
            codedOutputStream.writeMessage(2, this.columnItems_.get(i));
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
        for (int i2 = 0; i2 < this.columnItems_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.columnItems_.get(i2));
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
        if (!(obj instanceof Columns)) {
            return super.equals(obj);
        }
        Columns columns = (Columns) obj;
        return getColumnItemsList().equals(columns.getColumnItemsList()) && getUnknownFields().equals(columns.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getColumnItemsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getColumnItemsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Columns parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Columns parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Columns parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Columns parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Columns parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Columns parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Columns parseFrom(InputStream inputStream) throws IOException {
        return (Columns) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Columns parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Columns) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Columns parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Columns) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Columns parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Columns) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Columns parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Columns) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Columns parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Columns) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Columns columns) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(columns);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ColumnsOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> columnItemsBuilder_;
        private List<Column> columnItems_;

        private void buildPartial0(Columns columns) {
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Columns_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Columns_fieldAccessorTable.ensureFieldAccessorsInitialized(Columns.class, Builder.class);
        }

        private Builder() {
            this.columnItems_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.columnItems_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.columnItems_ = Collections.emptyList();
            } else {
                this.columnItems_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Columns_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Columns getDefaultInstanceForType() {
            return Columns.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Columns build() {
            Columns columnsBuildPartial = buildPartial();
            if (columnsBuildPartial.isInitialized()) {
                return columnsBuildPartial;
            }
            throw newUninitializedMessageException((Message) columnsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Columns buildPartial() {
            Columns columns = new Columns(this);
            buildPartialRepeatedFields(columns);
            if (this.bitField0_ != 0) {
                buildPartial0(columns);
            }
            onBuilt();
            return columns;
        }

        private void buildPartialRepeatedFields(Columns columns) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                columns.columnItems_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.columnItems_ = Collections.unmodifiableList(this.columnItems_);
                this.bitField0_ &= -2;
            }
            columns.columnItems_ = this.columnItems_;
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
            if (message instanceof Columns) {
                return mergeFrom((Columns) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Columns columns) {
            if (columns == Columns.getDefaultInstance()) {
                return this;
            }
            if (this.columnItemsBuilder_ == null) {
                if (!columns.columnItems_.isEmpty()) {
                    if (this.columnItems_.isEmpty()) {
                        this.columnItems_ = columns.columnItems_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureColumnItemsIsMutable();
                        this.columnItems_.addAll(columns.columnItems_);
                    }
                    onChanged();
                }
            } else if (!columns.columnItems_.isEmpty()) {
                if (!this.columnItemsBuilder_.isEmpty()) {
                    this.columnItemsBuilder_.addAllMessages(columns.columnItems_);
                } else {
                    this.columnItemsBuilder_.dispose();
                    this.columnItemsBuilder_ = null;
                    this.columnItems_ = columns.columnItems_;
                    this.bitField0_ &= -2;
                    this.columnItemsBuilder_ = Columns.alwaysUseFieldBuilders ? getColumnItemsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(columns.getUnknownFields());
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
                            if (tag == 18) {
                                Column column = (Column) codedInputStream.readMessage(Column.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureColumnItemsIsMutable();
                                    this.columnItems_.add(column);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(column);
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

        private void ensureColumnItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.columnItems_ = new ArrayList(this.columnItems_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.apps.card.v1.ColumnsOrBuilder
        public List<Column> getColumnItemsList() {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.columnItems_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.ColumnsOrBuilder
        public int getColumnItemsCount() {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.columnItems_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.ColumnsOrBuilder
        public Column getColumnItems(int i) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.columnItems_.get(i);
            }
            return (Column) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setColumnItems(int i, Column column) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                column.getClass();
                ensureColumnItemsIsMutable();
                this.columnItems_.set(i, column);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, column);
            }
            return this;
        }

        public Builder setColumnItems(int i, Column.Builder builder) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureColumnItemsIsMutable();
                this.columnItems_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addColumnItems(Column column) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                column.getClass();
                ensureColumnItemsIsMutable();
                this.columnItems_.add(column);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(column);
            }
            return this;
        }

        public Builder addColumnItems(int i, Column column) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                column.getClass();
                ensureColumnItemsIsMutable();
                this.columnItems_.add(i, column);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, column);
            }
            return this;
        }

        public Builder addColumnItems(Column.Builder builder) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureColumnItemsIsMutable();
                this.columnItems_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addColumnItems(int i, Column.Builder builder) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureColumnItemsIsMutable();
                this.columnItems_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllColumnItems(Iterable<? extends Column> iterable) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureColumnItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.columnItems_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearColumnItems() {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.columnItems_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeColumnItems(int i) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureColumnItemsIsMutable();
                this.columnItems_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Column.Builder getColumnItemsBuilder(int i) {
            return (Column.Builder) getColumnItemsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.ColumnsOrBuilder
        public ColumnOrBuilder getColumnItemsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.columnItems_.get(i);
            }
            return (ColumnOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.ColumnsOrBuilder
        public List<? extends ColumnOrBuilder> getColumnItemsOrBuilderList() {
            RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> repeatedFieldBuilderV3 = this.columnItemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.columnItems_);
        }

        public Column.Builder addColumnItemsBuilder() {
            return (Column.Builder) getColumnItemsFieldBuilder().addBuilder(Column.getDefaultInstance());
        }

        public Column.Builder addColumnItemsBuilder(int i) {
            return (Column.Builder) getColumnItemsFieldBuilder().addBuilder(i, Column.getDefaultInstance());
        }

        public List<Column.Builder> getColumnItemsBuilderList() {
            return getColumnItemsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Column, Column.Builder, ColumnOrBuilder> getColumnItemsFieldBuilder() {
            if (this.columnItemsBuilder_ == null) {
                this.columnItemsBuilder_ = new RepeatedFieldBuilderV3<>(this.columnItems_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.columnItems_ = null;
            }
            return this.columnItemsBuilder_;
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

    public static Columns getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Columns> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Columns> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Columns getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
