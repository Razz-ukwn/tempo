package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16992a;

    public g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16992a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16992a.d();
    }
}
