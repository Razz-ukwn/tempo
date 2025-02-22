package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f134a;

    public c(e eVar) {
        this.f134a = eVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f134a.f165b.g(true);
    }
}
