package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16987a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16987a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16987a.d();
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f16987a;
        h hVar = baseTransientBottomBar.f6065j;
        int i8 = baseTransientBottomBar.f6058c;
        int i10 = baseTransientBottomBar.f6056a;
        int i11 = i8 - i10;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) hVar;
        snackbarContentLayout.f6084a.setAlpha(0.0f);
        long j10 = (long) i10;
        ViewPropertyAnimator duration = snackbarContentLayout.f6084a.animate().alpha(1.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f6086c;
        long j11 = (long) i11;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (snackbarContentLayout.f6085b.getVisibility() == 0) {
            snackbarContentLayout.f6085b.setAlpha(0.0f);
            snackbarContentLayout.f6085b.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }
}
