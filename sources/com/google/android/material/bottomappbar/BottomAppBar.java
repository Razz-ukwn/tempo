package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m8.v;
import w1.a;
import y7.e;
import y7.f;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int F0 = 0;
    public int A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public Behavior E0;

    /* renamed from: t0  reason: collision with root package name */
    public Integer f5729t0;

    /* renamed from: u0  reason: collision with root package name */
    public Animator f5730u0;

    /* renamed from: v0  reason: collision with root package name */
    public Animator f5731v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f5732w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f5733x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f5734y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5735z0;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f5740a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5741b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f5742c;

        public a(ActionMenuView actionMenuView, int i8, boolean z10) {
            this.f5740a = actionMenuView;
            this.f5741b = i8;
            this.f5742c = z10;
        }

        public final void run() {
            int i8 = this.f5741b;
            boolean z10 = this.f5742c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f5740a;
            actionMenuView.setTranslationX((float) bottomAppBar.y(actionMenuView, i8, z10));
        }
    }

    public static class b extends k2.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f5744c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5745d;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new b[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Toolbar.i iVar) {
            super(iVar);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f5744c);
            parcel.writeInt(this.f5745d ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5744c = parcel.readInt();
            this.f5745d = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return n8.a.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return z(this.f5732w0);
    }

    private float getFabTranslationY() {
        if (this.f5734y0 == 1) {
            return -getTopEdgeTreatment().f17317c;
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final boolean A() {
        View w10 = w();
        FloatingActionButton floatingActionButton = w10 instanceof FloatingActionButton ? (FloatingActionButton) w10 : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void B() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.D0) {
            A();
        }
        throw null;
    }

    public final void D(ActionMenuView actionMenuView, int i8, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i8, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f17317c;
    }

    public int getFabAlignmentMode() {
        return this.f5732w0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f5735z0;
    }

    public int getFabAnchorMode() {
        return this.f5734y0;
    }

    public int getFabAnimationMode() {
        return this.f5733x0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f17316b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f17315a;
    }

    public boolean getHideOnScroll() {
        return this.B0;
    }

    public int getMenuAlignmentMode() {
        return this.A0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.l(this, (v8.f) null);
        throw null;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        if (z10) {
            Animator animator = this.f5731v0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f5730u0;
            if (animator2 != null) {
                animator2.cancel();
            }
            B();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f5731v0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!A()) {
                D(actionMenuView, 0, false, false);
            } else {
                D(actionMenuView, this.f5732w0, this.D0, false);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f10267a);
        this.f5732w0 = bVar.f5744c;
        this.D0 = bVar.f5745d;
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.i) super.onSaveInstanceState());
        bVar.f5744c = this.f5732w0;
        bVar.f5745d = this.D0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f17317c = f10;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    public void setElevation(float f10) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFabAlignmentMode(int r13) {
        /*
            r12 = this;
            r0 = 0
            r12.C0 = r0
            boolean r1 = r12.D0
            java.util.WeakHashMap<android.view.View, d2.d1> r2 = d2.i0.f7217a
            boolean r2 = d2.i0.g.c(r12)
            r3 = 1
            if (r2 != 0) goto L_0x0020
            int r1 = r12.C0
            if (r1 == 0) goto L_0x00b6
            r12.C0 = r0
            android.view.Menu r2 = r12.getMenu()
            r2.clear()
            r12.k(r1)
            goto L_0x00b6
        L_0x0020:
            android.animation.Animator r2 = r12.f5731v0
            if (r2 == 0) goto L_0x0027
            r2.cancel()
        L_0x0027:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = r12.A()
            if (r4 != 0) goto L_0x0035
            r1 = r0
            r4 = r1
            goto L_0x0036
        L_0x0035:
            r4 = r13
        L_0x0036:
            androidx.appcompat.widget.ActionMenuView r5 = r12.getActionMenuView()
            if (r5 != 0) goto L_0x003d
            goto L_0x009f
        L_0x003d:
            int r6 = r12.getFabAlignmentAnimationDuration()
            float r6 = (float) r6
            float[] r7 = new float[r3]
            r8 = 1065353216(0x3f800000, float:1.0)
            r7[r0] = r8
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r5, r9, r7)
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r10 = r10 * r6
            long r10 = (long) r10
            r7.setDuration(r10)
            float r10 = r5.getTranslationX()
            int r11 = r12.y(r5, r4, r1)
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0094
            float[] r8 = new float[r3]
            r10 = 0
            r8[r0] = r10
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r5, r9, r8)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r6 * r9
            long r9 = (long) r6
            r8.setDuration(r9)
            y7.d r6 = new y7.d
            r6.<init>(r12, r5, r4, r1)
            r8.addListener(r6)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r0] = r8
            r4[r3] = r7
            r1.playSequentially(r4)
            r2.add(r1)
            goto L_0x009f
        L_0x0094:
            float r1 = r5.getAlpha()
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x009f
            r2.add(r7)
        L_0x009f:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.playTogether(r2)
            r12.f5731v0 = r1
            y7.c r2 = new y7.c
            r2.<init>(r12)
            r1.addListener(r2)
            android.animation.Animator r1 = r12.f5731v0
            r1.start()
        L_0x00b6:
            int r1 = r12.f5732w0
            if (r1 == r13) goto L_0x013b
            boolean r1 = d2.i0.g.c(r12)
            if (r1 != 0) goto L_0x00c2
            goto L_0x013b
        L_0x00c2:
            android.animation.Animator r1 = r12.f5730u0
            if (r1 == 0) goto L_0x00c9
            r1.cancel()
        L_0x00c9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.f5733x0
            r4 = 0
            if (r2 != r3) goto L_0x00f8
            android.view.View r2 = r12.w()
            boolean r5 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto L_0x00de
            r4 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        L_0x00de:
            float[] r2 = new float[r3]
            float r3 = r12.z(r13)
            r2[r0] = r3
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r0, r2)
            int r2 = r12.getFabAlignmentAnimationDuration()
            long r2 = (long) r2
            r0.setDuration(r2)
            r1.add(r0)
            goto L_0x0114
        L_0x00f8:
            android.view.View r0 = r12.w()
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r2 == 0) goto L_0x0103
            r4 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        L_0x0103:
            if (r4 == 0) goto L_0x0114
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x010c
            goto L_0x0114
        L_0x010c:
            y7.b r0 = new y7.b
            r0.<init>(r12, r13)
            r4.g(r0, r3)
        L_0x0114:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            android.content.Context r1 = r12.getContext()
            android.view.animation.LinearInterpolator r2 = v7.a.f16228a
            r3 = 2130903972(0x7f0303a4, float:1.7414777E38)
            android.animation.TimeInterpolator r1 = n8.a.d(r1, r3, r2)
            r0.setInterpolator(r1)
            r12.f5730u0 = r0
            y7.a r1 = new y7.a
            r1.<init>(r12)
            r0.addListener(r1)
            android.animation.Animator r0 = r12.f5730u0
            r0.start()
        L_0x013b:
            r12.f5732w0 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setFabAlignmentMode(int):void");
    }

    public void setFabAlignmentModeEndMargin(int i8) {
        if (this.f5735z0 != i8) {
            this.f5735z0 = i8;
            B();
            throw null;
        }
    }

    public void setFabAnchorMode(int i8) {
        this.f5734y0 = i8;
        B();
        throw null;
    }

    public void setFabAnimationMode(int i8) {
        this.f5733x0 = i8;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f17318d) {
            getTopEdgeTreatment().f17318d = f10;
            throw null;
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f17316b = f10;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f17315a = f10;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.B0 = z10;
    }

    public void setMenuAlignmentMode(int i8) {
        if (this.A0 != i8) {
            this.A0 = i8;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                D(actionMenuView, this.f5732w0, A(), false);
            }
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f5729t0 == null)) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f5729t0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i8) {
        this.f5729t0 = Integer.valueOf(i8);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View w() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            q1.a r2 = r0.f1710b
            java.lang.Object r2 = r2.f12825b
            o.f r2 = (o.f) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.f1712d
            r0.clear()
            if (r2 == 0) goto L_0x0026
            r0.addAll(r2)
        L_0x0026:
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x003e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x002a
        L_0x003e:
            return r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.w():android.view.View");
    }

    public final int y(ActionMenuView actionMenuView, int i8, boolean z10) {
        int i10;
        if (this.A0 != 1 && (i8 != 1 || !z10)) {
            return 0;
        }
        boolean c3 = v.c(this);
        int measuredWidth = c3 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f7613a & 8388615) == 8388611) {
                measuredWidth = c3 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = c3 ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            i10 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!c3) {
                i10 = -i10;
            }
        } else {
            i10 = 0;
        }
        return measuredWidth - ((right + 0) + i10);
    }

    public final float z(int i8) {
        boolean c3 = v.c(this);
        int i10 = 1;
        if (i8 != 1) {
            return 0.0f;
        }
        View w10 = w();
        int i11 = 0;
        if (!(this.f5735z0 == -1 || w10 == null)) {
            i11 = 0 + (w10.getMeasuredWidth() / 2) + this.f5735z0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - i11;
        if (c3) {
            i10 = -1;
        }
        return (float) (measuredWidth * i10);
    }

    public Behavior getBehavior() {
        if (this.E0 == null) {
            this.E0 = new Behavior();
        }
        return this.E0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f5736j = new Rect();

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<BottomAppBar> f5737k;

        /* renamed from: l  reason: collision with root package name */
        public int f5738l;
        public final a m = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f5737k.get();
                if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (!(view instanceof FloatingActionButton)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (behavior.f5738l == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        int i17 = bottomAppBar.f5734y0;
                        if (i17 == 1) {
                            fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                        } else if (i17 == 0) {
                            fVar.bottomMargin = ((bottomAppBar.getBottomInset() + bottomAppBar.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
                        }
                        fVar.leftMargin = bottomAppBar.getLeftInset();
                        fVar.rightMargin = bottomAppBar.getRightInset();
                        if (v.c(view)) {
                            fVar.leftMargin += 0;
                        } else {
                            fVar.rightMargin += 0;
                        }
                    }
                } else {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f5736j.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
            }
        }

        public Behavior() {
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f5737k = new WeakReference<>(bottomAppBar);
            int i10 = BottomAppBar.F0;
            View w10 = bottomAppBar.w();
            if (w10 != null) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (!i0.g.c(w10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) w10.getLayoutParams();
                    fVar.f1719d = 17;
                    int i11 = bottomAppBar.f5734y0;
                    if (i11 == 1) {
                        fVar.f1719d = 49;
                    }
                    if (i11 == 0) {
                        fVar.f1719d |= 80;
                    }
                    this.f5738l = ((CoordinatorLayout.f) w10.getLayoutParams()).bottomMargin;
                    if (w10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) w10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new e(bottomAppBar));
                        floatingActionButton.e();
                    }
                    w10.addOnLayoutChangeListener(this.m);
                    bottomAppBar.B();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i8);
            super.h(coordinatorLayout, bottomAppBar, i8);
            return false;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i8, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
