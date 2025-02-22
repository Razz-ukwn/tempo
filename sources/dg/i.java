package dg;

import cg.e;
import ff.m;
import jf.d;
import jf.g;
import kf.a;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.scheduling.b;

public final class i<T> extends h<T, T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, b bVar, int i8, e eVar, int i10) {
        super((i10 & 4) != 0 ? -3 : i8, (i10 & 2) != 0 ? g.f10014a : bVar, (i10 & 8) != 0 ? e.f4020a : eVar, fVar);
    }

    public final f<T> f(jf.f fVar, int i8, e eVar) {
        return new i(i8, fVar, eVar, this.f7543d);
    }

    public final f<T> g() {
        return this.f7543d;
    }

    public final Object k(kotlinx.coroutines.flow.g<? super T> gVar, d<? super m> dVar) {
        Object a10 = this.f7543d.a(gVar, dVar);
        return a10 == a.f10464a ? a10 : m.f8717a;
    }

    public i(int i8, jf.f fVar, e eVar, f fVar2) {
        super(i8, fVar, eVar, fVar2);
    }
}
