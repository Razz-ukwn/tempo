package com.google.android.material.datepicker;

import android.view.View;

public final class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f5921a;

    public t(r rVar) {
        this.f5921a = rVar;
    }

    public final void onClick(View view) {
        r rVar = this.f5921a;
        rVar.f5910h1.setEnabled(rVar.t0().l());
        rVar.f5908f1.toggle();
        rVar.y0(rVar.f5908f1);
        rVar.x0();
    }
}
