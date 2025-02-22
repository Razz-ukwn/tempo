package kotlinx.coroutines.internal;

import ag.c0;
import ag.k0;
import ag.l;
import ag.n0;
import ag.u0;
import cb.b;
import jf.f;

public final class g extends c0 implements Runnable, n0 {
    public final j<Runnable> B;
    public final Object C;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f10711c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10712d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n0 f10713e;
    private volatile int runningWorkers;

    public g(c0 c0Var, int i8) {
        this.f10711c = c0Var;
        this.f10712d = i8;
        n0 n0Var = c0Var instanceof n0 ? (n0) c0Var : null;
        this.f10713e = n0Var == null ? k0.f428a : n0Var;
        this.B = new j<>();
        this.C = new Object();
    }

    public final void F0(f fVar, Runnable runnable) {
        this.B.a(runnable);
        boolean z10 = true;
        if (!(this.runningWorkers >= this.f10712d)) {
            synchronized (this.C) {
                if (this.runningWorkers >= this.f10712d) {
                    z10 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z10) {
                this.f10711c.F0(this, this);
            }
        }
    }

    public final void G0(f fVar, Runnable runnable) {
        this.B.a(runnable);
        boolean z10 = true;
        if (!(this.runningWorkers >= this.f10712d)) {
            synchronized (this.C) {
                if (this.runningWorkers >= this.f10712d) {
                    z10 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z10) {
                this.f10711c.G0(this, this);
            }
        }
    }

    public final c0 I0(int i8) {
        b.r(1);
        return 1 >= this.f10712d ? this : super.I0(1);
    }

    public final void f0(long j10, l lVar) {
        this.f10713e.f0(j10, lVar);
    }

    public final u0 m0(long j10, Runnable runnable, f fVar) {
        return this.f10713e.m0(j10, runnable, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r3.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.B.c() != 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.runningWorkers++;
        r1 = ff.m.f8717a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            kotlinx.coroutines.internal.j<java.lang.Runnable> r1 = r3.B
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0029
            r1.run()     // Catch:{ all -> 0x000f }
            goto L_0x0015
        L_0x000f:
            r1 = move-exception
            jf.g r2 = jf.g.f10014a
            d2.f1.z(r2, r1)
        L_0x0015:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L_0x0001
            ag.c0 r1 = r3.f10711c
            boolean r1 = r1.H0()
            if (r1 == 0) goto L_0x0001
            ag.c0 r0 = r3.f10711c
            r0.F0(r3, r3)
            return
        L_0x0029:
            java.lang.Object r0 = r3.C
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0046 }
            int r1 = r1 + -1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0046 }
            kotlinx.coroutines.internal.j<java.lang.Runnable> r1 = r3.B     // Catch:{ all -> 0x0046 }
            int r1 = r1.c()     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x003c
            monitor-exit(r0)
            return
        L_0x003c:
            int r1 = r3.runningWorkers     // Catch:{ all -> 0x0046 }
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch:{ all -> 0x0046 }
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)
            goto L_0x0000
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.run():void");
    }
}
