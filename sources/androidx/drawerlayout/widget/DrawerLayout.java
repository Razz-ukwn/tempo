package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.j1;
import e2.i;
import e2.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l2.c;
import t1.a;

public class DrawerLayout extends ViewGroup {

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f1788c0 = {16843828};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f1789d0 = {16842931};

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f1790e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f1791f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f1792g0;
    public final Paint B = new Paint();
    public final l2.c C;
    public final l2.c D;
    public final g E;
    public final g F;
    public int G;
    public boolean H;
    public boolean I = true;
    public int J = 3;
    public int K = 3;
    public int L = 3;
    public int M = 3;
    public boolean N;
    public d O;
    public ArrayList P;
    public float Q;
    public float R;
    public Drawable S;
    public Object T;
    public boolean U;
    public final ArrayList<View> V;
    public Rect W;

    /* renamed from: a  reason: collision with root package name */
    public final c f1793a = new c();

    /* renamed from: a0  reason: collision with root package name */
    public Matrix f1794a0;

    /* renamed from: b  reason: collision with root package name */
    public float f1795b;

    /* renamed from: b0  reason: collision with root package name */
    public final a f1796b0 = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f1797c;

    /* renamed from: d  reason: collision with root package name */
    public int f1798d = -1728053248;

    /* renamed from: e  reason: collision with root package name */
    public float f1799e;

    public class a implements m {
        public a() {
        }

        public final boolean a(View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (!DrawerLayout.m(view) || drawerLayout.h(view) == 2) {
                return false;
            }
            drawerLayout.c(view);
            return true;
        }
    }

    public class b extends d2.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1801d = new Rect();

        public b() {
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View g10 = drawerLayout.g();
            if (g10 == null) {
                return true;
            }
            int i8 = drawerLayout.i(g10);
            drawerLayout.getClass();
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            Gravity.getAbsoluteGravity(i8, i0.e.d(drawerLayout));
            return true;
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public final void d(View view, i iVar) {
            boolean z10 = DrawerLayout.f1790e0;
            AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
            View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
            if (z10) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                iVar.f7781c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                ViewParent f10 = i0.d.f(view);
                if (f10 instanceof View) {
                    iVar.f7780b = -1;
                    accessibilityNodeInfo.setParent((View) f10);
                }
                Rect rect = this.f1801d;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                iVar.j(obtain.getClassName());
                iVar.m(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                iVar.a(obtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (DrawerLayout.k(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            iVar.j("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) i.a.f7782e.f7793a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) i.a.f7783f.f7793a);
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1790e0 || DrawerLayout.k(view)) {
                return super.f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class c extends d2.a {
        public final void d(View view, i iVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
            AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (!DrawerLayout.k(view)) {
                iVar.f7780b = -1;
                accessibilityNodeInfo.setParent((View) null);
            }
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();
    }

    public class g extends c.C0205c {

        /* renamed from: a  reason: collision with root package name */
        public final int f1810a;

        /* renamed from: b  reason: collision with root package name */
        public l2.c f1811b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1812c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                int i8;
                View view;
                g gVar = g.this;
                int i10 = gVar.f1811b.f10957o;
                int i11 = gVar.f1810a;
                int i12 = 3;
                boolean z10 = i11 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z10) {
                    view = drawerLayout.e(3);
                    i8 = (view != null ? -view.getWidth() : 0) + i10;
                } else {
                    view = drawerLayout.e(5);
                    i8 = drawerLayout.getWidth() - i10;
                }
                if (view == null) {
                    return;
                }
                if (((z10 && view.getLeft() < i8) || (!z10 && view.getLeft() > i8)) && drawerLayout.h(view) == 0) {
                    gVar.f1811b.s(view, i8, view.getTop());
                    ((e) view.getLayoutParams()).f1805c = true;
                    drawerLayout.invalidate();
                    if (i11 == 3) {
                        i12 = 5;
                    }
                    View e10 = drawerLayout.e(i12);
                    if (e10 != null) {
                        drawerLayout.c(e10);
                    }
                    if (!drawerLayout.N) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            drawerLayout.getChildAt(i13).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.N = true;
                    }
                }
            }
        }

        public g(int i8) {
            this.f1810a = i8;
        }

        public final int a(View view, int i8) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i8, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i8, width));
        }

        public final int b(View view, int i8) {
            return view.getTop();
        }

        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final void e(int i8, int i10) {
            int i11 = i8 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View e10 = i11 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
            if (e10 != null && drawerLayout.h(e10) == 0) {
                this.f1811b.b(e10, i10);
            }
        }

        public final void f() {
            DrawerLayout.this.postDelayed(this.f1812c, 160);
        }

        public final void g(View view, int i8) {
            ((e) view.getLayoutParams()).f1805c = false;
            int i10 = 3;
            if (this.f1810a == 3) {
                i10 = 5;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            View e10 = drawerLayout.e(i10);
            if (e10 != null) {
                drawerLayout.c(e10);
            }
        }

        public final void h(int i8) {
            DrawerLayout.this.t(this.f1811b.f10962t, i8);
        }

        public final void i(View view, int i8, int i10) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.a(view, 3) ? (float) (i8 + width) : (float) (drawerLayout.getWidth() - i8)) / ((float) width);
            drawerLayout.q(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        public final void j(View view, float f10, float f11) {
            int i8;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f12 = ((e) view.getLayoutParams()).f1804b;
            int width = view.getWidth();
            if (drawerLayout.a(view, 3)) {
                int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i8 = (i10 > 0 || (i10 == 0 && f12 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i8 = width2;
            }
            this.f1811b.q(i8, view.getTop());
            drawerLayout.invalidate();
        }

        public final boolean k(View view, int i8) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.n(view) && drawerLayout.a(view, this.f1810a) && drawerLayout.h(view) == 0;
        }
    }

    static {
        boolean z10 = true;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 29) {
            z10 = false;
        }
        f1792g0 = z10;
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f1797c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.E = gVar;
        g gVar2 = new g(5);
        this.F = gVar2;
        l2.c cVar = new l2.c(getContext(), this, gVar);
        cVar.f10945b = (int) (((float) cVar.f10945b) * 1.0f);
        this.C = cVar;
        cVar.f10959q = 1;
        cVar.f10956n = f11;
        gVar.f1811b = cVar;
        l2.c cVar2 = new l2.c(getContext(), this, gVar2);
        cVar2.f10945b = (int) (((float) cVar2.f10945b) * 1.0f);
        this.D = cVar2;
        cVar2.f10959q = 2;
        cVar2.f10956n = f11;
        gVar2.f1811b = cVar2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(this, 1);
        i0.n(this, new b());
        setMotionEventSplittingEnabled(false);
        if (i0.d.b(this)) {
            setOnApplyWindowInsetsListener(new o2.a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1788c0);
            try {
                this.S = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e9.c.f7878c, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1795b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1795b = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.V = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String j(int i8) {
        return (i8 & 3) == 3 ? "LEFT" : (i8 & 5) == 5 ? "RIGHT" : Integer.toHexString(i8);
    }

    public static boolean k(View view) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return (i0.d.c(view) == 4 || i0.d.c(view) == 2) ? false : true;
    }

    public static boolean l(View view) {
        return ((e) view.getLayoutParams()).f1803a == 0;
    }

    public static boolean m(View view) {
        if (n(view)) {
            return (((e) view.getLayoutParams()).f1806d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean n(View view) {
        int i8 = ((e) view.getLayoutParams()).f1803a;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i0.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i8) {
        return (i(view) & i8) == i8;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i8, int i10) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                arrayList2 = this.V;
                if (i11 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (!n(childAt)) {
                    arrayList2.add(childAt);
                } else if (m(childAt)) {
                    childAt.addFocusables(arrayList, i8, i10);
                    z10 = true;
                }
                i11++;
            }
            if (!z10) {
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    View view = arrayList2.get(i12);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i8, i10);
                    }
                }
            }
            arrayList2.clear();
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (f() != null || n(view)) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.s(view, 4);
        } else {
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.d.s(view, 1);
        }
        if (!f1790e0) {
            i0.n(view, this.f1793a);
        }
    }

    public final void b() {
        View e10 = e(8388611);
        if (e10 != null) {
            c(e10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + j(8388611));
    }

    public final void c(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.I) {
                eVar.f1804b = 0.0f;
                eVar.f1806d = 0;
            } else {
                eVar.f1806d |= 4;
                if (a(view, 3)) {
                    this.C.s(view, -view.getWidth(), view.getTop());
                } else {
                    this.D.s(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i8 = 0; i8 < childCount; i8++) {
            f10 = Math.max(f10, ((e) getChildAt(i8).getLayoutParams()).f1804b);
        }
        this.f1799e = f10;
        boolean g10 = this.C.g();
        boolean g11 = this.D.g();
        if (g10 || g11) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    public final void d(boolean z10) {
        boolean z11;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            e eVar = (e) childAt.getLayoutParams();
            if (n(childAt) && (!z10 || eVar.f1805c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z11 = this.C.s(childAt, -width, childAt.getTop());
                } else {
                    z11 = this.D.s(childAt, getWidth(), childAt.getTop());
                }
                z12 |= z11;
                eVar.f1805c = false;
            }
        }
        g gVar = this.E;
        DrawerLayout.this.removeCallbacks(gVar.f1812c);
        g gVar2 = this.F;
        DrawerLayout.this.removeCallbacks(gVar2.f1812c);
        if (z12) {
            invalidate();
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1799e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt = getChildAt(i8);
            if (this.W == null) {
                this.W = new Rect();
            }
            childAt.getHitRect(this.W);
            if (this.W.contains((int) x10, (int) y10) && !l(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1794a0 == null) {
                            this.f1794a0 = new Matrix();
                        }
                        matrix.invert(this.f1794a0);
                        obtain.transform(this.f1794a0);
                    }
                    z10 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z10 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean l10 = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i8 = 0;
        if (l10) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && n(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i10) {
                                i10 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
            i8 = i10;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f1799e;
        if (f10 > 0.0f && l10) {
            int i12 = this.f1798d;
            Paint paint = this.B;
            paint.setColor((((int) (((float) ((-16777216 & i12) >>> 24)) * f10)) << 24) | (i12 & 16777215));
            canvas.drawRect((float) i8, 0.0f, (float) width, (float) getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i8) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, i0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((((e) childAt.getLayoutParams()).f1806d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((e) childAt.getLayoutParams()).f1804b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1791f0) {
            return this.f1795b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.S;
    }

    public final int h(View view) {
        if (n(view)) {
            int i8 = ((e) view.getLayoutParams()).f1803a;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            int d10 = i0.e.d(this);
            if (i8 == 3) {
                int i10 = this.J;
                if (i10 != 3) {
                    return i10;
                }
                int i11 = d10 == 0 ? this.L : this.M;
                if (i11 != 3) {
                    return i11;
                }
            } else if (i8 == 5) {
                int i12 = this.K;
                if (i12 != 3) {
                    return i12;
                }
                int i13 = d10 == 0 ? this.M : this.L;
                if (i13 != 3) {
                    return i13;
                }
            } else if (i8 == 8388611) {
                int i14 = this.L;
                if (i14 != 3) {
                    return i14;
                }
                int i15 = d10 == 0 ? this.J : this.K;
                if (i15 != 3) {
                    return i15;
                }
            } else if (i8 == 8388613) {
                int i16 = this.M;
                if (i16 != 3) {
                    return i16;
                }
                int i17 = d10 == 0 ? this.K : this.J;
                if (i17 != 3) {
                    return i17;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int i(View view) {
        int i8 = ((e) view.getLayoutParams()).f1803a;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return Gravity.getAbsoluteGravity(i8, i0.e.d(this));
    }

    public final void o(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.I) {
                eVar.f1804b = 1.0f;
                eVar.f1806d = 1;
                s(view, true);
                r(view);
            } else {
                eVar.f1806d |= 2;
                if (a(view, 3)) {
                    this.C.s(view, 0, view.getTop());
                } else {
                    this.D.s(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = true;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.U && this.S != null) {
            Object obj = this.T;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.S.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.S.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[LOOP:0: B:8:0x0022->B:20:0x0055, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0053 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            l2.c r1 = r8.C
            boolean r2 = r1.r(r9)
            l2.c r3 = r8.D
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0075
            if (r0 == r3) goto L_0x006e
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x006e
            goto L_0x0073
        L_0x001e:
            float[] r9 = r1.f10947d
            int r9 = r9.length
            r0 = r4
        L_0x0022:
            if (r0 >= r9) goto L_0x0058
            int r5 = r1.f10954k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002d
            r5 = r3
            goto L_0x002e
        L_0x002d:
            r5 = r4
        L_0x002e:
            if (r5 != 0) goto L_0x0031
            goto L_0x0050
        L_0x0031:
            float[] r5 = r1.f10949f
            r5 = r5[r0]
            float[] r6 = r1.f10947d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f10950g
            r6 = r6[r0]
            float[] r7 = r1.f10948e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f10945b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0050
            r5 = r3
            goto L_0x0051
        L_0x0050:
            r5 = r4
        L_0x0051:
            if (r5 == 0) goto L_0x0055
            r9 = r3
            goto L_0x0059
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0058:
            r9 = r4
        L_0x0059:
            if (r9 == 0) goto L_0x0073
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.E
            androidx.drawerlayout.widget.DrawerLayout$g$a r0 = r9.f1812c
            androidx.drawerlayout.widget.DrawerLayout r9 = androidx.drawerlayout.widget.DrawerLayout.this
            r9.removeCallbacks(r0)
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.F
            androidx.drawerlayout.widget.DrawerLayout$g$a r0 = r9.f1812c
            androidx.drawerlayout.widget.DrawerLayout r9 = androidx.drawerlayout.widget.DrawerLayout.this
            r9.removeCallbacks(r0)
            goto L_0x0073
        L_0x006e:
            r8.d(r3)
            r8.N = r4
        L_0x0073:
            r9 = r4
            goto L_0x009b
        L_0x0075:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.Q = r0
            r8.R = r9
            float r5 = r8.f1799e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0098
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L_0x0098
            boolean r9 = l(r9)
            if (r9 == 0) goto L_0x0098
            r9 = r3
            goto L_0x0099
        L_0x0098:
            r9 = r4
        L_0x0099:
            r8.N = r4
        L_0x009b:
            if (r2 != 0) goto L_0x00c2
            if (r9 != 0) goto L_0x00c2
            int r9 = r8.getChildCount()
            r0 = r4
        L_0x00a4:
            if (r0 >= r9) goto L_0x00b9
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.e) r1
            boolean r1 = r1.f1805c
            if (r1 == 0) goto L_0x00b6
            r9 = r3
            goto L_0x00ba
        L_0x00b6:
            int r0 = r0 + 1
            goto L_0x00a4
        L_0x00b9:
            r9 = r4
        L_0x00ba:
            if (r9 != 0) goto L_0x00c2
            boolean r9 = r8.N
            if (r9 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r3 = r4
        L_0x00c2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            if (g() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i8, keyEvent);
    }

    public final boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return super.onKeyUp(i8, keyEvent);
        }
        View g10 = g();
        if (g10 != null && h(g10) == 0) {
            d(false);
        }
        return g10 != null;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        WindowInsets rootWindowInsets;
        float f10;
        int i13;
        boolean z11 = true;
        this.H = true;
        int i14 = i11 - i8;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i16 = eVar.leftMargin;
                    childAt.layout(i16, eVar.topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + eVar.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i13 = (-measuredWidth) + ((int) (eVar.f1804b * f11));
                        f10 = ((float) (measuredWidth + i13)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i17 = i14 - ((int) (eVar.f1804b * f12));
                        f10 = ((float) (i14 - i17)) / f12;
                        i13 = i17;
                    }
                    boolean z12 = f10 != eVar.f1804b ? z11 : false;
                    int i18 = eVar.f1803a & 112;
                    if (i18 == 16) {
                        int i19 = i12 - i10;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = eVar.topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = i19 - eVar.bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight;
                            }
                        }
                        childAt.layout(i13, i20, measuredWidth + i13, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = eVar.topMargin;
                        childAt.layout(i13, i24, measuredWidth + i13, measuredHeight + i24);
                    } else {
                        int i25 = i12 - i10;
                        childAt.layout(i13, (i25 - eVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i13, i25 - eVar.bottomMargin);
                    }
                    if (z12) {
                        q(childAt, f10);
                    }
                    int i26 = eVar.f1804b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i15++;
            z11 = true;
        }
        if (f1792g0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            v1.e i27 = j1.h(rootWindowInsets, (View) null).f7237a.i();
            l2.c cVar = this.C;
            cVar.f10957o = Math.max(cVar.f10958p, i27.f16121a);
            l2.c cVar2 = this.D;
            cVar2.f10957o = Math.max(cVar2.f10958p, i27.f16123c);
        }
        this.H = false;
        this.I = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L_0x0018
            if (r2 == r5) goto L_0x0026
        L_0x0018:
            boolean r6 = r17.isInEditMode()
            if (r6 == 0) goto L_0x019a
            r6 = 300(0x12c, float:4.2E-43)
            if (r1 != 0) goto L_0x0023
            r3 = r6
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            r4 = r6
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.T
            r6 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            boolean r1 = d2.i0.d.b(r17)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = r6
        L_0x0039:
            java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
            int r7 = d2.i0.e.d(r17)
            int r8 = r17.getChildCount()
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x0046:
            if (r9 >= r8) goto L_0x0199
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0056
            goto L_0x00fc
        L_0x0056:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r13 = (androidx.drawerlayout.widget.DrawerLayout.e) r13
            r14 = 3
            if (r1 == 0) goto L_0x00db
            int r15 = r13.f1803a
            int r15 = android.view.Gravity.getAbsoluteGravity(r15, r7)
            boolean r16 = d2.i0.d.b(r12)
            r2 = 5
            if (r16 == 0) goto L_0x0099
            java.lang.Object r5 = r0.T
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5
            if (r15 != r14) goto L_0x0083
            int r2 = r5.getSystemWindowInsetLeft()
            int r15 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r15, r6, r14)
            goto L_0x0095
        L_0x0083:
            if (r15 != r2) goto L_0x0095
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        L_0x0095:
            r12.dispatchApplyWindowInsets(r5)
            goto L_0x00db
        L_0x0099:
            java.lang.Object r5 = r0.T
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5
            r14 = 3
            if (r15 != r14) goto L_0x00b1
            int r2 = r5.getSystemWindowInsetLeft()
            int r14 = r5.getSystemWindowInsetTop()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r14, r6, r15)
            goto L_0x00c3
        L_0x00b1:
            if (r15 != r2) goto L_0x00c3
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        L_0x00c3:
            int r2 = r5.getSystemWindowInsetLeft()
            r13.leftMargin = r2
            int r2 = r5.getSystemWindowInsetTop()
            r13.topMargin = r2
            int r2 = r5.getSystemWindowInsetRight()
            r13.rightMargin = r2
            int r2 = r5.getSystemWindowInsetBottom()
            r13.bottomMargin = r2
        L_0x00db:
            boolean r2 = l(r12)
            if (r2 == 0) goto L_0x0102
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r5 = r13.rightMargin
            int r2 = r2 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r12.measure(r2, r13)
        L_0x00fc:
            r15 = r18
            r13 = r19
            goto L_0x0172
        L_0x0102:
            r5 = 1073741824(0x40000000, float:2.0)
            boolean r2 = n(r12)
            if (r2 == 0) goto L_0x0178
            boolean r2 = f1791f0
            if (r2 == 0) goto L_0x011b
            float r2 = d2.i0.i.i(r12)
            float r14 = r0.f1795b
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x011b
            d2.i0.i.s(r12, r14)
        L_0x011b:
            int r2 = r0.i(r12)
            r2 = r2 & 7
            r14 = 3
            if (r2 != r14) goto L_0x0126
            r14 = 1
            goto L_0x0127
        L_0x0126:
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x012b
            if (r10 != 0) goto L_0x0130
        L_0x012b:
            if (r14 != 0) goto L_0x014d
            if (r11 != 0) goto L_0x0130
            goto L_0x014d
        L_0x0130:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Child drawer has absolute gravity "
            r3.<init>(r4)
            java.lang.String r2 = j(r2)
            r3.append(r2)
            java.lang.String r2 = " but this DrawerLayout already has a drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x014d:
            if (r14 == 0) goto L_0x0151
            r10 = 1
            goto L_0x0152
        L_0x0151:
            r11 = 1
        L_0x0152:
            int r2 = r13.leftMargin
            int r14 = r0.f1797c
            int r14 = r14 + r2
            int r2 = r13.rightMargin
            int r14 = r14 + r2
            int r2 = r13.width
            r15 = r18
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r15, r14, r2)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L_0x0172:
            int r9 = r9 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0046
        L_0x0178:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Child "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0199:
            return
        L_0x019a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e10;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f10267a);
        int i8 = fVar.f1807c;
        if (!(i8 == 0 || (e10 = e(i8)) == null)) {
            o(e10);
        }
        int i10 = fVar.f1808d;
        if (i10 != 3) {
            p(i10, 3);
        }
        int i11 = fVar.f1809e;
        if (i11 != 3) {
            p(i11, 5);
        }
        int i12 = fVar.B;
        if (i12 != 3) {
            p(i12, 8388611);
        }
        int i13 = fVar.C;
        if (i13 != 3) {
            p(i13, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i8) {
        if (!f1791f0) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.e.d(this);
            i0.e.d(this);
        }
    }

    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i8).getLayoutParams();
            int i10 = eVar.f1806d;
            boolean z10 = true;
            boolean z11 = i10 == 1;
            if (i10 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                fVar.f1807c = eVar.f1803a;
            } else {
                i8++;
            }
        }
        fVar.f1808d = this.J;
        fVar.f1809e = this.K;
        fVar.B = this.L;
        fVar.C = this.M;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (h(r7) != 2) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            l2.c r0 = r6.C
            r0.k(r7)
            l2.c r1 = r6.D
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0059
            if (r1 == r3) goto L_0x0020
            r7 = 3
            if (r1 == r7) goto L_0x001a
            goto L_0x0067
        L_0x001a:
            r6.d(r3)
            r6.N = r2
            goto L_0x0067
        L_0x0020:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L_0x0054
            boolean r4 = l(r4)
            if (r4 == 0) goto L_0x0054
            float r4 = r6.Q
            float r1 = r1 - r4
            float r4 = r6.R
            float r7 = r7 - r4
            int r0 = r0.f10945b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0054
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L_0x0054
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L_0x0055
        L_0x0054:
            r2 = r3
        L_0x0055:
            r6.d(r2)
            goto L_0x0067
        L_0x0059:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.Q = r0
            r6.R = r7
            r6.N = r2
        L_0x0067:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i8, int i10) {
        View e10;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i0.e.d(this));
        if (i10 == 3) {
            this.J = i8;
        } else if (i10 == 5) {
            this.K = i8;
        } else if (i10 == 8388611) {
            this.L = i8;
        } else if (i10 == 8388613) {
            this.M = i8;
        }
        if (i8 != 0) {
            (absoluteGravity == 3 ? this.C : this.D).a();
        }
        if (i8 == 1) {
            View e11 = e(absoluteGravity);
            if (e11 != null) {
                c(e11);
            }
        } else if (i8 == 2 && (e10 = e(absoluteGravity)) != null) {
            o(e10);
        }
    }

    public final void q(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 != eVar.f1804b) {
            eVar.f1804b = f10;
            ArrayList arrayList = this.P;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((d) this.P.get(size)).c();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void r(View view) {
        i.a aVar = i.a.f7790n;
        i0.k(view, aVar.a());
        i0.h(view, 0);
        if (m(view) && h(view) != 2) {
            i0.l(view, aVar, this.f1796b0);
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            d(true);
        }
    }

    public final void requestLayout() {
        if (!this.H) {
            super.requestLayout();
        }
    }

    public final void s(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((z10 || n(childAt)) && (!z10 || childAt != view)) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.s(childAt, 4);
            } else {
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.d.s(childAt, 1);
            }
        }
    }

    public void setDrawerElevation(float f10) {
        this.f1795b = f10;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (n(childAt)) {
                float f11 = this.f1795b;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.i.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.O;
        if (!(dVar2 == null || (arrayList = this.P) == null)) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.P == null) {
                this.P = new ArrayList();
            }
            this.P.add(dVar);
        }
        this.O = dVar;
    }

    public void setDrawerLockMode(int i8) {
        p(i8, 3);
        p(i8, 5);
    }

    public void setScrimColor(int i8) {
        this.f1798d = i8;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.S = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i8) {
        this.S = new ColorDrawable(i8);
        invalidate();
    }

    public final void t(View view, int i8) {
        int i10;
        View rootView;
        int i11 = this.C.f10944a;
        int i12 = this.D.f10944a;
        if (i11 == 1 || i12 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (!(i11 == 2 || i12 == 2)) {
                i10 = 0;
            }
        }
        if (view != null && i8 == 0) {
            float f10 = ((e) view.getLayoutParams()).f1804b;
            if (f10 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f1806d & 1) == 1) {
                    eVar.f1806d = 0;
                    ArrayList arrayList = this.P;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((d) this.P.get(size)).d();
                        }
                    }
                    s(view, false);
                    r(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f1806d & 1) == 0) {
                    eVar2.f1806d = 1;
                    ArrayList arrayList2 = this.P;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((d) this.P.get(size2)).a();
                        }
                    }
                    s(view, true);
                    r(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i10 != this.G) {
            this.G = i10;
            ArrayList arrayList3 = this.P;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.P.get(size3)).b();
                }
            }
        }
    }

    public void setStatusBarBackground(int i8) {
        Drawable drawable;
        if (i8 != 0) {
            Context context = getContext();
            Object obj = t1.a.f15323a;
            drawable = a.c.b(context, i8);
        } else {
            drawable = null;
        }
        this.S = drawable;
        invalidate();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f1803a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f1804b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1805c;

        /* renamed from: d  reason: collision with root package name */
        public int f1806d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1789d0);
            this.f1803a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e() {
            super(-1, -1);
        }

        public e(e eVar) {
            super(eVar);
            this.f1803a = eVar.f1803a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public static class f extends k2.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int B;
        public int C;

        /* renamed from: c  reason: collision with root package name */
        public int f1807c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1808d;

        /* renamed from: e  reason: collision with root package name */
        public int f1809e;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new f[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1807c = parcel.readInt();
            this.f1808d = parcel.readInt();
            this.f1809e = parcel.readInt();
            this.B = parcel.readInt();
            this.C = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f1807c);
            parcel.writeInt(this.f1808d);
            parcel.writeInt(this.f1809e);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
