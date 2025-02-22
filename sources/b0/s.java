package b0;

import b0.u;
import ff.m;
import gf.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import sf.j;
import v.a;
import v.b;
import w.d;
import w.f;

public final class s<K, V> extends r<K, V, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(u<K, V> uVar) {
        super(uVar);
        j.f(uVar, "map");
    }

    public final boolean add(Object obj) {
        v.a();
        throw null;
    }

    public final boolean addAll(Collection collection) {
        j.f(collection, "elements");
        v.a();
        throw null;
    }

    public final boolean contains(Object obj) {
        return this.f2956a.containsValue(obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        j.f(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object containsValue : iterable) {
            if (!this.f2956a.containsValue(containsValue)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        u<K, V> uVar = this.f2956a;
        return new f0(uVar, ((a) uVar.a().f2961c.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        Object obj2;
        u<K, V> uVar = this.f2956a;
        Iterator it = uVar.f2958b.iterator();
        while (true) {
            if (!((d0) it).hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = ((c0) it).next();
            if (j.a(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        uVar.remove(entry.getKey());
        return true;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        b<K, ? extends V> bVar;
        int i8;
        boolean z10;
        h i10;
        j.f(collection, "elements");
        Set R0 = q.R0(collection);
        u<K, V> uVar = this.f2956a;
        boolean z11 = false;
        do {
            synchronized (v.f2963a) {
                u.a aVar = uVar.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u.a aVar2 = (u.a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                m mVar = m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            Iterator it = uVar.f2958b.iterator();
            while (true) {
                z10 = true;
                if (!((d0) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (R0.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            m mVar2 = m.f8717a;
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

    public final boolean retainAll(Collection<? extends Object> collection) {
        b<K, ? extends V> bVar;
        int i8;
        boolean z10;
        h i10;
        j.f(collection, "elements");
        Set R0 = q.R0(collection);
        u<K, V> uVar = this.f2956a;
        boolean z11 = false;
        do {
            synchronized (v.f2963a) {
                u.a aVar = uVar.f2957a;
                j.d(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u.a aVar2 = (u.a) m.h(aVar);
                bVar = aVar2.f2961c;
                i8 = aVar2.f2962d;
                m mVar = m.f8717a;
            }
            j.c(bVar);
            f builder = bVar.builder();
            Iterator it = uVar.f2958b.iterator();
            while (true) {
                z10 = true;
                if (!((d0) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (!R0.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            m mVar2 = m.f8717a;
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
