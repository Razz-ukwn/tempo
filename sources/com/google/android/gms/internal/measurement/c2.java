package com.google.android.gms.internal.measurement;

public final class c2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final c2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private l7 zzg = q8.f5487d;
    private boolean zzh;
    private i2 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        c2 c2Var = new c2();
        zza = c2Var;
        g7.p(c2.class, c2Var);
    }

    public static /* synthetic */ void B(c2 c2Var, String str) {
        c2Var.zzd |= 2;
        c2Var.zzf = str;
    }

    public static /* synthetic */ void C(c2 c2Var, int i8, e2 e2Var) {
        l7 l7Var = c2Var.zzg;
        if (!l7Var.zzc()) {
            c2Var.zzg = g7.m(l7Var);
        }
        c2Var.zzg.set(i8, e2Var);
    }

    public static b2 v() {
        return (b2) zza.i();
    }

    public final l7 A() {
        return this.zzg;
    }

    public final boolean D() {
        return this.zzj;
    }

    public final boolean E() {
        return this.zzk;
    }

    public final boolean F() {
        return this.zzl;
    }

    public final boolean G() {
        return (this.zzd & 8) != 0;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
    }

    public final boolean I() {
        return (this.zzd & 64) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", e2.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i10 == 3) {
            return new c2();
        } else {
            if (i10 == 4) {
                return new b2(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzg.size();
    }

    public final int u() {
        return this.zze;
    }

    public final e2 x(int i8) {
        return (e2) this.zzg.get(i8);
    }

    public final i2 y() {
        i2 i2Var = this.zzi;
        return i2Var == null ? i2.u() : i2Var;
    }

    public final String z() {
        return this.zzf;
    }
}
