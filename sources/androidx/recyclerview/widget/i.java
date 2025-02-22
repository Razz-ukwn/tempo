package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.d f2657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2658b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2659c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f2660d;

    public i(e eVar, e.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2660d = eVar;
        this.f2657a = dVar;
        this.f2658b = viewPropertyAnimator;
        this.f2659c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2658b.setListener((Animator.AnimatorListener) null);
        View view = this.f2659c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        e.d dVar = this.f2657a;
        RecyclerView.b0 b0Var = dVar.f2632a;
        e eVar = this.f2660d;
        eVar.g(b0Var);
        eVar.f2625r.remove(dVar.f2632a);
        eVar.o();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.b0 b0Var = this.f2657a.f2632a;
        this.f2660d.getClass();
    }
}
