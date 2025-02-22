package f3;

import cb.b;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.q;

@e(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {99}, m = "invokeSuspend")
public final class n extends i implements q<r0<Object>, r0<Object>, d<? super r0<Object>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8378a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ r0 f8379b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ r0 f8380c;

    public n(d<? super n> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        n nVar = new n((d) obj3);
        nVar.f8379b = (r0) obj;
        nVar.f8380c = (r0) obj2;
        return nVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f8378a;
        if (i8 == 0) {
            b.J(obj);
            r0 r0Var = this.f8379b;
            r0 r0Var2 = this.f8380c;
            this.f8379b = r0Var2;
            this.f8378a = 1;
            r0Var.f8465c.f8294d.e((CancellationException) null);
            return m.f8717a == aVar ? aVar : r0Var2;
        } else if (i8 == 1) {
            r0 r0Var3 = this.f8379b;
            b.J(obj);
            return r0Var3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
