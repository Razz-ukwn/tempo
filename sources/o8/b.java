package o8;

import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f12218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f12219b;

    public b(a aVar, float f10) {
        this.f12219b = aVar;
        this.f12218a = f10;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12219b.b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f12218a);
    }
}
