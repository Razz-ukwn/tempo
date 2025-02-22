package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class b0 extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2588a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2589b = new a();

    public class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2590a = false;

        public a() {
        }

        public final void a(int i8, RecyclerView recyclerView) {
            if (i8 == 0 && this.f2590a) {
                this.f2590a = false;
                b0.this.d();
            }
        }

        public final void b(RecyclerView recyclerView, int i8, int i10) {
            if (i8 != 0 || i10 != 0) {
                this.f2590a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2588a;
        if (recyclerView2 != recyclerView) {
            a aVar = this.f2589b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.F0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                this.f2588a.setOnFlingListener((RecyclerView.p) null);
            }
            this.f2588a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f2588a.h(aVar);
                this.f2588a.setOnFlingListener(this);
                new Scroller(this.f2588a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public abstract View c(RecyclerView.m mVar);

    public final void d() {
        RecyclerView.m layoutManager;
        View c3;
        RecyclerView recyclerView = this.f2588a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c3 = c(layoutManager)) != null) {
            int[] b10 = b(layoutManager, c3);
            int i8 = b10[0];
            if (i8 != 0 || b10[1] != 0) {
                this.f2588a.b0(i8, b10[1], false);
            }
        }
    }
}
