package j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.z;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d extends z {

    /* renamed from: b  reason: collision with root package name */
    public final Object f9671b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f9672c = Executors.newFixedThreadPool(4, new a());

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f9673d;

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9674a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f9674a.getAndIncrement());
            return thread;
        }
    }

    public static Handler F(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
