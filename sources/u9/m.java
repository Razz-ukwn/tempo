package u9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import qa.b;
import t9.p;

public final /* synthetic */ class m implements b {
    public final Object get() {
        p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f6324a;
        return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
    }
}
