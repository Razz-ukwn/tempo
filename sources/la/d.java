package la;

import java.io.Writer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11041a;

    public d(e eVar) {
        this.f11041a = eVar;
    }

    public final void a(Object obj, Writer writer) {
        e eVar = this.f11041a;
        f fVar = new f(writer, eVar.f11046a, eVar.f11047b, eVar.f11048c, eVar.f11049d);
        fVar.g(obj);
        fVar.i();
        fVar.f11052b.flush();
    }
}
