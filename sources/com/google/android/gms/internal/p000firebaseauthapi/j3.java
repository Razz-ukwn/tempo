package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j3  reason: invalid package */
public final class j3 extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    public static final j3 f4659b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4660a = true;

    static {
        j3 j3Var = new j3();
        f4659b = j3Var;
        j3Var.f4660a = false;
    }

    public j3() {
    }

    public static j3 a() {
        return f4659b;
    }

    public static int h(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = u2.f4974a;
            int i8 = r0;
            for (byte b10 : (byte[]) obj) {
                i8 = (i8 * 31) + b10;
            }
            if (i8 == 0) {
                return 1;
            }
            return i8;
        } else if (!(obj instanceof r2)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final j3 b() {
        return isEmpty() ? new j3() : new j3(this);
    }

    public final void clear() {
        i();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        this.f4660a = false;
    }

    public final int hashCode() {
        int i8 = 0;
        for (Map.Entry entry : entrySet()) {
            i8 += h(entry.getValue()) ^ h(entry.getKey());
        }
        return i8;
    }

    public final void i() {
        if (!this.f4660a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        i();
        Charset charset = u2.f4974a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        i();
        for (Object next : map.keySet()) {
            Charset charset = u2.f4974a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    public j3(Map map) {
        super(map);
    }
}
