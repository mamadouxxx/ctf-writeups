package com.google.rpc.context;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.api.Publishing;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import io.grpc.internal.GrpcUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributeContext extends GeneratedMessageV3 implements AttributeContextOrBuilder {
    public static final int API_FIELD_NUMBER = 6;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int EXTENSIONS_FIELD_NUMBER = 8;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Api api_;
    private int bitField0_;
    private Peer destination_;
    private List<Any> extensions_;
    private byte memoizedIsInitialized;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;
    private static final AttributeContext DEFAULT_INSTANCE = new AttributeContext();
    private static final Parser<AttributeContext> PARSER = new AbstractParser<AttributeContext>() { // from class: com.google.rpc.context.AttributeContext.1
        @Override // com.google.protobuf.Parser
        public AttributeContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = AttributeContext.newBuilder();
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

    public interface ApiOrBuilder extends MessageOrBuilder {
        String getOperation();

        ByteString getOperationBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getService();

        ByteString getServiceBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    public interface AuthOrBuilder extends MessageOrBuilder {
        String getAccessLevels(int i);

        ByteString getAccessLevelsBytes(int i);

        int getAccessLevelsCount();

        List<String> getAccessLevelsList();

        String getAudiences(int i);

        ByteString getAudiencesBytes(int i);

        int getAudiencesCount();

        List<String> getAudiencesList();

        Struct getClaims();

        StructOrBuilder getClaimsOrBuilder();

        String getPresenter();

        ByteString getPresenterBytes();

        String getPrincipal();

        ByteString getPrincipalBytes();

        boolean hasClaims();
    }

    public interface PeerOrBuilder extends MessageOrBuilder {
        boolean containsLabels(String str);

        String getIp();

        ByteString getIpBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        long getPort();

        String getPrincipal();

        ByteString getPrincipalBytes();

        String getRegionCode();

        ByteString getRegionCodeBytes();
    }

    public interface RequestOrBuilder extends MessageOrBuilder {
        boolean containsHeaders(String str);

        Auth getAuth();

        AuthOrBuilder getAuthOrBuilder();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getHost();

        ByteString getHostBytes();

        String getId();

        ByteString getIdBytes();

        String getMethod();

        ByteString getMethodBytes();

        String getPath();

        ByteString getPathBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getQuery();

        ByteString getQueryBytes();

        String getReason();

        ByteString getReasonBytes();

        String getScheme();

        ByteString getSchemeBytes();

        long getSize();

        Timestamp getTime();

        TimestampOrBuilder getTimeOrBuilder();

        boolean hasAuth();

        boolean hasTime();
    }

    public interface ResourceOrBuilder extends MessageOrBuilder {
        boolean containsAnnotations(String str);

        boolean containsLabels(String str);

        @Deprecated
        Map<String, String> getAnnotations();

        int getAnnotationsCount();

        Map<String, String> getAnnotationsMap();

        String getAnnotationsOrDefault(String str, String str2);

        String getAnnotationsOrThrow(String str);

        Timestamp getCreateTime();

        TimestampOrBuilder getCreateTimeOrBuilder();

        Timestamp getDeleteTime();

        TimestampOrBuilder getDeleteTimeOrBuilder();

        String getDisplayName();

        ByteString getDisplayNameBytes();

        String getEtag();

        ByteString getEtagBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        String getLocation();

        ByteString getLocationBytes();

        String getName();

        ByteString getNameBytes();

        String getService();

        ByteString getServiceBytes();

        String getType();

        ByteString getTypeBytes();

        String getUid();

        ByteString getUidBytes();

        Timestamp getUpdateTime();

        TimestampOrBuilder getUpdateTimeOrBuilder();

        boolean hasCreateTime();

        boolean hasDeleteTime();

        boolean hasUpdateTime();
    }

    public interface ResponseOrBuilder extends MessageOrBuilder {
        boolean containsHeaders(String str);

        Duration getBackendLatency();

        DurationOrBuilder getBackendLatencyOrBuilder();

        long getCode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        long getSize();

        Timestamp getTime();

        TimestampOrBuilder getTimeOrBuilder();

        boolean hasBackendLatency();

        boolean hasTime();
    }

    static /* synthetic */ int access$11276(AttributeContext attributeContext, int i) {
        int i2 = i | attributeContext.bitField0_;
        attributeContext.bitField0_ = i2;
        return i2;
    }

    private AttributeContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private AttributeContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.extensions_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AttributeContext();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AttributeContext.class, Builder.class);
    }

    public static final class Peer extends GeneratedMessageV3 implements PeerOrBuilder {
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private volatile Object ip_;
        private MapField<String, String> labels_;
        private byte memoizedIsInitialized;
        private long port_;
        private volatile Object principal_;
        private volatile Object regionCode_;
        private static final Peer DEFAULT_INSTANCE = new Peer();
        private static final Parser<Peer> PARSER = new AbstractParser<Peer>() { // from class: com.google.rpc.context.AttributeContext.Peer.1
            @Override // com.google.protobuf.Parser
            public Peer parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Peer.newBuilder();
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

        private Peer(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ip_ = "";
            this.port_ = 0L;
            this.principal_ = "";
            this.regionCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private Peer() {
            this.ip_ = "";
            this.port_ = 0L;
            this.principal_ = "";
            this.regionCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.ip_ = "";
            this.principal_ = "";
            this.regionCode_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Peer();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 6) {
                return internalGetLabels();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_fieldAccessorTable.ensureFieldAccessorsInitialized(Peer.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public long getPort() {
            return this.port_;
        }

        private static final class LabelsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_LabelsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private LabelsDefaultEntryHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetLabels() {
            MapField<String, String> mapField = this.labels_;
            return mapField == null ? MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry) : mapField;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public int getLabelsCount() {
            return internalGetLabels().getMap().size();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public boolean containsLabels(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetLabels().getMap().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public Map<String, String> getLabelsMap() {
            return internalGetLabels().getMap();
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetLabels().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetLabels().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getPrincipal() {
            Object obj = this.principal_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.principal_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getPrincipalBytes() {
            Object obj = this.principal_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.principal_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getRegionCode() {
            Object obj = this.regionCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.regionCode_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getRegionCodeBytes() {
            Object obj = this.regionCode_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.regionCode_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.ip_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ip_);
            }
            long j = this.port_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.principal_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.principal_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.regionCode_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.regionCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.ip_) ? GeneratedMessageV3.computeStringSize(1, this.ip_) : 0;
            long j = this.port_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(2, j);
            }
            for (Map.Entry<String, String> entry : internalGetLabels().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, LabelsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.principal_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.principal_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.regionCode_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.regionCode_);
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
            if (!(obj instanceof Peer)) {
                return super.equals(obj);
            }
            Peer peer = (Peer) obj;
            return getIp().equals(peer.getIp()) && getPort() == peer.getPort() && internalGetLabels().equals(peer.internalGetLabels()) && getPrincipal().equals(peer.getPrincipal()) && getRegionCode().equals(peer.getRegionCode()) && getUnknownFields().equals(peer.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getIp().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getPort());
            if (!internalGetLabels().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + internalGetLabels().hashCode();
            }
            int iHashCode2 = (((((((((iHashCode * 37) + 7) * 53) + getPrincipal().hashCode()) * 37) + 8) * 53) + getRegionCode().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Peer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Peer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Peer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Peer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Peer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Peer peer) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(peer);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PeerOrBuilder {
            private int bitField0_;
            private Object ip_;
            private MapField<String, String> labels_;
            private long port_;
            private Object principal_;
            private Object regionCode_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
                if (i == 6) {
                    return internalGetLabels();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
                if (i == 6) {
                    return internalGetMutableLabels();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_fieldAccessorTable.ensureFieldAccessorsInitialized(Peer.class, Builder.class);
            }

            private Builder() {
                this.ip_ = "";
                this.principal_ = "";
                this.regionCode_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ip_ = "";
                this.principal_ = "";
                this.regionCode_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ip_ = "";
                this.port_ = 0L;
                internalGetMutableLabels().clear();
                this.principal_ = "";
                this.regionCode_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Peer_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Peer getDefaultInstanceForType() {
                return Peer.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Peer build() {
                Peer peerBuildPartial = buildPartial();
                if (peerBuildPartial.isInitialized()) {
                    return peerBuildPartial;
                }
                throw newUninitializedMessageException((Message) peerBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Peer buildPartial() {
                Peer peer = new Peer(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(peer);
                }
                onBuilt();
                return peer;
            }

            private void buildPartial0(Peer peer) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    peer.ip_ = this.ip_;
                }
                if ((i & 2) != 0) {
                    peer.port_ = this.port_;
                }
                if ((i & 4) != 0) {
                    peer.labels_ = internalGetLabels();
                    peer.labels_.makeImmutable();
                }
                if ((i & 8) != 0) {
                    peer.principal_ = this.principal_;
                }
                if ((i & 16) != 0) {
                    peer.regionCode_ = this.regionCode_;
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
                if (message instanceof Peer) {
                    return mergeFrom((Peer) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Peer peer) {
                if (peer == Peer.getDefaultInstance()) {
                    return this;
                }
                if (!peer.getIp().isEmpty()) {
                    this.ip_ = peer.ip_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (peer.getPort() != 0) {
                    setPort(peer.getPort());
                }
                internalGetMutableLabels().mergeFrom(peer.internalGetLabels());
                this.bitField0_ |= 4;
                if (!peer.getPrincipal().isEmpty()) {
                    this.principal_ = peer.principal_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!peer.getRegionCode().isEmpty()) {
                    this.regionCode_ = peer.regionCode_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(peer.getUnknownFields());
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
                                    this.ip_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.port_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 50) {
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableLabels().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                    this.bitField0_ |= 4;
                                } else if (tag == 58) {
                                    this.principal_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 66) {
                                    this.regionCode_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
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

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getIp() {
                Object obj = this.ip_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.ip_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getIpBytes() {
                Object obj = this.ip_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.ip_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setIp(String str) {
                str.getClass();
                this.ip_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearIp() {
                this.ip_ = Peer.getDefaultInstance().getIp();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                byteString.getClass();
                Peer.checkByteStringIsUtf8(byteString);
                this.ip_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public long getPort() {
                return this.port_;
            }

            public Builder setPort(long j) {
                this.port_ = j;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearPort() {
                this.bitField0_ &= -3;
                this.port_ = 0L;
                onChanged();
                return this;
            }

            private MapField<String, String> internalGetLabels() {
                MapField<String, String> mapField = this.labels_;
                return mapField == null ? MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableLabels() {
                if (this.labels_ == null) {
                    this.labels_ = MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
                }
                if (!this.labels_.isMutable()) {
                    this.labels_ = this.labels_.copy();
                }
                this.bitField0_ |= 4;
                onChanged();
                return this.labels_;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public int getLabelsCount() {
                return internalGetLabels().getMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public boolean containsLabels(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                return internalGetLabels().getMap().containsKey(str);
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public Map<String, String> getLabelsMap() {
                return internalGetLabels().getMap();
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetLabels().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetLabels().getMap();
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return map.get(str);
            }

            public Builder clearLabels() {
                this.bitField0_ &= -5;
                internalGetMutableLabels().getMutableMap().clear();
                return this;
            }

            public Builder removeLabels(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableLabels().getMutableMap().remove(str);
                return this;
            }

            @Deprecated
            public Map<String, String> getMutableLabels() {
                this.bitField0_ |= 4;
                return internalGetMutableLabels().getMutableMap();
            }

            public Builder putLabels(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableLabels().getMutableMap().put(str, str2);
                this.bitField0_ |= 4;
                return this;
            }

            public Builder putAllLabels(Map<String, String> map) {
                internalGetMutableLabels().getMutableMap().putAll(map);
                this.bitField0_ |= 4;
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getPrincipal() {
                Object obj = this.principal_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.principal_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getPrincipalBytes() {
                Object obj = this.principal_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.principal_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setPrincipal(String str) {
                str.getClass();
                this.principal_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearPrincipal() {
                this.principal_ = Peer.getDefaultInstance().getPrincipal();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) {
                byteString.getClass();
                Peer.checkByteStringIsUtf8(byteString);
                this.principal_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getRegionCode() {
                Object obj = this.regionCode_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.regionCode_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getRegionCodeBytes() {
                Object obj = this.regionCode_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.regionCode_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setRegionCode(String str) {
                str.getClass();
                this.regionCode_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearRegionCode() {
                this.regionCode_ = Peer.getDefaultInstance().getRegionCode();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder setRegionCodeBytes(ByteString byteString) {
                byteString.getClass();
                Peer.checkByteStringIsUtf8(byteString);
                this.regionCode_ = byteString;
                this.bitField0_ |= 16;
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

        public static Peer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Peer> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Peer> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Peer getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Api extends GeneratedMessageV3 implements ApiOrBuilder {
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private volatile Object protocol_;
        private volatile Object service_;
        private volatile Object version_;
        private static final Api DEFAULT_INSTANCE = new Api();
        private static final Parser<Api> PARSER = new AbstractParser<Api>() { // from class: com.google.rpc.context.AttributeContext.Api.1
            @Override // com.google.protobuf.Parser
            public Api parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Api.newBuilder();
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

        private Api(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.service_ = "";
            this.operation_ = "";
            this.protocol_ = "";
            this.version_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private Api() {
            this.service_ = "";
            this.operation_ = "";
            this.protocol_ = "";
            this.version_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.service_ = "";
            this.operation_ = "";
            this.protocol_ = "";
            this.version_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Api();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Api_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getService() {
            Object obj = this.service_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.service_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getServiceBytes() {
            Object obj = this.service_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.service_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getOperationBytes() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.operation_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getProtocol() {
            Object obj = this.protocol_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.protocol_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getProtocolBytes() {
            Object obj = this.protocol_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.protocol_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.version_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.service_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.service_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.operation_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.operation_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.protocol_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.protocol_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.version_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.service_) ? GeneratedMessageV3.computeStringSize(1, this.service_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.operation_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.operation_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.protocol_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.protocol_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.version_);
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
            if (!(obj instanceof Api)) {
                return super.equals(obj);
            }
            Api api = (Api) obj;
            return getService().equals(api.getService()) && getOperation().equals(api.getOperation()) && getProtocol().equals(api.getProtocol()) && getVersion().equals(api.getVersion()) && getUnknownFields().equals(api.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getService().hashCode()) * 37) + 2) * 53) + getOperation().hashCode()) * 37) + 3) * 53) + getProtocol().hashCode()) * 37) + 4) * 53) + getVersion().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Api api) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApiOrBuilder {
            private int bitField0_;
            private Object operation_;
            private Object protocol_;
            private Object service_;
            private Object version_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Api_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
            }

            private Builder() {
                this.service_ = "";
                this.operation_ = "";
                this.protocol_ = "";
                this.version_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.service_ = "";
                this.operation_ = "";
                this.protocol_ = "";
                this.version_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.service_ = "";
                this.operation_ = "";
                this.protocol_ = "";
                this.version_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Api_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Api getDefaultInstanceForType() {
                return Api.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Api build() {
                Api apiBuildPartial = buildPartial();
                if (apiBuildPartial.isInitialized()) {
                    return apiBuildPartial;
                }
                throw newUninitializedMessageException((Message) apiBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Api buildPartial() {
                Api api = new Api(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(api);
                }
                onBuilt();
                return api;
            }

            private void buildPartial0(Api api) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    api.service_ = this.service_;
                }
                if ((i & 2) != 0) {
                    api.operation_ = this.operation_;
                }
                if ((i & 4) != 0) {
                    api.protocol_ = this.protocol_;
                }
                if ((i & 8) != 0) {
                    api.version_ = this.version_;
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
                if (message instanceof Api) {
                    return mergeFrom((Api) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Api api) {
                if (api == Api.getDefaultInstance()) {
                    return this;
                }
                if (!api.getService().isEmpty()) {
                    this.service_ = api.service_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!api.getOperation().isEmpty()) {
                    this.operation_ = api.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!api.getProtocol().isEmpty()) {
                    this.protocol_ = api.protocol_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!api.getVersion().isEmpty()) {
                    this.version_ = api.version_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(api.getUnknownFields());
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
                                    this.service_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.operation_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.protocol_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.version_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
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

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getService() {
                Object obj = this.service_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.service_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getServiceBytes() {
                Object obj = this.service_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.service_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setService(String str) {
                str.getClass();
                this.service_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearService() {
                this.service_ = Api.getDefaultInstance().getService();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) {
                byteString.getClass();
                Api.checkByteStringIsUtf8(byteString);
                this.service_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.operation_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getOperationBytes() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.operation_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setOperation(String str) {
                str.getClass();
                this.operation_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = Api.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setOperationBytes(ByteString byteString) {
                byteString.getClass();
                Api.checkByteStringIsUtf8(byteString);
                this.operation_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getProtocol() {
                Object obj = this.protocol_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.protocol_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getProtocolBytes() {
                Object obj = this.protocol_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.protocol_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setProtocol(String str) {
                str.getClass();
                this.protocol_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearProtocol() {
                this.protocol_ = Api.getDefaultInstance().getProtocol();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) {
                byteString.getClass();
                Api.checkByteStringIsUtf8(byteString);
                this.protocol_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getVersion() {
                Object obj = this.version_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.version_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = Api.getDefaultInstance().getVersion();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                byteString.getClass();
                Api.checkByteStringIsUtf8(byteString);
                this.version_ = byteString;
                this.bitField0_ |= 8;
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

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Api> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Api> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Api getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Auth extends GeneratedMessageV3 implements AuthOrBuilder {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final Auth DEFAULT_INSTANCE = new Auth();
        private static final Parser<Auth> PARSER = new AbstractParser<Auth>() { // from class: com.google.rpc.context.AttributeContext.Auth.1
            @Override // com.google.protobuf.Parser
            public Auth parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Auth.newBuilder();
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
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private LazyStringArrayList accessLevels_;
        private LazyStringArrayList audiences_;
        private int bitField0_;
        private Struct claims_;
        private byte memoizedIsInitialized;
        private volatile Object presenter_;
        private volatile Object principal_;

        static /* synthetic */ int access$3276(Auth auth, int i) {
            int i2 = i | auth.bitField0_;
            auth.bitField0_ = i2;
            return i2;
        }

        private Auth(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.principal_ = "";
            this.audiences_ = LazyStringArrayList.emptyList();
            this.presenter_ = "";
            this.accessLevels_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        private Auth() {
            this.principal_ = "";
            this.audiences_ = LazyStringArrayList.emptyList();
            this.presenter_ = "";
            this.accessLevels_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.principal_ = "";
            this.audiences_ = LazyStringArrayList.emptyList();
            this.presenter_ = "";
            this.accessLevels_ = LazyStringArrayList.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Auth();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Auth_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Auth_fieldAccessorTable.ensureFieldAccessorsInitialized(Auth.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPrincipal() {
            Object obj = this.principal_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.principal_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPrincipalBytes() {
            Object obj = this.principal_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.principal_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ProtocolStringList getAudiencesList() {
            return this.audiences_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAudiences(int i) {
            return this.audiences_.get(i);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAudiencesBytes(int i) {
            return this.audiences_.getByteString(i);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPresenter() {
            Object obj = this.presenter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.presenter_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPresenterBytes() {
            Object obj = this.presenter_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.presenter_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public boolean hasClaims() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public Struct getClaims() {
            Struct struct = this.claims_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public StructOrBuilder getClaimsOrBuilder() {
            Struct struct = this.claims_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ProtocolStringList getAccessLevelsList() {
            return this.accessLevels_;
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAccessLevels(int i) {
            return this.accessLevels_.get(i);
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAccessLevelsBytes(int i) {
            return this.accessLevels_.getByteString(i);
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
            if (!GeneratedMessageV3.isStringEmpty(this.principal_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.principal_);
            }
            for (int i = 0; i < this.audiences_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.audiences_.getRaw(i));
            }
            if (!GeneratedMessageV3.isStringEmpty(this.presenter_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.presenter_);
            }
            if ((1 & this.bitField0_) != 0) {
                codedOutputStream.writeMessage(4, getClaims());
            }
            for (int i2 = 0; i2 < this.accessLevels_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.accessLevels_.getRaw(i2));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.principal_) ? GeneratedMessageV3.computeStringSize(1, this.principal_) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i2 = 0; i2 < this.audiences_.size(); i2++) {
                iComputeStringSizeNoTag += computeStringSizeNoTag(this.audiences_.getRaw(i2));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + getAudiencesList().size();
            if (!GeneratedMessageV3.isStringEmpty(this.presenter_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.presenter_);
            }
            if ((1 & this.bitField0_) != 0) {
                size += CodedOutputStream.computeMessageSize(4, getClaims());
            }
            int iComputeStringSizeNoTag2 = 0;
            for (int i3 = 0; i3 < this.accessLevels_.size(); i3++) {
                iComputeStringSizeNoTag2 += computeStringSizeNoTag(this.accessLevels_.getRaw(i3));
            }
            int size2 = size + iComputeStringSizeNoTag2 + getAccessLevelsList().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Auth)) {
                return super.equals(obj);
            }
            Auth auth = (Auth) obj;
            if (getPrincipal().equals(auth.getPrincipal()) && getAudiencesList().equals(auth.getAudiencesList()) && getPresenter().equals(auth.getPresenter()) && hasClaims() == auth.hasClaims()) {
                return (!hasClaims() || getClaims().equals(auth.getClaims())) && getAccessLevelsList().equals(auth.getAccessLevelsList()) && getUnknownFields().equals(auth.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPrincipal().hashCode();
            if (getAudiencesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAudiencesList().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 3) * 53) + getPresenter().hashCode();
            if (hasClaims()) {
                iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getClaims().hashCode();
            }
            if (getAccessLevelsCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getAccessLevelsList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Auth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Auth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Auth) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Auth auth) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(auth);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuthOrBuilder {
            private LazyStringArrayList accessLevels_;
            private LazyStringArrayList audiences_;
            private int bitField0_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> claimsBuilder_;
            private Struct claims_;
            private Object presenter_;
            private Object principal_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Auth_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Auth_fieldAccessorTable.ensureFieldAccessorsInitialized(Auth.class, Builder.class);
            }

            private Builder() {
                this.principal_ = "";
                this.audiences_ = LazyStringArrayList.emptyList();
                this.presenter_ = "";
                this.accessLevels_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.principal_ = "";
                this.audiences_ = LazyStringArrayList.emptyList();
                this.presenter_ = "";
                this.accessLevels_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Auth.alwaysUseFieldBuilders) {
                    getClaimsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.principal_ = "";
                this.audiences_ = LazyStringArrayList.emptyList();
                this.presenter_ = "";
                this.claims_ = null;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.claimsBuilder_ = null;
                }
                this.accessLevels_ = LazyStringArrayList.emptyList();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Auth_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Auth getDefaultInstanceForType() {
                return Auth.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Auth build() {
                Auth authBuildPartial = buildPartial();
                if (authBuildPartial.isInitialized()) {
                    return authBuildPartial;
                }
                throw newUninitializedMessageException((Message) authBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Auth buildPartial() {
                Auth auth = new Auth(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(auth);
                }
                onBuilt();
                return auth;
            }

            private void buildPartial0(Auth auth) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    auth.principal_ = this.principal_;
                }
                if ((i2 & 2) != 0) {
                    this.audiences_.makeImmutable();
                    auth.audiences_ = this.audiences_;
                }
                if ((i2 & 4) != 0) {
                    auth.presenter_ = this.presenter_;
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                    auth.claims_ = singleFieldBuilderV3 == null ? this.claims_ : (Struct) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 16) != 0) {
                    this.accessLevels_.makeImmutable();
                    auth.accessLevels_ = this.accessLevels_;
                }
                Auth.access$3276(auth, i);
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
                if (message instanceof Auth) {
                    return mergeFrom((Auth) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Auth auth) {
                if (auth == Auth.getDefaultInstance()) {
                    return this;
                }
                if (!auth.getPrincipal().isEmpty()) {
                    this.principal_ = auth.principal_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!auth.audiences_.isEmpty()) {
                    if (this.audiences_.isEmpty()) {
                        this.audiences_ = auth.audiences_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureAudiencesIsMutable();
                        this.audiences_.addAll(auth.audiences_);
                    }
                    onChanged();
                }
                if (!auth.getPresenter().isEmpty()) {
                    this.presenter_ = auth.presenter_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (auth.hasClaims()) {
                    mergeClaims(auth.getClaims());
                }
                if (!auth.accessLevels_.isEmpty()) {
                    if (this.accessLevels_.isEmpty()) {
                        this.accessLevels_ = auth.accessLevels_;
                        this.bitField0_ |= 16;
                    } else {
                        ensureAccessLevelsIsMutable();
                        this.accessLevels_.addAll(auth.accessLevels_);
                    }
                    onChanged();
                }
                mergeUnknownFields(auth.getUnknownFields());
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
                                    this.principal_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    ensureAudiencesIsMutable();
                                    this.audiences_.add((Object) stringRequireUtf8);
                                } else if (tag == 26) {
                                    this.presenter_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getClaimsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    String stringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                    ensureAccessLevelsIsMutable();
                                    this.accessLevels_.add((Object) stringRequireUtf82);
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

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPrincipal() {
                Object obj = this.principal_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.principal_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPrincipalBytes() {
                Object obj = this.principal_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.principal_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setPrincipal(String str) {
                str.getClass();
                this.principal_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearPrincipal() {
                this.principal_ = Auth.getDefaultInstance().getPrincipal();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) {
                byteString.getClass();
                Auth.checkByteStringIsUtf8(byteString);
                this.principal_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private void ensureAudiencesIsMutable() {
                if (!this.audiences_.isModifiable()) {
                    this.audiences_ = new LazyStringArrayList((LazyStringList) this.audiences_);
                }
                this.bitField0_ |= 2;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ProtocolStringList getAudiencesList() {
                this.audiences_.makeImmutable();
                return this.audiences_;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAudiencesCount() {
                return this.audiences_.size();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAudiences(int i) {
                return this.audiences_.get(i);
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAudiencesBytes(int i) {
                return this.audiences_.getByteString(i);
            }

            public Builder setAudiences(int i, String str) {
                str.getClass();
                ensureAudiencesIsMutable();
                this.audiences_.set(i, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addAudiences(String str) {
                str.getClass();
                ensureAudiencesIsMutable();
                this.audiences_.add((Object) str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addAllAudiences(Iterable<String> iterable) {
                ensureAudiencesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.audiences_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearAudiences() {
                this.audiences_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addAudiencesBytes(ByteString byteString) {
                byteString.getClass();
                Auth.checkByteStringIsUtf8(byteString);
                ensureAudiencesIsMutable();
                this.audiences_.add(byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPresenter() {
                Object obj = this.presenter_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.presenter_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPresenterBytes() {
                Object obj = this.presenter_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.presenter_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setPresenter(String str) {
                str.getClass();
                this.presenter_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearPresenter() {
                this.presenter_ = Auth.getDefaultInstance().getPresenter();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder setPresenterBytes(ByteString byteString) {
                byteString.getClass();
                Auth.checkByteStringIsUtf8(byteString);
                this.presenter_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public boolean hasClaims() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public Struct getClaims() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct = this.claims_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }
                return (Struct) singleFieldBuilderV3.getMessage();
            }

            public Builder setClaims(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    struct.getClass();
                    this.claims_ = struct;
                } else {
                    singleFieldBuilderV3.setMessage(struct);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setClaims(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.claims_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeClaims(Struct struct) {
                Struct struct2;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0 && (struct2 = this.claims_) != null && struct2 != Struct.getDefaultInstance()) {
                        getClaimsBuilder().mergeFrom(struct);
                    } else {
                        this.claims_ = struct;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                if (this.claims_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder clearClaims() {
                this.bitField0_ &= -9;
                this.claims_ = null;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.claimsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Struct.Builder getClaimsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Struct.Builder) getClaimsFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public StructOrBuilder getClaimsOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.claimsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StructOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.claims_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getClaimsFieldBuilder() {
                if (this.claimsBuilder_ == null) {
                    this.claimsBuilder_ = new SingleFieldBuilderV3<>(getClaims(), getParentForChildren(), isClean());
                    this.claims_ = null;
                }
                return this.claimsBuilder_;
            }

            private void ensureAccessLevelsIsMutable() {
                if (!this.accessLevels_.isModifiable()) {
                    this.accessLevels_ = new LazyStringArrayList((LazyStringList) this.accessLevels_);
                }
                this.bitField0_ |= 16;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ProtocolStringList getAccessLevelsList() {
                this.accessLevels_.makeImmutable();
                return this.accessLevels_;
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAccessLevelsCount() {
                return this.accessLevels_.size();
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAccessLevels(int i) {
                return this.accessLevels_.get(i);
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAccessLevelsBytes(int i) {
                return this.accessLevels_.getByteString(i);
            }

            public Builder setAccessLevels(int i, String str) {
                str.getClass();
                ensureAccessLevelsIsMutable();
                this.accessLevels_.set(i, str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder addAccessLevels(String str) {
                str.getClass();
                ensureAccessLevelsIsMutable();
                this.accessLevels_.add((Object) str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder addAllAccessLevels(Iterable<String> iterable) {
                ensureAccessLevelsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.accessLevels_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearAccessLevels() {
                this.accessLevels_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder addAccessLevelsBytes(ByteString byteString) {
                byteString.getClass();
                Auth.checkByteStringIsUtf8(byteString);
                ensureAccessLevelsIsMutable();
                this.accessLevels_.add(byteString);
                this.bitField0_ |= 16;
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

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Auth> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Auth> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Auth getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Request extends GeneratedMessageV3 implements RequestOrBuilder {
        public static final int AUTH_FIELD_NUMBER = 13;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private Auth auth_;
        private int bitField0_;
        private MapField<String, String> headers_;
        private volatile Object host_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object method_;
        private volatile Object path_;
        private volatile Object protocol_;
        private volatile Object query_;
        private volatile Object reason_;
        private volatile Object scheme_;
        private long size_;
        private Timestamp time_;
        private static final Request DEFAULT_INSTANCE = new Request();
        private static final Parser<Request> PARSER = new AbstractParser<Request>() { // from class: com.google.rpc.context.AttributeContext.Request.1
            @Override // com.google.protobuf.Parser
            public Request parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Request.newBuilder();
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

        static /* synthetic */ int access$5376(Request request, int i) {
            int i2 = i | request.bitField0_;
            request.bitField0_ = i2;
            return i2;
        }

        private Request(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.method_ = "";
            this.path_ = "";
            this.host_ = "";
            this.scheme_ = "";
            this.query_ = "";
            this.size_ = 0L;
            this.protocol_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private Request() {
            this.id_ = "";
            this.method_ = "";
            this.path_ = "";
            this.host_ = "";
            this.scheme_ = "";
            this.query_ = "";
            this.size_ = 0L;
            this.protocol_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.method_ = "";
            this.path_ = "";
            this.host_ = "";
            this.scheme_ = "";
            this.query_ = "";
            this.protocol_ = "";
            this.reason_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Request();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 3) {
                return internalGetHeaders();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getMethod() {
            Object obj = this.method_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.method_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getMethodBytes() {
            Object obj = this.method_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.method_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        private static final class HeadersDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_HeadersEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private HeadersDefaultEntryHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetHeaders() {
            MapField<String, String> mapField = this.headers_;
            return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public int getHeadersCount() {
            return internalGetHeaders().getMap().size();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean containsHeaders(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetHeaders().getMap().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Map<String, String> getHeadersMap() {
            return internalGetHeaders().getMap();
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getPath() {
            Object obj = this.path_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.path_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getPathBytes() {
            Object obj = this.path_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.path_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHost() {
            Object obj = this.host_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.host_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getHostBytes() {
            Object obj = this.host_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.host_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getScheme() {
            Object obj = this.scheme_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.scheme_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getSchemeBytes() {
            Object obj = this.scheme_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.scheme_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getQuery() {
            Object obj = this.query_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.query_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getQueryBytes() {
            Object obj = this.query_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.query_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public TimestampOrBuilder getTimeOrBuilder() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public long getSize() {
            return this.size_;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getProtocol() {
            Object obj = this.protocol_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.protocol_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getProtocolBytes() {
            Object obj = this.protocol_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.protocol_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getReason() {
            Object obj = this.reason_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.reason_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getReasonBytes() {
            Object obj = this.reason_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.reason_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasAuth() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Auth getAuth() {
            Auth auth = this.auth_;
            return auth == null ? Auth.getDefaultInstance() : auth;
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public AuthOrBuilder getAuthOrBuilder() {
            Auth auth = this.auth_;
            return auth == null ? Auth.getDefaultInstance() : auth;
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
            if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.method_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.method_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetHeaders(), HeadersDefaultEntryHolder.defaultEntry, 3);
            if (!GeneratedMessageV3.isStringEmpty(this.path_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.path_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.host_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.scheme_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.scheme_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.query_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.query_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(9, getTime());
            }
            long j = this.size_;
            if (j != 0) {
                codedOutputStream.writeInt64(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.protocol_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.protocol_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.reason_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(13, getAuth());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.id_) ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.method_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.method_);
            }
            for (Map.Entry<String, String> entry : internalGetHeaders().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, HeadersDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.path_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.path_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.host_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.scheme_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.scheme_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.query_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.query_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, getTime());
            }
            long j = this.size_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(10, j);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.protocol_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.protocol_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.reason_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(13, getAuth());
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
            if (!(obj instanceof Request)) {
                return super.equals(obj);
            }
            Request request = (Request) obj;
            if (!getId().equals(request.getId()) || !getMethod().equals(request.getMethod()) || !internalGetHeaders().equals(request.internalGetHeaders()) || !getPath().equals(request.getPath()) || !getHost().equals(request.getHost()) || !getScheme().equals(request.getScheme()) || !getQuery().equals(request.getQuery()) || hasTime() != request.hasTime()) {
                return false;
            }
            if ((!hasTime() || getTime().equals(request.getTime())) && getSize() == request.getSize() && getProtocol().equals(request.getProtocol()) && getReason().equals(request.getReason()) && hasAuth() == request.hasAuth()) {
                return (!hasAuth() || getAuth().equals(request.getAuth())) && getUnknownFields().equals(request.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getMethod().hashCode();
            if (!internalGetHeaders().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetHeaders().hashCode();
            }
            int iHashCode2 = (((((((((((((((iHashCode * 37) + 4) * 53) + getPath().hashCode()) * 37) + 5) * 53) + getHost().hashCode()) * 37) + 6) * 53) + getScheme().hashCode()) * 37) + 7) * 53) + getQuery().hashCode();
            if (hasTime()) {
                iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + getTime().hashCode();
            }
            int iHashLong = (((((((((((iHashCode2 * 37) + 10) * 53) + Internal.hashLong(getSize())) * 37) + 11) * 53) + getProtocol().hashCode()) * 37) + 12) * 53) + getReason().hashCode();
            if (hasAuth()) {
                iHashLong = (((iHashLong * 37) + 13) * 53) + getAuth().hashCode();
            }
            int iHashCode3 = (iHashLong * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Request request) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestOrBuilder {
            private SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> authBuilder_;
            private Auth auth_;
            private int bitField0_;
            private MapField<String, String> headers_;
            private Object host_;
            private Object id_;
            private Object method_;
            private Object path_;
            private Object protocol_;
            private Object query_;
            private Object reason_;
            private Object scheme_;
            private long size_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> timeBuilder_;
            private Timestamp time_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
                if (i == 3) {
                    return internalGetHeaders();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
                if (i == 3) {
                    return internalGetMutableHeaders();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.method_ = "";
                this.path_ = "";
                this.host_ = "";
                this.scheme_ = "";
                this.query_ = "";
                this.protocol_ = "";
                this.reason_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.method_ = "";
                this.path_ = "";
                this.host_ = "";
                this.scheme_ = "";
                this.query_ = "";
                this.protocol_ = "";
                this.reason_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Request.alwaysUseFieldBuilders) {
                    getTimeFieldBuilder();
                    getAuthFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.method_ = "";
                internalGetMutableHeaders().clear();
                this.path_ = "";
                this.host_ = "";
                this.scheme_ = "";
                this.query_ = "";
                this.time_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeBuilder_ = null;
                }
                this.size_ = 0L;
                this.protocol_ = "";
                this.reason_ = "";
                this.auth_ = null;
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV32 = this.authBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.authBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Request_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Request getDefaultInstanceForType() {
                return Request.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Request build() {
                Request requestBuildPartial = buildPartial();
                if (requestBuildPartial.isInitialized()) {
                    return requestBuildPartial;
                }
                throw newUninitializedMessageException((Message) requestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Request buildPartial() {
                Request request = new Request(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(request);
                }
                onBuilt();
                return request;
            }

            private void buildPartial0(Request request) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    request.id_ = this.id_;
                }
                if ((i2 & 2) != 0) {
                    request.method_ = this.method_;
                }
                if ((i2 & 4) != 0) {
                    request.headers_ = internalGetHeaders();
                    request.headers_.makeImmutable();
                }
                if ((i2 & 8) != 0) {
                    request.path_ = this.path_;
                }
                if ((i2 & 16) != 0) {
                    request.host_ = this.host_;
                }
                if ((i2 & 32) != 0) {
                    request.scheme_ = this.scheme_;
                }
                if ((i2 & 64) != 0) {
                    request.query_ = this.query_;
                }
                if ((i2 & 128) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    request.time_ = singleFieldBuilderV3 == null ? this.time_ : (Timestamp) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 256) != 0) {
                    request.size_ = this.size_;
                }
                if ((i2 & 512) != 0) {
                    request.protocol_ = this.protocol_;
                }
                if ((i2 & 1024) != 0) {
                    request.reason_ = this.reason_;
                }
                if ((i2 & 2048) != 0) {
                    SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV32 = this.authBuilder_;
                    request.auth_ = singleFieldBuilderV32 == null ? this.auth_ : (Auth) singleFieldBuilderV32.build();
                    i |= 2;
                }
                Request.access$5376(request, i);
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
                if (message instanceof Request) {
                    return mergeFrom((Request) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Request request) {
                if (request == Request.getDefaultInstance()) {
                    return this;
                }
                if (!request.getId().isEmpty()) {
                    this.id_ = request.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!request.getMethod().isEmpty()) {
                    this.method_ = request.method_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                internalGetMutableHeaders().mergeFrom(request.internalGetHeaders());
                this.bitField0_ |= 4;
                if (!request.getPath().isEmpty()) {
                    this.path_ = request.path_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!request.getHost().isEmpty()) {
                    this.host_ = request.host_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (!request.getScheme().isEmpty()) {
                    this.scheme_ = request.scheme_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (!request.getQuery().isEmpty()) {
                    this.query_ = request.query_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (request.hasTime()) {
                    mergeTime(request.getTime());
                }
                if (request.getSize() != 0) {
                    setSize(request.getSize());
                }
                if (!request.getProtocol().isEmpty()) {
                    this.protocol_ = request.protocol_;
                    this.bitField0_ |= 512;
                    onChanged();
                }
                if (!request.getReason().isEmpty()) {
                    this.reason_ = request.reason_;
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                if (request.hasAuth()) {
                    mergeAuth(request.getAuth());
                }
                mergeUnknownFields(request.getUnknownFields());
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
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.method_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableHeaders().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.path_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.host_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 50:
                                    this.scheme_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.query_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(getTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    break;
                                case GrpcUtil.DEFAULT_PORT_PLAINTEXT /* 80 */:
                                    this.size_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 256;
                                    break;
                                case 90:
                                    this.protocol_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 512;
                                    break;
                                case 98:
                                    this.reason_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1024;
                                    break;
                                case Publishing.DOC_TAG_PREFIX_FIELD_NUMBER /* 106 */:
                                    codedInputStream.readMessage(getAuthFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
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

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Request.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getMethod() {
                Object obj = this.method_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.method_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getMethodBytes() {
                Object obj = this.method_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.method_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setMethod(String str) {
                str.getClass();
                this.method_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearMethod() {
                this.method_ = Request.getDefaultInstance().getMethod();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setMethodBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.method_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private MapField<String, String> internalGetHeaders() {
                MapField<String, String> mapField = this.headers_;
                return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableHeaders() {
                if (this.headers_ == null) {
                    this.headers_ = MapField.newMapField(HeadersDefaultEntryHolder.defaultEntry);
                }
                if (!this.headers_.isMutable()) {
                    this.headers_ = this.headers_.copy();
                }
                this.bitField0_ |= 4;
                onChanged();
                return this.headers_;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public int getHeadersCount() {
                return internalGetHeaders().getMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean containsHeaders(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                return internalGetHeaders().getMap().containsKey(str);
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Map<String, String> getHeadersMap() {
                return internalGetHeaders().getMap();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return map.get(str);
            }

            public Builder clearHeaders() {
                this.bitField0_ &= -5;
                internalGetMutableHeaders().getMutableMap().clear();
                return this;
            }

            public Builder removeHeaders(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableHeaders().getMutableMap().remove(str);
                return this;
            }

            @Deprecated
            public Map<String, String> getMutableHeaders() {
                this.bitField0_ |= 4;
                return internalGetMutableHeaders().getMutableMap();
            }

            public Builder putHeaders(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableHeaders().getMutableMap().put(str, str2);
                this.bitField0_ |= 4;
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                internalGetMutableHeaders().getMutableMap().putAll(map);
                this.bitField0_ |= 4;
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getPath() {
                Object obj = this.path_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.path_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getPathBytes() {
                Object obj = this.path_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.path_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setPath(String str) {
                str.getClass();
                this.path_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearPath() {
                this.path_ = Request.getDefaultInstance().getPath();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.path_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHost() {
                Object obj = this.host_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.host_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getHostBytes() {
                Object obj = this.host_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.host_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setHost(String str) {
                str.getClass();
                this.host_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearHost() {
                this.host_ = Request.getDefaultInstance().getHost();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder setHostBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.host_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getScheme() {
                Object obj = this.scheme_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.scheme_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getSchemeBytes() {
                Object obj = this.scheme_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.scheme_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setScheme(String str) {
                str.getClass();
                this.scheme_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder clearScheme() {
                this.scheme_ = Request.getDefaultInstance().getScheme();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder setSchemeBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.scheme_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getQuery() {
                Object obj = this.query_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.query_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getQueryBytes() {
                Object obj = this.query_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.query_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setQuery(String str) {
                str.getClass();
                this.query_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder clearQuery() {
                this.query_ = Request.getDefaultInstance().getQuery();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder setQueryBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.query_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Timestamp getTime() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.time_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setTime(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.time_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.time_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder mergeTime(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 128) != 0 && (timestamp2 = this.time_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getTimeBuilder().mergeFrom(timestamp);
                    } else {
                        this.time_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.time_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= -129;
                this.time_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getTimeBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (Timestamp.Builder) getTimeFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public TimestampOrBuilder getTimeOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.time_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getTimeFieldBuilder() {
                if (this.timeBuilder_ == null) {
                    this.timeBuilder_ = new SingleFieldBuilderV3<>(getTime(), getParentForChildren(), isClean());
                    this.time_ = null;
                }
                return this.timeBuilder_;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public long getSize() {
                return this.size_;
            }

            public Builder setSize(long j) {
                this.size_ = j;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -257;
                this.size_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getProtocol() {
                Object obj = this.protocol_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.protocol_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getProtocolBytes() {
                Object obj = this.protocol_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.protocol_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setProtocol(String str) {
                str.getClass();
                this.protocol_ = str;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder clearProtocol() {
                this.protocol_ = Request.getDefaultInstance().getProtocol();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.protocol_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getReason() {
                Object obj = this.reason_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.reason_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getReasonBytes() {
                Object obj = this.reason_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.reason_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setReason(String str) {
                str.getClass();
                this.reason_ = str;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder clearReason() {
                this.reason_ = Request.getDefaultInstance().getReason();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                byteString.getClass();
                Request.checkByteStringIsUtf8(byteString);
                this.reason_ = byteString;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasAuth() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Auth getAuth() {
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Auth auth = this.auth_;
                    return auth == null ? Auth.getDefaultInstance() : auth;
                }
                return (Auth) singleFieldBuilderV3.getMessage();
            }

            public Builder setAuth(Auth auth) {
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 == null) {
                    auth.getClass();
                    this.auth_ = auth;
                } else {
                    singleFieldBuilderV3.setMessage(auth);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setAuth(Auth.Builder builder) {
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.auth_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder mergeAuth(Auth auth) {
                Auth auth2;
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2048) != 0 && (auth2 = this.auth_) != null && auth2 != Auth.getDefaultInstance()) {
                        getAuthBuilder().mergeFrom(auth);
                    } else {
                        this.auth_ = auth;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(auth);
                }
                if (this.auth_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder clearAuth() {
                this.bitField0_ &= -2049;
                this.auth_ = null;
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.authBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Auth.Builder getAuthBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (Auth.Builder) getAuthFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public AuthOrBuilder getAuthOrBuilder() {
                SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> singleFieldBuilderV3 = this.authBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AuthOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth auth = this.auth_;
                return auth == null ? Auth.getDefaultInstance() : auth;
            }

            private SingleFieldBuilderV3<Auth, Auth.Builder, AuthOrBuilder> getAuthFieldBuilder() {
                if (this.authBuilder_ == null) {
                    this.authBuilder_ = new SingleFieldBuilderV3<>(getAuth(), getParentForChildren(), isClean());
                    this.auth_ = null;
                }
                return this.authBuilder_;
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

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Request> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Request> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Request getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Response extends GeneratedMessageV3 implements ResponseOrBuilder {
        public static final int BACKEND_LATENCY_FIELD_NUMBER = 5;
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private Duration backendLatency_;
        private int bitField0_;
        private long code_;
        private MapField<String, String> headers_;
        private byte memoizedIsInitialized;
        private long size_;
        private Timestamp time_;
        private static final Response DEFAULT_INSTANCE = new Response();
        private static final Parser<Response> PARSER = new AbstractParser<Response>() { // from class: com.google.rpc.context.AttributeContext.Response.1
            @Override // com.google.protobuf.Parser
            public Response parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Response.newBuilder();
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

        static /* synthetic */ int access$7276(Response response, int i) {
            int i2 = i | response.bitField0_;
            response.bitField0_ = i2;
            return i2;
        }

        private Response(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.code_ = 0L;
            this.size_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Response() {
            this.code_ = 0L;
            this.size_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Response();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 3) {
                return internalGetHeaders();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getCode() {
            return this.code_;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getSize() {
            return this.size_;
        }

        private static final class HeadersDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_HeadersEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private HeadersDefaultEntryHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetHeaders() {
            MapField<String, String> mapField = this.headers_;
            return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public int getHeadersCount() {
            return internalGetHeaders().getMap().size();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean containsHeaders(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetHeaders().getMap().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Map<String, String> getHeadersMap() {
            return internalGetHeaders().getMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public TimestampOrBuilder getTimeOrBuilder() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean hasBackendLatency() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Duration getBackendLatency() {
            Duration duration = this.backendLatency_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public DurationOrBuilder getBackendLatencyOrBuilder() {
            Duration duration = this.backendLatency_;
            return duration == null ? Duration.getDefaultInstance() : duration;
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
            long j = this.code_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            long j2 = this.size_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetHeaders(), HeadersDefaultEntryHolder.defaultEntry, 3);
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(4, getTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(5, getBackendLatency());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.code_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.size_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            for (Map.Entry<String, String> entry : internalGetHeaders().getMap().entrySet()) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(3, HeadersDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(4, getTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(5, getBackendLatency());
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return super.equals(obj);
            }
            Response response = (Response) obj;
            if (getCode() != response.getCode() || getSize() != response.getSize() || !internalGetHeaders().equals(response.internalGetHeaders()) || hasTime() != response.hasTime()) {
                return false;
            }
            if ((!hasTime() || getTime().equals(response.getTime())) && hasBackendLatency() == response.hasBackendLatency()) {
                return (!hasBackendLatency() || getBackendLatency().equals(response.getBackendLatency())) && getUnknownFields().equals(response.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getCode())) * 37) + 2) * 53) + Internal.hashLong(getSize());
            if (!internalGetHeaders().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetHeaders().hashCode();
            }
            if (hasTime()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getTime().hashCode();
            }
            if (hasBackendLatency()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getBackendLatency().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Response response) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResponseOrBuilder {
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> backendLatencyBuilder_;
            private Duration backendLatency_;
            private int bitField0_;
            private long code_;
            private MapField<String, String> headers_;
            private long size_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> timeBuilder_;
            private Timestamp time_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
                if (i == 3) {
                    return internalGetHeaders();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
                if (i == 3) {
                    return internalGetMutableHeaders();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Response.alwaysUseFieldBuilders) {
                    getTimeFieldBuilder();
                    getBackendLatencyFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0L;
                this.size_ = 0L;
                internalGetMutableHeaders().clear();
                this.time_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeBuilder_ = null;
                }
                this.backendLatency_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.backendLatencyBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Response_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Response getDefaultInstanceForType() {
                return Response.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Response build() {
                Response responseBuildPartial = buildPartial();
                if (responseBuildPartial.isInitialized()) {
                    return responseBuildPartial;
                }
                throw newUninitializedMessageException((Message) responseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Response buildPartial() {
                Response response = new Response(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(response);
                }
                onBuilt();
                return response;
            }

            private void buildPartial0(Response response) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    response.code_ = this.code_;
                }
                if ((i2 & 2) != 0) {
                    response.size_ = this.size_;
                }
                if ((i2 & 4) != 0) {
                    response.headers_ = internalGetHeaders();
                    response.headers_.makeImmutable();
                }
                if ((i2 & 8) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                    response.time_ = singleFieldBuilderV3 == null ? this.time_ : (Timestamp) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 16) != 0) {
                    SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.backendLatencyBuilder_;
                    response.backendLatency_ = singleFieldBuilderV32 == null ? this.backendLatency_ : (Duration) singleFieldBuilderV32.build();
                    i |= 2;
                }
                Response.access$7276(response, i);
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
                if (message instanceof Response) {
                    return mergeFrom((Response) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Response response) {
                if (response == Response.getDefaultInstance()) {
                    return this;
                }
                if (response.getCode() != 0) {
                    setCode(response.getCode());
                }
                if (response.getSize() != 0) {
                    setSize(response.getSize());
                }
                internalGetMutableHeaders().mergeFrom(response.internalGetHeaders());
                this.bitField0_ |= 4;
                if (response.hasTime()) {
                    mergeTime(response.getTime());
                }
                if (response.hasBackendLatency()) {
                    mergeBackendLatency(response.getBackendLatency());
                }
                mergeUnknownFields(response.getUnknownFields());
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
                                if (tag == 8) {
                                    this.code_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.size_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableHeaders().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getBackendLatencyFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
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

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getCode() {
                return this.code_;
            }

            public Builder setCode(long j) {
                this.code_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getSize() {
                return this.size_;
            }

            public Builder setSize(long j) {
                this.size_ = j;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0L;
                onChanged();
                return this;
            }

            private MapField<String, String> internalGetHeaders() {
                MapField<String, String> mapField = this.headers_;
                return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableHeaders() {
                if (this.headers_ == null) {
                    this.headers_ = MapField.newMapField(HeadersDefaultEntryHolder.defaultEntry);
                }
                if (!this.headers_.isMutable()) {
                    this.headers_ = this.headers_.copy();
                }
                this.bitField0_ |= 4;
                onChanged();
                return this.headers_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public int getHeadersCount() {
                return internalGetHeaders().getMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean containsHeaders(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                return internalGetHeaders().getMap().containsKey(str);
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Map<String, String> getHeadersMap() {
                return internalGetHeaders().getMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return map.get(str);
            }

            public Builder clearHeaders() {
                this.bitField0_ &= -5;
                internalGetMutableHeaders().getMutableMap().clear();
                return this;
            }

            public Builder removeHeaders(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableHeaders().getMutableMap().remove(str);
                return this;
            }

            @Deprecated
            public Map<String, String> getMutableHeaders() {
                this.bitField0_ |= 4;
                return internalGetMutableHeaders().getMutableMap();
            }

            public Builder putHeaders(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableHeaders().getMutableMap().put(str, str2);
                this.bitField0_ |= 4;
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                internalGetMutableHeaders().getMutableMap().putAll(map);
                this.bitField0_ |= 4;
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean hasTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Timestamp getTime() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.time_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setTime(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.time_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.time_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeTime(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0 && (timestamp2 = this.time_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getTimeBuilder().mergeFrom(timestamp);
                    } else {
                        this.time_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.time_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= -9;
                this.time_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.timeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getTimeBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Timestamp.Builder) getTimeFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public TimestampOrBuilder getTimeOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.timeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.time_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getTimeFieldBuilder() {
                if (this.timeBuilder_ == null) {
                    this.timeBuilder_ = new SingleFieldBuilderV3<>(getTime(), getParentForChildren(), isClean());
                    this.time_ = null;
                }
                return this.timeBuilder_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean hasBackendLatency() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Duration getBackendLatency() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.backendLatency_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return (Duration) singleFieldBuilderV3.getMessage();
            }

            public Builder setBackendLatency(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.backendLatency_ = duration;
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBackendLatency(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.backendLatency_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeBackendLatency(Duration duration) {
                Duration duration2;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0 && (duration2 = this.backendLatency_) != null && duration2 != Duration.getDefaultInstance()) {
                        getBackendLatencyBuilder().mergeFrom(duration);
                    } else {
                        this.backendLatency_ = duration;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                if (this.backendLatency_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder clearBackendLatency() {
                this.bitField0_ &= -17;
                this.backendLatency_ = null;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.backendLatencyBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Duration.Builder getBackendLatencyBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Duration.Builder) getBackendLatencyFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public DurationOrBuilder getBackendLatencyOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.backendLatencyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.backendLatency_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getBackendLatencyFieldBuilder() {
                if (this.backendLatencyBuilder_ == null) {
                    this.backendLatencyBuilder_ = new SingleFieldBuilderV3<>(getBackendLatency(), getParentForChildren(), isClean());
                    this.backendLatency_ = null;
                }
                return this.backendLatencyBuilder_;
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

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Response> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Response> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Response getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Resource extends GeneratedMessageV3 implements ResourceOrBuilder {
        public static final int ANNOTATIONS_FIELD_NUMBER = 6;
        public static final int CREATE_TIME_FIELD_NUMBER = 8;
        public static final int DELETE_TIME_FIELD_NUMBER = 10;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
        public static final int ETAG_FIELD_NUMBER = 11;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int LOCATION_FIELD_NUMBER = 12;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int UID_FIELD_NUMBER = 5;
        public static final int UPDATE_TIME_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private MapField<String, String> annotations_;
        private int bitField0_;
        private Timestamp createTime_;
        private Timestamp deleteTime_;
        private volatile Object displayName_;
        private volatile Object etag_;
        private MapField<String, String> labels_;
        private volatile Object location_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object service_;
        private volatile Object type_;
        private volatile Object uid_;
        private Timestamp updateTime_;
        private static final Resource DEFAULT_INSTANCE = new Resource();
        private static final Parser<Resource> PARSER = new AbstractParser<Resource>() { // from class: com.google.rpc.context.AttributeContext.Resource.1
            @Override // com.google.protobuf.Parser
            public Resource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Resource.newBuilder();
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

        static /* synthetic */ int access$9076(Resource resource, int i) {
            int i2 = i | resource.bitField0_;
            resource.bitField0_ = i2;
            return i2;
        }

        private Resource(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.service_ = "";
            this.name_ = "";
            this.type_ = "";
            this.uid_ = "";
            this.displayName_ = "";
            this.etag_ = "";
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private Resource() {
            this.service_ = "";
            this.name_ = "";
            this.type_ = "";
            this.uid_ = "";
            this.displayName_ = "";
            this.etag_ = "";
            this.location_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.service_ = "";
            this.name_ = "";
            this.type_ = "";
            this.uid_ = "";
            this.displayName_ = "";
            this.etag_ = "";
            this.location_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Resource();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 4) {
                return internalGetLabels();
            }
            if (i == 6) {
                return internalGetAnnotations();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_fieldAccessorTable.ensureFieldAccessorsInitialized(Resource.class, Builder.class);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getService() {
            Object obj = this.service_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.service_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getServiceBytes() {
            Object obj = this.service_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.service_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        private static final class LabelsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_LabelsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private LabelsDefaultEntryHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetLabels() {
            MapField<String, String> mapField = this.labels_;
            return mapField == null ? MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry) : mapField;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public int getLabelsCount() {
            return internalGetLabels().getMap().size();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean containsLabels(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetLabels().getMap().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Map<String, String> getLabelsMap() {
            return internalGetLabels().getMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetLabels().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetLabels().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getUid() {
            Object obj = this.uid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.uid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getUidBytes() {
            Object obj = this.uid_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.uid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        private static final class AnnotationsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_AnnotationsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private AnnotationsDefaultEntryHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetAnnotations() {
            MapField<String, String> mapField = this.annotations_;
            return mapField == null ? MapField.emptyMapField(AnnotationsDefaultEntryHolder.defaultEntry) : mapField;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public int getAnnotationsCount() {
            return internalGetAnnotations().getMap().size();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean containsAnnotations(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            return internalGetAnnotations().getMap().containsKey(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        @Deprecated
        public Map<String, String> getAnnotations() {
            return getAnnotationsMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Map<String, String> getAnnotationsMap() {
            return internalGetAnnotations().getMap();
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getAnnotationsOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetAnnotations().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getAnnotationsOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetAnnotations().getMap();
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return map.get(str);
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getDisplayName() {
            Object obj = this.displayName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.displayName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getDisplayNameBytes() {
            Object obj = this.displayName_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.displayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean hasCreateTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Timestamp getCreateTime() {
            Timestamp timestamp = this.createTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public TimestampOrBuilder getCreateTimeOrBuilder() {
            Timestamp timestamp = this.createTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean hasUpdateTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Timestamp getUpdateTime() {
            Timestamp timestamp = this.updateTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public TimestampOrBuilder getUpdateTimeOrBuilder() {
            Timestamp timestamp = this.updateTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean hasDeleteTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Timestamp getDeleteTime() {
            Timestamp timestamp = this.deleteTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public TimestampOrBuilder getDeleteTimeOrBuilder() {
            Timestamp timestamp = this.deleteTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getEtag() {
            Object obj = this.etag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.etag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getEtagBytes() {
            Object obj = this.etag_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.etag_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.location_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getLocationBytes() {
            Object obj = this.location_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.service_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.service_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.type_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 4);
            if (!GeneratedMessageV3.isStringEmpty(this.uid_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.uid_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetAnnotations(), AnnotationsDefaultEntryHolder.defaultEntry, 6);
            if (!GeneratedMessageV3.isStringEmpty(this.displayName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.displayName_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(8, getCreateTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(9, getUpdateTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(10, getDeleteTime());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.etag_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.etag_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.location_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.location_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.service_) ? GeneratedMessageV3.computeStringSize(1, this.service_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.type_);
            }
            for (Map.Entry<String, String> entry : internalGetLabels().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, LabelsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.uid_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.uid_);
            }
            for (Map.Entry<String, String> entry2 : internalGetAnnotations().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, AnnotationsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.displayName_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.displayName_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, getCreateTime());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, getUpdateTime());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(10, getDeleteTime());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.etag_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.etag_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.location_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.location_);
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
            if (!(obj instanceof Resource)) {
                return super.equals(obj);
            }
            Resource resource = (Resource) obj;
            if (!getService().equals(resource.getService()) || !getName().equals(resource.getName()) || !getType().equals(resource.getType()) || !internalGetLabels().equals(resource.internalGetLabels()) || !getUid().equals(resource.getUid()) || !internalGetAnnotations().equals(resource.internalGetAnnotations()) || !getDisplayName().equals(resource.getDisplayName()) || hasCreateTime() != resource.hasCreateTime()) {
                return false;
            }
            if ((hasCreateTime() && !getCreateTime().equals(resource.getCreateTime())) || hasUpdateTime() != resource.hasUpdateTime()) {
                return false;
            }
            if ((!hasUpdateTime() || getUpdateTime().equals(resource.getUpdateTime())) && hasDeleteTime() == resource.hasDeleteTime()) {
                return (!hasDeleteTime() || getDeleteTime().equals(resource.getDeleteTime())) && getEtag().equals(resource.getEtag()) && getLocation().equals(resource.getLocation()) && getUnknownFields().equals(resource.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getService().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getType().hashCode();
            if (!internalGetLabels().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + internalGetLabels().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 5) * 53) + getUid().hashCode();
            if (!internalGetAnnotations().getMap().isEmpty()) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + internalGetAnnotations().hashCode();
            }
            int iHashCode3 = (((iHashCode2 * 37) + 7) * 53) + getDisplayName().hashCode();
            if (hasCreateTime()) {
                iHashCode3 = (((iHashCode3 * 37) + 8) * 53) + getCreateTime().hashCode();
            }
            if (hasUpdateTime()) {
                iHashCode3 = (((iHashCode3 * 37) + 9) * 53) + getUpdateTime().hashCode();
            }
            if (hasDeleteTime()) {
                iHashCode3 = (((iHashCode3 * 37) + 10) * 53) + getDeleteTime().hashCode();
            }
            int iHashCode4 = (((((((((iHashCode3 * 37) + 11) * 53) + getEtag().hashCode()) * 37) + 12) * 53) + getLocation().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Resource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Resource) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Resource resource) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resource);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResourceOrBuilder {
            private MapField<String, String> annotations_;
            private int bitField0_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> createTimeBuilder_;
            private Timestamp createTime_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> deleteTimeBuilder_;
            private Timestamp deleteTime_;
            private Object displayName_;
            private Object etag_;
            private MapField<String, String> labels_;
            private Object location_;
            private Object name_;
            private Object service_;
            private Object type_;
            private Object uid_;
            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> updateTimeBuilder_;
            private Timestamp updateTime_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
                if (i == 4) {
                    return internalGetLabels();
                }
                if (i == 6) {
                    return internalGetAnnotations();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
                if (i == 4) {
                    return internalGetMutableLabels();
                }
                if (i == 6) {
                    return internalGetMutableAnnotations();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_fieldAccessorTable.ensureFieldAccessorsInitialized(Resource.class, Builder.class);
            }

            private Builder() {
                this.service_ = "";
                this.name_ = "";
                this.type_ = "";
                this.uid_ = "";
                this.displayName_ = "";
                this.etag_ = "";
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.service_ = "";
                this.name_ = "";
                this.type_ = "";
                this.uid_ = "";
                this.displayName_ = "";
                this.etag_ = "";
                this.location_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Resource.alwaysUseFieldBuilders) {
                    getCreateTimeFieldBuilder();
                    getUpdateTimeFieldBuilder();
                    getDeleteTimeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.service_ = "";
                this.name_ = "";
                this.type_ = "";
                internalGetMutableLabels().clear();
                this.uid_ = "";
                internalGetMutableAnnotations().clear();
                this.displayName_ = "";
                this.createTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.createTimeBuilder_ = null;
                }
                this.updateTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV32 = this.updateTimeBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.updateTimeBuilder_ = null;
                }
                this.deleteTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV33 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV33 != null) {
                    singleFieldBuilderV33.dispose();
                    this.deleteTimeBuilder_ = null;
                }
                this.etag_ = "";
                this.location_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_Resource_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Resource getDefaultInstanceForType() {
                return Resource.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Resource build() {
                Resource resourceBuildPartial = buildPartial();
                if (resourceBuildPartial.isInitialized()) {
                    return resourceBuildPartial;
                }
                throw newUninitializedMessageException((Message) resourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Resource buildPartial() {
                Resource resource = new Resource(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resource);
                }
                onBuilt();
                return resource;
            }

            private void buildPartial0(Resource resource) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    resource.service_ = this.service_;
                }
                if ((i2 & 2) != 0) {
                    resource.name_ = this.name_;
                }
                if ((i2 & 4) != 0) {
                    resource.type_ = this.type_;
                }
                if ((i2 & 8) != 0) {
                    resource.labels_ = internalGetLabels();
                    resource.labels_.makeImmutable();
                }
                if ((i2 & 16) != 0) {
                    resource.uid_ = this.uid_;
                }
                if ((i2 & 32) != 0) {
                    resource.annotations_ = internalGetAnnotations();
                    resource.annotations_.makeImmutable();
                }
                if ((i2 & 64) != 0) {
                    resource.displayName_ = this.displayName_;
                }
                if ((i2 & 128) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                    resource.createTime_ = singleFieldBuilderV3 == null ? this.createTime_ : (Timestamp) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 256) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV32 = this.updateTimeBuilder_;
                    resource.updateTime_ = singleFieldBuilderV32 == null ? this.updateTime_ : (Timestamp) singleFieldBuilderV32.build();
                    i |= 2;
                }
                if ((i2 & 512) != 0) {
                    SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV33 = this.deleteTimeBuilder_;
                    resource.deleteTime_ = singleFieldBuilderV33 == null ? this.deleteTime_ : (Timestamp) singleFieldBuilderV33.build();
                    i |= 4;
                }
                if ((i2 & 1024) != 0) {
                    resource.etag_ = this.etag_;
                }
                if ((i2 & 2048) != 0) {
                    resource.location_ = this.location_;
                }
                Resource.access$9076(resource, i);
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
                if (message instanceof Resource) {
                    return mergeFrom((Resource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Resource resource) {
                if (resource == Resource.getDefaultInstance()) {
                    return this;
                }
                if (!resource.getService().isEmpty()) {
                    this.service_ = resource.service_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!resource.getName().isEmpty()) {
                    this.name_ = resource.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!resource.getType().isEmpty()) {
                    this.type_ = resource.type_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                internalGetMutableLabels().mergeFrom(resource.internalGetLabels());
                this.bitField0_ |= 8;
                if (!resource.getUid().isEmpty()) {
                    this.uid_ = resource.uid_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                internalGetMutableAnnotations().mergeFrom(resource.internalGetAnnotations());
                this.bitField0_ |= 32;
                if (!resource.getDisplayName().isEmpty()) {
                    this.displayName_ = resource.displayName_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (resource.hasCreateTime()) {
                    mergeCreateTime(resource.getCreateTime());
                }
                if (resource.hasUpdateTime()) {
                    mergeUpdateTime(resource.getUpdateTime());
                }
                if (resource.hasDeleteTime()) {
                    mergeDeleteTime(resource.getDeleteTime());
                }
                if (!resource.getEtag().isEmpty()) {
                    this.etag_ = resource.etag_;
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                if (!resource.getLocation().isEmpty()) {
                    this.location_ = resource.location_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                mergeUnknownFields(resource.getUnknownFields());
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
                                    this.service_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.type_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableLabels().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.uid_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 50:
                                    MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(AnnotationsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableAnnotations().getMutableMap().put((String) mapEntry2.getKey(), (String) mapEntry2.getValue());
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.displayName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                    codedInputStream.readMessage(getCreateTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    codedInputStream.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    break;
                                case 82:
                                    codedInputStream.readMessage(getDeleteTimeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    break;
                                case 90:
                                    this.etag_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 98:
                                    this.location_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2048;
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

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getService() {
                Object obj = this.service_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.service_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getServiceBytes() {
                Object obj = this.service_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.service_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setService(String str) {
                str.getClass();
                this.service_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearService() {
                this.service_ = Resource.getDefaultInstance().getService();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.service_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Resource.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Resource.getDefaultInstance().getType();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.type_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private MapField<String, String> internalGetLabels() {
                MapField<String, String> mapField = this.labels_;
                return mapField == null ? MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableLabels() {
                if (this.labels_ == null) {
                    this.labels_ = MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
                }
                if (!this.labels_.isMutable()) {
                    this.labels_ = this.labels_.copy();
                }
                this.bitField0_ |= 8;
                onChanged();
                return this.labels_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public int getLabelsCount() {
                return internalGetLabels().getMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean containsLabels(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                return internalGetLabels().getMap().containsKey(str);
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Map<String, String> getLabelsMap() {
                return internalGetLabels().getMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetLabels().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetLabels().getMap();
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return map.get(str);
            }

            public Builder clearLabels() {
                this.bitField0_ &= -9;
                internalGetMutableLabels().getMutableMap().clear();
                return this;
            }

            public Builder removeLabels(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableLabels().getMutableMap().remove(str);
                return this;
            }

            @Deprecated
            public Map<String, String> getMutableLabels() {
                this.bitField0_ |= 8;
                return internalGetMutableLabels().getMutableMap();
            }

            public Builder putLabels(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableLabels().getMutableMap().put(str, str2);
                this.bitField0_ |= 8;
                return this;
            }

            public Builder putAllLabels(Map<String, String> map) {
                internalGetMutableLabels().getMutableMap().putAll(map);
                this.bitField0_ |= 8;
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getUid() {
                Object obj = this.uid_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.uid_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getUidBytes() {
                Object obj = this.uid_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.uid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setUid(String str) {
                str.getClass();
                this.uid_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.uid_ = Resource.getDefaultInstance().getUid();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder setUidBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.uid_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private MapField<String, String> internalGetAnnotations() {
                MapField<String, String> mapField = this.annotations_;
                return mapField == null ? MapField.emptyMapField(AnnotationsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableAnnotations() {
                if (this.annotations_ == null) {
                    this.annotations_ = MapField.newMapField(AnnotationsDefaultEntryHolder.defaultEntry);
                }
                if (!this.annotations_.isMutable()) {
                    this.annotations_ = this.annotations_.copy();
                }
                this.bitField0_ |= 32;
                onChanged();
                return this.annotations_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public int getAnnotationsCount() {
                return internalGetAnnotations().getMap().size();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean containsAnnotations(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                return internalGetAnnotations().getMap().containsKey(str);
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            @Deprecated
            public Map<String, String> getAnnotations() {
                return getAnnotationsMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Map<String, String> getAnnotationsMap() {
                return internalGetAnnotations().getMap();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getAnnotationsOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetAnnotations().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getAnnotationsOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetAnnotations().getMap();
                if (!map.containsKey(str)) {
                    throw new IllegalArgumentException();
                }
                return map.get(str);
            }

            public Builder clearAnnotations() {
                this.bitField0_ &= -33;
                internalGetMutableAnnotations().getMutableMap().clear();
                return this;
            }

            public Builder removeAnnotations(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableAnnotations().getMutableMap().remove(str);
                return this;
            }

            @Deprecated
            public Map<String, String> getMutableAnnotations() {
                this.bitField0_ |= 32;
                return internalGetMutableAnnotations().getMutableMap();
            }

            public Builder putAnnotations(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableAnnotations().getMutableMap().put(str, str2);
                this.bitField0_ |= 32;
                return this;
            }

            public Builder putAllAnnotations(Map<String, String> map) {
                internalGetMutableAnnotations().getMutableMap().putAll(map);
                this.bitField0_ |= 32;
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getDisplayName() {
                Object obj = this.displayName_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.displayName_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getDisplayNameBytes() {
                Object obj = this.displayName_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.displayName_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setDisplayName(String str) {
                str.getClass();
                this.displayName_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder clearDisplayName() {
                this.displayName_ = Resource.getDefaultInstance().getDisplayName();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder setDisplayNameBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.displayName_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean hasCreateTime() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Timestamp getCreateTime() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.createTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setCreateTime(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.createTime_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setCreateTime(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.createTime_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder mergeCreateTime(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 128) != 0 && (timestamp2 = this.createTime_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getCreateTimeBuilder().mergeFrom(timestamp);
                    } else {
                        this.createTime_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.createTime_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder clearCreateTime() {
                this.bitField0_ &= -129;
                this.createTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.createTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getCreateTimeBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (Timestamp.Builder) getCreateTimeFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public TimestampOrBuilder getCreateTimeOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.createTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.createTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCreateTimeFieldBuilder() {
                if (this.createTimeBuilder_ == null) {
                    this.createTimeBuilder_ = new SingleFieldBuilderV3<>(getCreateTime(), getParentForChildren(), isClean());
                    this.createTime_ = null;
                }
                return this.createTimeBuilder_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean hasUpdateTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Timestamp getUpdateTime() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.updateTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setUpdateTime(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.updateTime_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUpdateTime(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateTime_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder mergeUpdateTime(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 256) != 0 && (timestamp2 = this.updateTime_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getUpdateTimeBuilder().mergeFrom(timestamp);
                    } else {
                        this.updateTime_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.updateTime_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder clearUpdateTime() {
                this.bitField0_ &= -257;
                this.updateTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getUpdateTimeBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (Timestamp.Builder) getUpdateTimeFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public TimestampOrBuilder getUpdateTimeOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.updateTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.updateTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getUpdateTimeFieldBuilder() {
                if (this.updateTimeBuilder_ == null) {
                    this.updateTimeBuilder_ = new SingleFieldBuilderV3<>(getUpdateTime(), getParentForChildren(), isClean());
                    this.updateTime_ = null;
                }
                return this.updateTimeBuilder_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean hasDeleteTime() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Timestamp getDeleteTime() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Timestamp timestamp = this.deleteTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }
                return (Timestamp) singleFieldBuilderV3.getMessage();
            }

            public Builder setDeleteTime(Timestamp timestamp) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    timestamp.getClass();
                    this.deleteTime_ = timestamp;
                } else {
                    singleFieldBuilderV3.setMessage(timestamp);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setDeleteTime(Timestamp.Builder builder) {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteTime_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder mergeDeleteTime(Timestamp timestamp) {
                Timestamp timestamp2;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 512) != 0 && (timestamp2 = this.deleteTime_) != null && timestamp2 != Timestamp.getDefaultInstance()) {
                        getDeleteTimeBuilder().mergeFrom(timestamp);
                    } else {
                        this.deleteTime_ = timestamp;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(timestamp);
                }
                if (this.deleteTime_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder clearDeleteTime() {
                this.bitField0_ &= -513;
                this.deleteTime_ = null;
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteTimeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Timestamp.Builder getDeleteTimeBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (Timestamp.Builder) getDeleteTimeFieldBuilder().getBuilder();
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public TimestampOrBuilder getDeleteTimeOrBuilder() {
                SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.deleteTimeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TimestampOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Timestamp timestamp = this.deleteTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getDeleteTimeFieldBuilder() {
                if (this.deleteTimeBuilder_ == null) {
                    this.deleteTimeBuilder_ = new SingleFieldBuilderV3<>(getDeleteTime(), getParentForChildren(), isClean());
                    this.deleteTime_ = null;
                }
                return this.deleteTimeBuilder_;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getEtag() {
                Object obj = this.etag_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.etag_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getEtagBytes() {
                Object obj = this.etag_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.etag_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setEtag(String str) {
                str.getClass();
                this.etag_ = str;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder clearEtag() {
                this.etag_ = Resource.getDefaultInstance().getEtag();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder setEtagBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.etag_ = byteString;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.location_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.location_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setLocation(String str) {
                str.getClass();
                this.location_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.location_ = Resource.getDefaultInstance().getLocation();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                byteString.getClass();
                Resource.checkByteStringIsUtf8(byteString);
                this.location_ = byteString;
                this.bitField0_ |= 2048;
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

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Resource> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Resource> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Resource getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasOrigin() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getOrigin() {
        Peer peer = this.origin_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public PeerOrBuilder getOriginOrBuilder() {
        Peer peer = this.origin_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasSource() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getSource() {
        Peer peer = this.source_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public PeerOrBuilder getSourceOrBuilder() {
        Peer peer = this.source_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasDestination() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getDestination() {
        Peer peer = this.destination_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public PeerOrBuilder getDestinationOrBuilder() {
        Peer peer = this.destination_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Request getRequest() {
        Request request = this.request_;
        return request == null ? Request.getDefaultInstance() : request;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public RequestOrBuilder getRequestOrBuilder() {
        Request request = this.request_;
        return request == null ? Request.getDefaultInstance() : request;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResponse() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Response getResponse() {
        Response response = this.response_;
        return response == null ? Response.getDefaultInstance() : response;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public ResponseOrBuilder getResponseOrBuilder() {
        Response response = this.response_;
        return response == null ? Response.getDefaultInstance() : response;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResource() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public ResourceOrBuilder getResourceOrBuilder() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasApi() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Api getApi() {
        Api api = this.api_;
        return api == null ? Api.getDefaultInstance() : api;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public ApiOrBuilder getApiOrBuilder() {
        Api api = this.api_;
        return api == null ? Api.getDefaultInstance() : api;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public List<Any> getExtensionsList() {
        return this.extensions_;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public List<? extends AnyOrBuilder> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Any getExtensions(int i) {
        return this.extensions_.get(i);
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public AnyOrBuilder getExtensionsOrBuilder(int i) {
        return this.extensions_.get(i);
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
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(1, getSource());
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(2, getDestination());
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(3, getRequest());
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputStream.writeMessage(4, getResponse());
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputStream.writeMessage(5, getResource());
        }
        if ((this.bitField0_ & 64) != 0) {
            codedOutputStream.writeMessage(6, getApi());
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(7, getOrigin());
        }
        for (int i = 0; i < this.extensions_.size(); i++) {
            codedOutputStream.writeMessage(8, this.extensions_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 2) != 0 ? CodedOutputStream.computeMessageSize(1, getSource()) : 0;
        if ((this.bitField0_ & 4) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDestination());
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getRequest());
        }
        if ((this.bitField0_ & 16) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getResponse());
        }
        if ((this.bitField0_ & 32) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getResource());
        }
        if ((this.bitField0_ & 64) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getApi());
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getOrigin());
        }
        for (int i2 = 0; i2 < this.extensions_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(8, this.extensions_.get(i2));
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
        if (!(obj instanceof AttributeContext)) {
            return super.equals(obj);
        }
        AttributeContext attributeContext = (AttributeContext) obj;
        if (hasOrigin() != attributeContext.hasOrigin()) {
            return false;
        }
        if ((hasOrigin() && !getOrigin().equals(attributeContext.getOrigin())) || hasSource() != attributeContext.hasSource()) {
            return false;
        }
        if ((hasSource() && !getSource().equals(attributeContext.getSource())) || hasDestination() != attributeContext.hasDestination()) {
            return false;
        }
        if ((hasDestination() && !getDestination().equals(attributeContext.getDestination())) || hasRequest() != attributeContext.hasRequest()) {
            return false;
        }
        if ((hasRequest() && !getRequest().equals(attributeContext.getRequest())) || hasResponse() != attributeContext.hasResponse()) {
            return false;
        }
        if ((hasResponse() && !getResponse().equals(attributeContext.getResponse())) || hasResource() != attributeContext.hasResource()) {
            return false;
        }
        if ((!hasResource() || getResource().equals(attributeContext.getResource())) && hasApi() == attributeContext.hasApi()) {
            return (!hasApi() || getApi().equals(attributeContext.getApi())) && getExtensionsList().equals(attributeContext.getExtensionsList()) && getUnknownFields().equals(attributeContext.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasOrigin()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getOrigin().hashCode();
        }
        if (hasSource()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getSource().hashCode();
        }
        if (hasDestination()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getDestination().hashCode();
        }
        if (hasRequest()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRequest().hashCode();
        }
        if (hasResponse()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getResponse().hashCode();
        }
        if (hasResource()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getResource().hashCode();
        }
        if (hasApi()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getApi().hashCode();
        }
        if (getExtensionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getExtensionsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AttributeContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AttributeContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AttributeContext attributeContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(attributeContext);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AttributeContextOrBuilder {
        private SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> apiBuilder_;
        private Api api_;
        private int bitField0_;
        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> destinationBuilder_;
        private Peer destination_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extensionsBuilder_;
        private List<Any> extensions_;
        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> originBuilder_;
        private Peer origin_;
        private SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> requestBuilder_;
        private Request request_;
        private SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> resourceBuilder_;
        private Resource resource_;
        private SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> responseBuilder_;
        private Response response_;
        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> sourceBuilder_;
        private Peer source_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AttributeContext.class, Builder.class);
        }

        private Builder() {
            this.extensions_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.extensions_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AttributeContext.alwaysUseFieldBuilders) {
                getOriginFieldBuilder();
                getSourceFieldBuilder();
                getDestinationFieldBuilder();
                getRequestFieldBuilder();
                getResponseFieldBuilder();
                getResourceFieldBuilder();
                getApiFieldBuilder();
                getExtensionsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.origin_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.originBuilder_ = null;
            }
            this.source_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV32 = this.sourceBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.sourceBuilder_ = null;
            }
            this.destination_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV33 = this.destinationBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.destinationBuilder_ = null;
            }
            this.request_ = null;
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV34 = this.requestBuilder_;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.dispose();
                this.requestBuilder_ = null;
            }
            this.response_ = null;
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV35 = this.responseBuilder_;
            if (singleFieldBuilderV35 != null) {
                singleFieldBuilderV35.dispose();
                this.responseBuilder_ = null;
            }
            this.resource_ = null;
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV36 = this.resourceBuilder_;
            if (singleFieldBuilderV36 != null) {
                singleFieldBuilderV36.dispose();
                this.resourceBuilder_ = null;
            }
            this.api_ = null;
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV37 = this.apiBuilder_;
            if (singleFieldBuilderV37 != null) {
                singleFieldBuilderV37.dispose();
                this.apiBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extensions_ = Collections.emptyList();
            } else {
                this.extensions_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -129;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AttributeContextProto.internal_static_google_rpc_context_AttributeContext_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AttributeContext getDefaultInstanceForType() {
            return AttributeContext.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AttributeContext build() {
            AttributeContext attributeContextBuildPartial = buildPartial();
            if (attributeContextBuildPartial.isInitialized()) {
                return attributeContextBuildPartial;
            }
            throw newUninitializedMessageException((Message) attributeContextBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AttributeContext buildPartial() {
            AttributeContext attributeContext = new AttributeContext(this);
            buildPartialRepeatedFields(attributeContext);
            if (this.bitField0_ != 0) {
                buildPartial0(attributeContext);
            }
            onBuilt();
            return attributeContext;
        }

        private void buildPartialRepeatedFields(AttributeContext attributeContext) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                attributeContext.extensions_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 128) != 0) {
                this.extensions_ = Collections.unmodifiableList(this.extensions_);
                this.bitField0_ &= -129;
            }
            attributeContext.extensions_ = this.extensions_;
        }

        private void buildPartial0(AttributeContext attributeContext) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
                attributeContext.origin_ = singleFieldBuilderV3 == null ? this.origin_ : (Peer) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV32 = this.sourceBuilder_;
                attributeContext.source_ = singleFieldBuilderV32 == null ? this.source_ : (Peer) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV33 = this.destinationBuilder_;
                attributeContext.destination_ = singleFieldBuilderV33 == null ? this.destination_ : (Peer) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV34 = this.requestBuilder_;
                attributeContext.request_ = singleFieldBuilderV34 == null ? this.request_ : (Request) singleFieldBuilderV34.build();
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV35 = this.responseBuilder_;
                attributeContext.response_ = singleFieldBuilderV35 == null ? this.response_ : (Response) singleFieldBuilderV35.build();
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV36 = this.resourceBuilder_;
                attributeContext.resource_ = singleFieldBuilderV36 == null ? this.resource_ : (Resource) singleFieldBuilderV36.build();
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV37 = this.apiBuilder_;
                attributeContext.api_ = singleFieldBuilderV37 == null ? this.api_ : (Api) singleFieldBuilderV37.build();
                i |= 64;
            }
            AttributeContext.access$11276(attributeContext, i);
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
            if (message instanceof AttributeContext) {
                return mergeFrom((AttributeContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AttributeContext attributeContext) {
            if (attributeContext == AttributeContext.getDefaultInstance()) {
                return this;
            }
            if (attributeContext.hasOrigin()) {
                mergeOrigin(attributeContext.getOrigin());
            }
            if (attributeContext.hasSource()) {
                mergeSource(attributeContext.getSource());
            }
            if (attributeContext.hasDestination()) {
                mergeDestination(attributeContext.getDestination());
            }
            if (attributeContext.hasRequest()) {
                mergeRequest(attributeContext.getRequest());
            }
            if (attributeContext.hasResponse()) {
                mergeResponse(attributeContext.getResponse());
            }
            if (attributeContext.hasResource()) {
                mergeResource(attributeContext.getResource());
            }
            if (attributeContext.hasApi()) {
                mergeApi(attributeContext.getApi());
            }
            if (this.extensionsBuilder_ == null) {
                if (!attributeContext.extensions_.isEmpty()) {
                    if (this.extensions_.isEmpty()) {
                        this.extensions_ = attributeContext.extensions_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureExtensionsIsMutable();
                        this.extensions_.addAll(attributeContext.extensions_);
                    }
                    onChanged();
                }
            } else if (!attributeContext.extensions_.isEmpty()) {
                if (!this.extensionsBuilder_.isEmpty()) {
                    this.extensionsBuilder_.addAllMessages(attributeContext.extensions_);
                } else {
                    this.extensionsBuilder_.dispose();
                    this.extensionsBuilder_ = null;
                    this.extensions_ = attributeContext.extensions_;
                    this.bitField0_ &= -129;
                    this.extensionsBuilder_ = AttributeContext.alwaysUseFieldBuilders ? getExtensionsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(attributeContext.getUnknownFields());
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
                                codedInputStream.readMessage(getSourceFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 2;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getDestinationFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getResourceFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 32;
                            } else if (tag == 50) {
                                codedInputStream.readMessage(getApiFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 64;
                            } else if (tag == 58) {
                                codedInputStream.readMessage(getOriginFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
                            } else if (tag == 66) {
                                Any any = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureExtensionsIsMutable();
                                    this.extensions_.add(any);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(any);
                                }
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

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasOrigin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getOrigin() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 == null) {
                Peer peer = this.origin_;
                return peer == null ? Peer.getDefaultInstance() : peer;
            }
            return (Peer) singleFieldBuilderV3.getMessage();
        }

        public Builder setOrigin(Peer peer) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 == null) {
                peer.getClass();
                this.origin_ = peer;
            } else {
                singleFieldBuilderV3.setMessage(peer);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setOrigin(Peer.Builder builder) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.origin_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder mergeOrigin(Peer peer) {
            Peer peer2;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (peer2 = this.origin_) != null && peer2 != Peer.getDefaultInstance()) {
                    getOriginBuilder().mergeFrom(peer);
                } else {
                    this.origin_ = peer;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(peer);
            }
            if (this.origin_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder clearOrigin() {
            this.bitField0_ &= -2;
            this.origin_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.originBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Peer.Builder getOriginBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (Peer.Builder) getOriginFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public PeerOrBuilder getOriginOrBuilder() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.originBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PeerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Peer peer = this.origin_;
            return peer == null ? Peer.getDefaultInstance() : peer;
        }

        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> getOriginFieldBuilder() {
            if (this.originBuilder_ == null) {
                this.originBuilder_ = new SingleFieldBuilderV3<>(getOrigin(), getParentForChildren(), isClean());
                this.origin_ = null;
            }
            return this.originBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getSource() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Peer peer = this.source_;
                return peer == null ? Peer.getDefaultInstance() : peer;
            }
            return (Peer) singleFieldBuilderV3.getMessage();
        }

        public Builder setSource(Peer peer) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                peer.getClass();
                this.source_ = peer;
            } else {
                singleFieldBuilderV3.setMessage(peer);
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setSource(Peer.Builder builder) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.source_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder mergeSource(Peer peer) {
            Peer peer2;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0 && (peer2 = this.source_) != null && peer2 != Peer.getDefaultInstance()) {
                    getSourceBuilder().mergeFrom(peer);
                } else {
                    this.source_ = peer;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(peer);
            }
            if (this.source_ != null) {
                this.bitField0_ |= 2;
                onChanged();
            }
            return this;
        }

        public Builder clearSource() {
            this.bitField0_ &= -3;
            this.source_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.sourceBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Peer.Builder getSourceBuilder() {
            this.bitField0_ |= 2;
            onChanged();
            return (Peer.Builder) getSourceFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public PeerOrBuilder getSourceOrBuilder() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PeerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Peer peer = this.source_;
            return peer == null ? Peer.getDefaultInstance() : peer;
        }

        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new SingleFieldBuilderV3<>(getSource(), getParentForChildren(), isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasDestination() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getDestination() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 == null) {
                Peer peer = this.destination_;
                return peer == null ? Peer.getDefaultInstance() : peer;
            }
            return (Peer) singleFieldBuilderV3.getMessage();
        }

        public Builder setDestination(Peer peer) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 == null) {
                peer.getClass();
                this.destination_ = peer;
            } else {
                singleFieldBuilderV3.setMessage(peer);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setDestination(Peer.Builder builder) {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.destination_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeDestination(Peer peer) {
            Peer peer2;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (peer2 = this.destination_) != null && peer2 != Peer.getDefaultInstance()) {
                    getDestinationBuilder().mergeFrom(peer);
                } else {
                    this.destination_ = peer;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(peer);
            }
            if (this.destination_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearDestination() {
            this.bitField0_ &= -5;
            this.destination_ = null;
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.destinationBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Peer.Builder getDestinationBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (Peer.Builder) getDestinationFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public PeerOrBuilder getDestinationOrBuilder() {
            SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> singleFieldBuilderV3 = this.destinationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (PeerOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Peer peer = this.destination_;
            return peer == null ? Peer.getDefaultInstance() : peer;
        }

        private SingleFieldBuilderV3<Peer, Peer.Builder, PeerOrBuilder> getDestinationFieldBuilder() {
            if (this.destinationBuilder_ == null) {
                this.destinationBuilder_ = new SingleFieldBuilderV3<>(getDestination(), getParentForChildren(), isClean());
                this.destination_ = null;
            }
            return this.destinationBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Request getRequest() {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                Request request = this.request_;
                return request == null ? Request.getDefaultInstance() : request;
            }
            return (Request) singleFieldBuilderV3.getMessage();
        }

        public Builder setRequest(Request request) {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                request.getClass();
                this.request_ = request;
            } else {
                singleFieldBuilderV3.setMessage(request);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.request_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeRequest(Request request) {
            Request request2;
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0 && (request2 = this.request_) != null && request2 != Request.getDefaultInstance()) {
                    getRequestBuilder().mergeFrom(request);
                } else {
                    this.request_ = request;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(request);
            }
            if (this.request_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder clearRequest() {
            this.bitField0_ &= -9;
            this.request_ = null;
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.requestBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Request.Builder getRequestBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (Request.Builder) getRequestFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public RequestOrBuilder getRequestOrBuilder() {
            SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Request request = this.request_;
            return request == null ? Request.getDefaultInstance() : request;
        }

        private SingleFieldBuilderV3<Request, Request.Builder, RequestOrBuilder> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                this.requestBuilder_ = new SingleFieldBuilderV3<>(getRequest(), getParentForChildren(), isClean());
                this.request_ = null;
            }
            return this.requestBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Response getResponse() {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                Response response = this.response_;
                return response == null ? Response.getDefaultInstance() : response;
            }
            return (Response) singleFieldBuilderV3.getMessage();
        }

        public Builder setResponse(Response response) {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                response.getClass();
                this.response_ = response;
            } else {
                singleFieldBuilderV3.setMessage(response);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.response_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeResponse(Response response) {
            Response response2;
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (response2 = this.response_) != null && response2 != Response.getDefaultInstance()) {
                    getResponseBuilder().mergeFrom(response);
                } else {
                    this.response_ = response;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(response);
            }
            if (this.response_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearResponse() {
            this.bitField0_ &= -17;
            this.response_ = null;
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.responseBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Response.Builder getResponseBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (Response.Builder) getResponseFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public ResponseOrBuilder getResponseOrBuilder() {
            SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Response response = this.response_;
            return response == null ? Response.getDefaultInstance() : response;
        }

        private SingleFieldBuilderV3<Response, Response.Builder, ResponseOrBuilder> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                this.responseBuilder_ = new SingleFieldBuilderV3<>(getResponse(), getParentForChildren(), isClean());
                this.response_ = null;
            }
            return this.responseBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResource() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Resource getResource() {
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Resource resource = this.resource_;
                return resource == null ? Resource.getDefaultInstance() : resource;
            }
            return (Resource) singleFieldBuilderV3.getMessage();
        }

        public Builder setResource(Resource resource) {
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                resource.getClass();
                this.resource_ = resource;
            } else {
                singleFieldBuilderV3.setMessage(resource);
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setResource(Resource.Builder builder) {
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.resource_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder mergeResource(Resource resource) {
            Resource resource2;
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32) != 0 && (resource2 = this.resource_) != null && resource2 != Resource.getDefaultInstance()) {
                    getResourceBuilder().mergeFrom(resource);
                } else {
                    this.resource_ = resource;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(resource);
            }
            if (this.resource_ != null) {
                this.bitField0_ |= 32;
                onChanged();
            }
            return this;
        }

        public Builder clearResource() {
            this.bitField0_ &= -33;
            this.resource_ = null;
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.resourceBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Resource.Builder getResourceBuilder() {
            this.bitField0_ |= 32;
            onChanged();
            return (Resource.Builder) getResourceFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public ResourceOrBuilder getResourceOrBuilder() {
            SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> singleFieldBuilderV3 = this.resourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ResourceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Resource resource = this.resource_;
            return resource == null ? Resource.getDefaultInstance() : resource;
        }

        private SingleFieldBuilderV3<Resource, Resource.Builder, ResourceOrBuilder> getResourceFieldBuilder() {
            if (this.resourceBuilder_ == null) {
                this.resourceBuilder_ = new SingleFieldBuilderV3<>(getResource(), getParentForChildren(), isClean());
                this.resource_ = null;
            }
            return this.resourceBuilder_;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasApi() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Api getApi() {
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 == null) {
                Api api = this.api_;
                return api == null ? Api.getDefaultInstance() : api;
            }
            return (Api) singleFieldBuilderV3.getMessage();
        }

        public Builder setApi(Api api) {
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 == null) {
                api.getClass();
                this.api_ = api;
            } else {
                singleFieldBuilderV3.setMessage(api);
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setApi(Api.Builder builder) {
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.api_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder mergeApi(Api api) {
            Api api2;
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 64) != 0 && (api2 = this.api_) != null && api2 != Api.getDefaultInstance()) {
                    getApiBuilder().mergeFrom(api);
                } else {
                    this.api_ = api;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(api);
            }
            if (this.api_ != null) {
                this.bitField0_ |= 64;
                onChanged();
            }
            return this;
        }

        public Builder clearApi() {
            this.bitField0_ &= -65;
            this.api_ = null;
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.apiBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Api.Builder getApiBuilder() {
            this.bitField0_ |= 64;
            onChanged();
            return (Api.Builder) getApiFieldBuilder().getBuilder();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public ApiOrBuilder getApiOrBuilder() {
            SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> singleFieldBuilderV3 = this.apiBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ApiOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Api api = this.api_;
            return api == null ? Api.getDefaultInstance() : api;
        }

        private SingleFieldBuilderV3<Api, Api.Builder, ApiOrBuilder> getApiFieldBuilder() {
            if (this.apiBuilder_ == null) {
                this.apiBuilder_ = new SingleFieldBuilderV3<>(getApi(), getParentForChildren(), isClean());
                this.api_ = null;
            }
            return this.apiBuilder_;
        }

        private void ensureExtensionsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
                this.extensions_ = new ArrayList(this.extensions_);
                this.bitField0_ |= 128;
            }
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public List<Any> getExtensionsList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.extensions_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public int getExtensionsCount() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extensions_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Any getExtensions(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extensions_.get(i);
            }
            return (Any) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setExtensions(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtensionsIsMutable();
                this.extensions_.set(i, any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, any);
            }
            return this;
        }

        public Builder setExtensions(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtensionsIsMutable();
                this.extensions_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addExtensions(Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtensionsIsMutable();
                this.extensions_.add(any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(any);
            }
            return this;
        }

        public Builder addExtensions(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                any.getClass();
                ensureExtensionsIsMutable();
                this.extensions_.add(i, any);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, any);
            }
            return this;
        }

        public Builder addExtensions(Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtensionsIsMutable();
                this.extensions_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addExtensions(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtensionsIsMutable();
                this.extensions_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllExtensions(Iterable<? extends Any> iterable) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtensionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.extensions_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearExtensions() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extensions_ = Collections.emptyList();
                this.bitField0_ &= -129;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeExtensions(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtensionsIsMutable();
                this.extensions_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Any.Builder getExtensionsBuilder(int i) {
            return (Any.Builder) getExtensionsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public AnyOrBuilder getExtensionsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extensions_.get(i);
            }
            return (AnyOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public List<? extends AnyOrBuilder> getExtensionsOrBuilderList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extensionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.extensions_);
        }

        public Any.Builder addExtensionsBuilder() {
            return (Any.Builder) getExtensionsFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Any.Builder addExtensionsBuilder(int i) {
            return (Any.Builder) getExtensionsFieldBuilder().addBuilder(i, Any.getDefaultInstance());
        }

        public List<Any.Builder> getExtensionsBuilderList() {
            return getExtensionsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtensionsFieldBuilder() {
            if (this.extensionsBuilder_ == null) {
                this.extensionsBuilder_ = new RepeatedFieldBuilderV3<>(this.extensions_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
                this.extensions_ = null;
            }
            return this.extensionsBuilder_;
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

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AttributeContext> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AttributeContext> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AttributeContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
