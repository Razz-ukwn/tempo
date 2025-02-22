package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.MulticastedPagingData$accumulated$1", f = "CachedPagingData.kt", l = {44}, m = "invokeSuspend")
public final class p0 extends i implements p<g<? super y0<Object>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0<Object> f8408a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(r0<Object> r0Var, d<? super p0> dVar) {
        super(2, dVar);
        this.f8408a = r0Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p0(this.f8408a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        this.f8408a.getClass();
        return m.f8717a;
    }
}
