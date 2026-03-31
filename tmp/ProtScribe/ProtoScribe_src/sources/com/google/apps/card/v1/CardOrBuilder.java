package com.google.apps.card.v1;

import com.google.apps.card.v1.Card;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface CardOrBuilder extends MessageOrBuilder {
    Card.CardAction getCardActions(int i);

    int getCardActionsCount();

    List<Card.CardAction> getCardActionsList();

    Card.CardActionOrBuilder getCardActionsOrBuilder(int i);

    List<? extends Card.CardActionOrBuilder> getCardActionsOrBuilderList();

    Card.DisplayStyle getDisplayStyle();

    int getDisplayStyleValue();

    Card.CardFixedFooter getFixedFooter();

    Card.CardFixedFooterOrBuilder getFixedFooterOrBuilder();

    Card.CardHeader getHeader();

    Card.CardHeaderOrBuilder getHeaderOrBuilder();

    String getName();

    ByteString getNameBytes();

    Card.CardHeader getPeekCardHeader();

    Card.CardHeaderOrBuilder getPeekCardHeaderOrBuilder();

    Card.DividerStyle getSectionDividerStyle();

    int getSectionDividerStyleValue();

    Card.Section getSections(int i);

    int getSectionsCount();

    List<Card.Section> getSectionsList();

    Card.SectionOrBuilder getSectionsOrBuilder(int i);

    List<? extends Card.SectionOrBuilder> getSectionsOrBuilderList();

    boolean hasFixedFooter();

    boolean hasHeader();

    boolean hasPeekCardHeader();
}
