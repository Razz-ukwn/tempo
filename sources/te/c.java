package te;

import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference<Runnable> implements b {
    public c(Runnable runnable) {
        super(runnable);
    }

    public final void a() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    public final boolean b() {
        return get() == null;
    }

    public final String toString() {
        return "RunnableDisposable(disposed=" + b() + ", " + get() + ")";
    }
}
