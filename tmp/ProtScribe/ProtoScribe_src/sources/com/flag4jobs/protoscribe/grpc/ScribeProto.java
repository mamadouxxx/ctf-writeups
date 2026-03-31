package com.flag4jobs.protoscribe.grpc;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes.dex */
public final class ScribeProto {
    private static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_protoscribe_AddNoteRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_AddNoteRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_AuthRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_AuthRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_AuthResponse_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_AuthResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_Contact_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_Contact_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_EditNoteRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_EditNoteRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_GenericResponse_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_GenericResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_GetNoteRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_GetNoteRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_GetNoteResponse_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_GetNoteResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_GetNotesRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_GetNotesRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_GetNotesResponse_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_GetNotesResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_Note_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_Note_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_RemoveNoteRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_RemoveNoteRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_ShareNoteRequest_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_ShareNoteRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_protoscribe_ShareNoteResponse_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_protoscribe_ShareNoteResponse_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private ScribeProto() {
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 28, 2, "", ScribeProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bsrc/main/proto/scribe.proto\u0012\u000bprotoscribe\"1\n\u000fGenericResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\"5\n\u000bAuthRequest\u0012\u0014\n\fphone_number\u0018\u0001 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0002 \u0001(\t\"K\n\fAuthResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\u0012\r\n\u0005token\u0018\u0003 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0004 \u0001(\t\"-\n\u000eGetNoteRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0002 \u0001(\t\"4\n\u0004Note\u0012\f\n\u0004uuid\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u0003 \u0001(\t\"R\n\u000fGetNoteResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\u0012\u001f\n\u0004note\u0018\u0003 \u0001(\u000b2\u0011.protoscribe.Note\".\n\u000fGetNotesRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0002 \u0001(\t\"F\n\u0010GetNotesResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\u0012\u0012\n\nnotes_uuid\u0018\u0003 \u0003(\t\"?\n\u000eAddNoteRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u0003 \u0001(\t\"N\n\u000fEditNoteRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0002 \u0001(\t\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\"0\n\u0011RemoveNoteRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0002 \u0001(\t\"-\n\u0007Contact\u0012\f\n\u0004uuid\u0018\u0001 \u0001(\t\u0012\u0014\n\fphone_number\u0018\u0002 \u0001(\t\"F\n\u0010ShareNoteRequest\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u0012\f\n\u0004uuid\u0018\u0002 \u0001(\t\u0012\u0015\n\rphone_numbers\u0018\u0003 \u0003(\t\"[\n\u0011ShareNoteResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012\r\n\u0005error\u0018\u0002 \u0001(\t\u0012&\n\bcontacts\u0018\u0003 \u0003(\u000b2\u0014.protoscribe.Contact2Ñ\u0004\n\u000bNoteService\u0012>\n\u0005Login\u0012\u0018.protoscribe.AuthRequest\u001a\u0019.protoscribe.AuthResponse\"\u0000\u0012A\n\bRegister\u0012\u0018.protoscribe.AuthRequest\u001a\u0019.protoscribe.AuthResponse\"\u0000\u0012F\n\u0007GetNote\u0012\u001b.protoscribe.GetNoteRequest\u001a\u001c.protoscribe.GetNoteResponse\"\u0000\u0012I\n\bGetNotes\u0012\u001c.protoscribe.GetNotesRequest\u001a\u001d.protoscribe.GetNotesResponse\"\u0000\u0012F\n\u0007AddNote\u0012\u001b.protoscribe.AddNoteRequest\u001a\u001c.protoscribe.GenericResponse\"\u0000\u0012H\n\bEditNote\u0012\u001c.protoscribe.EditNoteRequest\u001a\u001c.protoscribe.GenericResponse\"\u0000\u0012L\n\nRemoveNote\u0012\u001e.protoscribe.RemoveNoteRequest\u001a\u001c.protoscribe.GenericResponse\"\u0000\u0012L\n\tShareNote\u0012\u001d.protoscribe.ShareNoteRequest\u001a\u001e.protoscribe.ShareNoteResponse\"\u0000B5\n\u001ecom.flag4jobs.protoscribe.grpcB\u000bScribeProtoP\u0001¢\u0002\u0003SBPb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_protoscribe_GenericResponse_descriptor = descriptor2;
        internal_static_protoscribe_GenericResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Success", "Error"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_protoscribe_AuthRequest_descriptor = descriptor3;
        internal_static_protoscribe_AuthRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"PhoneNumber", "Password"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_protoscribe_AuthResponse_descriptor = descriptor4;
        internal_static_protoscribe_AuthResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor4, new String[]{"Success", "Error", "Token", "Uuid"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_protoscribe_GetNoteRequest_descriptor = descriptor5;
        internal_static_protoscribe_GetNoteRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor5, new String[]{"Token", "Uuid"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_protoscribe_Note_descriptor = descriptor6;
        internal_static_protoscribe_Note_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor6, new String[]{"Uuid", "Title", "Content"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_protoscribe_GetNoteResponse_descriptor = descriptor7;
        internal_static_protoscribe_GetNoteResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor7, new String[]{"Success", "Error", "Note"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_protoscribe_GetNotesRequest_descriptor = descriptor8;
        internal_static_protoscribe_GetNotesRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor8, new String[]{"Token", "Uuid"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_protoscribe_GetNotesResponse_descriptor = descriptor9;
        internal_static_protoscribe_GetNotesResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor9, new String[]{"Success", "Error", "NotesUuid"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_protoscribe_AddNoteRequest_descriptor = descriptor10;
        internal_static_protoscribe_AddNoteRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor10, new String[]{"Token", "Title", "Content"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_protoscribe_EditNoteRequest_descriptor = descriptor11;
        internal_static_protoscribe_EditNoteRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor11, new String[]{"Token", "Uuid", "Title", "Content"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_protoscribe_RemoveNoteRequest_descriptor = descriptor12;
        internal_static_protoscribe_RemoveNoteRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor12, new String[]{"Token", "Uuid"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_protoscribe_Contact_descriptor = descriptor13;
        internal_static_protoscribe_Contact_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor13, new String[]{"Uuid", "PhoneNumber"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_protoscribe_ShareNoteRequest_descriptor = descriptor14;
        internal_static_protoscribe_ShareNoteRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor14, new String[]{"Token", "Uuid", "PhoneNumbers"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_protoscribe_ShareNoteResponse_descriptor = descriptor15;
        internal_static_protoscribe_ShareNoteResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor15, new String[]{"Success", "Error", "Contacts"});
        descriptor.resolveAllFeaturesImmutable();
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
