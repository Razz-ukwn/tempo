package a7;

import android.os.Looper;
import j7.b;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final b f122a;

    public a(Looper looper) {
        this.f122a = new b(looper);
    }

    public final void execute(Runnable runnable) {
        this.f122a.post(runnable);
    }
}
