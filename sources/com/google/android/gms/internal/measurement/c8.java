package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class c8 extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    public static final c8 f5180b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5181a = true;

    static {
        c8 c8Var = new c8();
        f5180b = c8Var;
        c8Var.f5181a = false;
    }

    public c8() {
    }

    public static c8 a() {
        return f5180b;
    }

    public final c8 b() {
        return isEmpty() ? new c8() : new c8(this);
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
        this.f5181a = false;
    }

    public final boolean h() {
        return this.f5181a;
    }

    public final int hashCode() {
        int i8;
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i11 = 1;
            if (key instanceof byte[]) {
                Charset charset = m7.f5399a;
                i8 = r5;
                for (byte b10 : (byte[]) key) {
                    i8 = (i8 * 31) + b10;
                }
                if (i8 == 0) {
                    i8 = 1;
                }
            } else {
                i8 = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = m7.f5399a;
                int i12 = r4;
                for (byte b11 : (byte[]) value) {
                    i12 = (i12 * 31) + b11;
                }
                if (i12 != 0) {
                    i11 = i12;
                }
            } else {
                i11 = value.hashCode();
            }
            i10 += i11 ^ i8;
        }
        return i10;
    }

    public final void i() {
        if (!this.f5181a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        i();
        Charset charset = m7.f5399a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        i();
        for (Object next : map.keySet()) {
            Charset charset = m7.f5399a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    public c8(Map map) {
        super(map);
    }
}
