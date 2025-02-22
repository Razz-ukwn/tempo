package m1;

import l1.c;
import l1.d;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f11166a;

    /* renamed from: b  reason: collision with root package name */
    public d f11167b;

    /* renamed from: c  reason: collision with root package name */
    public m f11168c;

    /* renamed from: d  reason: collision with root package name */
    public int f11169d;

    /* renamed from: e  reason: collision with root package name */
    public final g f11170e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f11171f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11172g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f11173h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f11174i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f11175j = 1;

    public p(d dVar) {
        this.f11167b = dVar;
    }

    public static void b(f fVar, f fVar2, int i8) {
        fVar.f11153l.add(fVar2);
        fVar.f11147f = i8;
        fVar2.f11152k.add(fVar);
    }

    public static f h(c cVar) {
        c cVar2 = cVar.f10831f;
        if (cVar2 == null) {
            return null;
        }
        int ordinal = cVar2.f10830e.ordinal();
        d dVar = cVar2.f10829d;
        if (ordinal == 1) {
            return dVar.f10846d.f11173h;
        }
        if (ordinal == 2) {
            return dVar.f10848e.f11173h;
        }
        if (ordinal == 3) {
            return dVar.f10846d.f11174i;
        }
        if (ordinal == 4) {
            return dVar.f10848e.f11174i;
        }
        if (ordinal != 5) {
            return null;
        }
        return dVar.f10848e.f11158k;
    }

    public static f i(c cVar, int i8) {
        c cVar2 = cVar.f10831f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f10829d;
        p pVar = i8 == 0 ? dVar.f10846d : dVar.f10848e;
        int ordinal = cVar2.f10830e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f11173h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f11174i;
        }
        return null;
    }

    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i8, g gVar) {
        fVar.f11153l.add(fVar2);
        fVar.f11153l.add(this.f11170e);
        fVar.f11149h = i8;
        fVar.f11150i = gVar;
        fVar2.f11152k.add(fVar);
        gVar.f11152k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i8, int i10) {
        int i11;
        if (i10 == 0) {
            d dVar = this.f11167b;
            int i12 = dVar.f10879w;
            i11 = Math.max(dVar.f10878v, i8);
            if (i12 > 0) {
                i11 = Math.min(i12, i8);
            }
            if (i11 == i8) {
                return i8;
            }
        } else {
            d dVar2 = this.f11167b;
            int i13 = dVar2.f10882z;
            int max = Math.max(dVar2.f10881y, i8);
            if (i13 > 0) {
                max = Math.min(i13, i8);
            }
            if (i11 == i8) {
                return i8;
            }
        }
        return i11;
    }

    public long j() {
        g gVar = this.f11170e;
        if (gVar.f11151j) {
            return (long) gVar.f11148g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f11166a == 3) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(l1.c r12, l1.c r13, int r14) {
        /*
            r11 = this;
            m1.f r0 = h(r12)
            m1.f r1 = h(r13)
            boolean r2 = r0.f11151j
            if (r2 == 0) goto L_0x00e7
            boolean r2 = r1.f11151j
            if (r2 != 0) goto L_0x0012
            goto L_0x00e7
        L_0x0012:
            int r2 = r0.f11148g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.f11148g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            m1.g r3 = r11.f11170e
            boolean r4 = r3.f11151j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b0
            int r4 = r11.f11169d
            r6 = 3
            if (r4 != r6) goto L_0x00b0
            int r4 = r11.f11166a
            if (r4 == 0) goto L_0x00a9
            r7 = 1
            if (r4 == r7) goto L_0x009b
            r8 = 2
            if (r4 == r8) goto L_0x0073
            if (r4 == r6) goto L_0x003d
            goto L_0x00b0
        L_0x003d:
            l1.d r4 = r11.f11167b
            m1.l r8 = r4.f10846d
            int r9 = r8.f11169d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f11166a
            if (r9 != r6) goto L_0x0054
            m1.n r9 = r4.f10848e
            int r10 = r9.f11169d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f11166a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b0
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            m1.n r8 = r4.f10848e
        L_0x0058:
            m1.g r6 = r8.f11170e
            boolean r8 = r6.f11151j
            if (r8 == 0) goto L_0x00b0
            float r4 = r4.Z
            if (r14 != r7) goto L_0x0069
            int r6 = r6.f11148g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x006f
        L_0x0069:
            int r6 = r6.f11148g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x006f:
            r3.d(r4)
            goto L_0x00b0
        L_0x0073:
            l1.d r4 = r11.f11167b
            l1.d r6 = r4.W
            if (r6 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x007e
            m1.l r6 = r6.f10846d
            goto L_0x0080
        L_0x007e:
            m1.n r6 = r6.f10848e
        L_0x0080:
            m1.g r6 = r6.f11170e
            boolean r7 = r6.f11151j
            if (r7 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x008b
            float r4 = r4.f10880x
            goto L_0x008d
        L_0x008b:
            float r4 = r4.A
        L_0x008d:
            int r6 = r6.f11148g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto L_0x00b0
        L_0x009b:
            int r4 = r3.m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto L_0x00b0
        L_0x00a9:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        L_0x00b0:
            boolean r4 = r3.f11151j
            if (r4 != 0) goto L_0x00b5
            return
        L_0x00b5:
            int r4 = r3.f11148g
            m1.f r6 = r11.f11174i
            m1.f r7 = r11.f11173h
            if (r4 != r13) goto L_0x00c4
            r7.d(r12)
            r6.d(r2)
            return
        L_0x00c4:
            l1.d r13 = r11.f11167b
            if (r14 != 0) goto L_0x00cb
            float r13 = r13.f10853g0
            goto L_0x00cd
        L_0x00cb:
            float r13 = r13.f10855h0
        L_0x00cd:
            if (r0 != r1) goto L_0x00d4
            int r12 = r0.f11148g
            int r2 = r1.f11148g
            r13 = r5
        L_0x00d4:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r14 = (float) r2
            float r14 = r14 * r13
            float r14 = r14 + r12
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.f11148g
            int r13 = r3.f11148g
            int r12 = r12 + r13
            r6.d(r12)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.p.l(l1.c, l1.c, int):void");
    }
}
