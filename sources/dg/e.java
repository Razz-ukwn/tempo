package dg;

import cb.b;
import cg.q;
import ff.m;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

@lf.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
public final class e extends i implements p<q<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7534a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7535b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f7536c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f<Object> fVar, d<? super e> dVar) {
        super(2, dVar);
        this.f7536c = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e eVar = new e(this.f7536c, dVar);
        eVar.f7535b = obj;
        return eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((q) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f7534a;
        if (i8 == 0) {
            b.J(obj);
            this.f7534a = 1;
            if (this.f7536c.e((q) this.f7535b, this) == aVar) {
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
