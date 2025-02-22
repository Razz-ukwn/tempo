package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kd  reason: invalid package */
public final class kd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final kd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private od zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        kd kdVar = new kd();
        zzb = kdVar;
        p2.g(kd.class, kdVar);
    }

    public static /* synthetic */ void B(kd kdVar, od odVar) {
        odVar.getClass();
        kdVar.zze = odVar;
    }

    public static jd u() {
        return (jd) zzb.o();
    }

    public static kd w() {
        return zzb;
    }

    public static kd x(q1 q1Var, c2 c2Var) {
        return (kd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new kd();
        } else {
            if (i10 == 4) {
                return new jd(0);
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

    public final od y() {
        od odVar = this.zze;
        return odVar == null ? od.w() : odVar;
    }

    public final q1 z() {
        return this.zzf;
    }
}
