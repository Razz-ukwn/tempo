package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.c;
import java.util.Calendar;

public final class l extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f5892a = f0.d((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f5893b = f0.d((Calendar) null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f5894c;

    public l(j jVar) {
        this.f5894c = jVar;
    }

    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof h0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            h0 h0Var = (h0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c<Long, Long> cVar : this.f5894c.f5888x0.g()) {
                cVar.getClass();
            }
        }
    }
}
