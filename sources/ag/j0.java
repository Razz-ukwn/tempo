package ag;

import ag.z0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import jf.f;

public final class j0 extends z0 implements Runnable {
    public static final j0 E;
    public static final long F;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        j0 j0Var = new j0();
        E = j0Var;
        j0Var.L0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        F = timeUnit.toNanos(l10.longValue());
    }

    public final Thread P0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final void Q0(long j10, z0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final void S0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.S0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void X0() {
        int i8 = debugStatus;
        if (i8 == 2 || i8 == 3) {
            debugStatus = 3;
            V0();
            notifyAll();
        }
    }

    public final u0 m0(long j10, Runnable runnable, f fVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return z1.f519a;
        }
        long nanoTime = System.nanoTime();
        z0.b bVar = new z0.b(runnable, j11 + nanoTime);
        W0(nanoTime, bVar);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0096, code lost:
        _thread = null;
        X0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009f, code lost:
        if (U0() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a1, code lost:
        P0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal<ag.y0> r0 = ag.i2.f422a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch:{ all -> 0x0091 }
            int r0 = debugStatus     // Catch:{ all -> 0x0093 }
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L_0x0016
            if (r0 != r3) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r5
            goto L_0x0017
        L_0x0016:
            r0 = r6
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r5
            goto L_0x0023
        L_0x001c:
            debugStatus = r6     // Catch:{ all -> 0x0093 }
            r17.notifyAll()     // Catch:{ all -> 0x0093 }
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            r0 = r6
        L_0x0023:
            if (r0 != 0) goto L_0x0034
            _thread = r2
            r17.X0()
            boolean r0 = r17.U0()
            if (r0 != 0) goto L_0x0033
            r17.P0()
        L_0x0033:
            return
        L_0x0034:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L_0x003a:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0091 }
            long r11 = r17.N0()     // Catch:{ all -> 0x0091 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L_0x006d
            long r15 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0091 }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            long r9 = F     // Catch:{ all -> 0x0091 }
            long r9 = r9 + r15
        L_0x0052:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0067
            _thread = r2
            r17.X0()
            boolean r0 = r17.U0()
            if (r0 != 0) goto L_0x0066
            r17.P0()
        L_0x0066:
            return
        L_0x0067:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            r11 = r15
            goto L_0x006e
        L_0x006d:
            r9 = r7
        L_0x006e:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            int r0 = debugStatus     // Catch:{ all -> 0x0091 }
            if (r0 == r4) goto L_0x007b
            if (r0 != r3) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r0 = r5
            goto L_0x007c
        L_0x007b:
            r0 = r6
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            _thread = r2
            r17.X0()
            boolean r0 = r17.U0()
            if (r0 != 0) goto L_0x008c
            r17.P0()
        L_0x008c:
            return
        L_0x008d:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch:{ all -> 0x0091 }
            goto L_0x003a
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0096:
            _thread = r2
            r17.X0()
            boolean r2 = r17.U0()
            if (r2 != 0) goto L_0x00a4
            r17.P0()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.j0.run():void");
    }

    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
