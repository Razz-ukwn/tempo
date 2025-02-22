package z9;

import com.google.android.gms.tasks.Task;
import ga.d;
import ga.f;
import java.util.concurrent.Callable;

public final class v implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f17891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f17892b;

    public v(x xVar, d dVar) {
        this.f17892b = xVar;
        this.f17891a = dVar;
    }

    public final Object call() {
        return x.a(this.f17892b, this.f17891a);
    }
}
