package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.q;

@e(c = "androidx.paging.MulticastedPagingData$accumulated$2", f = "CachedPagingData.kt", l = {46}, m = "invokeSuspend")
public final class q0 extends i implements q<g<? super y0<Object>>, Throwable, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0<Object> f8445a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(r0<Object> r0Var, d<? super q0> dVar) {
        super(3, dVar);
        this.f8445a = r0Var;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        Throwable th = (Throwable) obj2;
        return new q0(this.f8445a, (d) obj3).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        this.f8445a.getClass();
        return m.f8717a;
    }
}
