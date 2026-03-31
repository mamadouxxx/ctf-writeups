package com.google.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Publishing;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int PUBLISHING_FIELD_NUMBER = 45;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private static final long serialVersionUID = 0;
    private List<Api> apis_;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private int bitField0_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private List<Endpoint> endpoints_;
    private List<Enum> enums_;
    private Http http_;
    private volatile Object id_;
    private Logging logging_;
    private List<LogDescriptor> logs_;
    private byte memoizedIsInitialized;
    private List<MetricDescriptor> metrics_;
    private List<MonitoredResourceDescriptor> monitoredResources_;
    private Monitoring monitoring_;
    private volatile Object name_;
    private volatile Object producerProjectId_;
    private Publishing publishing_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private volatile Object title_;
    private List<Type> types_;
    private Usage usage_;
    private static final Service DEFAULT_INSTANCE = new Service();
    private static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.google.api.Service.1
        @Override // com.google.protobuf.Parser
        public Service parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Service.newBuilder();
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

    static /* synthetic */ int access$3076(Service service, int i) {
        int i2 = i | service.bitField0_;
        service.bitField0_ = i2;
        return i2;
    }

    private Service(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.title_ = "";
        this.producerProjectId_ = "";
        this.id_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Service() {
        this.name_ = "";
        this.title_ = "";
        this.producerProjectId_ = "";
        this.id_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.title_ = "";
        this.producerProjectId_ = "";
        this.id_ = "";
        this.apis_ = Collections.emptyList();
        this.types_ = Collections.emptyList();
        this.enums_ = Collections.emptyList();
        this.endpoints_ = Collections.emptyList();
        this.logs_ = Collections.emptyList();
        this.metrics_ = Collections.emptyList();
        this.monitoredResources_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Service();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ServiceProto.internal_static_google_api_Service_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceProto.internal_static_google_api_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getTitle() {
        Object obj = this.title_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.title_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getTitleBytes() {
        Object obj = this.title_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getProducerProjectId() {
        Object obj = this.producerProjectId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.producerProjectId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getProducerProjectIdBytes() {
        Object obj = this.producerProjectId_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.producerProjectId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Api> getApisList() {
        return this.apis_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public Api getApis(int i) {
        return this.apis_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public ApiOrBuilder getApisOrBuilder(int i) {
        return this.apis_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Type> getTypesList() {
        return this.types_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public Type getTypes(int i) {
        return this.types_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public TypeOrBuilder getTypesOrBuilder(int i) {
        return this.types_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public Enum getEnums(int i) {
        return this.enums_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public EnumOrBuilder getEnumsOrBuilder(int i) {
        return this.enums_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasDocumentation() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    @Override // com.google.api.ServiceOrBuilder
    public DocumentationOrBuilder getDocumentationOrBuilder() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBackend() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    @Override // com.google.api.ServiceOrBuilder
    public BackendOrBuilder getBackendOrBuilder() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasHttp() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    @Override // com.google.api.ServiceOrBuilder
    public HttpOrBuilder getHttpOrBuilder() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasQuota() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    @Override // com.google.api.ServiceOrBuilder
    public QuotaOrBuilder getQuotaOrBuilder() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasAuthentication() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    @Override // com.google.api.ServiceOrBuilder
    public AuthenticationOrBuilder getAuthenticationOrBuilder() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasContext() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasUsage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    @Override // com.google.api.ServiceOrBuilder
    public UsageOrBuilder getUsageOrBuilder() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public Endpoint getEndpoints(int i) {
        return this.endpoints_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public EndpointOrBuilder getEndpointsOrBuilder(int i) {
        return this.endpoints_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasControl() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    @Override // com.google.api.ServiceOrBuilder
    public ControlOrBuilder getControlOrBuilder() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public LogDescriptor getLogs(int i) {
        return this.logs_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public LogDescriptorOrBuilder getLogsOrBuilder(int i) {
        return this.logs_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public MetricDescriptor getMetrics(int i) {
        return this.metrics_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public MetricDescriptorOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoredResourceDescriptor getMonitoredResources(int i) {
        return this.monitoredResources_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int i) {
        return this.monitoredResources_.get(i);
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBilling() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public BillingOrBuilder getBillingOrBuilder() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasLogging() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    @Override // com.google.api.ServiceOrBuilder
    public LoggingOrBuilder getLoggingOrBuilder() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasMonitoring() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoringOrBuilder getMonitoringOrBuilder() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSystemParameters() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SystemParametersOrBuilder getSystemParametersOrBuilder() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSourceInfo() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    @Override // com.google.api.ServiceOrBuilder
    public SourceInfoOrBuilder getSourceInfoOrBuilder() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasPublishing() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public Publishing getPublishing() {
        Publishing publishing = this.publishing_;
        return publishing == null ? Publishing.getDefaultInstance() : publishing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public PublishingOrBuilder getPublishingOrBuilder() {
        Publishing publishing = this.publishing_;
        return publishing == null ? Publishing.getDefaultInstance() : publishing;
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasConfigVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.google.api.ServiceOrBuilder
    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    @Override // com.google.api.ServiceOrBuilder
    public UInt32ValueOrBuilder getConfigVersionOrBuilder() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
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
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.title_);
        }
        for (int i = 0; i < this.apis_.size(); i++) {
            codedOutputStream.writeMessage(3, this.apis_.get(i));
        }
        for (int i2 = 0; i2 < this.types_.size(); i2++) {
            codedOutputStream.writeMessage(4, this.types_.get(i2));
        }
        for (int i3 = 0; i3 < this.enums_.size(); i3++) {
            codedOutputStream.writeMessage(5, this.enums_.get(i3));
        }
        if ((1 & this.bitField0_) != 0) {
            codedOutputStream.writeMessage(6, getDocumentation());
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(8, getBackend());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(9, getHttp());
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(10, getQuota());
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputStream.writeMessage(11, getAuthentication());
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputStream.writeMessage(12, getContext());
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputStream.writeMessage(15, getUsage());
        }
        for (int i4 = 0; i4 < this.endpoints_.size(); i4++) {
            codedOutputStream.writeMessage(18, this.endpoints_.get(i4));
        }
        if ((this.bitField0_ & 16384) != 0) {
            codedOutputStream.writeMessage(20, getConfigVersion());
        }
        if ((this.bitField0_ & 128) != 0) {
            codedOutputStream.writeMessage(21, getControl());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.producerProjectId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 22, this.producerProjectId_);
        }
        for (int i5 = 0; i5 < this.logs_.size(); i5++) {
            codedOutputStream.writeMessage(23, this.logs_.get(i5));
        }
        for (int i6 = 0; i6 < this.metrics_.size(); i6++) {
            codedOutputStream.writeMessage(24, this.metrics_.get(i6));
        }
        for (int i7 = 0; i7 < this.monitoredResources_.size(); i7++) {
            codedOutputStream.writeMessage(25, this.monitoredResources_.get(i7));
        }
        if ((this.bitField0_ & 256) != 0) {
            codedOutputStream.writeMessage(26, getBilling());
        }
        if ((this.bitField0_ & 512) != 0) {
            codedOutputStream.writeMessage(27, getLogging());
        }
        if ((this.bitField0_ & 1024) != 0) {
            codedOutputStream.writeMessage(28, getMonitoring());
        }
        if ((this.bitField0_ & 2048) != 0) {
            codedOutputStream.writeMessage(29, getSystemParameters());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 33, this.id_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            codedOutputStream.writeMessage(37, getSourceInfo());
        }
        if ((this.bitField0_ & 8192) != 0) {
            codedOutputStream.writeMessage(45, getPublishing());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.name_) ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.title_);
        }
        for (int i2 = 0; i2 < this.apis_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.apis_.get(i2));
        }
        for (int i3 = 0; i3 < this.types_.size(); i3++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.types_.get(i3));
        }
        for (int i4 = 0; i4 < this.enums_.size(); i4++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.enums_.get(i4));
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, getDocumentation());
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(8, getBackend());
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(9, getHttp());
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(10, getQuota());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(11, getAuthentication());
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(12, getContext());
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(15, getUsage());
        }
        for (int i5 = 0; i5 < this.endpoints_.size(); i5++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(18, this.endpoints_.get(i5));
        }
        if ((this.bitField0_ & 16384) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(20, getConfigVersion());
        }
        if ((this.bitField0_ & 128) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(21, getControl());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.producerProjectId_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(22, this.producerProjectId_);
        }
        for (int i6 = 0; i6 < this.logs_.size(); i6++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(23, this.logs_.get(i6));
        }
        for (int i7 = 0; i7 < this.metrics_.size(); i7++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(24, this.metrics_.get(i7));
        }
        for (int i8 = 0; i8 < this.monitoredResources_.size(); i8++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(25, this.monitoredResources_.get(i8));
        }
        if ((this.bitField0_ & 256) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(26, getBilling());
        }
        if ((this.bitField0_ & 512) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(27, getLogging());
        }
        if ((this.bitField0_ & 1024) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(28, getMonitoring());
        }
        if ((this.bitField0_ & 2048) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(29, getSystemParameters());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(33, this.id_);
        }
        if ((this.bitField0_ & 4096) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(37, getSourceInfo());
        }
        if ((this.bitField0_ & 8192) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(45, getPublishing());
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
        if (!(obj instanceof Service)) {
            return super.equals(obj);
        }
        Service service = (Service) obj;
        if (!getName().equals(service.getName()) || !getTitle().equals(service.getTitle()) || !getProducerProjectId().equals(service.getProducerProjectId()) || !getId().equals(service.getId()) || !getApisList().equals(service.getApisList()) || !getTypesList().equals(service.getTypesList()) || !getEnumsList().equals(service.getEnumsList()) || hasDocumentation() != service.hasDocumentation()) {
            return false;
        }
        if ((hasDocumentation() && !getDocumentation().equals(service.getDocumentation())) || hasBackend() != service.hasBackend()) {
            return false;
        }
        if ((hasBackend() && !getBackend().equals(service.getBackend())) || hasHttp() != service.hasHttp()) {
            return false;
        }
        if ((hasHttp() && !getHttp().equals(service.getHttp())) || hasQuota() != service.hasQuota()) {
            return false;
        }
        if ((hasQuota() && !getQuota().equals(service.getQuota())) || hasAuthentication() != service.hasAuthentication()) {
            return false;
        }
        if ((hasAuthentication() && !getAuthentication().equals(service.getAuthentication())) || hasContext() != service.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(service.getContext())) || hasUsage() != service.hasUsage()) {
            return false;
        }
        if ((hasUsage() && !getUsage().equals(service.getUsage())) || !getEndpointsList().equals(service.getEndpointsList()) || hasControl() != service.hasControl()) {
            return false;
        }
        if ((hasControl() && !getControl().equals(service.getControl())) || !getLogsList().equals(service.getLogsList()) || !getMetricsList().equals(service.getMetricsList()) || !getMonitoredResourcesList().equals(service.getMonitoredResourcesList()) || hasBilling() != service.hasBilling()) {
            return false;
        }
        if ((hasBilling() && !getBilling().equals(service.getBilling())) || hasLogging() != service.hasLogging()) {
            return false;
        }
        if ((hasLogging() && !getLogging().equals(service.getLogging())) || hasMonitoring() != service.hasMonitoring()) {
            return false;
        }
        if ((hasMonitoring() && !getMonitoring().equals(service.getMonitoring())) || hasSystemParameters() != service.hasSystemParameters()) {
            return false;
        }
        if ((hasSystemParameters() && !getSystemParameters().equals(service.getSystemParameters())) || hasSourceInfo() != service.hasSourceInfo()) {
            return false;
        }
        if ((hasSourceInfo() && !getSourceInfo().equals(service.getSourceInfo())) || hasPublishing() != service.hasPublishing()) {
            return false;
        }
        if ((!hasPublishing() || getPublishing().equals(service.getPublishing())) && hasConfigVersion() == service.hasConfigVersion()) {
            return (!hasConfigVersion() || getConfigVersion().equals(service.getConfigVersion())) && getUnknownFields().equals(service.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getTitle().hashCode()) * 37) + 22) * 53) + getProducerProjectId().hashCode()) * 37) + 33) * 53) + getId().hashCode();
        if (getApisCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getApisList().hashCode();
        }
        if (getTypesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getTypesList().hashCode();
        }
        if (getEnumsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getEnumsList().hashCode();
        }
        if (hasDocumentation()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getDocumentation().hashCode();
        }
        if (hasBackend()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getBackend().hashCode();
        }
        if (hasHttp()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getHttp().hashCode();
        }
        if (hasQuota()) {
            iHashCode = (((iHashCode * 37) + 10) * 53) + getQuota().hashCode();
        }
        if (hasAuthentication()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + getAuthentication().hashCode();
        }
        if (hasContext()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + getContext().hashCode();
        }
        if (hasUsage()) {
            iHashCode = (((iHashCode * 37) + 15) * 53) + getUsage().hashCode();
        }
        if (getEndpointsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 18) * 53) + getEndpointsList().hashCode();
        }
        if (hasControl()) {
            iHashCode = (((iHashCode * 37) + 21) * 53) + getControl().hashCode();
        }
        if (getLogsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 23) * 53) + getLogsList().hashCode();
        }
        if (getMetricsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 24) * 53) + getMetricsList().hashCode();
        }
        if (getMonitoredResourcesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 25) * 53) + getMonitoredResourcesList().hashCode();
        }
        if (hasBilling()) {
            iHashCode = (((iHashCode * 37) + 26) * 53) + getBilling().hashCode();
        }
        if (hasLogging()) {
            iHashCode = (((iHashCode * 37) + 27) * 53) + getLogging().hashCode();
        }
        if (hasMonitoring()) {
            iHashCode = (((iHashCode * 37) + 28) * 53) + getMonitoring().hashCode();
        }
        if (hasSystemParameters()) {
            iHashCode = (((iHashCode * 37) + 29) * 53) + getSystemParameters().hashCode();
        }
        if (hasSourceInfo()) {
            iHashCode = (((iHashCode * 37) + 37) * 53) + getSourceInfo().hashCode();
        }
        if (hasPublishing()) {
            iHashCode = (((iHashCode * 37) + 45) * 53) + getPublishing().hashCode();
        }
        if (hasConfigVersion()) {
            iHashCode = (((iHashCode * 37) + 20) * 53) + getConfigVersion().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Service service) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(service);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
        private RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> apisBuilder_;
        private List<Api> apis_;
        private SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> authenticationBuilder_;
        private Authentication authentication_;
        private SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> backendBuilder_;
        private Backend backend_;
        private SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> billingBuilder_;
        private Billing billing_;
        private int bitField0_;
        private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> configVersionBuilder_;
        private UInt32Value configVersion_;
        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> contextBuilder_;
        private Context context_;
        private SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> controlBuilder_;
        private Control control_;
        private SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> documentationBuilder_;
        private Documentation documentation_;
        private RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> endpointsBuilder_;
        private List<Endpoint> endpoints_;
        private RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> enumsBuilder_;
        private List<Enum> enums_;
        private SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> httpBuilder_;
        private Http http_;
        private Object id_;
        private SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> loggingBuilder_;
        private Logging logging_;
        private RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> logsBuilder_;
        private List<LogDescriptor> logs_;
        private RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> metricsBuilder_;
        private List<MetricDescriptor> metrics_;
        private RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> monitoredResourcesBuilder_;
        private List<MonitoredResourceDescriptor> monitoredResources_;
        private SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> monitoringBuilder_;
        private Monitoring monitoring_;
        private Object name_;
        private Object producerProjectId_;
        private SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> publishingBuilder_;
        private Publishing publishing_;
        private SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> quotaBuilder_;
        private Quota quota_;
        private SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> sourceInfoBuilder_;
        private SourceInfo sourceInfo_;
        private SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> systemParametersBuilder_;
        private SystemParameters systemParameters_;
        private Object title_;
        private RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> typesBuilder_;
        private List<Type> types_;
        private SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> usageBuilder_;
        private Usage usage_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ServiceProto.internal_static_google_api_Service_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ServiceProto.internal_static_google_api_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.title_ = "";
            this.producerProjectId_ = "";
            this.id_ = "";
            this.apis_ = Collections.emptyList();
            this.types_ = Collections.emptyList();
            this.enums_ = Collections.emptyList();
            this.endpoints_ = Collections.emptyList();
            this.logs_ = Collections.emptyList();
            this.metrics_ = Collections.emptyList();
            this.monitoredResources_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.title_ = "";
            this.producerProjectId_ = "";
            this.id_ = "";
            this.apis_ = Collections.emptyList();
            this.types_ = Collections.emptyList();
            this.enums_ = Collections.emptyList();
            this.endpoints_ = Collections.emptyList();
            this.logs_ = Collections.emptyList();
            this.metrics_ = Collections.emptyList();
            this.monitoredResources_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Service.alwaysUseFieldBuilders) {
                getApisFieldBuilder();
                getTypesFieldBuilder();
                getEnumsFieldBuilder();
                getDocumentationFieldBuilder();
                getBackendFieldBuilder();
                getHttpFieldBuilder();
                getQuotaFieldBuilder();
                getAuthenticationFieldBuilder();
                getContextFieldBuilder();
                getUsageFieldBuilder();
                getEndpointsFieldBuilder();
                getControlFieldBuilder();
                getLogsFieldBuilder();
                getMetricsFieldBuilder();
                getMonitoredResourcesFieldBuilder();
                getBillingFieldBuilder();
                getLoggingFieldBuilder();
                getMonitoringFieldBuilder();
                getSystemParametersFieldBuilder();
                getSourceInfoFieldBuilder();
                getPublishingFieldBuilder();
                getConfigVersionFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.title_ = "";
            this.producerProjectId_ = "";
            this.id_ = "";
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.apis_ = Collections.emptyList();
            } else {
                this.apis_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -17;
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV32 = this.typesBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.types_ = Collections.emptyList();
            } else {
                this.types_ = null;
                repeatedFieldBuilderV32.clear();
            }
            this.bitField0_ &= -33;
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV33 = this.enumsBuilder_;
            if (repeatedFieldBuilderV33 == null) {
                this.enums_ = Collections.emptyList();
            } else {
                this.enums_ = null;
                repeatedFieldBuilderV33.clear();
            }
            this.bitField0_ &= -65;
            this.documentation_ = null;
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.documentationBuilder_ = null;
            }
            this.backend_ = null;
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV32 = this.backendBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.backendBuilder_ = null;
            }
            this.http_ = null;
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV33 = this.httpBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.httpBuilder_ = null;
            }
            this.quota_ = null;
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV34 = this.quotaBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.dispose();
                this.quotaBuilder_ = null;
            }
            this.authentication_ = null;
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV35 = this.authenticationBuilder_;
            if (singleFieldBuilderV35 != null) {
                singleFieldBuilderV35.dispose();
                this.authenticationBuilder_ = null;
            }
            this.context_ = null;
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV36 = this.contextBuilder_;
            if (singleFieldBuilderV36 != null) {
                singleFieldBuilderV36.dispose();
                this.contextBuilder_ = null;
            }
            this.usage_ = null;
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV37 = this.usageBuilder_;
            if (singleFieldBuilderV37 != null) {
                singleFieldBuilderV37.dispose();
                this.usageBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV34 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV34 == null) {
                this.endpoints_ = Collections.emptyList();
            } else {
                this.endpoints_ = null;
                repeatedFieldBuilderV34.clear();
            }
            this.bitField0_ &= -16385;
            this.control_ = null;
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV38 = this.controlBuilder_;
            if (singleFieldBuilderV38 != null) {
                singleFieldBuilderV38.dispose();
                this.controlBuilder_ = null;
            }
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV35 = this.logsBuilder_;
            if (repeatedFieldBuilderV35 == null) {
                this.logs_ = Collections.emptyList();
            } else {
                this.logs_ = null;
                repeatedFieldBuilderV35.clear();
            }
            this.bitField0_ &= -65537;
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV36 = this.metricsBuilder_;
            if (repeatedFieldBuilderV36 == null) {
                this.metrics_ = Collections.emptyList();
            } else {
                this.metrics_ = null;
                repeatedFieldBuilderV36.clear();
            }
            this.bitField0_ &= -131073;
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV37 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV37 == null) {
                this.monitoredResources_ = Collections.emptyList();
            } else {
                this.monitoredResources_ = null;
                repeatedFieldBuilderV37.clear();
            }
            this.bitField0_ &= -262145;
            this.billing_ = null;
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV39 = this.billingBuilder_;
            if (singleFieldBuilderV39 != null) {
                singleFieldBuilderV39.dispose();
                this.billingBuilder_ = null;
            }
            this.logging_ = null;
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV310 = this.loggingBuilder_;
            if (singleFieldBuilderV310 != null) {
                singleFieldBuilderV310.dispose();
                this.loggingBuilder_ = null;
            }
            this.monitoring_ = null;
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV311 = this.monitoringBuilder_;
            if (singleFieldBuilderV311 != null) {
                singleFieldBuilderV311.dispose();
                this.monitoringBuilder_ = null;
            }
            this.systemParameters_ = null;
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV312 = this.systemParametersBuilder_;
            if (singleFieldBuilderV312 != null) {
                singleFieldBuilderV312.dispose();
                this.systemParametersBuilder_ = null;
            }
            this.sourceInfo_ = null;
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV313 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV313 != null) {
                singleFieldBuilderV313.dispose();
                this.sourceInfoBuilder_ = null;
            }
            this.publishing_ = null;
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV314 = this.publishingBuilder_;
            if (singleFieldBuilderV314 != null) {
                singleFieldBuilderV314.dispose();
                this.publishingBuilder_ = null;
            }
            this.configVersion_ = null;
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV315 = this.configVersionBuilder_;
            if (singleFieldBuilderV315 != null) {
                singleFieldBuilderV315.dispose();
                this.configVersionBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ServiceProto.internal_static_google_api_Service_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Service getDefaultInstanceForType() {
            return Service.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Service build() {
            Service serviceBuildPartial = buildPartial();
            if (serviceBuildPartial.isInitialized()) {
                return serviceBuildPartial;
            }
            throw newUninitializedMessageException((Message) serviceBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Service buildPartial() {
            Service service = new Service(this);
            buildPartialRepeatedFields(service);
            if (this.bitField0_ != 0) {
                buildPartial0(service);
            }
            onBuilt();
            return service;
        }

        private void buildPartialRepeatedFields(Service service) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                service.apis_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 16) != 0) {
                    this.apis_ = Collections.unmodifiableList(this.apis_);
                    this.bitField0_ &= -17;
                }
                service.apis_ = this.apis_;
            }
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV32 = this.typesBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                service.types_ = repeatedFieldBuilderV32.build();
            } else {
                if ((this.bitField0_ & 32) != 0) {
                    this.types_ = Collections.unmodifiableList(this.types_);
                    this.bitField0_ &= -33;
                }
                service.types_ = this.types_;
            }
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV33 = this.enumsBuilder_;
            if (repeatedFieldBuilderV33 != null) {
                service.enums_ = repeatedFieldBuilderV33.build();
            } else {
                if ((this.bitField0_ & 64) != 0) {
                    this.enums_ = Collections.unmodifiableList(this.enums_);
                    this.bitField0_ &= -65;
                }
                service.enums_ = this.enums_;
            }
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV34 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV34 != null) {
                service.endpoints_ = repeatedFieldBuilderV34.build();
            } else {
                if ((this.bitField0_ & 16384) != 0) {
                    this.endpoints_ = Collections.unmodifiableList(this.endpoints_);
                    this.bitField0_ &= -16385;
                }
                service.endpoints_ = this.endpoints_;
            }
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV35 = this.logsBuilder_;
            if (repeatedFieldBuilderV35 != null) {
                service.logs_ = repeatedFieldBuilderV35.build();
            } else {
                if ((this.bitField0_ & 65536) != 0) {
                    this.logs_ = Collections.unmodifiableList(this.logs_);
                    this.bitField0_ &= -65537;
                }
                service.logs_ = this.logs_;
            }
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV36 = this.metricsBuilder_;
            if (repeatedFieldBuilderV36 != null) {
                service.metrics_ = repeatedFieldBuilderV36.build();
            } else {
                if ((this.bitField0_ & 131072) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -131073;
                }
                service.metrics_ = this.metrics_;
            }
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV37 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV37 != null) {
                service.monitoredResources_ = repeatedFieldBuilderV37.build();
                return;
            }
            if ((this.bitField0_ & 262144) != 0) {
                this.monitoredResources_ = Collections.unmodifiableList(this.monitoredResources_);
                this.bitField0_ &= -262145;
            }
            service.monitoredResources_ = this.monitoredResources_;
        }

        private void buildPartial0(Service service) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                service.name_ = this.name_;
            }
            if ((i2 & 2) != 0) {
                service.title_ = this.title_;
            }
            if ((i2 & 4) != 0) {
                service.producerProjectId_ = this.producerProjectId_;
            }
            if ((i2 & 8) != 0) {
                service.id_ = this.id_;
            }
            if ((i2 & 128) != 0) {
                SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
                service.documentation_ = singleFieldBuilderV3 == null ? this.documentation_ : (Documentation) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 256) != 0) {
                SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV32 = this.backendBuilder_;
                service.backend_ = singleFieldBuilderV32 == null ? this.backend_ : (Backend) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV33 = this.httpBuilder_;
                service.http_ = singleFieldBuilderV33 == null ? this.http_ : (Http) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i2 & 1024) != 0) {
                SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV34 = this.quotaBuilder_;
                service.quota_ = singleFieldBuilderV34 == null ? this.quota_ : (Quota) singleFieldBuilderV34.build();
                i |= 8;
            }
            if ((i2 & 2048) != 0) {
                SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV35 = this.authenticationBuilder_;
                service.authentication_ = singleFieldBuilderV35 == null ? this.authentication_ : (Authentication) singleFieldBuilderV35.build();
                i |= 16;
            }
            if ((i2 & 4096) != 0) {
                SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV36 = this.contextBuilder_;
                service.context_ = singleFieldBuilderV36 == null ? this.context_ : (Context) singleFieldBuilderV36.build();
                i |= 32;
            }
            if ((i2 & 8192) != 0) {
                SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV37 = this.usageBuilder_;
                service.usage_ = singleFieldBuilderV37 == null ? this.usage_ : (Usage) singleFieldBuilderV37.build();
                i |= 64;
            }
            if ((32768 & i2) != 0) {
                SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV38 = this.controlBuilder_;
                service.control_ = singleFieldBuilderV38 == null ? this.control_ : (Control) singleFieldBuilderV38.build();
                i |= 128;
            }
            if ((524288 & i2) != 0) {
                SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV39 = this.billingBuilder_;
                service.billing_ = singleFieldBuilderV39 == null ? this.billing_ : (Billing) singleFieldBuilderV39.build();
                i |= 256;
            }
            if ((1048576 & i2) != 0) {
                SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV310 = this.loggingBuilder_;
                service.logging_ = singleFieldBuilderV310 == null ? this.logging_ : (Logging) singleFieldBuilderV310.build();
                i |= 512;
            }
            if ((2097152 & i2) != 0) {
                SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV311 = this.monitoringBuilder_;
                service.monitoring_ = singleFieldBuilderV311 == null ? this.monitoring_ : (Monitoring) singleFieldBuilderV311.build();
                i |= 1024;
            }
            if ((4194304 & i2) != 0) {
                SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV312 = this.systemParametersBuilder_;
                service.systemParameters_ = singleFieldBuilderV312 == null ? this.systemParameters_ : (SystemParameters) singleFieldBuilderV312.build();
                i |= 2048;
            }
            if ((8388608 & i2) != 0) {
                SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV313 = this.sourceInfoBuilder_;
                service.sourceInfo_ = singleFieldBuilderV313 == null ? this.sourceInfo_ : (SourceInfo) singleFieldBuilderV313.build();
                i |= 4096;
            }
            if ((16777216 & i2) != 0) {
                SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV314 = this.publishingBuilder_;
                service.publishing_ = singleFieldBuilderV314 == null ? this.publishing_ : (Publishing) singleFieldBuilderV314.build();
                i |= 8192;
            }
            if ((i2 & 33554432) != 0) {
                SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV315 = this.configVersionBuilder_;
                service.configVersion_ = singleFieldBuilderV315 == null ? this.configVersion_ : (UInt32Value) singleFieldBuilderV315.build();
                i |= 16384;
            }
            Service.access$3076(service, i);
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
            if (message instanceof Service) {
                return mergeFrom((Service) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Service service) {
            if (service == Service.getDefaultInstance()) {
                return this;
            }
            if (!service.getName().isEmpty()) {
                this.name_ = service.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!service.getTitle().isEmpty()) {
                this.title_ = service.title_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!service.getProducerProjectId().isEmpty()) {
                this.producerProjectId_ = service.producerProjectId_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!service.getId().isEmpty()) {
                this.id_ = service.id_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (this.apisBuilder_ == null) {
                if (!service.apis_.isEmpty()) {
                    if (this.apis_.isEmpty()) {
                        this.apis_ = service.apis_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureApisIsMutable();
                        this.apis_.addAll(service.apis_);
                    }
                    onChanged();
                }
            } else if (!service.apis_.isEmpty()) {
                if (!this.apisBuilder_.isEmpty()) {
                    this.apisBuilder_.addAllMessages(service.apis_);
                } else {
                    this.apisBuilder_.dispose();
                    this.apisBuilder_ = null;
                    this.apis_ = service.apis_;
                    this.bitField0_ &= -17;
                    this.apisBuilder_ = Service.alwaysUseFieldBuilders ? getApisFieldBuilder() : null;
                }
            }
            if (this.typesBuilder_ == null) {
                if (!service.types_.isEmpty()) {
                    if (this.types_.isEmpty()) {
                        this.types_ = service.types_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureTypesIsMutable();
                        this.types_.addAll(service.types_);
                    }
                    onChanged();
                }
            } else if (!service.types_.isEmpty()) {
                if (!this.typesBuilder_.isEmpty()) {
                    this.typesBuilder_.addAllMessages(service.types_);
                } else {
                    this.typesBuilder_.dispose();
                    this.typesBuilder_ = null;
                    this.types_ = service.types_;
                    this.bitField0_ &= -33;
                    this.typesBuilder_ = Service.alwaysUseFieldBuilders ? getTypesFieldBuilder() : null;
                }
            }
            if (this.enumsBuilder_ == null) {
                if (!service.enums_.isEmpty()) {
                    if (this.enums_.isEmpty()) {
                        this.enums_ = service.enums_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureEnumsIsMutable();
                        this.enums_.addAll(service.enums_);
                    }
                    onChanged();
                }
            } else if (!service.enums_.isEmpty()) {
                if (!this.enumsBuilder_.isEmpty()) {
                    this.enumsBuilder_.addAllMessages(service.enums_);
                } else {
                    this.enumsBuilder_.dispose();
                    this.enumsBuilder_ = null;
                    this.enums_ = service.enums_;
                    this.bitField0_ &= -65;
                    this.enumsBuilder_ = Service.alwaysUseFieldBuilders ? getEnumsFieldBuilder() : null;
                }
            }
            if (service.hasDocumentation()) {
                mergeDocumentation(service.getDocumentation());
            }
            if (service.hasBackend()) {
                mergeBackend(service.getBackend());
            }
            if (service.hasHttp()) {
                mergeHttp(service.getHttp());
            }
            if (service.hasQuota()) {
                mergeQuota(service.getQuota());
            }
            if (service.hasAuthentication()) {
                mergeAuthentication(service.getAuthentication());
            }
            if (service.hasContext()) {
                mergeContext(service.getContext());
            }
            if (service.hasUsage()) {
                mergeUsage(service.getUsage());
            }
            if (this.endpointsBuilder_ == null) {
                if (!service.endpoints_.isEmpty()) {
                    if (this.endpoints_.isEmpty()) {
                        this.endpoints_ = service.endpoints_;
                        this.bitField0_ &= -16385;
                    } else {
                        ensureEndpointsIsMutable();
                        this.endpoints_.addAll(service.endpoints_);
                    }
                    onChanged();
                }
            } else if (!service.endpoints_.isEmpty()) {
                if (!this.endpointsBuilder_.isEmpty()) {
                    this.endpointsBuilder_.addAllMessages(service.endpoints_);
                } else {
                    this.endpointsBuilder_.dispose();
                    this.endpointsBuilder_ = null;
                    this.endpoints_ = service.endpoints_;
                    this.bitField0_ &= -16385;
                    this.endpointsBuilder_ = Service.alwaysUseFieldBuilders ? getEndpointsFieldBuilder() : null;
                }
            }
            if (service.hasControl()) {
                mergeControl(service.getControl());
            }
            if (this.logsBuilder_ == null) {
                if (!service.logs_.isEmpty()) {
                    if (this.logs_.isEmpty()) {
                        this.logs_ = service.logs_;
                        this.bitField0_ &= -65537;
                    } else {
                        ensureLogsIsMutable();
                        this.logs_.addAll(service.logs_);
                    }
                    onChanged();
                }
            } else if (!service.logs_.isEmpty()) {
                if (!this.logsBuilder_.isEmpty()) {
                    this.logsBuilder_.addAllMessages(service.logs_);
                } else {
                    this.logsBuilder_.dispose();
                    this.logsBuilder_ = null;
                    this.logs_ = service.logs_;
                    this.bitField0_ &= -65537;
                    this.logsBuilder_ = Service.alwaysUseFieldBuilders ? getLogsFieldBuilder() : null;
                }
            }
            if (this.metricsBuilder_ == null) {
                if (!service.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = service.metrics_;
                        this.bitField0_ &= -131073;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(service.metrics_);
                    }
                    onChanged();
                }
            } else if (!service.metrics_.isEmpty()) {
                if (!this.metricsBuilder_.isEmpty()) {
                    this.metricsBuilder_.addAllMessages(service.metrics_);
                } else {
                    this.metricsBuilder_.dispose();
                    this.metricsBuilder_ = null;
                    this.metrics_ = service.metrics_;
                    this.bitField0_ &= -131073;
                    this.metricsBuilder_ = Service.alwaysUseFieldBuilders ? getMetricsFieldBuilder() : null;
                }
            }
            if (this.monitoredResourcesBuilder_ == null) {
                if (!service.monitoredResources_.isEmpty()) {
                    if (this.monitoredResources_.isEmpty()) {
                        this.monitoredResources_ = service.monitoredResources_;
                        this.bitField0_ &= -262145;
                    } else {
                        ensureMonitoredResourcesIsMutable();
                        this.monitoredResources_.addAll(service.monitoredResources_);
                    }
                    onChanged();
                }
            } else if (!service.monitoredResources_.isEmpty()) {
                if (!this.monitoredResourcesBuilder_.isEmpty()) {
                    this.monitoredResourcesBuilder_.addAllMessages(service.monitoredResources_);
                } else {
                    this.monitoredResourcesBuilder_.dispose();
                    this.monitoredResourcesBuilder_ = null;
                    this.monitoredResources_ = service.monitoredResources_;
                    this.bitField0_ &= -262145;
                    this.monitoredResourcesBuilder_ = Service.alwaysUseFieldBuilders ? getMonitoredResourcesFieldBuilder() : null;
                }
            }
            if (service.hasBilling()) {
                mergeBilling(service.getBilling());
            }
            if (service.hasLogging()) {
                mergeLogging(service.getLogging());
            }
            if (service.hasMonitoring()) {
                mergeMonitoring(service.getMonitoring());
            }
            if (service.hasSystemParameters()) {
                mergeSystemParameters(service.getSystemParameters());
            }
            if (service.hasSourceInfo()) {
                mergeSourceInfo(service.getSourceInfo());
            }
            if (service.hasPublishing()) {
                mergePublishing(service.getPublishing());
            }
            if (service.hasConfigVersion()) {
                mergeConfigVersion(service.getConfigVersion());
            }
            mergeUnknownFields(service.getUnknownFields());
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                break;
                            case 18:
                                this.title_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                break;
                            case 26:
                                Api api = (Api) codedInputStream.readMessage(Api.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureApisIsMutable();
                                    this.apis_.add(api);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(api);
                                }
                                break;
                            case 34:
                                Type type = (Type) codedInputStream.readMessage(Type.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV32 = this.typesBuilder_;
                                if (repeatedFieldBuilderV32 == null) {
                                    ensureTypesIsMutable();
                                    this.types_.add(type);
                                } else {
                                    repeatedFieldBuilderV32.addMessage(type);
                                }
                                break;
                            case 42:
                                Enum r1 = (Enum) codedInputStream.readMessage(Enum.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV33 = this.enumsBuilder_;
                                if (repeatedFieldBuilderV33 == null) {
                                    ensureEnumsIsMutable();
                                    this.enums_.add(r1);
                                } else {
                                    repeatedFieldBuilderV33.addMessage(r1);
                                }
                                break;
                            case 50:
                                codedInputStream.readMessage(getDocumentationFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 128;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                codedInputStream.readMessage(getBackendFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 256;
                                break;
                            case 74:
                                codedInputStream.readMessage(getHttpFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 512;
                                break;
                            case 82:
                                codedInputStream.readMessage(getQuotaFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1024;
                                break;
                            case 90:
                                codedInputStream.readMessage(getAuthenticationFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2048;
                                break;
                            case 98:
                                codedInputStream.readMessage(getContextFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4096;
                                break;
                            case 122:
                                codedInputStream.readMessage(getUsageFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8192;
                                break;
                            case 146:
                                Endpoint endpoint = (Endpoint) codedInputStream.readMessage(Endpoint.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV34 = this.endpointsBuilder_;
                                if (repeatedFieldBuilderV34 == null) {
                                    ensureEndpointsIsMutable();
                                    this.endpoints_.add(endpoint);
                                } else {
                                    repeatedFieldBuilderV34.addMessage(endpoint);
                                }
                                break;
                            case 162:
                                codedInputStream.readMessage(getConfigVersionFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 33554432;
                                break;
                            case 170:
                                codedInputStream.readMessage(getControlFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 32768;
                                break;
                            case 178:
                                this.producerProjectId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                break;
                            case 186:
                                LogDescriptor logDescriptor = (LogDescriptor) codedInputStream.readMessage(LogDescriptor.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV35 = this.logsBuilder_;
                                if (repeatedFieldBuilderV35 == null) {
                                    ensureLogsIsMutable();
                                    this.logs_.add(logDescriptor);
                                } else {
                                    repeatedFieldBuilderV35.addMessage(logDescriptor);
                                }
                                break;
                            case 194:
                                MetricDescriptor metricDescriptor = (MetricDescriptor) codedInputStream.readMessage(MetricDescriptor.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV36 = this.metricsBuilder_;
                                if (repeatedFieldBuilderV36 == null) {
                                    ensureMetricsIsMutable();
                                    this.metrics_.add(metricDescriptor);
                                } else {
                                    repeatedFieldBuilderV36.addMessage(metricDescriptor);
                                }
                                break;
                            case 202:
                                MonitoredResourceDescriptor monitoredResourceDescriptor = (MonitoredResourceDescriptor) codedInputStream.readMessage(MonitoredResourceDescriptor.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV37 = this.monitoredResourcesBuilder_;
                                if (repeatedFieldBuilderV37 == null) {
                                    ensureMonitoredResourcesIsMutable();
                                    this.monitoredResources_.add(monitoredResourceDescriptor);
                                } else {
                                    repeatedFieldBuilderV37.addMessage(monitoredResourceDescriptor);
                                }
                                break;
                            case 210:
                                codedInputStream.readMessage(getBillingFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 524288;
                                break;
                            case 218:
                                codedInputStream.readMessage(getLoggingFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1048576;
                                break;
                            case 226:
                                codedInputStream.readMessage(getMonitoringFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2097152;
                                break;
                            case 234:
                                codedInputStream.readMessage(getSystemParametersFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4194304;
                                break;
                            case 266:
                                this.id_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                break;
                            case 298:
                                codedInputStream.readMessage(getSourceInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8388608;
                                break;
                            case 362:
                                codedInputStream.readMessage(getPublishingFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16777216;
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

        @Override // com.google.api.ServiceOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Service.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            Service.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setTitle(String str) {
            str.getClass();
            this.title_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearTitle() {
            this.title_ = Service.getDefaultInstance().getTitle();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            byteString.getClass();
            Service.checkByteStringIsUtf8(byteString);
            this.title_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getProducerProjectId() {
            Object obj = this.producerProjectId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.producerProjectId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getProducerProjectIdBytes() {
            Object obj = this.producerProjectId_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.producerProjectId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setProducerProjectId(String str) {
            str.getClass();
            this.producerProjectId_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearProducerProjectId() {
            this.producerProjectId_ = Service.getDefaultInstance().getProducerProjectId();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setProducerProjectIdBytes(ByteString byteString) {
            byteString.getClass();
            Service.checkByteStringIsUtf8(byteString);
            this.producerProjectId_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setId(String str) {
            str.getClass();
            this.id_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Service.getDefaultInstance().getId();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            byteString.getClass();
            Service.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        private void ensureApisIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.apis_ = new ArrayList(this.apis_);
                this.bitField0_ |= 16;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Api> getApisList() {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.apis_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getApisCount() {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.apis_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Api getApis(int i) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.apis_.get(i);
            }
            return (Api) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setApis(int i, Api api) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                api.getClass();
                ensureApisIsMutable();
                this.apis_.set(i, api);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, api);
            }
            return this;
        }

        public Builder setApis(int i, Api.Builder builder) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureApisIsMutable();
                this.apis_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addApis(Api api) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                api.getClass();
                ensureApisIsMutable();
                this.apis_.add(api);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(api);
            }
            return this;
        }

        public Builder addApis(int i, Api api) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                api.getClass();
                ensureApisIsMutable();
                this.apis_.add(i, api);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, api);
            }
            return this;
        }

        public Builder addApis(Api.Builder builder) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureApisIsMutable();
                this.apis_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addApis(int i, Api.Builder builder) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureApisIsMutable();
                this.apis_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllApis(Iterable<? extends Api> iterable) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureApisIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.apis_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearApis() {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.apis_ = Collections.emptyList();
                this.bitField0_ &= -17;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeApis(int i) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureApisIsMutable();
                this.apis_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Api.Builder getApisBuilder(int i) {
            return (Api.Builder) getApisFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public ApiOrBuilder getApisOrBuilder(int i) {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.apis_.get(i);
            }
            return (ApiOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends ApiOrBuilder> getApisOrBuilderList() {
            RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> repeatedFieldBuilderV3 = this.apisBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.apis_);
        }

        public Api.Builder addApisBuilder() {
            return (Api.Builder) getApisFieldBuilder().addBuilder(Api.getDefaultInstance());
        }

        public Api.Builder addApisBuilder(int i) {
            return (Api.Builder) getApisFieldBuilder().addBuilder(i, Api.getDefaultInstance());
        }

        public List<Api.Builder> getApisBuilderList() {
            return getApisFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> getApisFieldBuilder() {
            if (this.apisBuilder_ == null) {
                this.apisBuilder_ = new RepeatedFieldBuilderV3<>(this.apis_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                this.apis_ = null;
            }
            return this.apisBuilder_;
        }

        private void ensureTypesIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.types_ = new ArrayList(this.types_);
                this.bitField0_ |= 32;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Type> getTypesList() {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.types_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getTypesCount() {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.types_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Type getTypes(int i) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.types_.get(i);
            }
            return (Type) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setTypes(int i, Type type) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                type.getClass();
                ensureTypesIsMutable();
                this.types_.set(i, type);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, type);
            }
            return this;
        }

        public Builder setTypes(int i, Type.Builder builder) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureTypesIsMutable();
                this.types_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addTypes(Type type) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                type.getClass();
                ensureTypesIsMutable();
                this.types_.add(type);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(type);
            }
            return this;
        }

        public Builder addTypes(int i, Type type) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                type.getClass();
                ensureTypesIsMutable();
                this.types_.add(i, type);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, type);
            }
            return this;
        }

        public Builder addTypes(Type.Builder builder) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureTypesIsMutable();
                this.types_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addTypes(int i, Type.Builder builder) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureTypesIsMutable();
                this.types_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllTypes(Iterable<? extends Type> iterable) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureTypesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.types_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearTypes() {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.types_ = Collections.emptyList();
                this.bitField0_ &= -33;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeTypes(int i) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureTypesIsMutable();
                this.types_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Type.Builder getTypesBuilder(int i) {
            return (Type.Builder) getTypesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public TypeOrBuilder getTypesOrBuilder(int i) {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.types_.get(i);
            }
            return (TypeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
            RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> repeatedFieldBuilderV3 = this.typesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.types_);
        }

        public Type.Builder addTypesBuilder() {
            return (Type.Builder) getTypesFieldBuilder().addBuilder(Type.getDefaultInstance());
        }

        public Type.Builder addTypesBuilder(int i) {
            return (Type.Builder) getTypesFieldBuilder().addBuilder(i, Type.getDefaultInstance());
        }

        public List<Type.Builder> getTypesBuilderList() {
            return getTypesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Type, Type.Builder, TypeOrBuilder> getTypesFieldBuilder() {
            if (this.typesBuilder_ == null) {
                this.typesBuilder_ = new RepeatedFieldBuilderV3<>(this.types_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.types_ = null;
            }
            return this.typesBuilder_;
        }

        private void ensureEnumsIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.enums_ = new ArrayList(this.enums_);
                this.bitField0_ |= 64;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Enum> getEnumsList() {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.enums_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEnumsCount() {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.enums_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Enum getEnums(int i) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.enums_.get(i);
            }
            return (Enum) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setEnums(int i, Enum r3) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                r3.getClass();
                ensureEnumsIsMutable();
                this.enums_.set(i, r3);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, r3);
            }
            return this;
        }

        public Builder setEnums(int i, Enum.Builder builder) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEnumsIsMutable();
                this.enums_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addEnums(Enum r2) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                r2.getClass();
                ensureEnumsIsMutable();
                this.enums_.add(r2);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(r2);
            }
            return this;
        }

        public Builder addEnums(int i, Enum r3) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                r3.getClass();
                ensureEnumsIsMutable();
                this.enums_.add(i, r3);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, r3);
            }
            return this;
        }

        public Builder addEnums(Enum.Builder builder) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEnumsIsMutable();
                this.enums_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addEnums(int i, Enum.Builder builder) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEnumsIsMutable();
                this.enums_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllEnums(Iterable<? extends Enum> iterable) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEnumsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.enums_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearEnums() {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.enums_ = Collections.emptyList();
                this.bitField0_ &= -65;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeEnums(int i) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEnumsIsMutable();
                this.enums_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Enum.Builder getEnumsBuilder(int i) {
            return (Enum.Builder) getEnumsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public EnumOrBuilder getEnumsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.enums_.get(i);
            }
            return (EnumOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
            RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> repeatedFieldBuilderV3 = this.enumsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.enums_);
        }

        public Enum.Builder addEnumsBuilder() {
            return (Enum.Builder) getEnumsFieldBuilder().addBuilder(Enum.getDefaultInstance());
        }

        public Enum.Builder addEnumsBuilder(int i) {
            return (Enum.Builder) getEnumsFieldBuilder().addBuilder(i, Enum.getDefaultInstance());
        }

        public List<Enum.Builder> getEnumsBuilderList() {
            return getEnumsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Enum, Enum.Builder, EnumOrBuilder> getEnumsFieldBuilder() {
            if (this.enumsBuilder_ == null) {
                this.enumsBuilder_ = new RepeatedFieldBuilderV3<>(this.enums_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                this.enums_ = null;
            }
            return this.enumsBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasDocumentation() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Documentation getDocumentation() {
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 == null) {
                Documentation documentation = this.documentation_;
                return documentation == null ? Documentation.getDefaultInstance() : documentation;
            }
            return (Documentation) singleFieldBuilderV3.getMessage();
        }

        public Builder setDocumentation(Documentation documentation) {
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 == null) {
                documentation.getClass();
                this.documentation_ = documentation;
            } else {
                singleFieldBuilderV3.setMessage(documentation);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setDocumentation(Documentation.Builder builder) {
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.documentation_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder mergeDocumentation(Documentation documentation) {
            Documentation documentation2;
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 128) != 0 && (documentation2 = this.documentation_) != null && documentation2 != Documentation.getDefaultInstance()) {
                    getDocumentationBuilder().mergeFrom(documentation);
                } else {
                    this.documentation_ = documentation;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(documentation);
            }
            if (this.documentation_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public Builder clearDocumentation() {
            this.bitField0_ &= -129;
            this.documentation_ = null;
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.documentationBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Documentation.Builder getDocumentationBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (Documentation.Builder) getDocumentationFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public DocumentationOrBuilder getDocumentationOrBuilder() {
            SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> singleFieldBuilderV3 = this.documentationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (DocumentationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Documentation documentation = this.documentation_;
            return documentation == null ? Documentation.getDefaultInstance() : documentation;
        }

        private SingleFieldBuilderV3<Documentation, Documentation.Builder, DocumentationOrBuilder> getDocumentationFieldBuilder() {
            if (this.documentationBuilder_ == null) {
                this.documentationBuilder_ = new SingleFieldBuilderV3<>(getDocumentation(), getParentForChildren(), isClean());
                this.documentation_ = null;
            }
            return this.documentationBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBackend() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Backend getBackend() {
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 == null) {
                Backend backend = this.backend_;
                return backend == null ? Backend.getDefaultInstance() : backend;
            }
            return (Backend) singleFieldBuilderV3.getMessage();
        }

        public Builder setBackend(Backend backend) {
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 == null) {
                backend.getClass();
                this.backend_ = backend;
            } else {
                singleFieldBuilderV3.setMessage(backend);
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setBackend(Backend.Builder builder) {
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.backend_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder mergeBackend(Backend backend) {
            Backend backend2;
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 256) != 0 && (backend2 = this.backend_) != null && backend2 != Backend.getDefaultInstance()) {
                    getBackendBuilder().mergeFrom(backend);
                } else {
                    this.backend_ = backend;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(backend);
            }
            if (this.backend_ != null) {
                this.bitField0_ |= 256;
                onChanged();
            }
            return this;
        }

        public Builder clearBackend() {
            this.bitField0_ &= -257;
            this.backend_ = null;
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.backendBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Backend.Builder getBackendBuilder() {
            this.bitField0_ |= 256;
            onChanged();
            return (Backend.Builder) getBackendFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public BackendOrBuilder getBackendOrBuilder() {
            SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> singleFieldBuilderV3 = this.backendBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (BackendOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Backend backend = this.backend_;
            return backend == null ? Backend.getDefaultInstance() : backend;
        }

        private SingleFieldBuilderV3<Backend, Backend.Builder, BackendOrBuilder> getBackendFieldBuilder() {
            if (this.backendBuilder_ == null) {
                this.backendBuilder_ = new SingleFieldBuilderV3<>(getBackend(), getParentForChildren(), isClean());
                this.backend_ = null;
            }
            return this.backendBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasHttp() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Http getHttp() {
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 == null) {
                Http http = this.http_;
                return http == null ? Http.getDefaultInstance() : http;
            }
            return (Http) singleFieldBuilderV3.getMessage();
        }

        public Builder setHttp(Http http) {
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 == null) {
                http.getClass();
                this.http_ = http;
            } else {
                singleFieldBuilderV3.setMessage(http);
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setHttp(Http.Builder builder) {
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.http_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder mergeHttp(Http http) {
            Http http2;
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 512) != 0 && (http2 = this.http_) != null && http2 != Http.getDefaultInstance()) {
                    getHttpBuilder().mergeFrom(http);
                } else {
                    this.http_ = http;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(http);
            }
            if (this.http_ != null) {
                this.bitField0_ |= 512;
                onChanged();
            }
            return this;
        }

        public Builder clearHttp() {
            this.bitField0_ &= -513;
            this.http_ = null;
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.httpBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Http.Builder getHttpBuilder() {
            this.bitField0_ |= 512;
            onChanged();
            return (Http.Builder) getHttpFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public HttpOrBuilder getHttpOrBuilder() {
            SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> singleFieldBuilderV3 = this.httpBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (HttpOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Http http = this.http_;
            return http == null ? Http.getDefaultInstance() : http;
        }

        private SingleFieldBuilderV3<Http, Http.Builder, HttpOrBuilder> getHttpFieldBuilder() {
            if (this.httpBuilder_ == null) {
                this.httpBuilder_ = new SingleFieldBuilderV3<>(getHttp(), getParentForChildren(), isClean());
                this.http_ = null;
            }
            return this.httpBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasQuota() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Quota getQuota() {
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 == null) {
                Quota quota = this.quota_;
                return quota == null ? Quota.getDefaultInstance() : quota;
            }
            return (Quota) singleFieldBuilderV3.getMessage();
        }

        public Builder setQuota(Quota quota) {
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 == null) {
                quota.getClass();
                this.quota_ = quota;
            } else {
                singleFieldBuilderV3.setMessage(quota);
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setQuota(Quota.Builder builder) {
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.quota_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder mergeQuota(Quota quota) {
            Quota quota2;
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1024) != 0 && (quota2 = this.quota_) != null && quota2 != Quota.getDefaultInstance()) {
                    getQuotaBuilder().mergeFrom(quota);
                } else {
                    this.quota_ = quota;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(quota);
            }
            if (this.quota_ != null) {
                this.bitField0_ |= 1024;
                onChanged();
            }
            return this;
        }

        public Builder clearQuota() {
            this.bitField0_ &= -1025;
            this.quota_ = null;
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.quotaBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Quota.Builder getQuotaBuilder() {
            this.bitField0_ |= 1024;
            onChanged();
            return (Quota.Builder) getQuotaFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public QuotaOrBuilder getQuotaOrBuilder() {
            SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> singleFieldBuilderV3 = this.quotaBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (QuotaOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Quota quota = this.quota_;
            return quota == null ? Quota.getDefaultInstance() : quota;
        }

        private SingleFieldBuilderV3<Quota, Quota.Builder, QuotaOrBuilder> getQuotaFieldBuilder() {
            if (this.quotaBuilder_ == null) {
                this.quotaBuilder_ = new SingleFieldBuilderV3<>(getQuota(), getParentForChildren(), isClean());
                this.quota_ = null;
            }
            return this.quotaBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasAuthentication() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Authentication getAuthentication() {
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 == null) {
                Authentication authentication = this.authentication_;
                return authentication == null ? Authentication.getDefaultInstance() : authentication;
            }
            return (Authentication) singleFieldBuilderV3.getMessage();
        }

        public Builder setAuthentication(Authentication authentication) {
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 == null) {
                authentication.getClass();
                this.authentication_ = authentication;
            } else {
                singleFieldBuilderV3.setMessage(authentication);
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setAuthentication(Authentication.Builder builder) {
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.authentication_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder mergeAuthentication(Authentication authentication) {
            Authentication authentication2;
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2048) != 0 && (authentication2 = this.authentication_) != null && authentication2 != Authentication.getDefaultInstance()) {
                    getAuthenticationBuilder().mergeFrom(authentication);
                } else {
                    this.authentication_ = authentication;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(authentication);
            }
            if (this.authentication_ != null) {
                this.bitField0_ |= 2048;
                onChanged();
            }
            return this;
        }

        public Builder clearAuthentication() {
            this.bitField0_ &= -2049;
            this.authentication_ = null;
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.authenticationBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Authentication.Builder getAuthenticationBuilder() {
            this.bitField0_ |= 2048;
            onChanged();
            return (Authentication.Builder) getAuthenticationFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public AuthenticationOrBuilder getAuthenticationOrBuilder() {
            SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> singleFieldBuilderV3 = this.authenticationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AuthenticationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Authentication authentication = this.authentication_;
            return authentication == null ? Authentication.getDefaultInstance() : authentication;
        }

        private SingleFieldBuilderV3<Authentication, Authentication.Builder, AuthenticationOrBuilder> getAuthenticationFieldBuilder() {
            if (this.authenticationBuilder_ == null) {
                this.authenticationBuilder_ = new SingleFieldBuilderV3<>(getAuthentication(), getParentForChildren(), isClean());
                this.authentication_ = null;
            }
            return this.authenticationBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasContext() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Context getContext() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context = this.context_;
                return context == null ? Context.getDefaultInstance() : context;
            }
            return (Context) singleFieldBuilderV3.getMessage();
        }

        public Builder setContext(Context context) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                context.getClass();
                this.context_ = context;
            } else {
                singleFieldBuilderV3.setMessage(context);
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder mergeContext(Context context) {
            Context context2;
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4096) != 0 && (context2 = this.context_) != null && context2 != Context.getDefaultInstance()) {
                    getContextBuilder().mergeFrom(context);
                } else {
                    this.context_ = context;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(context);
            }
            if (this.context_ != null) {
                this.bitField0_ |= 4096;
                onChanged();
            }
            return this;
        }

        public Builder clearContext() {
            this.bitField0_ &= -4097;
            this.context_ = null;
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.contextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Context.Builder getContextBuilder() {
            this.bitField0_ |= 4096;
            onChanged();
            return (Context.Builder) getContextFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ContextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasUsage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Usage getUsage() {
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 == null) {
                Usage usage = this.usage_;
                return usage == null ? Usage.getDefaultInstance() : usage;
            }
            return (Usage) singleFieldBuilderV3.getMessage();
        }

        public Builder setUsage(Usage usage) {
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 == null) {
                usage.getClass();
                this.usage_ = usage;
            } else {
                singleFieldBuilderV3.setMessage(usage);
            }
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder setUsage(Usage.Builder builder) {
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.usage_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder mergeUsage(Usage usage) {
            Usage usage2;
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8192) != 0 && (usage2 = this.usage_) != null && usage2 != Usage.getDefaultInstance()) {
                    getUsageBuilder().mergeFrom(usage);
                } else {
                    this.usage_ = usage;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(usage);
            }
            if (this.usage_ != null) {
                this.bitField0_ |= 8192;
                onChanged();
            }
            return this;
        }

        public Builder clearUsage() {
            this.bitField0_ &= -8193;
            this.usage_ = null;
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.usageBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Usage.Builder getUsageBuilder() {
            this.bitField0_ |= 8192;
            onChanged();
            return (Usage.Builder) getUsageFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public UsageOrBuilder getUsageOrBuilder() {
            SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> singleFieldBuilderV3 = this.usageBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (UsageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Usage usage = this.usage_;
            return usage == null ? Usage.getDefaultInstance() : usage;
        }

        private SingleFieldBuilderV3<Usage, Usage.Builder, UsageOrBuilder> getUsageFieldBuilder() {
            if (this.usageBuilder_ == null) {
                this.usageBuilder_ = new SingleFieldBuilderV3<>(getUsage(), getParentForChildren(), isClean());
                this.usage_ = null;
            }
            return this.usageBuilder_;
        }

        private void ensureEndpointsIsMutable() {
            if ((this.bitField0_ & 16384) == 0) {
                this.endpoints_ = new ArrayList(this.endpoints_);
                this.bitField0_ |= 16384;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Endpoint> getEndpointsList() {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.endpoints_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEndpointsCount() {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.endpoints_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public Endpoint getEndpoints(int i) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.endpoints_.get(i);
            }
            return (Endpoint) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setEndpoints(int i, Endpoint endpoint) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                endpoint.getClass();
                ensureEndpointsIsMutable();
                this.endpoints_.set(i, endpoint);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, endpoint);
            }
            return this;
        }

        public Builder setEndpoints(int i, Endpoint.Builder builder) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEndpointsIsMutable();
                this.endpoints_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addEndpoints(Endpoint endpoint) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                endpoint.getClass();
                ensureEndpointsIsMutable();
                this.endpoints_.add(endpoint);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(endpoint);
            }
            return this;
        }

        public Builder addEndpoints(int i, Endpoint endpoint) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                endpoint.getClass();
                ensureEndpointsIsMutable();
                this.endpoints_.add(i, endpoint);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, endpoint);
            }
            return this;
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEndpointsIsMutable();
                this.endpoints_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addEndpoints(int i, Endpoint.Builder builder) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEndpointsIsMutable();
                this.endpoints_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEndpointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.endpoints_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearEndpoints() {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.endpoints_ = Collections.emptyList();
                this.bitField0_ &= -16385;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeEndpoints(int i) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEndpointsIsMutable();
                this.endpoints_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Endpoint.Builder getEndpointsBuilder(int i) {
            return (Endpoint.Builder) getEndpointsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public EndpointOrBuilder getEndpointsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.endpoints_.get(i);
            }
            return (EndpointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
            RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> repeatedFieldBuilderV3 = this.endpointsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.endpoints_);
        }

        public Endpoint.Builder addEndpointsBuilder() {
            return (Endpoint.Builder) getEndpointsFieldBuilder().addBuilder(Endpoint.getDefaultInstance());
        }

        public Endpoint.Builder addEndpointsBuilder(int i) {
            return (Endpoint.Builder) getEndpointsFieldBuilder().addBuilder(i, Endpoint.getDefaultInstance());
        }

        public List<Endpoint.Builder> getEndpointsBuilderList() {
            return getEndpointsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Endpoint, Endpoint.Builder, EndpointOrBuilder> getEndpointsFieldBuilder() {
            if (this.endpointsBuilder_ == null) {
                this.endpointsBuilder_ = new RepeatedFieldBuilderV3<>(this.endpoints_, (this.bitField0_ & 16384) != 0, getParentForChildren(), isClean());
                this.endpoints_ = null;
            }
            return this.endpointsBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasControl() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Control getControl() {
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 == null) {
                Control control = this.control_;
                return control == null ? Control.getDefaultInstance() : control;
            }
            return (Control) singleFieldBuilderV3.getMessage();
        }

        public Builder setControl(Control control) {
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 == null) {
                control.getClass();
                this.control_ = control;
            } else {
                singleFieldBuilderV3.setMessage(control);
            }
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public Builder setControl(Control.Builder builder) {
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.control_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 32768;
            onChanged();
            return this;
        }

        public Builder mergeControl(Control control) {
            Control control2;
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32768) != 0 && (control2 = this.control_) != null && control2 != Control.getDefaultInstance()) {
                    getControlBuilder().mergeFrom(control);
                } else {
                    this.control_ = control;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(control);
            }
            if (this.control_ != null) {
                this.bitField0_ |= 32768;
                onChanged();
            }
            return this;
        }

        public Builder clearControl() {
            this.bitField0_ &= -32769;
            this.control_ = null;
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.controlBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Control.Builder getControlBuilder() {
            this.bitField0_ |= 32768;
            onChanged();
            return (Control.Builder) getControlFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public ControlOrBuilder getControlOrBuilder() {
            SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> singleFieldBuilderV3 = this.controlBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Control control = this.control_;
            return control == null ? Control.getDefaultInstance() : control;
        }

        private SingleFieldBuilderV3<Control, Control.Builder, ControlOrBuilder> getControlFieldBuilder() {
            if (this.controlBuilder_ == null) {
                this.controlBuilder_ = new SingleFieldBuilderV3<>(getControl(), getParentForChildren(), isClean());
                this.control_ = null;
            }
            return this.controlBuilder_;
        }

        private void ensureLogsIsMutable() {
            if ((this.bitField0_ & 65536) == 0) {
                this.logs_ = new ArrayList(this.logs_);
                this.bitField0_ |= 65536;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<LogDescriptor> getLogsList() {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.logs_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getLogsCount() {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.logs_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public LogDescriptor getLogs(int i) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.logs_.get(i);
            }
            return (LogDescriptor) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setLogs(int i, LogDescriptor logDescriptor) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                logDescriptor.getClass();
                ensureLogsIsMutable();
                this.logs_.set(i, logDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, logDescriptor);
            }
            return this;
        }

        public Builder setLogs(int i, LogDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLogsIsMutable();
                this.logs_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                logDescriptor.getClass();
                ensureLogsIsMutable();
                this.logs_.add(logDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(logDescriptor);
            }
            return this;
        }

        public Builder addLogs(int i, LogDescriptor logDescriptor) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                logDescriptor.getClass();
                ensureLogsIsMutable();
                this.logs_.add(i, logDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, logDescriptor);
            }
            return this;
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLogsIsMutable();
                this.logs_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addLogs(int i, LogDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLogsIsMutable();
                this.logs_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLogsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.logs_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearLogs() {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.logs_ = Collections.emptyList();
                this.bitField0_ &= -65537;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeLogs(int i) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLogsIsMutable();
                this.logs_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public LogDescriptor.Builder getLogsBuilder(int i) {
            return (LogDescriptor.Builder) getLogsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public LogDescriptorOrBuilder getLogsOrBuilder(int i) {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.logs_.get(i);
            }
            return (LogDescriptorOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
            RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> repeatedFieldBuilderV3 = this.logsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.logs_);
        }

        public LogDescriptor.Builder addLogsBuilder() {
            return (LogDescriptor.Builder) getLogsFieldBuilder().addBuilder(LogDescriptor.getDefaultInstance());
        }

        public LogDescriptor.Builder addLogsBuilder(int i) {
            return (LogDescriptor.Builder) getLogsFieldBuilder().addBuilder(i, LogDescriptor.getDefaultInstance());
        }

        public List<LogDescriptor.Builder> getLogsBuilderList() {
            return getLogsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<LogDescriptor, LogDescriptor.Builder, LogDescriptorOrBuilder> getLogsFieldBuilder() {
            if (this.logsBuilder_ == null) {
                this.logsBuilder_ = new RepeatedFieldBuilderV3<>(this.logs_, (this.bitField0_ & 65536) != 0, getParentForChildren(), isClean());
                this.logs_ = null;
            }
            return this.logsBuilder_;
        }

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 131072) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 131072;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MetricDescriptor> getMetricsList() {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metrics_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMetricsCount() {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public MetricDescriptor getMetrics(int i) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return (MetricDescriptor) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMetrics(int i, MetricDescriptor metricDescriptor) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricDescriptor.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i, metricDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, metricDescriptor);
            }
            return this;
        }

        public Builder setMetrics(int i, MetricDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricDescriptor.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(metricDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(metricDescriptor);
            }
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor metricDescriptor) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                metricDescriptor.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i, metricDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, metricDescriptor);
            }
            return this;
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetrics(int i, MetricDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metrics_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMetrics() {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -131073;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMetrics(int i) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MetricDescriptor.Builder getMetricsBuilder(int i) {
            return (MetricDescriptor.Builder) getMetricsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public MetricDescriptorOrBuilder getMetricsOrBuilder(int i) {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return (MetricDescriptorOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
            RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metrics_);
        }

        public MetricDescriptor.Builder addMetricsBuilder() {
            return (MetricDescriptor.Builder) getMetricsFieldBuilder().addBuilder(MetricDescriptor.getDefaultInstance());
        }

        public MetricDescriptor.Builder addMetricsBuilder(int i) {
            return (MetricDescriptor.Builder) getMetricsFieldBuilder().addBuilder(i, MetricDescriptor.getDefaultInstance());
        }

        public List<MetricDescriptor.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MetricDescriptor, MetricDescriptor.Builder, MetricDescriptorOrBuilder> getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                this.metricsBuilder_ = new RepeatedFieldBuilderV3<>(this.metrics_, (this.bitField0_ & 131072) != 0, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        private void ensureMonitoredResourcesIsMutable() {
            if ((this.bitField0_ & 262144) == 0) {
                this.monitoredResources_ = new ArrayList(this.monitoredResources_);
                this.bitField0_ |= 262144;
            }
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.monitoredResources_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMonitoredResourcesCount() {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.monitoredResources_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoredResourceDescriptor getMonitoredResources(int i) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.monitoredResources_.get(i);
            }
            return (MonitoredResourceDescriptor) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                monitoredResourceDescriptor.getClass();
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.set(i, monitoredResourceDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, monitoredResourceDescriptor);
            }
            return this;
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                monitoredResourceDescriptor.getClass();
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.add(monitoredResourceDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(monitoredResourceDescriptor);
            }
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                monitoredResourceDescriptor.getClass();
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.add(i, monitoredResourceDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, monitoredResourceDescriptor);
            }
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitoredResourcesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.monitoredResources_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMonitoredResources() {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.monitoredResources_ = Collections.emptyList();
                this.bitField0_ &= -262145;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMonitoredResources(int i) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitoredResourcesIsMutable();
                this.monitoredResources_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MonitoredResourceDescriptor.Builder getMonitoredResourcesBuilder(int i) {
            return (MonitoredResourceDescriptor.Builder) getMonitoredResourcesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int i) {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.monitoredResources_.get(i);
            }
            return (MonitoredResourceDescriptorOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
            RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> repeatedFieldBuilderV3 = this.monitoredResourcesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.monitoredResources_);
        }

        public MonitoredResourceDescriptor.Builder addMonitoredResourcesBuilder() {
            return (MonitoredResourceDescriptor.Builder) getMonitoredResourcesFieldBuilder().addBuilder(MonitoredResourceDescriptor.getDefaultInstance());
        }

        public MonitoredResourceDescriptor.Builder addMonitoredResourcesBuilder(int i) {
            return (MonitoredResourceDescriptor.Builder) getMonitoredResourcesFieldBuilder().addBuilder(i, MonitoredResourceDescriptor.getDefaultInstance());
        }

        public List<MonitoredResourceDescriptor.Builder> getMonitoredResourcesBuilderList() {
            return getMonitoredResourcesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MonitoredResourceDescriptor, MonitoredResourceDescriptor.Builder, MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesFieldBuilder() {
            if (this.monitoredResourcesBuilder_ == null) {
                this.monitoredResourcesBuilder_ = new RepeatedFieldBuilderV3<>(this.monitoredResources_, (this.bitField0_ & 262144) != 0, getParentForChildren(), isClean());
                this.monitoredResources_ = null;
            }
            return this.monitoredResourcesBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBilling() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Billing getBilling() {
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 == null) {
                Billing billing = this.billing_;
                return billing == null ? Billing.getDefaultInstance() : billing;
            }
            return (Billing) singleFieldBuilderV3.getMessage();
        }

        public Builder setBilling(Billing billing) {
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 == null) {
                billing.getClass();
                this.billing_ = billing;
            } else {
                singleFieldBuilderV3.setMessage(billing);
            }
            this.bitField0_ |= 524288;
            onChanged();
            return this;
        }

        public Builder setBilling(Billing.Builder builder) {
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.billing_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 524288;
            onChanged();
            return this;
        }

        public Builder mergeBilling(Billing billing) {
            Billing billing2;
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 524288) != 0 && (billing2 = this.billing_) != null && billing2 != Billing.getDefaultInstance()) {
                    getBillingBuilder().mergeFrom(billing);
                } else {
                    this.billing_ = billing;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(billing);
            }
            if (this.billing_ != null) {
                this.bitField0_ |= 524288;
                onChanged();
            }
            return this;
        }

        public Builder clearBilling() {
            this.bitField0_ &= -524289;
            this.billing_ = null;
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.billingBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Billing.Builder getBillingBuilder() {
            this.bitField0_ |= 524288;
            onChanged();
            return (Billing.Builder) getBillingFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public BillingOrBuilder getBillingOrBuilder() {
            SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> singleFieldBuilderV3 = this.billingBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (BillingOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Billing billing = this.billing_;
            return billing == null ? Billing.getDefaultInstance() : billing;
        }

        private SingleFieldBuilderV3<Billing, Billing.Builder, BillingOrBuilder> getBillingFieldBuilder() {
            if (this.billingBuilder_ == null) {
                this.billingBuilder_ = new SingleFieldBuilderV3<>(getBilling(), getParentForChildren(), isClean());
                this.billing_ = null;
            }
            return this.billingBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasLogging() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Logging getLogging() {
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 == null) {
                Logging logging = this.logging_;
                return logging == null ? Logging.getDefaultInstance() : logging;
            }
            return (Logging) singleFieldBuilderV3.getMessage();
        }

        public Builder setLogging(Logging logging) {
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 == null) {
                logging.getClass();
                this.logging_ = logging;
            } else {
                singleFieldBuilderV3.setMessage(logging);
            }
            this.bitField0_ |= 1048576;
            onChanged();
            return this;
        }

        public Builder setLogging(Logging.Builder builder) {
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.logging_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1048576;
            onChanged();
            return this;
        }

        public Builder mergeLogging(Logging logging) {
            Logging logging2;
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1048576) != 0 && (logging2 = this.logging_) != null && logging2 != Logging.getDefaultInstance()) {
                    getLoggingBuilder().mergeFrom(logging);
                } else {
                    this.logging_ = logging;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(logging);
            }
            if (this.logging_ != null) {
                this.bitField0_ |= 1048576;
                onChanged();
            }
            return this;
        }

        public Builder clearLogging() {
            this.bitField0_ &= -1048577;
            this.logging_ = null;
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.loggingBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Logging.Builder getLoggingBuilder() {
            this.bitField0_ |= 1048576;
            onChanged();
            return (Logging.Builder) getLoggingFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public LoggingOrBuilder getLoggingOrBuilder() {
            SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> singleFieldBuilderV3 = this.loggingBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (LoggingOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Logging logging = this.logging_;
            return logging == null ? Logging.getDefaultInstance() : logging;
        }

        private SingleFieldBuilderV3<Logging, Logging.Builder, LoggingOrBuilder> getLoggingFieldBuilder() {
            if (this.loggingBuilder_ == null) {
                this.loggingBuilder_ = new SingleFieldBuilderV3<>(getLogging(), getParentForChildren(), isClean());
                this.logging_ = null;
            }
            return this.loggingBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasMonitoring() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Monitoring getMonitoring() {
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 == null) {
                Monitoring monitoring = this.monitoring_;
                return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
            }
            return (Monitoring) singleFieldBuilderV3.getMessage();
        }

        public Builder setMonitoring(Monitoring monitoring) {
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 == null) {
                monitoring.getClass();
                this.monitoring_ = monitoring;
            } else {
                singleFieldBuilderV3.setMessage(monitoring);
            }
            this.bitField0_ |= 2097152;
            onChanged();
            return this;
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.monitoring_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2097152;
            onChanged();
            return this;
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
            Monitoring monitoring2;
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2097152) != 0 && (monitoring2 = this.monitoring_) != null && monitoring2 != Monitoring.getDefaultInstance()) {
                    getMonitoringBuilder().mergeFrom(monitoring);
                } else {
                    this.monitoring_ = monitoring;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(monitoring);
            }
            if (this.monitoring_ != null) {
                this.bitField0_ |= 2097152;
                onChanged();
            }
            return this;
        }

        public Builder clearMonitoring() {
            this.bitField0_ &= -2097153;
            this.monitoring_ = null;
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.monitoringBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Monitoring.Builder getMonitoringBuilder() {
            this.bitField0_ |= 2097152;
            onChanged();
            return (Monitoring.Builder) getMonitoringFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoringOrBuilder getMonitoringOrBuilder() {
            SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> singleFieldBuilderV3 = this.monitoringBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (MonitoringOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Monitoring monitoring = this.monitoring_;
            return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
        }

        private SingleFieldBuilderV3<Monitoring, Monitoring.Builder, MonitoringOrBuilder> getMonitoringFieldBuilder() {
            if (this.monitoringBuilder_ == null) {
                this.monitoringBuilder_ = new SingleFieldBuilderV3<>(getMonitoring(), getParentForChildren(), isClean());
                this.monitoring_ = null;
            }
            return this.monitoringBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSystemParameters() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public SystemParameters getSystemParameters() {
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 == null) {
                SystemParameters systemParameters = this.systemParameters_;
                return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
            }
            return (SystemParameters) singleFieldBuilderV3.getMessage();
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 == null) {
                systemParameters.getClass();
                this.systemParameters_ = systemParameters;
            } else {
                singleFieldBuilderV3.setMessage(systemParameters);
            }
            this.bitField0_ |= 4194304;
            onChanged();
            return this;
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.systemParameters_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4194304;
            onChanged();
            return this;
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
            SystemParameters systemParameters2;
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4194304) != 0 && (systemParameters2 = this.systemParameters_) != null && systemParameters2 != SystemParameters.getDefaultInstance()) {
                    getSystemParametersBuilder().mergeFrom(systemParameters);
                } else {
                    this.systemParameters_ = systemParameters;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(systemParameters);
            }
            if (this.systemParameters_ != null) {
                this.bitField0_ |= 4194304;
                onChanged();
            }
            return this;
        }

        public Builder clearSystemParameters() {
            this.bitField0_ &= -4194305;
            this.systemParameters_ = null;
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.systemParametersBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public SystemParameters.Builder getSystemParametersBuilder() {
            this.bitField0_ |= 4194304;
            onChanged();
            return (SystemParameters.Builder) getSystemParametersFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SystemParametersOrBuilder getSystemParametersOrBuilder() {
            SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> singleFieldBuilderV3 = this.systemParametersBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SystemParametersOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            SystemParameters systemParameters = this.systemParameters_;
            return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
        }

        private SingleFieldBuilderV3<SystemParameters, SystemParameters.Builder, SystemParametersOrBuilder> getSystemParametersFieldBuilder() {
            if (this.systemParametersBuilder_ == null) {
                this.systemParametersBuilder_ = new SingleFieldBuilderV3<>(getSystemParameters(), getParentForChildren(), isClean());
                this.systemParameters_ = null;
            }
            return this.systemParametersBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSourceInfo() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public SourceInfo getSourceInfo() {
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                SourceInfo sourceInfo = this.sourceInfo_;
                return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
            }
            return (SourceInfo) singleFieldBuilderV3.getMessage();
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                sourceInfo.getClass();
                this.sourceInfo_ = sourceInfo;
            } else {
                singleFieldBuilderV3.setMessage(sourceInfo);
            }
            this.bitField0_ |= 8388608;
            onChanged();
            return this;
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sourceInfo_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8388608;
            onChanged();
            return this;
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
            SourceInfo sourceInfo2;
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8388608) != 0 && (sourceInfo2 = this.sourceInfo_) != null && sourceInfo2 != SourceInfo.getDefaultInstance()) {
                    getSourceInfoBuilder().mergeFrom(sourceInfo);
                } else {
                    this.sourceInfo_ = sourceInfo;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(sourceInfo);
            }
            if (this.sourceInfo_ != null) {
                this.bitField0_ |= 8388608;
                onChanged();
            }
            return this;
        }

        public Builder clearSourceInfo() {
            this.bitField0_ &= -8388609;
            this.sourceInfo_ = null;
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.sourceInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public SourceInfo.Builder getSourceInfoBuilder() {
            this.bitField0_ |= 8388608;
            onChanged();
            return (SourceInfo.Builder) getSourceInfoFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public SourceInfoOrBuilder getSourceInfoOrBuilder() {
            SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> singleFieldBuilderV3 = this.sourceInfoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (SourceInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            SourceInfo sourceInfo = this.sourceInfo_;
            return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
        }

        private SingleFieldBuilderV3<SourceInfo, SourceInfo.Builder, SourceInfoOrBuilder> getSourceInfoFieldBuilder() {
            if (this.sourceInfoBuilder_ == null) {
                this.sourceInfoBuilder_ = new SingleFieldBuilderV3<>(getSourceInfo(), getParentForChildren(), isClean());
                this.sourceInfo_ = null;
            }
            return this.sourceInfoBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasPublishing() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public Publishing getPublishing() {
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 == null) {
                Publishing publishing = this.publishing_;
                return publishing == null ? Publishing.getDefaultInstance() : publishing;
            }
            return (Publishing) singleFieldBuilderV3.getMessage();
        }

        public Builder setPublishing(Publishing publishing) {
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 == null) {
                publishing.getClass();
                this.publishing_ = publishing;
            } else {
                singleFieldBuilderV3.setMessage(publishing);
            }
            this.bitField0_ |= 16777216;
            onChanged();
            return this;
        }

        public Builder setPublishing(Publishing.Builder builder) {
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.publishing_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16777216;
            onChanged();
            return this;
        }

        public Builder mergePublishing(Publishing publishing) {
            Publishing publishing2;
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16777216) != 0 && (publishing2 = this.publishing_) != null && publishing2 != Publishing.getDefaultInstance()) {
                    getPublishingBuilder().mergeFrom(publishing);
                } else {
                    this.publishing_ = publishing;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(publishing);
            }
            if (this.publishing_ != null) {
                this.bitField0_ |= 16777216;
                onChanged();
            }
            return this;
        }

        public Builder clearPublishing() {
            this.bitField0_ &= -16777217;
            this.publishing_ = null;
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.publishingBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Publishing.Builder getPublishingBuilder() {
            this.bitField0_ |= 16777216;
            onChanged();
            return (Publishing.Builder) getPublishingFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public PublishingOrBuilder getPublishingOrBuilder() {
            SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> singleFieldBuilderV3 = this.publishingBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PublishingOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Publishing publishing = this.publishing_;
            return publishing == null ? Publishing.getDefaultInstance() : publishing;
        }

        private SingleFieldBuilderV3<Publishing, Publishing.Builder, PublishingOrBuilder> getPublishingFieldBuilder() {
            if (this.publishingBuilder_ == null) {
                this.publishingBuilder_ = new SingleFieldBuilderV3<>(getPublishing(), getParentForChildren(), isClean());
                this.publishing_ = null;
            }
            return this.publishingBuilder_;
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasConfigVersion() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.google.api.ServiceOrBuilder
        public UInt32Value getConfigVersion() {
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 == null) {
                UInt32Value uInt32Value = this.configVersion_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }
            return (UInt32Value) singleFieldBuilderV3.getMessage();
        }

        public Builder setConfigVersion(UInt32Value uInt32Value) {
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 == null) {
                uInt32Value.getClass();
                this.configVersion_ = uInt32Value;
            } else {
                singleFieldBuilderV3.setMessage(uInt32Value);
            }
            this.bitField0_ |= 33554432;
            onChanged();
            return this;
        }

        public Builder setConfigVersion(UInt32Value.Builder builder) {
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.configVersion_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 33554432;
            onChanged();
            return this;
        }

        public Builder mergeConfigVersion(UInt32Value uInt32Value) {
            UInt32Value uInt32Value2;
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 33554432) != 0 && (uInt32Value2 = this.configVersion_) != null && uInt32Value2 != UInt32Value.getDefaultInstance()) {
                    getConfigVersionBuilder().mergeFrom(uInt32Value);
                } else {
                    this.configVersion_ = uInt32Value;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(uInt32Value);
            }
            if (this.configVersion_ != null) {
                this.bitField0_ |= 33554432;
                onChanged();
            }
            return this;
        }

        public Builder clearConfigVersion() {
            this.bitField0_ &= -33554433;
            this.configVersion_ = null;
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.configVersionBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public UInt32Value.Builder getConfigVersionBuilder() {
            this.bitField0_ |= 33554432;
            onChanged();
            return (UInt32Value.Builder) getConfigVersionFieldBuilder().getBuilder();
        }

        @Override // com.google.api.ServiceOrBuilder
        public UInt32ValueOrBuilder getConfigVersionOrBuilder() {
            SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> singleFieldBuilderV3 = this.configVersionBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (UInt32ValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            UInt32Value uInt32Value = this.configVersion_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        private SingleFieldBuilderV3<UInt32Value, UInt32Value.Builder, UInt32ValueOrBuilder> getConfigVersionFieldBuilder() {
            if (this.configVersionBuilder_ == null) {
                this.configVersionBuilder_ = new SingleFieldBuilderV3<>(getConfigVersion(), getParentForChildren(), isClean());
                this.configVersion_ = null;
            }
            return this.configVersionBuilder_;
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

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Service> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Service> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Service getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
