package db;

import ab.a0;
import ab.u;
import ab.x;
import ab.y;
import h0.e;
import hb.a;
import hb.b;
import q.g;

public final class j extends a0<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final i f7428b = new i(new j(x.f280b));

    /* renamed from: a  reason: collision with root package name */
    public final y f7429a;

    public j(x.b bVar) {
        this.f7429a = bVar;
    }

    public final Object a(a aVar) {
        int k02 = aVar.k0();
        int c3 = g.c(k02);
        if (c3 == 5 || c3 == 6) {
            return this.f7429a.a(aVar);
        }
        if (c3 == 8) {
            aVar.d0();
            return null;
        }
        throw new u("Expecting number, got: " + e.d(k02) + "; at path " + aVar.u());
    }

    public final void b(b bVar, Object obj) {
        bVar.Q((Number) obj);
    }
}
