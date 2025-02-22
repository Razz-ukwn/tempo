package c4;

import h4.h;
import h4.l;
import lf.c;
import lf.e;
import sf.v;
import x3.b;

@e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
public final class d extends c {
    public v B;
    public v C;
    public v D;
    public /* synthetic */ Object E;
    public final /* synthetic */ b F;
    public int G;

    /* renamed from: a  reason: collision with root package name */
    public b f3679a;

    /* renamed from: b  reason: collision with root package name */
    public h f3680b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3681c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3682d;

    /* renamed from: e  reason: collision with root package name */
    public v f3683e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar, jf.d<? super d> dVar) {
        super(dVar);
        this.F = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return b.c(this.F, (h) null, (Object) null, (l) null, (b) null, this);
    }
}
