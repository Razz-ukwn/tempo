package kotlinx.coroutines.flow;

import ag.g0;
import cb.b;
import dg.q;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;

@e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
public final class k extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10577a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f<Object> f10578b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f<Object> fVar, d<? super k> dVar) {
        super(2, dVar);
        this.f10578b = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f10578b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f10577a;
        if (i8 == 0) {
            b.J(obj);
            this.f10577a = 1;
            Object a10 = this.f10578b.a(q.f7580a, this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
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
