package b0;

import b0.u;
import d2.f1;
import gf.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import sf.j;
import tf.a;
import tf.c;
import v.b;
import w.d;
import w.f;

public final class p<K, V> extends r<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(u<K, V> uVar) {
        super(uVar);
        j.f(uVar, "map");
    }

    public final boolean add(Object obj) {
        j.f((Map.Entry) obj, "element");
        v.a();
        throw null;
    }

    public final boolean addAll(Collection collection) {
        j.f(collection, "elements");
        v.a();
        throw null;
    }

    public final boolean contains(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof a) || (obj instanceof c.a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        return j.a(this.f2956a.get(entry.getKey()), entry.getValue());
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Map.Entry contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        u<K, V> uVar = this.f2956a;
        return new c0(uVar, ((v.a) uVar.a().f2961c.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof a) || (obj instanceof c.a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "element");
        return this.f2956a.remove(entry.getKey()) != null;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (this.f2956a.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
        }
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        b<K, ? extends V> bVar;
        int i8;
        boolean z10;
        h i10;
        j.f(collection, "elements");
        Iterable<Map.Entry> iterable = collection;
        int B = f1.B(m.n0(iterable));
        if (B < 16) {
            B = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(B);
        for (Map.Entry entry : iterable) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        u<K, V> uVar = this.f2956a;
        boolean z11 = false;
        do {
            synchronized (v.f2963a) {
                u.a aVar = uVar.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u.a aVar2 = (u.a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                ff.m mVar = ff.m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            Iterator it = uVar.f2958b.iterator();
            while (true) {
                z10 = true;
                if (!((d0) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((c0) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !j.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z11 = true;
                }
            }
            ff.m mVar2 = ff.m.f8717a;
            d a10 = builder.a();
            if (j.a(a10, bVar)) {
                break;
            }
            synchronized (v.f2963a) {
                u.a aVar3 = uVar.f2957a;
                j.d(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (m.f2942c) {
                    i10 = m.i();
                    u.a aVar4 = (u.a) m.t(aVar3, uVar, i10);
                    if (aVar4.f2962d == i8) {
                        aVar4.c(a10);
                        aVar4.f2962d++;
                    } else {
                        z10 = false;
                    }
                }
                m.l(i10, uVar);
            }
        } while (!z10);
        return z11;
    }
}
