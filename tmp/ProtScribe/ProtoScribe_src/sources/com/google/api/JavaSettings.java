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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JavaSettings extends GeneratedMessageV3 implements JavaSettingsOrBuilder {
    public static final int COMMON_FIELD_NUMBER = 3;
    public static final int LIBRARY_PACKAGE_FIELD_NUMBER = 1;
    public static final int SERVICE_CLASS_NAMES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private CommonLanguageSettings common_;
    private volatile Object libraryPackage_;
    private byte memoizedIsInitialized;
    private MapField<String, String> serviceClassNames_;
    private static final JavaSettings DEFAULT_INSTANCE = new JavaSettings();
    private static final Parser<JavaSettings> PARSER = new AbstractParser<JavaSettings>() { // from class: com.google.api.JavaSettings.1
        @Override // com.google.protobuf.Parser
        public JavaSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = JavaSettings.newBuilder();
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

    static /* synthetic */ int access$776(JavaSettings javaSettings, int i) {
        int i2 = i | javaSettings.bitField0_;
        javaSettings.bitField0_ = i2;
        return i2;
    }

    private JavaSettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.libraryPackage_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private JavaSettings() {
        this.libraryPackage_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.libraryPackage_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new JavaSettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_JavaSettings_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessage
    protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
        if (i == 2) {
            return internalGetServiceClassNames();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_JavaSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(JavaSettings.class, Builder.class);
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public String getLibraryPackage() {
        Object obj = this.libraryPackage_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.libraryPackage_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public ByteString getLibraryPackageBytes() {
        Object obj = this.libraryPackage_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.libraryPackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    private static final class ServiceClassNamesDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(ClientProto.internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private ServiceClassNamesDefaultEntryHolder() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetServiceClassNames() {
        MapField<String, String> mapField = this.serviceClassNames_;
        return mapField == null ? MapField.emptyMapField(ServiceClassNamesDefaultEntryHolder.defaultEntry) : mapField;
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public int getServiceClassNamesCount() {
        return internalGetServiceClassNames().getMap().size();
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public boolean containsServiceClassNames(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        return internalGetServiceClassNames().getMap().containsKey(str);
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    @Deprecated
    public Map<String, String> getServiceClassNames() {
        return getServiceClassNamesMap();
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public Map<String, String> getServiceClassNamesMap() {
        return internalGetServiceClassNames().getMap();
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public String getServiceClassNamesOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetServiceClassNames().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public String getServiceClassNamesOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetServiceClassNames().getMap();
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return map.get(str);
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public boolean hasCommon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.JavaSettingsOrBuilder
    public CommonLanguageSettings getCommon() {
        CommonLanguageSettings commonLanguageSettings = this.common_;
        return commonLanguageSettings == null ? CommonLanguageSettings.getDefaultInstance() : commonLanguageSettings;
    }

    @Override // com.google.api.JavaSettingsOrBuilder
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
        if (!GeneratedMessageV3.isStringEmpty(this.libraryPackage_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.libraryPackage_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetServiceClassNames(), ServiceClassNamesDefaultEntryHolder.defaultEntry, 2);
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(3, getCommon());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.libraryPackage_) ? GeneratedMessageV3.computeStringSize(1, this.libraryPackage_) : 0;
        for (Map.Entry<String, String> entry : internalGetServiceClassNames().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, ServiceClassNamesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, getCommon());
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
        if (!(obj instanceof JavaSettings)) {
            return super.equals(obj);
        }
        JavaSettings javaSettings = (JavaSettings) obj;
        if (getLibraryPackage().equals(javaSettings.getLibraryPackage()) && internalGetServiceClassNames().equals(javaSettings.internalGetServiceClassNames()) && hasCommon() == javaSettings.hasCommon()) {
            return (!hasCommon() || getCommon().equals(javaSettings.getCommon())) && getUnknownFields().equals(javaSettings.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLibraryPackage().hashCode();
        if (!internalGetServiceClassNames().getMap().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetServiceClassNames().hashCode();
        }
        if (hasCommon()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getCommon().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static JavaSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static JavaSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static JavaSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static JavaSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static JavaSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static JavaSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static JavaSettings parseFrom(InputStream inputStream) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static JavaSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static JavaSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static JavaSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static JavaSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static JavaSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JavaSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(JavaSettings javaSettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(javaSettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements JavaSettingsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> commonBuilder_;
        private CommonLanguageSettings common_;
        private Object libraryPackage_;
        private MapField<String, String> serviceClassNames_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_JavaSettings_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 2) {
                return internalGetServiceClassNames();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
            if (i == 2) {
                return internalGetMutableServiceClassNames();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_JavaSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(JavaSettings.class, Builder.class);
        }

        private Builder() {
            this.libraryPackage_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.libraryPackage_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (JavaSettings.alwaysUseFieldBuilders) {
                getCommonFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.libraryPackage_ = "";
            internalGetMutableServiceClassNames().clear();
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
            return ClientProto.internal_static_google_api_JavaSettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public JavaSettings getDefaultInstanceForType() {
            return JavaSettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public JavaSettings build() {
            JavaSettings javaSettingsBuildPartial = buildPartial();
            if (javaSettingsBuildPartial.isInitialized()) {
                return javaSettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) javaSettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public JavaSettings buildPartial() {
            JavaSettings javaSettings = new JavaSettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(javaSettings);
            }
            onBuilt();
            return javaSettings;
        }

        private void buildPartial0(JavaSettings javaSettings) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                javaSettings.libraryPackage_ = this.libraryPackage_;
            }
            if ((i2 & 2) != 0) {
                javaSettings.serviceClassNames_ = internalGetServiceClassNames();
                javaSettings.serviceClassNames_.makeImmutable();
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
                javaSettings.common_ = singleFieldBuilderV3 == null ? this.common_ : (CommonLanguageSettings) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            JavaSettings.access$776(javaSettings, i);
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
            if (message instanceof JavaSettings) {
                return mergeFrom((JavaSettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(JavaSettings javaSettings) {
            if (javaSettings == JavaSettings.getDefaultInstance()) {
                return this;
            }
            if (!javaSettings.getLibraryPackage().isEmpty()) {
                this.libraryPackage_ = javaSettings.libraryPackage_;
                this.bitField0_ |= 1;
                onChanged();
            }
            internalGetMutableServiceClassNames().mergeFrom(javaSettings.internalGetServiceClassNames());
            this.bitField0_ |= 2;
            if (javaSettings.hasCommon()) {
                mergeCommon(javaSettings.getCommon());
            }
            mergeUnknownFields(javaSettings.getUnknownFields());
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
                                this.libraryPackage_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ServiceClassNamesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                internalGetMutableServiceClassNames().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getCommonFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.api.JavaSettingsOrBuilder
        public String getLibraryPackage() {
            Object obj = this.libraryPackage_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.libraryPackage_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public ByteString getLibraryPackageBytes() {
            Object obj = this.libraryPackage_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.libraryPackage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setLibraryPackage(String str) {
            str.getClass();
            this.libraryPackage_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearLibraryPackage() {
            this.libraryPackage_ = JavaSettings.getDefaultInstance().getLibraryPackage();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setLibraryPackageBytes(ByteString byteString) {
            byteString.getClass();
            JavaSettings.checkByteStringIsUtf8(byteString);
            this.libraryPackage_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private MapField<String, String> internalGetServiceClassNames() {
            MapField<String, String> mapField = this.serviceClassNames_;
            return mapField == null ? MapField.emptyMapField(ServiceClassNamesDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableServiceClassNames() {
            if (this.serviceClassNames_ == null) {
                this.serviceClassNames_ = MapField.newMapField(ServiceClassNamesDefaultEntryHolder.defaultEntry);
            }
            if (!this.serviceClassNames_.isMutable()) {
                this.serviceClassNames_ = this.serviceClassNames_.copy();
            }
            this.bitField0_ |= 2;
            onChanged();
            return this.serviceClassNames_;
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public int getServiceClassNamesCount() {
            return internalGetServiceClassNames().getMap().size();
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public boolean containsServiceClassNames(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetServiceClassNames().getMap().containsKey(str);
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        @Deprecated
        public Map<String, String> getServiceClassNames() {
            return getServiceClassNamesMap();
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public Map<String, String> getServiceClassNamesMap() {
            return internalGetServiceClassNames().getMap();
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public String getServiceClassNamesOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetServiceClassNames().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public String getServiceClassNamesOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetServiceClassNames().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        public Builder clearServiceClassNames() {
            this.bitField0_ &= -3;
            internalGetMutableServiceClassNames().getMutableMap().clear();
            return this;
        }

        public Builder removeServiceClassNames(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableServiceClassNames().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Map<String, String> getMutableServiceClassNames() {
            this.bitField0_ |= 2;
            return internalGetMutableServiceClassNames().getMutableMap();
        }

        public Builder putServiceClassNames(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableServiceClassNames().getMutableMap().put(str, str2);
            this.bitField0_ |= 2;
            return this;
        }

        public Builder putAllServiceClassNames(Map<String, String> map) {
            internalGetMutableServiceClassNames().getMutableMap().putAll(map);
            this.bitField0_ |= 2;
            return this;
        }

        @Override // com.google.api.JavaSettingsOrBuilder
        public boolean hasCommon() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.api.JavaSettingsOrBuilder
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
            this.bitField0_ |= 4;
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
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeCommon(CommonLanguageSettings commonLanguageSettings) {
            CommonLanguageSettings commonLanguageSettings2;
            SingleFieldBuilderV3<CommonLanguageSettings, CommonLanguageSettings.Builder, CommonLanguageSettingsOrBuilder> singleFieldBuilderV3 = this.commonBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (commonLanguageSettings2 = this.common_) != null && commonLanguageSettings2 != CommonLanguageSettings.getDefaultInstance()) {
                    getCommonBuilder().mergeFrom(commonLanguageSettings);
                } else {
                    this.common_ = commonLanguageSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(commonLanguageSettings);
            }
            if (this.common_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearCommon() {
            this.bitField0_ &= -5;
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
            this.bitField0_ |= 4;
            onChanged();
            return (CommonLanguageSettings.Builder) getCommonFieldBuilder().getBuilder();
        }

        @Override // com.google.api.JavaSettingsOrBuilder
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

    public static JavaSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<JavaSettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<JavaSettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public JavaSettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
