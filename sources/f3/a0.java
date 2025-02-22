package f3;

import kotlinx.coroutines.sync.d;
import lf.c;
import lf.e;

@e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {262}, m = "getStateAsEvents")
public final class a0 extends c {

    /* renamed from: a  reason: collision with root package name */
    public b0 f8050a;

    /* renamed from: b  reason: collision with root package name */
    public d f8051b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8052c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0<Object> f8053d;

    /* renamed from: e  reason: collision with root package name */
    public int f8054e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(b0<Object> b0Var, jf.d<? super a0> dVar) {
        super(dVar);
        this.f8053d = b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8052c = obj;
        this.f8054e |= Integer.MIN_VALUE;
        return this.f8053d.a(this);
    }
}
