package com.google.shopping.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface PriceOrBuilder extends MessageOrBuilder {
    long getAmountMicros();

    String getCurrencyCode();

    ByteString getCurrencyCodeBytes();

    boolean hasAmountMicros();

    boolean hasCurrencyCode();
}
