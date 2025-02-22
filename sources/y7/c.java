package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f17308a;

    public c(BottomAppBar bottomAppBar) {
        this.f17308a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f17308a;
        bottomAppBar.getClass();
        bottomAppBar.f5731v0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f17308a.getClass();
    }
}
