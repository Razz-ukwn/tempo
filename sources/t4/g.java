package t4;

import l5.i;
import p4.f;
import r4.n;
import r4.w;
import t4.h;

public final class g extends i<f, w<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f15355d;

    public g(long j10) {
        super(j10);
    }

    public final int b(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.a();
    }

    public final void c(Object obj, Object obj2) {
        f fVar = (f) obj;
        w wVar = (w) obj2;
        h.a aVar = this.f15355d;
        if (aVar != null && wVar != null) {
            ((n) aVar).f13938e.a(wVar, true);
        }
    }
}
