package com.google.android.gms.internal.measurement;

import b2.c;
import java.io.Serializable;
import java.util.Arrays;

public final class j5 implements Serializable, g5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5338a;

    public j5(Object obj) {
        this.f5338a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j5)) {
            return false;
        }
        Object obj2 = ((j5) obj).f5338a;
        Object obj3 = this.f5338a;
        return obj3 == obj2 || (obj3 != null && obj3.equals(obj2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5338a});
    }

    public final String toString() {
        return c.a("Suppliers.ofInstance(", this.f5338a.toString(), ")");
    }

    public final Object zza() {
        return this.f5338a;
    }
}
