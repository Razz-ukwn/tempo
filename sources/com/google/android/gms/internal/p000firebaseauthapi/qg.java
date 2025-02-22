package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qg  reason: invalid package */
public final class qg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final qg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;

    static {
        qg qgVar = new qg();
        zzb = qgVar;
        p2.g(qg.class, qgVar);
    }

    public static pg u() {
        return (pg) zzb.o();
    }

    public static qg w(q1 q1Var, c2 c2Var) {
        return (qg) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new qg();
        } else {
            if (i10 == 4) {
                return new pg(0);
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

    public final q1 x() {
        return this.zze;
    }
}
