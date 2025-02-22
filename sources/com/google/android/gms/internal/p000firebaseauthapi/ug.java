package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ug  reason: invalid package */
public final class ug implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public final n8 f4997a;

    public ug(byte[] bArr) {
        if (m.y(2)) {
            this.f4997a = new n8(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f4997a.a(Arrays.copyOf(bArr, 12), bArr);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
