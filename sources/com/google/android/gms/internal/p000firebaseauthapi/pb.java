package com.google.android.gms.internal.p000firebaseauthapi;

import h0.e;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pb  reason: invalid package */
public final class pb {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4817a;

    /* renamed from: b  reason: collision with root package name */
    public final lh f4818b;

    public /* synthetic */ pb(Class cls, lh lhVar) {
        this.f4817a = cls;
        this.f4818b = lhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return pbVar.f4817a.equals(this.f4817a) && pbVar.f4818b.equals(this.f4818b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4817a, this.f4818b});
    }

    public final String toString() {
        return e.b(this.f4817a.getSimpleName(), ", object identifier: ", String.valueOf(this.f4818b));
    }
}
