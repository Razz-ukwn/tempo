package r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f13846a;

    public m(k kVar) {
        this.f13846a = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13846a.p();
        animator.removeListener(this);
    }
}
