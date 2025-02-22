package d6;

import androidx.fragment.app.f1;
import androidx.fragment.app.g1;
import g6.e;
import ja.c;
import ja.d;
import ma.a;

public final class f implements d<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f7319a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final c f7320b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f7321c;

    static {
        Class<ma.d> cls = ma.d.class;
        f7320b = new c("currentCacheSizeBytes", g1.d(f1.d(cls, new a(1))));
        f7321c = new c("maxCacheSizeBytes", g1.d(f1.d(cls, new a(2))));
    }

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj;
        ja.e eVar2 = (ja.e) obj2;
        eVar2.e(f7320b, eVar.f8890a);
        eVar2.e(f7321c, eVar.f8891b);
    }
}
