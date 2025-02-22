package s0;

import androidx.fragment.app.z;
import d0.g;
import ff.m;
import g0.d;
import g0.i;
import g0.n;
import g0.p;
import g0.q;
import java.util.HashSet;
import q0.h;
import q0.o;
import q0.r;
import q0.s;
import q0.t;
import q0.u;
import q0.x;
import r0.e;
import r0.f;
import s0.b1;
import s0.e;
import sf.j;
import sf.k;
import v0.l;

public final class c extends g.c implements x, t, m, p1, m1, f, l1, w, p, d, n, q, c1 {
    public g.b G;
    public boolean H = true;
    public r0.a I;
    public final HashSet<r0.c<?>> J = new HashSet<>();
    public h K;

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f14322a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f14322a = cVar;
        }

        public final Object d() {
            this.f14322a.E();
            return m.f8717a;
        }
    }

    public static final class b implements b1.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f14323a;

        public b(c cVar) {
            this.f14323a = cVar;
        }

        public final void b() {
            c cVar = this.f14323a;
            if (cVar.K == null) {
                cVar.t(i.d(cVar, 128));
            }
        }
    }

    /* renamed from: s0.c$c  reason: collision with other inner class name */
    public static final class C0269c extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f14324a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0269c(c cVar) {
            super(0);
            this.f14324a = cVar;
        }

        public final Object d() {
            g.b bVar = this.f14324a.G;
            j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((r0.d) bVar).j();
            return m.f8717a;
        }
    }

    public c(g.b bVar) {
        j.f(bVar, "element");
        this.f7178b = v0.b(bVar);
        this.G = bVar;
    }

    public final void A() {
        D();
    }

    public final void C(boolean z10) {
        if (this.F) {
            g.b bVar = this.G;
            boolean z11 = false;
            if ((this.f7178b & 32) != 0) {
                if (bVar instanceof r0.g) {
                    r0.g<?> gVar = (r0.g) bVar;
                    r0.a aVar = this.I;
                    if (aVar == null || !aVar.j(gVar.getKey())) {
                        this.I = new r0.a(gVar);
                        if (i.e(this).V.f14403d.F) {
                            e modifierLocalManager = i.f(this).getModifierLocalManager();
                            r0.h<?> key = gVar.getKey();
                            modifierLocalManager.getClass();
                            j.f(key, "key");
                            modifierLocalManager.f13762b.b(this);
                            modifierLocalManager.f13763c.b(key);
                            modifierLocalManager.a();
                        }
                    } else {
                        aVar.f13758b = gVar;
                        e modifierLocalManager2 = i.f(this).getModifierLocalManager();
                        r0.h<?> key2 = gVar.getKey();
                        modifierLocalManager2.getClass();
                        j.f(key2, "key");
                        modifierLocalManager2.f13762b.b(this);
                        modifierLocalManager2.f13763c.b(key2);
                        modifierLocalManager2.a();
                    }
                }
                if (bVar instanceof r0.d) {
                    if (z10) {
                        E();
                    } else {
                        i.f(this).q(new a(this));
                    }
                }
            }
            if ((this.f7178b & 4) != 0) {
                if (bVar instanceof f0.b) {
                    this.H = true;
                }
                if (!z10) {
                    i.d(this, 2).k0();
                }
            }
            if ((this.f7178b & 2) != 0) {
                if (i.e(this).V.f14403d.F) {
                    s0 s0Var = this.C;
                    j.c(s0Var);
                    ((y) s0Var).f14466b0 = this;
                    s0Var.s0();
                }
                if (!z10) {
                    i.d(this, 2).k0();
                    i.e(this).w();
                }
            }
            if (bVar instanceof x) {
                ((x) bVar).f();
            }
            if ((this.f7178b & 128) != 0) {
                if ((bVar instanceof t) && i.e(this).V.f14403d.F) {
                    i.e(this).w();
                }
                if (bVar instanceof s) {
                    this.K = null;
                    if (i.e(this).V.f14403d.F) {
                        i.f(this).u(new b(this));
                    }
                }
            }
            if (((this.f7178b & 256) != 0) && (bVar instanceof r) && i.e(this).V.f14403d.F) {
                i.e(this).w();
            }
            if (bVar instanceof p) {
                ((p) bVar).g().f8776a.b(this);
            }
            int i8 = this.f7178b;
            if (!((i8 & 16) != 0) || !(bVar instanceof o0.t)) {
                if ((i8 & 8) != 0) {
                    z11 = true;
                }
                if (z11) {
                    i.f(this).p();
                    return;
                }
                return;
            }
            ((o0.t) bVar).h();
            throw null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void D() {
        if (this.F) {
            g.b bVar = this.G;
            boolean z10 = true;
            if ((this.f7178b & 32) != 0) {
                if (bVar instanceof r0.g) {
                    e modifierLocalManager = i.f(this).getModifierLocalManager();
                    r0.h key = ((r0.g) bVar).getKey();
                    modifierLocalManager.getClass();
                    j.f(key, "key");
                    modifierLocalManager.f13764d.b(i.e(this));
                    modifierLocalManager.f13765e.b(key);
                    modifierLocalManager.a();
                }
                if (bVar instanceof r0.d) {
                    e.b bVar2 = e.f14328a;
                    ((r0.d) bVar).j();
                }
            }
            if ((this.f7178b & 8) == 0) {
                z10 = false;
            }
            if (z10) {
                i.f(this).p();
            }
            if (bVar instanceof p) {
                ((p) bVar).g().f8776a.j(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void E() {
        if (this.F) {
            this.J.clear();
            i.f(this).getSnapshotObserver().a(this, e.f14329b, new C0269c(this));
        }
    }

    public final void b(k0.c cVar) {
        j.f(cVar, "<this>");
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        f0.c cVar2 = (f0.c) bVar;
        if (this.H && (bVar instanceof f0.b)) {
            g.b bVar2 = this.G;
            if (bVar2 instanceof f0.b) {
                i.f(this).getSnapshotObserver().a(this, e.f14328a, new d(bVar2, this));
            }
            this.H = false;
        }
        cVar2.i();
    }

    public final v0.j c() {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((l) bVar).c();
    }

    public final o d(q0.q qVar, q0.m mVar, long j10) {
        j.f(qVar, "$this$measure");
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.j) bVar).d(qVar, mVar, j10);
    }

    public final void e(g0.r rVar) {
        g.b bVar = this.G;
        if (bVar instanceof g0.c) {
            ((g0.c) bVar).l();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void f(s0 s0Var) {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((r) bVar).q();
    }

    public final void g(long j10) {
        g.b bVar = this.G;
        if (bVar instanceof t) {
            ((t) bVar).p();
        }
    }

    public final boolean j() {
        return this.F;
    }

    public final void l() {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o0.t) bVar).h();
        throw null;
    }

    public final void m() {
        this.H = true;
        n.a(this);
    }

    public final boolean n() {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o0.t) bVar).h();
        throw null;
    }

    public final void o(long j10) {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((q0.f) bVar).m();
    }

    public final void p(o0.j jVar, o0.k kVar) {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o0.t) bVar).h();
        throw null;
    }

    public final z q() {
        r0.a aVar = this.I;
        return aVar != null ? aVar : r0.b.f13759b;
    }

    public final void r(q0.k kVar) {
        j.f(kVar, "coordinates");
        g.b bVar = this.G;
        if (bVar instanceof q0.l) {
            ((q0.l) bVar).getClass();
            throw null;
        }
    }

    public final void t(s0 s0Var) {
        j.f(s0Var, "coordinates");
        this.K = s0Var;
        g.b bVar = this.G;
        if (bVar instanceof s) {
            ((s) bVar).e();
        }
    }

    public final String toString() {
        return this.G.toString();
    }

    public final Object v(f1.c cVar, Object obj) {
        j.f(cVar, "<this>");
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((u) bVar).o();
    }

    public final boolean w() {
        g.b bVar = this.G;
        j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o0.t) bVar).h();
        throw null;
    }

    public final void x(g0.l lVar) {
        g.b bVar = this.G;
        if (bVar instanceof i) {
            new o((i) bVar).invoke(lVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void z() {
        C(true);
    }
}
