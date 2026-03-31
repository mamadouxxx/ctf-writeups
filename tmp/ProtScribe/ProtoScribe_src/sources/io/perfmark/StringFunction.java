package io.perfmark;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface StringFunction<T> extends Function<T, String> {
    @Override // java.util.function.Function
    String apply(T t);
}
