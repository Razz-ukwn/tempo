package o5;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.quickkonnect.silencio.R;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f12182a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimatorSet f12183b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimatorSet f12184c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12185d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12186e;

    public d(View view, float f10, float f11) {
        this.f12182a = view;
        this.f12185d = f10;
        this.f12186e = f11;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_hide);
        this.f12183b = animatorSet;
        animatorSet.setStartDelay((long) 1000);
        animatorSet.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_show);
        this.f12184c = animatorSet2;
        animatorSet2.setTarget(view);
        animatorSet.addListener(new c(view));
        a();
    }

    public final void a() {
        View view = this.f12182a;
        view.setPivotX(this.f12185d * ((float) view.getMeasuredWidth()));
        view.setPivotY(this.f12186e * ((float) view.getMeasuredHeight()));
    }
}
