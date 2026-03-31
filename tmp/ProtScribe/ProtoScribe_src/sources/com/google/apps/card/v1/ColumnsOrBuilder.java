package com.google.apps.card.v1;

import com.google.apps.card.v1.Columns;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ColumnsOrBuilder extends MessageOrBuilder {
    Columns.Column getColumnItems(int i);

    int getColumnItemsCount();

    List<Columns.Column> getColumnItemsList();

    Columns.ColumnOrBuilder getColumnItemsOrBuilder(int i);

    List<? extends Columns.ColumnOrBuilder> getColumnItemsOrBuilderList();
}
