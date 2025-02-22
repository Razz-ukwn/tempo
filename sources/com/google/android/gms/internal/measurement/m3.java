package com.google.android.gms.internal.measurement;

public final class m3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final m3 zza;
    private l7 zzd = q8.f5487d;

    static {
        m3 m3Var = new m3();
        zza = m3Var;
        g7.p(m3.class, m3Var);
    }

    public static l3 t() {
        return (l3) zza.i();
    }

    public static /* synthetic */ void x(m3 m3Var, o3 o3Var) {
        l7 l7Var = m3Var.zzd;
        if (!l7Var.zzc()) {
            m3Var.zzd = g7.m(l7Var);
        }
        m3Var.zzd.add(o3Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", o3.class});
        } else if (i10 == 3) {
            return new m3();
        } else {
            if (i10 == 4) {
                return new l3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final o3 v() {
        return (o3) this.zzd.get(0);
    }

    public final l7 w() {
        return this.zzd;
    }
}
