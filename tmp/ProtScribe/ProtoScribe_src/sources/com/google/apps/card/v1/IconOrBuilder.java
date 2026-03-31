package com.google.apps.card.v1;

import com.google.apps.card.v1.Icon;
import com.google.apps.card.v1.Widget;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface IconOrBuilder extends MessageOrBuilder {
    String getAltText();

    ByteString getAltTextBytes();

    String getIconUrl();

    ByteString getIconUrlBytes();

    Icon.IconsCase getIconsCase();

    Widget.ImageType getImageType();

    int getImageTypeValue();

    String getKnownIcon();

    ByteString getKnownIconBytes();

    MaterialIcon getMaterialIcon();

    MaterialIconOrBuilder getMaterialIconOrBuilder();

    boolean hasIconUrl();

    boolean hasKnownIcon();

    boolean hasMaterialIcon();
}
