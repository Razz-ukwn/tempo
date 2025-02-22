package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import f8.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6267a;

    public c(d dVar) {
        this.f6267a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f6267a;
        d.C0154d revealInfo = dVar.getRevealInfo();
        revealInfo.f8608c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
