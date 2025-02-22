package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fe  reason: invalid package */
public final class fe extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final fe zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;

    static {
        fe feVar = new fe();
        zzb = feVar;
        p2.g(fe.class, feVar);
    }

    public static ee u() {
        return (ee) zzb.o();
    }

    public static fe w(q1 q1Var, c2 c2Var) {
        return (fe) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new fe();
        } else {
            if (i10 == 4) {
                return new ee(0);
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
