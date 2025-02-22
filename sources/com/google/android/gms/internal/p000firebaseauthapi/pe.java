package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pe  reason: invalid package */
public final class pe extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final pe zzb;
    /* access modifiers changed from: private */
    public re zzd;

    static {
        pe peVar = new pe();
        zzb = peVar;
        p2.g(pe.class, peVar);
    }

    public static oe t() {
        return (oe) zzb.o();
    }

    public static pe v(q1 q1Var, c2 c2Var) {
        return (pe) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new pe();
        } else {
            if (i10 == 4) {
                return new oe(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final re w() {
        re reVar = this.zzd;
        return reVar == null ? re.w() : reVar;
    }
}
