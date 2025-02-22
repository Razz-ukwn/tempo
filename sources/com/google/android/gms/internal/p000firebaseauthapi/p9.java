package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p9  reason: invalid package */
public final class p9 implements r9 {
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new q8(bArr).b(ByteBuffer.wrap(bArr3), bArr2, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    public final int zza() {
        return 32;
    }

    public final byte[] zzb() {
        return aa.f4396k;
    }
}
