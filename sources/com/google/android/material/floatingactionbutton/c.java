package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f5958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f5959b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f5960c;

    public c(d dVar, boolean z10, a aVar) {
        this.f5960c = dVar;
        this.f5958a = z10;
        this.f5959b = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f5960c;
        dVar.m = 0;
        dVar.f5970g = null;
        d.g gVar = this.f5959b;
        if (gVar != null) {
            ((a) gVar).f5952a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f5960c;
        dVar.f5979q.b(0, this.f5958a);
        dVar.m = 2;
        dVar.f5970g = animator;
    }
}
