package com.google.apps.card.v1;

import com.google.apps.card.v1.SelectionInput;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface SelectionInputOrBuilder extends MessageOrBuilder {
    Action getExternalDataSource();

    ActionOrBuilder getExternalDataSourceOrBuilder();

    SelectionInput.SelectionItem getItems(int i);

    int getItemsCount();

    List<SelectionInput.SelectionItem> getItemsList();

    SelectionInput.SelectionItemOrBuilder getItemsOrBuilder(int i);

    List<? extends SelectionInput.SelectionItemOrBuilder> getItemsOrBuilderList();

    String getLabel();

    ByteString getLabelBytes();

    SelectionInput.MultiSelectDataSourceCase getMultiSelectDataSourceCase();

    int getMultiSelectMaxSelectedItems();

    int getMultiSelectMinQueryLength();

    String getName();

    ByteString getNameBytes();

    Action getOnChangeAction();

    ActionOrBuilder getOnChangeActionOrBuilder();

    SelectionInput.PlatformDataSource getPlatformDataSource();

    SelectionInput.PlatformDataSourceOrBuilder getPlatformDataSourceOrBuilder();

    SelectionInput.SelectionType getType();

    int getTypeValue();

    boolean hasExternalDataSource();

    boolean hasOnChangeAction();

    boolean hasPlatformDataSource();
}
