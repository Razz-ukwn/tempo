package h4;

import androidx.lifecycle.e;
import androidx.lifecycle.j;
import androidx.lifecycle.o;

public final class g extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final g f9142b = new g();

    /* renamed from: c  reason: collision with root package name */
    public static final f f9143c = new f();

    public final void a(o oVar) {
        if (oVar instanceof e) {
            e eVar = (e) oVar;
            eVar.getClass();
            f fVar = f9143c;
            e.c(fVar);
            eVar.s(fVar);
            eVar.b(fVar);
            return;
        }
        throw new IllegalArgumentException((oVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public final j.b b() {
        return j.b.f2281e;
    }

    public final void c(o oVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
