package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mc  reason: invalid package */
public final class mc extends rc {
    public final kc B;

    /* renamed from: c  reason: collision with root package name */
    public final int f4739c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4740d;

    /* renamed from: e  reason: collision with root package name */
    public final lc f4741e;

    public /* synthetic */ mc(int i8, int i10, lc lcVar, kc kcVar) {
        this.f4739c = i8;
        this.f4740d = i10;
        this.f4741e = lcVar;
        this.B = kcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        return mcVar.f4739c == this.f4739c && mcVar.h() == h() && mcVar.f4741e == this.f4741e && mcVar.B == this.B;
    }

    public final int h() {
        lc lcVar = lc.f4720e;
        int i8 = this.f4740d;
        lc lcVar2 = this.f4741e;
        if (lcVar2 == lcVar) {
            return i8;
        }
        if (lcVar2 == lc.f4717b) {
            return i8 + 5;
        }
        if (lcVar2 == lc.f4718c) {
            return i8 + 5;
        }
        if (lcVar2 == lc.f4719d) {
            return i8 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mc.class, Integer.valueOf(this.f4739c), Integer.valueOf(this.f4740d), this.f4741e, this.B});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4741e);
        String valueOf2 = String.valueOf(this.B);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.f4740d + "-byte tags, and " + this.f4739c + "-byte key)";
    }
}
