package io.grpc.internal;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Context;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ManagedClientTransport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class DelayedClientTransport implements ManagedClientTransport {
    private final Executor defaultAppExecutor;
    private ManagedClientTransport.Listener listener;
    private Runnable reportTransportInUse;
    private Runnable reportTransportNotInUse;
    private Runnable reportTransportTerminated;
    private final SynchronizationContext syncContext;
    private final InternalLogId logId = InternalLogId.allocate((Class<?>) DelayedClientTransport.class, (String) null);
    private final Object lock = new Object();

    @Nonnull
    private Collection<PendingStream> pendingStreams = new LinkedHashSet();
    private volatile PickerState pickerState = new PickerState(null, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    DelayedClientTransport(Executor executor, SynchronizationContext synchronizationContext) {
        this.defaultAppExecutor = executor;
        this.syncContext = synchronizationContext;
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final Runnable start(final ManagedClientTransport.Listener listener) {
        this.listener = listener;
        this.reportTransportInUse = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.1
            @Override // java.lang.Runnable
            public void run() {
                listener.transportInUse(true);
            }
        };
        this.reportTransportNotInUse = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.2
            @Override // java.lang.Runnable
            public void run() {
                listener.transportInUse(false);
            }
        };
        this.reportTransportTerminated = new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.3
            @Override // java.lang.Runnable
            public void run() {
                listener.transportTerminated();
            }
        };
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r3 = r1;
     */
    @Override // io.grpc.internal.ClientTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.internal.ClientStream newStream(io.grpc.MethodDescriptor<?, ?> r3, io.grpc.Metadata r4, io.grpc.CallOptions r5, io.grpc.ClientStreamTracer[] r6) {
        /*
            r2 = this;
            io.grpc.internal.PickSubchannelArgsImpl r0 = new io.grpc.internal.PickSubchannelArgsImpl     // Catch: java.lang.Throwable -> L5a
            io.grpc.internal.PickDetailsConsumerImpl r1 = new io.grpc.internal.PickDetailsConsumerImpl     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L5a
            io.grpc.internal.DelayedClientTransport$PickerState r3 = r2.pickerState     // Catch: java.lang.Throwable -> L5a
        Lc:
            io.grpc.Status r4 = r3.shutdownStatus     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L1d
            io.grpc.internal.FailingClientStream r4 = new io.grpc.internal.FailingClientStream     // Catch: java.lang.Throwable -> L5a
            io.grpc.Status r3 = r3.shutdownStatus     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r3, r6)     // Catch: java.lang.Throwable -> L5a
            io.grpc.SynchronizationContext r3 = r2.syncContext
            r3.drain()
            return r4
        L1d:
            io.grpc.LoadBalancer$SubchannelPicker r4 = r3.lastPicker     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L47
            io.grpc.LoadBalancer$SubchannelPicker r4 = r3.lastPicker     // Catch: java.lang.Throwable -> L5a
            io.grpc.LoadBalancer$PickResult r4 = r4.pickSubchannel(r0)     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r5.isWaitForReady()     // Catch: java.lang.Throwable -> L5a
            io.grpc.internal.ClientTransport r4 = io.grpc.internal.GrpcUtil.getTransportFromPickResult(r4, r1)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L47
            io.grpc.MethodDescriptor r3 = r0.getMethodDescriptor()     // Catch: java.lang.Throwable -> L5a
            io.grpc.Metadata r5 = r0.getHeaders()     // Catch: java.lang.Throwable -> L5a
            io.grpc.CallOptions r0 = r0.getCallOptions()     // Catch: java.lang.Throwable -> L5a
            io.grpc.internal.ClientStream r3 = r4.newStream(r3, r5, r0, r6)     // Catch: java.lang.Throwable -> L5a
        L41:
            io.grpc.SynchronizationContext r4 = r2.syncContext
            r4.drain()
            return r3
        L47:
            java.lang.Object r4 = r2.lock     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L5a
            io.grpc.internal.DelayedClientTransport$PickerState r1 = r2.pickerState     // Catch: java.lang.Throwable -> L57
            if (r3 != r1) goto L54
            io.grpc.internal.DelayedClientTransport$PendingStream r3 = r2.createPendingStream(r0, r6)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            goto L41
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            r3 = r1
            goto Lc
        L57:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            io.grpc.SynchronizationContext r4 = r2.syncContext
            r4.drain()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.DelayedClientTransport.newStream(io.grpc.MethodDescriptor, io.grpc.Metadata, io.grpc.CallOptions, io.grpc.ClientStreamTracer[]):io.grpc.internal.ClientStream");
    }

    private PendingStream createPendingStream(LoadBalancer.PickSubchannelArgs pickSubchannelArgs, ClientStreamTracer[] clientStreamTracerArr) {
        PendingStream pendingStream = new PendingStream(pickSubchannelArgs, clientStreamTracerArr);
        this.pendingStreams.add(pendingStream);
        if (getPendingStreamsCount() == 1) {
            this.syncContext.executeLater(this.reportTransportInUse);
        }
        for (ClientStreamTracer clientStreamTracer : clientStreamTracerArr) {
            clientStreamTracer.createPendingStream();
        }
        return pendingStream;
    }

    @Override // io.grpc.internal.ClientTransport
    public final void ping(ClientTransport.PingCallback pingCallback, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // io.grpc.InternalInstrumented
    public ListenableFuture<InternalChannelz.SocketStats> getStats() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        settableFutureCreate.set(null);
        return settableFutureCreate;
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void shutdown(final Status status) {
        Runnable runnable;
        synchronized (this.lock) {
            if (this.pickerState.shutdownStatus != null) {
                return;
            }
            this.pickerState = this.pickerState.withShutdownStatus(status);
            this.syncContext.executeLater(new Runnable() { // from class: io.grpc.internal.DelayedClientTransport.4
                @Override // java.lang.Runnable
                public void run() {
                    DelayedClientTransport.this.listener.transportShutdown(status);
                }
            });
            if (!hasPendingStreams() && (runnable = this.reportTransportTerminated) != null) {
                this.syncContext.executeLater(runnable);
                this.reportTransportTerminated = null;
            }
            this.syncContext.drain();
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final void shutdownNow(Status status) {
        Collection<PendingStream> collection;
        Runnable runnable;
        shutdown(status);
        synchronized (this.lock) {
            collection = this.pendingStreams;
            runnable = this.reportTransportTerminated;
            this.reportTransportTerminated = null;
            if (!collection.isEmpty()) {
                this.pendingStreams = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (PendingStream pendingStream : collection) {
                Runnable stream = pendingStream.setStream(new FailingClientStream(status, ClientStreamListener.RpcProgress.REFUSED, pendingStream.tracers));
                if (stream != null) {
                    stream.run();
                }
            }
            this.syncContext.execute(runnable);
        }
    }

    public final boolean hasPendingStreams() {
        boolean z;
        synchronized (this.lock) {
            z = !this.pendingStreams.isEmpty();
        }
        return z;
    }

    final int getPendingStreamsCount() {
        int size;
        synchronized (this.lock) {
            size = this.pendingStreams.size();
        }
        return size;
    }

    final void reprocess(@Nullable LoadBalancer.SubchannelPicker subchannelPicker) {
        Runnable runnable;
        synchronized (this.lock) {
            this.pickerState = this.pickerState.withPicker(subchannelPicker);
            if (subchannelPicker != null && hasPendingStreams()) {
                ArrayList<PendingStream> arrayList = new ArrayList(this.pendingStreams);
                ArrayList arrayList2 = new ArrayList();
                for (PendingStream pendingStream : arrayList) {
                    LoadBalancer.PickResult pickResultPickSubchannel = subchannelPicker.pickSubchannel(pendingStream.args);
                    CallOptions callOptions = pendingStream.args.getCallOptions();
                    ClientTransport transportFromPickResult = GrpcUtil.getTransportFromPickResult(pickResultPickSubchannel, callOptions.isWaitForReady());
                    if (transportFromPickResult != null) {
                        Executor executor = this.defaultAppExecutor;
                        if (callOptions.getExecutor() != null) {
                            executor = callOptions.getExecutor();
                        }
                        Runnable runnableCreateRealStream = pendingStream.createRealStream(transportFromPickResult);
                        if (runnableCreateRealStream != null) {
                            executor.execute(runnableCreateRealStream);
                        }
                        arrayList2.add(pendingStream);
                    }
                }
                synchronized (this.lock) {
                    if (hasPendingStreams()) {
                        this.pendingStreams.removeAll(arrayList2);
                        if (this.pendingStreams.isEmpty()) {
                            this.pendingStreams = new LinkedHashSet();
                        }
                        if (!hasPendingStreams()) {
                            this.syncContext.executeLater(this.reportTransportNotInUse);
                            if (this.pickerState.shutdownStatus != null && (runnable = this.reportTransportTerminated) != null) {
                                this.syncContext.executeLater(runnable);
                                this.reportTransportTerminated = null;
                            }
                        }
                        this.syncContext.drain();
                    }
                }
            }
        }
    }

    @Override // io.grpc.InternalWithLogId
    public InternalLogId getLogId() {
        return this.logId;
    }

    private class PendingStream extends DelayedStream {
        private final LoadBalancer.PickSubchannelArgs args;
        private final Context context;
        private final ClientStreamTracer[] tracers;

        private PendingStream(LoadBalancer.PickSubchannelArgs pickSubchannelArgs, ClientStreamTracer[] clientStreamTracerArr) {
            this.context = Context.current();
            this.args = pickSubchannelArgs;
            this.tracers = clientStreamTracerArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable createRealStream(ClientTransport clientTransport) {
            Context contextAttach = this.context.attach();
            try {
                ClientStream clientStreamNewStream = clientTransport.newStream(this.args.getMethodDescriptor(), this.args.getHeaders(), this.args.getCallOptions(), this.tracers);
                this.context.detach(contextAttach);
                return setStream(clientStreamNewStream);
            } catch (Throwable th) {
                this.context.detach(contextAttach);
                throw th;
            }
        }

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        public void cancel(Status status) {
            super.cancel(status);
            synchronized (DelayedClientTransport.this.lock) {
                if (DelayedClientTransport.this.reportTransportTerminated != null) {
                    boolean zRemove = DelayedClientTransport.this.pendingStreams.remove(this);
                    if (!DelayedClientTransport.this.hasPendingStreams() && zRemove) {
                        DelayedClientTransport.this.syncContext.executeLater(DelayedClientTransport.this.reportTransportNotInUse);
                        if (DelayedClientTransport.this.pickerState.shutdownStatus != null) {
                            DelayedClientTransport.this.syncContext.executeLater(DelayedClientTransport.this.reportTransportTerminated);
                            DelayedClientTransport.this.reportTransportTerminated = null;
                        }
                    }
                }
            }
            DelayedClientTransport.this.syncContext.drain();
        }

        @Override // io.grpc.internal.DelayedStream
        protected void onEarlyCancellation(Status status) {
            for (ClientStreamTracer clientStreamTracer : this.tracers) {
                clientStreamTracer.streamClosed(status);
            }
        }

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        public void appendTimeoutInsight(InsightBuilder insightBuilder) {
            if (this.args.getCallOptions().isWaitForReady()) {
                insightBuilder.append("wait_for_ready");
            }
            super.appendTimeoutInsight(insightBuilder);
        }
    }

    static final class PickerState {

        @Nullable
        final LoadBalancer.SubchannelPicker lastPicker;

        @Nullable
        final Status shutdownStatus;

        private PickerState(LoadBalancer.SubchannelPicker subchannelPicker, Status status) {
            this.lastPicker = subchannelPicker;
            this.shutdownStatus = status;
        }

        public PickerState withPicker(LoadBalancer.SubchannelPicker subchannelPicker) {
            return new PickerState(subchannelPicker, this.shutdownStatus);
        }

        public PickerState withShutdownStatus(Status status) {
            return new PickerState(this.lastPicker, status);
        }
    }
}
