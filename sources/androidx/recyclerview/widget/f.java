package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2643a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2644b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2645c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f2646d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, e eVar, RecyclerView.b0 b0Var) {
        this.f2646d = eVar;
        this.f2643a = b0Var;
        this.f2644b = viewPropertyAnimator;
        this.f2645c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2644b.setListener((Animator.AnimatorListener) null);
        this.f2645c.setAlpha(1.0f);
        e eVar = this.f2646d;
        RecyclerView.b0 b0Var = this.f2643a;
        eVar.g(b0Var);
        eVar.f2624q.remove(b0Var);
        eVar.o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2646d.getClass();
    }
}
