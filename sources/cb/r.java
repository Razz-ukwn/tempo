package cb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class r<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a D = new a();
    public r<K, V>.b B;
    public r<K, V>.c C;

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<? super K> f3933a;

    /* renamed from: b  reason: collision with root package name */
    public e<K, V> f3934b;

    /* renamed from: c  reason: collision with root package name */
    public int f3935c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3936d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final e<K, V> f3937e = new e<>();

    public class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends r<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        public final void clear() {
            r.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r0 = r2.f3938a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r3) {
            /*
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                cb.r r0 = cb.r.this
                cb.r$e r3 = r0.b(r3)
                if (r3 != 0) goto L_0x0011
                return r1
            L_0x0011:
                r1 = 1
                r0.d(r3, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.r.b.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return r.this.f3935c;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends r<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public final K next() {
                return a().B;
            }
        }

        public c() {
        }

        public final void clear() {
            r.this.clear();
        }

        public final boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                cb.r r0 = cb.r.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto L_0x000d
                cb.r$e r4 = r0.a(r1, r4)     // Catch:{ ClassCastException -> 0x000d }
                goto L_0x000e
            L_0x000d:
                r4 = 0
            L_0x000e:
                r2 = 1
                if (r4 == 0) goto L_0x0014
                r0.d(r4, r2)
            L_0x0014:
                if (r4 == 0) goto L_0x0017
                r1 = r2
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.r.c.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return r.this.f3935c;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f3940a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f3941b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f3942c;

        public d() {
            this.f3940a = r.this.f3937e.f3947d;
            this.f3942c = r.this.f3936d;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f3940a;
            r rVar = r.this;
            if (eVar == rVar.f3937e) {
                throw new NoSuchElementException();
            } else if (rVar.f3936d == this.f3942c) {
                this.f3940a = eVar.f3947d;
                this.f3941b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f3940a != r.this.f3937e;
        }

        public final void remove() {
            e<K, V> eVar = this.f3941b;
            if (eVar != null) {
                r rVar = r.this;
                rVar.d(eVar, true);
                this.f3941b = null;
                this.f3942c = rVar.f3936d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public r() {
        a aVar = D;
        this.f3933a = aVar;
    }

    public final e a(boolean z10, Object obj) {
        int i8;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f3934b;
        a aVar = D;
        Comparator<? super K> comparator = this.f3933a;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) obj : null;
            while (true) {
                K k10 = eVar2.B;
                i8 = comparable != null ? comparable.compareTo(k10) : comparator.compare(obj, k10);
                if (i8 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i8 < 0 ? eVar2.f3945b : eVar2.f3946c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i8 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f3937e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, obj, eVar4, eVar4.f3948e);
            if (i8 < 0) {
                eVar2.f3945b = eVar;
            } else {
                eVar2.f3946c = eVar;
            }
            c(eVar2, true);
        } else if (comparator != aVar || (obj instanceof Comparable)) {
            eVar = new e<>(eVar2, obj, eVar4, eVar4.f3948e);
            this.f3934b = eVar;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.f3935c++;
        this.f3936d++;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cb.r.e<K, V> b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            cb.r$e r0 = r5.a(r1, r0)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            if (r0 == 0) goto L_0x0028
            V r3 = r0.C
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = r1
            goto L_0x0025
        L_0x0024:
            r6 = r4
        L_0x0025:
            if (r6 == 0) goto L_0x0028
            r1 = r4
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            r2 = r0
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.r.b(java.util.Map$Entry):cb.r$e");
    }

    public final void c(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f3945b;
            e<K, V> eVar3 = eVar.f3946c;
            int i8 = 0;
            int i10 = eVar2 != null ? eVar2.D : 0;
            int i11 = eVar3 != null ? eVar3.D : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f3945b;
                e<K, V> eVar5 = eVar3.f3946c;
                int i13 = eVar5 != null ? eVar5.D : 0;
                if (eVar4 != null) {
                    i8 = eVar4.D;
                }
                int i14 = i8 - i13;
                if (i14 == -1 || (i14 == 0 && !z10)) {
                    g(eVar);
                } else {
                    h(eVar3);
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f3945b;
                e<K, V> eVar7 = eVar2.f3946c;
                int i15 = eVar7 != null ? eVar7.D : 0;
                if (eVar6 != null) {
                    i8 = eVar6.D;
                }
                int i16 = i8 - i15;
                if (i16 == 1 || (i16 == 0 && !z10)) {
                    h(eVar);
                } else {
                    g(eVar2);
                    h(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.D = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.D = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f3944a;
        }
    }

    public final void clear() {
        this.f3934b = null;
        this.f3935c = 0;
        this.f3936d++;
        e<K, V> eVar = this.f3937e;
        eVar.f3948e = eVar;
        eVar.f3947d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0008
            cb.r$e r2 = r1.a(r0, r2)     // Catch:{ ClassCastException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.r.containsKey(java.lang.Object):boolean");
    }

    public final void d(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        int i8;
        e<K, V> eVar3;
        if (z10) {
            e<K, V> eVar4 = eVar.f3948e;
            eVar4.f3947d = eVar.f3947d;
            eVar.f3947d.f3948e = eVar4;
        }
        e<K, V> eVar5 = eVar.f3945b;
        e<K, V> eVar6 = eVar.f3946c;
        e<K, V> eVar7 = eVar.f3944a;
        int i10 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.f3945b = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.f3946c = null;
            } else {
                e(eVar, (e<K, V>) null);
            }
            c(eVar7, false);
            this.f3935c--;
            this.f3936d++;
            return;
        }
        if (eVar5.D > eVar6.D) {
            e<K, V> eVar8 = eVar5.f3946c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f3946c;
            }
        } else {
            e<K, V> eVar10 = eVar6.f3945b;
            while (true) {
                e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f3945b;
            }
            eVar2 = eVar3;
        }
        d(eVar2, false);
        e<K, V> eVar12 = eVar.f3945b;
        if (eVar12 != null) {
            i8 = eVar12.D;
            eVar2.f3945b = eVar12;
            eVar12.f3944a = eVar2;
            eVar.f3945b = null;
        } else {
            i8 = 0;
        }
        e<K, V> eVar13 = eVar.f3946c;
        if (eVar13 != null) {
            i10 = eVar13.D;
            eVar2.f3946c = eVar13;
            eVar13.f3944a = eVar2;
            eVar.f3946c = null;
        }
        eVar2.D = Math.max(i8, i10) + 1;
        e(eVar, eVar2);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f3944a;
        eVar.f3944a = null;
        if (eVar2 != null) {
            eVar2.f3944a = eVar3;
        }
        if (eVar3 == null) {
            this.f3934b = eVar2;
        } else if (eVar3.f3945b == eVar) {
            eVar3.f3945b = eVar2;
        } else {
            eVar3.f3946c = eVar2;
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        r<K, V>.b bVar2 = new b();
        this.B = bVar2;
        return bVar2;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3945b;
        e<K, V> eVar3 = eVar.f3946c;
        e<K, V> eVar4 = eVar3.f3945b;
        e<K, V> eVar5 = eVar3.f3946c;
        eVar.f3946c = eVar4;
        if (eVar4 != null) {
            eVar4.f3944a = eVar;
        }
        e(eVar, eVar3);
        eVar3.f3945b = eVar;
        eVar.f3944a = eVar3;
        int i8 = 0;
        int max = Math.max(eVar2 != null ? eVar2.D : 0, eVar4 != null ? eVar4.D : 0) + 1;
        eVar.D = max;
        if (eVar5 != null) {
            i8 = eVar5.D;
        }
        eVar3.D = Math.max(max, i8) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            cb.r$e r3 = r2.a(r1, r3)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.C
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.r.get(java.lang.Object):java.lang.Object");
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3945b;
        e<K, V> eVar3 = eVar.f3946c;
        e<K, V> eVar4 = eVar2.f3945b;
        e<K, V> eVar5 = eVar2.f3946c;
        eVar.f3945b = eVar5;
        if (eVar5 != null) {
            eVar5.f3944a = eVar;
        }
        e(eVar, eVar2);
        eVar2.f3946c = eVar;
        eVar.f3944a = eVar2;
        int i8 = 0;
        int max = Math.max(eVar3 != null ? eVar3.D : 0, eVar5 != null ? eVar5.D : 0) + 1;
        eVar.D = max;
        if (eVar4 != null) {
            i8 = eVar4.D;
        }
        eVar2.D = Math.max(max, i8) + 1;
    }

    public final Set<K> keySet() {
        r<K, V>.c cVar = this.C;
        if (cVar != null) {
            return cVar;
        }
        r<K, V>.c cVar2 = new c();
        this.C = cVar2;
        return cVar2;
    }

    public final V put(K k10, V v3) {
        if (k10 != null) {
            e a10 = a(true, k10);
            V v10 = a10.C;
            a10.C = v3;
            return v10;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            cb.r$e r3 = r2.a(r1, r3)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.d(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            V r0 = r3.C
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.r.remove(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f3935c;
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public final K B;
        public V C;
        public int D;

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f3944a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f3945b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f3946c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f3947d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f3948e;

        public e() {
            this.B = null;
            this.f3948e = this;
            this.f3947d = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.B
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.C
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.r.e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.B;
        }

        public final V getValue() {
            return this.C;
        }

        public final int hashCode() {
            int i8 = 0;
            K k10 = this.B;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v3 = this.C;
            if (v3 != null) {
                i8 = v3.hashCode();
            }
            return i8 ^ hashCode;
        }

        public final V setValue(V v3) {
            V v10 = this.C;
            this.C = v3;
            return v10;
        }

        public final String toString() {
            return this.B + "=" + this.C;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f3944a = eVar;
            this.B = k10;
            this.D = 1;
            this.f3947d = eVar2;
            this.f3948e = eVar3;
            eVar3.f3947d = this;
            eVar2.f3948e = this;
        }
    }
}
