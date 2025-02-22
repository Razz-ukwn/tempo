package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wd  reason: invalid package */
public final class wd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final wd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;

    static {
        wd wdVar = new wd();
        zzb = wdVar;
        p2.g(wd.class, wdVar);
    }

    public static vd u() {
        return (vd) zzb.o();
    }

    public static wd w(q1 q1Var, c2 c2Var) {
        return (wd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new wd();
        } else {
            if (i10 == 4) {
                return new vd(0);
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
