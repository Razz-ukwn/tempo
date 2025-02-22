package z9;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ga.b;
import java.util.concurrent.Executor;

public final class l implements SuccessContinuation<b, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f17850a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17851b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f17852c;

    public l(m mVar, Executor executor, String str) {
        this.f17852c = mVar;
        this.f17850a = executor;
        this.f17851b = str;
    }

    public final Task then(Object obj) {
        String str = null;
        if (((b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", (Throwable) null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        m mVar = this.f17852c;
        taskArr[0] = p.b(mVar.B);
        i0 i0Var = mVar.B.f17873k;
        if (mVar.f17857e) {
            str = this.f17851b;
        }
        taskArr[1] = i0Var.e(str, this.f17850a);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
