package com.google.android.material.datepicker;

import android.view.View;
import d2.j1;
import d2.z;

public final class s implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5918a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5919b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5920c;

    public s(int i8, View view, int i10) {
        this.f5918a = i8;
        this.f5919b = view;
        this.f5920c = i10;
    }

    public final j1 a(View view, j1 j1Var) {
        int i8 = j1Var.f7237a.f(7).f16122b;
        View view2 = this.f5919b;
        int i10 = this.f5918a;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i8;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f5920c + i8, view2.getPaddingRight(), view2.getPaddingBottom());
        return j1Var;
    }
}
