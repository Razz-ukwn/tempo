package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bf  reason: invalid package */
public final class bf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final bf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private ff zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        bf bfVar = new bf();
        zzb = bfVar;
        p2.g(bf.class, bfVar);
    }

    public static /* synthetic */ void B(bf bfVar, ff ffVar) {
        ffVar.getClass();
        bfVar.zze = ffVar;
    }

    public static af u() {
        return (af) zzb.o();
    }

    public static bf w() {
        return zzb;
    }

    public static bf x(q1 q1Var, c2 c2Var) {
        return (bf) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new bf();
        } else {
            if (i10 == 4) {
                return new af(0);
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

    public final ff y() {
        ff ffVar = this.zze;
        return ffVar == null ? ff.w() : ffVar;
    }

    public final q1 z() {
        return this.zzf;
    }
}
