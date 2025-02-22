package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lg  reason: invalid package */
public final class lg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final lg zzb;
    private String zzd = "";
    private tf zze;

    static {
        lg lgVar = new lg();
        zzb = lgVar;
        p2.g(lg.class, lgVar);
    }

    public static lg v() {
        return zzb;
    }

    public static lg w(q1 q1Var, c2 c2Var) {
        return (lg) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new lg();
        } else {
            if (i10 == 4) {
                return new kg();
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final tf t() {
        tf tfVar = this.zze;
        return tfVar == null ? tf.v() : tfVar;
    }

    public final String x() {
        return this.zzd;
    }

    public final boolean y() {
        return this.zze != null;
    }
}
