package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import b2.c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lh  reason: invalid package */
public final class lh {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4722a;

    public lh(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[i8];
        this.f4722a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public static lh a(byte[] bArr) {
        if (bArr != null) {
            return new lh(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lh)) {
            return false;
        }
        return Arrays.equals(((lh) obj).f4722a, this.f4722a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4722a);
    }

    public final String toString() {
        return c.a("Bytes(", z0.h(this.f4722a), ")");
    }
}
