package f3;

import ag.n1;
import f3.e1;
import jf.d;
import lf.c;
import lf.e;
import rf.a;

@e(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {97}, m = "awaitClose")
public final class m2 extends c {

    /* renamed from: a  reason: collision with root package name */
    public a f8373a;

    /* renamed from: b  reason: collision with root package name */
    public n1 f8374b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8375c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o2<Object> f8376d;

    /* renamed from: e  reason: collision with root package name */
    public int f8377e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m2(o2<Object> o2Var, d<? super m2> dVar) {
        super(dVar);
        this.f8376d = o2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8375c = obj;
        this.f8377e |= Integer.MIN_VALUE;
        return this.f8376d.m0((e1.b.c) null, this);
    }
}
