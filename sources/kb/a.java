package kb;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import mb.b;
import rf.q;

@e(c = "com.lassi.common.extenstions.FlowExtKt$catch$1", f = "FlowExt.kt", l = {11}, m = "invokeSuspend")
public final class a extends i implements q<g<? super b<Object>>, Throwable, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10398a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ g f10399b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Throwable f10400c;

    public a(d<? super a> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        a aVar = new a((d) obj3);
        aVar.f10399b = (g) obj;
        aVar.f10400c = (Throwable) obj2;
        return aVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f10398a;
        if (i8 == 0) {
            cb.b.J(obj);
            g gVar = this.f10399b;
            b.a aVar2 = new b.a(this.f10400c);
            this.f10399b = null;
            this.f10398a = 1;
            if (gVar.m(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
