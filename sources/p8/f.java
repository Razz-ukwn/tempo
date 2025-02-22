package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import s3.c;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12495a;

    public f(g gVar) {
        this.f12495a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        g gVar = this.f12495a;
        gVar.c();
        c cVar = gVar.f12507k;
        if (cVar != null) {
            cVar.a((n) gVar.f9343a);
        }
    }
}
