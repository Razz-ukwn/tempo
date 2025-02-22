package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16988a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i8) {
        this.f16988a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16988a.c();
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f16988a;
        h hVar = baseTransientBottomBar.f6065j;
        int i8 = baseTransientBottomBar.f6057b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f6084a.setAlpha(1.0f);
        long j10 = (long) i8;
        ViewPropertyAnimator duration = snackbarContentLayout.f6084a.animate().alpha(0.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f6086c;
        long j11 = (long) 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f6085b.getVisibility() == 0) {
            snackbarContentLayout.f6085b.setAlpha(1.0f);
            snackbarContentLayout.f6085b.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
