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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommonLanguageSettings extends GeneratedMessageV3 implements CommonLanguageSettingsOrBuilder {
    public static final int DESTINATIONS_FIELD_NUMBER = 2;
    public static final int REFERENCE_DOCS_URI_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int destinationsMemoizedSerializedSize;
    private List<Integer> destinations_;
    private byte memoizedIsInitialized;
    private volatile Object referenceDocsUri_;
    private static final Internal.ListAdapter.Converter<Integer, ClientLibraryDestination> destinations_converter_ = new Internal.ListAdapter.Converter<Integer, ClientLibraryDestination>() { // from class: com.google.api.CommonLanguageSettings.1
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public ClientLibraryDestination convert(Integer num) {
            ClientLibraryDestination clientLibraryDestinationForNumber = ClientLibraryDestination.forNumber(num.intValue());
            return clientLibraryDestinationForNumber == null ? ClientLibraryDestination.UNRECOGNIZED : clientLibraryDestinationForNumber;
        }
    };
    private static final CommonLanguageSettings DEFAULT_INSTANCE = new CommonLanguageSettings();
    private static final Parser<CommonLanguageSettings> PARSER = new AbstractParser<CommonLanguageSettings>() { // from class: com.google.api.CommonLanguageSettings.2
        @Override // com.google.protobuf.Parser
        public CommonLanguageSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = CommonLanguageSettings.newBuilder();
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

    private CommonLanguageSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.referenceDocsUri_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private CommonLanguageSettings() {
        this.referenceDocsUri_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.referenceDocsUri_ = "";
        this.destinations_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CommonLanguageSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_CommonLanguageSettings_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_CommonLanguageSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(CommonLanguageSettings.class, Builder.class);
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    @Deprecated
    public String getReferenceDocsUri() {
        Object obj = this.referenceDocsUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.referenceDocsUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    @Deprecated
    public ByteString getReferenceDocsUriBytes() {
        Object obj = this.referenceDocsUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.referenceDocsUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    public List<ClientLibraryDestination> getDestinationsList() {
        return new Internal.ListAdapter(this.destinations_, destinations_converter_);
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    public int getDestinationsCount() {
        return this.destinations_.size();
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    public ClientLibraryDestination getDestinations(int i) {
        return destinations_converter_.convert(this.destinations_.get(i));
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    public List<Integer> getDestinationsValueList() {
        return this.destinations_;
    }

    @Override // com.google.api.CommonLanguageSettingsOrBuilder
    public int getDestinationsValue(int i) {
        return this.destinations_.get(i).intValue();
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
        getSerializedSize();
        if (!GeneratedMessageV3.isStringEmpty(this.referenceDocsUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.referenceDocsUri_);
        }
        if (getDestinationsList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(18);
            codedOutputStream.writeUInt32NoTag(this.destinationsMemoizedSerializedSize);
        }
        for (int i = 0; i < this.destinations_.size(); i++) {
            codedOutputStream.writeEnumNoTag(this.destinations_.get(i).intValue());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.referenceDocsUri_) ? GeneratedMessageV3.computeStringSize(1, this.referenceDocsUri_) : 0;
        int iComputeEnumSizeNoTag = 0;
        for (int i2 = 0; i2 < this.destinations_.size(); i2++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.destinations_.get(i2).intValue());
        }
        int iComputeUInt32SizeNoTag = iComputeStringSize + iComputeEnumSizeNoTag;
        if (!getDestinationsList().isEmpty()) {
            iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + CodedOutputStream.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
        }
        this.destinationsMemoizedSerializedSize = iComputeEnumSizeNoTag;
        int serializedSize = iComputeUInt32SizeNoTag + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonLanguageSettings)) {
            return super.equals(obj);
        }
        CommonLanguageSettings commonLanguageSettings = (CommonLanguageSettings) obj;
        return getReferenceDocsUri().equals(commonLanguageSettings.getReferenceDocsUri()) && this.destinations_.equals(commonLanguageSettings.destinations_) && getUnknownFields().equals(commonLanguageSettings.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getReferenceDocsUri().hashCode();
        if (getDestinationsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + this.destinations_.hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static CommonLanguageSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static CommonLanguageSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CommonLanguageSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static CommonLanguageSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CommonLanguageSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static CommonLanguageSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CommonLanguageSettings parseFrom(InputStream inputStream) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CommonLanguageSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CommonLanguageSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CommonLanguageSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CommonLanguageSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CommonLanguageSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonLanguageSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CommonLanguageSettings commonLanguageSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(commonLanguageSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CommonLanguageSettingsOrBuilder {
        private int bitField0_;
        private List<Integer> destinations_;
        private Object referenceDocsUri_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_CommonLanguageSettings_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_CommonLanguageSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(CommonLanguageSettings.class, Builder.class);
        }

        private Builder() {
            this.referenceDocsUri_ = "";
            this.destinations_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.referenceDocsUri_ = "";
            this.destinations_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.referenceDocsUri_ = "";
            this.destinations_ = Collections.emptyList();
            this.bitField0_ &= -3;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_CommonLanguageSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CommonLanguageSettings getDefaultInstanceForType() {
            return CommonLanguageSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CommonLanguageSettings build() {
            CommonLanguageSettings commonLanguageSettingsBuildPartial = buildPartial();
            if (commonLanguageSettingsBuildPartial.isInitialized()) {
                return commonLanguageSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) commonLanguageSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CommonLanguageSettings buildPartial() {
            CommonLanguageSettings commonLanguageSettings = new CommonLanguageSettings(this);
            buildPartialRepeatedFields(commonLanguageSettings);
            if (this.bitField0_ != 0) {
                buildPartial0(commonLanguageSettings);
            }
            onBuilt();
            return commonLanguageSettings;
        }

        private void buildPartialRepeatedFields(CommonLanguageSettings commonLanguageSettings) {
            if ((this.bitField0_ & 2) != 0) {
                this.destinations_ = Collections.unmodifiableList(this.destinations_);
                this.bitField0_ &= -3;
            }
            commonLanguageSettings.destinations_ = this.destinations_;
        }

        private void buildPartial0(CommonLanguageSettings commonLanguageSettings) {
            if ((this.bitField0_ & 1) != 0) {
                commonLanguageSettings.referenceDocsUri_ = this.referenceDocsUri_;
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
            if (message instanceof CommonLanguageSettings) {
                return mergeFrom((CommonLanguageSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CommonLanguageSettings commonLanguageSettings) {
            if (commonLanguageSettings == CommonLanguageSettings.getDefaultInstance()) {
                return this;
            }
            if (!commonLanguageSettings.getReferenceDocsUri().isEmpty()) {
                this.referenceDocsUri_ = commonLanguageSettings.referenceDocsUri_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!commonLanguageSettings.destinations_.isEmpty()) {
                if (this.destinations_.isEmpty()) {
                    this.destinations_ = commonLanguageSettings.destinations_;
                    this.bitField0_ &= -3;
                } else {
                    ensureDestinationsIsMutable();
                    this.destinations_.addAll(commonLanguageSettings.destinations_);
                }
                onChanged();
            }
            mergeUnknownFields(commonLanguageSettings.getUnknownFields());
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
                                this.referenceDocsUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                int i = codedInputStream.readEnum();
                                ensureDestinationsIsMutable();
                                this.destinations_.add(Integer.valueOf(i));
                            } else if (tag == 18) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i2 = codedInputStream.readEnum();
                                    ensureDestinationsIsMutable();
                                    this.destinations_.add(Integer.valueOf(i2));
                                }
                                codedInputStream.popLimit(iPushLimit);
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

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        @Deprecated
        public String getReferenceDocsUri() {
            Object obj = this.referenceDocsUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.referenceDocsUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        @Deprecated
        public ByteString getReferenceDocsUriBytes() {
            Object obj = this.referenceDocsUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.referenceDocsUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Deprecated
        public Builder setReferenceDocsUri(String str) {
            str.getClass();
            this.referenceDocsUri_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearReferenceDocsUri() {
            this.referenceDocsUri_ = CommonLanguageSettings.getDefaultInstance().getReferenceDocsUri();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setReferenceDocsUriBytes(ByteString byteString) {
            byteString.getClass();
            CommonLanguageSettings.checkByteStringIsUtf8(byteString);
            this.referenceDocsUri_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureDestinationsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.destinations_ = new ArrayList(this.destinations_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        public List<ClientLibraryDestination> getDestinationsList() {
            return new Internal.ListAdapter(this.destinations_, CommonLanguageSettings.destinations_converter_);
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        public int getDestinationsCount() {
            return this.destinations_.size();
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        public ClientLibraryDestination getDestinations(int i) {
            return (ClientLibraryDestination) CommonLanguageSettings.destinations_converter_.convert(this.destinations_.get(i));
        }

        public Builder setDestinations(int i, ClientLibraryDestination clientLibraryDestination) {
            clientLibraryDestination.getClass();
            ensureDestinationsIsMutable();
            this.destinations_.set(i, Integer.valueOf(clientLibraryDestination.getNumber()));
            onChanged();
            return this;
        }

        public Builder addDestinations(ClientLibraryDestination clientLibraryDestination) {
            clientLibraryDestination.getClass();
            ensureDestinationsIsMutable();
            this.destinations_.add(Integer.valueOf(clientLibraryDestination.getNumber()));
            onChanged();
            return this;
        }

        public Builder addAllDestinations(Iterable<? extends ClientLibraryDestination> iterable) {
            ensureDestinationsIsMutable();
            Iterator<? extends ClientLibraryDestination> it = iterable.iterator();
            while (it.hasNext()) {
                this.destinations_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder clearDestinations() {
            this.destinations_ = Collections.emptyList();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        public List<Integer> getDestinationsValueList() {
            return Collections.unmodifiableList(this.destinations_);
        }

        @Override // com.google.api.CommonLanguageSettingsOrBuilder
        public int getDestinationsValue(int i) {
            return this.destinations_.get(i).intValue();
        }

        public Builder setDestinationsValue(int i, int i2) {
            ensureDestinationsIsMutable();
            this.destinations_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder addDestinationsValue(int i) {
            ensureDestinationsIsMutable();
            this.destinations_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addAllDestinationsValue(Iterable<Integer> iterable) {
            ensureDestinationsIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.destinations_.add(Integer.valueOf(it.next().intValue()));
            }
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

    public static CommonLanguageSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CommonLanguageSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<CommonLanguageSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public CommonLanguageSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
