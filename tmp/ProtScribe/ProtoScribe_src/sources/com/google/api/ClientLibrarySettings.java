package com.google.api;

import com.google.api.CppSettings;
import com.google.api.DotnetSettings;
import com.google.api.GoSettings;
import com.google.api.JavaSettings;
import com.google.api.NodeSettings;
import com.google.api.PhpSettings;
import com.google.api.PythonSettings;
import com.google.api.RubySettings;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ClientLibrarySettings extends GeneratedMessageV3 implements ClientLibrarySettingsOrBuilder {
    public static final int CPP_SETTINGS_FIELD_NUMBER = 22;
    public static final int DOTNET_SETTINGS_FIELD_NUMBER = 26;
    public static final int GO_SETTINGS_FIELD_NUMBER = 28;
    public static final int JAVA_SETTINGS_FIELD_NUMBER = 21;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 2;
    public static final int NODE_SETTINGS_FIELD_NUMBER = 25;
    public static final int PHP_SETTINGS_FIELD_NUMBER = 23;
    public static final int PYTHON_SETTINGS_FIELD_NUMBER = 24;
    public static final int REST_NUMERIC_ENUMS_FIELD_NUMBER = 3;
    public static final int RUBY_SETTINGS_FIELD_NUMBER = 27;
    public static final int VERSION_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private CppSettings cppSettings_;
    private DotnetSettings dotnetSettings_;
    private GoSettings goSettings_;
    private JavaSettings javaSettings_;
    private int launchStage_;
    private byte memoizedIsInitialized;
    private NodeSettings nodeSettings_;
    private PhpSettings phpSettings_;
    private PythonSettings pythonSettings_;
    private boolean restNumericEnums_;
    private RubySettings rubySettings_;
    private volatile Object version_;
    private static final ClientLibrarySettings DEFAULT_INSTANCE = new ClientLibrarySettings();
    private static final Parser<ClientLibrarySettings> PARSER = new AbstractParser<ClientLibrarySettings>() { // from class: com.google.api.ClientLibrarySettings.1
        @Override // com.google.protobuf.Parser
        public ClientLibrarySettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ClientLibrarySettings.newBuilder();
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

    static /* synthetic */ int access$1576(ClientLibrarySettings clientLibrarySettings, int i) {
        int i2 = i | clientLibrarySettings.bitField0_;
        clientLibrarySettings.bitField0_ = i2;
        return i2;
    }

    private ClientLibrarySettings(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.version_ = "";
        this.launchStage_ = 0;
        this.restNumericEnums_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    private ClientLibrarySettings() {
        this.version_ = "";
        this.launchStage_ = 0;
        this.restNumericEnums_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.version_ = "";
        this.launchStage_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ClientLibrarySettings();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_ClientLibrarySettings_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_ClientLibrarySettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientLibrarySettings.class, Builder.class);
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public LaunchStage getLaunchStage() {
        LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
        return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean getRestNumericEnums() {
        return this.restNumericEnums_;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasJavaSettings() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public JavaSettings getJavaSettings() {
        JavaSettings javaSettings = this.javaSettings_;
        return javaSettings == null ? JavaSettings.getDefaultInstance() : javaSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public JavaSettingsOrBuilder getJavaSettingsOrBuilder() {
        JavaSettings javaSettings = this.javaSettings_;
        return javaSettings == null ? JavaSettings.getDefaultInstance() : javaSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasCppSettings() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public CppSettings getCppSettings() {
        CppSettings cppSettings = this.cppSettings_;
        return cppSettings == null ? CppSettings.getDefaultInstance() : cppSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public CppSettingsOrBuilder getCppSettingsOrBuilder() {
        CppSettings cppSettings = this.cppSettings_;
        return cppSettings == null ? CppSettings.getDefaultInstance() : cppSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasPhpSettings() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public PhpSettings getPhpSettings() {
        PhpSettings phpSettings = this.phpSettings_;
        return phpSettings == null ? PhpSettings.getDefaultInstance() : phpSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public PhpSettingsOrBuilder getPhpSettingsOrBuilder() {
        PhpSettings phpSettings = this.phpSettings_;
        return phpSettings == null ? PhpSettings.getDefaultInstance() : phpSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasPythonSettings() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public PythonSettings getPythonSettings() {
        PythonSettings pythonSettings = this.pythonSettings_;
        return pythonSettings == null ? PythonSettings.getDefaultInstance() : pythonSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public PythonSettingsOrBuilder getPythonSettingsOrBuilder() {
        PythonSettings pythonSettings = this.pythonSettings_;
        return pythonSettings == null ? PythonSettings.getDefaultInstance() : pythonSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasNodeSettings() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public NodeSettings getNodeSettings() {
        NodeSettings nodeSettings = this.nodeSettings_;
        return nodeSettings == null ? NodeSettings.getDefaultInstance() : nodeSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public NodeSettingsOrBuilder getNodeSettingsOrBuilder() {
        NodeSettings nodeSettings = this.nodeSettings_;
        return nodeSettings == null ? NodeSettings.getDefaultInstance() : nodeSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasDotnetSettings() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public DotnetSettings getDotnetSettings() {
        DotnetSettings dotnetSettings = this.dotnetSettings_;
        return dotnetSettings == null ? DotnetSettings.getDefaultInstance() : dotnetSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public DotnetSettingsOrBuilder getDotnetSettingsOrBuilder() {
        DotnetSettings dotnetSettings = this.dotnetSettings_;
        return dotnetSettings == null ? DotnetSettings.getDefaultInstance() : dotnetSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasRubySettings() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public RubySettings getRubySettings() {
        RubySettings rubySettings = this.rubySettings_;
        return rubySettings == null ? RubySettings.getDefaultInstance() : rubySettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public RubySettingsOrBuilder getRubySettingsOrBuilder() {
        RubySettings rubySettings = this.rubySettings_;
        return rubySettings == null ? RubySettings.getDefaultInstance() : rubySettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public boolean hasGoSettings() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public GoSettings getGoSettings() {
        GoSettings goSettings = this.goSettings_;
        return goSettings == null ? GoSettings.getDefaultInstance() : goSettings;
    }

    @Override // com.google.api.ClientLibrarySettingsOrBuilder
    public GoSettingsOrBuilder getGoSettingsOrBuilder() {
        GoSettings goSettings = this.goSettings_;
        return goSettings == null ? GoSettings.getDefaultInstance() : goSettings;
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
        if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.version_);
        }
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(2, this.launchStage_);
        }
        boolean z = this.restNumericEnums_;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(21, getJavaSettings());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(22, getCppSettings());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(23, getPhpSettings());
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(24, getPythonSettings());
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputStream.writeMessage(25, getNodeSettings());
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputStream.writeMessage(26, getDotnetSettings());
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputStream.writeMessage(27, getRubySettings());
        }
        if ((this.bitField0_ & 128) != 0) {
            codedOutputStream.writeMessage(28, getGoSettings());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.version_) ? GeneratedMessageV3.computeStringSize(1, this.version_) : 0;
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.launchStage_);
        }
        boolean z = this.restNumericEnums_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(3, z);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(21, getJavaSettings());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(22, getCppSettings());
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(23, getPhpSettings());
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(24, getPythonSettings());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(25, getNodeSettings());
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(26, getDotnetSettings());
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(27, getRubySettings());
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(28, getGoSettings());
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
        if (!(obj instanceof ClientLibrarySettings)) {
            return super.equals(obj);
        }
        ClientLibrarySettings clientLibrarySettings = (ClientLibrarySettings) obj;
        if (!getVersion().equals(clientLibrarySettings.getVersion()) || this.launchStage_ != clientLibrarySettings.launchStage_ || getRestNumericEnums() != clientLibrarySettings.getRestNumericEnums() || hasJavaSettings() != clientLibrarySettings.hasJavaSettings()) {
            return false;
        }
        if ((hasJavaSettings() && !getJavaSettings().equals(clientLibrarySettings.getJavaSettings())) || hasCppSettings() != clientLibrarySettings.hasCppSettings()) {
            return false;
        }
        if ((hasCppSettings() && !getCppSettings().equals(clientLibrarySettings.getCppSettings())) || hasPhpSettings() != clientLibrarySettings.hasPhpSettings()) {
            return false;
        }
        if ((hasPhpSettings() && !getPhpSettings().equals(clientLibrarySettings.getPhpSettings())) || hasPythonSettings() != clientLibrarySettings.hasPythonSettings()) {
            return false;
        }
        if ((hasPythonSettings() && !getPythonSettings().equals(clientLibrarySettings.getPythonSettings())) || hasNodeSettings() != clientLibrarySettings.hasNodeSettings()) {
            return false;
        }
        if ((hasNodeSettings() && !getNodeSettings().equals(clientLibrarySettings.getNodeSettings())) || hasDotnetSettings() != clientLibrarySettings.hasDotnetSettings()) {
            return false;
        }
        if ((hasDotnetSettings() && !getDotnetSettings().equals(clientLibrarySettings.getDotnetSettings())) || hasRubySettings() != clientLibrarySettings.hasRubySettings()) {
            return false;
        }
        if ((!hasRubySettings() || getRubySettings().equals(clientLibrarySettings.getRubySettings())) && hasGoSettings() == clientLibrarySettings.hasGoSettings()) {
            return (!hasGoSettings() || getGoSettings().equals(clientLibrarySettings.getGoSettings())) && getUnknownFields().equals(clientLibrarySettings.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion().hashCode()) * 37) + 2) * 53) + this.launchStage_) * 37) + 3) * 53) + Internal.hashBoolean(getRestNumericEnums());
        if (hasJavaSettings()) {
            iHashCode = (((iHashCode * 37) + 21) * 53) + getJavaSettings().hashCode();
        }
        if (hasCppSettings()) {
            iHashCode = (((iHashCode * 37) + 22) * 53) + getCppSettings().hashCode();
        }
        if (hasPhpSettings()) {
            iHashCode = (((iHashCode * 37) + 23) * 53) + getPhpSettings().hashCode();
        }
        if (hasPythonSettings()) {
            iHashCode = (((iHashCode * 37) + 24) * 53) + getPythonSettings().hashCode();
        }
        if (hasNodeSettings()) {
            iHashCode = (((iHashCode * 37) + 25) * 53) + getNodeSettings().hashCode();
        }
        if (hasDotnetSettings()) {
            iHashCode = (((iHashCode * 37) + 26) * 53) + getDotnetSettings().hashCode();
        }
        if (hasRubySettings()) {
            iHashCode = (((iHashCode * 37) + 27) * 53) + getRubySettings().hashCode();
        }
        if (hasGoSettings()) {
            iHashCode = (((iHashCode * 37) + 28) * 53) + getGoSettings().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static ClientLibrarySettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ClientLibrarySettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ClientLibrarySettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ClientLibrarySettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ClientLibrarySettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ClientLibrarySettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ClientLibrarySettings parseFrom(InputStream inputStream) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ClientLibrarySettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ClientLibrarySettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ClientLibrarySettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ClientLibrarySettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ClientLibrarySettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientLibrarySettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ClientLibrarySettings clientLibrarySettings) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(clientLibrarySettings);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientLibrarySettingsOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> cppSettingsBuilder_;
        private CppSettings cppSettings_;
        private SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> dotnetSettingsBuilder_;
        private DotnetSettings dotnetSettings_;
        private SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> goSettingsBuilder_;
        private GoSettings goSettings_;
        private SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> javaSettingsBuilder_;
        private JavaSettings javaSettings_;
        private int launchStage_;
        private SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> nodeSettingsBuilder_;
        private NodeSettings nodeSettings_;
        private SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> phpSettingsBuilder_;
        private PhpSettings phpSettings_;
        private SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> pythonSettingsBuilder_;
        private PythonSettings pythonSettings_;
        private boolean restNumericEnums_;
        private SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> rubySettingsBuilder_;
        private RubySettings rubySettings_;
        private Object version_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_ClientLibrarySettings_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_ClientLibrarySettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientLibrarySettings.class, Builder.class);
        }

        private Builder() {
            this.version_ = "";
            this.launchStage_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.version_ = "";
            this.launchStage_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (ClientLibrarySettings.alwaysUseFieldBuilders) {
                getJavaSettingsFieldBuilder();
                getCppSettingsFieldBuilder();
                getPhpSettingsFieldBuilder();
                getPythonSettingsFieldBuilder();
                getNodeSettingsFieldBuilder();
                getDotnetSettingsFieldBuilder();
                getRubySettingsFieldBuilder();
                getGoSettingsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.version_ = "";
            this.launchStage_ = 0;
            this.restNumericEnums_ = false;
            this.javaSettings_ = null;
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.javaSettingsBuilder_ = null;
            }
            this.cppSettings_ = null;
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV32 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.cppSettingsBuilder_ = null;
            }
            this.phpSettings_ = null;
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV33 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.phpSettingsBuilder_ = null;
            }
            this.pythonSettings_ = null;
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV34 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.dispose();
                this.pythonSettingsBuilder_ = null;
            }
            this.nodeSettings_ = null;
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV35 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV35 != null) {
                singleFieldBuilderV35.dispose();
                this.nodeSettingsBuilder_ = null;
            }
            this.dotnetSettings_ = null;
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV36 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV36 != null) {
                singleFieldBuilderV36.dispose();
                this.dotnetSettingsBuilder_ = null;
            }
            this.rubySettings_ = null;
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV37 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV37 != null) {
                singleFieldBuilderV37.dispose();
                this.rubySettingsBuilder_ = null;
            }
            this.goSettings_ = null;
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV38 = this.goSettingsBuilder_;
            if (singleFieldBuilderV38 != null) {
                singleFieldBuilderV38.dispose();
                this.goSettingsBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_ClientLibrarySettings_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClientLibrarySettings getDefaultInstanceForType() {
            return ClientLibrarySettings.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ClientLibrarySettings build() {
            ClientLibrarySettings clientLibrarySettingsBuildPartial = buildPartial();
            if (clientLibrarySettingsBuildPartial.isInitialized()) {
                return clientLibrarySettingsBuildPartial;
            }
            throw newUninitializedMessageException((Message) clientLibrarySettingsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ClientLibrarySettings buildPartial() {
            ClientLibrarySettings clientLibrarySettings = new ClientLibrarySettings(this);
            if (this.bitField0_ != 0) {
                buildPartial0(clientLibrarySettings);
            }
            onBuilt();
            return clientLibrarySettings;
        }

        private void buildPartial0(ClientLibrarySettings clientLibrarySettings) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                clientLibrarySettings.version_ = this.version_;
            }
            if ((i2 & 2) != 0) {
                clientLibrarySettings.launchStage_ = this.launchStage_;
            }
            if ((i2 & 4) != 0) {
                clientLibrarySettings.restNumericEnums_ = this.restNumericEnums_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
                clientLibrarySettings.javaSettings_ = singleFieldBuilderV3 == null ? this.javaSettings_ : (JavaSettings) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV32 = this.cppSettingsBuilder_;
                clientLibrarySettings.cppSettings_ = singleFieldBuilderV32 == null ? this.cppSettings_ : (CppSettings) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 32) != 0) {
                SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV33 = this.phpSettingsBuilder_;
                clientLibrarySettings.phpSettings_ = singleFieldBuilderV33 == null ? this.phpSettings_ : (PhpSettings) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i2 & 64) != 0) {
                SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV34 = this.pythonSettingsBuilder_;
                clientLibrarySettings.pythonSettings_ = singleFieldBuilderV34 == null ? this.pythonSettings_ : (PythonSettings) singleFieldBuilderV34.build();
                i |= 8;
            }
            if ((i2 & 128) != 0) {
                SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV35 = this.nodeSettingsBuilder_;
                clientLibrarySettings.nodeSettings_ = singleFieldBuilderV35 == null ? this.nodeSettings_ : (NodeSettings) singleFieldBuilderV35.build();
                i |= 16;
            }
            if ((i2 & 256) != 0) {
                SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV36 = this.dotnetSettingsBuilder_;
                clientLibrarySettings.dotnetSettings_ = singleFieldBuilderV36 == null ? this.dotnetSettings_ : (DotnetSettings) singleFieldBuilderV36.build();
                i |= 32;
            }
            if ((i2 & 512) != 0) {
                SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV37 = this.rubySettingsBuilder_;
                clientLibrarySettings.rubySettings_ = singleFieldBuilderV37 == null ? this.rubySettings_ : (RubySettings) singleFieldBuilderV37.build();
                i |= 64;
            }
            if ((i2 & 1024) != 0) {
                SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV38 = this.goSettingsBuilder_;
                clientLibrarySettings.goSettings_ = singleFieldBuilderV38 == null ? this.goSettings_ : (GoSettings) singleFieldBuilderV38.build();
                i |= 128;
            }
            ClientLibrarySettings.access$1576(clientLibrarySettings, i);
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
            if (message instanceof ClientLibrarySettings) {
                return mergeFrom((ClientLibrarySettings) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ClientLibrarySettings clientLibrarySettings) {
            if (clientLibrarySettings == ClientLibrarySettings.getDefaultInstance()) {
                return this;
            }
            if (!clientLibrarySettings.getVersion().isEmpty()) {
                this.version_ = clientLibrarySettings.version_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (clientLibrarySettings.launchStage_ != 0) {
                setLaunchStageValue(clientLibrarySettings.getLaunchStageValue());
            }
            if (clientLibrarySettings.getRestNumericEnums()) {
                setRestNumericEnums(clientLibrarySettings.getRestNumericEnums());
            }
            if (clientLibrarySettings.hasJavaSettings()) {
                mergeJavaSettings(clientLibrarySettings.getJavaSettings());
            }
            if (clientLibrarySettings.hasCppSettings()) {
                mergeCppSettings(clientLibrarySettings.getCppSettings());
            }
            if (clientLibrarySettings.hasPhpSettings()) {
                mergePhpSettings(clientLibrarySettings.getPhpSettings());
            }
            if (clientLibrarySettings.hasPythonSettings()) {
                mergePythonSettings(clientLibrarySettings.getPythonSettings());
            }
            if (clientLibrarySettings.hasNodeSettings()) {
                mergeNodeSettings(clientLibrarySettings.getNodeSettings());
            }
            if (clientLibrarySettings.hasDotnetSettings()) {
                mergeDotnetSettings(clientLibrarySettings.getDotnetSettings());
            }
            if (clientLibrarySettings.hasRubySettings()) {
                mergeRubySettings(clientLibrarySettings.getRubySettings());
            }
            if (clientLibrarySettings.hasGoSettings()) {
                mergeGoSettings(clientLibrarySettings.getGoSettings());
            }
            mergeUnknownFields(clientLibrarySettings.getUnknownFields());
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
                        switch (tag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.version_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                break;
                            case 16:
                                this.launchStage_ = codedInputStream.readEnum();
                                this.bitField0_ |= 2;
                                break;
                            case 24:
                                this.restNumericEnums_ = codedInputStream.readBool();
                                this.bitField0_ |= 4;
                                break;
                            case 170:
                                codedInputStream.readMessage(getJavaSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                                break;
                            case 178:
                                codedInputStream.readMessage(getCppSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                                break;
                            case 186:
                                codedInputStream.readMessage(getPhpSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 32;
                                break;
                            case 194:
                                codedInputStream.readMessage(getPythonSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 64;
                                break;
                            case 202:
                                codedInputStream.readMessage(getNodeSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 128;
                                break;
                            case 210:
                                codedInputStream.readMessage(getDotnetSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 256;
                                break;
                            case 218:
                                codedInputStream.readMessage(getRubySettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 512;
                                break;
                            case 226:
                                codedInputStream.readMessage(getGoSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1024;
                                break;
                            default:
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } finally {
                    onChanged();
                }
            }
            return this;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.version_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.version_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearVersion() {
            this.version_ = ClientLibrarySettings.getDefaultInstance().getVersion();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            byteString.getClass();
            ClientLibrarySettings.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Builder setLaunchStageValue(int i) {
            this.launchStage_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public LaunchStage getLaunchStage() {
            LaunchStage launchStageForNumber = LaunchStage.forNumber(this.launchStage_);
            return launchStageForNumber == null ? LaunchStage.UNRECOGNIZED : launchStageForNumber;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            launchStage.getClass();
            this.bitField0_ |= 2;
            this.launchStage_ = launchStage.getNumber();
            onChanged();
            return this;
        }

        public Builder clearLaunchStage() {
            this.bitField0_ &= -3;
            this.launchStage_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean getRestNumericEnums() {
            return this.restNumericEnums_;
        }

        public Builder setRestNumericEnums(boolean z) {
            this.restNumericEnums_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearRestNumericEnums() {
            this.bitField0_ &= -5;
            this.restNumericEnums_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasJavaSettings() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public JavaSettings getJavaSettings() {
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                JavaSettings javaSettings = this.javaSettings_;
                return javaSettings == null ? JavaSettings.getDefaultInstance() : javaSettings;
            }
            return (JavaSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setJavaSettings(JavaSettings javaSettings) {
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                javaSettings.getClass();
                this.javaSettings_ = javaSettings;
            } else {
                singleFieldBuilderV3.setMessage(javaSettings);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setJavaSettings(JavaSettings.Builder builder) {
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.javaSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeJavaSettings(JavaSettings javaSettings) {
            JavaSettings javaSettings2;
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (javaSettings2 = this.javaSettings_) != null && javaSettings2 != JavaSettings.getDefaultInstance()) {
                    getJavaSettingsBuilder().mergeFrom(javaSettings);
                } else {
                    this.javaSettings_ = javaSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(javaSettings);
            }
            if (this.javaSettings_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearJavaSettings() {
            this.bitField0_ &= -9;
            this.javaSettings_ = null;
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.javaSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public JavaSettings.Builder getJavaSettingsBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (JavaSettings.Builder) getJavaSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public JavaSettingsOrBuilder getJavaSettingsOrBuilder() {
            SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> singleFieldBuilderV3 = this.javaSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (JavaSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            JavaSettings javaSettings = this.javaSettings_;
            return javaSettings == null ? JavaSettings.getDefaultInstance() : javaSettings;
        }

        private SingleFieldBuilderV3<JavaSettings, JavaSettings.Builder, JavaSettingsOrBuilder> getJavaSettingsFieldBuilder() {
            if (this.javaSettingsBuilder_ == null) {
                this.javaSettingsBuilder_ = new SingleFieldBuilderV3<>(getJavaSettings(), getParentForChildren(), isClean());
                this.javaSettings_ = null;
            }
            return this.javaSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasCppSettings() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public CppSettings getCppSettings() {
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                CppSettings cppSettings = this.cppSettings_;
                return cppSettings == null ? CppSettings.getDefaultInstance() : cppSettings;
            }
            return (CppSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setCppSettings(CppSettings cppSettings) {
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                cppSettings.getClass();
                this.cppSettings_ = cppSettings;
            } else {
                singleFieldBuilderV3.setMessage(cppSettings);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setCppSettings(CppSettings.Builder builder) {
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.cppSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeCppSettings(CppSettings cppSettings) {
            CppSettings cppSettings2;
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (cppSettings2 = this.cppSettings_) != null && cppSettings2 != CppSettings.getDefaultInstance()) {
                    getCppSettingsBuilder().mergeFrom(cppSettings);
                } else {
                    this.cppSettings_ = cppSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(cppSettings);
            }
            if (this.cppSettings_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearCppSettings() {
            this.bitField0_ &= -17;
            this.cppSettings_ = null;
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.cppSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public CppSettings.Builder getCppSettingsBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (CppSettings.Builder) getCppSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public CppSettingsOrBuilder getCppSettingsOrBuilder() {
            SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> singleFieldBuilderV3 = this.cppSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CppSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CppSettings cppSettings = this.cppSettings_;
            return cppSettings == null ? CppSettings.getDefaultInstance() : cppSettings;
        }

        private SingleFieldBuilderV3<CppSettings, CppSettings.Builder, CppSettingsOrBuilder> getCppSettingsFieldBuilder() {
            if (this.cppSettingsBuilder_ == null) {
                this.cppSettingsBuilder_ = new SingleFieldBuilderV3<>(getCppSettings(), getParentForChildren(), isClean());
                this.cppSettings_ = null;
            }
            return this.cppSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasPhpSettings() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public PhpSettings getPhpSettings() {
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                PhpSettings phpSettings = this.phpSettings_;
                return phpSettings == null ? PhpSettings.getDefaultInstance() : phpSettings;
            }
            return (PhpSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setPhpSettings(PhpSettings phpSettings) {
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                phpSettings.getClass();
                this.phpSettings_ = phpSettings;
            } else {
                singleFieldBuilderV3.setMessage(phpSettings);
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setPhpSettings(PhpSettings.Builder builder) {
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.phpSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder mergePhpSettings(PhpSettings phpSettings) {
            PhpSettings phpSettings2;
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32) != 0 && (phpSettings2 = this.phpSettings_) != null && phpSettings2 != PhpSettings.getDefaultInstance()) {
                    getPhpSettingsBuilder().mergeFrom(phpSettings);
                } else {
                    this.phpSettings_ = phpSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(phpSettings);
            }
            if (this.phpSettings_ != null) {
                this.bitField0_ |= 32;
                onChanged();
            }
            return this;
        }

        public Builder clearPhpSettings() {
            this.bitField0_ &= -33;
            this.phpSettings_ = null;
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.phpSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public PhpSettings.Builder getPhpSettingsBuilder() {
            this.bitField0_ |= 32;
            onChanged();
            return (PhpSettings.Builder) getPhpSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public PhpSettingsOrBuilder getPhpSettingsOrBuilder() {
            SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> singleFieldBuilderV3 = this.phpSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PhpSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            PhpSettings phpSettings = this.phpSettings_;
            return phpSettings == null ? PhpSettings.getDefaultInstance() : phpSettings;
        }

        private SingleFieldBuilderV3<PhpSettings, PhpSettings.Builder, PhpSettingsOrBuilder> getPhpSettingsFieldBuilder() {
            if (this.phpSettingsBuilder_ == null) {
                this.phpSettingsBuilder_ = new SingleFieldBuilderV3<>(getPhpSettings(), getParentForChildren(), isClean());
                this.phpSettings_ = null;
            }
            return this.phpSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasPythonSettings() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public PythonSettings getPythonSettings() {
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                PythonSettings pythonSettings = this.pythonSettings_;
                return pythonSettings == null ? PythonSettings.getDefaultInstance() : pythonSettings;
            }
            return (PythonSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setPythonSettings(PythonSettings pythonSettings) {
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                pythonSettings.getClass();
                this.pythonSettings_ = pythonSettings;
            } else {
                singleFieldBuilderV3.setMessage(pythonSettings);
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setPythonSettings(PythonSettings.Builder builder) {
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.pythonSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder mergePythonSettings(PythonSettings pythonSettings) {
            PythonSettings pythonSettings2;
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 64) != 0 && (pythonSettings2 = this.pythonSettings_) != null && pythonSettings2 != PythonSettings.getDefaultInstance()) {
                    getPythonSettingsBuilder().mergeFrom(pythonSettings);
                } else {
                    this.pythonSettings_ = pythonSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(pythonSettings);
            }
            if (this.pythonSettings_ != null) {
                this.bitField0_ |= 64;
                onChanged();
            }
            return this;
        }

        public Builder clearPythonSettings() {
            this.bitField0_ &= -65;
            this.pythonSettings_ = null;
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.pythonSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public PythonSettings.Builder getPythonSettingsBuilder() {
            this.bitField0_ |= 64;
            onChanged();
            return (PythonSettings.Builder) getPythonSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public PythonSettingsOrBuilder getPythonSettingsOrBuilder() {
            SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> singleFieldBuilderV3 = this.pythonSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PythonSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            PythonSettings pythonSettings = this.pythonSettings_;
            return pythonSettings == null ? PythonSettings.getDefaultInstance() : pythonSettings;
        }

        private SingleFieldBuilderV3<PythonSettings, PythonSettings.Builder, PythonSettingsOrBuilder> getPythonSettingsFieldBuilder() {
            if (this.pythonSettingsBuilder_ == null) {
                this.pythonSettingsBuilder_ = new SingleFieldBuilderV3<>(getPythonSettings(), getParentForChildren(), isClean());
                this.pythonSettings_ = null;
            }
            return this.pythonSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasNodeSettings() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public NodeSettings getNodeSettings() {
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                NodeSettings nodeSettings = this.nodeSettings_;
                return nodeSettings == null ? NodeSettings.getDefaultInstance() : nodeSettings;
            }
            return (NodeSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setNodeSettings(NodeSettings nodeSettings) {
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                nodeSettings.getClass();
                this.nodeSettings_ = nodeSettings;
            } else {
                singleFieldBuilderV3.setMessage(nodeSettings);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setNodeSettings(NodeSettings.Builder builder) {
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.nodeSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder mergeNodeSettings(NodeSettings nodeSettings) {
            NodeSettings nodeSettings2;
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 128) != 0 && (nodeSettings2 = this.nodeSettings_) != null && nodeSettings2 != NodeSettings.getDefaultInstance()) {
                    getNodeSettingsBuilder().mergeFrom(nodeSettings);
                } else {
                    this.nodeSettings_ = nodeSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(nodeSettings);
            }
            if (this.nodeSettings_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public Builder clearNodeSettings() {
            this.bitField0_ &= -129;
            this.nodeSettings_ = null;
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.nodeSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public NodeSettings.Builder getNodeSettingsBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (NodeSettings.Builder) getNodeSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public NodeSettingsOrBuilder getNodeSettingsOrBuilder() {
            SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> singleFieldBuilderV3 = this.nodeSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (NodeSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            NodeSettings nodeSettings = this.nodeSettings_;
            return nodeSettings == null ? NodeSettings.getDefaultInstance() : nodeSettings;
        }

        private SingleFieldBuilderV3<NodeSettings, NodeSettings.Builder, NodeSettingsOrBuilder> getNodeSettingsFieldBuilder() {
            if (this.nodeSettingsBuilder_ == null) {
                this.nodeSettingsBuilder_ = new SingleFieldBuilderV3<>(getNodeSettings(), getParentForChildren(), isClean());
                this.nodeSettings_ = null;
            }
            return this.nodeSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasDotnetSettings() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public DotnetSettings getDotnetSettings() {
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                DotnetSettings dotnetSettings = this.dotnetSettings_;
                return dotnetSettings == null ? DotnetSettings.getDefaultInstance() : dotnetSettings;
            }
            return (DotnetSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setDotnetSettings(DotnetSettings dotnetSettings) {
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                dotnetSettings.getClass();
                this.dotnetSettings_ = dotnetSettings;
            } else {
                singleFieldBuilderV3.setMessage(dotnetSettings);
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setDotnetSettings(DotnetSettings.Builder builder) {
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.dotnetSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder mergeDotnetSettings(DotnetSettings dotnetSettings) {
            DotnetSettings dotnetSettings2;
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 256) != 0 && (dotnetSettings2 = this.dotnetSettings_) != null && dotnetSettings2 != DotnetSettings.getDefaultInstance()) {
                    getDotnetSettingsBuilder().mergeFrom(dotnetSettings);
                } else {
                    this.dotnetSettings_ = dotnetSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(dotnetSettings);
            }
            if (this.dotnetSettings_ != null) {
                this.bitField0_ |= 256;
                onChanged();
            }
            return this;
        }

        public Builder clearDotnetSettings() {
            this.bitField0_ &= -257;
            this.dotnetSettings_ = null;
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.dotnetSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public DotnetSettings.Builder getDotnetSettingsBuilder() {
            this.bitField0_ |= 256;
            onChanged();
            return (DotnetSettings.Builder) getDotnetSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public DotnetSettingsOrBuilder getDotnetSettingsOrBuilder() {
            SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> singleFieldBuilderV3 = this.dotnetSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (DotnetSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            DotnetSettings dotnetSettings = this.dotnetSettings_;
            return dotnetSettings == null ? DotnetSettings.getDefaultInstance() : dotnetSettings;
        }

        private SingleFieldBuilderV3<DotnetSettings, DotnetSettings.Builder, DotnetSettingsOrBuilder> getDotnetSettingsFieldBuilder() {
            if (this.dotnetSettingsBuilder_ == null) {
                this.dotnetSettingsBuilder_ = new SingleFieldBuilderV3<>(getDotnetSettings(), getParentForChildren(), isClean());
                this.dotnetSettings_ = null;
            }
            return this.dotnetSettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasRubySettings() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public RubySettings getRubySettings() {
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                RubySettings rubySettings = this.rubySettings_;
                return rubySettings == null ? RubySettings.getDefaultInstance() : rubySettings;
            }
            return (RubySettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setRubySettings(RubySettings rubySettings) {
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                rubySettings.getClass();
                this.rubySettings_ = rubySettings;
            } else {
                singleFieldBuilderV3.setMessage(rubySettings);
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setRubySettings(RubySettings.Builder builder) {
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.rubySettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder mergeRubySettings(RubySettings rubySettings) {
            RubySettings rubySettings2;
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 512) != 0 && (rubySettings2 = this.rubySettings_) != null && rubySettings2 != RubySettings.getDefaultInstance()) {
                    getRubySettingsBuilder().mergeFrom(rubySettings);
                } else {
                    this.rubySettings_ = rubySettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(rubySettings);
            }
            if (this.rubySettings_ != null) {
                this.bitField0_ |= 512;
                onChanged();
            }
            return this;
        }

        public Builder clearRubySettings() {
            this.bitField0_ &= -513;
            this.rubySettings_ = null;
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.rubySettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public RubySettings.Builder getRubySettingsBuilder() {
            this.bitField0_ |= 512;
            onChanged();
            return (RubySettings.Builder) getRubySettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public RubySettingsOrBuilder getRubySettingsOrBuilder() {
            SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> singleFieldBuilderV3 = this.rubySettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RubySettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            RubySettings rubySettings = this.rubySettings_;
            return rubySettings == null ? RubySettings.getDefaultInstance() : rubySettings;
        }

        private SingleFieldBuilderV3<RubySettings, RubySettings.Builder, RubySettingsOrBuilder> getRubySettingsFieldBuilder() {
            if (this.rubySettingsBuilder_ == null) {
                this.rubySettingsBuilder_ = new SingleFieldBuilderV3<>(getRubySettings(), getParentForChildren(), isClean());
                this.rubySettings_ = null;
            }
            return this.rubySettingsBuilder_;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public boolean hasGoSettings() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public GoSettings getGoSettings() {
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                GoSettings goSettings = this.goSettings_;
                return goSettings == null ? GoSettings.getDefaultInstance() : goSettings;
            }
            return (GoSettings) singleFieldBuilderV3.getMessage();
        }

        public Builder setGoSettings(GoSettings goSettings) {
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                goSettings.getClass();
                this.goSettings_ = goSettings;
            } else {
                singleFieldBuilderV3.setMessage(goSettings);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setGoSettings(GoSettings.Builder builder) {
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.goSettings_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder mergeGoSettings(GoSettings goSettings) {
            GoSettings goSettings2;
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1024) != 0 && (goSettings2 = this.goSettings_) != null && goSettings2 != GoSettings.getDefaultInstance()) {
                    getGoSettingsBuilder().mergeFrom(goSettings);
                } else {
                    this.goSettings_ = goSettings;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(goSettings);
            }
            if (this.goSettings_ != null) {
                this.bitField0_ |= 1024;
                onChanged();
            }
            return this;
        }

        public Builder clearGoSettings() {
            this.bitField0_ &= -1025;
            this.goSettings_ = null;
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.goSettingsBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public GoSettings.Builder getGoSettingsBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (GoSettings.Builder) getGoSettingsFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ClientLibrarySettingsOrBuilder
        public GoSettingsOrBuilder getGoSettingsOrBuilder() {
            SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> singleFieldBuilderV3 = this.goSettingsBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (GoSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            GoSettings goSettings = this.goSettings_;
            return goSettings == null ? GoSettings.getDefaultInstance() : goSettings;
        }

        private SingleFieldBuilderV3<GoSettings, GoSettings.Builder, GoSettingsOrBuilder> getGoSettingsFieldBuilder() {
            if (this.goSettingsBuilder_ == null) {
                this.goSettingsBuilder_ = new SingleFieldBuilderV3<>(getGoSettings(), getParentForChildren(), isClean());
                this.goSettings_ = null;
            }
            return this.goSettingsBuilder_;
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

    public static ClientLibrarySettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ClientLibrarySettings> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ClientLibrarySettings> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ClientLibrarySettings getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
