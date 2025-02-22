package vb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f16394a;

    public k(j jVar) {
        this.f16394a = jVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        j jVar = this.f16394a;
        jVar.postDelayed(jVar.D, 2000);
    }
}
