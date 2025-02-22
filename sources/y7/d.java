package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f17310b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17311c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f17312d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f17313e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i8, boolean z10) {
        this.f17313e = bottomAppBar;
        this.f17310b = actionMenuView;
        this.f17311c = i8;
        this.f17312d = z10;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f17309a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f17309a) {
            BottomAppBar bottomAppBar = this.f17313e;
            int i8 = bottomAppBar.C0;
            boolean z10 = i8 != 0;
            if (i8 != 0) {
                bottomAppBar.C0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i8);
            }
            bottomAppBar.D(this.f17310b, this.f17311c, this.f17312d, z10);
        }
    }
}
