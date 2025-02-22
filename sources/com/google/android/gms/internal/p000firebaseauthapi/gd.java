package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gd  reason: invalid package */
public final class gd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final gd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public kd zze;
    private bf zzf;

    static {
        gd gdVar = new gd();
        zzb = gdVar;
        p2.g(gd.class, gdVar);
    }

    public static /* synthetic */ void B(gd gdVar, bf bfVar) {
        bfVar.getClass();
        gdVar.zzf = bfVar;
    }

    public static fd u() {
        return (fd) zzb.o();
    }

    public static gd w(q1 q1Var, c2 c2Var) {
        return (gd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new gd();
        } else {
            if (i10 == 4) {
                return new fd(0);
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

    public final kd x() {
        kd kdVar = this.zze;
        return kdVar == null ? kd.w() : kdVar;
    }

    public final bf y() {
        bf bfVar = this.zzf;
        return bfVar == null ? bf.w() : bfVar;
    }
}
