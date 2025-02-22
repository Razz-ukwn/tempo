package com.google.android.gms.internal.p000firebaseauthapi;

import h0.e;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e4  reason: invalid package */
public final class e4 implements Map.Entry, Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparable f4506a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4507b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h4 f4508c;

    public e4(h4 h4Var, Comparable comparable, Object obj) {
        this.f4508c = h4Var;
        this.f4506a = comparable;
        this.f4507b = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4506a.compareTo(((e4) obj).f4506a);
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
        Comparable comparable = this.f4506a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4507b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f4506a;
    }

    public final Object getValue() {
        return this.f4507b;
    }

    public final int hashCode() {
        int i8 = 0;
        Comparable comparable = this.f4506a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4507b;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return i8 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        int i8 = h4.C;
        this.f4508c.h();
        Object obj2 = this.f4507b;
        this.f4507b = obj;
        return obj2;
    }

    public final String toString() {
        return e.b(String.valueOf(this.f4506a), "=", String.valueOf(this.f4507b));
    }
}
