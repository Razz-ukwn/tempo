package s5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s5.f;

public abstract class e<T extends f> extends b<T> {

    /* renamed from: o  reason: collision with root package name */
    public final List<T> f14730o = null;

    /* renamed from: p  reason: collision with root package name */
    public float f14731p = -3.4028235E38f;

    /* renamed from: q  reason: collision with root package name */
    public float f14732q = Float.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public float f14733r = -3.4028235E38f;

    /* renamed from: s  reason: collision with root package name */
    public float f14734s = Float.MAX_VALUE;

    public enum a {
        f14735a,
        f14736b,
        f14737c;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public e(ArrayList arrayList) {
        this.f14730o = arrayList;
        if (!arrayList.isEmpty()) {
            this.f14731p = -3.4028235E38f;
            this.f14732q = Float.MAX_VALUE;
            this.f14733r = -3.4028235E38f;
            this.f14734s = Float.MAX_VALUE;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar != null) {
                    if (fVar.c() < this.f14734s) {
                        this.f14734s = fVar.c();
                    }
                    if (fVar.c() > this.f14733r) {
                        this.f14733r = fVar.c();
                    }
                    f0(fVar);
                }
            }
        }
    }

    public final T C(float f10, float f11, a aVar) {
        int g02 = g0(f10, f11, aVar);
        if (g02 > -1) {
            return (f) this.f14730o.get(g02);
        }
        return null;
    }

    public final void K(float f10, float f11) {
        List<T> list = this.f14730o;
        if (list != null && !list.isEmpty()) {
            this.f14731p = -3.4028235E38f;
            this.f14732q = Float.MAX_VALUE;
            int g02 = g0(f11, Float.NaN, a.f14735a);
            for (int g03 = g0(f10, Float.NaN, a.f14736b); g03 <= g02; g03++) {
                f0((f) list.get(g03));
            }
        }
    }

    public final ArrayList L(float f10) {
        ArrayList arrayList = new ArrayList();
        List<T> list = this.f14730o;
        int size = list.size() - 1;
        int i8 = 0;
        while (true) {
            if (i8 > size) {
                break;
            }
            int i10 = (size + i8) / 2;
            f fVar = (f) list.get(i10);
            if (f10 == fVar.c()) {
                while (i10 > 0) {
                    int i11 = i10 - 1;
                    if (((f) list.get(i11)).c() != f10) {
                        break;
                    }
                    i10 = i11;
                }
                int size2 = list.size();
                while (i10 < size2) {
                    f fVar2 = (f) list.get(i10);
                    if (fVar2.c() != f10) {
                        break;
                    }
                    arrayList.add(fVar2);
                    i10++;
                }
            } else if (f10 > fVar.c()) {
                i8 = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        return arrayList;
    }

    public final float M() {
        return this.f14733r;
    }

    public final int N(f fVar) {
        return this.f14730o.indexOf(fVar);
    }

    public final int V() {
        return this.f14730o.size();
    }

    public final float e() {
        return this.f14734s;
    }

    public final void f0(T t2) {
        if (t2.a() < this.f14732q) {
            this.f14732q = t2.a();
        }
        if (t2.a() > this.f14731p) {
            this.f14731p = t2.a();
        }
    }

    public final float g() {
        return this.f14731p;
    }

    public final int g0(float f10, float f11, a aVar) {
        f fVar;
        List<T> list = this.f14730o;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 < size) {
            int i10 = (i8 + size) / 2;
            float c3 = ((f) list.get(i10)).c() - f10;
            int i11 = i10 + 1;
            float abs = Math.abs(c3);
            float abs2 = Math.abs(((f) list.get(i11)).c() - f10);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d10 = (double) c3;
                    if (d10 < 0.0d) {
                        if (d10 >= 0.0d) {
                        }
                    }
                }
                size = i10;
            }
            i8 = i11;
        }
        if (size == -1) {
            return size;
        }
        float c10 = ((f) list.get(size)).c();
        if (aVar == a.f14735a) {
            if (c10 < f10 && size < list.size() - 1) {
                size++;
            }
        } else if (aVar == a.f14736b && c10 > f10 && size > 0) {
            size--;
        }
        if (Float.isNaN(f11)) {
            return size;
        }
        while (size > 0) {
            int i12 = size - 1;
            if (((f) list.get(i12)).c() != c10) {
                break;
            }
            size = i12;
        }
        float a10 = ((f) list.get(size)).a();
        int i13 = size;
        loop2:
        while (true) {
            int i14 = i13;
            do {
                i14++;
                if (i14 >= list.size()) {
                    break loop2;
                }
                fVar = (f) list.get(i14);
                if (fVar.c() != c10) {
                    break loop2;
                }
            } while (Math.abs(fVar.a() - f11) >= Math.abs(a10 - f11));
            a10 = f11;
            i13 = i14;
        }
        return i13;
    }

    public final T j(float f10, float f11) {
        return C(f10, f11, a.f14737c);
    }

    public final float p() {
        return this.f14732q;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("DataSet, label: ");
        String str = this.f14708c;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(", entries: ");
        List<T> list = this.f14730o;
        sb2.append(list.size());
        sb2.append("\n");
        stringBuffer2.append(sb2.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i8 = 0; i8 < list.size(); i8++) {
            stringBuffer.append(((f) list.get(i8)).toString() + " ");
        }
        return stringBuffer.toString();
    }

    public final T y(int i8) {
        return (f) this.f14730o.get(i8);
    }
}
