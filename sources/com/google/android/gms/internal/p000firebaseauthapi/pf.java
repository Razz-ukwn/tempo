package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pf  reason: invalid package */
public final class pf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final pf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private lf zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        pf pfVar = new pf();
        zzb = pfVar;
        p2.g(pf.class, pfVar);
    }

    public static /* synthetic */ void B(pf pfVar, lf lfVar) {
        lfVar.getClass();
        pfVar.zze = lfVar;
    }

    public static of v() {
        return (of) zzb.o();
    }

    public static pf x() {
        return zzb;
    }

    public static pf y(q1 q1Var, c2 c2Var) {
        return (pf) p2.r(zzb, q1Var, c2Var);
    }

    public final boolean D() {
        return this.zze != null;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new pf();
        } else {
            if (i10 == 4) {
                return new of(0);
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

    public final lf u() {
        lf lfVar = this.zze;
        return lfVar == null ? lf.v() : lfVar;
    }

    public final q1 z() {
        return this.zzf;
    }
}
