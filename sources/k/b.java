package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f10235a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f10236b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f10237c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f10238d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f10242d;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f10241c;
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    public static class C0185b<K, V> extends e<K, V> {
        public C0185b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f10241c;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f10242d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f10239a;

        /* renamed from: b  reason: collision with root package name */
        public final V f10240b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f10241c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f10242d;

        public c(K k10, V v3) {
            this.f10239a = k10;
            this.f10240b = v3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10239a.equals(cVar.f10239a) && this.f10240b.equals(cVar.f10240b);
        }

        public final K getKey() {
            return this.f10239a;
        }

        public final V getValue() {
            return this.f10240b;
        }

        public final int hashCode() {
            return this.f10239a.hashCode() ^ this.f10240b.hashCode();
        }

        public final V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f10239a + "=" + this.f10240b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f10243a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10244b = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f10243a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f10242d;
                this.f10243a = cVar3;
                this.f10244b = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f10244b) {
                return b.this.f10235a != null;
            }
            c<K, V> cVar = this.f10243a;
            return (cVar == null || cVar.f10241c == null) ? false : true;
        }

        public final Object next() {
            if (this.f10244b) {
                this.f10244b = false;
                this.f10243a = b.this.f10235a;
            } else {
                c<K, V> cVar = this.f10243a;
                this.f10243a = cVar != null ? cVar.f10241c : null;
            }
            return this.f10243a;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f10246a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f10247b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f10246a = cVar2;
            this.f10247b = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f10246a == cVar && cVar == this.f10247b) {
                this.f10247b = null;
                this.f10246a = null;
            }
            c<K, V> cVar3 = this.f10246a;
            if (cVar3 == cVar) {
                this.f10246a = b(cVar3);
            }
            c<K, V> cVar4 = this.f10247b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f10246a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f10247b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            return this.f10247b != null;
        }

        public final Object next() {
            c<K, V> cVar = this.f10247b;
            c<K, V> cVar2 = this.f10246a;
            this.f10247b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f10235a;
        while (cVar != null && !cVar.f10239a.equals(k10)) {
            cVar = cVar.f10241c;
        }
        return cVar;
    }

    public V b(K k10, V v3) {
        c a10 = a(k10);
        if (a10 != null) {
            return a10.f10240b;
        }
        c<K, V> cVar = new c<>(k10, v3);
        this.f10238d++;
        c<K, V> cVar2 = this.f10236b;
        if (cVar2 == null) {
            this.f10235a = cVar;
            this.f10236b = cVar;
            return null;
        }
        cVar2.f10241c = cVar;
        cVar.f10242d = cVar2;
        this.f10236b = cVar;
        return null;
    }

    public V c(K k10) {
        c a10 = a(k10);
        if (a10 == null) {
            return null;
        }
        this.f10238d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f10237c;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> a11 : weakHashMap.keySet()) {
                a11.a(a10);
            }
        }
        c<K, V> cVar = a10.f10242d;
        if (cVar != null) {
            cVar.f10241c = a10.f10241c;
        } else {
            this.f10235a = a10.f10241c;
        }
        c<K, V> cVar2 = a10.f10241c;
        if (cVar2 != null) {
            cVar2.f10242d = cVar;
        } else {
            this.f10236b = cVar;
        }
        a10.f10241c = null;
        a10.f10242d = null;
        return a10.f10240b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((k.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof k.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            k.b r7 = (k.b) r7
            int r1 = r6.f10238d
            int r3 = r7.f10238d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            k.b$e r3 = (k.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            k.b$e r4 = (k.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            k.b$e r7 = (k.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i8;
            }
            i8 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f10235a, this.f10236b);
        this.f10237c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
