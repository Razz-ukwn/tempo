package t;

import b7.a;
import java.util.ArrayList;
import rb.b;
import sf.j;
import t.h;

public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f15147a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f15148b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15149c;

    /* renamed from: d  reason: collision with root package name */
    public final Object[] f15150d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15151e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15152f;

    /* renamed from: g  reason: collision with root package name */
    public int f15153g;

    /* renamed from: h  reason: collision with root package name */
    public int f15154h;

    /* renamed from: i  reason: collision with root package name */
    public int f15155i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f15156j;

    /* renamed from: k  reason: collision with root package name */
    public int f15157k;

    /* renamed from: l  reason: collision with root package name */
    public int f15158l;

    public m2(n2 n2Var) {
        j.f(n2Var, "table");
        this.f15147a = n2Var;
        this.f15148b = n2Var.f15167a;
        int i8 = n2Var.f15168b;
        this.f15149c = i8;
        this.f15150d = n2Var.f15169c;
        this.f15151e = n2Var.f15170d;
        this.f15154h = i8;
    }

    public final b a(int i8) {
        ArrayList<b> arrayList = this.f15147a.D;
        int A = a.A(arrayList, i8, this.f15149c);
        if (A < 0) {
            b bVar = new b(i8);
            arrayList.add(-(A + 1), bVar);
            return bVar;
        }
        b bVar2 = arrayList.get(A);
        j.e(bVar2, "get(location)");
        return bVar2;
    }

    public final Object b(int[] iArr, int i8) {
        int i10;
        if (!a.f(iArr, i8)) {
            return h.a.f15061a;
        }
        int i11 = i8 * 5;
        if (i11 >= iArr.length) {
            i10 = iArr.length;
        } else {
            i10 = a.t(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
        }
        return this.f15150d[i10];
    }

    public final void c() {
        boolean z10 = true;
        this.f15152f = true;
        n2 n2Var = this.f15147a;
        n2Var.getClass();
        int i8 = n2Var.f15171e;
        if (i8 <= 0) {
            z10 = false;
        }
        if (z10) {
            n2Var.f15171e = i8 - 1;
        } else {
            e0.c("Unexpected reader close()".toString());
            throw null;
        }
    }

    public final void d() {
        if (this.f15156j == 0) {
            if (this.f15153g == this.f15154h) {
                int[] iArr = this.f15148b;
                int i8 = iArr[(this.f15155i * 5) + 2];
                this.f15155i = i8;
                this.f15154h = i8 < 0 ? this.f15149c : i8 + iArr[(i8 * 5) + 3];
                return;
            }
            e0.c("endGroup() not called at the end of a group".toString());
            throw null;
        }
    }

    public final Object e() {
        int i8 = this.f15153g;
        if (i8 < this.f15154h) {
            return b(this.f15148b, i8);
        }
        return 0;
    }

    public final Object f(int i8, int i10) {
        int[] iArr = this.f15148b;
        int k10 = a.k(iArr, i8);
        int i11 = i8 + 1;
        int i12 = k10 + i10;
        return i12 < (i11 < this.f15149c ? iArr[(i11 * 5) + 4] : this.f15151e) ? this.f15150d[i12] : h.a.f15061a;
    }

    public final int g(int i8) {
        return a.e(this.f15148b, i8);
    }

    public final boolean h(int i8) {
        return a.g(this.f15148b, i8);
    }

    public final Object i(int i8) {
        int[] iArr = this.f15148b;
        if (!a.g(iArr, i8)) {
            return null;
        }
        if (!a.g(iArr, i8)) {
            return h.a.f15061a;
        }
        return this.f15150d[iArr[(i8 * 5) + 4]];
    }

    public final int j(int i8) {
        return a.j(this.f15148b, i8);
    }

    public final Object k(int[] iArr, int i8) {
        int i10 = i8 * 5;
        int i11 = iArr[i10 + 1];
        if (!((536870912 & i11) != 0)) {
            return null;
        }
        return this.f15150d[a.t(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int l(int i8) {
        return this.f15148b[(i8 * 5) + 2];
    }

    public final void m(int i8) {
        if (this.f15156j == 0) {
            this.f15153g = i8;
            int[] iArr = this.f15148b;
            int i10 = this.f15149c;
            int i11 = i8 < i10 ? iArr[(i8 * 5) + 2] : -1;
            this.f15155i = i11;
            if (i11 < 0) {
                this.f15154h = i10;
            } else {
                this.f15154h = a.e(iArr, i11) + i11;
            }
            this.f15157k = 0;
            this.f15158l = 0;
            return;
        }
        e0.c("Cannot reposition while in an empty region".toString());
        throw null;
    }

    public final int n() {
        int i8 = 1;
        if (this.f15156j == 0) {
            int i10 = this.f15153g;
            int[] iArr = this.f15148b;
            if (!a.g(iArr, i10)) {
                i8 = a.j(iArr, this.f15153g);
            }
            int i11 = this.f15153g;
            this.f15153g = iArr[(i11 * 5) + 3] + i11;
            return i8;
        }
        e0.c("Cannot skip while in an empty region".toString());
        throw null;
    }

    public final void o() {
        if (this.f15156j == 0) {
            this.f15153g = this.f15154h;
        } else {
            e0.c("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final void p() {
        if (this.f15156j <= 0) {
            int i8 = this.f15153g;
            int[] iArr = this.f15148b;
            if (iArr[(i8 * 5) + 2] == this.f15155i) {
                this.f15155i = i8;
                this.f15154h = iArr[(i8 * 5) + 3] + i8;
                int i10 = i8 + 1;
                this.f15153g = i10;
                this.f15157k = a.k(iArr, i8);
                this.f15158l = i8 >= this.f15149c - 1 ? this.f15151e : iArr[(i10 * 5) + 4];
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final String toString() {
        int i8;
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f15153g);
        sb2.append(", key=");
        int i10 = this.f15153g;
        if (i10 < this.f15154h) {
            i8 = this.f15148b[i10 * 5];
        } else {
            i8 = 0;
        }
        sb2.append(i8);
        sb2.append(", parent=");
        sb2.append(this.f15155i);
        sb2.append(", end=");
        return b.a(sb2, this.f15154h, ')');
    }
}
