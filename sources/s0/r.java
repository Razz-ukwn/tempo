package s0;

import cb.b;
import d0.g;
import ff.m;
import i0.c;
import i0.f;
import i0.i;
import i0.k;
import java.util.List;
import q0.n;
import q0.v;
import rf.l;
import s0.f0;
import sf.j;
import u.d;

public final class r extends s0 {

    /* renamed from: c0  reason: collision with root package name */
    public static final c f14425c0;

    /* renamed from: b0  reason: collision with root package name */
    public final a f14426b0;

    public static final class a extends g.c {
        public final String toString() {
            return "<tail>";
        }
    }

    static {
        c cVar = new c();
        cVar.j(i.f9374c);
        cVar.r(1.0f);
        cVar.s(1);
        f14425c0 = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var) {
        super(a0Var);
        j.f(a0Var, "layoutNode");
        a aVar = new a();
        this.f14426b0 = aVar;
        aVar.C = this;
    }

    public final void D(long j10, float f10, l<? super k, m> lVar) {
        super.D(j10, f10, lVar);
        if (!this.f14379e) {
            u0();
            a0 a0Var = this.C;
            a0 q10 = a0Var.q();
            p0 p0Var = a0Var.V;
            r rVar = p0Var.f14401b;
            float f11 = rVar.P;
            s0 s0Var = p0Var.f14402c;
            while (s0Var != rVar) {
                j.d(s0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                y yVar = (y) s0Var;
                f11 += yVar.P;
                s0Var = yVar.D;
            }
            boolean z10 = false;
            if (!(f11 == a0Var.X)) {
                a0Var.X = f11;
                if (q10 != null) {
                    q10.D();
                }
                if (q10 != null) {
                    q10.u();
                }
            }
            if (!a0Var.M) {
                if (q10 != null) {
                    q10.u();
                }
                a0Var.A();
            }
            if (q10 == null) {
                a0Var.N = 0;
            } else if (!a0Var.f14315c0 && q10.W.f14337b == 3) {
                if (a0Var.N == Integer.MAX_VALUE) {
                    z10 = true;
                }
                if (z10) {
                    int i8 = q10.P;
                    a0Var.N = i8;
                    q10.P = i8 + 1;
                } else {
                    throw new IllegalStateException("Place was called on a node which was placed already".toString());
                }
            }
            a0Var.W.f14344i.s();
        }
    }

    public final int H(q0.a aVar) {
        j.f(aVar, "alignmentLine");
        l0 l0Var = this.M;
        if (l0Var != null) {
            return l0Var.H(aVar);
        }
        f0.b bVar = this.C.W.f14344i;
        f0 f0Var = f0.this;
        int i8 = f0Var.f14337b;
        d0 d0Var = bVar.H;
        if (i8 == 1) {
            d0Var.f14301f = true;
            if (d0Var.f14297b) {
                f0Var.f14339d = true;
                f0Var.f14340e = true;
            }
        } else {
            d0Var.f14302g = true;
        }
        bVar.b().B = true;
        bVar.s();
        bVar.b().B = false;
        Integer num = (Integer) d0Var.f14304i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final g.c e0() {
        return this.f14426b0;
    }

    public final v i(long j10) {
        List<q0.m> list;
        G(j10);
        a0 a0Var = this.C;
        d<a0> s10 = a0Var.s();
        int i8 = s10.f15640c;
        if (i8 > 0) {
            T[] tArr = s10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var2 = (a0) tArr[i10];
                a0Var2.getClass();
                a0Var2.Q = 3;
                i10++;
            } while (i10 < i8);
        }
        n nVar = a0Var.H;
        f0.b bVar = a0Var.W.f14344i;
        f0 f0Var = f0.this;
        f0Var.f14336a.M();
        boolean z10 = bVar.J;
        d<q0.m> dVar = bVar.I;
        if (!z10) {
            list = dVar.e();
        } else {
            b.l(f0Var.f14336a, dVar, g0.f14369a);
            bVar.J = false;
            list = dVar.e();
        }
        x0(nVar.a(this, list, j10));
        t0();
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends s0.h> void j0(s0.s0.e<T> r19, long r20, s0.q<T> r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            r9 = r20
            r11 = r22
            java.lang.String r1 = "hitTestSource"
            sf.j.f(r8, r1)
            java.lang.String r1 = "hitTestResult"
            sf.j.f(r11, r1)
            s0.a0 r1 = r0.C
            boolean r2 = r8.d(r1)
            r12 = 1
            r13 = 0
            if (r2 == 0) goto L_0x0044
            boolean r2 = r0.B0(r9)
            if (r2 == 0) goto L_0x0026
            r14 = r24
            r2 = r12
            goto L_0x0047
        L_0x0026:
            if (r23 == 0) goto L_0x0044
            long r2 = r18.b0()
            float r2 = r0.V(r9, r2)
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L_0x003e
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L_0x003e
            r2 = r12
            goto L_0x003f
        L_0x003e:
            r2 = r13
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2 = r12
            r14 = r13
            goto L_0x0047
        L_0x0044:
            r14 = r24
            r2 = r13
        L_0x0047:
            if (r2 == 0) goto L_0x00f3
            int r15 = r11.f14415c
            u.d r1 = r1.r()
            int r2 = r1.f15640c
            if (r2 <= 0) goto L_0x00f1
            int r2 = r2 - r12
            T[] r7 = r1.f15638a
            r16 = r2
        L_0x0058:
            r1 = r7[r16]
            r6 = r1
            s0.a0 r6 = (s0.a0) r6
            boolean r1 = r6.M
            if (r1 == 0) goto L_0x00e2
            r1 = r19
            r2 = r6
            r3 = r20
            r5 = r22
            r12 = r6
            r6 = r23
            r17 = r7
            r7 = r14
            r1.c(r2, r3, r5, r6, r7)
            long r1 = r22.a()
            r3 = 32
            long r3 = r1 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x008b
            boolean r1 = gc.b.p(r1)
            if (r1 == 0) goto L_0x008b
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = r13
        L_0x008c:
            if (r1 != 0) goto L_0x008f
            goto L_0x00cf
        L_0x008f:
            s0.p0 r1 = r12.V
            s0.s0 r1 = r1.f14402c
            r2 = 16
            boolean r3 = s0.v0.c(r2)
            d0.g$c r1 = r1.f0(r3)
            if (r1 != 0) goto L_0x00a0
            goto L_0x00c6
        L_0x00a0:
            d0.g$c r1 = r1.f7177a
            boolean r3 = r1.F
            if (r3 == 0) goto L_0x00d6
            int r3 = r1.f7179c
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00c6
            d0.g$c r1 = r1.f7181e
        L_0x00ad:
            if (r1 == 0) goto L_0x00c6
            int r3 = r1.f7178b
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00c3
            boolean r3 = r1 instanceof s0.m1
            if (r3 == 0) goto L_0x00c3
            r3 = r1
            s0.m1 r3 = (s0.m1) r3
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c7
        L_0x00c3:
            d0.g$c r1 = r1.f7181e
            goto L_0x00ad
        L_0x00c6:
            r1 = r13
        L_0x00c7:
            if (r1 == 0) goto L_0x00d1
            int r1 = r11.f14416d
            int r1 = r1 + -1
            r11.f14415c = r1
        L_0x00cf:
            r1 = 1
            goto L_0x00d2
        L_0x00d1:
            r1 = r13
        L_0x00d2:
            if (r1 != 0) goto L_0x00e4
            r1 = 1
            goto L_0x00e5
        L_0x00d6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00e2:
            r17 = r7
        L_0x00e4:
            r1 = r13
        L_0x00e5:
            if (r1 != 0) goto L_0x00f1
            int r16 = r16 + -1
            if (r16 >= 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r7 = r17
            r12 = 1
            goto L_0x0058
        L_0x00f1:
            r11.f14415c = r15
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.r.j0(s0.s0$e, long, s0.q, boolean, boolean):void");
    }

    public final void v0(f fVar) {
        j.f(fVar, "canvas");
        a0 a0Var = this.C;
        b1 d02 = cb.d.d0(a0Var);
        d<a0> r10 = a0Var.r();
        int i8 = r10.f15640c;
        if (i8 > 0) {
            T[] tArr = r10.f15638a;
            int i10 = 0;
            do {
                a0 a0Var2 = (a0) tArr[i10];
                if (a0Var2.M) {
                    a0Var2.o(fVar);
                }
                i10++;
            } while (i10 < i8);
        }
        if (d02.getShowLayoutBounds()) {
            X(fVar, f14425c0);
        }
    }
}
