package gb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f8928a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f8929b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8930c;

    public a() {
        Class<a> cls = a.class;
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == cls) {
                Type a10 = cb.a.a(parameterizedType.getActualTypeArguments()[0]);
                this.f8929b = a10;
                this.f8928a = cb.a.f(a10);
                this.f8930c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == cls) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (cb.a.d(this.f8929b, ((a) obj).f8929b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8930c;
    }

    public final String toString() {
        return cb.a.i(this.f8929b);
    }

    public a(Type type) {
        type.getClass();
        Type a10 = cb.a.a(type);
        this.f8929b = a10;
        this.f8928a = cb.a.f(a10);
        this.f8930c = a10.hashCode();
    }
}
