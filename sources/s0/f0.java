package s0;

import b3.l0;
import f1.h;
import i0.k;
import java.util.List;
import q.g;
import q0.m;
import q0.v;
import rf.l;
import s0.a0;
import sf.j;
import u.d;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14336a;

    /* renamed from: b  reason: collision with root package name */
    public int f14337b = 5;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14339d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14340e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14341f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14342g;

    /* renamed from: h  reason: collision with root package name */
    public int f14343h;

    /* renamed from: i  reason: collision with root package name */
    public final b f14344i = new b();

    public final class a extends v implements m, b {
        public Object B;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14345e;

        public final void D(long j10, float f10, l<? super k, ff.m> lVar) {
            throw null;
        }

        public final void H() {
            throw null;
        }

        public final v i(long j10) {
            throw null;
        }
    }

    public final class b extends v implements m, b {
        public boolean B;
        public long C = h.f8035b;
        public l<? super k, ff.m> D;
        public float E;
        public boolean F = true;
        public Object G;
        public final d0 H = new d0(this);
        public final d<m> I = new d<>(new m[16]);
        public boolean J = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14346e;

        public static final class a extends sf.k implements rf.a<ff.m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f0 f14347a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ b f14348b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a0 f14349c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var, b bVar, a0 a0Var) {
                super(0);
                this.f14347a = f0Var;
                this.f14348b = bVar;
                this.f14349c = a0Var;
            }

            public final Object d() {
                f0 f0Var = this.f14347a;
                a0 a0Var = f0Var.f14336a;
                int i8 = 0;
                a0Var.P = 0;
                d<a0> s10 = a0Var.s();
                int i10 = s10.f15640c;
                if (i10 > 0) {
                    T[] tArr = s10.f15638a;
                    int i11 = 0;
                    do {
                        a0 a0Var2 = (a0) tArr[i11];
                        a0Var2.O = a0Var2.N;
                        a0Var2.N = Integer.MAX_VALUE;
                        if (a0Var2.Q == 2) {
                            a0Var2.Q = 3;
                        }
                        i11++;
                    } while (i11 < i10);
                }
                h0 h0Var = h0.f14371a;
                b bVar = this.f14348b;
                bVar.y(h0Var);
                this.f14349c.V.f14401b.N().d();
                a0 a0Var3 = f0Var.f14336a;
                d<a0> s11 = a0Var3.s();
                int i12 = s11.f15640c;
                if (i12 > 0) {
                    T[] tArr2 = s11.f15638a;
                    do {
                        a0 a0Var4 = (a0) tArr2[i8];
                        if (a0Var4.O != a0Var4.N) {
                            a0Var3.D();
                            a0Var3.u();
                            if (a0Var4.N == Integer.MAX_VALUE) {
                                a0Var4.B();
                            }
                        }
                        i8++;
                    } while (i8 < i12);
                }
                bVar.y(i0.f14373a);
                return ff.m.f8717a;
            }
        }

        /* renamed from: s0.f0$b$b  reason: collision with other inner class name */
        public static final class C0270b extends sf.k implements rf.a<ff.m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l<k, ff.m> f14350a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ f0 f14351b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ long f14352c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ float f14353d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0270b(l<? super k, ff.m> lVar, f0 f0Var, long j10, float f10) {
                super(0);
                this.f14350a = lVar;
                this.f14351b = f0Var;
                this.f14352c = j10;
                this.f14353d = f10;
            }

            public final Object d() {
                v.a.C0251a aVar = v.a.f12813a;
                l<k, ff.m> lVar = this.f14350a;
                f0 f0Var = this.f14351b;
                long j10 = this.f14352c;
                float f10 = this.f14353d;
                if (lVar == null) {
                    s0 a10 = f0Var.a();
                    aVar.getClass();
                    v.a.d(a10, j10, f10);
                } else {
                    s0 a11 = f0Var.a();
                    aVar.getClass();
                    j.f(a11, "$this$placeWithLayer");
                    long B = a11.B();
                    a11.D(e9.c.a(((int) (j10 >> 32)) + ((int) (B >> 32)), h.a(B) + h.a(j10)), f10, lVar);
                }
                return ff.m.f8717a;
            }
        }

        public static final class c extends sf.k implements l<b, ff.m> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f14354a = new c();

            public c() {
                super(1);
            }

            public final Object invoke(Object obj) {
                b bVar = (b) obj;
                j.f(bVar, "it");
                bVar.c().f14298c = false;
                return ff.m.f8717a;
            }
        }

        public b() {
        }

        public final void A() {
            a0 a0Var = f0.this.f14336a;
            a0.c cVar = a0.f14306e0;
            a0Var.I(false);
        }

        public final int C() {
            return f0.this.a().C();
        }

        public final void D(long j10, float f10, l<? super k, ff.m> lVar) {
            long j11 = this.C;
            int i8 = h.f8036c;
            if (!(j10 == j11)) {
                H();
            }
            f0 f0Var = f0.this;
            if (f0.b(f0Var.f14336a)) {
                v.a.C0251a aVar = v.a.f12813a;
                f0Var.getClass();
                j.c((Object) null);
                v.a.c(aVar, (v) null, (int) (j10 >> 32), h.a(j10));
            }
            f0Var.f14337b = 3;
            I(j10, f10, lVar);
            f0Var.f14337b = 5;
        }

        public final void H() {
            f0 f0Var = f0.this;
            if (f0Var.f14343h > 0) {
                List<a0> p10 = f0Var.f14336a.p();
                int size = p10.size();
                for (int i8 = 0; i8 < size; i8++) {
                    a0 a0Var = p10.get(i8);
                    f0 f0Var2 = a0Var.W;
                    if (f0Var2.f14342g && !f0Var2.f14339d) {
                        a0Var.H(false);
                    }
                    f0Var2.f14344i.H();
                }
            }
        }

        public final void I(long j10, float f10, l<? super k, ff.m> lVar) {
            this.C = j10;
            this.E = f10;
            this.D = lVar;
            this.B = true;
            this.H.f14302g = false;
            f0 f0Var = f0.this;
            if (f0Var.f14342g) {
                f0Var.f14342g = false;
                f0Var.c(f0Var.f14343h - 1);
            }
            k1 snapshotObserver = cb.d.d0(f0Var.f14336a).getSnapshotObserver();
            a0 a0Var = f0Var.f14336a;
            C0270b bVar = new C0270b(lVar, f0Var, j10, f10);
            snapshotObserver.getClass();
            j.f(a0Var, "node");
            snapshotObserver.a(a0Var, snapshotObserver.f14383d, bVar);
        }

        public final boolean J(long j10) {
            f0 f0Var = f0.this;
            b1 d02 = cb.d.d0(f0Var.f14336a);
            a0 a0Var = f0Var.f14336a;
            a0 q10 = a0Var.q();
            boolean z10 = true;
            a0Var.U = a0Var.U || (q10 != null && q10.U);
            if (!a0Var.W.f14338c) {
                if (this.f12812d == j10) {
                    d02.i(a0Var);
                    a0Var.L();
                    return false;
                }
            }
            this.H.f14301f = false;
            y(c.f14354a);
            this.f14346e = true;
            long j11 = f0Var.a().f12811c;
            G(j10);
            if (f0Var.f14337b == 5) {
                f0Var.f14337b = 1;
                f0Var.f14338c = false;
                k1 snapshotObserver = cb.d.d0(a0Var).getSnapshotObserver();
                j0 j0Var = new j0(f0Var, j10);
                snapshotObserver.getClass();
                snapshotObserver.a(a0Var, snapshotObserver.f14381b, j0Var);
                if (f0Var.f14337b == 1) {
                    f0Var.f14339d = true;
                    f0Var.f14340e = true;
                    f0Var.f14337b = 5;
                }
                if ((f0Var.a().f12811c == j11) && f0Var.a().f12809a == this.f12809a && f0Var.a().f12810b == this.f12810b) {
                    z10 = false;
                }
                F(l0.a(f0Var.a().f12809a, f0Var.a().f12810b));
                return z10;
            }
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }

        public final r b() {
            return f0.this.f14336a.V.f14401b;
        }

        public final a c() {
            return this.H;
        }

        public final b h() {
            f0 f0Var;
            a0 q10 = f0.this.f14336a.q();
            if (q10 == null || (f0Var = q10.W) == null) {
                return null;
            }
            return f0Var.f14344i;
        }

        public final v i(long j10) {
            f0 f0Var = f0.this;
            a0 a0Var = f0Var.f14336a;
            if (a0Var.S == 3) {
                a0Var.k();
            }
            a0 a0Var2 = f0Var.f14336a;
            int i8 = 1;
            if (!f0.b(a0Var2)) {
                a0 q10 = a0Var2.q();
                if (q10 != null) {
                    boolean z10 = a0Var2.Q == 3 || a0Var2.U;
                    f0 f0Var2 = q10.W;
                    if (z10) {
                        int c3 = g.c(f0Var2.f14337b);
                        if (c3 != 0) {
                            i8 = 2;
                            if (c3 != 2) {
                                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(d.a.d(f0Var2.f14337b)));
                            }
                        }
                        a0Var2.Q = i8;
                    } else {
                        throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + b0.b(a0Var2.Q) + ". Parent state " + d.a.d(f0Var2.f14337b) + '.').toString());
                    }
                } else {
                    a0Var2.Q = 3;
                }
                J(j10);
                return this;
            }
            this.f14346e = true;
            G(j10);
            a0Var2.getClass();
            a0Var2.R = 3;
            f0Var.getClass();
            j.c((Object) null);
            throw null;
        }

        public final void requestLayout() {
            a0 a0Var = f0.this.f14336a;
            a0.c cVar = a0.f14306e0;
            a0Var.H(false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void s() {
            /*
                r12 = this;
                s0.d0 r0 = r12.H
                r0.i()
                s0.f0 r1 = s0.f0.this
                boolean r2 = r1.f14339d
                s0.a0 r3 = r1.f14336a
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0044
                u.d r2 = r3.s()
                int r6 = r2.f15640c
                if (r6 <= 0) goto L_0x0044
                T[] r2 = r2.f15638a
                r7 = r5
            L_0x001a:
                r8 = r2[r7]
                s0.a0 r8 = (s0.a0) r8
                s0.f0 r9 = r8.W
                boolean r10 = r9.f14338c
                if (r10 == 0) goto L_0x0040
                int r10 = r8.Q
                if (r10 != r4) goto L_0x0040
                s0.f0$b r9 = r9.f14344i
                boolean r10 = r9.f14346e
                if (r10 == 0) goto L_0x0036
                long r9 = r9.f12812d
                f1.a r11 = new f1.a
                r11.<init>(r9)
                goto L_0x0037
            L_0x0036:
                r11 = 0
            L_0x0037:
                boolean r8 = r8.E(r11)
                if (r8 == 0) goto L_0x0040
                r3.I(r5)
            L_0x0040:
                int r7 = r7 + 1
                if (r7 < r6) goto L_0x001a
            L_0x0044:
                boolean r2 = r1.f14340e
                if (r2 != 0) goto L_0x0054
                s0.r r2 = r12.b()
                boolean r2 = r2.B
                if (r2 != 0) goto L_0x0083
                boolean r2 = r1.f14339d
                if (r2 == 0) goto L_0x0083
            L_0x0054:
                r1.f14339d = r5
                int r2 = r1.f14337b
                r6 = 3
                r1.f14337b = r6
                s0.b1 r6 = cb.d.d0(r3)
                s0.k1 r6 = r6.getSnapshotObserver()
                s0.f0$b$a r7 = new s0.f0$b$a
                r7.<init>(r1, r12, r3)
                r6.getClass()
                s0.e1 r8 = r6.f14382c
                r6.a(r3, r8, r7)
                r1.f14337b = r2
                s0.r r2 = r12.b()
                boolean r2 = r2.B
                if (r2 == 0) goto L_0x0081
                boolean r2 = r1.f14342g
                if (r2 == 0) goto L_0x0081
                r12.requestLayout()
            L_0x0081:
                r1.f14340e = r5
            L_0x0083:
                boolean r1 = r0.f14299d
                if (r1 == 0) goto L_0x0089
                r0.f14300e = r4
            L_0x0089:
                boolean r1 = r0.f14297b
                if (r1 == 0) goto L_0x0096
                boolean r1 = r0.f()
                if (r1 == 0) goto L_0x0096
                r0.h()
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.f0.b.s():void");
        }

        public final boolean t() {
            return f0.this.f14336a.M;
        }

        public final void y(l<? super b, ff.m> lVar) {
            j.f(lVar, "block");
            List<a0> p10 = f0.this.f14336a.p();
            int size = p10.size();
            for (int i8 = 0; i8 < size; i8++) {
                lVar.invoke(p10.get(i8).W.f14344i);
            }
        }
    }

    public f0(a0 a0Var) {
        j.f(a0Var, "layoutNode");
        this.f14336a = a0Var;
    }

    public static boolean b(a0 a0Var) {
        a0Var.getClass();
        return j.a((Object) null, a0Var);
    }

    public final s0 a() {
        return this.f14336a.V.f14402c;
    }

    public final void c(int i8) {
        int i10 = this.f14343h;
        this.f14343h = i8;
        boolean z10 = false;
        boolean z11 = i10 == 0;
        if (i8 == 0) {
            z10 = true;
        }
        if (z11 != z10) {
            a0 q10 = this.f14336a.q();
            f0 f0Var = q10 != null ? q10.W : null;
            if (f0Var == null) {
                return;
            }
            if (i8 == 0) {
                f0Var.c(f0Var.f14343h - 1);
            } else {
                f0Var.c(f0Var.f14343h + 1);
            }
        }
    }

    public final void d() {
        boolean z10;
        a0 q10;
        b bVar = this.f14344i;
        if (!bVar.F) {
            z10 = false;
        } else {
            bVar.F = false;
            Object obj = bVar.G;
            f0 f0Var = f0.this;
            z10 = !j.a(obj, f0Var.a().c0());
            bVar.G = f0Var.a().c0();
        }
        a0 a0Var = this.f14336a;
        if (z10 && (q10 = a0Var.q()) != null) {
            q10.I(false);
        }
    }
}
