package com.google.android.gms.internal.p000firebaseauthapi;

import h0.e;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ib  reason: invalid package */
public final class ib {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4651a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f4652b;

    public /* synthetic */ ib(Class cls, Class cls2) {
        this.f4651a = cls;
        this.f4652b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return ibVar.f4651a.equals(this.f4651a) && ibVar.f4652b.equals(this.f4652b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4651a, this.f4652b});
    }

    public final String toString() {
        return e.b(this.f4651a.getSimpleName(), " with primitive type: ", this.f4652b.getSimpleName());
    }
}
