package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xb  reason: invalid package */
public final class xb extends qa {
    public xb() {
        super(cd.class);
    }

    public final o3 a(o3 o3Var) {
        cd cdVar = (cd) o3Var;
        zc u7 = ad.u();
        u7.j();
        ((ad) u7.f4729b).zzd = 0;
        byte[] a10 = jh.a(cdVar.t());
        p1 l10 = q1.l(a10, 0, a10.length);
        u7.j();
        ((ad) u7.f4729b).zze = l10;
        ed x10 = cdVar.x();
        u7.j();
        ad.B((ad) u7.f4729b, x10);
        return (ad) u7.h();
    }

    public final o3 b(q1 q1Var) {
        return cd.w(q1Var, c2.f4439b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        bd u7 = cd.u();
        u7.j();
        ((cd) u7.f4729b).zzd = 32;
        dd u10 = ed.u();
        u10.j();
        ((ed) u10.f4729b).zzd = 16;
        u7.j();
        ((cd) u7.f4729b).zze = (ed) u10.h();
        hashMap.put("AES_CMAC", new pa((cd) u7.h(), 1));
        bd u11 = cd.u();
        u11.j();
        ((cd) u11.f4729b).zzd = 32;
        dd u12 = ed.u();
        u12.j();
        ((ed) u12.f4729b).zzd = 16;
        u11.j();
        ((cd) u11.f4729b).zze = (ed) u12.h();
        hashMap.put("AES256_CMAC", new pa((cd) u11.h(), 1));
        bd u13 = cd.u();
        u13.j();
        ((cd) u13.f4729b).zzd = 32;
        dd u14 = ed.u();
        u14.j();
        ((ed) u14.f4729b).zzd = 16;
        u13.j();
        ((cd) u13.f4729b).zze = (ed) u14.h();
        hashMap.put("AES256_CMAC_RAW", new pa((cd) u13.h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final void d(o3 o3Var) {
        cd cdVar = (cd) o3Var;
        yb.h(cdVar.x());
        if (cdVar.t() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
