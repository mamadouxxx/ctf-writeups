package com.google.api;

import com.google.api.MethodSettings;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MethodSettingsOrBuilder extends MessageOrBuilder {
    String getAutoPopulatedFields(int i);

    ByteString getAutoPopulatedFieldsBytes(int i);

    int getAutoPopulatedFieldsCount();

    List<String> getAutoPopulatedFieldsList();

    MethodSettings.LongRunning getLongRunning();

    MethodSettings.LongRunningOrBuilder getLongRunningOrBuilder();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasLongRunning();
}
