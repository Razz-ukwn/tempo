package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.md  reason: invalid package */
public final class md extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final md zzb;
    /* access modifiers changed from: private */
    public od zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        md mdVar = new md();
        zzb = mdVar;
        p2.g(md.class, mdVar);
    }

    public static ld u() {
        return (ld) zzb.o();
    }

    public static md w() {
        return zzb;
    }

    public static md x(q1 q1Var, c2 c2Var) {
        return (md) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new md();
        } else {
            if (i10 == 4) {
                return new ld(0);
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

    public final od y() {
        od odVar = this.zzd;
        return odVar == null ? od.w() : odVar;
    }
}
