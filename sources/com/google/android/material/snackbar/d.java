package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import v2.b;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6091a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6091a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        b bVar = BaseTransientBottomBar.f6050t;
        this.f6091a.f6064i.setTranslationY((float) intValue);
    }
}
