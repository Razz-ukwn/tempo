package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yd  reason: invalid package */
public final class yd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final yd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        yd ydVar = new yd();
        zzb = ydVar;
        p2.g(yd.class, ydVar);
    }

    public static xd u() {
        return (xd) zzb.o();
    }

    public static yd w(q1 q1Var, c2 c2Var) {
        return (yd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new yd();
        } else {
            if (i10 == 4) {
                return new xd(0);
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
}
