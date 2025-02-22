package r4;

import com.bumptech.glide.load.data.d;
import p4.f;
import r4.h;
import v4.n;

public final class a0 implements d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n.a f13868a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f13869b;

    public a0(b0 b0Var, n.a aVar) {
        this.f13869b = b0Var;
        this.f13868a = aVar;
    }

    public final void c(Exception exc) {
        b0 b0Var = this.f13869b;
        n.a<?> aVar = this.f13868a;
        n.a<?> aVar2 = b0Var.B;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f13869b;
            n.a aVar3 = this.f13868a;
            h.a aVar4 = b0Var2.f13872b;
            f fVar = b0Var2.C;
            d<Data> dVar = aVar3.f16190c;
            aVar4.d(fVar, exc, dVar, dVar.d());
        }
    }

    public final void f(Object obj) {
        b0 b0Var = this.f13869b;
        n.a<?> aVar = this.f13868a;
        n.a<?> aVar2 = b0Var.B;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f13869b;
            n.a aVar3 = this.f13868a;
            m mVar = b0Var2.f13871a.f13907p;
            if (obj == null || !mVar.c(aVar3.f16190c.d())) {
                h.a aVar4 = b0Var2.f13872b;
                f fVar = aVar3.f16188a;
                d<Data> dVar = aVar3.f16190c;
                aVar4.a(fVar, obj, dVar, dVar.d(), b0Var2.C);
                return;
            }
            b0Var2.f13875e = obj;
            b0Var2.f13872b.c();
        }
    }
}
