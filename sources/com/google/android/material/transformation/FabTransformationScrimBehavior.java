package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import v7.h;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f6259c = new h(75);

    /* renamed from: d  reason: collision with root package name */
    public final h f6260d = new h(0);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6261a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f6262b;

        public a(boolean z10, View view) {
            this.f6261a = z10;
            this.f6262b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f6261a) {
                this.f6262b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f6261a) {
                this.f6262b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        h hVar = z10 ? this.f6259c : this.f6260d;
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        c.k(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
