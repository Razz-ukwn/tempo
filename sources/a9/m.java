package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f150a;

    public m(n nVar) {
        this.f150a = nVar;
    }

    public final void onAnimationEnd(Animator animator) {
        n nVar = this.f150a;
        nVar.q();
        nVar.f163r.start();
    }
}
