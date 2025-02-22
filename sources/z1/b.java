package z1;

import ag.v1;
import u1.f;
import v1.h;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v1 f17624a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17625b;

    public b(v1 v1Var, int i8) {
        this.f17624a = v1Var;
        this.f17625b = i8;
    }

    public final void run() {
        f.e eVar = ((h.a) this.f17624a).L;
        if (eVar != null) {
            eVar.c(this.f17625b);
        }
    }
}
