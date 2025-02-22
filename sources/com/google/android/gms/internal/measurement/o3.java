package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public final class o3 extends g7 implements i8 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final o3 zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    private l7 zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private r3 zzS;
    private j7 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private String zzaa;
    private boolean zzab;
    private k3 zzac;
    private String zzad;
    private l7 zzae;
    private String zzaf;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private l7 zzh;
    private l7 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        o3 o3Var = new o3();
        zzd = o3Var;
        g7.p(o3.class, o3Var);
    }

    public o3() {
        q8 q8Var = q8.f5487d;
        this.zzh = q8Var;
        this.zzi = q8Var;
        this.zzG = q8Var;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = h7.f5308d;
        this.zzW = "";
        this.zzX = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = q8Var;
        this.zzaf = "";
    }

    public static /* synthetic */ void A0(o3 o3Var, int i8) {
        o3Var.T0();
        o3Var.zzh.remove(i8);
    }

    public static /* synthetic */ void B0(o3 o3Var, int i8, x3 x3Var) {
        o3Var.U0();
        o3Var.zzi.set(i8, x3Var);
    }

    public static /* synthetic */ void C0(o3 o3Var, x3 x3Var) {
        o3Var.U0();
        o3Var.zzi.add(x3Var);
    }

    public static /* synthetic */ void D0(o3 o3Var, int i8) {
        o3Var.U0();
        o3Var.zzi.remove(i8);
    }

    public static /* synthetic */ void E0(o3 o3Var, long j10) {
        o3Var.zze |= 2;
        o3Var.zzj = j10;
    }

    public static /* synthetic */ void F0(o3 o3Var, long j10) {
        o3Var.zze |= 4;
        o3Var.zzk = j10;
    }

    public static /* synthetic */ void G0(o3 o3Var, long j10) {
        o3Var.zze |= 8;
        o3Var.zzl = j10;
    }

    public static n3 G1() {
        return (n3) zzd.i();
    }

    public static /* synthetic */ void H0(o3 o3Var, long j10) {
        o3Var.zze |= 16;
        o3Var.zzm = j10;
    }

    public static /* synthetic */ void I0(o3 o3Var) {
        o3Var.zze &= -17;
        o3Var.zzm = 0;
    }

    public static /* synthetic */ void J(o3 o3Var) {
        o3Var.zze &= Integer.MAX_VALUE;
        o3Var.zzO = zzd.zzO;
    }

    public static /* synthetic */ void J0(o3 o3Var, long j10) {
        o3Var.zze |= 32;
        o3Var.zzn = j10;
    }

    public static /* synthetic */ void K(o3 o3Var, int i8) {
        o3Var.zzf |= 2;
        o3Var.zzQ = i8;
    }

    public static /* synthetic */ void K0(o3 o3Var) {
        o3Var.zze &= -33;
        o3Var.zzn = 0;
    }

    public static /* synthetic */ void L(o3 o3Var, int i8, f3 f3Var) {
        o3Var.T0();
        o3Var.zzh.set(i8, f3Var);
    }

    public static /* synthetic */ void L0(o3 o3Var) {
        o3Var.zze |= 64;
        o3Var.zzo = "android";
    }

    public static /* synthetic */ void M(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzf |= 4;
        o3Var.zzR = str;
    }

    public static /* synthetic */ void M0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 128;
        o3Var.zzp = str;
    }

    public static void N(o3 o3Var, ArrayList arrayList) {
        j7 j7Var = o3Var.zzT;
        if (!((a6) j7Var).f5147a) {
            int size = j7Var.size();
            int i8 = size == 0 ? 10 : size + size;
            h7 h7Var = (h7) j7Var;
            if (i8 >= h7Var.f5310c) {
                o3Var.zzT = new h7(Arrays.copyOf(h7Var.f5309b, i8), h7Var.f5310c, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        z5.d(arrayList, o3Var.zzT);
    }

    public static /* synthetic */ void N0(o3 o3Var) {
        o3Var.zze &= -129;
        o3Var.zzp = zzd.zzp;
    }

    public static /* synthetic */ void O(o3 o3Var, f3 f3Var) {
        o3Var.T0();
        o3Var.zzh.add(f3Var);
    }

    public static /* synthetic */ void O0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 256;
        o3Var.zzq = str;
    }

    public static /* synthetic */ void P(o3 o3Var, long j10) {
        o3Var.zzf |= 16;
        o3Var.zzU = j10;
    }

    public static /* synthetic */ void P0(o3 o3Var) {
        o3Var.zze &= -257;
        o3Var.zzq = zzd.zzq;
    }

    public static /* synthetic */ void Q(o3 o3Var, long j10) {
        o3Var.zzf |= 32;
        o3Var.zzV = j10;
    }

    public static /* synthetic */ void Q0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 512;
        o3Var.zzr = str;
    }

    public static /* synthetic */ void R(o3 o3Var, String str) {
        o3Var.zzf |= 128;
        o3Var.zzX = str;
    }

    public static /* synthetic */ void R0(o3 o3Var, int i8) {
        o3Var.zze |= 1024;
        o3Var.zzs = i8;
    }

    public static /* synthetic */ void T(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 2048;
        o3Var.zzt = str;
    }

    public static /* synthetic */ void U(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 4096;
        o3Var.zzu = str;
    }

    public static /* synthetic */ void V(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 8192;
        o3Var.zzv = str;
    }

    public static /* synthetic */ void W(o3 o3Var, long j10) {
        o3Var.zze |= 16384;
        o3Var.zzw = j10;
    }

    public static /* synthetic */ void X(o3 o3Var) {
        o3Var.zze |= 32768;
        o3Var.zzx = 77000;
    }

    public static /* synthetic */ void Y(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 65536;
        o3Var.zzy = str;
    }

    public static /* synthetic */ void Z(o3 o3Var) {
        o3Var.zze &= -65537;
        o3Var.zzy = zzd.zzy;
    }

    public static /* synthetic */ void a0(o3 o3Var, boolean z10) {
        o3Var.zze |= 131072;
        o3Var.zzz = z10;
    }

    public static /* synthetic */ void b0(o3 o3Var) {
        o3Var.zze &= -131073;
        o3Var.zzz = false;
    }

    public static /* synthetic */ void c0(o3 o3Var, String str) {
        o3Var.zze |= 262144;
        o3Var.zzA = str;
    }

    public static /* synthetic */ void d0(o3 o3Var) {
        o3Var.zze &= -262145;
        o3Var.zzA = zzd.zzA;
    }

    public static /* synthetic */ void e0(o3 o3Var, long j10) {
        o3Var.zze |= 524288;
        o3Var.zzB = j10;
    }

    public static /* synthetic */ void f0(o3 o3Var, int i8) {
        o3Var.zze |= 1048576;
        o3Var.zzC = i8;
    }

    public static /* synthetic */ void g0(o3 o3Var, String str) {
        o3Var.zze |= 2097152;
        o3Var.zzD = str;
    }

    public static /* synthetic */ void h0(o3 o3Var) {
        o3Var.zze &= -2097153;
        o3Var.zzD = zzd.zzD;
    }

    public static /* synthetic */ void i0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zze |= 4194304;
        o3Var.zzE = str;
    }

    public static /* synthetic */ void j0(o3 o3Var) {
        o3Var.zze |= 8388608;
        o3Var.zzF = false;
    }

    public static /* synthetic */ void k0(o3 o3Var, ArrayList arrayList) {
        l7 l7Var = o3Var.zzG;
        if (!l7Var.zzc()) {
            o3Var.zzG = g7.m(l7Var);
        }
        z5.d(arrayList, o3Var.zzG);
    }

    public static void l0(o3 o3Var) {
        o3Var.zzG = q8.f5487d;
    }

    public static /* synthetic */ void m0(o3 o3Var, String str) {
        o3Var.zze |= 16777216;
        o3Var.zzH = str;
    }

    public static /* synthetic */ void n0(o3 o3Var, int i8) {
        o3Var.zze |= 33554432;
        o3Var.zzI = i8;
    }

    public static /* synthetic */ void o0(o3 o3Var) {
        o3Var.zze |= 1;
        o3Var.zzg = 1;
    }

    public static /* synthetic */ void p0(o3 o3Var) {
        o3Var.zze &= -268435457;
        o3Var.zzL = zzd.zzL;
    }

    public static /* synthetic */ void q0(o3 o3Var, long j10) {
        o3Var.zze |= 536870912;
        o3Var.zzM = j10;
    }

    public static /* synthetic */ void t0(o3 o3Var, ArrayList arrayList) {
        o3Var.T0();
        z5.d(arrayList, o3Var.zzh);
    }

    public static /* synthetic */ void u0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzf |= 8192;
        o3Var.zzad = str;
    }

    public static /* synthetic */ void v0(o3 o3Var) {
        o3Var.zzf &= -8193;
        o3Var.zzad = zzd.zzad;
    }

    public static /* synthetic */ void w0(o3 o3Var, Set set) {
        l7 l7Var = o3Var.zzae;
        if (!l7Var.zzc()) {
            o3Var.zzae = g7.m(l7Var);
        }
        z5.d(set, o3Var.zzae);
    }

    public static void x0(o3 o3Var) {
        o3Var.zzh = q8.f5487d;
    }

    public static /* synthetic */ void y0(o3 o3Var, String str) {
        str.getClass();
        o3Var.zzf |= 16384;
        o3Var.zzaf = str;
    }

    public static /* synthetic */ void z0(o3 o3Var, long j10) {
        o3Var.zzf |= 32768;
        o3Var.zzag = j10;
    }

    public final String A() {
        return this.zzD;
    }

    public final long A1() {
        return this.zzm;
    }

    public final String B() {
        return this.zzp;
    }

    public final long B1() {
        return this.zzk;
    }

    public final String C() {
        return this.zzo;
    }

    public final long C1() {
        return this.zzag;
    }

    public final String D() {
        return this.zzy;
    }

    public final long D1() {
        return this.zzj;
    }

    public final String E() {
        return this.zzad;
    }

    public final long E1() {
        return this.zzx;
    }

    public final String F() {
        return this.zzr;
    }

    public final f3 F1(int i8) {
        return (f3) this.zzh.get(i8);
    }

    public final l7 G() {
        return this.zzG;
    }

    public final l7 H() {
        return this.zzh;
    }

    public final l7 I() {
        return this.zzi;
    }

    public final x3 I1(int i8) {
        return (x3) this.zzi.get(i8);
    }

    public final String J1() {
        return this.zzR;
    }

    public final String K1() {
        return this.zzu;
    }

    public final String L1() {
        return this.zzA;
    }

    public final int S() {
        return this.zzI;
    }

    public final int S0() {
        return this.zzC;
    }

    public final void T0() {
        l7 l7Var = this.zzh;
        if (!l7Var.zzc()) {
            this.zzh = g7.m(l7Var);
        }
    }

    public final void U0() {
        l7 l7Var = this.zzi;
        if (!l7Var.zzc()) {
            this.zzi = g7.m(l7Var);
        }
    }

    public final boolean V0() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean W0() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean X0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean Z0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean b1() {
        return (this.zze & 8) != 0;
    }

    public final boolean c1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean d1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean e1() {
        return (this.zze & 32) != 0;
    }

    public final boolean f1() {
        return (this.zze & 16) != 0;
    }

    public final boolean g1() {
        return (this.zze & 1) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean i1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean k1() {
        return (this.zze & 4) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 32768) != 0;
    }

    public final boolean m1() {
        return (this.zze & 1024) != 0;
    }

    public final boolean n1() {
        return (this.zze & 2) != 0;
    }

    public final boolean o1() {
        return (this.zze & 32768) != 0;
    }

    public final int p1() {
        return this.zzh.size();
    }

    public final int q1() {
        return this.zzg;
    }

    public final boolean r0() {
        return this.zzz;
    }

    public final int r1() {
        return this.zzQ;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", f3.class, "zzi", x3.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", b3.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", x2.f5580a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i10 == 3) {
            return new o3();
        } else {
            if (i10 == 4) {
                return new n3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public final boolean s0() {
        return this.zzF;
    }

    public final int s1() {
        return this.zzs;
    }

    public final String t() {
        return this.zzt;
    }

    public final int t1() {
        return this.zzi.size();
    }

    public final String u() {
        return this.zzv;
    }

    public final long u1() {
        return this.zzM;
    }

    public final String v() {
        return this.zzX;
    }

    public final long v1() {
        return this.zzB;
    }

    public final String w() {
        return this.zzq;
    }

    public final long w1() {
        return this.zzU;
    }

    public final String x() {
        return this.zzO;
    }

    public final long x1() {
        return this.zzl;
    }

    public final String y() {
        return this.zzH;
    }

    public final long y1() {
        return this.zzw;
    }

    public final String z() {
        return this.zzE;
    }

    public final long z1() {
        return this.zzn;
    }
}
