package com.google.api;

import com.google.api.ClientLibrarySettings;
import com.google.api.MethodSettings;
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
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Publishing extends GeneratedMessageV3 implements PublishingOrBuilder {
    public static final int API_SHORT_NAME_FIELD_NUMBER = 103;
    public static final int CODEOWNER_GITHUB_TEAMS_FIELD_NUMBER = 105;
    public static final int DOCUMENTATION_URI_FIELD_NUMBER = 102;
    public static final int DOC_TAG_PREFIX_FIELD_NUMBER = 106;
    public static final int GITHUB_LABEL_FIELD_NUMBER = 104;
    public static final int LIBRARY_SETTINGS_FIELD_NUMBER = 109;
    public static final int METHOD_SETTINGS_FIELD_NUMBER = 2;
    public static final int NEW_ISSUE_URI_FIELD_NUMBER = 101;
    public static final int ORGANIZATION_FIELD_NUMBER = 107;
    public static final int PROTO_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER = 110;
    public static final int REST_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER = 111;
    private static final long serialVersionUID = 0;
    private volatile Object apiShortName_;
    private LazyStringArrayList codeownerGithubTeams_;
    private volatile Object docTagPrefix_;
    private volatile Object documentationUri_;
    private volatile Object githubLabel_;
    private List<ClientLibrarySettings> librarySettings_;
    private byte memoizedIsInitialized;
    private List<MethodSettings> methodSettings_;
    private volatile Object newIssueUri_;
    private int organization_;
    private volatile Object protoReferenceDocumentationUri_;
    private volatile Object restReferenceDocumentationUri_;
    private static final Publishing DEFAULT_INSTANCE = new Publishing();
    private static final Parser<Publishing> PARSER = new AbstractParser<Publishing>() { // from class: com.google.api.Publishing.1
        @Override // com.google.protobuf.Parser
        public Publishing parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Publishing.newBuilder();
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

    private Publishing(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.newIssueUri_ = "";
        this.documentationUri_ = "";
        this.apiShortName_ = "";
        this.githubLabel_ = "";
        this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
        this.docTagPrefix_ = "";
        this.organization_ = 0;
        this.protoReferenceDocumentationUri_ = "";
        this.restReferenceDocumentationUri_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Publishing() {
        this.newIssueUri_ = "";
        this.documentationUri_ = "";
        this.apiShortName_ = "";
        this.githubLabel_ = "";
        this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
        this.docTagPrefix_ = "";
        this.organization_ = 0;
        this.protoReferenceDocumentationUri_ = "";
        this.restReferenceDocumentationUri_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.methodSettings_ = Collections.emptyList();
        this.newIssueUri_ = "";
        this.documentationUri_ = "";
        this.apiShortName_ = "";
        this.githubLabel_ = "";
        this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
        this.docTagPrefix_ = "";
        this.organization_ = 0;
        this.librarySettings_ = Collections.emptyList();
        this.protoReferenceDocumentationUri_ = "";
        this.restReferenceDocumentationUri_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Publishing();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ClientProto.internal_static_google_api_Publishing_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ClientProto.internal_static_google_api_Publishing_fieldAccessorTable.ensureFieldAccessorsInitialized(Publishing.class, Builder.class);
    }

    @Override // com.google.api.PublishingOrBuilder
    public List<MethodSettings> getMethodSettingsList() {
        return this.methodSettings_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public List<? extends MethodSettingsOrBuilder> getMethodSettingsOrBuilderList() {
        return this.methodSettings_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public int getMethodSettingsCount() {
        return this.methodSettings_.size();
    }

    @Override // com.google.api.PublishingOrBuilder
    public MethodSettings getMethodSettings(int i) {
        return this.methodSettings_.get(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public MethodSettingsOrBuilder getMethodSettingsOrBuilder(int i) {
        return this.methodSettings_.get(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getNewIssueUri() {
        Object obj = this.newIssueUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.newIssueUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getNewIssueUriBytes() {
        Object obj = this.newIssueUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.newIssueUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getDocumentationUri() {
        Object obj = this.documentationUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.documentationUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getDocumentationUriBytes() {
        Object obj = this.documentationUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.documentationUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getApiShortName() {
        Object obj = this.apiShortName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.apiShortName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getApiShortNameBytes() {
        Object obj = this.apiShortName_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.apiShortName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getGithubLabel() {
        Object obj = this.githubLabel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.githubLabel_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getGithubLabelBytes() {
        Object obj = this.githubLabel_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.githubLabel_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ProtocolStringList getCodeownerGithubTeamsList() {
        return this.codeownerGithubTeams_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public int getCodeownerGithubTeamsCount() {
        return this.codeownerGithubTeams_.size();
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getCodeownerGithubTeams(int i) {
        return this.codeownerGithubTeams_.get(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getCodeownerGithubTeamsBytes(int i) {
        return this.codeownerGithubTeams_.getByteString(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getDocTagPrefix() {
        Object obj = this.docTagPrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.docTagPrefix_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getDocTagPrefixBytes() {
        Object obj = this.docTagPrefix_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.docTagPrefix_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public int getOrganizationValue() {
        return this.organization_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ClientLibraryOrganization getOrganization() {
        ClientLibraryOrganization clientLibraryOrganizationForNumber = ClientLibraryOrganization.forNumber(this.organization_);
        return clientLibraryOrganizationForNumber == null ? ClientLibraryOrganization.UNRECOGNIZED : clientLibraryOrganizationForNumber;
    }

    @Override // com.google.api.PublishingOrBuilder
    public List<ClientLibrarySettings> getLibrarySettingsList() {
        return this.librarySettings_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public List<? extends ClientLibrarySettingsOrBuilder> getLibrarySettingsOrBuilderList() {
        return this.librarySettings_;
    }

    @Override // com.google.api.PublishingOrBuilder
    public int getLibrarySettingsCount() {
        return this.librarySettings_.size();
    }

    @Override // com.google.api.PublishingOrBuilder
    public ClientLibrarySettings getLibrarySettings(int i) {
        return this.librarySettings_.get(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public ClientLibrarySettingsOrBuilder getLibrarySettingsOrBuilder(int i) {
        return this.librarySettings_.get(i);
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getProtoReferenceDocumentationUri() {
        Object obj = this.protoReferenceDocumentationUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.protoReferenceDocumentationUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getProtoReferenceDocumentationUriBytes() {
        Object obj = this.protoReferenceDocumentationUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.protoReferenceDocumentationUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.PublishingOrBuilder
    public String getRestReferenceDocumentationUri() {
        Object obj = this.restReferenceDocumentationUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.restReferenceDocumentationUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.PublishingOrBuilder
    public ByteString getRestReferenceDocumentationUriBytes() {
        Object obj = this.restReferenceDocumentationUri_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.restReferenceDocumentationUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
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
        for (int i = 0; i < this.methodSettings_.size(); i++) {
            codedOutputStream.writeMessage(2, this.methodSettings_.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.newIssueUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 101, this.newIssueUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.documentationUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 102, this.documentationUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.apiShortName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, API_SHORT_NAME_FIELD_NUMBER, this.apiShortName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.githubLabel_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 104, this.githubLabel_);
        }
        for (int i2 = 0; i2 < this.codeownerGithubTeams_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, CODEOWNER_GITHUB_TEAMS_FIELD_NUMBER, this.codeownerGithubTeams_.getRaw(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.docTagPrefix_)) {
            GeneratedMessageV3.writeString(codedOutputStream, DOC_TAG_PREFIX_FIELD_NUMBER, this.docTagPrefix_);
        }
        if (this.organization_ != ClientLibraryOrganization.CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(ORGANIZATION_FIELD_NUMBER, this.organization_);
        }
        for (int i3 = 0; i3 < this.librarySettings_.size(); i3++) {
            codedOutputStream.writeMessage(109, this.librarySettings_.get(i3));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.protoReferenceDocumentationUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, PROTO_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER, this.protoReferenceDocumentationUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.restReferenceDocumentationUri_)) {
            GeneratedMessageV3.writeString(codedOutputStream, REST_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER, this.restReferenceDocumentationUri_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = 0;
        for (int i2 = 0; i2 < this.methodSettings_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.methodSettings_.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.newIssueUri_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(101, this.newIssueUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.documentationUri_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(102, this.documentationUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.apiShortName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(API_SHORT_NAME_FIELD_NUMBER, this.apiShortName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.githubLabel_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(104, this.githubLabel_);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i3 = 0; i3 < this.codeownerGithubTeams_.size(); i3++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.codeownerGithubTeams_.getRaw(i3));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (getCodeownerGithubTeamsList().size() * 2);
        if (!GeneratedMessageV3.isStringEmpty(this.docTagPrefix_)) {
            size += GeneratedMessageV3.computeStringSize(DOC_TAG_PREFIX_FIELD_NUMBER, this.docTagPrefix_);
        }
        if (this.organization_ != ClientLibraryOrganization.CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED.getNumber()) {
            size += CodedOutputStream.computeEnumSize(ORGANIZATION_FIELD_NUMBER, this.organization_);
        }
        for (int i4 = 0; i4 < this.librarySettings_.size(); i4++) {
            size += CodedOutputStream.computeMessageSize(109, this.librarySettings_.get(i4));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.protoReferenceDocumentationUri_)) {
            size += GeneratedMessageV3.computeStringSize(PROTO_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER, this.protoReferenceDocumentationUri_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.restReferenceDocumentationUri_)) {
            size += GeneratedMessageV3.computeStringSize(REST_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER, this.restReferenceDocumentationUri_);
        }
        int serializedSize = size + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Publishing)) {
            return super.equals(obj);
        }
        Publishing publishing = (Publishing) obj;
        return getMethodSettingsList().equals(publishing.getMethodSettingsList()) && getNewIssueUri().equals(publishing.getNewIssueUri()) && getDocumentationUri().equals(publishing.getDocumentationUri()) && getApiShortName().equals(publishing.getApiShortName()) && getGithubLabel().equals(publishing.getGithubLabel()) && getCodeownerGithubTeamsList().equals(publishing.getCodeownerGithubTeamsList()) && getDocTagPrefix().equals(publishing.getDocTagPrefix()) && this.organization_ == publishing.organization_ && getLibrarySettingsList().equals(publishing.getLibrarySettingsList()) && getProtoReferenceDocumentationUri().equals(publishing.getProtoReferenceDocumentationUri()) && getRestReferenceDocumentationUri().equals(publishing.getRestReferenceDocumentationUri()) && getUnknownFields().equals(publishing.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getMethodSettingsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodSettingsList().hashCode();
        }
        int iHashCode2 = (((((((((((((((iHashCode * 37) + 101) * 53) + getNewIssueUri().hashCode()) * 37) + 102) * 53) + getDocumentationUri().hashCode()) * 37) + API_SHORT_NAME_FIELD_NUMBER) * 53) + getApiShortName().hashCode()) * 37) + 104) * 53) + getGithubLabel().hashCode();
        if (getCodeownerGithubTeamsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + CODEOWNER_GITHUB_TEAMS_FIELD_NUMBER) * 53) + getCodeownerGithubTeamsList().hashCode();
        }
        int iHashCode3 = (((((((iHashCode2 * 37) + DOC_TAG_PREFIX_FIELD_NUMBER) * 53) + getDocTagPrefix().hashCode()) * 37) + ORGANIZATION_FIELD_NUMBER) * 53) + this.organization_;
        if (getLibrarySettingsCount() > 0) {
            iHashCode3 = (((iHashCode3 * 37) + 109) * 53) + getLibrarySettingsList().hashCode();
        }
        int iHashCode4 = (((((((((iHashCode3 * 37) + PROTO_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER) * 53) + getProtoReferenceDocumentationUri().hashCode()) * 37) + REST_REFERENCE_DOCUMENTATION_URI_FIELD_NUMBER) * 53) + getRestReferenceDocumentationUri().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    public static Publishing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Publishing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Publishing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Publishing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Publishing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Publishing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Publishing parseFrom(InputStream inputStream) throws IOException {
        return (Publishing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Publishing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publishing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Publishing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Publishing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Publishing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publishing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Publishing parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Publishing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Publishing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publishing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Publishing publishing) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(publishing);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PublishingOrBuilder {
        private Object apiShortName_;
        private int bitField0_;
        private LazyStringArrayList codeownerGithubTeams_;
        private Object docTagPrefix_;
        private Object documentationUri_;
        private Object githubLabel_;
        private RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> librarySettingsBuilder_;
        private List<ClientLibrarySettings> librarySettings_;
        private RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> methodSettingsBuilder_;
        private List<MethodSettings> methodSettings_;
        private Object newIssueUri_;
        private int organization_;
        private Object protoReferenceDocumentationUri_;
        private Object restReferenceDocumentationUri_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ClientProto.internal_static_google_api_Publishing_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ClientProto.internal_static_google_api_Publishing_fieldAccessorTable.ensureFieldAccessorsInitialized(Publishing.class, Builder.class);
        }

        private Builder() {
            this.methodSettings_ = Collections.emptyList();
            this.newIssueUri_ = "";
            this.documentationUri_ = "";
            this.apiShortName_ = "";
            this.githubLabel_ = "";
            this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
            this.docTagPrefix_ = "";
            this.organization_ = 0;
            this.librarySettings_ = Collections.emptyList();
            this.protoReferenceDocumentationUri_ = "";
            this.restReferenceDocumentationUri_ = "";
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.methodSettings_ = Collections.emptyList();
            this.newIssueUri_ = "";
            this.documentationUri_ = "";
            this.apiShortName_ = "";
            this.githubLabel_ = "";
            this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
            this.docTagPrefix_ = "";
            this.organization_ = 0;
            this.librarySettings_ = Collections.emptyList();
            this.protoReferenceDocumentationUri_ = "";
            this.restReferenceDocumentationUri_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.methodSettings_ = Collections.emptyList();
            } else {
                this.methodSettings_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            this.newIssueUri_ = "";
            this.documentationUri_ = "";
            this.apiShortName_ = "";
            this.githubLabel_ = "";
            this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
            this.docTagPrefix_ = "";
            this.organization_ = 0;
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV32 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.librarySettings_ = Collections.emptyList();
            } else {
                this.librarySettings_ = null;
                repeatedFieldBuilderV32.clear();
            }
            this.bitField0_ &= -257;
            this.protoReferenceDocumentationUri_ = "";
            this.restReferenceDocumentationUri_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ClientProto.internal_static_google_api_Publishing_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Publishing getDefaultInstanceForType() {
            return Publishing.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Publishing build() {
            Publishing publishingBuildPartial = buildPartial();
            if (publishingBuildPartial.isInitialized()) {
                return publishingBuildPartial;
            }
            throw newUninitializedMessageException((Message) publishingBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Publishing buildPartial() {
            Publishing publishing = new Publishing(this);
            buildPartialRepeatedFields(publishing);
            if (this.bitField0_ != 0) {
                buildPartial0(publishing);
            }
            onBuilt();
            return publishing;
        }

        private void buildPartialRepeatedFields(Publishing publishing) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                publishing.methodSettings_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.methodSettings_ = Collections.unmodifiableList(this.methodSettings_);
                    this.bitField0_ &= -2;
                }
                publishing.methodSettings_ = this.methodSettings_;
            }
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV32 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                publishing.librarySettings_ = repeatedFieldBuilderV32.build();
                return;
            }
            if ((this.bitField0_ & 256) != 0) {
                this.librarySettings_ = Collections.unmodifiableList(this.librarySettings_);
                this.bitField0_ &= -257;
            }
            publishing.librarySettings_ = this.librarySettings_;
        }

        private void buildPartial0(Publishing publishing) {
            int i = this.bitField0_;
            if ((i & 2) != 0) {
                publishing.newIssueUri_ = this.newIssueUri_;
            }
            if ((i & 4) != 0) {
                publishing.documentationUri_ = this.documentationUri_;
            }
            if ((i & 8) != 0) {
                publishing.apiShortName_ = this.apiShortName_;
            }
            if ((i & 16) != 0) {
                publishing.githubLabel_ = this.githubLabel_;
            }
            if ((i & 32) != 0) {
                this.codeownerGithubTeams_.makeImmutable();
                publishing.codeownerGithubTeams_ = this.codeownerGithubTeams_;
            }
            if ((i & 64) != 0) {
                publishing.docTagPrefix_ = this.docTagPrefix_;
            }
            if ((i & 128) != 0) {
                publishing.organization_ = this.organization_;
            }
            if ((i & 512) != 0) {
                publishing.protoReferenceDocumentationUri_ = this.protoReferenceDocumentationUri_;
            }
            if ((i & 1024) != 0) {
                publishing.restReferenceDocumentationUri_ = this.restReferenceDocumentationUri_;
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
            if (message instanceof Publishing) {
                return mergeFrom((Publishing) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Publishing publishing) {
            if (publishing == Publishing.getDefaultInstance()) {
                return this;
            }
            if (this.methodSettingsBuilder_ == null) {
                if (!publishing.methodSettings_.isEmpty()) {
                    if (this.methodSettings_.isEmpty()) {
                        this.methodSettings_ = publishing.methodSettings_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMethodSettingsIsMutable();
                        this.methodSettings_.addAll(publishing.methodSettings_);
                    }
                    onChanged();
                }
            } else if (!publishing.methodSettings_.isEmpty()) {
                if (!this.methodSettingsBuilder_.isEmpty()) {
                    this.methodSettingsBuilder_.addAllMessages(publishing.methodSettings_);
                } else {
                    this.methodSettingsBuilder_.dispose();
                    this.methodSettingsBuilder_ = null;
                    this.methodSettings_ = publishing.methodSettings_;
                    this.bitField0_ &= -2;
                    this.methodSettingsBuilder_ = Publishing.alwaysUseFieldBuilders ? getMethodSettingsFieldBuilder() : null;
                }
            }
            if (!publishing.getNewIssueUri().isEmpty()) {
                this.newIssueUri_ = publishing.newIssueUri_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!publishing.getDocumentationUri().isEmpty()) {
                this.documentationUri_ = publishing.documentationUri_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!publishing.getApiShortName().isEmpty()) {
                this.apiShortName_ = publishing.apiShortName_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!publishing.getGithubLabel().isEmpty()) {
                this.githubLabel_ = publishing.githubLabel_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (!publishing.codeownerGithubTeams_.isEmpty()) {
                if (this.codeownerGithubTeams_.isEmpty()) {
                    this.codeownerGithubTeams_ = publishing.codeownerGithubTeams_;
                    this.bitField0_ |= 32;
                } else {
                    ensureCodeownerGithubTeamsIsMutable();
                    this.codeownerGithubTeams_.addAll(publishing.codeownerGithubTeams_);
                }
                onChanged();
            }
            if (!publishing.getDocTagPrefix().isEmpty()) {
                this.docTagPrefix_ = publishing.docTagPrefix_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (publishing.organization_ != 0) {
                setOrganizationValue(publishing.getOrganizationValue());
            }
            if (this.librarySettingsBuilder_ == null) {
                if (!publishing.librarySettings_.isEmpty()) {
                    if (this.librarySettings_.isEmpty()) {
                        this.librarySettings_ = publishing.librarySettings_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureLibrarySettingsIsMutable();
                        this.librarySettings_.addAll(publishing.librarySettings_);
                    }
                    onChanged();
                }
            } else if (!publishing.librarySettings_.isEmpty()) {
                if (!this.librarySettingsBuilder_.isEmpty()) {
                    this.librarySettingsBuilder_.addAllMessages(publishing.librarySettings_);
                } else {
                    this.librarySettingsBuilder_.dispose();
                    this.librarySettingsBuilder_ = null;
                    this.librarySettings_ = publishing.librarySettings_;
                    this.bitField0_ &= -257;
                    this.librarySettingsBuilder_ = Publishing.alwaysUseFieldBuilders ? getLibrarySettingsFieldBuilder() : null;
                }
            }
            if (!publishing.getProtoReferenceDocumentationUri().isEmpty()) {
                this.protoReferenceDocumentationUri_ = publishing.protoReferenceDocumentationUri_;
                this.bitField0_ |= 512;
                onChanged();
            }
            if (!publishing.getRestReferenceDocumentationUri().isEmpty()) {
                this.restReferenceDocumentationUri_ = publishing.restReferenceDocumentationUri_;
                this.bitField0_ |= 1024;
                onChanged();
            }
            mergeUnknownFields(publishing.getUnknownFields());
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
                            case 18:
                                MethodSettings methodSettings = (MethodSettings) codedInputStream.readMessage(MethodSettings.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureMethodSettingsIsMutable();
                                    this.methodSettings_.add(methodSettings);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(methodSettings);
                                }
                                break;
                            case 810:
                                this.newIssueUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                break;
                            case 818:
                                this.documentationUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                break;
                            case 826:
                                this.apiShortName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                break;
                            case 834:
                                this.githubLabel_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                                break;
                            case 842:
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureCodeownerGithubTeamsIsMutable();
                                this.codeownerGithubTeams_.add((Object) stringRequireUtf8);
                                break;
                            case 850:
                                this.docTagPrefix_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 64;
                                break;
                            case 856:
                                this.organization_ = codedInputStream.readEnum();
                                this.bitField0_ |= 128;
                                break;
                            case 874:
                                ClientLibrarySettings clientLibrarySettings = (ClientLibrarySettings) codedInputStream.readMessage(ClientLibrarySettings.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV32 = this.librarySettingsBuilder_;
                                if (repeatedFieldBuilderV32 == null) {
                                    ensureLibrarySettingsIsMutable();
                                    this.librarySettings_.add(clientLibrarySettings);
                                } else {
                                    repeatedFieldBuilderV32.addMessage(clientLibrarySettings);
                                }
                                break;
                            case 882:
                                this.protoReferenceDocumentationUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 512;
                                break;
                            case 890:
                                this.restReferenceDocumentationUri_ = codedInputStream.readStringRequireUtf8();
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

        private void ensureMethodSettingsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.methodSettings_ = new ArrayList(this.methodSettings_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.PublishingOrBuilder
        public List<MethodSettings> getMethodSettingsList() {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.methodSettings_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.PublishingOrBuilder
        public int getMethodSettingsCount() {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodSettings_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.PublishingOrBuilder
        public MethodSettings getMethodSettings(int i) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodSettings_.get(i);
            }
            return (MethodSettings) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMethodSettings(int i, MethodSettings methodSettings) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodSettings.getClass();
                ensureMethodSettingsIsMutable();
                this.methodSettings_.set(i, methodSettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, methodSettings);
            }
            return this;
        }

        public Builder setMethodSettings(int i, MethodSettings.Builder builder) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodSettingsIsMutable();
                this.methodSettings_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMethodSettings(MethodSettings methodSettings) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodSettings.getClass();
                ensureMethodSettingsIsMutable();
                this.methodSettings_.add(methodSettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(methodSettings);
            }
            return this;
        }

        public Builder addMethodSettings(int i, MethodSettings methodSettings) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                methodSettings.getClass();
                ensureMethodSettingsIsMutable();
                this.methodSettings_.add(i, methodSettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, methodSettings);
            }
            return this;
        }

        public Builder addMethodSettings(MethodSettings.Builder builder) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodSettingsIsMutable();
                this.methodSettings_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMethodSettings(int i, MethodSettings.Builder builder) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodSettingsIsMutable();
                this.methodSettings_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMethodSettings(Iterable<? extends MethodSettings> iterable) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodSettingsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.methodSettings_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMethodSettings() {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.methodSettings_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMethodSettings(int i) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMethodSettingsIsMutable();
                this.methodSettings_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MethodSettings.Builder getMethodSettingsBuilder(int i) {
            return (MethodSettings.Builder) getMethodSettingsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.PublishingOrBuilder
        public MethodSettingsOrBuilder getMethodSettingsOrBuilder(int i) {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.methodSettings_.get(i);
            }
            return (MethodSettingsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.PublishingOrBuilder
        public List<? extends MethodSettingsOrBuilder> getMethodSettingsOrBuilderList() {
            RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> repeatedFieldBuilderV3 = this.methodSettingsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.methodSettings_);
        }

        public MethodSettings.Builder addMethodSettingsBuilder() {
            return (MethodSettings.Builder) getMethodSettingsFieldBuilder().addBuilder(MethodSettings.getDefaultInstance());
        }

        public MethodSettings.Builder addMethodSettingsBuilder(int i) {
            return (MethodSettings.Builder) getMethodSettingsFieldBuilder().addBuilder(i, MethodSettings.getDefaultInstance());
        }

        public List<MethodSettings.Builder> getMethodSettingsBuilderList() {
            return getMethodSettingsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MethodSettings, MethodSettings.Builder, MethodSettingsOrBuilder> getMethodSettingsFieldBuilder() {
            if (this.methodSettingsBuilder_ == null) {
                this.methodSettingsBuilder_ = new RepeatedFieldBuilderV3<>(this.methodSettings_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.methodSettings_ = null;
            }
            return this.methodSettingsBuilder_;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getNewIssueUri() {
            Object obj = this.newIssueUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.newIssueUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getNewIssueUriBytes() {
            Object obj = this.newIssueUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.newIssueUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setNewIssueUri(String str) {
            str.getClass();
            this.newIssueUri_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearNewIssueUri() {
            this.newIssueUri_ = Publishing.getDefaultInstance().getNewIssueUri();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setNewIssueUriBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.newIssueUri_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getDocumentationUri() {
            Object obj = this.documentationUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.documentationUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getDocumentationUriBytes() {
            Object obj = this.documentationUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.documentationUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDocumentationUri(String str) {
            str.getClass();
            this.documentationUri_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearDocumentationUri() {
            this.documentationUri_ = Publishing.getDefaultInstance().getDocumentationUri();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setDocumentationUriBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.documentationUri_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getApiShortName() {
            Object obj = this.apiShortName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.apiShortName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getApiShortNameBytes() {
            Object obj = this.apiShortName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.apiShortName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setApiShortName(String str) {
            str.getClass();
            this.apiShortName_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearApiShortName() {
            this.apiShortName_ = Publishing.getDefaultInstance().getApiShortName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setApiShortNameBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.apiShortName_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getGithubLabel() {
            Object obj = this.githubLabel_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.githubLabel_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getGithubLabelBytes() {
            Object obj = this.githubLabel_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.githubLabel_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setGithubLabel(String str) {
            str.getClass();
            this.githubLabel_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearGithubLabel() {
            this.githubLabel_ = Publishing.getDefaultInstance().getGithubLabel();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder setGithubLabelBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.githubLabel_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        private void ensureCodeownerGithubTeamsIsMutable() {
            if (!this.codeownerGithubTeams_.isModifiable()) {
                this.codeownerGithubTeams_ = new LazyStringArrayList((LazyStringList) this.codeownerGithubTeams_);
            }
            this.bitField0_ |= 32;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ProtocolStringList getCodeownerGithubTeamsList() {
            this.codeownerGithubTeams_.makeImmutable();
            return this.codeownerGithubTeams_;
        }

        @Override // com.google.api.PublishingOrBuilder
        public int getCodeownerGithubTeamsCount() {
            return this.codeownerGithubTeams_.size();
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getCodeownerGithubTeams(int i) {
            return this.codeownerGithubTeams_.get(i);
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getCodeownerGithubTeamsBytes(int i) {
            return this.codeownerGithubTeams_.getByteString(i);
        }

        public Builder setCodeownerGithubTeams(int i, String str) {
            str.getClass();
            ensureCodeownerGithubTeamsIsMutable();
            this.codeownerGithubTeams_.set(i, str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addCodeownerGithubTeams(String str) {
            str.getClass();
            ensureCodeownerGithubTeamsIsMutable();
            this.codeownerGithubTeams_.add((Object) str);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder addAllCodeownerGithubTeams(Iterable<String> iterable) {
            ensureCodeownerGithubTeamsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.codeownerGithubTeams_);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearCodeownerGithubTeams() {
            this.codeownerGithubTeams_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder addCodeownerGithubTeamsBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            ensureCodeownerGithubTeamsIsMutable();
            this.codeownerGithubTeams_.add(byteString);
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getDocTagPrefix() {
            Object obj = this.docTagPrefix_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.docTagPrefix_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getDocTagPrefixBytes() {
            Object obj = this.docTagPrefix_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.docTagPrefix_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDocTagPrefix(String str) {
            str.getClass();
            this.docTagPrefix_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder clearDocTagPrefix() {
            this.docTagPrefix_ = Publishing.getDefaultInstance().getDocTagPrefix();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public Builder setDocTagPrefixBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.docTagPrefix_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public int getOrganizationValue() {
            return this.organization_;
        }

        public Builder setOrganizationValue(int i) {
            this.organization_ = i;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ClientLibraryOrganization getOrganization() {
            ClientLibraryOrganization clientLibraryOrganizationForNumber = ClientLibraryOrganization.forNumber(this.organization_);
            return clientLibraryOrganizationForNumber == null ? ClientLibraryOrganization.UNRECOGNIZED : clientLibraryOrganizationForNumber;
        }

        public Builder setOrganization(ClientLibraryOrganization clientLibraryOrganization) {
            clientLibraryOrganization.getClass();
            this.bitField0_ |= 128;
            this.organization_ = clientLibraryOrganization.getNumber();
            onChanged();
            return this;
        }

        public Builder clearOrganization() {
            this.bitField0_ &= -129;
            this.organization_ = 0;
            onChanged();
            return this;
        }

        private void ensureLibrarySettingsIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.librarySettings_ = new ArrayList(this.librarySettings_);
                this.bitField0_ |= 256;
            }
        }

        @Override // com.google.api.PublishingOrBuilder
        public List<ClientLibrarySettings> getLibrarySettingsList() {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.librarySettings_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.PublishingOrBuilder
        public int getLibrarySettingsCount() {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.librarySettings_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.PublishingOrBuilder
        public ClientLibrarySettings getLibrarySettings(int i) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.librarySettings_.get(i);
            }
            return (ClientLibrarySettings) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setLibrarySettings(int i, ClientLibrarySettings clientLibrarySettings) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                clientLibrarySettings.getClass();
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.set(i, clientLibrarySettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, clientLibrarySettings);
            }
            return this;
        }

        public Builder setLibrarySettings(int i, ClientLibrarySettings.Builder builder) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addLibrarySettings(ClientLibrarySettings clientLibrarySettings) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                clientLibrarySettings.getClass();
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.add(clientLibrarySettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(clientLibrarySettings);
            }
            return this;
        }

        public Builder addLibrarySettings(int i, ClientLibrarySettings clientLibrarySettings) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                clientLibrarySettings.getClass();
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.add(i, clientLibrarySettings);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, clientLibrarySettings);
            }
            return this;
        }

        public Builder addLibrarySettings(ClientLibrarySettings.Builder builder) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addLibrarySettings(int i, ClientLibrarySettings.Builder builder) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllLibrarySettings(Iterable<? extends ClientLibrarySettings> iterable) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLibrarySettingsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.librarySettings_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearLibrarySettings() {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.librarySettings_ = Collections.emptyList();
                this.bitField0_ &= -257;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeLibrarySettings(int i) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLibrarySettingsIsMutable();
                this.librarySettings_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ClientLibrarySettings.Builder getLibrarySettingsBuilder(int i) {
            return (ClientLibrarySettings.Builder) getLibrarySettingsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.PublishingOrBuilder
        public ClientLibrarySettingsOrBuilder getLibrarySettingsOrBuilder(int i) {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.librarySettings_.get(i);
            }
            return (ClientLibrarySettingsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.PublishingOrBuilder
        public List<? extends ClientLibrarySettingsOrBuilder> getLibrarySettingsOrBuilderList() {
            RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> repeatedFieldBuilderV3 = this.librarySettingsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.librarySettings_);
        }

        public ClientLibrarySettings.Builder addLibrarySettingsBuilder() {
            return (ClientLibrarySettings.Builder) getLibrarySettingsFieldBuilder().addBuilder(ClientLibrarySettings.getDefaultInstance());
        }

        public ClientLibrarySettings.Builder addLibrarySettingsBuilder(int i) {
            return (ClientLibrarySettings.Builder) getLibrarySettingsFieldBuilder().addBuilder(i, ClientLibrarySettings.getDefaultInstance());
        }

        public List<ClientLibrarySettings.Builder> getLibrarySettingsBuilderList() {
            return getLibrarySettingsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ClientLibrarySettings, ClientLibrarySettings.Builder, ClientLibrarySettingsOrBuilder> getLibrarySettingsFieldBuilder() {
            if (this.librarySettingsBuilder_ == null) {
                this.librarySettingsBuilder_ = new RepeatedFieldBuilderV3<>(this.librarySettings_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
                this.librarySettings_ = null;
            }
            return this.librarySettingsBuilder_;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getProtoReferenceDocumentationUri() {
            Object obj = this.protoReferenceDocumentationUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.protoReferenceDocumentationUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getProtoReferenceDocumentationUriBytes() {
            Object obj = this.protoReferenceDocumentationUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.protoReferenceDocumentationUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setProtoReferenceDocumentationUri(String str) {
            str.getClass();
            this.protoReferenceDocumentationUri_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder clearProtoReferenceDocumentationUri() {
            this.protoReferenceDocumentationUri_ = Publishing.getDefaultInstance().getProtoReferenceDocumentationUri();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public Builder setProtoReferenceDocumentationUriBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.protoReferenceDocumentationUri_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        @Override // com.google.api.PublishingOrBuilder
        public String getRestReferenceDocumentationUri() {
            Object obj = this.restReferenceDocumentationUri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.restReferenceDocumentationUri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.PublishingOrBuilder
        public ByteString getRestReferenceDocumentationUriBytes() {
            Object obj = this.restReferenceDocumentationUri_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.restReferenceDocumentationUri_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setRestReferenceDocumentationUri(String str) {
            str.getClass();
            this.restReferenceDocumentationUri_ = str;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder clearRestReferenceDocumentationUri() {
            this.restReferenceDocumentationUri_ = Publishing.getDefaultInstance().getRestReferenceDocumentationUri();
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public Builder setRestReferenceDocumentationUriBytes(ByteString byteString) {
            byteString.getClass();
            Publishing.checkByteStringIsUtf8(byteString);
            this.restReferenceDocumentationUri_ = byteString;
            this.bitField0_ |= 1024;
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

    public static Publishing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Publishing> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Publishing> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Publishing getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
