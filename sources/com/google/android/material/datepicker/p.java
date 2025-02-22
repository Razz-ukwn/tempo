package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f5900a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f5901b;

    public p(j jVar, z zVar) {
        this.f5901b = jVar;
        this.f5900a = zVar;
    }

    public final void onClick(View view) {
        j jVar = this.f5901b;
        int N0 = ((LinearLayoutManager) jVar.E0.getLayoutManager()).N0() + 1;
        if (N0 < jVar.E0.getAdapter().d()) {
            Calendar b10 = f0.b(this.f5900a.f5938d.f5844a.f5926a);
            b10.add(2, N0);
            jVar.o0(new w(b10));
        }
    }
}
