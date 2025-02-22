package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t7  reason: invalid package */
public final class t7 extends n6 {

    /* renamed from: c  reason: collision with root package name */
    public final int f4944c;

    /* renamed from: d  reason: collision with root package name */
    public final s7 f4945d;

    public /* synthetic */ t7(int i8, s7 s7Var) {
        this.f4944c = i8;
        this.f4945d = s7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return t7Var.f4944c == this.f4944c && t7Var.f4945d == this.f4945d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{t7.class, Integer.valueOf(this.f4944c), this.f4945d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4945d);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.f4944c + "-byte key)";
    }
}
