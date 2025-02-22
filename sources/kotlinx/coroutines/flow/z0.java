package kotlinx.coroutines.flow;

import dg.b;
import dg.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.d;

public final class z0 extends c<y0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10696a = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    public final boolean a(b bVar) {
        y0 y0Var = (y0) bVar;
        if (this._state != null) {
            return false;
        }
        this._state = androidx.fragment.app.z0.E;
        return true;
    }

    public final d[] b(b bVar) {
        y0 y0Var = (y0) bVar;
        this._state = null;
        return androidx.fragment.app.z0.f2175a;
    }
}
