package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ClientProto {
    public static final int API_VERSION_FIELD_NUMBER = 525000001;
    public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
    public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
    public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> apiVersion;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> defaultHost;
    private static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_google_api_ClientLibrarySettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_ClientLibrarySettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_CommonLanguageSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_CommonLanguageSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_CppSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_CppSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_DotnetSettings_RenamedResourcesEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_DotnetSettings_RenamedServicesEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_DotnetSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_DotnetSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_GoSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_GoSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_JavaSettings_ServiceClassNamesEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_JavaSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_JavaSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_MethodSettings_LongRunning_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_MethodSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_MethodSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_NodeSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_NodeSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_PhpSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_PhpSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_Publishing_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_Publishing_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_PythonSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_PythonSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_api_RubySettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_api_RubySettings_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> methodSignature;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> oauthScopes;

    private ClientProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(defaultHost);
        extensionRegistryLite.add(oauthScopes);
        extensionRegistryLite.add(apiVersion);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        methodSignature = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        defaultHost = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        oauthScopes = generatedExtensionNewFileScopedGeneratedExtension3;
        GeneratedMessage.GeneratedExtension<DescriptorProtos.ServiceOptions, String> generatedExtensionNewFileScopedGeneratedExtension4 = GeneratedMessage.newFileScopedGeneratedExtension(String.class, null);
        apiVersion = generatedExtensionNewFileScopedGeneratedExtension4;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017google/api/client.proto\u0012\ngoogle.api\u001a\u001dgoogle/api/launch_stage.proto\u001a google/protobuf/descriptor.proto\u001a\u001egoogle/protobuf/duration.proto\"t\n\u0016CommonLanguageSettings\u0012\u001e\n\u0012reference_docs_uri\u0018\u0001 \u0001(\tB\u0002\u0018\u0001\u0012:\n\fdestinations\u0018\u0002 \u0003(\u000e2$.google.api.ClientLibraryDestination\"û\u0003\n\u0015ClientLibrarySettings\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\t\u0012-\n\flaunch_stage\u0018\u0002 \u0001(\u000e2\u0017.google.api.LaunchStage\u0012\u001a\n\u0012rest_numeric_enums\u0018\u0003 \u0001(\b\u0012/\n\rjava_settings\u0018\u0015 \u0001(\u000b2\u0018.google.api.JavaSettings\u0012-\n\fcpp_settings\u0018\u0016 \u0001(\u000b2\u0017.google.api.CppSettings\u0012-\n\fphp_settings\u0018\u0017 \u0001(\u000b2\u0017.google.api.PhpSettings\u00123\n\u000fpython_settings\u0018\u0018 \u0001(\u000b2\u001a.google.api.PythonSettings\u0012/\n\rnode_settings\u0018\u0019 \u0001(\u000b2\u0018.google.api.NodeSettings\u00123\n\u000fdotnet_settings\u0018\u001a \u0001(\u000b2\u001a.google.api.DotnetSettings\u0012/\n\rruby_settings\u0018\u001b \u0001(\u000b2\u0018.google.api.RubySettings\u0012+\n\u000bgo_settings\u0018\u001c \u0001(\u000b2\u0016.google.api.GoSettings\"¨\u0003\n\nPublishing\u00123\n\u000fmethod_settings\u0018\u0002 \u0003(\u000b2\u001a.google.api.MethodSettings\u0012\u0015\n\rnew_issue_uri\u0018e \u0001(\t\u0012\u0019\n\u0011documentation_uri\u0018f \u0001(\t\u0012\u0016\n\u000eapi_short_name\u0018g \u0001(\t\u0012\u0014\n\fgithub_label\u0018h \u0001(\t\u0012\u001e\n\u0016codeowner_github_teams\u0018i \u0003(\t\u0012\u0016\n\u000edoc_tag_prefix\u0018j \u0001(\t\u0012;\n\forganization\u0018k \u0001(\u000e2%.google.api.ClientLibraryOrganization\u0012;\n\u0010library_settings\u0018m \u0003(\u000b2!.google.api.ClientLibrarySettings\u0012)\n!proto_reference_documentation_uri\u0018n \u0001(\t\u0012(\n rest_reference_documentation_uri\u0018o \u0001(\t\"ã\u0001\n\fJavaSettings\u0012\u0017\n\u000flibrary_package\u0018\u0001 \u0001(\t\u0012L\n\u0013service_class_names\u0018\u0002 \u0003(\u000b2/.google.api.JavaSettings.ServiceClassNamesEntry\u00122\n\u0006common\u0018\u0003 \u0001(\u000b2\".google.api.CommonLanguageSettings\u001a8\n\u0016ServiceClassNamesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"A\n\u000bCppSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"A\n\u000bPhpSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"D\n\u000ePythonSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"B\n\fNodeSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"ª\u0003\n\u000eDotnetSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\u0012I\n\u0010renamed_services\u0018\u0002 \u0003(\u000b2/.google.api.DotnetSettings.RenamedServicesEntry\u0012K\n\u0011renamed_resources\u0018\u0003 \u0003(\u000b20.google.api.DotnetSettings.RenamedResourcesEntry\u0012\u0019\n\u0011ignored_resources\u0018\u0004 \u0003(\t\u0012 \n\u0018forced_namespace_aliases\u0018\u0005 \u0003(\t\u0012\u001e\n\u0016handwritten_signatures\u0018\u0006 \u0003(\t\u001a6\n\u0014RenamedServicesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a7\n\u0015RenamedResourcesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"B\n\fRubySettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"@\n\nGoSettings\u00122\n\u0006common\u0018\u0001 \u0001(\u000b2\".google.api.CommonLanguageSettings\"Ï\u0002\n\u000eMethodSettings\u0012\u0010\n\bselector\u0018\u0001 \u0001(\t\u0012<\n\flong_running\u0018\u0002 \u0001(\u000b2&.google.api.MethodSettings.LongRunning\u0012\u001d\n\u0015auto_populated_fields\u0018\u0003 \u0003(\t\u001aÍ\u0001\n\u000bLongRunning\u00125\n\u0012initial_poll_delay\u0018\u0001 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\u001d\n\u0015poll_delay_multiplier\u0018\u0002 \u0001(\u0002\u00121\n\u000emax_poll_delay\u0018\u0003 \u0001(\u000b2\u0019.google.protobuf.Duration\u00125\n\u0012total_poll_timeout\u0018\u0004 \u0001(\u000b2\u0019.google.protobuf.Duration*£\u0001\n\u0019ClientLibraryOrganization\u0012+\n'CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIED\u0010\u0000\u0012\t\n\u0005CLOUD\u0010\u0001\u0012\u0007\n\u0003ADS\u0010\u0002\u0012\n\n\u0006PHOTOS\u0010\u0003\u0012\u000f\n\u000bSTREET_VIEW\u0010\u0004\u0012\f\n\bSHOPPING\u0010\u0005\u0012\u0007\n\u0003GEO\u0010\u0006\u0012\u0011\n\rGENERATIVE_AI\u0010\u0007*g\n\u0018ClientLibraryDestination\u0012*\n&CLIENT_LIBRARY_DESTINATION_UNSPECIFIED\u0010\u0000\u0012\n\n\u0006GITHUB\u0010\n\u0012\u0013\n\u000fPACKAGE_MANAGER\u0010\u0014:9\n\u0010method_signature\u0012\u001e.google.protobuf.MethodOptions\u0018\u009b\b \u0003(\t:6\n\fdefault_host\u0012\u001f.google.protobuf.ServiceOptions\u0018\u0099\b \u0001(\t:6\n\foauth_scopes\u0012\u001f.google.protobuf.ServiceOptions\u0018\u009a\b \u0001(\t:8\n\u000bapi_version\u0012\u001f.google.protobuf.ServiceOptions\u0018Áº«ú\u0001 \u0001(\tBi\n\u000ecom.google.apiB\u000bClientProtoP\u0001ZAgoogle.golang.org/genproto/googleapis/api/annotations;annotations¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[]{LaunchStageProto.getDescriptor(), DescriptorProtos.getDescriptor(), DurationProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_api_CommonLanguageSettings_descriptor = descriptor2;
        internal_static_google_api_CommonLanguageSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ReferenceDocsUri", "Destinations"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_api_ClientLibrarySettings_descriptor = descriptor3;
        internal_static_google_api_ClientLibrarySettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Version", "LaunchStage", "RestNumericEnums", "JavaSettings", "CppSettings", "PhpSettings", "PythonSettings", "NodeSettings", "DotnetSettings", "RubySettings", "GoSettings"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_api_Publishing_descriptor = descriptor4;
        internal_static_google_api_Publishing_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"MethodSettings", "NewIssueUri", "DocumentationUri", "ApiShortName", "GithubLabel", "CodeownerGithubTeams", "DocTagPrefix", "Organization", "LibrarySettings", "ProtoReferenceDocumentationUri", "RestReferenceDocumentationUri"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_api_JavaSettings_descriptor = descriptor5;
        internal_static_google_api_JavaSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"LibraryPackage", "ServiceClassNames", "Common"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor = descriptor6;
        internal_static_google_api_JavaSettings_ServiceClassNamesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_api_CppSettings_descriptor = descriptor7;
        internal_static_google_api_CppSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Common"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_api_PhpSettings_descriptor = descriptor8;
        internal_static_google_api_PhpSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Common"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_api_PythonSettings_descriptor = descriptor9;
        internal_static_google_api_PythonSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Common"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_api_NodeSettings_descriptor = descriptor10;
        internal_static_google_api_NodeSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Common"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(8);
        internal_static_google_api_DotnetSettings_descriptor = descriptor11;
        internal_static_google_api_DotnetSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Common", "RenamedServices", "RenamedResources", "IgnoredResources", "ForcedNamespaceAliases", "HandwrittenSignatures"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor = descriptor12;
        internal_static_google_api_DotnetSettings_RenamedServicesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor13 = descriptor11.getNestedTypes().get(1);
        internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor = descriptor13;
        internal_static_google_api_DotnetSettings_RenamedResourcesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(9);
        internal_static_google_api_RubySettings_descriptor = descriptor14;
        internal_static_google_api_RubySettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Common"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(10);
        internal_static_google_api_GoSettings_descriptor = descriptor15;
        internal_static_google_api_GoSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Common"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(11);
        internal_static_google_api_MethodSettings_descriptor = descriptor16;
        internal_static_google_api_MethodSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Selector", "LongRunning", "AutoPopulatedFields"});
        Descriptors.Descriptor descriptor17 = descriptor16.getNestedTypes().get(0);
        internal_static_google_api_MethodSettings_LongRunning_descriptor = descriptor17;
        internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"InitialPollDelay", "PollDelayMultiplier", "MaxPollDelay", "TotalPollTimeout"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        generatedExtensionNewFileScopedGeneratedExtension4.internalInit(descriptor.getExtensions().get(3));
        LaunchStageProto.getDescriptor();
        DescriptorProtos.getDescriptor();
        DurationProto.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
