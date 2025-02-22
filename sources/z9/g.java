package z9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f17827a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Void> f17828b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f17829c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f17830d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g.this.f17830d.set(Boolean.TRUE);
        }
    }

    public g(Executor executor) {
        this.f17827a = executor;
        executor.execute(new a());
    }

    public final <T> Task<T> a(Callable<T> callable) {
        Task<TContinuationResult> continueWith;
        synchronized (this.f17829c) {
            continueWith = this.f17828b.continueWith(this.f17827a, new i(callable));
            this.f17828b = continueWith.continueWith(this.f17827a, new androidx.databinding.a());
        }
        return continueWith;
    }
}
