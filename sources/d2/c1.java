package d2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class c1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f7196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f7197b;

    public c1(e1 e1Var, View view) {
        this.f7196a = e1Var;
        this.f7197b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f7196a.b(this.f7197b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7196a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f7196a.d();
    }
}
