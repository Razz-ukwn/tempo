package y5;

import ag.i0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import s5.f;
import u5.b;
import v5.c;
import w5.d;
import y5.b;
import z5.g;

public final class e extends f {

    /* renamed from: h  reason: collision with root package name */
    public final c f17274h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f17275i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<Bitmap> f17276j;

    /* renamed from: k  reason: collision with root package name */
    public Canvas f17277k;

    /* renamed from: l  reason: collision with root package name */
    public final Bitmap.Config f17278l = Bitmap.Config.ARGB_8888;
    public final Path m = new Path();

    /* renamed from: n  reason: collision with root package name */
    public final Path f17279n = new Path();

    /* renamed from: o  reason: collision with root package name */
    public float[] f17280o = new float[4];

    /* renamed from: p  reason: collision with root package name */
    public final Path f17281p = new Path();

    /* renamed from: q  reason: collision with root package name */
    public final HashMap<d, a> f17282q = new HashMap<>();

    /* renamed from: r  reason: collision with root package name */
    public final float[] f17283r = new float[2];

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final Path f17284a = new Path();

        /* renamed from: b  reason: collision with root package name */
        public Bitmap[] f17285b;

        public a() {
        }
    }

    public e(c cVar, p5.a aVar, g gVar) {
        super(aVar, gVar);
        this.f17274h = cVar;
        Paint paint = new Paint(1);
        this.f17275i = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b6, code lost:
        r10 = r27;
        r8 = r30;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.graphics.Canvas r33) {
        /*
            r32 = this;
            r6 = r32
            r7 = r33
            java.lang.Object r0 = r6.f12427a
            r8 = r0
            z5.g r8 = (z5.g) r8
            float r0 = r8.f17757c
            int r0 = (int) r0
            float r1 = r8.f17758d
            int r1 = (int) r1
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r6.f17276j
            r9 = 0
            if (r2 != 0) goto L_0x0016
            r2 = r9
            goto L_0x001c
        L_0x0016:
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L_0x001c:
            if (r2 == 0) goto L_0x002a
            int r3 = r2.getWidth()
            if (r3 != r0) goto L_0x002a
            int r3 = r2.getHeight()
            if (r3 == r1) goto L_0x0042
        L_0x002a:
            if (r0 <= 0) goto L_0x0575
            if (r1 <= 0) goto L_0x0575
            android.graphics.Bitmap$Config r2 = r6.f17278l
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r6.f17276j = r0
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.f17277k = r0
        L_0x0042:
            r10 = r2
            r11 = 0
            r10.eraseColor(r11)
            v5.c r12 = r6.f17274h
            s5.g r0 = r12.getLineData()
            java.util.ArrayList r0 = r0.f14729i
            java.util.Iterator r13 = r0.iterator()
        L_0x0053:
            boolean r0 = r13.hasNext()
            android.graphics.Paint r14 = r6.f17265c
            if (r0 == 0) goto L_0x056c
            java.lang.Object r0 = r13.next()
            r15 = r0
            w5.e r15 = (w5.e) r15
            boolean r0 = r15.isVisible()
            if (r0 == 0) goto L_0x055b
            int r0 = r15.V()
            r1 = 1
            if (r0 >= r1) goto L_0x0071
            goto L_0x055b
        L_0x0071:
            float r0 = r15.h()
            r14.setStrokeWidth(r0)
            r15.r()
            r14.setPathEffect(r9)
            int r0 = r15.w()
            int r0 = q.g.c(r0)
            android.graphics.Path r3 = r6.f17279n
            android.graphics.Path r5 = r6.m
            r2 = 2
            y5.b$a r9 = r6.f17259f
            p5.a r11 = r6.f17264b
            if (r0 == r2) goto L_0x0439
            r1 = 3
            if (r0 == r1) goto L_0x0388
            int r0 = r15.V()
            int r3 = r15.w()
            if (r3 != r2) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            if (r3 == 0) goto L_0x00a5
            r5 = 4
            goto L_0x00a6
        L_0x00a5:
            r5 = r2
        L_0x00a6:
            r5.i$a r1 = r15.U()
            r4 = r12
            q5.a r4 = (q5.a) r4
            z5.e r1 = r4.a(r1)
            r11.getClass()
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r14.setStyle(r4)
            r15.k()
            r9.a(r12, r15)
            boolean r4 = r15.A()
            if (r4 == 0) goto L_0x01ad
            if (r0 <= 0) goto L_0x01ad
            android.graphics.Path r4 = r6.f17281p
            int r11 = r9.f17260a
            int r2 = r9.f17262c
            int r2 = r2 + r11
            r24 = r13
            r13 = 0
        L_0x00d1:
            r25 = r10
            int r10 = r13 * 128
            int r10 = r10 + r11
            r20 = r11
            int r11 = r10 + 128
            if (r11 <= r2) goto L_0x00dd
            r11 = r2
        L_0x00dd:
            if (r10 > r11) goto L_0x018e
            ag.i0 r21 = r15.f()
            r21.getClass()
            r21 = r2
            float r2 = ag.i0.c(r15, r12)
            r26 = r12
            int r12 = r15.w()
            r22 = r0
            r0 = 2
            if (r12 != r0) goto L_0x00f9
            r0 = 1
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r4.reset()
            s5.f r12 = r15.y(r10)
            r27 = r14
            float r14 = r12.c()
            r4.moveTo(r14, r2)
            float r14 = r12.c()
            float r28 = r12.a()
            r29 = r12
            r23 = 1065353216(0x3f800000, float:1.0)
            float r12 = r28 * r23
            r4.lineTo(r14, r12)
            int r12 = r10 + 1
            r14 = 0
        L_0x011e:
            if (r12 > r11) goto L_0x0154
            s5.f r14 = r15.y(r12)
            if (r0 == 0) goto L_0x0138
            r28 = r0
            float r0 = r14.c()
            float r29 = r29.a()
            r30 = r8
            float r8 = r29 * r23
            r4.lineTo(r0, r8)
            goto L_0x013c
        L_0x0138:
            r28 = r0
            r30 = r8
        L_0x013c:
            float r0 = r14.c()
            float r8 = r14.a()
            float r8 = r8 * r23
            r4.lineTo(r0, r8)
            int r12 = r12 + 1
            r29 = r14
            r0 = r28
            r8 = r30
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x011e
        L_0x0154:
            r30 = r8
            if (r14 == 0) goto L_0x015f
            float r0 = r14.c()
            r4.lineTo(r0, r2)
        L_0x015f:
            r4.close()
            r1.d(r4)
            android.graphics.drawable.Drawable r0 = r15.s()
            if (r0 == 0) goto L_0x016f
            r6.o(r7, r4, r0)
            goto L_0x0198
        L_0x016f:
            int r0 = r15.c()
            int r2 = r15.d()
            int r2 = r2 << 24
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r8
            r0 = r0 | r2
            android.util.DisplayMetrics r2 = z5.f.f17746a
            int r2 = r33.save()
            r7.clipPath(r4)
            r7.drawColor(r0)
            r7.restoreToCount(r2)
            goto L_0x0198
        L_0x018e:
            r22 = r0
            r21 = r2
            r30 = r8
            r26 = r12
            r27 = r14
        L_0x0198:
            int r13 = r13 + 1
            if (r10 <= r11) goto L_0x019d
            goto L_0x01b9
        L_0x019d:
            r11 = r20
            r2 = r21
            r0 = r22
            r10 = r25
            r12 = r26
            r14 = r27
            r8 = r30
            goto L_0x00d1
        L_0x01ad:
            r22 = r0
            r30 = r8
            r25 = r10
            r26 = r12
            r24 = r13
            r27 = r14
        L_0x01b9:
            java.util.List r0 = r15.I()
            int r0 = r0.size()
            r2 = 1
            if (r0 <= r2) goto L_0x02bc
            float[] r0 = r6.f17280o
            int r0 = r0.length
            int r2 = r5 * 2
            if (r0 > r2) goto L_0x01d1
            int r5 = r5 * 4
            float[] r0 = new float[r5]
            r6.f17280o = r0
        L_0x01d1:
            int r0 = r9.f17260a
        L_0x01d3:
            int r4 = r9.f17262c
            int r5 = r9.f17260a
            int r4 = r4 + r5
            if (r0 > r4) goto L_0x02b6
            s5.f r4 = r15.y(r0)
            if (r4 != 0) goto L_0x01e7
            r10 = r27
            r8 = r30
        L_0x01e4:
            r5 = 3
            goto L_0x02ae
        L_0x01e7:
            float[] r5 = r6.f17280o
            float r8 = r4.c()
            r10 = 0
            r5[r10] = r8
            float[] r5 = r6.f17280o
            float r4 = r4.a()
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r8
            r8 = 1
            r5[r8] = r4
            int r4 = r9.f17261b
            if (r0 >= r4) goto L_0x0252
            int r4 = r0 + 1
            s5.f r4 = r15.y(r4)
            if (r4 != 0) goto L_0x020a
            goto L_0x02b6
        L_0x020a:
            if (r3 == 0) goto L_0x023b
            float[] r5 = r6.f17280o
            float r8 = r4.c()
            r10 = 2
            r5[r10] = r8
            float[] r5 = r6.f17280o
            r8 = 1
            r11 = r5[r8]
            r8 = 3
            r5[r8] = r11
            r8 = r5[r10]
            r10 = 4
            r5[r10] = r8
            r8 = 5
            r5[r8] = r11
            r8 = 6
            float r10 = r4.c()
            r5[r8] = r10
            float[] r5 = r6.f17280o
            float r4 = r4.a()
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r8
            r10 = 7
            r5[r10] = r4
            r8 = 3
            r11 = 2
            goto L_0x0250
        L_0x023b:
            r8 = 1065353216(0x3f800000, float:1.0)
            float[] r5 = r6.f17280o
            float r10 = r4.c()
            r11 = 2
            r5[r11] = r10
            float[] r5 = r6.f17280o
            float r4 = r4.a()
            float r4 = r4 * r8
            r8 = 3
            r5[r8] = r4
        L_0x0250:
            r5 = 0
            goto L_0x0260
        L_0x0252:
            r8 = 3
            r11 = 2
            float[] r4 = r6.f17280o
            r5 = 0
            r10 = r4[r5]
            r4[r11] = r10
            r10 = 1
            r11 = r4[r10]
            r4[r8] = r11
        L_0x0260:
            float[] r4 = r6.f17280o
            r1.f(r4)
            float[] r4 = r6.f17280o
            r4 = r4[r5]
            r8 = r30
            boolean r4 = r8.f(r4)
            if (r4 != 0) goto L_0x0275
            r10 = r27
            goto L_0x037e
        L_0x0275:
            float[] r4 = r6.f17280o
            r5 = 2
            r4 = r4[r5]
            boolean r4 = r8.e(r4)
            if (r4 == 0) goto L_0x02aa
            float[] r4 = r6.f17280o
            r5 = 1
            r4 = r4[r5]
            boolean r4 = r8.g(r4)
            if (r4 != 0) goto L_0x0299
            float[] r4 = r6.f17280o
            r5 = 3
            r4 = r4[r5]
            boolean r4 = r8.d(r4)
            if (r4 != 0) goto L_0x029a
            r10 = r27
            goto L_0x02ae
        L_0x0299:
            r5 = 3
        L_0x029a:
            int r4 = r15.D(r0)
            r10 = r27
            r10.setColor(r4)
            float[] r4 = r6.f17280o
            r11 = 0
            r7.drawLines(r4, r11, r2, r10)
            goto L_0x02ae
        L_0x02aa:
            r10 = r27
            goto L_0x01e4
        L_0x02ae:
            int r0 = r0 + 1
            r30 = r8
            r27 = r10
            goto L_0x01d3
        L_0x02b6:
            r10 = r27
            r8 = r30
            goto L_0x037e
        L_0x02bc:
            r10 = r27
            r8 = r30
            float[] r0 = r6.f17280o
            int r0 = r0.length
            int r2 = r22 * r5
            int r4 = java.lang.Math.max(r2, r5)
            r11 = 2
            int r4 = r4 * r11
            if (r0 >= r4) goto L_0x02d7
            int r0 = java.lang.Math.max(r2, r5)
            r2 = 4
            int r0 = r0 * r2
            float[] r0 = new float[r0]
            r6.f17280o = r0
        L_0x02d7:
            int r0 = r9.f17260a
            s5.f r0 = r15.y(r0)
            if (r0 == 0) goto L_0x037e
            int r0 = r9.f17260a
            r2 = 0
        L_0x02e2:
            int r4 = r9.f17262c
            int r11 = r9.f17260a
            int r4 = r4 + r11
            if (r0 > r4) goto L_0x035f
            if (r0 != 0) goto L_0x02ed
            r4 = 0
            goto L_0x02ef
        L_0x02ed:
            int r4 = r0 + -1
        L_0x02ef:
            s5.f r4 = r15.y(r4)
            s5.f r11 = r15.y(r0)
            if (r4 == 0) goto L_0x035c
            if (r11 != 0) goto L_0x02fc
            goto L_0x035c
        L_0x02fc:
            float[] r12 = r6.f17280o
            int r13 = r2 + 1
            float r14 = r4.c()
            r12[r2] = r14
            float[] r2 = r6.f17280o
            int r12 = r13 + 1
            float r14 = r4.a()
            r17 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 * r17
            r2[r13] = r14
            if (r3 == 0) goto L_0x0344
            float[] r2 = r6.f17280o
            int r13 = r12 + 1
            float r14 = r11.c()
            r2[r12] = r14
            float[] r2 = r6.f17280o
            int r12 = r13 + 1
            float r14 = r4.a()
            r17 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 * r17
            r2[r13] = r14
            float[] r2 = r6.f17280o
            int r13 = r12 + 1
            float r14 = r11.c()
            r2[r12] = r14
            float[] r2 = r6.f17280o
            int r12 = r13 + 1
            float r4 = r4.a()
            float r4 = r4 * r17
            r2[r13] = r4
        L_0x0344:
            float[] r2 = r6.f17280o
            int r4 = r12 + 1
            float r13 = r11.c()
            r2[r12] = r13
            float[] r2 = r6.f17280o
            int r12 = r4 + 1
            float r11 = r11.a()
            r13 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 * r13
            r2[r4] = r11
            r2 = r12
        L_0x035c:
            int r0 = r0 + 1
            goto L_0x02e2
        L_0x035f:
            if (r2 <= 0) goto L_0x037e
            float[] r0 = r6.f17280o
            r1.f(r0)
            int r0 = r9.f17262c
            r1 = 1
            int r0 = r0 + r1
            int r0 = r0 * r5
            int r0 = java.lang.Math.max(r0, r5)
            r1 = 2
            int r0 = r0 * r1
            int r1 = r15.X()
            r10.setColor(r1)
            float[] r1 = r6.f17280o
            r2 = 0
            r7.drawLines(r1, r2, r0, r10)
        L_0x037e:
            r0 = 0
            r10.setPathEffect(r0)
            r30 = r8
            r12 = r26
            goto L_0x0557
        L_0x0388:
            r25 = r10
            r26 = r12
            r24 = r13
            r10 = r14
            r11.getClass()
            r5.i$a r0 = r15.U()
            r12 = r26
            q5.a r12 = (q5.a) r12
            z5.e r11 = r12.a(r0)
            r12 = r26
            r9.a(r12, r15)
            r5.reset()
            int r0 = r9.f17262c
            r1 = 1
            if (r0 < r1) goto L_0x0402
            int r0 = r9.f17260a
            s5.f r0 = r15.y(r0)
            float r2 = r0.c()
            float r4 = r0.a()
            r13 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r13
            r5.moveTo(r2, r4)
            int r2 = r9.f17260a
            int r2 = r2 + r1
        L_0x03c2:
            int r1 = r9.f17262c
            int r4 = r9.f17260a
            int r1 = r1 + r4
            if (r2 > r1) goto L_0x0402
            s5.f r1 = r15.y(r2)
            float r4 = r0.c()
            float r13 = r1.c()
            float r14 = r0.c()
            float r13 = r13 - r14
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            float r19 = r13 + r4
            float r0 = r0.a()
            r4 = 1065353216(0x3f800000, float:1.0)
            float r18 = r0 * r4
            float r0 = r1.a()
            float r20 = r0 * r4
            float r21 = r1.c()
            float r0 = r1.a()
            float r22 = r0 * r4
            r16 = r5
            r17 = r19
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            int r2 = r2 + 1
            r0 = r1
            goto L_0x03c2
        L_0x0402:
            boolean r0 = r15.A()
            if (r0 == 0) goto L_0x041c
            r3.reset()
            r3.addPath(r5)
            android.graphics.Canvas r1 = r6.f17277k
            y5.b$a r9 = r6.f17259f
            r0 = r32
            r2 = r15
            r4 = r11
            r13 = r5
            r5 = r9
            r0.p(r1, r2, r3, r4, r5)
            goto L_0x041d
        L_0x041c:
            r13 = r5
        L_0x041d:
            int r0 = r15.X()
            r10.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r10.setStyle(r0)
            r11.d(r13)
            android.graphics.Canvas r0 = r6.f17277k
            r0.drawPath(r13, r10)
            r0 = 0
            r10.setPathEffect(r0)
            r30 = r8
            goto L_0x0557
        L_0x0439:
            r25 = r10
            r24 = r13
            r10 = r14
            r13 = r5
            r11.getClass()
            r5.i$a r0 = r15.U()
            r1 = r12
            q5.a r1 = (q5.a) r1
            z5.e r11 = r1.a(r0)
            r9.a(r12, r15)
            float r0 = r15.q()
            r13.reset()
            int r1 = r9.f17262c
            r2 = 1
            if (r1 < r2) goto L_0x0526
            int r1 = r9.f17260a
            int r1 = r1 + r2
            int r4 = r1 + -2
            r14 = 0
            int r4 = java.lang.Math.max(r4, r14)
            s5.f r4 = r15.y(r4)
            int r1 = r1 - r2
            int r1 = java.lang.Math.max(r1, r14)
            s5.f r1 = r15.y(r1)
            if (r1 != 0) goto L_0x047a
            r30 = r8
            r0 = 0
            goto L_0x0557
        L_0x047a:
            float r5 = r1.c()
            float r16 = r1.a()
            r17 = 1065353216(0x3f800000, float:1.0)
            float r14 = r16 * r17
            r13.moveTo(r5, r14)
            int r5 = r9.f17260a
            int r5 = r5 + r2
            r2 = -1
            r16 = r1
            r14 = r5
            r5 = r16
        L_0x0492:
            int r1 = r9.f17262c
            r30 = r8
            int r8 = r9.f17260a
            int r1 = r1 + r8
            if (r14 > r1) goto L_0x0528
            if (r2 != r14) goto L_0x04a0
            r1 = r16
            goto L_0x04a4
        L_0x04a0:
            s5.f r1 = r15.y(r14)
        L_0x04a4:
            int r2 = r14 + 1
            int r8 = r15.V()
            if (r2 >= r8) goto L_0x04ad
            r14 = r2
        L_0x04ad:
            s5.f r8 = r15.y(r14)
            float r16 = r1.c()
            float r17 = r4.c()
            float r16 = r16 - r17
            float r16 = r16 * r0
            float r17 = r1.a()
            float r4 = r4.a()
            float r17 = r17 - r4
            float r17 = r17 * r0
            float r4 = r8.c()
            float r18 = r5.c()
            float r4 = r4 - r18
            float r4 = r4 * r0
            float r18 = r8.a()
            float r19 = r5.a()
            float r18 = r18 - r19
            float r18 = r18 * r0
            float r19 = r5.c()
            float r19 = r19 + r16
            float r16 = r5.a()
            float r16 = r16 + r17
            r23 = 1065353216(0x3f800000, float:1.0)
            float r20 = r16 * r23
            float r16 = r1.c()
            float r4 = r16 - r4
            float r16 = r1.a()
            float r16 = r16 - r18
            float r21 = r16 * r23
            float r22 = r1.c()
            float r16 = r1.a()
            float r26 = r16 * r23
            r16 = r13
            r17 = r19
            r18 = r20
            r19 = r4
            r20 = r21
            r21 = r22
            r22 = r26
            r16.cubicTo(r17, r18, r19, r20, r21, r22)
            r4 = r5
            r16 = r8
            r8 = r30
            r5 = r1
            r31 = r14
            r14 = r2
            r2 = r31
            goto L_0x0492
        L_0x0526:
            r30 = r8
        L_0x0528:
            boolean r0 = r15.A()
            if (r0 == 0) goto L_0x053f
            r3.reset()
            r3.addPath(r13)
            android.graphics.Canvas r1 = r6.f17277k
            y5.b$a r5 = r6.f17259f
            r0 = r32
            r2 = r15
            r4 = r11
            r0.p(r1, r2, r3, r4, r5)
        L_0x053f:
            int r0 = r15.X()
            r10.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r10.setStyle(r0)
            r11.d(r13)
            android.graphics.Canvas r0 = r6.f17277k
            r0.drawPath(r13, r10)
            r0 = 0
            r10.setPathEffect(r0)
        L_0x0557:
            r10.setPathEffect(r0)
            goto L_0x0562
        L_0x055b:
            r30 = r8
            r0 = r9
            r25 = r10
            r24 = r13
        L_0x0562:
            r9 = r0
            r13 = r24
            r10 = r25
            r8 = r30
            r11 = 0
            goto L_0x0053
        L_0x056c:
            r25 = r10
            r10 = r14
            r0 = 0
            r2 = r25
            r7.drawBitmap(r2, r0, r0, r10)
        L_0x0575:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.e.g(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017e, code lost:
        r13 = r22;
        r5 = 1;
        r6 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017e A[EDGE_INSN: B:72:0x017e->B:60:0x017e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r0 = r21
            android.graphics.Paint r1 = r0.f17265c
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            p5.a r1 = r0.f17264b
            r1.getClass()
            float[] r1 = r0.f17283r
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            v5.c r5 = r0.f17274h
            s5.g r6 = r5.getLineData()
            java.util.ArrayList r6 = r6.f14729i
            r7 = r2
        L_0x0020:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x0198
            java.lang.Object r8 = r6.get(r7)
            w5.e r8 = (w5.e) r8
            boolean r9 = r8.isVisible()
            if (r9 == 0) goto L_0x0183
            boolean r9 = r8.Y()
            if (r9 == 0) goto L_0x0183
            int r9 = r8.V()
            if (r9 != 0) goto L_0x0040
            goto L_0x0183
        L_0x0040:
            android.graphics.Paint r9 = r0.f17275i
            int r10 = r8.m()
            r9.setColor(r10)
            r5.i$a r9 = r8.U()
            r10 = r5
            q5.a r10 = (q5.a) r10
            z5.e r9 = r10.a(r9)
            y5.b$a r10 = r0.f17259f
            r10.a(r5, r8)
            float r11 = r8.z()
            float r12 = r8.b0()
            boolean r13 = r8.e0()
            if (r13 == 0) goto L_0x0071
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0071
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0071
            r12 = r4
            goto L_0x0072
        L_0x0071:
            r12 = r2
        L_0x0072:
            if (r12 == 0) goto L_0x007f
            int r13 = r8.m()
            r14 = 1122867(0x112233, float:1.573472E-39)
            if (r13 != r14) goto L_0x007f
            r13 = r4
            goto L_0x0080
        L_0x007f:
            r13 = r2
        L_0x0080:
            java.util.HashMap<w5.d, y5.e$a> r14 = r0.f17282q
            boolean r15 = r14.containsKey(r8)
            if (r15 == 0) goto L_0x008f
            java.lang.Object r14 = r14.get(r8)
            y5.e$a r14 = (y5.e.a) r14
            goto L_0x0098
        L_0x008f:
            y5.e$a r15 = new y5.e$a
            r15.<init>()
            r14.put(r8, r15)
            r14 = r15
        L_0x0098:
            r14.getClass()
            int r15 = r8.a()
            android.graphics.Bitmap[] r3 = r14.f17285b
            if (r3 != 0) goto L_0x00a8
            android.graphics.Bitmap[] r3 = new android.graphics.Bitmap[r15]
            r14.f17285b = r3
            goto L_0x00af
        L_0x00a8:
            int r3 = r3.length
            if (r3 == r15) goto L_0x00b1
            android.graphics.Bitmap[] r3 = new android.graphics.Bitmap[r15]
            r14.f17285b = r3
        L_0x00af:
            r3 = r4
            goto L_0x00b2
        L_0x00b1:
            r3 = r2
        L_0x00b2:
            if (r3 == 0) goto L_0x0119
            int r3 = r8.a()
            float r15 = r8.z()
            float r4 = r8.b0()
        L_0x00c0:
            if (r2 >= r3) goto L_0x0119
            r16 = r3
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_4444
            r17 = r5
            r18 = r6
            double r5 = (double) r15
            r19 = 4611911198408756429(0x4000cccccccccccd, double:2.1)
            double r5 = r5 * r19
            int r5 = (int) r5
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r5, r3)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            android.graphics.Bitmap[] r6 = r14.f17285b
            r6[r2] = r3
            y5.e r3 = y5.e.this
            android.graphics.Paint r6 = r3.f17265c
            r19 = r7
            int r7 = r8.T(r2)
            r6.setColor(r7)
            android.graphics.Paint r6 = r3.f17265c
            if (r13 == 0) goto L_0x0104
            android.graphics.Path r3 = r14.f17284a
            r3.reset()
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r3.addCircle(r15, r15, r15, r7)
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r3.addCircle(r15, r15, r4, r7)
            r5.drawPath(r3, r6)
            goto L_0x010e
        L_0x0104:
            r5.drawCircle(r15, r15, r15, r6)
            if (r12 == 0) goto L_0x010e
            android.graphics.Paint r3 = r3.f17275i
            r5.drawCircle(r15, r15, r4, r3)
        L_0x010e:
            int r2 = r2 + 1
            r3 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x00c0
        L_0x0119:
            r17 = r5
            r18 = r6
            r19 = r7
            int r2 = r10.f17262c
            int r3 = r10.f17260a
            int r2 = r2 + r3
        L_0x0124:
            if (r3 > r2) goto L_0x017e
            s5.f r4 = r8.y(r3)
            if (r4 != 0) goto L_0x012d
            goto L_0x017e
        L_0x012d:
            float r5 = r4.c()
            r6 = 0
            r1[r6] = r5
            float r4 = r4.a()
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            r5 = 1
            r1[r5] = r4
            r9.f(r1)
            java.lang.Object r4 = r0.f12427a
            z5.g r4 = (z5.g) r4
            r7 = r1[r6]
            boolean r7 = r4.f(r7)
            if (r7 != 0) goto L_0x0150
            r13 = r22
            goto L_0x018d
        L_0x0150:
            r7 = r1[r6]
            boolean r6 = r4.e(r7)
            if (r6 == 0) goto L_0x0178
            r6 = r1[r5]
            boolean r4 = r4.h(r6)
            if (r4 != 0) goto L_0x0161
            goto L_0x0178
        L_0x0161:
            android.graphics.Bitmap[] r4 = r14.f17285b
            int r6 = r4.length
            int r6 = r3 % r6
            r4 = r4[r6]
            if (r4 == 0) goto L_0x0178
            r6 = 0
            r7 = r1[r6]
            float r7 = r7 - r11
            r10 = r1[r5]
            float r10 = r10 - r11
            r12 = 0
            r13 = r22
            r13.drawBitmap(r4, r7, r10, r12)
            goto L_0x017b
        L_0x0178:
            r13 = r22
            r6 = 0
        L_0x017b:
            int r3 = r3 + 1
            goto L_0x0124
        L_0x017e:
            r13 = r22
            r5 = 1
            r6 = 0
            goto L_0x018d
        L_0x0183:
            r13 = r22
            r17 = r5
            r18 = r6
            r19 = r7
            r6 = r2
            r5 = r4
        L_0x018d:
            int r7 = r19 + 1
            r4 = r5
            r2 = r6
            r5 = r17
            r6 = r18
            r3 = 0
            goto L_0x0020
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.e.h(android.graphics.Canvas):void");
    }

    public final void i(Canvas canvas, b[] bVarArr) {
        c cVar = this.f17274h;
        s5.g lineData = cVar.getLineData();
        for (b bVar : bVarArr) {
            w5.e eVar = (w5.e) lineData.b(bVar.f15732f);
            if (eVar != null && eVar.Z()) {
                f j10 = eVar.j(bVar.f15727a, bVar.f15728b);
                if (m(j10, eVar)) {
                    z5.e a10 = ((q5.a) cVar).a(eVar.U());
                    float c3 = j10.c();
                    float a11 = j10.a();
                    this.f17264b.getClass();
                    z5.b a12 = a10.a(c3, a11 * 1.0f);
                    float f10 = (float) a12.f17726b;
                    float f11 = (float) a12.f17727c;
                    this.f17266d.setColor(eVar.S());
                    this.f17266d.setStrokeWidth(eVar.o());
                    Paint paint = this.f17266d;
                    eVar.H();
                    paint.setPathEffect((PathEffect) null);
                    boolean a02 = eVar.a0();
                    Path path = this.f17287g;
                    Object obj = this.f12427a;
                    if (a02) {
                        path.reset();
                        g gVar = (g) obj;
                        path.moveTo(f10, gVar.f17756b.top);
                        path.lineTo(f10, gVar.f17756b.bottom);
                        canvas.drawPath(path, this.f17266d);
                    }
                    if (eVar.c0()) {
                        path.reset();
                        g gVar2 = (g) obj;
                        path.moveTo(gVar2.f17756b.left, f11);
                        path.lineTo(gVar2.f17756b.right, f11);
                        canvas.drawPath(path, this.f17266d);
                    }
                }
            }
        }
    }

    public final void j(Canvas canvas) {
        c cVar;
        c cVar2;
        c cVar3 = this.f17274h;
        if (l(cVar3)) {
            ArrayList arrayList = cVar3.getLineData().f14729i;
            int i8 = 0;
            while (i8 < arrayList.size()) {
                w5.e eVar = (w5.e) arrayList.get(i8);
                if (!b.n(eVar) || eVar.V() < 1) {
                    cVar = cVar3;
                    Canvas canvas2 = canvas;
                } else {
                    f(eVar);
                    z5.e a10 = ((q5.a) cVar3).a(eVar.U());
                    int z10 = (int) (eVar.z() * 1.75f);
                    if (!eVar.Y()) {
                        z10 /= 2;
                    }
                    b.a aVar = this.f17259f;
                    aVar.a(cVar3, eVar);
                    this.f17264b.getClass();
                    int i10 = aVar.f17260a;
                    int i11 = (((int) (((float) (aVar.f17261b - i10)) * 1.0f)) + 1) * 2;
                    if (a10.f17742d.length != i11) {
                        a10.f17742d = new float[i11];
                    }
                    float[] fArr = a10.f17742d;
                    for (int i12 = 0; i12 < i11; i12 += 2) {
                        f y10 = eVar.y((i12 / 2) + i10);
                        if (y10 != null) {
                            fArr[i12] = y10.c();
                            fArr[i12 + 1] = y10.a() * 1.0f;
                        } else {
                            fArr[i12] = 0.0f;
                            fArr[i12 + 1] = 0.0f;
                        }
                    }
                    Matrix matrix = a10.f17745g;
                    matrix.set(a10.f17739a);
                    matrix.postConcat(a10.f17741c.f17755a);
                    matrix.postConcat(a10.f17740b);
                    matrix.mapPoints(fArr);
                    t5.c u7 = eVar.u();
                    z5.c c3 = z5.c.c(eVar.W());
                    c3.f17729b = z5.f.c(c3.f17729b);
                    c3.f17730c = z5.f.c(c3.f17730c);
                    int i13 = 0;
                    while (i13 < fArr.length) {
                        float f10 = fArr[i13];
                        float f11 = fArr[i13 + 1];
                        g gVar = (g) this.f12427a;
                        if (!gVar.f(f10)) {
                            break;
                        }
                        if (!gVar.e(f10) || !gVar.h(f11)) {
                            cVar2 = cVar3;
                            Canvas canvas3 = canvas;
                        } else {
                            int i14 = i13 / 2;
                            f y11 = eVar.y(aVar.f17260a + i14);
                            if (eVar.P()) {
                                u7.getClass();
                                cVar2 = cVar3;
                                int G = eVar.G(i14);
                                Paint paint = this.f17267e;
                                paint.setColor(G);
                                canvas.drawText(u7.a(y11.a()), f10, f11 - ((float) z10), paint);
                            } else {
                                cVar2 = cVar3;
                                Canvas canvas4 = canvas;
                            }
                            y11.getClass();
                        }
                        i13 += 2;
                        cVar3 = cVar2;
                    }
                    cVar = cVar3;
                    Canvas canvas5 = canvas;
                    z5.c.d(c3);
                }
                i8++;
                cVar3 = cVar;
            }
        }
    }

    public final void k() {
    }

    public final void p(Canvas canvas, w5.e eVar, Path path, z5.e eVar2, b.a aVar) {
        eVar.f().getClass();
        float c3 = i0.c(eVar, this.f17274h);
        path.lineTo(eVar.y(aVar.f17260a + aVar.f17262c).c(), c3);
        path.lineTo(eVar.y(aVar.f17260a).c(), c3);
        path.close();
        eVar2.d(path);
        Drawable s10 = eVar.s();
        if (s10 != null) {
            o(canvas, path, s10);
            return;
        }
        int d10 = (eVar.d() << 24) | (eVar.c() & 16777215);
        DisplayMetrics displayMetrics = z5.f.f17746a;
        int save = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(d10);
        canvas.restoreToCount(save);
    }
}
