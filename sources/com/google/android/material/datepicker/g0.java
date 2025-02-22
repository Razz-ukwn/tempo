package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

public final class g0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h0 f5880b;

    public g0(h0 h0Var, int i8) {
        this.f5880b = h0Var;
        this.f5879a = i8;
    }

    public final void onClick(View view) {
        h0 h0Var = this.f5880b;
        w a10 = w.a(this.f5879a, h0Var.f5883d.A0.f5927b);
        j<?> jVar = h0Var.f5883d;
        a aVar = jVar.f5889y0;
        w wVar = aVar.f5844a;
        Calendar calendar = wVar.f5926a;
        Calendar calendar2 = a10.f5926a;
        if (calendar2.compareTo(calendar) < 0) {
            a10 = wVar;
        } else {
            w wVar2 = aVar.f5845b;
            if (calendar2.compareTo(wVar2.f5926a) > 0) {
                a10 = wVar2;
            }
        }
        jVar.o0(a10);
        jVar.p0(1);
    }
}
