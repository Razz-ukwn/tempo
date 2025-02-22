package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.te  reason: invalid package */
public final class te extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final te zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public ve zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        te teVar = new te();
        zzb = teVar;
        p2.g(te.class, teVar);
    }

    public static se u() {
        return (se) zzb.o();
    }

    public static te w(q1 q1Var, c2 c2Var) {
        return (te) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new te();
        } else {
            if (i10 == 4) {
                return new se(0);
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

    public final ve x() {
        ve veVar = this.zze;
        return veVar == null ? ve.x() : veVar;
    }

    public final q1 y() {
        return this.zzf;
    }
}
