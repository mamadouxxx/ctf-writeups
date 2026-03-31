package com.google.apps.card.v1;

import com.google.apps.card.v1.ButtonList;
import com.google.apps.card.v1.Columns;
import com.google.apps.card.v1.DateTimePicker;
import com.google.apps.card.v1.DecoratedText;
import com.google.apps.card.v1.Divider;
import com.google.apps.card.v1.Grid;
import com.google.apps.card.v1.Image;
import com.google.apps.card.v1.SelectionInput;
import com.google.apps.card.v1.TextInput;
import com.google.apps.card.v1.TextParagraph;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Widget extends GeneratedMessageV3 implements WidgetOrBuilder {
    public static final int BUTTON_LIST_FIELD_NUMBER = 4;
    public static final int COLUMNS_FIELD_NUMBER = 11;
    public static final int DATE_TIME_PICKER_FIELD_NUMBER = 7;
    public static final int DECORATED_TEXT_FIELD_NUMBER = 3;
    public static final int DIVIDER_FIELD_NUMBER = 9;
    public static final int GRID_FIELD_NUMBER = 10;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 8;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int SELECTION_INPUT_FIELD_NUMBER = 6;
    public static final int TEXT_INPUT_FIELD_NUMBER = 5;
    public static final int TEXT_PARAGRAPH_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int dataCase_;
    private Object data_;
    private int horizontalAlignment_;
    private byte memoizedIsInitialized;
    private static final Widget DEFAULT_INSTANCE = new Widget();
    private static final Parser<Widget> PARSER = new AbstractParser<Widget>() { // from class: com.google.apps.card.v1.Widget.1
        @Override // com.google.protobuf.Parser
        public Widget parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Widget.newBuilder();
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

    private Widget(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.dataCase_ = 0;
        this.horizontalAlignment_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Widget() {
        this.dataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.horizontalAlignment_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Widget();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Widget_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Widget_fieldAccessorTable.ensureFieldAccessorsInitialized(Widget.class, Builder.class);
    }

    public enum ImageType implements ProtocolMessageEnum {
        SQUARE(0),
        CIRCLE(1),
        UNRECOGNIZED(-1);

        public static final int CIRCLE_VALUE = 1;
        public static final int SQUARE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ImageType> internalValueMap = new Internal.EnumLiteMap<ImageType>() { // from class: com.google.apps.card.v1.Widget.ImageType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ImageType findValueByNumber(int i) {
                return ImageType.forNumber(i);
            }
        };
        private static final ImageType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ImageType valueOf(int i) {
            return forNumber(i);
        }

        public static ImageType forNumber(int i) {
            if (i == 0) {
                return SQUARE;
            }
            if (i != 1) {
                return null;
            }
            return CIRCLE;
        }

        public static Internal.EnumLiteMap<ImageType> internalGetValueMap() {
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
            return Widget.getDescriptor().getEnumTypes().get(0);
        }

        public static ImageType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        ImageType(int i) {
            this.value = i;
        }
    }

    public enum HorizontalAlignment implements ProtocolMessageEnum {
        HORIZONTAL_ALIGNMENT_UNSPECIFIED(0),
        START(1),
        CENTER(2),
        END(3),
        UNRECOGNIZED(-1);

        public static final int CENTER_VALUE = 2;
        public static final int END_VALUE = 3;
        public static final int HORIZONTAL_ALIGNMENT_UNSPECIFIED_VALUE = 0;
        public static final int START_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<HorizontalAlignment> internalValueMap = new Internal.EnumLiteMap<HorizontalAlignment>() { // from class: com.google.apps.card.v1.Widget.HorizontalAlignment.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HorizontalAlignment findValueByNumber(int i) {
                return HorizontalAlignment.forNumber(i);
            }
        };
        private static final HorizontalAlignment[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static HorizontalAlignment valueOf(int i) {
            return forNumber(i);
        }

        public static HorizontalAlignment forNumber(int i) {
            if (i == 0) {
                return HORIZONTAL_ALIGNMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return START;
            }
            if (i == 2) {
                return CENTER;
            }
            if (i != 3) {
                return null;
            }
            return END;
        }

        public static Internal.EnumLiteMap<HorizontalAlignment> internalGetValueMap() {
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
            return Widget.getDescriptor().getEnumTypes().get(1);
        }

        public static HorizontalAlignment valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        HorizontalAlignment(int i) {
            this.value = i;
        }
    }

    public enum DataCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        TEXT_PARAGRAPH(1),
        IMAGE(2),
        DECORATED_TEXT(3),
        BUTTON_LIST(4),
        TEXT_INPUT(5),
        SELECTION_INPUT(6),
        DATE_TIME_PICKER(7),
        DIVIDER(9),
        GRID(10),
        COLUMNS(11),
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
                case 8:
                default:
                    return null;
                case 9:
                    return DIVIDER;
                case 10:
                    return GRID;
                case 11:
                    return COLUMNS;
            }
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasTextParagraph() {
        return this.dataCase_ == 1;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public TextParagraph getTextParagraph() {
        if (this.dataCase_ == 1) {
            return (TextParagraph) this.data_;
        }
        return TextParagraph.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public TextParagraphOrBuilder getTextParagraphOrBuilder() {
        if (this.dataCase_ == 1) {
            return (TextParagraph) this.data_;
        }
        return TextParagraph.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasImage() {
        return this.dataCase_ == 2;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public Image getImage() {
        if (this.dataCase_ == 2) {
            return (Image) this.data_;
        }
        return Image.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public ImageOrBuilder getImageOrBuilder() {
        if (this.dataCase_ == 2) {
            return (Image) this.data_;
        }
        return Image.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasDecoratedText() {
        return this.dataCase_ == 3;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DecoratedText getDecoratedText() {
        if (this.dataCase_ == 3) {
            return (DecoratedText) this.data_;
        }
        return DecoratedText.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DecoratedTextOrBuilder getDecoratedTextOrBuilder() {
        if (this.dataCase_ == 3) {
            return (DecoratedText) this.data_;
        }
        return DecoratedText.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasButtonList() {
        return this.dataCase_ == 4;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public ButtonList getButtonList() {
        if (this.dataCase_ == 4) {
            return (ButtonList) this.data_;
        }
        return ButtonList.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public ButtonListOrBuilder getButtonListOrBuilder() {
        if (this.dataCase_ == 4) {
            return (ButtonList) this.data_;
        }
        return ButtonList.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasTextInput() {
        return this.dataCase_ == 5;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public TextInput getTextInput() {
        if (this.dataCase_ == 5) {
            return (TextInput) this.data_;
        }
        return TextInput.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public TextInputOrBuilder getTextInputOrBuilder() {
        if (this.dataCase_ == 5) {
            return (TextInput) this.data_;
        }
        return TextInput.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasSelectionInput() {
        return this.dataCase_ == 6;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public SelectionInput getSelectionInput() {
        if (this.dataCase_ == 6) {
            return (SelectionInput) this.data_;
        }
        return SelectionInput.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public SelectionInputOrBuilder getSelectionInputOrBuilder() {
        if (this.dataCase_ == 6) {
            return (SelectionInput) this.data_;
        }
        return SelectionInput.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasDateTimePicker() {
        return this.dataCase_ == 7;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DateTimePicker getDateTimePicker() {
        if (this.dataCase_ == 7) {
            return (DateTimePicker) this.data_;
        }
        return DateTimePicker.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DateTimePickerOrBuilder getDateTimePickerOrBuilder() {
        if (this.dataCase_ == 7) {
            return (DateTimePicker) this.data_;
        }
        return DateTimePicker.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasDivider() {
        return this.dataCase_ == 9;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public Divider getDivider() {
        if (this.dataCase_ == 9) {
            return (Divider) this.data_;
        }
        return Divider.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public DividerOrBuilder getDividerOrBuilder() {
        if (this.dataCase_ == 9) {
            return (Divider) this.data_;
        }
        return Divider.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasGrid() {
        return this.dataCase_ == 10;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public Grid getGrid() {
        if (this.dataCase_ == 10) {
            return (Grid) this.data_;
        }
        return Grid.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public GridOrBuilder getGridOrBuilder() {
        if (this.dataCase_ == 10) {
            return (Grid) this.data_;
        }
        return Grid.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public boolean hasColumns() {
        return this.dataCase_ == 11;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public Columns getColumns() {
        if (this.dataCase_ == 11) {
            return (Columns) this.data_;
        }
        return Columns.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public ColumnsOrBuilder getColumnsOrBuilder() {
        if (this.dataCase_ == 11) {
            return (Columns) this.data_;
        }
        return Columns.getDefaultInstance();
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public int getHorizontalAlignmentValue() {
        return this.horizontalAlignment_;
    }

    @Override // com.google.apps.card.v1.WidgetOrBuilder
    public HorizontalAlignment getHorizontalAlignment() {
        HorizontalAlignment horizontalAlignmentForNumber = HorizontalAlignment.forNumber(this.horizontalAlignment_);
        return horizontalAlignmentForNumber == null ? HorizontalAlignment.UNRECOGNIZED : horizontalAlignmentForNumber;
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
        if (this.horizontalAlignment_ != HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(8, this.horizontalAlignment_);
        }
        if (this.dataCase_ == 9) {
            codedOutputStream.writeMessage(9, (Divider) this.data_);
        }
        if (this.dataCase_ == 10) {
            codedOutputStream.writeMessage(10, (Grid) this.data_);
        }
        if (this.dataCase_ == 11) {
            codedOutputStream.writeMessage(11, (Columns) this.data_);
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
        if (this.horizontalAlignment_ != HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(8, this.horizontalAlignment_);
        }
        if (this.dataCase_ == 9) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(9, (Divider) this.data_);
        }
        if (this.dataCase_ == 10) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(10, (Grid) this.data_);
        }
        if (this.dataCase_ == 11) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(11, (Columns) this.data_);
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
        if (!(obj instanceof Widget)) {
            return super.equals(obj);
        }
        Widget widget = (Widget) obj;
        if (this.horizontalAlignment_ != widget.horizontalAlignment_ || !getDataCase().equals(widget.getDataCase())) {
            return false;
        }
        switch (this.dataCase_) {
            case 1:
                if (!getTextParagraph().equals(widget.getTextParagraph())) {
                    return false;
                }
                break;
            case 2:
                if (!getImage().equals(widget.getImage())) {
                    return false;
                }
                break;
            case 3:
                if (!getDecoratedText().equals(widget.getDecoratedText())) {
                    return false;
                }
                break;
            case 4:
                if (!getButtonList().equals(widget.getButtonList())) {
                    return false;
                }
                break;
            case 5:
                if (!getTextInput().equals(widget.getTextInput())) {
                    return false;
                }
                break;
            case 6:
                if (!getSelectionInput().equals(widget.getSelectionInput())) {
                    return false;
                }
                break;
            case 7:
                if (!getDateTimePicker().equals(widget.getDateTimePicker())) {
                    return false;
                }
                break;
            case 9:
                if (!getDivider().equals(widget.getDivider())) {
                    return false;
                }
                break;
            case 10:
                if (!getGrid().equals(widget.getGrid())) {
                    return false;
                }
                break;
            case 11:
                if (!getColumns().equals(widget.getColumns())) {
                    return false;
                }
                break;
        }
        return getUnknownFields().equals(widget.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = ((((779 + getDescriptor().hashCode()) * 37) + 8) * 53) + this.horizontalAlignment_;
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
            case 8:
            default:
                int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            case 9:
                i = ((iHashCode2 * 37) + 9) * 53;
                iHashCode = getDivider().hashCode();
                break;
            case 10:
                i = ((iHashCode2 * 37) + 10) * 53;
                iHashCode = getGrid().hashCode();
                break;
            case 11:
                i = ((iHashCode2 * 37) + 11) * 53;
                iHashCode = getColumns().hashCode();
                break;
        }
        iHashCode2 = i + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    public static Widget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Widget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Widget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Widget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Widget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Widget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Widget parseFrom(InputStream inputStream) throws IOException {
        return (Widget) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Widget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Widget) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Widget parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Widget) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Widget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Widget) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Widget parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Widget) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Widget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Widget) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Widget widget) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(widget);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> buttonListBuilder_;
        private SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> columnsBuilder_;
        private int dataCase_;
        private Object data_;
        private SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> dateTimePickerBuilder_;
        private SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> decoratedTextBuilder_;
        private SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> dividerBuilder_;
        private SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> gridBuilder_;
        private int horizontalAlignment_;
        private SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> imageBuilder_;
        private SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> selectionInputBuilder_;
        private SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> textInputBuilder_;
        private SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> textParagraphBuilder_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Widget_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Widget_fieldAccessorTable.ensureFieldAccessorsInitialized(Widget.class, Builder.class);
        }

        private Builder() {
            this.dataCase_ = 0;
            this.horizontalAlignment_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.dataCase_ = 0;
            this.horizontalAlignment_ = 0;
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
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV38 = this.dividerBuilder_;
            if (singleFieldBuilderV38 != null) {
                singleFieldBuilderV38.clear();
            }
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV39 = this.gridBuilder_;
            if (singleFieldBuilderV39 != null) {
                singleFieldBuilderV39.clear();
            }
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV310 = this.columnsBuilder_;
            if (singleFieldBuilderV310 != null) {
                singleFieldBuilderV310.clear();
            }
            this.horizontalAlignment_ = 0;
            this.dataCase_ = 0;
            this.data_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Widget_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Widget getDefaultInstanceForType() {
            return Widget.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Widget build() {
            Widget widgetBuildPartial = buildPartial();
            if (widgetBuildPartial.isInitialized()) {
                return widgetBuildPartial;
            }
            throw newUninitializedMessageException((Message) widgetBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Widget buildPartial() {
            Widget widget = new Widget(this);
            if (this.bitField0_ != 0) {
                buildPartial0(widget);
            }
            buildPartialOneofs(widget);
            onBuilt();
            return widget;
        }

        private void buildPartial0(Widget widget) {
            if ((this.bitField0_ & 1024) != 0) {
                widget.horizontalAlignment_ = this.horizontalAlignment_;
            }
        }

        private void buildPartialOneofs(Widget widget) {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3;
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV32;
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV33;
            SingleFieldBuilderV3<DateTimePicker, DateTimePicker.Builder, DateTimePickerOrBuilder> singleFieldBuilderV34;
            SingleFieldBuilderV3<SelectionInput, SelectionInput.Builder, SelectionInputOrBuilder> singleFieldBuilderV35;
            SingleFieldBuilderV3<TextInput, TextInput.Builder, TextInputOrBuilder> singleFieldBuilderV36;
            SingleFieldBuilderV3<ButtonList, ButtonList.Builder, ButtonListOrBuilder> singleFieldBuilderV37;
            SingleFieldBuilderV3<DecoratedText, DecoratedText.Builder, DecoratedTextOrBuilder> singleFieldBuilderV38;
            SingleFieldBuilderV3<Image, Image.Builder, ImageOrBuilder> singleFieldBuilderV39;
            SingleFieldBuilderV3<TextParagraph, TextParagraph.Builder, TextParagraphOrBuilder> singleFieldBuilderV310;
            widget.dataCase_ = this.dataCase_;
            widget.data_ = this.data_;
            if (this.dataCase_ == 1 && (singleFieldBuilderV310 = this.textParagraphBuilder_) != null) {
                widget.data_ = singleFieldBuilderV310.build();
            }
            if (this.dataCase_ == 2 && (singleFieldBuilderV39 = this.imageBuilder_) != null) {
                widget.data_ = singleFieldBuilderV39.build();
            }
            if (this.dataCase_ == 3 && (singleFieldBuilderV38 = this.decoratedTextBuilder_) != null) {
                widget.data_ = singleFieldBuilderV38.build();
            }
            if (this.dataCase_ == 4 && (singleFieldBuilderV37 = this.buttonListBuilder_) != null) {
                widget.data_ = singleFieldBuilderV37.build();
            }
            if (this.dataCase_ == 5 && (singleFieldBuilderV36 = this.textInputBuilder_) != null) {
                widget.data_ = singleFieldBuilderV36.build();
            }
            if (this.dataCase_ == 6 && (singleFieldBuilderV35 = this.selectionInputBuilder_) != null) {
                widget.data_ = singleFieldBuilderV35.build();
            }
            if (this.dataCase_ == 7 && (singleFieldBuilderV34 = this.dateTimePickerBuilder_) != null) {
                widget.data_ = singleFieldBuilderV34.build();
            }
            if (this.dataCase_ == 9 && (singleFieldBuilderV33 = this.dividerBuilder_) != null) {
                widget.data_ = singleFieldBuilderV33.build();
            }
            if (this.dataCase_ == 10 && (singleFieldBuilderV32 = this.gridBuilder_) != null) {
                widget.data_ = singleFieldBuilderV32.build();
            }
            if (this.dataCase_ != 11 || (singleFieldBuilderV3 = this.columnsBuilder_) == null) {
                return;
            }
            widget.data_ = singleFieldBuilderV3.build();
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
            if (message instanceof Widget) {
                return mergeFrom((Widget) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Widget widget) {
            if (widget == Widget.getDefaultInstance()) {
                return this;
            }
            if (widget.horizontalAlignment_ != 0) {
                setHorizontalAlignmentValue(widget.getHorizontalAlignmentValue());
            }
            switch (AnonymousClass2.$SwitchMap$com$google$apps$card$v1$Widget$DataCase[widget.getDataCase().ordinal()]) {
                case 1:
                    mergeTextParagraph(widget.getTextParagraph());
                    break;
                case 2:
                    mergeImage(widget.getImage());
                    break;
                case 3:
                    mergeDecoratedText(widget.getDecoratedText());
                    break;
                case 4:
                    mergeButtonList(widget.getButtonList());
                    break;
                case 5:
                    mergeTextInput(widget.getTextInput());
                    break;
                case 6:
                    mergeSelectionInput(widget.getSelectionInput());
                    break;
                case 7:
                    mergeDateTimePicker(widget.getDateTimePicker());
                    break;
                case 8:
                    mergeDivider(widget.getDivider());
                    break;
                case 9:
                    mergeGrid(widget.getGrid());
                    break;
                case 10:
                    mergeColumns(widget.getColumns());
                    break;
            }
            mergeUnknownFields(widget.getUnknownFields());
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
                                codedInputStream.readMessage(getTextParagraphFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 1;
                                break;
                            case 18:
                                codedInputStream.readMessage(getImageFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 2;
                                break;
                            case 26:
                                codedInputStream.readMessage(getDecoratedTextFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 3;
                                break;
                            case 34:
                                codedInputStream.readMessage(getButtonListFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 4;
                                break;
                            case 42:
                                codedInputStream.readMessage(getTextInputFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 5;
                                break;
                            case 50:
                                codedInputStream.readMessage(getSelectionInputFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 6;
                                break;
                            case 58:
                                codedInputStream.readMessage(getDateTimePickerFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 7;
                                break;
                            case 64:
                                this.horizontalAlignment_ = codedInputStream.readEnum();
                                this.bitField0_ |= 1024;
                                break;
                            case 74:
                                codedInputStream.readMessage(getDividerFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 9;
                                break;
                            case 82:
                                codedInputStream.readMessage(getGridFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 10;
                                break;
                            case 90:
                                codedInputStream.readMessage(getColumnsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.dataCase_ = 11;
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public DataCase getDataCase() {
            return DataCase.forNumber(this.dataCase_);
        }

        public Builder clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasTextParagraph() {
            return this.dataCase_ == 1;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasImage() {
            return this.dataCase_ == 2;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasDecoratedText() {
            return this.dataCase_ == 3;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasButtonList() {
            return this.dataCase_ == 4;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasTextInput() {
            return this.dataCase_ == 5;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasSelectionInput() {
            return this.dataCase_ == 6;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasDateTimePicker() {
            return this.dataCase_ == 7;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
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

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasDivider() {
            return this.dataCase_ == 9;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public Divider getDivider() {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3 = this.dividerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 9) {
                    return (Divider) this.data_;
                }
                return Divider.getDefaultInstance();
            }
            if (this.dataCase_ == 9) {
                return (Divider) singleFieldBuilderV3.getMessage();
            }
            return Divider.getDefaultInstance();
        }

        public Builder setDivider(Divider divider) {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3 = this.dividerBuilder_;
            if (singleFieldBuilderV3 == null) {
                divider.getClass();
                this.data_ = divider;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(divider);
            }
            this.dataCase_ = 9;
            return this;
        }

        public Builder setDivider(Divider.Builder builder) {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3 = this.dividerBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 9;
            return this;
        }

        public Builder mergeDivider(Divider divider) {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3 = this.dividerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 9 && this.data_ != Divider.getDefaultInstance()) {
                    this.data_ = Divider.newBuilder((Divider) this.data_).mergeFrom(divider).buildPartial();
                } else {
                    this.data_ = divider;
                }
                onChanged();
            } else if (this.dataCase_ == 9) {
                singleFieldBuilderV3.mergeFrom(divider);
            } else {
                singleFieldBuilderV3.setMessage(divider);
            }
            this.dataCase_ = 9;
            return this;
        }

        public Builder clearDivider() {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3 = this.dividerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 9) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 9) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Divider.Builder getDividerBuilder() {
            return (Divider.Builder) getDividerFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public DividerOrBuilder getDividerOrBuilder() {
            SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 9 && (singleFieldBuilderV3 = this.dividerBuilder_) != null) {
                return (DividerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 9) {
                return (Divider) this.data_;
            }
            return Divider.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Divider, Divider.Builder, DividerOrBuilder> getDividerFieldBuilder() {
            if (this.dividerBuilder_ == null) {
                if (this.dataCase_ != 9) {
                    this.data_ = Divider.getDefaultInstance();
                }
                this.dividerBuilder_ = new SingleFieldBuilderV3<>((Divider) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 9;
            onChanged();
            return this.dividerBuilder_;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasGrid() {
            return this.dataCase_ == 10;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public Grid getGrid() {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3 = this.gridBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 10) {
                    return (Grid) this.data_;
                }
                return Grid.getDefaultInstance();
            }
            if (this.dataCase_ == 10) {
                return (Grid) singleFieldBuilderV3.getMessage();
            }
            return Grid.getDefaultInstance();
        }

        public Builder setGrid(Grid grid) {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3 = this.gridBuilder_;
            if (singleFieldBuilderV3 == null) {
                grid.getClass();
                this.data_ = grid;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(grid);
            }
            this.dataCase_ = 10;
            return this;
        }

        public Builder setGrid(Grid.Builder builder) {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3 = this.gridBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 10;
            return this;
        }

        public Builder mergeGrid(Grid grid) {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3 = this.gridBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 10 && this.data_ != Grid.getDefaultInstance()) {
                    this.data_ = Grid.newBuilder((Grid) this.data_).mergeFrom(grid).buildPartial();
                } else {
                    this.data_ = grid;
                }
                onChanged();
            } else if (this.dataCase_ == 10) {
                singleFieldBuilderV3.mergeFrom(grid);
            } else {
                singleFieldBuilderV3.setMessage(grid);
            }
            this.dataCase_ = 10;
            return this;
        }

        public Builder clearGrid() {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3 = this.gridBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 10) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 10) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Grid.Builder getGridBuilder() {
            return (Grid.Builder) getGridFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public GridOrBuilder getGridOrBuilder() {
            SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 10 && (singleFieldBuilderV3 = this.gridBuilder_) != null) {
                return (GridOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 10) {
                return (Grid) this.data_;
            }
            return Grid.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Grid, Grid.Builder, GridOrBuilder> getGridFieldBuilder() {
            if (this.gridBuilder_ == null) {
                if (this.dataCase_ != 10) {
                    this.data_ = Grid.getDefaultInstance();
                }
                this.gridBuilder_ = new SingleFieldBuilderV3<>((Grid) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 10;
            onChanged();
            return this.gridBuilder_;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public boolean hasColumns() {
            return this.dataCase_ == 11;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public Columns getColumns() {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3 = this.columnsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 11) {
                    return (Columns) this.data_;
                }
                return Columns.getDefaultInstance();
            }
            if (this.dataCase_ == 11) {
                return (Columns) singleFieldBuilderV3.getMessage();
            }
            return Columns.getDefaultInstance();
        }

        public Builder setColumns(Columns columns) {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3 = this.columnsBuilder_;
            if (singleFieldBuilderV3 == null) {
                columns.getClass();
                this.data_ = columns;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(columns);
            }
            this.dataCase_ = 11;
            return this;
        }

        public Builder setColumns(Columns.Builder builder) {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3 = this.columnsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.data_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.dataCase_ = 11;
            return this;
        }

        public Builder mergeColumns(Columns columns) {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3 = this.columnsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 11 && this.data_ != Columns.getDefaultInstance()) {
                    this.data_ = Columns.newBuilder((Columns) this.data_).mergeFrom(columns).buildPartial();
                } else {
                    this.data_ = columns;
                }
                onChanged();
            } else if (this.dataCase_ == 11) {
                singleFieldBuilderV3.mergeFrom(columns);
            } else {
                singleFieldBuilderV3.setMessage(columns);
            }
            this.dataCase_ = 11;
            return this;
        }

        public Builder clearColumns() {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3 = this.columnsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.dataCase_ == 11) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                    onChanged();
                }
            } else {
                if (this.dataCase_ == 11) {
                    this.dataCase_ = 0;
                    this.data_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public Columns.Builder getColumnsBuilder() {
            return (Columns.Builder) getColumnsFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public ColumnsOrBuilder getColumnsOrBuilder() {
            SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> singleFieldBuilderV3;
            int i = this.dataCase_;
            if (i == 11 && (singleFieldBuilderV3 = this.columnsBuilder_) != null) {
                return (ColumnsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            if (i == 11) {
                return (Columns) this.data_;
            }
            return Columns.getDefaultInstance();
        }

        private SingleFieldBuilderV3<Columns, Columns.Builder, ColumnsOrBuilder> getColumnsFieldBuilder() {
            if (this.columnsBuilder_ == null) {
                if (this.dataCase_ != 11) {
                    this.data_ = Columns.getDefaultInstance();
                }
                this.columnsBuilder_ = new SingleFieldBuilderV3<>((Columns) this.data_, getParentForChildren(), isClean());
                this.data_ = null;
            }
            this.dataCase_ = 11;
            onChanged();
            return this.columnsBuilder_;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public int getHorizontalAlignmentValue() {
            return this.horizontalAlignment_;
        }

        public Builder setHorizontalAlignmentValue(int i) {
            this.horizontalAlignment_ = i;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.WidgetOrBuilder
        public HorizontalAlignment getHorizontalAlignment() {
            HorizontalAlignment horizontalAlignmentForNumber = HorizontalAlignment.forNumber(this.horizontalAlignment_);
            return horizontalAlignmentForNumber == null ? HorizontalAlignment.UNRECOGNIZED : horizontalAlignmentForNumber;
        }

        public Builder setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            horizontalAlignment.getClass();
            this.bitField0_ |= 1024;
            this.horizontalAlignment_ = horizontalAlignment.getNumber();
            onChanged();
            return this;
        }

        public Builder clearHorizontalAlignment() {
            this.bitField0_ &= -1025;
            this.horizontalAlignment_ = 0;
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

    /* JADX INFO: renamed from: com.google.apps.card.v1.Widget$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$Widget$DataCase;

        static {
            int[] iArr = new int[DataCase.values().length];
            $SwitchMap$com$google$apps$card$v1$Widget$DataCase = iArr;
            try {
                iArr[DataCase.TEXT_PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.DECORATED_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.BUTTON_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.TEXT_INPUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.SELECTION_INPUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.DATE_TIME_PICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.DIVIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.COLUMNS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Widget$DataCase[DataCase.DATA_NOT_SET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static Widget getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Widget> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Widget> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Widget getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
