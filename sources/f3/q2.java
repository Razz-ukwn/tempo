package f3;

import ag.g0;
import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
public final class q2 extends i implements p<g0, d<? super f2<Object, Object>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r2<Object, Object> f8461a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q2(r2<Object, Object> r2Var, d<? super q2> dVar) {
        super(2, dVar);
        this.f8461a = r2Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new q2(this.f8461a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((q2) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        this.f8461a.getClass();
        throw null;
    }
}
