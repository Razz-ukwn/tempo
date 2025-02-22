package dg;

import cg.e;
import cg.q;
import d2.f1;
import ff.m;
import jf.d;
import jf.e;
import kf.a;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.internal.x;
import sf.j;

public abstract class h<S, T> extends f<T> {

    /* renamed from: d  reason: collision with root package name */
    public final f<S> f7543d;

    public h(int i8, jf.f fVar, e eVar, f fVar2) {
        super(fVar, i8, eVar);
        this.f7543d = fVar2;
    }

    public final Object a(g<? super T> gVar, d<? super m> dVar) {
        a aVar = a.f10464a;
        if (this.f7538b == -3) {
            jf.f context = dVar.getContext();
            jf.f n02 = context.n0(this.f7537a);
            if (j.a(n02, context)) {
                Object k10 = k(gVar, dVar);
                return k10 == aVar ? k10 : m.f8717a;
            }
            int i8 = jf.e.f10011s;
            e.a aVar2 = e.a.f10012a;
            if (j.a(n02.d(aVar2), context.d(aVar2))) {
                jf.f context2 = dVar.getContext();
                if (!(gVar instanceof u ? true : gVar instanceof q)) {
                    gVar = new x<>(gVar, context2);
                }
                Object Q = f1.Q(n02, gVar, x.b(n02), new g(this, (d<? super g>) null), dVar);
                if (Q != aVar) {
                    Q = m.f8717a;
                }
                return Q == aVar ? Q : m.f8717a;
            }
        }
        Object a10 = super.a(gVar, dVar);
        return a10 == aVar ? a10 : m.f8717a;
    }

    public final Object e(q<? super T> qVar, d<? super m> dVar) {
        Object k10 = k(new u(qVar), dVar);
        return k10 == a.f10464a ? k10 : m.f8717a;
    }

    public abstract Object k(g<? super T> gVar, d<? super m> dVar);

    public final String toString() {
        return this.f7543d + " -> " + super.toString();
    }
}
