package e9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f9.k;
import f9.n;
import f9.t;
import g9.a;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final h f7880a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7881b;

    public e(h hVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f7880a = hVar;
        this.f7881b = context;
    }

    public final Task<a> a() {
        String packageName = this.f7881b.getPackageName();
        k kVar = h.f7887e;
        h hVar = this.f7880a;
        t tVar = hVar.f7889a;
        if (tVar == null) {
            Object[] objArr = {-9};
            kVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k.b(kVar.f8617a, "onError(%d)", objArr));
            }
            return Tasks.forException(new a(-9));
        }
        kVar.a("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        tVar.a().post(new n(tVar, taskCompletionSource, taskCompletionSource, new n(hVar, taskCompletionSource, packageName, taskCompletionSource)));
        return taskCompletionSource.getTask();
    }
}
