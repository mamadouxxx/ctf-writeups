package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import io.grpc.LoadBalancer;

/* JADX INFO: loaded from: classes2.dex */
final class PickDetailsConsumerImpl implements LoadBalancer.PickDetailsConsumer {
    private final ClientStreamTracer[] tracers;

    public PickDetailsConsumerImpl(ClientStreamTracer[] clientStreamTracerArr) {
        this.tracers = (ClientStreamTracer[]) Preconditions.checkNotNull(clientStreamTracerArr, "tracers");
    }

    @Override // io.grpc.LoadBalancer.PickDetailsConsumer
    public void addOptionalLabel(String str, String str2) {
        Preconditions.checkNotNull(str, "key");
        Preconditions.checkNotNull(str2, "value");
        for (ClientStreamTracer clientStreamTracer : this.tracers) {
            clientStreamTracer.addOptionalLabel(str, str2);
        }
    }
}
