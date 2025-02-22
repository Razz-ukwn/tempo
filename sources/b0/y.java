package b0;

import ff.m;
import rf.a;
import rf.l;
import sf.j;
import sf.k;

public final class y extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f2988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a<m> f2989b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(w wVar, a<m> aVar) {
        super(0);
        this.f2988a = wVar;
        this.f2989b = aVar;
    }

    public final Object d() {
        h hVar;
        h i8;
        z zVar = this.f2988a.f2968e;
        a<m> aVar = this.f2989b;
        j.f(aVar, "block");
        if (zVar == null) {
            aVar.d();
        } else {
            h hVar2 = (h) m.f2941b.f();
            if (hVar2 == null || (hVar2 instanceof b)) {
                hVar = new i0(hVar2 instanceof b ? (b) hVar2 : null, zVar, (l<Object, m>) null, true, false);
            } else {
                hVar = hVar2.r(zVar);
            }
            try {
                i8 = hVar.i();
                aVar.d();
                h.o(i8);
                hVar.c();
            } catch (Throwable th) {
                hVar.c();
                throw th;
            }
        }
        return m.f8717a;
    }
}
