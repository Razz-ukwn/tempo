package wa;

import java.util.HashMap;
import la.a;
import ma.g;
import xa.b;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final g f16646a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a aVar = g.a.f11366a;
        Class<t> cls = t.class;
        hashMap.put(cls, c.f16563a);
        hashMap2.remove(cls);
        Class<b> cls2 = b.class;
        hashMap.put(cls2, b.f16557a);
        hashMap2.remove(cls2);
        Class<xa.a> cls3 = xa.a.class;
        hashMap.put(cls3, a.f16537a);
        hashMap2.remove(cls3);
        f16646a = new g(new HashMap(hashMap), new HashMap(hashMap2), aVar);
    }

    public abstract b a();
}
