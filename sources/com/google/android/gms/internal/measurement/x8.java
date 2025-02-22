package com.google.android.gms.internal.measurement;

import h0.e;
import java.util.Map;

public final class x8 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f5585a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5586b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a9 f5587c;

    public x8(a9 a9Var, Comparable comparable, Object obj) {
        this.f5587c = a9Var;
        this.f5585a = comparable;
        this.f5586b = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5585a.compareTo(((x8) obj).f5585a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f5585a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f5586b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f5585a;
    }

    public final Object getValue() {
        return this.f5586b;
    }

    public final int hashCode() {
        int i8 = 0;
        Comparable comparable = this.f5585a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5586b;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return i8 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        int i8 = a9.C;
        this.f5587c.h();
        Object obj2 = this.f5586b;
        this.f5586b = obj;
        return obj2;
    }

    public final String toString() {
        return e.b(String.valueOf(this.f5585a), "=", String.valueOf(this.f5586b));
    }
}
