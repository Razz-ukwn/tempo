package ma;

import ja.b;
import ja.d;
import ja.f;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f11363a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f11364b;

    /* renamed from: c  reason: collision with root package name */
    public final d<Object> f11365c;

    public static final class a implements ka.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final la.a f11366a = new la.a(1);
    }

    public g(HashMap hashMap, HashMap hashMap2, la.a aVar) {
        this.f11363a = hashMap;
        this.f11364b = hashMap2;
        this.f11365c = aVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, d<?>> map = this.f11363a;
        f fVar = new f(byteArrayOutputStream, map, this.f11364b, this.f11365c);
        if (obj != null) {
            d dVar = map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
                return;
            }
            throw new b("No encoder for " + obj.getClass());
        }
    }
}
