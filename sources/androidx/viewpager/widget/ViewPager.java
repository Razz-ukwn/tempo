package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import b3.x;
import d2.d1;
import d2.i0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import t1.a;

public class ViewPager extends ViewGroup {

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f2776v0 = {16842931};

    /* renamed from: w0  reason: collision with root package name */
    public static final a f2777w0 = new a();

    /* renamed from: x0  reason: collision with root package name */
    public static final b f2778x0 = new b();
    public int B;
    public int C = -1;
    public Parcelable D = null;
    public ClassLoader E = null;
    public Scroller F;
    public boolean G;
    public j H;
    public int I;
    public Drawable J;
    public int K;
    public int L;
    public float M = -3.4028235E38f;
    public float N = Float.MAX_VALUE;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S = 1;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public int f2779a;

    /* renamed from: a0  reason: collision with root package name */
    public int f2780a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f2781b = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public float f2782b0;

    /* renamed from: c  reason: collision with root package name */
    public final e f2783c = new e();

    /* renamed from: c0  reason: collision with root package name */
    public float f2784c0;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2785d = new Rect();

    /* renamed from: d0  reason: collision with root package name */
    public float f2786d0;

    /* renamed from: e  reason: collision with root package name */
    public u3.a f2787e;

    /* renamed from: e0  reason: collision with root package name */
    public float f2788e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2789f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public VelocityTracker f2790g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2791h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2792i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2793j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2794k0;

    /* renamed from: l0  reason: collision with root package name */
    public EdgeEffect f2795l0;

    /* renamed from: m0  reason: collision with root package name */
    public EdgeEffect f2796m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2797n0 = true;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2798o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2799p0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f2800q0;

    /* renamed from: r0  reason: collision with root package name */
    public i f2801r0;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f2802s0;

    /* renamed from: t0  reason: collision with root package name */
    public final c f2803t0 = new c();

    /* renamed from: u0  reason: collision with root package name */
    public int f2804u0 = 0;

    public static class a implements Comparator<e> {
        public final int compare(Object obj, Object obj2) {
            return ((e) obj).f2807b - ((e) obj2).f2807b;
        }
    }

    public static class b implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.p();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f2806a;

        /* renamed from: b  reason: collision with root package name */
        public int f2807b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2808c;

        /* renamed from: d  reason: collision with root package name */
        public float f2809d;

        /* renamed from: e  reason: collision with root package name */
        public float f2810e;
    }

    public class g extends d2.a {
        public g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
            if (r0.c() > 1) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                u3.a r0 = r3.f2787e
                if (r0 == 0) goto L_0x001a
                int r0 = r0.c()
                r1 = 1
                if (r0 <= r1) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L_0x003b
                u3.a r0 = r3.f2787e
                if (r0 == 0) goto L_0x003b
                int r0 = r0.c()
                r4.setItemCount(r0)
                int r0 = r3.B
                r4.setFromIndex(r0)
                int r3 = r3.B
                r4.setToIndex(r3)
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        public final void d(View view, e2.i iVar) {
            this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
            iVar.j(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            u3.a aVar = viewPager.f2787e;
            iVar.o(aVar != null && aVar.c() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                iVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                iVar.a(8192);
            }
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            if (super.g(view, i8, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i8 != 4096) {
                if (i8 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.B - 1);
                return true;
            } else if (!viewPager.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager.setCurrentItem(viewPager.B + 1);
                return true;
            }
        }
    }

    public interface h {
        void a(ViewPager viewPager, u3.a aVar, u3.a aVar2);
    }

    public interface i {
        void a(float f10, int i8);

        void b(int i8);

        void c(int i8);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        public final void onChanged() {
            ViewPager.this.e();
        }

        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class k extends k2.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2817c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f2818d;

        /* renamed from: e  reason: collision with root package name */
        public final ClassLoader f2819e;

        public static class a implements Parcelable.ClassLoaderCreator<k> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new k[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new k(parcel, (ClassLoader) null);
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return x.b(sb2, this.f2817c, "}");
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f2817c);
            parcel.writeParcelable(this.f2818d, i8);
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f2817c = parcel.readInt();
            this.f2818d = parcel.readParcelable(classLoader);
            this.f2819e = classLoader;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.F = new Scroller(context2, f2778x0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f2780a0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f2791h0 = (int) (400.0f * f10);
        this.f2792i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2795l0 = new EdgeEffect(context2);
        this.f2796m0 = new EdgeEffect(context2);
        this.f2793j0 = (int) (25.0f * f10);
        this.f2794k0 = (int) (2.0f * f10);
        this.V = (int) (f10 * 16.0f);
        i0.n(this, new g());
        if (i0.d.c(this) == 0) {
            i0.d.s(this, 1);
        }
        i0.i.u(this, new u3.b(this));
    }

    public static boolean c(int i8, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && c(i8, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i8);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
        }
    }

    public final e a(int i8, int i10) {
        e eVar = new e();
        eVar.f2807b = i8;
        eVar.f2806a = this.f2787e.e(this, i8);
        this.f2787e.getClass();
        eVar.f2809d = 1.0f;
        ArrayList<e> arrayList = this.f2781b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i10, eVar);
        }
        return eVar;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i8, int i10) {
        e h3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f2807b == this.B) {
                    childAt.addFocusables(arrayList, i8, i10);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i10 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList<View> arrayList) {
        e h3;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f2807b == this.B) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f2811a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f2811a = z10;
        if (!this.P) {
            super.addView(view, i8, layoutParams);
        } else if (!z10) {
            fVar.f2814d = true;
            addViewInLayout(view, i8, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L_0x0009
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r3 = r0.getParent()
        L_0x000f:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001c
            if (r3 != r7) goto L_0x0017
            r3 = r1
            goto L_0x001d
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000f
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 != 0) goto L_0x0064
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0033:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0033
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L_0x0063:
            r0 = 0
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            android.graphics.Rect r6 = r7.f2785d
            if (r8 != r5) goto L_0x0099
            android.graphics.Rect r4 = r7.g(r3, r6)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.g(r0, r6)
            int r5 = r5.left
            if (r0 == 0) goto L_0x0093
            if (r4 < r5) goto L_0x0093
            int r0 = r7.B
            if (r0 <= 0) goto L_0x00cf
            int r0 = r0 - r1
            r7.R = r2
            r7.u(r0, r2, r1, r2)
            goto L_0x00d0
        L_0x0093:
            boolean r0 = r3.requestFocus()
        L_0x0097:
            r2 = r0
            goto L_0x00d1
        L_0x0099:
            if (r8 != r4) goto L_0x00d1
            android.graphics.Rect r1 = r7.g(r3, r6)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.g(r0, r6)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b0
            if (r1 > r2) goto L_0x00b0
            boolean r0 = r7.m()
            goto L_0x0097
        L_0x00b0:
            boolean r0 = r3.requestFocus()
            goto L_0x0097
        L_0x00b5:
            if (r8 == r5) goto L_0x00c4
            if (r8 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r8 == r4) goto L_0x00bf
            r0 = 2
            if (r8 != r0) goto L_0x00d1
        L_0x00bf:
            boolean r2 = r7.m()
            goto L_0x00d1
        L_0x00c4:
            int r0 = r7.B
            if (r0 <= 0) goto L_0x00cf
            int r0 = r0 - r1
            r7.R = r2
            r7.u(r0, r2, r1, r2)
            goto L_0x00d0
        L_0x00cf:
            r1 = r2
        L_0x00d0:
            r2 = r1
        L_0x00d1:
            if (r2 == 0) goto L_0x00da
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        L_0x00da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public final boolean canScrollHorizontally(int i8) {
        if (this.f2787e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i8 < 0 ? scrollX > ((int) (((float) clientWidth) * this.M)) : i8 > 0 && scrollX < ((int) (((float) clientWidth) * this.N));
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        this.G = true;
        if (this.F.isFinished() || !this.F.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.F.getCurrX();
        int currY = this.F.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                this.F.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.k(this);
    }

    public final void d(boolean z10) {
        boolean z11 = this.f2804u0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.F.isFinished()) {
                this.F.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.F.getCurrX();
                int currY = this.F.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.R = false;
        int i8 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f2781b;
            if (i8 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i8);
            if (eVar.f2808c) {
                eVar.f2808c = false;
                z11 = true;
            }
            i8++;
        }
        if (z11) {
            c cVar = this.f2803t0;
            if (z10) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.m(this, cVar);
                return;
            }
            cVar.run();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0066
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0061
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0061
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.b(r4)
            goto L_0x0062
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.b(r1)
            goto L_0x0062
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.m()
            goto L_0x0062
        L_0x0041:
            r6 = 66
            boolean r6 = r5.b(r6)
            goto L_0x0062
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x005a
            int r6 = r5.B
            if (r6 <= 0) goto L_0x0061
            int r6 = r6 - r1
            r5.R = r2
            r5.u(r6, r2, r1, r2)
            r6 = r1
            goto L_0x0062
        L_0x005a:
            r6 = 17
            boolean r6 = r5.b(r6)
            goto L_0x0062
        L_0x0061:
            r6 = r2
        L_0x0062:
            if (r6 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h3;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f2807b == this.B && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        u3.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2787e) != null && aVar.c() > 1)) {
            if (!this.f2795l0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.M * ((float) width));
                this.f2795l0.setSize(height, width);
                z10 = false | this.f2795l0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f2796m0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.N + 1.0f)) * ((float) width2));
                this.f2796m0.setSize(height2, width2);
                z10 |= this.f2796m0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f2795l0.finish();
            this.f2796m0.finish();
        }
        if (z10) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.J;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e() {
        int c3 = this.f2787e.c();
        this.f2779a = c3;
        ArrayList<e> arrayList = this.f2781b;
        boolean z10 = arrayList.size() < (this.S * 2) + 1 && arrayList.size() < c3;
        int i8 = this.B;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u3.a aVar = this.f2787e;
            Object obj = arrayList.get(i10).f2806a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f2777w0);
        if (z10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                f fVar = (f) getChildAt(i11).getLayoutParams();
                if (!fVar.f2811a) {
                    fVar.f2813c = 0.0f;
                }
            }
            u(i8, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i8) {
        i iVar = this.f2801r0;
        if (iVar != null) {
            iVar.c(i8);
        }
        ArrayList arrayList = this.f2800q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar2 = (i) this.f2800q0.get(i10);
                if (iVar2 != null) {
                    iVar2.c(i8);
                }
            }
        }
    }

    public final Rect g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public u3.a getAdapter() {
        return this.f2787e;
    }

    public final int getChildDrawingOrder(int i8, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.B;
    }

    public int getOffscreenPageLimit() {
        return this.S;
    }

    public int getPageMargin() {
        return this.I;
    }

    public final e h(View view) {
        int i8 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f2781b;
            if (i8 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i8);
            if (this.f2787e.f(view, eVar.f2806a)) {
                return eVar;
            }
            i8++;
        }
    }

    public final e i() {
        e eVar;
        int i8;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.I) / ((float) clientWidth) : 0.0f;
        int i10 = 0;
        boolean z10 = true;
        e eVar2 = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList<e> arrayList = this.f2781b;
            if (i10 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i10);
            if (z10 || eVar3.f2807b == (i8 = i11 + 1)) {
                eVar = eVar3;
            } else {
                e eVar4 = this.f2783c;
                eVar4.f2810e = f10 + f12 + f11;
                eVar4.f2807b = i8;
                this.f2787e.getClass();
                eVar4.f2809d = 1.0f;
                i10--;
                eVar = eVar4;
            }
            f10 = eVar.f2810e;
            float f13 = eVar.f2809d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar2;
            }
            if (scrollX < f13 || i10 == arrayList.size() - 1) {
                return eVar;
            }
            int i12 = eVar.f2807b;
            float f14 = eVar.f2809d;
            i10++;
            z10 = false;
            e eVar5 = eVar;
            i11 = i12;
            f12 = f14;
            eVar2 = eVar5;
        }
        return eVar;
    }

    public final e j(int i8) {
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f2781b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i10);
            if (eVar.f2807b == i8) {
                return eVar;
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f2799p0
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L_0x006b
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L_0x001b:
            if (r6 >= r5) goto L_0x006b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            boolean r9 = r8.f2811a
            if (r9 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r8 = r8.f2812b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x004d
            r9 = 3
            if (r8 == r9) goto L_0x0047
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005c
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L_0x0059
        L_0x0047:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005c
        L_0x004d:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L_0x0059:
            r10 = r8
            r8 = r2
            r2 = r10
        L_0x005c:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0067
            r7.offsetLeftAndRight(r2)
        L_0x0067:
            r2 = r8
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$i r14 = r11.f2801r0
            if (r14 == 0) goto L_0x0072
            r14.a(r12, r13)
        L_0x0072:
            java.util.ArrayList r14 = r11.f2800q0
            if (r14 == 0) goto L_0x008c
            int r14 = r14.size()
        L_0x007a:
            if (r0 >= r14) goto L_0x008c
            java.util.ArrayList r2 = r11.f2800q0
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$i r2 = (androidx.viewpager.widget.ViewPager.i) r2
            if (r2 == 0) goto L_0x0089
            r2.a(r12, r13)
        L_0x0089:
            int r0 = r0 + 1
            goto L_0x007a
        L_0x008c:
            r11.f2798o0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(float, int, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2789f0) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f2782b0 = motionEvent.getX(i8);
            this.f2789f0 = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f2790g0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        u3.a aVar = this.f2787e;
        if (aVar == null || this.B >= aVar.c() - 1) {
            return false;
        }
        this.R = false;
        u(this.B + 1, 0, true, false);
        return true;
    }

    public final boolean n(int i8) {
        if (this.f2781b.size() != 0) {
            e i10 = i();
            int clientWidth = getClientWidth();
            int i11 = this.I;
            int i12 = clientWidth + i11;
            float f10 = (float) clientWidth;
            int i13 = i10.f2807b;
            float f11 = ((((float) i8) / f10) - i10.f2810e) / (i10.f2809d + (((float) i11) / f10));
            this.f2798o0 = false;
            k(f11, i13, (int) (((float) i12) * f11));
            if (this.f2798o0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f2797n0) {
            return false;
        } else {
            this.f2798o0 = false;
            k(0.0f, 0, 0);
            if (this.f2798o0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final boolean o(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f2782b0 - f10;
        this.f2782b0 = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.M * clientWidth;
        float f13 = this.N * clientWidth;
        ArrayList<e> arrayList = this.f2781b;
        boolean z12 = false;
        e eVar = arrayList.get(0);
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f2807b != 0) {
            f12 = eVar.f2810e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f2807b != this.f2787e.c() - 1) {
            f13 = eVar2.f2810e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f2795l0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f2796m0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i8 = (int) scrollX;
        this.f2782b0 = (scrollX - ((float) i8)) + this.f2782b0;
        scrollTo(i8, getScrollY());
        n(i8);
        return z12;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2797n0 = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2803t0);
        Scroller scroller = this.F;
        if (scroller != null && !scroller.isFinished()) {
            this.F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            super.onDraw(r19)
            int r1 = r0.I
            if (r1 <= 0) goto L_0x00a8
            android.graphics.drawable.Drawable r1 = r0.J
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r0.f2781b
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a8
            u3.a r2 = r0.f2787e
            if (r2 == 0) goto L_0x00a8
            int r2 = r18.getScrollX()
            int r3 = r18.getWidth()
            int r4 = r0.I
            float r4 = (float) r4
            float r5 = (float) r3
            float r4 = r4 / r5
            r6 = 0
            java.lang.Object r7 = r1.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            float r8 = r7.f2810e
            int r9 = r1.size()
            int r10 = r7.f2807b
            int r11 = r9 + -1
            java.lang.Object r11 = r1.get(r11)
            androidx.viewpager.widget.ViewPager$e r11 = (androidx.viewpager.widget.ViewPager.e) r11
            int r11 = r11.f2807b
        L_0x003f:
            if (r10 >= r11) goto L_0x00a8
        L_0x0041:
            int r12 = r7.f2807b
            if (r10 <= r12) goto L_0x0050
            if (r6 >= r9) goto L_0x0050
            int r6 = r6 + 1
            java.lang.Object r7 = r1.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0041
        L_0x0050:
            if (r10 != r12) goto L_0x005c
            float r8 = r7.f2810e
            float r12 = r7.f2809d
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r8 = r8 + r12
            float r8 = r8 + r4
            goto L_0x0069
        L_0x005c:
            u3.a r12 = r0.f2787e
            r12.getClass()
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r8 + r12
            float r13 = r13 * r5
            float r12 = r12 + r4
            float r12 = r12 + r8
            r8 = r12
        L_0x0069:
            int r12 = r0.I
            float r12 = (float) r12
            float r12 = r12 + r13
            float r14 = (float) r2
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            android.graphics.drawable.Drawable r12 = r0.J
            int r14 = java.lang.Math.round(r13)
            int r15 = r0.K
            r16 = r1
            int r1 = r0.I
            float r1 = (float) r1
            float r1 = r1 + r13
            int r1 = java.lang.Math.round(r1)
            r17 = r4
            int r4 = r0.L
            r12.setBounds(r14, r15, r1, r4)
            android.graphics.drawable.Drawable r1 = r0.J
            r4 = r19
            r1.draw(r4)
            goto L_0x0099
        L_0x0093:
            r16 = r1
            r17 = r4
            r4 = r19
        L_0x0099:
            int r1 = r2 + r3
            float r1 = (float) r1
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            int r10 = r10 + 1
            r1 = r16
            r4 = r17
            goto L_0x003f
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.T) {
                return true;
            }
            if (this.U) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f2786d0 = x10;
            this.f2782b0 = x10;
            float y10 = motionEvent.getY();
            this.f2788e0 = y10;
            this.f2784c0 = y10;
            this.f2789f0 = motionEvent.getPointerId(0);
            this.U = false;
            this.G = true;
            this.F.computeScrollOffset();
            if (this.f2804u0 != 2 || Math.abs(this.F.getFinalX() - this.F.getCurrX()) <= this.f2794k0) {
                d(false);
                this.T = false;
            } else {
                this.F.abortAnimation();
                this.R = false;
                p();
                this.T = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i8 = this.f2789f0;
            if (i8 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i8);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.f2782b0;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f2788e0);
                int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i10 != 0) {
                    float f11 = this.f2782b0;
                    if (!((f11 < ((float) this.W) && i10 > 0) || (f11 > ((float) (getWidth() - this.W)) && f10 < 0.0f)) && c((int) f10, (int) x11, (int) y11, this, false)) {
                        this.f2782b0 = x11;
                        this.f2784c0 = y11;
                        this.U = true;
                        return false;
                    }
                }
                float f12 = (float) this.f2780a0;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.T = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.f2786d0;
                    float f14 = (float) this.f2780a0;
                    this.f2782b0 = i10 > 0 ? f13 + f14 : f13 - f14;
                    this.f2784c0 = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.U = true;
                }
                if (this.T && o(x11)) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.k(this);
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f2790g0 == null) {
            this.f2790g0 = VelocityTracker.obtain();
        }
        this.f2790g0.addMovement(motionEvent);
        return this.T;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r12 = (androidx.viewpager.widget.ViewPager.f) r12
            boolean r14 = r12.f2811a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f2812b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f2811a
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$e r10 = r0.h(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f2810e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f2814d
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.f2814d = r14
            float r9 = r9.f2813c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.K = r5
            int r3 = r3 - r7
            r0.L = r3
            r0.f2799p0 = r11
            boolean r1 = r0.f2797n0
            if (r1 == 0) goto L_0x0118
            int r1 = r0.B
            r2 = 0
            r0.t(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.f2797n0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i10) {
        f fVar;
        f fVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i8), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.W = Math.min(measuredWidth / 10, this.V);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!(childAt.getVisibility() == 8 || (fVar2 = (f) childAt.getLayoutParams()) == null || !fVar2.f2811a)) {
                int i14 = fVar2.f2812b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z11 = i16 == 48 || i16 == 80;
                if (!(i15 == 3 || i15 == 5)) {
                    z10 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z11) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = fVar2.width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = fVar2.height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.O = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.P = true;
        p();
        this.P = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f2811a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * fVar.f2813c), 1073741824), this.O);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int i10;
        int i11;
        int i12;
        e h3;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i11 = childCount;
            i12 = 0;
            i10 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
            i10 = -1;
        }
        while (i12 != i11) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (h3 = h(childAt)) != null && h3.f2807b == this.B && childAt.requestFocus(i8, rect)) {
                return true;
            }
            i12 += i10;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f10267a);
        u3.a aVar = this.f2787e;
        ClassLoader classLoader = kVar.f2819e;
        if (aVar != null) {
            aVar.g(kVar.f2818d, classLoader);
            u(kVar.f2817c, 0, false, true);
            return;
        }
        this.C = kVar.f2817c;
        this.D = kVar.f2818d;
        this.E = classLoader;
    }

    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f2817c = this.B;
        u3.a aVar = this.f2787e;
        if (aVar != null) {
            kVar.f2818d = aVar.h();
        }
        return kVar;
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        if (i8 != i11) {
            int i13 = this.I;
            r(i8, i11, i13, i13);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u3.a aVar;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f2787e) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f2790g0 == null) {
            this.f2790g0 = VelocityTracker.obtain();
        }
        this.f2790g0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.F.abortAnimation();
            this.R = false;
            p();
            float x10 = motionEvent.getX();
            this.f2786d0 = x10;
            this.f2782b0 = x10;
            float y10 = motionEvent.getY();
            this.f2788e0 = y10;
            this.f2784c0 = y10;
            this.f2789f0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.T) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2789f0);
                    if (findPointerIndex == -1) {
                        z10 = s();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f2782b0);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f2784c0);
                        if (abs > ((float) this.f2780a0) && abs > abs2) {
                            this.T = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f10 = this.f2786d0;
                            this.f2782b0 = x11 - f10 > 0.0f ? f10 + ((float) this.f2780a0) : f10 - ((float) this.f2780a0);
                            this.f2784c0 = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.T) {
                    z10 = false | o(motionEvent.getX(motionEvent.findPointerIndex(this.f2789f0)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f2782b0 = motionEvent.getX(actionIndex);
                    this.f2789f0 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f2782b0 = motionEvent.getX(motionEvent.findPointerIndex(this.f2789f0));
                }
            } else if (this.T) {
                t(this.B, 0, true, false);
                z10 = s();
            }
        } else if (this.T) {
            VelocityTracker velocityTracker = this.f2790g0;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f2792i0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f2789f0);
            this.R = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e i8 = i();
            float f11 = (float) clientWidth;
            float f12 = ((float) this.I) / f11;
            int i10 = i8.f2807b;
            float f13 = ((((float) scrollX) / f11) - i8.f2810e) / (i8.f2809d + f12);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f2789f0)) - this.f2786d0)) <= this.f2793j0 || Math.abs(xVelocity) <= this.f2791h0) {
                i10 += (int) (f13 + (i10 >= this.B ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i10++;
            }
            ArrayList<e> arrayList = this.f2781b;
            if (arrayList.size() > 0) {
                i10 = Math.max(arrayList.get(0).f2807b, Math.min(i10, arrayList.get(arrayList.size() - 1).f2807b));
            }
            u(i10, xVelocity, true, true);
            z10 = s();
        }
        if (z10) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
        return true;
    }

    public final void p() {
        q(this.B);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r6 == r7) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r15) {
        /*
            r14 = this;
            int r0 = r14.B
            if (r0 == r15) goto L_0x000b
            androidx.viewpager.widget.ViewPager$e r0 = r14.j(r0)
            r14.B = r15
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            u3.a r15 = r14.f2787e
            if (r15 != 0) goto L_0x0011
            return
        L_0x0011:
            boolean r15 = r14.R
            if (r15 == 0) goto L_0x0016
            return
        L_0x0016:
            android.os.IBinder r15 = r14.getWindowToken()
            if (r15 != 0) goto L_0x001d
            return
        L_0x001d:
            u3.a r15 = r14.f2787e
            r15.j(r14)
            int r15 = r14.S
            int r1 = r14.B
            int r1 = r1 - r15
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            u3.a r3 = r14.f2787e
            int r3 = r3.c()
            int r4 = r3 + -1
            int r5 = r14.B
            int r5 = r5 + r15
            int r15 = java.lang.Math.min(r4, r5)
            int r4 = r14.f2779a
            if (r3 != r4) goto L_0x030d
        L_0x003f:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r14.f2781b
            int r5 = r4.size()
            if (r2 >= r5) goto L_0x0059
            java.lang.Object r5 = r4.get(r2)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            int r6 = r5.f2807b
            int r7 = r14.B
            if (r6 < r7) goto L_0x0056
            if (r6 != r7) goto L_0x0059
            goto L_0x005a
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x003f
        L_0x0059:
            r5 = 0
        L_0x005a:
            if (r5 != 0) goto L_0x0064
            if (r3 <= 0) goto L_0x0064
            int r5 = r14.B
            androidx.viewpager.widget.ViewPager$e r5 = r14.a(r5, r2)
        L_0x0064:
            if (r5 == 0) goto L_0x0289
            int r6 = r2 + -1
            if (r6 < 0) goto L_0x0071
            java.lang.Object r7 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            int r8 = r14.getClientWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 > 0) goto L_0x007c
            r10 = 0
            goto L_0x0088
        L_0x007c:
            float r10 = r5.f2809d
            float r10 = r9 - r10
            int r11 = r14.getPaddingLeft()
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
            float r10 = r10 + r11
        L_0x0088:
            int r11 = r14.B
            int r11 = r11 + -1
            r12 = 0
        L_0x008d:
            if (r11 < 0) goto L_0x00e3
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x00b7
            if (r11 >= r1) goto L_0x00b7
            if (r7 != 0) goto L_0x0098
            goto L_0x00e3
        L_0x0098:
            int r13 = r7.f2807b
            if (r11 != r13) goto L_0x00e0
            boolean r13 = r7.f2808c
            if (r13 != 0) goto L_0x00e0
            r4.remove(r6)
            u3.a r13 = r14.f2787e
            java.lang.Object r7 = r7.f2806a
            r13.a(r11, r7)
            int r6 = r6 + -1
            int r2 = r2 + -1
            if (r6 < 0) goto L_0x00df
            java.lang.Object r7 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00e0
        L_0x00b7:
            if (r7 == 0) goto L_0x00cb
            int r13 = r7.f2807b
            if (r11 != r13) goto L_0x00cb
            float r7 = r7.f2809d
            float r12 = r12 + r7
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00df
            java.lang.Object r7 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00e0
        L_0x00cb:
            int r7 = r6 + 1
            androidx.viewpager.widget.ViewPager$e r7 = r14.a(r11, r7)
            float r7 = r7.f2809d
            float r12 = r12 + r7
            int r2 = r2 + 1
            if (r6 < 0) goto L_0x00df
            java.lang.Object r7 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00e0
        L_0x00df:
            r7 = 0
        L_0x00e0:
            int r11 = r11 + -1
            goto L_0x008d
        L_0x00e3:
            float r1 = r5.f2809d
            int r6 = r2 + 1
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0167
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x00f8
            java.lang.Object r7 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x00f9
        L_0x00f8:
            r7 = 0
        L_0x00f9:
            if (r8 > 0) goto L_0x00fd
            r8 = 0
            goto L_0x0106
        L_0x00fd:
            int r10 = r14.getPaddingRight()
            float r10 = (float) r10
            float r8 = (float) r8
            float r10 = r10 / r8
            float r8 = r10 + r9
        L_0x0106:
            int r9 = r14.B
            int r9 = r9 + 1
            r10 = r6
        L_0x010b:
            if (r9 >= r3) goto L_0x0167
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x0135
            if (r9 <= r15) goto L_0x0135
            if (r7 != 0) goto L_0x0116
            goto L_0x0167
        L_0x0116:
            int r11 = r7.f2807b
            if (r9 != r11) goto L_0x0164
            boolean r11 = r7.f2808c
            if (r11 != 0) goto L_0x0164
            r4.remove(r10)
            u3.a r11 = r14.f2787e
            java.lang.Object r7 = r7.f2806a
            r11.a(r9, r7)
            int r7 = r4.size()
            if (r10 >= r7) goto L_0x0163
            java.lang.Object r7 = r4.get(r10)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0164
        L_0x0135:
            if (r7 == 0) goto L_0x014d
            int r11 = r7.f2807b
            if (r9 != r11) goto L_0x014d
            float r7 = r7.f2809d
            float r1 = r1 + r7
            int r10 = r10 + 1
            int r7 = r4.size()
            if (r10 >= r7) goto L_0x0163
            java.lang.Object r7 = r4.get(r10)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0164
        L_0x014d:
            androidx.viewpager.widget.ViewPager$e r7 = r14.a(r9, r10)
            int r10 = r10 + 1
            float r7 = r7.f2809d
            float r1 = r1 + r7
            int r7 = r4.size()
            if (r10 >= r7) goto L_0x0163
            java.lang.Object r7 = r4.get(r10)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            goto L_0x0164
        L_0x0163:
            r7 = 0
        L_0x0164:
            int r9 = r9 + 1
            goto L_0x010b
        L_0x0167:
            u3.a r15 = r14.f2787e
            int r15 = r15.c()
            int r1 = r14.getClientWidth()
            if (r1 <= 0) goto L_0x0179
            int r3 = r14.I
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 / r1
            goto L_0x017a
        L_0x0179:
            r3 = 0
        L_0x017a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0207
            int r7 = r0.f2807b
            int r8 = r5.f2807b
            if (r7 >= r8) goto L_0x01ca
            float r8 = r0.f2810e
            float r0 = r0.f2809d
            float r8 = r8 + r0
            float r8 = r8 + r3
            int r7 = r7 + 1
            r0 = 0
        L_0x018d:
            int r9 = r5.f2807b
            if (r7 > r9) goto L_0x0207
            int r9 = r4.size()
            if (r0 >= r9) goto L_0x0207
            java.lang.Object r9 = r4.get(r0)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x019d:
            int r10 = r9.f2807b
            if (r7 <= r10) goto L_0x01b2
            int r10 = r4.size()
            int r10 = r10 + -1
            if (r0 >= r10) goto L_0x01b2
            int r0 = r0 + 1
            java.lang.Object r9 = r4.get(r0)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            goto L_0x019d
        L_0x01b2:
            int r10 = r9.f2807b
            if (r7 >= r10) goto L_0x01c1
            u3.a r10 = r14.f2787e
            r10.getClass()
            float r10 = r1 + r3
            float r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x01b2
        L_0x01c1:
            r9.f2810e = r8
            float r9 = r9.f2809d
            float r9 = r9 + r3
            float r8 = r8 + r9
            int r7 = r7 + 1
            goto L_0x018d
        L_0x01ca:
            if (r7 <= r8) goto L_0x0207
            int r8 = r4.size()
            int r8 = r8 + -1
            float r0 = r0.f2810e
        L_0x01d4:
            int r7 = r7 + -1
            int r9 = r5.f2807b
            if (r7 < r9) goto L_0x0207
            if (r8 < 0) goto L_0x0207
            java.lang.Object r9 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x01e2:
            int r10 = r9.f2807b
            if (r7 >= r10) goto L_0x01f1
            if (r8 <= 0) goto L_0x01f1
            int r8 = r8 + -1
            java.lang.Object r9 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            goto L_0x01e2
        L_0x01f1:
            int r10 = r9.f2807b
            if (r7 <= r10) goto L_0x0200
            u3.a r10 = r14.f2787e
            r10.getClass()
            float r10 = r1 + r3
            float r0 = r0 - r10
            int r7 = r7 + -1
            goto L_0x01f1
        L_0x0200:
            float r10 = r9.f2809d
            float r10 = r10 + r3
            float r0 = r0 - r10
            r9.f2810e = r0
            goto L_0x01d4
        L_0x0207:
            int r0 = r4.size()
            float r7 = r5.f2810e
            int r8 = r5.f2807b
            int r9 = r8 + -1
            if (r8 != 0) goto L_0x0215
            r10 = r7
            goto L_0x0218
        L_0x0215:
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0218:
            r14.M = r10
            int r15 = r15 + -1
            if (r8 != r15) goto L_0x0223
            float r8 = r5.f2809d
            float r8 = r8 + r7
            float r8 = r8 - r1
            goto L_0x0226
        L_0x0223:
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0226:
            r14.N = r8
            int r2 = r2 + -1
        L_0x022a:
            if (r2 < 0) goto L_0x0250
            java.lang.Object r8 = r4.get(r2)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
        L_0x0232:
            int r10 = r8.f2807b
            if (r9 <= r10) goto L_0x0241
            u3.a r10 = r14.f2787e
            int r9 = r9 + -1
            r10.getClass()
            float r10 = r1 + r3
            float r7 = r7 - r10
            goto L_0x0232
        L_0x0241:
            float r11 = r8.f2809d
            float r11 = r11 + r3
            float r7 = r7 - r11
            r8.f2810e = r7
            if (r10 != 0) goto L_0x024b
            r14.M = r7
        L_0x024b:
            int r2 = r2 + -1
            int r9 = r9 + -1
            goto L_0x022a
        L_0x0250:
            float r2 = r5.f2810e
            float r7 = r5.f2809d
            float r2 = r2 + r7
            float r2 = r2 + r3
            int r7 = r5.f2807b
        L_0x0258:
            int r7 = r7 + 1
            if (r6 >= r0) goto L_0x0282
            java.lang.Object r8 = r4.get(r6)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
        L_0x0262:
            int r9 = r8.f2807b
            if (r7 >= r9) goto L_0x0271
            u3.a r9 = r14.f2787e
            int r7 = r7 + 1
            r9.getClass()
            float r9 = r1 + r3
            float r2 = r2 + r9
            goto L_0x0262
        L_0x0271:
            if (r9 != r15) goto L_0x0279
            float r9 = r8.f2809d
            float r9 = r9 + r2
            float r9 = r9 - r1
            r14.N = r9
        L_0x0279:
            r8.f2810e = r2
            float r8 = r8.f2809d
            float r8 = r8 + r3
            float r2 = r2 + r8
            int r6 = r6 + 1
            goto L_0x0258
        L_0x0282:
            u3.a r15 = r14.f2787e
            java.lang.Object r0 = r5.f2806a
            r15.i(r0)
        L_0x0289:
            u3.a r15 = r14.f2787e
            r15.b()
            int r15 = r14.getChildCount()
            r0 = 0
        L_0x0293:
            if (r0 >= r15) goto L_0x02bf
            android.view.View r1 = r14.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r2 = (androidx.viewpager.widget.ViewPager.f) r2
            r2.getClass()
            boolean r3 = r2.f2811a
            if (r3 != 0) goto L_0x02bc
            float r3 = r2.f2813c
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x02bc
            androidx.viewpager.widget.ViewPager$e r1 = r14.h(r1)
            if (r1 == 0) goto L_0x02bc
            float r3 = r1.f2809d
            r2.f2813c = r3
            int r1 = r1.f2807b
            r2.getClass()
        L_0x02bc:
            int r0 = r0 + 1
            goto L_0x0293
        L_0x02bf:
            boolean r15 = r14.hasFocus()
            if (r15 == 0) goto L_0x030c
            android.view.View r15 = r14.findFocus()
            if (r15 == 0) goto L_0x02e1
        L_0x02cb:
            android.view.ViewParent r0 = r15.getParent()
            if (r0 == r14) goto L_0x02dc
            if (r0 == 0) goto L_0x02e1
            boolean r15 = r0 instanceof android.view.View
            if (r15 != 0) goto L_0x02d8
            goto L_0x02e1
        L_0x02d8:
            r15 = r0
            android.view.View r15 = (android.view.View) r15
            goto L_0x02cb
        L_0x02dc:
            androidx.viewpager.widget.ViewPager$e r15 = r14.h(r15)
            goto L_0x02e2
        L_0x02e1:
            r15 = 0
        L_0x02e2:
            if (r15 == 0) goto L_0x02ea
            int r15 = r15.f2807b
            int r0 = r14.B
            if (r15 == r0) goto L_0x030c
        L_0x02ea:
            r15 = 0
        L_0x02eb:
            int r0 = r14.getChildCount()
            if (r15 >= r0) goto L_0x030c
            android.view.View r0 = r14.getChildAt(r15)
            androidx.viewpager.widget.ViewPager$e r1 = r14.h(r0)
            if (r1 == 0) goto L_0x0309
            int r1 = r1.f2807b
            int r2 = r14.B
            if (r1 != r2) goto L_0x0309
            r1 = 2
            boolean r0 = r0.requestFocus(r1)
            if (r0 == 0) goto L_0x0309
            goto L_0x030c
        L_0x0309:
            int r15 = r15 + 1
            goto L_0x02eb
        L_0x030c:
            return
        L_0x030d:
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ NotFoundException -> 0x031a }
            int r0 = r14.getId()     // Catch:{ NotFoundException -> 0x031a }
            java.lang.String r15 = r15.getResourceName(r0)     // Catch:{ NotFoundException -> 0x031a }
            goto L_0x0322
        L_0x031a:
            int r15 = r14.getId()
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
        L_0x0322:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r1.<init>(r2)
            int r2 = r14.f2779a
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " Pager id: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " Pager class: "
            r1.append(r15)
            java.lang.Class r15 = r14.getClass()
            r1.append(r15)
            java.lang.String r15 = " Problematic adapter: "
            r1.append(r15)
            u3.a r15 = r14.f2787e
            java.lang.Class r15 = r15.getClass()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i8, int i10, int i11, int i12) {
        if (i10 <= 0 || this.f2781b.isEmpty()) {
            e j10 = j(this.B);
            int min = (int) ((j10 != null ? Math.min(j10.f2810e, this.N) : 0.0f) * ((float) ((i8 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                d(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.F.isFinished()) {
            this.F.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12))) * ((float) (((i8 - getPaddingLeft()) - getPaddingRight()) + i11))), getScrollY());
        }
    }

    public final void removeView(View view) {
        if (this.P) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f2789f0 = -1;
        this.T = false;
        this.U = false;
        VelocityTracker velocityTracker = this.f2790g0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2790g0 = null;
        }
        this.f2795l0.onRelease();
        this.f2796m0.onRelease();
        return this.f2795l0.isFinished() || this.f2796m0.isFinished();
    }

    public void setAdapter(u3.a aVar) {
        ArrayList<e> arrayList;
        u3.a aVar2 = this.f2787e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f2787e.j(this);
            int i8 = 0;
            while (true) {
                arrayList = this.f2781b;
                if (i8 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i8);
                this.f2787e.a(eVar.f2807b, eVar.f2806a);
                i8++;
            }
            this.f2787e.b();
            arrayList.clear();
            int i10 = 0;
            while (i10 < getChildCount()) {
                if (!((f) getChildAt(i10).getLayoutParams()).f2811a) {
                    removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
            this.B = 0;
            scrollTo(0, 0);
        }
        u3.a aVar3 = this.f2787e;
        this.f2787e = aVar;
        this.f2779a = 0;
        if (aVar != null) {
            if (this.H == null) {
                this.H = new j();
            }
            synchronized (this.f2787e) {
            }
            this.R = false;
            boolean z10 = this.f2797n0;
            this.f2797n0 = true;
            this.f2779a = this.f2787e.c();
            if (this.C >= 0) {
                this.f2787e.g(this.D, this.E);
                u(this.C, 0, false, true);
                this.C = -1;
                this.D = null;
                this.E = null;
            } else if (!z10) {
                p();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f2802s0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.f2802s0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((h) this.f2802s0.get(i11)).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i8) {
        this.R = false;
        u(i8, 0, !this.f2797n0, false);
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i8 + " too small; defaulting to 1");
            i8 = 1;
        }
        if (i8 != this.S) {
            this.S = i8;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f2801r0 = iVar;
    }

    public void setPageMargin(int i8) {
        int i10 = this.I;
        this.I = i8;
        int width = getWidth();
        r(width, width, i8, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.J = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i8) {
        if (this.f2804u0 != i8) {
            this.f2804u0 = i8;
            i iVar = this.f2801r0;
            if (iVar != null) {
                iVar.b(i8);
            }
            ArrayList arrayList = this.f2800q0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar2 = (i) this.f2800q0.get(i10);
                    if (iVar2 != null) {
                        iVar2.b(i8);
                    }
                }
            }
        }
    }

    public final void t(int i8, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        e j10 = j(i8);
        int max = j10 != null ? (int) (Math.max(this.M, Math.min(j10.f2810e, this.N)) * ((float) getClientWidth())) : 0;
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.F;
                if (scroller != null && !scroller.isFinished()) {
                    i11 = this.G ? this.F.getCurrX() : this.F.getStartX();
                    this.F.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i11 = getScrollX();
                }
                int i13 = i11;
                int scrollY = getScrollY();
                int i14 = max - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    d(false);
                    p();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f10 = (float) clientWidth;
                    float f11 = (float) i16;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i14)) * 1.0f) / f10) - 0.5f) * 0.47123894f))) * f11) + f11;
                    int abs = Math.abs(i10);
                    if (abs > 0) {
                        i12 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.f2787e.getClass();
                        i12 = (int) (((((float) Math.abs(i14)) / ((f10 * 1.0f) + ((float) this.I))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i12, 600);
                    this.G = false;
                    this.F.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.k(this);
                }
            }
            if (z11) {
                f(i8);
                return;
            }
            return;
        }
        if (z11) {
            f(i8);
        }
        d(false);
        scrollTo(max, 0);
        n(max);
    }

    public final void u(int i8, int i10, boolean z10, boolean z11) {
        u3.a aVar = this.f2787e;
        boolean z12 = false;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f2781b;
        if (z11 || this.B != i8 || arrayList.size() == 0) {
            if (i8 < 0) {
                i8 = 0;
            } else if (i8 >= this.f2787e.c()) {
                i8 = this.f2787e.c() - 1;
            }
            int i11 = this.S;
            int i12 = this.B;
            if (i8 > i12 + i11 || i8 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    arrayList.get(i13).f2808c = true;
                }
            }
            if (this.B != i8) {
                z12 = true;
            }
            if (this.f2797n0) {
                this.B = i8;
                if (z12) {
                    f(i8);
                }
                requestLayout();
                return;
            }
            q(i8);
            t(i8, i10, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2811a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2812b;

        /* renamed from: c  reason: collision with root package name */
        public float f2813c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2814d;

        public f() {
            super(-1, -1);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2776v0);
            this.f2812b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i8) {
        Context context = getContext();
        Object obj = t1.a.f15323a;
        setPageMarginDrawable(a.c.b(context, i8));
    }
}
