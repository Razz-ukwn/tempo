package ab;

import hb.a;
import hb.b;
import java.util.concurrent.atomic.AtomicLong;

public final class g extends a0<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f244a;

    public g(a0 a0Var) {
        this.f244a = a0Var;
    }

    public final Object a(a aVar) {
        return new AtomicLong(((Number) this.f244a.a(aVar)).longValue());
    }

    public final void b(b bVar, Object obj) {
        this.f244a.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
