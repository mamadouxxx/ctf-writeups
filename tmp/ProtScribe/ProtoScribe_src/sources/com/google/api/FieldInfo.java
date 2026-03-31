package com.google.api;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FieldInfo extends GeneratedMessageV3 implements FieldInfoOrBuilder {
    public static final int FORMAT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int format_;
    private byte memoizedIsInitialized;
    private static final FieldInfo DEFAULT_INSTANCE = new FieldInfo();
    private static final Parser<FieldInfo> PARSER = new AbstractParser<FieldInfo>() { // from class: com.google.api.FieldInfo.1
        @Override // com.google.protobuf.Parser
        public FieldInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = FieldInfo.newBuilder();
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

    private FieldInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.format_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private FieldInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.format_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new FieldInfo();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return FieldInfoProto.internal_static_google_api_FieldInfo_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return FieldInfoProto.internal_static_google_api_FieldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldInfo.class, Builder.class);
    }

    public enum Format implements ProtocolMessageEnum {
        FORMAT_UNSPECIFIED(0),
        UUID4(1),
        IPV4(2),
        IPV6(3),
        IPV4_OR_IPV6(4),
        UNRECOGNIZED(-1);

        public static final int FORMAT_UNSPECIFIED_VALUE = 0;
        public static final int IPV4_OR_IPV6_VALUE = 4;
        public static final int IPV4_VALUE = 2;
        public static final int IPV6_VALUE = 3;
        public static final int UUID4_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<Format> internalValueMap = new Internal.EnumLiteMap<Format>() { // from class: com.google.api.FieldInfo.Format.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Format findValueByNumber(int i) {
                return Format.forNumber(i);
            }
        };
        private static final Format[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Format valueOf(int i) {
            return forNumber(i);
        }

        public static Format forNumber(int i) {
            if (i == 0) {
                return FORMAT_UNSPECIFIED;
            }
            if (i == 1) {
                return UUID4;
            }
            if (i == 2) {
                return IPV4;
            }
            if (i == 3) {
                return IPV6;
            }
            if (i != 4) {
                return null;
            }
            return IPV4_OR_IPV6;
        }

        public static Internal.EnumLiteMap<Format> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return FieldInfo.getDescriptor().getEnumTypes().get(0);
        }

        public static Format valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        Format(int i) {
            this.value = i;
        }
    }

    @Override // com.google.api.FieldInfoOrBuilder
    public int getFormatValue() {
        return this.format_;
    }

    @Override // com.google.api.FieldInfoOrBuilder
    public Format getFormat() {
        Format formatForNumber = Format.forNumber(this.format_);
        return formatForNumber == null ? Format.UNRECOGNIZED : formatForNumber;
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
        if (this.format_ != Format.FORMAT_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.format_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = (this.format_ != Format.FORMAT_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.format_) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeEnumSize;
        return iComputeEnumSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldInfo)) {
            return super.equals(obj);
        }
        FieldInfo fieldInfo = (FieldInfo) obj;
        return this.format_ == fieldInfo.format_ && getUnknownFields().equals(fieldInfo.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.format_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static FieldInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static FieldInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static FieldInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static FieldInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static FieldInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static FieldInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static FieldInfo parseFrom(InputStream inputStream) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static FieldInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static FieldInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FieldInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static FieldInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static FieldInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FieldInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(FieldInfo fieldInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(fieldInfo);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FieldInfoOrBuilder {
        private int bitField0_;
        private int format_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FieldInfoProto.internal_static_google_api_FieldInfo_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return FieldInfoProto.internal_static_google_api_FieldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FieldInfo.class, Builder.class);
        }

        private Builder() {
            this.format_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.format_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.format_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return FieldInfoProto.internal_static_google_api_FieldInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FieldInfo getDefaultInstanceForType() {
            return FieldInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public FieldInfo build() {
            FieldInfo fieldInfoBuildPartial = buildPartial();
            if (fieldInfoBuildPartial.isInitialized()) {
                return fieldInfoBuildPartial;
            }
            throw newUninitializedMessageException((Message) fieldInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public FieldInfo buildPartial() {
            FieldInfo fieldInfo = new FieldInfo(this);
            if (this.bitField0_ != 0) {
                buildPartial0(fieldInfo);
            }
            onBuilt();
            return fieldInfo;
        }

        private void buildPartial0(FieldInfo fieldInfo) {
            if ((this.bitField0_ & 1) != 0) {
                fieldInfo.format_ = this.format_;
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
            if (message instanceof FieldInfo) {
                return mergeFrom((FieldInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(FieldInfo fieldInfo) {
            if (fieldInfo == FieldInfo.getDefaultInstance()) {
                return this;
            }
            if (fieldInfo.format_ != 0) {
                setFormatValue(fieldInfo.getFormatValue());
            }
            mergeUnknownFields(fieldInfo.getUnknownFields());
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
                            if (tag == 8) {
                                this.format_ = codedInputStream.readEnum();
                                this.bitField0_ |= 1;
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

        @Override // com.google.api.FieldInfoOrBuilder
        public int getFormatValue() {
            return this.format_;
        }

        public Builder setFormatValue(int i) {
            this.format_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.api.FieldInfoOrBuilder
        public Format getFormat() {
            Format formatForNumber = Format.forNumber(this.format_);
            return formatForNumber == null ? Format.UNRECOGNIZED : formatForNumber;
        }

        public Builder setFormat(Format format) {
            format.getClass();
            this.bitField0_ |= 1;
            this.format_ = format.getNumber();
            onChanged();
            return this;
        }

        public Builder clearFormat() {
            this.bitField0_ &= -2;
            this.format_ = 0;
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

    public static FieldInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<FieldInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<FieldInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public FieldInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
