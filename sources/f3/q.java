package f3;

import ag.n1;
import cb.b;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.k;

@e(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {30}, m = "invokeSuspend")
public final class q extends i implements p<l2<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8440a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8441b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n1 f8442c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p<l2<Object>, d<? super m>, Object> f8443d;

    public static final class a extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l2<Object> f8444a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l2<Object> l2Var) {
            super(1);
            this.f8444a = l2Var;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f8444a.k((Throwable) null);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(n1 n1Var, p<? super l2<Object>, ? super d<? super m>, ? extends Object> pVar, d<? super q> dVar) {
        super(2, dVar);
        this.f8442c = n1Var;
        this.f8443d = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        q qVar = new q(this.f8442c, this.f8443d, dVar);
        qVar.f8441b = obj;
        return qVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((l2) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8440a;
        if (i8 == 0) {
            b.J(obj);
            l2 l2Var = (l2) this.f8441b;
            this.f8442c.k0(new a(l2Var));
            this.f8440a = 1;
            if (this.f8443d.invoke(l2Var, this) == aVar) {
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
