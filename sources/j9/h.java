package j9;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f9872a;

    public h() {
        this.f9872a = null;
    }

    public h(TaskCompletionSource taskCompletionSource) {
        this.f9872a = taskCompletionSource;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f9872a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
