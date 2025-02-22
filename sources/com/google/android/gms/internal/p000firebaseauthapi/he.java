package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.he  reason: invalid package */
public final class he extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final he zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        he heVar = new he();
        zzb = heVar;
        p2.g(he.class, heVar);
    }

    public static ge u() {
        return (ge) zzb.o();
    }

    public static he w(q1 q1Var, c2 c2Var) {
        return (he) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new he();
        } else {
            if (i10 == 4) {
                return new ge(0);
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
