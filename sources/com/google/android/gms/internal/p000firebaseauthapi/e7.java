package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e7  reason: invalid package */
public final class e7 extends qa {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4515b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(Class cls, int i8) {
        super(cls);
        this.f4515b = i8;
    }

    public final o3 a(o3 o3Var) {
        switch (this.f4515b) {
            case 0:
                sd sdVar = (sd) o3Var;
                pd u7 = qd.u();
                byte[] a10 = jh.a(sdVar.t());
                p1 l10 = q1.l(a10, 0, a10.length);
                u7.j();
                ((qd) u7.f4729b).zzf = l10;
                ud x10 = sdVar.x();
                u7.j();
                qd.A((qd) u7.f4729b, x10);
                u7.j();
                ((qd) u7.f4729b).zzd = 0;
                return (qd) u7.h();
            case 1:
                vd u10 = wd.u();
                byte[] a11 = jh.a(((yd) o3Var).t());
                p1 l11 = q1.l(a11, 0, a11.length);
                u10.j();
                ((wd) u10.f4729b).zze = l11;
                u10.j();
                ((wd) u10.f4729b).zzd = 0;
                return (wd) u10.h();
            default:
                le leVar = (le) o3Var;
                ie u11 = je.u();
                u11.j();
                ((je) u11.f4729b).zzd = 0;
                byte[] a12 = jh.a(32);
                p1 l12 = q1.l(a12, 0, a12.length);
                u11.j();
                ((je) u11.f4729b).zze = l12;
                return (je) u11.h();
        }
    }

    public final o3 b(q1 q1Var) {
        switch (this.f4515b) {
            case 0:
                return sd.w(q1Var, c2.f4439b);
            case 1:
                return yd.w(q1Var, c2.f4439b);
            default:
                return le.v(q1Var, c2.f4439b);
        }
    }

    public final Map c() {
        switch (this.f4515b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_EAX", f7.h(16, 1));
                hashMap.put("AES128_EAX_RAW", f7.h(16, 3));
                hashMap.put("AES256_EAX", f7.h(32, 1));
                hashMap.put("AES256_EAX_RAW", f7.h(32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", f7.i(16, 1));
                hashMap2.put("AES128_GCM_RAW", f7.i(16, 3));
                hashMap2.put("AES256_GCM", f7.i(32, 1));
                hashMap2.put("AES256_GCM_RAW", f7.i(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            default:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("CHACHA20_POLY1305", new pa(le.u(), 1));
                hashMap3.put("CHACHA20_POLY1305_RAW", new pa(le.u(), 3));
                return Collections.unmodifiableMap(hashMap3);
        }
    }

    public final /* synthetic */ void d(o3 o3Var) {
        switch (this.f4515b) {
            case 0:
                sd sdVar = (sd) o3Var;
                kh.b(sdVar.t());
                if (sdVar.x().t() != 12 && sdVar.x().t() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 1:
                kh.b(((yd) o3Var).t());
                return;
            default:
                le leVar = (le) o3Var;
                return;
        }
    }
}
