package com.google.android.gms.internal.p000firebaseauthapi;

import ag.n2;
import ag.v1;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e9  reason: invalid package */
public final class e9 implements j5 {

    /* renamed from: a  reason: collision with root package name */
    public final e6 f4517a;

    public e9(e6 e6Var) {
        this.f4517a = e6Var;
        if (e6Var.b()) {
            vc a10 = va.f5017b.a();
            n2.f(e6Var);
            a10.zza();
            a10.zza();
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        e6 e6Var = this.f4517a;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (c6 c6Var : e6Var.a(copyOf)) {
                try {
                    byte[] a10 = ((j5) c6Var.f4445b).a(copyOfRange, bArr2);
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    f9.f4545a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (c6 c6Var2 : e6Var.a(v1.D)) {
            try {
                return ((j5) c6Var2.f4445b).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
