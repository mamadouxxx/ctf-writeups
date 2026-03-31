package com.google.api;

import com.google.api.CommonLanguageSettings;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DotnetSettings extends GeneratedMessageV3 implements DotnetSettingsOrBuilder {
    public static final int COMMON_FIELD_NUMBER = 1;
    public static final int FORCED_NAMESPACE_ALIASES_FIELD_NUMBER = 5;
    public static final int HANDWRITTEN_SIGNATURES_FIELD_NUMBER = 6;
    public static final int IGNORED_RESOURCES_FIELD_NUMBER = 4;
    public static final int RENAMED_RESOURCES_FIELD_NUMBER = 3;
    public static final int RENAMED_SERVICES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private CommonLanguageSettings common_;
    private LazyStringArrayList forcedNamespaceAliases_;
    private LazyStringArrayList handwrittenSignatures_;
    private LazyStringArrayList ignoredResources_;
    private byte memoizedIsInitialized;
    private MapField<String, String> renamedResources_;
    private MapField<String, String> renamedServices_;
    private static final DotnetSettings DEFAULT_INSTANCE = new DotnetSettings();
    private static final Parser<DotnetSettings> PARSER = new AbstractParser<DotnetSettings>() { // from class: com.google.api.DotnetSettings.1
        @Override // com.google.protobuf.Parser
        public DotnetSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = DotnetSettings.newBuilder();
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

    static /* synthetic */ int access$1076(DotnetSettings dotnetSettings, int i) {
        int i2 = i | dotnetSettings.bitField0_;
        dotnetSettings.bitField0_ = i2;
        return i2;
    }

    private DotnetSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.ignoredResources_ = LazyStringArrayList.emptyList();
        this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
        this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
    }

    private DotnetSettings() {
        this.ignoredResources_ = LazyStringArrayList.emptyList();
        this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
        this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
        this.memoizedIsInitialized = (byte) -1;
        this.ignoredResources_ = LazyStringArrayList.emptyList();
        this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
        this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new DotnetSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_DotnetSettings_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
        if (i == 2) {
            return internalGetRenamedServices();
        }
        if (i == 3) {
            return internalGetRenamedResources();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_DotnetSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(DotnetSettings.class, Builder.class);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public boolean hasCommon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public CommonLanguageSettings getCommon() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public CommonLanguageSettingsOrBuilder getCommonOrBuilder() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
    }

    private static final class RenamedServicesDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(ClientProto.internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private RenamedServicesDefaultEntryHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetRenamedServices() {
        MapField<String, String> mapField = this.renamedServices_;
        return mapField == null ? MapField.emptyMapField(RenamedServicesDefaultEntryHolder.defaultEntry) : mapField;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public int getRenamedServicesCount() {
        return internalGetRenamedServices().getMap().size();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public boolean containsRenamedServices(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        return internalGetRenamedServices().getMap().containsKey(str);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    @Deprecated
    public Map<String, String> getRenamedServices() {
        return getRenamedServicesMap();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public Map<String, String> getRenamedServicesMap() {
        return internalGetRenamedServices().getMap();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getRenamedServicesOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetRenamedServices().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getRenamedServicesOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetRenamedServices().getMap();
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return map.get(str);
    }

    private static final class RenamedResourcesDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(ClientProto.internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private RenamedResourcesDefaultEntryHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetRenamedResources() {
        MapField<String, String> mapField = this.renamedResources_;
        return mapField == null ? MapField.emptyMapField(RenamedResourcesDefaultEntryHolder.defaultEntry) : mapField;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public int getRenamedResourcesCount() {
        return internalGetRenamedResources().getMap().size();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public boolean containsRenamedResources(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        return internalGetRenamedResources().getMap().containsKey(str);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    @Deprecated
    public Map<String, String> getRenamedResources() {
        return getRenamedResourcesMap();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public Map<String, String> getRenamedResourcesMap() {
        return internalGetRenamedResources().getMap();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getRenamedResourcesOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetRenamedResources().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getRenamedResourcesOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetRenamedResources().getMap();
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return map.get(str);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ProtocolStringList getIgnoredResourcesList() {
        return this.ignoredResources_;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public int getIgnoredResourcesCount() {
        return this.ignoredResources_.size();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getIgnoredResources(int i) {
        return this.ignoredResources_.get(i);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ByteString getIgnoredResourcesBytes(int i) {
        return this.ignoredResources_.getByteString(i);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ProtocolStringList getForcedNamespaceAliasesList() {
        return this.forcedNamespaceAliases_;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public int getForcedNamespaceAliasesCount() {
        return this.forcedNamespaceAliases_.size();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getForcedNamespaceAliases(int i) {
        return this.forcedNamespaceAliases_.get(i);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ByteString getForcedNamespaceAliasesBytes(int i) {
        return this.forcedNamespaceAliases_.getByteString(i);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ProtocolStringList getHandwrittenSignaturesList() {
        return this.handwrittenSignatures_;
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public int getHandwrittenSignaturesCount() {
        return this.handwrittenSignatures_.size();
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public String getHandwrittenSignatures(int i) {
        return this.handwrittenSignatures_.get(i);
    }

    @Override // com.google.api.DotnetSettingsOrBuilder
    public ByteString getHandwrittenSignaturesBytes(int i) {
        return this.handwrittenSignatures_.getByteString(i);
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
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetRenamedServices(), RenamedServicesDefaultEntryHolder.defaultEntry, 2);
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetRenamedResources(), RenamedResourcesDefaultEntryHolder.defaultEntry, 3);
        for (int i = 0; i < this.ignoredResources_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.ignoredResources_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.forcedNamespaceAliases_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.forcedNamespaceAliases_.getRaw(i2));
        }
        for (int i3 = 0; i3 < this.handwrittenSignatures_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.handwrittenSignatures_.getRaw(i3));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCommon()) : 0;
        for (Map.Entry<String, String> entry : internalGetRenamedServices().getMap().entrySet()) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, RenamedServicesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        for (Map.Entry<String, String> entry2 : internalGetRenamedResources().getMap().entrySet()) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, RenamedResourcesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.ignoredResources_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.ignoredResources_.getRaw(i2));
        }
        int size = iComputeMessageSize + iComputeStringSizeNoTag + getIgnoredResourcesList().size();
        int iComputeStringSizeNoTag2 = 0;
        for (int i3 = 0; i3 < this.forcedNamespaceAliases_.size(); i3++) {
            iComputeStringSizeNoTag2 += computeStringSizeNoTag(this.forcedNamespaceAliases_.getRaw(i3));
        }
        int size2 = size + iComputeStringSizeNoTag2 + getForcedNamespaceAliasesList().size();
        int iComputeStringSizeNoTag3 = 0;
        for (int i4 = 0; i4 < this.handwrittenSignatures_.size(); i4++) {
            iComputeStringSizeNoTag3 += computeStringSizeNoTag(this.handwrittenSignatures_.getRaw(i4));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + getHandwrittenSignaturesList().size() + getUnknownFields().getSerializedSize();
        this.memoizedSize = size3;
        return size3;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DotnetSettings)) {
            return super.equals(obj);
        }
        DotnetSettings dotnetSettings = (DotnetSettings) obj;
        if (hasCommon() != dotnetSettings.hasCommon()) {
            return false;
        }
        return (!hasCommon() || getCommon().equals(dotnetSettings.getCommon())) && internalGetRenamedServices().equals(dotnetSettings.internalGetRenamedServices()) && internalGetRenamedResources().equals(dotnetSettings.internalGetRenamedResources()) && getIgnoredResourcesList().equals(dotnetSettings.getIgnoredResourcesList()) && getForcedNamespaceAliasesList().equals(dotnetSettings.getForcedNamespaceAliasesList()) && getHandwrittenSignaturesList().equals(dotnetSettings.getHandwrittenSignaturesList()) && getUnknownFields().equals(dotnetSettings.getUnknownFields());
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
        if (!internalGetRenamedServices().getMap().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetRenamedServices().hashCode();
        }
        if (!internalGetRenamedResources().getMap().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetRenamedResources().hashCode();
        }
        if (getIgnoredResourcesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getIgnoredResourcesList().hashCode();
        }
        if (getForcedNamespaceAliasesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getForcedNamespaceAliasesList().hashCode();
        }
        if (getHandwrittenSignaturesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getHandwrittenSignaturesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static DotnetSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static DotnetSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DotnetSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static DotnetSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static DotnetSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static DotnetSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DotnetSettings parseFrom(InputStream inputStream) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DotnetSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DotnetSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DotnetSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DotnetSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DotnetSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DotnetSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DotnetSettings dotnetSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dotnetSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DotnetSettingsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> commonBuilder_;
        private CommonLanguageSettings common_;
        private LazyStringArrayList forcedNamespaceAliases_;
        private LazyStringArrayList handwrittenSignatures_;
        private LazyStringArrayList ignoredResources_;
        private MapField<String, String> renamedResources_;
        private MapField<String, String> renamedServices_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_DotnetSettings_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 2) {
                return internalGetRenamedServices();
            }
            if (i == 3) {
                return internalGetRenamedResources();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
            if (i == 2) {
                return internalGetMutableRenamedServices();
            }
            if (i == 3) {
                return internalGetMutableRenamedResources();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_DotnetSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(DotnetSettings.class, Builder.class);
        }

        private Builder() {
            this.ignoredResources_ = LazyStringArrayList.emptyList();
            this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
            this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.ignoredResources_ = LazyStringArrayList.emptyList();
            this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
            this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (DotnetSettings.alwaysUseFieldBuilders) {
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
            internalGetMutableRenamedServices().clear();
            internalGetMutableRenamedResources().clear();
            this.ignoredResources_ = LazyStringArrayList.emptyList();
            this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
            this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_DotnetSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DotnetSettings getDefaultInstanceForType() {
            return DotnetSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DotnetSettings build() {
            DotnetSettings dotnetSettingsBuildPartial = buildPartial();
            if (dotnetSettingsBuildPartial.isInitialized()) {
                return dotnetSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) dotnetSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DotnetSettings buildPartial() {
            DotnetSettings dotnetSettings = new DotnetSettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(dotnetSettings);
            }
            onBuilt();
            return dotnetSettings;
        }

        private void buildPartial0(DotnetSettings dotnetSettings) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
                dotnetSettings.common_ = singleFieldBuilderV3 == null ? this.common_ : (CommonLanguageSettings) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                dotnetSettings.renamedServices_ = internalGetRenamedServices();
                dotnetSettings.renamedServices_.makeImmutable();
            }
            if ((i2 & 4) != 0) {
                dotnetSettings.renamedResources_ = internalGetRenamedResources();
                dotnetSettings.renamedResources_.makeImmutable();
            }
            if ((i2 & 8) != 0) {
                this.ignoredResources_.makeImmutable();
                dotnetSettings.ignoredResources_ = this.ignoredResources_;
            }
            if ((i2 & 16) != 0) {
                this.forcedNamespaceAliases_.makeImmutable();
                dotnetSettings.forcedNamespaceAliases_ = this.forcedNamespaceAliases_;
            }
            if ((i2 & 32) != 0) {
                this.handwrittenSignatures_.makeImmutable();
                dotnetSettings.handwrittenSignatures_ = this.handwrittenSignatures_;
            }
            DotnetSettings.access$1076(dotnetSettings, i);
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
            if (message instanceof DotnetSettings) {
                return mergeFrom((DotnetSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DotnetSettings dotnetSettings) {
            if (dotnetSettings == DotnetSettings.getDefaultInstance()) {
                return this;
            }
            if (dotnetSettings.hasCommon()) {
                mergeCommon(dotnetSettings.getCommon());
            }
            internalGetMutableRenamedServices().mergeFrom(dotnetSettings.internalGetRenamedServices());
            this.bitField0_ |= 2;
            internalGetMutableRenamedResources().mergeFrom(dotnetSettings.internalGetRenamedResources());
            this.bitField0_ |= 4;
            if (!dotnetSettings.ignoredResources_.isEmpty()) {
                if (this.ignoredResources_.isEmpty()) {
                    this.ignoredResources_ = dotnetSettings.ignoredResources_;
                    this.bitField0_ |= 8;
                } else {
                    ensureIgnoredResourcesIsMutable();
                    this.ignoredResources_.addAll(dotnetSettings.ignoredResources_);
                }
                onChanged();
            }
            if (!dotnetSettings.forcedNamespaceAliases_.isEmpty()) {
                if (this.forcedNamespaceAliases_.isEmpty()) {
                    this.forcedNamespaceAliases_ = dotnetSettings.forcedNamespaceAliases_;
                    this.bitField0_ |= 16;
                } else {
                    ensureForcedNamespaceAliasesIsMutable();
                    this.forcedNamespaceAliases_.addAll(dotnetSettings.forcedNamespaceAliases_);
                }
                onChanged();
            }
            if (!dotnetSettings.handwrittenSignatures_.isEmpty()) {
                if (this.handwrittenSignatures_.isEmpty()) {
                    this.handwrittenSignatures_ = dotnetSettings.handwrittenSignatures_;
                    this.bitField0_ |= 32;
                } else {
                    ensureHandwrittenSignaturesIsMutable();
                    this.handwrittenSignatures_.addAll(dotnetSettings.handwrittenSignatures_);
                }
                onChanged();
            }
            mergeUnknownFields(dotnetSettings.getUnknownFields());
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
                            } else if (tag == 18) {
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(RenamedServicesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                internalGetMutableRenamedServices().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(RenamedResourcesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                internalGetMutableRenamedResources().getMutableMap().put((String) mapEntry2.getKey(), (String) mapEntry2.getValue());
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureIgnoredResourcesIsMutable();
                                this.ignoredResources_.add((Object) stringRequireUtf8);
                            } else if (tag == 42) {
                                String stringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                ensureForcedNamespaceAliasesIsMutable();
                                this.forcedNamespaceAliases_.add((Object) stringRequireUtf82);
                            } else if (tag == 50) {
                                String stringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                                ensureHandwrittenSignaturesIsMutable();
                                this.handwrittenSignatures_.add((Object) stringRequireUtf83);
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

        @Override // com.google.api.DotnetSettingsOrBuilder
        public boolean hasCommon() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
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

        @Override // com.google.api.DotnetSettingsOrBuilder
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

        private MapField<String, String> internalGetRenamedServices() {
            MapField<String, String> mapField = this.renamedServices_;
            return mapField == null ? MapField.emptyMapField(RenamedServicesDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableRenamedServices() {
            if (this.renamedServices_ == null) {
                this.renamedServices_ = MapField.newMapField(RenamedServicesDefaultEntryHolder.defaultEntry);
            }
            if (!this.renamedServices_.isMutable()) {
                this.renamedServices_ = this.renamedServices_.copy();
            }
            this.bitField0_ |= 2;
            onChanged();
            return this.renamedServices_;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public int getRenamedServicesCount() {
            return internalGetRenamedServices().getMap().size();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public boolean containsRenamedServices(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetRenamedServices().getMap().containsKey(str);
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        @Deprecated
        public Map<String, String> getRenamedServices() {
            return getRenamedServicesMap();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public Map<String, String> getRenamedServicesMap() {
            return internalGetRenamedServices().getMap();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getRenamedServicesOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetRenamedServices().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getRenamedServicesOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetRenamedServices().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        public Builder clearRenamedServices() {
            this.bitField0_ &= -3;
            internalGetMutableRenamedServices().getMutableMap().clear();
            return this;
        }

        public Builder removeRenamedServices(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableRenamedServices().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Map<String, String> getMutableRenamedServices() {
            this.bitField0_ |= 2;
            return internalGetMutableRenamedServices().getMutableMap();
        }

        public Builder putRenamedServices(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableRenamedServices().getMutableMap().put(str, str2);
            this.bitField0_ |= 2;
            return this;
        }

        public Builder putAllRenamedServices(Map<String, String> map) {
            internalGetMutableRenamedServices().getMutableMap().putAll(map);
            this.bitField0_ |= 2;
            return this;
        }

        private MapField<String, String> internalGetRenamedResources() {
            MapField<String, String> mapField = this.renamedResources_;
            return mapField == null ? MapField.emptyMapField(RenamedResourcesDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableRenamedResources() {
            if (this.renamedResources_ == null) {
                this.renamedResources_ = MapField.newMapField(RenamedResourcesDefaultEntryHolder.defaultEntry);
            }
            if (!this.renamedResources_.isMutable()) {
                this.renamedResources_ = this.renamedResources_.copy();
            }
            this.bitField0_ |= 4;
            onChanged();
            return this.renamedResources_;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public int getRenamedResourcesCount() {
            return internalGetRenamedResources().getMap().size();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public boolean containsRenamedResources(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetRenamedResources().getMap().containsKey(str);
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        @Deprecated
        public Map<String, String> getRenamedResources() {
            return getRenamedResourcesMap();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public Map<String, String> getRenamedResourcesMap() {
            return internalGetRenamedResources().getMap();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getRenamedResourcesOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetRenamedResources().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getRenamedResourcesOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetRenamedResources().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        public Builder clearRenamedResources() {
            this.bitField0_ &= -5;
            internalGetMutableRenamedResources().getMutableMap().clear();
            return this;
        }

        public Builder removeRenamedResources(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableRenamedResources().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Map<String, String> getMutableRenamedResources() {
            this.bitField0_ |= 4;
            return internalGetMutableRenamedResources().getMutableMap();
        }

        public Builder putRenamedResources(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableRenamedResources().getMutableMap().put(str, str2);
            this.bitField0_ |= 4;
            return this;
        }

        public Builder putAllRenamedResources(Map<String, String> map) {
            internalGetMutableRenamedResources().getMutableMap().putAll(map);
            this.bitField0_ |= 4;
            return this;
        }

        private void ensureIgnoredResourcesIsMutable() {
            if (!this.ignoredResources_.isModifiable()) {
                this.ignoredResources_ = new LazyStringArrayList((LazyStringList) this.ignoredResources_);
            }
            this.bitField0_ |= 8;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ProtocolStringList getIgnoredResourcesList() {
            this.ignoredResources_.makeImmutable();
            return this.ignoredResources_;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public int getIgnoredResourcesCount() {
            return this.ignoredResources_.size();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getIgnoredResources(int i) {
            return this.ignoredResources_.get(i);
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ByteString getIgnoredResourcesBytes(int i) {
            return this.ignoredResources_.getByteString(i);
        }

        public Builder setIgnoredResources(int i, String str) {
            str.getClass();
            ensureIgnoredResourcesIsMutable();
            this.ignoredResources_.set(i, str);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder addIgnoredResources(String str) {
            str.getClass();
            ensureIgnoredResourcesIsMutable();
            this.ignoredResources_.add((Object) str);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder addAllIgnoredResources(Iterable<String> iterable) {
            ensureIgnoredResourcesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.ignoredResources_);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearIgnoredResources() {
            this.ignoredResources_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder addIgnoredResourcesBytes(ByteString byteString) {
            byteString.getClass();
            DotnetSettings.checkByteStringIsUtf8(byteString);
            ensureIgnoredResourcesIsMutable();
            this.ignoredResources_.add(byteString);
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        private void ensureForcedNamespaceAliasesIsMutable() {
            if (!this.forcedNamespaceAliases_.isModifiable()) {
                this.forcedNamespaceAliases_ = new LazyStringArrayList((LazyStringList) this.forcedNamespaceAliases_);
            }
            this.bitField0_ |= 16;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ProtocolStringList getForcedNamespaceAliasesList() {
            this.forcedNamespaceAliases_.makeImmutable();
            return this.forcedNamespaceAliases_;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public int getForcedNamespaceAliasesCount() {
            return this.forcedNamespaceAliases_.size();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getForcedNamespaceAliases(int i) {
            return this.forcedNamespaceAliases_.get(i);
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ByteString getForcedNamespaceAliasesBytes(int i) {
            return this.forcedNamespaceAliases_.getByteString(i);
        }

        public Builder setForcedNamespaceAliases(int i, String str) {
            str.getClass();
            ensureForcedNamespaceAliasesIsMutable();
            this.forcedNamespaceAliases_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addForcedNamespaceAliases(String str) {
            str.getClass();
            ensureForcedNamespaceAliasesIsMutable();
            this.forcedNamespaceAliases_.add((Object) str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addAllForcedNamespaceAliases(Iterable<String> iterable) {
            ensureForcedNamespaceAliasesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forcedNamespaceAliases_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearForcedNamespaceAliases() {
            this.forcedNamespaceAliases_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder addForcedNamespaceAliasesBytes(ByteString byteString) {
            byteString.getClass();
            DotnetSettings.checkByteStringIsUtf8(byteString);
            ensureForcedNamespaceAliasesIsMutable();
            this.forcedNamespaceAliases_.add(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        private void ensureHandwrittenSignaturesIsMutable() {
            if (!this.handwrittenSignatures_.isModifiable()) {
                this.handwrittenSignatures_ = new LazyStringArrayList((LazyStringList) this.handwrittenSignatures_);
            }
            this.bitField0_ |= 32;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ProtocolStringList getHandwrittenSignaturesList() {
            this.handwrittenSignatures_.makeImmutable();
            return this.handwrittenSignatures_;
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public int getHandwrittenSignaturesCount() {
            return this.handwrittenSignatures_.size();
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public String getHandwrittenSignatures(int i) {
            return this.handwrittenSignatures_.get(i);
        }

        @Override // com.google.api.DotnetSettingsOrBuilder
        public ByteString getHandwrittenSignaturesBytes(int i) {
            return this.handwrittenSignatures_.getByteString(i);
        }

        public Builder setHandwrittenSignatures(int i, String str) {
            str.getClass();
            ensureHandwrittenSignaturesIsMutable();
            this.handwrittenSignatures_.set(i, str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addHandwrittenSignatures(String str) {
            str.getClass();
            ensureHandwrittenSignaturesIsMutable();
            this.handwrittenSignatures_.add((Object) str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addAllHandwrittenSignatures(Iterable<String> iterable) {
            ensureHandwrittenSignaturesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.handwrittenSignatures_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearHandwrittenSignatures() {
            this.handwrittenSignatures_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder addHandwrittenSignaturesBytes(ByteString byteString) {
            byteString.getClass();
            DotnetSettings.checkByteStringIsUtf8(byteString);
            ensureHandwrittenSignaturesIsMutable();
            this.handwrittenSignatures_.add(byteString);
            this.bitField0_ |= 32;
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

    public static DotnetSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<DotnetSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<DotnetSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public DotnetSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
