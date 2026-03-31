package com.google.apps.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageOrBuilder extends MessageOrBuilder {
    String getAltText();

    ByteString getAltTextBytes();

    String getImageUrl();

    ByteString getImageUrlBytes();

    OnClick getOnClick();

    OnClickOrBuilder getOnClickOrBuilder();

    boolean hasOnClick();
}
