package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f7  reason: invalid package */
public final class f7 extends ra {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4543d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f7(int r6) {
        /*
            r5 = this;
            r5.f4543d = r6
            r0 = 2
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.i5> r1 = com.google.android.gms.internal.p000firebaseauthapi.i5.class
            r2 = 0
            r3 = 1
            if (r6 == r3) goto L_0x003d
            r4 = 3
            if (r6 == r0) goto L_0x002e
            if (r6 == r4) goto L_0x001d
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r3]
            com.google.android.gms.internal.firebase-auth-api.a7 r0 = new com.google.android.gms.internal.firebase-auth-api.a7
            r0.<init>(r3, r1)
            r6[r2] = r0
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.qd> r0 = com.google.android.gms.internal.p000firebaseauthapi.qd.class
            r5.<init>(r0, r6)
            return
        L_0x001d:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r3]
            com.google.android.gms.internal.firebase-auth-api.e8 r0 = new com.google.android.gms.internal.firebase-auth-api.e8
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.l5> r1 = com.google.android.gms.internal.p000firebaseauthapi.l5.class
            r0.<init>(r3, r1)
            r6[r2] = r0
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.ve> r0 = com.google.android.gms.internal.p000firebaseauthapi.ve.class
            r5.<init>(r0, r6)
            return
        L_0x002e:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r3]
            com.google.android.gms.internal.firebase-auth-api.a7 r0 = new com.google.android.gms.internal.firebase-auth-api.a7
            r0.<init>(r4, r1)
            r6[r2] = r0
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.je> r0 = com.google.android.gms.internal.p000firebaseauthapi.je.class
            r5.<init>(r0, r6)
            return
        L_0x003d:
            com.google.android.gms.internal.firebase-auth-api.gb[] r6 = new com.google.android.gms.internal.p000firebaseauthapi.gb[r3]
            com.google.android.gms.internal.firebase-auth-api.a7 r3 = new com.google.android.gms.internal.firebase-auth-api.a7
            r3.<init>(r0, r1)
            r6[r2] = r3
            java.lang.Class<com.google.android.gms.internal.firebase-auth-api.wd> r0 = com.google.android.gms.internal.p000firebaseauthapi.wd.class
            r5.<init>(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.f7.<init>(int):void");
    }

    public static pa h(int i8, int i10) {
        rd u7 = sd.u();
        u7.j();
        ((sd) u7.f4729b).zze = i8;
        td u10 = ud.u();
        u10.j();
        ((ud) u10.f4729b).zzd = 16;
        u7.j();
        ((sd) u7.f4729b).zzd = (ud) u10.h();
        return new pa((sd) u7.h(), i10);
    }

    public static pa i(int i8, int i10) {
        xd u7 = yd.u();
        u7.j();
        ((yd) u7.f4729b).zzd = i8;
        return new pa((yd) u7.h(), i10);
    }

    public final qa a() {
        switch (this.f4543d) {
            case 0:
                return new e7(sd.class, 0);
            case 1:
                return new e7(yd.class, 1);
            case 2:
                return new e7(le.class, 2);
            default:
                throw new UnsupportedOperationException("Creating keys is not supported.");
        }
    }

    public final int b() {
        switch (this.f4543d) {
            case 0:
            case 1:
            case 2:
                return 2;
            default:
                return 4;
        }
    }

    public final o3 c(q1 q1Var) {
        switch (this.f4543d) {
            case 0:
                return qd.w(q1Var, c2.f4439b);
            case 1:
                return wd.w(q1Var, c2.f4439b);
            case 2:
                return je.w(q1Var, c2.f4439b);
            default:
                return ve.y(q1Var, c2.f4439b);
        }
    }

    public final String d() {
        switch (this.f4543d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
        }
    }

    public final /* bridge */ /* synthetic */ void e(o3 o3Var) {
        switch (this.f4543d) {
            case 0:
                qd qdVar = (qd) o3Var;
                kh.c(qdVar.t());
                kh.b(qdVar.y().c());
                if (qdVar.x().t() != 12 && qdVar.x().t() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 1:
                wd wdVar = (wd) o3Var;
                kh.c(wdVar.t());
                kh.b(wdVar.x().c());
                return;
            case 2:
                je jeVar = (je) o3Var;
                kh.c(jeVar.t());
                if (jeVar.x().c() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                ve veVar = (ve) o3Var;
                kh.c(veVar.t());
                m9.a(veVar.u());
                return;
        }
    }

    public final int f() {
        switch (this.f4543d) {
            case 1:
                return 2;
            default:
                return 1;
        }
    }
}
