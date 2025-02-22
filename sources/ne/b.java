package ne;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import sf.j;

public final class b extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final int f11897a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11898b = 5;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11899c = false;

    public b(int i8) {
        this.f11897a = i8;
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(yVar, "state");
        RecyclerView.b0 J = RecyclerView.J(view);
        int c3 = J != null ? J.c() : -1;
        int i8 = this.f11897a;
        int i10 = c3 % i8;
        boolean z10 = this.f11899c;
        int i11 = this.f11898b;
        if (z10) {
            rect.left = i11 - ((i10 * i11) / i8);
            rect.right = ((i10 + 1) * i11) / i8;
            if (c3 < i8) {
                rect.top = i11;
            }
            rect.bottom = i11;
            return;
        }
        rect.left = (i10 * i11) / i8;
        rect.right = i11 - (((i10 + 1) * i11) / i8);
        if (c3 >= i8) {
            rect.top = i11;
        }
    }
}
