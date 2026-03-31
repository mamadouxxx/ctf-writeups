package com.google.apps.card.v1;

import com.google.apps.card.v1.Grid;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface GridOrBuilder extends MessageOrBuilder {
    BorderStyle getBorderStyle();

    BorderStyleOrBuilder getBorderStyleOrBuilder();

    int getColumnCount();

    Grid.GridItem getItems(int i);

    int getItemsCount();

    List<Grid.GridItem> getItemsList();

    Grid.GridItemOrBuilder getItemsOrBuilder(int i);

    List<? extends Grid.GridItemOrBuilder> getItemsOrBuilderList();

    OnClick getOnClick();

    OnClickOrBuilder getOnClickOrBuilder();

    String getTitle();

    ByteString getTitleBytes();

    boolean hasBorderStyle();

    boolean hasOnClick();
}
