package a8;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import v8.f;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f125a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f125a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f125a.f5758i;
        if (fVar != null) {
            fVar.n(floatValue);
        }
    }
}
