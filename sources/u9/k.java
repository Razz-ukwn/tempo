package u9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import qa.b;
import t9.p;

public final /* synthetic */ class k implements b {
    public final Object get() {
        p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f6324a;
        return new i(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f6327d.get());
    }
}
