package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import x8.b;
import x8.g;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6093a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6093a = baseTransientBottomBar;
    }

    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f6093a;
        BaseTransientBottomBar.e eVar = baseTransientBottomBar.f6064i;
        if (eVar != null) {
            ViewParent parent = eVar.getParent();
            BaseTransientBottomBar.e eVar2 = baseTransientBottomBar.f6064i;
            if (parent != null) {
                eVar2.setVisibility(0);
            }
            if (eVar2.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(baseTransientBottomBar.f6059d);
                ofFloat.addUpdateListener(new a(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(baseTransientBottomBar.f6061f);
                ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration((long) baseTransientBottomBar.f6056a);
                animatorSet.addListener(new g(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            int height = eVar2.getHeight();
            ViewGroup.LayoutParams layoutParams = eVar2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            eVar2.setTranslationY((float) height);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(baseTransientBottomBar.f6060e);
            valueAnimator.setDuration((long) baseTransientBottomBar.f6058c);
            valueAnimator.addListener(new b(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
            valueAnimator.start();
        }
    }
}
