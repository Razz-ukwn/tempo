package f3;

import ag.g0;
import androidx.recyclerview.widget.k;
import cb.b;
import d2.f1;
import ff.m;
import java.util.Collection;
import jf.d;
import lf.e;
import lf.i;
import rf.p;
import sf.j;
import wf.f;

@e(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super u0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0<Object> f8091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0<Object> f8092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f8093c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(v0<Object> v0Var, v0<Object> v0Var2, f<Object> fVar, d<? super c> dVar) {
        super(2, dVar);
        this.f8091a = v0Var;
        this.f8092b = v0Var2;
        this.f8093c = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f8091a, this.f8092b, this.f8093c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        b.J(obj);
        k.e<T> eVar = this.f8093c.f8177a;
        v0<Object> v0Var = this.f8091a;
        j.f(v0Var, "<this>");
        v0<Object> v0Var2 = this.f8092b;
        j.f(v0Var2, "newList");
        j.f(eVar, "diffCallback");
        k.d a10 = k.a(new w0(v0Var, v0Var2, eVar, v0Var.b(), v0Var2.b()));
        boolean z11 = false;
        f P = f1.P(0, v0Var.b());
        if (!(P instanceof Collection) || !((Collection) P).isEmpty()) {
            wf.e d10 = P.iterator();
            while (true) {
                if (d10.f16719c) {
                    if (a10.a(d10.nextInt()) != -1) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return new u0(a10, z11);
    }
}
