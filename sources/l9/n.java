package l9;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f11020a;

    public n() {
        this.f11020a = null;
    }

    public n(TaskCompletionSource taskCompletionSource) {
        this.f11020a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f11020a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f11020a;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
