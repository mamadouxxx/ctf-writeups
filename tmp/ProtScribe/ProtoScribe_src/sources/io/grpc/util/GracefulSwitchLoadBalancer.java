package io.grpc.util;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.ConnectivityStateInfo;
import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerRegistry;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.internal.ServiceConfigUtil;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class GracefulSwitchLoadBalancer extends ForwardingLoadBalancer {
    static final LoadBalancer.SubchannelPicker BUFFER_PICKER = new LoadBalancer.SubchannelPicker() { // from class: io.grpc.util.GracefulSwitchLoadBalancer.2
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public LoadBalancer.PickResult pickSubchannel(LoadBalancer.PickSubchannelArgs pickSubchannelArgs) {
            return LoadBalancer.PickResult.withNoResult();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    };

    @Nullable
    private LoadBalancer.Factory currentBalancerFactory;
    private LoadBalancer currentLb;
    private boolean currentLbIsReady;
    private final LoadBalancer defaultBalancer;
    private final LoadBalancer.Helper helper;

    @Nullable
    private LoadBalancer.Factory pendingBalancerFactory;
    private LoadBalancer pendingLb;
    private LoadBalancer.SubchannelPicker pendingPicker;
    private ConnectivityState pendingState;
    private boolean switchToCalled;

    public GracefulSwitchLoadBalancer(LoadBalancer.Helper helper) {
        LoadBalancer loadBalancer = new LoadBalancer() { // from class: io.grpc.util.GracefulSwitchLoadBalancer.1
            @Override // io.grpc.LoadBalancer
            public void shutdown() {
            }

            @Override // io.grpc.LoadBalancer
            public void handleResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
                throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
            }

            @Override // io.grpc.LoadBalancer
            public void handleNameResolutionError(Status status) {
                GracefulSwitchLoadBalancer.this.helper.updateBalancingState(ConnectivityState.TRANSIENT_FAILURE, new LoadBalancer.FixedResultPicker(LoadBalancer.PickResult.withError(status)));
            }
        };
        this.defaultBalancer = loadBalancer;
        this.currentLb = loadBalancer;
        this.pendingLb = loadBalancer;
        this.helper = (LoadBalancer.Helper) Preconditions.checkNotNull(helper, "helper");
    }

    @Override // io.grpc.util.ForwardingLoadBalancer, io.grpc.LoadBalancer
    public void handleResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        if (this.switchToCalled) {
            delegate().handleResolvedAddresses(resolvedAddresses);
            return;
        }
        Config config = (Config) resolvedAddresses.getLoadBalancingPolicyConfig();
        switchToInternal(config.childFactory);
        delegate().handleResolvedAddresses(resolvedAddresses.toBuilder().setLoadBalancingPolicyConfig(config.childConfig).build());
    }

    @Override // io.grpc.LoadBalancer
    public Status acceptResolvedAddresses(LoadBalancer.ResolvedAddresses resolvedAddresses) {
        if (this.switchToCalled) {
            return delegate().acceptResolvedAddresses(resolvedAddresses);
        }
        Config config = (Config) resolvedAddresses.getLoadBalancingPolicyConfig();
        switchToInternal(config.childFactory);
        return delegate().acceptResolvedAddresses(resolvedAddresses.toBuilder().setLoadBalancingPolicyConfig(config.childConfig).build());
    }

    @Deprecated
    public void switchTo(LoadBalancer.Factory factory) {
        this.switchToCalled = true;
        switchToInternal(factory);
    }

    private void switchToInternal(LoadBalancer.Factory factory) {
        Preconditions.checkNotNull(factory, "newBalancerFactory");
        if (factory.equals(this.pendingBalancerFactory)) {
            return;
        }
        this.pendingLb.shutdown();
        this.pendingLb = this.defaultBalancer;
        this.pendingBalancerFactory = null;
        this.pendingState = ConnectivityState.CONNECTING;
        this.pendingPicker = BUFFER_PICKER;
        if (factory.equals(this.currentBalancerFactory)) {
            return;
        }
        C1PendingHelper c1PendingHelper = new C1PendingHelper();
        c1PendingHelper.lb = factory.newLoadBalancer(c1PendingHelper);
        this.pendingLb = c1PendingHelper.lb;
        this.pendingBalancerFactory = factory;
        if (this.currentLbIsReady) {
            return;
        }
        swap();
    }

    /* JADX INFO: renamed from: io.grpc.util.GracefulSwitchLoadBalancer$1PendingHelper, reason: invalid class name */
    class C1PendingHelper extends ForwardingLoadBalancerHelper {
        LoadBalancer lb;

        C1PendingHelper() {
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper
        protected LoadBalancer.Helper delegate() {
            return GracefulSwitchLoadBalancer.this.helper;
        }

        @Override // io.grpc.util.ForwardingLoadBalancerHelper, io.grpc.LoadBalancer.Helper
        public void updateBalancingState(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
            if (this.lb == GracefulSwitchLoadBalancer.this.pendingLb) {
                Preconditions.checkState(GracefulSwitchLoadBalancer.this.currentLbIsReady, "there's pending lb while current lb has been out of READY");
                GracefulSwitchLoadBalancer.this.pendingState = connectivityState;
                GracefulSwitchLoadBalancer.this.pendingPicker = subchannelPicker;
                if (connectivityState == ConnectivityState.READY) {
                    GracefulSwitchLoadBalancer.this.swap();
                    return;
                }
                return;
            }
            if (this.lb == GracefulSwitchLoadBalancer.this.currentLb) {
                GracefulSwitchLoadBalancer.this.currentLbIsReady = connectivityState == ConnectivityState.READY;
                if (GracefulSwitchLoadBalancer.this.currentLbIsReady || GracefulSwitchLoadBalancer.this.pendingLb == GracefulSwitchLoadBalancer.this.defaultBalancer) {
                    GracefulSwitchLoadBalancer.this.helper.updateBalancingState(connectivityState, subchannelPicker);
                } else {
                    GracefulSwitchLoadBalancer.this.swap();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void swap() {
        this.helper.updateBalancingState(this.pendingState, this.pendingPicker);
        this.currentLb.shutdown();
        this.currentLb = this.pendingLb;
        this.currentBalancerFactory = this.pendingBalancerFactory;
        this.pendingLb = this.defaultBalancer;
        this.pendingBalancerFactory = null;
    }

    @Override // io.grpc.util.ForwardingLoadBalancer
    protected LoadBalancer delegate() {
        LoadBalancer loadBalancer = this.pendingLb;
        return loadBalancer == this.defaultBalancer ? this.currentLb : loadBalancer;
    }

    @Override // io.grpc.util.ForwardingLoadBalancer, io.grpc.LoadBalancer
    @Deprecated
    public void handleSubchannelState(LoadBalancer.Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {
        throw new UnsupportedOperationException("handleSubchannelState() is not supported by " + getClass().getName());
    }

    @Override // io.grpc.util.ForwardingLoadBalancer, io.grpc.LoadBalancer
    public void shutdown() {
        this.pendingLb.shutdown();
        this.currentLb.shutdown();
    }

    public String delegateType() {
        return delegate().getClass().getSimpleName();
    }

    public static NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(List<Map<String, ?>> list) {
        return parseLoadBalancingPolicyConfig(list, LoadBalancerRegistry.getDefaultRegistry());
    }

    public static NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(List<Map<String, ?>> list, LoadBalancerRegistry loadBalancerRegistry) {
        List<ServiceConfigUtil.LbConfig> listUnwrapLoadBalancingConfigList = ServiceConfigUtil.unwrapLoadBalancingConfigList(list);
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return NameResolver.ConfigOrError.fromError(Status.INTERNAL.withDescription("No child LB config specified"));
        }
        NameResolver.ConfigOrError configOrErrorSelectLbPolicyFromList = ServiceConfigUtil.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, loadBalancerRegistry);
        if (configOrErrorSelectLbPolicyFromList.getError() != null) {
            Status error = configOrErrorSelectLbPolicyFromList.getError();
            return NameResolver.ConfigOrError.fromError(Status.INTERNAL.withCause(error.getCause()).withDescription(error.getDescription()).augmentDescription("Failed to select child config"));
        }
        ServiceConfigUtil.PolicySelection policySelection = (ServiceConfigUtil.PolicySelection) configOrErrorSelectLbPolicyFromList.getConfig();
        return NameResolver.ConfigOrError.fromConfig(createLoadBalancingPolicyConfig(policySelection.getProvider(), policySelection.getConfig()));
    }

    public static Object createLoadBalancingPolicyConfig(LoadBalancer.Factory factory, @Nullable Object obj) {
        return new Config(factory, obj);
    }

    static final class Config {

        @Nullable
        final Object childConfig;
        final LoadBalancer.Factory childFactory;

        public Config(LoadBalancer.Factory factory, @Nullable Object obj) {
            this.childFactory = (LoadBalancer.Factory) Preconditions.checkNotNull(factory, "childFactory");
            this.childConfig = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Objects.equal(this.childFactory, config.childFactory) && Objects.equal(this.childConfig, config.childConfig);
        }

        public int hashCode() {
            return Objects.hashCode(this.childFactory, this.childConfig);
        }

        public String toString() {
            return MoreObjects.toStringHelper("GracefulSwitchLoadBalancer.Config").add("childFactory", this.childFactory).add("childConfig", this.childConfig).toString();
        }
    }
}
