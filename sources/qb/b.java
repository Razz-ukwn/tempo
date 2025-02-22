package qb;

import androidx.lifecycle.w;
import sf.j;

public final /* synthetic */ class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f13472b;

    public /* synthetic */ b(c cVar, w wVar) {
        this.f13471a = cVar;
        this.f13472b = wVar;
    }

    public final void b(Object obj) {
        c cVar = this.f13471a;
        j.f(cVar, "this$0");
        w wVar = this.f13472b;
        j.f(wVar, "$observer");
        if (cVar.f13473l.compareAndSet(true, false)) {
            wVar.b(obj);
        }
    }
}
