package s0;

import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14328a = b.f14330a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f14329b = c.f14331a;

    public static final class a {
    }

    public static final class b extends k implements l<c, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14330a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            j.f(cVar, "it");
            cVar.H = true;
            n.a(cVar);
            return m.f8717a;
        }
    }

    public static final class c extends k implements l<c, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14331a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            c cVar = (c) obj;
            j.f(cVar, "it");
            cVar.E();
            return m.f8717a;
        }
    }

    static {
        new a();
    }
}
