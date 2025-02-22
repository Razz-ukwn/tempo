package f8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import f8.d;

public final class b {
    public static AnimatorSet a(d dVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.b.f8604a, d.a.f8602b, new d.C0154d[]{new d.C0154d(f10, f11, f12)});
        d.C0154d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f10, (int) f11, revealInfo.f8608c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
