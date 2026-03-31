package com.google.apps.card.v1;

import com.google.apps.card.v1.Button;
import com.google.apps.card.v1.OnClick;
import com.google.apps.card.v1.Widget;
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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Card extends GeneratedMessageV3 implements CardOrBuilder {
    public static final int CARD_ACTIONS_FIELD_NUMBER = 3;
    public static final int DISPLAY_STYLE_FIELD_NUMBER = 6;
    public static final int FIXED_FOOTER_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PEEK_CARD_HEADER_FIELD_NUMBER = 7;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    public static final int SECTION_DIVIDER_STYLE_FIELD_NUMBER = 9;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private List<CardAction> cardActions_;
    private int displayStyle_;
    private CardFixedFooter fixedFooter_;
    private CardHeader header_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private CardHeader peekCardHeader_;
    private int sectionDividerStyle_;
    private List<Section> sections_;
    private static final Card DEFAULT_INSTANCE = new Card();
    private static final Parser<Card> PARSER = new AbstractParser<Card>() { // from class: com.google.apps.card.v1.Card.1
        @Override // com.google.protobuf.Parser
        public Card parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Card.newBuilder();
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

    public interface CardActionOrBuilder extends MessageOrBuilder {
        String getActionLabel();

        ByteString getActionLabelBytes();

        OnClick getOnClick();

        OnClickOrBuilder getOnClickOrBuilder();

        boolean hasOnClick();
    }

    public interface CardFixedFooterOrBuilder extends MessageOrBuilder {
        Button getPrimaryButton();

        ButtonOrBuilder getPrimaryButtonOrBuilder();

        Button getSecondaryButton();

        ButtonOrBuilder getSecondaryButtonOrBuilder();

        boolean hasPrimaryButton();

        boolean hasSecondaryButton();
    }

    public interface CardHeaderOrBuilder extends MessageOrBuilder {
        String getImageAltText();

        ByteString getImageAltTextBytes();

        Widget.ImageType getImageType();

        int getImageTypeValue();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getSubtitle();

        ByteString getSubtitleBytes();

        String getTitle();

        ByteString getTitleBytes();
    }

    public interface SectionOrBuilder extends MessageOrBuilder {
        boolean getCollapsible();

        String getHeader();

        ByteString getHeaderBytes();

        int getUncollapsibleWidgetsCount();

        Widget getWidgets(int i);

        int getWidgetsCount();

        List<Widget> getWidgetsList();

        WidgetOrBuilder getWidgetsOrBuilder(int i);

        List<? extends WidgetOrBuilder> getWidgetsOrBuilderList();
    }

    static /* synthetic */ int access$4876(Card card, int i) {
        int i2 = i | card.bitField0_;
        card.bitField0_ = i2;
        return i2;
    }

    private Card(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.sectionDividerStyle_ = 0;
        this.name_ = "";
        this.displayStyle_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Card() {
        this.sectionDividerStyle_ = 0;
        this.name_ = "";
        this.displayStyle_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.sections_ = Collections.emptyList();
        this.sectionDividerStyle_ = 0;
        this.cardActions_ = Collections.emptyList();
        this.name_ = "";
        this.displayStyle_ = 0;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Card();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Card_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Card_fieldAccessorTable.ensureFieldAccessorsInitialized(Card.class, Builder.class);
    }

    public enum DividerStyle implements ProtocolMessageEnum {
        DIVIDER_STYLE_UNSPECIFIED(0),
        SOLID_DIVIDER(1),
        NO_DIVIDER(2),
        UNRECOGNIZED(-1);

        public static final int DIVIDER_STYLE_UNSPECIFIED_VALUE = 0;
        public static final int NO_DIVIDER_VALUE = 2;
        public static final int SOLID_DIVIDER_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<DividerStyle> internalValueMap = new Internal.EnumLiteMap<DividerStyle>() { // from class: com.google.apps.card.v1.Card.DividerStyle.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DividerStyle findValueByNumber(int i) {
                return DividerStyle.forNumber(i);
            }
        };
        private static final DividerStyle[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DividerStyle valueOf(int i) {
            return forNumber(i);
        }

        public static DividerStyle forNumber(int i) {
            if (i == 0) {
                return DIVIDER_STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return SOLID_DIVIDER;
            }
            if (i != 2) {
                return null;
            }
            return NO_DIVIDER;
        }

        public static Internal.EnumLiteMap<DividerStyle> internalGetValueMap() {
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
            return Card.getDescriptor().getEnumTypes().get(0);
        }

        public static DividerStyle valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        DividerStyle(int i) {
            this.value = i;
        }
    }

    public enum DisplayStyle implements ProtocolMessageEnum {
        DISPLAY_STYLE_UNSPECIFIED(0),
        PEEK(1),
        REPLACE(2),
        UNRECOGNIZED(-1);

        public static final int DISPLAY_STYLE_UNSPECIFIED_VALUE = 0;
        public static final int PEEK_VALUE = 1;
        public static final int REPLACE_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<DisplayStyle> internalValueMap = new Internal.EnumLiteMap<DisplayStyle>() { // from class: com.google.apps.card.v1.Card.DisplayStyle.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DisplayStyle findValueByNumber(int i) {
                return DisplayStyle.forNumber(i);
            }
        };
        private static final DisplayStyle[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static DisplayStyle valueOf(int i) {
            return forNumber(i);
        }

        public static DisplayStyle forNumber(int i) {
            if (i == 0) {
                return DISPLAY_STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return PEEK;
            }
            if (i != 2) {
                return null;
            }
            return REPLACE;
        }

        public static Internal.EnumLiteMap<DisplayStyle> internalGetValueMap() {
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
            return Card.getDescriptor().getEnumTypes().get(1);
        }

        public static DisplayStyle valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        DisplayStyle(int i) {
            this.value = i;
        }
    }

    public static final class CardHeader extends GeneratedMessageV3 implements CardHeaderOrBuilder {
        public static final int IMAGE_ALT_TEXT_FIELD_NUMBER = 5;
        public static final int IMAGE_TYPE_FIELD_NUMBER = 3;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object imageAltText_;
        private int imageType_;
        private volatile Object imageUrl_;
        private byte memoizedIsInitialized;
        private volatile Object subtitle_;
        private volatile Object title_;
        private static final CardHeader DEFAULT_INSTANCE = new CardHeader();
        private static final Parser<CardHeader> PARSER = new AbstractParser<CardHeader>() { // from class: com.google.apps.card.v1.Card.CardHeader.1
            @Override // com.google.protobuf.Parser
            public CardHeader parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CardHeader.newBuilder();
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

        private CardHeader(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.title_ = "";
            this.subtitle_ = "";
            this.imageType_ = 0;
            this.imageUrl_ = "";
            this.imageAltText_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private CardHeader() {
            this.title_ = "";
            this.subtitle_ = "";
            this.imageType_ = 0;
            this.imageUrl_ = "";
            this.imageAltText_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.subtitle_ = "";
            this.imageType_ = 0;
            this.imageUrl_ = "";
            this.imageAltText_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CardHeader();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardHeader_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(CardHeader.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public String getSubtitle() {
            Object obj = this.subtitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.subtitle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public ByteString getSubtitleBytes() {
            Object obj = this.subtitle_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subtitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public int getImageTypeValue() {
            return this.imageType_;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public Widget.ImageType getImageType() {
            Widget.ImageType imageTypeForNumber = Widget.ImageType.forNumber(this.imageType_);
            return imageTypeForNumber == null ? Widget.ImageType.UNRECOGNIZED : imageTypeForNumber;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public String getImageUrl() {
            Object obj = this.imageUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imageUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public ByteString getImageUrlBytes() {
            Object obj = this.imageUrl_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imageUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public String getImageAltText() {
            Object obj = this.imageAltText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imageAltText_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
        public ByteString getImageAltTextBytes() {
            Object obj = this.imageAltText_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imageAltText_ = byteStringCopyFromUtf8;
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
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.subtitle_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.subtitle_);
            }
            if (this.imageType_ != Widget.ImageType.SQUARE.getNumber()) {
                codedOutputStream.writeEnum(3, this.imageType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.imageUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.imageAltText_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.imageAltText_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.title_) ? GeneratedMessageV3.computeStringSize(1, this.title_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.subtitle_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.subtitle_);
            }
            if (this.imageType_ != Widget.ImageType.SQUARE.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.imageType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.imageUrl_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.imageAltText_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.imageAltText_);
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
            if (!(obj instanceof CardHeader)) {
                return super.equals(obj);
            }
            CardHeader cardHeader = (CardHeader) obj;
            return getTitle().equals(cardHeader.getTitle()) && getSubtitle().equals(cardHeader.getSubtitle()) && this.imageType_ == cardHeader.imageType_ && getImageUrl().equals(cardHeader.getImageUrl()) && getImageAltText().equals(cardHeader.getImageAltText()) && getUnknownFields().equals(cardHeader.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode()) * 37) + 2) * 53) + getSubtitle().hashCode()) * 37) + 3) * 53) + this.imageType_) * 37) + 4) * 53) + getImageUrl().hashCode()) * 37) + 5) * 53) + getImageAltText().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        public static CardHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CardHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CardHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CardHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CardHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CardHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CardHeader parseFrom(InputStream inputStream) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CardHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CardHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CardHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CardHeader cardHeader) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cardHeader);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardHeaderOrBuilder {
            private int bitField0_;
            private Object imageAltText_;
            private int imageType_;
            private Object imageUrl_;
            private Object subtitle_;
            private Object title_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardHeader_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(CardHeader.class, Builder.class);
            }

            private Builder() {
                this.title_ = "";
                this.subtitle_ = "";
                this.imageType_ = 0;
                this.imageUrl_ = "";
                this.imageAltText_ = "";
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.subtitle_ = "";
                this.imageType_ = 0;
                this.imageUrl_ = "";
                this.imageAltText_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.title_ = "";
                this.subtitle_ = "";
                this.imageType_ = 0;
                this.imageUrl_ = "";
                this.imageAltText_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardHeader_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CardHeader getDefaultInstanceForType() {
                return CardHeader.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardHeader build() {
                CardHeader cardHeaderBuildPartial = buildPartial();
                if (cardHeaderBuildPartial.isInitialized()) {
                    return cardHeaderBuildPartial;
                }
                throw newUninitializedMessageException((Message) cardHeaderBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardHeader buildPartial() {
                CardHeader cardHeader = new CardHeader(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cardHeader);
                }
                onBuilt();
                return cardHeader;
            }

            private void buildPartial0(CardHeader cardHeader) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    cardHeader.title_ = this.title_;
                }
                if ((i & 2) != 0) {
                    cardHeader.subtitle_ = this.subtitle_;
                }
                if ((i & 4) != 0) {
                    cardHeader.imageType_ = this.imageType_;
                }
                if ((i & 8) != 0) {
                    cardHeader.imageUrl_ = this.imageUrl_;
                }
                if ((i & 16) != 0) {
                    cardHeader.imageAltText_ = this.imageAltText_;
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
                if (message instanceof CardHeader) {
                    return mergeFrom((CardHeader) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CardHeader cardHeader) {
                if (cardHeader == CardHeader.getDefaultInstance()) {
                    return this;
                }
                if (!cardHeader.getTitle().isEmpty()) {
                    this.title_ = cardHeader.title_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!cardHeader.getSubtitle().isEmpty()) {
                    this.subtitle_ = cardHeader.subtitle_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (cardHeader.imageType_ != 0) {
                    setImageTypeValue(cardHeader.getImageTypeValue());
                }
                if (!cardHeader.getImageUrl().isEmpty()) {
                    this.imageUrl_ = cardHeader.imageUrl_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!cardHeader.getImageAltText().isEmpty()) {
                    this.imageAltText_ = cardHeader.imageAltText_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(cardHeader.getUnknownFields());
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
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.subtitle_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.imageType_ = codedInputStream.readEnum();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.imageUrl_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.imageAltText_ = codedInputStream.readStringRequireUtf8();
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

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = CardHeader.getDefaultInstance().getTitle();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                CardHeader.checkByteStringIsUtf8(byteString);
                this.title_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public String getSubtitle() {
                Object obj = this.subtitle_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.subtitle_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public ByteString getSubtitleBytes() {
                Object obj = this.subtitle_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.subtitle_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setSubtitle(String str) {
                str.getClass();
                this.subtitle_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearSubtitle() {
                this.subtitle_ = CardHeader.getDefaultInstance().getSubtitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder setSubtitleBytes(ByteString byteString) {
                byteString.getClass();
                CardHeader.checkByteStringIsUtf8(byteString);
                this.subtitle_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public int getImageTypeValue() {
                return this.imageType_;
            }

            public Builder setImageTypeValue(int i) {
                this.imageType_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public Widget.ImageType getImageType() {
                Widget.ImageType imageTypeForNumber = Widget.ImageType.forNumber(this.imageType_);
                return imageTypeForNumber == null ? Widget.ImageType.UNRECOGNIZED : imageTypeForNumber;
            }

            public Builder setImageType(Widget.ImageType imageType) {
                imageType.getClass();
                this.bitField0_ |= 4;
                this.imageType_ = imageType.getNumber();
                onChanged();
                return this;
            }

            public Builder clearImageType() {
                this.bitField0_ &= -5;
                this.imageType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public String getImageUrl() {
                Object obj = this.imageUrl_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.imageUrl_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public ByteString getImageUrlBytes() {
                Object obj = this.imageUrl_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.imageUrl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setImageUrl(String str) {
                str.getClass();
                this.imageUrl_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearImageUrl() {
                this.imageUrl_ = CardHeader.getDefaultInstance().getImageUrl();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setImageUrlBytes(ByteString byteString) {
                byteString.getClass();
                CardHeader.checkByteStringIsUtf8(byteString);
                this.imageUrl_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public String getImageAltText() {
                Object obj = this.imageAltText_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.imageAltText_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.CardHeaderOrBuilder
            public ByteString getImageAltTextBytes() {
                Object obj = this.imageAltText_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.imageAltText_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setImageAltText(String str) {
                str.getClass();
                this.imageAltText_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder clearImageAltText() {
                this.imageAltText_ = CardHeader.getDefaultInstance().getImageAltText();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder setImageAltTextBytes(ByteString byteString) {
                byteString.getClass();
                CardHeader.checkByteStringIsUtf8(byteString);
                this.imageAltText_ = byteString;
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

        public static CardHeader getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CardHeader> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CardHeader> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CardHeader getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Section extends GeneratedMessageV3 implements SectionOrBuilder {
        public static final int COLLAPSIBLE_FIELD_NUMBER = 5;
        public static final int HEADER_FIELD_NUMBER = 1;
        public static final int UNCOLLAPSIBLE_WIDGETS_COUNT_FIELD_NUMBER = 6;
        public static final int WIDGETS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean collapsible_;
        private volatile Object header_;
        private byte memoizedIsInitialized;
        private int uncollapsibleWidgetsCount_;
        private List<Widget> widgets_;
        private static final Section DEFAULT_INSTANCE = new Section();
        private static final Parser<Section> PARSER = new AbstractParser<Section>() { // from class: com.google.apps.card.v1.Card.Section.1
            @Override // com.google.protobuf.Parser
            public Section parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Section.newBuilder();
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

        private Section(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.header_ = "";
            this.collapsible_ = false;
            this.uncollapsibleWidgetsCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private Section() {
            this.header_ = "";
            this.collapsible_ = false;
            this.uncollapsibleWidgetsCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.header_ = "";
            this.widgets_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Section();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Card_Section_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Card_Section_fieldAccessorTable.ensureFieldAccessorsInitialized(Section.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public String getHeader() {
            Object obj = this.header_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.header_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public ByteString getHeaderBytes() {
            Object obj = this.header_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.header_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public List<Widget> getWidgetsList() {
            return this.widgets_;
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public List<? extends WidgetOrBuilder> getWidgetsOrBuilderList() {
            return this.widgets_;
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public int getWidgetsCount() {
            return this.widgets_.size();
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public Widget getWidgets(int i) {
            return this.widgets_.get(i);
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public WidgetOrBuilder getWidgetsOrBuilder(int i) {
            return this.widgets_.get(i);
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public boolean getCollapsible() {
            return this.collapsible_;
        }

        @Override // com.google.apps.card.v1.Card.SectionOrBuilder
        public int getUncollapsibleWidgetsCount() {
            return this.uncollapsibleWidgetsCount_;
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
            if (!GeneratedMessageV3.isStringEmpty(this.header_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.header_);
            }
            for (int i = 0; i < this.widgets_.size(); i++) {
                codedOutputStream.writeMessage(2, this.widgets_.get(i));
            }
            boolean z = this.collapsible_;
            if (z) {
                codedOutputStream.writeBool(5, z);
            }
            int i2 = this.uncollapsibleWidgetsCount_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(6, i2);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.header_) ? GeneratedMessageV3.computeStringSize(1, this.header_) : 0;
            for (int i2 = 0; i2 < this.widgets_.size(); i2++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.widgets_.get(i2));
            }
            boolean z = this.collapsible_;
            if (z) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(5, z);
            }
            int i3 = this.uncollapsibleWidgetsCount_;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(6, i3);
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
            if (!(obj instanceof Section)) {
                return super.equals(obj);
            }
            Section section = (Section) obj;
            return getHeader().equals(section.getHeader()) && getWidgetsList().equals(section.getWidgetsList()) && getCollapsible() == section.getCollapsible() && getUncollapsibleWidgetsCount() == section.getUncollapsibleWidgetsCount() && getUnknownFields().equals(section.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getHeader().hashCode();
            if (getWidgetsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getWidgetsList().hashCode();
            }
            int iHashBoolean = (((((((((iHashCode * 37) + 5) * 53) + Internal.hashBoolean(getCollapsible())) * 37) + 6) * 53) + getUncollapsibleWidgetsCount()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashBoolean;
            return iHashBoolean;
        }

        public static Section parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Section parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Section parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Section parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Section parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Section parseFrom(InputStream inputStream) throws IOException {
            return (Section) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Section parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Section) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Section parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Section) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Section parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Section) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Section parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Section) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Section parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Section) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Section section) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(section);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SectionOrBuilder {
            private int bitField0_;
            private boolean collapsible_;
            private Object header_;
            private int uncollapsibleWidgetsCount_;
            private RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> widgetsBuilder_;
            private List<Widget> widgets_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Card_Section_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Card_Section_fieldAccessorTable.ensureFieldAccessorsInitialized(Section.class, Builder.class);
            }

            private Builder() {
                this.header_ = "";
                this.widgets_ = Collections.emptyList();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.header_ = "";
                this.widgets_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.header_ = "";
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.widgets_ = Collections.emptyList();
                } else {
                    this.widgets_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.collapsible_ = false;
                this.uncollapsibleWidgetsCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Card_Section_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Section getDefaultInstanceForType() {
                return Section.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Section build() {
                Section sectionBuildPartial = buildPartial();
                if (sectionBuildPartial.isInitialized()) {
                    return sectionBuildPartial;
                }
                throw newUninitializedMessageException((Message) sectionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Section buildPartial() {
                Section section = new Section(this);
                buildPartialRepeatedFields(section);
                if (this.bitField0_ != 0) {
                    buildPartial0(section);
                }
                onBuilt();
                return section;
            }

            private void buildPartialRepeatedFields(Section section) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    section.widgets_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.widgets_ = Collections.unmodifiableList(this.widgets_);
                    this.bitField0_ &= -3;
                }
                section.widgets_ = this.widgets_;
            }

            private void buildPartial0(Section section) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    section.header_ = this.header_;
                }
                if ((i & 4) != 0) {
                    section.collapsible_ = this.collapsible_;
                }
                if ((i & 8) != 0) {
                    section.uncollapsibleWidgetsCount_ = this.uncollapsibleWidgetsCount_;
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
                if (message instanceof Section) {
                    return mergeFrom((Section) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Section section) {
                if (section == Section.getDefaultInstance()) {
                    return this;
                }
                if (!section.getHeader().isEmpty()) {
                    this.header_ = section.header_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.widgetsBuilder_ == null) {
                    if (!section.widgets_.isEmpty()) {
                        if (this.widgets_.isEmpty()) {
                            this.widgets_ = section.widgets_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureWidgetsIsMutable();
                            this.widgets_.addAll(section.widgets_);
                        }
                        onChanged();
                    }
                } else if (!section.widgets_.isEmpty()) {
                    if (!this.widgetsBuilder_.isEmpty()) {
                        this.widgetsBuilder_.addAllMessages(section.widgets_);
                    } else {
                        this.widgetsBuilder_.dispose();
                        this.widgetsBuilder_ = null;
                        this.widgets_ = section.widgets_;
                        this.bitField0_ &= -3;
                        this.widgetsBuilder_ = Section.alwaysUseFieldBuilders ? getWidgetsFieldBuilder() : null;
                    }
                }
                if (section.getCollapsible()) {
                    setCollapsible(section.getCollapsible());
                }
                if (section.getUncollapsibleWidgetsCount() != 0) {
                    setUncollapsibleWidgetsCount(section.getUncollapsibleWidgetsCount());
                }
                mergeUnknownFields(section.getUnknownFields());
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
                                    this.header_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    Widget widget = (Widget) codedInputStream.readMessage(Widget.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureWidgetsIsMutable();
                                        this.widgets_.add(widget);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(widget);
                                    }
                                } else if (tag == 40) {
                                    this.collapsible_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 48) {
                                    this.uncollapsibleWidgetsCount_ = codedInputStream.readInt32();
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

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public String getHeader() {
                Object obj = this.header_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.header_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public ByteString getHeaderBytes() {
                Object obj = this.header_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.header_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setHeader(String str) {
                str.getClass();
                this.header_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearHeader() {
                this.header_ = Section.getDefaultInstance().getHeader();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setHeaderBytes(ByteString byteString) {
                byteString.getClass();
                Section.checkByteStringIsUtf8(byteString);
                this.header_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private void ensureWidgetsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.widgets_ = new ArrayList(this.widgets_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public List<Widget> getWidgetsList() {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.widgets_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public int getWidgetsCount() {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public Widget getWidgets(int i) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.get(i);
                }
                return (Widget) repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setWidgets(int i, Widget widget) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widget.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.set(i, widget);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, widget);
                }
                return this;
            }

            public Builder setWidgets(int i, Widget.Builder builder) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addWidgets(Widget widget) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widget.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.add(widget);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(widget);
                }
                return this;
            }

            public Builder addWidgets(int i, Widget widget) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    widget.getClass();
                    ensureWidgetsIsMutable();
                    this.widgets_.add(i, widget);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, widget);
                }
                return this;
            }

            public Builder addWidgets(Widget.Builder builder) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addWidgets(int i, Widget.Builder builder) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllWidgets(Iterable<? extends Widget> iterable) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.widgets_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearWidgets() {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.widgets_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeWidgets(int i) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureWidgetsIsMutable();
                    this.widgets_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Widget.Builder getWidgetsBuilder(int i) {
                return (Widget.Builder) getWidgetsFieldBuilder().getBuilder(i);
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public WidgetOrBuilder getWidgetsOrBuilder(int i) {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.widgets_.get(i);
                }
                return (WidgetOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public List<? extends WidgetOrBuilder> getWidgetsOrBuilderList() {
                RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> repeatedFieldBuilderV3 = this.widgetsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.widgets_);
            }

            public Widget.Builder addWidgetsBuilder() {
                return (Widget.Builder) getWidgetsFieldBuilder().addBuilder(Widget.getDefaultInstance());
            }

            public Widget.Builder addWidgetsBuilder(int i) {
                return (Widget.Builder) getWidgetsFieldBuilder().addBuilder(i, Widget.getDefaultInstance());
            }

            public List<Widget.Builder> getWidgetsBuilderList() {
                return getWidgetsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Widget, Widget.Builder, WidgetOrBuilder> getWidgetsFieldBuilder() {
                if (this.widgetsBuilder_ == null) {
                    this.widgetsBuilder_ = new RepeatedFieldBuilderV3<>(this.widgets_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.widgets_ = null;
                }
                return this.widgetsBuilder_;
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public boolean getCollapsible() {
                return this.collapsible_;
            }

            public Builder setCollapsible(boolean z) {
                this.collapsible_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearCollapsible() {
                this.bitField0_ &= -5;
                this.collapsible_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.SectionOrBuilder
            public int getUncollapsibleWidgetsCount() {
                return this.uncollapsibleWidgetsCount_;
            }

            public Builder setUncollapsibleWidgetsCount(int i) {
                this.uncollapsibleWidgetsCount_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearUncollapsibleWidgetsCount() {
                this.bitField0_ &= -9;
                this.uncollapsibleWidgetsCount_ = 0;
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

        public static Section getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Section> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Section> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Section getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CardAction extends GeneratedMessageV3 implements CardActionOrBuilder {
        public static final int ACTION_LABEL_FIELD_NUMBER = 1;
        public static final int ON_CLICK_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object actionLabel_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private OnClick onClick_;
        private static final CardAction DEFAULT_INSTANCE = new CardAction();
        private static final Parser<CardAction> PARSER = new AbstractParser<CardAction>() { // from class: com.google.apps.card.v1.Card.CardAction.1
            @Override // com.google.protobuf.Parser
            public CardAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CardAction.newBuilder();
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

        static /* synthetic */ int access$2776(CardAction cardAction, int i) {
            int i2 = i | cardAction.bitField0_;
            cardAction.bitField0_ = i2;
            return i2;
        }

        private CardAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.actionLabel_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        private CardAction() {
            this.actionLabel_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.actionLabel_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CardAction();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardAction_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardAction_fieldAccessorTable.ensureFieldAccessorsInitialized(CardAction.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
        public String getActionLabel() {
            Object obj = this.actionLabel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.actionLabel_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
        public ByteString getActionLabelBytes() {
            Object obj = this.actionLabel_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.actionLabel_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
        public boolean hasOnClick() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
        public OnClick getOnClick() {
            OnClick onClick = this.onClick_;
            return onClick == null ? OnClick.getDefaultInstance() : onClick;
        }

        @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
        public OnClickOrBuilder getOnClickOrBuilder() {
            OnClick onClick = this.onClick_;
            return onClick == null ? OnClick.getDefaultInstance() : onClick;
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
            if (!GeneratedMessageV3.isStringEmpty(this.actionLabel_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.actionLabel_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getOnClick());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.actionLabel_) ? GeneratedMessageV3.computeStringSize(1, this.actionLabel_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getOnClick());
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
            if (!(obj instanceof CardAction)) {
                return super.equals(obj);
            }
            CardAction cardAction = (CardAction) obj;
            if (getActionLabel().equals(cardAction.getActionLabel()) && hasOnClick() == cardAction.hasOnClick()) {
                return (!hasOnClick() || getOnClick().equals(cardAction.getOnClick())) && getUnknownFields().equals(cardAction.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getActionLabel().hashCode();
            if (hasOnClick()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getOnClick().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static CardAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CardAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CardAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CardAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CardAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CardAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CardAction parseFrom(InputStream inputStream) throws IOException {
            return (CardAction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CardAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardAction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardAction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CardAction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CardAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardAction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardAction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CardAction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CardAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardAction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CardAction cardAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cardAction);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardActionOrBuilder {
            private Object actionLabel_;
            private int bitField0_;
            private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> onClickBuilder_;
            private OnClick onClick_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardAction_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardAction_fieldAccessorTable.ensureFieldAccessorsInitialized(CardAction.class, Builder.class);
            }

            private Builder() {
                this.actionLabel_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.actionLabel_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CardAction.alwaysUseFieldBuilders) {
                    getOnClickFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.actionLabel_ = "";
                this.onClick_ = null;
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.onClickBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardAction_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CardAction getDefaultInstanceForType() {
                return CardAction.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardAction build() {
                CardAction cardActionBuildPartial = buildPartial();
                if (cardActionBuildPartial.isInitialized()) {
                    return cardActionBuildPartial;
                }
                throw newUninitializedMessageException((Message) cardActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardAction buildPartial() {
                CardAction cardAction = new CardAction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cardAction);
                }
                onBuilt();
                return cardAction;
            }

            private void buildPartial0(CardAction cardAction) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    cardAction.actionLabel_ = this.actionLabel_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                    cardAction.onClick_ = singleFieldBuilderV3 == null ? this.onClick_ : (OnClick) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                CardAction.access$2776(cardAction, i);
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
                if (message instanceof CardAction) {
                    return mergeFrom((CardAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CardAction cardAction) {
                if (cardAction == CardAction.getDefaultInstance()) {
                    return this;
                }
                if (!cardAction.getActionLabel().isEmpty()) {
                    this.actionLabel_ = cardAction.actionLabel_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (cardAction.hasOnClick()) {
                    mergeOnClick(cardAction.getOnClick());
                }
                mergeUnknownFields(cardAction.getUnknownFields());
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
                                    this.actionLabel_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getOnClickFieldBuilder().getBuilder(), extensionRegistryLite);
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

            @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
            public String getActionLabel() {
                Object obj = this.actionLabel_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.actionLabel_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
            public ByteString getActionLabelBytes() {
                Object obj = this.actionLabel_;
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.actionLabel_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setActionLabel(String str) {
                str.getClass();
                this.actionLabel_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder clearActionLabel() {
                this.actionLabel_ = CardAction.getDefaultInstance().getActionLabel();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setActionLabelBytes(ByteString byteString) {
                byteString.getClass();
                CardAction.checkByteStringIsUtf8(byteString);
                this.actionLabel_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
            public boolean hasOnClick() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
            public OnClick getOnClick() {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 == null) {
                    OnClick onClick = this.onClick_;
                    return onClick == null ? OnClick.getDefaultInstance() : onClick;
                }
                return (OnClick) singleFieldBuilderV3.getMessage();
            }

            public Builder setOnClick(OnClick onClick) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 == null) {
                    onClick.getClass();
                    this.onClick_ = onClick;
                } else {
                    singleFieldBuilderV3.setMessage(onClick);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOnClick(OnClick.Builder builder) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.onClick_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeOnClick(OnClick onClick) {
                OnClick onClick2;
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0 && (onClick2 = this.onClick_) != null && onClick2 != OnClick.getDefaultInstance()) {
                        getOnClickBuilder().mergeFrom(onClick);
                    } else {
                        this.onClick_ = onClick;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(onClick);
                }
                if (this.onClick_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder clearOnClick() {
                this.bitField0_ &= -3;
                this.onClick_ = null;
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.onClickBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public OnClick.Builder getOnClickBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (OnClick.Builder) getOnClickFieldBuilder().getBuilder();
            }

            @Override // com.google.apps.card.v1.Card.CardActionOrBuilder
            public OnClickOrBuilder getOnClickOrBuilder() {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OnClickOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OnClick onClick = this.onClick_;
                return onClick == null ? OnClick.getDefaultInstance() : onClick;
            }

            private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> getOnClickFieldBuilder() {
                if (this.onClickBuilder_ == null) {
                    this.onClickBuilder_ = new SingleFieldBuilderV3<>(getOnClick(), getParentForChildren(), isClean());
                    this.onClick_ = null;
                }
                return this.onClickBuilder_;
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

        public static CardAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CardAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CardAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CardAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class CardFixedFooter extends GeneratedMessageV3 implements CardFixedFooterOrBuilder {
        private static final CardFixedFooter DEFAULT_INSTANCE = new CardFixedFooter();
        private static final Parser<CardFixedFooter> PARSER = new AbstractParser<CardFixedFooter>() { // from class: com.google.apps.card.v1.Card.CardFixedFooter.1
            @Override // com.google.protobuf.Parser
            public CardFixedFooter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CardFixedFooter.newBuilder();
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
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 1;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Button primaryButton_;
        private Button secondaryButton_;

        static /* synthetic */ int access$3576(CardFixedFooter cardFixedFooter, int i) {
            int i2 = i | cardFixedFooter.bitField0_;
            cardFixedFooter.bitField0_ = i2;
            return i2;
        }

        private CardFixedFooter(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private CardFixedFooter() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CardFixedFooter();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardFixedFooter_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Card_CardFixedFooter_fieldAccessorTable.ensureFieldAccessorsInitialized(CardFixedFooter.class, Builder.class);
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public Button getPrimaryButton() {
            Button button = this.primaryButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public ButtonOrBuilder getPrimaryButtonOrBuilder() {
            Button button = this.primaryButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public boolean hasSecondaryButton() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public Button getSecondaryButton() {
            Button button = this.secondaryButton_;
            return button == null ? Button.getDefaultInstance() : button;
        }

        @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
        public ButtonOrBuilder getSecondaryButtonOrBuilder() {
            Button button = this.secondaryButton_;
            return button == null ? Button.getDefaultInstance() : button;
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
                codedOutputStream.writeMessage(1, getPrimaryButton());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSecondaryButton());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPrimaryButton()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSecondaryButton());
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
            if (!(obj instanceof CardFixedFooter)) {
                return super.equals(obj);
            }
            CardFixedFooter cardFixedFooter = (CardFixedFooter) obj;
            if (hasPrimaryButton() != cardFixedFooter.hasPrimaryButton()) {
                return false;
            }
            if ((!hasPrimaryButton() || getPrimaryButton().equals(cardFixedFooter.getPrimaryButton())) && hasSecondaryButton() == cardFixedFooter.hasSecondaryButton()) {
                return (!hasSecondaryButton() || getSecondaryButton().equals(cardFixedFooter.getSecondaryButton())) && getUnknownFields().equals(cardFixedFooter.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasPrimaryButton()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPrimaryButton().hashCode();
            }
            if (hasSecondaryButton()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSecondaryButton().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static CardFixedFooter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CardFixedFooter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CardFixedFooter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static CardFixedFooter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CardFixedFooter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static CardFixedFooter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CardFixedFooter parseFrom(InputStream inputStream) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CardFixedFooter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardFixedFooter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CardFixedFooter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CardFixedFooter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CardFixedFooter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CardFixedFooter) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CardFixedFooter cardFixedFooter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cardFixedFooter);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardFixedFooterOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> primaryButtonBuilder_;
            private Button primaryButton_;
            private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> secondaryButtonBuilder_;
            private Button secondaryButton_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardFixedFooter_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardFixedFooter_fieldAccessorTable.ensureFieldAccessorsInitialized(CardFixedFooter.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (CardFixedFooter.alwaysUseFieldBuilders) {
                    getPrimaryButtonFieldBuilder();
                    getSecondaryButtonFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.primaryButton_ = null;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.primaryButtonBuilder_ = null;
                }
                this.secondaryButton_ = null;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV32 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV32 != null) {
                    singleFieldBuilderV32.dispose();
                    this.secondaryButtonBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Card_CardFixedFooter_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CardFixedFooter getDefaultInstanceForType() {
                return CardFixedFooter.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardFixedFooter build() {
                CardFixedFooter cardFixedFooterBuildPartial = buildPartial();
                if (cardFixedFooterBuildPartial.isInitialized()) {
                    return cardFixedFooterBuildPartial;
                }
                throw newUninitializedMessageException((Message) cardFixedFooterBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CardFixedFooter buildPartial() {
                CardFixedFooter cardFixedFooter = new CardFixedFooter(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cardFixedFooter);
                }
                onBuilt();
                return cardFixedFooter;
            }

            private void buildPartial0(CardFixedFooter cardFixedFooter) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                    cardFixedFooter.primaryButton_ = singleFieldBuilderV3 == null ? this.primaryButton_ : (Button) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV32 = this.secondaryButtonBuilder_;
                    cardFixedFooter.secondaryButton_ = singleFieldBuilderV32 == null ? this.secondaryButton_ : (Button) singleFieldBuilderV32.build();
                    i |= 2;
                }
                CardFixedFooter.access$3576(cardFixedFooter, i);
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
                if (message instanceof CardFixedFooter) {
                    return mergeFrom((CardFixedFooter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CardFixedFooter cardFixedFooter) {
                if (cardFixedFooter == CardFixedFooter.getDefaultInstance()) {
                    return this;
                }
                if (cardFixedFooter.hasPrimaryButton()) {
                    mergePrimaryButton(cardFixedFooter.getPrimaryButton());
                }
                if (cardFixedFooter.hasSecondaryButton()) {
                    mergeSecondaryButton(cardFixedFooter.getSecondaryButton());
                }
                mergeUnknownFields(cardFixedFooter.getUnknownFields());
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
                                    codedInputStream.readMessage(getPrimaryButtonFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSecondaryButtonFieldBuilder().getBuilder(), extensionRegistryLite);
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

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public boolean hasPrimaryButton() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public Button getPrimaryButton() {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Button button = this.primaryButton_;
                    return button == null ? Button.getDefaultInstance() : button;
                }
                return (Button) singleFieldBuilderV3.getMessage();
            }

            public Builder setPrimaryButton(Button button) {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    button.getClass();
                    this.primaryButton_ = button;
                } else {
                    singleFieldBuilderV3.setMessage(button);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPrimaryButton(Button.Builder builder) {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.primaryButton_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergePrimaryButton(Button button) {
                Button button2;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0 && (button2 = this.primaryButton_) != null && button2 != Button.getDefaultInstance()) {
                        getPrimaryButtonBuilder().mergeFrom(button);
                    } else {
                        this.primaryButton_ = button;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(button);
                }
                if (this.primaryButton_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder clearPrimaryButton() {
                this.bitField0_ &= -2;
                this.primaryButton_ = null;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.primaryButtonBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Button.Builder getPrimaryButtonBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Button.Builder) getPrimaryButtonFieldBuilder().getBuilder();
            }

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public ButtonOrBuilder getPrimaryButtonOrBuilder() {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.primaryButtonBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ButtonOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Button button = this.primaryButton_;
                return button == null ? Button.getDefaultInstance() : button;
            }

            private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getPrimaryButtonFieldBuilder() {
                if (this.primaryButtonBuilder_ == null) {
                    this.primaryButtonBuilder_ = new SingleFieldBuilderV3<>(getPrimaryButton(), getParentForChildren(), isClean());
                    this.primaryButton_ = null;
                }
                return this.primaryButtonBuilder_;
            }

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public Button getSecondaryButton() {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Button button = this.secondaryButton_;
                    return button == null ? Button.getDefaultInstance() : button;
                }
                return (Button) singleFieldBuilderV3.getMessage();
            }

            public Builder setSecondaryButton(Button button) {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    button.getClass();
                    this.secondaryButton_ = button;
                } else {
                    singleFieldBuilderV3.setMessage(button);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSecondaryButton(Button.Builder builder) {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.secondaryButton_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeSecondaryButton(Button button) {
                Button button2;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0 && (button2 = this.secondaryButton_) != null && button2 != Button.getDefaultInstance()) {
                        getSecondaryButtonBuilder().mergeFrom(button);
                    } else {
                        this.secondaryButton_ = button;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(button);
                }
                if (this.secondaryButton_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder clearSecondaryButton() {
                this.bitField0_ &= -3;
                this.secondaryButton_ = null;
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.secondaryButtonBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Button.Builder getSecondaryButtonBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Button.Builder) getSecondaryButtonFieldBuilder().getBuilder();
            }

            @Override // com.google.apps.card.v1.Card.CardFixedFooterOrBuilder
            public ButtonOrBuilder getSecondaryButtonOrBuilder() {
                SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> singleFieldBuilderV3 = this.secondaryButtonBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ButtonOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Button button = this.secondaryButton_;
                return button == null ? Button.getDefaultInstance() : button;
            }

            private SingleFieldBuilderV3<Button, Button.Builder, ButtonOrBuilder> getSecondaryButtonFieldBuilder() {
                if (this.secondaryButtonBuilder_ == null) {
                    this.secondaryButtonBuilder_ = new SingleFieldBuilderV3<>(getSecondaryButton(), getParentForChildren(), isClean());
                    this.secondaryButton_ = null;
                }
                return this.secondaryButtonBuilder_;
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

        public static CardFixedFooter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CardFixedFooter> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CardFixedFooter> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CardFixedFooter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardHeader getHeader() {
        CardHeader cardHeader = this.header_;
        return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardHeaderOrBuilder getHeaderOrBuilder() {
        CardHeader cardHeader = this.header_;
        return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public List<Section> getSectionsList() {
        return this.sections_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public List<? extends SectionOrBuilder> getSectionsOrBuilderList() {
        return this.sections_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public int getSectionsCount() {
        return this.sections_.size();
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public Section getSections(int i) {
        return this.sections_.get(i);
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public SectionOrBuilder getSectionsOrBuilder(int i) {
        return this.sections_.get(i);
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public int getSectionDividerStyleValue() {
        return this.sectionDividerStyle_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public DividerStyle getSectionDividerStyle() {
        DividerStyle dividerStyleForNumber = DividerStyle.forNumber(this.sectionDividerStyle_);
        return dividerStyleForNumber == null ? DividerStyle.UNRECOGNIZED : dividerStyleForNumber;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public List<CardAction> getCardActionsList() {
        return this.cardActions_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public List<? extends CardActionOrBuilder> getCardActionsOrBuilderList() {
        return this.cardActions_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public int getCardActionsCount() {
        return this.cardActions_.size();
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardAction getCardActions(int i) {
        return this.cardActions_.get(i);
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardActionOrBuilder getCardActionsOrBuilder(int i) {
        return this.cardActions_.get(i);
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public boolean hasFixedFooter() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardFixedFooter getFixedFooter() {
        CardFixedFooter cardFixedFooter = this.fixedFooter_;
        return cardFixedFooter == null ? CardFixedFooter.getDefaultInstance() : cardFixedFooter;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardFixedFooterOrBuilder getFixedFooterOrBuilder() {
        CardFixedFooter cardFixedFooter = this.fixedFooter_;
        return cardFixedFooter == null ? CardFixedFooter.getDefaultInstance() : cardFixedFooter;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public int getDisplayStyleValue() {
        return this.displayStyle_;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public DisplayStyle getDisplayStyle() {
        DisplayStyle displayStyleForNumber = DisplayStyle.forNumber(this.displayStyle_);
        return displayStyleForNumber == null ? DisplayStyle.UNRECOGNIZED : displayStyleForNumber;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public boolean hasPeekCardHeader() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardHeader getPeekCardHeader() {
        CardHeader cardHeader = this.peekCardHeader_;
        return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
    }

    @Override // com.google.apps.card.v1.CardOrBuilder
    public CardHeaderOrBuilder getPeekCardHeaderOrBuilder() {
        CardHeader cardHeader = this.peekCardHeader_;
        return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
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
            codedOutputStream.writeMessage(1, getHeader());
        }
        for (int i = 0; i < this.sections_.size(); i++) {
            codedOutputStream.writeMessage(2, this.sections_.get(i));
        }
        for (int i2 = 0; i2 < this.cardActions_.size(); i2++) {
            codedOutputStream.writeMessage(3, this.cardActions_.get(i2));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(5, getFixedFooter());
        }
        if (this.displayStyle_ != DisplayStyle.DISPLAY_STYLE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(6, this.displayStyle_);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.writeMessage(7, getPeekCardHeader());
        }
        if (this.sectionDividerStyle_ != DividerStyle.DIVIDER_STYLE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(9, this.sectionDividerStyle_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getHeader()) : 0;
        for (int i2 = 0; i2 < this.sections_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.sections_.get(i2));
        }
        for (int i3 = 0; i3 < this.cardActions_.size(); i3++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.cardActions_.get(i3));
        }
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(4, this.name_);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getFixedFooter());
        }
        if (this.displayStyle_ != DisplayStyle.DISPLAY_STYLE_UNSPECIFIED.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(6, this.displayStyle_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getPeekCardHeader());
        }
        if (this.sectionDividerStyle_ != DividerStyle.DIVIDER_STYLE_UNSPECIFIED.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(9, this.sectionDividerStyle_);
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
        if (!(obj instanceof Card)) {
            return super.equals(obj);
        }
        Card card = (Card) obj;
        if (hasHeader() != card.hasHeader()) {
            return false;
        }
        if ((hasHeader() && !getHeader().equals(card.getHeader())) || !getSectionsList().equals(card.getSectionsList()) || this.sectionDividerStyle_ != card.sectionDividerStyle_ || !getCardActionsList().equals(card.getCardActionsList()) || !getName().equals(card.getName()) || hasFixedFooter() != card.hasFixedFooter()) {
            return false;
        }
        if ((!hasFixedFooter() || getFixedFooter().equals(card.getFixedFooter())) && this.displayStyle_ == card.displayStyle_ && hasPeekCardHeader() == card.hasPeekCardHeader()) {
            return (!hasPeekCardHeader() || getPeekCardHeader().equals(card.getPeekCardHeader())) && getUnknownFields().equals(card.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasHeader()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getHeader().hashCode();
        }
        if (getSectionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getSectionsList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 9) * 53) + this.sectionDividerStyle_;
        if (getCardActionsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + getCardActionsList().hashCode();
        }
        int iHashCode3 = (((iHashCode2 * 37) + 4) * 53) + getName().hashCode();
        if (hasFixedFooter()) {
            iHashCode3 = (((iHashCode3 * 37) + 5) * 53) + getFixedFooter().hashCode();
        }
        int iHashCode4 = (((iHashCode3 * 37) + 6) * 53) + this.displayStyle_;
        if (hasPeekCardHeader()) {
            iHashCode4 = (((iHashCode4 * 37) + 7) * 53) + getPeekCardHeader().hashCode();
        }
        int iHashCode5 = (iHashCode4 * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode5;
        return iHashCode5;
    }

    public static Card parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Card parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Card parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Card parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Card parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Card parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Card parseFrom(InputStream inputStream) throws IOException {
        return (Card) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Card parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Card parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Card) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Card parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Card parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Card) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Card parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Card) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Card card) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(card);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CardOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> cardActionsBuilder_;
        private List<CardAction> cardActions_;
        private int displayStyle_;
        private SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> fixedFooterBuilder_;
        private CardFixedFooter fixedFooter_;
        private SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> headerBuilder_;
        private CardHeader header_;
        private Object name_;
        private SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> peekCardHeaderBuilder_;
        private CardHeader peekCardHeader_;
        private int sectionDividerStyle_;
        private RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> sectionsBuilder_;
        private List<Section> sections_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Card_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Card_fieldAccessorTable.ensureFieldAccessorsInitialized(Card.class, Builder.class);
        }

        private Builder() {
            this.sections_ = Collections.emptyList();
            this.sectionDividerStyle_ = 0;
            this.cardActions_ = Collections.emptyList();
            this.name_ = "";
            this.displayStyle_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.sections_ = Collections.emptyList();
            this.sectionDividerStyle_ = 0;
            this.cardActions_ = Collections.emptyList();
            this.name_ = "";
            this.displayStyle_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Card.alwaysUseFieldBuilders) {
                getHeaderFieldBuilder();
                getSectionsFieldBuilder();
                getCardActionsFieldBuilder();
                getFixedFooterFieldBuilder();
                getPeekCardHeaderFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.header_ = null;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.headerBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.sections_ = Collections.emptyList();
            } else {
                this.sections_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            this.sectionDividerStyle_ = 0;
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV32 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.cardActions_ = Collections.emptyList();
            } else {
                this.cardActions_ = null;
                repeatedFieldBuilderV32.clear();
            }
            this.bitField0_ &= -9;
            this.name_ = "";
            this.fixedFooter_ = null;
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV32 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.fixedFooterBuilder_ = null;
            }
            this.displayStyle_ = 0;
            this.peekCardHeader_ = null;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV33 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.dispose();
                this.peekCardHeaderBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Card_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Card getDefaultInstanceForType() {
            return Card.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Card build() {
            Card cardBuildPartial = buildPartial();
            if (cardBuildPartial.isInitialized()) {
                return cardBuildPartial;
            }
            throw newUninitializedMessageException((Message) cardBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Card buildPartial() {
            Card card = new Card(this);
            buildPartialRepeatedFields(card);
            if (this.bitField0_ != 0) {
                buildPartial0(card);
            }
            onBuilt();
            return card;
        }

        private void buildPartialRepeatedFields(Card card) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                card.sections_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.sections_ = Collections.unmodifiableList(this.sections_);
                    this.bitField0_ &= -3;
                }
                card.sections_ = this.sections_;
            }
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV32 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                card.cardActions_ = repeatedFieldBuilderV32.build();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.cardActions_ = Collections.unmodifiableList(this.cardActions_);
                this.bitField0_ &= -9;
            }
            card.cardActions_ = this.cardActions_;
        }

        private void buildPartial0(Card card) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                card.header_ = singleFieldBuilderV3 == null ? this.header_ : (CardHeader) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                card.sectionDividerStyle_ = this.sectionDividerStyle_;
            }
            if ((i2 & 16) != 0) {
                card.name_ = this.name_;
            }
            if ((i2 & 32) != 0) {
                SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV32 = this.fixedFooterBuilder_;
                card.fixedFooter_ = singleFieldBuilderV32 == null ? this.fixedFooter_ : (CardFixedFooter) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i2 & 64) != 0) {
                card.displayStyle_ = this.displayStyle_;
            }
            if ((i2 & 128) != 0) {
                SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV33 = this.peekCardHeaderBuilder_;
                card.peekCardHeader_ = singleFieldBuilderV33 == null ? this.peekCardHeader_ : (CardHeader) singleFieldBuilderV33.build();
                i |= 4;
            }
            Card.access$4876(card, i);
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
            if (message instanceof Card) {
                return mergeFrom((Card) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Card card) {
            if (card == Card.getDefaultInstance()) {
                return this;
            }
            if (card.hasHeader()) {
                mergeHeader(card.getHeader());
            }
            if (this.sectionsBuilder_ == null) {
                if (!card.sections_.isEmpty()) {
                    if (this.sections_.isEmpty()) {
                        this.sections_ = card.sections_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSectionsIsMutable();
                        this.sections_.addAll(card.sections_);
                    }
                    onChanged();
                }
            } else if (!card.sections_.isEmpty()) {
                if (!this.sectionsBuilder_.isEmpty()) {
                    this.sectionsBuilder_.addAllMessages(card.sections_);
                } else {
                    this.sectionsBuilder_.dispose();
                    this.sectionsBuilder_ = null;
                    this.sections_ = card.sections_;
                    this.bitField0_ &= -3;
                    this.sectionsBuilder_ = Card.alwaysUseFieldBuilders ? getSectionsFieldBuilder() : null;
                }
            }
            if (card.sectionDividerStyle_ != 0) {
                setSectionDividerStyleValue(card.getSectionDividerStyleValue());
            }
            if (this.cardActionsBuilder_ == null) {
                if (!card.cardActions_.isEmpty()) {
                    if (this.cardActions_.isEmpty()) {
                        this.cardActions_ = card.cardActions_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCardActionsIsMutable();
                        this.cardActions_.addAll(card.cardActions_);
                    }
                    onChanged();
                }
            } else if (!card.cardActions_.isEmpty()) {
                if (!this.cardActionsBuilder_.isEmpty()) {
                    this.cardActionsBuilder_.addAllMessages(card.cardActions_);
                } else {
                    this.cardActionsBuilder_.dispose();
                    this.cardActionsBuilder_ = null;
                    this.cardActions_ = card.cardActions_;
                    this.bitField0_ &= -9;
                    this.cardActionsBuilder_ = Card.alwaysUseFieldBuilders ? getCardActionsFieldBuilder() : null;
                }
            }
            if (!card.getName().isEmpty()) {
                this.name_ = card.name_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (card.hasFixedFooter()) {
                mergeFixedFooter(card.getFixedFooter());
            }
            if (card.displayStyle_ != 0) {
                setDisplayStyleValue(card.getDisplayStyleValue());
            }
            if (card.hasPeekCardHeader()) {
                mergePeekCardHeader(card.getPeekCardHeader());
            }
            mergeUnknownFields(card.getUnknownFields());
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
                                codedInputStream.readMessage(getHeaderFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                Section section = (Section) codedInputStream.readMessage(Section.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureSectionsIsMutable();
                                    this.sections_.add(section);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(section);
                                }
                            } else if (tag == 26) {
                                CardAction cardAction = (CardAction) codedInputStream.readMessage(CardAction.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV32 = this.cardActionsBuilder_;
                                if (repeatedFieldBuilderV32 == null) {
                                    ensureCardActionsIsMutable();
                                    this.cardActions_.add(cardAction);
                                } else {
                                    repeatedFieldBuilderV32.addMessage(cardAction);
                                }
                            } else if (tag == 34) {
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getFixedFooterFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 32;
                            } else if (tag == 48) {
                                this.displayStyle_ = codedInputStream.readEnum();
                                this.bitField0_ |= 64;
                            } else if (tag == 58) {
                                codedInputStream.readMessage(getPeekCardHeaderFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 128;
                            } else if (tag == 72) {
                                this.sectionDividerStyle_ = codedInputStream.readEnum();
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

        @Override // com.google.apps.card.v1.CardOrBuilder
        public boolean hasHeader() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardHeader getHeader() {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 == null) {
                CardHeader cardHeader = this.header_;
                return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
            }
            return (CardHeader) singleFieldBuilderV3.getMessage();
        }

        public Builder setHeader(CardHeader cardHeader) {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 == null) {
                cardHeader.getClass();
                this.header_ = cardHeader;
            } else {
                singleFieldBuilderV3.setMessage(cardHeader);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setHeader(CardHeader.Builder builder) {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.header_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder mergeHeader(CardHeader cardHeader) {
            CardHeader cardHeader2;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0 && (cardHeader2 = this.header_) != null && cardHeader2 != CardHeader.getDefaultInstance()) {
                    getHeaderBuilder().mergeFrom(cardHeader);
                } else {
                    this.header_ = cardHeader;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(cardHeader);
            }
            if (this.header_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder clearHeader() {
            this.bitField0_ &= -2;
            this.header_ = null;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.headerBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public CardHeader.Builder getHeaderBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (CardHeader.Builder) getHeaderFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardHeaderOrBuilder getHeaderOrBuilder() {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CardHeaderOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CardHeader cardHeader = this.header_;
            return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
        }

        private SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> getHeaderFieldBuilder() {
            if (this.headerBuilder_ == null) {
                this.headerBuilder_ = new SingleFieldBuilderV3<>(getHeader(), getParentForChildren(), isClean());
                this.header_ = null;
            }
            return this.headerBuilder_;
        }

        private void ensureSectionsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.sections_ = new ArrayList(this.sections_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public List<Section> getSectionsList() {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.sections_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public int getSectionsCount() {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.sections_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public Section getSections(int i) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.sections_.get(i);
            }
            return (Section) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setSections(int i, Section section) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                section.getClass();
                ensureSectionsIsMutable();
                this.sections_.set(i, section);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, section);
            }
            return this;
        }

        public Builder setSections(int i, Section.Builder builder) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSectionsIsMutable();
                this.sections_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addSections(Section section) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                section.getClass();
                ensureSectionsIsMutable();
                this.sections_.add(section);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(section);
            }
            return this;
        }

        public Builder addSections(int i, Section section) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                section.getClass();
                ensureSectionsIsMutable();
                this.sections_.add(i, section);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, section);
            }
            return this;
        }

        public Builder addSections(Section.Builder builder) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSectionsIsMutable();
                this.sections_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addSections(int i, Section.Builder builder) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSectionsIsMutable();
                this.sections_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllSections(Iterable<? extends Section> iterable) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSectionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sections_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearSections() {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.sections_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeSections(int i) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSectionsIsMutable();
                this.sections_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Section.Builder getSectionsBuilder(int i) {
            return (Section.Builder) getSectionsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public SectionOrBuilder getSectionsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.sections_.get(i);
            }
            return (SectionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public List<? extends SectionOrBuilder> getSectionsOrBuilderList() {
            RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> repeatedFieldBuilderV3 = this.sectionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.sections_);
        }

        public Section.Builder addSectionsBuilder() {
            return (Section.Builder) getSectionsFieldBuilder().addBuilder(Section.getDefaultInstance());
        }

        public Section.Builder addSectionsBuilder(int i) {
            return (Section.Builder) getSectionsFieldBuilder().addBuilder(i, Section.getDefaultInstance());
        }

        public List<Section.Builder> getSectionsBuilderList() {
            return getSectionsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Section, Section.Builder, SectionOrBuilder> getSectionsFieldBuilder() {
            if (this.sectionsBuilder_ == null) {
                this.sectionsBuilder_ = new RepeatedFieldBuilderV3<>(this.sections_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.sections_ = null;
            }
            return this.sectionsBuilder_;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public int getSectionDividerStyleValue() {
            return this.sectionDividerStyle_;
        }

        public Builder setSectionDividerStyleValue(int i) {
            this.sectionDividerStyle_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public DividerStyle getSectionDividerStyle() {
            DividerStyle dividerStyleForNumber = DividerStyle.forNumber(this.sectionDividerStyle_);
            return dividerStyleForNumber == null ? DividerStyle.UNRECOGNIZED : dividerStyleForNumber;
        }

        public Builder setSectionDividerStyle(DividerStyle dividerStyle) {
            dividerStyle.getClass();
            this.bitField0_ |= 4;
            this.sectionDividerStyle_ = dividerStyle.getNumber();
            onChanged();
            return this;
        }

        public Builder clearSectionDividerStyle() {
            this.bitField0_ &= -5;
            this.sectionDividerStyle_ = 0;
            onChanged();
            return this;
        }

        private void ensureCardActionsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.cardActions_ = new ArrayList(this.cardActions_);
                this.bitField0_ |= 8;
            }
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public List<CardAction> getCardActionsList() {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.cardActions_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public int getCardActionsCount() {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.cardActions_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardAction getCardActions(int i) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.cardActions_.get(i);
            }
            return (CardAction) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setCardActions(int i, CardAction cardAction) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                cardAction.getClass();
                ensureCardActionsIsMutable();
                this.cardActions_.set(i, cardAction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, cardAction);
            }
            return this;
        }

        public Builder setCardActions(int i, CardAction.Builder builder) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCardActionsIsMutable();
                this.cardActions_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addCardActions(CardAction cardAction) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                cardAction.getClass();
                ensureCardActionsIsMutable();
                this.cardActions_.add(cardAction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(cardAction);
            }
            return this;
        }

        public Builder addCardActions(int i, CardAction cardAction) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                cardAction.getClass();
                ensureCardActionsIsMutable();
                this.cardActions_.add(i, cardAction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, cardAction);
            }
            return this;
        }

        public Builder addCardActions(CardAction.Builder builder) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCardActionsIsMutable();
                this.cardActions_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addCardActions(int i, CardAction.Builder builder) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCardActionsIsMutable();
                this.cardActions_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllCardActions(Iterable<? extends CardAction> iterable) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCardActionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.cardActions_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearCardActions() {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.cardActions_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeCardActions(int i) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCardActionsIsMutable();
                this.cardActions_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public CardAction.Builder getCardActionsBuilder(int i) {
            return (CardAction.Builder) getCardActionsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardActionOrBuilder getCardActionsOrBuilder(int i) {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.cardActions_.get(i);
            }
            return (CardActionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public List<? extends CardActionOrBuilder> getCardActionsOrBuilderList() {
            RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> repeatedFieldBuilderV3 = this.cardActionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.cardActions_);
        }

        public CardAction.Builder addCardActionsBuilder() {
            return (CardAction.Builder) getCardActionsFieldBuilder().addBuilder(CardAction.getDefaultInstance());
        }

        public CardAction.Builder addCardActionsBuilder(int i) {
            return (CardAction.Builder) getCardActionsFieldBuilder().addBuilder(i, CardAction.getDefaultInstance());
        }

        public List<CardAction.Builder> getCardActionsBuilderList() {
            return getCardActionsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<CardAction, CardAction.Builder, CardActionOrBuilder> getCardActionsFieldBuilder() {
            if (this.cardActionsBuilder_ == null) {
                this.cardActionsBuilder_ = new RepeatedFieldBuilderV3<>(this.cardActions_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.cardActions_ = null;
            }
            return this.cardActionsBuilder_;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
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
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Card.getDefaultInstance().getName();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            Card.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public boolean hasFixedFooter() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardFixedFooter getFixedFooter() {
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 == null) {
                CardFixedFooter cardFixedFooter = this.fixedFooter_;
                return cardFixedFooter == null ? CardFixedFooter.getDefaultInstance() : cardFixedFooter;
            }
            return (CardFixedFooter) singleFieldBuilderV3.getMessage();
        }

        public Builder setFixedFooter(CardFixedFooter cardFixedFooter) {
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 == null) {
                cardFixedFooter.getClass();
                this.fixedFooter_ = cardFixedFooter;
            } else {
                singleFieldBuilderV3.setMessage(cardFixedFooter);
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setFixedFooter(CardFixedFooter.Builder builder) {
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.fixedFooter_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder mergeFixedFooter(CardFixedFooter cardFixedFooter) {
            CardFixedFooter cardFixedFooter2;
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32) != 0 && (cardFixedFooter2 = this.fixedFooter_) != null && cardFixedFooter2 != CardFixedFooter.getDefaultInstance()) {
                    getFixedFooterBuilder().mergeFrom(cardFixedFooter);
                } else {
                    this.fixedFooter_ = cardFixedFooter;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(cardFixedFooter);
            }
            if (this.fixedFooter_ != null) {
                this.bitField0_ |= 32;
                onChanged();
            }
            return this;
        }

        public Builder clearFixedFooter() {
            this.bitField0_ &= -33;
            this.fixedFooter_ = null;
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.fixedFooterBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public CardFixedFooter.Builder getFixedFooterBuilder() {
            this.bitField0_ |= 32;
            onChanged();
            return (CardFixedFooter.Builder) getFixedFooterFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardFixedFooterOrBuilder getFixedFooterOrBuilder() {
            SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> singleFieldBuilderV3 = this.fixedFooterBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CardFixedFooterOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CardFixedFooter cardFixedFooter = this.fixedFooter_;
            return cardFixedFooter == null ? CardFixedFooter.getDefaultInstance() : cardFixedFooter;
        }

        private SingleFieldBuilderV3<CardFixedFooter, CardFixedFooter.Builder, CardFixedFooterOrBuilder> getFixedFooterFieldBuilder() {
            if (this.fixedFooterBuilder_ == null) {
                this.fixedFooterBuilder_ = new SingleFieldBuilderV3<>(getFixedFooter(), getParentForChildren(), isClean());
                this.fixedFooter_ = null;
            }
            return this.fixedFooterBuilder_;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public int getDisplayStyleValue() {
            return this.displayStyle_;
        }

        public Builder setDisplayStyleValue(int i) {
            this.displayStyle_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public DisplayStyle getDisplayStyle() {
            DisplayStyle displayStyleForNumber = DisplayStyle.forNumber(this.displayStyle_);
            return displayStyleForNumber == null ? DisplayStyle.UNRECOGNIZED : displayStyleForNumber;
        }

        public Builder setDisplayStyle(DisplayStyle displayStyle) {
            displayStyle.getClass();
            this.bitField0_ |= 64;
            this.displayStyle_ = displayStyle.getNumber();
            onChanged();
            return this;
        }

        public Builder clearDisplayStyle() {
            this.bitField0_ &= -65;
            this.displayStyle_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public boolean hasPeekCardHeader() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardHeader getPeekCardHeader() {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 == null) {
                CardHeader cardHeader = this.peekCardHeader_;
                return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
            }
            return (CardHeader) singleFieldBuilderV3.getMessage();
        }

        public Builder setPeekCardHeader(CardHeader cardHeader) {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 == null) {
                cardHeader.getClass();
                this.peekCardHeader_ = cardHeader;
            } else {
                singleFieldBuilderV3.setMessage(cardHeader);
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setPeekCardHeader(CardHeader.Builder builder) {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.peekCardHeader_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder mergePeekCardHeader(CardHeader cardHeader) {
            CardHeader cardHeader2;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 128) != 0 && (cardHeader2 = this.peekCardHeader_) != null && cardHeader2 != CardHeader.getDefaultInstance()) {
                    getPeekCardHeaderBuilder().mergeFrom(cardHeader);
                } else {
                    this.peekCardHeader_ = cardHeader;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(cardHeader);
            }
            if (this.peekCardHeader_ != null) {
                this.bitField0_ |= 128;
                onChanged();
            }
            return this;
        }

        public Builder clearPeekCardHeader() {
            this.bitField0_ &= -129;
            this.peekCardHeader_ = null;
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.peekCardHeaderBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public CardHeader.Builder getPeekCardHeaderBuilder() {
            this.bitField0_ |= 128;
            onChanged();
            return (CardHeader.Builder) getPeekCardHeaderFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.CardOrBuilder
        public CardHeaderOrBuilder getPeekCardHeaderOrBuilder() {
            SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> singleFieldBuilderV3 = this.peekCardHeaderBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CardHeaderOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CardHeader cardHeader = this.peekCardHeader_;
            return cardHeader == null ? CardHeader.getDefaultInstance() : cardHeader;
        }

        private SingleFieldBuilderV3<CardHeader, CardHeader.Builder, CardHeaderOrBuilder> getPeekCardHeaderFieldBuilder() {
            if (this.peekCardHeaderBuilder_ == null) {
                this.peekCardHeaderBuilder_ = new SingleFieldBuilderV3<>(getPeekCardHeader(), getParentForChildren(), isClean());
                this.peekCardHeader_ = null;
            }
            return this.peekCardHeaderBuilder_;
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

    public static Card getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Card> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Card> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Card getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
