package com.google.android.gms.internal.measurement;

import java.util.List;

public final class t2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final t2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private l7 zzh;
    private l7 zzi;
    private l7 zzj;
    private String zzk;
    private boolean zzl;
    private l7 zzm;
    private l7 zzn;
    private String zzo;
    private String zzp;
    private String zzq;

    static {
        t2 t2Var = new t2();
        zza = t2Var;
        g7.p(t2.class, t2Var);
    }

    public t2() {
        q8 q8Var = q8.f5487d;
        this.zzh = q8Var;
        this.zzi = q8Var;
        this.zzj = q8Var;
        this.zzk = "";
        this.zzm = q8Var;
        this.zzn = q8Var;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
    }

    public static /* synthetic */ void I(t2 t2Var, int i8, r2 r2Var) {
        l7 l7Var = t2Var.zzi;
        if (!l7Var.zzc()) {
            t2Var.zzi = g7.m(l7Var);
        }
        t2Var.zzi.set(i8, r2Var);
    }

    public static void J(t2 t2Var) {
        t2Var.zzj = q8.f5487d;
    }

    public static s2 x() {
        return (s2) zza.i();
    }

    public static t2 z() {
        return zza;
    }

    public final String A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzq;
    }

    public final String C() {
        return this.zzp;
    }

    public final String D() {
        return this.zzo;
    }

    public final l7 E() {
        return this.zzj;
    }

    public final l7 F() {
        return this.zzn;
    }

    public final l7 G() {
        return this.zzm;
    }

    public final List H() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzl;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", w2.class, "zzi", r2.class, "zzj", a2.class, "zzk", "zzl", "zzm", b4.class, "zzn", p2.class, "zzo", "zzp", "zzq"});
        } else if (i10 == 3) {
            return new t2();
        } else {
            if (i10 == 4) {
                return new s2(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzm.size();
    }

    public final int u() {
        return this.zzi.size();
    }

    public final long v() {
        return this.zze;
    }

    public final r2 w(int i8) {
        return (r2) this.zzi.get(i8);
    }
}
