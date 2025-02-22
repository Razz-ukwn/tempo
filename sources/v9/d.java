package v9;

import androidx.emoji2.text.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import z9.j0;
import z9.v;
import z9.x;

public final class d implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f16346a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f16347b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ga.d f16348c;

    public d(boolean z10, x xVar, ga.d dVar) {
        this.f16346a = z10;
        this.f16347b = xVar;
        this.f16348c = dVar;
    }

    public final Object call() {
        if (!this.f16346a) {
            return null;
        }
        x xVar = this.f16347b;
        xVar.getClass();
        v vVar = new v(xVar, this.f16348c);
        ExecutorService executorService = j0.f17848a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService2 = xVar.f17906l;
        executorService2.execute(new g(3, vVar, executorService2, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
