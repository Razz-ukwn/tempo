package com.google.android.material.floatingactionbutton;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v7.g;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            return Float.valueOf((float) i0.e.f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.e.k(view, intValue, paddingTop, i0.e.e(view), view.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            return Float.valueOf((float) i0.e.e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.e.k(view, i0.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i8) {
        if (i8 == 0 || i8 == 1 || i8 == 2 || i8 == 3) {
            throw null;
        }
        throw new IllegalStateException(q.a("Unknown strategy type: ", i8));
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i8) {
        setExtendMotionSpec(g.a(getContext(), i8));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(g.a(getContext(), i8));
    }

    public final void setPadding(int i8, int i10, int i11, int i12) {
        super.setPadding(i8, i10, i11, i12);
    }

    public final void setPaddingRelative(int i8, int i10, int i11, int i12) {
        super.setPaddingRelative(i8, i10, i11, i12);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(g.a(getContext(), i8));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i8) {
        setShrinkMotionSpec(g.a(getContext(), i8));
    }

    public void setTextColor(int i8) {
        super.setTextColor(i8);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f5942a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5943b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5944c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f5943b = false;
            this.f5944c = true;
        }

        public final /* bridge */ /* synthetic */ boolean a(View view) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1723h == 0) {
                fVar.f1723h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1716a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList d10 = coordinatorLayout.d(extendedFloatingActionButton);
            int size = d10.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) d10.get(i10);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1716a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i8);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f5943b;
            int i8 = 1;
            int i10 = 0;
            boolean z11 = this.f5944c;
            if ((z10 || z11) && fVar.f1721f == appBarLayout.getId()) {
                if (this.f5942a == null) {
                    this.f5942a = new Rect();
                }
                Rect rect = this.f5942a;
                m8.d.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    if (z11) {
                        i8 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i8);
                    throw null;
                }
                if (z11) {
                    i10 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                throw null;
            }
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f5943b;
            int i8 = 1;
            int i10 = 0;
            boolean z11 = this.f5944c;
            if ((z10 || z11) && fVar.f1721f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                    if (z11) {
                        i8 = 2;
                    }
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, i8);
                    throw null;
                }
                if (z11) {
                    i10 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.L);
            this.f5943b = obtainStyledAttributes.getBoolean(0, false);
            this.f5944c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
