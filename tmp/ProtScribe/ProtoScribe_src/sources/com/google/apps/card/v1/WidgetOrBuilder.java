package com.google.apps.card.v1;

import com.google.apps.card.v1.Widget;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface WidgetOrBuilder extends MessageOrBuilder {
    ButtonList getButtonList();

    ButtonListOrBuilder getButtonListOrBuilder();

    Columns getColumns();

    ColumnsOrBuilder getColumnsOrBuilder();

    Widget.DataCase getDataCase();

    DateTimePicker getDateTimePicker();

    DateTimePickerOrBuilder getDateTimePickerOrBuilder();

    DecoratedText getDecoratedText();

    DecoratedTextOrBuilder getDecoratedTextOrBuilder();

    Divider getDivider();

    DividerOrBuilder getDividerOrBuilder();

    Grid getGrid();

    GridOrBuilder getGridOrBuilder();

    Widget.HorizontalAlignment getHorizontalAlignment();

    int getHorizontalAlignmentValue();

    Image getImage();

    ImageOrBuilder getImageOrBuilder();

    SelectionInput getSelectionInput();

    SelectionInputOrBuilder getSelectionInputOrBuilder();

    TextInput getTextInput();

    TextInputOrBuilder getTextInputOrBuilder();

    TextParagraph getTextParagraph();

    TextParagraphOrBuilder getTextParagraphOrBuilder();

    boolean hasButtonList();

    boolean hasColumns();

    boolean hasDateTimePicker();

    boolean hasDecoratedText();

    boolean hasDivider();

    boolean hasGrid();

    boolean hasImage();

    boolean hasSelectionInput();

    boolean hasTextInput();

    boolean hasTextParagraph();
}
