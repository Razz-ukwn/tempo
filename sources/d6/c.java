package d6;

import androidx.fragment.app.f1;
import androidx.fragment.app.g1;
import ja.d;
import ja.e;
import ma.a;

public final class c implements d<g6.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f7311a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final ja.c f7312b;

    /* renamed from: c  reason: collision with root package name */
    public static final ja.c f7313c;

    static {
        Class<ma.d> cls = ma.d.class;
        f7312b = new ja.c("eventsDroppedCount", g1.d(f1.d(cls, new a(1))));
        f7313c = new ja.c("reason", g1.d(f1.d(cls, new a(3))));
    }

    public final void a(Object obj, Object obj2) {
        g6.c cVar = (g6.c) obj;
        e eVar = (e) obj2;
        eVar.e(f7312b, cVar.f8880a);
        eVar.d(f7313c, cVar.f8881b);
    }
}
