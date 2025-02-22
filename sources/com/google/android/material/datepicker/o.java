package com.google.android.material.datepicker;

import android.view.View;

public final class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f5899a;

    public o(j jVar) {
        this.f5899a = jVar;
    }

    public final void onClick(View view) {
        j jVar = this.f5899a;
        int i8 = jVar.B0;
        if (i8 == 2) {
            jVar.p0(1);
        } else if (i8 == 1) {
            jVar.p0(2);
        }
    }
}
