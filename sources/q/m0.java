package q;

import q.p;
import rf.l;
import sf.j;

public final class m0<T, V extends p> implements l0<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final l<T, V> f12728a;

    /* renamed from: b  reason: collision with root package name */
    public final l<V, T> f12729b;

    public m0(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        j.f(lVar, "convertToVector");
        j.f(lVar2, "convertFromVector");
        this.f12728a = lVar;
        this.f12729b = lVar2;
    }

    public final l<T, V> a() {
        return this.f12728a;
    }

    public final l<V, T> b() {
        return this.f12729b;
    }
}
