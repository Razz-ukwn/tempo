package com.google.android.gms.internal.p000firebaseauthapi;

import b3.x;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y6  reason: invalid package */
public final class y6 extends n6 {
    public final x6 B;
    public final w6 C;

    /* renamed from: c  reason: collision with root package name */
    public final int f5100c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5101d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5102e;

    public /* synthetic */ y6(int i8, int i10, int i11, x6 x6Var, w6 w6Var) {
        this.f5100c = i8;
        this.f5101d = i10;
        this.f5102e = i11;
        this.B = x6Var;
        this.C = w6Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return y6Var.f5100c == this.f5100c && y6Var.f5101d == this.f5101d && y6Var.h() == h() && y6Var.B == this.B && y6Var.C == this.C;
    }

    public final int h() {
        x6 x6Var = x6.f5077d;
        int i8 = this.f5102e;
        x6 x6Var2 = this.B;
        if (x6Var2 == x6Var) {
            return i8 + 16;
        }
        if (x6Var2 == x6.f5075b || x6Var2 == x6.f5076c) {
            return i8 + 21;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{y6.class, Integer.valueOf(this.f5100c), Integer.valueOf(this.f5101d), Integer.valueOf(this.f5102e), this.B, this.C});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.B);
        String valueOf2 = String.valueOf(this.C);
        StringBuilder sb2 = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", hashType: ");
        sb2.append(valueOf2);
        sb2.append(", ");
        sb2.append(this.f5102e);
        sb2.append("-byte tags, and ");
        sb2.append(this.f5100c);
        sb2.append("-byte AES key, and ");
        return x.b(sb2, this.f5101d, "-byte HMAC key)");
    }
}
