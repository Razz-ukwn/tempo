package c8;

import a9.e;
import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3844b;

    public /* synthetic */ a(Object obj, int i8) {
        this.f3843a = i8;
        this.f3844b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i8 = this.f3843a;
        Object obj = this.f3844b;
        switch (i8) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f3856j.setAlpha((int) (255.0f * floatValue));
                cVar.f3869x = floatValue;
                return;
            default:
                e eVar = (e) obj;
                eVar.getClass();
                eVar.f167d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
