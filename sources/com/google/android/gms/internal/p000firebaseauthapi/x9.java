package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.appcompat.widget.l;
import androidx.fragment.app.z0;
import f3.v;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x9  reason: invalid package */
public final class x9 extends gb {
    public x9() {
        super(k5.class);
    }

    public final Object a(o3 o3Var) {
        int i8;
        v vVar;
        nf nfVar = (nf) o3Var;
        if (!nfVar.C()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (nfVar.x().D()) {
            if (!(nfVar.y().c() == 0)) {
                lf u7 = nfVar.x().u();
                u9 h3 = g.h(u7);
                q9 i10 = g.i(u7);
                r9 g10 = g.g(u7);
                int y10 = u7.y();
                int i11 = y10 - 2;
                int i12 = 2;
                if (i11 == 1) {
                    i8 = 32;
                } else if (i11 == 2) {
                    i8 = 65;
                } else if (i11 == 3) {
                    i8 = 97;
                } else if (i11 == 4) {
                    i8 = 133;
                } else {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(gf.n(y10)));
                }
                int y11 = nfVar.x().u().y() - 2;
                if (y11 == 1) {
                    byte[] m = nfVar.y().m();
                    if (m.length == 32) {
                        byte[] bArr = new byte[32];
                        bArr[0] = 9;
                        vVar = new l(m, z0.k(m, bArr));
                    } else {
                        throw new InvalidKeyException("Private key must have 32 bytes.");
                    }
                } else if (y11 == 2 || y11 == 3 || y11 == 4) {
                    byte[] m10 = nfVar.y().m();
                    byte[] m11 = nfVar.x().z().m();
                    int y12 = nfVar.x().u().y();
                    byte[] bArr2 = aa.f4386a;
                    int i13 = y12 - 2;
                    if (i13 == 2) {
                        i12 = 1;
                    } else if (i13 != 3) {
                        if (i13 == 4) {
                            i12 = 3;
                        } else {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                    }
                    ECPublicKey f10 = zg.f(zg.g(i12), 1, m11);
                    ECPrivateKey e10 = zg.e(m10, i12);
                    zg.c(e10, f10);
                    ia.b(f10.getW(), e10.getParams().getCurve());
                    vVar = new v(m10, m11);
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new t9(vVar, h3, i10, g10, i8);
            }
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
    }
}
