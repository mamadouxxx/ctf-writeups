package com.google.apps.card.v1;

import com.google.apps.card.v1.BorderStyle;
import com.google.protobuf.MessageOrBuilder;
import com.google.type.Color;
import com.google.type.ColorOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface BorderStyleOrBuilder extends MessageOrBuilder {
    int getCornerRadius();

    Color getStrokeColor();

    ColorOrBuilder getStrokeColorOrBuilder();

    BorderStyle.BorderType getType();

    int getTypeValue();

    boolean hasStrokeColor();
}
