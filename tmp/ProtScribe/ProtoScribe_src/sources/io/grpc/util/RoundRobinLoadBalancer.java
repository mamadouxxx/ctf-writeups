package io.grpc.util;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.LoadBalancer;
import io.grpc.util.MultiChildLoadBalancer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class RoundRobinLoadBalancer extends MultiChildLoadBalancer {
    private LoadBalancer.SubchannelPicker currentPicker;
    private final AtomicInteger sequence;

    public RoundRobinLoadBalancer(LoadBalancer.Helper helper) {
        super(helper);
        this.sequence = new AtomicInteger(new Random().nextInt());
        this.currentPicker = new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.withNoResult());
    }

    @Override // io.grpc.util.MultiChildLoadBalancer
    protected void updateOverallBalancingState() {
        List<MultiChildLoadBalancer.ChildLbState> readyChildren = getReadyChildren();
        if (readyChildren.isEmpty()) {
            Iterator<MultiChildLoadBalancer.ChildLbState> it = getChildLbStates().iterator();
            while (it.hasNext()) {
                ConnectivityState currentState = it.next().getCurrentState();
                if (currentState == ConnectivityState.CONNECTING || currentState == ConnectivityState.IDLE) {
                    updateBalancingState(ConnectivityState.CONNECTING, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.withNoResult()));
                    return;
                }
            }
            updateBalancingState(ConnectivityState.TRANSIENT_FAILURE, createReadyPicker(getChildLbStates()));
            return;
        }
        updateBalancingState(ConnectivityState.READY, createReadyPicker(readyChildren));
    }

    private void updateBalancingState(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
        if (connectivityState == this.currentConnectivityState && subchannelPicker.equals(this.currentPicker)) {
            return;
        }
        getHelper().updateBalancingState(connectivityState, subchannelPicker);
        this.currentConnectivityState = connectivityState;
        this.currentPicker = subchannelPicker;
    }

    private LoadBalancer.SubchannelPicker createReadyPicker(Collection<MultiChildLoadBalancer.ChildLbState> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<MultiChildLoadBalancer.ChildLbState> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCurrentPicker());
        }
        return new ReadyPicker(arrayList, this.sequence);
    }

    @Override // io.grpc.util.MultiChildLoadBalancer
    protected MultiChildLoadBalancer.ChildLbState createChildLbState(Object obj) {
        return new MultiChildLoadBalancer.ChildLbState(obj, this.pickFirstLbProvider) { // from class: io.grpc.util.RoundRobinLoadBalancer.1
            @Override // io.grpc.util.MultiChildLoadBalancer.ChildLbState
            protected MultiChildLoadBalancer.ChildLbState.ChildLbStateHelper createChildHelper() {
                return new MultiChildLoadBalancer.ChildLbState.ChildLbStateHelper() { // from class: io.grpc.util.RoundRobinLoadBalancer.1.1
                    @Override // io.grpc.util.MultiChildLoadBalancer.ChildLbState.ChildLbStateHelper, io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
                    public void updateBalancingState(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
                        super.updateBalancingState(connectivityState, subchannelPicker);
                        if (RoundRobinLoadBalancer.this.resolvingAddresses || connectivityState != ConnectivityState.IDLE) {
                            return;
                        }
                        getLb().requestConnection();
                    }
                };
            }
        };
    }

    static class ReadyPicker extends LoadBalancer.SubchannelPicker {
        private final int hashCode;
        private final AtomicInteger index;
        private final List<LoadBalancer.SubchannelPicker> subchannelPickers;

        public ReadyPicker(List<LoadBalancer.SubchannelPicker> list, AtomicInteger atomicInteger) {
            Preconditions.checkArgument(!list.isEmpty(), "empty list");
            this.subchannelPickers = list;
            this.index = (AtomicInteger) Preconditions.checkNotNull(atomicInteger, "index");
            Iterator<LoadBalancer.SubchannelPicker> it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            this.hashCode = iHashCode;
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public LoadBalancer.PickResult pickSubchannel(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return this.subchannelPickers.get(nextIndex()).pickSubchannel(pickSubchannelArgs);
        }

        public String toString() {
            return MoreObjects.toStringHelper((Class<?>) ReadyPicker.class).add("subchannelPickers", this.subchannelPickers).toString();
        }

        private int nextIndex() {
            return (this.index.getAndIncrement() & Integer.MAX_VALUE) % this.subchannelPickers.size();
        }

        List<LoadBalancer.SubchannelPicker> getSubchannelPickers() {
            return this.subchannelPickers;
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ReadyPicker)) {
                return false;
            }
            ReadyPicker readyPicker = (ReadyPicker) obj;
            if (readyPicker == this) {
                return true;
            }
            return this.hashCode == readyPicker.hashCode && this.index == readyPicker.index && this.subchannelPickers.size() == readyPicker.subchannelPickers.size() && new HashSet(this.subchannelPickers).containsAll(readyPicker.subchannelPickers);
        }
    }
}
