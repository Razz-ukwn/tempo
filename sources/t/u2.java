package t;

import ag.g0;
import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {151}, m = "invokeSuspend")
public final class u2 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15242a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f15243b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<s1<Object>, d<? super m>, Object> f15244c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j1<Object> f15245d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u2(p<? super s1<Object>, ? super d<? super m>, ? extends Object> pVar, j1<Object> j1Var, d<? super u2> dVar) {
        super(2, dVar);
        this.f15244c = pVar;
        this.f15245d = j1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        u2 u2Var = new u2(this.f15244c, this.f15245d, dVar);
        u2Var.f15243b = obj;
        return u2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f15242a;
        if (i8 == 0) {
            b.J(obj);
            t1 t1Var = new t1(this.f15245d, ((g0) this.f15243b).f0());
            this.f15242a = 1;
            if (this.f15244c.invoke(t1Var, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
