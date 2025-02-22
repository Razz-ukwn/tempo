package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u6  reason: invalid package */
public final class u6 extends ra {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4984d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u6(int r6) {
        /*
            r5 = this;
            r5.f4984d = r6
            r0 = 0
            r1 = 1
            if (r6 == r1) goto L_0x004f
            r2 = 2
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.i5> r3 = com.google.android.gms.internal.p000firebaseauthapi.i5.class
            if (r6 == r2) goto L_0x0040
            r4 = 3
            if (r6 == r4) goto L_0x0031
            r2 = 4
            if (r6 == r2) goto L_0x0020
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r1]
            com.google.android.gms.internal.firebase-auth-api.s6 r1 = new com.google.android.gms.internal.firebase-auth-api.s6
            r1.<init>(r0, r3)
            r6[r0] = r1
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.gd> r0 = com.google.android.gms.internal.p000firebaseauthapi.gd.class
            r5.<init>(r0, r6)
            return
        L_0x0020:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r1]
            com.google.android.gms.internal.firebase-auth-api.a7 r1 = new com.google.android.gms.internal.firebase-auth-api.a7
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.l5> r3 = com.google.android.gms.internal.p000firebaseauthapi.l5.class
            r1.<init>(r2, r3)
            r6[r0] = r1
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.pf> r0 = com.google.android.gms.internal.p000firebaseauthapi.pf.class
            r5.<init>(r0, r6)
            return
        L_0x0031:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r1]
            com.google.android.gms.internal.firebase-auth-api.s6 r1 = new com.google.android.gms.internal.firebase-auth-api.s6
            r1.<init>(r2, r3)
            r6[r0] = r1
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.qg> r0 = com.google.android.gms.internal.p000firebaseauthapi.qg.class
            r5.<init>(r0, r6)
            return
        L_0x0040:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r1]
            com.google.android.gms.internal.firebase-auth-api.s6 r2 = new com.google.android.gms.internal.firebase-auth-api.s6
            r2.<init>(r1, r3)
            r6[r0] = r2
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.ae> r0 = com.google.android.gms.internal.p000firebaseauthapi.ae.class
            r5.<init>(r0, r6)
            return
        L_0x004f:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r1]
            com.google.android.gms.internal.firebase-auth-api.a7 r1 = new com.google.android.gms.internal.firebase-auth-api.a7
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.eh> r2 = com.google.android.gms.internal.p000firebaseauthapi.eh.class
            r1.<init>(r0, r2)
            r6[r0] = r1
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.kd> r0 = com.google.android.gms.internal.p000firebaseauthapi.kd.class
            r5.<init>(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.u6.<init>(int):void");
    }

    public static pa h(int i8, int i10, int i11) {
        ld u7 = md.u();
        nd u10 = od.u();
        u10.j();
        ((od) u10.f4729b).zzd = 16;
        u7.j();
        ((md) u7.f4729b).zzd = (od) u10.h();
        u7.j();
        ((md) u7.f4729b).zze = i8;
        cf u11 = df.u();
        ef u12 = ff.u();
        u12.j();
        ((ff) u12.f4729b).zzd = b3.b(5);
        u12.j();
        ((ff) u12.f4729b).zze = i10;
        u11.j();
        ((df) u11.f4729b).zzd = (ff) u12.h();
        u11.j();
        ((df) u11.f4729b).zze = 32;
        hd t2 = id.t();
        t2.j();
        ((id) t2.f4729b).zzd = (md) u7.h();
        t2.j();
        ((id) t2.f4729b).zze = (df) u11.h();
        return new pa((id) t2.h(), i11);
    }

    public static pa i(int i8, int i10) {
        be u7 = ce.u();
        u7.j();
        ((ce) u7.f4729b).zzd = i8;
        return new pa((ce) u7.h(), i10);
    }

    public final qa a() {
        switch (this.f4984d) {
            case 0:
                return new t6(id.class, 0);
            case 1:
                return new b7(this);
            case 2:
                return new t6(ce.class, 1);
            case 3:
                return new t6(rg.class, 2);
            default:
                throw new UnsupportedOperationException("Creating keys is not supported.");
        }
    }

    public final int b() {
        switch (this.f4984d) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public final o3 c(q1 q1Var) {
        switch (this.f4984d) {
            case 0:
                return gd.w(q1Var, c2.f4439b);
            case 1:
                return kd.x(q1Var, c2.f4439b);
            case 2:
                return ae.w(q1Var, c2.f4439b);
            case 3:
                return qg.w(q1Var, c2.f4439b);
            default:
                return pf.y(q1Var, c2.f4439b);
        }
    }

    public final String d() {
        switch (this.f4984d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
        }
    }

    public final void e(o3 o3Var) {
        switch (this.f4984d) {
            case 0:
                gd gdVar = (gd) o3Var;
                kh.c(gdVar.t());
                new u6(1);
                kd x10 = gdVar.x();
                kh.c(x10.t());
                kh.b(x10.z().c());
                od y10 = x10.y();
                if (y10.t() < 12 || y10.t() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                new jc();
                jc.h(gdVar.y());
                return;
            case 1:
                kd kdVar = (kd) o3Var;
                kh.c(kdVar.t());
                kh.b(kdVar.z().c());
                od y11 = kdVar.y();
                if (y11.t() < 12 || y11.t() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                return;
            case 2:
                ae aeVar = (ae) o3Var;
                kh.c(aeVar.t());
                kh.b(aeVar.x().c());
                return;
            case 3:
                qg qgVar = (qg) o3Var;
                kh.c(qgVar.t());
                if (qgVar.x().c() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                pf pfVar = (pf) o3Var;
                kh.c(pfVar.t());
                if (pfVar.D()) {
                    aa.a(pfVar.u());
                    return;
                }
                throw new GeneralSecurityException("Missing HPKE key params.");
        }
    }

    public final int f() {
        switch (this.f4984d) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }
}
