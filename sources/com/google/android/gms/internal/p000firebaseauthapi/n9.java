package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n9  reason: invalid package */
public final class n9 implements xg {

    /* renamed from: a  reason: collision with root package name */
    public final String f4758a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4759b;

    /* renamed from: c  reason: collision with root package name */
    public final wd f4760c;

    /* renamed from: d  reason: collision with root package name */
    public final gd f4761d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4762e;

    /* renamed from: f  reason: collision with root package name */
    public final fe f4763f;

    public n9(tf tfVar) {
        String y10 = tfVar.y();
        this.f4758a = y10;
        if (y10.equals(k6.f4682b)) {
            try {
                yd w10 = yd.w(tfVar.x(), c2.f4439b);
                this.f4760c = (wd) i6.c(tfVar);
                this.f4759b = w10.t();
            } catch (w2 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (y10.equals(k6.f4681a)) {
            try {
                id v3 = id.v(tfVar.x(), c2.f4439b);
                this.f4761d = (gd) i6.c(tfVar);
                int t2 = v3.w().t();
                this.f4762e = t2;
                this.f4759b = t2 + v3.x().t();
            } catch (w2 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (y10.equals(d9.f4487a)) {
            try {
                he w11 = he.w(tfVar.x(), c2.f4439b);
                this.f4763f = (fe) i6.c(tfVar);
                this.f4759b = w11.t();
            } catch (w2 e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(y10)));
        }
    }
}
