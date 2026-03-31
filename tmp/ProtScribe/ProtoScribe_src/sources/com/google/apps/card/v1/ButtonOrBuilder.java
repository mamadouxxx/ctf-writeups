package com.google.apps.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.type.Color;
import com.google.type.ColorOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface ButtonOrBuilder extends MessageOrBuilder {
    String getAltText();

    ByteString getAltTextBytes();

    Color getColor();

    ColorOrBuilder getColorOrBuilder();

    boolean getDisabled();

    Icon getIcon();

    IconOrBuilder getIconOrBuilder();

    OnClick getOnClick();

    OnClickOrBuilder getOnClickOrBuilder();

    String getText();

    ByteString getTextBytes();

    boolean hasColor();

    boolean hasIcon();

    boolean hasOnClick();
}
