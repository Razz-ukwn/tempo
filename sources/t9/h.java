package t9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import qa.b;
import u9.a;
import u9.i;

public final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15465a;

    public /* synthetic */ h(int i8) {
        this.f15465a = i8;
    }

    public final Object get() {
        switch (this.f15465a) {
            case 0:
                return Collections.emptySet();
            default:
                p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f6324a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new i(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f6327d.get());
        }
    }
}
