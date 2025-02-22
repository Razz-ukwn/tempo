package d2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f7198a;

    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public d1(View view) {
        this.f7198a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f7198a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f7198a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f7198a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(e1 e1Var) {
        View view = this.f7198a.get();
        if (view == null) {
            return;
        }
        if (e1Var != null) {
            view.animate().setListener(new c1(e1Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f10) {
        View view = this.f7198a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
