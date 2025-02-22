package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.w;
import d2.x;
import d2.y;
import e.f;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements h0, w, x {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f800a0 = {R.attr.actionBarSize, 16842841};
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public j1 M;
    public j1 N;
    public j1 O;
    public j1 P;
    public d Q;
    public OverScroller R;
    public ViewPropertyAnimator S;
    public final a T;
    public final b U;
    public final c V;
    public final y W;

    /* renamed from: a  reason: collision with root package name */
    public int f801a;

    /* renamed from: b  reason: collision with root package name */
    public int f802b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f803c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f804d;

    /* renamed from: e  reason: collision with root package name */
    public i0 f805e;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.S = null;
            actionBarOverlayLayout.G = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.S = null;
            actionBarOverlayLayout.G = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.S = actionBarOverlayLayout.f804d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.T);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.S = actionBarOverlayLayout.f804d.animate().translationY((float) (-actionBarOverlayLayout.f804d.getHeight())).setListener(actionBarOverlayLayout.T);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e() {
            super(-1, -1);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        j1 j1Var = j1.f7236b;
        this.M = j1Var;
        this.N = j1Var;
        this.O = j1Var;
        this.P = j1Var;
        this.T = new a();
        this.U = new b();
        this.V = new c();
        r(context);
        this.W = new y();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        int i8;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = eVar.leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            eVar.leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = eVar.topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            eVar.topMargin = i13;
            z11 = true;
        }
        int i14 = eVar.rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            eVar.rightMargin = i15;
            z11 = true;
        }
        if (!z10 || eVar.bottomMargin == (i8 = rect.bottom)) {
            return z11;
        }
        eVar.bottomMargin = i8;
        return true;
    }

    public final boolean a() {
        s();
        return this.f805e.a();
    }

    public final void b() {
        s();
        this.f805e.b();
    }

    public final void c(f fVar, f.c cVar) {
        s();
        this.f805e.c(fVar, cVar);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final boolean d() {
        s();
        return this.f805e.d();
    }

    public final void draw(Canvas canvas) {
        int i8;
        super.draw(canvas);
        if (this.B != null && !this.C) {
            if (this.f804d.getVisibility() == 0) {
                i8 = (int) (this.f804d.getTranslationY() + ((float) this.f804d.getBottom()) + 0.5f);
            } else {
                i8 = 0;
            }
            this.B.setBounds(0, i8, getWidth(), this.B.getIntrinsicHeight() + i8);
            this.B.draw(canvas);
        }
    }

    public final boolean e() {
        s();
        return this.f805e.e();
    }

    public final boolean f() {
        s();
        return this.f805e.f();
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final boolean g() {
        s();
        return this.f805e.g();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f804d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        y yVar = this.W;
        return yVar.f7286b | yVar.f7285a;
    }

    public CharSequence getTitle() {
        s();
        return this.f805e.getTitle();
    }

    public final void h(int i8) {
        s();
        if (i8 == 2) {
            this.f805e.r();
        } else if (i8 == 5) {
            this.f805e.s();
        } else if (i8 == 109) {
            setOverlayMode(true);
        }
    }

    public final void i() {
        s();
        this.f805e.h();
    }

    public final void j(View view, int i8, int i10, int i11, int i12, int i13, int[] iArr) {
        k(view, i8, i10, i11, i12, i13);
    }

    public final void k(View view, int i8, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i8, i10, i11, i12);
        }
    }

    public final boolean l(View view, View view2, int i8, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i8);
    }

    public final void m(View view, View view2, int i8, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    public final void n(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void o(View view, int i8, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i8, i10, iArr);
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        j1 h3 = j1.h(windowInsets, this);
        boolean p10 = p(this.f804d, new Rect(h3.b(), h3.d(), h3.c(), h3.a()), false);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        Rect rect = this.J;
        i0.i.b(this, h3, rect);
        int i8 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        j1.k kVar = h3.f7237a;
        j1 l10 = kVar.l(i8, i10, i11, i12);
        this.M = l10;
        boolean z10 = true;
        if (!this.N.equals(l10)) {
            this.N = this.M;
            p10 = true;
        }
        Rect rect2 = this.K;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f7237a.c().f7237a.b().g();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.h.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = eVar.leftMargin + paddingLeft;
                int i15 = eVar.topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        s();
        measureChildWithMargins(this.f804d, i8, 0, i10, 0);
        e eVar = (e) this.f804d.getLayoutParams();
        int max = Math.max(0, this.f804d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f804d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f804d.getMeasuredState());
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        boolean z10 = (i0.d.g(this) & 256) != 0;
        if (z10) {
            i11 = this.f801a;
            if (this.E && this.f804d.getTabContainer() != null) {
                i11 += this.f801a;
            }
        } else {
            i11 = this.f804d.getVisibility() != 8 ? this.f804d.getMeasuredHeight() : 0;
        }
        Rect rect = this.J;
        Rect rect2 = this.L;
        rect2.set(rect);
        j1 j1Var = this.M;
        this.O = j1Var;
        if (this.D || z10) {
            v1.e a10 = v1.e.a(j1Var.b(), this.O.d() + i11, this.O.c(), this.O.a() + 0);
            j1 j1Var2 = this.O;
            int i12 = Build.VERSION.SDK_INT;
            j1.e dVar = i12 >= 30 ? new j1.d(j1Var2) : i12 >= 29 ? new j1.c(j1Var2) : new j1.b(j1Var2);
            dVar.d(a10);
            this.O = dVar.b();
        } else {
            rect2.top += i11;
            rect2.bottom += 0;
            this.O = j1Var.f7237a.l(0, i11, 0, 0);
        }
        p(this.f803c, rect2, true);
        if (!this.P.equals(this.O)) {
            j1 j1Var3 = this.O;
            this.P = j1Var3;
            i0.b(this.f803c, j1Var3);
        }
        measureChildWithMargins(this.f803c, i8, 0, i10, 0);
        e eVar2 = (e) this.f803c.getLayoutParams();
        int max3 = Math.max(max, this.f803c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f803c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f803c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i8, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.F || !z10) {
            return false;
        }
        this.R.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.R.getFinalY() > this.f804d.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.V.run();
        } else {
            q();
            this.U.run();
        }
        this.G = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i8, int i10, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i8, int i10, int i11, int i12) {
        int i13 = this.H + i10;
        this.H = i13;
        setActionBarHideOffset(i13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (e.w) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            d2.y r1 = r0.W
            r1.f7285a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.H = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.Q
            if (r1 == 0) goto L_0x001d
            e.w r1 = (e.w) r1
            h.g r2 = r1.f7749u
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f7749u = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f804d.getVisibility() != 0) {
            return false;
        }
        return this.F;
    }

    public final void onStopNestedScroll(View view) {
        if (this.F && !this.G) {
            if (this.H <= this.f804d.getHeight()) {
                q();
                postDelayed(this.U, 600);
                return;
            }
            q();
            postDelayed(this.V, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        s();
        int i10 = this.I ^ i8;
        this.I = i8;
        boolean z10 = (i8 & 4) == 0;
        boolean z11 = (i8 & 256) != 0;
        d dVar = this.Q;
        if (dVar != null) {
            ((e.w) dVar).f7744p = !z11;
            if (z10 || !z11) {
                e.w wVar = (e.w) dVar;
                if (wVar.f7746r) {
                    wVar.f7746r = false;
                    wVar.y(true);
                }
            } else {
                e.w wVar2 = (e.w) dVar;
                if (!wVar2.f7746r) {
                    wVar2.f7746r = true;
                    wVar2.y(true);
                }
            }
        }
        if ((i10 & 256) != 0 && this.Q != null) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f802b = i8;
        d dVar = this.Q;
        if (dVar != null) {
            ((e.w) dVar).f7743o = i8;
        }
    }

    public final void q() {
        removeCallbacks(this.U);
        removeCallbacks(this.V);
        ViewPropertyAnimator viewPropertyAnimator = this.S;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f800a0);
        boolean z10 = false;
        this.f801a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.B = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.C = z10;
        this.R = new OverScroller(context);
    }

    public final void s() {
        i0 i0Var;
        if (this.f803c == null) {
            this.f803c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f804d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof i0) {
                i0Var = (i0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                i0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f805e = i0Var;
        }
    }

    public void setActionBarHideOffset(int i8) {
        q();
        this.f804d.setTranslationY((float) (-Math.max(0, Math.min(i8, this.f804d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.Q = dVar;
        if (getWindowToken() != null) {
            ((e.w) this.Q).f7743o = this.f802b;
            int i8 = this.I;
            if (i8 != 0) {
                onWindowSystemUiVisibilityChanged(i8);
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.E = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.F) {
            this.F = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i8) {
        s();
        this.f805e.setIcon(i8);
    }

    public void setLogo(int i8) {
        s();
        this.f805e.m(i8);
    }

    public void setOverlayMode(boolean z10) {
        this.D = z10;
        this.C = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i8) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f805e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f805e.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f805e.setIcon(drawable);
    }
}
