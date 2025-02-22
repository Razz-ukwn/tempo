package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qd  reason: invalid package */
public final class qd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final qd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private ud zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        qd qdVar = new qd();
        zzb = qdVar;
        p2.g(qd.class, qdVar);
    }

    public static /* synthetic */ void A(qd qdVar, ud udVar) {
        udVar.getClass();
        qdVar.zze = udVar;
    }

    public static pd u() {
        return (pd) zzb.o();
    }

    public static qd w(q1 q1Var, c2 c2Var) {
        return (qd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new qd();
        } else {
            if (i10 == 4) {
                return new pd(0);
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

    public final ud x() {
        ud udVar = this.zze;
        return udVar == null ? ud.w() : udVar;
    }

    public final q1 y() {
        return this.zzf;
    }
}
