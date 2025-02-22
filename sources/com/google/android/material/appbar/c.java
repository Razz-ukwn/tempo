package com.google.android.material.appbar;

import android.view.View;
import e2.m;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5701a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f5702b;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f5701a = appBarLayout;
        this.f5702b = z10;
    }

    public final boolean a(View view) {
        this.f5701a.setExpanded(this.f5702b);
        return true;
    }
}
