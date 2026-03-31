package com.google.apps.card.v1;

import com.google.apps.card.v1.DateTimePicker;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface DateTimePickerOrBuilder extends MessageOrBuilder {
    String getLabel();

    ByteString getLabelBytes();

    String getName();

    ByteString getNameBytes();

    Action getOnChangeAction();

    ActionOrBuilder getOnChangeActionOrBuilder();

    int getTimezoneOffsetDate();

    DateTimePicker.DateTimePickerType getType();

    int getTypeValue();

    long getValueMsEpoch();

    boolean hasOnChangeAction();
}
