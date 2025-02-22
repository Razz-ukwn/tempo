package f3;

import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.a;
import rf.l;

@e(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
public final class v1 extends i implements l<d<? super f2<Object, Object>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a<f2<Object, Object>> f8518a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1(a<? extends f2<Object, Object>> aVar, d<? super v1> dVar) {
        super(1, dVar);
        this.f8518a = aVar;
    }

    public final d<m> create(d<?> dVar) {
        return new v1(this.f8518a, dVar);
    }

    public final Object invoke(Object obj) {
        return ((v1) create((d) obj)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return this.f8518a.d();
    }
}
