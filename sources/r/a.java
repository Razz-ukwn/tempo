package r;

import androidx.compose.ui.platform.d3;
import androidx.compose.ui.platform.h1;
import cb.b;
import d0.g;
import f1.c;
import ff.m;
import k0.e;
import rf.l;
import rf.p;
import s0.a0;
import s0.g;
import sf.j;
import sf.k;
import t.e0;
import t.h;
import t.i;
import t.l2;
import t.y1;

public final class a {

    /* renamed from: r.a$a  reason: collision with other inner class name */
    public static final class C0257a extends k implements p<h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f13755a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<e, m> f13756b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f13757c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0257a(g gVar, l<? super e, m> lVar, int i8) {
            super(2);
            this.f13755a = gVar;
            this.f13756b = lVar;
            this.f13757c = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int L = b.L(this.f13757c | 1);
            a.a(this.f13755a, this.f13756b, (h) obj, L);
            return m.f8717a;
        }
    }

    public static final void a(g gVar, l<? super e, m> lVar, h hVar, int i8) {
        int i10;
        j.f(gVar, "modifier");
        j.f(lVar, "onDraw");
        i g10 = hVar.g(-932836462);
        if ((i8 & 14) == 0) {
            i10 = (g10.p(gVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            i10 |= g10.t(lVar) ? 32 : 16;
        }
        if ((i10 & 91) != 18 || !g10.h()) {
            e0.b bVar = e0.f15020a;
            g a10 = androidx.compose.ui.draw.a.a(gVar, lVar);
            j.f(a10, "modifier");
            g10.c(-72882467);
            s.l lVar2 = s.l.f14294a;
            g10.c(-1323940314);
            c cVar = (c) g10.x(h1.f1299e);
            f1.j jVar = (f1.j) g10.x(h1.f1305k);
            d3 d3Var = (d3) g10.x(h1.f1309p);
            s0.g.f14356x.getClass();
            a0.a aVar = g.a.f14358b;
            z.a c3 = z.b.c(-1586257396, new q0.i(a10), true);
            if (g10.f15065a instanceof t.c) {
                g10.f0();
                if (g10.K) {
                    g10.y(aVar);
                } else {
                    g10.q0();
                }
                g10.f15087x = false;
                b.H(g10, lVar2, g.a.f14361e);
                b.H(g10, cVar, g.a.f14360d);
                b.H(g10, jVar, g.a.f14362f);
                b.H(g10, d3Var, g.a.f14363g);
                g10.D();
                c3.e(new l2(g10), g10, 0);
                g10.c(2058660585);
                g10.E(false);
                g10.E(true);
                g10.E(false);
                g10.E(false);
            } else {
                throw new IllegalStateException("Invalid applier".toString());
            }
        } else {
            g10.j();
        }
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new C0257a(gVar, lVar, i8);
        }
    }
}
