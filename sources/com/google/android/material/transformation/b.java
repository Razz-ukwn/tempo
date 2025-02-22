package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import f8.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f6266b;

    public b(d dVar, Drawable drawable) {
        this.f6265a = dVar;
        this.f6266b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6265a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6265a.setCircularRevealOverlayDrawable(this.f6266b);
    }
}
