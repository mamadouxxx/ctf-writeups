package com.google.apps.card.v1;

import com.google.apps.card.v1.Action;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ActionOrBuilder extends MessageOrBuilder {
    String getFunction();

    ByteString getFunctionBytes();

    Action.Interaction getInteraction();

    int getInteractionValue();

    Action.LoadIndicator getLoadIndicator();

    int getLoadIndicatorValue();

    Action.ActionParameter getParameters(int i);

    int getParametersCount();

    List<Action.ActionParameter> getParametersList();

    Action.ActionParameterOrBuilder getParametersOrBuilder(int i);

    List<? extends Action.ActionParameterOrBuilder> getParametersOrBuilderList();

    boolean getPersistValues();
}
