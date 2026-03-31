package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class ListFieldSchemaFull implements ListFieldSchema {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    ListFieldSchemaFull() {
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object message, long offset) {
        return mutableListAt(message, offset, 10);
    }

    private static <L> List<L> mutableListAt(Object obj, long j, int i) {
        Object obj2;
        List<L> arrayList;
        List<L> list = getList(obj, j);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                arrayList = new LazyStringArrayList(i);
            } else if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            UnsafeUtil.putObject(obj, j, arrayList);
            return arrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            UnsafeUtil.putObject(obj, j, arrayList2);
            obj2 = arrayList2;
        } else if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            UnsafeUtil.putObject(obj, j, lazyStringArrayList);
            obj2 = lazyStringArrayList;
        } else {
            if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                return list;
            }
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (protobufList.isModifiable()) {
                return list;
            }
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
            UnsafeUtil.putObject(obj, j, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
        return (List<L>) obj2;
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object message, long offset) {
        Object objUnmodifiableList;
        List list = (List) UnsafeUtil.getObject(message, offset);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        UnsafeUtil.putObject(message, offset, objUnmodifiableList);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object msg, Object otherMsg, long offset) {
        List list = getList(otherMsg, offset);
        List listMutableListAt = mutableListAt(msg, offset, list.size());
        int size = listMutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listMutableListAt.addAll(list);
        }
        if (size > 0) {
            list = listMutableListAt;
        }
        UnsafeUtil.putObject(msg, offset, list);
    }

    static <E> List<E> getList(Object message, long offset) {
        return (List) UnsafeUtil.getObject(message, offset);
    }
}
