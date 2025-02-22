package z9;

import android.util.Log;
import ea.e;
import java.io.File;
import java.util.concurrent.Callable;
import t.w2;

public final class y implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f17909a;

    public y(x xVar) {
        this.f17909a = xVar;
    }

    public final Object call() {
        boolean z10;
        p pVar = this.f17909a.f17901g;
        w2 w2Var = pVar.f17865c;
        e eVar = (e) w2Var.f15269b;
        eVar.getClass();
        if (!new File(eVar.f7904b, (String) w2Var.f15268a).exists()) {
            String e10 = pVar.e();
            if (e10 == null || !pVar.f17871i.c(e10)) {
                z10 = false;
                return Boolean.valueOf(z10);
            }
        } else {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", (Throwable) null);
            }
            e eVar2 = (e) w2Var.f15269b;
            eVar2.getClass();
            new File(eVar2.f7904b, (String) w2Var.f15268a).delete();
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
