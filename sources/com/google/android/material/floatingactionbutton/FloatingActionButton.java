package com.google.android.material.floatingactionbutton;

import ag.n2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m8.x;
import o.f;
import v7.g;
import v8.i;
import v8.m;
import y7.b;
import y7.e;

public final class FloatingActionButton extends x implements k8.a, m, CoordinatorLayout.b {
    public ColorStateList B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public l8.c G;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f5945b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f5946c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f5947d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f5948e;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements u8.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {
        public c(FloatingActionButton floatingActionButton) {
        }

        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        if (this.G == null) {
            this.G = new l8.c(this, new b());
        }
        return this.G;
    }

    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.f5977o == null) {
            impl.f5977o = new ArrayList<>();
        }
        impl.f5977o.add((Object) null);
    }

    public final void d(e eVar) {
        d impl = getImpl();
        if (impl.f5976n == null) {
            impl.f5976n = new ArrayList<>();
        }
        impl.f5976n.add(eVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f5978p == null) {
            impl.f5978p = new ArrayList<>();
        }
        impl.f5978p.add(cVar);
    }

    public final int f(int i8) {
        int i10 = this.D;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        return i8 != -1 ? i8 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(y7.b bVar, boolean z10) {
        d impl = getImpl();
        a aVar = bVar == null ? null : new a(this, bVar);
        boolean z11 = true;
        if (!(impl.f5979q.getVisibility() != 0 ? impl.m != 2 : impl.m == 1)) {
            Animator animator = impl.f5970g;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            FloatingActionButton floatingActionButton = impl.f5979q;
            if (!i0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z11 = false;
            }
            if (z11) {
                g gVar = impl.f5972i;
                AnimatorSet b10 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, d.A, d.B);
                b10.addListener(new b(impl, z10, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f5977o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b10.addListener(it.next());
                    }
                }
                b10.start();
                return;
            }
            floatingActionButton.b(z10 ? 8 : 4, z10);
            if (aVar != null) {
                aVar.f5952a.a(aVar.f5953b);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f5945b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f5946c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f5968e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f5969f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.D;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f5972i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.B;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f5964a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f5971h;
    }

    public int getSize() {
        return this.C;
    }

    public int getSizeDimension() {
        return f(this.C);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f5947d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f5948e;
    }

    public boolean getUseCompatPadding() {
        return this.F;
    }

    public final boolean h() {
        d impl = getImpl();
        if (impl.f5979q.getVisibility() == 0) {
            if (impl.m != 1) {
                return false;
            }
        } else if (impl.m == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        if (impl.f5979q.getVisibility() != 0) {
            if (impl.m != 2) {
                return false;
            }
        } else if (impl.m == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f5947d;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f5948e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.c(colorForState, mode));
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    public final void k(b.a aVar, boolean z10) {
        d impl = getImpl();
        a aVar2 = aVar == null ? null : new a(this, aVar);
        boolean z11 = true;
        if (!(impl.f5979q.getVisibility() == 0 ? impl.m != 1 : impl.m == 2)) {
            Animator animator = impl.f5970g;
            if (animator != null) {
                animator.cancel();
            }
            boolean z12 = impl.f5971h == null;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            FloatingActionButton floatingActionButton = impl.f5979q;
            if (!i0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z11 = false;
            }
            Matrix matrix = impl.f5984v;
            if (z11) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f10 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    floatingActionButton.setScaleY(z12 ? 0.4f : 0.0f);
                    floatingActionButton.setScaleX(z12 ? 0.4f : 0.0f);
                    if (z12) {
                        f10 = 0.4f;
                    }
                    impl.f5974k = f10;
                    impl.a(f10, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f5971h;
                AnimatorSet b10 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, d.f5962y, d.f5963z);
                b10.addListener(new c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f5976n;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b10.addListener(it.next());
                    }
                }
                b10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f5974k = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f5952a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof l8.c)) {
            ViewTreeObserver viewTreeObserver = impl.f5979q.getViewTreeObserver();
            if (impl.f5985w == null) {
                impl.f5985w = new l8.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f5985w);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f5979q.getViewTreeObserver();
        l8.b bVar = impl.f5985w;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f5985w = null;
        }
    }

    public final void onMeasure(int i8, int i10) {
        int sizeDimension = (getSizeDimension() - this.E) / 2;
        getImpl().n();
        throw null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y8.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y8.a aVar = (y8.a) parcelable;
        super.onRestoreInstanceState(aVar.f10267a);
        aVar.f17319c.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new f();
        throw null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.g.c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5945b != colorStateList) {
            this.f5945b = colorStateList;
            getImpl().getClass();
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f5946c != mode) {
            this.f5946c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f5967d != f10) {
            impl.f5967d = f10;
            impl.j(f10, impl.f5968e, impl.f5969f);
        }
    }

    public void setCompatElevationResource(int i8) {
        setCompatElevation(getResources().getDimension(i8));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f5968e != f10) {
            impl.f5968e = f10;
            impl.j(impl.f5967d, f10, impl.f5969f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i8) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i8));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f5969f != f10) {
            impl.f5969f = f10;
            impl.j(impl.f5967d, impl.f5968e, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i8) {
        setCompatPressedTranslationZ(getResources().getDimension(i8));
    }

    public void setCustomSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i8 != this.D) {
            this.D = i8;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f5965b) {
            getImpl().f5965b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i8) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f5972i = gVar;
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(g.a(getContext(), i8));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f5974k;
            impl.f5974k = f10;
            Matrix matrix = impl.f5984v;
            impl.a(f10, matrix);
            impl.f5979q.setImageMatrix(matrix);
            if (this.f5947d != null) {
                j();
            }
        }
    }

    public void setImageResource(int i8) {
        throw null;
    }

    public void setMaxImageSize(int i8) {
        this.E = i8;
        d impl = getImpl();
        if (impl.f5975l != i8) {
            impl.f5975l = i8;
            float f10 = impl.f5974k;
            impl.f5974k = f10;
            Matrix matrix = impl.f5984v;
            impl.a(f10, matrix);
            impl.f5979q.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i8) {
        setRippleColor(ColorStateList.valueOf(i8));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.f> arrayList = getImpl().f5978p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.f> arrayList = getImpl().f5978p;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f5966c = z10;
        impl.n();
        throw null;
    }

    public void setShapeAppearanceModel(i iVar) {
        getImpl().f5964a = iVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f5971h = gVar;
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(g.a(getContext(), i8));
    }

    public void setSize(int i8) {
        this.D = 0;
        if (i8 != this.C) {
            this.C = i8;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f5947d != colorStateList) {
            this.f5947d = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f5948e != mode) {
            this.f5948e = mode;
            j();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().k();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().k();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            getImpl().h();
        }
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f5949a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5950b;

        public BaseBehavior() {
            this.f5950b = true;
        }

        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1723h == 0) {
                fVar.f1723h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1716a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList d10 = coordinatorLayout.d(floatingActionButton);
            int size = d10.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) d10.get(i10);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1716a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i8);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            return this.f5950b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f1721f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f5949a == null) {
                this.f5949a = new Rect();
            }
            Rect rect = this.f5949a;
            m8.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g((y7.b) null, false);
                return true;
            }
            floatingActionButton.k((b.a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.g((y7.b) null, false);
                return true;
            }
            floatingActionButton.k((b.a) null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.M);
            this.f5950b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            getImpl().l();
        }
    }
}
