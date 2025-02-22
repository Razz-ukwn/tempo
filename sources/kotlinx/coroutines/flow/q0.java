package kotlinx.coroutines.flow;

import ag.n1;
import jf.d;
import kf.a;
import lf.c;
import lf.e;

@e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
public final class q0 extends c {
    public final /* synthetic */ p0<Object> B;
    public int C;

    /* renamed from: a  reason: collision with root package name */
    public p0 f10620a;

    /* renamed from: b  reason: collision with root package name */
    public g f10621b;

    /* renamed from: c  reason: collision with root package name */
    public r0 f10622c;

    /* renamed from: d  reason: collision with root package name */
    public n1 f10623d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f10624e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(p0<Object> p0Var, d<? super q0> dVar) {
        super(dVar);
        this.B = p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f10624e = obj;
        this.C |= Integer.MIN_VALUE;
        p0.l(this.B, (g) null, this);
        return a.f10464a;
    }
}
