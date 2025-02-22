package z9;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import j0.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f17848a = f0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(Task<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f17848a, new p(countDownLatch, 4));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new TimeoutException();
        }
    }
}
