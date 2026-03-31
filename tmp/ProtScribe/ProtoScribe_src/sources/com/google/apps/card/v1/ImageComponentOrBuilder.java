package com.google.apps.card.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageComponentOrBuilder extends MessageOrBuilder {
    String getAltText();

    ByteString getAltTextBytes();

    BorderStyle getBorderStyle();

    BorderStyleOrBuilder getBorderStyleOrBuilder();

    ImageCropStyle getCropStyle();

    ImageCropStyleOrBuilder getCropStyleOrBuilder();

    String getImageUri();

    ByteString getImageUriBytes();

    boolean hasBorderStyle();

    boolean hasCropStyle();
}
