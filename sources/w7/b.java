package w7;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import d2.d1;
import d2.i0;
import d2.j1;
import d2.z;
import java.util.WeakHashMap;

public final class b implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16497a;

    public b(AppBarLayout appBarLayout) {
        this.f16497a = appBarLayout;
    }

    public final j1 a(View view, j1 j1Var) {
        AppBarLayout appBarLayout = this.f16497a;
        appBarLayout.getClass();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        j1 j1Var2 = i0.d.b(appBarLayout) ? j1Var : null;
        if (!c2.b.a(appBarLayout.C, j1Var2)) {
            appBarLayout.C = j1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.Q != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return j1Var;
    }
}
