package ag;

import ag.n1;
import com.google.android.gms.common.api.internal.i0;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jf.f;
import kotlinx.coroutines.internal.c;

public final class e1 extends d1 implements n0 {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f413c;

    public e1(Executor executor) {
        this.f413c = executor;
        Method method = c.f10705a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = c.f10705a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void F0(f fVar, Runnable runnable) {
        try {
            this.f413c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            n1 n1Var = (n1) fVar.d(n1.b.f447a);
            if (n1Var != null) {
                n1Var.e(cancellationException);
            }
            s0.f481b.F0(fVar, runnable);
        }
    }

    public final void close() {
        Executor executor = this.f413c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e1) && ((e1) obj).f413c == this.f413c;
    }

    public final void f0(long j10, l lVar) {
        Executor executor = this.f413c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new i0(6, (Object) this, (Object) lVar), j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                n1 n1Var = (n1) lVar.f435e.d(n1.b.f447a);
                if (n1Var != null) {
                    n1Var.e(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            lVar.v(new h(scheduledFuture));
        } else {
            j0.E.f0(j10, lVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f413c);
    }

    public final u0 m0(long j10, Runnable runnable, f fVar) {
        Executor executor = this.f413c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                n1 n1Var = (n1) fVar.d(n1.b.f447a);
                if (n1Var != null) {
                    n1Var.e(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new t0(scheduledFuture) : j0.E.m0(j10, runnable, fVar);
    }

    public final String toString() {
        return this.f413c.toString();
    }
}
