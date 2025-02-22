package dg;

import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
public final class g extends i implements p<kotlinx.coroutines.flow.g<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7540a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7541b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h<Object, Object> f7542c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h<Object, Object> hVar, d<? super g> dVar) {
        super(2, dVar);
        this.f7542c = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        g gVar = new g(this.f7542c, dVar);
        gVar.f7541b = obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((kotlinx.coroutines.flow.g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f7540a;
        if (i8 == 0) {
            b.J(obj);
            this.f7540a = 1;
            if (this.f7542c.k((kotlinx.coroutines.flow.g) this.f7541b, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
