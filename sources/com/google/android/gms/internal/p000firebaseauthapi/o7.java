package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o7  reason: invalid package */
public final class o7 extends n6 {

    /* renamed from: c  reason: collision with root package name */
    public final int f4775c;

    /* renamed from: d  reason: collision with root package name */
    public final n7 f4776d;

    public /* synthetic */ o7(int i8, n7 n7Var) {
        this.f4775c = i8;
        this.f4776d = n7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return o7Var.f4775c == this.f4775c && o7Var.f4776d == this.f4776d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{o7.class, Integer.valueOf(this.f4775c), 12, 16, this.f4776d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4776d);
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + this.f4775c + "-byte key)";
    }
}
