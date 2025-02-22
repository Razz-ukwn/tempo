package g1;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import b3.l0;
import cb.d;
import d0.g;
import d2.f1;
import d2.x;
import f1.c;
import ff.m;
import l3.b;
import rf.l;
import s0.a0;
import sf.j;
import t.f;

public class a extends ViewGroup implements x, f {
    public l<? super g, m> B;
    public c C;
    public l<? super c, m> D;
    public p E;
    public b F;
    public l<? super Boolean, m> G;
    public int H;
    public int I;

    /* renamed from: a  reason: collision with root package name */
    public View f8794a;

    /* renamed from: b  reason: collision with root package name */
    public rf.a<m> f8795b;

    /* renamed from: c  reason: collision with root package name */
    public rf.a<m> f8796c;

    /* renamed from: d  reason: collision with root package name */
    public rf.a<m> f8797d;

    /* renamed from: e  reason: collision with root package name */
    public g f8798e;

    public final void d() {
        this.f8797d.d();
    }

    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow((int[]) null);
        throw null;
    }

    public final c getDensity() {
        return this.C;
    }

    public final View getInteropView() {
        return this.f8794a;
    }

    public final a0 getLayoutNode() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        /*
            r2 = this;
            android.view.View r0 = r2.f8794a
            if (r0 == 0) goto L_0x000a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0010
        L_0x000a:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.a.getLayoutParams():android.view.ViewGroup$LayoutParams");
    }

    public final p getLifecycleOwner() {
        return this.E;
    }

    public final g getModifier() {
        return this.f8798e;
    }

    public int getNestedScrollAxes() {
        throw null;
    }

    public final l<c, m> getOnDensityChanged$ui_release() {
        return this.D;
    }

    public final l<g, m> getOnModifierChanged$ui_release() {
        return this.B;
    }

    public final l<Boolean, m> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.G;
    }

    public final rf.a<m> getRelease() {
        return this.f8797d;
    }

    public final rf.a<m> getReset() {
        return this.f8796c;
    }

    public final b getSavedStateRegistryOwner() {
        return this.F;
    }

    public final rf.a<m> getUpdate() {
        return this.f8795b;
    }

    public final View getView() {
        return this.f8794a;
    }

    public final void h() {
        View view = this.f8794a;
        j.c(view);
        if (view.getParent() != this) {
            addView(this.f8794a);
        } else {
            this.f8796c.d();
        }
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        throw null;
    }

    public final boolean isNestedScrollingEnabled() {
        View view = this.f8794a;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    public final void j(View view, int i8, int i10, int i11, int i12, int i13, int[] iArr) {
        j.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = (float) i8;
            float f11 = (float) -1;
            f1.f(f10 * f11, ((float) i10) * f11);
            f1.f(((float) i11) * f11, ((float) i12) * f11);
            throw null;
        }
    }

    public final void k(View view, int i8, int i10, int i11, int i12, int i13) {
        j.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = (float) i8;
            float f11 = (float) -1;
            f1.f(f10 * f11, ((float) i10) * f11);
            f1.f(((float) i11) * f11, ((float) i12) * f11);
            throw null;
        }
    }

    public final boolean l(View view, View view2, int i8, int i10) {
        j.f(view, "child");
        j.f(view2, "target");
        return ((i8 & 2) == 0 && (i8 & 1) == 0) ? false : true;
    }

    public final void m(View view, View view2, int i8, int i10) {
        j.f(view, "child");
        j.f(view2, "target");
        throw null;
    }

    public final void n(View view, int i8) {
        j.f(view, "target");
        throw null;
    }

    public final void o(View view, int i8, int i10, int[] iArr, int i11) {
        j.f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f10 = (float) i8;
            float f11 = (float) -1;
            f1.f(f10 * f11, ((float) i10) * f11);
            throw null;
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public final void onDescendantInvalidated(View view, View view2) {
        j.f(view, "child");
        j.f(view2, "target");
        super.onDescendantInvalidated(view, view2);
        throw null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        View view = this.f8794a;
        if (view != null) {
            view.layout(0, 0, i11 - i8, i12 - i10);
        }
    }

    public final void onMeasure(int i8, int i10) {
        View view = this.f8794a;
        if ((view != null ? view.getParent() : null) != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i10));
            return;
        }
        View view2 = this.f8794a;
        if (view2 != null) {
            view2.measure(i8, i10);
        }
        View view3 = this.f8794a;
        int i11 = 0;
        int measuredWidth = view3 != null ? view3.getMeasuredWidth() : 0;
        View view4 = this.f8794a;
        if (view4 != null) {
            i11 = view4.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i11);
        this.H = i8;
        this.I = i10;
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        j.f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        d.h(f10 * -1.0f, f11 * -1.0f);
        throw null;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        j.f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        d.h(f10 * -1.0f, f11 * -1.0f);
        throw null;
    }

    public final void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        l<? super Boolean, m> lVar = this.G;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(c cVar) {
        j.f(cVar, "value");
        if (cVar != this.C) {
            this.C = cVar;
            l<? super c, m> lVar = this.D;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(p pVar) {
        if (pVar != this.E) {
            this.E = pVar;
            s0.c(this, pVar);
        }
    }

    public final void setModifier(g gVar) {
        j.f(gVar, "value");
        if (gVar != this.f8798e) {
            this.f8798e = gVar;
            l<? super g, m> lVar = this.B;
            if (lVar != null) {
                lVar.invoke(gVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super c, m> lVar) {
        this.D = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super g, m> lVar) {
        this.B = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, m> lVar) {
        this.G = lVar;
    }

    public final void setRelease(rf.a<m> aVar) {
        j.f(aVar, "<set-?>");
        this.f8797d = aVar;
    }

    public final void setReset(rf.a<m> aVar) {
        j.f(aVar, "<set-?>");
        this.f8796c = aVar;
    }

    public final void setSavedStateRegistryOwner(b bVar) {
        if (bVar != this.F) {
            this.F = bVar;
            l0.d(this, bVar);
        }
    }

    public final void setUpdate(rf.a<m> aVar) {
        j.f(aVar, "value");
        this.f8795b = aVar;
        throw null;
    }

    public final void setView$ui_release(View view) {
        if (view != this.f8794a) {
            this.f8794a = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                throw null;
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
