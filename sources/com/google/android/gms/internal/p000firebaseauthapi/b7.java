package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b7  reason: invalid package */
public final class b7 extends qa {
    public b7(u6 u6Var) {
        super(md.class);
    }

    public static final kd e(md mdVar) {
        jd u7 = kd.u();
        od y10 = mdVar.y();
        u7.j();
        kd.B((kd) u7.f4729b, y10);
        byte[] a10 = jh.a(mdVar.t());
        p1 l10 = q1.l(a10, 0, a10.length);
        u7.j();
        ((kd) u7.f4729b).zzf = l10;
        u7.j();
        ((kd) u7.f4729b).zzd = 0;
        return (kd) u7.h();
    }

    public final /* bridge */ /* synthetic */ o3 a(o3 o3Var) {
        return e((md) o3Var);
    }

    public final o3 b(q1 q1Var) {
        return md.x(q1Var, c2.f4439b);
    }

    public final void d(o3 o3Var) {
        md mdVar = (md) o3Var;
        kh.b(mdVar.t());
        od y10 = mdVar.y();
        if (y10.t() < 12 || y10.t() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
