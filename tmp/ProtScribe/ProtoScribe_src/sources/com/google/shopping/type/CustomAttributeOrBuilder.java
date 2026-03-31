package com.google.shopping.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomAttributeOrBuilder extends MessageOrBuilder {
    CustomAttribute getGroupValues(int i);

    int getGroupValuesCount();

    List<CustomAttribute> getGroupValuesList();

    CustomAttributeOrBuilder getGroupValuesOrBuilder(int i);

    List<? extends CustomAttributeOrBuilder> getGroupValuesOrBuilderList();

    String getName();

    ByteString getNameBytes();

    String getValue();

    ByteString getValueBytes();

    boolean hasName();

    boolean hasValue();
}
