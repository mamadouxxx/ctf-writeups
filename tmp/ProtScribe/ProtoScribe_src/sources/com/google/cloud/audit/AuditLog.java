package com.google.cloud.audit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.PolicyViolationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.cloud.audit.ResourceLocation;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.rpc.Status;
import com.google.rpc.StatusOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AuditLog extends GeneratedMessageV3 implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    public static final int METADATA_FIELD_NUMBER = 18;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    public static final int POLICY_VIOLATION_INFO_FIELD_NUMBER = 25;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_LOCATION_FIELD_NUMBER = 20;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESOURCE_ORIGINAL_STATE_FIELD_NUMBER = 19;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private AuthenticationInfo authenticationInfo_;
    private List<AuthorizationInfo> authorizationInfo_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private Struct metadata_;
    private volatile Object methodName_;
    private long numResponseItems_;
    private PolicyViolationInfo policyViolationInfo_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private ResourceLocation resourceLocation_;
    private volatile Object resourceName_;
    private Struct resourceOriginalState_;
    private Struct response_;
    private Any serviceData_;
    private volatile Object serviceName_;
    private Status status_;
    private static final AuditLog DEFAULT_INSTANCE = new AuditLog();
    private static final Parser<AuditLog> PARSER = new AbstractParser<AuditLog>() { // from class: com.google.cloud.audit.AuditLog.1
        @Override // com.google.protobuf.Parser
        public AuditLog parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = AuditLog.newBuilder();
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

    static /* synthetic */ int access$1976(AuditLog auditLog, int i) {
        int i2 = i | auditLog.bitField0_;
        auditLog.bitField0_ = i2;
        return i2;
    }

    private AuditLog(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.serviceName_ = "";
        this.methodName_ = "";
        this.resourceName_ = "";
        this.numResponseItems_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuditLog() {
        this.serviceName_ = "";
        this.methodName_ = "";
        this.resourceName_ = "";
        this.numResponseItems_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.serviceName_ = "";
        this.methodName_ = "";
        this.resourceName_ = "";
        this.authorizationInfo_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuditLog();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_AuditLog_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_AuditLog_fieldAccessorTable.ensureFieldAccessorsInitialized(AuditLog.class, Builder.class);
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getServiceName() {
        Object obj = this.serviceName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.serviceName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getServiceNameBytes() {
        Object obj = this.serviceName_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getMethodName() {
        Object obj = this.methodName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.methodName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getMethodNameBytes() {
        Object obj = this.methodName_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.methodName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getResourceName() {
        Object obj = this.resourceName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.resourceName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getResourceNameBytes() {
        Object obj = this.resourceName_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.resourceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasResourceLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ResourceLocation getResourceLocation() {
        ResourceLocation resourceLocation = this.resourceLocation_;
        return resourceLocation == null ? ResourceLocation.getDefaultInstance() : resourceLocation;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ResourceLocationOrBuilder getResourceLocationOrBuilder() {
        ResourceLocation resourceLocation = this.resourceLocation_;
        return resourceLocation == null ? ResourceLocation.getDefaultInstance() : resourceLocation;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasResourceOriginalState() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getResourceOriginalState() {
        Struct struct = this.resourceOriginalState_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public StructOrBuilder getResourceOriginalStateOrBuilder() {
        Struct struct = this.resourceOriginalState_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public StatusOrBuilder getStatusOrBuilder() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasAuthenticationInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthenticationInfoOrBuilder getAuthenticationInfoOrBuilder() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public List<? extends AuthorizationInfoOrBuilder> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthorizationInfo getAuthorizationInfo(int i) {
        return this.authorizationInfo_.get(i);
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int i) {
        return this.authorizationInfo_.get(i);
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasPolicyViolationInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public PolicyViolationInfo getPolicyViolationInfo() {
        PolicyViolationInfo policyViolationInfo = this.policyViolationInfo_;
        return policyViolationInfo == null ? PolicyViolationInfo.getDefaultInstance() : policyViolationInfo;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public PolicyViolationInfoOrBuilder getPolicyViolationInfoOrBuilder() {
        PolicyViolationInfo policyViolationInfo = this.policyViolationInfo_;
        return policyViolationInfo == null ? PolicyViolationInfo.getDefaultInstance() : policyViolationInfo;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasRequestMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public RequestMetadataOrBuilder getRequestMetadataOrBuilder() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasRequest() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getRequest() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public StructOrBuilder getRequestOrBuilder() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasResponse() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getResponse() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public StructOrBuilder getResponseOrBuilder() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasMetadata() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getMetadata() {
        Struct struct = this.metadata_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public StructOrBuilder getMetadataOrBuilder() {
        Struct struct = this.metadata_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    @Deprecated
    public boolean hasServiceData() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    @Deprecated
    public Any getServiceData() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    @Deprecated
    public AnyOrBuilder getServiceDataOrBuilder() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
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
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(2, getStatus());
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(3, getAuthenticationInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputStream.writeMessage(4, getRequestMetadata());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.serviceName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.methodName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.methodName_);
        }
        for (int i = 0; i < this.authorizationInfo_.size(); i++) {
            codedOutputStream.writeMessage(9, this.authorizationInfo_.get(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.resourceName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.resourceName_);
        }
        long j = this.numResponseItems_;
        if (j != 0) {
            codedOutputStream.writeInt64(12, j);
        }
        if ((this.bitField0_ & 512) != 0) {
            codedOutputStream.writeMessage(15, getServiceData());
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputStream.writeMessage(16, getRequest());
        }
        if ((this.bitField0_ & 128) != 0) {
            codedOutputStream.writeMessage(17, getResponse());
        }
        if ((this.bitField0_ & 256) != 0) {
            codedOutputStream.writeMessage(18, getMetadata());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(19, getResourceOriginalState());
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(20, getResourceLocation());
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputStream.writeMessage(25, getPolicyViolationInfo());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 4) != 0 ? CodedOutputStream.computeMessageSize(2, getStatus()) : 0;
        if ((this.bitField0_ & 8) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getAuthenticationInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getRequestMetadata());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(7, this.serviceName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.methodName_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(8, this.methodName_);
        }
        for (int i2 = 0; i2 < this.authorizationInfo_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(9, this.authorizationInfo_.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.resourceName_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(11, this.resourceName_);
        }
        long j = this.numResponseItems_;
        if (j != 0) {
            iComputeMessageSize += CodedOutputStream.computeInt64Size(12, j);
        }
        if ((this.bitField0_ & 512) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getServiceData());
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getRequest());
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getResponse());
        }
        if ((this.bitField0_ & 256) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getMetadata());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getResourceOriginalState());
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(20, getResourceLocation());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(25, getPolicyViolationInfo());
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuditLog)) {
            return super.equals(obj);
        }
        AuditLog auditLog = (AuditLog) obj;
        if (!getServiceName().equals(auditLog.getServiceName()) || !getMethodName().equals(auditLog.getMethodName()) || !getResourceName().equals(auditLog.getResourceName()) || hasResourceLocation() != auditLog.hasResourceLocation()) {
            return false;
        }
        if ((hasResourceLocation() && !getResourceLocation().equals(auditLog.getResourceLocation())) || hasResourceOriginalState() != auditLog.hasResourceOriginalState()) {
            return false;
        }
        if ((hasResourceOriginalState() && !getResourceOriginalState().equals(auditLog.getResourceOriginalState())) || getNumResponseItems() != auditLog.getNumResponseItems() || hasStatus() != auditLog.hasStatus()) {
            return false;
        }
        if ((hasStatus() && !getStatus().equals(auditLog.getStatus())) || hasAuthenticationInfo() != auditLog.hasAuthenticationInfo()) {
            return false;
        }
        if ((hasAuthenticationInfo() && !getAuthenticationInfo().equals(auditLog.getAuthenticationInfo())) || !getAuthorizationInfoList().equals(auditLog.getAuthorizationInfoList()) || hasPolicyViolationInfo() != auditLog.hasPolicyViolationInfo()) {
            return false;
        }
        if ((hasPolicyViolationInfo() && !getPolicyViolationInfo().equals(auditLog.getPolicyViolationInfo())) || hasRequestMetadata() != auditLog.hasRequestMetadata()) {
            return false;
        }
        if ((hasRequestMetadata() && !getRequestMetadata().equals(auditLog.getRequestMetadata())) || hasRequest() != auditLog.hasRequest()) {
            return false;
        }
        if ((hasRequest() && !getRequest().equals(auditLog.getRequest())) || hasResponse() != auditLog.hasResponse()) {
            return false;
        }
        if ((hasResponse() && !getResponse().equals(auditLog.getResponse())) || hasMetadata() != auditLog.hasMetadata()) {
            return false;
        }
        if ((!hasMetadata() || getMetadata().equals(auditLog.getMetadata())) && hasServiceData() == auditLog.hasServiceData()) {
            return (!hasServiceData() || getServiceData().equals(auditLog.getServiceData())) && getUnknownFields().equals(auditLog.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 7) * 53) + getServiceName().hashCode()) * 37) + 8) * 53) + getMethodName().hashCode()) * 37) + 11) * 53) + getResourceName().hashCode();
        if (hasResourceLocation()) {
            iHashCode = (((iHashCode * 37) + 20) * 53) + getResourceLocation().hashCode();
        }
        if (hasResourceOriginalState()) {
            iHashCode = (((iHashCode * 37) + 19) * 53) + getResourceOriginalState().hashCode();
        }
        int iHashLong = (((iHashCode * 37) + 12) * 53) + Internal.hashLong(getNumResponseItems());
        if (hasStatus()) {
            iHashLong = (((iHashLong * 37) + 2) * 53) + getStatus().hashCode();
        }
        if (hasAuthenticationInfo()) {
            iHashLong = (((iHashLong * 37) + 3) * 53) + getAuthenticationInfo().hashCode();
        }
        if (getAuthorizationInfoCount() > 0) {
            iHashLong = (((iHashLong * 37) + 9) * 53) + getAuthorizationInfoList().hashCode();
        }
        if (hasPolicyViolationInfo()) {
            iHashLong = (((iHashLong * 37) + 25) * 53) + getPolicyViolationInfo().hashCode();
        }
        if (hasRequestMetadata()) {
            iHashLong = (((iHashLong * 37) + 4) * 53) + getRequestMetadata().hashCode();
        }
        if (hasRequest()) {
            iHashLong = (((iHashLong * 37) + 16) * 53) + getRequest().hashCode();
        }
        if (hasResponse()) {
            iHashLong = (((iHashLong * 37) + 17) * 53) + getResponse().hashCode();
        }
        if (hasMetadata()) {
            iHashLong = (((iHashLong * 37) + 18) * 53) + getMetadata().hashCode();
        }
        if (hasServiceData()) {
            iHashLong = (((iHashLong * 37) + 15) * 53) + getServiceData().hashCode();
        }
        int iHashCode2 = (iHashLong * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuditLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuditLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuditLog auditLog) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(auditLog);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuditLogOrBuilder {
        private SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> authenticationInfoBuilder_;
        private AuthenticationInfo authenticationInfo_;
        private RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> authorizationInfoBuilder_;
        private List<AuthorizationInfo> authorizationInfo_;
        private int bitField0_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> metadataBuilder_;
        private Struct metadata_;
        private Object methodName_;
        private long numResponseItems_;
        private SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> policyViolationInfoBuilder_;
        private PolicyViolationInfo policyViolationInfo_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> requestBuilder_;
        private SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> requestMetadataBuilder_;
        private RequestMetadata requestMetadata_;
        private Struct request_;
        private SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> resourceLocationBuilder_;
        private ResourceLocation resourceLocation_;
        private Object resourceName_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> resourceOriginalStateBuilder_;
        private Struct resourceOriginalState_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> responseBuilder_;
        private Struct response_;
        private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> serviceDataBuilder_;
        private Any serviceData_;
        private Object serviceName_;
        private SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> statusBuilder_;
        private Status status_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_AuditLog_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_AuditLog_fieldAccessorTable.ensureFieldAccessorsInitialized(AuditLog.class, Builder.class);
        }

        private Builder() {
            this.serviceName_ = "";
            this.methodName_ = "";
            this.resourceName_ = "";
            this.authorizationInfo_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.serviceName_ = "";
            this.methodName_ = "";
            this.resourceName_ = "";
            this.authorizationInfo_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AuditLog.alwaysUseFieldBuilders) {
                getResourceLocationFieldBuilder();
                getResourceOriginalStateFieldBuilder();
                getStatusFieldBuilder();
                getAuthenticationInfoFieldBuilder();
                getAuthorizationInfoFieldBuilder();
                getPolicyViolationInfoFieldBuilder();
                getRequestMetadataFieldBuilder();
                getRequestFieldBuilder();
                getResponseFieldBuilder();
                getMetadataFieldBuilder();
                getServiceDataFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.serviceName_ = "";
            this.methodName_ = "";
            this.resourceName_ = "";
            this.resourceLocation_ = null;
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceLocationBuilder_ = null;
            }
            this.resourceOriginalState_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.resourceOriginalStateBuilder_ = null;
            }
            this.numResponseItems_ = 0L;
            this.status_ = null;
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV33 = this.statusBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.statusBuilder_ = null;
            }
            this.authenticationInfo_ = null;
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV34 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.dispose();
                this.authenticationInfoBuilder_ = null;
            }
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.authorizationInfo_ = Collections.emptyList();
            } else {
                this.authorizationInfo_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -257;
            this.policyViolationInfo_ = null;
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV35 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV35 != null) {
                singleFieldBuilderV35.dispose();
                this.policyViolationInfoBuilder_ = null;
            }
            this.requestMetadata_ = null;
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV36 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV36 != null) {
                singleFieldBuilderV36.dispose();
                this.requestMetadataBuilder_ = null;
            }
            this.request_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV37 = this.requestBuilder_;
            if (singleFieldBuilderV37 != null) {
                singleFieldBuilderV37.dispose();
                this.requestBuilder_ = null;
            }
            this.response_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV38 = this.responseBuilder_;
            if (singleFieldBuilderV38 != null) {
                singleFieldBuilderV38.dispose();
                this.responseBuilder_ = null;
            }
            this.metadata_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV39 = this.metadataBuilder_;
            if (singleFieldBuilderV39 != null) {
                singleFieldBuilderV39.dispose();
                this.metadataBuilder_ = null;
            }
            this.serviceData_ = null;
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV310 = this.serviceDataBuilder_;
            if (singleFieldBuilderV310 != null) {
                singleFieldBuilderV310.dispose();
                this.serviceDataBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_AuditLog_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuditLog getDefaultInstanceForType() {
            return AuditLog.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuditLog build() {
            AuditLog auditLogBuildPartial = buildPartial();
            if (auditLogBuildPartial.isInitialized()) {
                return auditLogBuildPartial;
            }
            throw newUninitializedMessageException((Message) auditLogBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuditLog buildPartial() {
            AuditLog auditLog = new AuditLog(this);
            buildPartialRepeatedFields(auditLog);
            if (this.bitField0_ != 0) {
                buildPartial0(auditLog);
            }
            onBuilt();
            return auditLog;
        }

        private void buildPartialRepeatedFields(AuditLog auditLog) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                auditLog.authorizationInfo_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 256) != 0) {
                this.authorizationInfo_ = Collections.unmodifiableList(this.authorizationInfo_);
                this.bitField0_ &= -257;
            }
            auditLog.authorizationInfo_ = this.authorizationInfo_;
        }

        private void buildPartial0(AuditLog auditLog) {
            int i;
            PolicyViolationInfo policyViolationInfo;
            AuthenticationInfo authenticationInfo;
            Struct struct;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                auditLog.serviceName_ = this.serviceName_;
            }
            if ((i2 & 2) != 0) {
                auditLog.methodName_ = this.methodName_;
            }
            if ((i2 & 4) != 0) {
                auditLog.resourceName_ = this.resourceName_;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
                auditLog.resourceLocation_ = singleFieldBuilderV3 == null ? this.resourceLocation_ : (ResourceLocation) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.resourceOriginalStateBuilder_;
                if (singleFieldBuilderV32 == null) {
                    struct = this.resourceOriginalState_;
                } else {
                    struct = (Struct) singleFieldBuilderV32.build();
                }
                auditLog.resourceOriginalState_ = struct;
                i |= 2;
            }
            if ((i2 & 32) != 0) {
                auditLog.numResponseItems_ = this.numResponseItems_;
            }
            if ((i2 & 64) != 0) {
                SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV33 = this.statusBuilder_;
                auditLog.status_ = singleFieldBuilderV33 == null ? this.status_ : (Status) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i2 & 128) != 0) {
                SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV34 = this.authenticationInfoBuilder_;
                if (singleFieldBuilderV34 == null) {
                    authenticationInfo = this.authenticationInfo_;
                } else {
                    authenticationInfo = (AuthenticationInfo) singleFieldBuilderV34.build();
                }
                auditLog.authenticationInfo_ = authenticationInfo;
                i |= 8;
            }
            if ((i2 & 512) != 0) {
                SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV35 = this.policyViolationInfoBuilder_;
                if (singleFieldBuilderV35 == null) {
                    policyViolationInfo = this.policyViolationInfo_;
                } else {
                    policyViolationInfo = (PolicyViolationInfo) singleFieldBuilderV35.build();
                }
                auditLog.policyViolationInfo_ = policyViolationInfo;
                i |= 16;
            }
            if ((i2 & 1024) != 0) {
                SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV36 = this.requestMetadataBuilder_;
                auditLog.requestMetadata_ = singleFieldBuilderV36 == null ? this.requestMetadata_ : (RequestMetadata) singleFieldBuilderV36.build();
                i |= 32;
            }
            if ((i2 & 2048) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV37 = this.requestBuilder_;
                auditLog.request_ = singleFieldBuilderV37 == null ? this.request_ : (Struct) singleFieldBuilderV37.build();
                i |= 64;
            }
            if ((i2 & 4096) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV38 = this.responseBuilder_;
                auditLog.response_ = singleFieldBuilderV38 == null ? this.response_ : (Struct) singleFieldBuilderV38.build();
                i |= 128;
            }
            if ((i2 & 8192) != 0) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV39 = this.metadataBuilder_;
                auditLog.metadata_ = singleFieldBuilderV39 == null ? this.metadata_ : (Struct) singleFieldBuilderV39.build();
                i |= 256;
            }
            if ((i2 & 16384) != 0) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV310 = this.serviceDataBuilder_;
                auditLog.serviceData_ = singleFieldBuilderV310 == null ? this.serviceData_ : (Any) singleFieldBuilderV310.build();
                i |= 512;
            }
            AuditLog.access$1976(auditLog, i);
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
            if (message instanceof AuditLog) {
                return mergeFrom((AuditLog) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuditLog auditLog) {
            if (auditLog == AuditLog.getDefaultInstance()) {
                return this;
            }
            if (!auditLog.getServiceName().isEmpty()) {
                this.serviceName_ = auditLog.serviceName_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!auditLog.getMethodName().isEmpty()) {
                this.methodName_ = auditLog.methodName_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!auditLog.getResourceName().isEmpty()) {
                this.resourceName_ = auditLog.resourceName_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (auditLog.hasResourceLocation()) {
                mergeResourceLocation(auditLog.getResourceLocation());
            }
            if (auditLog.hasResourceOriginalState()) {
                mergeResourceOriginalState(auditLog.getResourceOriginalState());
            }
            if (auditLog.getNumResponseItems() != 0) {
                setNumResponseItems(auditLog.getNumResponseItems());
            }
            if (auditLog.hasStatus()) {
                mergeStatus(auditLog.getStatus());
            }
            if (auditLog.hasAuthenticationInfo()) {
                mergeAuthenticationInfo(auditLog.getAuthenticationInfo());
            }
            if (this.authorizationInfoBuilder_ == null) {
                if (!auditLog.authorizationInfo_.isEmpty()) {
                    if (this.authorizationInfo_.isEmpty()) {
                        this.authorizationInfo_ = auditLog.authorizationInfo_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureAuthorizationInfoIsMutable();
                        this.authorizationInfo_.addAll(auditLog.authorizationInfo_);
                    }
                    onChanged();
                }
            } else if (!auditLog.authorizationInfo_.isEmpty()) {
                if (!this.authorizationInfoBuilder_.isEmpty()) {
                    this.authorizationInfoBuilder_.addAllMessages(auditLog.authorizationInfo_);
                } else {
                    this.authorizationInfoBuilder_.dispose();
                    this.authorizationInfoBuilder_ = null;
                    this.authorizationInfo_ = auditLog.authorizationInfo_;
                    this.bitField0_ &= -257;
                    this.authorizationInfoBuilder_ = AuditLog.alwaysUseFieldBuilders ? getAuthorizationInfoFieldBuilder() : null;
                }
            }
            if (auditLog.hasPolicyViolationInfo()) {
                mergePolicyViolationInfo(auditLog.getPolicyViolationInfo());
            }
            if (auditLog.hasRequestMetadata()) {
                mergeRequestMetadata(auditLog.getRequestMetadata());
            }
            if (auditLog.hasRequest()) {
                mergeRequest(auditLog.getRequest());
            }
            if (auditLog.hasResponse()) {
                mergeResponse(auditLog.getResponse());
            }
            if (auditLog.hasMetadata()) {
                mergeMetadata(auditLog.getMetadata());
            }
            if (auditLog.hasServiceData()) {
                mergeServiceData(auditLog.getServiceData());
            }
            mergeUnknownFields(auditLog.getUnknownFields());
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
                                codedInputStream.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 64;
                                break;
                            case 26:
                                codedInputStream.readMessage(getAuthenticationInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 128;
                                break;
                            case 34:
                                codedInputStream.readMessage(getRequestMetadataFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1024;
                                break;
                            case 58:
                                this.serviceName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                this.methodName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                break;
                            case 74:
                                AuthorizationInfo authorizationInfo = (AuthorizationInfo) codedInputStream.readMessage(AuthorizationInfo.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureAuthorizationInfoIsMutable();
                                    this.authorizationInfo_.add(authorizationInfo);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(authorizationInfo);
                                }
                                break;
                            case 90:
                                this.resourceName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                break;
                            case 96:
                                this.numResponseItems_ = codedInputStream.readInt64();
                                this.bitField0_ |= 32;
                                break;
                            case 122:
                                codedInputStream.readMessage(getServiceDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16384;
                                break;
                            case 130:
                                codedInputStream.readMessage(getRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2048;
                                break;
                            case 138:
                                codedInputStream.readMessage(getResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4096;
                                break;
                            case 146:
                                codedInputStream.readMessage(getMetadataFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8192;
                                break;
                            case 154:
                                codedInputStream.readMessage(getResourceOriginalStateFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                                break;
                            case 162:
                                codedInputStream.readMessage(getResourceLocationFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                                break;
                            case 202:
                                codedInputStream.readMessage(getPolicyViolationInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 512;
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

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getServiceName() {
            Object obj = this.serviceName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.serviceName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getServiceNameBytes() {
            Object obj = this.serviceName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serviceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setServiceName(String str) {
            str.getClass();
            this.serviceName_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearServiceName() {
            this.serviceName_ = AuditLog.getDefaultInstance().getServiceName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setServiceNameBytes(ByteString byteString) {
            byteString.getClass();
            AuditLog.checkByteStringIsUtf8(byteString);
            this.serviceName_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getMethodName() {
            Object obj = this.methodName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.methodName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getMethodNameBytes() {
            Object obj = this.methodName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.methodName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setMethodName(String str) {
            str.getClass();
            this.methodName_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearMethodName() {
            this.methodName_ = AuditLog.getDefaultInstance().getMethodName();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setMethodNameBytes(ByteString byteString) {
            byteString.getClass();
            AuditLog.checkByteStringIsUtf8(byteString);
            this.methodName_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getResourceName() {
            Object obj = this.resourceName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.resourceName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getResourceNameBytes() {
            Object obj = this.resourceName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.resourceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setResourceName(String str) {
            str.getClass();
            this.resourceName_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearResourceName() {
            this.resourceName_ = AuditLog.getDefaultInstance().getResourceName();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setResourceNameBytes(ByteString byteString) {
            byteString.getClass();
            AuditLog.checkByteStringIsUtf8(byteString);
            this.resourceName_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasResourceLocation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ResourceLocation getResourceLocation() {
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 == null) {
                ResourceLocation resourceLocation = this.resourceLocation_;
                return resourceLocation == null ? ResourceLocation.getDefaultInstance() : resourceLocation;
            }
            return (ResourceLocation) singleFieldBuilderV3.getMessage();
        }

        public Builder setResourceLocation(ResourceLocation resourceLocation) {
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 == null) {
                resourceLocation.getClass();
                this.resourceLocation_ = resourceLocation;
            } else {
                singleFieldBuilderV3.setMessage(resourceLocation);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setResourceLocation(ResourceLocation.Builder builder) {
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.resourceLocation_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeResourceLocation(ResourceLocation resourceLocation) {
            ResourceLocation resourceLocation2;
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (resourceLocation2 = this.resourceLocation_) != null && resourceLocation2 != ResourceLocation.getDefaultInstance()) {
                    getResourceLocationBuilder().mergeFrom(resourceLocation);
                } else {
                    this.resourceLocation_ = resourceLocation;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(resourceLocation);
            }
            if (this.resourceLocation_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearResourceLocation() {
            this.bitField0_ &= -9;
            this.resourceLocation_ = null;
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceLocationBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public ResourceLocation.Builder getResourceLocationBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (ResourceLocation.Builder) getResourceLocationFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ResourceLocationOrBuilder getResourceLocationOrBuilder() {
            SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> singleFieldBuilderV3 = this.resourceLocationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ResourceLocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ResourceLocation resourceLocation = this.resourceLocation_;
            return resourceLocation == null ? ResourceLocation.getDefaultInstance() : resourceLocation;
        }

        private SingleFieldBuilderV3<ResourceLocation, ResourceLocation.Builder, ResourceLocationOrBuilder> getResourceLocationFieldBuilder() {
            if (this.resourceLocationBuilder_ == null) {
                this.resourceLocationBuilder_ = new SingleFieldBuilderV3<>(getResourceLocation(), getParentForChildren(), isClean());
                this.resourceLocation_ = null;
            }
            return this.resourceLocationBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasResourceOriginalState() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getResourceOriginalState() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.resourceOriginalState_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setResourceOriginalState(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.resourceOriginalState_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setResourceOriginalState(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.resourceOriginalState_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeResourceOriginalState(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (struct2 = this.resourceOriginalState_) != null && struct2 != Struct.getDefaultInstance()) {
                    getResourceOriginalStateBuilder().mergeFrom(struct);
                } else {
                    this.resourceOriginalState_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.resourceOriginalState_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearResourceOriginalState() {
            this.bitField0_ &= -17;
            this.resourceOriginalState_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceOriginalStateBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getResourceOriginalStateBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (Struct.Builder) getResourceOriginalStateFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public StructOrBuilder getResourceOriginalStateOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.resourceOriginalStateBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.resourceOriginalState_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getResourceOriginalStateFieldBuilder() {
            if (this.resourceOriginalStateBuilder_ == null) {
                this.resourceOriginalStateBuilder_ = new SingleFieldBuilderV3<>(getResourceOriginalState(), getParentForChildren(), isClean());
                this.resourceOriginalState_ = null;
            }
            return this.resourceOriginalStateBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public long getNumResponseItems() {
            return this.numResponseItems_;
        }

        public Builder setNumResponseItems(long j) {
            this.numResponseItems_ = j;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearNumResponseItems() {
            this.bitField0_ &= -33;
            this.numResponseItems_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Status getStatus() {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 == null) {
                Status status = this.status_;
                return status == null ? Status.getDefaultInstance() : status;
            }
            return (Status) singleFieldBuilderV3.getMessage();
        }

        public Builder setStatus(Status status) {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 == null) {
                status.getClass();
                this.status_ = status;
            } else {
                singleFieldBuilderV3.setMessage(status);
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setStatus(Status.Builder builder) {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.status_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder mergeStatus(Status status) {
            Status status2;
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 64) != 0 && (status2 = this.status_) != null && status2 != Status.getDefaultInstance()) {
                    getStatusBuilder().mergeFrom(status);
                } else {
                    this.status_ = status;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(status);
            }
            if (this.status_ != null) {
                this.bitField0_ |= 64;
                onChanged();
            }
            return this;
        }

        public Builder clearStatus() {
            this.bitField0_ &= -65;
            this.status_ = null;
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.statusBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Status.Builder getStatusBuilder() {
            this.bitField0_ |= 64;
            onChanged();
            return (Status.Builder) getStatusFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public StatusOrBuilder getStatusOrBuilder() {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.statusBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Status status = this.status_;
            return status == null ? Status.getDefaultInstance() : status;
        }

        private SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> getStatusFieldBuilder() {
            if (this.statusBuilder_ == null) {
                this.statusBuilder_ = new SingleFieldBuilderV3<>(getStatus(), getParentForChildren(), isClean());
                this.status_ = null;
            }
            return this.statusBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasAuthenticationInfo() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthenticationInfo getAuthenticationInfo() {
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                AuthenticationInfo authenticationInfo = this.authenticationInfo_;
                return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
            }
            return (AuthenticationInfo) singleFieldBuilderV3.getMessage();
        }

        public Builder setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                authenticationInfo.getClass();
                this.authenticationInfo_ = authenticationInfo;
            } else {
                singleFieldBuilderV3.setMessage(authenticationInfo);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setAuthenticationInfo(AuthenticationInfo.Builder builder) {
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.authenticationInfo_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            AuthenticationInfo authenticationInfo2;
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 128) != 0 && (authenticationInfo2 = this.authenticationInfo_) != null && authenticationInfo2 != AuthenticationInfo.getDefaultInstance()) {
                    getAuthenticationInfoBuilder().mergeFrom(authenticationInfo);
                } else {
                    this.authenticationInfo_ = authenticationInfo;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(authenticationInfo);
            }
            if (this.authenticationInfo_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public Builder clearAuthenticationInfo() {
            this.bitField0_ &= -129;
            this.authenticationInfo_ = null;
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.authenticationInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public AuthenticationInfo.Builder getAuthenticationInfoBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (AuthenticationInfo.Builder) getAuthenticationInfoFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthenticationInfoOrBuilder getAuthenticationInfoOrBuilder() {
            SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> singleFieldBuilderV3 = this.authenticationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AuthenticationInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            AuthenticationInfo authenticationInfo = this.authenticationInfo_;
            return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
        }

        private SingleFieldBuilderV3<AuthenticationInfo, AuthenticationInfo.Builder, AuthenticationInfoOrBuilder> getAuthenticationInfoFieldBuilder() {
            if (this.authenticationInfoBuilder_ == null) {
                this.authenticationInfoBuilder_ = new SingleFieldBuilderV3<>(getAuthenticationInfo(), getParentForChildren(), isClean());
                this.authenticationInfo_ = null;
            }
            return this.authenticationInfoBuilder_;
        }

        private void ensureAuthorizationInfoIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
                this.authorizationInfo_ = new ArrayList(this.authorizationInfo_);
                this.bitField0_ |= 256;
            }
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public List<AuthorizationInfo> getAuthorizationInfoList() {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.authorizationInfo_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public int getAuthorizationInfoCount() {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.authorizationInfo_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthorizationInfo getAuthorizationInfo(int i) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.authorizationInfo_.get(i);
            }
            return (AuthorizationInfo) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                authorizationInfo.getClass();
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.set(i, authorizationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, authorizationInfo);
            }
            return this;
        }

        public Builder setAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                authorizationInfo.getClass();
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.add(authorizationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(authorizationInfo);
            }
            return this;
        }

        public Builder addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                authorizationInfo.getClass();
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.add(i, authorizationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, authorizationInfo);
            }
            return this;
        }

        public Builder addAuthorizationInfo(AuthorizationInfo.Builder builder) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAuthorizationInfoIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.authorizationInfo_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAuthorizationInfo() {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.authorizationInfo_ = Collections.emptyList();
                this.bitField0_ &= -257;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeAuthorizationInfo(int i) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAuthorizationInfoIsMutable();
                this.authorizationInfo_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public AuthorizationInfo.Builder getAuthorizationInfoBuilder(int i) {
            return (AuthorizationInfo.Builder) getAuthorizationInfoFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int i) {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.authorizationInfo_.get(i);
            }
            return (AuthorizationInfoOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public List<? extends AuthorizationInfoOrBuilder> getAuthorizationInfoOrBuilderList() {
            RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> repeatedFieldBuilderV3 = this.authorizationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.authorizationInfo_);
        }

        public AuthorizationInfo.Builder addAuthorizationInfoBuilder() {
            return (AuthorizationInfo.Builder) getAuthorizationInfoFieldBuilder().addBuilder(AuthorizationInfo.getDefaultInstance());
        }

        public AuthorizationInfo.Builder addAuthorizationInfoBuilder(int i) {
            return (AuthorizationInfo.Builder) getAuthorizationInfoFieldBuilder().addBuilder(i, AuthorizationInfo.getDefaultInstance());
        }

        public List<AuthorizationInfo.Builder> getAuthorizationInfoBuilderList() {
            return getAuthorizationInfoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<AuthorizationInfo, AuthorizationInfo.Builder, AuthorizationInfoOrBuilder> getAuthorizationInfoFieldBuilder() {
            if (this.authorizationInfoBuilder_ == null) {
                this.authorizationInfoBuilder_ = new RepeatedFieldBuilderV3<>(this.authorizationInfo_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
                this.authorizationInfo_ = null;
            }
            return this.authorizationInfoBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasPolicyViolationInfo() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public PolicyViolationInfo getPolicyViolationInfo() {
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                PolicyViolationInfo policyViolationInfo = this.policyViolationInfo_;
                return policyViolationInfo == null ? PolicyViolationInfo.getDefaultInstance() : policyViolationInfo;
            }
            return (PolicyViolationInfo) singleFieldBuilderV3.getMessage();
        }

        public Builder setPolicyViolationInfo(PolicyViolationInfo policyViolationInfo) {
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                policyViolationInfo.getClass();
                this.policyViolationInfo_ = policyViolationInfo;
            } else {
                singleFieldBuilderV3.setMessage(policyViolationInfo);
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setPolicyViolationInfo(PolicyViolationInfo.Builder builder) {
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.policyViolationInfo_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder mergePolicyViolationInfo(PolicyViolationInfo policyViolationInfo) {
            PolicyViolationInfo policyViolationInfo2;
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 512) != 0 && (policyViolationInfo2 = this.policyViolationInfo_) != null && policyViolationInfo2 != PolicyViolationInfo.getDefaultInstance()) {
                    getPolicyViolationInfoBuilder().mergeFrom(policyViolationInfo);
                } else {
                    this.policyViolationInfo_ = policyViolationInfo;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(policyViolationInfo);
            }
            if (this.policyViolationInfo_ != null) {
                this.bitField0_ |= 512;
                onChanged();
            }
            return this;
        }

        public Builder clearPolicyViolationInfo() {
            this.bitField0_ &= -513;
            this.policyViolationInfo_ = null;
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.policyViolationInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public PolicyViolationInfo.Builder getPolicyViolationInfoBuilder() {
            this.bitField0_ |= 512;
            onChanged();
            return (PolicyViolationInfo.Builder) getPolicyViolationInfoFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public PolicyViolationInfoOrBuilder getPolicyViolationInfoOrBuilder() {
            SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> singleFieldBuilderV3 = this.policyViolationInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PolicyViolationInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            PolicyViolationInfo policyViolationInfo = this.policyViolationInfo_;
            return policyViolationInfo == null ? PolicyViolationInfo.getDefaultInstance() : policyViolationInfo;
        }

        private SingleFieldBuilderV3<PolicyViolationInfo, PolicyViolationInfo.Builder, PolicyViolationInfoOrBuilder> getPolicyViolationInfoFieldBuilder() {
            if (this.policyViolationInfoBuilder_ == null) {
                this.policyViolationInfoBuilder_ = new SingleFieldBuilderV3<>(getPolicyViolationInfo(), getParentForChildren(), isClean());
                this.policyViolationInfo_ = null;
            }
            return this.policyViolationInfoBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasRequestMetadata() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public RequestMetadata getRequestMetadata() {
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestMetadata requestMetadata = this.requestMetadata_;
                return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
            }
            return (RequestMetadata) singleFieldBuilderV3.getMessage();
        }

        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                requestMetadata.getClass();
                this.requestMetadata_ = requestMetadata;
            } else {
                singleFieldBuilderV3.setMessage(requestMetadata);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setRequestMetadata(RequestMetadata.Builder builder) {
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.requestMetadata_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder mergeRequestMetadata(RequestMetadata requestMetadata) {
            RequestMetadata requestMetadata2;
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1024) != 0 && (requestMetadata2 = this.requestMetadata_) != null && requestMetadata2 != RequestMetadata.getDefaultInstance()) {
                    getRequestMetadataBuilder().mergeFrom(requestMetadata);
                } else {
                    this.requestMetadata_ = requestMetadata;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(requestMetadata);
            }
            if (this.requestMetadata_ != null) {
                this.bitField0_ |= 1024;
                onChanged();
            }
            return this;
        }

        public Builder clearRequestMetadata() {
            this.bitField0_ &= -1025;
            this.requestMetadata_ = null;
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.requestMetadataBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public RequestMetadata.Builder getRequestMetadataBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (RequestMetadata.Builder) getRequestMetadataFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public RequestMetadataOrBuilder getRequestMetadataOrBuilder() {
            SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> singleFieldBuilderV3 = this.requestMetadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RequestMetadataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            RequestMetadata requestMetadata = this.requestMetadata_;
            return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
        }

        private SingleFieldBuilderV3<RequestMetadata, RequestMetadata.Builder, RequestMetadataOrBuilder> getRequestMetadataFieldBuilder() {
            if (this.requestMetadataBuilder_ == null) {
                this.requestMetadataBuilder_ = new SingleFieldBuilderV3<>(getRequestMetadata(), getParentForChildren(), isClean());
                this.requestMetadata_ = null;
            }
            return this.requestMetadataBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getRequest() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.request_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setRequest(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.request_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setRequest(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.request_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder mergeRequest(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2048) != 0 && (struct2 = this.request_) != null && struct2 != Struct.getDefaultInstance()) {
                    getRequestBuilder().mergeFrom(struct);
                } else {
                    this.request_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.request_ != null) {
                this.bitField0_ |= 2048;
                onChanged();
            }
            return this;
        }

        public Builder clearRequest() {
            this.bitField0_ &= -2049;
            this.request_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.requestBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getRequestBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (Struct.Builder) getRequestFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public StructOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.request_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                this.requestBuilder_ = new SingleFieldBuilderV3<>(getRequest(), getParentForChildren(), isClean());
                this.request_ = null;
            }
            return this.requestBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getResponse() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.response_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setResponse(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.response_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder setResponse(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.response_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder mergeResponse(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4096) != 0 && (struct2 = this.response_) != null && struct2 != Struct.getDefaultInstance()) {
                    getResponseBuilder().mergeFrom(struct);
                } else {
                    this.response_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.response_ != null) {
                this.bitField0_ |= 4096;
                onChanged();
            }
            return this;
        }

        public Builder clearResponse() {
            this.bitField0_ &= -4097;
            this.response_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.responseBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getResponseBuilder() {
            this.bitField0_ |= 4096;
            onChanged();
            return (Struct.Builder) getResponseFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public StructOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.response_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                this.responseBuilder_ = new SingleFieldBuilderV3<>(getResponse(), getParentForChildren(), isClean());
                this.response_ = null;
            }
            return this.responseBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasMetadata() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getMetadata() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.metadata_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return (Struct) singleFieldBuilderV3.getMessage();
        }

        public Builder setMetadata(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.metadata_ = struct;
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder setMetadata(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metadata_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder mergeMetadata(Struct struct) {
            Struct struct2;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8192) != 0 && (struct2 = this.metadata_) != null && struct2 != Struct.getDefaultInstance()) {
                    getMetadataBuilder().mergeFrom(struct);
                } else {
                    this.metadata_ = struct;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            if (this.metadata_ != null) {
                this.bitField0_ |= 8192;
                onChanged();
            }
            return this;
        }

        public Builder clearMetadata() {
            this.bitField0_ &= -8193;
            this.metadata_ = null;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.metadataBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Struct.Builder getMetadataBuilder() {
            this.bitField0_ |= 8192;
            onChanged();
            return (Struct.Builder) getMetadataFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public StructOrBuilder getMetadataOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.metadata_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getMetadataFieldBuilder() {
            if (this.metadataBuilder_ == null) {
                this.metadataBuilder_ = new SingleFieldBuilderV3<>(getMetadata(), getParentForChildren(), isClean());
                this.metadata_ = null;
            }
            return this.metadataBuilder_;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        @Deprecated
        public boolean hasServiceData() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        @Deprecated
        public Any getServiceData() {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                Any any = this.serviceData_;
                return any == null ? Any.getDefaultInstance() : any;
            }
            return (Any) singleFieldBuilderV3.getMessage();
        }

        @Deprecated
        public Builder setServiceData(Any any) {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                any.getClass();
                this.serviceData_ = any;
            } else {
                singleFieldBuilderV3.setMessage(any);
            }
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setServiceData(Any.Builder builder) {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.serviceData_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16384;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeServiceData(Any any) {
            Any any2;
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16384) != 0 && (any2 = this.serviceData_) != null && any2 != Any.getDefaultInstance()) {
                    getServiceDataBuilder().mergeFrom(any);
                } else {
                    this.serviceData_ = any;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(any);
            }
            if (this.serviceData_ != null) {
                this.bitField0_ |= 16384;
                onChanged();
            }
            return this;
        }

        @Deprecated
        public Builder clearServiceData() {
            this.bitField0_ &= -16385;
            this.serviceData_ = null;
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.serviceDataBuilder_ = null;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Any.Builder getServiceDataBuilder() {
            this.bitField0_ |= 16384;
            onChanged();
            return (Any.Builder) getServiceDataFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        @Deprecated
        public AnyOrBuilder getServiceDataOrBuilder() {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.serviceDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AnyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Any any = this.serviceData_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getServiceDataFieldBuilder() {
            if (this.serviceDataBuilder_ == null) {
                this.serviceDataBuilder_ = new SingleFieldBuilderV3<>(getServiceData(), getParentForChildren(), isClean());
                this.serviceData_ = null;
            }
            return this.serviceDataBuilder_;
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

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuditLog> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuditLog> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuditLog getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
