package com.google.apps.card.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialIcon extends GeneratedMessageV3 implements MaterialIconOrBuilder {
    public static final int FILL_FIELD_NUMBER = 2;
    public static final int GRADE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private boolean fill_;
    private int grade_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int weight_;
    private static final MaterialIcon DEFAULT_INSTANCE = new MaterialIcon();
    private static final Parser<MaterialIcon> PARSER = new AbstractParser<MaterialIcon>() { // from class: com.google.apps.card.v1.MaterialIcon.1
        @Override // com.google.protobuf.Parser
        public MaterialIcon parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = MaterialIcon.newBuilder();
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

    private MaterialIcon(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.fill_ = false;
        this.weight_ = 0;
        this.grade_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private MaterialIcon() {
        this.name_ = "";
        this.fill_ = false;
        this.weight_ = 0;
        this.grade_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MaterialIcon();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_MaterialIcon_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialIcon.class, Builder.class);
    }

    @Override // com.google.apps.card.v1.MaterialIconOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.MaterialIconOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.MaterialIconOrBuilder
    public boolean getFill() {
        return this.fill_;
    }

    @Override // com.google.apps.card.v1.MaterialIconOrBuilder
    public int getWeight() {
        return this.weight_;
    }

    @Override // com.google.apps.card.v1.MaterialIconOrBuilder
    public int getGrade() {
        return this.grade_;
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
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        boolean z = this.fill_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        int i = this.weight_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        int i2 = this.grade_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        boolean z = this.fill_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(2, z);
        }
        int i2 = this.weight_;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(3, i2);
        }
        int i3 = this.grade_;
        if (i3 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(4, i3);
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
        if (!(obj instanceof MaterialIcon)) {
            return super.equals(obj);
        }
        MaterialIcon materialIcon = (MaterialIcon) obj;
        return getName().equals(materialIcon.getName()) && getFill() == materialIcon.getFill() && getWeight() == materialIcon.getWeight() && getGrade() == materialIcon.getGrade() && getUnknownFields().equals(materialIcon.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getFill())) * 37) + 3) * 53) + getWeight()) * 37) + 4) * 53) + getGrade()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static MaterialIcon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static MaterialIcon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MaterialIcon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static MaterialIcon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MaterialIcon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static MaterialIcon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MaterialIcon parseFrom(InputStream inputStream) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MaterialIcon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MaterialIcon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MaterialIcon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MaterialIcon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MaterialIcon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialIcon) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MaterialIcon materialIcon) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(materialIcon);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MaterialIconOrBuilder {
        private int bitField0_;
        private boolean fill_;
        private int grade_;
        private Object name_;
        private int weight_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_MaterialIcon_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_MaterialIcon_fieldAccessorTable.ensureFieldAccessorsInitialized(MaterialIcon.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.fill_ = false;
            this.weight_ = 0;
            this.grade_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_MaterialIcon_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MaterialIcon getDefaultInstanceForType() {
            return MaterialIcon.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MaterialIcon build() {
            MaterialIcon materialIconBuildPartial = buildPartial();
            if (materialIconBuildPartial.isInitialized()) {
                return materialIconBuildPartial;
            }
            throw newUninitializedMessageException((Message) materialIconBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MaterialIcon buildPartial() {
            MaterialIcon materialIcon = new MaterialIcon(this);
            if (this.bitField0_ != 0) {
                buildPartial0(materialIcon);
            }
            onBuilt();
            return materialIcon;
        }

        private void buildPartial0(MaterialIcon materialIcon) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                materialIcon.name_ = this.name_;
            }
            if ((i & 2) != 0) {
                materialIcon.fill_ = this.fill_;
            }
            if ((i & 4) != 0) {
                materialIcon.weight_ = this.weight_;
            }
            if ((i & 8) != 0) {
                materialIcon.grade_ = this.grade_;
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
            if (message instanceof MaterialIcon) {
                return mergeFrom((MaterialIcon) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MaterialIcon materialIcon) {
            if (materialIcon == MaterialIcon.getDefaultInstance()) {
                return this;
            }
            if (!materialIcon.getName().isEmpty()) {
                this.name_ = materialIcon.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (materialIcon.getFill()) {
                setFill(materialIcon.getFill());
            }
            if (materialIcon.getWeight() != 0) {
                setWeight(materialIcon.getWeight());
            }
            if (materialIcon.getGrade() != 0) {
                setGrade(materialIcon.getGrade());
            }
            mergeUnknownFields(materialIcon.getUnknownFields());
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
                            } else if (tag == 16) {
                                this.fill_ = codedInputStream.readBool();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.weight_ = codedInputStream.readInt32();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.grade_ = codedInputStream.readInt32();
                                this.bitField0_ |= 8;
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

        @Override // com.google.apps.card.v1.MaterialIconOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.MaterialIconOrBuilder
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
            this.name_ = MaterialIcon.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            MaterialIcon.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.MaterialIconOrBuilder
        public boolean getFill() {
            return this.fill_;
        }

        public Builder setFill(boolean z) {
            this.fill_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearFill() {
            this.bitField0_ &= -3;
            this.fill_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.MaterialIconOrBuilder
        public int getWeight() {
            return this.weight_;
        }

        public Builder setWeight(int i) {
            this.weight_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearWeight() {
            this.bitField0_ &= -5;
            this.weight_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.MaterialIconOrBuilder
        public int getGrade() {
            return this.grade_;
        }

        public Builder setGrade(int i) {
            this.grade_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearGrade() {
            this.bitField0_ &= -9;
            this.grade_ = 0;
            onChanged();
            return this;
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

    public static MaterialIcon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MaterialIcon> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MaterialIcon> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MaterialIcon getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
