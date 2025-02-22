package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.f1;
import d2.i0;
import d2.j1;
import d2.n;
import d2.w;
import d2.x;
import d2.y;
import d2.z;
import j0.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import t1.a;
import w1.a;

public class CoordinatorLayout extends ViewGroup implements w, x {
    public static final String P;
    public static final Class<?>[] Q = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> R = new ThreadLocal<>();
    public static final i S = new i();
    public static final c2.f T = new c2.f(12);
    public final int[] B = new int[2];
    public boolean C;
    public boolean D;
    public final int[] E;
    public View F;
    public View G;
    public g H;
    public boolean I;
    public j1 J;
    public boolean K;
    public Drawable L;
    public ViewGroup.OnHierarchyChangeListener M;
    public a N;
    public final y O = new y();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1709a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final q1.a f1710b = new q1.a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1711c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1712d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1713e = new int[2];

    public class a implements z {
        public a() {
        }

        public final j1 a(View view, j1 j1Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!c2.b.a(coordinatorLayout.J, j1Var)) {
                coordinatorLayout.J = j1Var;
                boolean z10 = true;
                boolean z11 = j1Var.d() > 0;
                coordinatorLayout.K = z11;
                if (z11 || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                j1.k kVar = j1Var.f7237a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = coordinatorLayout.getChildAt(i8);
                        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                        if (i0.d.b(childAt) && ((f) childAt.getLayoutParams()).f1716a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return j1Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v3, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i8, int i10, int[] iArr, int i11) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v3, Rect rect, boolean z10) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i8, int i10) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v3, View view, int i8) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.M;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.M;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            float m = i0.i.m((View) obj);
            float m10 = i0.i.m((View) obj2);
            if (m > m10) {
                return -1;
            }
            return m < m10 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            P = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            S = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            Q = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            R = r0
            c2.f r0 = new c2.f
            r1 = 12
            r0.<init>(r1)
            T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = f1.f7213b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.E = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i8 = 0; i8 < length; i8++) {
                int[] iArr2 = this.E;
                iArr2[i8] = (int) (((float) iArr2[i8]) * f10);
            }
        }
        this.L = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.c(this) == 0) {
            i0.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) T.b();
        return rect == null ? new Rect() : rect;
    }

    public static void f(int i8, Rect rect, Rect rect2, f fVar, int i10, int i11) {
        int i12 = fVar.f1718c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i8);
        int i13 = fVar.f1719d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i8);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int width = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            width -= i10 / 2;
        } else if (i14 != 5) {
            width -= i10;
        }
        if (i15 == 16) {
            height -= i11 / 2;
        } else if (i15 != 80) {
            height -= i11;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static f h(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1717b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f1717b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f1717b = true;
            }
        }
        return fVar;
    }

    public static void v(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f1724i;
        if (i10 != i8) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            view.offsetLeftAndRight(i8 - i10);
            fVar.f1724i = i8;
        }
    }

    public static void w(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f1725j;
        if (i10 != i8) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            view.offsetTopAndBottom(i8 - i10);
            fVar.f1725j = i8;
        }
    }

    public final void b(f fVar, Rect rect, int i8, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i8) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - fVar.bottomMargin));
        rect.set(max, max2, i8 + max, i10 + max2);
    }

    public final void c(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final ArrayList d(View view) {
        o.f fVar = (o.f) this.f1710b.f12825b;
        int i8 = fVar.f12032c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i8; i10++) {
            ArrayList arrayList2 = (ArrayList) fVar.m(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar.i(i10));
            }
        }
        ArrayList arrayList3 = this.f1712d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f1716a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = q1.b.f12828a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = q1.b.f12828a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        q1.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = q1.b.f12829b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int g(int i8) {
        int[] iArr = this.E;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i8);
            return 0;
        } else if (i8 >= 0 && i8 < iArr.length) {
            return iArr[i8];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i8 + " out of range for " + this);
            return 0;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f1709a);
    }

    public final j1 getLastWindowInsets() {
        return this.J;
    }

    public int getNestedScrollAxes() {
        y yVar = this.O;
        return yVar.f7286b | yVar.f7285a;
    }

    public Drawable getStatusBarBackground() {
        return this.L;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean i(View view, int i8, int i10) {
        c2.f fVar = T;
        Rect a10 = a();
        e(view, a10);
        try {
            return a10.contains(i8, i10);
        } finally {
            a10.setEmpty();
            fVar.a(a10);
        }
    }

    public final void j(View view, int i8, int i10, int i11, int i12, int i13, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                int i17 = i13;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i13) && (cVar = fVar.f1716a) != null) {
                    int[] iArr2 = this.f1713e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i10, i11, i12, iArr2);
                    i14 = i11 > 0 ? Math.max(i14, iArr2[0]) : Math.min(i14, iArr2[0]);
                    i15 = i12 > 0 ? Math.max(i15, iArr2[1]) : Math.min(i15, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            p(1);
        }
    }

    public final void k(View view, int i8, int i10, int i11, int i12, int i13) {
        j(view, i8, i10, i11, i12, 0, this.B);
    }

    public final boolean l(View view, View view2, int i8, int i10) {
        int i11 = i10;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1716a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i8, i10);
                    z10 |= p10;
                    if (i11 == 0) {
                        fVar.f1728n = p10;
                    } else if (i11 == 1) {
                        fVar.f1729o = p10;
                    }
                } else if (i11 == 0) {
                    fVar.f1728n = false;
                } else if (i11 == 1) {
                    fVar.f1729o = false;
                }
            }
        }
        return z10;
    }

    public final void m(View view, View view2, int i8, int i10) {
        y yVar = this.O;
        if (i10 == 1) {
            yVar.f7286b = i8;
        } else {
            yVar.f7285a = i8;
        }
        this.G = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).getClass();
        }
    }

    public final void n(View view, int i8) {
        y yVar = this.O;
        if (i8 == 1) {
            yVar.f7286b = 0;
        } else {
            yVar.f7285a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i8)) {
                c cVar = fVar.f1716a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i8);
                }
                if (i8 == 0) {
                    fVar.f1728n = false;
                } else if (i8 == 1) {
                    fVar.f1729o = false;
                }
                fVar.f1730p = false;
            }
        }
        this.G = null;
    }

    public final void o(View view, int i8, int i10, int[] iArr, int i11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                int i15 = i11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i11) && (cVar = fVar.f1716a) != null) {
                    int[] iArr2 = this.f1713e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i8, i10, iArr2, i11);
                    int[] iArr3 = this.f1713e;
                    i12 = i8 > 0 ? Math.max(i12, iArr3[0]) : Math.min(i12, iArr3[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr3[1]) : Math.min(i13, iArr3[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z10) {
            p(1);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.I) {
            if (this.H == null) {
                this.H = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.H);
        }
        if (this.J == null) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.d.b(this)) {
                i0.h.c(this);
            }
        }
        this.D = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.I && this.H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.H);
        }
        View view = this.G;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.D = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.K && this.L != null) {
            j1 j1Var = this.J;
            int d10 = j1Var != null ? j1Var.d() : 0;
            if (d10 > 0) {
                this.L.setBounds(0, 0, getWidth(), d10);
                this.L.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s10 = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s10;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        c cVar;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int d10 = i0.e.d(this);
        ArrayList arrayList = this.f1709a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1716a) == null || !cVar.h(this, view, d10))) {
                q(view, d10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r32.t()
            int r0 = r32.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r6.getChildAt(r1)
            q1.a r4 = r6.f1710b
            java.lang.Object r4 = r4.f12825b
            o.f r4 = (o.f) r4
            int r5 = r4.f12032c
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0030
            java.lang.Object r9 = r4.m(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0030:
            r3 = r7
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r7
        L_0x0039:
            boolean r1 = r6.I
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6.D
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.H
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r6.H = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.H
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r6.I = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r6.D
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.H
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.H
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r6.I = r7
        L_0x006d:
            int r8 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r9 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            int r10 = d2.i0.e.d(r32)
            if (r10 != r2) goto L_0x0087
            r11 = r2
            goto L_0x0088
        L_0x0087:
            r11 = r7
        L_0x0088:
            int r12 = android.view.View.MeasureSpec.getMode(r33)
            int r13 = android.view.View.MeasureSpec.getSize(r33)
            int r14 = android.view.View.MeasureSpec.getMode(r34)
            int r15 = android.view.View.MeasureSpec.getSize(r34)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            d2.j1 r3 = r6.J
            if (r3 == 0) goto L_0x00b1
            boolean r3 = d2.i0.d.b(r32)
            if (r3 == 0) goto L_0x00b1
            r18 = r2
            goto L_0x00b3
        L_0x00b1:
            r18 = r7
        L_0x00b3:
            java.util.ArrayList r5 = r6.f1709a
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r7
            r1 = r0
        L_0x00bd:
            if (r1 >= r4) goto L_0x01f6
            java.lang.Object r19 = r5.get(r1)
            android.view.View r19 = (android.view.View) r19
            int r7 = r19.getVisibility()
            r21 = r0
            r0 = 8
            if (r7 != r0) goto L_0x00e1
            r28 = r4
            r29 = r5
            r22 = r8
            r23 = r9
            r27 = r10
            r0 = r21
            r24 = 0
            r21 = r1
            goto L_0x01e6
        L_0x00e1:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r0 = r7.f1720e
            if (r0 < 0) goto L_0x012d
            if (r12 == 0) goto L_0x012d
            int r0 = r6.g(r0)
            r22 = r1
            int r1 = r7.f1718c
            if (r1 != 0) goto L_0x00fb
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00fb:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto L_0x0108
            if (r11 == 0) goto L_0x010d
        L_0x0108:
            r2 = 5
            if (r1 != r2) goto L_0x0119
            if (r11 == 0) goto L_0x0119
        L_0x010d:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0134
        L_0x0119:
            if (r1 != r2) goto L_0x011d
            if (r11 == 0) goto L_0x0122
        L_0x011d:
            r2 = 3
            if (r1 != r2) goto L_0x012b
            if (r11 == 0) goto L_0x012b
        L_0x0122:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0134
        L_0x012b:
            r2 = 0
            goto L_0x0132
        L_0x012d:
            r22 = r1
            r23 = r2
            goto L_0x012b
        L_0x0132:
            r20 = r2
        L_0x0134:
            if (r18 == 0) goto L_0x0167
            boolean r0 = d2.i0.d.b(r19)
            if (r0 != 0) goto L_0x0167
            d2.j1 r0 = r6.J
            int r0 = r0.b()
            d2.j1 r1 = r6.J
            int r1 = r1.c()
            int r1 = r1 + r0
            d2.j1 r0 = r6.J
            int r0 = r0.d()
            d2.j1 r2 = r6.J
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r25 = r0
            r26 = r1
            goto L_0x016b
        L_0x0167:
            r25 = r33
            r26 = r34
        L_0x016b:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f1716a
            if (r0 == 0) goto L_0x0196
            r2 = r21
            r21 = r22
            r1 = r32
            r22 = r8
            r24 = 0
            r8 = r2
            r30 = r23
            r23 = r9
            r9 = r30
            r2 = r19
            r27 = r10
            r10 = r3
            r3 = r25
            r28 = r4
            r4 = r20
            r29 = r5
            r5 = r26
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01bb
            goto L_0x01ad
        L_0x0196:
            r28 = r4
            r29 = r5
            r27 = r10
            r24 = 0
            r10 = r3
            r30 = r22
            r22 = r8
            r8 = r21
            r21 = r30
            r31 = r23
            r23 = r9
            r9 = r31
        L_0x01ad:
            r5 = 0
            r0 = r32
            r1 = r19
            r2 = r25
            r3 = r20
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01bb:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r3 = r0
            r0 = r2
            r2 = r1
        L_0x01e6:
            int r1 = r21 + 1
            r8 = r22
            r9 = r23
            r7 = r24
            r10 = r27
            r4 = r28
            r5 = r29
            goto L_0x00bd
        L_0x01f6:
            r8 = r0
            r9 = r2
            r10 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1716a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1716a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    public final void onNestedPreScroll(View view, int i8, int i10, int[] iArr) {
        o(view, i8, i10, iArr, 0);
    }

    public final void onNestedScroll(View view, int i8, int i10, int i11, int i12) {
        k(view, i8, i10, i11, i12, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f10267a);
        SparseArray<Parcelable> sparseArray = hVar.f1733c;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id2 = childAt.getId();
            c cVar = h(childAt).f1716a;
            if (!(id2 == -1 || cVar == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1716a;
            if (!(id2 == -1 || cVar == null || (o10 = cVar.o(childAt)) == null)) {
                sparseArray.append(id2, o10);
            }
        }
        hVar.f1733c = sparseArray;
        return hVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.F
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.F
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1716a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.F
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.F
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.u(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x029c A[EDGE_INSN: B:135:0x029c->B:101:0x029c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap<android.view.View, d2.d1> r2 = d2.i0.f7217a
            int r2 = d2.i0.e.d(r25)
            java.util.ArrayList r9 = r0.f1709a
            int r10 = r9.size()
            android.graphics.Rect r11 = a()
            android.graphics.Rect r12 = a()
            android.graphics.Rect r13 = a()
            r3 = r1
            r15 = 0
        L_0x001e:
            c2.f r8 = T
            if (r15 >= r10) goto L_0x02f6
            java.lang.Object r4 = r9.get(r15)
            r7 = r4
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r6 = r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            if (r3 != 0) goto L_0x0042
            int r4 = r7.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0042
            r7 = r9
            r6 = r10
            r5 = r13
            r21 = r15
            r14 = 0
            goto L_0x02ef
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 >= r15) goto L_0x0109
            java.lang.Object r3 = r9.get(r5)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r6.f1727l
            if (r4 != r3) goto L_0x00eb
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            r4 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.view.View r3 = r4.f1726k
            if (r3 == 0) goto L_0x00eb
            android.graphics.Rect r3 = a()
            android.graphics.Rect r14 = a()
            r17 = r9
            android.graphics.Rect r9 = a()
            r18 = r5
            android.view.View r5 = r4.f1726k
            r0.e(r5, r3)
            r5 = 0
            r0.c(r7, r14, r5)
            int r5 = r7.getMeasuredWidth()
            r19 = r10
            int r10 = r7.getMeasuredHeight()
            r20 = r3
            r3 = r2
            r16 = r4
            r21 = r15
            r15 = 1
            r4 = r20
            r22 = r5
            r5 = r9
            r23 = r6
            r6 = r16
            r15 = r7
            r7 = r22
            r24 = r13
            r13 = r8
            r8 = r10
            f(r3, r4, r5, r6, r7, r8)
            int r3 = r9.left
            int r4 = r14.left
            if (r3 != r4) goto L_0x00ab
            int r3 = r9.top
            int r4 = r14.top
            if (r3 == r4) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r3 = r16
            r5 = r22
            r4 = 0
            goto L_0x00b0
        L_0x00ab:
            r3 = r16
            r5 = r22
            r4 = 1
        L_0x00b0:
            r0.b(r3, r9, r5, r10)
            int r5 = r9.left
            int r6 = r14.left
            int r5 = r5 - r6
            int r6 = r9.top
            int r7 = r14.top
            int r6 = r6 - r7
            if (r5 == 0) goto L_0x00c4
            java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
            r15.offsetLeftAndRight(r5)
        L_0x00c4:
            if (r6 == 0) goto L_0x00cb
            java.util.WeakHashMap<android.view.View, d2.d1> r5 = d2.i0.f7217a
            r15.offsetTopAndBottom(r6)
        L_0x00cb:
            if (r4 == 0) goto L_0x00d6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f1716a
            if (r4 == 0) goto L_0x00d6
            android.view.View r3 = r3.f1726k
            r4.d(r0, r15, r3)
        L_0x00d6:
            r20.setEmpty()
            r3 = r20
            r13.a(r3)
            r14.setEmpty()
            r13.a(r14)
            r9.setEmpty()
            r13.a(r9)
            goto L_0x00f9
        L_0x00eb:
            r18 = r5
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r15 = r7
            r13 = r8
        L_0x00f9:
            int r5 = r18 + 1
            r8 = r13
            r7 = r15
            r9 = r17
            r10 = r19
            r15 = r21
            r6 = r23
            r13 = r24
            goto L_0x0043
        L_0x0109:
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r3 = 1
            r15 = r7
            r13 = r8
            r0.c(r15, r12, r3)
            r4 = r23
            int r3 = r4.f1722g
            r5 = 48
            r6 = 80
            r7 = 3
            r8 = 5
            if (r3 == 0) goto L_0x0173
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0173
            int r3 = r4.f1722g
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r2)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r5) goto L_0x0148
            if (r9 == r6) goto L_0x0138
            goto L_0x0152
        L_0x0138:
            int r9 = r11.bottom
            int r10 = r25.getHeight()
            int r14 = r12.top
            int r10 = r10 - r14
            int r9 = java.lang.Math.max(r9, r10)
            r11.bottom = r9
            goto L_0x0152
        L_0x0148:
            int r9 = r11.top
            int r10 = r12.bottom
            int r9 = java.lang.Math.max(r9, r10)
            r11.top = r9
        L_0x0152:
            r3 = r3 & 7
            if (r3 == r7) goto L_0x0169
            if (r3 == r8) goto L_0x0159
            goto L_0x0173
        L_0x0159:
            int r3 = r11.right
            int r9 = r25.getWidth()
            int r10 = r12.left
            int r9 = r9 - r10
            int r3 = java.lang.Math.max(r3, r9)
            r11.right = r3
            goto L_0x0173
        L_0x0169:
            int r3 = r11.left
            int r9 = r12.right
            int r3 = java.lang.Math.max(r3, r9)
            r11.left = r3
        L_0x0173:
            int r3 = r4.f1723h
            if (r3 == 0) goto L_0x0282
            int r3 = r15.getVisibility()
            if (r3 != 0) goto L_0x0282
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            boolean r3 = d2.i0.g.c(r15)
            if (r3 != 0) goto L_0x0187
            goto L_0x0282
        L_0x0187:
            int r3 = r15.getWidth()
            if (r3 <= 0) goto L_0x0282
            int r3 = r15.getHeight()
            if (r3 > 0) goto L_0x0195
            goto L_0x0282
        L_0x0195:
            android.view.ViewGroup$LayoutParams r3 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f1716a
            android.graphics.Rect r9 = a()
            android.graphics.Rect r10 = a()
            int r14 = r15.getLeft()
            int r8 = r15.getTop()
            int r7 = r15.getRight()
            int r6 = r15.getBottom()
            r10.set(r14, r8, r7, r6)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r4.a(r15)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r10.contains(r9)
            if (r4 == 0) goto L_0x01c7
            goto L_0x01ee
        L_0x01c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r10.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01eb:
            r9.set(r10)
        L_0x01ee:
            r10.setEmpty()
            r13.a(r10)
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0202
            r9.setEmpty()
            r13.a(r9)
            goto L_0x0282
        L_0x0202:
            int r4 = r3.f1723h
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r2)
            r6 = r4 & 48
            if (r6 != r5) goto L_0x021e
            int r5 = r9.top
            int r6 = r3.topMargin
            int r5 = r5 - r6
            int r6 = r3.f1725j
            int r5 = r5 - r6
            int r6 = r11.top
            if (r5 >= r6) goto L_0x021e
            int r6 = r6 - r5
            w(r15, r6)
            r5 = 1
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            r6 = r4 & 80
            r7 = 80
            if (r6 != r7) goto L_0x023b
            int r6 = r25.getHeight()
            int r7 = r9.bottom
            int r6 = r6 - r7
            int r7 = r3.bottomMargin
            int r6 = r6 - r7
            int r7 = r3.f1725j
            int r6 = r6 + r7
            int r7 = r11.bottom
            if (r6 >= r7) goto L_0x023b
            int r6 = r6 - r7
            w(r15, r6)
            r5 = 1
        L_0x023b:
            if (r5 != 0) goto L_0x0241
            r5 = 0
            w(r15, r5)
        L_0x0241:
            r5 = r4 & 3
            r6 = 3
            if (r5 != r6) goto L_0x0258
            int r5 = r9.left
            int r6 = r3.leftMargin
            int r5 = r5 - r6
            int r6 = r3.f1724i
            int r5 = r5 - r6
            int r6 = r11.left
            if (r5 >= r6) goto L_0x0258
            int r6 = r6 - r5
            v(r15, r6)
            r5 = 1
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r4 = r4 & 5
            r6 = 5
            if (r4 != r6) goto L_0x0275
            int r4 = r25.getWidth()
            int r6 = r9.right
            int r4 = r4 - r6
            int r6 = r3.rightMargin
            int r4 = r4 - r6
            int r3 = r3.f1724i
            int r4 = r4 + r3
            int r3 = r11.right
            if (r4 >= r3) goto L_0x0275
            int r4 = r4 - r3
            v(r15, r4)
            r4 = 1
            goto L_0x0276
        L_0x0275:
            r4 = r5
        L_0x0276:
            if (r4 != 0) goto L_0x027c
            r3 = 0
            v(r15, r3)
        L_0x027c:
            r9.setEmpty()
            r13.a(r9)
        L_0x0282:
            r3 = 2
            if (r1 == r3) goto L_0x02aa
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f1731q
            r5 = r24
            r5.set(r4)
            boolean r4 = r5.equals(r12)
            if (r4 == 0) goto L_0x029e
            r7 = r17
            r6 = r19
        L_0x029c:
            r14 = 0
            goto L_0x02ee
        L_0x029e:
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f1731q
            r4.set(r12)
            goto L_0x02ac
        L_0x02aa:
            r5 = r24
        L_0x02ac:
            int r4 = r21 + 1
            r6 = r19
        L_0x02b0:
            r7 = r17
            if (r4 >= r6) goto L_0x029c
            java.lang.Object r8 = r7.get(r4)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r9.f1716a
            if (r10 == 0) goto L_0x02e7
            boolean r13 = r10.b(r8, r15)
            if (r13 == 0) goto L_0x02e7
            if (r1 != 0) goto L_0x02d5
            boolean r13 = r9.f1730p
            if (r13 == 0) goto L_0x02d5
            r14 = 0
            r9.f1730p = r14
            r10 = 1
            goto L_0x02e9
        L_0x02d5:
            r14 = 0
            if (r1 == r3) goto L_0x02dd
            boolean r8 = r10.d(r0, r8, r15)
            goto L_0x02e1
        L_0x02dd:
            r10.e(r0, r15)
            r8 = 1
        L_0x02e1:
            r10 = 1
            if (r1 != r10) goto L_0x02e9
            r9.f1730p = r8
            goto L_0x02e9
        L_0x02e7:
            r10 = 1
            r14 = 0
        L_0x02e9:
            int r4 = r4 + 1
            r17 = r7
            goto L_0x02b0
        L_0x02ee:
            r3 = r1
        L_0x02ef:
            int r15 = r21 + 1
            r13 = r5
            r10 = r6
            r9 = r7
            goto L_0x001e
        L_0x02f6:
            r5 = r13
            r13 = r8
            r11.setEmpty()
            r13.a(r11)
            r12.setEmpty()
            r13.a(r12)
            r5.setEmpty()
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1726k;
        int i10 = 0;
        if (!(view2 == null && fVar.f1721f != -1)) {
            c2.f fVar2 = T;
            if (view2 != null) {
                Rect a10 = a();
                Rect a11 = a();
                try {
                    e(view2, a10);
                    f fVar3 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    f(i8, a10, a11, fVar3, measuredWidth, measuredHeight);
                    b(fVar3, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                } finally {
                    a10.setEmpty();
                    fVar2.a(a10);
                    a11.setEmpty();
                    fVar2.a(a11);
                }
            } else {
                int i11 = fVar.f1720e;
                if (i11 >= 0) {
                    f fVar4 = (f) view.getLayoutParams();
                    int i12 = fVar4.f1718c;
                    if (i12 == 0) {
                        i12 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i12, i8);
                    int i13 = absoluteGravity & 7;
                    int i14 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i8 == 1) {
                        i11 = width - i11;
                    }
                    int g10 = g(i11) - measuredWidth2;
                    if (i13 == 1) {
                        g10 += measuredWidth2 / 2;
                    } else if (i13 == 5) {
                        g10 += measuredWidth2;
                    }
                    if (i14 == 16) {
                        i10 = 0 + (measuredHeight2 / 2);
                    } else if (i14 == 80) {
                        i10 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + fVar4.leftMargin, Math.min(g10, ((width - getPaddingRight()) - measuredWidth2) - fVar4.rightMargin));
                    int max2 = Math.max(getPaddingTop() + fVar4.topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - fVar4.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                f fVar5 = (f) view.getLayoutParams();
                Rect a12 = a();
                a12.set(getPaddingLeft() + fVar5.leftMargin, getPaddingTop() + fVar5.topMargin, (getWidth() - getPaddingRight()) - fVar5.rightMargin, (getHeight() - getPaddingBottom()) - fVar5.bottomMargin);
                if (this.J != null) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (i0.d.b(this) && !i0.d.b(view)) {
                        a12.left = this.J.b() + a12.left;
                        a12.top = this.J.d() + a12.top;
                        a12.right -= this.J.c();
                        a12.bottom -= this.J.a();
                    }
                }
                Rect a13 = a();
                int i15 = fVar5.f1718c;
                if ((i15 & 7) == 0) {
                    i15 |= 8388611;
                }
                if ((i15 & 112) == 0) {
                    i15 |= 48;
                }
                n.b(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), a12, a13, i8);
                view.layout(a13.left, a13.top, a13.right, a13.bottom);
                a12.setEmpty();
                fVar2.a(a12);
                a13.setEmpty();
                fVar2.a(a13);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final void r(View view, int i8, int i10, int i11) {
        measureChildWithMargins(view, i8, i10, i11, 0);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1716a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.C) {
            u(false);
            this.C = true;
        }
    }

    public final boolean s(MotionEvent motionEvent, int i8) {
        boolean z10;
        MotionEvent motionEvent2 = motionEvent;
        int i10 = i8;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1711c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        i iVar = S;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1716a;
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i10 == 0) {
                        z11 = cVar.g(this, view, motionEvent2);
                    } else if (i10 == 1) {
                        z11 = cVar.r(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.F = view;
                    }
                }
                if (fVar.f1716a == null) {
                    fVar.m = false;
                }
                boolean z13 = fVar.m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.m = z10;
                }
                z12 = z10 && !z13;
                if (z10 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i10 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        x();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.M = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.L;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.L = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.L.setState(getDrawableState());
                }
                Drawable drawable4 = this.L;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                a.c.b(drawable4, i0.e.d(this));
                this.L.setVisible(getVisibility() == 0, false);
                this.L.setCallback(this);
            }
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i8) {
        setStatusBarBackground(new ColorDrawable(i8));
    }

    public void setStatusBarBackgroundResource(int i8) {
        Drawable drawable;
        if (i8 != 0) {
            Context context = getContext();
            Object obj = t1.a.f15323a;
            drawable = a.c.b(context, i8);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z10 = i8 == 0;
        Drawable drawable = this.L;
        if (drawable != null && drawable.isVisible() != z10) {
            this.L.setVisible(z10, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r12 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0162 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = r0.f1709a
            r1.clear()
            q1.a r2 = r0.f1710b
            java.lang.Object r3 = r2.f12825b
            o.f r3 = (o.f) r3
            int r4 = r3.f12032c
            r6 = 0
        L_0x0010:
            java.lang.Object r7 = r2.f12824a
            if (r6 >= r4) goto L_0x0027
            java.lang.Object r8 = r3.m(r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x0024
            r8.clear()
            c2.d r7 = (c2.d) r7
            r7.a(r8)
        L_0x0024:
            int r6 = r6 + 1
            goto L_0x0010
        L_0x0027:
            r3.clear()
            int r3 = r16.getChildCount()
            r4 = 0
        L_0x002f:
            java.lang.Object r6 = r2.f12825b
            if (r4 >= r3) goto L_0x018e
            android.view.View r8 = r0.getChildAt(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = h(r8)
            r10 = 0
            r11 = 1
            r12 = -1
            int r13 = r9.f1721f
            if (r13 != r12) goto L_0x0048
            r9.f1727l = r10
            r9.f1726k = r10
            goto L_0x00ca
        L_0x0048:
            android.view.View r12 = r9.f1726k
            if (r12 == 0) goto L_0x0077
            int r12 = r12.getId()
            if (r12 == r13) goto L_0x0053
            goto L_0x0070
        L_0x0053:
            android.view.View r12 = r9.f1726k
            android.view.ViewParent r14 = r12.getParent()
        L_0x0059:
            if (r14 == r0) goto L_0x0072
            if (r14 == 0) goto L_0x006c
            if (r14 != r8) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto L_0x0067
            r12 = r14
            android.view.View r12 = (android.view.View) r12
        L_0x0067:
            android.view.ViewParent r14 = r14.getParent()
            goto L_0x0059
        L_0x006c:
            r9.f1727l = r10
            r9.f1726k = r10
        L_0x0070:
            r12 = 0
            goto L_0x0075
        L_0x0072:
            r9.f1727l = r12
            r12 = r11
        L_0x0075:
            if (r12 != 0) goto L_0x00ca
        L_0x0077:
            android.view.View r12 = r0.findViewById(r13)
            r9.f1726k = r12
            if (r12 == 0) goto L_0x00c0
            if (r12 != r0) goto L_0x0094
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x008c
            r9.f1727l = r10
            r9.f1726k = r10
            goto L_0x00ca
        L_0x008c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "View can not be anchored to the the parent CoordinatorLayout"
            r1.<init>(r2)
            throw r1
        L_0x0094:
            android.view.ViewParent r13 = r12.getParent()
        L_0x0098:
            if (r13 == r0) goto L_0x00bd
            if (r13 == 0) goto L_0x00bd
            if (r13 != r8) goto L_0x00b1
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x00a9
            r9.f1727l = r10
            r9.f1726k = r10
            goto L_0x00ca
        L_0x00a9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Anchor must not be a descendant of the anchored view"
            r1.<init>(r2)
            throw r1
        L_0x00b1:
            boolean r14 = r13 instanceof android.view.View
            if (r14 == 0) goto L_0x00b8
            r12 = r13
            android.view.View r12 = (android.view.View) r12
        L_0x00b8:
            android.view.ViewParent r13 = r13.getParent()
            goto L_0x0098
        L_0x00bd:
            r9.f1727l = r12
            goto L_0x00ca
        L_0x00c0:
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x016a
            r9.f1727l = r10
            r9.f1726k = r10
        L_0x00ca:
            r12 = r6
            o.f r12 = (o.f) r12
            boolean r13 = r12.containsKey(r8)
            if (r13 != 0) goto L_0x00d6
            r12.put(r8, r10)
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            if (r12 >= r3) goto L_0x0166
            if (r12 != r4) goto L_0x00dd
            goto L_0x0162
        L_0x00dd:
            android.view.View r13 = r0.getChildAt(r12)
            android.view.View r14 = r9.f1727l
            if (r13 == r14) goto L_0x0114
            java.util.WeakHashMap<android.view.View, d2.d1> r14 = d2.i0.f7217a
            int r14 = d2.i0.e.d(r16)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r15 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r15
            int r15 = r15.f1722g
            int r15 = android.view.Gravity.getAbsoluteGravity(r15, r14)
            if (r15 == 0) goto L_0x0104
            int r5 = r9.f1723h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r14)
            r5 = r5 & r15
            if (r5 != r15) goto L_0x0104
            r5 = r11
            goto L_0x0105
        L_0x0104:
            r5 = 0
        L_0x0105:
            if (r5 != 0) goto L_0x0114
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r9.f1716a
            if (r5 == 0) goto L_0x0112
            boolean r5 = r5.b(r8, r13)
            if (r5 == 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r5 = 0
            goto L_0x0115
        L_0x0114:
            r5 = r11
        L_0x0115:
            if (r5 == 0) goto L_0x0162
            r5 = r6
            o.f r5 = (o.f) r5
            boolean r5 = r5.containsKey(r13)
            if (r5 != 0) goto L_0x012c
            r5 = r6
            o.f r5 = (o.f) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 != 0) goto L_0x012c
            r5.put(r13, r10)
        L_0x012c:
            r5 = r6
            o.f r5 = (o.f) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 == 0) goto L_0x015a
            boolean r14 = r5.containsKey(r8)
            if (r14 == 0) goto L_0x015a
            java.lang.Object r14 = r5.getOrDefault(r13, r10)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x0156
            r14 = r7
            c2.d r14 = (c2.d) r14
            java.lang.Object r14 = r14.b()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x0153
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0153:
            r5.put(r13, r14)
        L_0x0156:
            r14.add(r8)
            goto L_0x0162
        L_0x015a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "All nodes must be present in the graph before being added as an edge"
            r1.<init>(r2)
            throw r1
        L_0x0162:
            int r12 = r12 + 1
            goto L_0x00d7
        L_0x0166:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x016a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find CoordinatorLayout descendant view with id "
            r2.<init>(r3)
            android.content.res.Resources r3 = r16.getResources()
            java.lang.String r3 = r3.getResourceName(r13)
            r2.append(r3)
            java.lang.String r3 = " to anchor view "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x018e:
            java.lang.Object r3 = r2.f12826c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r4 = r2.f12827d
            java.util.HashSet r4 = (java.util.HashSet) r4
            r4.clear()
            o.f r6 = (o.f) r6
            int r5 = r6.f12032c
            r7 = 0
        L_0x01a1:
            if (r7 >= r5) goto L_0x01ad
            java.lang.Object r8 = r6.i(r7)
            r2.a(r8, r3, r4)
            int r7 = r7 + 1
            goto L_0x01a1
        L_0x01ad:
            r1.addAll(r3)
            java.util.Collections.reverse(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z10) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            c cVar = ((f) childAt.getLayoutParams()).f1716a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).m = false;
        }
        this.F = null;
        this.C = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.L;
    }

    public final void x() {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.b(this)) {
            if (this.N == null) {
                this.N = new a();
            }
            i0.i.u(this, this.N);
            setSystemUiVisibility(1280);
            return;
        }
        i0.i.u(this, (z) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public static class h extends k2.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f1733c;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new h[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1733c = new SparseArray<>(readInt);
            for (int i8 = 0; i8 < readInt; i8++) {
                this.f1733c.append(iArr[i8], readParcelableArray[i8]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            SparseArray<Parcelable> sparseArray = this.f1733c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f1733c.keyAt(i10);
                parcelableArr[i10] = this.f1733c.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i8);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1716a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1717b = false;

        /* renamed from: c  reason: collision with root package name */
        public final int f1718c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1719d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f1720e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f1721f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1722g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1723h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1724i;

        /* renamed from: j  reason: collision with root package name */
        public int f1725j;

        /* renamed from: k  reason: collision with root package name */
        public View f1726k;

        /* renamed from: l  reason: collision with root package name */
        public View f1727l;
        public boolean m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1728n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1729o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1730p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1731q = new Rect();

        public f() {
            super(-2, -2);
        }

        public final boolean a(int i8) {
            if (i8 == 0) {
                return this.f1728n;
            }
            if (i8 != 1) {
                return false;
            }
            return this.f1729o;
        }

        public final void b(c cVar) {
            c cVar2 = this.f1716a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f1716a = cVar;
                this.f1717b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.f7214c);
            this.f1718c = obtainStyledAttributes.getInteger(0, 0);
            this.f1721f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1719d = obtainStyledAttributes.getInteger(2, 0);
            this.f1720e = obtainStyledAttributes.getInteger(6, -1);
            this.f1722g = obtainStyledAttributes.getInt(5, 0);
            this.f1723h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1717b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.P;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.P;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.R;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Q);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(t.a("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1716a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1716a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
