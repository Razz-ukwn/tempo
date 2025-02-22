package kotlinx.coroutines.flow;

import ag.f2;
import ag.n1;
import cg.e;
import dg.i;
import dg.o;
import jf.d;
import jf.f;

public final class l0<T> implements o0<T>, f, o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final n1 f10583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o0<T> f10584b;

    public l0(p0 p0Var, f2 f2Var) {
        this.f10583a = f2Var;
        this.f10584b = p0Var;
    }

    public final Object a(g<? super T> gVar, d<?> dVar) {
        return this.f10584b.a(gVar, dVar);
    }

    public final f<T> b(f fVar, int i8, e eVar) {
        return ((i8 == 0 || i8 == -3) && eVar == e.f4020a) ? this : new i(i8, fVar, eVar, this);
    }
}
