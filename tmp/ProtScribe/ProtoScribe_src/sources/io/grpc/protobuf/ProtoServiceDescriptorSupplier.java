package io.grpc.protobuf;

import com.google.protobuf.Descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface ProtoServiceDescriptorSupplier extends ProtoFileDescriptorSupplier {
    Descriptors.ServiceDescriptor getServiceDescriptor();
}
