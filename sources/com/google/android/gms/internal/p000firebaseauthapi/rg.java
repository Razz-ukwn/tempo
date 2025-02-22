package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rg  reason: invalid package */
public final class rg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final rg zzb;
    private int zzd;

    static {
        rg rgVar = new rg();
        zzb = rgVar;
        p2.g(rg.class, rgVar);
    }

    public static rg u() {
        return zzb;
    }

    public static rg v(q1 q1Var, c2 c2Var) {
        return (rg) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new rg();
        } else {
            if (i10 == 4) {
                return new ke((Object) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
