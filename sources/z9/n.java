package z9;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ga.b;
import java.util.concurrent.Executor;
import z9.p;

public final class n implements SuccessContinuation<b, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f17858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f17859b;

    public n(o oVar, Executor executor) {
        this.f17859b = oVar;
        this.f17858a = executor;
    }

    public final Task then(Object obj) {
        if (((b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", (Throwable) null);
            return Tasks.forResult(null);
        }
        o oVar = this.f17859b;
        p.b(p.this);
        p.a aVar = oVar.f17861b;
        p.this.f17873k.e((String) null, this.f17858a);
        p.this.f17876o.trySetResult(null);
        return Tasks.forResult(null);
    }
}
