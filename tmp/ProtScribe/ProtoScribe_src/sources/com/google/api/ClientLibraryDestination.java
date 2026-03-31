package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes.dex */
public enum ClientLibraryDestination implements ProtocolMessageEnum {
    CLIENT_LIBRARY_DESTINATION_UNSPECIFIED(0),
    GITHUB(10),
    PACKAGE_MANAGER(20),
    UNRECOGNIZED(-1);

    public static final int CLIENT_LIBRARY_DESTINATION_UNSPECIFIED_VALUE = 0;
    public static final int GITHUB_VALUE = 10;
    public static final int PACKAGE_MANAGER_VALUE = 20;
    private final int value;
    private static final Internal.EnumLiteMap<ClientLibraryDestination> internalValueMap = new Internal.EnumLiteMap<ClientLibraryDestination>() { // from class: com.google.api.ClientLibraryDestination.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ClientLibraryDestination findValueByNumber(int i) {
            return ClientLibraryDestination.forNumber(i);
        }
    };
    private static final ClientLibraryDestination[] VALUES = values();

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static ClientLibraryDestination valueOf(int i) {
        return forNumber(i);
    }

    public static ClientLibraryDestination forNumber(int i) {
        if (i == 0) {
            return CLIENT_LIBRARY_DESTINATION_UNSPECIFIED;
        }
        if (i == 10) {
            return GITHUB;
        }
        if (i != 20) {
            return null;
        }
        return PACKAGE_MANAGER;
    }

    public static Internal.EnumLiteMap<ClientLibraryDestination> internalGetValueMap() {
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
        return ClientProto.getDescriptor().getEnumTypes().get(1);
    }

    public static ClientLibraryDestination valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    ClientLibraryDestination(int i) {
        this.value = i;
    }
}
