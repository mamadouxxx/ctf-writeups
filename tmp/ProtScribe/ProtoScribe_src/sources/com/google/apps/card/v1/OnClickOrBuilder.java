package com.google.apps.card.v1;

import com.google.apps.card.v1.OnClick;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface OnClickOrBuilder extends MessageOrBuilder {
    Action getAction();

    ActionOrBuilder getActionOrBuilder();

    Card getCard();

    CardOrBuilder getCardOrBuilder();

    OnClick.DataCase getDataCase();

    Action getOpenDynamicLinkAction();

    ActionOrBuilder getOpenDynamicLinkActionOrBuilder();

    OpenLink getOpenLink();

    OpenLinkOrBuilder getOpenLinkOrBuilder();

    boolean hasAction();

    boolean hasCard();

    boolean hasOpenDynamicLinkAction();

    boolean hasOpenLink();
}
