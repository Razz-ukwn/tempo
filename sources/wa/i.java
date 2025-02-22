package wa;

import a7.b;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.emoji2.text.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import wa.i0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class i extends Service {
    public static final /* synthetic */ int B = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f16605a;

    /* renamed from: b  reason: collision with root package name */
    public i0 f16606b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16607c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f16608d;

    /* renamed from: e  reason: collision with root package name */
    public int f16609e = 0;

    public class a implements i0.a {
        public a() {
        }
    }

    public i() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f16605a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            h0.a(intent);
        }
        synchronized (this.f16607c) {
            int i8 = this.f16609e - 1;
            this.f16609e = i8;
            if (i8 == 0) {
                stopSelfResult(this.f16608d);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f16606b == null) {
            this.f16606b = new i0(new a());
        }
        return this.f16606b;
    }

    public final void onDestroy() {
        this.f16605a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i8, int i10) {
        synchronized (this.f16607c) {
            this.f16608d = i10;
            this.f16609e++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16605a.execute(new g(4, this, b10, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) new j.a(2), new h(this, intent));
        return 3;
    }
}
