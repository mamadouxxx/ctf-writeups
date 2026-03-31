package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes.dex */
public final class PolicyProto {
    public static final int FIELD_POLICY_FIELD_NUMBER = 158361448;
    public static final int METHOD_POLICY_FIELD_NUMBER = 161893301;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, FieldPolicy> fieldPolicy;
    static final Descriptors.Descriptor internal_static_google_api_FieldPolicy_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_FieldPolicy_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_MethodPolicy_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_MethodPolicy_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, MethodPolicy> methodPolicy;

    private PolicyProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(fieldPolicy);
        extensionRegistryLite.add(methodPolicy);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FieldOptions, FieldPolicy> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(FieldPolicy.class, FieldPolicy.getDefaultInstance());
        fieldPolicy = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, MethodPolicy> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(MethodPolicy.class, MethodPolicy.getDefaultInstance());
        methodPolicy = generatedExtensionNewFileScopedGeneratedExtension2;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017google/api/policy.proto\u0012\ngoogle.api\u001a google/protobuf/descriptor.proto\"S\n\u000bFieldPolicy\u0012\u0010\n\bselector\u0018\u0001 \u0001(\t\u0012\u001b\n\u0013resource_permission\u0018\u0002 \u0001(\t\u0012\u0015\n\rresource_type\u0018\u0003 \u0001(\t\"S\n\fMethodPolicy\u0012\u0010\n\bselector\u0018\t \u0001(\t\u00121\n\u0010request_policies\u0018\u0002 \u0003(\u000b2\u0017.google.api.FieldPolicy:O\n\ffield_policy\u0012\u001d.google.protobuf.FieldOptions\u0018èÎÁK \u0001(\u000b2\u0017.google.api.FieldPolicy:R\n\rmethod_policy\u0012\u001e.google.protobuf.MethodOptions\u0018µ\u0097\u0099M \u0001(\u000b2\u0018.google.api.MethodPolicyBp\n\u000ecom.google.apiB\u000bPolicyProtoP\u0001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfigø\u0001\u0001¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_FieldPolicy_descriptor = descriptor2;
        internal_static_google_api_FieldPolicy_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Selector", "ResourcePermission", "ResourceType"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_api_MethodPolicy_descriptor = descriptor3;
        internal_static_google_api_MethodPolicy_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Selector", "RequestPolicies"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        DescriptorProtos.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
