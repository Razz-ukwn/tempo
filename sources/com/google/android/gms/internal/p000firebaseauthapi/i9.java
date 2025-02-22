package com.google.android.gms.internal.p000firebaseauthapi;

import ag.n2;
import ag.v1;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i9  reason: invalid package */
public final class i9 implements k5 {

    /* renamed from: a  reason: collision with root package name */
    public final e6 f4647a;

    public i9(e6 e6Var) {
        this.f4647a = e6Var;
        if (e6Var.b()) {
            vc a10 = va.f5017b.a();
            n2.f(e6Var);
            a10.zza();
        }
    }

    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        e6 e6Var = this.f4647a;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (c6 c6Var : e6Var.a(copyOfRange)) {
                try {
                    byte[] zza = ((k5) c6Var.f4445b).zza(copyOfRange2);
                    int length2 = copyOfRange2.length;
                    return zza;
                } catch (GeneralSecurityException e10) {
                    j9.f4666a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (c6 c6Var2 : e6Var.a(v1.D)) {
            try {
                return ((k5) c6Var2.f4445b).zza(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
