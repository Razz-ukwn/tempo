package wa;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.emoji2.text.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import g3.d;
import j0.p;
import java.util.concurrent.Executor;
import wa.i;
import wa.j0;

public final class i0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16611b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f16612a;

    public interface a {
    }

    public i0(i.a aVar) {
        this.f16612a = aVar;
    }

    public final void a(j0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = aVar.f16619a;
            i iVar = i.this;
            iVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            iVar.f16605a.execute(new g(4, iVar, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener((Executor) new d(2), new p(aVar, 7));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
