package com.google.shopping.type;

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

/* JADX INFO: loaded from: classes2.dex */
public final class CustomAttribute extends GeneratedMessageV3 implements CustomAttributeOrBuilder {
    public static final int GROUP_VALUES_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<CustomAttribute> groupValues_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private volatile Object value_;
    private static final CustomAttribute DEFAULT_INSTANCE = new CustomAttribute();
    private static final Parser<CustomAttribute> PARSER = new AbstractParser<CustomAttribute>() { // from class: com.google.shopping.type.CustomAttribute.1
        @Override // com.google.protobuf.Parser
        public CustomAttribute parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = CustomAttribute.newBuilder();
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

    static /* synthetic */ int access$676(CustomAttribute customAttribute, int i) {
        int i2 = i | customAttribute.bitField0_;
        customAttribute.bitField0_ = i2;
        return i2;
    }

    private CustomAttribute(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private CustomAttribute() {
        this.name_ = "";
        this.value_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.value_ = "";
        this.groupValues_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CustomAttribute();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypesProto.internal_static_google_shopping_type_CustomAttribute_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypesProto.internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomAttribute.class, Builder.class);
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public String getValue() {
        Object obj = this.value_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.value_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public ByteString getValueBytes() {
        Object obj = this.value_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public List<CustomAttribute> getGroupValuesList() {
        return this.groupValues_;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public List<? extends CustomAttributeOrBuilder> getGroupValuesOrBuilderList() {
        return this.groupValues_;
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public int getGroupValuesCount() {
        return this.groupValues_.size();
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public CustomAttribute getGroupValues(int i) {
        return this.groupValues_.get(i);
    }

    @Override // com.google.shopping.type.CustomAttributeOrBuilder
    public CustomAttributeOrBuilder getGroupValuesOrBuilder(int i) {
        return this.groupValues_.get(i);
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
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
        }
        for (int i = 0; i < this.groupValues_.size(); i++) {
            codedOutputStream.writeMessage(3, this.groupValues_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
        }
        for (int i2 = 0; i2 < this.groupValues_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.groupValues_.get(i2));
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
        if (!(obj instanceof CustomAttribute)) {
            return super.equals(obj);
        }
        CustomAttribute customAttribute = (CustomAttribute) obj;
        if (hasName() != customAttribute.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(customAttribute.getName())) && hasValue() == customAttribute.hasValue()) {
            return (!hasValue() || getValue().equals(customAttribute.getValue())) && getGroupValuesList().equals(customAttribute.getGroupValuesList()) && getUnknownFields().equals(customAttribute.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasName()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (hasValue()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getValue().hashCode();
        }
        if (getGroupValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getGroupValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static CustomAttribute parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static CustomAttribute parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CustomAttribute parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static CustomAttribute parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CustomAttribute parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static CustomAttribute parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CustomAttribute parseFrom(InputStream inputStream) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CustomAttribute parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CustomAttribute parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CustomAttribute parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CustomAttribute parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CustomAttribute parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomAttribute) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CustomAttribute customAttribute) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(customAttribute);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomAttributeOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> groupValuesBuilder_;
        private List<CustomAttribute> groupValues_;
        private Object name_;
        private Object value_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypesProto.internal_static_google_shopping_type_CustomAttribute_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypesProto.internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomAttribute.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.value_ = "";
            this.groupValues_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.value_ = "";
            this.groupValues_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.value_ = "";
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.groupValues_ = Collections.emptyList();
            } else {
                this.groupValues_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TypesProto.internal_static_google_shopping_type_CustomAttribute_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CustomAttribute getDefaultInstanceForType() {
            return CustomAttribute.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CustomAttribute build() {
            CustomAttribute customAttributeBuildPartial = buildPartial();
            if (customAttributeBuildPartial.isInitialized()) {
                return customAttributeBuildPartial;
            }
            throw newUninitializedMessageException((Message) customAttributeBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CustomAttribute buildPartial() {
            CustomAttribute customAttribute = new CustomAttribute(this);
            buildPartialRepeatedFields(customAttribute);
            if (this.bitField0_ != 0) {
                buildPartial0(customAttribute);
            }
            onBuilt();
            return customAttribute;
        }

        private void buildPartialRepeatedFields(CustomAttribute customAttribute) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                customAttribute.groupValues_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.groupValues_ = Collections.unmodifiableList(this.groupValues_);
                this.bitField0_ &= -5;
            }
            customAttribute.groupValues_ = this.groupValues_;
        }

        private void buildPartial0(CustomAttribute customAttribute) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                customAttribute.name_ = this.name_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                customAttribute.value_ = this.value_;
                i |= 2;
            }
            CustomAttribute.access$676(customAttribute, i);
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
            if (message instanceof CustomAttribute) {
                return mergeFrom((CustomAttribute) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CustomAttribute customAttribute) {
            if (customAttribute == CustomAttribute.getDefaultInstance()) {
                return this;
            }
            if (customAttribute.hasName()) {
                this.name_ = customAttribute.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (customAttribute.hasValue()) {
                this.value_ = customAttribute.value_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (this.groupValuesBuilder_ == null) {
                if (!customAttribute.groupValues_.isEmpty()) {
                    if (this.groupValues_.isEmpty()) {
                        this.groupValues_ = customAttribute.groupValues_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureGroupValuesIsMutable();
                        this.groupValues_.addAll(customAttribute.groupValues_);
                    }
                    onChanged();
                }
            } else if (!customAttribute.groupValues_.isEmpty()) {
                if (!this.groupValuesBuilder_.isEmpty()) {
                    this.groupValuesBuilder_.addAllMessages(customAttribute.groupValues_);
                } else {
                    this.groupValuesBuilder_.dispose();
                    this.groupValuesBuilder_ = null;
                    this.groupValues_ = customAttribute.groupValues_;
                    this.bitField0_ &= -5;
                    this.groupValuesBuilder_ = CustomAttribute.alwaysUseFieldBuilders ? getGroupValuesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(customAttribute.getUnknownFields());
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.value_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                CustomAttribute customAttribute = (CustomAttribute) codedInputStream.readMessage(CustomAttribute.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureGroupValuesIsMutable();
                                    this.groupValues_.add(customAttribute);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(customAttribute);
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

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = CustomAttribute.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            CustomAttribute.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setValue(String str) {
            str.getClass();
            this.value_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearValue() {
            this.value_ = CustomAttribute.getDefaultInstance().getValue();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setValueBytes(ByteString byteString) {
            byteString.getClass();
            CustomAttribute.checkByteStringIsUtf8(byteString);
            this.value_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private void ensureGroupValuesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.groupValues_ = new ArrayList(this.groupValues_);
                this.bitField0_ |= 4;
            }
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public List<CustomAttribute> getGroupValuesList() {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.groupValues_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public int getGroupValuesCount() {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.groupValues_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public CustomAttribute getGroupValues(int i) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.groupValues_.get(i);
            }
            return (CustomAttribute) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setGroupValues(int i, CustomAttribute customAttribute) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customAttribute.getClass();
                ensureGroupValuesIsMutable();
                this.groupValues_.set(i, customAttribute);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, customAttribute);
            }
            return this;
        }

        public Builder setGroupValues(int i, Builder builder) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureGroupValuesIsMutable();
                this.groupValues_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addGroupValues(CustomAttribute customAttribute) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customAttribute.getClass();
                ensureGroupValuesIsMutable();
                this.groupValues_.add(customAttribute);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(customAttribute);
            }
            return this;
        }

        public Builder addGroupValues(int i, CustomAttribute customAttribute) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customAttribute.getClass();
                ensureGroupValuesIsMutable();
                this.groupValues_.add(i, customAttribute);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, customAttribute);
            }
            return this;
        }

        public Builder addGroupValues(Builder builder) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureGroupValuesIsMutable();
                this.groupValues_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addGroupValues(int i, Builder builder) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureGroupValuesIsMutable();
                this.groupValues_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllGroupValues(Iterable<? extends CustomAttribute> iterable) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureGroupValuesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.groupValues_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearGroupValues() {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.groupValues_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeGroupValues(int i) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureGroupValuesIsMutable();
                this.groupValues_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Builder getGroupValuesBuilder(int i) {
            return (Builder) getGroupValuesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public CustomAttributeOrBuilder getGroupValuesOrBuilder(int i) {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.groupValues_.get(i);
            }
            return (CustomAttributeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.shopping.type.CustomAttributeOrBuilder
        public List<? extends CustomAttributeOrBuilder> getGroupValuesOrBuilderList() {
            RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> repeatedFieldBuilderV3 = this.groupValuesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.groupValues_);
        }

        public Builder addGroupValuesBuilder() {
            return (Builder) getGroupValuesFieldBuilder().addBuilder(CustomAttribute.getDefaultInstance());
        }

        public Builder addGroupValuesBuilder(int i) {
            return (Builder) getGroupValuesFieldBuilder().addBuilder(i, CustomAttribute.getDefaultInstance());
        }

        public List<Builder> getGroupValuesBuilderList() {
            return getGroupValuesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<CustomAttribute, Builder, CustomAttributeOrBuilder> getGroupValuesFieldBuilder() {
            if (this.groupValuesBuilder_ == null) {
                this.groupValuesBuilder_ = new RepeatedFieldBuilderV3<>(this.groupValues_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.groupValues_ = null;
            }
            return this.groupValuesBuilder_;
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

    public static CustomAttribute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CustomAttribute> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<CustomAttribute> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public CustomAttribute getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
