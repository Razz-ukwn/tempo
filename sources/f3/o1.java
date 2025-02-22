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

@e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {608, 229}, m = "invokeSuspend")
public final class o1 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public q1.a f8401a;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.coroutines.sync.d f8402b;

    /* renamed from: c  reason: collision with root package name */
    public f1 f8403c;

    /* renamed from: d  reason: collision with root package name */
    public int f8404d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f1<Object, Object> f8405e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o1(f1<Object, Object> f1Var, d<? super o1> dVar) {
        super(2, dVar);
        this.f8405e = f1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o1(this.f8405e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX INFO: finally extract failed */
    public final Object invokeSuspend(Object obj) {
        q1.a<Key, Value> aVar;
        kotlinx.coroutines.sync.d dVar;
        f1<Object, Object> f1Var;
        a aVar2 = a.f10464a;
        int i8 = this.f8404d;
        if (i8 == 0) {
            b.J(obj);
            f1Var = this.f8405e;
            aVar = f1Var.f8206l;
            kotlinx.coroutines.sync.d dVar2 = aVar.f8458a;
            this.f8401a = aVar;
            this.f8402b = dVar2;
            this.f8403c = f1Var;
            this.f8404d = 1;
            if (dVar2.b(this) == aVar2) {
                return aVar2;
            }
            dVar = dVar2;
        } else if (i8 == 1) {
            f1Var = this.f8403c;
            dVar = this.f8402b;
            aVar = this.f8401a;
            b.J(obj);
        } else if (i8 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            q1<Key, Value> q1Var = aVar.f8459b;
            o oVar = new o(new s1(q1Var, (d<? super s1>) null), cb.d.v(q1Var.f8454i));
            dVar.a((Object) null);
            o0 o0Var = o0.f8398b;
            this.f8401a = null;
            this.f8402b = null;
            this.f8403c = null;
            this.f8404d = 2;
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
