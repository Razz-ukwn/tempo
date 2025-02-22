package ag;

import ff.m;
import rf.l;

public final class k1 extends i {

    /* renamed from: a  reason: collision with root package name */
    public final l<Throwable, m> f429a;

    public k1(l<? super Throwable, m> lVar) {
        this.f429a = lVar;
    }

    public final void a(Throwable th) {
        this.f429a.invoke(th);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return m.f8717a;
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f429a.getClass().getSimpleName() + '@' + i0.d(this) + ']';
    }
}
