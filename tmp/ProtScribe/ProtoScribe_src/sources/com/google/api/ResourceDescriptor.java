package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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
public final class ResourceDescriptor extends GeneratedMessageV3 implements ResourceDescriptorOrBuilder {
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int STYLE_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int history_;
    private byte memoizedIsInitialized;
    private volatile Object nameField_;
    private LazyStringArrayList pattern_;
    private volatile Object plural_;
    private volatile Object singular_;
    private int styleMemoizedSerializedSize;
    private List<Integer> style_;
    private volatile Object type_;
    private static final Internal.ListAdapter.Converter<Integer, Style> style_converter_ = new Internal.ListAdapter.Converter<Integer, Style>() { // from class: com.google.api.ResourceDescriptor.1
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public Style convert(Integer num) {
            Style styleForNumber = Style.forNumber(num.intValue());
            return styleForNumber == null ? Style.UNRECOGNIZED : styleForNumber;
        }
    };
    private static final ResourceDescriptor DEFAULT_INSTANCE = new ResourceDescriptor();
    private static final Parser<ResourceDescriptor> PARSER = new AbstractParser<ResourceDescriptor>() { // from class: com.google.api.ResourceDescriptor.2
        @Override // com.google.protobuf.Parser
        public ResourceDescriptor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ResourceDescriptor.newBuilder();
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

    private ResourceDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = "";
        this.pattern_ = LazyStringArrayList.emptyList();
        this.nameField_ = "";
        this.history_ = 0;
        this.plural_ = "";
        this.singular_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private ResourceDescriptor() {
        this.type_ = "";
        this.pattern_ = LazyStringArrayList.emptyList();
        this.nameField_ = "";
        this.history_ = 0;
        this.plural_ = "";
        this.singular_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = "";
        this.pattern_ = LazyStringArrayList.emptyList();
        this.nameField_ = "";
        this.history_ = 0;
        this.plural_ = "";
        this.singular_ = "";
        this.style_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ResourceDescriptor();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ResourceProto.internal_static_google_api_ResourceDescriptor_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ResourceProto.internal_static_google_api_ResourceDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(ResourceDescriptor.class, Builder.class);
    }

    public enum History implements ProtocolMessageEnum {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);

        public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
        public static final int HISTORY_UNSPECIFIED_VALUE = 0;
        public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<History> internalValueMap = new Internal.EnumLiteMap<History>() { // from class: com.google.api.ResourceDescriptor.History.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public History findValueByNumber(int i) {
                return History.forNumber(i);
            }
        };
        private static final History[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static History valueOf(int i) {
            return forNumber(i);
        }

        public static History forNumber(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        public static Internal.EnumLiteMap<History> internalGetValueMap() {
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
            return ResourceDescriptor.getDescriptor().getEnumTypes().get(0);
        }

        public static History valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        History(int i) {
            this.value = i;
        }
    }

    public enum Style implements ProtocolMessageEnum {
        STYLE_UNSPECIFIED(0),
        DECLARATIVE_FRIENDLY(1),
        UNRECOGNIZED(-1);

        public static final int DECLARATIVE_FRIENDLY_VALUE = 1;
        public static final int STYLE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Style> internalValueMap = new Internal.EnumLiteMap<Style>() { // from class: com.google.api.ResourceDescriptor.Style.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Style findValueByNumber(int i) {
                return Style.forNumber(i);
            }
        };
        private static final Style[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static Style valueOf(int i) {
            return forNumber(i);
        }

        public static Style forNumber(int i) {
            if (i == 0) {
                return STYLE_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return DECLARATIVE_FRIENDLY;
        }

        public static Internal.EnumLiteMap<Style> internalGetValueMap() {
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
            return ResourceDescriptor.getDescriptor().getEnumTypes().get(1);
        }

        public static Style valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        Style(int i) {
            this.value = i;
        }
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ProtocolStringList getPatternList() {
        return this.pattern_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getPatternCount() {
        return this.pattern_.size();
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPattern(int i) {
        return this.pattern_.get(i);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getPatternBytes(int i) {
        return this.pattern_.getByteString(i);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getNameField() {
        Object obj = this.nameField_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.nameField_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getNameFieldBytes() {
        Object obj = this.nameField_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nameField_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getHistoryValue() {
        return this.history_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public History getHistory() {
        History historyForNumber = History.forNumber(this.history_);
        return historyForNumber == null ? History.UNRECOGNIZED : historyForNumber;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPlural() {
        Object obj = this.plural_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.plural_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getPluralBytes() {
        Object obj = this.plural_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.plural_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getSingular() {
        Object obj = this.singular_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.singular_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getSingularBytes() {
        Object obj = this.singular_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.singular_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public List<Style> getStyleList() {
        return new Internal.ListAdapter(this.style_, style_converter_);
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getStyleCount() {
        return this.style_.size();
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public Style getStyle(int i) {
        return style_converter_.convert(this.style_.get(i));
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public List<Integer> getStyleValueList() {
        return this.style_;
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getStyleValue(int i) {
        return this.style_.get(i).intValue();
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
        if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.type_);
        }
        for (int i = 0; i < this.pattern_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.pattern_.getRaw(i));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.nameField_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.nameField_);
        }
        if (this.history_ != History.HISTORY_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.history_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.plural_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.plural_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.singular_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.singular_);
        }
        if (getStyleList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(82);
            codedOutputStream.writeUInt32NoTag(this.styleMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.style_.size(); i2++) {
            codedOutputStream.writeEnumNoTag(this.style_.get(i2).intValue());
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.type_) ? GeneratedMessageV3.computeStringSize(1, this.type_) : 0;
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.pattern_.size(); i2++) {
            iComputeStringSizeNoTag += computeStringSizeNoTag(this.pattern_.getRaw(i2));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + getPatternList().size();
        if (!GeneratedMessageV3.isStringEmpty(this.nameField_)) {
            size += GeneratedMessageV3.computeStringSize(3, this.nameField_);
        }
        if (this.history_ != History.HISTORY_UNSPECIFIED.getNumber()) {
            size += CodedOutputStream.computeEnumSize(4, this.history_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.plural_)) {
            size += GeneratedMessageV3.computeStringSize(5, this.plural_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.singular_)) {
            size += GeneratedMessageV3.computeStringSize(6, this.singular_);
        }
        int iComputeEnumSizeNoTag = 0;
        for (int i3 = 0; i3 < this.style_.size(); i3++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.style_.get(i3).intValue());
        }
        int iComputeUInt32SizeNoTag = size + iComputeEnumSizeNoTag;
        if (!getStyleList().isEmpty()) {
            iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + CodedOutputStream.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
        }
        this.styleMemoizedSerializedSize = iComputeEnumSizeNoTag;
        int serializedSize = iComputeUInt32SizeNoTag + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceDescriptor)) {
            return super.equals(obj);
        }
        ResourceDescriptor resourceDescriptor = (ResourceDescriptor) obj;
        return getType().equals(resourceDescriptor.getType()) && getPatternList().equals(resourceDescriptor.getPatternList()) && getNameField().equals(resourceDescriptor.getNameField()) && this.history_ == resourceDescriptor.history_ && getPlural().equals(resourceDescriptor.getPlural()) && getSingular().equals(resourceDescriptor.getSingular()) && this.style_.equals(resourceDescriptor.style_) && getUnknownFields().equals(resourceDescriptor.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode();
        if (getPatternCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getPatternList().hashCode();
        }
        int iHashCode2 = (((((((((((((((iHashCode * 37) + 3) * 53) + getNameField().hashCode()) * 37) + 4) * 53) + this.history_) * 37) + 5) * 53) + getPlural().hashCode()) * 37) + 6) * 53) + getSingular().hashCode();
        if (getStyleCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 10) * 53) + this.style_.hashCode();
        }
        int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ResourceDescriptor resourceDescriptor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(resourceDescriptor);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResourceDescriptorOrBuilder {
        private int bitField0_;
        private int history_;
        private Object nameField_;
        private LazyStringArrayList pattern_;
        private Object plural_;
        private Object singular_;
        private List<Integer> style_;
        private Object type_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ResourceProto.internal_static_google_api_ResourceDescriptor_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ResourceProto.internal_static_google_api_ResourceDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(ResourceDescriptor.class, Builder.class);
        }

        private Builder() {
            this.type_ = "";
            this.pattern_ = LazyStringArrayList.emptyList();
            this.nameField_ = "";
            this.history_ = 0;
            this.plural_ = "";
            this.singular_ = "";
            this.style_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = "";
            this.pattern_ = LazyStringArrayList.emptyList();
            this.nameField_ = "";
            this.history_ = 0;
            this.plural_ = "";
            this.singular_ = "";
            this.style_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.type_ = "";
            this.pattern_ = LazyStringArrayList.emptyList();
            this.nameField_ = "";
            this.history_ = 0;
            this.plural_ = "";
            this.singular_ = "";
            this.style_ = Collections.emptyList();
            this.bitField0_ &= -65;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ResourceProto.internal_static_google_api_ResourceDescriptor_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResourceDescriptor getDefaultInstanceForType() {
            return ResourceDescriptor.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ResourceDescriptor build() {
            ResourceDescriptor resourceDescriptorBuildPartial = buildPartial();
            if (resourceDescriptorBuildPartial.isInitialized()) {
                return resourceDescriptorBuildPartial;
            }
            throw newUninitializedMessageException((Message) resourceDescriptorBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ResourceDescriptor buildPartial() {
            ResourceDescriptor resourceDescriptor = new ResourceDescriptor(this);
            buildPartialRepeatedFields(resourceDescriptor);
            if (this.bitField0_ != 0) {
                buildPartial0(resourceDescriptor);
            }
            onBuilt();
            return resourceDescriptor;
        }

        private void buildPartialRepeatedFields(ResourceDescriptor resourceDescriptor) {
            if ((this.bitField0_ & 64) != 0) {
                this.style_ = Collections.unmodifiableList(this.style_);
                this.bitField0_ &= -65;
            }
            resourceDescriptor.style_ = this.style_;
        }

        private void buildPartial0(ResourceDescriptor resourceDescriptor) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                resourceDescriptor.type_ = this.type_;
            }
            if ((i & 2) != 0) {
                this.pattern_.makeImmutable();
                resourceDescriptor.pattern_ = this.pattern_;
            }
            if ((i & 4) != 0) {
                resourceDescriptor.nameField_ = this.nameField_;
            }
            if ((i & 8) != 0) {
                resourceDescriptor.history_ = this.history_;
            }
            if ((i & 16) != 0) {
                resourceDescriptor.plural_ = this.plural_;
            }
            if ((i & 32) != 0) {
                resourceDescriptor.singular_ = this.singular_;
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
            if (message instanceof ResourceDescriptor) {
                return mergeFrom((ResourceDescriptor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ResourceDescriptor resourceDescriptor) {
            if (resourceDescriptor == ResourceDescriptor.getDefaultInstance()) {
                return this;
            }
            if (!resourceDescriptor.getType().isEmpty()) {
                this.type_ = resourceDescriptor.type_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!resourceDescriptor.pattern_.isEmpty()) {
                if (this.pattern_.isEmpty()) {
                    this.pattern_ = resourceDescriptor.pattern_;
                    this.bitField0_ |= 2;
                } else {
                    ensurePatternIsMutable();
                    this.pattern_.addAll(resourceDescriptor.pattern_);
                }
                onChanged();
            }
            if (!resourceDescriptor.getNameField().isEmpty()) {
                this.nameField_ = resourceDescriptor.nameField_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (resourceDescriptor.history_ != 0) {
                setHistoryValue(resourceDescriptor.getHistoryValue());
            }
            if (!resourceDescriptor.getPlural().isEmpty()) {
                this.plural_ = resourceDescriptor.plural_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (!resourceDescriptor.getSingular().isEmpty()) {
                this.singular_ = resourceDescriptor.singular_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!resourceDescriptor.style_.isEmpty()) {
                if (this.style_.isEmpty()) {
                    this.style_ = resourceDescriptor.style_;
                    this.bitField0_ &= -65;
                } else {
                    ensureStyleIsMutable();
                    this.style_.addAll(resourceDescriptor.style_);
                }
                onChanged();
            }
            mergeUnknownFields(resourceDescriptor.getUnknownFields());
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
                                this.type_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensurePatternIsMutable();
                                this.pattern_.add((Object) stringRequireUtf8);
                            } else if (tag == 26) {
                                this.nameField_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.history_ = codedInputStream.readEnum();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                this.plural_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                this.singular_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                            } else if (tag == 80) {
                                int i = codedInputStream.readEnum();
                                ensureStyleIsMutable();
                                this.style_.add(Integer.valueOf(i));
                            } else if (tag == 82) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i2 = codedInputStream.readEnum();
                                    ensureStyleIsMutable();
                                    this.style_.add(Integer.valueOf(i2));
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

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
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
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = ResourceDescriptor.getDefaultInstance().getType();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            byteString.getClass();
            ResourceDescriptor.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensurePatternIsMutable() {
            if (!this.pattern_.isModifiable()) {
                this.pattern_ = new LazyStringArrayList((LazyStringList) this.pattern_);
            }
            this.bitField0_ |= 2;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ProtocolStringList getPatternList() {
            this.pattern_.makeImmutable();
            return this.pattern_;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getPatternCount() {
            return this.pattern_.size();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPattern(int i) {
            return this.pattern_.get(i);
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getPatternBytes(int i) {
            return this.pattern_.getByteString(i);
        }

        public Builder setPattern(int i, String str) {
            str.getClass();
            ensurePatternIsMutable();
            this.pattern_.set(i, str);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder addPattern(String str) {
            str.getClass();
            ensurePatternIsMutable();
            this.pattern_.add((Object) str);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder addAllPattern(Iterable<String> iterable) {
            ensurePatternIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.pattern_);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearPattern() {
            this.pattern_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addPatternBytes(ByteString byteString) {
            byteString.getClass();
            ResourceDescriptor.checkByteStringIsUtf8(byteString);
            ensurePatternIsMutable();
            this.pattern_.add(byteString);
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getNameField() {
            Object obj = this.nameField_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nameField_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getNameFieldBytes() {
            Object obj = this.nameField_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nameField_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setNameField(String str) {
            str.getClass();
            this.nameField_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder clearNameField() {
            this.nameField_ = ResourceDescriptor.getDefaultInstance().getNameField();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder setNameFieldBytes(ByteString byteString) {
            byteString.getClass();
            ResourceDescriptor.checkByteStringIsUtf8(byteString);
            this.nameField_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getHistoryValue() {
            return this.history_;
        }

        public Builder setHistoryValue(int i) {
            this.history_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public History getHistory() {
            History historyForNumber = History.forNumber(this.history_);
            return historyForNumber == null ? History.UNRECOGNIZED : historyForNumber;
        }

        public Builder setHistory(History history) {
            history.getClass();
            this.bitField0_ |= 8;
            this.history_ = history.getNumber();
            onChanged();
            return this;
        }

        public Builder clearHistory() {
            this.bitField0_ &= -9;
            this.history_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPlural() {
            Object obj = this.plural_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.plural_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getPluralBytes() {
            Object obj = this.plural_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.plural_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPlural(String str) {
            str.getClass();
            this.plural_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearPlural() {
            this.plural_ = ResourceDescriptor.getDefaultInstance().getPlural();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder setPluralBytes(ByteString byteString) {
            byteString.getClass();
            ResourceDescriptor.checkByteStringIsUtf8(byteString);
            this.plural_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getSingular() {
            Object obj = this.singular_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.singular_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getSingularBytes() {
            Object obj = this.singular_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.singular_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSingular(String str) {
            str.getClass();
            this.singular_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder clearSingular() {
            this.singular_ = ResourceDescriptor.getDefaultInstance().getSingular();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder setSingularBytes(ByteString byteString) {
            byteString.getClass();
            ResourceDescriptor.checkByteStringIsUtf8(byteString);
            this.singular_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        private void ensureStyleIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
                this.style_ = new ArrayList(this.style_);
                this.bitField0_ |= 64;
            }
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public List<Style> getStyleList() {
            return new Internal.ListAdapter(this.style_, ResourceDescriptor.style_converter_);
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getStyleCount() {
            return this.style_.size();
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public Style getStyle(int i) {
            return (Style) ResourceDescriptor.style_converter_.convert(this.style_.get(i));
        }

        public Builder setStyle(int i, Style style) {
            style.getClass();
            ensureStyleIsMutable();
            this.style_.set(i, Integer.valueOf(style.getNumber()));
            onChanged();
            return this;
        }

        public Builder addStyle(Style style) {
            style.getClass();
            ensureStyleIsMutable();
            this.style_.add(Integer.valueOf(style.getNumber()));
            onChanged();
            return this;
        }

        public Builder addAllStyle(Iterable<? extends Style> iterable) {
            ensureStyleIsMutable();
            Iterator<? extends Style> it = iterable.iterator();
            while (it.hasNext()) {
                this.style_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder clearStyle() {
            this.style_ = Collections.emptyList();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public List<Integer> getStyleValueList() {
            return Collections.unmodifiableList(this.style_);
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getStyleValue(int i) {
            return this.style_.get(i).intValue();
        }

        public Builder setStyleValue(int i, int i2) {
            ensureStyleIsMutable();
            this.style_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder addStyleValue(int i) {
            ensureStyleIsMutable();
            this.style_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addAllStyleValue(Iterable<Integer> iterable) {
            ensureStyleIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.style_.add(Integer.valueOf(it.next().intValue()));
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

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ResourceDescriptor> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ResourceDescriptor> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ResourceDescriptor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
