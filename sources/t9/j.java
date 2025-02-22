package t9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import ia.a;
import j0.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import na.c;
import na.d;
import qa.b;

public final class j implements c, a {

    /* renamed from: g  reason: collision with root package name */
    public static final h f15467g = new h(0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15468a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15469b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f15470c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final n f15471d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<Boolean> f15472e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public final f f15473f;

    public j(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        n nVar = new n(executor);
        this.f15471d = nVar;
        this.f15473f = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(nVar, n.class, d.class, c.class));
        arrayList3.add(b.b(this, a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f15473f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (o e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f15468a.isEmpty()) {
                k.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f15468a.keySet());
                arrayList6.addAll(arrayList3);
                k.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                b bVar2 = (b) it4.next();
                this.f15468a.put(bVar2, new p(new g(this, bVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f15472e.get();
        if (bool != null) {
            h(this.f15468a, bool.booleanValue());
        }
    }

    public final synchronized <T> b<T> c(u<T> uVar) {
        if (uVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (b) this.f15469b.get(uVar);
    }

    public final <T> qa.a<T> d(u<T> uVar) {
        b<T> c3 = c(uVar);
        return c3 == null ? new t(t.f15491c, t.f15492d) : c3 instanceof t ? (t) c3 : new t((f) null, c3);
    }

    public final synchronized <T> b<Set<T>> f(u<T> uVar) {
        q qVar = (q) this.f15470c.get(uVar);
        if (qVar != null) {
            return qVar;
        }
        return f15467g;
    }

    public final void h(Map<b<?>, b<?>> map, boolean z10) {
        ArrayDeque<na.a> arrayDeque;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            b bVar = (b) next.getValue();
            int i8 = ((b) next.getKey()).f15451d;
            boolean z11 = false;
            if (!(i8 == 1)) {
                if (i8 == 2) {
                    z11 = true;
                }
                if (z11) {
                    if (!z10) {
                    }
                }
            }
            bVar.get();
        }
        n nVar = this.f15471d;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f15484b;
                if (arrayDeque != null) {
                    nVar.f15484b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (na.a aVar : arrayDeque) {
                aVar.getClass();
                synchronized (nVar) {
                    ArrayDeque arrayDeque2 = nVar.f15484b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar);
                    } else {
                        synchronized (nVar) {
                            Map map2 = (Map) nVar.f15483a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new u2.b(3, entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void i() {
        for (b bVar : this.f15468a.keySet()) {
            Iterator<l> it = bVar.f15450c.iterator();
            while (true) {
                if (it.hasNext()) {
                    l next = it.next();
                    boolean z10 = true;
                    boolean z11 = next.f15480b == 2;
                    u<?> uVar = next.f15479a;
                    if (z11) {
                        HashMap hashMap = this.f15470c;
                        if (!hashMap.containsKey(uVar)) {
                            hashMap.put(uVar, new q(Collections.emptySet()));
                        }
                    }
                    HashMap hashMap2 = this.f15469b;
                    if (hashMap2.containsKey(uVar)) {
                        continue;
                    } else {
                        int i8 = next.f15480b;
                        if (!(i8 == 1)) {
                            if (i8 != 2) {
                                z10 = false;
                            }
                            if (!z10) {
                                hashMap2.put(uVar, new t(t.f15491c, t.f15492d));
                            }
                        } else {
                            throw new r(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, uVar}));
                        }
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f15452e == 0) {
                b bVar2 = (b) this.f15468a.get(bVar);
                for (u next : bVar.f15449b) {
                    HashMap hashMap = this.f15469b;
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, bVar2);
                    } else {
                        arrayList2.add(new u2.b(2, (t) ((b) hashMap.get(next)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f15468a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!(bVar.f15452e == 0)) {
                b bVar2 = (b) entry.getValue();
                for (u next : bVar.f15449b) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f15470c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((u) entry2.getKey(), new q((Set) ((Collection) entry2.getValue())));
            } else {
                q qVar = (q) hashMap2.get(entry2.getKey());
                for (b aVar : (Set) entry2.getValue()) {
                    arrayList.add(new a2.a(4, qVar, aVar));
                }
            }
        }
        return arrayList;
    }
}
