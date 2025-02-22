package i0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import h0.c;
import sf.j;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f9359a = b.f9360a;

    public a() {
        new Rect();
        new Rect();
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, n nVar) {
        this.f9359a.drawArc(f10, f11, f12, f13, f14, f15, false, nVar.a());
    }

    public final void b(float f10) {
        this.f9359a.rotate(f10);
    }

    public final void c() {
        this.f9359a.save();
    }

    public final void d() {
        g.a(this.f9359a, false);
    }

    public final void e(float f10, float f11, float f12, float f13, c cVar) {
        j.f(cVar, "paint");
        this.f9359a.drawRect(f10, f11, f12, f13, cVar.f9361a);
    }

    public final void f(long j10, long j11, n nVar) {
        this.f9359a.drawLine(c.b(j10), c.c(j10), c.b(j11), c.c(j11), nVar.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(float[] r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 4
            r4 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r2 >= r3) goto L_0x0029
            r7 = r1
        L_0x000c:
            if (r7 >= r3) goto L_0x0026
            if (r2 != r7) goto L_0x0012
            r8 = r5
            goto L_0x0013
        L_0x0012:
            r8 = r6
        L_0x0013:
            int r9 = r2 * 4
            int r9 = r9 + r7
            r9 = r0[r9]
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x001e
            r8 = r4
            goto L_0x001f
        L_0x001e:
            r8 = r1
        L_0x001f:
            if (r8 != 0) goto L_0x0023
            r2 = r1
            goto L_0x002a
        L_0x0023:
            int r7 = r7 + 1
            goto L_0x000c
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r2 != 0) goto L_0x00ec
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r7 = 2
            r8 = r0[r7]
            int r9 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            r9 = r4
            goto L_0x003b
        L_0x003a:
            r9 = r1
        L_0x003b:
            r10 = 8
            r11 = 6
            if (r9 == 0) goto L_0x008c
            r9 = r0[r11]
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0048
            r9 = r4
            goto L_0x0049
        L_0x0048:
            r9 = r1
        L_0x0049:
            if (r9 == 0) goto L_0x008c
            r9 = 10
            r9 = r0[r9]
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0055
            r5 = r4
            goto L_0x0056
        L_0x0055:
            r5 = r1
        L_0x0056:
            if (r5 == 0) goto L_0x008c
            r5 = 14
            r5 = r0[r5]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0062
            r5 = r4
            goto L_0x0063
        L_0x0062:
            r5 = r1
        L_0x0063:
            if (r5 == 0) goto L_0x008c
            r5 = r0[r10]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x006d
            r5 = r4
            goto L_0x006e
        L_0x006d:
            r5 = r1
        L_0x006e:
            if (r5 == 0) goto L_0x008c
            r5 = 9
            r5 = r0[r5]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x007a
            r5 = r4
            goto L_0x007b
        L_0x007a:
            r5 = r1
        L_0x007b:
            if (r5 == 0) goto L_0x008c
            r5 = 11
            r5 = r0[r5]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0087
            r5 = r4
            goto L_0x0088
        L_0x0087:
            r5 = r1
        L_0x0088:
            if (r5 == 0) goto L_0x008c
            r5 = r4
            goto L_0x008d
        L_0x008c:
            r5 = r1
        L_0x008d:
            if (r5 == 0) goto L_0x00de
            r5 = r0[r1]
            r6 = r0[r4]
            r9 = 3
            r12 = r0[r9]
            r13 = r0[r3]
            r14 = 5
            r15 = r0[r14]
            r16 = r0[r11]
            r17 = 7
            r18 = r0[r17]
            r19 = r0[r10]
            r20 = 12
            r20 = r0[r20]
            r21 = 13
            r21 = r0[r21]
            r22 = 15
            r22 = r0[r22]
            r0[r1] = r5
            r0[r4] = r13
            r0[r7] = r20
            r0[r9] = r6
            r0[r3] = r15
            r0[r14] = r21
            r0[r11] = r12
            r0[r17] = r18
            r0[r10] = r22
            r2.setValues(r0)
            r0[r1] = r5
            r0[r4] = r6
            r0[r7] = r8
            r0[r9] = r12
            r0[r3] = r13
            r0[r14] = r15
            r0[r11] = r16
            r0[r17] = r18
            r0[r10] = r19
            r0 = r23
            android.graphics.Canvas r1 = r0.f9359a
            r1.concat(r2)
            goto L_0x00ee
        L_0x00de:
            r0 = r23
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Android does not support arbitrary transforms"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ec:
            r0 = r23
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.a.g(float[]):void");
    }

    public final void j(float f10, float f11, float f12, float f13, int i8) {
        this.f9359a.clipRect(f10, f11, f12, f13, i8 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    public final void k(float f10, float f11) {
        this.f9359a.translate(f10, f11);
    }

    public final void l() {
        this.f9359a.restore();
    }

    public final void m(o oVar, int i8) {
        j.f(oVar, "path");
        Canvas canvas = this.f9359a;
        if (oVar instanceof e) {
            canvas.clipPath(((e) oVar).f9366a, i8 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void n() {
        g.a(this.f9359a, true);
    }

    public final Canvas o() {
        return this.f9359a;
    }

    public final void p(Canvas canvas) {
        j.f(canvas, "<set-?>");
        this.f9359a = canvas;
    }
}
