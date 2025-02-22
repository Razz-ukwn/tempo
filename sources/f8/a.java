package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f8601a;

    public a(d dVar) {
        this.f8601a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8601a.b();
    }

    public final void onAnimationStart(Animator animator) {
        this.f8601a.a();
    }
}
