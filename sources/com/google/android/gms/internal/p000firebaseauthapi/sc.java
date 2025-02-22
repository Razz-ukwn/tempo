package com.google.android.gms.internal.p000firebaseauthapi;

import ag.n2;
import ag.v1;
import androidx.fragment.app.z0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sc  reason: invalid package */
public final class sc implements a6 {

    /* renamed from: a  reason: collision with root package name */
    public final e6 f4916a;

    public sc(e6 e6Var) {
        this.f4916a = e6Var;
        if (e6Var.b()) {
            vc a10 = va.f5017b.a();
            n2.f(e6Var);
            a10.zza();
            a10.zza();
        }
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            e6 e6Var = this.f4916a;
            for (c6 c6Var : e6Var.a(copyOf)) {
                if (c6Var.f4447d.equals(mg.LEGACY)) {
                    bArr3 = z0.l(bArr2, tc.f4954b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((a6) c6Var.f4445b).a(copyOfRange, bArr3);
                    return;
                } catch (GeneralSecurityException e10) {
                    tc.f4953a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (c6 c6Var2 : e6Var.a(v1.D)) {
                try {
                    ((a6) c6Var2.f4445b).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
