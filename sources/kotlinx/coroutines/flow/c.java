package kotlinx.coroutines.flow;

import ag.g0;
import cg.e;
import cg.q;
import cg.s;
import dg.f;
import dg.u;
import ff.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.d;
import jf.g;
import kf.a;

public final class c<T> extends f<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: d  reason: collision with root package name */
    public final s<T> f10514d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10515e;

    public /* synthetic */ c(s sVar, boolean z10) {
        this(sVar, z10, g.f10014a, -3, e.f4020a);
    }

    public final Object a(g<? super T> gVar, d<? super m> dVar) {
        int i8 = this.f7538b;
        a aVar = a.f10464a;
        if (i8 == -3) {
            k();
            Object a10 = j.a(gVar, this.f10514d, this.f10515e, dVar);
            return a10 == aVar ? a10 : m.f8717a;
        }
        Object a11 = super.a(gVar, dVar);
        return a11 == aVar ? a11 : m.f8717a;
    }

    public final String d() {
        return "channel=" + this.f10514d;
    }

    public final Object e(q<? super T> qVar, d<? super m> dVar) {
        Object a10 = j.a(new u(qVar), this.f10514d, this.f10515e, dVar);
        return a10 == a.f10464a ? a10 : m.f8717a;
    }

    public final f<T> f(jf.f fVar, int i8, e eVar) {
        return new c(this.f10514d, this.f10515e, fVar, i8, eVar);
    }

    public final f<T> g() {
        return new c(this.f10514d, this.f10515e);
    }

    public final s<T> i(g0 g0Var) {
        k();
        return this.f7538b == -3 ? this.f10514d : super.i(g0Var);
    }

    public final void k() {
        if (this.f10515e) {
            boolean z10 = true;
            if (B.getAndSet(this, 1) != 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public c(s<? extends T> sVar, boolean z10, jf.f fVar, int i8, e eVar) {
        super(fVar, i8, eVar);
        this.f10514d = sVar;
        this.f10515e = z10;
        this.consumed = 0;
    }
}
