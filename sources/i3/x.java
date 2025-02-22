package i3;

import ff.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import sf.j;
import u2.b;

public final class x implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9562a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<Runnable> f9563b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public Runnable f9564c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f9565d = new Object();

    public x(Executor executor) {
        j.f(executor, "executor");
        this.f9562a = executor;
    }

    public final void a() {
        synchronized (this.f9565d) {
            Runnable poll = this.f9563b.poll();
            Runnable runnable = poll;
            this.f9564c = runnable;
            if (poll != null) {
                this.f9562a.execute(runnable);
            }
            m mVar = m.f8717a;
        }
    }

    public final void execute(Runnable runnable) {
        j.f(runnable, "command");
        synchronized (this.f9565d) {
            this.f9563b.offer(new b(1, runnable, this));
            if (this.f9564c == null) {
                a();
            }
            m mVar = m.f8717a;
        }
    }
}
