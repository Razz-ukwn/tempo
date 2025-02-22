package ag;

import ff.m;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f420a;

    public h(ScheduledFuture scheduledFuture) {
        this.f420a = scheduledFuture;
    }

    public final void a(Throwable th) {
        if (th != null) {
            this.f420a.cancel(false);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return m.f8717a;
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f420a + ']';
    }
}
