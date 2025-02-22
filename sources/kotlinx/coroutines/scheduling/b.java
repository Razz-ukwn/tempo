package kotlinx.coroutines.scheduling;

import ag.c0;
import ag.d1;
import d2.f1;
import java.util.concurrent.Executor;
import jf.f;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.w;

public final class b extends d1 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final b f10758c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final g f10759d;

    static {
        l lVar = l.f10774c;
        int i8 = w.f10739a;
        if (64 >= i8) {
            i8 = 64;
        }
        f10759d = (g) lVar.I0(f1.M("kotlinx.coroutines.io.parallelism", i8, 0, 0, 12));
    }

    public final void F0(f fVar, Runnable runnable) {
        f10759d.F0(fVar, runnable);
    }

    public final void G0(f fVar, Runnable runnable) {
        f10759d.G0(fVar, runnable);
    }

    public final c0 I0(int i8) {
        return l.f10774c.I0(1);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        F0(jf.g.f10014a, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
