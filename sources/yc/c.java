package yc;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.onboarding.OnBoardingFragment;
import nc.y0;
import sf.j;

public final class c extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnBoardingFragment f17335a;

    public c(OnBoardingFragment onBoardingFragment) {
        this.f17335a = onBoardingFragment;
    }

    public final void c(int i8) {
        OnBoardingFragment onBoardingFragment = this.f17335a;
        if (i8 == 4) {
            onBoardingFragment.f6800x0 = true;
        }
        y0 y0Var = onBoardingFragment.f6798v0;
        j.c(y0Var);
        ((MaterialButton) y0Var.f11874b).setEnabled(onBoardingFragment.f6800x0);
    }
}
