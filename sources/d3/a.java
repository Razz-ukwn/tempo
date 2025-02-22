package d3;

import androidx.fragment.app.i0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p;
import java.util.LinkedHashSet;
import sf.j;
import sf.y;

public final /* synthetic */ class a implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f7287a;

    public /* synthetic */ a(c cVar) {
        this.f7287a = cVar;
    }

    public final void a(i0 i0Var, p pVar) {
        c cVar = this.f7287a;
        j.f(cVar, "this$0");
        LinkedHashSet linkedHashSet = cVar.f7291e;
        String str = pVar.V;
        y.a(linkedHashSet);
        if (linkedHashSet.remove(str)) {
            pVar.f2075l0.a(cVar.f7292f);
        }
    }
}
