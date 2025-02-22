package w7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class e<V extends View> extends g<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f16504c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f16505d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16506e;

    /* renamed from: f  reason: collision with root package name */
    public int f16507f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f16508g;

    /* renamed from: h  reason: collision with root package name */
    public int f16509h = -1;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f16510i;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f16511a;

        /* renamed from: b  reason: collision with root package name */
        public final V f16512b;

        public a(CoordinatorLayout coordinatorLayout, V v3) {
            this.f16511a = coordinatorLayout;
            this.f16512b = v3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r4.f16513c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                V r0 = r4.f16512b
                if (r0 == 0) goto L_0x0024
                w7.e r1 = w7.e.this
                android.widget.OverScroller r2 = r1.f16505d
                if (r2 == 0) goto L_0x0024
                boolean r2 = r2.computeScrollOffset()
                androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r4.f16511a
                if (r2 == 0) goto L_0x0021
                android.widget.OverScroller r2 = r1.f16505d
                int r2 = r2.getCurrY()
                r1.A(r3, r0, r2)
                java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
                d2.i0.d.m(r0, r4)
                goto L_0x0024
            L_0x0021:
                r1.y(r0, r3)
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w7.e.a.run():void");
        }
    }

    public e() {
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i8) {
        z(coordinatorLayout, view, i8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f16509h < 0) {
            this.f16509h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16506e) {
            int i8 = this.f16507f;
            if (i8 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f16508g) > this.f16509h) {
                this.f16508g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16507f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = u(v3) && coordinatorLayout.i(v3, x10, y11);
            this.f16506e = z10;
            if (z10) {
                this.f16508g = y11;
                this.f16507f = motionEvent.getPointerId(0);
                if (this.f16510i == null) {
                    this.f16510i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f16505d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16505d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16510i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r22.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x0060
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00c3
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005d
        L_0x001c:
            int r0 = r22.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = r8
            goto L_0x0025
        L_0x0024:
            r0 = r9
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f16507f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f16508g = r0
            goto L_0x005d
        L_0x0036:
            int r0 = r6.f16507f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f16508g
            int r3 = r3 - r0
            r6.f16508g = r0
            int r4 = r6.v(r2)
            r5 = 0
            int r0 = r19.x()
            int r3 = r0 - r3
            r0 = r19
            r1 = r20
            r2 = r21
            r0.z(r1, r2, r3, r4, r5)
        L_0x005d:
            r0 = r9
            goto L_0x00d1
        L_0x0060:
            android.view.VelocityTracker r0 = r6.f16510i
            if (r0 == 0) goto L_0x00c3
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f16510i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f16510i
            int r5 = r6.f16507f
            float r0 = r0.getYVelocity(r5)
            int r5 = r6.w(r2)
            int r5 = -r5
            r18 = 0
            w7.e$a r10 = r6.f16504c
            if (r10 == 0) goto L_0x0086
            r2.removeCallbacks(r10)
            r6.f16504c = r3
        L_0x0086:
            android.widget.OverScroller r10 = r6.f16505d
            if (r10 != 0) goto L_0x0095
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.f16505d = r10
        L_0x0095:
            android.widget.OverScroller r10 = r6.f16505d
            r11 = 0
            int r12 = r19.s()
            r13 = 0
            int r14 = java.lang.Math.round(r0)
            r15 = 0
            r16 = 0
            r17 = r5
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.f16505d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            w7.e$a r0 = new w7.e$a
            r0.<init>(r1, r2)
            r6.f16504c = r0
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            d2.i0.d.m(r2, r0)
            goto L_0x00c1
        L_0x00be:
            r6.y(r2, r1)
        L_0x00c1:
            r0 = r8
            goto L_0x00c4
        L_0x00c3:
            r0 = r9
        L_0x00c4:
            r6.f16506e = r9
            r6.f16507f = r4
            android.view.VelocityTracker r1 = r6.f16510i
            if (r1 == 0) goto L_0x00d1
            r1.recycle()
            r6.f16510i = r3
        L_0x00d1:
            android.view.VelocityTracker r1 = r6.f16510i
            if (r1 == 0) goto L_0x00d8
            r1.addMovement(r7)
        L_0x00d8:
            boolean r1 = r6.f16506e
            if (r1 != 0) goto L_0x00e0
            if (r0 == 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r8 = r9
        L_0x00e0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.e.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean u(V v3) {
        return false;
    }

    public int v(V v3) {
        return -v3.getHeight();
    }

    public int w(V v3) {
        return v3.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v3, int i8, int i10, int i11) {
        int r10;
        int s10 = s();
        if (i10 == 0 || s10 < i10 || s10 > i11 || s10 == (r10 = b7.a.r(i8, i10, i11))) {
            return 0;
        }
        h hVar = this.f16518a;
        if (hVar == null) {
            this.f16519b = r10;
        } else if (hVar.f16523d != r10) {
            hVar.f16523d = r10;
            hVar.a();
        }
        return s10 - r10;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
