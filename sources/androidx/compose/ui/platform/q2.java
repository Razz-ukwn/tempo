package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import e.s;
import f1.h;
import f1.i;
import ff.m;
import h0.b;
import h0.g;
import i0.c;
import i0.f;
import i0.p;
import i0.t;
import i0.u;
import rf.l;
import rf.p;
import s0.a1;
import s0.s0;
import sf.j;
import sf.k;

public final class q2 implements a1 {
    public static final a I = a.f1403a;
    public boolean B;
    public boolean C;
    public c D;
    public final w1<i1> E = new w1<>(I);
    public final s F = new s();
    public long G = u.f9393a;
    public final i1 H;

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f1398a;

    /* renamed from: b  reason: collision with root package name */
    public l<? super f, m> f1399b;

    /* renamed from: c  reason: collision with root package name */
    public rf.a<m> f1400c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1401d;

    /* renamed from: e  reason: collision with root package name */
    public final y1 f1402e;

    public static final class a extends k implements p<i1, Matrix, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1403a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            i1 i1Var = (i1) obj;
            Matrix matrix = (Matrix) obj2;
            j.f(i1Var, "rn");
            j.f(matrix, "matrix");
            i1Var.J(matrix);
            return m.f8717a;
        }
    }

    public q2(AndroidComposeView androidComposeView, l lVar, s0.h hVar) {
        j.f(androidComposeView, "ownerView");
        j.f(lVar, "drawBlock");
        j.f(hVar, "invalidateParentLayer");
        this.f1398a = androidComposeView;
        this.f1399b = lVar;
        this.f1400c = hVar;
        this.f1402e = new y1(androidComposeView.getDensity());
        i1 o2Var = Build.VERSION.SDK_INT >= 29 ? new o2(androidComposeView) : new z1(androidComposeView);
        o2Var.w();
        this.H = o2Var;
    }

    public final void a(b bVar, boolean z10) {
        i1 i1Var = this.H;
        w1<i1> w1Var = this.E;
        if (z10) {
            float[] a10 = w1Var.a(i1Var);
            if (a10 == null) {
                bVar.f9064a = 0.0f;
                bVar.f9065b = 0.0f;
                bVar.f9066c = 0.0f;
                bVar.f9067d = 0.0f;
                return;
            }
            b7.a.z(a10, bVar);
            return;
        }
        b7.a.z(w1Var.b(i1Var), bVar);
    }

    public final void b(f fVar) {
        j.f(fVar, "canvas");
        Canvas canvas = i0.b.f9360a;
        Canvas canvas2 = ((i0.a) fVar).f9359a;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        boolean z10 = false;
        i1 i1Var = this.H;
        if (isHardwareAccelerated) {
            g();
            if (i1Var.K() > 0.0f) {
                z10 = true;
            }
            this.C = z10;
            if (z10) {
                fVar.n();
            }
            i1Var.h(canvas2);
            if (this.C) {
                fVar.d();
                return;
            }
            return;
        }
        float i8 = (float) i1Var.i();
        float z11 = (float) i1Var.z();
        float D2 = (float) i1Var.D();
        float f10 = (float) i1Var.f();
        if (i1Var.c() < 1.0f) {
            c cVar = this.D;
            if (cVar == null) {
                cVar = new c();
                this.D = cVar;
            }
            cVar.h(i1Var.c());
            canvas2.saveLayer(i8, z11, D2, f10, cVar.f9361a);
        } else {
            fVar.c();
        }
        fVar.k(i8, z11);
        fVar.g(this.E.b(i1Var));
        if (i1Var.E() || i1Var.y()) {
            this.f1402e.a(fVar);
        }
        l<? super f, m> lVar = this.f1399b;
        if (lVar != null) {
            lVar.invoke(fVar);
        }
        fVar.l();
        j(false);
    }

    public final boolean c(long j10) {
        float b10 = h0.c.b(j10);
        float c3 = h0.c.c(j10);
        i1 i1Var = this.H;
        if (i1Var.y()) {
            return 0.0f <= b10 && b10 < ((float) i1Var.b()) && 0.0f <= c3 && c3 < ((float) i1Var.a());
        }
        if (i1Var.E()) {
            return this.f1402e.c(j10);
        }
        return true;
    }

    public final void d(long j10) {
        int i8 = (int) (j10 >> 32);
        int a10 = i.a(j10);
        long j11 = this.G;
        int i10 = u.f9394b;
        float f10 = (float) i8;
        i1 i1Var = this.H;
        i1Var.k(Float.intBitsToFloat((int) (j11 >> 32)) * f10);
        float f11 = (float) a10;
        i1Var.p(Float.intBitsToFloat((int) (this.G & 4294967295L)) * f11);
        if (i1Var.n(i1Var.i(), i1Var.z(), i1Var.i() + i8, i1Var.z() + a10)) {
            long f12 = cb.c.f(f10, f11);
            y1 y1Var = this.f1402e;
            long j12 = y1Var.f1516d;
            int i11 = g.f9088d;
            if (!(j12 == f12)) {
                y1Var.f1516d = f12;
                y1Var.f1519g = true;
            }
            i1Var.v(y1Var.b());
            if (!this.f1401d && !this.B) {
                this.f1398a.invalidate();
                j(true);
            }
            this.E.c();
        }
    }

    public final void destroy() {
        i1 i1Var = this.H;
        if (i1Var.u()) {
            i1Var.o();
        }
        this.f1399b = null;
        this.f1400c = null;
        this.B = true;
        j(false);
        AndroidComposeView androidComposeView = this.f1398a;
        androidComposeView.P = true;
        androidComposeView.H(this);
    }

    public final void e(s0.h hVar, l lVar) {
        j.f(lVar, "drawBlock");
        j.f(hVar, "invalidateParentLayer");
        j(false);
        this.B = false;
        this.C = false;
        this.G = u.f9393a;
        this.f1399b = lVar;
        this.f1400c = hVar;
    }

    public final void f(long j10) {
        i1 i1Var = this.H;
        int i8 = i1Var.i();
        int z10 = i1Var.z();
        int i10 = (int) (j10 >> 32);
        int a10 = h.a(j10);
        if (i8 != i10 || z10 != a10) {
            i1Var.e(i10 - i8);
            i1Var.s(a10 - z10);
            x3.f1511a.a(this.f1398a);
            this.E.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r4 = this;
            boolean r0 = r4.f1401d
            androidx.compose.ui.platform.i1 r1 = r4.H
            if (r0 != 0) goto L_0x000c
            boolean r0 = r1.u()
            if (r0 != 0) goto L_0x002e
        L_0x000c:
            r0 = 0
            r4.j(r0)
            boolean r0 = r1.E()
            if (r0 == 0) goto L_0x0024
            androidx.compose.ui.platform.y1 r0 = r4.f1402e
            boolean r2 = r0.f1520h
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x0024
            r0.e()
            i0.o r0 = r0.f1518f
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            rf.l<? super i0.f, ff.m> r2 = r4.f1399b
            if (r2 == 0) goto L_0x002e
            e.s r3 = r4.F
            r1.L(r3, r0, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.q2.g():void");
    }

    public final void h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t tVar, boolean z10, long j11, long j12, int i8, f1.j jVar, f1.c cVar) {
        boolean z11;
        rf.a<m> aVar;
        long j13 = j10;
        t tVar2 = tVar;
        j.f(tVar2, "shape");
        j.f(jVar, "layoutDirection");
        j.f(cVar, "density");
        this.G = j13;
        i1 i1Var = this.H;
        boolean E2 = i1Var.E();
        y1 y1Var = this.f1402e;
        boolean z12 = false;
        if (!E2 || (!y1Var.f1520h)) {
            float f20 = f10;
            z11 = false;
        } else {
            float f21 = f10;
            z11 = true;
        }
        i1Var.A(f10);
        i1Var.q(f11);
        i1Var.x(f12);
        i1Var.C(f13);
        i1Var.l(f14);
        i1Var.r(f15);
        i1Var.B(androidx.databinding.a.l(j11));
        i1Var.H(androidx.databinding.a.l(j12));
        i1Var.j(f18);
        i1Var.I(f16);
        i1Var.d(f17);
        i1Var.G(f19);
        int i10 = u.f9394b;
        i1Var.k(Float.intBitsToFloat((int) (j13 >> 32)) * ((float) i1Var.b()));
        i1Var.p(Float.intBitsToFloat((int) (j13 & 4294967295L)) * ((float) i1Var.a()));
        p.a aVar2 = i0.p.f9383a;
        i1Var.F(z10 && tVar2 != aVar2);
        i1Var.m(z10 && tVar2 == aVar2);
        i1Var.g();
        i1Var.t(i8);
        boolean d10 = this.f1402e.d(tVar, i1Var.c(), i1Var.E(), i1Var.K(), jVar, cVar);
        i1Var.v(y1Var.b());
        if (i1Var.E() && !(!y1Var.f1520h)) {
            z12 = true;
        }
        AndroidComposeView androidComposeView = this.f1398a;
        if (z11 == z12 && (!z12 || !d10)) {
            x3.f1511a.a(androidComposeView);
        } else if (!this.f1401d && !this.B) {
            androidComposeView.invalidate();
            j(true);
        }
        if (!this.C && i1Var.K() > 0.0f && (aVar = this.f1400c) != null) {
            aVar.d();
        }
        this.E.c();
    }

    public final long i(boolean z10, long j10) {
        i1 i1Var = this.H;
        w1<i1> w1Var = this.E;
        if (!z10) {
            return b7.a.y(w1Var.b(i1Var), j10);
        }
        float[] a10 = w1Var.a(i1Var);
        if (a10 != null) {
            return b7.a.y(a10, j10);
        }
        int i8 = h0.c.f9071e;
        return h0.c.f9069c;
    }

    public final void invalidate() {
        if (!this.f1401d && !this.B) {
            this.f1398a.invalidate();
            j(true);
        }
    }

    public final void j(boolean z10) {
        if (z10 != this.f1401d) {
            this.f1401d = z10;
            this.f1398a.F(this, z10);
        }
    }
}
