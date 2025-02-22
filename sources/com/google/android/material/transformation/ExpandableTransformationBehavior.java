package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import d9.a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f6247b;

    public ExpandableTransformationBehavior() {
    }

    public void s(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f6247b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet t2 = t(view, view2, z10, z12);
        this.f6247b = t2;
        t2.addListener(new a(this));
        this.f6247b.start();
        if (!z11) {
            this.f6247b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
