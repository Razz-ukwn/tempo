package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2648b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2649c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f2650d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, e eVar, RecyclerView.b0 b0Var) {
        this.f2650d = eVar;
        this.f2647a = b0Var;
        this.f2648b = view;
        this.f2649c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2648b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2649c.setListener((Animator.AnimatorListener) null);
        e eVar = this.f2650d;
        RecyclerView.b0 b0Var = this.f2647a;
        eVar.g(b0Var);
        eVar.f2622o.remove(b0Var);
        eVar.o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2650d.getClass();
    }
}
