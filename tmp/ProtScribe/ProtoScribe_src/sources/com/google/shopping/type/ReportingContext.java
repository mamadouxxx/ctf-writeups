package com.google.shopping.type;

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
public final class ReportingContext extends GeneratedMessageV3 implements ReportingContextOrBuilder {
    private static final ReportingContext DEFAULT_INSTANCE = new ReportingContext();
    private static final Parser<ReportingContext> PARSER = new AbstractParser<ReportingContext>() { // from class: com.google.shopping.type.ReportingContext.1
        @Override // com.google.protobuf.Parser
        public ReportingContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ReportingContext.newBuilder();
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
    private byte memoizedIsInitialized;

    private ReportingContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ReportingContext() {
        this.memoizedIsInitialized = (byte) -1;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ReportingContext();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypesProto.internal_static_google_shopping_type_ReportingContext_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportingContext.class, Builder.class);
    }

    public enum ReportingContextEnum implements ProtocolMessageEnum {
        REPORTING_CONTEXT_ENUM_UNSPECIFIED(0),
        SHOPPING_ADS(1),
        DISCOVERY_ADS(2),
        DEMAND_GEN_ADS(13),
        DEMAND_GEN_ADS_DISCOVER_SURFACE(14),
        VIDEO_ADS(3),
        DISPLAY_ADS(4),
        LOCAL_INVENTORY_ADS(5),
        VEHICLE_INVENTORY_ADS(6),
        FREE_LISTINGS(7),
        FREE_LOCAL_LISTINGS(8),
        FREE_LOCAL_VEHICLE_LISTINGS(9),
        YOUTUBE_SHOPPING(10),
        CLOUD_RETAIL(11),
        LOCAL_CLOUD_RETAIL(12),
        UNRECOGNIZED(-1);

        public static final int CLOUD_RETAIL_VALUE = 11;
        public static final int DEMAND_GEN_ADS_DISCOVER_SURFACE_VALUE = 14;
        public static final int DEMAND_GEN_ADS_VALUE = 13;

        @Deprecated
        public static final int DISCOVERY_ADS_VALUE = 2;
        public static final int DISPLAY_ADS_VALUE = 4;
        public static final int FREE_LISTINGS_VALUE = 7;
        public static final int FREE_LOCAL_LISTINGS_VALUE = 8;
        public static final int FREE_LOCAL_VEHICLE_LISTINGS_VALUE = 9;
        public static final int LOCAL_CLOUD_RETAIL_VALUE = 12;
        public static final int LOCAL_INVENTORY_ADS_VALUE = 5;
        public static final int REPORTING_CONTEXT_ENUM_UNSPECIFIED_VALUE = 0;
        public static final int SHOPPING_ADS_VALUE = 1;
        public static final int VEHICLE_INVENTORY_ADS_VALUE = 6;
        public static final int VIDEO_ADS_VALUE = 3;
        public static final int YOUTUBE_SHOPPING_VALUE = 10;
        private final int value;
        private static final Internal.EnumLiteMap<ReportingContextEnum> internalValueMap = new Internal.EnumLiteMap<ReportingContextEnum>() { // from class: com.google.shopping.type.ReportingContext.ReportingContextEnum.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ReportingContextEnum findValueByNumber(int i) {
                return ReportingContextEnum.forNumber(i);
            }
        };
        private static final ReportingContextEnum[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ReportingContextEnum valueOf(int i) {
            return forNumber(i);
        }

        public static ReportingContextEnum forNumber(int i) {
            switch (i) {
                case 0:
                    return REPORTING_CONTEXT_ENUM_UNSPECIFIED;
                case 1:
                    return SHOPPING_ADS;
                case 2:
                    return DISCOVERY_ADS;
                case 3:
                    return VIDEO_ADS;
                case 4:
                    return DISPLAY_ADS;
                case 5:
                    return LOCAL_INVENTORY_ADS;
                case 6:
                    return VEHICLE_INVENTORY_ADS;
                case 7:
                    return FREE_LISTINGS;
                case 8:
                    return FREE_LOCAL_LISTINGS;
                case 9:
                    return FREE_LOCAL_VEHICLE_LISTINGS;
                case 10:
                    return YOUTUBE_SHOPPING;
                case 11:
                    return CLOUD_RETAIL;
                case 12:
                    return LOCAL_CLOUD_RETAIL;
                case 13:
                    return DEMAND_GEN_ADS;
                case 14:
                    return DEMAND_GEN_ADS_DISCOVER_SURFACE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ReportingContextEnum> internalGetValueMap() {
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
            return ReportingContext.getDescriptor().getEnumTypes().get(0);
        }

        public static ReportingContextEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        ReportingContextEnum(int i) {
            this.value = i;
        }
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
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportingContext) {
            return getUnknownFields().equals(((ReportingContext) obj).getUnknownFields());
        }
        return super.equals(obj);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    public static ReportingContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ReportingContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ReportingContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ReportingContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ReportingContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ReportingContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ReportingContext parseFrom(InputStream inputStream) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ReportingContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ReportingContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ReportingContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ReportingContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ReportingContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReportingContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ReportingContext reportingContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(reportingContext);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReportingContextOrBuilder {
        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypesProto.internal_static_google_shopping_type_ReportingContext_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportingContext.class, Builder.class);
        }

        private Builder() {
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TypesProto.internal_static_google_shopping_type_ReportingContext_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ReportingContext getDefaultInstanceForType() {
            return ReportingContext.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ReportingContext build() {
            ReportingContext reportingContextBuildPartial = buildPartial();
            if (reportingContextBuildPartial.isInitialized()) {
                return reportingContextBuildPartial;
            }
            throw newUninitializedMessageException((Message) reportingContextBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ReportingContext buildPartial() {
            ReportingContext reportingContext = new ReportingContext(this);
            onBuilt();
            return reportingContext;
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
            if (message instanceof ReportingContext) {
                return mergeFrom((ReportingContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ReportingContext reportingContext) {
            if (reportingContext == ReportingContext.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(reportingContext.getUnknownFields());
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
                        if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                            z = true;
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

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static ReportingContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ReportingContext> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ReportingContext> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ReportingContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
