package u4;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f15714b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f15715c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f15716a;

    /* renamed from: u4.a$a  reason: collision with other inner class name */
    public static final class C0289a implements ThreadFactory {

        /* renamed from: u4.a$a$a  reason: collision with other inner class name */
        public class C0290a extends Thread {
            public C0290a(Runnable runnable) {
                super(runnable);
            }

            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            return new C0290a(runnable);
        }
    }

    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadFactory f15717a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15718b;

        /* renamed from: c  reason: collision with root package name */
        public final c f15719c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15720d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicInteger f15721e = new AtomicInteger();

        /* renamed from: u4.a$b$a  reason: collision with other inner class name */
        public class C0291a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f15722a;

            public C0291a(Runnable runnable) {
                this.f15722a = runnable;
            }

            public final void run() {
                b bVar = b.this;
                if (bVar.f15720d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f15722a.run();
                } catch (Throwable th) {
                    bVar.f15719c.a(th);
                }
            }
        }

        public b(C0289a aVar, String str, boolean z10) {
            c.C0292a aVar2 = c.f15724a;
            this.f15717a = aVar;
            this.f15718b = str;
            this.f15719c = aVar2;
            this.f15720d = z10;
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f15717a.newThread(new C0291a(runnable));
            newThread.setName("glide-" + this.f15718b + "-thread-" + this.f15721e.getAndIncrement());
            return newThread;
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0292a f15724a = new C0292a();

        /* renamed from: u4.a$c$a  reason: collision with other inner class name */
        public class C0292a implements c {
            public final void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f15716a = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f15716a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f15716a.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f15716a.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f15716a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f15716a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f15716a.isTerminated();
    }

    public final void shutdown() {
        this.f15716a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f15716a.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f15716a.submit(runnable);
    }

    public final String toString() {
        return this.f15716a.toString();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f15716a.invokeAll(collection, j10, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f15716a.invokeAny(collection, j10, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t2) {
        return this.f15716a.submit(runnable, t2);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f15716a.submit(callable);
    }
}
