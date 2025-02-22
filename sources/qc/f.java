package qc;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.service.measuring.MeasuringService$start$1", f = "MeasuringService.kt", l = {}, m = "invokeSuspend")
public final class f extends i implements q<g<? super Double>, Throwable, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Throwable f13495a;

    public f(d<? super f> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        f fVar = new f((d) obj3);
        fVar.f13495a = (Throwable) obj2;
        return fVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        this.f13495a.printStackTrace();
        return m.f8717a;
    }
}
