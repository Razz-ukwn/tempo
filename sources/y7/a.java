package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f17304a;

    public a(BottomAppBar bottomAppBar) {
        this.f17304a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f17304a;
        bottomAppBar.getClass();
        bottomAppBar.f5730u0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f17304a.getClass();
    }
}
