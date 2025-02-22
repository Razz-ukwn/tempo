package z9;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ea.d;
import ea.e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import z9.p;

public final class o implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f17860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.a f17861b;

    public o(p.a aVar, Boolean bool) {
        this.f17861b = aVar;
        this.f17860a = bool;
    }

    public final Object call() {
        Boolean bool = this.f17860a;
        boolean booleanValue = bool.booleanValue();
        p.a aVar = this.f17861b;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", (Throwable) null);
            }
            p pVar = p.this;
            for (File delete : e.e(pVar.f17868f.f7904b.listFiles(p.f17862p))) {
                delete.delete();
            }
            p pVar2 = p.this;
            e eVar = pVar2.f17873k.f17843b.f7901b;
            d.a(e.e(eVar.f7906d.listFiles()));
            d.a(e.e(eVar.f7907e.listFiles()));
            d.a(e.e(eVar.f7908f.listFiles()));
            pVar2.f17876o.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", (Throwable) null);
        }
        boolean booleanValue2 = bool.booleanValue();
        c0 c0Var = p.this.f17864b;
        if (booleanValue2) {
            c0Var.f17809h.trySetResult(null);
            Executor executor = p.this.f17866d.f17827a;
            return aVar.f17877a.onSuccessTask(executor, new n(this, executor));
        }
        c0Var.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
