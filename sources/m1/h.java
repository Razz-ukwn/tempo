package m1;

import l1.c;
import l1.d;
import l1.e;
import m1.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f11154a = new b.a();

    public static boolean a(d dVar) {
        int[] iArr = dVar.V;
        int i8 = iArr[0];
        int i10 = iArr[1];
        d dVar2 = dVar.W;
        e eVar = dVar2 != null ? (e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.V[0];
        }
        if (eVar != null) {
            int i12 = eVar.V[1];
        }
        boolean z10 = i8 == 1 || dVar.B() || i8 == 2 || (i8 == 3 && dVar.f10875s == 0 && dVar.Z == 0.0f && dVar.u(0)) || (i8 == 3 && dVar.f10875s == 1 && dVar.v(0, dVar.r()));
        boolean z11 = i10 == 1 || dVar.C() || i10 == 2 || (i10 == 3 && dVar.f10876t == 0 && dVar.Z == 0.0f && dVar.u(1)) || (i10 == 3 && dVar.f10876t == 1 && dVar.v(1, dVar.l()));
        if (dVar.Z <= 0.0f || (!z10 && !z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0144, code lost:
        r13 = r10.f10831f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014e, code lost:
        r13 = r9.f10831f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r18, l1.d r19, m1.b.C0211b r20, boolean r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f10865n
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r3 = r0 instanceof l1.e
            if (r3 != 0) goto L_0x0023
            boolean r3 = r19.A()
            if (r3 == 0) goto L_0x0023
            boolean r3 = a(r19)
            if (r3 == 0) goto L_0x0023
            m1.b$a r3 = new m1.b$a
            r3.<init>()
            l1.e.V(r0, r1, r3)
        L_0x0023:
            l1.c$a r3 = l1.c.a.f10835a
            l1.c r3 = r0.j(r3)
            l1.c$a r4 = l1.c.a.f10837c
            l1.c r4 = r0.j(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet<l1.c> r7 = r3.f10826a
            r11 = 0
            r12 = 3
            if (r7 == 0) goto L_0x0108
            boolean r3 = r3.f10828c
            if (r3 == 0) goto L_0x0108
            java.util.Iterator r3 = r7.iterator()
        L_0x0045:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0108
            java.lang.Object r7 = r3.next()
            l1.c r7 = (l1.c) r7
            l1.d r13 = r7.f10829d
            int r14 = r18 + 1
            boolean r15 = a(r13)
            boolean r16 = r13.A()
            if (r16 == 0) goto L_0x0069
            if (r15 == 0) goto L_0x0069
            m1.b$a r10 = new m1.b$a
            r10.<init>()
            l1.e.V(r13, r1, r10)
        L_0x0069:
            l1.c r10 = r13.K
            l1.c r8 = r13.M
            if (r7 != r10) goto L_0x0077
            l1.c r9 = r8.f10831f
            if (r9 == 0) goto L_0x0077
            boolean r9 = r9.f10828c
            if (r9 != 0) goto L_0x0081
        L_0x0077:
            if (r7 != r8) goto L_0x0085
            l1.c r9 = r10.f10831f
            if (r9 == 0) goto L_0x0085
            boolean r9 = r9.f10828c
            if (r9 == 0) goto L_0x0085
        L_0x0081:
            r17 = r3
            r9 = 1
            goto L_0x0088
        L_0x0085:
            r17 = r3
            r9 = r11
        L_0x0088:
            int[] r3 = r13.V
            r3 = r3[r11]
            if (r3 != r12) goto L_0x00c2
            if (r15 == 0) goto L_0x0091
            goto L_0x00c2
        L_0x0091:
            if (r3 != r12) goto L_0x0104
            int r3 = r13.f10879w
            if (r3 < 0) goto L_0x0104
            int r3 = r13.f10878v
            if (r3 < 0) goto L_0x0104
            int r3 = r13.f10859j0
            r7 = 8
            if (r3 == r7) goto L_0x00ac
            int r3 = r13.f10875s
            if (r3 != 0) goto L_0x0104
            float r3 = r13.Z
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0104
        L_0x00ac:
            boolean r3 = r13.y()
            if (r3 != 0) goto L_0x0104
            boolean r3 = r13.H
            if (r3 != 0) goto L_0x0104
            if (r9 == 0) goto L_0x0104
            boolean r3 = r13.y()
            if (r3 != 0) goto L_0x0104
            d(r14, r0, r1, r13, r2)
            goto L_0x0104
        L_0x00c2:
            boolean r3 = r13.A()
            if (r3 == 0) goto L_0x00c9
            goto L_0x0104
        L_0x00c9:
            if (r7 != r10) goto L_0x00e0
            l1.c r3 = r8.f10831f
            if (r3 != 0) goto L_0x00e0
            int r3 = r10.e()
            int r3 = r3 + r5
            int r7 = r13.r()
            int r7 = r7 + r3
            r13.J(r3, r7)
            b(r14, r13, r1, r2)
            goto L_0x0104
        L_0x00e0:
            if (r7 != r8) goto L_0x00f9
            l1.c r3 = r10.f10831f
            if (r3 != 0) goto L_0x00f9
            int r3 = r8.e()
            int r3 = r5 - r3
            int r7 = r13.r()
            int r7 = r3 - r7
            r13.J(r7, r3)
            b(r14, r13, r1, r2)
            goto L_0x0104
        L_0x00f9:
            if (r9 == 0) goto L_0x0104
            boolean r3 = r13.y()
            if (r3 != 0) goto L_0x0104
            c(r14, r13, r1, r2)
        L_0x0104:
            r3 = r17
            goto L_0x0045
        L_0x0108:
            boolean r3 = r0 instanceof l1.g
            if (r3 == 0) goto L_0x010d
            return
        L_0x010d:
            java.util.HashSet<l1.c> r3 = r4.f10826a
            if (r3 == 0) goto L_0x01e3
            boolean r4 = r4.f10828c
            if (r4 == 0) goto L_0x01e3
            java.util.Iterator r3 = r3.iterator()
        L_0x0119:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()
            l1.c r4 = (l1.c) r4
            l1.d r5 = r4.f10829d
            r7 = 1
            int r8 = r18 + 1
            boolean r7 = a(r5)
            boolean r9 = r5.A()
            if (r9 == 0) goto L_0x013e
            if (r7 == 0) goto L_0x013e
            m1.b$a r9 = new m1.b$a
            r9.<init>()
            l1.e.V(r5, r1, r9)
        L_0x013e:
            l1.c r9 = r5.K
            l1.c r10 = r5.M
            if (r4 != r9) goto L_0x014c
            l1.c r13 = r10.f10831f
            if (r13 == 0) goto L_0x014c
            boolean r13 = r13.f10828c
            if (r13 != 0) goto L_0x0156
        L_0x014c:
            if (r4 != r10) goto L_0x0158
            l1.c r13 = r9.f10831f
            if (r13 == 0) goto L_0x0158
            boolean r13 = r13.f10828c
            if (r13 == 0) goto L_0x0158
        L_0x0156:
            r13 = 1
            goto L_0x0159
        L_0x0158:
            r13 = r11
        L_0x0159:
            int[] r14 = r5.V
            r14 = r14[r11]
            if (r14 != r12) goto L_0x0199
            if (r7 == 0) goto L_0x0162
            goto L_0x0199
        L_0x0162:
            if (r14 != r12) goto L_0x0195
            int r4 = r5.f10879w
            if (r4 < 0) goto L_0x0195
            int r4 = r5.f10878v
            if (r4 < 0) goto L_0x0195
            int r4 = r5.f10859j0
            r7 = 8
            if (r4 == r7) goto L_0x017e
            int r4 = r5.f10875s
            if (r4 != 0) goto L_0x0197
            float r4 = r5.Z
            r14 = 0
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0119
            goto L_0x017f
        L_0x017e:
            r14 = 0
        L_0x017f:
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0119
            boolean r4 = r5.H
            if (r4 != 0) goto L_0x0119
            if (r13 == 0) goto L_0x0119
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0119
            d(r8, r0, r1, r5, r2)
            goto L_0x0119
        L_0x0195:
            r7 = 8
        L_0x0197:
            r14 = 0
            goto L_0x0119
        L_0x0199:
            r7 = 8
            r14 = 0
            boolean r15 = r5.A()
            if (r15 == 0) goto L_0x01a4
            goto L_0x0119
        L_0x01a4:
            if (r4 != r9) goto L_0x01bc
            l1.c r15 = r10.f10831f
            if (r15 != 0) goto L_0x01bc
            int r4 = r9.e()
            int r4 = r4 + r6
            int r9 = r5.r()
            int r9 = r9 + r4
            r5.J(r4, r9)
            b(r8, r5, r1, r2)
            goto L_0x0119
        L_0x01bc:
            if (r4 != r10) goto L_0x01d6
            l1.c r4 = r9.f10831f
            if (r4 != 0) goto L_0x01d6
            int r4 = r10.e()
            int r4 = r6 - r4
            int r9 = r5.r()
            int r9 = r4 - r9
            r5.J(r9, r4)
            b(r8, r5, r1, r2)
            goto L_0x0119
        L_0x01d6:
            if (r13 == 0) goto L_0x0119
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0119
            c(r8, r5, r1, r2)
            goto L_0x0119
        L_0x01e3:
            r1 = 1
            r0.f10865n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.h.b(int, l1.d, m1.b$b, boolean):void");
    }

    public static void c(int i8, d dVar, b.C0211b bVar, boolean z10) {
        float f10 = dVar.f10853g0;
        c cVar = dVar.K;
        int d10 = cVar.f10831f.d();
        c cVar2 = dVar.M;
        int d11 = cVar2.f10831f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int r10 = dVar.r();
        int i10 = (d11 - d10) - r10;
        if (d10 > d11) {
            i10 = (d10 - d11) - r10;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * ((float) i10)) + 0.5f : f10 * ((float) i10))) + d10;
        int i12 = i11 + r10;
        if (d10 > d11) {
            i12 = i11 - r10;
        }
        dVar.J(i11, i12);
        b(i8 + 1, dVar, bVar, z10);
    }

    public static void d(int i8, d dVar, b.C0211b bVar, d dVar2, boolean z10) {
        float f10 = dVar2.f10853g0;
        c cVar = dVar2.K;
        int e10 = cVar.e() + cVar.f10831f.d();
        c cVar2 = dVar2.M;
        int d10 = cVar2.f10831f.d() - cVar2.e();
        if (d10 >= e10) {
            int r10 = dVar2.r();
            if (dVar2.f10859j0 != 8) {
                int i10 = dVar2.f10875s;
                if (i10 == 2) {
                    r10 = (int) (dVar2.f10853g0 * 0.5f * ((float) (dVar instanceof e ? dVar.r() : dVar.W.r())));
                } else if (i10 == 0) {
                    r10 = d10 - e10;
                }
                r10 = Math.max(dVar2.f10878v, r10);
                int i11 = dVar2.f10879w;
                if (i11 > 0) {
                    r10 = Math.min(i11, r10);
                }
            }
            int i12 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - r10))) + 0.5f));
            dVar2.J(i12, r10 + i12);
            b(i8 + 1, dVar2, bVar, z10);
        }
    }

    public static void e(int i8, d dVar, b.C0211b bVar) {
        float f10 = dVar.f10855h0;
        c cVar = dVar.L;
        int d10 = cVar.f10831f.d();
        c cVar2 = dVar.N;
        int d11 = cVar2.f10831f.d();
        int e10 = cVar.e() + d10;
        int e11 = d11 - cVar2.e();
        if (d10 == d11) {
            f10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int l10 = dVar.l();
        int i10 = (d11 - d10) - l10;
        if (d10 > d11) {
            i10 = (d10 - d11) - l10;
        }
        int i11 = (int) (i10 > 0 ? (f10 * ((float) i10)) + 0.5f : f10 * ((float) i10));
        int i12 = d10 + i11;
        int i13 = i12 + l10;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - l10;
        }
        dVar.K(i12, i13);
        g(i8 + 1, dVar, bVar);
    }

    public static void f(int i8, d dVar, b.C0211b bVar, d dVar2) {
        float f10 = dVar2.f10855h0;
        c cVar = dVar2.L;
        int e10 = cVar.e() + cVar.f10831f.d();
        c cVar2 = dVar2.N;
        int d10 = cVar2.f10831f.d() - cVar2.e();
        if (d10 >= e10) {
            int l10 = dVar2.l();
            if (dVar2.f10859j0 != 8) {
                int i10 = dVar2.f10876t;
                if (i10 == 2) {
                    l10 = (int) (f10 * 0.5f * ((float) (dVar instanceof e ? dVar.l() : dVar.W.l())));
                } else if (i10 == 0) {
                    l10 = d10 - e10;
                }
                l10 = Math.max(dVar2.f10881y, l10);
                int i11 = dVar2.f10882z;
                if (i11 > 0) {
                    l10 = Math.min(i11, l10);
                }
            }
            int i12 = e10 + ((int) ((f10 * ((float) ((d10 - e10) - l10))) + 0.5f));
            dVar2.K(i12, l10 + i12);
            g(i8 + 1, dVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r7 = r9.f10831f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r7 = r15.f10831f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r16, l1.d r17, m1.b.C0211b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f10867o
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0 instanceof l1.e
            if (r2 != 0) goto L_0x0021
            boolean r2 = r17.A()
            if (r2 == 0) goto L_0x0021
            boolean r2 = a(r17)
            if (r2 == 0) goto L_0x0021
            m1.b$a r2 = new m1.b$a
            r2.<init>()
            l1.e.V(r0, r1, r2)
        L_0x0021:
            l1.c$a r2 = l1.c.a.f10836b
            l1.c r2 = r0.j(r2)
            l1.c$a r3 = l1.c.a.f10838d
            l1.c r3 = r0.j(r3)
            int r4 = r2.d()
            int r5 = r3.d()
            java.util.HashSet<l1.c> r6 = r2.f10826a
            r10 = 1
            r11 = 3
            if (r6 == 0) goto L_0x0102
            boolean r2 = r2.f10828c
            if (r2 == 0) goto L_0x0102
            java.util.Iterator r2 = r6.iterator()
        L_0x0043:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0102
            java.lang.Object r6 = r2.next()
            l1.c r6 = (l1.c) r6
            l1.d r12 = r6.f10829d
            int r13 = r16 + 1
            boolean r14 = a(r12)
            boolean r15 = r12.A()
            if (r15 == 0) goto L_0x0067
            if (r14 == 0) goto L_0x0067
            m1.b$a r15 = new m1.b$a
            r15.<init>()
            l1.e.V(r12, r1, r15)
        L_0x0067:
            l1.c r15 = r12.L
            l1.c r9 = r12.N
            if (r6 != r15) goto L_0x0075
            l1.c r7 = r9.f10831f
            if (r7 == 0) goto L_0x0075
            boolean r7 = r7.f10828c
            if (r7 != 0) goto L_0x007f
        L_0x0075:
            if (r6 != r9) goto L_0x0081
            l1.c r7 = r15.f10831f
            if (r7 == 0) goto L_0x0081
            boolean r7 = r7.f10828c
            if (r7 == 0) goto L_0x0081
        L_0x007f:
            r7 = r10
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            int[] r8 = r12.V
            r8 = r8[r10]
            if (r8 != r11) goto L_0x00bc
            if (r14 == 0) goto L_0x008b
            goto L_0x00bc
        L_0x008b:
            if (r8 != r11) goto L_0x0043
            int r6 = r12.f10882z
            if (r6 < 0) goto L_0x0043
            int r6 = r12.f10881y
            if (r6 < 0) goto L_0x0043
            int r6 = r12.f10859j0
            r8 = 8
            if (r6 == r8) goto L_0x00a6
            int r6 = r12.f10876t
            if (r6 != 0) goto L_0x0043
            float r6 = r12.Z
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
        L_0x00a6:
            boolean r6 = r12.z()
            if (r6 != 0) goto L_0x0043
            boolean r6 = r12.H
            if (r6 != 0) goto L_0x0043
            if (r7 == 0) goto L_0x0043
            boolean r6 = r12.z()
            if (r6 != 0) goto L_0x0043
            f(r13, r0, r1, r12)
            goto L_0x0043
        L_0x00bc:
            boolean r8 = r12.A()
            if (r8 == 0) goto L_0x00c3
            goto L_0x0043
        L_0x00c3:
            if (r6 != r15) goto L_0x00db
            l1.c r8 = r9.f10831f
            if (r8 != 0) goto L_0x00db
            int r6 = r15.e()
            int r6 = r6 + r4
            int r7 = r12.l()
            int r7 = r7 + r6
            r12.K(r6, r7)
            g(r13, r12, r1)
            goto L_0x0043
        L_0x00db:
            if (r6 != r9) goto L_0x00f5
            l1.c r6 = r15.f10831f
            if (r6 != 0) goto L_0x00f5
            int r6 = r9.e()
            int r6 = r4 - r6
            int r7 = r12.l()
            int r7 = r6 - r7
            r12.K(r7, r6)
            g(r13, r12, r1)
            goto L_0x0043
        L_0x00f5:
            if (r7 == 0) goto L_0x0043
            boolean r6 = r12.z()
            if (r6 != 0) goto L_0x0043
            e(r13, r12, r1)
            goto L_0x0043
        L_0x0102:
            boolean r2 = r0 instanceof l1.g
            if (r2 == 0) goto L_0x0107
            return
        L_0x0107:
            java.util.HashSet<l1.c> r2 = r3.f10826a
            if (r2 == 0) goto L_0x01dc
            boolean r3 = r3.f10828c
            if (r3 == 0) goto L_0x01dc
            java.util.Iterator r2 = r2.iterator()
        L_0x0113:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01dc
            java.lang.Object r3 = r2.next()
            l1.c r3 = (l1.c) r3
            l1.d r4 = r3.f10829d
            int r6 = r16 + 1
            boolean r7 = a(r4)
            boolean r8 = r4.A()
            if (r8 == 0) goto L_0x0137
            if (r7 == 0) goto L_0x0137
            m1.b$a r8 = new m1.b$a
            r8.<init>()
            l1.e.V(r4, r1, r8)
        L_0x0137:
            l1.c r8 = r4.L
            l1.c r9 = r4.N
            if (r3 != r8) goto L_0x0145
            l1.c r12 = r9.f10831f
            if (r12 == 0) goto L_0x0145
            boolean r12 = r12.f10828c
            if (r12 != 0) goto L_0x014f
        L_0x0145:
            if (r3 != r9) goto L_0x0151
            l1.c r12 = r8.f10831f
            if (r12 == 0) goto L_0x0151
            boolean r12 = r12.f10828c
            if (r12 == 0) goto L_0x0151
        L_0x014f:
            r12 = r10
            goto L_0x0152
        L_0x0151:
            r12 = 0
        L_0x0152:
            int[] r13 = r4.V
            r13 = r13[r10]
            if (r13 != r11) goto L_0x0192
            if (r7 == 0) goto L_0x015b
            goto L_0x0192
        L_0x015b:
            if (r13 != r11) goto L_0x018e
            int r3 = r4.f10882z
            if (r3 < 0) goto L_0x018e
            int r3 = r4.f10881y
            if (r3 < 0) goto L_0x018e
            int r3 = r4.f10859j0
            r7 = 8
            if (r3 == r7) goto L_0x0177
            int r3 = r4.f10876t
            if (r3 != 0) goto L_0x0190
            float r3 = r4.Z
            r13 = 0
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0113
            goto L_0x0178
        L_0x0177:
            r13 = 0
        L_0x0178:
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x0113
            boolean r3 = r4.H
            if (r3 != 0) goto L_0x0113
            if (r12 == 0) goto L_0x0113
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x0113
            f(r6, r0, r1, r4)
            goto L_0x0113
        L_0x018e:
            r7 = 8
        L_0x0190:
            r13 = 0
            goto L_0x0113
        L_0x0192:
            r7 = 8
            r13 = 0
            boolean r14 = r4.A()
            if (r14 == 0) goto L_0x019d
            goto L_0x0113
        L_0x019d:
            if (r3 != r8) goto L_0x01b5
            l1.c r14 = r9.f10831f
            if (r14 != 0) goto L_0x01b5
            int r3 = r8.e()
            int r3 = r3 + r5
            int r8 = r4.l()
            int r8 = r8 + r3
            r4.K(r3, r8)
            g(r6, r4, r1)
            goto L_0x0113
        L_0x01b5:
            if (r3 != r9) goto L_0x01cf
            l1.c r3 = r8.f10831f
            if (r3 != 0) goto L_0x01cf
            int r3 = r9.e()
            int r3 = r5 - r3
            int r8 = r4.l()
            int r8 = r3 - r8
            r4.K(r8, r3)
            g(r6, r4, r1)
            goto L_0x0113
        L_0x01cf:
            if (r12 == 0) goto L_0x0113
            boolean r3 = r4.z()
            if (r3 != 0) goto L_0x0113
            e(r6, r4, r1)
            goto L_0x0113
        L_0x01dc:
            l1.c$a r2 = l1.c.a.f10839e
            l1.c r2 = r0.j(r2)
            java.util.HashSet<l1.c> r3 = r2.f10826a
            if (r3 == 0) goto L_0x0251
            boolean r3 = r2.f10828c
            if (r3 == 0) goto L_0x0251
            int r3 = r2.d()
            java.util.HashSet<l1.c> r2 = r2.f10826a
            java.util.Iterator r2 = r2.iterator()
        L_0x01f4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0251
            java.lang.Object r4 = r2.next()
            l1.c r4 = (l1.c) r4
            l1.d r5 = r4.f10829d
            int r6 = r16 + 1
            boolean r7 = a(r5)
            boolean r8 = r5.A()
            if (r8 == 0) goto L_0x0218
            if (r7 == 0) goto L_0x0218
            m1.b$a r8 = new m1.b$a
            r8.<init>()
            l1.e.V(r5, r1, r8)
        L_0x0218:
            int[] r8 = r5.V
            r8 = r8[r10]
            if (r8 != r11) goto L_0x0220
            if (r7 == 0) goto L_0x01f4
        L_0x0220:
            boolean r7 = r5.A()
            if (r7 == 0) goto L_0x0227
            goto L_0x01f4
        L_0x0227:
            l1.c r7 = r5.O
            if (r4 != r7) goto L_0x01f4
            int r4 = r4.e()
            int r4 = r4 + r3
            boolean r8 = r5.F
            if (r8 != 0) goto L_0x0235
            goto L_0x024d
        L_0x0235:
            int r8 = r5.f10847d0
            int r8 = r4 - r8
            int r9 = r5.Y
            int r9 = r9 + r8
            r5.f10845c0 = r8
            l1.c r12 = r5.L
            r12.l(r8)
            l1.c r8 = r5.N
            r8.l(r9)
            r7.l(r4)
            r5.m = r10
        L_0x024d:
            g(r6, r5, r1)
            goto L_0x01f4
        L_0x0251:
            r0.f10867o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.h.g(int, l1.d, m1.b$b):void");
    }
}
