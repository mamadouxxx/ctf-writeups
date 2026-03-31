package io.grpc.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import io.grpc.Attributes;
import io.grpc.ConnectivityState;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.Status;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MultiChildLoadBalancer extends LoadBalancer {
    private static final Logger logger = Logger.getLogger(MultiChildLoadBalancer.class.getName());
    protected ConnectivityState currentConnectivityState;
    private final LoadBalancer.Helper helper;
    protected boolean resolvingAddresses;
    private final Map<Object, ChildLbState> childLbStates = new LinkedHashMap();
    protected final LoadBalancerProvider pickFirstLbProvider = new PickFirstLoadBalancerProvider();

    protected abstract void updateOverallBalancingState();

    protected MultiChildLoadBalancer(LoadBalancer.Helper helper) {
        this.helper = (LoadBalancer.Helper) Preconditions.checkNotNull(helper, "helper");
        logger.log(Level.FINE, "Created");
    }

    protected Map<Object, LoadBalancer.ResolvedAddresses> createChildAddressesMap(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        HashMap map = new HashMap();
        for (EquivalentAddressGroup equivalentAddressGroup : resolvedAddresses.getAddresses()) {
            map.put(new Endpoint(equivalentAddressGroup), resolvedAddresses.toBuilder().setAddresses(Collections.singletonList(equivalentAddressGroup)).setAttributes(Attributes.newBuilder().set(IS_PETIOLE_POLICY, true).build()).setLoadBalancingPolicyConfig(null).build());
        }
        return map;
    }

    protected ChildLbState createChildLbState(Object obj) {
        return new ChildLbState(obj, this.pickFirstLbProvider);
    }

    @Override // io.grpc.LoadBalancer
    public Status acceptResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        try {
            this.resolvingAddresses = true;
            AcceptResolvedAddrRetVal acceptResolvedAddrRetValAcceptResolvedAddressesInternal = acceptResolvedAddressesInternal(resolvedAddresses);
            if (!acceptResolvedAddrRetValAcceptResolvedAddressesInternal.status.isOk()) {
                return acceptResolvedAddrRetValAcceptResolvedAddressesInternal.status;
            }
            updateOverallBalancingState();
            shutdownRemoved(acceptResolvedAddrRetValAcceptResolvedAddressesInternal.removedChildren);
            return acceptResolvedAddrRetValAcceptResolvedAddressesInternal.status;
        } finally {
            this.resolvingAddresses = false;
        }
    }

    @Override // io.grpc.LoadBalancer
    public void handleNameResolutionError(Status status) {
        if (this.currentConnectivityState != ConnectivityState.READY) {
            this.helper.updateBalancingState(ConnectivityState.TRANSIENT_FAILURE, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.withError(status)));
        }
    }

    @Override // io.grpc.LoadBalancer
    public void shutdown() {
        logger.log(Level.FINE, "Shutdown");
        Iterator<ChildLbState> it = this.childLbStates.values().iterator();
        while (it.hasNext()) {
            it.next().shutdown();
        }
        this.childLbStates.clear();
    }

    protected final AcceptResolvedAddrRetVal acceptResolvedAddressesInternal(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        logger.log(Level.FINE, "Received resolution result: {0}", resolvedAddresses);
        Map<Object, LoadBalancer.ResolvedAddresses> mapCreateChildAddressesMap = createChildAddressesMap(resolvedAddresses);
        if (mapCreateChildAddressesMap.isEmpty()) {
            Status statusWithDescription = Status.UNAVAILABLE.withDescription("NameResolver returned no usable address. " + resolvedAddresses);
            handleNameResolutionError(statusWithDescription);
            return new AcceptResolvedAddrRetVal(statusWithDescription, null);
        }
        updateChildrenWithResolvedAddresses(mapCreateChildAddressesMap);
        return new AcceptResolvedAddrRetVal(Status.OK, getRemovedChildren(mapCreateChildAddressesMap.keySet()));
    }

    private void updateChildrenWithResolvedAddresses(Map<Object, LoadBalancer.ResolvedAddresses> map) {
        for (Map.Entry<Object, LoadBalancer.ResolvedAddresses> entry : map.entrySet()) {
            ChildLbState childLbStateCreateChildLbState = this.childLbStates.get(entry.getKey());
            if (childLbStateCreateChildLbState == null) {
                childLbStateCreateChildLbState = createChildLbState(entry.getKey());
                this.childLbStates.put(entry.getKey(), childLbStateCreateChildLbState);
            }
            childLbStateCreateChildLbState.setResolvedAddresses(entry.getValue());
            childLbStateCreateChildLbState.lb.handleResolvedAddresses(entry.getValue());
        }
    }

    private List<ChildLbState> getRemovedChildren(Set<Object> set) {
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it = ImmutableList.copyOf((Collection) this.childLbStates.keySet()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!set.contains(next)) {
                arrayList.add(this.childLbStates.remove(next));
            }
        }
        return arrayList;
    }

    protected final void shutdownRemoved(List<ChildLbState> list) {
        Iterator<ChildLbState> it = list.iterator();
        while (it.hasNext()) {
            it.next().shutdown();
        }
    }

    @Nullable
    protected static ConnectivityState aggregateState(@Nullable ConnectivityState connectivityState, ConnectivityState connectivityState2) {
        if (connectivityState == null) {
            return connectivityState2;
        }
        if (connectivityState == ConnectivityState.READY || connectivityState2 == ConnectivityState.READY) {
            return ConnectivityState.READY;
        }
        if (connectivityState == ConnectivityState.CONNECTING || connectivityState2 == ConnectivityState.CONNECTING) {
            return ConnectivityState.CONNECTING;
        }
        return (connectivityState == ConnectivityState.IDLE || connectivityState2 == ConnectivityState.IDLE) ? ConnectivityState.IDLE : connectivityState;
    }

    protected final LoadBalancer.Helper getHelper() {
        return this.helper;
    }

    public final Collection<ChildLbState> getChildLbStates() {
        return this.childLbStates.values();
    }

    public final ChildLbState getChildLbState(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof EquivalentAddressGroup) {
            obj = new Endpoint((EquivalentAddressGroup) obj);
        }
        return this.childLbStates.get(obj);
    }

    public final ChildLbState getChildLbStateEag(EquivalentAddressGroup equivalentAddressGroup) {
        return getChildLbState(new Endpoint(equivalentAddressGroup));
    }

    protected final List<ChildLbState> getReadyChildren() {
        ArrayList arrayList = new ArrayList();
        for (ChildLbState childLbState : getChildLbStates()) {
            if (childLbState.getCurrentState() == ConnectivityState.READY) {
                arrayList.add(childLbState);
            }
        }
        return arrayList;
    }

    public class ChildLbState {
        private LoadBalancer.SubchannelPicker currentPicker = new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.withNoResult());
        private ConnectivityState currentState = ConnectivityState.CONNECTING;
        private final Object key;
        private final LoadBalancer lb;
        private LoadBalancer.ResolvedAddresses resolvedAddresses;

        public ChildLbState(Object obj, LoadBalancer.Factory factory) {
            this.key = obj;
            this.lb = factory.newLoadBalancer(createChildHelper());
        }

        protected ChildLbStateHelper createChildHelper() {
            return new ChildLbStateHelper();
        }

        protected void shutdown() {
            this.lb.shutdown();
            this.currentState = ConnectivityState.SHUTDOWN;
            MultiChildLoadBalancer.logger.log(Level.FINE, "Child balancer {0} deleted", this.key);
        }

        public String toString() {
            return "Address = " + this.key + ", state = " + this.currentState + ", picker type: " + this.currentPicker.getClass() + ", lb: " + this.lb;
        }

        public final Object getKey() {
            return this.key;
        }

        public final LoadBalancer getLb() {
            return this.lb;
        }

        public final LoadBalancer.SubchannelPicker getCurrentPicker() {
            return this.currentPicker;
        }

        public final ConnectivityState getCurrentState() {
            return this.currentState;
        }

        protected final void setCurrentState(ConnectivityState connectivityState) {
            this.currentState = connectivityState;
        }

        protected final void setCurrentPicker(LoadBalancer.SubchannelPicker subchannelPicker) {
            this.currentPicker = subchannelPicker;
        }

        public final EquivalentAddressGroup getEag() {
            LoadBalancer.ResolvedAddresses resolvedAddresses = this.resolvedAddresses;
            if (resolvedAddresses == null || resolvedAddresses.getAddresses().isEmpty()) {
                return null;
            }
            return this.resolvedAddresses.getAddresses().get(0);
        }

        protected final void setResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
            Preconditions.checkNotNull(resolvedAddresses, "Missing address list for child");
            this.resolvedAddresses = resolvedAddresses;
        }

        public final LoadBalancer.ResolvedAddresses getResolvedAddresses() {
            return this.resolvedAddresses;
        }

        protected class ChildLbStateHelper extends ForwardingLoadBalancerHelper {
            protected ChildLbStateHelper() {
            }

            @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
            public void updateBalancingState(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
                if (ChildLbState.this.currentState == ConnectivityState.SHUTDOWN) {
                    return;
                }
                ChildLbState.this.currentState = connectivityState;
                ChildLbState.this.currentPicker = subchannelPicker;
                if (MultiChildLoadBalancer.this.resolvingAddresses) {
                    return;
                }
                MultiChildLoadBalancer.this.updateOverallBalancingState();
            }

            @Override // io.grpc.util.ForwardingLoadBalancerHelper
            protected LoadBalancer.Helper delegate() {
                return MultiChildLoadBalancer.this.helper;
            }
        }
    }

    protected static class Endpoint {
        final Collection<SocketAddress> addrs;
        final int hashCode;

        public Endpoint(EquivalentAddressGroup equivalentAddressGroup) {
            Preconditions.checkNotNull(equivalentAddressGroup, "eag");
            if (equivalentAddressGroup.getAddresses().size() < 10) {
                this.addrs = equivalentAddressGroup.getAddresses();
            } else {
                this.addrs = new HashSet(equivalentAddressGroup.getAddresses());
            }
            Iterator<SocketAddress> it = equivalentAddressGroup.getAddresses().iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            this.hashCode = iHashCode;
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Endpoint)) {
                return false;
            }
            Endpoint endpoint = (Endpoint) obj;
            if (endpoint.hashCode == this.hashCode && endpoint.addrs.size() == this.addrs.size()) {
                return endpoint.addrs.containsAll(this.addrs);
            }
            return false;
        }

        public String toString() {
            return this.addrs.toString();
        }
    }

    protected static class AcceptResolvedAddrRetVal {
        public final List<ChildLbState> removedChildren;
        public final Status status;

        public AcceptResolvedAddrRetVal(Status status, List<ChildLbState> list) {
            this.status = status;
            this.removedChildren = list;
        }
    }
}
