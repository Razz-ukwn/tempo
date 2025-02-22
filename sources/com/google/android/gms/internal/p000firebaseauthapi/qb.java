package com.google.android.gms.internal.p000firebaseauthapi;

import h0.e;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qb  reason: invalid package */
public final class qb {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4844a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f4845b;

    public /* synthetic */ qb(Class cls, Class cls2) {
        this.f4844a = cls;
        this.f4845b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return qbVar.f4844a.equals(this.f4844a) && qbVar.f4845b.equals(this.f4845b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4844a, this.f4845b});
    }

    public final String toString() {
        return e.b(this.f4844a.getSimpleName(), " with serialization type: ", this.f4845b.getSimpleName());
    }
}
