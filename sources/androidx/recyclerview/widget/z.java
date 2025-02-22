package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class z {
    public static int a(RecyclerView.y yVar, t tVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.w() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(RecyclerView.m.G(view) - RecyclerView.m.G(view2)) + 1;
        }
        return Math.min(tVar.l(), tVar.b(view2) - tVar.e(view));
    }

    public static int b(RecyclerView.y yVar, t tVar, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        if (mVar.w() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (yVar.b() - Math.max(RecyclerView.m.G(view), RecyclerView.m.G(view2))) - 1) : Math.max(0, Math.min(RecyclerView.m.G(view), RecyclerView.m.G(view2)));
        if (!z10) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(RecyclerView.m.G(view) - RecyclerView.m.G(view2)) + 1)))) + ((float) (tVar.k() - tVar.e(view))));
    }

    public static int c(RecyclerView.y yVar, t tVar, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.w() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return yVar.b();
        }
        return (int) ((((float) (tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(RecyclerView.m.G(view) - RecyclerView.m.G(view2)) + 1))) * ((float) yVar.b()));
    }
}
