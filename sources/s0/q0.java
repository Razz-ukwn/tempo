package s0;

import d0.g;
import sf.j;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14424a;

    public static final class a extends g.c {
        public final String toString() {
            return "<Head>";
        }
    }

    static {
        a aVar = new a();
        aVar.f7179c = -1;
        f14424a = aVar;
    }

    public static final int a(g.b bVar, g.b bVar2) {
        j.f(bVar, "prev");
        j.f(bVar2, "next");
        if (j.a(bVar, bVar2)) {
            return 2;
        }
        return bVar.getClass() == bVar2.getClass() ? 1 : 0;
    }
}
