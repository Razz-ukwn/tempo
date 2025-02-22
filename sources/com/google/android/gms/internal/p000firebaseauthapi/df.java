package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.df  reason: invalid package */
public final class df extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final df zzb;
    /* access modifiers changed from: private */
    public ff zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        df dfVar = new df();
        zzb = dfVar;
        p2.g(df.class, dfVar);
    }

    public static cf u() {
        return (cf) zzb.o();
    }

    public static df w() {
        return zzb;
    }

    public static df x(q1 q1Var, c2 c2Var) {
        return (df) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new df();
        } else {
            if (i10 == 4) {
                return new cf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zze;
    }

    public final ff y() {
        ff ffVar = this.zzd;
        return ffVar == null ? ff.w() : ffVar;
    }
}
