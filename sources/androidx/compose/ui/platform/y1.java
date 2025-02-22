package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import d2.f1;
import f1.c;
import f1.j;
import h0.d;
import h0.f;
import h0.g;
import i0.e;
import i0.m;
import i0.o;
import i0.p;
import i0.t;
import q4.a;

public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public c f1513a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1514b = true;

    /* renamed from: c  reason: collision with root package name */
    public final Outline f1515c;

    /* renamed from: d  reason: collision with root package name */
    public long f1516d;

    /* renamed from: e  reason: collision with root package name */
    public t f1517e;

    /* renamed from: f  reason: collision with root package name */
    public o f1518f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1519g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1520h;

    /* renamed from: i  reason: collision with root package name */
    public o f1521i;

    /* renamed from: j  reason: collision with root package name */
    public f f1522j;

    /* renamed from: k  reason: collision with root package name */
    public float f1523k;

    /* renamed from: l  reason: collision with root package name */
    public long f1524l;
    public long m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1525n;

    /* renamed from: o  reason: collision with root package name */
    public j f1526o;

    /* renamed from: p  reason: collision with root package name */
    public m f1527p;

    public y1(c cVar) {
        sf.j.f(cVar, "density");
        this.f1513a = cVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f1515c = outline;
        long j10 = g.f9086b;
        this.f1516d = j10;
        this.f1517e = p.f9383a;
        this.f1524l = h0.c.f9068b;
        this.m = j10;
        this.f1526o = j.f8039a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0106, code lost:
        if (r2 != false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i0.f r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "canvas"
            sf.j.f(r1, r2)
            r17.e()
            i0.o r2 = r0.f1518f
            r3 = 1
            if (r2 == 0) goto L_0x0016
            r1.m(r2, r3)
            goto L_0x018e
        L_0x0016:
            float r2 = r0.f1523k
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0162
            i0.o r4 = r0.f1521i
            h0.f r5 = r0.f1522j
            r6 = 0
            if (r4 == 0) goto L_0x0108
            long r7 = r0.f1524l
            long r9 = r0.m
            if (r5 == 0) goto L_0x0105
            long r11 = r5.f9082e
            float r13 = h0.a.b(r11)
            float r14 = h0.a.c(r11)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            r13 = r3
            goto L_0x003b
        L_0x003a:
            r13 = r6
        L_0x003b:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            long r14 = r5.f9083f
            float r16 = h0.a.b(r14)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x004d
            r13 = r3
            goto L_0x004e
        L_0x004d:
            r13 = r6
        L_0x004e:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            float r14 = h0.a.c(r14)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x005e
            r13 = r3
            goto L_0x005f
        L_0x005e:
            r13 = r6
        L_0x005f:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            long r14 = r5.f9084g
            float r16 = h0.a.b(r14)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            r13 = r3
            goto L_0x0072
        L_0x0071:
            r13 = r6
        L_0x0072:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            float r14 = h0.a.c(r14)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x0082
            r13 = r3
            goto L_0x0083
        L_0x0082:
            r13 = r6
        L_0x0083:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            long r14 = r5.f9085h
            float r16 = h0.a.b(r14)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0095
            r13 = r3
            goto L_0x0096
        L_0x0095:
            r13 = r6
        L_0x0096:
            if (r13 == 0) goto L_0x00ab
            float r13 = h0.a.b(r11)
            float r14 = h0.a.c(r14)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x00a6
            r13 = r3
            goto L_0x00a7
        L_0x00a6:
            r13 = r6
        L_0x00a7:
            if (r13 == 0) goto L_0x00ab
            r13 = r3
            goto L_0x00ac
        L_0x00ab:
            r13 = r6
        L_0x00ac:
            if (r13 != 0) goto L_0x00b0
            goto L_0x0105
        L_0x00b0:
            float r13 = h0.c.b(r7)
            float r14 = r5.f9078a
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00bc
            r13 = r3
            goto L_0x00bd
        L_0x00bc:
            r13 = r6
        L_0x00bd:
            if (r13 == 0) goto L_0x0105
            float r13 = h0.c.c(r7)
            float r14 = r5.f9079b
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00cb
            r13 = r3
            goto L_0x00cc
        L_0x00cb:
            r13 = r6
        L_0x00cc:
            if (r13 == 0) goto L_0x0105
            float r13 = h0.c.b(r7)
            float r14 = h0.g.b(r9)
            float r14 = r14 + r13
            float r13 = r5.f9080c
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L_0x00df
            r13 = r3
            goto L_0x00e0
        L_0x00df:
            r13 = r6
        L_0x00e0:
            if (r13 == 0) goto L_0x0105
            float r7 = h0.c.c(r7)
            float r8 = h0.g.a(r9)
            float r8 = r8 + r7
            float r5 = r5.f9081d
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x00f3
            r5 = r3
            goto L_0x00f4
        L_0x00f3:
            r5 = r6
        L_0x00f4:
            if (r5 == 0) goto L_0x0105
            float r5 = h0.a.b(r11)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0100
            r2 = r3
            goto L_0x0101
        L_0x0100:
            r2 = r6
        L_0x0101:
            if (r2 == 0) goto L_0x0105
            r2 = r3
            goto L_0x0106
        L_0x0105:
            r2 = r6
        L_0x0106:
            if (r2 != 0) goto L_0x015e
        L_0x0108:
            long r7 = r0.f1524l
            float r9 = h0.c.b(r7)
            long r7 = r0.f1524l
            float r10 = h0.c.c(r7)
            long r7 = r0.f1524l
            float r2 = h0.c.b(r7)
            long r7 = r0.m
            float r5 = h0.g.b(r7)
            float r11 = r5 + r2
            long r7 = r0.f1524l
            float r2 = h0.c.c(r7)
            long r7 = r0.m
            float r5 = h0.g.a(r7)
            float r12 = r5 + r2
            float r2 = r0.f1523k
            int r5 = java.lang.Float.floatToIntBits(r2)
            long r7 = (long) r5
            int r2 = java.lang.Float.floatToIntBits(r2)
            long r13 = (long) r2
            r2 = 32
            long r7 = r7 << r2
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r15
            long r13 = r13 | r7
            int r2 = h0.a.f9063b
            h0.f r2 = androidx.lifecycle.s0.b(r9, r10, r11, r12, r13)
            if (r4 != 0) goto L_0x0154
            i0.e r4 = new i0.e
            r4.<init>(r6)
            goto L_0x0157
        L_0x0154:
            r4.reset()
        L_0x0157:
            r4.a(r2)
            r0.f1522j = r2
            r0.f1521i = r4
        L_0x015e:
            r1.m(r4, r3)
            goto L_0x018e
        L_0x0162:
            long r2 = r0.f1524l
            float r2 = h0.c.b(r2)
            long r3 = r0.f1524l
            float r3 = h0.c.c(r3)
            long r4 = r0.f1524l
            float r4 = h0.c.b(r4)
            long r5 = r0.m
            float r5 = h0.g.b(r5)
            float r4 = r4 + r5
            long r5 = r0.f1524l
            float r5 = h0.c.c(r5)
            long r6 = r0.m
            float r6 = h0.g.a(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r18
            r1.j(r2, r3, r4, r5, r6)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.y1.a(i0.f):void");
    }

    public final Outline b() {
        e();
        if (!this.f1525n || !this.f1514b) {
            return null;
        }
        return this.f1515c;
    }

    public final boolean c(long j10) {
        m mVar;
        if (!this.f1525n || (mVar = this.f1527p) == null) {
            return true;
        }
        float b10 = h0.c.b(j10);
        float c3 = h0.c.c(j10);
        if (mVar instanceof m.b) {
            d dVar = ((m.b) mVar).f9382a;
            return dVar.f9074a <= b10 && b10 < dVar.f9076c && dVar.f9075b <= c3 && c3 < dVar.f9077d;
        } else if (mVar instanceof m.c) {
            m.c cVar = (m.c) mVar;
            throw null;
        } else if (mVar instanceof m.a) {
            m.a aVar = (m.a) mVar;
            new e(0).b(new d(b10 - 0.005f, c3 - 0.005f, b10 + 0.005f, c3 + 0.005f));
            new Path();
            new RectF();
            new Matrix();
            sf.j.f((Object) null, "path1");
            throw null;
        } else {
            throw new ff.e();
        }
    }

    public final boolean d(t tVar, float f10, boolean z10, float f11, j jVar, c cVar) {
        sf.j.f(tVar, "shape");
        sf.j.f(jVar, "layoutDirection");
        sf.j.f(cVar, "density");
        this.f1515c.setAlpha(f10);
        boolean z11 = !sf.j.a(this.f1517e, tVar);
        if (z11) {
            this.f1517e = tVar;
            this.f1519g = true;
        }
        boolean z12 = z10 || f11 > 0.0f;
        if (this.f1525n != z12) {
            this.f1525n = z12;
            this.f1519g = true;
        }
        if (this.f1526o != jVar) {
            this.f1526o = jVar;
            this.f1519g = true;
        }
        if (!sf.j.a(this.f1513a, cVar)) {
            this.f1513a = cVar;
            this.f1519g = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f1519g) {
            this.f1524l = h0.c.f9068b;
            long j10 = this.f1516d;
            this.m = j10;
            this.f1523k = 0.0f;
            this.f1518f = null;
            this.f1519g = false;
            this.f1520h = false;
            boolean z10 = this.f1525n;
            Outline outline = this.f1515c;
            if (!z10 || g.b(j10) <= 0.0f || g.a(this.f1516d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f1514b = true;
            m.b a10 = this.f1517e.a(this.f1516d, this.f1526o, this.f1513a);
            this.f1527p = a10;
            if (a10 instanceof m.b) {
                d dVar = a10.f9382a;
                float f10 = dVar.f9074a;
                float f11 = dVar.f9075b;
                this.f1524l = f1.f(f10, f11);
                float f12 = dVar.f9076c;
                float f13 = dVar.f9074a;
                float f14 = dVar.f9077d;
                this.m = cb.c.f(f12 - f13, f14 - f11);
                outline.setRect(a.g(f13), a.g(f11), a.g(f12), a.g(f14));
            } else if (a10 instanceof m.c) {
                ((m.c) a10).getClass();
                throw null;
            } else if (a10 instanceof m.a) {
                ((m.a) a10).getClass();
                if (Build.VERSION.SDK_INT > 28) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                throw null;
            }
        }
    }
}
