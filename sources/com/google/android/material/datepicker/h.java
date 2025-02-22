package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f5881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f5882b;

    public h(j jVar, z zVar) {
        this.f5882b = jVar;
        this.f5881a = zVar;
    }

    public final void onClick(View view) {
        j jVar = this.f5882b;
        int O0 = ((LinearLayoutManager) jVar.E0.getLayoutManager()).O0() - 1;
        if (O0 >= 0) {
            Calendar b10 = f0.b(this.f5881a.f5938d.f5844a.f5926a);
            b10.add(2, O0);
            jVar.o0(new w(b10));
        }
    }
}
