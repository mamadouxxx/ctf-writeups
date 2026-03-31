package com.google.apps.card.v1;

import com.google.apps.card.v1.OpenLink;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface OpenLinkOrBuilder extends MessageOrBuilder {
    OpenLink.OnClose getOnClose();

    int getOnCloseValue();

    OpenLink.OpenAs getOpenAs();

    int getOpenAsValue();

    String getUrl();

    ByteString getUrlBytes();
}
