package y0;

import ag.v1;
import java.util.Map;
import sf.j;

public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f17110a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f17111b;

    /* renamed from: c  reason: collision with root package name */
    public int f17112c;

    public b() {
        this(0);
    }

    public b(int i8) {
        this.f17110a = v1.J;
        this.f17111b = v1.K;
        this.f17112c = 0;
    }

    public final int a(int i8, Object obj) {
        j.f(obj, "key");
        int i10 = this.f17112c;
        if (i10 == 0) {
            return -1;
        }
        int f10 = v1.f(i10, i8, this.f17110a);
        if (f10 < 0 || j.a(obj, this.f17111b[f10 << 1])) {
            return f10;
        }
        int i11 = f10 + 1;
        while (i11 < i10 && this.f17110a[i11] == i8) {
            if (j.a(obj, this.f17111b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        int i12 = f10 - 1;
        while (i12 >= 0 && this.f17110a[i12] == i8) {
            if (j.a(obj, this.f17111b[i12 << 1])) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final int b() {
        int i8 = this.f17112c;
        if (i8 == 0) {
            return -1;
        }
        int f10 = v1.f(i8, 0, this.f17110a);
        if (f10 < 0 || this.f17111b[f10 << 1] == null) {
            return f10;
        }
        int i10 = f10 + 1;
        while (i10 < i8 && this.f17110a[i10] == 0) {
            if (this.f17111b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        int i11 = f10 - 1;
        while (i11 >= 0 && this.f17110a[i11] == 0) {
            if (this.f17111b[i11 << 1] == null) {
                return i11;
            }
            i11--;
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i8 = this.f17112c;
                if (i8 != bVar.f17112c) {
                    return false;
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    Object[] objArr = this.f17111b;
                    int i11 = i10 << 1;
                    Object obj2 = objArr[i11];
                    Object obj3 = objArr[i11 + 1];
                    int b10 = obj2 == null ? bVar.b() : bVar.a(obj2.hashCode(), obj2);
                    Object obj4 = b10 >= 0 ? bVar.f17111b[(b10 << 1) + 1] : null;
                    if (obj3 == null) {
                        if (obj4 == null) {
                            if (!((obj2 == null ? bVar.b() : bVar.a(obj2.hashCode(), obj2)) >= 0)) {
                            }
                        }
                        return false;
                    } else if (!j.a(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f17112c != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.f17112c;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object[] objArr2 = this.f17111b;
                    int i14 = i13 << 1;
                    Object obj5 = objArr2[i14];
                    Object obj6 = objArr2[i14 + 1];
                    Object obj7 = ((Map) obj).get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !((Map) obj).containsKey(obj5)) {
                            return false;
                        }
                    } else if (!j.a(obj6, obj7)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f17110a;
        Object[] objArr = this.f17111b;
        int i8 = this.f17112c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i8) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final String toString() {
        int i8 = this.f17112c;
        if (i8 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i8 * 28);
        sb2.append('{');
        int i10 = this.f17112c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            int i12 = i11 << 1;
            Object obj = this.f17111b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f17111b[i12 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        j.e(sb3, "buffer.toString()");
        return sb3;
    }
}
