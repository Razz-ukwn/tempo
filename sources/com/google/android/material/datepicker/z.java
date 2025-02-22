package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.h0;
import d2.i0;
import java.util.Calendar;
import java.util.WeakHashMap;

public final class z extends RecyclerView.e<a> {
    public final f B;
    public final j.d C;
    public final int D;

    /* renamed from: d  reason: collision with root package name */
    public final a f5938d;

    /* renamed from: e  reason: collision with root package name */
    public final d<?> f5939e;

    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f5940u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f5941v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f5940u = textView;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            new h0().e(textView, Boolean.TRUE);
            this.f5941v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public z(ContextThemeWrapper contextThemeWrapper, d dVar, a aVar, f fVar, j.c cVar) {
        Calendar calendar = aVar.f5844a.f5926a;
        w wVar = aVar.f5847d;
        if (calendar.compareTo(wVar.f5926a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (wVar.f5926a.compareTo(aVar.f5845b.f5926a) <= 0) {
            int i8 = x.C;
            int i10 = j.J0;
            this.D = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i8) + (r.v0(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f5938d = aVar;
            this.f5939e = dVar;
            this.B = fVar;
            this.C = cVar;
            if (!this.f2459a.a()) {
                this.f2460b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int d() {
        return this.f5938d.C;
    }

    public final long e(int i8) {
        Calendar b10 = f0.b(this.f5938d.f5844a.f5926a);
        b10.add(2, i8);
        return new w(b10).f5926a.getTimeInMillis();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        a aVar = (a) b0Var;
        a aVar2 = this.f5938d;
        Calendar b10 = f0.b(aVar2.f5844a.f5926a);
        b10.add(2, i8);
        w wVar = new w(b10);
        aVar.f5940u.setText(wVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f5941v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !wVar.equals(materialCalendarGridView.getAdapter().f5931a)) {
            x xVar = new x(wVar, this.f5939e, aVar2, this.B);
            materialCalendarGridView.setNumColumns(wVar.f5929d);
            materialCalendarGridView.setAdapter((ListAdapter) xVar);
        } else {
            materialCalendarGridView.invalidate();
            x a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f5933c) {
                a10.e(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a10.f5932b;
            if (dVar != null) {
                for (Long longValue2 : dVar.o()) {
                    a10.e(materialCalendarGridView, longValue2.longValue());
                }
                a10.f5933c = dVar.o();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new y(this, materialCalendarGridView));
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!r.v0(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.D));
        return new a(linearLayout, true);
    }
}
