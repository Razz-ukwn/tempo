package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import java.util.Calendar;
import java.util.Locale;

public final class h0 extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final j<?> f5883d;

    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f5884u;

        public a(TextView textView) {
            super(textView);
            this.f5884u = textView;
        }
    }

    public h0(j<?> jVar) {
        this.f5883d = jVar;
    }

    public final int d() {
        return this.f5883d.f5889y0.B;
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        j<?> jVar = this.f5883d;
        int i10 = jVar.f5889y0.f5844a.f5928c + i8;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i10)});
        TextView textView = ((a) b0Var).f5884u;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(f0.c().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i10)}) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i10)}));
        c cVar = jVar.C0;
        Calendar c3 = f0.c();
        b bVar = c3.get(1) == i10 ? cVar.f5868f : cVar.f5866d;
        for (Long longValue : jVar.f5888x0.o()) {
            c3.setTimeInMillis(longValue.longValue());
            if (c3.get(1) == i10) {
                bVar = cVar.f5867e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new g0(this, i10));
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, recyclerView, false));
    }
}
