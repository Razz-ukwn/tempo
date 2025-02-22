package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f8  reason: invalid package */
public final class f8 extends qa {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4544b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8(Class cls, int i8) {
        super(cls);
        this.f4544b = i8;
    }

    public final o3 a(o3 o3Var) {
        switch (this.f4544b) {
            case 0:
                ig u7 = jg.u();
                u7.j();
                jg.z((jg) u7.f4729b, (lg) o3Var);
                u7.j();
                ((jg) u7.f4729b).zzd = 0;
                return (jg) u7.h();
            default:
                df dfVar = (df) o3Var;
                af u10 = bf.u();
                u10.j();
                ((bf) u10.f4729b).zzd = 0;
                ff y10 = dfVar.y();
                u10.j();
                bf.B((bf) u10.f4729b, y10);
                byte[] a10 = jh.a(dfVar.t());
                p1 l10 = q1.l(a10, 0, a10.length);
                u10.j();
                ((bf) u10.f4729b).zzf = l10;
                return (bf) u10.h();
        }
    }

    public final o3 b(q1 q1Var) {
        switch (this.f4544b) {
            case 0:
                return lg.w(q1Var, c2.f4439b);
            default:
                return df.x(q1Var, c2.f4439b);
        }
    }

    public final Map c() {
        switch (this.f4544b) {
            case 1:
                HashMap hashMap = new HashMap();
                hashMap.put("HMAC_SHA256_128BITTAG", jc.i(32, 16, 5, 1));
                hashMap.put("HMAC_SHA256_128BITTAG_RAW", jc.i(32, 16, 5, 3));
                hashMap.put("HMAC_SHA256_256BITTAG", jc.i(32, 32, 5, 1));
                hashMap.put("HMAC_SHA256_256BITTAG_RAW", jc.i(32, 32, 5, 3));
                hashMap.put("HMAC_SHA512_128BITTAG", jc.i(64, 16, 6, 1));
                hashMap.put("HMAC_SHA512_128BITTAG_RAW", jc.i(64, 16, 6, 3));
                hashMap.put("HMAC_SHA512_256BITTAG", jc.i(64, 32, 6, 1));
                hashMap.put("HMAC_SHA512_256BITTAG_RAW", jc.i(64, 32, 6, 3));
                hashMap.put("HMAC_SHA512_512BITTAG", jc.i(64, 64, 6, 1));
                hashMap.put("HMAC_SHA512_512BITTAG_RAW", jc.i(64, 64, 6, 3));
                return Collections.unmodifiableMap(hashMap);
            default:
                return Collections.emptyMap();
        }
    }

    public final /* bridge */ /* synthetic */ void d(o3 o3Var) {
        switch (this.f4544b) {
            case 0:
                lg lgVar = (lg) o3Var;
                if (lgVar.x().isEmpty() || !lgVar.y()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            default:
                df dfVar = (df) o3Var;
                if (dfVar.t() >= 16) {
                    jc.j(dfVar.y());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }
}
