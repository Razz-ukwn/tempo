package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import o5.b;

public final class a extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final FastScroller f4142a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4143b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f4144c = 0;

    /* renamed from: com.futuremind.recyclerviewfastscroll.a$a  reason: collision with other inner class name */
    public interface C0066a {
        void a();
    }

    public a(FastScroller fastScroller) {
        this.f4142a = fastScroller;
    }

    public final void a(int i8, RecyclerView recyclerView) {
        FastScroller fastScroller = this.f4142a;
        if (i8 == 0 && this.f4144c != 0) {
            b viewProvider = fastScroller.getViewProvider();
            if (viewProvider.c() != null) {
                viewProvider.c().getClass();
            }
            if (viewProvider.a() != null) {
                viewProvider.a().getClass();
            }
        } else if (i8 != 0 && this.f4144c == 0) {
            b viewProvider2 = fastScroller.getViewProvider();
            if (viewProvider2.c() != null) {
                viewProvider2.c().getClass();
            }
            if (viewProvider2.a() != null) {
                viewProvider2.a().getClass();
            }
        }
        this.f4144c = i8;
    }

    public final void b(RecyclerView recyclerView, int i8, int i10) {
        FastScroller fastScroller = this.f4142a;
        if (fastScroller.f4139d != null && !fastScroller.H && fastScroller.f4137b.getChildCount() > 0) {
            c(recyclerView);
        }
    }

    public final void c(RecyclerView recyclerView) {
        int i8;
        int i10;
        int i11;
        FastScroller fastScroller = this.f4142a;
        if (fastScroller.c()) {
            i11 = recyclerView.computeVerticalScrollOffset();
            i10 = recyclerView.computeVerticalScrollExtent();
            i8 = recyclerView.computeVerticalScrollRange();
        } else {
            i11 = recyclerView.computeHorizontalScrollOffset();
            i10 = recyclerView.computeHorizontalScrollExtent();
            i8 = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(((float) i11) / ((float) (i8 - i10)));
        Iterator it = this.f4143b.iterator();
        while (it.hasNext()) {
            ((C0066a) it.next()).a();
        }
    }
}
