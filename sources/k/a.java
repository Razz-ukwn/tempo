package k;

import java.util.HashMap;
import k.b;

public final class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f10234e = new HashMap<>();

    public final b.c<K, V> a(K k10) {
        return this.f10234e.get(k10);
    }

    public final V b(K k10, V v3) {
        b.c a10 = a(k10);
        if (a10 != null) {
            return a10.f10240b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f10234e;
        b.c<K, V> cVar = new b.c<>(k10, v3);
        this.f10238d++;
        b.c<K, V> cVar2 = this.f10236b;
        if (cVar2 == null) {
            this.f10235a = cVar;
            this.f10236b = cVar;
        } else {
            cVar2.f10241c = cVar;
            cVar.f10242d = cVar2;
            this.f10236b = cVar;
        }
        hashMap.put(k10, cVar);
        return null;
    }

    public final V c(K k10) {
        V c3 = super.c(k10);
        this.f10234e.remove(k10);
        return c3;
    }
}
