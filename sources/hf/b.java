package hf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import sf.j;
import tf.c;

public final class b<K, V> implements Map<K, V>, Serializable, tf.c {
    public int B;
    public int C;
    public int D;
    public d<K> E;
    public e<V> F;
    public c<K, V> G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public K[] f9314a;

    /* renamed from: b  reason: collision with root package name */
    public V[] f9315b = null;

    /* renamed from: c  reason: collision with root package name */
    public int[] f9316c = new int[8];

    /* renamed from: d  reason: collision with root package name */
    public int[] f9317d;

    /* renamed from: e  reason: collision with root package name */
    public int f9318e;

    public static final class a {
    }

    /* renamed from: hf.b$b  reason: collision with other inner class name */
    public static final class C0167b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, tf.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0167b(b<K, V> bVar) {
            super(bVar);
            j.f(bVar, "map");
        }

        public final Object next() {
            int i8 = this.f9322b;
            b<K, V> bVar = this.f9321a;
            if (i8 < bVar.B) {
                this.f9322b = i8 + 1;
                this.f9323c = i8;
                c cVar = new c(bVar, i8);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, c.a {

        /* renamed from: a  reason: collision with root package name */
        public final b<K, V> f9319a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9320b;

        public c(b<K, V> bVar, int i8) {
            j.f(bVar, "map");
            this.f9319a = bVar;
            this.f9320b = i8;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue());
            }
        }

        public final K getKey() {
            return this.f9319a.f9314a[this.f9320b];
        }

        public final V getValue() {
            V[] vArr = this.f9319a.f9315b;
            j.c(vArr);
            return vArr[this.f9320b];
        }

        public final int hashCode() {
            Object key = getKey();
            int i8 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i8 = value.hashCode();
            }
            return hashCode ^ i8;
        }

        public final V setValue(V v3) {
            b<K, V> bVar = this.f9319a;
            bVar.b();
            V[] vArr = bVar.f9315b;
            if (vArr == null) {
                vArr = cb.d.n(bVar.f9314a.length);
                bVar.f9315b = vArr;
            }
            int i8 = this.f9320b;
            V v10 = vArr[i8];
            vArr[i8] = v3;
            return v10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final b<K, V> f9321a;

        /* renamed from: b  reason: collision with root package name */
        public int f9322b;

        /* renamed from: c  reason: collision with root package name */
        public int f9323c = -1;

        public d(b<K, V> bVar) {
            j.f(bVar, "map");
            this.f9321a = bVar;
            a();
        }

        public final void a() {
            while (true) {
                int i8 = this.f9322b;
                b<K, V> bVar = this.f9321a;
                if (i8 < bVar.B && bVar.f9316c[i8] < 0) {
                    this.f9322b = i8 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f9322b < this.f9321a.B;
        }

        public final void remove() {
            if (this.f9323c != -1) {
                b<K, V> bVar = this.f9321a;
                bVar.b();
                bVar.j(this.f9323c);
                this.f9323c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K>, tf.a {
        public e(b<K, V> bVar) {
            super(bVar);
        }

        public final K next() {
            int i8 = this.f9322b;
            b<K, V> bVar = this.f9321a;
            if (i8 < bVar.B) {
                this.f9322b = i8 + 1;
                this.f9323c = i8;
                K k10 = bVar.f9314a[i8];
                a();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V>, tf.a {
        public f(b<K, V> bVar) {
            super(bVar);
        }

        public final V next() {
            int i8 = this.f9322b;
            b<K, V> bVar = this.f9321a;
            if (i8 < bVar.B) {
                this.f9322b = i8 + 1;
                this.f9323c = i8;
                V[] vArr = bVar.f9315b;
                j.c(vArr);
                V v3 = vArr[this.f9323c];
                a();
                return v3;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
    }

    public b() {
        K[] n2 = cb.d.n(8);
        int highestOneBit = Integer.highestOneBit(24);
        this.f9314a = n2;
        this.f9317d = new int[highestOneBit];
        this.f9318e = 2;
        this.B = 0;
        this.C = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(K k10) {
        b();
        while (true) {
            int h3 = h(k10);
            int i8 = this.f9318e * 2;
            int length = this.f9317d.length / 2;
            if (i8 > length) {
                i8 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f9317d;
                int i11 = iArr[h3];
                if (i11 <= 0) {
                    int i12 = this.B;
                    K[] kArr = this.f9314a;
                    if (i12 >= kArr.length) {
                        e(1);
                    } else {
                        int i13 = i12 + 1;
                        this.B = i13;
                        kArr[i12] = k10;
                        this.f9316c[i12] = h3;
                        iArr[h3] = i13;
                        this.D++;
                        if (i10 > this.f9318e) {
                            this.f9318e = i10;
                        }
                        return i12;
                    }
                } else if (j.a(this.f9314a[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > i8) {
                        i(this.f9317d.length * 2);
                        break;
                    }
                    h3 = h3 == 0 ? this.f9317d.length - 1 : h3 - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.H) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean c(Collection<?> collection) {
        j.f(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!d((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void clear() {
        b();
        wf.e d10 = new wf.f(0, this.B - 1).iterator();
        while (d10.f16719c) {
            int nextInt = d10.nextInt();
            int[] iArr = this.f9316c;
            int i8 = iArr[nextInt];
            if (i8 >= 0) {
                this.f9317d[i8] = 0;
                iArr[nextInt] = -1;
            }
        }
        cb.d.e0(0, this.B, this.f9314a);
        V[] vArr = this.f9315b;
        if (vArr != null) {
            cb.d.e0(0, this.B, vArr);
        }
        this.D = 0;
        this.B = 0;
    }

    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        int i8;
        int i10 = this.B;
        while (true) {
            i8 = -1;
            i10--;
            if (i10 < 0) {
                break;
            } else if (this.f9316c[i10] >= 0) {
                V[] vArr = this.f9315b;
                j.c(vArr);
                if (j.a(vArr[i10], obj)) {
                    i8 = i10;
                    break;
                }
            }
        }
        return i8 >= 0;
    }

    public final boolean d(Map.Entry<? extends K, ? extends V> entry) {
        j.f(entry, "entry");
        int g10 = g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        V[] vArr = this.f9315b;
        j.c(vArr);
        return j.a(vArr[g10], entry.getValue());
    }

    public final void e(int i8) {
        V[] vArr;
        int i10 = this.B;
        int i11 = i8 + i10;
        if (i11 >= 0) {
            K[] kArr = this.f9314a;
            if (i11 > kArr.length) {
                int length = (kArr.length * 3) / 2;
                if (i11 <= length) {
                    i11 = length;
                }
                K[] copyOf = Arrays.copyOf(kArr, i11);
                j.e(copyOf, "copyOf(this, newSize)");
                this.f9314a = copyOf;
                V[] vArr2 = this.f9315b;
                if (vArr2 != null) {
                    vArr = Arrays.copyOf(vArr2, i11);
                    j.e(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.f9315b = vArr;
                int[] copyOf2 = Arrays.copyOf(this.f9316c, i11);
                j.e(copyOf2, "copyOf(this, newSize)");
                this.f9316c = copyOf2;
                if (i11 < 1) {
                    i11 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i11 * 3);
                if (highestOneBit > this.f9317d.length) {
                    i(highestOneBit);
                }
            } else if ((i10 + i11) - this.D > kArr.length) {
                i(this.f9317d.length);
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        c<K, V> cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        c<K, V> cVar2 = new c<>(this);
        this.G = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.D == map.size() && c(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final int g(K k10) {
        int h3 = h(k10);
        int i8 = this.f9318e;
        while (true) {
            int i10 = this.f9317d[h3];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (j.a(this.f9314a[i11], k10)) {
                    return i11;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            h3 = h3 == 0 ? this.f9317d.length - 1 : h3 - 1;
        }
    }

    public final V get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f9315b;
        j.c(vArr);
        return vArr[g10];
    }

    public final int h(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * -1640531527) >>> this.C;
    }

    public final int hashCode() {
        C0167b bVar = new C0167b(this);
        int i8 = 0;
        while (bVar.hasNext()) {
            int i10 = bVar.f9322b;
            b<K, V> bVar2 = bVar.f9321a;
            if (i10 < bVar2.B) {
                bVar.f9322b = i10 + 1;
                bVar.f9323c = i10;
                K k10 = bVar2.f9314a[i10];
                int hashCode = k10 != null ? k10.hashCode() : 0;
                V[] vArr = bVar2.f9315b;
                j.c(vArr);
                V v3 = vArr[bVar.f9323c];
                int hashCode2 = v3 != null ? v3.hashCode() : 0;
                bVar.a();
                i8 += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i8;
    }

    public final void i(int i8) {
        boolean z10;
        int i10;
        if (this.B > this.D) {
            V[] vArr = this.f9315b;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i10 = this.B;
                if (i11 >= i10) {
                    break;
                }
                if (this.f9316c[i11] >= 0) {
                    K[] kArr = this.f9314a;
                    kArr[i12] = kArr[i11];
                    if (vArr != null) {
                        vArr[i12] = vArr[i11];
                    }
                    i12++;
                }
                i11++;
            }
            cb.d.e0(i12, i10, this.f9314a);
            if (vArr != null) {
                cb.d.e0(i12, this.B, vArr);
            }
            this.B = i12;
        }
        int[] iArr = this.f9317d;
        if (i8 != iArr.length) {
            this.f9317d = new int[i8];
            this.C = Integer.numberOfLeadingZeros(i8) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i13 = 0;
        while (i13 < this.B) {
            int i14 = i13 + 1;
            int h3 = h(this.f9314a[i13]);
            int i15 = this.f9318e;
            while (true) {
                int[] iArr2 = this.f9317d;
                if (iArr2[h3] == 0) {
                    iArr2[h3] = i14;
                    this.f9316c[i13] = h3;
                    z10 = true;
                    break;
                }
                i15--;
                if (i15 < 0) {
                    z10 = false;
                    break;
                }
                h3 = h3 == 0 ? iArr2.length - 1 : h3 - 1;
            }
            if (z10) {
                i13 = i14;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean isEmpty() {
        return this.D == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f9314a
            java.lang.String r1 = "<this>"
            sf.j.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f9316c
            r0 = r0[r12]
            int r1 = r11.f9318e
            int r1 = r1 * 2
            int[] r2 = r11.f9317d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x001e:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0028
            int[] r0 = r11.f9317d
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            int r4 = r4 + 1
            int r5 = r11.f9318e
            if (r4 <= r5) goto L_0x0034
            int[] r0 = r11.f9317d
            r0[r1] = r2
            goto L_0x0063
        L_0x0034:
            int[] r5 = r11.f9317d
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003d
            r5[r1] = r2
            goto L_0x0063
        L_0x003d:
            if (r7 >= 0) goto L_0x0042
            r5[r1] = r6
            goto L_0x005a
        L_0x0042:
            K[] r5 = r11.f9314a
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f9317d
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x005c
            r9[r1] = r7
            int[] r4 = r11.f9316c
            r4[r8] = r1
        L_0x005a:
            r1 = r0
            r4 = r2
        L_0x005c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001e
            int[] r0 = r11.f9317d
            r0[r1] = r6
        L_0x0063:
            int[] r0 = r11.f9316c
            r0[r12] = r6
            int r12 = r11.D
            int r12 = r12 + r6
            r11.D = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b.j(int):void");
    }

    public final Set<K> keySet() {
        d<K> dVar = this.E;
        if (dVar != null) {
            return dVar;
        }
        d<K> dVar2 = new d<>(this);
        this.E = dVar2;
        return dVar2;
    }

    public final V put(K k10, V v3) {
        b();
        int a10 = a(k10);
        V[] vArr = this.f9315b;
        if (vArr == null) {
            vArr = cb.d.n(this.f9314a.length);
            this.f9315b = vArr;
        }
        if (a10 < 0) {
            int i8 = (-a10) - 1;
            V v10 = vArr[i8];
            vArr[i8] = v3;
            return v10;
        }
        vArr[a10] = v3;
        return null;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        j.f(map, "from");
        b();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            e(entrySet.size());
            for (Map.Entry next : entrySet) {
                int a10 = a(next.getKey());
                V[] vArr = this.f9315b;
                if (vArr == null) {
                    vArr = cb.d.n(this.f9314a.length);
                    this.f9315b = vArr;
                }
                if (a10 >= 0) {
                    vArr[a10] = next.getValue();
                } else {
                    int i8 = (-a10) - 1;
                    if (!j.a(next.getValue(), vArr[i8])) {
                        vArr[i8] = next.getValue();
                    }
                }
            }
        }
    }

    public final V remove(Object obj) {
        b();
        int g10 = g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            j(g10);
        }
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f9315b;
        j.c(vArr);
        V v3 = vArr[g10];
        vArr[g10] = null;
        return v3;
    }

    public final int size() {
        return this.D;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.D * 3) + 2);
        sb2.append("{");
        C0167b bVar = new C0167b(this);
        int i8 = 0;
        while (bVar.hasNext()) {
            if (i8 > 0) {
                sb2.append(", ");
            }
            int i10 = bVar.f9322b;
            b<K, V> bVar2 = bVar.f9321a;
            if (i10 < bVar2.B) {
                bVar.f9322b = i10 + 1;
                bVar.f9323c = i10;
                K k10 = bVar2.f9314a[i10];
                if (j.a(k10, bVar2)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(k10);
                }
                sb2.append('=');
                V[] vArr = bVar2.f9315b;
                j.c(vArr);
                V v3 = vArr[bVar.f9323c];
                if (j.a(v3, bVar2)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(v3);
                }
                bVar.a();
                i8++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }

    public final Collection<V> values() {
        e<V> eVar = this.F;
        if (eVar != null) {
            return eVar;
        }
        e<V> eVar2 = new e<>(this);
        this.F = eVar2;
        return eVar2;
    }
}
