package com.google.android.recaptcha.internal;

import h0.e;
import java.util.Map;

final class zzjj implements Map.Entry, Comparable {
    final /* synthetic */ zzjp zza;
    private final Comparable zzb;
    private Object zzc;

    public zzjj(zzjp zzjp, Comparable comparable, Object obj) {
        this.zza = zzjp;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzjj) obj).zzb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        Comparable comparable = this.zzb;
        int i8 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return hashCode ^ i8;
    }

    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return e.b(String.valueOf(this.zzb), "=", String.valueOf(this.zzc));
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
