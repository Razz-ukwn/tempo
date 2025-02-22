package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6089a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6089a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f6089a;
        baseTransientBottomBar.f6064i.setScaleX(floatValue);
        baseTransientBottomBar.f6064i.setScaleY(floatValue);
    }
}
