package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import sf.v;

@e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
public final class q<T> extends c {

    /* renamed from: a  reason: collision with root package name */
    public v f10617a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f10618b;

    /* renamed from: c  reason: collision with root package name */
    public int f10619c;

    public q(d<? super q> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f10618b = obj;
        this.f10619c |= Integer.MIN_VALUE;
        return cb.d.r(this, (f) null, (g) null);
    }
}
