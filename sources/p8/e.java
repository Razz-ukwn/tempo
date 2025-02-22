package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12494a;

    public e(g gVar) {
        this.f12494a = gVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        g gVar = this.f12494a;
        gVar.f12504h = (gVar.f12504h + 4) % gVar.f12503g.f12486c.length;
    }
}
