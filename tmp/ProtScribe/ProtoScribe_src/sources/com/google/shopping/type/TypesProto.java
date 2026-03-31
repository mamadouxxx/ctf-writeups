package com.google.shopping.type;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes2.dex */
public final class TypesProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n google/shopping/type/types.proto\u0012\u0014google.shopping.type\"±\u0001\n\u0006Weight\u0012\u001a\n\ramount_micros\u0018\u0001 \u0001(\u0003H\u0000\u0088\u0001\u0001\u00125\n\u0004unit\u0018\u0002 \u0001(\u000e2'.google.shopping.type.Weight.WeightUnit\"B\n\nWeightUnit\u0012\u001b\n\u0017WEIGHT_UNIT_UNSPECIFIED\u0010\u0000\u0012\t\n\u0005POUND\u0010\u0001\u0012\f\n\bKILOGRAM\u0010\u0002B\u0010\n\u000e_amount_micros\"c\n\u0005Price\u0012\u001a\n\ramount_micros\u0018\u0001 \u0001(\u0003H\u0000\u0088\u0001\u0001\u0012\u001a\n\rcurrency_code\u0018\u0002 \u0001(\tH\u0001\u0088\u0001\u0001B\u0010\n\u000e_amount_microsB\u0010\n\u000e_currency_code\"\u0088\u0001\n\u000fCustomAttribute\u0012\u0011\n\u0004name\u0018\u0001 \u0001(\tH\u0000\u0088\u0001\u0001\u0012\u0012\n\u0005value\u0018\u0002 \u0001(\tH\u0001\u0088\u0001\u0001\u0012;\n\fgroup_values\u0018\u0003 \u0003(\u000b2%.google.shopping.type.CustomAttributeB\u0007\n\u0005_nameB\b\n\u0006_value\"Á\u0001\n\u000bDestination\"±\u0001\n\u000fDestinationEnum\u0012 \n\u001cDESTINATION_ENUM_UNSPECIFIED\u0010\u0000\u0012\u0010\n\fSHOPPING_ADS\u0010\u0001\u0012\u000f\n\u000bDISPLAY_ADS\u0010\u0002\u0012\u0017\n\u0013LOCAL_INVENTORY_ADS\u0010\u0003\u0012\u0011\n\rFREE_LISTINGS\u0010\u0004\u0012\u0017\n\u0013FREE_LOCAL_LISTINGS\u0010\u0005\u0012\u0014\n\u0010YOUTUBE_SHOPPING\u0010\u0006\"\u0096\u0003\n\u0010ReportingContext\"\u0081\u0003\n\u0014ReportingContextEnum\u0012&\n\"REPORTING_CONTEXT_ENUM_UNSPECIFIED\u0010\u0000\u0012\u0010\n\fSHOPPING_ADS\u0010\u0001\u0012\u0015\n\rDISCOVERY_ADS\u0010\u0002\u001a\u0002\b\u0001\u0012\u0012\n\u000eDEMAND_GEN_ADS\u0010\r\u0012#\n\u001fDEMAND_GEN_ADS_DISCOVER_SURFACE\u0010\u000e\u0012\r\n\tVIDEO_ADS\u0010\u0003\u0012\u000f\n\u000bDISPLAY_ADS\u0010\u0004\u0012\u0017\n\u0013LOCAL_INVENTORY_ADS\u0010\u0005\u0012\u0019\n\u0015VEHICLE_INVENTORY_ADS\u0010\u0006\u0012\u0011\n\rFREE_LISTINGS\u0010\u0007\u0012\u0017\n\u0013FREE_LOCAL_LISTINGS\u0010\b\u0012\u001f\n\u001bFREE_LOCAL_VEHICLE_LISTINGS\u0010\t\u0012\u0014\n\u0010YOUTUBE_SHOPPING\u0010\n\u0012\u0010\n\fCLOUD_RETAIL\u0010\u000b\u0012\u0016\n\u0012LOCAL_CLOUD_RETAIL\u0010\f\"M\n\u0007Channel\"B\n\u000bChannelEnum\u0012\u001c\n\u0018CHANNEL_ENUM_UNSPECIFIED\u0010\u0000\u0012\n\n\u0006ONLINE\u0010\u0001\u0012\t\n\u0005LOCAL\u0010\u0002Bp\n\u0018com.google.shopping.typeB\nTypesProtoP\u0001Z/cloud.google.com/go/shopping/type/typepb;typepbª\u0002\u0014Google.Shopping.Typeb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_google_shopping_type_Channel_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_Channel_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_shopping_type_CustomAttribute_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_shopping_type_Destination_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_Destination_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_shopping_type_Price_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_Price_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_shopping_type_ReportingContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_ReportingContext_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_shopping_type_Weight_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_shopping_type_Weight_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private TypesProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_shopping_type_Weight_descriptor = descriptor2;
        internal_static_google_shopping_type_Weight_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AmountMicros", "Unit"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_shopping_type_Price_descriptor = descriptor3;
        internal_static_google_shopping_type_Price_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AmountMicros", "CurrencyCode"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_shopping_type_CustomAttribute_descriptor = descriptor4;
        internal_static_google_shopping_type_CustomAttribute_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "Value", "GroupValues"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_shopping_type_Destination_descriptor = descriptor5;
        internal_static_google_shopping_type_Destination_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_shopping_type_ReportingContext_descriptor = descriptor6;
        internal_static_google_shopping_type_ReportingContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_shopping_type_Channel_descriptor = descriptor7;
        internal_static_google_shopping_type_Channel_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
    }
}
