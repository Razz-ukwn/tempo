package ag;

import androidx.fragment.app.z0;
import cb.b;
import ff.m;
import java.lang.Thread;
import java.util.List;
import jf.f;
import yf.k;
import yf.o;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<d0> f417a = o.r0(k.n0(e0.a()));

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (d0 T : f417a) {
            try {
                T.T(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    z0.c(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            z0.c(th, new o0(fVar));
            m mVar = m.f8717a;
        } catch (Throwable th4) {
            b.u(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
