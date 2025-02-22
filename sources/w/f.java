package w;

import cb.c;
import gf.g;
import java.util.Map;
import sf.j;
import y.a;

public final class f<K, V> extends g<K, V> {
    public int B;

    /* renamed from: a  reason: collision with root package name */
    public d<K, V> f16443a;

    /* renamed from: b  reason: collision with root package name */
    public c f16444b = new c();

    /* renamed from: c  reason: collision with root package name */
    public t<K, V> f16445c;

    /* renamed from: d  reason: collision with root package name */
    public V f16446d;

    /* renamed from: e  reason: collision with root package name */
    public int f16447e;

    public f(d<K, V> dVar) {
        j.f(dVar, "map");
        this.f16443a = dVar;
        this.f16445c = dVar.f16438a;
        this.B = dVar.f16439b;
    }

    public final d<K, V> a() {
        t<K, V> tVar = this.f16445c;
        d<K, V> dVar = this.f16443a;
        if (tVar != dVar.f16438a) {
            this.f16444b = new c();
            dVar = new d<>(this.f16445c, this.B);
        }
        this.f16443a = dVar;
        return dVar;
    }

    public final void b(int i8) {
        this.B = i8;
        this.f16447e++;
    }

    public final void clear() {
        t tVar = t.f16457e;
        t<K, V> tVar2 = t.f16457e;
        j.d(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f16445c = tVar2;
        b(0);
    }

    public final boolean containsKey(Object obj) {
        return this.f16445c.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public final V get(Object obj) {
        return this.f16445c.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public final V put(K k10, V v3) {
        this.f16446d = null;
        this.f16445c = this.f16445c.l(k10 != null ? k10.hashCode() : 0, k10, v3, 0, this);
        return this.f16446d;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        j.f(map, "from");
        d dVar = null;
        d dVar2 = map instanceof d ? (d) map : null;
        if (dVar2 == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVar = fVar.a();
            }
        } else {
            dVar = dVar2;
        }
        if (dVar != null) {
            a aVar = new a(0);
            int i8 = this.B;
            t<K, V> tVar = this.f16445c;
            t<K, V> tVar2 = dVar.f16438a;
            j.d(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f16445c = tVar.m(tVar2, 0, aVar, this);
            int i10 = (dVar.f16439b + i8) - aVar.f17103a;
            if (i8 != i10) {
                b(i10);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public final boolean remove(Object obj, Object obj2) {
        int i8 = this.B;
        t<K, V> o10 = this.f16445c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o10 == null) {
            t tVar = t.f16457e;
            o10 = t.f16457e;
            j.d(o10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f16445c = o10;
        if (i8 != this.B) {
            return true;
        }
        return false;
    }

    public final V remove(Object obj) {
        this.f16446d = null;
        t<K, V> n2 = this.f16445c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n2 == null) {
            t tVar = t.f16457e;
            n2 = t.f16457e;
            j.d(n2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f16445c = n2;
        return this.f16446d;
    }
}
