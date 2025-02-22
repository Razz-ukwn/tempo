package kotlinx.coroutines.flow;

import cb.b;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.q;

@e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
public final class h0 extends i implements q<g<Object>, Object[], d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10566a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g f10567b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f10568c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q<Object, Object, d<Object>, Object> f10569d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(q<Object, Object, ? super d<Object>, ? extends Object> qVar, d<? super h0> dVar) {
        super(3, dVar);
        this.f10569d = qVar;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        h0 h0Var = new h0(this.f10569d, (d) obj3);
        h0Var.f10567b = (g) obj;
        h0Var.f10568c = (Object[]) obj2;
        return h0Var.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        g gVar;
        a aVar = a.f10464a;
        int i8 = this.f10566a;
        if (i8 == 0) {
            b.J(obj);
            gVar = this.f10567b;
            Object[] objArr = this.f10568c;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f10567b = gVar;
            this.f10566a = 1;
            obj = this.f10569d.e(obj2, obj3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            gVar = this.f10567b;
            b.J(obj);
        } else if (i8 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f10567b = null;
        this.f10566a = 2;
        if (gVar.m(obj, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}
