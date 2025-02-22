package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f135a;

    public d(e eVar) {
        this.f135a = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f135a.f165b.g(false);
    }
}
