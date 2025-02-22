package s0;

import b3.l0;
import d0.g;
import d2.f1;
import i0.k;
import i0.p;
import i0.r;
import i0.u;
import java.util.LinkedHashMap;
import q0.m;
import q0.o;
import rf.l;
import sf.v;

public abstract class s0 extends k0 implements m, q0.h, c1, l<i0.f, ff.m> {
    public static final d V = d.f14432a;
    public static final c W = c.f14431a;
    public static final r X = new r();
    public static final v Y = new v();
    public static final a Z = new a();

    /* renamed from: a0  reason: collision with root package name */
    public static final b f14430a0 = new b();
    public final a0 C;
    public s0 D;
    public s0 E;
    public boolean F;
    public boolean G;
    public l<? super k, ff.m> H;
    public f1.c I;
    public f1.j J;
    public float K = 0.8f;
    public o L;
    public l0 M;
    public LinkedHashMap N;
    public long O = f1.h.f8035b;
    public float P;
    public h0.b Q;
    public v R;
    public final h S = new h(this);
    public boolean T;
    public a1 U;

    public static final class a implements e<m1> {
        public final int a() {
            return 16;
        }

        public final boolean b(h hVar) {
            m1 m1Var = (m1) hVar;
            sf.j.f(m1Var, "node");
            return m1Var.n();
        }

        public final void c(a0 a0Var, long j10, q<m1> qVar, boolean z10, boolean z11) {
            sf.j.f(qVar, "hitTestResult");
            a0Var.t(j10, qVar, z10, z11);
        }

        public final boolean d(a0 a0Var) {
            sf.j.f(a0Var, "parentLayoutNode");
            return true;
        }
    }

    public static final class b implements e<p1> {
        public final int a() {
            return 8;
        }

        public final boolean b(h hVar) {
            sf.j.f((p1) hVar, "node");
            return false;
        }

        public final void c(a0 a0Var, long j10, q<p1> qVar, boolean z10, boolean z11) {
            sf.j.f(qVar, "hitTestResult");
            p0 p0Var = a0Var.V;
            p0Var.f14402c.i0(s0.f14430a0, p0Var.f14402c.a0(j10), qVar, true, z11);
        }

        public final boolean d(a0 a0Var) {
            v0.j a10;
            sf.j.f(a0Var, "parentLayoutNode");
            p1 n2 = gc.b.n(a0Var);
            boolean z10 = false;
            if (!(n2 == null || (a10 = q1.a(n2)) == null || !a10.f16063c)) {
                z10 = true;
            }
            return !z10;
        }
    }

    public static final class c extends sf.k implements l<s0, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14431a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            s0 s0Var = (s0) obj;
            sf.j.f(s0Var, "coordinator");
            a1 a1Var = s0Var.U;
            if (a1Var != null) {
                a1Var.invalidate();
            }
            return ff.m.f8717a;
        }
    }

    public static final class d extends sf.k implements l<s0, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14432a = new d();

        public d() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
            if ((r1 == r5) != false) goto L_0x00bd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                s0.s0 r8 = (s0.s0) r8
                java.lang.String r0 = "coordinator"
                sf.j.f(r8, r0)
                boolean r0 = r8.j()
                if (r0 == 0) goto L_0x00da
                s0.v r0 = r8.R
                if (r0 != 0) goto L_0x0016
                r8.A0()
                goto L_0x00da
            L_0x0016:
                s0.v r1 = s0.s0.Y
                r1.getClass()
                float r2 = r0.f14456a
                r1.f14456a = r2
                float r2 = r0.f14457b
                r1.f14457b = r2
                float r2 = r0.f14458c
                r1.f14458c = r2
                float r2 = r0.f14459d
                r1.f14459d = r2
                float r2 = r0.f14460e
                r1.f14460e = r2
                float r2 = r0.f14461f
                r1.f14461f = r2
                float r2 = r0.f14462g
                r1.f14462g = r2
                float r2 = r0.f14463h
                r1.f14463h = r2
                long r2 = r0.f14464i
                r1.f14464i = r2
                r8.A0()
                float r2 = r1.f14456a
                float r3 = r0.f14456a
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x004e
                r2 = r4
                goto L_0x004f
            L_0x004e:
                r2 = r3
            L_0x004f:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14457b
                float r5 = r0.f14457b
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x005b
                r2 = r4
                goto L_0x005c
            L_0x005b:
                r2 = r3
            L_0x005c:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14458c
                float r5 = r0.f14458c
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0068
                r2 = r4
                goto L_0x0069
            L_0x0068:
                r2 = r3
            L_0x0069:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14459d
                float r5 = r0.f14459d
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0075
                r2 = r4
                goto L_0x0076
            L_0x0075:
                r2 = r3
            L_0x0076:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14460e
                float r5 = r0.f14460e
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0082
                r2 = r4
                goto L_0x0083
            L_0x0082:
                r2 = r3
            L_0x0083:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14461f
                float r5 = r0.f14461f
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x008f
                r2 = r4
                goto L_0x0090
            L_0x008f:
                r2 = r3
            L_0x0090:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14462g
                float r5 = r0.f14462g
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x009c
                r2 = r4
                goto L_0x009d
            L_0x009c:
                r2 = r3
            L_0x009d:
                if (r2 == 0) goto L_0x00bc
                float r2 = r1.f14463h
                float r5 = r0.f14463h
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x00a9
                r2 = r4
                goto L_0x00aa
            L_0x00a9:
                r2 = r3
            L_0x00aa:
                if (r2 == 0) goto L_0x00bc
                long r1 = r1.f14464i
                long r5 = r0.f14464i
                int r0 = i0.u.f9394b
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 != 0) goto L_0x00b8
                r0 = r4
                goto L_0x00b9
            L_0x00b8:
                r0 = r3
            L_0x00b9:
                if (r0 == 0) goto L_0x00bc
                goto L_0x00bd
            L_0x00bc:
                r4 = r3
            L_0x00bd:
                if (r4 != 0) goto L_0x00da
                s0.a0 r8 = r8.C
                s0.f0 r0 = r8.W
                int r1 = r0.f14343h
                if (r1 <= 0) goto L_0x00d3
                boolean r1 = r0.f14342g
                if (r1 == 0) goto L_0x00ce
                r8.H(r3)
            L_0x00ce:
                s0.f0$b r0 = r0.f14344i
                r0.H()
            L_0x00d3:
                s0.b1 r0 = r8.D
                if (r0 == 0) goto L_0x00da
                r0.h(r8)
            L_0x00da:
                ff.m r8 = ff.m.f8717a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.s0.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public interface e<N extends h> {
        int a();

        boolean b(N n2);

        void c(a0 a0Var, long j10, q<N> qVar, boolean z10, boolean z11);

        boolean d(a0 a0Var);
    }

    public static final class f extends sf.k implements rf.a<ff.m> {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s0 f14433a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f14434b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e<T> f14435c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ long f14436d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ q<T> f14437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(s0 s0Var, T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11) {
            super(0);
            this.f14433a = s0Var;
            this.f14434b = t2;
            this.f14435c = eVar;
            this.f14436d = j10;
            this.f14437e = qVar;
            this.B = z10;
            this.C = z11;
        }

        public final Object d() {
            this.f14433a.g0(u0.a(this.f14434b, this.f14435c.a()), this.f14435c, this.f14436d, this.f14437e, this.B, this.C);
            return ff.m.f8717a;
        }
    }

    public static final class g extends sf.k implements rf.a<ff.m> {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ float D;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s0 f14438a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f14439b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e<T> f14440c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ long f14441d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ q<T> f14442e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(s0 s0Var, T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f14438a = s0Var;
            this.f14439b = t2;
            this.f14440c = eVar;
            this.f14441d = j10;
            this.f14442e = qVar;
            this.B = z10;
            this.C = z11;
            this.D = f10;
        }

        public final Object d() {
            this.f14438a.h0(u0.a(this.f14439b, this.f14440c.a()), this.f14440c, this.f14441d, this.f14442e, this.B, this.C, this.D);
            return ff.m.f8717a;
        }
    }

    public static final class h extends sf.k implements rf.a<ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s0 f14443a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(s0 s0Var) {
            super(0);
            this.f14443a = s0Var;
        }

        public final Object d() {
            s0 s0Var = this.f14443a.E;
            if (s0Var != null) {
                s0Var.k0();
            }
            return ff.m.f8717a;
        }
    }

    public static final class i extends sf.k implements rf.a<ff.m> {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ float D;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s0 f14444a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f14445b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e<T> f14446c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ long f14447d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ q<T> f14448e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(s0 s0Var, T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f14444a = s0Var;
            this.f14445b = t2;
            this.f14446c = eVar;
            this.f14447d = j10;
            this.f14448e = qVar;
            this.B = z10;
            this.C = z11;
            this.D = f10;
        }

        public final Object d() {
            this.f14444a.y0(u0.a(this.f14445b, this.f14446c.a()), this.f14446c, this.f14447d, this.f14448e, this.B, this.C, this.D);
            return ff.m.f8717a;
        }
    }

    public static final class j extends sf.k implements rf.a<ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<k, ff.m> f14449a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(l<? super k, ff.m> lVar) {
            super(0);
            this.f14449a = lVar;
        }

        public final Object d() {
            this.f14449a.invoke(s0.X);
            return ff.m.f8717a;
        }
    }

    static {
        b7.a.s();
    }

    public s0(a0 a0Var) {
        sf.j.f(a0Var, "layoutNode");
        this.C = a0Var;
        this.I = a0Var.J;
        this.J = a0Var.K;
    }

    public static void r0(s0 s0Var, l lVar) {
        b1 b1Var;
        l<? super k, ff.m> lVar2 = s0Var.H;
        a0 a0Var = s0Var.C;
        boolean z10 = (lVar2 == lVar && sf.j.a(s0Var.I, a0Var.J) && s0Var.J == a0Var.K) ? false : true;
        s0Var.H = lVar;
        s0Var.I = a0Var.J;
        s0Var.J = a0Var.K;
        boolean l02 = s0Var.l0();
        h hVar = s0Var.S;
        if (!l02 || lVar == null) {
            a1 a1Var = s0Var.U;
            if (a1Var != null) {
                a1Var.destroy();
                a0Var.Z = true;
                hVar.d();
                if (s0Var.l0() && (b1Var = a0Var.D) != null) {
                    b1Var.n(a0Var);
                }
            }
            s0Var.U = null;
            s0Var.T = false;
        } else if (s0Var.U == null) {
            a1 f10 = cb.d.d0(a0Var).f(hVar, s0Var);
            f10.d(s0Var.f12811c);
            f10.f(s0Var.O);
            s0Var.U = f10;
            s0Var.A0();
            a0Var.Z = true;
            hVar.d();
        } else if (z10) {
            s0Var.A0();
        }
    }

    public final void A0() {
        a0 a0Var;
        s0 s0Var;
        r rVar;
        a1 a1Var = this.U;
        r rVar2 = X;
        boolean z10 = false;
        a0 a0Var2 = this.C;
        if (a1Var != null) {
            l<? super k, ff.m> lVar = this.H;
            if (lVar != null) {
                rVar2.f9384a = 1.0f;
                rVar2.f9385b = 1.0f;
                rVar2.f9386c = 1.0f;
                rVar2.f9387d = 0.0f;
                rVar2.f9388e = 0.0f;
                rVar2.B = 0.0f;
                long j10 = i0.l.f9381a;
                rVar2.C = j10;
                rVar2.D = j10;
                rVar2.E = 0.0f;
                rVar2.F = 0.0f;
                rVar2.G = 0.0f;
                rVar2.H = 8.0f;
                rVar2.I = u.f9393a;
                rVar2.J = p.f9383a;
                rVar2.K = false;
                rVar2.L = 0;
                int i8 = h0.g.f9088d;
                f1.c cVar = a0Var2.J;
                sf.j.f(cVar, "<set-?>");
                rVar2.M = cVar;
                l0.e(this.f12811c);
                cb.d.d0(a0Var2).getSnapshotObserver().a(this, V, new j(lVar));
                v vVar = this.R;
                if (vVar == null) {
                    vVar = new v();
                    this.R = vVar;
                }
                float f10 = rVar2.f9384a;
                vVar.f14456a = f10;
                float f11 = rVar2.f9385b;
                vVar.f14457b = f11;
                float f12 = rVar2.f9387d;
                vVar.f14458c = f12;
                float f13 = rVar2.f9388e;
                vVar.f14459d = f13;
                float f14 = rVar2.E;
                vVar.f14460e = f14;
                float f15 = rVar2.F;
                vVar.f14461f = f15;
                float f16 = rVar2.G;
                vVar.f14462g = f16;
                float f17 = rVar2.H;
                vVar.f14463h = f17;
                long j11 = rVar2.I;
                vVar.f14464i = j11;
                float f18 = rVar2.f9386c;
                float f19 = rVar2.B;
                long j12 = rVar2.C;
                long j13 = rVar2.D;
                float f20 = f17;
                rVar = rVar2;
                a0Var = a0Var2;
                a1Var.h(f10, f11, f18, f12, f13, f19, f14, f15, f16, f20, j11, rVar2.J, rVar2.K, j12, j13, rVar2.L, a0Var2.K, a0Var2.J);
                s0Var = this;
                s0Var.G = rVar.K;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            s0Var = this;
            rVar = rVar2;
            a0Var = a0Var2;
            if (s0Var.H == null) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        s0Var.K = rVar.f9386c;
        a0 a0Var3 = a0Var;
        b1 b1Var = a0Var3.D;
        if (b1Var != null) {
            b1Var.n(a0Var3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B0(long r5) {
        /*
            r4 = this;
            float r0 = h0.c.b(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0014
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            if (r0 == 0) goto L_0x002e
            float r0 = h0.c.c(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0029
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0029
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            s0.a1 r0 = r4.U
            if (r0 == 0) goto L_0x0042
            boolean r1 = r4.G
            if (r1 == 0) goto L_0x0042
            boolean r5 = r0.c(r5)
            if (r5 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = r3
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s0.B0(long):boolean");
    }

    public void D(long j10, float f10, l<? super k, ff.m> lVar) {
        r0(this, lVar);
        long j11 = this.O;
        int i8 = f1.h.f8036c;
        if (!(j11 == j10)) {
            this.O = j10;
            a0 a0Var = this.C;
            a0Var.W.f14344i.H();
            a1 a1Var = this.U;
            if (a1Var != null) {
                a1Var.f(j10);
            } else {
                s0 s0Var = this.E;
                if (s0Var != null) {
                    s0Var.k0();
                }
            }
            k0.Q(this);
            b1 b1Var = a0Var.D;
            if (b1Var != null) {
                b1Var.n(a0Var);
            }
        }
        this.P = f10;
    }

    public final k0 J() {
        return this.D;
    }

    public final q0.h K() {
        return this;
    }

    public final boolean L() {
        return this.L != null;
    }

    public final a0 M() {
        return this.C;
    }

    public final o N() {
        o oVar = this.L;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public final k0 O() {
        return this.E;
    }

    public final long P() {
        return this.O;
    }

    public final void R() {
        D(this.O, this.P, this.H);
    }

    public final void S(s0 s0Var, h0.b bVar, boolean z10) {
        if (s0Var != this) {
            s0 s0Var2 = this.E;
            if (s0Var2 != null) {
                s0Var2.S(s0Var, bVar, z10);
            }
            long j10 = this.O;
            int i8 = f1.h.f8036c;
            float f10 = (float) ((int) (j10 >> 32));
            bVar.f9064a -= f10;
            bVar.f9066c -= f10;
            float a10 = (float) f1.h.a(j10);
            bVar.f9065b -= a10;
            bVar.f9067d -= a10;
            a1 a1Var = this.U;
            if (a1Var != null) {
                a1Var.a(bVar, true);
                if (this.G && z10) {
                    long j11 = this.f12811c;
                    bVar.a(0.0f, 0.0f, (float) ((int) (j11 >> 32)), (float) f1.i.a(j11));
                }
            }
        }
    }

    public final long T(s0 s0Var, long j10) {
        if (s0Var == this) {
            return j10;
        }
        s0 s0Var2 = this.E;
        return (s0Var2 == null || sf.j.a(s0Var, s0Var2)) ? a0(j10) : a0(s0Var2.T(s0Var, j10));
    }

    public final long U(long j10) {
        return cb.c.f(Math.max(0.0f, (h0.g.b(j10) - ((float) C())) / 2.0f), Math.max(0.0f, (h0.g.a(j10) - ((float) f1.i.a(this.f12811c))) / 2.0f));
    }

    public final float V(long j10, long j11) {
        if (((float) C()) >= h0.g.b(j11) && ((float) f1.i.a(this.f12811c)) >= h0.g.a(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long U2 = U(j11);
        float b10 = h0.g.b(U2);
        float a10 = h0.g.a(U2);
        float b11 = h0.c.b(j10);
        float max = Math.max(0.0f, b11 < 0.0f ? -b11 : b11 - ((float) C()));
        float c3 = h0.c.c(j10);
        long f10 = f1.f(max, Math.max(0.0f, c3 < 0.0f ? -c3 : c3 - ((float) f1.i.a(this.f12811c))));
        if ((b10 <= 0.0f && a10 <= 0.0f) || h0.c.b(f10) > b10 || h0.c.c(f10) > a10) {
            return Float.POSITIVE_INFINITY;
        }
        return (h0.c.c(f10) * h0.c.c(f10)) + (h0.c.b(f10) * h0.c.b(f10));
    }

    public final void W(i0.f fVar) {
        sf.j.f(fVar, "canvas");
        a1 a1Var = this.U;
        if (a1Var != null) {
            a1Var.b(fVar);
            return;
        }
        long j10 = this.O;
        float f10 = (float) ((int) (j10 >> 32));
        float a10 = (float) f1.h.a(j10);
        fVar.k(f10, a10);
        Y(fVar);
        fVar.k(-f10, -a10);
    }

    public final void X(i0.f fVar, i0.c cVar) {
        sf.j.f(fVar, "canvas");
        sf.j.f(cVar, "paint");
        long j10 = this.f12811c;
        fVar.h(new h0.d(0.5f, 0.5f, ((float) ((int) (j10 >> 32))) - 0.5f, ((float) f1.i.a(j10)) - 0.5f), cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: s0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: s0.m} */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(i0.f r11) {
        /*
            r10 = this;
            r0 = 4
            boolean r1 = s0.v0.c(r0)
            d0.g$c r2 = r10.e0()
            r3 = 0
            if (r1 == 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            d0.g$c r2 = r2.f7180d
            if (r2 != 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            d0.g$c r1 = r10.f0(r1)
        L_0x0016:
            if (r1 == 0) goto L_0x0030
            int r4 = r1.f7179c
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0030
            int r4 = r1.f7178b
            r4 = r4 & r0
            if (r4 == 0) goto L_0x002b
            boolean r0 = r1 instanceof s0.m
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            s0.m r3 = (s0.m) r3
            goto L_0x0030
        L_0x002b:
            if (r1 == r2) goto L_0x0030
            d0.g$c r1 = r1.f7181e
            goto L_0x0016
        L_0x0030:
            r9 = r3
            if (r9 != 0) goto L_0x0037
            r10.v0(r11)
            goto L_0x004f
        L_0x0037:
            s0.a0 r0 = r10.C
            r0.getClass()
            s0.b1 r0 = cb.d.d0(r0)
            s0.e0 r4 = r0.getSharedDrawScope()
            long r0 = r10.f12811c
            long r6 = b3.l0.e(r0)
            r5 = r11
            r8 = r10
            r4.b(r5, r6, r8, r9)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s0.Y(i0.f):void");
    }

    public final s0 Z(s0 s0Var) {
        a0 a0Var = this.C;
        a0 a0Var2 = s0Var.C;
        if (a0Var2 == a0Var) {
            g.c e02 = s0Var.e0();
            g.c cVar = e0().f7177a;
            if (cVar.F) {
                for (g.c cVar2 = cVar.f7180d; cVar2 != null; cVar2 = cVar2.f7180d) {
                    if ((cVar2.f7178b & 2) != 0 && cVar2 == e02) {
                        return s0Var;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        a0 a0Var3 = a0Var2;
        while (a0Var3.E > a0Var.E) {
            a0Var3 = a0Var3.q();
            sf.j.c(a0Var3);
        }
        a0 a0Var4 = a0Var;
        while (a0Var4.E > a0Var3.E) {
            a0Var4 = a0Var4.q();
            sf.j.c(a0Var4);
        }
        while (a0Var3 != a0Var4) {
            a0Var3 = a0Var3.q();
            a0Var4 = a0Var4.q();
            if (a0Var3 != null) {
                if (a0Var4 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return a0Var4 == a0Var ? this : a0Var3 == a0Var2 ? s0Var : a0Var3.V.f14401b;
    }

    public final long a0(long j10) {
        long j11 = this.O;
        float b10 = h0.c.b(j10);
        int i8 = f1.h.f8036c;
        long f10 = f1.f(b10 - ((float) ((int) (j11 >> 32))), h0.c.c(j10) - ((float) f1.h.a(j11)));
        a1 a1Var = this.U;
        return a1Var != null ? a1Var.i(true, f10) : f10;
    }

    public final long b0() {
        return this.I.w(this.C.L.a());
    }

    public final Object c0() {
        v vVar = new v();
        g.c e02 = e0();
        a0 a0Var = this.C;
        p0 p0Var = a0Var.V;
        if ((p0Var.f14404e.f7179c & 64) != 0) {
            f1.c cVar = a0Var.J;
            for (g.c cVar2 = p0Var.f14403d; cVar2 != null; cVar2 = cVar2.f7180d) {
                if (cVar2 != e02) {
                    if (((cVar2.f7178b & 64) != 0) && (cVar2 instanceof l1)) {
                        vVar.f14957a = ((l1) cVar2).v(cVar, vVar.f14957a);
                    }
                }
            }
        }
        return vVar.f14957a;
    }

    public final s0 d0() {
        if (l0()) {
            return this.C.V.f14402c.E;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public abstract g.c e0();

    public final g.c f0(boolean z10) {
        g.c e02;
        p0 p0Var = this.C.V;
        if (p0Var.f14402c == this) {
            return p0Var.f14404e;
        }
        if (z10) {
            s0 s0Var = this.E;
            if (!(s0Var == null || (e02 = s0Var.e0()) == null)) {
                return e02.f7181e;
            }
        } else {
            s0 s0Var2 = this.E;
            if (s0Var2 != null) {
                return s0Var2.e0();
            }
        }
        return null;
    }

    public final <T extends h> void g0(T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11) {
        if (t2 == null) {
            j0(eVar, j10, qVar, z10, z11);
            return;
        }
        f fVar = new f(this, t2, eVar, j10, qVar, z10, z11);
        qVar.getClass();
        qVar.b(t2, -1.0f, z11, fVar);
    }

    public final float getDensity() {
        return this.C.J.getDensity();
    }

    public final f1.j getLayoutDirection() {
        return this.C.K;
    }

    public final <T extends h> void h0(T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11, float f10) {
        if (t2 == null) {
            j0(eVar, j10, qVar, z10, z11);
            return;
        }
        float f11 = f10;
        qVar.b(t2, f11, z11, new g(this, t2, eVar, j10, qVar, z10, z11, f10));
    }

    public final <T extends h> void i0(e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11) {
        g.c cVar;
        long j11 = j10;
        q<T> qVar2 = qVar;
        sf.j.f(eVar, "hitTestSource");
        sf.j.f(qVar2, "hitTestResult");
        int a10 = eVar.a();
        boolean c3 = v0.c(a10);
        g.c e02 = e0();
        if (c3 || (e02 = e02.f7180d) != null) {
            cVar = f0(c3);
            while (true) {
                if (cVar != null && (cVar.f7179c & a10) != 0) {
                    if ((cVar.f7178b & a10) == 0) {
                        if (cVar == e02) {
                            break;
                        }
                        cVar = cVar.f7181e;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cVar = null;
        boolean z12 = false;
        boolean z13 = true;
        if (!B0(j11)) {
            if (z10) {
                float V2 = V(j11, b0());
                if (!Float.isInfinite(V2) && !Float.isNaN(V2)) {
                    if (qVar2.f14415c != cb.d.H(qVar)) {
                        if (gc.b.e(qVar.a(), b7.a.c(V2, false)) > 0) {
                            z12 = true;
                        }
                        z13 = z12;
                    }
                    if (z13) {
                        h0(cVar, eVar, j10, qVar, z10, false, V2);
                    }
                }
            }
        } else if (cVar == null) {
            j0(eVar, j10, qVar, z10, z11);
        } else {
            float b10 = h0.c.b(j10);
            float c10 = h0.c.c(j10);
            if (b10 >= 0.0f && c10 >= 0.0f && b10 < ((float) C()) && c10 < ((float) f1.i.a(this.f12811c))) {
                g0(cVar, eVar, j10, qVar, z10, z11);
                return;
            }
            float V3 = !z10 ? Float.POSITIVE_INFINITY : V(j11, b0());
            if (!Float.isInfinite(V3) && !Float.isNaN(V3)) {
                if (qVar2.f14415c == cb.d.H(qVar)) {
                    boolean z14 = z11;
                } else {
                    if (gc.b.e(qVar.a(), b7.a.c(V3, z11)) > 0) {
                        z12 = true;
                    }
                    z13 = z12;
                }
                if (z13) {
                    h0(cVar, eVar, j10, qVar, z10, z11, V3);
                    return;
                }
            } else {
                boolean z15 = z11;
            }
            y0(cVar, eVar, j10, qVar, z10, z11, V3);
        }
    }

    public final Object invoke(Object obj) {
        i0.f fVar = (i0.f) obj;
        sf.j.f(fVar, "canvas");
        a0 a0Var = this.C;
        if (a0Var.M) {
            cb.d.d0(a0Var).getSnapshotObserver().a(this, W, new t0(this, fVar));
            this.T = false;
        } else {
            this.T = true;
        }
        return ff.m.f8717a;
    }

    public final boolean j() {
        return this.U != null && l0();
    }

    public <T extends h> void j0(e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11) {
        sf.j.f(eVar, "hitTestSource");
        sf.j.f(qVar, "hitTestResult");
        s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.i0(eVar, s0Var.a0(j10), qVar, z10, z11);
        }
    }

    public final void k0() {
        a1 a1Var = this.U;
        if (a1Var != null) {
            a1Var.invalidate();
            return;
        }
        s0 s0Var = this.E;
        if (s0Var != null) {
            s0Var.k0();
        }
    }

    public final boolean l0() {
        return !this.F && this.C.y();
    }

    public final float m() {
        return this.C.J.m();
    }

    public final boolean m0() {
        if (this.U != null && this.K <= 0.0f) {
            return true;
        }
        s0 s0Var = this.E;
        if (s0Var != null) {
            return s0Var.m0();
        }
        return false;
    }

    public final h0.d n0(s0 s0Var, boolean z10) {
        s0 s0Var2;
        sf.j.f(s0Var, "sourceCoordinates");
        if (!l0()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (s0Var.l0()) {
            q0.k kVar = s0Var instanceof q0.k ? (q0.k) s0Var : null;
            if (kVar == null || (s0Var2 = kVar.f12802a.C) == null) {
                s0Var2 = s0Var;
            }
            s0 Z2 = Z(s0Var2);
            h0.b bVar = this.Q;
            if (bVar == null) {
                bVar = new h0.b();
                this.Q = bVar;
            }
            bVar.f9064a = 0.0f;
            bVar.f9065b = 0.0f;
            long j10 = s0Var.f12811c;
            bVar.f9066c = (float) ((int) (j10 >> 32));
            bVar.f9067d = (float) f1.i.a(j10);
            while (s0Var2 != Z2) {
                s0Var2.w0(bVar, z10, false);
                if (bVar.b()) {
                    return h0.d.f9073e;
                }
                s0Var2 = s0Var2.E;
                sf.j.c(s0Var2);
            }
            S(Z2, bVar, z10);
            return new h0.d(bVar.f9064a, bVar.f9065b, bVar.f9066c, bVar.f9067d);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + s0Var + " is not attached!").toString());
        }
    }

    public final long o0(q0.h hVar, long j10) {
        s0 s0Var;
        sf.j.f(hVar, "sourceCoordinates");
        q0.k kVar = hVar instanceof q0.k ? (q0.k) hVar : null;
        if (kVar == null || (s0Var = kVar.f12802a.C) == null) {
            s0Var = (s0) hVar;
        }
        s0 Z2 = Z(s0Var);
        while (s0Var != Z2) {
            j10 = s0Var.z0(j10);
            s0Var = s0Var.E;
            sf.j.c(s0Var);
        }
        return T(Z2, j10);
    }

    public final long p0(long j10) {
        if (l0()) {
            for (s0 s0Var = this; s0Var != null; s0Var = s0Var.E) {
                j10 = s0Var.z0(j10);
            }
            return j10;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final long q0(long j10) {
        return cb.d.d0(this.C).e(p0(j10));
    }

    public void s0() {
        a1 a1Var = this.U;
        if (a1Var != null) {
            a1Var.invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (((r2.f7177a.f7179c & 128) != 0) == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.794E-43)
            boolean r1 = s0.v0.c(r0)
            d0.g$c r2 = r8.f0(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001b
            d0.g$c r2 = r2.f7177a
            int r2 = r2.f7179c
            r2 = r2 & r0
            r4 = 1
            if (r2 == 0) goto L_0x0017
            r2 = r4
            goto L_0x0018
        L_0x0017:
            r2 = r3
        L_0x0018:
            if (r2 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r4 == 0) goto L_0x0073
            t.w2 r2 = b0.m.f2941b
            java.lang.Object r2 = r2.f()
            b0.h r2 = (b0.h) r2
            r4 = 0
            b0.h r2 = b0.m.g(r2, r4, r3)
            b0.h r3 = r2.i()     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x0036
            d0.g$c r4 = r8.e0()     // Catch:{ all -> 0x0069 }
            goto L_0x003f
        L_0x0036:
            d0.g$c r4 = r8.e0()     // Catch:{ all -> 0x0069 }
            d0.g$c r4 = r4.f7180d     // Catch:{ all -> 0x0069 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0060
        L_0x003f:
            d0.g$c r1 = r8.f0(r1)     // Catch:{ all -> 0x0069 }
        L_0x0043:
            if (r1 == 0) goto L_0x0060
            int r5 = r1.f7179c     // Catch:{ all -> 0x0069 }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0060
            int r5 = r1.f7178b     // Catch:{ all -> 0x0069 }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x005b
            boolean r5 = r1 instanceof s0.w     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x005b
            r5 = r1
            s0.w r5 = (s0.w) r5     // Catch:{ all -> 0x0069 }
            long r6 = r8.f12811c     // Catch:{ all -> 0x0069 }
            r5.g(r6)     // Catch:{ all -> 0x0069 }
        L_0x005b:
            if (r1 == r4) goto L_0x0060
            d0.g$c r1 = r1.f7181e     // Catch:{ all -> 0x0069 }
            goto L_0x0043
        L_0x0060:
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0069 }
            b0.h.o(r3)     // Catch:{ all -> 0x006e }
            r2.c()
            goto L_0x0073
        L_0x0069:
            r0 = move-exception
            b0.h.o(r3)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            r2.c()
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s0.t0():void");
    }

    public final void u0() {
        l0 l0Var = this.M;
        boolean c3 = v0.c(128);
        if (l0Var != null) {
            g.c e02 = e0();
            if (c3 || (e02 = e02.f7180d) != null) {
                g.c f02 = f0(c3);
                while (f02 != null && (f02.f7179c & 128) != 0) {
                    if ((f02.f7178b & 128) != 0 && (f02 instanceof w)) {
                        ((w) f02).r(l0Var.F);
                    }
                    if (f02 == e02) {
                        break;
                    }
                    f02 = f02.f7181e;
                }
            }
        }
        g.c e03 = e0();
        if (c3 || (e03 = e03.f7180d) != null) {
            g.c f03 = f0(c3);
            while (f03 != null && (f03.f7179c & 128) != 0) {
                if ((f03.f7178b & 128) != 0 && (f03 instanceof w)) {
                    ((w) f03).t(this);
                }
                if (f03 != e03) {
                    f03 = f03.f7181e;
                } else {
                    return;
                }
            }
        }
    }

    public void v0(i0.f fVar) {
        sf.j.f(fVar, "canvas");
        s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.W(fVar);
        }
    }

    public final void w0(h0.b bVar, boolean z10, boolean z11) {
        a1 a1Var = this.U;
        if (a1Var != null) {
            if (this.G) {
                if (z11) {
                    long b02 = b0();
                    float b10 = h0.g.b(b02) / 2.0f;
                    float a10 = h0.g.a(b02) / 2.0f;
                    long j10 = this.f12811c;
                    bVar.a(-b10, -a10, ((float) ((int) (j10 >> 32))) + b10, ((float) f1.i.a(j10)) + a10);
                } else if (z10) {
                    long j11 = this.f12811c;
                    bVar.a(0.0f, 0.0f, (float) ((int) (j11 >> 32)), (float) f1.i.a(j11));
                }
                if (bVar.b()) {
                    return;
                }
            }
            a1Var.a(bVar, false);
        }
        long j12 = this.O;
        int i8 = f1.h.f8036c;
        float f10 = (float) ((int) (j12 >> 32));
        bVar.f9064a += f10;
        bVar.f9066c += f10;
        float a11 = (float) f1.h.a(j12);
        bVar.f9065b += a11;
        bVar.f9067d += a11;
    }

    public final void x0(o oVar) {
        sf.j.f(oVar, "value");
        o oVar2 = this.L;
        if (oVar != oVar2) {
            this.L = oVar;
            a0 a0Var = this.C;
            if (oVar2 == null || oVar.b() != oVar2.b() || oVar.a() != oVar2.a()) {
                int b10 = oVar.b();
                int a10 = oVar.a();
                a1 a1Var = this.U;
                if (a1Var != null) {
                    a1Var.d(l0.a(b10, a10));
                } else {
                    s0 s0Var = this.E;
                    if (s0Var != null) {
                        s0Var.k0();
                    }
                }
                b1 b1Var = a0Var.D;
                if (b1Var != null) {
                    b1Var.n(a0Var);
                }
                F(l0.a(b10, a10));
                l0.e(this.f12811c);
                X.getClass();
                boolean c3 = v0.c(4);
                g.c e02 = e0();
                if (c3 || (e02 = e02.f7180d) != null) {
                    g.c f02 = f0(c3);
                    while (f02 != null && (f02.f7179c & 4) != 0) {
                        if ((f02.f7178b & 4) != 0 && (f02 instanceof m)) {
                            ((m) f02).m();
                        }
                        if (f02 == e02) {
                            break;
                        }
                        f02 = f02.f7181e;
                    }
                }
            }
            LinkedHashMap linkedHashMap = this.N;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!oVar.c().isEmpty())) && !sf.j.a(oVar.c(), this.N)) {
                a0Var.W.f14344i.H.g();
                LinkedHashMap linkedHashMap2 = this.N;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.N = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(oVar.c());
            }
        }
    }

    public final <T extends h> void y0(T t2, e<T> eVar, long j10, q<T> qVar, boolean z10, boolean z11, float f10) {
        T t10 = t2;
        q<T> qVar2 = qVar;
        boolean z12 = z11;
        float f11 = f10;
        if (t10 == null) {
            j0(eVar, j10, qVar, z10, z11);
        } else if (eVar.b(t10)) {
            i iVar = new i(this, t2, eVar, j10, qVar, z10, z11, f10);
            qVar.getClass();
            if (qVar2.f14415c == cb.d.H(qVar)) {
                qVar2.b(t10, f11, z12, iVar);
                if (qVar2.f14415c + 1 == cb.d.H(qVar)) {
                    qVar.c();
                    return;
                }
                return;
            }
            long a10 = qVar.a();
            int i8 = qVar2.f14415c;
            qVar2.f14415c = cb.d.H(qVar);
            qVar2.b(t10, f11, z12, iVar);
            if (qVar2.f14415c + 1 < cb.d.H(qVar) && gc.b.e(a10, qVar.a()) > 0) {
                int i10 = qVar2.f14415c + 1;
                int i11 = i8 + 1;
                Object[] objArr = qVar2.f14413a;
                gf.l.V(i11, i10, qVar2.f14416d, objArr, objArr);
                long[] jArr = qVar2.f14414b;
                int i12 = qVar2.f14416d;
                sf.j.f(jArr, "<this>");
                System.arraycopy(jArr, i10, jArr, i11, i12 - i10);
                qVar2.f14415c = ((qVar2.f14416d + i8) - qVar2.f14415c) - 1;
            }
            qVar.c();
            qVar2.f14415c = i8;
        } else {
            y0(u0.a(t10, eVar.a()), eVar, j10, qVar, z10, z11, f10);
        }
    }

    public final long z0(long j10) {
        a1 a1Var = this.U;
        if (a1Var != null) {
            j10 = a1Var.i(false, j10);
        }
        long j11 = this.O;
        float b10 = h0.c.b(j10);
        int i8 = f1.h.f8036c;
        return f1.f(b10 + ((float) ((int) (j11 >> 32))), h0.c.c(j10) + ((float) f1.h.a(j11)));
    }
}
