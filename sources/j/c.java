package j;

import android.os.Looper;
import androidx.fragment.app.z;

public final class c extends z {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f9668c;

    /* renamed from: d  reason: collision with root package name */
    public static final b f9669d = new b(0);

    /* renamed from: b  reason: collision with root package name */
    public final d f9670b = new d();

    public static c F() {
        if (f9668c != null) {
            return f9668c;
        }
        synchronized (c.class) {
            if (f9668c == null) {
                f9668c = new c();
            }
        }
        return f9668c;
    }

    public final boolean G() {
        this.f9670b.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void H(Runnable runnable) {
        d dVar = this.f9670b;
        if (dVar.f9673d == null) {
            synchronized (dVar.f9671b) {
                if (dVar.f9673d == null) {
                    dVar.f9673d = d.F(Looper.getMainLooper());
                }
            }
        }
        dVar.f9673d.post(runnable);
    }
}
