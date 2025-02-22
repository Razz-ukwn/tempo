package af;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import te.b;
import xe.a;
import ze.b;

public final class f extends AtomicReference<Future<?>> implements Callable<Void>, b {

    /* renamed from: c  reason: collision with root package name */
    public static final FutureTask<Void> f357c;

    /* renamed from: d  reason: collision with root package name */
    public static final FutureTask<Void> f358d;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f359a;

    /* renamed from: b  reason: collision with root package name */
    public Thread f360b;

    static {
        a.C0317a aVar = a.f17070a;
        f357c = new FutureTask<>(aVar, (Object) null);
        f358d = new FutureTask<>(aVar, (Object) null);
    }

    public f(b.a aVar) {
        this.f359a = aVar;
    }

    public final void a() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f357c && future != (futureTask = f358d) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f360b != Thread.currentThread());
        }
    }

    public final void b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f357c) {
                if (future2 == f358d) {
                    future.cancel(this.f360b != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final Object call() {
        FutureTask<Void> futureTask = f357c;
        this.f360b = Thread.currentThread();
        try {
            this.f359a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f360b = null;
        }
    }
}
