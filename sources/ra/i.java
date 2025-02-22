package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
import ta.a;

public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource<String> f14179a;

    public i(TaskCompletionSource<String> taskCompletionSource) {
        this.f14179a = taskCompletionSource;
    }

    public final boolean a(Exception exc) {
        return false;
    }

    public final boolean b(a aVar) {
        if (!(aVar.f() == 3)) {
            if (!(aVar.f() == 4)) {
                if (!(aVar.f() == 5)) {
                    return false;
                }
            }
        }
        this.f14179a.trySetResult(aVar.f15506b);
        return true;
    }
}
