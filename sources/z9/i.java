package z9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

public final class i implements Continuation<Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f17841a;

    public i(Callable callable) {
        this.f17841a = callable;
    }

    public final Object then(Task<Void> task) {
        return this.f17841a.call();
    }
}
