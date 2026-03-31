package com.google.apps.card.v1;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Suggestions extends GeneratedMessageV3 implements SuggestionsOrBuilder {
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<SuggestionItem> items_;
    private byte memoizedIsInitialized;
    private static final Suggestions DEFAULT_INSTANCE = new Suggestions();
    private static final Parser<Suggestions> PARSER = new AbstractParser<Suggestions>() { // from class: com.google.apps.card.v1.Suggestions.1
        @Override // com.google.protobuf.Parser
        public Suggestions parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Suggestions.newBuilder();
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

    public interface SuggestionItemOrBuilder extends MessageOrBuilder {
        SuggestionItem.ContentCase getContentCase();

        String getText();

        ByteString getTextBytes();

        boolean hasText();
    }

    private Suggestions(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Suggestions() {
        this.memoizedIsInitialized = (byte) -1;
        this.items_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Suggestions();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Suggestions_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Suggestions_fieldAccessorTable.ensureFieldAccessorsInitialized(Suggestions.class, Builder.class);
    }

    public static final class SuggestionItem extends GeneratedMessageV3 implements SuggestionItemOrBuilder {
        private static final SuggestionItem DEFAULT_INSTANCE = new SuggestionItem();
        private static final Parser<SuggestionItem> PARSER = new AbstractParser<SuggestionItem>() { // from class: com.google.apps.card.v1.Suggestions.SuggestionItem.1
            @Override // com.google.protobuf.Parser
            public SuggestionItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SuggestionItem.newBuilder();
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
        public static final int TEXT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int contentCase_;
        private Object content_;
        private byte memoizedIsInitialized;

        private SuggestionItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.contentCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private SuggestionItem() {
            this.contentCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SuggestionItem();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Suggestions_SuggestionItem_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Suggestions_SuggestionItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SuggestionItem.class, Builder.class);
        }

        public enum ContentCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            TEXT(1),
            CONTENT_NOT_SET(0);

            private final int value;

            ContentCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static ContentCase valueOf(int i) {
                return forNumber(i);
            }

            public static ContentCase forNumber(int i) {
                if (i == 0) {
                    return CONTENT_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return TEXT;
            }

            @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public int getNumber() {
                return this.value;
            }
        }

        @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
        public ContentCase getContentCase() {
            return ContentCase.forNumber(this.contentCase_);
        }

        @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
        public boolean hasText() {
            return this.contentCase_ == 1;
        }

        @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
        public String getText() {
            Object obj;
            if (this.contentCase_ != 1) {
                obj = "";
            } else {
                obj = this.content_;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            if (this.contentCase_ == 1) {
                this.content_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
        public ByteString getTextBytes() {
            Object obj;
            if (this.contentCase_ != 1) {
                obj = "";
            } else {
                obj = this.content_;
            }
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.contentCase_ == 1) {
                    this.content_ = byteStringCopyFromUtf8;
                }
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
            if (this.contentCase_ == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.contentCase_ == 1 ? GeneratedMessageV3.computeStringSize(1, this.content_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SuggestionItem)) {
                return super.equals(obj);
            }
            SuggestionItem suggestionItem = (SuggestionItem) obj;
            if (getContentCase().equals(suggestionItem.getContentCase())) {
                return (this.contentCase_ != 1 || getText().equals(suggestionItem.getText())) && getUnknownFields().equals(suggestionItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (this.contentCase_ == 1) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getText().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static SuggestionItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SuggestionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SuggestionItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static SuggestionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SuggestionItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static SuggestionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SuggestionItem parseFrom(InputStream inputStream) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SuggestionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SuggestionItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SuggestionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SuggestionItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SuggestionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SuggestionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SuggestionItem suggestionItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(suggestionItem);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SuggestionItemOrBuilder {
            private int bitField0_;
            private int contentCase_;
            private Object content_;

            private void buildPartial0(SuggestionItem suggestionItem) {
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Suggestions_SuggestionItem_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Suggestions_SuggestionItem_fieldAccessorTable.ensureFieldAccessorsInitialized(SuggestionItem.class, Builder.class);
            }

            private Builder() {
                this.contentCase_ = 0;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.contentCase_ = 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.contentCase_ = 0;
                this.content_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Suggestions_SuggestionItem_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SuggestionItem getDefaultInstanceForType() {
                return SuggestionItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SuggestionItem build() {
                SuggestionItem suggestionItemBuildPartial = buildPartial();
                if (suggestionItemBuildPartial.isInitialized()) {
                    return suggestionItemBuildPartial;
                }
                throw newUninitializedMessageException((Message) suggestionItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SuggestionItem buildPartial() {
                SuggestionItem suggestionItem = new SuggestionItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(suggestionItem);
                }
                buildPartialOneofs(suggestionItem);
                onBuilt();
                return suggestionItem;
            }

            private void buildPartialOneofs(SuggestionItem suggestionItem) {
                suggestionItem.contentCase_ = this.contentCase_;
                suggestionItem.content_ = this.content_;
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
                if (message instanceof SuggestionItem) {
                    return mergeFrom((SuggestionItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SuggestionItem suggestionItem) {
                if (suggestionItem == SuggestionItem.getDefaultInstance()) {
                    return this;
                }
                if (AnonymousClass2.$SwitchMap$com$google$apps$card$v1$Suggestions$SuggestionItem$ContentCase[suggestionItem.getContentCase().ordinal()] == 1) {
                    this.contentCase_ = 1;
                    this.content_ = suggestionItem.content_;
                    onChanged();
                }
                mergeUnknownFields(suggestionItem.getUnknownFields());
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
                                    this.contentCase_ = 1;
                                    this.content_ = stringRequireUtf8;
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

            @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
            public ContentCase getContentCase() {
                return ContentCase.forNumber(this.contentCase_);
            }

            public Builder clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
            public boolean hasText() {
                return this.contentCase_ == 1;
            }

            @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
            public String getText() {
                Object obj;
                if (this.contentCase_ != 1) {
                    obj = "";
                } else {
                    obj = this.content_;
                }
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    if (this.contentCase_ == 1) {
                        this.content_ = stringUtf8;
                    }
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Suggestions.SuggestionItemOrBuilder
            public ByteString getTextBytes() {
                Object obj;
                if (this.contentCase_ != 1) {
                    obj = "";
                } else {
                    obj = this.content_;
                }
                if (obj instanceof String) {
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    if (this.contentCase_ == 1) {
                        this.content_ = byteStringCopyFromUtf8;
                    }
                    return byteStringCopyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setText(String str) {
                str.getClass();
                this.contentCase_ = 1;
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder clearText() {
                if (this.contentCase_ == 1) {
                    this.contentCase_ = 0;
                    this.content_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                SuggestionItem.checkByteStringIsUtf8(byteString);
                this.contentCase_ = 1;
                this.content_ = byteString;
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

        public static SuggestionItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SuggestionItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SuggestionItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SuggestionItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.apps.card.v1.Suggestions$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$apps$card$v1$Suggestions$SuggestionItem$ContentCase;

        static {
            int[] iArr = new int[SuggestionItem.ContentCase.values().length];
            $SwitchMap$com$google$apps$card$v1$Suggestions$SuggestionItem$ContentCase = iArr;
            try {
                iArr[SuggestionItem.ContentCase.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$apps$card$v1$Suggestions$SuggestionItem$ContentCase[SuggestionItem.ContentCase.CONTENT_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.google.apps.card.v1.SuggestionsOrBuilder
    public List<SuggestionItem> getItemsList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.SuggestionsOrBuilder
    public List<? extends SuggestionItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.SuggestionsOrBuilder
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.google.apps.card.v1.SuggestionsOrBuilder
    public SuggestionItem getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.apps.card.v1.SuggestionsOrBuilder
    public SuggestionItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
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
        for (int i = 0; i < this.items_.size(); i++) {
            codedOutputStream.writeMessage(1, this.items_.get(i));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = 0;
        for (int i2 = 0; i2 < this.items_.size(); i2++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.items_.get(i2));
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
        if (!(obj instanceof Suggestions)) {
            return super.equals(obj);
        }
        Suggestions suggestions = (Suggestions) obj;
        return getItemsList().equals(suggestions.getItemsList()) && getUnknownFields().equals(suggestions.getUnknownFields());
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getItemsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getItemsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Suggestions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Suggestions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Suggestions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Suggestions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Suggestions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Suggestions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Suggestions parseFrom(InputStream inputStream) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Suggestions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Suggestions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Suggestions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Suggestions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Suggestions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Suggestions) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Suggestions suggestions) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(suggestions);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SuggestionsOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> itemsBuilder_;
        private List<SuggestionItem> items_;

        private void buildPartial0(Suggestions suggestions) {
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Suggestions_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Suggestions_fieldAccessorTable.ensureFieldAccessorsInitialized(Suggestions.class, Builder.class);
        }

        private Builder() {
            this.items_ = Collections.emptyList();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.items_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
            } else {
                this.items_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Suggestions_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Suggestions getDefaultInstanceForType() {
            return Suggestions.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Suggestions build() {
            Suggestions suggestionsBuildPartial = buildPartial();
            if (suggestionsBuildPartial.isInitialized()) {
                return suggestionsBuildPartial;
            }
            throw newUninitializedMessageException((Message) suggestionsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Suggestions buildPartial() {
            Suggestions suggestions = new Suggestions(this);
            buildPartialRepeatedFields(suggestions);
            if (this.bitField0_ != 0) {
                buildPartial0(suggestions);
            }
            onBuilt();
            return suggestions;
        }

        private void buildPartialRepeatedFields(Suggestions suggestions) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                suggestions.items_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.items_ = Collections.unmodifiableList(this.items_);
                this.bitField0_ &= -2;
            }
            suggestions.items_ = this.items_;
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
            if (message instanceof Suggestions) {
                return mergeFrom((Suggestions) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Suggestions suggestions) {
            if (suggestions == Suggestions.getDefaultInstance()) {
                return this;
            }
            if (this.itemsBuilder_ == null) {
                if (!suggestions.items_.isEmpty()) {
                    if (this.items_.isEmpty()) {
                        this.items_ = suggestions.items_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureItemsIsMutable();
                        this.items_.addAll(suggestions.items_);
                    }
                    onChanged();
                }
            } else if (!suggestions.items_.isEmpty()) {
                if (!this.itemsBuilder_.isEmpty()) {
                    this.itemsBuilder_.addAllMessages(suggestions.items_);
                } else {
                    this.itemsBuilder_.dispose();
                    this.itemsBuilder_ = null;
                    this.items_ = suggestions.items_;
                    this.bitField0_ &= -2;
                    this.itemsBuilder_ = Suggestions.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(suggestions.getUnknownFields());
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
                                SuggestionItem suggestionItem = (SuggestionItem) codedInputStream.readMessage(SuggestionItem.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureItemsIsMutable();
                                    this.items_.add(suggestionItem);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(suggestionItem);
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

        private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.items_ = new ArrayList(this.items_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.apps.card.v1.SuggestionsOrBuilder
        public List<SuggestionItem> getItemsList() {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.items_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.SuggestionsOrBuilder
        public int getItemsCount() {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.SuggestionsOrBuilder
        public SuggestionItem getItems(int i) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (SuggestionItem) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setItems(int i, SuggestionItem suggestionItem) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                suggestionItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, suggestionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, suggestionItem);
            }
            return this;
        }

        public Builder setItems(int i, SuggestionItem.Builder builder) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addItems(SuggestionItem suggestionItem) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                suggestionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(suggestionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(suggestionItem);
            }
            return this;
        }

        public Builder addItems(int i, SuggestionItem suggestionItem) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                suggestionItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, suggestionItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, suggestionItem);
            }
            return this;
        }

        public Builder addItems(SuggestionItem.Builder builder) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addItems(int i, SuggestionItem.Builder builder) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllItems(Iterable<? extends SuggestionItem> iterable) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearItems() {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeItems(int i) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public SuggestionItem.Builder getItemsBuilder(int i) {
            return (SuggestionItem.Builder) getItemsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.SuggestionsOrBuilder
        public SuggestionItemOrBuilder getItemsOrBuilder(int i) {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (SuggestionItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.SuggestionsOrBuilder
        public List<? extends SuggestionItemOrBuilder> getItemsOrBuilderList() {
            RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.items_);
        }

        public SuggestionItem.Builder addItemsBuilder() {
            return (SuggestionItem.Builder) getItemsFieldBuilder().addBuilder(SuggestionItem.getDefaultInstance());
        }

        public SuggestionItem.Builder addItemsBuilder(int i) {
            return (SuggestionItem.Builder) getItemsFieldBuilder().addBuilder(i, SuggestionItem.getDefaultInstance());
        }

        public List<SuggestionItem.Builder> getItemsBuilderList() {
            return getItemsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<SuggestionItem, SuggestionItem.Builder, SuggestionItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
                this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.items_ = null;
            }
            return this.itemsBuilder_;
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

    public static Suggestions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Suggestions> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Suggestions> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Suggestions getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
