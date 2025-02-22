package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12181b;

    public c(View view) {
        this.f12181b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f12180a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f12180a) {
            this.f12181b.setVisibility(4);
        }
        this.f12180a = false;
    }
}
