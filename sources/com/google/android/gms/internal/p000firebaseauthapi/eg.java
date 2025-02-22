package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.eg  reason: invalid package */
public final class eg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final eg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private t2 zze = x3.f5071d;

    static {
        eg egVar = new eg();
        zzb = egVar;
        p2.g(eg.class, egVar);
    }

    public static bg t() {
        return (bg) zzb.o();
    }

    public static void x(eg egVar, dg dgVar) {
        t2 t2Var = egVar.zze;
        if (!t2Var.zzc()) {
            int size = t2Var.size();
            egVar.zze = t2Var.zzd(size == 0 ? 10 : size + size);
        }
        egVar.zze.add(dgVar);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", dg.class});
        } else if (i10 == 3) {
            return new eg();
        } else {
            if (i10 == 4) {
                return new bg(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final dg u() {
        return (dg) this.zze.get(0);
    }
}
