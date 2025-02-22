package z2;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.d;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.g;
import r6.f;
import y2.b;
import z2.b;

public abstract class a<D> extends b<D> {

    /* renamed from: g  reason: collision with root package name */
    public final Executor f17665g;

    /* renamed from: h  reason: collision with root package name */
    public volatile a<D>.a f17666h;

    /* renamed from: i  reason: collision with root package name */
    public volatile a<D>.a f17667i;

    /* renamed from: z2.a$a  reason: collision with other inner class name */
    public final class C0329a extends c<Void, Void, D> implements Runnable {
        public final CountDownLatch D = new CountDownLatch(1);

        public C0329a() {
        }

        public final void a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            a.this.c();
        }

        public final void b(D d10) {
            CountDownLatch countDownLatch = this.D;
            try {
                a aVar = a.this;
                if (aVar.f17667i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f17667i = null;
                    aVar.b();
                }
            } finally {
                countDownLatch.countDown();
            }
        }

        public final void c(D d10) {
            try {
                a aVar = a.this;
                if (aVar.f17666h != this) {
                    if (aVar.f17667i == this) {
                        SystemClock.uptimeMillis();
                        aVar.f17667i = null;
                        aVar.b();
                    }
                } else if (!aVar.f17671d) {
                    SystemClock.uptimeMillis();
                    aVar.f17666h = null;
                    b.a<D> aVar2 = aVar.f17669b;
                    if (aVar2 != null) {
                        b.a aVar3 = (b.a) aVar2;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.k(d10);
                        } else {
                            aVar3.i(d10);
                        }
                    }
                }
            } finally {
                this.D.countDown();
            }
        }

        public final void run() {
            a.this.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = c.B;
        this.f17665g = threadPoolExecutor;
    }

    public final void b() {
        if (this.f17667i == null && this.f17666h != null) {
            this.f17666h.getClass();
            a<D>.a aVar = this.f17666h;
            Executor executor = this.f17665g;
            if (aVar.f17676c != 1) {
                int c3 = g.c(aVar.f17676c);
                if (c3 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (c3 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.f17676c = 2;
                aVar.f17674a.f17684a = null;
                executor.execute(aVar.f17675b);
            }
        }
    }

    public final void c() {
        f fVar = (f) this;
        Iterator it = fVar.f14078k.iterator();
        if (!it.hasNext()) {
            try {
                fVar.f14077j.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
            }
        } else {
            ((d) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
    }
}
