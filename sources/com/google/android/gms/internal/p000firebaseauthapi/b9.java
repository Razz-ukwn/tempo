package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b9  reason: invalid package */
public final class b9 extends n6 {

    /* renamed from: c  reason: collision with root package name */
    public final int f4424c;

    /* renamed from: d  reason: collision with root package name */
    public final a9 f4425d;

    public /* synthetic */ b9(int i8, a9 a9Var) {
        this.f4424c = i8;
        this.f4425d = a9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return b9Var.f4424c == this.f4424c && b9Var.f4425d == this.f4425d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b9.class, Integer.valueOf(this.f4424c), this.f4425d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4425d);
        return "AesSiv Parameters (variant: " + valueOf + ", " + this.f4424c + "-byte key)";
    }
}
