package com.google.android.gms.internal.measurement;

public final class d3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final d3 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        d3 d3Var = new d3();
        zza = d3Var;
        g7.p(d3.class, d3Var);
    }

    public static c3 v() {
        return (c3) zza.i();
    }

    public static /* synthetic */ void x(d3 d3Var, int i8) {
        d3Var.zzd |= 1;
        d3Var.zze = i8;
    }

    public static /* synthetic */ void y(d3 d3Var, long j10) {
        d3Var.zzd |= 2;
        d3Var.zzf = j10;
    }

    public final boolean A() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new d3();
        } else {
            if (i10 == 4) {
                return new c3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zze;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzd & 2) != 0;
    }
}
