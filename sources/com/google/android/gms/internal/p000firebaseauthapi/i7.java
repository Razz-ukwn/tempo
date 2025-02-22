package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import b3.x;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i7  reason: invalid package */
public final class i7 extends n6 {

    /* renamed from: c  reason: collision with root package name */
    public final int f4640c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4641d;

    /* renamed from: e  reason: collision with root package name */
    public final h7 f4642e;

    public /* synthetic */ i7(int i8, int i10, h7 h7Var) {
        this.f4640c = i8;
        this.f4641d = i10;
        this.f4642e = h7Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return i7Var.f4640c == this.f4640c && i7Var.f4641d == this.f4641d && i7Var.f4642e == this.f4642e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{i7.class, Integer.valueOf(this.f4640c), Integer.valueOf(this.f4641d), 16, this.f4642e});
    }

    public final String toString() {
        StringBuilder c3 = d.c("AesEax Parameters (variant: ", String.valueOf(this.f4642e), ", ");
        c3.append(this.f4641d);
        c3.append("-byte IV, 16-byte tag, and ");
        return x.b(c3, this.f4640c, "-byte key)");
    }
}
