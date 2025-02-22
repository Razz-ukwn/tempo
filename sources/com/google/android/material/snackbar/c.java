package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import v2.b;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6090a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i8) {
        this.f6090a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        b bVar = BaseTransientBottomBar.f6050t;
        this.f6090a.f6064i.setTranslationY((float) intValue);
    }
}
