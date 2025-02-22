package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f5160a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5161b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5162c;

    public b(String str, long j10, HashMap hashMap) {
        this.f5160a = str;
        this.f5161b = j10;
        HashMap hashMap2 = new HashMap();
        this.f5162c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.f5160a, this.f5161b, new HashMap(this.f5162c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f5161b == bVar.f5161b && this.f5160a.equals(bVar.f5160a)) {
            return this.f5162c.equals(bVar.f5162c);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5161b;
        return (((this.f5160a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f5162c.hashCode();
    }

    public final String toString() {
        String str = this.f5160a;
        String obj = this.f5162c.toString();
        StringBuilder c3 = d.c("Event{name='", str, "', timestamp=");
        c3.append(this.f5161b);
        c3.append(", params=");
        c3.append(obj);
        c3.append("}");
        return c3.toString();
    }
}
