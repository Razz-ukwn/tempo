package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.z0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ah  reason: invalid package */
public final class ah implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public final eh f4405a;

    /* renamed from: b  reason: collision with root package name */
    public final a6 f4406b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4407c;

    public ah(eh ehVar, a6 a6Var, int i8) {
        this.f4405a = ehVar;
        this.f4406b = a6Var;
        this.f4407c = i8;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f4407c;
        if (length >= i8) {
            int i10 = length - i8;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.f4406b.a(Arrays.copyOfRange(bArr, i10, length), z0.l(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8)));
            return this.f4405a.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
