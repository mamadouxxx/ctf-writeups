package com.google.api;

import com.google.api.CommonLanguageSettings;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class PhpSettings extends GeneratedMessageV3 implements PhpSettingsOrBuilder {
    public static final int COMMON_FIELD_NUMBER = 1;
    private static final PhpSettings DEFAULT_INSTANCE = new PhpSettings();
    private static final Parser<PhpSettings> PARSER = new AbstractParser<PhpSettings>() { // from class: com.google.api.PhpSettings.1
        @Override // com.google.protobuf.Parser
        public PhpSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = PhpSettings.newBuilder();
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
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private CommonLanguageSettings common_;
    private byte memoizedIsInitialized;

    static /* synthetic */ int access$576(PhpSettings phpSettings, int i) {
        int i2 = i | phpSettings.bitField0_;
        phpSettings.bitField0_ = i2;
        return i2;
    }

    private PhpSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private PhpSettings() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PhpSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_PhpSettings_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_PhpSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(PhpSettings.class, Builder.class);
    }

    @Override // com.google.api.PhpSettingsOrBuilder
    public boolean hasCommon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.PhpSettingsOrBuilder
    public CommonLanguageSettings getCommon() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
    }

    @Override // com.google.api.PhpSettingsOrBuilder
    public CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
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
            codedOutputStream.writeMessage(1, getCommon());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCommon()) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iComputeMessageSize;
        return iComputeMessageSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhpSettings)) {
            return super.equals(obj);
        }
        PhpSettings phpSettings = (PhpSettings) obj;
        if (hasCommon() != phpSettings.hasCommon()) {
            return false;
        }
        return (!hasCommon() || getCommon().equals(phpSettings.getCommon())) && getUnknownFields().equals(phpSettings.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasCommon()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getCommon().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static PhpSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static PhpSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static PhpSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static PhpSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static PhpSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static PhpSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static PhpSettings parseFrom(InputStream inputStream) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static PhpSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PhpSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PhpSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PhpSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PhpSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhpSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(PhpSettings phpSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(phpSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PhpSettingsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> commonBuilder_;
        private CommonLanguageSettings common_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_PhpSettings_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_PhpSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(PhpSettings.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (PhpSettings.alwaysUseFieldBuilders) {
                getCommonFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.common_ = null;
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.commonBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_PhpSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PhpSettings getDefaultInstanceForType() {
            return PhpSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PhpSettings build() {
            PhpSettings phpSettingsBuildPartial = buildPartial();
            if (phpSettingsBuildPartial.isInitialized()) {
                return phpSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) phpSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PhpSettings buildPartial() {
            PhpSettings phpSettings = new PhpSettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(phpSettings);
            }
            onBuilt();
            return phpSettings;
        }

        private void buildPartial0(PhpSettings phpSettings) {
            int i = 1;
            if ((this.bitField0_ & 1) != 0) {
                SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
                phpSettings.common_ = singleFieldBuilderV3 == null ? this.common_ : (CommonLanguageSettings) singleFieldBuilderV3.build();
            } else {
                i = 0;
            }
            PhpSettings.access$576(phpSettings, i);
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
            if (message instanceof PhpSettings) {
                return mergeFrom((PhpSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(PhpSettings phpSettings) {
            if (phpSettings == PhpSettings.getDefaultInstance()) {
                return this;
            }
            if (phpSettings.hasCommon()) {
                mergeCommon(phpSettings.getCommon());
            }
            mergeUnknownFields(phpSettings.getUnknownFields());
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
                                codedInputStream.readMessage(getCommonFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.api.PhpSettingsOrBuilder
        public boolean hasCommon() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.PhpSettingsOrBuilder
        public CommonLanguageSettings getCommon() {
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 == null) {
                CommonLanguageSettings commonLanguageSettings = this.common_;
                return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
            }
            return (CommonLanguageSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setCommon(CommonLanguageSettings commonLanguageSettings) {
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 == null) {
                commonLanguageSettings.getClass();
                this.common_ = commonLanguageSettings;
            } else {
                singleFieldBuilderV3.setMessage(commonLanguageSettings);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setCommon(CommonLanguageSettings.Builder builder) {
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.common_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder mergeCommon(CommonLanguageSettings commonLanguageSettings) {
            CommonLanguageSettings commonLanguageSettings2;
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (commonLanguageSettings2 = this.common_) != null && commonLanguageSettings2 != CommonLanguageSettings.getDefaultInstance()) {
                    getCommonBuilder().mergeFrom(commonLanguageSettings);
                } else {
                    this.common_ = commonLanguageSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(commonLanguageSettings);
            }
            if (this.common_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder clearCommon() {
            this.bitField0_ &= -2;
            this.common_ = null;
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.commonBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public CommonLanguageSettings.Builder getCommonBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (CommonLanguageSettings.Builder) getCommonFieldBuilder().getBuilder();
        }

        @Override // com.google.api.PhpSettingsOrBuilder
        public CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CommonLanguageSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CommonLanguageSettings commonLanguageSettings = this.common_;
            return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
        }

        private SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> getCommonFieldBuilder() {
            if (this.commonBuilder_ == null) {
                this.commonBuilder_ = new SingleFieldBuilderV3<>(getCommon(), getParentForChildren(), isClean());
                this.common_ = null;
            }
            return this.commonBuilder_;
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

    public static PhpSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PhpSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<PhpSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public PhpSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
