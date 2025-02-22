package a9;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f132a;

    public /* synthetic */ a(e eVar) {
        this.f132a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        e eVar = this.f132a;
        eVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CheckableImageButton checkableImageButton = eVar.f167d;
        checkableImageButton.setScaleX(floatValue);
        checkableImageButton.setScaleY(floatValue);
    }
}
