package z9;

import android.util.Log;
import androidx.databinding.a;
import com.google.android.gms.tasks.Task;
import ga.f;
import java.util.concurrent.TimeoutException;
import z9.b0;

public final class k implements b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f17849a;

    public k(p pVar) {
        this.f17849a = pVar;
    }

    public final void a(f fVar, Thread thread, Throwable th) {
        Task<TContinuationResult> continueWithTask;
        p pVar = this.f17849a;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            g gVar = pVar.f17866d;
            m mVar = new m(pVar, currentTimeMillis, th, thread, fVar);
            synchronized (gVar.f17829c) {
                continueWithTask = gVar.f17828b.continueWithTask(gVar.f17827a, new i(mVar));
                gVar.f17828b = continueWithTask.continueWith(gVar.f17827a, new a());
            }
            try {
                j0.a(continueWithTask);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", (Throwable) null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
