package ag;

import ag.s1;
import cb.b;
import ff.m;

public final class d2<T> extends r1 {

    /* renamed from: e  reason: collision with root package name */
    public final l<T> f412e;

    public d2(s1.a aVar) {
        this.f412e = aVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return m.f8717a;
    }

    public final void w(Throwable th) {
        Object S = x().S();
        boolean z10 = S instanceof w;
        l<T> lVar = this.f412e;
        if (z10) {
            lVar.resumeWith(b.u(((w) S).f504a));
        } else {
            lVar.resumeWith(v1.m(S));
        }
    }
}
