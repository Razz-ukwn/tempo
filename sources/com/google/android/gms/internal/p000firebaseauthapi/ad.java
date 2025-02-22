package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ad  reason: invalid package */
public final class ad extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ad zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;
    private ed zzf;

    static {
        ad adVar = new ad();
        zzb = adVar;
        p2.g(ad.class, adVar);
    }

    public static /* synthetic */ void B(ad adVar, ed edVar) {
        edVar.getClass();
        adVar.zzf = edVar;
    }

    public static zc u() {
        return (zc) zzb.o();
    }

    public static ad w(q1 q1Var, c2 c2Var) {
        return (ad) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new ad();
        } else {
            if (i10 == 4) {
                return new zc(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zzd;
    }

    public final ed x() {
        ed edVar = this.zzf;
        return edVar == null ? ed.w() : edVar;
    }

    public final q1 y() {
        return this.zze;
    }
}
