package b0;

import ff.m;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import sf.j;
import tf.c;
import v.b;
import w.d;
import w.f;

public final class u<K, V> implements Map<K, V>, g0, c {

    /* renamed from: a  reason: collision with root package name */
    public a f2957a;

    /* renamed from: b  reason: collision with root package name */
    public final p f2958b = new p(this);

    /* renamed from: c  reason: collision with root package name */
    public final q f2959c = new q(this);

    /* renamed from: d  reason: collision with root package name */
    public final s f2960d = new s(this);

    public static final class a<K, V> extends h0 {

        /* renamed from: c  reason: collision with root package name */
        public b<K, ? extends V> f2961c;

        /* renamed from: d  reason: collision with root package name */
        public int f2962d;

        public a(b<K, ? extends V> bVar) {
            j.f(bVar, "map");
            this.f2961c = bVar;
        }

        public final void a(h0 h0Var) {
            a aVar = (a) h0Var;
            synchronized (v.f2963a) {
                this.f2961c = aVar.f2961c;
                this.f2962d = aVar.f2962d;
                m mVar = m.f8717a;
            }
        }

        public final h0 b() {
            return new a(this.f2961c);
        }

        public final void c(b<K, ? extends V> bVar) {
            j.f(bVar, "<set-?>");
            this.f2961c = bVar;
        }
    }

    public u() {
        d dVar = d.f16437c;
        j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.f2957a = new a(dVar);
    }

    public final a<K, V> a() {
        a aVar = this.f2957a;
        j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) m.q(aVar, this);
    }

    public final h0 c() {
        return this.f2957a;
    }

    public final void clear() {
        h i8;
        a aVar = this.f2957a;
        j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        d dVar = d.f16437c;
        j.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (dVar != ((a) m.h(aVar)).f2961c) {
            synchronized (v.f2963a) {
                a aVar2 = this.f2957a;
                j.d(aVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (m.f2942c) {
                    i8 = m.i();
                    a aVar3 = (a) m.t(aVar2, this, i8);
                    aVar3.f2961c = dVar;
                    aVar3.f2962d++;
                }
                m.l(i8, this);
            }
        }
    }

    public final boolean containsKey(Object obj) {
        return a().f2961c.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return a().f2961c.containsValue(obj);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f2958b;
    }

    public final V get(Object obj) {
        return a().f2961c.get(obj);
    }

    public final void i(h0 h0Var) {
        this.f2957a = (a) h0Var;
    }

    public final boolean isEmpty() {
        return a().f2961c.isEmpty();
    }

    public final Set<K> keySet() {
        return this.f2959c;
    }

    public final V put(K k10, V v3) {
        b<K, ? extends V> bVar;
        int i8;
        V put;
        h i10;
        boolean z10;
        do {
            Object obj = v.f2963a;
            synchronized (obj) {
                a aVar = this.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                m mVar = m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            put = builder.put(k10, v3);
            d a10 = builder.a();
            if (j.a(a10, bVar)) {
                break;
            }
            synchronized (obj) {
                a aVar3 = this.f2957a;
                j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (m.f2942c) {
                    i10 = m.i();
                    a aVar4 = (a) m.t(aVar3, this, i10);
                    if (aVar4.f2962d == i8) {
                        aVar4.c(a10);
                        z10 = true;
                        aVar4.f2962d++;
                    } else {
                        z10 = false;
                    }
                }
                m.l(i10, this);
            }
        } while (!z10);
        return put;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b<K, ? extends V> bVar;
        int i8;
        h i10;
        boolean z10;
        j.f(map, "from");
        do {
            Object obj = v.f2963a;
            synchronized (obj) {
                a aVar = this.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                m mVar = m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            builder.putAll(map);
            d a10 = builder.a();
            if (!j.a(a10, bVar)) {
                synchronized (obj) {
                    a aVar3 = this.f2957a;
                    j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    synchronized (m.f2942c) {
                        i10 = m.i();
                        a aVar4 = (a) m.t(aVar3, this, i10);
                        if (aVar4.f2962d == i8) {
                            aVar4.c(a10);
                            z10 = true;
                            aVar4.f2962d++;
                        } else {
                            z10 = false;
                        }
                    }
                    m.l(i10, this);
                }
            } else {
                return;
            }
        } while (!z10);
    }

    public final V remove(Object obj) {
        b<K, ? extends V> bVar;
        int i8;
        V remove;
        h i10;
        boolean z10;
        do {
            Object obj2 = v.f2963a;
            synchronized (obj2) {
                a aVar = this.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                m mVar = m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            remove = builder.remove(obj);
            d a10 = builder.a();
            if (j.a(a10, bVar)) {
                break;
            }
            synchronized (obj2) {
                a aVar3 = this.f2957a;
                j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (m.f2942c) {
                    i10 = m.i();
                    a aVar4 = (a) m.t(aVar3, this, i10);
                    if (aVar4.f2962d == i8) {
                        aVar4.c(a10);
                        z10 = true;
                        aVar4.f2962d++;
                    } else {
                        z10 = false;
                    }
                }
                m.l(i10, this);
            }
        } while (!z10);
        return remove;
    }

    public final int size() {
        return a().f2961c.size();
    }

    public final Collection<V> values() {
        return this.f2960d;
    }
}
