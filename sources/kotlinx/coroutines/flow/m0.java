package kotlinx.coroutines.flow;

import ag.f2;
import ag.n1;
import cg.e;
import dg.i;
import dg.o;
import jf.d;
import jf.f;

public final class m0<T> implements x0<T>, f, o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final n1 f10588a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0<T> f10589b;

    public m0(y0 y0Var, f2 f2Var) {
        this.f10588a = f2Var;
        this.f10589b = y0Var;
    }

    public final Object a(g<? super T> gVar, d<?> dVar) {
        return this.f10589b.a(gVar, dVar);
    }

    public final f<T> b(f fVar, int i8, e eVar) {
        return ((((i8 >= 0 && i8 < 2) || i8 == -2) && eVar == e.f4021b) || ((i8 == 0 || i8 == -3) && eVar == e.f4020a)) ? this : new i(i8, fVar, eVar, this);
    }

    public final T getValue() {
        return this.f10589b.getValue();
    }
}
