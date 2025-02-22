package i3;

import ag.g0;
import cb.b;
import ff.m;
import java.util.concurrent.Callable;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f9442a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Callable<Object> callable, d<? super c> dVar) {
        super(2, dVar);
        this.f9442a = callable;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f9442a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        return this.f9442a.call();
    }
}
