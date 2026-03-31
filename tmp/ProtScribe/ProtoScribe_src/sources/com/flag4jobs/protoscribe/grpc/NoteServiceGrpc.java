package com.flag4jobs.protoscribe.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.Descriptors;
import io.grpc.BindableService;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import io.grpc.protobuf.ProtoFileDescriptorSupplier;
import io.grpc.protobuf.ProtoMethodDescriptorSupplier;
import io.grpc.protobuf.ProtoServiceDescriptorSupplier;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.AbstractAsyncStub;
import io.grpc.stub.AbstractBlockingStub;
import io.grpc.stub.AbstractFutureStub;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;

/* JADX INFO: loaded from: classes.dex */
public final class NoteServiceGrpc {
    private static final int METHODID_ADD_NOTE = 4;
    private static final int METHODID_EDIT_NOTE = 5;
    private static final int METHODID_GET_NOTE = 2;
    private static final int METHODID_GET_NOTES = 3;
    private static final int METHODID_LOGIN = 0;
    private static final int METHODID_REGISTER = 1;
    private static final int METHODID_REMOVE_NOTE = 6;
    private static final int METHODID_SHARE_NOTE = 7;
    public static final String SERVICE_NAME = "protoscribe.NoteService";
    private static volatile MethodDescriptor<AddNoteRequest, GenericResponse> getAddNoteMethod;
    private static volatile MethodDescriptor<EditNoteRequest, GenericResponse> getEditNoteMethod;
    private static volatile MethodDescriptor<GetNoteRequest, GetNoteResponse> getGetNoteMethod;
    private static volatile MethodDescriptor<GetNotesRequest, GetNotesResponse> getGetNotesMethod;
    private static volatile MethodDescriptor<AuthRequest, AuthResponse> getLoginMethod;
    private static volatile MethodDescriptor<AuthRequest, AuthResponse> getRegisterMethod;
    private static volatile MethodDescriptor<RemoveNoteRequest, GenericResponse> getRemoveNoteMethod;
    private static volatile MethodDescriptor<ShareNoteRequest, ShareNoteResponse> getShareNoteMethod;
    private static volatile ServiceDescriptor serviceDescriptor;

    private NoteServiceGrpc() {
    }

    public static MethodDescriptor<AuthRequest, AuthResponse> getLoginMethod() {
        MethodDescriptor<AuthRequest, AuthResponse> methodDescriptorBuild = getLoginMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getLoginMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Login")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(AuthRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(AuthResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("Login")).build();
                    getLoginMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<AuthRequest, AuthResponse> getRegisterMethod() {
        MethodDescriptor<AuthRequest, AuthResponse> methodDescriptorBuild = getRegisterMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getRegisterMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Register")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(AuthRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(AuthResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("Register")).build();
                    getRegisterMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<GetNoteRequest, GetNoteResponse> getGetNoteMethod() {
        MethodDescriptor<GetNoteRequest, GetNoteResponse> methodDescriptorBuild = getGetNoteMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getGetNoteMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetNote")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(GetNoteRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(GetNoteResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("GetNote")).build();
                    getGetNoteMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<GetNotesRequest, GetNotesResponse> getGetNotesMethod() {
        MethodDescriptor<GetNotesRequest, GetNotesResponse> methodDescriptorBuild = getGetNotesMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getGetNotesMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetNotes")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(GetNotesRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(GetNotesResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("GetNotes")).build();
                    getGetNotesMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<AddNoteRequest, GenericResponse> getAddNoteMethod() {
        MethodDescriptor<AddNoteRequest, GenericResponse> methodDescriptorBuild = getAddNoteMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getAddNoteMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "AddNote")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(AddNoteRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(GenericResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("AddNote")).build();
                    getAddNoteMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<EditNoteRequest, GenericResponse> getEditNoteMethod() {
        MethodDescriptor<EditNoteRequest, GenericResponse> methodDescriptorBuild = getEditNoteMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getEditNoteMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "EditNote")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(EditNoteRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(GenericResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("EditNote")).build();
                    getEditNoteMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<RemoveNoteRequest, GenericResponse> getRemoveNoteMethod() {
        MethodDescriptor<RemoveNoteRequest, GenericResponse> methodDescriptorBuild = getRemoveNoteMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getRemoveNoteMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "RemoveNote")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(RemoveNoteRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(GenericResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("RemoveNote")).build();
                    getRemoveNoteMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static MethodDescriptor<ShareNoteRequest, ShareNoteResponse> getShareNoteMethod() {
        MethodDescriptor<ShareNoteRequest, ShareNoteResponse> methodDescriptorBuild = getShareNoteMethod;
        if (methodDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                methodDescriptorBuild = getShareNoteMethod;
                if (methodDescriptorBuild == null) {
                    methodDescriptorBuild = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "ShareNote")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoUtils.marshaller(ShareNoteRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(ShareNoteResponse.getDefaultInstance())).setSchemaDescriptor(new NoteServiceMethodDescriptorSupplier("ShareNote")).build();
                    getShareNoteMethod = methodDescriptorBuild;
                }
            }
        }
        return methodDescriptorBuild;
    }

    public static NoteServiceStub newStub(Channel channel) {
        return (NoteServiceStub) NoteServiceStub.newStub(new AbstractStub.StubFactory<NoteServiceStub>() { // from class: com.flag4jobs.protoscribe.grpc.NoteServiceGrpc.1
            @Override // io.grpc.stub.AbstractStub.StubFactory
            public NoteServiceStub newStub(Channel channel2, CallOptions callOptions) {
                return new NoteServiceStub(channel2, callOptions);
            }
        }, channel);
    }

    public static NoteServiceBlockingStub newBlockingStub(Channel channel) {
        return (NoteServiceBlockingStub) NoteServiceBlockingStub.newStub(new AbstractStub.StubFactory<NoteServiceBlockingStub>() { // from class: com.flag4jobs.protoscribe.grpc.NoteServiceGrpc.2
            @Override // io.grpc.stub.AbstractStub.StubFactory
            public NoteServiceBlockingStub newStub(Channel channel2, CallOptions callOptions) {
                return new NoteServiceBlockingStub(channel2, callOptions);
            }
        }, channel);
    }

    public static NoteServiceFutureStub newFutureStub(Channel channel) {
        return (NoteServiceFutureStub) NoteServiceFutureStub.newStub(new AbstractStub.StubFactory<NoteServiceFutureStub>() { // from class: com.flag4jobs.protoscribe.grpc.NoteServiceGrpc.3
            @Override // io.grpc.stub.AbstractStub.StubFactory
            public NoteServiceFutureStub newStub(Channel channel2, CallOptions callOptions) {
                return new NoteServiceFutureStub(channel2, callOptions);
            }
        }, channel);
    }

    public interface AsyncService {
        default void login(AuthRequest authRequest, StreamObserver<AuthResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getLoginMethod(), streamObserver);
        }

        default void register(AuthRequest authRequest, StreamObserver<AuthResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getRegisterMethod(), streamObserver);
        }

        default void getNote(GetNoteRequest getNoteRequest, StreamObserver<GetNoteResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getGetNoteMethod(), streamObserver);
        }

        default void getNotes(GetNotesRequest getNotesRequest, StreamObserver<GetNotesResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getGetNotesMethod(), streamObserver);
        }

        default void addNote(AddNoteRequest addNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getAddNoteMethod(), streamObserver);
        }

        default void editNote(EditNoteRequest editNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getEditNoteMethod(), streamObserver);
        }

        default void removeNote(RemoveNoteRequest removeNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getRemoveNoteMethod(), streamObserver);
        }

        default void shareNote(ShareNoteRequest shareNoteRequest, StreamObserver<ShareNoteResponse> streamObserver) {
            ServerCalls.asyncUnimplementedUnaryCall(NoteServiceGrpc.getShareNoteMethod(), streamObserver);
        }
    }

    public static abstract class NoteServiceImplBase implements BindableService, AsyncService {
        @Override // io.grpc.BindableService
        public final ServerServiceDefinition bindService() {
            return NoteServiceGrpc.bindService(this);
        }
    }

    public static final class NoteServiceStub extends AbstractAsyncStub<NoteServiceStub> {
        private NoteServiceStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.AbstractStub
        public NoteServiceStub build(Channel channel, CallOptions callOptions) {
            return new NoteServiceStub(channel, callOptions);
        }

        public void login(AuthRequest authRequest, StreamObserver<AuthResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getLoginMethod(), getCallOptions()), authRequest, streamObserver);
        }

        public void register(AuthRequest authRequest, StreamObserver<AuthResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getRegisterMethod(), getCallOptions()), authRequest, streamObserver);
        }

        public void getNote(GetNoteRequest getNoteRequest, StreamObserver<GetNoteResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getGetNoteMethod(), getCallOptions()), getNoteRequest, streamObserver);
        }

        public void getNotes(GetNotesRequest getNotesRequest, StreamObserver<GetNotesResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getGetNotesMethod(), getCallOptions()), getNotesRequest, streamObserver);
        }

        public void addNote(AddNoteRequest addNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getAddNoteMethod(), getCallOptions()), addNoteRequest, streamObserver);
        }

        public void editNote(EditNoteRequest editNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getEditNoteMethod(), getCallOptions()), editNoteRequest, streamObserver);
        }

        public void removeNote(RemoveNoteRequest removeNoteRequest, StreamObserver<GenericResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getRemoveNoteMethod(), getCallOptions()), removeNoteRequest, streamObserver);
        }

        public void shareNote(ShareNoteRequest shareNoteRequest, StreamObserver<ShareNoteResponse> streamObserver) {
            ClientCalls.asyncUnaryCall(getChannel().newCall(NoteServiceGrpc.getShareNoteMethod(), getCallOptions()), shareNoteRequest, streamObserver);
        }
    }

    public static final class NoteServiceBlockingStub extends AbstractBlockingStub<NoteServiceBlockingStub> {
        private NoteServiceBlockingStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.AbstractStub
        public NoteServiceBlockingStub build(Channel channel, CallOptions callOptions) {
            return new NoteServiceBlockingStub(channel, callOptions);
        }

        public AuthResponse login(AuthRequest authRequest) {
            return (AuthResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getLoginMethod(), getCallOptions(), authRequest);
        }

        public AuthResponse register(AuthRequest authRequest) {
            return (AuthResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getRegisterMethod(), getCallOptions(), authRequest);
        }

        public GetNoteResponse getNote(GetNoteRequest getNoteRequest) {
            return (GetNoteResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getGetNoteMethod(), getCallOptions(), getNoteRequest);
        }

        public GetNotesResponse getNotes(GetNotesRequest getNotesRequest) {
            return (GetNotesResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getGetNotesMethod(), getCallOptions(), getNotesRequest);
        }

        public GenericResponse addNote(AddNoteRequest addNoteRequest) {
            return (GenericResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getAddNoteMethod(), getCallOptions(), addNoteRequest);
        }

        public GenericResponse editNote(EditNoteRequest editNoteRequest) {
            return (GenericResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getEditNoteMethod(), getCallOptions(), editNoteRequest);
        }

        public GenericResponse removeNote(RemoveNoteRequest removeNoteRequest) {
            return (GenericResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getRemoveNoteMethod(), getCallOptions(), removeNoteRequest);
        }

        public ShareNoteResponse shareNote(ShareNoteRequest shareNoteRequest) {
            return (ShareNoteResponse) ClientCalls.blockingUnaryCall(getChannel(), NoteServiceGrpc.getShareNoteMethod(), getCallOptions(), shareNoteRequest);
        }
    }

    public static final class NoteServiceFutureStub extends AbstractFutureStub<NoteServiceFutureStub> {
        private NoteServiceFutureStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.AbstractStub
        public NoteServiceFutureStub build(Channel channel, CallOptions callOptions) {
            return new NoteServiceFutureStub(channel, callOptions);
        }

        public ListenableFuture<AuthResponse> login(AuthRequest authRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getLoginMethod(), getCallOptions()), authRequest);
        }

        public ListenableFuture<AuthResponse> register(AuthRequest authRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getRegisterMethod(), getCallOptions()), authRequest);
        }

        public ListenableFuture<GetNoteResponse> getNote(GetNoteRequest getNoteRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getGetNoteMethod(), getCallOptions()), getNoteRequest);
        }

        public ListenableFuture<GetNotesResponse> getNotes(GetNotesRequest getNotesRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getGetNotesMethod(), getCallOptions()), getNotesRequest);
        }

        public ListenableFuture<GenericResponse> addNote(AddNoteRequest addNoteRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getAddNoteMethod(), getCallOptions()), addNoteRequest);
        }

        public ListenableFuture<GenericResponse> editNote(EditNoteRequest editNoteRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getEditNoteMethod(), getCallOptions()), editNoteRequest);
        }

        public ListenableFuture<GenericResponse> removeNote(RemoveNoteRequest removeNoteRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getRemoveNoteMethod(), getCallOptions()), removeNoteRequest);
        }

        public ListenableFuture<ShareNoteResponse> shareNote(ShareNoteRequest shareNoteRequest) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(NoteServiceGrpc.getShareNoteMethod(), getCallOptions()), shareNoteRequest);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements ServerCalls.UnaryMethod<Req, Resp>, ServerCalls.ServerStreamingMethod<Req, Resp>, ServerCalls.ClientStreamingMethod<Req, Resp>, ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final int methodId;
        private final AsyncService serviceImpl;

        MethodHandlers(AsyncService asyncService, int i) {
            this.serviceImpl = asyncService;
            this.methodId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.stub.ServerCalls.UnaryMethod, io.grpc.stub.ServerCalls.UnaryRequestMethod, io.grpc.stub.ServerCalls.ServerStreamingMethod
        public void invoke(Req req, StreamObserver<Resp> streamObserver) {
            switch (this.methodId) {
                case 0:
                    this.serviceImpl.login((AuthRequest) req, streamObserver);
                    return;
                case 1:
                    this.serviceImpl.register((AuthRequest) req, streamObserver);
                    return;
                case 2:
                    this.serviceImpl.getNote((GetNoteRequest) req, streamObserver);
                    return;
                case 3:
                    this.serviceImpl.getNotes((GetNotesRequest) req, streamObserver);
                    return;
                case 4:
                    this.serviceImpl.addNote((AddNoteRequest) req, streamObserver);
                    return;
                case 5:
                    this.serviceImpl.editNote((EditNoteRequest) req, streamObserver);
                    return;
                case 6:
                    this.serviceImpl.removeNote((RemoveNoteRequest) req, streamObserver);
                    return;
                case 7:
                    this.serviceImpl.shareNote((ShareNoteRequest) req, streamObserver);
                    return;
                default:
                    throw new AssertionError();
            }
        }

        @Override // io.grpc.stub.ServerCalls.ClientStreamingMethod, io.grpc.stub.ServerCalls.StreamingRequestMethod, io.grpc.stub.ServerCalls.BidiStreamingMethod
        public StreamObserver<Req> invoke(StreamObserver<Resp> streamObserver) {
            throw new AssertionError();
        }
    }

    public static final ServerServiceDefinition bindService(AsyncService asyncService) {
        return ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getLoginMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 0))).addMethod(getRegisterMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 1))).addMethod(getGetNoteMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 2))).addMethod(getGetNotesMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 3))).addMethod(getAddNoteMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 4))).addMethod(getEditNoteMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 5))).addMethod(getRemoveNoteMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 6))).addMethod(getShareNoteMethod(), ServerCalls.asyncUnaryCall(new MethodHandlers(asyncService, 7))).build();
    }

    private static abstract class NoteServiceBaseDescriptorSupplier implements ProtoFileDescriptorSupplier, ProtoServiceDescriptorSupplier {
        NoteServiceBaseDescriptorSupplier() {
        }

        @Override // io.grpc.protobuf.ProtoFileDescriptorSupplier
        public Descriptors.FileDescriptor getFileDescriptor() {
            return ScribeProto.getDescriptor();
        }

        @Override // io.grpc.protobuf.ProtoServiceDescriptorSupplier
        public Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("NoteService");
        }
    }

    private static final class NoteServiceFileDescriptorSupplier extends NoteServiceBaseDescriptorSupplier {
        NoteServiceFileDescriptorSupplier() {
        }
    }

    private static final class NoteServiceMethodDescriptorSupplier extends NoteServiceBaseDescriptorSupplier implements ProtoMethodDescriptorSupplier {
        private final String methodName;

        NoteServiceMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        @Override // io.grpc.protobuf.ProtoMethodDescriptorSupplier
        public Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    public static ServiceDescriptor getServiceDescriptor() {
        ServiceDescriptor serviceDescriptorBuild = serviceDescriptor;
        if (serviceDescriptorBuild == null) {
            synchronized (NoteServiceGrpc.class) {
                serviceDescriptorBuild = serviceDescriptor;
                if (serviceDescriptorBuild == null) {
                    serviceDescriptorBuild = ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new NoteServiceFileDescriptorSupplier()).addMethod(getLoginMethod()).addMethod(getRegisterMethod()).addMethod(getGetNoteMethod()).addMethod(getGetNotesMethod()).addMethod(getAddNoteMethod()).addMethod(getEditNoteMethod()).addMethod(getRemoveNoteMethod()).addMethod(getShareNoteMethod()).build();
                    serviceDescriptor = serviceDescriptorBuild;
                }
            }
        }
        return serviceDescriptorBuild;
    }
}
