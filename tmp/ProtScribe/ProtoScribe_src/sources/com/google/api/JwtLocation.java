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
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class JwtLocation extends GeneratedMessageV3 implements JwtLocationOrBuilder {
    public static final int COOKIE_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int inCase_;
    private Object in_;
    private byte memoizedIsInitialized;
    private volatile Object valuePrefix_;
    private static final JwtLocation DEFAULT_INSTANCE = new JwtLocation();
    private static final Parser<JwtLocation> PARSER = new AbstractParser<JwtLocation>() { // from class: com.google.api.JwtLocation.1
        @Override // com.google.protobuf.Parser
        public JwtLocation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = JwtLocation.newBuilder();
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

    private JwtLocation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.inCase_ = 0;
        this.valuePrefix_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private JwtLocation() {
        this.inCase_ = 0;
        this.valuePrefix_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.valuePrefix_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new JwtLocation();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuthProto.internal_static_google_api_JwtLocation_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuthProto.internal_static_google_api_JwtLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(JwtLocation.class, Builder.class);
    }

    public enum InCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        HEADER(1),
        QUERY(2),
        COOKIE(4),
        IN_NOT_SET(0);

        private final int value;

        InCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static InCase valueOf(int i) {
            return forNumber(i);
        }

        public static InCase forNumber(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i == 2) {
                return QUERY;
            }
            if (i != 4) {
                return null;
            }
            return COOKIE;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public InCase getInCase() {
        return InCase.forNumber(this.inCase_);
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public boolean hasHeader() {
        return this.inCase_ == 1;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getHeader() {
        Object obj;
        if (this.inCase_ != 1) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.inCase_ == 1) {
            this.in_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getHeaderBytes() {
        Object obj;
        if (this.inCase_ != 1) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.inCase_ == 1) {
                this.in_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public boolean hasQuery() {
        return this.inCase_ == 2;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getQuery() {
        Object obj;
        if (this.inCase_ != 2) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.inCase_ == 2) {
            this.in_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getQueryBytes() {
        Object obj;
        if (this.inCase_ != 2) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.inCase_ == 2) {
                this.in_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public boolean hasCookie() {
        return this.inCase_ == 4;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getCookie() {
        Object obj;
        if (this.inCase_ != 4) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.inCase_ == 4) {
            this.in_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getCookieBytes() {
        Object obj;
        if (this.inCase_ != 4) {
            obj = "";
        } else {
            obj = this.in_;
        }
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.inCase_ == 4) {
                this.in_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getValuePrefix() {
        Object obj = this.valuePrefix_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.valuePrefix_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getValuePrefixBytes() {
        Object obj = this.valuePrefix_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.valuePrefix_ = byteStringCopyFromUtf8;
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
        if (this.inCase_ == 1) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.in_);
        }
        if (this.inCase_ == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.in_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.valuePrefix_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.valuePrefix_);
        }
        if (this.inCase_ == 4) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.in_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = this.inCase_ == 1 ? GeneratedMessageV3.computeStringSize(1, this.in_) : 0;
        if (this.inCase_ == 2) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.in_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.valuePrefix_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.valuePrefix_);
        }
        if (this.inCase_ == 4) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.in_);
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
        if (!(obj instanceof JwtLocation)) {
            return super.equals(obj);
        }
        JwtLocation jwtLocation = (JwtLocation) obj;
        if (!getValuePrefix().equals(jwtLocation.getValuePrefix()) || !getInCase().equals(jwtLocation.getInCase())) {
            return false;
        }
        int i = this.inCase_;
        if (i != 1) {
            if (i == 2) {
                if (!getQuery().equals(jwtLocation.getQuery())) {
                    return false;
                }
            } else if (i == 4 && !getCookie().equals(jwtLocation.getCookie())) {
                return false;
            }
        } else if (!getHeader().equals(jwtLocation.getHeader())) {
            return false;
        }
        return getUnknownFields().equals(jwtLocation.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int iHashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode2 = ((((779 + getDescriptor().hashCode()) * 37) + 3) * 53) + getValuePrefix().hashCode();
        int i2 = this.inCase_;
        if (i2 == 1) {
            i = ((iHashCode2 * 37) + 1) * 53;
            iHashCode = getHeader().hashCode();
        } else if (i2 == 2) {
            i = ((iHashCode2 * 37) + 2) * 53;
            iHashCode = getQuery().hashCode();
        } else {
            if (i2 == 4) {
                i = ((iHashCode2 * 37) + 4) * 53;
                iHashCode = getCookie().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        iHashCode2 = i + iHashCode;
        int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode32;
        return iHashCode32;
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static JwtLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static JwtLocation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(JwtLocation jwtLocation) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(jwtLocation);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements JwtLocationOrBuilder {
        private int bitField0_;
        private int inCase_;
        private Object in_;
        private Object valuePrefix_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuthProto.internal_static_google_api_JwtLocation_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuthProto.internal_static_google_api_JwtLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(JwtLocation.class, Builder.class);
        }

        private Builder() {
            this.inCase_ = 0;
            this.valuePrefix_ = "";
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.inCase_ = 0;
            this.valuePrefix_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.valuePrefix_ = "";
            this.inCase_ = 0;
            this.in_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuthProto.internal_static_google_api_JwtLocation_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public JwtLocation getDefaultInstanceForType() {
            return JwtLocation.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public JwtLocation build() {
            JwtLocation jwtLocationBuildPartial = buildPartial();
            if (jwtLocationBuildPartial.isInitialized()) {
                return jwtLocationBuildPartial;
            }
            throw newUninitializedMessageException((Message) jwtLocationBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public JwtLocation buildPartial() {
            JwtLocation jwtLocation = new JwtLocation(this);
            if (this.bitField0_ != 0) {
                buildPartial0(jwtLocation);
            }
            buildPartialOneofs(jwtLocation);
            onBuilt();
            return jwtLocation;
        }

        private void buildPartial0(JwtLocation jwtLocation) {
            if ((this.bitField0_ & 8) != 0) {
                jwtLocation.valuePrefix_ = this.valuePrefix_;
            }
        }

        private void buildPartialOneofs(JwtLocation jwtLocation) {
            jwtLocation.inCase_ = this.inCase_;
            jwtLocation.in_ = this.in_;
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
            if (message instanceof JwtLocation) {
                return mergeFrom((JwtLocation) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(JwtLocation jwtLocation) {
            if (jwtLocation == JwtLocation.getDefaultInstance()) {
                return this;
            }
            if (!jwtLocation.getValuePrefix().isEmpty()) {
                this.valuePrefix_ = jwtLocation.valuePrefix_;
                this.bitField0_ |= 8;
                onChanged();
            }
            int i = AnonymousClass2.$SwitchMap$com$google$api$JwtLocation$InCase[jwtLocation.getInCase().ordinal()];
            if (i == 1) {
                this.inCase_ = 1;
                this.in_ = jwtLocation.in_;
                onChanged();
            } else if (i == 2) {
                this.inCase_ = 2;
                this.in_ = jwtLocation.in_;
                onChanged();
            } else if (i == 3) {
                this.inCase_ = 4;
                this.in_ = jwtLocation.in_;
                onChanged();
            }
            mergeUnknownFields(jwtLocation.getUnknownFields());
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
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                this.inCase_ = 1;
                                this.in_ = stringRequireUtf8;
                            } else if (tag == 18) {
                                String stringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                this.inCase_ = 2;
                                this.in_ = stringRequireUtf82;
                            } else if (tag == 26) {
                                this.valuePrefix_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 34) {
                                String stringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                                this.inCase_ = 4;
                                this.in_ = stringRequireUtf83;
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

        @Override // com.google.api.JwtLocationOrBuilder
        public InCase getInCase() {
            return InCase.forNumber(this.inCase_);
        }

        public Builder clearIn() {
            this.inCase_ = 0;
            this.in_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public boolean hasHeader() {
            return this.inCase_ == 1;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getHeader() {
            Object obj;
            if (this.inCase_ != 1) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.inCase_ == 1) {
                    this.in_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getHeaderBytes() {
            Object obj;
            if (this.inCase_ != 1) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.inCase_ == 1) {
                    this.in_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setHeader(String str) {
            str.getClass();
            this.inCase_ = 1;
            this.in_ = str;
            onChanged();
            return this;
        }

        public Builder clearHeader() {
            if (this.inCase_ == 1) {
                this.inCase_ = 0;
                this.in_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setHeaderBytes(ByteString byteString) {
            byteString.getClass();
            JwtLocation.checkByteStringIsUtf8(byteString);
            this.inCase_ = 1;
            this.in_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public boolean hasQuery() {
            return this.inCase_ == 2;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getQuery() {
            Object obj;
            if (this.inCase_ != 2) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.inCase_ == 2) {
                    this.in_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getQueryBytes() {
            Object obj;
            if (this.inCase_ != 2) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.inCase_ == 2) {
                    this.in_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setQuery(String str) {
            str.getClass();
            this.inCase_ = 2;
            this.in_ = str;
            onChanged();
            return this;
        }

        public Builder clearQuery() {
            if (this.inCase_ == 2) {
                this.inCase_ = 0;
                this.in_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setQueryBytes(ByteString byteString) {
            byteString.getClass();
            JwtLocation.checkByteStringIsUtf8(byteString);
            this.inCase_ = 2;
            this.in_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public boolean hasCookie() {
            return this.inCase_ == 4;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getCookie() {
            Object obj;
            if (this.inCase_ != 4) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.inCase_ == 4) {
                    this.in_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getCookieBytes() {
            Object obj;
            if (this.inCase_ != 4) {
                obj = "";
            } else {
                obj = this.in_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.inCase_ == 4) {
                    this.in_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCookie(String str) {
            str.getClass();
            this.inCase_ = 4;
            this.in_ = str;
            onChanged();
            return this;
        }

        public Builder clearCookie() {
            if (this.inCase_ == 4) {
                this.inCase_ = 0;
                this.in_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setCookieBytes(ByteString byteString) {
            byteString.getClass();
            JwtLocation.checkByteStringIsUtf8(byteString);
            this.inCase_ = 4;
            this.in_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getValuePrefix() {
            Object obj = this.valuePrefix_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.valuePrefix_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getValuePrefixBytes() {
            Object obj = this.valuePrefix_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.valuePrefix_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setValuePrefix(String str) {
            str.getClass();
            this.valuePrefix_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearValuePrefix() {
            this.valuePrefix_ = JwtLocation.getDefaultInstance().getValuePrefix();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder setValuePrefixBytes(ByteString byteString) {
            byteString.getClass();
            JwtLocation.checkByteStringIsUtf8(byteString);
            this.valuePrefix_ = byteString;
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

    /* JADX INFO: renamed from: com.google.api.JwtLocation$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$api$JwtLocation$InCase;

        static {
            int[] iArr = new int[InCase.values().length];
            $SwitchMap$com$google$api$JwtLocation$InCase = iArr;
            try {
                iArr[InCase.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$api$JwtLocation$InCase[InCase.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$api$JwtLocation$InCase[InCase.COOKIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$api$JwtLocation$InCase[InCase.IN_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<JwtLocation> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<JwtLocation> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public JwtLocation getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
