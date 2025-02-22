package db;

import ab.a0;
import ab.b0;
import ab.i;
import hb.b;

public final class u implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f7498b;

    public class a extends a0<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f7499a;

        public a(Class cls) {
            this.f7499a = cls;
        }

        public final Object a(hb.a aVar) {
            Object a10 = u.this.f7498b.a(aVar);
            if (a10 != null) {
                Class cls = this.f7499a;
                if (!cls.isInstance(a10)) {
                    throw new ab.u("Expected a " + cls.getName() + " but was " + a10.getClass().getName() + "; at path " + aVar.D());
                }
            }
            return a10;
        }

        public final void b(b bVar, Object obj) {
            u.this.f7498b.b(bVar, obj);
        }
    }

    public u(Class cls, a0 a0Var) {
        this.f7497a = cls;
        this.f7498b = a0Var;
    }

    public final <T2> a0<T2> a(i iVar, gb.a<T2> aVar) {
        Class<? super T> cls = aVar.f8928a;
        if (!this.f7497a.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f7497a.getName() + ",adapter=" + this.f7498b + "]";
    }
}
