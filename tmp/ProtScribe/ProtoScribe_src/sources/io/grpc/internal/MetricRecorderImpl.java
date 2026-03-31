package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CallbackMetricInstrument;
import io.grpc.DoubleCounterMetricInstrument;
import io.grpc.DoubleHistogramMetricInstrument;
import io.grpc.LongCounterMetricInstrument;
import io.grpc.LongGaugeMetricInstrument;
import io.grpc.LongHistogramMetricInstrument;
import io.grpc.MetricInstrumentRegistry;
import io.grpc.MetricRecorder;
import io.grpc.MetricSink;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MetricRecorderImpl implements MetricRecorder {
    private final List<MetricSink> metricSinks;
    private final MetricInstrumentRegistry registry;

    MetricRecorderImpl(List<MetricSink> list, MetricInstrumentRegistry metricInstrumentRegistry) {
        this.metricSinks = list;
        this.registry = metricInstrumentRegistry;
    }

    @Override // io.grpc.MetricRecorder
    public void addDoubleCounter(DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List<String> list, List<String> list2) {
        super.addDoubleCounter(doubleCounterMetricInstrument, d, list, list2);
        for (MetricSink metricSink : this.metricSinks) {
            if (metricSink.getMeasuresSize() <= doubleCounterMetricInstrument.getIndex()) {
                metricSink.updateMeasures(this.registry.getMetricInstruments());
            }
            metricSink.addDoubleCounter(doubleCounterMetricInstrument, d, list, list2);
        }
    }

    @Override // io.grpc.MetricRecorder
    public void addLongCounter(LongCounterMetricInstrument longCounterMetricInstrument, long j, List<String> list, List<String> list2) {
        super.addLongCounter(longCounterMetricInstrument, j, list, list2);
        for (MetricSink metricSink : this.metricSinks) {
            if (metricSink.getMeasuresSize() <= longCounterMetricInstrument.getIndex()) {
                metricSink.updateMeasures(this.registry.getMetricInstruments());
            }
            metricSink.addLongCounter(longCounterMetricInstrument, j, list, list2);
        }
    }

    @Override // io.grpc.MetricRecorder
    public void recordDoubleHistogram(DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List<String> list, List<String> list2) {
        super.recordDoubleHistogram(doubleHistogramMetricInstrument, d, list, list2);
        for (MetricSink metricSink : this.metricSinks) {
            if (metricSink.getMeasuresSize() <= doubleHistogramMetricInstrument.getIndex()) {
                metricSink.updateMeasures(this.registry.getMetricInstruments());
            }
            metricSink.recordDoubleHistogram(doubleHistogramMetricInstrument, d, list, list2);
        }
    }

    @Override // io.grpc.MetricRecorder
    public void recordLongHistogram(LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List<String> list, List<String> list2) {
        super.recordLongHistogram(longHistogramMetricInstrument, j, list, list2);
        for (MetricSink metricSink : this.metricSinks) {
            if (metricSink.getMeasuresSize() <= longHistogramMetricInstrument.getIndex()) {
                metricSink.updateMeasures(this.registry.getMetricInstruments());
            }
            metricSink.recordLongHistogram(longHistogramMetricInstrument, j, list, list2);
        }
    }

    @Override // io.grpc.MetricRecorder
    public MetricRecorder.Registration registerBatchCallback(final MetricRecorder.BatchCallback batchCallback, CallbackMetricInstrument... callbackMetricInstrumentArr) {
        BitSet bitSet = new BitSet();
        long jMax = -1;
        for (CallbackMetricInstrument callbackMetricInstrument : callbackMetricInstrumentArr) {
            jMax = Math.max(jMax, callbackMetricInstrument.getIndex());
            bitSet.set(callbackMetricInstrument.getIndex());
        }
        final ArrayList arrayList = new ArrayList();
        for (MetricSink metricSink : this.metricSinks) {
            if (metricSink.getMeasuresSize() <= jMax) {
                metricSink.updateMeasures(this.registry.getMetricInstruments());
            }
            final BatchRecorderImpl batchRecorderImpl = new BatchRecorderImpl(metricSink, bitSet);
            arrayList.add(metricSink.registerBatchCallback(new Runnable() { // from class: io.grpc.internal.MetricRecorderImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    batchCallback.accept(batchRecorderImpl);
                }
            }, callbackMetricInstrumentArr));
        }
        return new MetricRecorder.Registration() { // from class: io.grpc.internal.MetricRecorderImpl$$ExternalSyntheticLambda1
            @Override // io.grpc.MetricRecorder.Registration, java.lang.AutoCloseable
            public final void close() {
                MetricRecorderImpl.lambda$registerBatchCallback$1(arrayList);
            }
        };
    }

    static /* synthetic */ void lambda$registerBatchCallback$1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MetricSink.Registration) it.next()).close();
        }
    }

    static class BatchRecorderImpl implements MetricRecorder.BatchRecorder {
        private final BitSet allowedInstruments;
        private final MetricSink sink;

        BatchRecorderImpl(MetricSink metricSink, BitSet bitSet) {
            this.sink = (MetricSink) Preconditions.checkNotNull(metricSink, "sink");
            this.allowedInstruments = (BitSet) Preconditions.checkNotNull(bitSet, "allowedInstruments");
        }

        @Override // io.grpc.MetricRecorder.BatchRecorder
        public void recordLongGauge(LongGaugeMetricInstrument longGaugeMetricInstrument, long j, List<String> list, List<String> list2) {
            super.recordLongGauge(longGaugeMetricInstrument, j, list, list2);
            Preconditions.checkArgument(this.allowedInstruments.get(longGaugeMetricInstrument.getIndex()), "Instrument was not listed when registering callback: %s", longGaugeMetricInstrument);
            this.sink.recordLongGauge(longGaugeMetricInstrument, j, list, list2);
        }
    }
}
