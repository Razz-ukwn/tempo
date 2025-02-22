package f3;

import b3.x;
import cb.d;
import f3.v2;
import f3.y0;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rf.l;
import sf.j;
import wf.e;
import wf.f;

public final class t1<T> implements v0<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final t1<Object> f8494e = new t1<>(y0.b.f8549g);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8495a;

    /* renamed from: b  reason: collision with root package name */
    public int f8496b;

    /* renamed from: c  reason: collision with root package name */
    public int f8497c;

    /* renamed from: d  reason: collision with root package name */
    public int f8498d;

    public t1(y0.b<T> bVar) {
        j.f(bVar, "insertEvent");
        List<s2<T>> list = bVar.f8551b;
        this.f8495a = q.P0(list);
        int i8 = 0;
        for (s2 s2Var : list) {
            i8 += s2Var.f8483b.size();
        }
        this.f8496b = i8;
        this.f8497c = bVar.f8552c;
        this.f8498d = bVar.f8553d;
    }

    public final int a() {
        return this.f8497c + this.f8496b + this.f8498d;
    }

    public final int b() {
        return this.f8496b;
    }

    public final int c() {
        return this.f8497c;
    }

    public final int d() {
        return this.f8498d;
    }

    public final T e(int i8) {
        ArrayList arrayList = this.f8495a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int size2 = ((s2) arrayList.get(i10)).f8483b.size();
            if (size2 > i8) {
                break;
            }
            i8 -= size2;
            i10++;
        }
        return ((s2) arrayList.get(i10)).f8483b.get(i8);
    }

    public final v2.a f(int i8) {
        ArrayList arrayList;
        int i10 = i8 - this.f8497c;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f8495a;
            if (i10 < ((s2) arrayList.get(i11)).f8483b.size() || i11 >= d.H(arrayList)) {
                s2 s2Var = (s2) arrayList.get(i11);
                int i12 = i8 - this.f8497c;
                int a10 = ((a() - i8) - this.f8498d) - 1;
                int h3 = h();
                int i13 = i();
                int i14 = s2Var.f8484c;
                List<Integer> list = s2Var.f8485d;
            } else {
                i10 -= ((s2) arrayList.get(i11)).f8483b.size();
                i11++;
            }
        }
        s2 s2Var2 = (s2) arrayList.get(i11);
        int i122 = i8 - this.f8497c;
        int a102 = ((a() - i8) - this.f8498d) - 1;
        int h32 = h();
        int i132 = i();
        int i142 = s2Var2.f8484c;
        List<Integer> list2 = s2Var2.f8485d;
        if (list2 != null && new f(0, list2.size() - 1).e(i10)) {
            z10 = true;
        }
        if (z10) {
            i10 = list2.get(i10).intValue();
        }
        return new v2.a(i142, i10, i122, a102, h32, i132);
    }

    public final int g(f fVar) {
        boolean z10;
        Iterator it = this.f8495a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            s2 s2Var = (s2) it.next();
            int[] iArr = s2Var.f8482a;
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (fVar.e(iArr[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                i8 += s2Var.f8483b.size();
                it.remove();
            }
        }
        return i8;
    }

    public final int h() {
        Integer num;
        int[] iArr = ((s2) q.u0(this.f8495a)).f8482a;
        j.f(iArr, "<this>");
        if (iArr.length == 0) {
            num = null;
        } else {
            int i8 = iArr[0];
            e d10 = new f(1, iArr.length - 1).iterator();
            while (d10.f16719c) {
                int i10 = iArr[d10.nextInt()];
                if (i8 > i10) {
                    i8 = i10;
                }
            }
            num = Integer.valueOf(i8);
        }
        j.c(num);
        return num.intValue();
    }

    public final int i() {
        Integer num;
        int[] iArr = ((s2) q.B0(this.f8495a)).f8482a;
        j.f(iArr, "<this>");
        if (iArr.length == 0) {
            num = null;
        } else {
            int i8 = iArr[0];
            e d10 = new f(1, iArr.length - 1).iterator();
            while (d10.f16719c) {
                int i10 = iArr[d10.nextInt()];
                if (i8 < i10) {
                    i8 = i10;
                }
            }
            num = Integer.valueOf(i8);
        }
        j.c(num);
        return num.intValue();
    }

    public final String toString() {
        int i8 = this.f8496b;
        ArrayList arrayList = new ArrayList(i8);
        for (int i10 = 0; i10 < i8; i10++) {
            arrayList.add(e(i10));
        }
        String A0 = q.A0(arrayList, (String) null, (String) null, (String) null, (l) null, 63);
        StringBuilder sb2 = new StringBuilder("[(");
        sb2.append(this.f8497c);
        sb2.append(" placeholders), ");
        sb2.append(A0);
        sb2.append(", (");
        return x.b(sb2, this.f8498d, " placeholders)]");
    }
}
