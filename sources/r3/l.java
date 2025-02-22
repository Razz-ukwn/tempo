package r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import o.a;

public final class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f13844a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f13845b;

    public l(k kVar, a aVar) {
        this.f13845b = kVar;
        this.f13844a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13844a.remove(animator);
        this.f13845b.I.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f13845b.I.add(animator);
    }
}
