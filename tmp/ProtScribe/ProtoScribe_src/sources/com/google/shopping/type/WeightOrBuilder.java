package com.google.shopping.type;

import com.google.protobuf.MessageOrBuilder;
import com.google.shopping.type.Weight;

/* JADX INFO: loaded from: classes2.dex */
public interface WeightOrBuilder extends MessageOrBuilder {
    long getAmountMicros();

    Weight.WeightUnit getUnit();

    int getUnitValue();

    boolean hasAmountMicros();
}
