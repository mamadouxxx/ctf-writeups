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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Price extends GeneratedMessageV3 implements PriceOrBuilder {
    public static final int AMOUNT_MICROS_FIELD_NUMBER = 1;
    public static final int CURRENCY_CODE_FIELD_NUMBER = 2;
    private static final Price DEFAULT_INSTANCE = new Price();
    private static final Parser<Price> PARSER = new AbstractParser<Price>() { // from class: com.google.shopping.type.Price.1
        @Override // com.google.protobuf.Parser
        public Price parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Price.newBuilder();
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
    private long amountMicros_;
    private int bitField0_;
    private volatile Object currencyCode_;
    private byte memoizedIsInitialized;

    static /* synthetic */ int access$576(Price price, int i) {
        int i2 = i | price.bitField0_;
        price.bitField0_ = i2;
        return i2;
    }

    private Price(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.amountMicros_ = 0L;
        this.currencyCode_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    private Price() {
        this.amountMicros_ = 0L;
        this.currencyCode_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.currencyCode_ = "";
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Price();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypesProto.internal_static_google_shopping_type_Price_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypesProto.internal_static_google_shopping_type_Price_fieldAccessorTable.ensureFieldAccessorsInitialized(Price.class, Builder.class);
    }

    @Override // com.google.shopping.type.PriceOrBuilder
    public boolean hasAmountMicros() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.shopping.type.PriceOrBuilder
    public long getAmountMicros() {
        return this.amountMicros_;
    }

    @Override // com.google.shopping.type.PriceOrBuilder
    public boolean hasCurrencyCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.shopping.type.PriceOrBuilder
    public String getCurrencyCode() {
        Object obj = this.currencyCode_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.currencyCode_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.shopping.type.PriceOrBuilder
    public ByteString getCurrencyCodeBytes() {
        Object obj = this.currencyCode_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.currencyCode_ = byteStringCopyFromUtf8;
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
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeInt64(1, this.amountMicros_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.currencyCode_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt64Size(1, this.amountMicros_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeInt64Size += GeneratedMessageV3.computeStringSize(2, this.currencyCode_);
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
        if (!(obj instanceof Price)) {
            return super.equals(obj);
        }
        Price price = (Price) obj;
        if (hasAmountMicros() != price.hasAmountMicros()) {
            return false;
        }
        if ((!hasAmountMicros() || getAmountMicros() == price.getAmountMicros()) && hasCurrencyCode() == price.hasCurrencyCode()) {
            return (!hasCurrencyCode() || getCurrencyCode().equals(price.getCurrencyCode())) && getUnknownFields().equals(price.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasAmountMicros()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashLong(getAmountMicros());
        }
        if (hasCurrencyCode()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getCurrencyCode().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Price parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Price parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Price parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Price parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Price parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Price parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Price parseFrom(InputStream inputStream) throws IOException {
        return (Price) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Price parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Price) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Price parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Price) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Price parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Price) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Price parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Price) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Price parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Price) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Price price) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(price);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PriceOrBuilder {
        private long amountMicros_;
        private int bitField0_;
        private Object currencyCode_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypesProto.internal_static_google_shopping_type_Price_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypesProto.internal_static_google_shopping_type_Price_fieldAccessorTable.ensureFieldAccessorsInitialized(Price.class, Builder.class);
        }

        private Builder() {
            this.currencyCode_ = "";
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.currencyCode_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.amountMicros_ = 0L;
            this.currencyCode_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TypesProto.internal_static_google_shopping_type_Price_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Price getDefaultInstanceForType() {
            return Price.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Price build() {
            Price priceBuildPartial = buildPartial();
            if (priceBuildPartial.isInitialized()) {
                return priceBuildPartial;
            }
            throw newUninitializedMessageException((Message) priceBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Price buildPartial() {
            Price price = new Price(this);
            if (this.bitField0_ != 0) {
                buildPartial0(price);
            }
            onBuilt();
            return price;
        }

        private void buildPartial0(Price price) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                price.amountMicros_ = this.amountMicros_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                price.currencyCode_ = this.currencyCode_;
                i |= 2;
            }
            Price.access$576(price, i);
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
            if (message instanceof Price) {
                return mergeFrom((Price) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Price price) {
            if (price == Price.getDefaultInstance()) {
                return this;
            }
            if (price.hasAmountMicros()) {
                setAmountMicros(price.getAmountMicros());
            }
            if (price.hasCurrencyCode()) {
                this.currencyCode_ = price.currencyCode_;
                this.bitField0_ |= 2;
                onChanged();
            }
            mergeUnknownFields(price.getUnknownFields());
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
                                this.amountMicros_ = codedInputStream.readInt64();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.currencyCode_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
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

        @Override // com.google.shopping.type.PriceOrBuilder
        public boolean hasAmountMicros() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.shopping.type.PriceOrBuilder
        public long getAmountMicros() {
            return this.amountMicros_;
        }

        public Builder setAmountMicros(long j) {
            this.amountMicros_ = j;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder clearAmountMicros() {
            this.bitField0_ &= -2;
            this.amountMicros_ = 0L;
            onChanged();
            return this;
        }

        @Override // com.google.shopping.type.PriceOrBuilder
        public boolean hasCurrencyCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.shopping.type.PriceOrBuilder
        public String getCurrencyCode() {
            Object obj = this.currencyCode_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.currencyCode_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.shopping.type.PriceOrBuilder
        public ByteString getCurrencyCodeBytes() {
            Object obj = this.currencyCode_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.currencyCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCurrencyCode(String str) {
            str.getClass();
            this.currencyCode_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder clearCurrencyCode() {
            this.currencyCode_ = Price.getDefaultInstance().getCurrencyCode();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder setCurrencyCodeBytes(ByteString byteString) {
            byteString.getClass();
            Price.checkByteStringIsUtf8(byteString);
            this.currencyCode_ = byteString;
            this.bitField0_ |= 2;
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

    public static Price getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Price> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Price> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Price getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
