package com.google.apps.card.v1;

import com.google.apps.card.v1.DecoratedText;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface DecoratedTextOrBuilder extends MessageOrBuilder {
    String getBottomLabel();

    ByteString getBottomLabelBytes();

    Button getButton();

    ButtonOrBuilder getButtonOrBuilder();

    DecoratedText.ControlCase getControlCase();

    Icon getEndIcon();

    IconOrBuilder getEndIconOrBuilder();

    @Deprecated
    Icon getIcon();

    @Deprecated
    IconOrBuilder getIconOrBuilder();

    OnClick getOnClick();

    OnClickOrBuilder getOnClickOrBuilder();

    Icon getStartIcon();

    IconOrBuilder getStartIconOrBuilder();

    DecoratedText.SwitchControl getSwitchControl();

    DecoratedText.SwitchControlOrBuilder getSwitchControlOrBuilder();

    String getText();

    ByteString getTextBytes();

    String getTopLabel();

    ByteString getTopLabelBytes();

    boolean getWrapText();

    boolean hasButton();

    boolean hasEndIcon();

    @Deprecated
    boolean hasIcon();

    boolean hasOnClick();

    boolean hasStartIcon();

    boolean hasSwitchControl();
}
