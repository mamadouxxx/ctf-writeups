package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes.dex */
public enum ClientLibraryOrganization implements ProtocolMessageEnum {
    CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED(0),
    CLOUD(1),
    ADS(2),
    PHOTOS(3),
    STREET_VIEW(4),
    SHOPPING(5),
    GEO(6),
    GENERATIVE_AI(7),
    UNRECOGNIZED(-1);

    public static final int ADS_VALUE = 2;
    public static final int CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED_VALUE = 0;
    public static final int CLOUD_VALUE = 1;
    public static final int GENERATIVE_AI_VALUE = 7;
    public static final int GEO_VALUE = 6;
    public static final int PHOTOS_VALUE = 3;
    public static final int SHOPPING_VALUE = 5;
    public static final int STREET_VIEW_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<ClientLibraryOrganization> internalValueMap = new Internal.EnumLiteMap<ClientLibraryOrganization>() { // from class: com.google.api.ClientLibraryOrganization.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ClientLibraryOrganization findValueByNumber(int i) {
            return ClientLibraryOrganization.forNumber(i);
        }
    };
    private static final ClientLibraryOrganization[] VALUES = values();

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static ClientLibraryOrganization valueOf(int i) {
        return forNumber(i);
    }

    public static ClientLibraryOrganization forNumber(int i) {
        switch (i) {
            case 0:
                return CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED;
            case 1:
                return CLOUD;
            case 2:
                return ADS;
            case 3:
                return PHOTOS;
            case 4:
                return STREET_VIEW;
            case 5:
                return SHOPPING;
            case 6:
                return GEO;
            case 7:
                return GENERATIVE_AI;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<ClientLibraryOrganization> internalGetValueMap() {
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
        return ClientProto.getDescriptor().getEnumTypes().get(0);
    }

    public static ClientLibraryOrganization valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    ClientLibraryOrganization(int i) {
        this.value = i;
    }
}
