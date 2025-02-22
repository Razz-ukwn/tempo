package ag;

import ff.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rf.l;

public final class l1 extends p1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e  reason: collision with root package name */
    public final l<Throwable, m> f436e;

    public l1(l<? super Throwable, m> lVar) {
        this.f436e = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return m.f8717a;
    }

    public final void w(Throwable th) {
        if (B.compareAndSet(this, 0, 1)) {
            this.f436e.invoke(th);
        }
    }
}
