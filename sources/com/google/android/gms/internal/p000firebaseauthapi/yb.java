package com.google.android.gms.internal.p000firebaseauthapi;

import b7.a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yb  reason: invalid package */
public final class yb extends ra {

    /* renamed from: d  reason: collision with root package name */
    public static final db f5103d = new db(a.f3269c, wb.class);

    public yb() {
        super(ad.class, new a8(2, a6.class));
    }

    public static void h(ed edVar) {
        if (edVar.t() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (edVar.t() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final qa a() {
        return new xb();
    }

    public final int b() {
        return 2;
    }

    public final o3 c(q1 q1Var) {
        return ad.w(q1Var, c2.f4439b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final void e(o3 o3Var) {
        ad adVar = (ad) o3Var;
        kh.c(adVar.t());
        if (adVar.y().c() == 32) {
            h(adVar.x());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
