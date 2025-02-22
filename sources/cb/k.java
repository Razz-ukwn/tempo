package cb;

import ab.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

public final class k implements s<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f3916a;

    public k(Type type) {
        this.f3916a = type;
    }

    public final Object g() {
        Type type = this.f3916a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new o("Invalid EnumMap type: " + type.toString());
        }
        throw new o("Invalid EnumMap type: " + type.toString());
    }
}
