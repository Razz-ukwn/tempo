package f3;

import cg.w;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.g;
import sf.j;

public final class r<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final w<T> f8462a;

    public r(l2 l2Var) {
        j.f(l2Var, "channel");
        this.f8462a = l2Var;
    }

    public final Object m(T t2, d<? super m> dVar) {
        Object t10 = this.f8462a.t(t2, dVar);
        return t10 == a.f10464a ? t10 : m.f8717a;
    }
}
