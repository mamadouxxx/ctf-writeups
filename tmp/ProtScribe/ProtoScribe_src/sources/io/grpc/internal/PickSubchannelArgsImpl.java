package io.grpc.internal;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class PickSubchannelArgsImpl extends LoadBalancer.PickSubchannelArgs {
    private final CallOptions callOptions;
    private final Metadata headers;
    private final MethodDescriptor<?, ?> method;
    private final LoadBalancer.PickDetailsConsumer pickDetailsConsumer;

    public PickSubchannelArgsImpl(MethodDescriptor<?, ?> methodDescriptor, Metadata metadata, CallOptions callOptions, LoadBalancer.PickDetailsConsumer pickDetailsConsumer) {
        this.method = (MethodDescriptor) Preconditions.checkNotNull(methodDescriptor, "method");
        this.headers = (Metadata) Preconditions.checkNotNull(metadata, "headers");
        this.callOptions = (CallOptions) Preconditions.checkNotNull(callOptions, "callOptions");
        this.pickDetailsConsumer = (LoadBalancer.PickDetailsConsumer) Preconditions.checkNotNull(pickDetailsConsumer, "pickDetailsConsumer");
    }

    @Override // io.grpc.LoadBalancer.PickSubchannelArgs
    public Metadata getHeaders() {
        return this.headers;
    }

    @Override // io.grpc.LoadBalancer.PickSubchannelArgs
    public CallOptions getCallOptions() {
        return this.callOptions;
    }

    @Override // io.grpc.LoadBalancer.PickSubchannelArgs
    public MethodDescriptor<?, ?> getMethodDescriptor() {
        return this.method;
    }

    @Override // io.grpc.LoadBalancer.PickSubchannelArgs
    public LoadBalancer.PickDetailsConsumer getPickDetailsConsumer() {
        return this.pickDetailsConsumer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PickSubchannelArgsImpl pickSubchannelArgsImpl = (PickSubchannelArgsImpl) obj;
        return Objects.equal(this.callOptions, pickSubchannelArgsImpl.callOptions) && Objects.equal(this.headers, pickSubchannelArgsImpl.headers) && Objects.equal(this.method, pickSubchannelArgsImpl.method) && Objects.equal(this.pickDetailsConsumer, pickSubchannelArgsImpl.pickDetailsConsumer);
    }

    public int hashCode() {
        return Objects.hashCode(this.callOptions, this.headers, this.method, this.pickDetailsConsumer);
    }

    public final String toString() {
        return "[method=" + this.method + " headers=" + this.headers + " callOptions=" + this.callOptions + "]";
    }
}
