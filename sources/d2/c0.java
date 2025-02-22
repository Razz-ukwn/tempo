package d2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class c0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f7193a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f7194b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f7195c;

    public c0(ViewGroup viewGroup, Runnable runnable) {
        this.f7193a = viewGroup;
        this.f7194b = viewGroup.getViewTreeObserver();
        this.f7195c = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            c0 c0Var = new c0(viewGroup, runnable);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(c0Var);
            viewGroup.addOnAttachStateChangeListener(c0Var);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f7194b.isAlive();
        View view = this.f7193a;
        if (isAlive) {
            this.f7194b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f7195c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f7194b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f7194b.isAlive();
        View view2 = this.f7193a;
        if (isAlive) {
            this.f7194b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
