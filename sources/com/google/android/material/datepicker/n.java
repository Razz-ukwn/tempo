package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

public final class n extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f5896a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f5897b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f5898c;

    public n(j jVar, z zVar, MaterialButton materialButton) {
        this.f5898c = jVar;
        this.f5896a = zVar;
        this.f5897b = materialButton;
    }

    public final void a(int i8, RecyclerView recyclerView) {
        if (i8 == 0) {
            recyclerView.announceForAccessibility(this.f5897b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i8, int i10) {
        j jVar = this.f5898c;
        int N0 = i8 < 0 ? ((LinearLayoutManager) jVar.E0.getLayoutManager()).N0() : ((LinearLayoutManager) jVar.E0.getLayoutManager()).O0();
        z zVar = this.f5896a;
        Calendar b10 = f0.b(zVar.f5938d.f5844a.f5926a);
        b10.add(2, N0);
        jVar.A0 = new w(b10);
        Calendar b11 = f0.b(zVar.f5938d.f5844a.f5926a);
        b11.add(2, N0);
        b11.set(5, 1);
        Calendar b12 = f0.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        this.f5897b.setText(DateUtils.formatDateTime((Context) null, b12.getTimeInMillis(), 8228));
    }
}
