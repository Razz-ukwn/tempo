package w;

import java.util.Map;
import java.util.NoSuchElementException;
import sf.j;
import tf.c;

public final class c<K, V> extends b<K, V> implements c.a {

    /* renamed from: c  reason: collision with root package name */
    public final i<K, V> f16435c;

    /* renamed from: d  reason: collision with root package name */
    public V f16436d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(i<K, V> iVar, K k10, V v3) {
        super(k10, v3);
        j.f(iVar, "parentIterator");
        this.f16435c = iVar;
        this.f16436d = v3;
    }

    public final V getValue() {
        return this.f16436d;
    }

    public final V setValue(V v3) {
        V v10 = this.f16436d;
        this.f16436d = v3;
        g<K, V, Map.Entry<K, V>> gVar = this.f16435c.f16451a;
        f<K, V> fVar = gVar.f16448d;
        K k10 = this.f16433a;
        if (fVar.containsKey(k10)) {
            boolean z10 = gVar.f16442c;
            if (!z10) {
                fVar.put(k10, v3);
            } else if (z10) {
                u<K, V, T> uVar = gVar.f16440a[gVar.f16441b];
                Object obj = uVar.f16464a[uVar.f16466c];
                fVar.put(k10, v3);
                gVar.c(obj != null ? obj.hashCode() : 0, fVar.f16445c, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            gVar.C = fVar.f16447e;
        }
        return v10;
    }
}
