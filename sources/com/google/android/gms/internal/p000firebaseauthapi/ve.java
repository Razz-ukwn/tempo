package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ve  reason: invalid package */
public final class ve extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ve zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private re zze;
    /* access modifiers changed from: private */
    public q1 zzf;
    /* access modifiers changed from: private */
    public q1 zzg;

    static {
        ve veVar = new ve();
        zzb = veVar;
        p2.g(ve.class, veVar);
    }

    public ve() {
        p1 p1Var = q1.f4830b;
        this.zzf = p1Var;
        this.zzg = p1Var;
    }

    public static /* synthetic */ void C(ve veVar, re reVar) {
        reVar.getClass();
        veVar.zze = reVar;
    }

    public static ue v() {
        return (ue) zzb.o();
    }

    public static ve x() {
        return zzb;
    }

    public static ve y(q1 q1Var, c2 c2Var) {
        return (ve) p2.r(zzb, q1Var, c2Var);
    }

    public final q1 A() {
        return this.zzg;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new ve();
        } else {
            if (i10 == 4) {
                return new ue(0);
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

    public final re u() {
        re reVar = this.zze;
        return reVar == null ? re.w() : reVar;
    }

    public final q1 z() {
        return this.zzf;
    }
}
