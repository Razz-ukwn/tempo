package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n8  reason: invalid package */
public final class n8 {

    /* renamed from: c  reason: collision with root package name */
    public static final m8 f4755c = new m8(0);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f4756a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4757b;

    public n8(byte[] bArr, boolean z10) {
        if (m.y(2)) {
            kh.b(bArr.length);
            this.f4756a = new SecretKeySpec(bArr, "AES");
            this.f4757b = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i8 = 12;
        if (bArr.length == 12) {
            boolean z10 = this.f4757b;
            int i10 = true != z10 ? 16 : 28;
            int length = bArr2.length;
            if (length < i10) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                String property = System.getProperty("java.vendor");
                Integer valueOf = (property == "The Android Project" || (property != null && property.equals("The Android Project"))) ? Integer.valueOf(Build.VERSION.SDK_INT) : null;
                AlgorithmParameterSpec gCMParameterSpec = (valueOf == null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
                m8 m8Var = f4755c;
                ((Cipher) m8Var.get()).init(2, this.f4756a, gCMParameterSpec);
                if (true != z10) {
                    i8 = 0;
                }
                if (z10) {
                    length -= 12;
                }
                return ((Cipher) m8Var.get()).doFinal(bArr2, i8, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }
}
