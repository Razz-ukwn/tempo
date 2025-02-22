package d9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f7385a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f7385a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7385a.f6247b = null;
    }
}
