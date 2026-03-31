package io.grpc.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import io.grpc.Attributes;
import io.grpc.ChannelLogger;
import io.grpc.ClientStreamTracer;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import io.grpc.internal.TimeProvider;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OutlierDetectionLoadBalancer extends LoadBalancer {
    private static final Attributes.Key<EndpointTracker> ENDPOINT_TRACKER_KEY = Attributes.Key.create("endpointTrackerKey");
    final Map<SocketAddress, EndpointTracker> addressMap = new HashMap();
    private final LoadBalancer.Helper childHelper;
    private SynchronizationContext.ScheduledHandle detectionTimerHandle;
    private Long detectionTimerStartNanos;
    final EndpointTrackerMap endpointTrackerMap;
    private final ChannelLogger logger;
    private final GracefulSwitchLoadBalancer switchLb;
    private final SynchronizationContext syncContext;
    private TimeProvider timeProvider;
    private final ScheduledExecutorService timeService;

    public OutlierDetectionLoadBalancer(LoadBalancer.Helper helper, TimeProvider timeProvider) {
        ChannelLogger channelLogger = helper.getChannelLogger();
        this.logger = channelLogger;
        ChildHelper childHelper = new ChildHelper((LoadBalancer.Helper) Preconditions.checkNotNull(helper, "helper"));
        this.childHelper = childHelper;
        this.switchLb = new GracefulSwitchLoadBalancer(childHelper);
        this.endpointTrackerMap = new EndpointTrackerMap();
        this.syncContext = (SynchronizationContext) Preconditions.checkNotNull(helper.getSynchronizationContext(), "syncContext");
        this.timeService = (ScheduledExecutorService) Preconditions.checkNotNull(helper.getScheduledExecutorService(), "timeService");
        this.timeProvider = timeProvider;
        channelLogger.log(ChannelLogger.ChannelLogLevel.DEBUG, "OutlierDetection lb created.");
    }

    @Override // io.grpc.LoadBalancer
    public Status acceptResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        Long lValueOf;
        this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "Received resolution result: {0}", resolvedAddresses);
        OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig = (OutlierDetectionLoadBalancerConfig) resolvedAddresses.getLoadBalancingPolicyConfig();
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        for (EquivalentAddressGroup equivalentAddressGroup : resolvedAddresses.getAddresses()) {
            ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) equivalentAddressGroup.getAddresses());
            hashSet.add(immutableSetCopyOf);
            for (SocketAddress socketAddress : equivalentAddressGroup.getAddresses()) {
                if (map.containsKey(socketAddress)) {
                    this.logger.log(ChannelLogger.ChannelLogLevel.WARNING, "Unexpected duplicated address {0} belongs to multiple endpoints", socketAddress);
                }
                map.put(socketAddress, immutableSetCopyOf);
            }
        }
        this.endpointTrackerMap.keySet().retainAll(hashSet);
        this.endpointTrackerMap.updateTrackerConfigs(outlierDetectionLoadBalancerConfig);
        this.endpointTrackerMap.putNewTrackers(outlierDetectionLoadBalancerConfig, hashSet);
        this.addressMap.clear();
        for (Map.Entry entry : map.entrySet()) {
            this.addressMap.put((SocketAddress) entry.getKey(), this.endpointTrackerMap.get(entry.getValue()));
        }
        if (outlierDetectionLoadBalancerConfig.outlierDetectionEnabled()) {
            if (this.detectionTimerStartNanos == null) {
                lValueOf = outlierDetectionLoadBalancerConfig.intervalNanos;
            } else {
                lValueOf = Long.valueOf(Math.max(0L, outlierDetectionLoadBalancerConfig.intervalNanos.longValue() - (this.timeProvider.currentTimeNanos() - this.detectionTimerStartNanos.longValue())));
            }
            SynchronizationContext.ScheduledHandle scheduledHandle = this.detectionTimerHandle;
            if (scheduledHandle != null) {
                scheduledHandle.cancel();
                this.endpointTrackerMap.resetCallCounters();
            }
            this.detectionTimerHandle = this.syncContext.scheduleWithFixedDelay(new DetectionTimer(outlierDetectionLoadBalancerConfig, this.logger), lValueOf.longValue(), outlierDetectionLoadBalancerConfig.intervalNanos.longValue(), TimeUnit.NANOSECONDS, this.timeService);
        } else {
            SynchronizationContext.ScheduledHandle scheduledHandle2 = this.detectionTimerHandle;
            if (scheduledHandle2 != null) {
                scheduledHandle2.cancel();
                this.detectionTimerStartNanos = null;
                this.endpointTrackerMap.cancelTracking();
            }
        }
        this.switchLb.handleResolvedAddresses(resolvedAddresses.toBuilder().setLoadBalancingPolicyConfig(outlierDetectionLoadBalancerConfig.childConfig).build());
        return Status.OK;
    }

    @Override // io.grpc.LoadBalancer
    public void handleNameResolutionError(Status status) {
        this.switchLb.handleNameResolutionError(status);
    }

    @Override // io.grpc.LoadBalancer
    public void shutdown() {
        this.switchLb.shutdown();
    }

    class DetectionTimer implements Runnable {
        OutlierDetectionLoadBalancerConfig config;
        ChannelLogger logger;

        DetectionTimer(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            this.config = outlierDetectionLoadBalancerConfig;
            this.logger = channelLogger;
        }

        @Override // java.lang.Runnable
        public void run() {
            OutlierDetectionLoadBalancer outlierDetectionLoadBalancer = OutlierDetectionLoadBalancer.this;
            outlierDetectionLoadBalancer.detectionTimerStartNanos = Long.valueOf(outlierDetectionLoadBalancer.timeProvider.currentTimeNanos());
            OutlierDetectionLoadBalancer.this.endpointTrackerMap.swapCounters();
            Iterator<OutlierEjectionAlgorithm> it = OutlierEjectionAlgorithm.forConfig(this.config, this.logger).iterator();
            while (it.hasNext()) {
                it.next().ejectOutliers(OutlierDetectionLoadBalancer.this.endpointTrackerMap, OutlierDetectionLoadBalancer.this.detectionTimerStartNanos.longValue());
            }
            OutlierDetectionLoadBalancer.this.endpointTrackerMap.maybeUnejectOutliers(OutlierDetectionLoadBalancer.this.detectionTimerStartNanos);
        }
    }

    class ChildHelper extends ForwardingLoadBalancerHelper {
        private LoadBalancer.Helper delegate;

        ChildHelper(LoadBalancer.Helper helper) {
            this.delegate = new HealthProducerHelper(helper);
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper
        protected LoadBalancer.Helper delegate() {
            return this.delegate;
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public LoadBalancer.Subchannel createSubchannel(LoadBalancer.CreateSubchannelArgs createSubchannelArgs) {
            OutlierDetectionSubchannel outlierDetectionSubchannel = OutlierDetectionLoadBalancer.this.new OutlierDetectionSubchannel(createSubchannelArgs, this.delegate);
            List<EquivalentAddressGroup> addresses = createSubchannelArgs.getAddresses();
            if (OutlierDetectionLoadBalancer.hasSingleAddress(addresses) && OutlierDetectionLoadBalancer.this.addressMap.containsKey(addresses.get(0).getAddresses().get(0))) {
                EndpointTracker endpointTracker = OutlierDetectionLoadBalancer.this.addressMap.get(addresses.get(0).getAddresses().get(0));
                endpointTracker.addSubchannel(outlierDetectionSubchannel);
                if (endpointTracker.ejectionTimeNanos != null) {
                    outlierDetectionSubchannel.eject();
                }
            }
            return outlierDetectionSubchannel;
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public void updateBalancingState(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            this.delegate.updateBalancingState(connectivityState, OutlierDetectionLoadBalancer.this.new OutlierDetectionPicker(subchannelPicker));
        }
    }

    class OutlierDetectionSubchannel extends ForwardingSubchannel {
        private final LoadBalancer.Subchannel delegate;
        private boolean ejected;
        private EndpointTracker endpointTracker;
        private ConnectivityStateInfo lastSubchannelState;
        private final ChannelLogger logger;
        private LoadBalancer.SubchannelStateListener subchannelStateListener;

        OutlierDetectionSubchannel(LoadBalancer.CreateSubchannelArgs createSubchannelArgs, LoadBalancer.Helper helper) {
            LoadBalancer.SubchannelStateListener subchannelStateListener = (LoadBalancer.SubchannelStateListener) createSubchannelArgs.getOption(LoadBalancer.HEALTH_CONSUMER_LISTENER_ARG_KEY);
            if (subchannelStateListener != null) {
                this.subchannelStateListener = subchannelStateListener;
                this.delegate = helper.createSubchannel(createSubchannelArgs.toBuilder().addOption(LoadBalancer.HEALTH_CONSUMER_LISTENER_ARG_KEY, new OutlierDetectionSubchannelStateListener(subchannelStateListener)).build());
            } else {
                this.delegate = helper.createSubchannel(createSubchannelArgs);
            }
            this.logger = this.delegate.getChannelLogger();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public void start(LoadBalancer.SubchannelStateListener subchannelStateListener) {
            if (this.subchannelStateListener != null) {
                super.start(subchannelStateListener);
            } else {
                this.subchannelStateListener = subchannelStateListener;
                super.start(new OutlierDetectionSubchannelStateListener(subchannelStateListener));
            }
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public void shutdown() {
            EndpointTracker endpointTracker = this.endpointTracker;
            if (endpointTracker != null) {
                endpointTracker.removeSubchannel(this);
            }
            super.shutdown();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public Attributes getAttributes() {
            if (this.endpointTracker != null) {
                return this.delegate.getAttributes().toBuilder().set(OutlierDetectionLoadBalancer.ENDPOINT_TRACKER_KEY, this.endpointTracker).build();
            }
            return this.delegate.getAttributes();
        }

        @Override // io.grpc.util.ForwardingSubchannel, io.grpc.LoadBalancer.Subchannel
        public void updateAddresses(List<EquivalentAddressGroup> list) {
            if (!OutlierDetectionLoadBalancer.hasSingleAddress(getAllAddresses()) || !OutlierDetectionLoadBalancer.hasSingleAddress(list)) {
                if (!OutlierDetectionLoadBalancer.hasSingleAddress(getAllAddresses()) || OutlierDetectionLoadBalancer.hasSingleAddress(list)) {
                    if (!OutlierDetectionLoadBalancer.hasSingleAddress(getAllAddresses()) && OutlierDetectionLoadBalancer.hasSingleAddress(list)) {
                        SocketAddress socketAddress = list.get(0).getAddresses().get(0);
                        if (OutlierDetectionLoadBalancer.this.addressMap.containsKey(socketAddress)) {
                            OutlierDetectionLoadBalancer.this.addressMap.get(socketAddress).addSubchannel(this);
                        }
                    }
                } else if (OutlierDetectionLoadBalancer.this.addressMap.containsKey(getAddresses().getAddresses().get(0))) {
                    EndpointTracker endpointTracker = OutlierDetectionLoadBalancer.this.addressMap.get(getAddresses().getAddresses().get(0));
                    endpointTracker.removeSubchannel(this);
                    endpointTracker.resetCallCounters();
                }
            } else {
                if (OutlierDetectionLoadBalancer.this.endpointTrackerMap.containsValue(this.endpointTracker)) {
                    this.endpointTracker.removeSubchannel(this);
                }
                SocketAddress socketAddress2 = list.get(0).getAddresses().get(0);
                if (OutlierDetectionLoadBalancer.this.addressMap.containsKey(socketAddress2)) {
                    OutlierDetectionLoadBalancer.this.addressMap.get(socketAddress2).addSubchannel(this);
                }
            }
            this.delegate.updateAddresses(list);
        }

        void setEndpointTracker(EndpointTracker endpointTracker) {
            this.endpointTracker = endpointTracker;
        }

        void clearEndpointTracker() {
            this.endpointTracker = null;
        }

        void eject() {
            this.ejected = true;
            this.subchannelStateListener.onSubchannelState(ConnectivityStateInfo.forTransientFailure(Status.UNAVAILABLE.withDescription("The subchannel has been ejected by outlier detection")));
            this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "Subchannel ejected: {0}", this);
        }

        void uneject() {
            this.ejected = false;
            ConnectivityStateInfo connectivityStateInfo = this.lastSubchannelState;
            if (connectivityStateInfo != null) {
                this.subchannelStateListener.onSubchannelState(connectivityStateInfo);
                this.logger.log(ChannelLogger.ChannelLogLevel.INFO, "Subchannel unejected: {0}", this);
            }
        }

        boolean isEjected() {
            return this.ejected;
        }

        @Override // io.grpc.util.ForwardingSubchannel
        protected LoadBalancer.Subchannel delegate() {
            return this.delegate;
        }

        class OutlierDetectionSubchannelStateListener implements LoadBalancer.SubchannelStateListener {
            private final LoadBalancer.SubchannelStateListener delegate;

            OutlierDetectionSubchannelStateListener(LoadBalancer.SubchannelStateListener subchannelStateListener) {
                this.delegate = subchannelStateListener;
            }

            @Override // io.grpc.LoadBalancer.SubchannelStateListener
            public void onSubchannelState(ConnectivityStateInfo connectivityStateInfo) {
                OutlierDetectionSubchannel.this.lastSubchannelState = connectivityStateInfo;
                if (OutlierDetectionSubchannel.this.ejected) {
                    return;
                }
                this.delegate.onSubchannelState(connectivityStateInfo);
            }
        }

        @Override // io.grpc.util.ForwardingSubchannel
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.delegate.getAllAddresses() + '}';
        }
    }

    class OutlierDetectionPicker extends LoadBalancer.SubchannelPicker {
        private final LoadBalancer.SubchannelPicker delegate;

        OutlierDetectionPicker(LoadBalancer.SubchannelPicker subchannelPicker) {
            this.delegate = subchannelPicker;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public LoadBalancer.PickResult pickSubchannel(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            LoadBalancer.PickResult pickResultPickSubchannel = this.delegate.pickSubchannel(pickSubchannelArgs);
            LoadBalancer.Subchannel subchannel = pickResultPickSubchannel.getSubchannel();
            return subchannel != null ? LoadBalancer.PickResult.withSubchannel(subchannel, new ResultCountingClientStreamTracerFactory((EndpointTracker) subchannel.getAttributes().get(OutlierDetectionLoadBalancer.ENDPOINT_TRACKER_KEY), pickResultPickSubchannel.getStreamTracerFactory())) : pickResultPickSubchannel;
        }

        class ResultCountingClientStreamTracerFactory extends ClientStreamTracer.Factory {

            @Nullable
            private final ClientStreamTracer.Factory delegateFactory;
            private final EndpointTracker tracker;

            ResultCountingClientStreamTracerFactory(EndpointTracker endpointTracker, @Nullable ClientStreamTracer.Factory factory) {
                this.tracker = endpointTracker;
                this.delegateFactory = factory;
            }

            @Override // io.grpc.ClientStreamTracer.Factory
            public ClientStreamTracer newClientStreamTracer(ClientStreamTracer.StreamInfo streamInfo, Metadata metadata) {
                ClientStreamTracer.Factory factory = this.delegateFactory;
                if (factory != null) {
                    final ClientStreamTracer clientStreamTracerNewClientStreamTracer = factory.newClientStreamTracer(streamInfo, metadata);
                    return new ForwardingClientStreamTracer() { // from class: io.grpc.util.OutlierDetectionLoadBalancer.OutlierDetectionPicker.ResultCountingClientStreamTracerFactory.1
                        @Override // io.grpc.util.ForwardingClientStreamTracer
                        protected ClientStreamTracer delegate() {
                            return clientStreamTracerNewClientStreamTracer;
                        }

                        @Override // io.grpc.util.ForwardingClientStreamTracer, io.grpc.StreamTracer
                        public void streamClosed(Status status) {
                            ResultCountingClientStreamTracerFactory.this.tracker.incrementCallCount(status.isOk());
                            delegate().streamClosed(status);
                        }
                    };
                }
                return new ClientStreamTracer() { // from class: io.grpc.util.OutlierDetectionLoadBalancer.OutlierDetectionPicker.ResultCountingClientStreamTracerFactory.2
                    @Override // io.grpc.StreamTracer
                    public void streamClosed(Status status) {
                        ResultCountingClientStreamTracerFactory.this.tracker.incrementCallCount(status.isOk());
                    }
                };
            }
        }
    }

    static class EndpointTracker {
        private volatile CallCounter activeCallCounter;
        private OutlierDetectionLoadBalancerConfig config;
        private int ejectionTimeMultiplier;
        private Long ejectionTimeNanos;
        private CallCounter inactiveCallCounter;
        private final Set<OutlierDetectionSubchannel> subchannels = new HashSet();

        EndpointTracker(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig) {
            this.activeCallCounter = new CallCounter();
            this.inactiveCallCounter = new CallCounter();
            this.config = outlierDetectionLoadBalancerConfig;
        }

        void setConfig(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig) {
            this.config = outlierDetectionLoadBalancerConfig;
        }

        boolean addSubchannel(OutlierDetectionSubchannel outlierDetectionSubchannel) {
            if (subchannelsEjected() && !outlierDetectionSubchannel.isEjected()) {
                outlierDetectionSubchannel.eject();
            } else if (!subchannelsEjected() && outlierDetectionSubchannel.isEjected()) {
                outlierDetectionSubchannel.uneject();
            }
            outlierDetectionSubchannel.setEndpointTracker(this);
            return this.subchannels.add(outlierDetectionSubchannel);
        }

        boolean removeSubchannel(OutlierDetectionSubchannel outlierDetectionSubchannel) {
            outlierDetectionSubchannel.clearEndpointTracker();
            return this.subchannels.remove(outlierDetectionSubchannel);
        }

        boolean containsSubchannel(OutlierDetectionSubchannel outlierDetectionSubchannel) {
            return this.subchannels.contains(outlierDetectionSubchannel);
        }

        Set<OutlierDetectionSubchannel> getSubchannels() {
            return ImmutableSet.copyOf((Collection) this.subchannels);
        }

        void incrementCallCount(boolean z) {
            if (this.config.successRateEjection == null && this.config.failurePercentageEjection == null) {
                return;
            }
            if (z) {
                this.activeCallCounter.successCount.getAndIncrement();
            } else {
                this.activeCallCounter.failureCount.getAndIncrement();
            }
        }

        long activeVolume() {
            return this.activeCallCounter.successCount.get() + this.activeCallCounter.failureCount.get();
        }

        long inactiveVolume() {
            return this.inactiveCallCounter.successCount.get() + this.inactiveCallCounter.failureCount.get();
        }

        double successRate() {
            return this.inactiveCallCounter.successCount.get() / inactiveVolume();
        }

        double failureRate() {
            return this.inactiveCallCounter.failureCount.get() / inactiveVolume();
        }

        void resetCallCounters() {
            this.activeCallCounter.reset();
            this.inactiveCallCounter.reset();
        }

        void decrementEjectionTimeMultiplier() {
            int i = this.ejectionTimeMultiplier;
            this.ejectionTimeMultiplier = i == 0 ? 0 : i - 1;
        }

        void resetEjectionTimeMultiplier() {
            this.ejectionTimeMultiplier = 0;
        }

        void swapCounters() {
            this.inactiveCallCounter.reset();
            CallCounter callCounter = this.activeCallCounter;
            this.activeCallCounter = this.inactiveCallCounter;
            this.inactiveCallCounter = callCounter;
        }

        void ejectSubchannels(long j) {
            this.ejectionTimeNanos = Long.valueOf(j);
            this.ejectionTimeMultiplier++;
            Iterator<OutlierDetectionSubchannel> it = this.subchannels.iterator();
            while (it.hasNext()) {
                it.next().eject();
            }
        }

        void unejectSubchannels() {
            Preconditions.checkState(this.ejectionTimeNanos != null, "not currently ejected");
            this.ejectionTimeNanos = null;
            Iterator<OutlierDetectionSubchannel> it = this.subchannels.iterator();
            while (it.hasNext()) {
                it.next().uneject();
            }
        }

        boolean subchannelsEjected() {
            return this.ejectionTimeNanos != null;
        }

        public boolean maxEjectionTimeElapsed(long j) {
            return j > this.ejectionTimeNanos.longValue() + Math.min(this.config.baseEjectionTimeNanos.longValue() * ((long) this.ejectionTimeMultiplier), Math.max(this.config.baseEjectionTimeNanos.longValue(), this.config.maxEjectionTimeNanos.longValue()));
        }

        private static class CallCounter {
            AtomicLong failureCount;
            AtomicLong successCount;

            private CallCounter() {
                this.successCount = new AtomicLong();
                this.failureCount = new AtomicLong();
            }

            void reset() {
                this.successCount.set(0L);
                this.failureCount.set(0L);
            }
        }

        public String toString() {
            return "EndpointTracker{subchannels=" + this.subchannels + '}';
        }
    }

    static class EndpointTrackerMap extends ForwardingMap<Set<SocketAddress>, EndpointTracker> {
        private final Map<Set<SocketAddress>, EndpointTracker> trackerMap = new HashMap();

        EndpointTrackerMap() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<Set<SocketAddress>, EndpointTracker> delegate() {
            return this.trackerMap;
        }

        void updateTrackerConfigs(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig) {
            Iterator<EndpointTracker> it = this.trackerMap.values().iterator();
            while (it.hasNext()) {
                it.next().setConfig(outlierDetectionLoadBalancerConfig);
            }
        }

        /* JADX INFO: renamed from: lambda$putNewTrackers$0$io-grpc-util-OutlierDetectionLoadBalancer$EndpointTrackerMap, reason: not valid java name */
        /* synthetic */ void m212xd388d2c0(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, Set set) {
            this.trackerMap.putIfAbsent(set, new EndpointTracker(outlierDetectionLoadBalancerConfig));
        }

        void putNewTrackers(final OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, Set<Set<SocketAddress>> set) {
            set.forEach(new Consumer() { // from class: io.grpc.util.OutlierDetectionLoadBalancer$EndpointTrackerMap$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.m212xd388d2c0(outlierDetectionLoadBalancerConfig, (Set) obj);
                }
            });
        }

        void resetCallCounters() {
            Iterator<EndpointTracker> it = this.trackerMap.values().iterator();
            while (it.hasNext()) {
                it.next().resetCallCounters();
            }
        }

        void cancelTracking() {
            for (EndpointTracker endpointTracker : this.trackerMap.values()) {
                if (endpointTracker.subchannelsEjected()) {
                    endpointTracker.unejectSubchannels();
                }
                endpointTracker.resetEjectionTimeMultiplier();
            }
        }

        void swapCounters() {
            Iterator<EndpointTracker> it = this.trackerMap.values().iterator();
            while (it.hasNext()) {
                it.next().swapCounters();
            }
        }

        void maybeUnejectOutliers(Long l) {
            for (EndpointTracker endpointTracker : this.trackerMap.values()) {
                if (!endpointTracker.subchannelsEjected()) {
                    endpointTracker.decrementEjectionTimeMultiplier();
                }
                if (endpointTracker.subchannelsEjected() && endpointTracker.maxEjectionTimeElapsed(l.longValue())) {
                    endpointTracker.unejectSubchannels();
                }
            }
        }

        double ejectionPercentage() {
            if (this.trackerMap.isEmpty()) {
                return 0.0d;
            }
            Iterator<EndpointTracker> it = this.trackerMap.values().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2++;
                if (it.next().subchannelsEjected()) {
                    i++;
                }
            }
            return (((double) i) / ((double) i2)) * 100.0d;
        }
    }

    interface OutlierEjectionAlgorithm {
        void ejectOutliers(EndpointTrackerMap endpointTrackerMap, long j);

        @Nullable
        static List<OutlierEjectionAlgorithm> forConfig(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (outlierDetectionLoadBalancerConfig.successRateEjection != null) {
                builder.add(new SuccessRateOutlierEjectionAlgorithm(outlierDetectionLoadBalancerConfig, channelLogger));
            }
            if (outlierDetectionLoadBalancerConfig.failurePercentageEjection != null) {
                builder.add(new FailurePercentageOutlierEjectionAlgorithm(outlierDetectionLoadBalancerConfig, channelLogger));
            }
            return builder.build();
        }
    }

    static class SuccessRateOutlierEjectionAlgorithm implements OutlierEjectionAlgorithm {
        private final OutlierDetectionLoadBalancerConfig config;
        private final ChannelLogger logger;

        SuccessRateOutlierEjectionAlgorithm(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            Preconditions.checkArgument(outlierDetectionLoadBalancerConfig.successRateEjection != null, "success rate ejection config is null");
            this.config = outlierDetectionLoadBalancerConfig;
            this.logger = channelLogger;
        }

        @Override // io.grpc.util.OutlierDetectionLoadBalancer.OutlierEjectionAlgorithm
        public void ejectOutliers(EndpointTrackerMap endpointTrackerMap, long j) {
            List<EndpointTracker> listTrackersWithVolume = OutlierDetectionLoadBalancer.trackersWithVolume(endpointTrackerMap, this.config.successRateEjection.requestVolume.intValue());
            if (listTrackersWithVolume.size() < this.config.successRateEjection.minimumHosts.intValue() || listTrackersWithVolume.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listTrackersWithVolume.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((EndpointTracker) it.next()).successRate()));
            }
            double dMean = mean(arrayList);
            double dStandardDeviation = standardDeviation(arrayList, dMean);
            double dIntValue = dMean - (((double) (this.config.successRateEjection.stdevFactor.intValue() / 1000.0f)) * dStandardDeviation);
            for (EndpointTracker endpointTracker : listTrackersWithVolume) {
                if (endpointTrackerMap.ejectionPercentage() >= this.config.maxEjectionPercent.intValue()) {
                    return;
                }
                if (endpointTracker.successRate() < dIntValue) {
                    this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", endpointTracker, Double.valueOf(endpointTracker.successRate()), Double.valueOf(dMean), Double.valueOf(dStandardDeviation), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.config.successRateEjection.enforcementPercentage.intValue()) {
                        endpointTracker.ejectSubchannels(j);
                    }
                }
            }
        }

        static double mean(Collection<Double> collection) {
            Iterator<Double> it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += it.next().doubleValue();
            }
            return dDoubleValue / ((double) collection.size());
        }

        static double standardDeviation(Collection<Double> collection, double d) {
            Iterator<Double> it = collection.iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = it.next().doubleValue() - d;
                d2 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d2 / ((double) collection.size()));
        }
    }

    static class FailurePercentageOutlierEjectionAlgorithm implements OutlierEjectionAlgorithm {
        private final OutlierDetectionLoadBalancerConfig config;
        private final ChannelLogger logger;

        FailurePercentageOutlierEjectionAlgorithm(OutlierDetectionLoadBalancerConfig outlierDetectionLoadBalancerConfig, ChannelLogger channelLogger) {
            this.config = outlierDetectionLoadBalancerConfig;
            this.logger = channelLogger;
        }

        @Override // io.grpc.util.OutlierDetectionLoadBalancer.OutlierEjectionAlgorithm
        public void ejectOutliers(EndpointTrackerMap endpointTrackerMap, long j) {
            List<EndpointTracker> listTrackersWithVolume = OutlierDetectionLoadBalancer.trackersWithVolume(endpointTrackerMap, this.config.failurePercentageEjection.requestVolume.intValue());
            if (listTrackersWithVolume.size() < this.config.failurePercentageEjection.minimumHosts.intValue() || listTrackersWithVolume.size() == 0) {
                return;
            }
            for (EndpointTracker endpointTracker : listTrackersWithVolume) {
                if (endpointTrackerMap.ejectionPercentage() >= this.config.maxEjectionPercent.intValue()) {
                    return;
                }
                if (endpointTracker.inactiveVolume() >= this.config.failurePercentageEjection.requestVolume.intValue()) {
                    if (endpointTracker.failureRate() > ((double) this.config.failurePercentageEjection.threshold.intValue()) / 100.0d) {
                        this.logger.log(ChannelLogger.ChannelLogLevel.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", endpointTracker, Double.valueOf(endpointTracker.failureRate()));
                        if (new Random().nextInt(100) < this.config.failurePercentageEjection.enforcementPercentage.intValue()) {
                            endpointTracker.ejectSubchannels(j);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<EndpointTracker> trackersWithVolume(EndpointTrackerMap endpointTrackerMap, int i) {
        ArrayList arrayList = new ArrayList();
        for (EndpointTracker endpointTracker : endpointTrackerMap.values()) {
            if (endpointTracker.inactiveVolume() >= i) {
                arrayList.add(endpointTracker);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasSingleAddress(List<EquivalentAddressGroup> list) {
        Iterator<EquivalentAddressGroup> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getAddresses().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static final class OutlierDetectionLoadBalancerConfig {
        public final Long baseEjectionTimeNanos;
        public final Object childConfig;
        public final FailurePercentageEjection failurePercentageEjection;
        public final Long intervalNanos;
        public final Integer maxEjectionPercent;
        public final Long maxEjectionTimeNanos;
        public final SuccessRateEjection successRateEjection;

        private OutlierDetectionLoadBalancerConfig(Long l, Long l2, Long l3, Integer num, SuccessRateEjection successRateEjection, FailurePercentageEjection failurePercentageEjection, Object obj) {
            this.intervalNanos = l;
            this.baseEjectionTimeNanos = l2;
            this.maxEjectionTimeNanos = l3;
            this.maxEjectionPercent = num;
            this.successRateEjection = successRateEjection;
            this.failurePercentageEjection = failurePercentageEjection;
            this.childConfig = obj;
        }

        public static class Builder {
            Object childConfig;
            FailurePercentageEjection failurePercentageEjection;
            SuccessRateEjection successRateEjection;
            Long intervalNanos = 10000000000L;
            Long baseEjectionTimeNanos = 30000000000L;
            Long maxEjectionTimeNanos = 300000000000L;
            Integer maxEjectionPercent = 10;

            public Builder setIntervalNanos(Long l) {
                Preconditions.checkArgument(l != null);
                this.intervalNanos = l;
                return this;
            }

            public Builder setBaseEjectionTimeNanos(Long l) {
                Preconditions.checkArgument(l != null);
                this.baseEjectionTimeNanos = l;
                return this;
            }

            public Builder setMaxEjectionTimeNanos(Long l) {
                Preconditions.checkArgument(l != null);
                this.maxEjectionTimeNanos = l;
                return this;
            }

            public Builder setMaxEjectionPercent(Integer num) {
                Preconditions.checkArgument(num != null);
                this.maxEjectionPercent = num;
                return this;
            }

            public Builder setSuccessRateEjection(SuccessRateEjection successRateEjection) {
                this.successRateEjection = successRateEjection;
                return this;
            }

            public Builder setFailurePercentageEjection(FailurePercentageEjection failurePercentageEjection) {
                this.failurePercentageEjection = failurePercentageEjection;
                return this;
            }

            public Builder setChildConfig(Object obj) {
                Preconditions.checkState(obj != null);
                this.childConfig = obj;
                return this;
            }

            public OutlierDetectionLoadBalancerConfig build() {
                Preconditions.checkState(this.childConfig != null);
                return new OutlierDetectionLoadBalancerConfig(this.intervalNanos, this.baseEjectionTimeNanos, this.maxEjectionTimeNanos, this.maxEjectionPercent, this.successRateEjection, this.failurePercentageEjection, this.childConfig);
            }
        }

        public static class SuccessRateEjection {
            public final Integer enforcementPercentage;
            public final Integer minimumHosts;
            public final Integer requestVolume;
            public final Integer stdevFactor;

            SuccessRateEjection(Integer num, Integer num2, Integer num3, Integer num4) {
                this.stdevFactor = num;
                this.enforcementPercentage = num2;
                this.minimumHosts = num3;
                this.requestVolume = num4;
            }

            public static final class Builder {
                Integer stdevFactor = 1900;
                Integer enforcementPercentage = 100;
                Integer minimumHosts = 5;
                Integer requestVolume = 100;

                public Builder setStdevFactor(Integer num) {
                    Preconditions.checkArgument(num != null);
                    this.stdevFactor = num;
                    return this;
                }

                public Builder setEnforcementPercentage(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0 && num.intValue() <= 100);
                    this.enforcementPercentage = num;
                    return this;
                }

                public Builder setMinimumHosts(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0);
                    this.minimumHosts = num;
                    return this;
                }

                public Builder setRequestVolume(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0);
                    this.requestVolume = num;
                    return this;
                }

                public SuccessRateEjection build() {
                    return new SuccessRateEjection(this.stdevFactor, this.enforcementPercentage, this.minimumHosts, this.requestVolume);
                }
            }
        }

        public static class FailurePercentageEjection {
            public final Integer enforcementPercentage;
            public final Integer minimumHosts;
            public final Integer requestVolume;
            public final Integer threshold;

            FailurePercentageEjection(Integer num, Integer num2, Integer num3, Integer num4) {
                this.threshold = num;
                this.enforcementPercentage = num2;
                this.minimumHosts = num3;
                this.requestVolume = num4;
            }

            public static class Builder {
                Integer threshold = 85;
                Integer enforcementPercentage = 100;
                Integer minimumHosts = 5;
                Integer requestVolume = 50;

                public Builder setThreshold(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0 && num.intValue() <= 100);
                    this.threshold = num;
                    return this;
                }

                public Builder setEnforcementPercentage(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0 && num.intValue() <= 100);
                    this.enforcementPercentage = num;
                    return this;
                }

                public Builder setMinimumHosts(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0);
                    this.minimumHosts = num;
                    return this;
                }

                public Builder setRequestVolume(Integer num) {
                    Preconditions.checkArgument(num != null);
                    Preconditions.checkArgument(num.intValue() >= 0);
                    this.requestVolume = num;
                    return this;
                }

                public FailurePercentageEjection build() {
                    return new FailurePercentageEjection(this.threshold, this.enforcementPercentage, this.minimumHosts, this.requestVolume);
                }
            }
        }

        boolean outlierDetectionEnabled() {
            return (this.successRateEjection == null && this.failurePercentageEjection == null) ? false : true;
        }
    }
}
