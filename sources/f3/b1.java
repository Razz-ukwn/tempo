package f3;

import jf.d;
import lf.c;
import lf.e;

@e(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {188}, m = "generateNewPagingSource")
public final class b1 extends c {

    /* renamed from: a  reason: collision with root package name */
    public z0 f8085a;

    /* renamed from: b  reason: collision with root package name */
    public f2 f8086b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8087c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z0<Object, Object> f8088d;

    /* renamed from: e  reason: collision with root package name */
    public int f8089e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(z0<Object, Object> z0Var, d<? super b1> dVar) {
        super(dVar);
        this.f8088d = z0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8087c = obj;
        this.f8089e |= Integer.MIN_VALUE;
        return z0.a(this.f8088d, (f2) null, this);
    }
}
