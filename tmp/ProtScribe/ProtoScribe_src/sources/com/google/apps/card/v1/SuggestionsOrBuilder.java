package com.google.apps.card.v1;

import com.google.apps.card.v1.Suggestions;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface SuggestionsOrBuilder extends MessageOrBuilder {
    Suggestions.SuggestionItem getItems(int i);

    int getItemsCount();

    List<Suggestions.SuggestionItem> getItemsList();

    Suggestions.SuggestionItemOrBuilder getItemsOrBuilder(int i);

    List<? extends Suggestions.SuggestionItemOrBuilder> getItemsOrBuilderList();
}
