package t;

import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;
import t.z1;

@e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class b2 extends i implements p<z1.d, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f14996a;

    public b2(d<? super b2> dVar) {
        super(2, dVar);
    }

    public final d<m> create(Object obj, d<?> dVar) {
        b2 b2Var = new b2(dVar);
        b2Var.f14996a = obj;
        return b2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((z1.d) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return Boolean.valueOf(((z1.d) this.f14996a) == z1.d.f15314a);
    }
}
