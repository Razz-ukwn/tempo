package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.n0;
import d2.t;
import java.util.Iterator;

public class ActionMenuView extends n0 implements f.b, k {
    public f L;
    public Context M;
    public int N;
    public boolean O;
    public c P;
    public j.a Q;
    public f.a R;
    public boolean S;
    public int T;
    public final int U;
    public final int V;
    public e W;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        public final void c(f fVar, boolean z10) {
        }

        public final boolean d(f fVar) {
            return false;
        }
    }

    public static class c extends n0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f809a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f810b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f811c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f812d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f813e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f814f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f809a = cVar.f809a;
        }

        public c() {
            super(-2, -2);
            this.f809a = false;
        }
    }

    public class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z10;
            boolean z11;
            e eVar = ActionMenuView.this.W;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<t> it = toolbar.f889f0.f7272b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a(menuItem)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                Toolbar.h hVar = toolbar.f891h0;
                z11 = hVar != null ? e.t.this.f7707b.onMenuItemSelected(0, menuItem) : false;
            }
            return z11;
        }

        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.R;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.U = (int) (56.0f * f10);
        this.V = (int) (f10 * 4.0f);
        this.M = context;
        this.N = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.gravity <= 0) {
                cVar.gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        cVar2.gravity = 16;
        return cVar2;
    }

    public final boolean a(h hVar) {
        return this.L.q(hVar, (j) null, 0);
    }

    public final void b(f fVar) {
        this.L = fVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final n0.a f() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final n0.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.L == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.L = fVar;
            fVar.f726e = new d();
            c cVar = new c(context);
            this.P = cVar;
            cVar.I = true;
            cVar.J = true;
            j.a aVar = this.Q;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f694e = aVar;
            this.L.b(cVar, this.M);
            c cVar2 = this.P;
            cVar2.D = this;
            this.L = cVar2.f692c;
        }
        return this.L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.P;
        c.d dVar = cVar.F;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.H) {
            return cVar.G;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ n0.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i8) {
        boolean z10 = false;
        if (i8 == 0) {
            return false;
        }
        View childAt = getChildAt(i8 - 1);
        View childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.P;
        if (cVar != null) {
            cVar.d(false);
            if (this.P.j()) {
                this.P.b();
                this.P.n();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.P;
        if (cVar != null) {
            cVar.b();
            c.a aVar = cVar.Q;
            if (aVar != null && aVar.b()) {
                aVar.f783j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (!this.S) {
            super.onLayout(z10, i8, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i8;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = q1.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f809a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i13 = getPaddingLeft() + cVar.leftMargin;
                        i14 = i13 + measuredWidth;
                    } else {
                        i14 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i13 = i14 - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i13, i20, i14, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    k(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a10) {
            int width = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f809a) {
                    int i25 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width = i25 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f809a) {
                int i28 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i28;
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        f fVar;
        boolean z13 = this.S;
        boolean z14 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.S = z14;
        if (z13 != z14) {
            this.T = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (!(!this.S || (fVar = this.L) == null || size == this.T)) {
            this.T = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.S || childCount <= 0) {
            int i19 = i10;
            for (int i20 = 0; i20 < childCount; i20++) {
                c cVar = (c) getChildAt(i20).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i8, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i8);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i21 = size2 - paddingRight;
        int i22 = this.U;
        int i23 = i21 / i22;
        int i24 = i21 % i22;
        if (i23 == 0) {
            setMeasuredDimension(i21, 0);
            return;
        }
        int i25 = (i24 / i23) + i22;
        int childCount2 = getChildCount();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z15 = false;
        int i30 = 0;
        long j10 = 0;
        while (true) {
            i11 = this.V;
            if (i29 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i29);
            int i31 = size3;
            int i32 = i21;
            if (childAt.getVisibility() == 8) {
                i16 = mode;
                i17 = paddingBottom;
            } else {
                boolean z16 = childAt instanceof ActionMenuItemView;
                int i33 = i27 + 1;
                if (z16) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f814f = false;
                cVar2.f811c = 0;
                cVar2.f810b = 0;
                cVar2.f812d = false;
                cVar2.leftMargin = 0;
                cVar2.rightMargin = 0;
                cVar2.f813e = z16 && ((ActionMenuItemView) childAt).l();
                int i34 = cVar2.f809a ? 1 : i23;
                int i35 = i33;
                c cVar3 = (c) childAt.getLayoutParams();
                i16 = mode;
                i17 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z16 ? (ActionMenuItemView) childAt : null;
                boolean z17 = actionMenuItemView != null && actionMenuItemView.l();
                if (i34 <= 0 || (z17 && i34 < 2)) {
                    i18 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i34 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i18 = measuredWidth / i25;
                    if (measuredWidth % i25 != 0) {
                        i18++;
                    }
                    if (z17 && i18 < 2) {
                        i18 = 2;
                    }
                }
                cVar3.f812d = !cVar3.f809a && z17;
                cVar3.f810b = i18;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i18, 1073741824), makeMeasureSpec);
                i28 = Math.max(i28, i18);
                if (cVar2.f812d) {
                    i30++;
                }
                if (cVar2.f809a) {
                    z15 = true;
                }
                i23 -= i18;
                i26 = Math.max(i26, childAt.getMeasuredHeight());
                if (i18 == 1) {
                    j10 |= (long) (1 << i29);
                }
                i27 = i35;
            }
            i29++;
            size3 = i31;
            i21 = i32;
            paddingBottom = i17;
            mode = i16;
        }
        int i36 = mode;
        int i37 = i21;
        int i38 = size3;
        boolean z18 = z15 && i27 == 2;
        boolean z19 = false;
        while (true) {
            if (i30 <= 0 || i23 <= 0) {
                z10 = z19;
            } else {
                int i39 = Integer.MAX_VALUE;
                int i40 = 0;
                int i41 = 0;
                long j11 = 0;
                while (i41 < childCount2) {
                    c cVar4 = (c) getChildAt(i41).getLayoutParams();
                    boolean z20 = z19;
                    if (cVar4.f812d) {
                        int i42 = cVar4.f810b;
                        if (i42 < i39) {
                            j11 = 1 << i41;
                            i39 = i42;
                            i40 = 1;
                        } else if (i42 == i39) {
                            j11 |= 1 << i41;
                            i40++;
                        }
                    }
                    i41++;
                    z19 = z20;
                }
                z10 = z19;
                j10 |= j11;
                if (i40 > i23) {
                    break;
                }
                int i43 = i39 + 1;
                int i44 = 0;
                while (i44 < childCount2) {
                    View childAt2 = getChildAt(i44);
                    c cVar5 = (c) childAt2.getLayoutParams();
                    int i45 = i26;
                    int i46 = childMeasureSpec;
                    int i47 = childCount2;
                    long j12 = (long) (1 << i44);
                    if ((j11 & j12) != 0) {
                        if (!z18 || !cVar5.f813e) {
                            z12 = true;
                        } else {
                            z12 = true;
                            if (i23 == 1) {
                                childAt2.setPadding(i11 + i25, 0, i11, 0);
                            }
                        }
                        cVar5.f810b += z12 ? 1 : 0;
                        cVar5.f814f = z12;
                        i23--;
                    } else if (cVar5.f810b == i43) {
                        j10 |= j12;
                    }
                    i44++;
                    childMeasureSpec = i46;
                    i26 = i45;
                    childCount2 = i47;
                }
                z19 = true;
            }
        }
        z10 = z19;
        int i48 = i26;
        int i49 = childMeasureSpec;
        int i50 = childCount2;
        boolean z21 = !z15 && i27 == 1;
        if (i23 <= 0 || j10 == 0 || (i23 >= i27 - 1 && !z21 && i28 <= 1)) {
            i12 = i50;
            z11 = z10;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z21) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f813e) {
                    bitCount -= 0.5f;
                }
                int i51 = i50 - 1;
                if ((j10 & ((long) (1 << i51))) != 0 && !((c) getChildAt(i51).getLayoutParams()).f813e) {
                    bitCount -= 0.5f;
                }
            }
            int i52 = bitCount > 0.0f ? (int) (((float) (i23 * i25)) / bitCount) : 0;
            boolean z22 = z10;
            i12 = i50;
            for (int i53 = 0; i53 < i12; i53++) {
                if ((j10 & ((long) (1 << i53))) != 0) {
                    View childAt3 = getChildAt(i53);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f811c = i52;
                        cVar6.f814f = true;
                        if (i53 == 0 && !cVar6.f813e) {
                            cVar6.leftMargin = (-i52) / 2;
                        }
                        z22 = true;
                    } else {
                        if (cVar6.f809a) {
                            cVar6.f811c = i52;
                            cVar6.f814f = true;
                            cVar6.rightMargin = (-i52) / 2;
                            z22 = true;
                        } else {
                            if (i53 != 0) {
                                cVar6.leftMargin = i52 / 2;
                            }
                            if (i53 != i12 - 1) {
                                cVar6.rightMargin = i52 / 2;
                            }
                        }
                    }
                }
            }
            z11 = z22;
        }
        if (z11) {
            int i54 = 0;
            while (i54 < i12) {
                View childAt4 = getChildAt(i54);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (!cVar7.f814f) {
                    i15 = i49;
                } else {
                    i15 = i49;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f810b * i25) + cVar7.f811c, 1073741824), i15);
                }
                i54++;
                i49 = i15;
            }
        }
        if (i36 != 1073741824) {
            i14 = i37;
            i13 = i48;
        } else {
            i13 = i38;
            i14 = i37;
        }
        setMeasuredDimension(i14, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.P.N = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.W = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.P;
        c.d dVar = cVar.F;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.H = true;
        cVar.G = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.O = z10;
    }

    public void setPopupTheme(int i8) {
        if (this.N != i8) {
            this.N = i8;
            if (i8 == 0) {
                this.M = getContext();
            } else {
                this.M = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.P = cVar;
        cVar.D = this;
        this.L = cVar.f692c;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
