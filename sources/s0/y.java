package s0;

import b3.l0;
import cb.d;
import d0.g;
import ff.m;
import gf.t;
import i0.c;
import i0.f;
import i0.i;
import i0.k;
import java.util.Map;
import q0.h;
import q0.o;
import q0.v;
import rf.l;
import sf.j;

public final class y extends s0 {

    /* renamed from: d0  reason: collision with root package name */
    public static final c f14465d0;

    /* renamed from: b0  reason: collision with root package name */
    public x f14466b0;

    /* renamed from: c0  reason: collision with root package name */
    public t f14467c0;

    public final class a extends l0 {
        public final t I;
        public final C0272a J = new C0272a();
        public final /* synthetic */ y K;

        /* renamed from: s0.y$a$a  reason: collision with other inner class name */
        public final class C0272a implements o {
            public C0272a() {
            }

            public final int a() {
                s0 s0Var = a.this.K.D;
                j.c(s0Var);
                l0 l0Var = s0Var.M;
                j.c(l0Var);
                return l0Var.N().a();
            }

            public final int b() {
                s0 s0Var = a.this.K.D;
                j.c(s0Var);
                l0 l0Var = s0Var.M;
                j.c(l0Var);
                return l0Var.N().b();
            }

            public final Map<q0.a, Integer> c() {
                return t.f8979a;
            }

            public final void d() {
                v.a.C0251a aVar = v.a.f12813a;
                s0 s0Var = a.this.K.D;
                j.c(s0Var);
                l0 l0Var = s0Var.M;
                j.c(l0Var);
                v.a.c(aVar, l0Var, 0, 0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y yVar, t tVar) {
            super(yVar);
            j.f((Object) null, "scope");
            this.K = yVar;
            this.I = tVar;
        }

        public final int H(q0.a aVar) {
            j.f(aVar, "alignmentLine");
            int f10 = cb.b.f(this, aVar);
            this.H.put(aVar, Integer.valueOf(f10));
            return f10;
        }

        public final v i(long j10) {
            G(j10);
            s0 s0Var = this.K.D;
            j.c(s0Var);
            l0 l0Var = s0Var.M;
            j.c(l0Var);
            l0Var.i(j10);
            this.I.o(l0.a(l0Var.N().b(), l0Var.N().a()));
            l0.S(this, this.J);
            return this;
        }
    }

    public final class b extends l0 {
        public final /* synthetic */ y I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(y yVar) {
            super(yVar);
            j.f((Object) null, "scope");
            this.I = yVar;
        }

        public final int H(q0.a aVar) {
            j.f(aVar, "alignmentLine");
            int f10 = cb.b.f(this, aVar);
            this.H.put(aVar, Integer.valueOf(f10));
            return f10;
        }

        public final v i(long j10) {
            G(j10);
            y yVar = this.I;
            x xVar = yVar.f14466b0;
            s0 s0Var = yVar.D;
            j.c(s0Var);
            l0 l0Var = s0Var.M;
            j.c(l0Var);
            l0.S(this, xVar.d(this, l0Var, j10));
            return this;
        }
    }

    static {
        c cVar = new c();
        cVar.j(i.f9375d);
        cVar.r(1.0f);
        cVar.s(1);
        f14465d0 = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, x xVar) {
        super(a0Var);
        j.f(a0Var, "layoutNode");
        this.f14466b0 = xVar;
        this.f14467c0 = (!((xVar.s().f7178b & 512) != 0) || !(xVar instanceof t)) ? null : (t) xVar;
    }

    public final void D(long j10, float f10, l<? super k, m> lVar) {
        super.D(j10, f10, lVar);
        if (!this.f14379e) {
            u0();
            v.a.C0251a aVar = v.a.f12813a;
            f1.j jVar = this.C.K;
            h hVar = v.a.f12816d;
            aVar.getClass();
            int i8 = v.a.f12815c;
            f1.j jVar2 = v.a.f12814b;
            v.a.f12815c = (int) (this.f12811c >> 32);
            v.a.f12814b = jVar;
            boolean g10 = v.a.C0251a.g(aVar, this);
            N().d();
            this.B = g10;
            v.a.f12815c = i8;
            v.a.f12814b = jVar2;
            v.a.f12816d = hVar;
        }
    }

    public final int H(q0.a aVar) {
        j.f(aVar, "alignmentLine");
        l0 l0Var = this.M;
        if (l0Var == null) {
            return cb.b.f(this, aVar);
        }
        Integer num = (Integer) l0Var.H.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final g.c e0() {
        return this.f14466b0.s();
    }

    public final v i(long j10) {
        G(j10);
        x xVar = this.f14466b0;
        s0 s0Var = this.D;
        j.c(s0Var);
        x0(xVar.d(this, s0Var, j10));
        a1 a1Var = this.U;
        if (a1Var != null) {
            a1Var.d(this.f12811c);
        }
        t0();
        return this;
    }

    public final void s0() {
        super.s0();
        x xVar = this.f14466b0;
        if (!((xVar.s().f7178b & 512) != 0) || !(xVar instanceof t)) {
            this.f14467c0 = null;
            if (this.M != null) {
                this.M = new b(this);
                return;
            }
            return;
        }
        t tVar = (t) xVar;
        this.f14467c0 = tVar;
        if (this.M != null) {
            this.M = new a(this, tVar);
        }
    }

    public final void v0(f fVar) {
        j.f(fVar, "canvas");
        s0 s0Var = this.D;
        j.c(s0Var);
        s0Var.W(fVar);
        if (d.d0(this.C).getShowLayoutBounds()) {
            X(fVar, f14465d0);
        }
    }
}
