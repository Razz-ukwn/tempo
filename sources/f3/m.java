package f3;

import ag.g0;
import cb.b;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.q;

@e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {222}, m = "invokeSuspend")
public final class m extends i implements q<g<? super r0<Object>>, x1<Object>, d<? super ff.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8359a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g f8360b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8361c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g0 f8362d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d dVar, g0 g0Var) {
        super(3, dVar);
        this.f8362d = g0Var;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        m mVar = new m((d) obj3, this.f8362d);
        mVar.f8360b = (g) obj;
        mVar.f8361c = obj2;
        return mVar.invokeSuspend(ff.m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f8359a;
        if (i8 == 0) {
            b.J(obj);
            g gVar = this.f8360b;
            r0 r0Var = new r0(this.f8362d, (x1) this.f8361c);
            this.f8359a = 1;
            if (gVar.m(r0Var, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ff.m.f8717a;
    }
}
