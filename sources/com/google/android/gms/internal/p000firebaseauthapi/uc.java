package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.lifecycle.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uc  reason: invalid package */
public final class uc {

    /* renamed from: b  reason: collision with root package name */
    public static final uc f4995b;

    /* renamed from: a  reason: collision with root package name */
    public final Map f4996a;

    static {
        u uVar = new u(5);
        HashMap hashMap = (HashMap) uVar.f2324b;
        if (hashMap != null) {
            uc ucVar = new uc(Collections.unmodifiableMap(hashMap));
            uVar.f2324b = null;
            f4995b = ucVar;
            return;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    public /* synthetic */ uc(Map map) {
        this.f4996a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uc)) {
            return false;
        }
        return this.f4996a.equals(((uc) obj).f4996a);
    }

    public final int hashCode() {
        return this.f4996a.hashCode();
    }

    public final String toString() {
        return this.f4996a.toString();
    }
}
