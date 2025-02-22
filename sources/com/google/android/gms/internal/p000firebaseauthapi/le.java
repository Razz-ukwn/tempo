package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.le  reason: invalid package */
public final class le extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final le zzb;

    static {
        le leVar = new le();
        zzb = leVar;
        p2.g(le.class, leVar);
    }

    public static le u() {
        return zzb;
    }

    public static le v(q1 q1Var, c2 c2Var) {
        return (le) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i10 == 3) {
            return new le();
        }
        if (i10 == 4) {
            return new ke();
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
