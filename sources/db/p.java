package db;

import ab.a0;
import ab.i;
import db.n;
import hb.a;
import hb.b;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class p<T> extends a0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i f7457a;

    /* renamed from: b  reason: collision with root package name */
    public final a0<T> f7458b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f7459c;

    public p(i iVar, a0<T> a0Var, Type type) {
        this.f7457a = iVar;
        this.f7458b = a0Var;
        this.f7459c = type;
    }

    public final T a(a aVar) {
        return this.f7458b.a(aVar);
    }

    public final void b(b bVar, T t2) {
        Type type = this.f7459c;
        Type type2 = (t2 == null || (type != Object.class && !(type instanceof TypeVariable) && !(type instanceof Class))) ? type : t2.getClass();
        a0<T> a0Var = this.f7458b;
        if (type2 != type) {
            a0<T> c3 = this.f7457a.c(new gb.a(type2));
            if (!(c3 instanceof n.a) || (a0Var instanceof n.a)) {
                a0Var = c3;
            }
        }
        a0Var.b(bVar, t2);
    }
}
