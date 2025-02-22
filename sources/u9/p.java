package u9;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum p implements Executor {
    ;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f15940b = null;

    /* access modifiers changed from: public */
    static {
        f15940b = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: public */
    p() {
    }

    public final void execute(Runnable runnable) {
        f15940b.post(runnable);
    }
}
