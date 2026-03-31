package com.google.apps.card.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ButtonListOrBuilder extends MessageOrBuilder {
    Button getButtons(int i);

    int getButtonsCount();

    List<Button> getButtonsList();

    ButtonOrBuilder getButtonsOrBuilder(int i);

    List<? extends ButtonOrBuilder> getButtonsOrBuilderList();
}
