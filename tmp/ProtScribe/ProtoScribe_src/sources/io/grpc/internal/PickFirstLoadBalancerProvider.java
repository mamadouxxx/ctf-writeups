package io.grpc.internal;

import io.grpc.LoadBalancer;
import io.grpc.LoadBalancerProvider;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.internal.PickFirstLeafLoadBalancer;
import io.grpc.internal.PickFirstLoadBalancer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PickFirstLoadBalancerProvider extends LoadBalancerProvider {
    public static final String GRPC_PF_USE_HAPPY_EYEBALLS = "GRPC_PF_USE_HAPPY_EYEBALLS";
    private static final String SHUFFLE_ADDRESS_LIST_KEY = "shuffleAddressList";
    private static boolean enableNewPickFirst = GrpcUtil.getFlag("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);

    @Override // io.grpc.LoadBalancerProvider
    public int getPriority() {
        return 5;
    }

    @Override // io.grpc.LoadBalancerProvider
    public boolean isAvailable() {
        return true;
    }

    public static boolean isEnabledHappyEyeballs() {
        return GrpcUtil.getFlag(GRPC_PF_USE_HAPPY_EYEBALLS, false);
    }

    @Override // io.grpc.LoadBalancerProvider
    public String getPolicyName() {
        return GrpcUtil.DEFAULT_LB_POLICY;
    }

    @Override // io.grpc.LoadBalancer.Factory
    public LoadBalancer newLoadBalancer(LoadBalancer.Helper helper) {
        if (enableNewPickFirst) {
            return new PickFirstLeafLoadBalancer(helper);
        }
        return new PickFirstLoadBalancer(helper);
    }

    @Override // io.grpc.LoadBalancerProvider
    public NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return NameResolver.ConfigOrError.fromConfig(getLbPolicyConfig(map));
        } catch (RuntimeException e) {
            return NameResolver.ConfigOrError.fromError(Status.UNAVAILABLE.withCause(e).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }

    private static Object getLbPolicyConfig(Map<String, ?> map) {
        Boolean bool = JsonUtil.getBoolean(map, SHUFFLE_ADDRESS_LIST_KEY);
        if (enableNewPickFirst) {
            return new PickFirstLeafLoadBalancer.PickFirstLeafLoadBalancerConfig(bool);
        }
        return new PickFirstLoadBalancer.PickFirstLoadBalancerConfig(bool);
    }

    public static boolean isEnabledNewPickFirst() {
        return enableNewPickFirst;
    }
}
