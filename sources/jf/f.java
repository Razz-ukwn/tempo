package jf;

import jf.e;
import rf.p;
import sf.j;
import sf.k;

public interface f {

    public static final class a {

        /* renamed from: jf.f$a$a  reason: collision with other inner class name */
        public static final class C0183a extends k implements p<f, b, f> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0183a f10013a = new C0183a();

            public C0183a() {
                super(2);
            }

            public final Object invoke(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                j.f(fVar, "acc");
                j.f(bVar, "element");
                f w02 = fVar.w0(bVar.getKey());
                g gVar = g.f10014a;
                if (w02 == gVar) {
                    return bVar;
                }
                int i8 = e.f10011s;
                e.a aVar = e.a.f10012a;
                e eVar = (e) w02.d(aVar);
                if (eVar == null) {
                    cVar = new c(bVar, w02);
                } else {
                    f w03 = w02.w0(aVar);
                    if (w03 == gVar) {
                        return new c(eVar, bVar);
                    }
                    cVar = new c(eVar, new c(bVar, w03));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            j.f(fVar2, "context");
            return fVar2 == g.f10014a ? fVar : (f) fVar2.p(fVar, C0183a.f10013a);
        }
    }

    public interface b extends f {

        public static final class a {
            public static <E extends b> E a(b bVar, c<E> cVar) {
                j.f(cVar, "key");
                if (j.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                j.f(cVar, "key");
                return j.a(bVar.getKey(), cVar) ? g.f10014a : bVar;
            }
        }

        <E extends b> E d(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <E extends b> E d(c<E> cVar);

    f n0(f fVar);

    <R> R p(R r10, p<? super R, ? super b, ? extends R> pVar);

    f w0(c<?> cVar);
}
