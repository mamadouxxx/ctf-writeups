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
public final class NodeSettings extends GeneratedMessageV3 implements NodeSettingsOrBuilder {
    public static final int COMMON_FIELD_NUMBER = 1;
    private static final NodeSettings DEFAULT_INSTANCE = new NodeSettings();
    private static final Parser<NodeSettings> PARSER = new AbstractParser<NodeSettings>() { // from class: com.google.api.NodeSettings.1
        @Override // com.google.protobuf.Parser
        public NodeSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = NodeSettings.newBuilder();
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

    static /* synthetic */ int access$576(NodeSettings nodeSettings, int i) {
        int i2 = i | nodeSettings.bitField0_;
        nodeSettings.bitField0_ = i2;
        return i2;
    }

    private NodeSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private NodeSettings() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new NodeSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_NodeSettings_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_NodeSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(NodeSettings.class, Builder.class);
    }

    @Override // com.google.api.NodeSettingsOrBuilder
    public boolean hasCommon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.NodeSettingsOrBuilder
    public CommonLanguageSettings getCommon() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
    }

    @Override // com.google.api.NodeSettingsOrBuilder
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
        if (!(obj instanceof NodeSettings)) {
            return super.equals(obj);
        }
        NodeSettings nodeSettings = (NodeSettings) obj;
        if (hasCommon() != nodeSettings.hasCommon()) {
            return false;
        }
        return (!hasCommon() || getCommon().equals(nodeSettings.getCommon())) && getUnknownFields().equals(nodeSettings.getUnknownFields());
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

    public static NodeSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static NodeSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static NodeSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static NodeSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static NodeSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static NodeSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static NodeSettings parseFrom(InputStream inputStream) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static NodeSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static NodeSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static NodeSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static NodeSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static NodeSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NodeSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(NodeSettings nodeSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(nodeSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NodeSettingsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> commonBuilder_;
        private CommonLanguageSettings common_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_NodeSettings_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_NodeSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(NodeSettings.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (NodeSettings.alwaysUseFieldBuilders) {
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
            return ClientProto.internal_static_google_api_NodeSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NodeSettings getDefaultInstanceForType() {
            return NodeSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public NodeSettings build() {
            NodeSettings nodeSettingsBuildPartial = buildPartial();
            if (nodeSettingsBuildPartial.isInitialized()) {
                return nodeSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) nodeSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public NodeSettings buildPartial() {
            NodeSettings nodeSettings = new NodeSettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(nodeSettings);
            }
            onBuilt();
            return nodeSettings;
        }

        private void buildPartial0(NodeSettings nodeSettings) {
            int i = 1;
            if ((this.bitField0_ & 1) != 0) {
                SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
                nodeSettings.common_ = singleFieldBuilderV3 == null ? this.common_ : (CommonLanguageSettings) singleFieldBuilderV3.build();
            } else {
                i = 0;
            }
            NodeSettings.access$576(nodeSettings, i);
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
            if (message instanceof NodeSettings) {
                return mergeFrom((NodeSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(NodeSettings nodeSettings) {
            if (nodeSettings == NodeSettings.getDefaultInstance()) {
                return this;
            }
            if (nodeSettings.hasCommon()) {
                mergeCommon(nodeSettings.getCommon());
            }
            mergeUnknownFields(nodeSettings.getUnknownFields());
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

        @Override // com.google.api.NodeSettingsOrBuilder
        public boolean hasCommon() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.NodeSettingsOrBuilder
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

        @Override // com.google.api.NodeSettingsOrBuilder
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

    public static NodeSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NodeSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<NodeSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public NodeSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
