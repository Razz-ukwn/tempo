package ag;

import ff.m;
import kotlinx.coroutines.internal.f;

public final class o extends p1 {

    /* renamed from: e  reason: collision with root package name */
    public final l<?> f467e;

    public o(l<?> lVar) {
        this.f467e = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return m.f8717a;
    }

    public final void w(Throwable th) {
        s1 x10 = x();
        l<?> lVar = this.f467e;
        Throwable r10 = lVar.r(x10);
        if (!(!lVar.w() ? false : ((f) lVar.f434d).o(r10))) {
            lVar.n(r10);
            if (!lVar.w()) {
                lVar.p();
            }
        }
    }
}
