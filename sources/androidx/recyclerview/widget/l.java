package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class l extends RecyclerView.l implements RecyclerView.q {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f2688a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2689b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f2690c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2691d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2692e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2693f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2694g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2695h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2696i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2697j;

    /* renamed from: k  reason: collision with root package name */
    public int f2698k;

    /* renamed from: l  reason: collision with root package name */
    public int f2699l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public int f2700n;

    /* renamed from: o  reason: collision with root package name */
    public int f2701o;

    /* renamed from: p  reason: collision with root package name */
    public float f2702p;

    /* renamed from: q  reason: collision with root package name */
    public int f2703q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f2704r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f2705s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2706t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2707u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f2708v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f2709w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2710x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2711y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f2712z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l lVar = l.this;
            int i8 = lVar.A;
            ValueAnimator valueAnimator = lVar.f2712z;
            if (i8 == 1) {
                valueAnimator.cancel();
            } else if (i8 != 2) {
                return;
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            valueAnimator.setDuration((long) 500);
            valueAnimator.start();
        }
    }

    public class b extends RecyclerView.r {
        public b() {
        }

        public final void b(RecyclerView recyclerView, int i8, int i10) {
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int computeVerticalScrollRange = lVar.f2705s.computeVerticalScrollRange();
            int i11 = lVar.f2704r;
            int i12 = computeVerticalScrollRange - i11;
            int i13 = lVar.f2688a;
            lVar.f2706t = i12 > 0 && i11 >= i13;
            int computeHorizontalScrollRange = lVar.f2705s.computeHorizontalScrollRange();
            int i14 = lVar.f2703q;
            boolean z10 = computeHorizontalScrollRange - i14 > 0 && i14 >= i13;
            lVar.f2707u = z10;
            boolean z11 = lVar.f2706t;
            if (z11 || z10) {
                if (z11) {
                    float f10 = (float) i11;
                    lVar.f2699l = (int) ((((f10 / 2.0f) + ((float) computeVerticalScrollOffset)) * f10) / ((float) computeVerticalScrollRange));
                    lVar.f2698k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
                }
                if (lVar.f2707u) {
                    float f11 = (float) computeHorizontalScrollOffset;
                    float f12 = (float) i14;
                    lVar.f2701o = (int) ((((f12 / 2.0f) + f11) * f12) / ((float) computeHorizontalScrollRange));
                    lVar.f2700n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
                }
                int i15 = lVar.f2708v;
                if (i15 == 0 || i15 == 1) {
                    lVar.i(1);
                }
            } else if (lVar.f2708v != 0) {
                lVar.i(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2715a = false;

        public c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f2715a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f2715a) {
                this.f2715a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f2712z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.i(0);
                return;
            }
            lVar.A = 2;
            lVar.f2705s.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f2690c.setAlpha(floatValue);
            lVar.f2691d.setAlpha(floatValue);
            lVar.f2705s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i10, int i11) {
        boolean z10 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2712z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2690c = stateListDrawable;
        this.f2691d = drawable;
        this.f2694g = stateListDrawable2;
        this.f2695h = drawable2;
        this.f2692e = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.f2693f = Math.max(i8, drawable.getIntrinsicWidth());
        this.f2696i = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.f2697j = Math.max(i8, drawable2.getIntrinsicWidth());
        this.f2688a = i10;
        this.f2689b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2705s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.m mVar = recyclerView2.I;
                if (mVar != null) {
                    mVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList<RecyclerView.l> arrayList = recyclerView2.L;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z10);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2705s;
                recyclerView3.M.remove(this);
                if (recyclerView3.N == this) {
                    recyclerView3.N = null;
                }
                ArrayList arrayList2 = this.f2705s.F0;
                if (arrayList2 != null) {
                    arrayList2.remove(bVar);
                }
                this.f2705s.removeCallbacks(aVar);
            }
            this.f2705s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f2705s.M.add(this);
                this.f2705s.h(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r9 >= 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        if (r5 >= 0) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r12.f2708v
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L_0x0047
            float r0 = r13.getX()
            float r3 = r13.getY()
            boolean r0 = r12.h(r0, r3)
            float r3 = r13.getX()
            float r4 = r13.getY()
            boolean r3 = r12.g(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x011d
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r12.f2709w = r1
            float r13 = r13.getX()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.f2702p = r13
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r12.f2709w = r2
            float r13 = r13.getY()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.m = r13
        L_0x0042:
            r12.i(r2)
            goto L_0x011d
        L_0x0047:
            int r0 = r13.getAction()
            r3 = 0
            if (r0 != r1) goto L_0x005e
            int r0 = r12.f2708v
            if (r0 != r2) goto L_0x005e
            r13 = 0
            r12.m = r13
            r12.f2702p = r13
            r12.i(r1)
            r12.f2709w = r3
            goto L_0x011d
        L_0x005e:
            int r0 = r13.getAction()
            if (r0 != r2) goto L_0x011d
            int r0 = r12.f2708v
            if (r0 != r2) goto L_0x011d
            r12.j()
            int r0 = r12.f2709w
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = r12.f2689b
            if (r0 != r1) goto L_0x00c6
            float r0 = r13.getX()
            int[] r6 = r12.f2711y
            r6[r3] = r5
            int r7 = r12.f2703q
            int r7 = r7 - r5
            r6[r1] = r7
            float r8 = (float) r5
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r8, r0)
            int r7 = r12.f2701o
            float r7 = (float) r7
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            goto L_0x00c6
        L_0x0097:
            float r7 = r12.f2702p
            androidx.recyclerview.widget.RecyclerView r8 = r12.f2705s
            int r8 = r8.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r12.f2705s
            int r9 = r9.computeHorizontalScrollOffset()
            int r10 = r12.f2703q
            r11 = r6[r1]
            r6 = r6[r3]
            int r11 = r11 - r6
            if (r11 != 0) goto L_0x00b0
        L_0x00ae:
            r6 = r3
            goto L_0x00bd
        L_0x00b0:
            float r6 = r0 - r7
            float r7 = (float) r11
            float r6 = r6 / r7
            int r8 = r8 - r10
            float r7 = (float) r8
            float r6 = r6 * r7
            int r6 = (int) r6
            int r9 = r9 + r6
            if (r9 >= r8) goto L_0x00ae
            if (r9 < 0) goto L_0x00ae
        L_0x00bd:
            if (r6 == 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r7 = r12.f2705s
            r7.scrollBy(r6, r3)
        L_0x00c4:
            r12.f2702p = r0
        L_0x00c6:
            int r0 = r12.f2709w
            if (r0 != r2) goto L_0x011d
            float r13 = r13.getY()
            int[] r0 = r12.f2710x
            r0[r3] = r5
            int r2 = r12.f2704r
            int r2 = r2 - r5
            r0[r1] = r2
            float r5 = (float) r5
            float r2 = (float) r2
            float r13 = java.lang.Math.min(r2, r13)
            float r13 = java.lang.Math.max(r5, r13)
            int r2 = r12.f2699l
            float r2 = (float) r2
            float r2 = r2 - r13
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ee
            goto L_0x011d
        L_0x00ee:
            float r2 = r12.m
            androidx.recyclerview.widget.RecyclerView r4 = r12.f2705s
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r12.f2705s
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r12.f2704r
            r1 = r0[r1]
            r0 = r0[r3]
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0107
        L_0x0105:
            r0 = r3
            goto L_0x0114
        L_0x0107:
            float r0 = r13 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0105
            if (r5 < 0) goto L_0x0105
        L_0x0114:
            if (r0 == 0) goto L_0x011b
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2705s
            r1.scrollBy(r3, r0)
        L_0x011b:
            r12.m = r13
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.a(android.view.MotionEvent):void");
    }

    public final void b() {
    }

    public final boolean c(MotionEvent motionEvent) {
        int i8 = this.f2708v;
        if (i8 == 1) {
            boolean h3 = h(motionEvent.getX(), motionEvent.getY());
            boolean g10 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h3 || g10)) {
                if (g10) {
                    this.f2709w = 1;
                    this.f2702p = (float) ((int) motionEvent.getX());
                } else if (h3) {
                    this.f2709w = 2;
                    this.m = (float) ((int) motionEvent.getY());
                }
                i(2);
                return true;
            }
        } else if (i8 == 2) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas) {
        if (this.f2703q != this.f2705s.getWidth() || this.f2704r != this.f2705s.getHeight()) {
            this.f2703q = this.f2705s.getWidth();
            this.f2704r = this.f2705s.getHeight();
            i(0);
        } else if (this.A != 0) {
            if (this.f2706t) {
                int i8 = this.f2703q;
                int i10 = this.f2692e;
                int i11 = i8 - i10;
                int i12 = this.f2699l;
                int i13 = this.f2698k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f2690c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f2704r;
                int i16 = this.f2693f;
                Drawable drawable = this.f2691d;
                drawable.setBounds(0, 0, i16, i15);
                RecyclerView recyclerView = this.f2705s;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                boolean z10 = true;
                if (i0.e.d(recyclerView) != 1) {
                    z10 = false;
                }
                if (z10) {
                    drawable.draw(canvas);
                    canvas.translate((float) i10, (float) i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i10), (float) (-i14));
                } else {
                    canvas.translate((float) i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i11), (float) (-i14));
                }
            }
            if (this.f2707u) {
                int i17 = this.f2704r;
                int i18 = this.f2696i;
                int i19 = i17 - i18;
                int i20 = this.f2701o;
                int i21 = this.f2700n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f2694g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f2703q;
                int i24 = this.f2697j;
                Drawable drawable2 = this.f2695h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, (float) i19);
                drawable2.draw(canvas);
                canvas.translate((float) i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i22), (float) (-i19));
            }
        }
    }

    public final boolean g(float f10, float f11) {
        if (f11 >= ((float) (this.f2704r - this.f2696i))) {
            int i8 = this.f2701o;
            int i10 = this.f2700n;
            return f10 >= ((float) (i8 - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i8));
        }
    }

    public final boolean h(float f10, float f11) {
        RecyclerView recyclerView = this.f2705s;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z10 = i0.e.d(recyclerView) == 1;
        int i8 = this.f2692e;
        if (z10) {
            if (f10 > ((float) i8)) {
                return false;
            }
        } else if (f10 < ((float) (this.f2703q - i8))) {
            return false;
        }
        int i10 = this.f2699l;
        int i11 = this.f2698k / 2;
        return f11 >= ((float) (i10 - i11)) && f11 <= ((float) (i11 + i10));
    }

    public final void i(int i8) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f2690c;
        if (i8 == 2 && this.f2708v != 2) {
            stateListDrawable.setState(C);
            this.f2705s.removeCallbacks(aVar);
        }
        if (i8 == 0) {
            this.f2705s.invalidate();
        } else {
            j();
        }
        if (this.f2708v == 2 && i8 != 2) {
            stateListDrawable.setState(D);
            this.f2705s.removeCallbacks(aVar);
            this.f2705s.postDelayed(aVar, (long) 1200);
        } else if (i8 == 1) {
            this.f2705s.removeCallbacks(aVar);
            this.f2705s.postDelayed(aVar, (long) 1500);
        }
        this.f2708v = i8;
    }

    public final void j() {
        int i8 = this.A;
        ValueAnimator valueAnimator = this.f2712z;
        if (i8 != 0) {
            if (i8 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
