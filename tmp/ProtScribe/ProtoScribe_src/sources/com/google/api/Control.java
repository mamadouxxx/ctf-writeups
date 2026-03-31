package com.google.api;

import com.google.api.MethodPolicy;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Control extends GeneratedMessageV3 implements ControlOrBuilder {
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    public static final int METHOD_POLICIES_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object environment_;
    private byte memoizedIsInitialized;
    private List<MethodPolicy> methodPolicies_;
    private static final Control DEFAULT_INSTANCE = new Control();
    private static final Parser<Control> PARSER = new AbstractParser<Control>() { // from class: com.google.api.Control.1
        @Override // com.google.protobuf.Parser
        public Control parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Control.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e2) {
                throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    };

    private Control(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.environment_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Control() {
        this.environment_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.environment_ = "";
        this.methodPolicies_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Control();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ControlProto.internal_static_google_api_Control_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ControlProto.internal_static_google_api_Control_fieldAccessorTable.ensureFieldAccessorsInitialized(Control.class, Builder.class);
    }

    @Override // com.google.api.ControlOrBuilder
    public String getEnvironment() {
        Object obj = this.environment_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.environment_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ControlOrBuilder
    public ByteString getEnvironmentBytes() {
        Object obj = this.environment_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.environment_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ControlOrBuilder
    public List<MethodPolicy> getMethodPoliciesList() {
        return this.methodPolicies_;
    }

    @Override // com.google.api.ControlOrBuilder
    public List<? extends MethodPolicyOrBuilder> getMethodPoliciesOrBuilderList() {
        return this.methodPolicies_;
    }

    @Override // com.google.api.ControlOrBuilder
    public int getMethodPoliciesCount() {
        return this.methodPolicies_.size();
    }

    @Override // com.google.api.ControlOrBuilder
    public MethodPolicy getMethodPolicies(int i) {
        return this.methodPolicies_.get(i);
    }

    @Override // com.google.api.ControlOrBuilder
    public MethodPolicyOrBuilder getMethodPoliciesOrBuilder(int i) {
        return this.methodPolicies_.get(i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.environment_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.environment_);
        }
        for (int i = 0; i < this.methodPolicies_.size(); i++) {
            codedOutputStream.writeMessage(4, this.methodPolicies_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.environment_) ? GeneratedMessageV3.computeStringSize(1, this.environment_) : 0;
        for (int i2 = 0; i2 < this.methodPolicies_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.methodPolicies_.get(i2));
        }
        int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Control)) {
            return super.equals(obj);
        }
        Control control = (Control) obj;
        return getEnvironment().equals(control.getEnvironment()) && getMethodPoliciesList().equals(control.getMethodPoliciesList()) && getUnknownFields().equals(control.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEnvironment().hashCode();
        if (getMethodPoliciesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getMethodPoliciesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Control parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Control parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Control) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Control control) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(control);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControlOrBuilder {
        private int bitField0_;
        private Object environment_;
        private RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> methodPoliciesBuilder_;
        private List<MethodPolicy> methodPolicies_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ControlProto.internal_static_google_api_Control_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ControlProto.internal_static_google_api_Control_fieldAccessorTable.ensureFieldAccessorsInitialized(Control.class, Builder.class);
        }

        private Builder() {
            this.environment_ = "";
            this.methodPolicies_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.environment_ = "";
            this.methodPolicies_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.environment_ = "";
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.methodPolicies_ = Collections.emptyList();
            } else {
                this.methodPolicies_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ControlProto.internal_static_google_api_Control_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Control getDefaultInstanceForType() {
            return Control.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Control build() {
            Control controlBuildPartial = buildPartial();
            if (controlBuildPartial.isInitialized()) {
                return controlBuildPartial;
            }
            throw newUninitializedMessageException((Message) controlBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Control buildPartial() {
            Control control = new Control(this);
            buildPartialRepeatedFields(control);
            if (this.bitField0_ != 0) {
                buildPartial0(control);
            }
            onBuilt();
            return control;
        }

        private void buildPartialRepeatedFields(Control control) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                control.methodPolicies_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.methodPolicies_ = Collections.unmodifiableList(this.methodPolicies_);
                this.bitField0_ &= -3;
            }
            control.methodPolicies_ = this.methodPolicies_;
        }

        private void buildPartial0(Control control) {
            if ((this.bitField0_ & 1) != 0) {
                control.environment_ = this.environment_;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo170clone() {
            return (Builder) super.mo170clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Control) {
                return mergeFrom((Control) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Control control) {
            if (control == Control.getDefaultInstance()) {
                return this;
            }
            if (!control.getEnvironment().isEmpty()) {
                this.environment_ = control.environment_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.methodPoliciesBuilder_ == null) {
                if (!control.methodPolicies_.isEmpty()) {
                    if (this.methodPolicies_.isEmpty()) {
                        this.methodPolicies_ = control.methodPolicies_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodPoliciesIsMutable();
                        this.methodPolicies_.addAll(control.methodPolicies_);
                    }
                    onChanged();
                }
            } else if (!control.methodPolicies_.isEmpty()) {
                if (!this.methodPoliciesBuilder_.isEmpty()) {
                    this.methodPoliciesBuilder_.addAllMessages(control.methodPolicies_);
                } else {
                    this.methodPoliciesBuilder_.dispose();
                    this.methodPoliciesBuilder_ = null;
                    this.methodPolicies_ = control.methodPolicies_;
                    this.bitField0_ &= -3;
                    this.methodPoliciesBuilder_ = Control.alwaysUseFieldBuilders ? getMethodPoliciesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(control.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.environment_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 34) {
                                MethodPolicy methodPolicy = (MethodPolicy) codedInputStream.readMessage(MethodPolicy.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureMethodPoliciesIsMutable();
                                    this.methodPolicies_.add(methodPolicy);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(methodPolicy);
                                }
                            } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        @Override // com.google.api.ControlOrBuilder
        public String getEnvironment() {
            Object obj = this.environment_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.environment_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ControlOrBuilder
        public ByteString getEnvironmentBytes() {
            Object obj = this.environment_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.environment_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setEnvironment(String str) {
            str.getClass();
            this.environment_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearEnvironment() {
            this.environment_ = Control.getDefaultInstance().getEnvironment();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setEnvironmentBytes(ByteString byteString) {
            byteString.getClass();
            Control.checkByteStringIsUtf8(byteString);
            this.environment_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureMethodPoliciesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.methodPolicies_ = new ArrayList(this.methodPolicies_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.ControlOrBuilder
        public List<MethodPolicy> getMethodPoliciesList() {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.methodPolicies_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ControlOrBuilder
        public int getMethodPoliciesCount() {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodPolicies_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ControlOrBuilder
        public MethodPolicy getMethodPolicies(int i) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodPolicies_.get(i);
            }
            return (MethodPolicy) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMethodPolicies(int i, MethodPolicy methodPolicy) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodPolicy.getClass();
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.set(i, methodPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, methodPolicy);
            }
            return this;
        }

        public Builder setMethodPolicies(int i, MethodPolicy.Builder builder) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMethodPolicies(MethodPolicy methodPolicy) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodPolicy.getClass();
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.add(methodPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(methodPolicy);
            }
            return this;
        }

        public Builder addMethodPolicies(int i, MethodPolicy methodPolicy) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodPolicy.getClass();
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.add(i, methodPolicy);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, methodPolicy);
            }
            return this;
        }

        public Builder addMethodPolicies(MethodPolicy.Builder builder) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMethodPolicies(int i, MethodPolicy.Builder builder) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMethodPolicies(Iterable<? extends MethodPolicy> iterable) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodPoliciesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.methodPolicies_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMethodPolicies() {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.methodPolicies_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMethodPolicies(int i) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodPoliciesIsMutable();
                this.methodPolicies_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MethodPolicy.Builder getMethodPoliciesBuilder(int i) {
            return (MethodPolicy.Builder) getMethodPoliciesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ControlOrBuilder
        public MethodPolicyOrBuilder getMethodPoliciesOrBuilder(int i) {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodPolicies_.get(i);
            }
            return (MethodPolicyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ControlOrBuilder
        public List<? extends MethodPolicyOrBuilder> getMethodPoliciesOrBuilderList() {
            RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> repeatedFieldBuilderV3 = this.methodPoliciesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.methodPolicies_);
        }

        public MethodPolicy.Builder addMethodPoliciesBuilder() {
            return (MethodPolicy.Builder) getMethodPoliciesFieldBuilder().addBuilder(MethodPolicy.getDefaultInstance());
        }

        public MethodPolicy.Builder addMethodPoliciesBuilder(int i) {
            return (MethodPolicy.Builder) getMethodPoliciesFieldBuilder().addBuilder(i, MethodPolicy.getDefaultInstance());
        }

        public List<MethodPolicy.Builder> getMethodPoliciesBuilderList() {
            return getMethodPoliciesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MethodPolicy, MethodPolicy.Builder, MethodPolicyOrBuilder> getMethodPoliciesFieldBuilder() {
            if (this.methodPoliciesBuilder_ == null) {
                this.methodPoliciesBuilder_ = new RepeatedFieldBuilderV3<>(this.methodPolicies_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.methodPolicies_ = null;
            }
            return this.methodPoliciesBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Control> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Control> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Control getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
