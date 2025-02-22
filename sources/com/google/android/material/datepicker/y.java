package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Iterator;

public final class y implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f5936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f5937b;

    public y(z zVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f5937b = zVar;
        this.f5936a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f5936a;
        x a10 = materialCalendarGridView.getAdapter();
        if (i8 >= a10.b() && i8 <= (a10.b() + a10.f5931a.f5930e) + -1) {
            j.d dVar = this.f5937b.C;
            long longValue = materialCalendarGridView.getAdapter().getItem(i8).longValue();
            j jVar = j.this;
            if (jVar.f5889y0.f5846c.k(longValue)) {
                jVar.f5888x0.b();
                Iterator<a0<S>> it = jVar.f5862v0.iterator();
                while (it.hasNext()) {
                    it.next().a(jVar.f5888x0.q());
                }
                jVar.E0.getAdapter().g();
                RecyclerView recyclerView = jVar.D0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().g();
                }
            }
        }
    }
}
