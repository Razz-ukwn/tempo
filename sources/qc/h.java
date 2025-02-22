package qc;

import android.location.Location;
import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.service.measuring.MeasuringService$start$3", f = "MeasuringService.kt", l = {}, m = "invokeSuspend")
public final class h extends i implements q<g<? super Location>, Throwable, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Throwable f13498a;

    public h(d<? super h> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        h hVar = new h((d) obj3);
        hVar.f13498a = (Throwable) obj2;
        return hVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        this.f13498a.printStackTrace();
        return m.f8717a;
    }
}
