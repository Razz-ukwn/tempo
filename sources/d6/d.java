package d6;

import androidx.fragment.app.f1;
import androidx.fragment.app.g1;
import ja.c;
import ja.e;
import ma.a;

public final class d implements ja.d<g6.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f7314a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final c f7315b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f7316c;

    static {
        Class<ma.d> cls = ma.d.class;
        f7315b = new c("logSource", g1.d(f1.d(cls, new a(1))));
        f7316c = new c("logEventDropped", g1.d(f1.d(cls, new a(2))));
    }

    public final void a(Object obj, Object obj2) {
        g6.d dVar = (g6.d) obj;
        e eVar = (e) obj2;
        eVar.d(f7315b, dVar.f8888a);
        eVar.d(f7316c, dVar.f8889b);
    }
}
