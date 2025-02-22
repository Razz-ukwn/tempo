package h2;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public abstract class a implements View.OnTouchListener {
    public static final int M = ViewConfiguration.getTapTimeout();
    public final float[] B;
    public int C;
    public int D;
    public final float[] E;
    public final float[] F;
    public final float[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* renamed from: a  reason: collision with root package name */
    public final C0163a f9090a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f9091b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f9092c;

    /* renamed from: d  reason: collision with root package name */
    public b f9093d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f9094e;

    /* renamed from: h2.a$a  reason: collision with other inner class name */
    public static class C0163a {

        /* renamed from: a  reason: collision with root package name */
        public int f9095a;

        /* renamed from: b  reason: collision with root package name */
        public int f9096b;

        /* renamed from: c  reason: collision with root package name */
        public float f9097c;

        /* renamed from: d  reason: collision with root package name */
        public float f9098d;

        /* renamed from: e  reason: collision with root package name */
        public long f9099e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f9100f = 0;

        /* renamed from: g  reason: collision with root package name */
        public long f9101g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f9102h;

        /* renamed from: i  reason: collision with root package name */
        public int f9103i;

        public final float a(long j10) {
            long j11 = this.f9099e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f9101g;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / ((float) this.f9095a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f9102h;
            return (a.b(((float) (j10 - j12)) / ((float) this.f9103i), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            a aVar = a.this;
            if (aVar.K) {
                boolean z10 = aVar.I;
                C0163a aVar2 = aVar.f9090a;
                if (z10) {
                    aVar.I = false;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f9099e = currentAnimationTimeMillis;
                    aVar2.f9101g = -1;
                    aVar2.f9100f = currentAnimationTimeMillis;
                    aVar2.f9102h = 0.5f;
                }
                if ((aVar2.f9101g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f9101g + ((long) aVar2.f9103i)) || !aVar.e()) {
                    aVar.K = false;
                    return;
                }
                boolean z11 = aVar.J;
                View view = aVar.f9092c;
                if (z11) {
                    aVar.J = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f9100f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar2.a(currentAnimationTimeMillis2);
                    aVar2.f9100f = currentAnimationTimeMillis2;
                    i.b(((h) aVar).N, (int) (((float) (currentAnimationTimeMillis2 - aVar2.f9100f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10)) * aVar2.f9098d));
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0163a aVar = new C0163a();
        this.f9090a = aVar;
        float[] fArr = {0.0f, 0.0f};
        this.f9094e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.B = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.E = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.F = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.G = fArr5;
        this.f9092c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.C = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.D = M;
        aVar.f9095a = 500;
        aVar.f9096b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f9094e
            r0 = r0[r4]
            float[] r1 = r3.B
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f9091b
            if (r6 >= 0) goto L_0x0025
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002d
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0036
            float r5 = r0.getInterpolation(r5)
        L_0x002d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0037
        L_0x0036:
            r5 = r2
        L_0x0037:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.E
            r0 = r0[r4]
            float[] r1 = r3.F
            r1 = r1[r4]
            float[] r2 = r3.G
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0051
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0051:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i8 = this.C;
        if (i8 == 0 || i8 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.K || i8 != 1) ? 0.0f : 1.0f;
            }
        } else if (i8 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final void d() {
        int i8 = 0;
        if (this.I) {
            this.K = false;
            return;
        }
        C0163a aVar = this.f9090a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f9099e);
        int i11 = aVar.f9096b;
        if (i10 > i11) {
            i8 = i11;
        } else if (i10 >= 0) {
            i8 = i10;
        }
        aVar.f9103i = i8;
        aVar.f9102h = aVar.a(currentAnimationTimeMillis);
        aVar.f9101g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r9 = this;
            h2.a$a r0 = r9.f9090a
            float r1 = r0.f9098d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f9097c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L_0x0055
            r3 = r9
            h2.h r3 = (h2.h) r3
            android.widget.ListView r3 = r3.N
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L_0x0023
        L_0x0021:
            r1 = r2
            goto L_0x0051
        L_0x0023:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r4) goto L_0x0050
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r5
        L_0x0051:
            if (r1 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r5
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.L
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.J = r2
            r7.H = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f9092c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            h2.a$a r9 = r7.f9090a
            r9.f9097c = r0
            r9.f9098d = r8
            boolean r8 = r7.K
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            h2.a$b r8 = r7.f9093d
            if (r8 != 0) goto L_0x005f
            h2.a$b r8 = new h2.a$b
            r8.<init>()
            r7.f9093d = r8
        L_0x005f:
            r7.K = r2
            r7.I = r2
            boolean r8 = r7.H
            if (r8 != 0) goto L_0x0074
            int r8 = r7.D
            if (r8 <= 0) goto L_0x0074
            h2.a$b r9 = r7.f9093d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, d2.d1> r8 = d2.i0.f7217a
            d2.i0.d.n(r4, r9, r5)
            goto L_0x0079
        L_0x0074:
            h2.a$b r8 = r7.f9093d
            r8.run()
        L_0x0079:
            r7.H = r2
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
