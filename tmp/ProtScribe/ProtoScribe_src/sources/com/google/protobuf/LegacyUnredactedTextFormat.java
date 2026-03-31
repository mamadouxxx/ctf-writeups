package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class LegacyUnredactedTextFormat {
    private LegacyUnredactedTextFormat() {
    }

    static String legacyUnredactedMultilineString(MessageOrBuilder message) {
        return TextFormat.printer().printToString(message);
    }

    static String legacyUnredactedMultilineString(UnknownFieldSet fields) {
        return TextFormat.printer().printToString(fields);
    }

    static String legacyUnredactedSingleLineString(MessageOrBuilder message) {
        return TextFormat.printer().emittingSingleLine(true).printToString(message);
    }

    static String legacyUnredactedSingleLineString(UnknownFieldSet fields) {
        return TextFormat.printer().emittingSingleLine(true).printToString(fields);
    }
}
