package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
public final class r1 extends i implements p<g<? super Integer>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q1<Object, Object> f8466a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1(q1<Object, Object> q1Var, d<? super r1> dVar) {
        super(2, dVar);
        this.f8466a = q1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new r1(this.f8466a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        q1<Object, Object> q1Var = this.f8466a;
        q1Var.f8455j.o(new Integer(q1Var.f8453h));
        return m.f8717a;
    }
}
