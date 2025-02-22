package zb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import sf.j;

public final class a extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final int f17919a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17920b = true;

    /* renamed from: c  reason: collision with root package name */
    public final int f17921c = 12;

    public a(int i8) {
        this.f17919a = i8;
    }

    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        j.f(rect, "outRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(yVar, "state");
        RecyclerView.b0 J = RecyclerView.J(view);
        int c3 = J != null ? J.c() : -1;
        boolean z10 = this.f17920b;
        int i8 = this.f17919a;
        int i10 = this.f17921c;
        if (z10) {
            int i11 = c3 % i8;
            if (i11 == 0) {
                rect.left = i10;
                rect.right = i10 / 3;
            } else if (i11 == i8 - 1) {
                rect.right = i10;
                rect.left = i10 / 3;
            } else {
                int i12 = (i10 * 2) / 3;
                rect.left = i12;
                rect.right = i12;
            }
            if (c3 < i8) {
                rect.top = i10;
            }
            rect.bottom = i10;
            return;
        }
        int i13 = c3 % i8;
        if (i13 == 0) {
            rect.right = (i10 * 2) / 3;
        } else if (i13 == i8 - 1) {
            rect.left = (i10 * 2) / 3;
        } else {
            int i14 = i10 / 3;
            rect.left = i14;
            rect.right = i14;
        }
        if (c3 >= i8) {
            rect.top = i10;
        }
    }
}
