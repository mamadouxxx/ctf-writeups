package com.google.apps.card.v1;

import com.google.apps.card.v1.TextInput;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface TextInputOrBuilder extends MessageOrBuilder {
    Action getAutoCompleteAction();

    ActionOrBuilder getAutoCompleteActionOrBuilder();

    String getHintText();

    ByteString getHintTextBytes();

    Suggestions getInitialSuggestions();

    SuggestionsOrBuilder getInitialSuggestionsOrBuilder();

    String getLabel();

    ByteString getLabelBytes();

    String getName();

    ByteString getNameBytes();

    Action getOnChangeAction();

    ActionOrBuilder getOnChangeActionOrBuilder();

    String getPlaceholderText();

    ByteString getPlaceholderTextBytes();

    TextInput.Type getType();

    int getTypeValue();

    String getValue();

    ByteString getValueBytes();

    boolean hasAutoCompleteAction();

    boolean hasInitialSuggestions();

    boolean hasOnChangeAction();
}
