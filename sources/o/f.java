package o;

import cb.b;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class f<K, V> {
    public static Object[] B;
    public static int C;

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f12028d;

    /* renamed from: e  reason: collision with root package name */
    public static int f12029e;

    /* renamed from: a  reason: collision with root package name */
    public int[] f12030a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f12031b;

    /* renamed from: c  reason: collision with root package name */
    public int f12032c;

    public f() {
        this.f12030a = b.f3884e;
        this.f12031b = b.B;
        this.f12032c = 0;
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (f.class) {
                Object[] objArr = B;
                if (objArr != null) {
                    this.f12031b = objArr;
                    B = (Object[]) objArr[0];
                    this.f12030a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    C--;
                    return;
                }
            }
        } else if (i8 == 4) {
            synchronized (f.class) {
                Object[] objArr2 = f12028d;
                if (objArr2 != null) {
                    this.f12031b = objArr2;
                    f12028d = (Object[]) objArr2[0];
                    this.f12030a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f12029e--;
                    return;
                }
            }
        }
        this.f12030a = new int[i8];
        this.f12031b = new Object[(i8 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (f.class) {
                if (C < 10) {
                    objArr[0] = B;
                    objArr[1] = iArr;
                    for (int i10 = (i8 << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    B = objArr;
                    C++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f.class) {
                if (f12029e < 10) {
                    objArr[0] = f12028d;
                    objArr[1] = iArr;
                    for (int i11 = (i8 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f12028d = objArr;
                    f12029e++;
                }
            }
        }
    }

    public final void b(int i8) {
        int i10 = this.f12032c;
        int[] iArr = this.f12030a;
        if (iArr.length < i8) {
            Object[] objArr = this.f12031b;
            a(i8);
            if (this.f12032c > 0) {
                System.arraycopy(iArr, 0, this.f12030a, 0, i10);
                System.arraycopy(objArr, 0, this.f12031b, 0, i10 << 1);
            }
            c(iArr, objArr, i10);
        }
        if (this.f12032c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i8 = this.f12032c;
        if (i8 > 0) {
            int[] iArr = this.f12030a;
            Object[] objArr = this.f12031b;
            this.f12030a = b.f3884e;
            this.f12031b = b.B;
            this.f12032c = 0;
            c(iArr, objArr, i8);
        }
        if (this.f12032c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int d(int i8, Object obj) {
        int i10 = this.f12032c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int n2 = b.n(i10, i8, this.f12030a);
            if (n2 < 0 || obj.equals(this.f12031b[n2 << 1])) {
                return n2;
            }
            int i11 = n2 + 1;
            while (i11 < i10 && this.f12030a[i11] == i8) {
                if (obj.equals(this.f12031b[i11 << 1])) {
                    return i11;
                }
                i11++;
            }
            int i12 = n2 - 1;
            while (i12 >= 0 && this.f12030a[i12] == i8) {
                if (obj.equals(this.f12031b[i12 << 1])) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? g() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f12032c != fVar.f12032c) {
                    return false;
                }
                for (int i8 = 0; i8 < this.f12032c; i8++) {
                    Object i10 = i(i8);
                    Object m = m(i8);
                    Object orDefault = fVar.getOrDefault(i10, (Object) null);
                    if (m == null) {
                        if (orDefault != null || !fVar.containsKey(i10)) {
                            return false;
                        }
                    } else if (!m.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f12032c != map.size()) {
                    return false;
                }
                for (int i11 = 0; i11 < this.f12032c; i11++) {
                    Object i12 = i(i11);
                    Object m10 = m(i11);
                    Object obj2 = map.get(i12);
                    if (m10 == null) {
                        if (obj2 != null || !map.containsKey(i12)) {
                            return false;
                        }
                    } else if (!m10.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    public final int g() {
        int i8 = this.f12032c;
        if (i8 == 0) {
            return -1;
        }
        try {
            int n2 = b.n(i8, 0, this.f12030a);
            if (n2 < 0 || this.f12031b[n2 << 1] == null) {
                return n2;
            }
            int i10 = n2 + 1;
            while (i10 < i8 && this.f12030a[i10] == 0) {
                if (this.f12031b[i10 << 1] == null) {
                    return i10;
                }
                i10++;
            }
            int i11 = n2 - 1;
            while (i11 >= 0 && this.f12030a[i11] == 0) {
                if (this.f12031b[i11 << 1] == null) {
                    return i11;
                }
                i11--;
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v3) {
        int e10 = e(obj);
        return e10 >= 0 ? this.f12031b[(e10 << 1) + 1] : v3;
    }

    /* access modifiers changed from: package-private */
    public final int h(Object obj) {
        int i8 = this.f12032c * 2;
        Object[] objArr = this.f12031b;
        if (obj == null) {
            for (int i10 = 1; i10 < i8; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i8; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f12030a;
        Object[] objArr = this.f12031b;
        int i8 = this.f12032c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i8) {
            Object obj = objArr[i10];
            i12 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final K i(int i8) {
        return this.f12031b[i8 << 1];
    }

    public final boolean isEmpty() {
        return this.f12032c <= 0;
    }

    public void j(a aVar) {
        int i8 = aVar.f12032c;
        b(this.f12032c + i8);
        if (this.f12032c != 0) {
            for (int i10 = 0; i10 < i8; i10++) {
                put(aVar.i(i10), aVar.m(i10));
            }
        } else if (i8 > 0) {
            System.arraycopy(aVar.f12030a, 0, this.f12030a, 0, i8);
            System.arraycopy(aVar.f12031b, 0, this.f12031b, 0, i8 << 1);
            this.f12032c = i8;
        }
    }

    public V k(int i8) {
        V[] vArr = this.f12031b;
        int i10 = i8 << 1;
        V v3 = vArr[i10 + 1];
        int i11 = this.f12032c;
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f12030a;
            int i13 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i8 < i12) {
                    int i14 = i8 + 1;
                    int i15 = i12 - i8;
                    System.arraycopy(iArr, i14, iArr, i8, i15);
                    Object[] objArr = this.f12031b;
                    System.arraycopy(objArr, i14 << 1, objArr, i10, i15 << 1);
                }
                Object[] objArr2 = this.f12031b;
                int i16 = i12 << 1;
                objArr2[i16] = null;
                objArr2[i16 + 1] = null;
            } else {
                if (i11 > 8) {
                    i13 = i11 + (i11 >> 1);
                }
                a(i13);
                if (i11 == this.f12032c) {
                    if (i8 > 0) {
                        System.arraycopy(iArr, 0, this.f12030a, 0, i8);
                        System.arraycopy(vArr, 0, this.f12031b, 0, i10);
                    }
                    if (i8 < i12) {
                        int i17 = i8 + 1;
                        int i18 = i12 - i8;
                        System.arraycopy(iArr, i17, this.f12030a, i8, i18);
                        System.arraycopy(vArr, i17 << 1, this.f12031b, i10, i18 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i11 == this.f12032c) {
                this.f12032c = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v3;
    }

    public V l(int i8, V v3) {
        int i10 = (i8 << 1) + 1;
        V[] vArr = this.f12031b;
        V v10 = vArr[i10];
        vArr[i10] = v3;
        return v10;
    }

    public final V m(int i8) {
        return this.f12031b[(i8 << 1) + 1];
    }

    public V put(K k10, V v3) {
        int i8;
        int i10;
        int i11 = this.f12032c;
        if (k10 == null) {
            i10 = g();
            i8 = 0;
        } else {
            int hashCode = k10.hashCode();
            i8 = hashCode;
            i10 = d(hashCode, k10);
        }
        if (i10 >= 0) {
            int i12 = (i10 << 1) + 1;
            V[] vArr = this.f12031b;
            V v10 = vArr[i12];
            vArr[i12] = v3;
            return v10;
        }
        int i13 = ~i10;
        int[] iArr = this.f12030a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f12031b;
            a(i14);
            if (i11 == this.f12032c) {
                int[] iArr2 = this.f12030a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f12031b, 0, objArr.length);
                }
                c(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f12030a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr2 = this.f12031b;
            System.arraycopy(objArr2, i13 << 1, objArr2, i15 << 1, (this.f12032c - i13) << 1);
        }
        int i16 = this.f12032c;
        if (i11 == i16) {
            int[] iArr4 = this.f12030a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i8;
                Object[] objArr3 = this.f12031b;
                int i17 = i13 << 1;
                objArr3[i17] = k10;
                objArr3[i17 + 1] = v3;
                this.f12032c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v3) {
        V orDefault = getOrDefault(k10, (Object) null);
        return orDefault == null ? put(k10, v3) : orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return k(e10);
        }
        return null;
    }

    public final V replace(K k10, V v3) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return l(e10, v3);
        }
        return null;
    }

    public final int size() {
        return this.f12032c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12032c * 28);
        sb2.append('{');
        for (int i8 = 0; i8 < this.f12032c; i8++) {
            if (i8 > 0) {
                sb2.append(", ");
            }
            Object i10 = i(i8);
            if (i10 != this) {
                sb2.append(i10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m = m(i8);
            if (m != this) {
                sb2.append(m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            return false;
        }
        Object m = m(e10);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(e10);
        return true;
    }

    public final boolean replace(K k10, V v3, V v10) {
        int e10 = e(k10);
        if (e10 < 0) {
            return false;
        }
        V m = m(e10);
        if (m != v3 && (v3 == null || !v3.equals(m))) {
            return false;
        }
        l(e10, v10);
        return true;
    }

    public f(int i8) {
        if (i8 == 0) {
            this.f12030a = b.f3884e;
            this.f12031b = b.B;
        } else {
            a(i8);
        }
        this.f12032c = 0;
    }
}
