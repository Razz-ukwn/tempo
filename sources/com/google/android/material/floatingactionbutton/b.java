package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5955b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f5956c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5957d;

    public b(d dVar, boolean z10, a aVar) {
        this.f5957d = dVar;
        this.f5955b = z10;
        this.f5956c = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f5954a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f5957d;
        dVar.m = 0;
        dVar.f5970g = null;
        if (!this.f5954a) {
            boolean z10 = this.f5955b;
            dVar.f5979q.b(z10 ? 8 : 4, z10);
            d.g gVar = this.f5956c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f5952a.a(aVar.f5953b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f5957d;
        dVar.f5979q.b(0, this.f5955b);
        dVar.m = 1;
        dVar.f5970g = animator;
        this.f5954a = false;
    }
}
