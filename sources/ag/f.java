package ag;

import java.util.concurrent.locks.LockSupport;
import sf.j;

public final class f<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Thread f415c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f416d;

    public f(jf.f fVar, Thread thread, y0 y0Var) {
        super(fVar, true);
        this.f415c = thread;
        this.f416d = y0Var;
    }

    public final void v(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f415c;
        if (!j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
