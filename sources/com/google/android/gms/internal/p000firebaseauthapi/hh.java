package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.hh  reason: invalid package */
public final class hh implements a6 {

    /* renamed from: a  reason: collision with root package name */
    public final yc f4624a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4625b;

    public hh(yc ycVar, int i8) {
        this.f4624a = ycVar;
        this.f4625b = i8;
        if (i8 >= 10) {
            ycVar.a(new byte[0], i8);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(this.f4624a.a(bArr2, this.f4625b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
