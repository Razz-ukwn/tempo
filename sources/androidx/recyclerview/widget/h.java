package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2651a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2652b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2653c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2654d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2655e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f2656f;

    public h(e eVar, RecyclerView.b0 b0Var, int i8, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2656f = eVar;
        this.f2651a = b0Var;
        this.f2652b = i8;
        this.f2653c = view;
        this.f2654d = i10;
        this.f2655e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i8 = this.f2652b;
        View view = this.f2653c;
        if (i8 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2654d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2655e.setListener((Animator.AnimatorListener) null);
        e eVar = this.f2656f;
        RecyclerView.b0 b0Var = this.f2651a;
        eVar.g(b0Var);
        eVar.f2623p.remove(b0Var);
        eVar.o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f2656f.getClass();
    }
}
