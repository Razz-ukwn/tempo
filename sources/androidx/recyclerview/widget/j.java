package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.d f2661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2662b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2663c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f2664d;

    public j(e eVar, e.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2664d = eVar;
        this.f2661a = dVar;
        this.f2662b = viewPropertyAnimator;
        this.f2663c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2662b.setListener((Animator.AnimatorListener) null);
        View view = this.f2663c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        e.d dVar = this.f2661a;
        RecyclerView.b0 b0Var = dVar.f2633b;
        e eVar = this.f2664d;
        eVar.g(b0Var);
        eVar.f2625r.remove(dVar.f2633b);
        eVar.o();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f2661a.f2633b;
        this.f2664d.getClass();
    }
}
