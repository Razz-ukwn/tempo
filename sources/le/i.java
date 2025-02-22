package le;

import androidx.lifecycle.w;
import sf.j;

public final class i<T> implements w<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f11091a;

    public i(j jVar) {
        this.f11091a = jVar;
    }

    public final void b(Object obj) {
        Boolean bool = (Boolean) obj;
        j jVar = this.f11091a;
        oe.i iVar = jVar.f11094y0;
        if (iVar != null) {
            oe.i.h(iVar, jVar.D0, jVar.E0, jVar.F0);
        } else {
            j.l("viewModel");
            throw null;
        }
    }
}
