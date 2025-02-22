package a9;

import android.animation.ValueAnimator;

public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f147a;

    public /* synthetic */ j(n nVar) {
        this.f147a = nVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n nVar = this.f147a;
        nVar.getClass();
        nVar.f167d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
