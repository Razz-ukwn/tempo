package e;

import android.view.View;
import d2.d1;
import d2.e1;
import d2.f1;
import d2.i0;
import java.util.WeakHashMap;

public final class j extends f1 {
    public final /* synthetic */ f C;

    public j(f fVar) {
        this.C = fVar;
    }

    public final void a() {
        f fVar = this.C;
        fVar.R.setAlpha(1.0f);
        fVar.U.d((e1) null);
        fVar.U = null;
    }

    public final void d() {
        f fVar = this.C;
        fVar.R.setVisibility(0);
        if (fVar.R.getParent() instanceof View) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c((View) fVar.R.getParent());
        }
    }
}
