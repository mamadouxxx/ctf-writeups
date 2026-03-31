package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class GeneratedMessageV3 extends GeneratedMessage.ExtendableMessage<GeneratedMessageV3> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public interface BuilderParent extends AbstractMessage.BuilderParent {
    }

    @Deprecated
    public interface ExtendableMessageOrBuilder<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessage.ExtendableMessageOrBuilder<GeneratedMessageV3> {
        @Deprecated
        <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> extension);

        @Deprecated
        <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension, int index);

        @Deprecated
        <T> int getExtensionCount(GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension);

        @Deprecated
        <T> boolean hasExtension(GeneratedMessage.GeneratedExtension<MessageT, T> extension);
    }

    @Deprecated
    protected abstract Message.Builder newBuilderForType(BuilderParent parent);

    @Deprecated
    protected GeneratedMessageV3() {
    }

    @Deprecated
    protected GeneratedMessageV3(Builder<?> builder) {
        super(builder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessage
    @Deprecated
    public FieldAccessorTable internalGetFieldAccessorTable() {
        throw new UnsupportedOperationException("Should be overridden in gencode.");
    }

    @Deprecated
    protected static final class UnusedPrivateParameter {
        static final UnusedPrivateParameter INSTANCE = new UnusedPrivateParameter();

        private UnusedPrivateParameter() {
        }
    }

    @Deprecated
    protected Object newInstance(UnusedPrivateParameter unused) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    @Override // com.google.protobuf.AbstractMessage
    @Deprecated
    protected Message.Builder newBuilderForType(final AbstractMessage.BuilderParent parent) {
        return newBuilderForType(new BuilderParent() { // from class: com.google.protobuf.GeneratedMessageV3.1
            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                parent.markDirty();
            }
        });
    }

    @Deprecated
    public static abstract class Builder<BuilderT extends Builder<BuilderT>> extends GeneratedMessage.ExtendableBuilder<GeneratedMessageV3, BuilderT> {
        private Builder<BuilderT>.BuilderParentImpl meAsParent;

        @Deprecated
        protected Builder() {
            super(null);
        }

        @Deprecated
        protected Builder(BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        @Deprecated
        /* JADX INFO: renamed from: clone */
        public BuilderT mo170clone() {
            return (BuilderT) super.mo170clone();
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT clear() {
            return (BuilderT) super.clear();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessage.Builder
        @Deprecated
        public FieldAccessorTable internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT setField(final Descriptors.FieldDescriptor field, final Object value) {
            return (BuilderT) super.setField(field, value);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT clearField(final Descriptors.FieldDescriptor field) {
            return (BuilderT) super.clearField(field);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT clearOneof(final Descriptors.OneofDescriptor oneof) {
            return (BuilderT) super.clearOneof(oneof);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
            return (BuilderT) super.setRepeatedField(field, index, value);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
            return (BuilderT) super.addRepeatedField(field, value);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT setUnknownFields(final UnknownFieldSet unknownFields) {
            return (BuilderT) super.setUnknownFields(unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (BuilderT) super.mergeUnknownFields(unknownFields);
        }

        @Deprecated
        private class BuilderParentImpl implements BuilderParent {
            private BuilderParentImpl() {
            }

            @Override // com.google.protobuf.AbstractMessage.BuilderParent
            public void markDirty() {
                Builder.this.onChanged();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessage.Builder
        @Deprecated
        public BuilderParent getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new BuilderParentImpl();
            }
            return this.meAsParent;
        }
    }

    @Deprecated
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessageV3 implements ExtendableMessageOrBuilder<MessageT> {
        @Deprecated
        protected ExtendableMessage() {
        }

        @Deprecated
        protected ExtendableMessage(ExtendableBuilder<MessageT, ?> builder) {
            super(builder);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> boolean hasExtension(final GeneratedMessage.GeneratedExtension<MessageT, T> extension) {
            return hasExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> int getExtensionCount(final GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension) {
            return getExtensionCount((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return (T) getExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i) {
            return (T) getExtension((ExtensionLite) generatedExtension, i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        @Deprecated
        public FieldAccessorTable internalGetFieldAccessorTable() {
            throw new UnsupportedOperationException("Should be overridden in gencode.");
        }

        @Deprecated
        protected class ExtensionWriter extends GeneratedMessage.ExtendableMessage.ExtensionWriter {
            private ExtensionWriter(final boolean messageSetWireFormat) {
                super(messageSetWireFormat);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public GeneratedMessage.ExtendableMessage<GeneratedMessageV3>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage
        @Deprecated
        public GeneratedMessage.ExtendableMessage<GeneratedMessageV3>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(true);
        }
    }

    @Deprecated
    public static abstract class ExtendableBuilder<MessageT extends ExtendableMessage<MessageT>, BuilderT extends ExtendableBuilder<MessageT, BuilderT>> extends Builder<BuilderT> implements ExtendableMessageOrBuilder<MessageT> {
        @Deprecated
        protected ExtendableBuilder() {
        }

        @Deprecated
        protected ExtendableBuilder(BuilderParent parent) {
            super(parent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> boolean hasExtension(final GeneratedMessage.GeneratedExtension<MessageT, T> extension) {
            return hasExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> int getExtensionCount(final GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension) {
            return getExtensionCount((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, T> generatedExtension) {
            return (T) getExtension((ExtensionLite) generatedExtension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessageOrBuilder
        @Deprecated
        public final <T> T getExtension(GeneratedMessage.GeneratedExtension<MessageT, List<T>> generatedExtension, int i) {
            return (T) getExtension((ExtensionLite) generatedExtension, i);
        }

        @Deprecated
        public <T> BuilderT setExtension(final GeneratedMessage.GeneratedExtension<MessageT, T> extension, final T value) {
            return setExtension((ExtensionLite) extension, (Object) value);
        }

        @Deprecated
        public <T> BuilderT setExtension(final GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension, final int index, final T value) {
            return setExtension((ExtensionLite) extension, index, (Object) value);
        }

        @Deprecated
        public <T> BuilderT addExtension(final GeneratedMessage.GeneratedExtension<MessageT, List<T>> extension, final T value) {
            return addExtension((ExtensionLite) extension, (Object) value);
        }

        @Deprecated
        public <T> BuilderT clearExtension(final GeneratedMessage.GeneratedExtension<MessageT, T> extension) {
            return clearExtension((ExtensionLite) extension);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT setField(final Descriptors.FieldDescriptor field, final Object value) {
            return (BuilderT) super.setField(field, value);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT clearField(final Descriptors.FieldDescriptor field) {
            return (BuilderT) super.clearField(field);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT clearOneof(final Descriptors.OneofDescriptor oneof) {
            return (BuilderT) super.clearOneof(oneof);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
            return (BuilderT) super.setRepeatedField(field, index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        @Deprecated
        public BuilderT addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
            return (BuilderT) super.addRepeatedField(field, value);
        }

        @Deprecated
        protected final void mergeExtensionFields(final ExtendableMessage<?> other) {
            super.mergeExtensionFields((GeneratedMessage.ExtendableMessage<?>) other);
        }
    }

    @Deprecated
    public static final class FieldAccessorTable extends GeneratedMessage.FieldAccessorTable {
        @Override // com.google.protobuf.GeneratedMessage.FieldAccessorTable
        @Deprecated
        public /* bridge */ /* synthetic */ GeneratedMessage.FieldAccessorTable ensureFieldAccessorsInitialized(Class messageClass, Class builderClass) {
            return ensureFieldAccessorsInitialized((Class<? extends GeneratedMessage>) messageClass, (Class<? extends GeneratedMessage.Builder<?>>) builderClass);
        }

        @Deprecated
        public FieldAccessorTable(final Descriptors.Descriptor descriptor, final String[] camelCaseNames, final Class<? extends GeneratedMessageV3> messageClass, final Class<? extends Builder<?>> builderClass) {
            super(descriptor, camelCaseNames, messageClass, builderClass);
        }

        @Deprecated
        public FieldAccessorTable(final Descriptors.Descriptor descriptor, final String[] camelCaseNames) {
            super(descriptor, camelCaseNames);
        }

        @Override // com.google.protobuf.GeneratedMessage.FieldAccessorTable
        @Deprecated
        public FieldAccessorTable ensureFieldAccessorsInitialized(Class<? extends GeneratedMessage> messageClass, Class<? extends GeneratedMessage.Builder<?>> builderClass) {
            return (FieldAccessorTable) super.ensureFieldAccessorsInitialized(messageClass, builderClass);
        }
    }
}
