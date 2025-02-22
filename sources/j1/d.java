package j1;

import java.util.Arrays;
import l1.c;

public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f9759p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f9760q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9761a;

    /* renamed from: b  reason: collision with root package name */
    public int f9762b;

    /* renamed from: c  reason: collision with root package name */
    public final f f9763c;

    /* renamed from: d  reason: collision with root package name */
    public int f9764d;

    /* renamed from: e  reason: collision with root package name */
    public int f9765e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f9766f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9767g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f9768h;

    /* renamed from: i  reason: collision with root package name */
    public int f9769i;

    /* renamed from: j  reason: collision with root package name */
    public int f9770j;

    /* renamed from: k  reason: collision with root package name */
    public int f9771k;

    /* renamed from: l  reason: collision with root package name */
    public final c f9772l;
    public g[] m;

    /* renamed from: n  reason: collision with root package name */
    public int f9773n;

    /* renamed from: o  reason: collision with root package name */
    public b f9774o;

    public interface a {
        g a(boolean[] zArr);
    }

    public d() {
        this.f9761a = false;
        this.f9762b = 0;
        this.f9764d = 32;
        this.f9765e = 32;
        this.f9766f = null;
        this.f9767g = false;
        this.f9768h = new boolean[32];
        this.f9769i = 1;
        this.f9770j = 0;
        this.f9771k = 32;
        this.m = new g[f9760q];
        this.f9773n = 0;
        this.f9766f = new b[32];
        s();
        c cVar = new c(0);
        this.f9772l = cVar;
        this.f9763c = new f(cVar);
        this.f9774o = new b(cVar);
    }

    public static int n(c cVar) {
        g gVar = cVar.f10834i;
        if (gVar != null) {
            return (int) (gVar.f9787e + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: j1.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j1.g a(int r6) {
        /*
            r5 = this;
            j1.c r0 = r5.f9772l
            java.lang.Object r0 = r0.f9757c
            j1.e r0 = (j1.e) r0
            int r1 = r0.f9776b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.f9775a
            r4 = r3[r1]
            r3[r1] = r2
            r0.f9776b = r1
            r2 = r4
        L_0x0016:
            j1.g r2 = (j1.g) r2
            if (r2 != 0) goto L_0x0022
            j1.g r2 = new j1.g
            r2.<init>(r6)
            r2.E = r6
            goto L_0x0027
        L_0x0022:
            r2.c()
            r2.E = r6
        L_0x0027:
            int r6 = r5.f9773n
            int r0 = f9760q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            f9760q = r0
            j1.g[] r6 = r5.m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            j1.g[] r6 = (j1.g[]) r6
            r5.m = r6
        L_0x003b:
            j1.g[] r6 = r5.m
            int r0 = r5.f9773n
            int r1 = r0 + 1
            r5.f9773n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.a(int):j1.g");
    }

    public final void b(g gVar, g gVar2, int i8, float f10, g gVar3, g gVar4, int i10, int i11) {
        b l10 = l();
        if (gVar2 == gVar3) {
            l10.f9753d.e(gVar, 1.0f);
            l10.f9753d.e(gVar4, 1.0f);
            l10.f9753d.e(gVar2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f9753d.e(gVar, 1.0f);
            l10.f9753d.e(gVar2, -1.0f);
            l10.f9753d.e(gVar3, -1.0f);
            l10.f9753d.e(gVar4, 1.0f);
            if (i8 > 0 || i10 > 0) {
                l10.f9751b = (float) ((-i8) + i10);
            }
        } else if (f10 <= 0.0f) {
            l10.f9753d.e(gVar, -1.0f);
            l10.f9753d.e(gVar2, 1.0f);
            l10.f9751b = (float) i8;
        } else if (f10 >= 1.0f) {
            l10.f9753d.e(gVar4, -1.0f);
            l10.f9753d.e(gVar3, 1.0f);
            l10.f9751b = (float) (-i10);
        } else {
            float f11 = 1.0f - f10;
            l10.f9753d.e(gVar, f11 * 1.0f);
            l10.f9753d.e(gVar2, f11 * -1.0f);
            l10.f9753d.e(gVar3, -1.0f * f10);
            l10.f9753d.e(gVar4, 1.0f * f10);
            if (i8 > 0 || i10 > 0) {
                l10.f9751b = (((float) i10) * f10) + (((float) (-i8)) * f11);
            }
        }
        if (i11 != 8) {
            l10.b(this, i11);
        }
        c(l10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r4.H <= 1) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        if (r4.H <= 1) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r4.H <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e9, code lost:
        if (r4.H <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(j1.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f9770j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f9771k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f9769i
            int r2 = r2 + r3
            int r4 = r0.f9765e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.f9754e
            if (r2 != 0) goto L_0x01bd
            j1.b[] r2 = r0.f9766f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            j1.b$a r6 = r1.f9753d
            int r6 = r6.a()
            r7 = 0
        L_0x002b:
            java.util.ArrayList<j1.g> r8 = r1.f9752c
            if (r7 >= r6) goto L_0x0044
            j1.b$a r9 = r1.f9753d
            j1.g r9 = r9.c(r7)
            int r10 = r9.f9785c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.B
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            j1.g r9 = (j1.g) r9
            boolean r10 = r9.B
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            j1.b[] r10 = r0.f9766f
            int r9 = r9.f9785c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            j1.g r2 = r1.f9750a
            if (r2 == 0) goto L_0x007d
            j1.b$a r2 = r1.f9753d
            int r2 = r2.a()
            if (r2 != 0) goto L_0x007d
            r1.f9754e = r3
            r0.f9761a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.f9751b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f9751b = r2
            j1.b$a r2 = r1.f9753d
            r2.g()
        L_0x0095:
            j1.b$a r2 = r1.f9753d
            int r2 = r2.a()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a3:
            if (r8 >= r2) goto L_0x0100
            j1.b$a r15 = r1.f9753d
            float r15 = r15.h(r8)
            j1.b$a r4 = r1.f9753d
            j1.g r4 = r4.c(r8)
            int r5 = r4.E
            if (r5 != r3) goto L_0x00d6
            if (r9 != 0) goto L_0x00bc
            int r5 = r4.H
            if (r5 > r3) goto L_0x00c5
            goto L_0x00d2
        L_0x00bc:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c7
            int r5 = r4.H
            if (r5 > r3) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            r12 = 0
            goto L_0x00d3
        L_0x00c7:
            if (r12 != 0) goto L_0x00fc
            int r5 = r4.H
            if (r5 > r3) goto L_0x00cf
            r5 = r3
            goto L_0x00d0
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            if (r5 == 0) goto L_0x00fc
        L_0x00d2:
            r12 = r3
        L_0x00d3:
            r9 = r4
            r11 = r15
            goto L_0x00fc
        L_0x00d6:
            if (r9 != 0) goto L_0x00fc
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fc
            if (r10 != 0) goto L_0x00e3
            int r5 = r4.H
            if (r5 > r3) goto L_0x00ec
            goto L_0x00f9
        L_0x00e3:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ee
            int r5 = r4.H
            if (r5 > r3) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            r14 = 0
            goto L_0x00fa
        L_0x00ee:
            if (r14 != 0) goto L_0x00fc
            int r5 = r4.H
            if (r5 > r3) goto L_0x00f6
            r5 = r3
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
        L_0x00f9:
            r14 = r3
        L_0x00fa:
            r10 = r4
            r13 = r15
        L_0x00fc:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a3
        L_0x0100:
            if (r9 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r9 = r10
        L_0x0104:
            if (r9 != 0) goto L_0x0108
            r2 = r3
            goto L_0x010c
        L_0x0108:
            r1.g(r9)
            r2 = 0
        L_0x010c:
            j1.b$a r4 = r1.f9753d
            int r4 = r4.a()
            if (r4 != 0) goto L_0x0116
            r1.f9754e = r3
        L_0x0116:
            if (r2 == 0) goto L_0x01a7
            int r2 = r0.f9769i
            int r2 = r2 + r3
            int r4 = r0.f9765e
            if (r2 < r4) goto L_0x0122
            r16.o()
        L_0x0122:
            r2 = 3
            j1.g r2 = r0.a(r2)
            int r4 = r0.f9762b
            int r4 = r4 + r3
            r0.f9762b = r4
            int r5 = r0.f9769i
            int r5 = r5 + r3
            r0.f9769i = r5
            r2.f9784b = r4
            j1.c r5 = r0.f9772l
            java.lang.Object r8 = r5.f9758d
            j1.g[] r8 = (j1.g[]) r8
            r8[r4] = r2
            r1.f9750a = r2
            int r4 = r0.f9770j
            r16.h(r17)
            int r8 = r0.f9770j
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x01a7
            j1.b r4 = r0.f9774o
            r4.getClass()
            r4.f9750a = r7
            j1.b$a r8 = r4.f9753d
            r8.clear()
            r8 = 0
        L_0x0154:
            j1.b$a r9 = r1.f9753d
            int r9 = r9.a()
            if (r8 >= r9) goto L_0x0170
            j1.b$a r9 = r1.f9753d
            j1.g r9 = r9.c(r8)
            j1.b$a r10 = r1.f9753d
            float r10 = r10.h(r8)
            j1.b$a r11 = r4.f9753d
            r11.i(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x0154
        L_0x0170:
            j1.b r4 = r0.f9774o
            r0.r(r4)
            int r4 = r2.f9785c
            r8 = -1
            if (r4 != r8) goto L_0x01a5
            j1.g r4 = r1.f9750a
            if (r4 != r2) goto L_0x0187
            j1.g r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x0187
            r1.g(r2)
        L_0x0187:
            boolean r2 = r1.f9754e
            if (r2 != 0) goto L_0x0190
            j1.g r2 = r1.f9750a
            r2.e(r0, r1)
        L_0x0190:
            java.lang.Object r2 = r5.f9756b
            j1.e r2 = (j1.e) r2
            int r4 = r2.f9776b
            java.lang.Object[] r5 = r2.f9775a
            int r7 = r5.length
            if (r4 >= r7) goto L_0x01a0
            r5[r4] = r1
            int r4 = r4 + r3
            r2.f9776b = r4
        L_0x01a0:
            int r2 = r0.f9770j
            int r2 = r2 - r3
            r0.f9770j = r2
        L_0x01a5:
            r2 = r3
            goto L_0x01a8
        L_0x01a7:
            r2 = 0
        L_0x01a8:
            j1.g r4 = r1.f9750a
            if (r4 == 0) goto L_0x01b7
            int r4 = r4.E
            if (r4 == r3) goto L_0x01b8
            float r4 = r1.f9751b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r3 = 0
        L_0x01b8:
            if (r3 != 0) goto L_0x01bb
            return
        L_0x01bb:
            r4 = r2
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            if (r4 != 0) goto L_0x01c3
            r16.h(r17)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.c(j1.b):void");
    }

    public final void d(g gVar, int i8) {
        int i10 = gVar.f9785c;
        if (i10 == -1) {
            gVar.d(this, (float) i8);
            for (int i11 = 0; i11 < this.f9762b + 1; i11++) {
                g gVar2 = ((g[]) this.f9772l.f9758d)[i11];
            }
        } else if (i10 != -1) {
            b bVar = this.f9766f[i10];
            if (bVar.f9754e) {
                bVar.f9751b = (float) i8;
            } else if (bVar.f9753d.a() == 0) {
                bVar.f9754e = true;
                bVar.f9751b = (float) i8;
            } else {
                b l10 = l();
                if (i8 < 0) {
                    l10.f9751b = (float) (i8 * -1);
                    l10.f9753d.e(gVar, 1.0f);
                } else {
                    l10.f9751b = (float) i8;
                    l10.f9753d.e(gVar, -1.0f);
                }
                c(l10);
            }
        } else {
            b l11 = l();
            l11.f9750a = gVar;
            float f10 = (float) i8;
            gVar.f9787e = f10;
            l11.f9751b = f10;
            l11.f9754e = true;
            c(l11);
        }
    }

    public final void e(g gVar, g gVar2, int i8, int i10) {
        if (i10 == 8 && gVar2.B && gVar.f9785c == -1) {
            gVar.d(this, gVar2.f9787e + ((float) i8));
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z10 = true;
            }
            l10.f9751b = (float) i8;
        }
        if (!z10) {
            l10.f9753d.e(gVar, -1.0f);
            l10.f9753d.e(gVar2, 1.0f);
        } else {
            l10.f9753d.e(gVar, 1.0f);
            l10.f9753d.e(gVar2, -1.0f);
        }
        if (i10 != 8) {
            l10.b(this, i10);
        }
        c(l10);
    }

    public final void f(g gVar, g gVar2, int i8, int i10) {
        b l10 = l();
        g m10 = m();
        m10.f9786d = 0;
        l10.c(gVar, gVar2, m10, i8);
        if (i10 != 8) {
            l10.f9753d.e(j(i10), (float) ((int) (l10.f9753d.d(m10) * -1.0f)));
        }
        c(l10);
    }

    public final void g(g gVar, g gVar2, int i8, int i10) {
        b l10 = l();
        g m10 = m();
        m10.f9786d = 0;
        l10.d(gVar, gVar2, m10, i8);
        if (i10 != 8) {
            l10.f9753d.e(j(i10), (float) ((int) (l10.f9753d.d(m10) * -1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i8;
        if (bVar.f9754e) {
            bVar.f9750a.d(this, bVar.f9751b);
        } else {
            b[] bVarArr = this.f9766f;
            int i10 = this.f9770j;
            bVarArr[i10] = bVar;
            g gVar = bVar.f9750a;
            gVar.f9785c = i10;
            this.f9770j = i10 + 1;
            gVar.e(this, bVar);
        }
        if (this.f9761a) {
            int i11 = 0;
            while (i11 < this.f9770j) {
                if (this.f9766f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f9766f[i11];
                if (bVar2 != null && bVar2.f9754e) {
                    bVar2.f9750a.d(this, bVar2.f9751b);
                    e eVar = (e) this.f9772l.f9756b;
                    int i12 = eVar.f9776b;
                    Object[] objArr = eVar.f9775a;
                    if (i12 < objArr.length) {
                        objArr[i12] = bVar2;
                        eVar.f9776b = i12 + 1;
                    }
                    this.f9766f[i11] = null;
                    int i13 = i11 + 1;
                    int i14 = i13;
                    while (true) {
                        i8 = this.f9770j;
                        if (i13 >= i8) {
                            break;
                        }
                        b[] bVarArr2 = this.f9766f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        g gVar2 = bVar3.f9750a;
                        if (gVar2.f9785c == i13) {
                            gVar2.f9785c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i8) {
                        this.f9766f[i14] = null;
                    }
                    this.f9770j = i8 - 1;
                    i11--;
                }
                i11++;
            }
            this.f9761a = false;
        }
    }

    public final void i() {
        for (int i8 = 0; i8 < this.f9770j; i8++) {
            b bVar = this.f9766f[i8];
            bVar.f9750a.f9787e = bVar.f9751b;
        }
    }

    public final g j(int i8) {
        if (this.f9769i + 1 >= this.f9765e) {
            o();
        }
        g a10 = a(4);
        int i10 = this.f9762b + 1;
        this.f9762b = i10;
        this.f9769i++;
        a10.f9784b = i10;
        a10.f9786d = i8;
        ((g[]) this.f9772l.f9758d)[i10] = a10;
        f fVar = this.f9763c;
        fVar.f9780i.f9781a = a10;
        float[] fArr = a10.D;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f9786d] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final g k(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f9769i + 1 >= this.f9765e) {
            o();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            gVar = cVar.f10834i;
            if (gVar == null) {
                cVar.k();
                gVar = cVar.f10834i;
            }
            int i8 = gVar.f9784b;
            c cVar2 = this.f9772l;
            if (i8 == -1 || i8 > this.f9762b || ((g[]) cVar2.f9758d)[i8] == null) {
                if (i8 != -1) {
                    gVar.c();
                }
                int i10 = this.f9762b + 1;
                this.f9762b = i10;
                this.f9769i++;
                gVar.f9784b = i10;
                gVar.E = 1;
                ((g[]) cVar2.f9758d)[i10] = gVar;
            }
        }
        return gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: j1.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j1.b l() {
        /*
            r6 = this;
            j1.c r0 = r6.f9772l
            java.lang.Object r1 = r0.f9756b
            j1.e r1 = (j1.e) r1
            int r2 = r1.f9776b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object[] r4 = r1.f9775a
            r5 = r4[r2]
            r4[r2] = r3
            r1.f9776b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            j1.b r5 = (j1.b) r5
            if (r5 != 0) goto L_0x0021
            j1.b r5 = new j1.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f9750a = r3
            j1.b$a r0 = r5.f9753d
            r0.clear()
            r0 = 0
            r5.f9751b = r0
            r0 = 0
            r5.f9754e = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.l():j1.b");
    }

    public final g m() {
        if (this.f9769i + 1 >= this.f9765e) {
            o();
        }
        g a10 = a(3);
        int i8 = this.f9762b + 1;
        this.f9762b = i8;
        this.f9769i++;
        a10.f9784b = i8;
        ((g[]) this.f9772l.f9758d)[i8] = a10;
        return a10;
    }

    public final void o() {
        int i8 = this.f9764d * 2;
        this.f9764d = i8;
        this.f9766f = (b[]) Arrays.copyOf(this.f9766f, i8);
        c cVar = this.f9772l;
        cVar.f9758d = (g[]) Arrays.copyOf((g[]) cVar.f9758d, this.f9764d);
        int i10 = this.f9764d;
        this.f9768h = new boolean[i10];
        this.f9765e = i10;
        this.f9771k = i10;
    }

    public final void p() {
        f fVar = this.f9763c;
        if (fVar.e()) {
            i();
        } else if (this.f9767g) {
            boolean z10 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= this.f9770j) {
                    z10 = true;
                    break;
                } else if (!this.f9766f[i8].f9754e) {
                    break;
                } else {
                    i8++;
                }
            }
            if (!z10) {
                q(fVar);
            } else {
                i();
            }
        } else {
            q(fVar);
        }
    }

    public final void q(f fVar) {
        float f10;
        int i8;
        boolean z10;
        int i10 = 0;
        while (true) {
            f10 = 0.0f;
            i8 = 1;
            if (i10 >= this.f9770j) {
                z10 = false;
                break;
            }
            b bVar = this.f9766f[i10];
            if (bVar.f9750a.E != 1 && bVar.f9751b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11 += i8;
                float f11 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                while (i14 < this.f9770j) {
                    b bVar2 = this.f9766f[i14];
                    if (bVar2.f9750a.E != i8 && !bVar2.f9754e && bVar2.f9751b < f10) {
                        int a10 = bVar2.f9753d.a();
                        int i16 = 0;
                        while (i16 < a10) {
                            g c3 = bVar2.f9753d.c(i16);
                            float d10 = bVar2.f9753d.d(c3);
                            if (d10 > f10) {
                                for (int i17 = 0; i17 < 9; i17++) {
                                    float f12 = c3.C[i17] / d10;
                                    if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                        i13 = c3.f9784b;
                                        i15 = i17;
                                        f11 = f12;
                                        i12 = i14;
                                    }
                                }
                            }
                            i16++;
                            f10 = 0.0f;
                        }
                    }
                    i14++;
                    f10 = 0.0f;
                    i8 = 1;
                }
                if (i12 != -1) {
                    b bVar3 = this.f9766f[i12];
                    bVar3.f9750a.f9785c = -1;
                    bVar3.g(((g[]) this.f9772l.f9758d)[i13]);
                    g gVar = bVar3.f9750a;
                    gVar.f9785c = i12;
                    gVar.e(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i11 > this.f9769i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i8 = 1;
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        for (int i8 = 0; i8 < this.f9769i; i8++) {
            this.f9768h[i8] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10++;
            if (i10 < this.f9769i * 2) {
                g gVar = bVar.f9750a;
                if (gVar != null) {
                    this.f9768h[gVar.f9784b] = true;
                }
                g a10 = bVar.a(this.f9768h);
                if (a10 != null) {
                    boolean[] zArr = this.f9768h;
                    int i11 = a10.f9784b;
                    if (!zArr[i11]) {
                        zArr[i11] = true;
                    } else {
                        return;
                    }
                }
                if (a10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < this.f9770j; i13++) {
                        b bVar2 = this.f9766f[i13];
                        if (bVar2.f9750a.E != 1 && !bVar2.f9754e && bVar2.f9753d.j(a10)) {
                            float d10 = bVar2.f9753d.d(a10);
                            if (d10 < 0.0f) {
                                float f11 = (-bVar2.f9751b) / d10;
                                if (f11 < f10) {
                                    i12 = i13;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i12 > -1) {
                        b bVar3 = this.f9766f[i12];
                        bVar3.f9750a.f9785c = -1;
                        bVar3.g(a10);
                        g gVar2 = bVar3.f9750a;
                        gVar2.f9785c = i12;
                        gVar2.e(this, bVar3);
                    }
                } else {
                    z10 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i8 = 0; i8 < this.f9770j; i8++) {
            b[] bVarArr = this.f9766f;
            b bVar = bVarArr[i8];
            if (bVar != null) {
                e eVar = (e) this.f9772l.f9756b;
                int i10 = eVar.f9776b;
                Object[] objArr = eVar.f9775a;
                if (i10 < objArr.length) {
                    objArr[i10] = bVar;
                    eVar.f9776b = i10 + 1;
                }
            }
            bVarArr[i8] = null;
        }
    }

    public final void t() {
        c cVar;
        int i8 = 0;
        while (true) {
            cVar = this.f9772l;
            g[] gVarArr = (g[]) cVar.f9758d;
            if (i8 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i8];
            if (gVar != null) {
                gVar.c();
            }
            i8++;
        }
        e eVar = (e) cVar.f9757c;
        g[] gVarArr2 = this.m;
        int i10 = this.f9773n;
        eVar.getClass();
        if (i10 > gVarArr2.length) {
            i10 = gVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            g gVar2 = gVarArr2[i11];
            int i12 = eVar.f9776b;
            Object[] objArr = eVar.f9775a;
            if (i12 < objArr.length) {
                objArr[i12] = gVar2;
                eVar.f9776b = i12 + 1;
            }
        }
        this.f9773n = 0;
        Arrays.fill((g[]) cVar.f9758d, (Object) null);
        this.f9762b = 0;
        f fVar = this.f9763c;
        fVar.f9779h = 0;
        fVar.f9751b = 0.0f;
        this.f9769i = 1;
        for (int i13 = 0; i13 < this.f9770j; i13++) {
            b bVar = this.f9766f[i13];
        }
        s();
        this.f9770j = 0;
        this.f9774o = new b(cVar);
    }
}
