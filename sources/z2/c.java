package z2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<Params, Progress, Result> {
    public static final ThreadPoolExecutor B;
    public static e C;

    /* renamed from: a  reason: collision with root package name */
    public final b f17674a;

    /* renamed from: b  reason: collision with root package name */
    public final C0330c f17675b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f17676c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f17677d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f17678e = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17679a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f17679a.getAndIncrement());
        }
    }

    public class b extends f<Params, Result> {
        public b() {
        }

        public final Result call() {
            c cVar = c.this;
            cVar.f17678e.set(true);
            try {
                Process.setThreadPriority(10);
                cVar.a(this.f17684a);
                Binder.flushPendingCommands();
                cVar.d((Object) null);
                return null;
            } catch (Throwable th) {
                cVar.d((Object) null);
                throw th;
            }
        }
    }

    /* renamed from: z2.c$c  reason: collision with other inner class name */
    public class C0330c extends FutureTask<Result> {
        public C0330c(b bVar) {
            super(bVar);
        }

        public final void done() {
            c cVar = c.this;
            try {
                Object obj = get();
                if (!cVar.f17678e.get()) {
                    cVar.d(obj);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (CancellationException unused) {
                if (!cVar.f17678e.get()) {
                    cVar.d((Object) null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static class d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f17682a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f17683b;

        public d(c cVar, Data... dataArr) {
            this.f17682a = cVar;
            this.f17683b = dataArr;
        }
    }

    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i8 = message.what;
            if (i8 == 1) {
                c cVar = dVar.f17682a;
                Data data = dVar.f17683b[0];
                if (cVar.f17677d.get()) {
                    cVar.b(data);
                } else {
                    cVar.c(data);
                }
                cVar.f17676c = 3;
            } else if (i8 == 2) {
                dVar.f17682a.getClass();
            }
        }
    }

    public static abstract class f<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f17684a;
    }

    static {
        a aVar = new a();
        B = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public c() {
        b bVar = new b();
        this.f17674a = bVar;
        this.f17675b = new C0330c(bVar);
    }

    public abstract void a(Object... objArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Object obj) {
        e eVar;
        synchronized (c.class) {
            if (C == null) {
                C = new e();
            }
            eVar = C;
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }
}
