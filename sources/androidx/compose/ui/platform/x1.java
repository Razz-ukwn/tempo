package androidx.compose.ui.platform;

import cb.d;
import d0.h;
import jf.f;
import rf.p;
import sf.j;
import t.b3;
import t.n1;

public final class x1 implements h {

    /* renamed from: a  reason: collision with root package name */
    public final n1 f1508a = d.R(Float.valueOf(1.0f), b3.f14997a);

    public final float L() {
        return ((Number) this.f1508a.getValue()).floatValue();
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        j.f(cVar, "key");
        return f.b.a.a(this, cVar);
    }

    public final f n0(f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final <R> R p(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final f w0(f.c<?> cVar) {
        j.f(cVar, "key");
        return f.b.a.b(this, cVar);
    }
}
