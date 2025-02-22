package dg;

import ag.g0;
import cb.b;
import cg.s;
import ff.m;
import kf.a;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j;
import lf.e;
import lf.i;
import rf.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7530a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g<Object> f7532c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f<Object> f7533d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(jf.d dVar, g gVar, f fVar) {
        super(2, dVar);
        this.f7532c = gVar;
        this.f7533d = fVar;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        d dVar2 = new d(dVar, this.f7532c, this.f7533d);
        dVar2.f7531b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f7530a;
        if (i8 == 0) {
            b.J(obj);
            s<Object> i10 = this.f7533d.i((g0) this.f7531b);
            this.f7530a = 1;
            Object a10 = j.a(this.f7532c, i10, true, this);
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
