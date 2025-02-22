package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f6155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6156b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TabLayout.f f6157c;

    public b(TabLayout.f fVar, View view, View view2) {
        this.f6157c = fVar;
        this.f6155a = view;
        this.f6156b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6157c.c(this.f6155a, this.f6156b, valueAnimator.getAnimatedFraction());
    }
}
