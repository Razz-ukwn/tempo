package l2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import d2.d1;
import d2.i0;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f10943x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f10944a;

    /* renamed from: b  reason: collision with root package name */
    public int f10945b;

    /* renamed from: c  reason: collision with root package name */
    public int f10946c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f10947d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f10948e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f10949f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f10950g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f10951h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f10952i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f10953j;

    /* renamed from: k  reason: collision with root package name */
    public int f10954k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f10955l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public float f10956n;

    /* renamed from: o  reason: collision with root package name */
    public int f10957o;

    /* renamed from: p  reason: collision with root package name */
    public final int f10958p;

    /* renamed from: q  reason: collision with root package name */
    public int f10959q;

    /* renamed from: r  reason: collision with root package name */
    public final OverScroller f10960r;

    /* renamed from: s  reason: collision with root package name */
    public final C0205c f10961s;

    /* renamed from: t  reason: collision with root package name */
    public View f10962t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10963u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f10964v;

    /* renamed from: w  reason: collision with root package name */
    public final b f10965w = new b();

    public class a implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c.this.p(0);
        }
    }

    /* renamed from: l2.c$c  reason: collision with other inner class name */
    public static abstract class C0205c {
        public abstract int a(View view, int i8);

        public abstract int b(View view, int i8);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(int i8, int i10) {
        }

        public void f() {
        }

        public void g(View view, int i8) {
        }

        public abstract void h(int i8);

        public abstract void i(View view, int i8, int i10);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(View view, int i8);
    }

    public c(Context context, ViewGroup viewGroup, C0205c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f10964v = viewGroup;
            this.f10961s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i8 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f10958p = i8;
            this.f10957o = i8;
            this.f10945b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10956n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10960r = new OverScroller(context, f10943x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f10946c = -1;
        float[] fArr = this.f10947d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10948e, 0.0f);
            Arrays.fill(this.f10949f, 0.0f);
            Arrays.fill(this.f10950g, 0.0f);
            Arrays.fill(this.f10951h, 0);
            Arrays.fill(this.f10952i, 0);
            Arrays.fill(this.f10953j, 0);
            this.f10954k = 0;
        }
        VelocityTracker velocityTracker = this.f10955l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10955l = null;
        }
    }

    public final void b(View view, int i8) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f10964v;
        if (parent == viewGroup) {
            this.f10962t = view;
            this.f10946c = i8;
            this.f10961s.g(view, i8);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f10, float f11, int i8, int i10) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f10951h[i8] & i10) != i10 || (this.f10959q & i10) == 0 || (this.f10953j[i8] & i10) == i10 || (this.f10952i[i8] & i10) == i10) {
            return false;
        }
        int i11 = this.f10945b;
        if (abs <= ((float) i11) && abs2 <= ((float) i11)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f10961s.getClass();
        }
        return (this.f10952i[i8] & i10) == 0 && abs > ((float) this.f10945b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        C0205c cVar = this.f10961s;
        boolean z10 = cVar.c(view) > 0;
        boolean z11 = cVar.d() > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f10945b) : z11 && Math.abs(f11) > ((float) this.f10945b);
        }
        float f12 = f11 * f11;
        int i8 = this.f10945b;
        return f12 + (f10 * f10) > ((float) (i8 * i8));
    }

    public final void e(int i8) {
        float[] fArr = this.f10947d;
        if (fArr != null) {
            int i10 = this.f10954k;
            boolean z10 = true;
            int i11 = 1 << i8;
            if ((i11 & i10) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i8] = 0.0f;
                this.f10948e[i8] = 0.0f;
                this.f10949f[i8] = 0.0f;
                this.f10950g[i8] = 0.0f;
                this.f10951h[i8] = 0;
                this.f10952i[i8] = 0;
                this.f10953j[i8] = 0;
                this.f10954k = (~i11) & i10;
            }
        }
    }

    public final int f(int i8, int i10, int i11) {
        if (i8 == 0) {
            return 0;
        }
        int width = this.f10964v.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i8)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i10);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i8)) / ((float) i11)) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f10944a == 2) {
            OverScroller overScroller = this.f10960r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f10962t.getLeft();
            int top = currY - this.f10962t.getTop();
            if (left != 0) {
                View view = this.f10962t;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f10962t;
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f10961s.i(this.f10962t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f10964v.post(this.f10965w);
            }
        }
        return this.f10944a == 2;
    }

    public final View h(int i8, int i10) {
        ViewGroup viewGroup = this.f10964v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f10961s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i8 >= childAt.getLeft() && i8 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f10962t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f10962t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f10960r
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.f10962t
            float r0 = r10.f10956n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            float r0 = r10.f10956n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            if (r7 <= r6) goto L_0x0047
            if (r14 <= 0) goto L_0x0045
            r14 = r6
            goto L_0x0047
        L_0x0045:
            int r11 = -r6
        L_0x0046:
            r14 = r11
        L_0x0047:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x0060
            float r11 = (float) r6
            float r6 = (float) r8
            goto L_0x0062
        L_0x0060:
            float r11 = (float) r11
            float r6 = (float) r9
        L_0x0062:
            float r11 = r11 / r6
            if (r14 == 0) goto L_0x0068
            float r0 = (float) r7
            float r6 = (float) r8
            goto L_0x006a
        L_0x0068:
            float r0 = (float) r0
            float r6 = (float) r9
        L_0x006a:
            float r0 = r0 / r6
            l2.c$c r6 = r10.f10961s
            int r12 = r6.c(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.c.i(int, int, int, int):boolean");
    }

    public final boolean j(int i8) {
        if ((this.f10954k & (1 << i8)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i8 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10955l == null) {
            this.f10955l = VelocityTracker.obtain();
        }
        this.f10955l.addMovement(motionEvent);
        int i10 = 0;
        C0205c cVar = this.f10961s;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h3 = h((int) x10, (int) y10);
            n(x10, y10, pointerId);
            t(h3, pointerId);
            if ((this.f10951h[pointerId] & this.f10959q) != 0) {
                cVar.f();
            }
        } else if (actionMasked == 1) {
            if (this.f10944a == 1) {
                l();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f10944a == 1) {
                    this.f10963u = true;
                    cVar.j(this.f10962t, 0.0f, 0.0f);
                    this.f10963u = false;
                    if (this.f10944a == 1) {
                        p(0);
                    }
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                n(x11, y11, pointerId2);
                if (this.f10944a == 0) {
                    t(h((int) x11, (int) y11), pointerId2);
                    if ((this.f10951h[pointerId2] & this.f10959q) != 0) {
                        cVar.f();
                        return;
                    }
                    return;
                }
                int i11 = (int) x11;
                int i12 = (int) y11;
                View view = this.f10962t;
                if (view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom()) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    t(this.f10962t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f10944a == 1 && pointerId3 == this.f10946c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i10 >= pointerCount) {
                            i8 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i10);
                        if (pointerId4 != this.f10946c) {
                            View h10 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                            View view2 = this.f10962t;
                            if (h10 == view2 && t(view2, pointerId4)) {
                                i8 = this.f10946c;
                                break;
                            }
                        }
                        i10++;
                    }
                    if (i8 == -1) {
                        l();
                    }
                }
                e(pointerId3);
            }
        } else if (this.f10944a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i10 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i10);
                if (j(pointerId5)) {
                    float x12 = motionEvent.getX(i10);
                    float y12 = motionEvent.getY(i10);
                    float f10 = x12 - this.f10947d[pointerId5];
                    float f11 = y12 - this.f10948e[pointerId5];
                    m(f10, f11, pointerId5);
                    if (this.f10944a != 1) {
                        View h11 = h((int) x12, (int) y12);
                        if (d(h11, f10, f11) && t(h11, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i10++;
            }
            o(motionEvent);
        } else if (j(this.f10946c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f10946c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y13 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f10949f;
            int i13 = this.f10946c;
            int i14 = (int) (x13 - fArr[i13]);
            int i15 = (int) (y13 - this.f10950g[i13]);
            int left = this.f10962t.getLeft() + i14;
            int top = this.f10962t.getTop() + i15;
            int left2 = this.f10962t.getLeft();
            int top2 = this.f10962t.getTop();
            if (i14 != 0) {
                left = cVar.a(this.f10962t, left);
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                this.f10962t.offsetLeftAndRight(left - left2);
            }
            if (i15 != 0) {
                top = cVar.b(this.f10962t, top);
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                this.f10962t.offsetTopAndBottom(top - top2);
            }
            if (!(i14 == 0 && i15 == 0)) {
                cVar.i(this.f10962t, left, top);
            }
            o(motionEvent);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f10955l;
        float f10 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f10955l.getXVelocity(this.f10946c);
        float f11 = this.f10956n;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f10955l.getYVelocity(this.f10946c);
        float f13 = this.f10956n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f13) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f10963u = true;
        this.f10961s.j(this.f10962t, xVelocity, f12);
        this.f10963u = false;
        if (this.f10944a == 1) {
            p(0);
        }
    }

    public final void m(float f10, float f11, int i8) {
        boolean c3 = c(f10, f11, i8, 1);
        if (c(f11, f10, i8, 4)) {
            c3 |= true;
        }
        if (c(f10, f11, i8, 2)) {
            c3 |= true;
        }
        if (c(f11, f10, i8, 8)) {
            c3 |= true;
        }
        if (c3) {
            int[] iArr = this.f10952i;
            iArr[i8] = iArr[i8] | c3;
            this.f10961s.e(c3 ? 1 : 0, i8);
        }
    }

    public final void n(float f10, float f11, int i8) {
        float[] fArr = this.f10947d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i8) {
            int i11 = i8 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10948e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10949f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10950g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10951h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10952i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10953j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10947d = fArr2;
            this.f10948e = fArr3;
            this.f10949f = fArr4;
            this.f10950g = fArr5;
            this.f10951h = iArr;
            this.f10952i = iArr2;
            this.f10953j = iArr3;
        }
        float[] fArr9 = this.f10947d;
        this.f10949f[i8] = f10;
        fArr9[i8] = f10;
        float[] fArr10 = this.f10948e;
        this.f10950g[i8] = f11;
        fArr10[i8] = f11;
        int[] iArr7 = this.f10951h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f10964v;
        if (i12 < viewGroup.getLeft() + this.f10957o) {
            i10 = 1;
        }
        if (i13 < viewGroup.getTop() + this.f10957o) {
            i10 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f10957o) {
            i10 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f10957o) {
            i10 |= 8;
        }
        iArr7[i8] = i10;
        this.f10954k |= 1 << i8;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i8);
                float y10 = motionEvent.getY(i8);
                this.f10949f[pointerId] = x10;
                this.f10950g[pointerId] = y10;
            }
        }
    }

    public final void p(int i8) {
        this.f10964v.removeCallbacks(this.f10965w);
        if (this.f10944a != i8) {
            this.f10944a = i8;
            this.f10961s.h(i8);
            if (this.f10944a == 0) {
                this.f10962t = null;
            }
        }
    }

    public final boolean q(int i8, int i10) {
        if (this.f10963u) {
            return i(i8, i10, (int) this.f10955l.getXVelocity(this.f10946c), (int) this.f10955l.getYVelocity(this.f10946c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        if (r13 != r12) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r19.getActionMasked()
            int r3 = r19.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r18.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f10955l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f10955l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f10955l
            r4.addMovement(r1)
            r4 = 1
            r5 = 0
            r6 = 2
            l2.c$c r7 = r0.f10961s
            if (r2 == 0) goto L_0x00f9
            if (r2 == r4) goto L_0x00f5
            if (r2 == r6) goto L_0x0071
            r8 = 3
            if (r2 == r8) goto L_0x00f5
            r8 = 5
            if (r2 == r8) goto L_0x003f
            r6 = 6
            if (r2 == r6) goto L_0x0036
            goto L_0x0125
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0125
        L_0x003f:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.n(r8, r1, r2)
            int r3 = r0.f10944a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f10951h
            r1 = r1[r2]
            int r2 = r0.f10959q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0125
            r7.f()
            goto L_0x0125
        L_0x0060:
            if (r3 != r6) goto L_0x0125
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.h(r3, r1)
            android.view.View r3 = r0.f10962t
            if (r1 != r3) goto L_0x0125
            r0.t(r1, r2)
            goto L_0x0125
        L_0x0071:
            float[] r2 = r0.f10947d
            if (r2 == 0) goto L_0x0125
            float[] r2 = r0.f10948e
            if (r2 != 0) goto L_0x007b
            goto L_0x0125
        L_0x007b:
            int r2 = r19.getPointerCount()
            r3 = r5
        L_0x0080:
            if (r3 >= r2) goto L_0x00f1
            int r6 = r1.getPointerId(r3)
            boolean r8 = r0.j(r6)
            if (r8 != 0) goto L_0x008d
            goto L_0x00ee
        L_0x008d:
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            float[] r10 = r0.f10947d
            r10 = r10[r6]
            float r10 = r8 - r10
            float[] r11 = r0.f10948e
            r11 = r11[r6]
            float r11 = r9 - r11
            int r8 = (int) r8
            int r9 = (int) r9
            android.view.View r8 = r0.h(r8, r9)
            if (r8 == 0) goto L_0x00b1
            boolean r9 = r0.d(r8, r10, r11)
            if (r9 == 0) goto L_0x00b1
            r9 = r4
            goto L_0x00b2
        L_0x00b1:
            r9 = r5
        L_0x00b2:
            if (r9 == 0) goto L_0x00dd
            int r12 = r8.getLeft()
            int r13 = (int) r10
            int r13 = r13 + r12
            int r13 = r7.a(r8, r13)
            int r14 = r8.getTop()
            int r15 = (int) r11
            int r15 = r15 + r14
            int r15 = r7.b(r8, r15)
            int r16 = r7.c(r8)
            int r17 = r7.d()
            if (r16 == 0) goto L_0x00d6
            if (r16 <= 0) goto L_0x00dd
            if (r13 != r12) goto L_0x00dd
        L_0x00d6:
            if (r17 == 0) goto L_0x00f1
            if (r17 <= 0) goto L_0x00dd
            if (r15 != r14) goto L_0x00dd
            goto L_0x00f1
        L_0x00dd:
            r0.m(r10, r11, r6)
            int r10 = r0.f10944a
            if (r10 != r4) goto L_0x00e5
            goto L_0x00f1
        L_0x00e5:
            if (r9 == 0) goto L_0x00ee
            boolean r6 = r0.t(r8, r6)
            if (r6 == 0) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            int r3 = r3 + 1
            goto L_0x0080
        L_0x00f1:
            r18.o(r19)
            goto L_0x0125
        L_0x00f5:
            r18.a()
            goto L_0x0125
        L_0x00f9:
            float r2 = r19.getX()
            float r3 = r19.getY()
            int r1 = r1.getPointerId(r5)
            r0.n(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.h(r2, r3)
            android.view.View r3 = r0.f10962t
            if (r2 != r3) goto L_0x0119
            int r3 = r0.f10944a
            if (r3 != r6) goto L_0x0119
            r0.t(r2, r1)
        L_0x0119:
            int[] r2 = r0.f10951h
            r1 = r2[r1]
            int r2 = r0.f10959q
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0125
            r7.f()
        L_0x0125:
            int r1 = r0.f10944a
            if (r1 != r4) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r4 = r5
        L_0x012b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.c.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i8, int i10) {
        this.f10962t = view;
        this.f10946c = -1;
        boolean i11 = i(i8, i10, 0, 0);
        if (!i11 && this.f10944a == 0 && this.f10962t != null) {
            this.f10962t = null;
        }
        return i11;
    }

    public final boolean t(View view, int i8) {
        if (view == this.f10962t && this.f10946c == i8) {
            return true;
        }
        if (view == null || !this.f10961s.k(view, i8)) {
            return false;
        }
        this.f10946c = i8;
        b(view, i8);
        return true;
    }
}
