package x5;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import s5.f;
import w5.b;
import z5.c;
import z5.g;

public final class a extends b<q5.a<? extends s5.a<? extends b<? extends f>>>> {
    public final Matrix B = new Matrix();
    public final c C = c.b(0.0f, 0.0f);
    public final c D = c.b(0.0f, 0.0f);
    public float E = 1.0f;
    public float F = 1.0f;
    public float G = 1.0f;
    public b H;
    public VelocityTracker I;
    public long J = 0;
    public final c K = c.b(0.0f, 0.0f);
    public final c L = c.b(0.0f, 0.0f);
    public final float M;
    public final float N;

    /* renamed from: e  reason: collision with root package name */
    public Matrix f16963e = new Matrix();

    public a(q5.a aVar, Matrix matrix) {
        super(aVar);
        this.f16963e = matrix;
        this.M = z5.f.c(3.0f);
        this.N = z5.f.c(3.5f);
    }

    public static float d(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((y10 * y10) + (x10 * x10)));
    }

    public final c a(float f10, float f11) {
        q5.a aVar = (q5.a) this.f16967d;
        g viewPortHandler = aVar.getViewPortHandler();
        b();
        return c.b(f10 - viewPortHandler.f17756b.left, -((((float) aVar.getMeasuredHeight()) - f11) - viewPortHandler.j()));
    }

    public final void b() {
        b bVar = this.H;
        T t2 = this.f16967d;
        if (bVar == null) {
            q5.a aVar = (q5.a) t2;
            aVar.f12867r0.getClass();
            aVar.f12868s0.getClass();
        }
        b bVar2 = this.H;
        if (bVar2 != null) {
            ((q5.a) t2).j(bVar2.U());
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.B.set(this.f16963e);
        float x10 = motionEvent.getX();
        c cVar = this.C;
        cVar.f17729b = x10;
        cVar.f17730c = motionEvent.getY();
        q5.a aVar = (q5.a) this.f16967d;
        u5.b c3 = aVar.c(motionEvent.getX(), motionEvent.getY());
        this.H = c3 != null ? (b) ((s5.a) aVar.f12878b).b(c3.f15732f) : null;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        q5.a aVar = (q5.a) this.f16967d;
        aVar.getOnChartGestureListener();
        if (aVar.f12854e0 && ((s5.a) aVar.getData()).d() > 0) {
            c a10 = a(motionEvent.getX(), motionEvent.getY());
            float f10 = 1.4f;
            float f11 = aVar.f12858i0 ? 1.4f : 1.0f;
            if (!aVar.f12859j0) {
                f10 = 1.0f;
            }
            float f12 = a10.f17729b;
            float f13 = a10.f17730c;
            g gVar = aVar.N;
            Matrix matrix = aVar.B0;
            gVar.getClass();
            matrix.reset();
            matrix.set(gVar.f17755a);
            matrix.postScale(f11, f10, f12, -f13);
            aVar.N.k(matrix, aVar, false);
            aVar.b();
            aVar.postInvalidate();
            if (aVar.f12876a) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + a10.f17729b + ", y: " + a10.f17730c);
            }
            c.d(a10);
        }
        return super.onDoubleTap(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ((q5.a) this.f16967d).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        ((q5.a) this.f16967d).getOnChartGestureListener();
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        T t2 = this.f16967d;
        q5.a aVar = (q5.a) t2;
        aVar.getOnChartGestureListener();
        if (!aVar.f12879c) {
            return false;
        }
        u5.b c3 = aVar.c(motionEvent.getX(), motionEvent.getY());
        if (c3 == null || c3.a(this.f16965b)) {
            t2.d((u5.b) null);
            this.f16965b = null;
        } else {
            t2.d(c3);
            this.f16965b = c3;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c2, code lost:
        if ((r3.f17766l <= 0.0f && r3.m <= 0.0f) == false) goto L_0x01c4;
     */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.VelocityTracker r2 = r0.I
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.I = r2
        L_0x000e:
            android.view.VelocityTracker r2 = r0.I
            r2.addMovement(r1)
            int r2 = r18.getActionMasked()
            r3 = 0
            r4 = 3
            if (r2 != r4) goto L_0x0024
            android.view.VelocityTracker r2 = r0.I
            if (r2 == 0) goto L_0x0024
            r2.recycle()
            r0.I = r3
        L_0x0024:
            int r2 = r0.f16964a
            if (r2 != 0) goto L_0x002d
            android.view.GestureDetector r2 = r0.f16966c
            r2.onTouchEvent(r1)
        L_0x002d:
            T r2 = r0.f16967d
            r5 = r2
            q5.a r5 = (q5.a) r5
            boolean r6 = r5.f12856g0
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x003f
            boolean r6 = r5.f12857h0
            if (r6 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r6 = r7
            goto L_0x0040
        L_0x003f:
            r6 = r8
        L_0x0040:
            if (r6 != 0) goto L_0x004b
            boolean r6 = r5.f12858i0
            if (r6 != 0) goto L_0x004b
            boolean r6 = r5.f12859j0
            if (r6 != 0) goto L_0x004b
            return r8
        L_0x004b:
            int r6 = r18.getAction()
            r6 = r6 & 255(0xff, float:3.57E-43)
            r9 = 0
            z5.c r10 = r0.L
            if (r6 == 0) goto L_0x03a4
            r11 = 1000(0x3e8, float:1.401E-42)
            r12 = 5
            r13 = 4
            r14 = 2
            if (r6 == r8) goto L_0x032a
            z5.c r3 = r0.D
            if (r6 == r14) goto L_0x0126
            if (r6 == r4) goto L_0x011f
            if (r6 == r12) goto L_0x00a9
            r3 = 6
            if (r6 == r3) goto L_0x006a
            goto L_0x03ae
        L_0x006a:
            android.view.VelocityTracker r3 = r0.I
            int r4 = z5.f.f17748c
            float r4 = (float) r4
            r3.computeCurrentVelocity(r11, r4)
            int r4 = r18.getActionIndex()
            int r6 = r1.getPointerId(r4)
            float r10 = r3.getXVelocity(r6)
            float r6 = r3.getYVelocity(r6)
            int r11 = r18.getPointerCount()
        L_0x0086:
            if (r7 >= r11) goto L_0x00a5
            if (r7 != r4) goto L_0x008b
            goto L_0x00a2
        L_0x008b:
            int r13 = r1.getPointerId(r7)
            float r14 = r3.getXVelocity(r13)
            float r14 = r14 * r10
            float r13 = r3.getYVelocity(r13)
            float r13 = r13 * r6
            float r13 = r13 + r14
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a2
            r3.clear()
            goto L_0x00a5
        L_0x00a2:
            int r7 = r7 + 1
            goto L_0x0086
        L_0x00a5:
            r0.f16964a = r12
            goto L_0x03ae
        L_0x00a9:
            int r6 = r18.getPointerCount()
            if (r6 < r14) goto L_0x03ae
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L_0x00b8
            r6.requestDisallowInterceptTouchEvent(r8)
        L_0x00b8:
            r0.c(r1)
            float r6 = r1.getX(r7)
            float r9 = r1.getX(r8)
            float r6 = r6 - r9
            float r6 = java.lang.Math.abs(r6)
            r0.E = r6
            float r6 = r1.getY(r7)
            float r9 = r1.getY(r8)
            float r6 = r6 - r9
            float r6 = java.lang.Math.abs(r6)
            r0.F = r6
            float r6 = d(r18)
            r0.G = r6
            r9 = 1092616192(0x41200000, float:10.0)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0103
            boolean r6 = r5.f12853d0
            if (r6 == 0) goto L_0x00ec
            r0.f16964a = r13
            goto L_0x0103
        L_0x00ec:
            boolean r6 = r5.f12858i0
            boolean r9 = r5.f12859j0
            if (r6 == r9) goto L_0x00f8
            if (r6 == 0) goto L_0x00f5
            r4 = r14
        L_0x00f5:
            r0.f16964a = r4
            goto L_0x0103
        L_0x00f8:
            float r6 = r0.E
            float r9 = r0.F
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0101
            r4 = r14
        L_0x0101:
            r0.f16964a = r4
        L_0x0103:
            float r4 = r1.getX(r7)
            float r6 = r1.getX(r8)
            float r6 = r6 + r4
            float r4 = r1.getY(r7)
            float r1 = r1.getY(r8)
            float r1 = r1 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r4
            r3.f17729b = r6
            float r1 = r1 / r4
            r3.f17730c = r1
            goto L_0x03ae
        L_0x011f:
            r0.f16964a = r7
            r2.getOnChartGestureListener()
            goto L_0x03ae
        L_0x0126:
            int r6 = r0.f16964a
            android.graphics.Matrix r10 = r0.B
            z5.c r11 = r0.C
            if (r6 != r8) goto L_0x0165
            android.view.ViewParent r3 = r5.getParent()
            if (r3 == 0) goto L_0x0137
            r3.requestDisallowInterceptTouchEvent(r8)
        L_0x0137:
            boolean r3 = r5.f12856g0
            if (r3 == 0) goto L_0x0143
            float r3 = r18.getX()
            float r4 = r11.f17729b
            float r3 = r3 - r4
            goto L_0x0144
        L_0x0143:
            r3 = r9
        L_0x0144:
            boolean r4 = r5.f12857h0
            if (r4 == 0) goto L_0x0150
            float r1 = r18.getY()
            float r4 = r11.f17730c
            float r9 = r1 - r4
        L_0x0150:
            android.graphics.Matrix r1 = r0.f16963e
            r1.set(r10)
            r1 = r2
            q5.a r1 = (q5.a) r1
            r1.getOnChartGestureListener()
            r16.b()
            android.graphics.Matrix r1 = r0.f16963e
            r1.postTranslate(r3, r9)
            goto L_0x03ae
        L_0x0165:
            if (r6 == r14) goto L_0x0214
            if (r6 == r4) goto L_0x0214
            if (r6 != r13) goto L_0x016d
            goto L_0x0214
        L_0x016d:
            if (r6 != 0) goto L_0x03ae
            float r3 = r18.getX()
            float r4 = r11.f17729b
            float r6 = r18.getY()
            float r10 = r11.f17730c
            float r3 = r3 - r4
            float r6 = r6 - r10
            float r3 = r3 * r3
            float r6 = r6 * r6
            float r6 = r6 + r3
            double r3 = (double) r6
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r3 = java.lang.Math.abs(r3)
            float r4 = r0.M
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ae
            boolean r3 = r5.f12856g0
            if (r3 != 0) goto L_0x019b
            boolean r3 = r5.f12857h0
            if (r3 == 0) goto L_0x0199
            goto L_0x019b
        L_0x0199:
            r3 = r7
            goto L_0x019c
        L_0x019b:
            r3 = r8
        L_0x019c:
            if (r3 == 0) goto L_0x03ae
            z5.g r3 = r5.N
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x01ae
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01ae
            r3 = r8
            goto L_0x01af
        L_0x01ae:
            r3 = r7
        L_0x01af:
            if (r3 == 0) goto L_0x01c4
            z5.g r3 = r5.N
            float r4 = r3.f17766l
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x01c1
            float r3 = r3.m
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x01c1
            r3 = r8
            goto L_0x01c2
        L_0x01c1:
            r3 = r7
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
        L_0x01c4:
            r7 = r8
        L_0x01c5:
            if (r7 == 0) goto L_0x01f1
            float r3 = r18.getX()
            float r4 = r11.f17729b
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            float r1 = r18.getY()
            float r4 = r11.f17730c
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            boolean r4 = r5.f12856g0
            if (r4 != 0) goto L_0x01e5
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x03ae
        L_0x01e5:
            boolean r4 = r5.f12857h0
            if (r4 != 0) goto L_0x01ed
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x03ae
        L_0x01ed:
            r0.f16964a = r8
            goto L_0x03ae
        L_0x01f1:
            boolean r3 = r5.f12855f0
            if (r3 == 0) goto L_0x03ae
            if (r3 == 0) goto L_0x03ae
            float r3 = r18.getX()
            float r1 = r18.getY()
            u5.b r1 = r5.c(r3, r1)
            if (r1 == 0) goto L_0x03ae
            u5.b r3 = r0.f16965b
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L_0x03ae
            r0.f16965b = r1
            r5.d(r1)
            goto L_0x03ae
        L_0x0214:
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L_0x021d
            r6.requestDisallowInterceptTouchEvent(r8)
        L_0x021d:
            boolean r6 = r5.f12858i0
            if (r6 != 0) goto L_0x0225
            boolean r6 = r5.f12859j0
            if (r6 == 0) goto L_0x03ae
        L_0x0225:
            int r6 = r18.getPointerCount()
            if (r6 < r14) goto L_0x03ae
            r5.getOnChartGestureListener()
            float r6 = d(r18)
            float r9 = r0.N
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ae
            float r9 = r3.f17729b
            float r3 = r3.f17730c
            z5.c r3 = r0.a(r9, r3)
            z5.g r9 = r5.getViewPortHandler()
            int r11 = r0.f16964a
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 != r13) goto L_0x02a0
            float r1 = r0.G
            float r6 = r6 / r1
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x0253
            r1 = r8
            goto L_0x0254
        L_0x0253:
            r1 = r7
        L_0x0254:
            if (r1 == 0) goto L_0x0262
            float r4 = r9.f17763i
            float r11 = r9.f17761g
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0260
        L_0x025e:
            r4 = r8
            goto L_0x026b
        L_0x0260:
            r4 = r7
            goto L_0x026b
        L_0x0262:
            float r4 = r9.f17763i
            float r11 = r9.f17762h
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0260
            goto L_0x025e
        L_0x026b:
            if (r1 == 0) goto L_0x0277
            float r1 = r9.f17764j
            float r9 = r9.f17759e
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0280
        L_0x0275:
            r7 = r8
            goto L_0x0280
        L_0x0277:
            float r1 = r9.f17764j
            float r9 = r9.f17760f
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0280
            goto L_0x0275
        L_0x0280:
            boolean r1 = r5.f12858i0
            if (r1 == 0) goto L_0x0286
            r1 = r6
            goto L_0x0287
        L_0x0286:
            r1 = r12
        L_0x0287:
            boolean r9 = r5.f12859j0
            if (r9 == 0) goto L_0x028c
            r12 = r6
        L_0x028c:
            if (r7 != 0) goto L_0x0290
            if (r4 == 0) goto L_0x0325
        L_0x0290:
            android.graphics.Matrix r4 = r0.f16963e
            r4.set(r10)
            android.graphics.Matrix r4 = r0.f16963e
            float r6 = r3.f17729b
            float r7 = r3.f17730c
            r4.postScale(r1, r12, r6, r7)
            goto L_0x0325
        L_0x02a0:
            if (r11 != r14) goto L_0x02e3
            boolean r6 = r5.f12858i0
            if (r6 == 0) goto L_0x02e3
            float r4 = r1.getX(r7)
            float r1 = r1.getX(r8)
            float r4 = r4 - r1
            float r1 = java.lang.Math.abs(r4)
            float r4 = r0.E
            float r1 = r1 / r4
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x02bc
            r4 = r8
            goto L_0x02bd
        L_0x02bc:
            r4 = r7
        L_0x02bd:
            if (r4 == 0) goto L_0x02c9
            float r4 = r9.f17763i
            float r6 = r9.f17761g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x02d2
        L_0x02c7:
            r7 = r8
            goto L_0x02d2
        L_0x02c9:
            float r4 = r9.f17763i
            float r6 = r9.f17762h
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x02d2
            goto L_0x02c7
        L_0x02d2:
            if (r7 == 0) goto L_0x0325
            android.graphics.Matrix r4 = r0.f16963e
            r4.set(r10)
            android.graphics.Matrix r4 = r0.f16963e
            float r6 = r3.f17729b
            float r7 = r3.f17730c
            r4.postScale(r1, r12, r6, r7)
            goto L_0x0325
        L_0x02e3:
            if (r11 != r4) goto L_0x0325
            boolean r4 = r5.f12859j0
            if (r4 == 0) goto L_0x0325
            float r4 = r1.getY(r7)
            float r1 = r1.getY(r8)
            float r4 = r4 - r1
            float r1 = java.lang.Math.abs(r4)
            float r4 = r0.F
            float r1 = r1 / r4
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x02ff
            r4 = r8
            goto L_0x0300
        L_0x02ff:
            r4 = r7
        L_0x0300:
            if (r4 == 0) goto L_0x030c
            float r4 = r9.f17764j
            float r6 = r9.f17759e
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0315
        L_0x030a:
            r7 = r8
            goto L_0x0315
        L_0x030c:
            float r4 = r9.f17764j
            float r6 = r9.f17760f
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0315
            goto L_0x030a
        L_0x0315:
            if (r7 == 0) goto L_0x0325
            android.graphics.Matrix r4 = r0.f16963e
            r4.set(r10)
            android.graphics.Matrix r4 = r0.f16963e
            float r6 = r3.f17729b
            float r7 = r3.f17730c
            r4.postScale(r12, r1, r6, r7)
        L_0x0325:
            z5.c.d(r3)
            goto L_0x03ae
        L_0x032a:
            android.view.VelocityTracker r6 = r0.I
            int r15 = r1.getPointerId(r7)
            int r3 = z5.f.f17748c
            float r3 = (float) r3
            r6.computeCurrentVelocity(r11, r3)
            float r3 = r6.getYVelocity(r15)
            float r6 = r6.getXVelocity(r15)
            float r11 = java.lang.Math.abs(r6)
            int r15 = z5.f.f17747b
            float r15 = (float) r15
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 > 0) goto L_0x0354
            float r11 = java.lang.Math.abs(r3)
            int r15 = z5.f.f17747b
            float r15 = (float) r15
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x037b
        L_0x0354:
            int r11 = r0.f16964a
            if (r11 != r8) goto L_0x037b
            boolean r11 = r5.f12880d
            if (r11 == 0) goto L_0x037b
            r10.f17729b = r9
            r10.f17730c = r9
            long r8 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r0.J = r8
            float r8 = r18.getX()
            z5.c r9 = r0.K
            r9.f17729b = r8
            float r1 = r18.getY()
            r9.f17730c = r1
            r10.f17729b = r6
            r10.f17730c = r3
            r2.postInvalidateOnAnimation()
        L_0x037b:
            int r1 = r0.f16964a
            if (r1 == r14) goto L_0x0385
            if (r1 == r4) goto L_0x0385
            if (r1 == r13) goto L_0x0385
            if (r1 != r12) goto L_0x038b
        L_0x0385:
            r5.b()
            r5.postInvalidate()
        L_0x038b:
            r0.f16964a = r7
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L_0x0396
            r1.requestDisallowInterceptTouchEvent(r7)
        L_0x0396:
            android.view.VelocityTracker r1 = r0.I
            if (r1 == 0) goto L_0x03a0
            r1.recycle()
            r1 = 0
            r0.I = r1
        L_0x03a0:
            r2.getOnChartGestureListener()
            goto L_0x03ae
        L_0x03a4:
            r2.getOnChartGestureListener()
            r10.f17729b = r9
            r10.f17730c = r9
            r0.c(r1)
        L_0x03ae:
            z5.g r1 = r5.getViewPortHandler()
            android.graphics.Matrix r3 = r0.f16963e
            r4 = 1
            r1.k(r3, r2, r4)
            r0.f16963e = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
