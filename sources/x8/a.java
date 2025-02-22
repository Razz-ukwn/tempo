package x8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f16986a;

    public a(BaseTransientBottomBar baseTransientBottomBar, int i8) {
        this.f16986a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16986a.c();
    }
}
