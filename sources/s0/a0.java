package s0;

import androidx.compose.ui.platform.d3;
import d0.g;
import f1.j;
import g0.s;
import java.util.Arrays;
import java.util.List;
import q0.n;
import q0.o;
import q0.q;
import rf.l;
import s0.b1;
import s0.s0;
import sf.k;
import t.f;
import t.w2;

public final class a0 implements f, c1, g, b1.a {

    /* renamed from: e0  reason: collision with root package name */
    public static final c f14306e0 = new c();

    /* renamed from: f0  reason: collision with root package name */
    public static final a f14307f0 = a.f14319a;

    /* renamed from: g0  reason: collision with root package name */
    public static final b f14308g0 = new b();

    /* renamed from: h0  reason: collision with root package name */
    public static final z f14309h0 = new z(0);
    public boolean B;
    public a0 C;
    public b1 D;
    public int E;
    public final u.d<a0> F;
    public boolean G;
    public n H;
    public final u I;
    public f1.c J;
    public j K;
    public d3 L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final p0 V;
    public final f0 W;
    public float X;
    public s0 Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14310a;

    /* renamed from: a0  reason: collision with root package name */
    public g f14311a0;

    /* renamed from: b  reason: collision with root package name */
    public final int f14312b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f14313b0;

    /* renamed from: c  reason: collision with root package name */
    public int f14314c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f14315c0;

    /* renamed from: d  reason: collision with root package name */
    public final w2 f14316d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f14317d0;

    /* renamed from: e  reason: collision with root package name */
    public u.d<a0> f14318e;

    public static final class a extends k implements rf.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14319a = new a();

        public a() {
            super(0);
        }

        public final Object d() {
            return new a0(3, false, 0);
        }
    }

    public static final class b implements d3 {
        public final long a() {
            int i8 = f1.g.f8034c;
            return f1.g.f8032a;
        }
    }

    public static final class c extends d {
        public final o a(q qVar, List list, long j10) {
            sf.j.f(qVar, "$this$measure");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    public static abstract class d implements n {
    }

    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14320a;

        static {
            int[] iArr = new int[q.g.d(5).length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14320a = iArr;
        }
    }

    public a0() {
        this(3, false, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(int r2, boolean r3, int r4) {
        /*
            r1 = this;
            r4 = r2 & 1
            r0 = 0
            if (r4 == 0) goto L_0x0006
            r3 = r0
        L_0x0006:
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0011
            java.util.concurrent.atomic.AtomicInteger r2 = v0.m.f16065c
            r4 = 1
            int r0 = r2.addAndGet(r4)
        L_0x0011:
            r1.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a0.<init>(int, boolean, int):void");
    }

    public static void J(a0 a0Var) {
        sf.j.f(a0Var, "it");
        f0 f0Var = a0Var.W;
        if (e.f14320a[q.g.c(f0Var.f14337b)] != 1) {
            throw new IllegalStateException("Unexpected state ".concat(d.a.d(f0Var.f14337b)));
        } else if (f0Var.f14338c) {
            a0Var.I(true);
        } else if (f0Var.f14339d) {
            a0Var.H(true);
        } else {
            f0Var.getClass();
            if (f0Var.f14341f) {
                a0Var.F(true);
            }
        }
    }

    public final void A() {
        boolean z10 = this.M;
        this.M = true;
        if (!z10) {
            f0 f0Var = this.W;
            if (f0Var.f14338c) {
                I(true);
            } else {
                f0Var.getClass();
            }
        }
        p0 p0Var = this.V;
        s0 s0Var = p0Var.f14402c;
        s0 s0Var2 = p0Var.f14401b.D;
        while (!sf.j.a(s0Var, s0Var2) && s0Var != null) {
            if (s0Var.T) {
                s0Var.k0();
            }
            s0Var = s0Var.D;
        }
        u.d<a0> s10 = s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var = (a0) tArr[i10];
                if (a0Var.N != Integer.MAX_VALUE) {
                    a0Var.A();
                    J(a0Var);
                }
                i10++;
            } while (i10 < i8);
        }
    }

    public final void B() {
        if (this.M) {
            int i8 = 0;
            this.M = false;
            u.d<a0> s10 = s();
            int i10 = s10.f15640c;
            if (i10 > 0) {
                T[] tArr = s10.f15638a;
                do {
                    ((a0) tArr[i8]).B();
                    i8++;
                } while (i8 < i10);
            }
        }
    }

    public final void C(a0 a0Var) {
        if (a0Var.W.f14343h > 0) {
            f0 f0Var = this.W;
            f0Var.c(f0Var.f14343h - 1);
        }
        if (this.D != null) {
            a0Var.n();
        }
        a0Var.C = null;
        a0Var.V.f14402c.E = null;
        if (a0Var.f14310a) {
            this.f14314c--;
            u.d dVar = (u.d) a0Var.f14316d.f15268a;
            int i8 = dVar.f15640c;
            if (i8 > 0) {
                T[] tArr = dVar.f15638a;
                int i10 = 0;
                do {
                    ((a0) tArr[i10]).V.f14402c.E = null;
                    i10++;
                } while (i10 < i8);
            }
        }
        x();
        D();
    }

    public final void D() {
        if (this.f14310a) {
            a0 q10 = q();
            if (q10 != null) {
                q10.D();
                return;
            }
            return;
        }
        this.G = true;
    }

    public final boolean E(f1.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.S == 3) {
            k();
        }
        return this.W.f14344i.J(aVar.f8025a);
    }

    public final void F(boolean z10) {
        b1 b1Var;
        if (!this.f14310a && (b1Var = this.D) != null) {
            b1Var.t(this, true, z10);
        }
    }

    public final void G(boolean z10) {
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public final void H(boolean z10) {
        b1 b1Var;
        if (!this.f14310a && (b1Var = this.D) != null) {
            int i8 = b1.f14321y;
            b1Var.t(this, false, z10);
        }
    }

    public final void I(boolean z10) {
        b1 b1Var;
        a0 q10;
        if (!this.f14310a && (b1Var = this.D) != null) {
            b1Var.g(this, false, z10);
            f0 f0Var = f0.this;
            a0 q11 = f0Var.f14336a.q();
            int i8 = f0Var.f14336a.S;
            if (q11 != null && i8 != 3) {
                while (q11.S == i8 && (q10 = q11.q()) != null) {
                    q11 = q10;
                }
                int c3 = q.g.c(i8);
                if (c3 == 0) {
                    q11.I(z10);
                } else if (c3 == 1) {
                    q11.H(z10);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }
    }

    public final void K() {
        p0 p0Var = this.V;
        u.d<g.b> dVar = p0Var.f14405f;
        if (dVar != null) {
            int i8 = dVar.f15640c;
            g.c cVar = p0Var.f14403d.f7180d;
            while (true) {
                i8--;
                if (cVar != null && i8 >= 0) {
                    boolean z10 = cVar.F;
                    if (z10) {
                        if (z10) {
                            cVar.B();
                            cVar.y();
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    cVar = cVar.f7180d;
                } else {
                    return;
                }
            }
        }
    }

    public final void L() {
        u.d<a0> s10 = s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var = (a0) tArr[i10];
                int i11 = a0Var.T;
                a0Var.S = i11;
                if (i11 != 3) {
                    a0Var.L();
                }
                i10++;
            } while (i10 < i8);
        }
    }

    public final void M() {
        if (this.f14314c > 0 && this.B) {
            int i8 = 0;
            this.B = false;
            u.d<a0> dVar = this.f14318e;
            if (dVar == null) {
                dVar = new u.d<>(new a0[16]);
                this.f14318e = dVar;
            }
            dVar.f();
            u.d dVar2 = (u.d) this.f14316d.f15268a;
            int i10 = dVar2.f15640c;
            if (i10 > 0) {
                T[] tArr = dVar2.f15638a;
                do {
                    a0 a0Var = (a0) tArr[i8];
                    if (a0Var.f14310a) {
                        dVar.c(dVar.f15640c, a0Var.s());
                    } else {
                        dVar.b(a0Var);
                    }
                    i8++;
                } while (i8 < i10);
            }
            f0 f0Var = this.W;
            f0Var.f14344i.J = true;
            f0Var.getClass();
        }
    }

    public final void a(j jVar) {
        sf.j.f(jVar, "value");
        if (this.K != jVar) {
            this.K = jVar;
            w();
            a0 q10 = q();
            if (q10 != null) {
                q10.u();
            }
            v();
        }
    }

    public final void b() {
        g.c cVar;
        p0 p0Var = this.V;
        r rVar = p0Var.f14401b;
        boolean c3 = v0.c(128);
        if (c3) {
            cVar = rVar.f14426b0;
        } else {
            cVar = rVar.f14426b0.f7180d;
            if (cVar == null) {
                return;
            }
        }
        s0.d dVar = s0.V;
        g.c f02 = rVar.f0(c3);
        while (f02 != null && (f02.f7179c & 128) != 0) {
            if ((f02.f7178b & 128) != 0 && (f02 instanceof w)) {
                ((w) f02).t(p0Var.f14401b);
            }
            if (f02 != cVar) {
                f02 = f02.f7181e;
            } else {
                return;
            }
        }
    }

    public final void c(f1.c cVar) {
        sf.j.f(cVar, "value");
        if (!sf.j.a(this.J, cVar)) {
            this.J = cVar;
            w();
            a0 q10 = q();
            if (q10 != null) {
                q10.u();
            }
            v();
        }
    }

    public final void d() {
        p0 p0Var = this.V;
        s0 s0Var = p0Var.f14402c;
        s0 s0Var2 = p0Var.f14401b.D;
        while (!sf.j.a(s0Var, s0Var2) && s0Var != null) {
            s0Var.F = true;
            if (s0Var.U != null) {
                s0.r0(s0Var, (l) null);
            }
            s0Var = s0Var.D;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(d0.g r14) {
        /*
            r13 = this;
            java.lang.String r0 = "value"
            sf.j.f(r14, r0)
            boolean r0 = r13.f14310a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            d0.g r0 = r13.f14311a0
            d0.g$a r3 = d0.g.a.f7176a
            if (r0 != r3) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r0 = r1
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            if (r0 == 0) goto L_0x01d3
            r13.f14311a0 = r14
            s0.p0 r0 = r13.V
            r0.getClass()
            d0.g$c r3 = r0.f14404e
            s0.q0$a r4 = s0.q0.f14424a
            if (r3 == r4) goto L_0x0026
            r5 = r2
            goto L_0x0027
        L_0x0026:
            r5 = r1
        L_0x0027:
            java.lang.String r9 = "Check failed."
            if (r5 == 0) goto L_0x01c9
            r3.f7180d = r4
            r4.f7181e = r3
            r0.f14404e = r4
            u.d<d0.g$b> r3 = r0.f14405f
            if (r3 != 0) goto L_0x003c
            u.d r3 = new u.d
            d0.g$b[] r4 = new d0.g.b[r1]
            r3.<init>(r4)
        L_0x003c:
            r10 = r3
            u.d<d0.g$b> r3 = r0.f14406g
            if (r3 != 0) goto L_0x004a
            u.d r3 = new u.d
            r4 = 16
            d0.g$b[] r4 = new d0.g.b[r4]
            r3.<init>(r4)
        L_0x004a:
            r11 = r3
            int r3 = r11.f15640c
            u.d r4 = new u.d
            d0.g[] r3 = new d0.g[r3]
            r4.<init>(r3)
            r4.b(r14)
        L_0x0057:
            boolean r14 = r4.i()
            if (r14 == 0) goto L_0x0089
            int r14 = r4.f15640c
            int r14 = r14 + -1
            java.lang.Object r14 = r4.k(r14)
            d0.g r14 = (d0.g) r14
            boolean r3 = r14 instanceof d0.c
            if (r3 == 0) goto L_0x0078
            d0.c r14 = (d0.c) r14
            d0.g r3 = r14.f7172b
            r4.b(r3)
            d0.g r14 = r14.f7171a
            r4.b(r14)
            goto L_0x0057
        L_0x0078:
            boolean r3 = r14 instanceof d0.g.b
            if (r3 == 0) goto L_0x0080
            r11.b(r14)
            goto L_0x0057
        L_0x0080:
            s0.r0 r3 = new s0.r0
            r3.<init>(r11)
            r14.b(r3)
            goto L_0x0057
        L_0x0089:
            int r7 = r11.f15640c
            int r5 = r10.f15640c
            s0.r$a r14 = r0.f14403d
            if (r7 != r5) goto L_0x00e5
            d0.g$c r3 = r14.f7180d
            int r5 = r5 - r2
            r4 = r1
            r6 = r4
        L_0x0096:
            if (r3 == 0) goto L_0x00c6
            if (r5 < 0) goto L_0x00c6
            T[] r7 = r10.f15638a
            r7 = r7[r5]
            d0.g$b r7 = (d0.g.b) r7
            T[] r8 = r11.f15638a
            r8 = r8[r5]
            d0.g$b r8 = (d0.g.b) r8
            int r12 = s0.q0.a(r7, r8)
            if (r12 == 0) goto L_0x00c2
            if (r12 == r2) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            d0.g$c r3 = s0.p0.e(r7, r8, r3)
        L_0x00b3:
            boolean r7 = r3.F
            if (r7 != 0) goto L_0x00b8
            r6 = r2
        L_0x00b8:
            int r7 = r3.f7178b
            r4 = r4 | r7
            r3.f7179c = r4
            d0.g$c r3 = r3.f7180d
            int r5 = r5 + -1
            goto L_0x0096
        L_0x00c2:
            int r5 = r5 + 1
            d0.g$c r3 = r3.f7181e
        L_0x00c6:
            r8 = r3
            r7 = r5
            if (r7 <= 0) goto L_0x00e3
            if (r8 == 0) goto L_0x00ce
            r3 = r2
            goto L_0x00cf
        L_0x00ce:
            r3 = r1
        L_0x00cf:
            if (r3 == 0) goto L_0x00d9
            r3 = r0
            r4 = r10
            r5 = r7
            r6 = r11
            r3.d(r4, r5, r6, r7, r8)
            goto L_0x011a
        L_0x00d9:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = r9.toString()
            r14.<init>(r0)
            throw r14
        L_0x00e3:
            r3 = r1
            goto L_0x011c
        L_0x00e5:
            if (r5 != 0) goto L_0x00fe
            int r7 = r7 - r2
            r3 = r14
            r4 = r1
        L_0x00ea:
            if (r7 < 0) goto L_0x011a
            T[] r5 = r11.f15638a
            r5 = r5[r7]
            d0.g$b r5 = (d0.g.b) r5
            d0.g$c r3 = s0.p0.b(r5, r3)
            int r5 = r3.f7178b
            r4 = r4 | r5
            r3.f7179c = r4
            int r7 = r7 + -1
            goto L_0x00ea
        L_0x00fe:
            if (r7 != 0) goto L_0x0113
            int r5 = r5 - r2
            d0.g$c r3 = r14.f7180d
        L_0x0103:
            if (r3 == 0) goto L_0x0110
            if (r5 < 0) goto L_0x0110
            d0.g$c r4 = r3.f7180d
            s0.p0.c(r3)
            int r5 = r5 + -1
            r3 = r4
            goto L_0x0103
        L_0x0110:
            r6 = r1
            r3 = r2
            goto L_0x011c
        L_0x0113:
            r3 = r0
            r4 = r10
            r6 = r11
            r8 = r14
            r3.d(r4, r5, r6, r7, r8)
        L_0x011a:
            r3 = r2
            r6 = r3
        L_0x011c:
            r0.f14405f = r11
            r10.f()
            r0.f14406g = r10
            d0.g$c r4 = r0.f14404e
            s0.q0$a r5 = s0.q0.f14424a
            if (r4 != r5) goto L_0x012b
            r4 = r2
            goto L_0x012c
        L_0x012b:
            r4 = r1
        L_0x012c:
            if (r4 == 0) goto L_0x01bf
            d0.g$c r4 = r5.f7181e
            if (r4 != 0) goto L_0x0133
            r4 = r14
        L_0x0133:
            r0.f14404e = r4
            r7 = 0
            r4.f7180d = r7
            r5.f7181e = r7
            if (r4 == r5) goto L_0x013e
            r4 = r2
            goto L_0x013f
        L_0x013e:
            r4 = r1
        L_0x013f:
            if (r4 == 0) goto L_0x01b5
            s0.r r4 = r0.f14401b
            s0.a0 r5 = r0.f14400a
            if (r3 == 0) goto L_0x0193
            d0.g$c r14 = r14.f7180d
            r3 = r4
        L_0x014a:
            if (r14 == 0) goto L_0x0183
            int r8 = r14.f7178b
            r8 = r8 & 2
            if (r8 == 0) goto L_0x0154
            r8 = r2
            goto L_0x0155
        L_0x0154:
            r8 = r1
        L_0x0155:
            if (r8 == 0) goto L_0x017e
            boolean r8 = r14 instanceof s0.x
            if (r8 == 0) goto L_0x017e
            s0.s0 r8 = r14.C
            if (r8 == 0) goto L_0x016e
            s0.y r8 = (s0.y) r8
            s0.x r9 = r8.f14466b0
            r10 = r14
            s0.x r10 = (s0.x) r10
            r8.f14466b0 = r10
            if (r9 == r14) goto L_0x0178
            r8.s0()
            goto L_0x0178
        L_0x016e:
            s0.y r8 = new s0.y
            r9 = r14
            s0.x r9 = (s0.x) r9
            r8.<init>(r5, r9)
            r14.C = r8
        L_0x0178:
            r3.E = r8
            r8.D = r3
            r3 = r8
            goto L_0x0180
        L_0x017e:
            r14.C = r3
        L_0x0180:
            d0.g$c r14 = r14.f7180d
            goto L_0x014a
        L_0x0183:
            s0.a0 r14 = r5.q()
            if (r14 == 0) goto L_0x018e
            s0.p0 r14 = r14.V
            s0.r r14 = r14.f14401b
            goto L_0x018f
        L_0x018e:
            r14 = r7
        L_0x018f:
            r3.E = r14
            r0.f14402c = r3
        L_0x0193:
            if (r6 == 0) goto L_0x019e
            boolean r14 = r5.y()
            if (r14 == 0) goto L_0x019e
            r0.a(r2)
        L_0x019e:
            s0.s0 r14 = r0.f14402c
            s0.s0 r0 = r4.D
        L_0x01a2:
            boolean r1 = sf.j.a(r14, r0)
            if (r1 != 0) goto L_0x01af
            if (r14 == 0) goto L_0x01af
            r14.M = r7
            s0.s0 r14 = r14.D
            goto L_0x01a2
        L_0x01af:
            s0.f0 r14 = r13.W
            r14.d()
            return
        L_0x01b5:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = r9.toString()
            r14.<init>(r0)
            throw r14
        L_0x01bf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = r9.toString()
            r14.<init>(r0)
            throw r14
        L_0x01c9:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = r9.toString()
            r14.<init>(r0)
            throw r14
        L_0x01d3:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Modifiers are not supported on virtual LayoutNodes"
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a0.e(d0.g):void");
    }

    public final void f(d3 d3Var) {
        sf.j.f(d3Var, "<set-?>");
        this.L = d3Var;
    }

    public final void g(n nVar) {
        sf.j.f(nVar, "value");
        if (!sf.j.a(this.H, nVar)) {
            this.H = nVar;
            u uVar = this.I;
            uVar.getClass();
            uVar.f14455a.setValue(nVar);
            w();
        }
    }

    public final void h() {
        if (this.f14317d0) {
            this.f14317d0 = false;
        } else {
            K();
        }
    }

    public final void i(b1 b1Var) {
        sf.j.f(b1Var, "owner");
        if (this.D == null) {
            a0 a0Var = this.C;
            String str = null;
            if (!(a0Var == null || sf.j.a(a0Var.D, b1Var))) {
                StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
                sb2.append(b1Var);
                sb2.append(") than the parent's owner(");
                a0 q10 = q();
                sb2.append(q10 != null ? q10.D : null);
                sb2.append("). This tree: ");
                sb2.append(m(0));
                sb2.append(" Parent tree: ");
                a0 a0Var2 = this.C;
                if (a0Var2 != null) {
                    str = a0Var2.m(0);
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            a0 q11 = q();
            if (q11 == null) {
                this.M = true;
            }
            this.D = b1Var;
            this.E = (q11 != null ? q11.E : -1) + 1;
            if (gc.b.n(this) != null) {
                b1Var.p();
            }
            b1Var.a(this);
            boolean a10 = sf.j.a((Object) null, (Object) null);
            f0 f0Var = this.W;
            p0 p0Var = this.V;
            if (!a10) {
                f0Var.getClass();
                s0 s0Var = p0Var.f14402c;
                s0 s0Var2 = p0Var.f14401b.D;
                while (!sf.j.a(s0Var, s0Var2) && s0Var != null) {
                    s0Var.M = null;
                    s0Var = s0Var.D;
                }
            }
            p0Var.a(false);
            u.d dVar = (u.d) this.f14316d.f15268a;
            int i8 = dVar.f15640c;
            if (i8 > 0) {
                T[] tArr = dVar.f15638a;
                int i10 = 0;
                do {
                    ((a0) tArr[i10]).i(b1Var);
                    i10++;
                } while (i10 < i8);
            }
            w();
            if (q11 != null) {
                q11.w();
            }
            s0 s0Var3 = p0Var.f14402c;
            s0 s0Var4 = p0Var.f14401b.D;
            while (!sf.j.a(s0Var3, s0Var4) && s0Var3 != null) {
                s0.r0(s0Var3, s0Var3.H);
                s0Var3 = s0Var3.D;
            }
            f0Var.d();
            g.c cVar = p0Var.f14404e;
            if ((cVar.f7179c & 7168) != 0) {
                while (cVar != null) {
                    int i11 = cVar.f7178b;
                    if (((i11 & 4096) != 0) || (((i11 & 1024) != 0) | ((i11 & 2048) != 0))) {
                        v0.a(cVar, 1);
                    }
                    cVar = cVar.f7181e;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + m(0)).toString());
    }

    public final boolean j() {
        return y();
    }

    public final void k() {
        this.T = this.S;
        this.S = 3;
        u.d<a0> s10 = s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var = (a0) tArr[i10];
                if (a0Var.S != 3) {
                    a0Var.k();
                }
                i10++;
            } while (i10 < i8);
        }
    }

    public final void l() {
        this.T = this.S;
        this.S = 3;
        u.d<a0> s10 = s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var = (a0) tArr[i10];
                if (a0Var.S == 2) {
                    a0Var.l();
                }
                i10++;
            } while (i10 < i8);
        }
    }

    public final String m(int i8) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i8; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append(10);
        u.d<a0> s10 = s();
        int i11 = s10.f15640c;
        if (i11 > 0) {
            T[] tArr = s10.f15638a;
            int i12 = 0;
            do {
                sb2.append(((a0) tArr[i12]).m(i8 + 1));
                i12++;
            } while (i12 < i11);
        }
        String sb3 = sb2.toString();
        sf.j.e(sb3, "tree.toString()");
        if (i8 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        sf.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void n() {
        b1 b1Var = this.D;
        String str = null;
        if (b1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            a0 q10 = q();
            if (q10 != null) {
                str = q10.m(0);
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString().toString());
        }
        p0 p0Var = this.V;
        boolean z10 = (p0Var.f14404e.f7179c & 1024) != 0;
        g.c cVar = p0Var.f14403d;
        if (z10) {
            for (g.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f7180d) {
                if (((cVar2.f7178b & 1024) != 0) && (cVar2 instanceof s)) {
                    s sVar = (s) cVar2;
                    if (sVar.G.a()) {
                        cb.d.d0(this).getFocusOwner().e(true, false);
                        sVar.E();
                    }
                }
            }
        }
        a0 q11 = q();
        if (q11 != null) {
            q11.u();
            q11.w();
            this.Q = 3;
        }
        f0 f0Var = this.W;
        d0 d0Var = f0Var.f14344i.H;
        d0Var.f14297b = true;
        d0Var.f14298c = false;
        d0Var.f14300e = false;
        d0Var.f14299d = false;
        d0Var.f14301f = false;
        d0Var.f14302g = false;
        d0Var.f14303h = null;
        f0Var.getClass();
        if (gc.b.n(this) != null) {
            b1Var.p();
        }
        while (cVar != null) {
            if (cVar.F) {
                cVar.y();
            }
            cVar = cVar.f7180d;
        }
        b1Var.k(this);
        this.D = null;
        this.E = 0;
        u.d dVar = (u.d) this.f14316d.f15268a;
        int i8 = dVar.f15640c;
        if (i8 > 0) {
            T[] tArr = dVar.f15638a;
            int i10 = 0;
            do {
                ((a0) tArr[i10]).n();
                i10++;
            } while (i10 < i8);
        }
        this.N = Integer.MAX_VALUE;
        this.O = Integer.MAX_VALUE;
        this.M = false;
    }

    public final void o(i0.f fVar) {
        sf.j.f(fVar, "canvas");
        this.V.f14402c.W(fVar);
    }

    public final List<a0> p() {
        return s().e();
    }

    public final a0 q() {
        a0 a0Var = this.C;
        boolean z10 = false;
        if (a0Var != null && a0Var.f14310a) {
            z10 = true;
        }
        if (!z10) {
            return a0Var;
        }
        if (a0Var != null) {
            return a0Var.q();
        }
        return null;
    }

    public final u.d<a0> r() {
        boolean z10 = this.G;
        u.d<a0> dVar = this.F;
        if (z10) {
            dVar.f();
            dVar.c(dVar.f15640c, s());
            z zVar = f14309h0;
            sf.j.f(zVar, "comparator");
            T[] tArr = dVar.f15638a;
            int i8 = dVar.f15640c;
            sf.j.f(tArr, "<this>");
            Arrays.sort(tArr, 0, i8, zVar);
            this.G = false;
        }
        return dVar;
    }

    public final u.d<a0> s() {
        M();
        if (this.f14314c == 0) {
            return (u.d) this.f14316d.f15268a;
        }
        u.d<a0> dVar = this.f14318e;
        sf.j.c(dVar);
        return dVar;
    }

    public final void t(long j10, q<m1> qVar, boolean z10, boolean z11) {
        sf.j.f(qVar, "hitTestResult");
        p0 p0Var = this.V;
        p0Var.f14402c.i0(s0.Z, p0Var.f14402c.a0(j10), qVar, z10, z11);
    }

    public final String toString() {
        return cb.d.g0(this) + " children: " + p().size() + " measurePolicy: " + this.H;
    }

    public final void u() {
        if (this.Z) {
            p0 p0Var = this.V;
            s0 s0Var = p0Var.f14401b;
            s0 s0Var2 = p0Var.f14402c.E;
            this.Y = null;
            while (true) {
                if (sf.j.a(s0Var, s0Var2)) {
                    break;
                }
                if ((s0Var != null ? s0Var.U : null) != null) {
                    this.Y = s0Var;
                    break;
                }
                s0Var = s0Var != null ? s0Var.E : null;
            }
        }
        s0 s0Var3 = this.Y;
        if (s0Var3 != null && s0Var3.U == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (s0Var3 != null) {
            s0Var3.k0();
        } else {
            a0 q10 = q();
            if (q10 != null) {
                q10.u();
            }
        }
    }

    public final void v() {
        p0 p0Var = this.V;
        s0 s0Var = p0Var.f14402c;
        r rVar = p0Var.f14401b;
        while (s0Var != rVar) {
            sf.j.d(s0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) s0Var;
            a1 a1Var = yVar.U;
            if (a1Var != null) {
                a1Var.invalidate();
            }
            s0Var = yVar.D;
        }
        a1 a1Var2 = p0Var.f14401b.U;
        if (a1Var2 != null) {
            a1Var2.invalidate();
        }
    }

    public final void w() {
        I(false);
    }

    public final void x() {
        a0 q10;
        if (this.f14314c > 0) {
            this.B = true;
        }
        if (this.f14310a && (q10 = q()) != null) {
            q10.B = true;
        }
    }

    public final boolean y() {
        return this.D != null;
    }

    public final Boolean z() {
        this.W.getClass();
        return null;
    }

    public a0(int i8, boolean z10) {
        this.f14310a = z10;
        this.f14312b = i8;
        this.f14316d = new w2(new u.d(new a0[16]), new c0(this));
        this.F = new u.d<>(new a0[16]);
        this.G = true;
        this.H = f14306e0;
        this.I = new u(this);
        this.J = new f1.d(1.0f, 1.0f);
        this.K = j.f8039a;
        this.L = f14308g0;
        this.N = Integer.MAX_VALUE;
        this.O = Integer.MAX_VALUE;
        this.Q = 3;
        this.R = 3;
        this.S = 3;
        this.T = 3;
        this.V = new p0(this);
        this.W = new f0(this);
        this.Z = true;
        this.f14311a0 = g.a.f7176a;
    }
}
