package u9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import qa.b;
import t9.p;

public final /* synthetic */ class l implements b {
    public final Object get() {
        p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f6324a;
        return new i(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), ExecutorsRegistrar.f6327d.get());
    }
}
