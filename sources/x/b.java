package x;

import androidx.lifecycle.s0;
import gf.i;
import java.util.Iterator;
import sf.j;
import t.z1;
import v.c;
import w.d;
import w.t;

public final class b<E> extends i<E> implements c<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final b f16812d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16813a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16814b;

    /* renamed from: c  reason: collision with root package name */
    public final d<E, a> f16815c;

    static {
        s0 s0Var = s0.f2318c;
        d dVar = d.f16437c;
        j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f16812d = new b(s0Var, s0Var, dVar);
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.f16813a = obj;
        this.f16814b = obj2;
        this.f16815c = dVar;
    }

    public final int a() {
        d<E, a> dVar = this.f16815c;
        dVar.getClass();
        return dVar.f16439b;
    }

    public final boolean contains(Object obj) {
        return this.f16815c.containsKey(obj);
    }

    public final Iterator<E> iterator() {
        return new c(this.f16813a, this.f16815c);
    }

    public final b remove(Object obj) {
        d<E, a> dVar = this.f16815c;
        a aVar = dVar.get(obj);
        if (aVar == null) {
            return this;
        }
        boolean z10 = false;
        int hashCode = obj != null ? obj.hashCode() : 0;
        t<K, V> tVar = dVar.f16438a;
        t<K, V> v3 = tVar.v(obj, hashCode, 0);
        if (tVar != v3) {
            if (v3 == null) {
                dVar = d.f16437c;
                j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            } else {
                dVar = new d<>(v3, dVar.f16439b - 1);
            }
        }
        s0 s0Var = s0.f2318c;
        Object obj2 = aVar.f16810a;
        boolean z11 = obj2 != s0Var;
        Object obj3 = aVar.f16811b;
        if (z11) {
            a aVar2 = dVar.get(obj2);
            j.c(aVar2);
            dVar = dVar.a(obj2, new a(aVar2.f16810a, obj3));
        }
        if (obj3 != s0Var) {
            a aVar3 = dVar.get(obj3);
            j.c(aVar3);
            dVar = dVar.a(obj3, new a(obj2, aVar3.f16811b));
        }
        Object obj4 = !(obj2 != s0Var) ? obj3 : this.f16813a;
        if (obj3 != s0Var) {
            z10 = true;
        }
        if (z10) {
            obj2 = this.f16814b;
        }
        return new b(obj4, obj2, dVar);
    }

    public final b t(z1.c cVar) {
        d<E, a> dVar = this.f16815c;
        if (dVar.containsKey(cVar)) {
            return this;
        }
        if (isEmpty()) {
            return new b(cVar, cVar, dVar.a(cVar, new a()));
        }
        Object obj = this.f16814b;
        a aVar = dVar.get(obj);
        j.c(aVar);
        return new b(this.f16813a, cVar, dVar.a(obj, new a(aVar.f16810a, cVar)).a(cVar, new a(obj, s0.f2318c)));
    }
}
