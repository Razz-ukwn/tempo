package w;

import java.util.Map;
import sf.j;

public final class x<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    public final i<K, V> f16467d;

    public x(i<K, V> iVar) {
        j.f(iVar, "parentIterator");
        this.f16467d = iVar;
    }

    public final Object next() {
        int i8 = this.f16466c + 2;
        this.f16466c = i8;
        Object[] objArr = this.f16464a;
        return new c(this.f16467d, objArr[i8 - 2], objArr[i8 - 1]);
    }
}
