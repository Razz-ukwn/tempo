package q7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import u6.q;

public final class w3 extends j4 {
    public static final AtomicLong G = new AtomicLong(Long.MIN_VALUE);
    public final LinkedBlockingQueue B = new LinkedBlockingQueue();
    public final t3 C = new t3(this, "Thread death: Uncaught exception on worker thread");
    public final t3 D = new t3(this, "Thread death: Uncaught exception on network thread");
    public final Object E = new Object();
    public final Semaphore F = new Semaphore(2);

    /* renamed from: c  reason: collision with root package name */
    public v3 f13398c;

    /* renamed from: d  reason: collision with root package name */
    public v3 f13399d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f13400e = new PriorityBlockingQueue();

    public w3(x3 x3Var) {
        super(x3Var);
    }

    public final void i() {
        if (Thread.currentThread() != this.f13398c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean j() {
        return false;
    }

    public final void m() {
        if (Thread.currentThread() != this.f13399d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r4 = ((q7.x3) r2.f13121a).E;
        q7.x3.l(r4);
        r4.E.b("Timed out waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = ((q7.x3) r2.f13121a).E;
        q7.x3.l(r4);
        r4.E.b("Interrupted waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 != null) goto L_0x002d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.util.concurrent.atomic.AtomicReference r3, long r4, java.lang.String r6, java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = "Interrupted waiting for "
            monitor-enter(r3)
            q7.k4 r1 = r2.f13121a     // Catch:{ all -> 0x0043 }
            q7.x3 r1 = (q7.x3) r1     // Catch:{ all -> 0x0043 }
            q7.w3 r1 = r1.F     // Catch:{ all -> 0x0043 }
            q7.x3.l(r1)     // Catch:{ all -> 0x0043 }
            r1.q(r7)     // Catch:{ all -> 0x0043 }
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L_0x002d
            q7.k4 r4 = r2.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.s2 r4 = r4.E
            q7.x3.l(r4)
            q7.q2 r4 = r4.E
            java.lang.String r5 = "Timed out waiting for "
            java.lang.String r5 = r5.concat(r6)
            r4.b(r5)
        L_0x002d:
            return r3
        L_0x002e:
            q7.k4 r4 = r2.f13121a     // Catch:{ all -> 0x0043 }
            q7.x3 r4 = (q7.x3) r4     // Catch:{ all -> 0x0043 }
            q7.s2 r4 = r4.E     // Catch:{ all -> 0x0043 }
            q7.x3.l(r4)     // Catch:{ all -> 0x0043 }
            q7.q2 r4 = r4.E     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = r0.concat(r6)     // Catch:{ all -> 0x0043 }
            r4.b(r5)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            return r3
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.w3.n(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final u3 o(Callable callable) {
        k();
        u3 u3Var = new u3(this, callable, false);
        if (Thread.currentThread() == this.f13398c) {
            if (!this.f13400e.isEmpty()) {
                s2 s2Var = ((x3) this.f13121a).E;
                x3.l(s2Var);
                s2Var.E.b("Callable skipped the worker queue.");
            }
            u3Var.run();
        } else {
            t(u3Var);
        }
        return u3Var;
    }

    public final void p(Runnable runnable) {
        k();
        u3 u3Var = new u3(this, runnable, false, "Task exception on network thread");
        synchronized (this.E) {
            this.B.add(u3Var);
            v3 v3Var = this.f13399d;
            if (v3Var == null) {
                v3 v3Var2 = new v3(this, "Measurement Network", this.B);
                this.f13399d = v3Var2;
                v3Var2.setUncaughtExceptionHandler(this.D);
                this.f13399d.start();
            } else {
                synchronized (v3Var.f13380a) {
                    v3Var.f13380a.notifyAll();
                }
            }
        }
    }

    public final void q(Runnable runnable) {
        k();
        q.i(runnable);
        t(new u3(this, runnable, false, "Task exception on worker thread"));
    }

    public final void r(Runnable runnable) {
        k();
        t(new u3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean s() {
        return Thread.currentThread() == this.f13398c;
    }

    public final void t(u3 u3Var) {
        synchronized (this.E) {
            this.f13400e.add(u3Var);
            v3 v3Var = this.f13398c;
            if (v3Var == null) {
                v3 v3Var2 = new v3(this, "Measurement Worker", this.f13400e);
                this.f13398c = v3Var2;
                v3Var2.setUncaughtExceptionHandler(this.C);
                this.f13398c.start();
            } else {
                synchronized (v3Var.f13380a) {
                    v3Var.f13380a.notifyAll();
                }
            }
        }
    }
}
