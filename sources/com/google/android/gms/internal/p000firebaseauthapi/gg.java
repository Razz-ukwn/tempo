package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gg  reason: invalid package */
public final class gg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final gg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private hg zze;

    static {
        gg ggVar = new gg();
        zzb = ggVar;
        p2.g(gg.class, ggVar);
    }

    public static fg u() {
        return (fg) zzb.o();
    }

    public static gg w(q1 q1Var, c2 c2Var) {
        return (gg) p2.r(zzb, q1Var, c2Var);
    }

    public static /* synthetic */ void z(gg ggVar, hg hgVar) {
        hgVar.getClass();
        ggVar.zze = hgVar;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new gg();
        } else {
            if (i10 == 4) {
                return new fg(0);
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

    public final hg x() {
        hg hgVar = this.zze;
        return hgVar == null ? hg.u() : hgVar;
    }
}
