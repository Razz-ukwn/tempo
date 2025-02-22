package z9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class e0 extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f17819b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f17820c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f17821d;

    public e0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f17818a = str;
        this.f17819b = executorService;
        this.f17821d = timeUnit;
    }

    public final void a() {
        String str = this.f17818a;
        ExecutorService executorService = this.f17819b;
        boolean z10 = false;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, (Throwable) null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(this.f17820c, this.f17821d)) {
                String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, (Throwable) null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", format, (Throwable) null);
            }
            executorService.shutdownNow();
        }
    }
}
