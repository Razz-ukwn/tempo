package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f5693a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5694b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5695c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f5695c = baseBehavior;
        this.f5693a = coordinatorLayout;
        this.f5694b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f5695c.A(this.f5693a, this.f5694b, intValue);
    }
}
