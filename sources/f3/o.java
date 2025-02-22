package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
public final class o extends i implements p<g<? super x1<Object>>, d<? super m>, Object> {
    public o(d dVar) {
        super(2, dVar);
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o(dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return m.f8717a;
    }
}
