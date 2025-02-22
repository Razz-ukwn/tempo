package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import b3.x;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bc  reason: invalid package */
public final class bc extends rc {

    /* renamed from: c  reason: collision with root package name */
    public final int f4430c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4431d;

    /* renamed from: e  reason: collision with root package name */
    public final ac f4432e;

    public /* synthetic */ bc(int i8, int i10, ac acVar) {
        this.f4430c = i8;
        this.f4431d = i10;
        this.f4432e = acVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return bcVar.f4430c == this.f4430c && bcVar.h() == h() && bcVar.f4432e == this.f4432e;
    }

    public final int h() {
        ac acVar = ac.f4403e;
        int i8 = this.f4431d;
        ac acVar2 = this.f4432e;
        if (acVar2 == acVar) {
            return i8;
        }
        if (acVar2 == ac.f4400b) {
            return i8 + 5;
        }
        if (acVar2 == ac.f4401c) {
            return i8 + 5;
        }
        if (acVar2 == ac.f4402d) {
            return i8 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{bc.class, Integer.valueOf(this.f4430c), Integer.valueOf(this.f4431d), this.f4432e});
    }

    public final String toString() {
        StringBuilder c3 = d.c("AES-CMAC Parameters (variant: ", String.valueOf(this.f4432e), ", ");
        c3.append(this.f4431d);
        c3.append("-byte tags, and ");
        return x.b(c3, this.f4430c, "-byte key)");
    }
}
