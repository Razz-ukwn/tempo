package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f6158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f6159b;

    public c(TabLayout.i iVar, View view) {
        this.f6159b = iVar;
        this.f6158a = view;
    }

    public final void onLayoutChange(View view, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f6158a;
        if (view2.getVisibility() == 0) {
            this.f6159b.c(view2);
        }
    }
}
