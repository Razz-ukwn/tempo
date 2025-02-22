package f3;

import ag.g0;
import cb.b;
import f3.q1;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.o;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {608, 234}, m = "invokeSuspend")
public final class p1 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public q1.a f8409a;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.coroutines.sync.d f8410b;

    /* renamed from: c  reason: collision with root package name */
    public f1 f8411c;

    /* renamed from: d  reason: collision with root package name */
    public int f8412d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f1<Object, Object> f8413e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(f1<Object, Object> f1Var, d<? super p1> dVar) {
        super(2, dVar);
        this.f8413e = f1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p1(this.f8413e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        q1.a<Key, Value> aVar;
        kotlinx.coroutines.sync.d dVar;
        f1<Object, Object> f1Var;
        a aVar2 = a.f10464a;
        int i8 = this.f8412d;
        if (i8 == 0) {
            b.J(obj);
            f1Var = this.f8413e;
            aVar = f1Var.f8206l;
            kotlinx.coroutines.sync.d dVar2 = aVar.f8458a;
            this.f8409a = aVar;
            this.f8410b = dVar2;
            this.f8411c = f1Var;
            this.f8412d = 1;
            if (dVar2.b(this) == aVar2) {
                return aVar2;
            }
            dVar = dVar2;
        } else if (i8 == 1) {
            f1Var = this.f8411c;
            dVar = this.f8410b;
            aVar = this.f8409a;
            b.J(obj);
        } else if (i8 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            q1<Key, Value> q1Var = aVar.f8459b;
            o oVar = new o(new r1(q1Var, (d<? super r1>) null), cb.d.v(q1Var.f8455j));
            dVar.a((Object) null);
            o0 o0Var = o0.f8399c;
            this.f8409a = null;
            this.f8410b = null;
            this.f8411c = null;
            this.f8412d = 2;
            if (f1.a(f1Var, oVar, o0Var, this) == aVar2) {
                return aVar2;
            }
            return m.f8717a;
        } catch (Throwable th) {
            dVar.a((Object) null);
            throw th;
        }
    }
}
