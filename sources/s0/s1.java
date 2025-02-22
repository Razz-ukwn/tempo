package s0;

import java.util.ArrayList;
import rf.a;
import sf.j;
import t.c;
import t.w2;
import u.d;

public final class s1 implements c<a0> {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14450a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14451b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a0 f14452c;

    public s1(a0 a0Var) {
        j.f(a0Var, "root");
        this.f14450a = a0Var;
        this.f14452c = a0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [s0.s0] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, java.lang.Object r9) {
        /*
            r7 = this;
            s0.a0 r9 = (s0.a0) r9
            java.lang.String r0 = "instance"
            sf.j.f(r9, r0)
            s0.a0 r0 = r7.f14452c
            s0.a0 r0 = (s0.a0) r0
            r0.getClass()
            s0.a0 r1 = r9.C
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            r4 = 0
            java.lang.String r5 = " Other tree: "
            java.lang.String r6 = "Cannot insert "
            if (r1 != 0) goto L_0x004e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r9)
            java.lang.String r1 = " because it already has a parent. This tree: "
            r8.append(r1)
            java.lang.String r0 = r0.m(r3)
            r8.append(r0)
            r8.append(r5)
            s0.a0 r9 = r9.C
            if (r9 == 0) goto L_0x003d
            java.lang.String r4 = r9.m(r3)
        L_0x003d:
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x004e:
            s0.b1 r1 = r9.D
            if (r1 != 0) goto L_0x0054
            r1 = r2
            goto L_0x0055
        L_0x0054:
            r1 = r3
        L_0x0055:
            if (r1 == 0) goto L_0x00d3
            r9.C = r0
            t.w2 r1 = r0.f14316d
            java.lang.Object r5 = r1.f15268a
            u.d r5 = (u.d) r5
            r5.a(r8, r9)
            java.lang.Object r8 = r1.f15269b
            rf.a r8 = (rf.a) r8
            r8.d()
            r0.D()
            boolean r8 = r0.f14310a
            boolean r1 = r9.f14310a
            if (r1 == 0) goto L_0x0088
            r5 = r8 ^ 1
            if (r5 == 0) goto L_0x007c
            int r5 = r0.f14314c
            int r5 = r5 + r2
            r0.f14314c = r5
            goto L_0x0088
        L_0x007c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0088:
            r0.x()
            s0.p0 r5 = r9.V
            s0.s0 r5 = r5.f14402c
            s0.p0 r6 = r0.V
            if (r8 == 0) goto L_0x009c
            s0.a0 r8 = r0.C
            if (r8 == 0) goto L_0x009e
            s0.p0 r8 = r8.V
            s0.r r4 = r8.f14401b
            goto L_0x009e
        L_0x009c:
            s0.r r4 = r6.f14401b
        L_0x009e:
            r5.E = r4
            if (r1 == 0) goto L_0x00bd
            t.w2 r8 = r9.f14316d
            java.lang.Object r8 = r8.f15268a
            u.d r8 = (u.d) r8
            int r1 = r8.f15640c
            if (r1 <= 0) goto L_0x00bd
            T[] r8 = r8.f15638a
        L_0x00ae:
            r4 = r8[r3]
            s0.a0 r4 = (s0.a0) r4
            s0.p0 r4 = r4.V
            s0.s0 r4 = r4.f14402c
            s0.r r5 = r6.f14401b
            r4.E = r5
            int r3 = r3 + r2
            if (r3 < r1) goto L_0x00ae
        L_0x00bd:
            s0.b1 r8 = r0.D
            if (r8 == 0) goto L_0x00c4
            r9.i(r8)
        L_0x00c4:
            s0.f0 r8 = r9.W
            int r8 = r8.f14343h
            if (r8 <= 0) goto L_0x00d2
            s0.f0 r8 = r0.W
            int r9 = r8.f14343h
            int r9 = r9 + r2
            r8.c(r9)
        L_0x00d2:
            return
        L_0x00d3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r9)
            java.lang.String r1 = " because it already has an owner. This tree: "
            r8.append(r1)
            java.lang.String r0 = r0.m(r3)
            r8.append(r0)
            r8.append(r5)
            java.lang.String r9 = r9.m(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s1.a(int, java.lang.Object):void");
    }

    public final void b(a0 a0Var) {
        this.f14451b.add(this.f14452c);
        this.f14452c = a0Var;
    }

    public final void c(int i8, int i10, int i11) {
        a0 a0Var = this.f14452c;
        a0Var.getClass();
        if (i8 != i10) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i8 > i10 ? i8 + i12 : i8;
                int i14 = i8 > i10 ? i10 + i12 : (i10 + i11) - 2;
                w2 w2Var = a0Var.f14316d;
                Object k10 = ((d) w2Var.f15268a).k(i13);
                ((a) w2Var.f15269b).d();
                ((d) w2Var.f15268a).a(i14, (a0) k10);
                ((a) w2Var.f15269b).d();
            }
            a0Var.D();
            a0Var.x();
            a0Var.w();
        }
    }

    public final void clear() {
        this.f14451b.clear();
        a0 a0Var = this.f14450a;
        this.f14452c = a0Var;
        a0 a0Var2 = a0Var;
        w2 w2Var = a0Var2.f14316d;
        for (int i8 = ((d) w2Var.f15268a).f15640c - 1; -1 < i8; i8--) {
            a0Var2.C((a0) ((d) w2Var.f15268a).f15638a[i8]);
        }
        ((d) w2Var.f15268a).f();
        ((a) w2Var.f15269b).d();
    }

    public final void d(int i8, int i10) {
        a0 a0Var = this.f14452c;
        a0Var.getClass();
        if (i10 >= 0) {
            int i11 = (i10 + i8) - 1;
            if (i8 <= i11) {
                while (true) {
                    w2 w2Var = a0Var.f14316d;
                    Object k10 = ((d) w2Var.f15268a).k(i11);
                    ((a) w2Var.f15269b).d();
                    a0Var.C((a0) k10);
                    if (i11 != i8) {
                        i11--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(d.a.a("count (", i10, ") must be greater than 0").toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, s0.a0] */
    public final void e() {
        ArrayList arrayList = this.f14451b;
        if (!arrayList.isEmpty()) {
            this.f14452c = arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void f(int i8, Object obj) {
        j.f((a0) obj, "instance");
    }

    public final void g() {
        b1 b1Var = this.f14450a.D;
        if (b1Var != null) {
            b1Var.m();
        }
    }

    public final a0 h() {
        return this.f14452c;
    }
}
