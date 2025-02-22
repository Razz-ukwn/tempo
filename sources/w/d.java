package w;

import sf.j;
import v.b;
import w.t;
import x.a;

public final class d<K, V> extends gf.d<K, V> implements b<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public static final d f16437c = new d(t.f16457e, 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<K, V> f16438a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16439b;

    public d(t<K, V> tVar, int i8) {
        j.f(tVar, "node");
        this.f16438a = tVar;
        this.f16439b = i8;
    }

    public final d a(Object obj, a aVar) {
        t.a u7 = this.f16438a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return u7 == null ? this : new d(u7.f16462a, this.f16439b + u7.f16463b);
    }

    public final f builder() {
        return new f(this);
    }

    public final boolean containsKey(Object obj) {
        return this.f16438a.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public final V get(Object obj) {
        return this.f16438a.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }
}
