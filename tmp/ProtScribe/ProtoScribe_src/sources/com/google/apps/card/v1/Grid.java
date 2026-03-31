package com.google.apps.card.v1;

import com.google.apps.card.v1.BorderStyle;
import com.google.apps.card.v1.ImageComponent;
import com.google.apps.card.v1.OnClick;
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
public final class Grid extends GeneratedMessageV3 implements GridOrBuilder {
    public static final int BORDER_STYLE_FIELD_NUMBER = 3;
    public static final int COLUMN_COUNT_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int ON_CLICK_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private BorderStyle borderStyle_;
    private int columnCount_;
    private List<GridItem> items_;
    private byte memoizedIsInitialized;
    private OnClick onClick_;
    private volatile Object title_;
    private static final Grid DEFAULT_INSTANCE = new Grid();
    private static final Parser<Grid> PARSER = new AbstractParser<Grid>() { // from class: com.google.apps.card.v1.Grid.1
        @Override // com.google.protobuf.Parser
        public Grid parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Grid.newBuilder();
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

    public interface GridItemOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        ImageComponent getImage();

        ImageComponentOrBuilder getImageOrBuilder();

        GridItem.GridItemLayout getLayout();

        int getLayoutValue();

        String getSubtitle();

        ByteString getSubtitleBytes();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasImage();
    }

    static /* synthetic */ int access$2276(Grid grid, int i) {
        int i2 = i | grid.bitField0_;
        grid.bitField0_ = i2;
        return i2;
    }

    private Grid(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.title_ = "";
        this.columnCount_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private Grid() {
        this.title_ = "";
        this.columnCount_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.title_ = "";
        this.items_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Grid();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CardProto.internal_static_google_apps_card_v1_Grid_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CardProto.internal_static_google_apps_card_v1_Grid_fieldAccessorTable.ensureFieldAccessorsInitialized(Grid.class, Builder.class);
    }

    public static final class GridItem extends GeneratedMessageV3 implements GridItemOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IMAGE_FIELD_NUMBER = 2;
        public static final int LAYOUT_FIELD_NUMBER = 9;
        public static final int SUBTITLE_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private ImageComponent image_;
        private int layout_;
        private byte memoizedIsInitialized;
        private volatile Object subtitle_;
        private volatile Object title_;
        private static final GridItem DEFAULT_INSTANCE = new GridItem();
        private static final Parser<GridItem> PARSER = new AbstractParser<GridItem>() { // from class: com.google.apps.card.v1.Grid.GridItem.1
            @Override // com.google.protobuf.Parser
            public GridItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GridItem.newBuilder();
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

        static /* synthetic */ int access$976(GridItem gridItem, int i) {
            int i2 = i | gridItem.bitField0_;
            gridItem.bitField0_ = i2;
            return i2;
        }

        private GridItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.layout_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        private GridItem() {
            this.id_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.layout_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.layout_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GridItem();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Grid_GridItem_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Grid_GridItem_fieldAccessorTable.ensureFieldAccessorsInitialized(GridItem.class, Builder.class);
        }

        public enum GridItemLayout implements ProtocolMessageEnum {
            GRID_ITEM_LAYOUT_UNSPECIFIED(0),
            TEXT_BELOW(1),
            TEXT_ABOVE(2),
            UNRECOGNIZED(-1);

            public static final int GRID_ITEM_LAYOUT_UNSPECIFIED_VALUE = 0;
            public static final int TEXT_ABOVE_VALUE = 2;
            public static final int TEXT_BELOW_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<GridItemLayout> internalValueMap = new Internal.EnumLiteMap<GridItemLayout>() { // from class: com.google.apps.card.v1.Grid.GridItem.GridItemLayout.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GridItemLayout findValueByNumber(int i) {
                    return GridItemLayout.forNumber(i);
                }
            };
            private static final GridItemLayout[] VALUES = values();

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static GridItemLayout valueOf(int i) {
                return forNumber(i);
            }

            public static GridItemLayout forNumber(int i) {
                if (i == 0) {
                    return GRID_ITEM_LAYOUT_UNSPECIFIED;
                }
                if (i == 1) {
                    return TEXT_BELOW;
                }
                if (i != 2) {
                    return null;
                }
                return TEXT_ABOVE;
            }

            public static Internal.EnumLiteMap<GridItemLayout> internalGetValueMap() {
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
                return GridItem.getDescriptor().getEnumTypes().get(0);
            }

            public static GridItemLayout valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }

            GridItemLayout(int i) {
                this.value = i;
            }
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public boolean hasImage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public ImageComponent getImage() {
            ImageComponent imageComponent = this.image_;
            return imageComponent == null ? ImageComponent.getDefaultInstance() : imageComponent;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public ImageComponentOrBuilder getImageOrBuilder() {
            ImageComponent imageComponent = this.image_;
            return imageComponent == null ? ImageComponent.getDefaultInstance() : imageComponent;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public String getSubtitle() {
            Object obj = this.subtitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.subtitle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public ByteString getSubtitleBytes() {
            Object obj = this.subtitle_;
            if (obj instanceof String) {
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subtitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public int getLayoutValue() {
            return this.layout_;
        }

        @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
        public GridItemLayout getLayout() {
            GridItemLayout gridItemLayoutForNumber = GridItemLayout.forNumber(this.layout_);
            return gridItemLayoutForNumber == null ? GridItemLayout.UNRECOGNIZED : gridItemLayoutForNumber;
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getImage());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.subtitle_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.subtitle_);
            }
            if (this.layout_ != GridItemLayout.GRID_ITEM_LAYOUT_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(9, this.layout_);
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
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getImage());
            }
            if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.title_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.subtitle_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.subtitle_);
            }
            if (this.layout_ != GridItemLayout.GRID_ITEM_LAYOUT_UNSPECIFIED.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(9, this.layout_);
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
            if (!(obj instanceof GridItem)) {
                return super.equals(obj);
            }
            GridItem gridItem = (GridItem) obj;
            if (getId().equals(gridItem.getId()) && hasImage() == gridItem.hasImage()) {
                return (!hasImage() || getImage().equals(gridItem.getImage())) && getTitle().equals(gridItem.getTitle()) && getSubtitle().equals(gridItem.getSubtitle()) && this.layout_ == gridItem.layout_ && getUnknownFields().equals(gridItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode();
            if (hasImage()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getImage().hashCode();
            }
            int iHashCode2 = (((((((((((((iHashCode * 37) + 3) * 53) + getTitle().hashCode()) * 37) + 4) * 53) + getSubtitle().hashCode()) * 37) + 9) * 53) + this.layout_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public static GridItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static GridItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static GridItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static GridItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GridItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static GridItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GridItem parseFrom(InputStream inputStream) throws IOException {
            return (GridItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GridItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GridItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GridItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GridItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GridItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GridItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GridItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GridItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GridItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GridItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(GridItem gridItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gridItem);
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GridItemOrBuilder {
            private int bitField0_;
            private Object id_;
            private SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> imageBuilder_;
            private ImageComponent image_;
            private int layout_;
            private Object subtitle_;
            private Object title_;

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CardProto.internal_static_google_apps_card_v1_Grid_GridItem_descriptor;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CardProto.internal_static_google_apps_card_v1_Grid_GridItem_fieldAccessorTable.ensureFieldAccessorsInitialized(GridItem.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.title_ = "";
                this.subtitle_ = "";
                this.layout_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.title_ = "";
                this.subtitle_ = "";
                this.layout_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GridItem.alwaysUseFieldBuilders) {
                    getImageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.image_ = null;
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.imageBuilder_ = null;
                }
                this.title_ = "";
                this.subtitle_ = "";
                this.layout_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CardProto.internal_static_google_apps_card_v1_Grid_GridItem_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GridItem getDefaultInstanceForType() {
                return GridItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GridItem build() {
                GridItem gridItemBuildPartial = buildPartial();
                if (gridItemBuildPartial.isInitialized()) {
                    return gridItemBuildPartial;
                }
                throw newUninitializedMessageException((Message) gridItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GridItem buildPartial() {
                GridItem gridItem = new GridItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(gridItem);
                }
                onBuilt();
                return gridItem;
            }

            private void buildPartial0(GridItem gridItem) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    gridItem.id_ = this.id_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                    gridItem.image_ = singleFieldBuilderV3 == null ? this.image_ : (ImageComponent) singleFieldBuilderV3.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    gridItem.title_ = this.title_;
                }
                if ((i2 & 8) != 0) {
                    gridItem.subtitle_ = this.subtitle_;
                }
                if ((i2 & 16) != 0) {
                    gridItem.layout_ = this.layout_;
                }
                GridItem.access$976(gridItem, i);
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
                if (message instanceof GridItem) {
                    return mergeFrom((GridItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GridItem gridItem) {
                if (gridItem == GridItem.getDefaultInstance()) {
                    return this;
                }
                if (!gridItem.getId().isEmpty()) {
                    this.id_ = gridItem.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (gridItem.hasImage()) {
                    mergeImage(gridItem.getImage());
                }
                if (!gridItem.getTitle().isEmpty()) {
                    this.title_ = gridItem.title_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!gridItem.getSubtitle().isEmpty()) {
                    this.subtitle_ = gridItem.subtitle_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (gridItem.layout_ != 0) {
                    setLayoutValue(gridItem.getLayoutValue());
                }
                mergeUnknownFields(gridItem.getUnknownFields());
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
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getImageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.subtitle_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 72) {
                                    this.layout_ = codedInputStream.readEnum();
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

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
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
                this.id_ = GridItem.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                GridItem.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public boolean hasImage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public ImageComponent getImage() {
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ImageComponent imageComponent = this.image_;
                    return imageComponent == null ? ImageComponent.getDefaultInstance() : imageComponent;
                }
                return (ImageComponent) singleFieldBuilderV3.getMessage();
            }

            public Builder setImage(ImageComponent imageComponent) {
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    imageComponent.getClass();
                    this.image_ = imageComponent;
                } else {
                    singleFieldBuilderV3.setMessage(imageComponent);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setImage(ImageComponent.Builder builder) {
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.image_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeImage(ImageComponent imageComponent) {
                ImageComponent imageComponent2;
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0 && (imageComponent2 = this.image_) != null && imageComponent2 != ImageComponent.getDefaultInstance()) {
                        getImageBuilder().mergeFrom(imageComponent);
                    } else {
                        this.image_ = imageComponent;
                    }
                } else {
                    singleFieldBuilderV3.mergeFrom(imageComponent);
                }
                if (this.image_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder clearImage() {
                this.bitField0_ &= -3;
                this.image_ = null;
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.imageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public ImageComponent.Builder getImageBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ImageComponent.Builder) getImageFieldBuilder().getBuilder();
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public ImageComponentOrBuilder getImageOrBuilder() {
                SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ImageComponentOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ImageComponent imageComponent = this.image_;
                return imageComponent == null ? ImageComponent.getDefaultInstance() : imageComponent;
            }

            private SingleFieldBuilderV3<ImageComponent, ImageComponent.Builder, ImageComponentOrBuilder> getImageFieldBuilder() {
                if (this.imageBuilder_ == null) {
                    this.imageBuilder_ = new SingleFieldBuilderV3<>(getImage(), getParentForChildren(), isClean());
                    this.image_ = null;
                }
                return this.imageBuilder_;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
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
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = GridItem.getDefaultInstance().getTitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                GridItem.checkByteStringIsUtf8(byteString);
                this.title_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public String getSubtitle() {
                Object obj = this.subtitle_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.subtitle_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearSubtitle() {
                this.subtitle_ = GridItem.getDefaultInstance().getSubtitle();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder setSubtitleBytes(ByteString byteString) {
                byteString.getClass();
                GridItem.checkByteStringIsUtf8(byteString);
                this.subtitle_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public int getLayoutValue() {
                return this.layout_;
            }

            public Builder setLayoutValue(int i) {
                this.layout_ = i;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.apps.card.v1.Grid.GridItemOrBuilder
            public GridItemLayout getLayout() {
                GridItemLayout gridItemLayoutForNumber = GridItemLayout.forNumber(this.layout_);
                return gridItemLayoutForNumber == null ? GridItemLayout.UNRECOGNIZED : gridItemLayoutForNumber;
            }

            public Builder setLayout(GridItemLayout gridItemLayout) {
                gridItemLayout.getClass();
                this.bitField0_ |= 16;
                this.layout_ = gridItemLayout.getNumber();
                onChanged();
                return this;
            }

            public Builder clearLayout() {
                this.bitField0_ &= -17;
                this.layout_ = 0;
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

        public static GridItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<GridItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GridItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GridItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public String getTitle() {
        Object obj = this.title_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.title_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public ByteString getTitleBytes() {
        Object obj = this.title_;
        if (obj instanceof String) {
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public List<GridItem> getItemsList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public List<? extends GridItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public GridItem getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public GridItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public boolean hasBorderStyle() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public BorderStyle getBorderStyle() {
        BorderStyle borderStyle = this.borderStyle_;
        return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public BorderStyleOrBuilder getBorderStyleOrBuilder() {
        BorderStyle borderStyle = this.borderStyle_;
        return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public int getColumnCount() {
        return this.columnCount_;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public boolean hasOnClick() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
    public OnClick getOnClick() {
        OnClick onClick = this.onClick_;
        return onClick == null ? OnClick.getDefaultInstance() : onClick;
    }

    @Override // com.google.apps.card.v1.GridOrBuilder
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
        if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.title_);
        }
        for (int i = 0; i < this.items_.size(); i++) {
            codedOutputStream.writeMessage(2, this.items_.get(i));
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(3, getBorderStyle());
        }
        int i2 = this.columnCount_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.writeMessage(5, getOnClick());
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
        for (int i2 = 0; i2 < this.items_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.items_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, getBorderStyle());
        }
        int i3 = this.columnCount_;
        if (i3 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(4, i3);
        }
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getOnClick());
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
        if (!(obj instanceof Grid)) {
            return super.equals(obj);
        }
        Grid grid = (Grid) obj;
        if (!getTitle().equals(grid.getTitle()) || !getItemsList().equals(grid.getItemsList()) || hasBorderStyle() != grid.hasBorderStyle()) {
            return false;
        }
        if ((!hasBorderStyle() || getBorderStyle().equals(grid.getBorderStyle())) && getColumnCount() == grid.getColumnCount() && hasOnClick() == grid.hasOnClick()) {
            return (!hasOnClick() || getOnClick().equals(grid.getOnClick())) && getUnknownFields().equals(grid.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTitle().hashCode();
        if (getItemsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getItemsList().hashCode();
        }
        if (hasBorderStyle()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getBorderStyle().hashCode();
        }
        int columnCount = (((iHashCode * 37) + 4) * 53) + getColumnCount();
        if (hasOnClick()) {
            columnCount = (((columnCount * 37) + 5) * 53) + getOnClick().hashCode();
        }
        int iHashCode2 = (columnCount * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static Grid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Grid parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Grid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Grid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Grid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Grid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Grid parseFrom(InputStream inputStream) throws IOException {
        return (Grid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Grid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Grid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Grid parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Grid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Grid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Grid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Grid parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Grid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Grid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Grid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Grid grid) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(grid);
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GridOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> borderStyleBuilder_;
        private BorderStyle borderStyle_;
        private int columnCount_;
        private RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> itemsBuilder_;
        private List<GridItem> items_;
        private SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> onClickBuilder_;
        private OnClick onClick_;
        private Object title_;

        @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CardProto.internal_static_google_apps_card_v1_Grid_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CardProto.internal_static_google_apps_card_v1_Grid_fieldAccessorTable.ensureFieldAccessorsInitialized(Grid.class, Builder.class);
        }

        private Builder() {
            this.title_ = "";
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.title_ = "";
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Grid.alwaysUseFieldBuilders) {
                getItemsFieldBuilder();
                getBorderStyleFieldBuilder();
                getOnClickFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.title_ = "";
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
            } else {
                this.items_ = null;
                repeatedFieldBuilderV3.clear();
            }
            this.bitField0_ &= -3;
            this.borderStyle_ = null;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.borderStyleBuilder_ = null;
            }
            this.columnCount_ = 0;
            this.onClick_ = null;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV32 = this.onClickBuilder_;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.dispose();
                this.onClickBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CardProto.internal_static_google_apps_card_v1_Grid_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Grid getDefaultInstanceForType() {
            return Grid.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Grid build() {
            Grid gridBuildPartial = buildPartial();
            if (gridBuildPartial.isInitialized()) {
                return gridBuildPartial;
            }
            throw newUninitializedMessageException((Message) gridBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Grid buildPartial() {
            Grid grid = new Grid(this);
            buildPartialRepeatedFields(grid);
            if (this.bitField0_ != 0) {
                buildPartial0(grid);
            }
            onBuilt();
            return grid;
        }

        private void buildPartialRepeatedFields(Grid grid) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                grid.items_ = repeatedFieldBuilderV3.build();
                return;
            }
            if ((this.bitField0_ & 2) != 0) {
                this.items_ = Collections.unmodifiableList(this.items_);
                this.bitField0_ &= -3;
            }
            grid.items_ = this.items_;
        }

        private void buildPartial0(Grid grid) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                grid.title_ = this.title_;
            }
            if ((i2 & 4) != 0) {
                SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
                grid.borderStyle_ = singleFieldBuilderV3 == null ? this.borderStyle_ : (BorderStyle) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                grid.columnCount_ = this.columnCount_;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV32 = this.onClickBuilder_;
                grid.onClick_ = singleFieldBuilderV32 == null ? this.onClick_ : (OnClick) singleFieldBuilderV32.build();
                i |= 2;
            }
            Grid.access$2276(grid, i);
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
            if (message instanceof Grid) {
                return mergeFrom((Grid) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Grid grid) {
            if (grid == Grid.getDefaultInstance()) {
                return this;
            }
            if (!grid.getTitle().isEmpty()) {
                this.title_ = grid.title_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.itemsBuilder_ == null) {
                if (!grid.items_.isEmpty()) {
                    if (this.items_.isEmpty()) {
                        this.items_ = grid.items_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureItemsIsMutable();
                        this.items_.addAll(grid.items_);
                    }
                    onChanged();
                }
            } else if (!grid.items_.isEmpty()) {
                if (!this.itemsBuilder_.isEmpty()) {
                    this.itemsBuilder_.addAllMessages(grid.items_);
                } else {
                    this.itemsBuilder_.dispose();
                    this.itemsBuilder_ = null;
                    this.items_ = grid.items_;
                    this.bitField0_ &= -3;
                    this.itemsBuilder_ = Grid.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                }
            }
            if (grid.hasBorderStyle()) {
                mergeBorderStyle(grid.getBorderStyle());
            }
            if (grid.getColumnCount() != 0) {
                setColumnCount(grid.getColumnCount());
            }
            if (grid.hasOnClick()) {
                mergeOnClick(grid.getOnClick());
            }
            mergeUnknownFields(grid.getUnknownFields());
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
                                GridItem gridItem = (GridItem) codedInputStream.readMessage(GridItem.parser(), extensionRegistryLite);
                                RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                if (repeatedFieldBuilderV3 == null) {
                                    ensureItemsIsMutable();
                                    this.items_.add(gridItem);
                                } else {
                                    repeatedFieldBuilderV3.addMessage(gridItem);
                                }
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getBorderStyleFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.columnCount_ = codedInputStream.readInt32();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getOnClickFieldBuilder().getBuilder(), extensionRegistryLite);
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

        @Override // com.google.apps.card.v1.GridOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
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
            this.title_ = Grid.getDefaultInstance().getTitle();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            byteString.getClass();
            Grid.checkByteStringIsUtf8(byteString);
            this.title_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.items_ = new ArrayList(this.items_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public List<GridItem> getItemsList() {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.items_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public int getItemsCount() {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public GridItem getItems(int i) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (GridItem) repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setItems(int i, GridItem gridItem) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                gridItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, gridItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, gridItem);
            }
            return this;
        }

        public Builder setItems(int i, GridItem.Builder builder) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addItems(GridItem gridItem) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                gridItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(gridItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(gridItem);
            }
            return this;
        }

        public Builder addItems(int i, GridItem gridItem) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                gridItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, gridItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, gridItem);
            }
            return this;
        }

        public Builder addItems(GridItem.Builder builder) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addItems(int i, GridItem.Builder builder) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllItems(Iterable<? extends GridItem> iterable) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
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
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeItems(int i) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public GridItem.Builder getItemsBuilder(int i) {
            return (GridItem.Builder) getItemsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public GridItemOrBuilder getItemsOrBuilder(int i) {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return (GridItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public List<? extends GridItemOrBuilder> getItemsOrBuilderList() {
            RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.items_);
        }

        public GridItem.Builder addItemsBuilder() {
            return (GridItem.Builder) getItemsFieldBuilder().addBuilder(GridItem.getDefaultInstance());
        }

        public GridItem.Builder addItemsBuilder(int i) {
            return (GridItem.Builder) getItemsFieldBuilder().addBuilder(i, GridItem.getDefaultInstance());
        }

        public List<GridItem.Builder> getItemsBuilderList() {
            return getItemsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<GridItem, GridItem.Builder, GridItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
                this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.items_ = null;
            }
            return this.itemsBuilder_;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public boolean hasBorderStyle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public BorderStyle getBorderStyle() {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                BorderStyle borderStyle = this.borderStyle_;
                return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
            }
            return (BorderStyle) singleFieldBuilderV3.getMessage();
        }

        public Builder setBorderStyle(BorderStyle borderStyle) {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                borderStyle.getClass();
                this.borderStyle_ = borderStyle;
            } else {
                singleFieldBuilderV3.setMessage(borderStyle);
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setBorderStyle(BorderStyle.Builder builder) {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.borderStyle_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder mergeBorderStyle(BorderStyle borderStyle) {
            BorderStyle borderStyle2;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0 && (borderStyle2 = this.borderStyle_) != null && borderStyle2 != BorderStyle.getDefaultInstance()) {
                    getBorderStyleBuilder().mergeFrom(borderStyle);
                } else {
                    this.borderStyle_ = borderStyle;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(borderStyle);
            }
            if (this.borderStyle_ != null) {
                this.bitField0_ |= 4;
                onChanged();
            }
            return this;
        }

        public Builder clearBorderStyle() {
            this.bitField0_ &= -5;
            this.borderStyle_ = null;
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.borderStyleBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public BorderStyle.Builder getBorderStyleBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (BorderStyle.Builder) getBorderStyleFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public BorderStyleOrBuilder getBorderStyleOrBuilder() {
            SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> singleFieldBuilderV3 = this.borderStyleBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (BorderStyleOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            BorderStyle borderStyle = this.borderStyle_;
            return borderStyle == null ? BorderStyle.getDefaultInstance() : borderStyle;
        }

        private SingleFieldBuilderV3<BorderStyle, BorderStyle.Builder, BorderStyleOrBuilder> getBorderStyleFieldBuilder() {
            if (this.borderStyleBuilder_ == null) {
                this.borderStyleBuilder_ = new SingleFieldBuilderV3<>(getBorderStyle(), getParentForChildren(), isClean());
                this.borderStyle_ = null;
            }
            return this.borderStyleBuilder_;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public int getColumnCount() {
            return this.columnCount_;
        }

        public Builder setColumnCount(int i) {
            this.columnCount_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder clearColumnCount() {
            this.bitField0_ &= -9;
            this.columnCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
        public boolean hasOnClick() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
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
            this.bitField0_ |= 16;
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
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeOnClick(OnClick onClick) {
            OnClick onClick2;
            SingleFieldBuilderV3<OnClick, OnClick.Builder, OnClickOrBuilder> singleFieldBuilderV3 = this.onClickBuilder_;
            if (singleFieldBuilderV3 == null) {
                if ((this.bitField0_ & 16) != 0 && (onClick2 = this.onClick_) != null && onClick2 != OnClick.getDefaultInstance()) {
                    getOnClickBuilder().mergeFrom(onClick);
                } else {
                    this.onClick_ = onClick;
                }
            } else {
                singleFieldBuilderV3.mergeFrom(onClick);
            }
            if (this.onClick_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder clearOnClick() {
            this.bitField0_ &= -17;
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
            this.bitField0_ |= 16;
            onChanged();
            return (OnClick.Builder) getOnClickFieldBuilder().getBuilder();
        }

        @Override // com.google.apps.card.v1.GridOrBuilder
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

    public static Grid getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Grid> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Grid> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Grid getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
