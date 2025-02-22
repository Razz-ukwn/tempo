package b3;

import android.os.Bundle;
import b3.m0;
import rf.l;
import sf.j;
import sf.k;

public final class n0 extends k implements l<j, j> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0<z> f3147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f3148b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m0.a f3149c = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(m0 m0Var, f0 f0Var) {
        super(1);
        this.f3147a = m0Var;
        this.f3148b = f0Var;
    }

    public final Object invoke(Object obj) {
        j jVar = (j) obj;
        j.f(jVar, "backStackEntry");
        z zVar = jVar.f3084b;
        if (!(zVar instanceof z)) {
            zVar = null;
        }
        if (zVar == null) {
            return null;
        }
        m0<z> m0Var = this.f3147a;
        Bundle bundle = jVar.f3085c;
        z c3 = m0Var.c(zVar, bundle, this.f3148b, this.f3149c);
        if (c3 == null) {
            jVar = null;
        } else if (!j.a(c3, zVar)) {
            jVar = m0Var.b().a(c3, c3.b(bundle));
        }
        return jVar;
    }
}
