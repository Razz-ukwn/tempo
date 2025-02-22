package kotlinx.coroutines.scheduling;

import ag.d1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class f extends d1 {

    /* renamed from: c  reason: collision with root package name */
    public final a f10762c;

    public f(int i8, int i10, long j10) {
        this.f10762c = new a(i8, i10, j10, "DefaultDispatcher");
    }

    public final void F0(jf.f fVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.D;
        this.f10762c.d(runnable, k.f10772f, false);
    }

    public final void G0(jf.f fVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.D;
        this.f10762c.d(runnable, k.f10772f, true);
    }
}
