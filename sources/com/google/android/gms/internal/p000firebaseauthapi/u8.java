package com.google.android.gms.internal.p000firebaseauthapi;

import d7.d;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u8  reason: invalid package */
public final class u8 implements i5 {

    /* renamed from: b  reason: collision with root package name */
    public static final d f4989b = new d(1);

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f4990c;

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f4991a;

    static {
        boolean z10 = true;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f4990c = z10;
    }

    public u8(byte[] bArr) {
        kh.b(bArr.length);
        this.f4991a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        int length = bArr.length;
        if (length >= 28) {
            if (f4990c) {
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
            } else {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            d dVar = f4989b;
            ((Cipher) dVar.get()).init(2, this.f4991a, algorithmParameterSpec);
            return ((Cipher) dVar.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
