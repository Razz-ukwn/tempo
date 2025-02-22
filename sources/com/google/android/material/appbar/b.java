package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import e2.m;

public final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f5696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f5698c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5699d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5700e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) {
        this.f5700e = baseBehavior;
        this.f5696a = coordinatorLayout;
        this.f5697b = appBarLayout;
        this.f5698c = view;
        this.f5699d = i8;
    }

    public final boolean a(View view) {
        this.f5700e.E(this.f5696a, this.f5697b, this.f5698c, this.f5699d, new int[]{0, 0});
        return true;
    }
}
