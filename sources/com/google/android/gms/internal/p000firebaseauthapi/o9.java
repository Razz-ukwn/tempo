package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o9  reason: invalid package */
public final class o9 implements r9 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4777a;

    public o9(int i8) {
        if (i8 == 16 || i8 == 32) {
            this.f4777a = i8;
            return;
        }
        throw new InvalidAlgorithmParameterException(q.a("Unsupported key length: ", i8));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f4777a) {
            return new n8(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException(q.a("Unexpected key length: ", length));
    }

    public final int zza() {
        return this.f4777a;
    }

    public final byte[] zzb() {
        int i8 = this.f4777a;
        if (i8 == 16) {
            return aa.f4394i;
        }
        if (i8 == 32) {
            return aa.f4395j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
