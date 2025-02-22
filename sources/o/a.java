package o;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class a<K, V> extends f<K, V> implements Map<K, V> {
    public a<K, V>.a D;
    public a<K, V>.c E;
    public a<K, V>.e F;

    /* renamed from: o.a$a  reason: collision with other inner class name */
    public final class C0228a extends AbstractSet<Map.Entry<K, V>> {
        public C0228a() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final int size() {
            return a.this.f12032c;
        }
    }

    public final class b extends c<K> {
        public b() {
            super(a.this.f12032c);
        }

        public final K a(int i8) {
            return a.this.i(i8);
        }

        public final void b(int i8) {
            a.this.k(i8);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f12003a;

        /* renamed from: b  reason: collision with root package name */
        public int f12004b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12005c;

        public d() {
            this.f12003a = a.this.f12032c - 1;
        }

        public final boolean equals(Object obj) {
            if (!this.f12005c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i8 = this.f12004b;
                a aVar = a.this;
                Object i10 = aVar.i(i8);
                if (!(key == i10 || (key != null && key.equals(i10)))) {
                    return false;
                }
                Object value = entry.getValue();
                Object m = aVar.m(this.f12004b);
                return value == m || (value != null && value.equals(m));
            }
        }

        public final K getKey() {
            if (this.f12005c) {
                return a.this.i(this.f12004b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f12005c) {
                return a.this.m(this.f12004b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f12004b < this.f12003a;
        }

        public final int hashCode() {
            if (this.f12005c) {
                int i8 = this.f12004b;
                a aVar = a.this;
                Object i10 = aVar.i(i8);
                Object m = aVar.m(this.f12004b);
                int i11 = 0;
                int hashCode = i10 == null ? 0 : i10.hashCode();
                if (m != null) {
                    i11 = m.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f12004b++;
                this.f12005c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f12005c) {
                a.this.k(this.f12004b);
                this.f12004b--;
                this.f12003a--;
                this.f12005c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v3) {
            if (this.f12005c) {
                return a.this.l(this.f12004b, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends c<V> {
        public f() {
            super(a.this.f12032c);
        }

        public final V a(int i8) {
            return a.this.m(i8);
        }

        public final void b(int i8) {
            a.this.k(i8);
        }
    }

    public a() {
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        a<K, V>.a aVar2 = new C0228a();
        this.D = aVar2;
        return aVar2;
    }

    public final Set<K> keySet() {
        a<K, V>.c cVar = this.E;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.E = cVar2;
        return cVar2;
    }

    public final boolean n(Collection<?> collection) {
        int i8 = this.f12032c;
        for (int i10 = i8 - 1; i10 >= 0; i10--) {
            if (!collection.contains(i(i10))) {
                k(i10);
            }
        }
        return i8 != this.f12032c;
    }

    public final Object[] o(int i8, Object[] objArr) {
        int i10 = this.f12032c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = this.f12031b[(i11 << 1) + i8];
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f12032c);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        a<K, V>.e eVar = this.F;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.F = eVar2;
        return eVar2;
    }

    public a(int i8) {
        super(i8);
    }

    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            a.this.clear();
        }

        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        public final boolean containsAll(Collection<?> collection) {
            a aVar = a.this;
            aVar.getClass();
            for (Object containsKey : collection) {
                if (!aVar.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size() && containsAll(set)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        public final int hashCode() {
            a aVar = a.this;
            int i8 = 0;
            for (int i10 = aVar.f12032c - 1; i10 >= 0; i10--) {
                Object i11 = aVar.i(i10);
                i8 += i11 == null ? 0 : i11.hashCode();
            }
            return i8;
        }

        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new b();
        }

        public final boolean remove(Object obj) {
            a aVar = a.this;
            int e10 = aVar.e(obj);
            if (e10 < 0) {
                return false;
            }
            aVar.k(e10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f12032c;
            for (Object remove : collection) {
                aVar.remove(remove);
            }
            return i8 != aVar.f12032c;
        }

        public final boolean retainAll(Collection<?> collection) {
            return a.this.n(collection);
        }

        public final int size() {
            return a.this.f12032c;
        }

        public final Object[] toArray() {
            a aVar = a.this;
            int i8 = aVar.f12032c;
            Object[] objArr = new Object[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                objArr[i10] = aVar.i(i10);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return a.this.o(0, tArr);
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            a.this.clear();
        }

        public final boolean contains(Object obj) {
            return a.this.h(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new f();
        }

        public final boolean remove(Object obj) {
            a aVar = a.this;
            int h3 = aVar.h(obj);
            if (h3 < 0) {
                return false;
            }
            aVar.k(h3);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f12032c;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < i8) {
                if (collection.contains(aVar.m(i10))) {
                    aVar.k(i10);
                    i10--;
                    i8--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f12032c;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < i8) {
                if (!collection.contains(aVar.m(i10))) {
                    aVar.k(i10);
                    i10--;
                    i8--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public final int size() {
            return a.this.f12032c;
        }

        public final Object[] toArray() {
            a aVar = a.this;
            int i8 = aVar.f12032c;
            Object[] objArr = new Object[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                objArr[i10] = aVar.m(i10);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return a.this.o(1, tArr);
        }
    }

    public a(a aVar) {
        if (aVar != null) {
            j(aVar);
        }
    }
}
