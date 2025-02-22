package cf;

import java.util.concurrent.Callable;
import ue.b;
import ue.d;

public final class a {
    public static se.a a(Callable<se.a> callable) {
        try {
            se.a call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw bf.a.a(th);
        }
    }

    public static void b(Throwable th) {
        if (!((th instanceof b) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof ue.a))) {
            th = new d(th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
    }
}
