package t;

import gf.l;
import gf.q;
import java.util.ArrayList;
import java.util.List;
import sf.j;
import t.h;

public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f15187a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f15188b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f15189c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f15190d;

    /* renamed from: e  reason: collision with root package name */
    public int f15191e;

    /* renamed from: f  reason: collision with root package name */
    public int f15192f;

    /* renamed from: g  reason: collision with root package name */
    public int f15193g;

    /* renamed from: h  reason: collision with root package name */
    public int f15194h;

    /* renamed from: i  reason: collision with root package name */
    public int f15195i;

    /* renamed from: j  reason: collision with root package name */
    public int f15196j;

    /* renamed from: k  reason: collision with root package name */
    public int f15197k;

    /* renamed from: l  reason: collision with root package name */
    public int f15198l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f15199n;

    /* renamed from: o  reason: collision with root package name */
    public final w0 f15200o = new w0();

    /* renamed from: p  reason: collision with root package name */
    public final w0 f15201p = new w0();

    /* renamed from: q  reason: collision with root package name */
    public final w0 f15202q = new w0();

    /* renamed from: r  reason: collision with root package name */
    public int f15203r;

    /* renamed from: s  reason: collision with root package name */
    public int f15204s = -1;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15205t;

    /* renamed from: u  reason: collision with root package name */
    public r1 f15206u;

    public static final class a {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: gf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: gf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: gf.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x017f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.util.List a(t.p2 r21, int r22, t.p2 r23, boolean r24, boolean r25) {
            /*
                r0 = r21
                r1 = r22
                r2 = r23
                int r3 = r21.o(r22)
                int r4 = r1 + r3
                int[] r5 = r0.f15188b
                int r6 = r21.n(r22)
                int r5 = r0.g(r5, r6)
                int[] r6 = r0.f15188b
                int r7 = r0.n(r4)
                int r6 = r0.g(r6, r7)
                int r7 = r6 - r5
                r9 = 1
                if (r1 < 0) goto L_0x003c
                int[] r10 = r0.f15188b
                int r11 = r21.n(r22)
                int r11 = r11 * 5
                int r11 = r11 + r9
                r10 = r10[r11]
                r11 = 201326592(0xc000000, float:9.8607613E-32)
                r10 = r10 & r11
                if (r10 == 0) goto L_0x0037
                r10 = r9
                goto L_0x0038
            L_0x0037:
                r10 = 0
            L_0x0038:
                if (r10 == 0) goto L_0x003c
                r10 = r9
                goto L_0x003d
            L_0x003c:
                r10 = 0
            L_0x003d:
                r2.q(r3)
                int r11 = r2.f15203r
                r2.r(r7, r11)
                int r11 = r0.f15191e
                if (r11 >= r4) goto L_0x004c
                r0.v(r4)
            L_0x004c:
                int r11 = r0.f15196j
                if (r11 >= r6) goto L_0x0053
                r0.w(r6, r4)
            L_0x0053:
                int[] r11 = r2.f15188b
                int r12 = r2.f15203r
                int[] r13 = r0.f15188b
                int r14 = r12 * 5
                int r15 = r1 * 5
                int r8 = r4 * 5
                gf.l.U(r14, r15, r8, r13, r11)
                java.lang.Object[] r8 = r2.f15189c
                int r13 = r2.f15194h
                java.lang.Object[] r15 = r0.f15189c
                gf.l.V(r13, r5, r6, r15, r8)
                int r6 = r2.f15204s
                int r14 = r14 + 2
                r11[r14] = r6
                int r14 = r12 - r1
                int r15 = r12 + r3
                int r16 = r2.g(r11, r12)
                int r16 = r13 - r16
                int r9 = r2.f15198l
                r17 = r9
                int r9 = r2.f15197k
                int r8 = r8.length
                r18 = r6
                r6 = r17
                r17 = r10
                r10 = r12
            L_0x0089:
                if (r10 >= r15) goto L_0x00c2
                if (r10 == r12) goto L_0x0097
                int r19 = r10 * 5
                int r19 = r19 + 2
                r20 = r11[r19]
                int r20 = r20 + r14
                r11[r19] = r20
            L_0x0097:
                int r19 = r2.g(r11, r10)
                r20 = r13
                int r13 = r19 + r16
                if (r6 >= r10) goto L_0x00a5
                r19 = r15
                r15 = 0
                goto L_0x00a9
            L_0x00a5:
                r19 = r15
                int r15 = r2.f15196j
            L_0x00a9:
                if (r13 <= r15) goto L_0x00b1
                int r15 = r8 - r9
                int r15 = r15 - r13
                r13 = 1
                int r15 = r15 + r13
                int r13 = -r15
            L_0x00b1:
                int r15 = r10 * 5
                int r15 = r15 + 4
                r11[r15] = r13
                if (r10 != r6) goto L_0x00bb
                int r6 = r6 + 1
            L_0x00bb:
                int r10 = r10 + 1
                r15 = r19
                r13 = r20
                goto L_0x0089
            L_0x00c2:
                r20 = r13
                r19 = r15
                r2.f15198l = r6
                java.util.ArrayList<t.b> r6 = r0.f15190d
                int r8 = r21.m()
                int r6 = b7.a.h(r6, r1, r8)
                java.util.ArrayList<t.b> r8 = r0.f15190d
                int r9 = r21.m()
                int r4 = b7.a.h(r8, r4, r9)
                if (r6 >= r4) goto L_0x0119
                java.util.ArrayList<t.b> r8 = r0.f15190d
                java.util.ArrayList r9 = new java.util.ArrayList
                int r10 = r4 - r6
                r9.<init>(r10)
                r10 = r6
            L_0x00e8:
                if (r10 >= r4) goto L_0x0100
                java.lang.Object r13 = r8.get(r10)
                java.lang.String r15 = "sourceAnchors[anchorIndex]"
                sf.j.e(r13, r15)
                t.b r13 = (t.b) r13
                int r15 = r13.f14988a
                int r15 = r15 + r14
                r13.f14988a = r15
                r9.add(r13)
                int r10 = r10 + 1
                goto L_0x00e8
            L_0x0100:
                java.util.ArrayList<t.b> r10 = r2.f15190d
                int r13 = r2.f15203r
                int r14 = r23.m()
                int r10 = b7.a.h(r10, r13, r14)
                java.util.ArrayList<t.b> r13 = r2.f15190d
                r13.addAll(r10, r9)
                java.util.List r4 = r8.subList(r6, r4)
                r4.clear()
                goto L_0x011b
            L_0x0119:
                gf.s r9 = gf.s.f8978a
            L_0x011b:
                int r4 = r21.z(r22)
                if (r24 == 0) goto L_0x014e
                if (r4 < 0) goto L_0x0125
                r8 = 1
                goto L_0x0126
            L_0x0125:
                r8 = 0
            L_0x0126:
                if (r8 == 0) goto L_0x0134
                r21.I()
                int r3 = r0.f15203r
                int r4 = r4 - r3
                r0.a(r4)
                r21.I()
            L_0x0134:
                int r3 = r0.f15203r
                int r1 = r1 - r3
                r0.a(r1)
                boolean r1 = r21.C()
                if (r8 == 0) goto L_0x014c
                r21.G()
                r21.i()
                r21.G()
                r21.i()
            L_0x014c:
                r4 = 1
                goto L_0x0158
            L_0x014e:
                boolean r3 = r0.D(r1, r3)
                r4 = 1
                int r1 = r1 - r4
                r0.E(r5, r7, r1)
                r1 = r3
            L_0x0158:
                r0 = r1 ^ 1
                if (r0 == 0) goto L_0x017f
                int r0 = r2.f15199n
                boolean r1 = b7.a.g(r11, r12)
                if (r1 == 0) goto L_0x0166
                r1 = r4
                goto L_0x016a
            L_0x0166:
                int r1 = b7.a.j(r11, r12)
            L_0x016a:
                int r0 = r0 + r1
                r2.f15199n = r0
                if (r25 == 0) goto L_0x0177
                r12 = r19
                r2.f15203r = r12
                int r13 = r20 + r7
                r2.f15194h = r13
            L_0x0177:
                if (r17 == 0) goto L_0x017e
                r0 = r18
                r2.M(r0)
            L_0x017e:
                return r9
            L_0x017f:
                java.lang.String r0 = "Unexpectedly removed anchors"
                java.lang.String r0 = r0.toString()
                t.e0.c(r0)
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t.p2.a.a(t.p2, int, t.p2, boolean, boolean):java.util.List");
        }
    }

    static {
        new a();
    }

    public p2(n2 n2Var) {
        j.f(n2Var, "table");
        this.f15187a = n2Var;
        int[] iArr = n2Var.f15167a;
        this.f15188b = iArr;
        Object[] objArr = n2Var.f15169c;
        this.f15189c = objArr;
        this.f15190d = n2Var.D;
        int i8 = n2Var.f15168b;
        this.f15191e = i8;
        this.f15192f = (iArr.length / 5) - i8;
        this.f15193g = i8;
        int i10 = n2Var.f15170d;
        this.f15196j = i10;
        this.f15197k = objArr.length - i10;
        this.f15198l = i8;
    }

    public static void t(p2 p2Var) {
        int i8 = p2Var.f15204s;
        int n2 = p2Var.n(i8);
        int[] iArr = p2Var.f15188b;
        boolean z10 = true;
        int i10 = (n2 * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) == 0) {
            z10 = false;
        }
        if (!z10) {
            iArr[i10] = i11 | 134217728;
            if (!b7.a.d(iArr, n2)) {
                p2Var.M(p2Var.z(i8));
            }
        }
    }

    public final int A(int[] iArr, int i8) {
        int i10 = iArr[(n(i8) * 5) + 2];
        return i10 > -2 ? i10 : m() + i10 + 2;
    }

    public final void B() {
        boolean z10;
        boolean z11;
        r1 r1Var = this.f15206u;
        if (r1Var != null) {
            while (!r1Var.f15222a.isEmpty()) {
                int c3 = r1Var.c();
                int n2 = n(c3);
                int i8 = c3 + 1;
                int o10 = o(c3) + c3;
                while (true) {
                    z10 = false;
                    if (i8 >= o10) {
                        z11 = false;
                        break;
                    }
                    if ((this.f15188b[(n(i8) * 5) + 1] & 201326592) != 0) {
                        z11 = true;
                        break;
                    }
                    i8 += o(i8);
                }
                if (b7.a.d(this.f15188b, n2) != z11) {
                    z10 = true;
                }
                if (z10) {
                    int[] iArr = this.f15188b;
                    int i10 = (n2 * 5) + 1;
                    if (z11) {
                        iArr[i10] = iArr[i10] | 67108864;
                    } else {
                        iArr[i10] = iArr[i10] & -67108865;
                    }
                    int z12 = z(c3);
                    if (z12 >= 0) {
                        r1Var.a(z12);
                    }
                }
            }
        }
    }

    public final boolean C() {
        if (this.m == 0) {
            int i8 = this.f15203r;
            int i10 = this.f15194h;
            int F = F();
            r1 r1Var = this.f15206u;
            if (r1Var != null) {
                while (true) {
                    List list = r1Var.f15222a;
                    if (!(!list.isEmpty()) || ((Number) q.u0(list)).intValue() < i8) {
                        break;
                    }
                    r1Var.c();
                }
            }
            boolean D = D(i8, this.f15203r - i8);
            E(i10, this.f15194h - i10, i8 - 1);
            this.f15203r = i8;
            this.f15194h = i10;
            this.f15199n -= F;
            return D;
        }
        e0.c("Cannot remove group while inserting".toString());
        throw null;
    }

    public final boolean D(int i8, int i10) {
        boolean z10;
        boolean z11 = false;
        if (i10 <= 0) {
            return false;
        }
        ArrayList<b> arrayList = this.f15190d;
        v(i8);
        if (!arrayList.isEmpty()) {
            int i11 = i10 + i8;
            int h3 = b7.a.h(this.f15190d, i11, (this.f15188b.length / 5) - this.f15192f);
            if (h3 >= this.f15190d.size()) {
                h3--;
            }
            int i12 = h3 + 1;
            int i13 = 0;
            while (h3 >= 0) {
                b bVar = this.f15190d.get(h3);
                j.e(bVar, "anchors[index]");
                b bVar2 = bVar;
                int c3 = c(bVar2);
                if (c3 < i8) {
                    break;
                }
                if (c3 < i11) {
                    bVar2.f14988a = Integer.MIN_VALUE;
                    if (i13 == 0) {
                        i13 = h3 + 1;
                    }
                    i12 = h3;
                }
                h3--;
            }
            z10 = i12 < i13;
            if (z10) {
                this.f15190d.subList(i12, i13).clear();
            }
        } else {
            z10 = false;
        }
        this.f15191e = i8;
        this.f15192f += i10;
        int i14 = this.f15198l;
        if (i14 > i8) {
            this.f15198l = Math.max(i8, i14 - i10);
        }
        int i15 = this.f15193g;
        if (i15 >= this.f15191e) {
            this.f15193g = i15 - i10;
        }
        int i16 = this.f15204s;
        if (i16 >= 0 && b7.a.d(this.f15188b, n(i16))) {
            z11 = true;
        }
        if (z11) {
            M(this.f15204s);
        }
        return z10;
    }

    public final void E(int i8, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f15197k;
            int i13 = i8 + i10;
            w(i13, i11);
            this.f15196j = i8;
            this.f15197k = i12 + i10;
            l.Z(this.f15189c, i8, i13);
            int i14 = this.f15195i;
            if (i14 >= i8) {
                this.f15195i = i14 - i10;
            }
        }
    }

    public final int F() {
        int n2 = n(this.f15203r);
        int e10 = b7.a.e(this.f15188b, n2) + this.f15203r;
        this.f15203r = e10;
        this.f15194h = g(this.f15188b, n(e10));
        if (b7.a.g(this.f15188b, n2)) {
            return 1;
        }
        return b7.a.j(this.f15188b, n2);
    }

    public final void G() {
        int i8 = this.f15193g;
        this.f15203r = i8;
        this.f15194h = g(this.f15188b, n(i8));
    }

    public final int H(int[] iArr, int i8) {
        if (i8 >= this.f15188b.length / 5) {
            return this.f15189c.length - this.f15197k;
        }
        int k10 = b7.a.k(iArr, i8);
        return k10 < 0 ? (this.f15189c.length - this.f15197k) + k10 + 1 : k10;
    }

    public final void I() {
        if (this.m == 0) {
            h.a.C0280a aVar = h.a.f15061a;
            J(0, aVar, false, aVar);
            return;
        }
        e0.c("Key must be supplied when inserting".toString());
        throw null;
    }

    public final void J(int i8, Object obj, boolean z10, Object obj2) {
        int i10;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i11 = 1;
        boolean z11 = this.m > 0;
        this.f15202q.b(this.f15199n);
        h.a.C0280a aVar = h.a.f15061a;
        if (z11) {
            q(1);
            int i12 = this.f15203r;
            int n2 = n(i12);
            boolean z12 = obj3 != aVar;
            if (z10 || obj4 == aVar) {
                i11 = 0;
            }
            int[] iArr = this.f15188b;
            int i13 = this.f15204s;
            int i14 = this.f15194h;
            int i15 = z10 ? 1073741824 : 0;
            int i16 = z12 ? 536870912 : 0;
            int i17 = i11 != 0 ? 268435456 : 0;
            int i18 = n2 * 5;
            iArr[i18 + 0] = i8;
            iArr[i18 + 1] = i15 | i16 | i17;
            iArr[i18 + 2] = i13;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i14;
            this.f15195i = i14;
            int i19 = (z10 ? 1 : 0) + (z12 ? 1 : 0) + i11;
            if (i19 > 0) {
                r(i19, i12);
                Object[] objArr = this.f15189c;
                int i20 = this.f15194h;
                if (z10) {
                    objArr[i20] = obj4;
                    i20++;
                }
                if (z12) {
                    objArr[i20] = obj3;
                    i20++;
                }
                if (i11 != 0) {
                    objArr[i20] = obj4;
                    i20++;
                }
                this.f15194h = i20;
            }
            this.f15199n = 0;
            i10 = i12 + 1;
            this.f15204s = i12;
            this.f15203r = i10;
        } else {
            this.f15200o.b(this.f15204s);
            this.f15201p.b(((this.f15188b.length / 5) - this.f15192f) - this.f15193g);
            int i21 = this.f15203r;
            int n10 = n(i21);
            if (!j.a(obj4, aVar)) {
                if (z10) {
                    N(this.f15203r, obj4);
                } else {
                    L(obj4);
                }
            }
            this.f15194h = H(this.f15188b, n10);
            this.f15195i = g(this.f15188b, n(this.f15203r + 1));
            this.f15199n = b7.a.j(this.f15188b, n10);
            this.f15204s = i21;
            this.f15203r = i21 + 1;
            i10 = i21 + b7.a.e(this.f15188b, n10);
        }
        this.f15193g = i10;
    }

    public final void K(Object obj) {
        if (this.m > 0) {
            r(1, this.f15204s);
        }
        Object[] objArr = this.f15189c;
        int i8 = this.f15194h;
        this.f15194h = i8 + 1;
        Object obj2 = objArr[h(i8)];
        int i10 = this.f15194h;
        if (i10 <= this.f15195i) {
            this.f15189c[h(i10 - 1)] = obj;
        } else {
            e0.c("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void L(Object obj) {
        int n2 = n(this.f15203r);
        if (b7.a.f(this.f15188b, n2)) {
            this.f15189c[h(d(this.f15188b, n2))] = obj;
        } else {
            e0.c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void M(int i8) {
        if (i8 >= 0) {
            r1 r1Var = this.f15206u;
            if (r1Var == null) {
                r1Var = new r1(0, new ArrayList());
                this.f15206u = r1Var;
            }
            r1Var.a(i8);
        }
    }

    public final void N(int i8, Object obj) {
        int n2 = n(i8);
        int[] iArr = this.f15188b;
        if (n2 < iArr.length && b7.a.g(iArr, n2)) {
            this.f15189c[h(g(this.f15188b, n2))] = obj;
            return;
        }
        e0.c(("Updating the node of a group at " + i8 + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i8) {
        boolean z10 = true;
        if (i8 >= 0) {
            if (!(this.m <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i8 != 0) {
                int i10 = this.f15203r + i8;
                if (i10 < this.f15204s || i10 > this.f15193g) {
                    z10 = false;
                }
                if (z10) {
                    this.f15203r = i10;
                    int g10 = g(this.f15188b, n(i10));
                    this.f15194h = g10;
                    this.f15195i = g10;
                    return;
                }
                e0.c(("Cannot seek outside the current group (" + this.f15204s + '-' + this.f15193g + ')').toString());
                throw null;
            }
        } else {
            e0.c("Cannot seek backwards".toString());
            throw null;
        }
    }

    public final b b(int i8) {
        ArrayList<b> arrayList = this.f15190d;
        int A = b7.a.A(arrayList, i8, m());
        if (A < 0) {
            if (i8 > this.f15191e) {
                i8 = -(m() - i8);
            }
            b bVar = new b(i8);
            arrayList.add(-(A + 1), bVar);
            return bVar;
        }
        b bVar2 = arrayList.get(A);
        j.e(bVar2, "get(location)");
        return bVar2;
    }

    public final int c(b bVar) {
        j.f(bVar, "anchor");
        int i8 = bVar.f14988a;
        return i8 < 0 ? i8 + m() : i8;
    }

    public final int d(int[] iArr, int i8) {
        return b7.a.t(iArr[(i8 * 5) + 1] >> 29) + g(iArr, i8);
    }

    public final void e() {
        int i8 = this.m;
        this.m = i8 + 1;
        if (i8 == 0) {
            this.f15201p.b(((this.f15188b.length / 5) - this.f15192f) - this.f15193g);
        }
    }

    public final void f() {
        boolean z10 = true;
        this.f15205t = true;
        if (this.f15200o.f15267b != 0) {
            z10 = false;
        }
        if (z10) {
            v(m());
            w(this.f15189c.length - this.f15197k, this.f15191e);
            B();
        }
        int[] iArr = this.f15188b;
        int i8 = this.f15191e;
        Object[] objArr = this.f15189c;
        int i10 = this.f15196j;
        ArrayList<b> arrayList = this.f15190d;
        n2 n2Var = this.f15187a;
        n2Var.getClass();
        j.f(iArr, "groups");
        j.f(objArr, "slots");
        j.f(arrayList, "anchors");
        if (n2Var.B) {
            n2Var.B = false;
            n2Var.f15167a = iArr;
            n2Var.f15168b = i8;
            n2Var.f15169c = objArr;
            n2Var.f15170d = i10;
            n2Var.D = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final int g(int[] iArr, int i8) {
        if (i8 >= this.f15188b.length / 5) {
            return this.f15189c.length - this.f15197k;
        }
        int i10 = iArr[(i8 * 5) + 4];
        return i10 < 0 ? (this.f15189c.length - this.f15197k) + i10 + 1 : i10;
    }

    public final int h(int i8) {
        return i8 < this.f15196j ? i8 : i8 + this.f15197k;
    }

    public final void i() {
        int i8 = 1;
        int i10 = 0;
        boolean z10 = this.m > 0;
        int i11 = this.f15203r;
        int i12 = this.f15193g;
        int i13 = this.f15204s;
        int n2 = n(i13);
        int i14 = this.f15199n;
        int i15 = i11 - i13;
        boolean g10 = b7.a.g(this.f15188b, n2);
        w0 w0Var = this.f15202q;
        if (z10) {
            b7.a.l(n2, i15, this.f15188b);
            b7.a.m(n2, i14, this.f15188b);
            int a10 = w0Var.a();
            if (!g10) {
                i8 = i14;
            }
            this.f15199n = a10 + i8;
            this.f15204s = A(this.f15188b, i13);
            return;
        }
        if (i11 != i12) {
            i8 = 0;
        }
        if (i8 != 0) {
            int e10 = b7.a.e(this.f15188b, n2);
            int j10 = b7.a.j(this.f15188b, n2);
            b7.a.l(n2, i15, this.f15188b);
            b7.a.m(n2, i14, this.f15188b);
            int a11 = this.f15200o.a();
            this.f15193g = ((this.f15188b.length / 5) - this.f15192f) - this.f15201p.a();
            this.f15204s = a11;
            int A = A(this.f15188b, i13);
            int a12 = w0Var.a();
            this.f15199n = a12;
            if (A == a11) {
                if (!g10) {
                    i10 = i14 - j10;
                }
                this.f15199n = a12 + i10;
                return;
            }
            int i16 = i15 - e10;
            int i17 = g10 ? 0 : i14 - j10;
            if (!(i16 == 0 && i17 == 0)) {
                while (A != 0 && A != a11 && (i17 != 0 || i16 != 0)) {
                    int n10 = n(A);
                    if (i16 != 0) {
                        b7.a.l(n10, b7.a.e(this.f15188b, n10) + i16, this.f15188b);
                    }
                    if (i17 != 0) {
                        int[] iArr = this.f15188b;
                        b7.a.m(n10, b7.a.j(iArr, n10) + i17, iArr);
                    }
                    if (b7.a.g(this.f15188b, n10)) {
                        i17 = 0;
                    }
                    A = A(this.f15188b, A);
                }
            }
            this.f15199n += i17;
            return;
        }
        e0.c("Expected to be at the end of a group".toString());
        throw null;
    }

    public final void j() {
        int i8 = this.m;
        boolean z10 = true;
        if (i8 > 0) {
            int i10 = i8 - 1;
            this.m = i10;
            if (i10 == 0) {
                if (this.f15202q.f15267b != this.f15200o.f15267b) {
                    z10 = false;
                }
                if (z10) {
                    this.f15193g = ((this.f15188b.length / 5) - this.f15192f) - this.f15201p.a();
                } else {
                    e0.c("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    public final void k(int i8) {
        boolean z10 = true;
        if (this.m <= 0) {
            int i10 = this.f15204s;
            if (i10 != i8) {
                if (i8 < i10 || i8 >= this.f15193g) {
                    z10 = false;
                }
                if (z10) {
                    int i11 = this.f15203r;
                    int i12 = this.f15194h;
                    int i13 = this.f15195i;
                    this.f15203r = i8;
                    I();
                    this.f15203r = i11;
                    this.f15194h = i12;
                    this.f15195i = i13;
                    return;
                }
                e0.c(("Started group at " + i8 + " must be a subgroup of the group at " + i10).toString());
                throw null;
            }
            return;
        }
        e0.c("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }

    public final void l(int i8, int i10, int i11) {
        if (i8 >= this.f15191e) {
            i8 = -((m() - i8) + 2);
        }
        while (i11 < i10) {
            this.f15188b[(n(i11) * 5) + 2] = i8;
            int e10 = b7.a.e(this.f15188b, n(i11)) + i11;
            l(i11, e10, i11 + 1);
            i11 = e10;
        }
    }

    public final int m() {
        return (this.f15188b.length / 5) - this.f15192f;
    }

    public final int n(int i8) {
        return i8 < this.f15191e ? i8 : i8 + this.f15192f;
    }

    public final int o(int i8) {
        return b7.a.e(this.f15188b, n(i8));
    }

    public final boolean p(int i8, int i10) {
        int i11;
        int i12;
        if (i10 == this.f15204s) {
            i11 = this.f15193g;
        } else {
            w0 w0Var = this.f15200o;
            int i13 = w0Var.f15267b;
            if (i10 > (i13 > 0 ? w0Var.f15266a[i13 - 1] : 0)) {
                i12 = o(i10);
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        i14 = -1;
                        break;
                    } else if (w0Var.f15266a[i14] == i10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 < 0) {
                    i12 = o(i10);
                } else {
                    i11 = ((this.f15188b.length / 5) - this.f15192f) - this.f15201p.f15266a[i14];
                }
            }
            i11 = i12 + i10;
        }
        return i8 > i10 && i8 < i11;
    }

    public final void q(int i8) {
        if (i8 > 0) {
            int i10 = this.f15203r;
            v(i10);
            int i11 = this.f15191e;
            int i12 = this.f15192f;
            int[] iArr = this.f15188b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            int i14 = 0;
            if (i12 < i8) {
                int max = Math.max(Math.max(length * 2, i13 + i8), 32);
                int[] iArr2 = new int[(max * 5)];
                int i15 = max - i13;
                l.U(0, 0, i11 * 5, iArr, iArr2);
                l.U((i11 + i15) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f15188b = iArr2;
                i12 = i15;
            }
            int i16 = this.f15193g;
            if (i16 >= i11) {
                this.f15193g = i16 + i8;
            }
            int i17 = i11 + i8;
            this.f15191e = i17;
            this.f15192f = i12 - i8;
            int g10 = i13 > 0 ? g(this.f15188b, n(i10 + i8)) : 0;
            if (this.f15198l >= i11) {
                i14 = this.f15196j;
            }
            int i18 = this.f15197k;
            int length2 = this.f15189c.length;
            if (g10 > i14) {
                g10 = -(((length2 - i18) - g10) + 1);
            }
            for (int i19 = i11; i19 < i17; i19++) {
                this.f15188b[(i19 * 5) + 4] = g10;
            }
            int i20 = this.f15198l;
            if (i20 >= i11) {
                this.f15198l = i20 + i8;
            }
        }
    }

    public final void r(int i8, int i10) {
        if (i8 > 0) {
            w(this.f15194h, i10);
            int i11 = this.f15196j;
            int i12 = this.f15197k;
            if (i12 < i8) {
                Object[] objArr = this.f15189c;
                int length = objArr.length;
                int i13 = length - i12;
                int max = Math.max(Math.max(length * 2, i13 + i8), 32);
                Object[] objArr2 = new Object[max];
                for (int i14 = 0; i14 < max; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = max - i13;
                l.V(0, 0, i11, objArr, objArr2);
                l.V(i11 + i15, i12 + i11, length, objArr, objArr2);
                this.f15189c = objArr2;
                i12 = i15;
            }
            int i16 = this.f15195i;
            if (i16 >= i11) {
                this.f15195i = i16 + i8;
            }
            this.f15196j = i11 + i8;
            this.f15197k = i12 - i8;
        }
    }

    public final boolean s(int i8) {
        return b7.a.g(this.f15188b, n(i8));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f15203r + " end=" + this.f15193g + " size = " + m() + " gap=" + this.f15191e + '-' + (this.f15191e + this.f15192f) + ')';
    }

    public final void u(n2 n2Var, int i8) {
        j.f(n2Var, "table");
        e0.f(this.m > 0);
        if (i8 == 0 && this.f15203r == 0 && this.f15187a.f15168b == 0) {
            int[] iArr = this.f15188b;
            Object[] objArr = this.f15189c;
            ArrayList<b> arrayList = this.f15190d;
            int[] iArr2 = n2Var.f15167a;
            int i10 = n2Var.f15168b;
            Object[] objArr2 = n2Var.f15169c;
            int i11 = n2Var.f15170d;
            this.f15188b = iArr2;
            this.f15189c = objArr2;
            this.f15190d = n2Var.D;
            this.f15191e = i10;
            this.f15192f = (iArr2.length / 5) - i10;
            this.f15196j = i11;
            this.f15197k = objArr2.length - i11;
            this.f15198l = i10;
            j.f(iArr, "groups");
            j.f(objArr, "slots");
            j.f(arrayList, "anchors");
            n2Var.f15167a = iArr;
            n2Var.f15168b = 0;
            n2Var.f15169c = objArr;
            n2Var.f15170d = 0;
            n2Var.D = arrayList;
            return;
        }
        p2 e10 = n2Var.e();
        try {
            a.a(e10, i8, this, true, true);
        } finally {
            e10.f();
        }
    }

    public final void v(int i8) {
        int i10;
        int i11;
        int i12 = this.f15192f;
        int i13 = this.f15191e;
        if (i13 != i8) {
            boolean z10 = true;
            if (!this.f15190d.isEmpty()) {
                int length = (this.f15188b.length / 5) - this.f15192f;
                if (i13 >= i8) {
                    for (int h3 = b7.a.h(this.f15190d, i8, length); h3 < this.f15190d.size(); h3++) {
                        b bVar = this.f15190d.get(h3);
                        j.e(bVar, "anchors[index]");
                        b bVar2 = bVar;
                        int i14 = bVar2.f14988a;
                        if (i14 < 0) {
                            break;
                        }
                        bVar2.f14988a = -(length - i14);
                    }
                } else {
                    for (int h10 = b7.a.h(this.f15190d, i13, length); h10 < this.f15190d.size(); h10++) {
                        b bVar3 = this.f15190d.get(h10);
                        j.e(bVar3, "anchors[index]");
                        b bVar4 = bVar3;
                        int i15 = bVar4.f14988a;
                        if (i15 >= 0 || (i11 = i15 + length) >= i8) {
                            break;
                        }
                        bVar4.f14988a = i11;
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f15188b;
                int i16 = i8 * 5;
                int i17 = i12 * 5;
                int i18 = i13 * 5;
                if (i8 < i13) {
                    l.U(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    l.U(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i8 < i13) {
                i13 = i8 + i12;
            }
            int length2 = this.f15188b.length / 5;
            if (i10 >= length2) {
                z10 = false;
            }
            e0.f(z10);
            while (i10 < length2) {
                int i19 = (i10 * 5) + 2;
                int i20 = this.f15188b[i19];
                int m10 = i20 > -2 ? i20 : m() + i20 + 2;
                if (m10 >= i8) {
                    m10 = -((m() - m10) + 2);
                }
                if (m10 != i20) {
                    this.f15188b[i19] = m10;
                }
                i10++;
                if (i10 == i8) {
                    i10 += i12;
                }
            }
        }
        this.f15191e = i8;
    }

    public final void w(int i8, int i10) {
        int i11 = this.f15197k;
        int i12 = this.f15196j;
        int i13 = this.f15198l;
        if (i12 != i8) {
            Object[] objArr = this.f15189c;
            if (i8 < i12) {
                l.V(i8 + i11, i8, i12, objArr, objArr);
            } else {
                l.V(i12, i12 + i11, i8 + i11, objArr, objArr);
            }
            l.Z(objArr, i8, i8 + i11);
        }
        int min = Math.min(i10 + 1, m());
        if (i13 != min) {
            int length = this.f15189c.length - i11;
            if (min < i13) {
                int n2 = n(min);
                int n10 = n(i13);
                int i14 = this.f15191e;
                while (n2 < n10) {
                    int[] iArr = this.f15188b;
                    int i15 = (n2 * 5) + 4;
                    int i16 = iArr[i15];
                    if (i16 >= 0) {
                        iArr[i15] = -((length - i16) + 1);
                        n2++;
                        if (n2 == i14) {
                            n2 += this.f15192f;
                        }
                    } else {
                        e0.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int n11 = n(i13);
                int n12 = n(min);
                while (n11 < n12) {
                    int[] iArr2 = this.f15188b;
                    int i17 = (n11 * 5) + 4;
                    int i18 = iArr2[i17];
                    if (i18 < 0) {
                        iArr2[i17] = i18 + length + 1;
                        n11++;
                        if (n11 == this.f15191e) {
                            n11 += this.f15192f;
                        }
                    } else {
                        e0.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.f15198l = min;
        }
        this.f15196j = i8;
    }

    public final void x(b bVar, p2 p2Var) {
        j.f(bVar, "anchor");
        boolean z10 = true;
        e0.f(p2Var.m > 0);
        e0.f(this.m == 0);
        e0.f(bVar.a());
        int c3 = c(bVar) + 1;
        int i8 = this.f15203r;
        e0.f(i8 <= c3 && c3 < this.f15193g);
        int z11 = z(c3);
        int o10 = o(c3);
        int j10 = s(c3) ? 1 : b7.a.j(this.f15188b, n(c3));
        a.a(this, c3, p2Var, false, false);
        M(z11);
        boolean z12 = j10 > 0;
        while (z11 >= i8) {
            int n2 = n(z11);
            int[] iArr = this.f15188b;
            b7.a.l(n2, b7.a.e(iArr, n2) - o10, iArr);
            if (z12) {
                if (b7.a.g(this.f15188b, n2)) {
                    z12 = false;
                } else {
                    int[] iArr2 = this.f15188b;
                    b7.a.m(n2, b7.a.j(iArr2, n2) - j10, iArr2);
                }
            }
            z11 = z(z11);
        }
        if (z12) {
            if (this.f15199n < j10) {
                z10 = false;
            }
            e0.f(z10);
            this.f15199n -= j10;
        }
    }

    public final Object y(int i8) {
        int n2 = n(i8);
        if (b7.a.g(this.f15188b, n2)) {
            return this.f15189c[h(g(this.f15188b, n2))];
        }
        return null;
    }

    public final int z(int i8) {
        return A(this.f15188b, i8);
    }
}
