package com.google.protobuf;

import com.google.protobuf.Descriptors;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugFormat {
    private final boolean isSingleLine;

    private DebugFormat(boolean singleLine) {
        this.isSingleLine = singleLine;
    }

    public static DebugFormat singleLine() {
        return new DebugFormat(true);
    }

    public static DebugFormat multiline() {
        return new DebugFormat(false);
    }

    public String toString(MessageOrBuilder message) {
        return TextFormat.printer().emittingSingleLine(this.isSingleLine).enablingSafeDebugFormat(true).printToString(message);
    }

    public String toString(Descriptors.FieldDescriptor field, Object value) {
        return TextFormat.printer().emittingSingleLine(this.isSingleLine).enablingSafeDebugFormat(true).printFieldToString(field, value);
    }

    public String toString(UnknownFieldSet fields) {
        return TextFormat.printer().emittingSingleLine(this.isSingleLine).enablingSafeDebugFormat(true).printToString(fields);
    }

    public Object lazyToString(MessageOrBuilder message) {
        return new LazyDebugOutput(message, this);
    }

    public Object lazyToString(UnknownFieldSet fields) {
        return new LazyDebugOutput(fields, this);
    }

    private static class LazyDebugOutput {
        private final UnknownFieldSet fields;
        private final DebugFormat format;
        private final MessageOrBuilder message;

        LazyDebugOutput(MessageOrBuilder message, DebugFormat format) {
            this.message = message;
            this.fields = null;
            this.format = format;
        }

        LazyDebugOutput(UnknownFieldSet fields, DebugFormat format) {
            this.message = null;
            this.fields = fields;
            this.format = format;
        }

        public String toString() {
            MessageOrBuilder messageOrBuilder = this.message;
            if (messageOrBuilder != null) {
                return this.format.toString(messageOrBuilder);
            }
            return this.format.toString(this.fields);
        }
    }
}
