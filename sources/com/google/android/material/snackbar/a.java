package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6088a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6088a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6088a.f6064i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
