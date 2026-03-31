package com.google.rpc.context;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;

/* JADX INFO: loaded from: classes2.dex */
public final class AuditContextProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n&google/rpc/context/audit_context.proto\u0012\u0012google.rpc.context\u001a\u001cgoogle/protobuf/struct.proto\"Ç\u0001\n\fAuditContext\u0012\u0011\n\taudit_log\u0018\u0001 \u0001(\f\u00121\n\u0010scrubbed_request\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u00122\n\u0011scrubbed_response\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012$\n\u001cscrubbed_response_item_count\u0018\u0004 \u0001(\u0005\u0012\u0017\n\u000ftarget_resource\u0018\u0005 \u0001(\tBk\n\u0016com.google.rpc.contextB\u0011AuditContextProtoP\u0001Z9google.golang.org/genproto/googleapis/rpc/context;contextø\u0001\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{StructProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_rpc_context_AuditContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_rpc_context_AuditContext_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private AuditContextProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_rpc_context_AuditContext_descriptor = descriptor2;
        internal_static_google_rpc_context_AuditContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AuditLog", "ScrubbedRequest", "ScrubbedResponse", "ScrubbedResponseItemCount", "TargetResource"});
        StructProto.getDescriptor();
    }
}
