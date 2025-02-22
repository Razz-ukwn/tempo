package db;

import ab.a0;
import ab.b0;
import ab.i;
import cb.h;
import cb.s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f7411a;

    public static final class a<E> extends a0<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final p f7412a;

        /* renamed from: b  reason: collision with root package name */
        public final s<? extends Collection<E>> f7413b;

        public a(i iVar, Type type, a0<E> a0Var, s<? extends Collection<E>> sVar) {
            this.f7412a = new p(iVar, a0Var, type);
            this.f7413b = sVar;
        }

        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            Collection collection = (Collection) this.f7413b.g();
            aVar.c();
            while (aVar.F()) {
                collection.add(this.f7412a.a(aVar));
            }
            aVar.p();
            return collection;
        }

        public final void b(hb.b bVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                bVar.z();
                return;
            }
            bVar.d();
            for (Object b10 : collection) {
                this.f7412a.b(bVar, b10);
            }
            bVar.p();
        }
    }

    public b(h hVar) {
        this.f7411a = hVar;
    }

    public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
        Type type = aVar.f8929b;
        Class<Collection> cls = Collection.class;
        Class<? super T> cls2 = aVar.f8928a;
        if (!cls.isAssignableFrom(cls2)) {
            return null;
        }
        Type g10 = cb.a.g(type, cls2, cls);
        Class cls3 = g10 instanceof ParameterizedType ? ((ParameterizedType) g10).getActualTypeArguments()[0] : Object.class;
        return new a(iVar, cls3, iVar.c(new gb.a(cls3)), this.f7411a.a(aVar));
    }
}
