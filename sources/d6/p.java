package d6;

import g6.b;
import g6.c;
import g6.d;
import g6.e;
import g6.f;
import java.util.HashMap;
import la.a;
import ma.g;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final g f7356a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a aVar = g.a.f11366a;
        Class<p> cls = p.class;
        hashMap.put(cls, e.f7317a);
        hashMap2.remove(cls);
        Class<g6.a> cls2 = g6.a.class;
        hashMap.put(cls2, a.f7304a);
        hashMap2.remove(cls2);
        Class<f> cls3 = f.class;
        hashMap.put(cls3, g.f7322a);
        hashMap2.remove(cls3);
        Class<d> cls4 = d.class;
        hashMap.put(cls4, d.f7314a);
        hashMap2.remove(cls4);
        Class<c> cls5 = c.class;
        hashMap.put(cls5, c.f7311a);
        hashMap2.remove(cls5);
        Class<b> cls6 = b.class;
        hashMap.put(cls6, b.f7309a);
        hashMap2.remove(cls6);
        Class<e> cls7 = e.class;
        hashMap.put(cls7, f.f7319a);
        hashMap2.remove(cls7);
        f7356a = new g(new HashMap(hashMap), new HashMap(hashMap2), aVar);
    }

    public abstract g6.a a();
}
