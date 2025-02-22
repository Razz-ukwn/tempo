package f9;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f8618a;

    public l() {
        this.f8618a = null;
    }

    public l(TaskCompletionSource taskCompletionSource) {
        this.f8618a = taskCompletionSource;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f8618a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
