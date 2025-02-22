package i3;

import ag.g0;
import ag.k;
import cb.b;
import ff.m;
import java.util.concurrent.Callable;
import jf.d;
import lf.i;
import rf.p;

@lf.e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
public final class e extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f9445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k<Object> f9446b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Callable<Object> callable, k<Object> kVar, d<? super e> dVar) {
        super(2, dVar);
        this.f9445a = callable;
        this.f9446b = kVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f9445a, this.f9446b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        k<Object> kVar = this.f9446b;
        b.J(obj);
        try {
            kVar.resumeWith(this.f9445a.call());
        } catch (Throwable th) {
            kVar.resumeWith(b.u(th));
        }
        return m.f8717a;
    }
}
