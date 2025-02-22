package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d6  reason: invalid package */
public final class d6 implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4483a;

    public /* synthetic */ d6(byte[] bArr) {
        this.f4483a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d6 d6Var = (d6) obj;
        byte[] bArr = this.f4483a;
        int length = bArr.length;
        int length2 = d6Var.f4483a.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b10 = bArr[i8];
            byte b11 = d6Var.f4483a[i8];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d6)) {
            return false;
        }
        return Arrays.equals(this.f4483a, ((d6) obj).f4483a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4483a);
    }

    public final String toString() {
        return z0.h(this.f4483a);
    }
}
