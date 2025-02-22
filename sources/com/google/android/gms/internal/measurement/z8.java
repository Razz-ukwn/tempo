package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class z8 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a9 f5629a;

    public /* synthetic */ z8(a9 a9Var) {
        this.f5629a = a9Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        Object value = entry.getValue();
        this.f5629a.put((Comparable) entry.getKey(), value);
        return true;
    }

    public final void clear() {
        this.f5629a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f5629a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null) {
            return obj2.equals(value);
        }
        return false;
    }

    public final Iterator iterator() {
        return new y8(this.f5629a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f5629a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f5629a.size();
    }
}
