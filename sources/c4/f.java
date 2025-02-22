package c4;

import c4.i;
import jf.d;
import lf.c;
import lf.e;

@e(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {73}, m = "intercept")
public final class f extends c {

    /* renamed from: a  reason: collision with root package name */
    public b f3689a;

    /* renamed from: b  reason: collision with root package name */
    public i.a f3690b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f3691c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f3692d;

    /* renamed from: e  reason: collision with root package name */
    public int f3693e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar, d<? super f> dVar) {
        super(dVar);
        this.f3692d = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3691c = obj;
        this.f3693e |= Integer.MIN_VALUE;
        return this.f3692d.a((j) null, this);
    }
}
