package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sd  reason: invalid package */
public final class sd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final sd zzb;
    /* access modifiers changed from: private */
    public ud zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        sd sdVar = new sd();
        zzb = sdVar;
        p2.g(sd.class, sdVar);
    }

    public static rd u() {
        return (rd) zzb.o();
    }

    public static sd w(q1 q1Var, c2 c2Var) {
        return (sd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new sd();
        } else {
            if (i10 == 4) {
                return new rd(0);
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

    public final ud x() {
        ud udVar = this.zzd;
        return udVar == null ? ud.w() : udVar;
    }
}
