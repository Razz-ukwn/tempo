package com.google.android.gms.internal.measurement;

import java.util.List;

public final class v3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final v3 zza;
    private int zzd;
    private int zze;
    private k7 zzf = w7.f5570d;

    static {
        v3 v3Var = new v3();
        zza = v3Var;
        g7.p(v3.class, v3Var);
    }

    public static void A(v3 v3Var, List list) {
        k7 k7Var = v3Var.zzf;
        if (!((a6) k7Var).f5147a) {
            v3Var.zzf = g7.l(k7Var);
        }
        z5.d(list, v3Var.zzf);
    }

    public static u3 w() {
        return (u3) zza.i();
    }

    public static /* synthetic */ void z(v3 v3Var, int i8) {
        v3Var.zzd |= 1;
        v3Var.zze = i8;
    }

    public final boolean B() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new v3();
        } else {
            if (i10 == 4) {
                return new u3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzf.size();
    }

    public final int u() {
        return this.zze;
    }

    public final long v(int i8) {
        w7 w7Var = (w7) this.zzf;
        w7Var.c(i8);
        return w7Var.f5571b[i8];
    }

    public final List y() {
        return this.zzf;
    }
}
