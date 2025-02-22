package com.google.android.gms.internal.p000firebaseauthapi;

import d.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y8  reason: invalid package */
public final class y8 extends qa {
    public y8() {
        super(he.class);
    }

    public final o3 a(o3 o3Var) {
        ee u7 = fe.u();
        byte[] a10 = jh.a(((he) o3Var).t());
        p1 l10 = q1.l(a10, 0, a10.length);
        u7.j();
        ((fe) u7.f4729b).zze = l10;
        u7.j();
        ((fe) u7.f4729b).zzd = 0;
        return (fe) u7.h();
    }

    public final o3 b(q1 q1Var) {
        return he.w(q1Var, c2.f4439b);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        ge u7 = he.u();
        u7.j();
        ((he) u7.f4729b).zzd = 64;
        hashMap.put("AES256_SIV", new pa((he) u7.h(), 1));
        ge u10 = he.u();
        u10.j();
        ((he) u10.f4729b).zzd = 64;
        hashMap.put("AES256_SIV_RAW", new pa((he) u10.h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void d(o3 o3Var) {
        he heVar = (he) o3Var;
        if (heVar.t() != 64) {
            throw new InvalidAlgorithmParameterException(a.a("invalid key size: ", heVar.t(), ". Valid keys must have 64 bytes."));
        }
    }
}
