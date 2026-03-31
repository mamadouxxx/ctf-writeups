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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OpenLink extends GeneratedMessageV3 implements OpenLinkOrBuilder {
    public static final int ON_CLOSE_FIELD_NUMBER = 3;
    public static final int OPEN_AS_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int onClose_;
    private int openAs_;
    private volatile Object url_;
    private static final OpenLink DEFAULT_INSTANCE = new OpenLink();
    private static final Parser<OpenLink> PARSER = new AbstractParser<OpenLink>() { // from class: com.google.apps.card.v1.OpenLink.1
        @Override // com.google.protobuf.Parser
        public OpenLink parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = OpenLink.newBuilder();
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

    private OpenLink(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.url_ = "";
        this.openAs_ = 0;
        this.onClose_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private OpenLink() {
        this.url_ = "";
        this.openAs_ = 0;
        this.onClose_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.url_ = "";
        this.openAs_ = 0;
        this.onClose_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new OpenLink();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_OpenLink_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenLink.class, Builder.class);
    }

    public enum OpenAs implements ProtocolMessageEnum {
        FULL_SIZE(0),
        OVERLAY(1),
        UNRECOGNIZED(-1);

        public static final int FULL_SIZE_VALUE = 0;
        public static final int OVERLAY_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<OpenAs> internalValueMap = new Internal.EnumLiteMap<OpenAs>() { // from class: com.google.apps.card.v1.OpenLink.OpenAs.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public OpenAs findValueByNumber(int i) {
                return OpenAs.forNumber(i);
            }
        };
        private static final OpenAs[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static OpenAs valueOf(int i) {
            return forNumber(i);
        }

        public static OpenAs forNumber(int i) {
            if (i == 0) {
                return FULL_SIZE;
            }
            if (i != 1) {
                return null;
            }
            return OVERLAY;
        }

        public static Internal.EnumLiteMap<OpenAs> internalGetValueMap() {
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
            return OpenLink.getDescriptor().getEnumTypes().get(0);
        }

        public static OpenAs valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        OpenAs(int i) {
            this.value = i;
        }
    }

    public enum OnClose implements ProtocolMessageEnum {
        NOTHING(0),
        RELOAD(1),
        UNRECOGNIZED(-1);

        public static final int NOTHING_VALUE = 0;
        public static final int RELOAD_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<OnClose> internalValueMap = new Internal.EnumLiteMap<OnClose>() { // from class: com.google.apps.card.v1.OpenLink.OnClose.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public OnClose findValueByNumber(int i) {
                return OnClose.forNumber(i);
            }
        };
        private static final OnClose[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static OnClose valueOf(int i) {
            return forNumber(i);
        }

        public static OnClose forNumber(int i) {
            if (i == 0) {
                return NOTHING;
            }
            if (i != 1) {
                return null;
            }
            return RELOAD;
        }

        public static Internal.EnumLiteMap<OnClose> internalGetValueMap() {
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
            return OpenLink.getDescriptor().getEnumTypes().get(1);
        }

        public static OnClose valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        OnClose(int i) {
            this.value = i;
        }
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public String getUrl() {
        Object obj = this.url_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.url_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public ByteString getUrlBytes() {
        Object obj = this.url_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public int getOpenAsValue() {
        return this.openAs_;
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public OpenAs getOpenAs() {
        OpenAs openAsForNumber = OpenAs.forNumber(this.openAs_);
        return openAsForNumber == null ? OpenAs.UNRECOGNIZED : openAsForNumber;
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public int getOnCloseValue() {
        return this.onClose_;
    }

    @Override // com.google.apps.card.v1.OpenLinkOrBuilder
    public OnClose getOnClose() {
        OnClose onCloseForNumber = OnClose.forNumber(this.onClose_);
        return onCloseForNumber == null ? OnClose.UNRECOGNIZED : onCloseForNumber;
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
        if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
        }
        if (this.openAs_ != OpenAs.FULL_SIZE.getNumber()) {
            codedOutputStream.writeEnum(2, this.openAs_);
        }
        if (this.onClose_ != OnClose.NOTHING.getNumber()) {
            codedOutputStream.writeEnum(3, this.onClose_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.url_) ? GeneratedMessageV3.computeStringSize(1, this.url_) : 0;
        if (this.openAs_ != OpenAs.FULL_SIZE.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.openAs_);
        }
        if (this.onClose_ != OnClose.NOTHING.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.onClose_);
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
        if (!(obj instanceof OpenLink)) {
            return super.equals(obj);
        }
        OpenLink openLink = (OpenLink) obj;
        return getUrl().equals(openLink.getUrl()) && this.openAs_ == openLink.openAs_ && this.onClose_ == openLink.onClose_ && getUnknownFields().equals(openLink.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + this.openAs_) * 37) + 3) * 53) + this.onClose_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static OpenLink parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static OpenLink parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static OpenLink parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static OpenLink parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static OpenLink parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static OpenLink parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static OpenLink parseFrom(InputStream inputStream) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static OpenLink parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OpenLink parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OpenLink parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static OpenLink parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static OpenLink parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OpenLink) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(OpenLink openLink) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openLink);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenLinkOrBuilder {
        private int bitField0_;
        private int onClose_;
        private int openAs_;
        private Object url_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_OpenLink_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenLink.class, Builder.class);
        }

        private Builder() {
            this.url_ = "";
            this.openAs_ = 0;
            this.onClose_ = 0;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.url_ = "";
            this.openAs_ = 0;
            this.onClose_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.url_ = "";
            this.openAs_ = 0;
            this.onClose_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_OpenLink_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenLink getDefaultInstanceForType() {
            return OpenLink.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OpenLink build() {
            OpenLink openLinkBuildPartial = buildPartial();
            if (openLinkBuildPartial.isInitialized()) {
                return openLinkBuildPartial;
            }
            throw newUninitializedMessageException((Message) openLinkBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public OpenLink buildPartial() {
            OpenLink openLink = new OpenLink(this);
            if (this.bitField0_ != 0) {
                buildPartial0(openLink);
            }
            onBuilt();
            return openLink;
        }

        private void buildPartial0(OpenLink openLink) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                openLink.url_ = this.url_;
            }
            if ((i & 2) != 0) {
                openLink.openAs_ = this.openAs_;
            }
            if ((i & 4) != 0) {
                openLink.onClose_ = this.onClose_;
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
            if (message instanceof OpenLink) {
                return mergeFrom((OpenLink) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(OpenLink openLink) {
            if (openLink == OpenLink.getDefaultInstance()) {
                return this;
            }
            if (!openLink.getUrl().isEmpty()) {
                this.url_ = openLink.url_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (openLink.openAs_ != 0) {
                setOpenAsValue(openLink.getOpenAsValue());
            }
            if (openLink.onClose_ != 0) {
                setOnCloseValue(openLink.getOnCloseValue());
            }
            mergeUnknownFields(openLink.getUnknownFields());
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
                                this.url_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.openAs_ = codedInputStream.readEnum();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.onClose_ = codedInputStream.readEnum();
                                this.bitField0_ |= 4;
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

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setUrl(String str) {
            str.getClass();
            this.url_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearUrl() {
            this.url_ = OpenLink.getDefaultInstance().getUrl();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            byteString.getClass();
            OpenLink.checkByteStringIsUtf8(byteString);
            this.url_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public int getOpenAsValue() {
            return this.openAs_;
        }

        public Builder setOpenAsValue(int i) {
            this.openAs_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public OpenAs getOpenAs() {
            OpenAs openAsForNumber = OpenAs.forNumber(this.openAs_);
            return openAsForNumber == null ? OpenAs.UNRECOGNIZED : openAsForNumber;
        }

        public Builder setOpenAs(OpenAs openAs) {
            openAs.getClass();
            this.bitField0_ |= 2;
            this.openAs_ = openAs.getNumber();
            onChanged();
            return this;
        }

        public Builder clearOpenAs() {
            this.bitField0_ &= -3;
            this.openAs_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public int getOnCloseValue() {
            return this.onClose_;
        }

        public Builder setOnCloseValue(int i) {
            this.onClose_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.OpenLinkOrBuilder
        public OnClose getOnClose() {
            OnClose onCloseForNumber = OnClose.forNumber(this.onClose_);
            return onCloseForNumber == null ? OnClose.UNRECOGNIZED : onCloseForNumber;
        }

        public Builder setOnClose(OnClose onClose) {
            onClose.getClass();
            this.bitField0_ |= 4;
            this.onClose_ = onClose.getNumber();
            onChanged();
            return this;
        }

        public Builder clearOnClose() {
            this.bitField0_ &= -5;
            this.onClose_ = 0;
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

    public static OpenLink getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<OpenLink> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<OpenLink> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public OpenLink getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
