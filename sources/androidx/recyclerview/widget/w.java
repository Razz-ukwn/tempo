package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.d;

public final class w implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2755a;

    public w(RecyclerView recyclerView) {
        this.f2755a = recyclerView;
    }

    public final int a() {
        return this.f2755a.getChildCount();
    }

    public final void b(int i8) {
        RecyclerView recyclerView = this.f2755a;
        View childAt = recyclerView.getChildAt(i8);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i8);
    }
}
