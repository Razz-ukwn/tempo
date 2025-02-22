package ag;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public final class t0 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f485a;

    public t0(ScheduledFuture scheduledFuture) {
        this.f485a = scheduledFuture;
    }

    public final void a() {
        this.f485a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f485a + ']';
    }
}
